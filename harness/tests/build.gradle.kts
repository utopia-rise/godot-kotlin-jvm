import godot.gradle.GodotLanguage
import godot.registrar.generator.settings.RegistrationFileLayoutMode
import org.jetbrains.kotlin.konan.target.HostManager

plugins {
    // no need to apply kotlin jvm plugin. Our plugin already applies the correct version for you
//    kotlin("jvm") version "1.7.10"
    id("com.utopia-rise.godot-kotlin-jvm")
}

repositories {
    mavenCentral()
}

godot {
    registrationFilesDirectory.set(projectDir.resolve("scripts").also { it.mkdirs() })
    registrationFilesLayoutMode.set(RegistrationFileLayoutMode.HIERARCHICAL)
    isGodotCoroutinesEnabled.set(true)


    d8ToolPath.set("${System.getenv("ANDROID_SDK_ROOT")}/build-tools/37.0.0/d8")
    androidCompileSdkDirectory.set("${System.getenv("ANDROID_SDK_ROOT")}/platforms/android-36.1/")

    graalVmHomeDirectory.set(System.getenv("GRAALVM_HOME"))
    additionalGraalResourceConfigurationFiles.set(
        arrayOf(
            projectDir.resolve("graal").resolve("resource-config.json").absolutePath,
         )
    )
    additionalGraalReflectionConfigurationFiles.set(
        arrayOf(
            projectDir.resolve("graal").resolve("reflect-config.json").absolutePath,
        )
    )
    windowsDeveloperVcVarsPath.set(System.getenv("VC_VARS_PATH"))

}

dependencies {
    implementation("joda-time:joda-time:2.10.6") // external dependency to test dependency inclusion in mainCompilation

    implementation("com.godot.tests:third-party-library")


    // reflection test cases: see GH-571
    implementation("com.fasterxml.jackson.core:jackson-databind:2.16.1")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.16.1")
}


kotlin.sourceSets.main {
    kotlin.srcDirs("otherSourceDir")
}

fun bundledBinDirectories(): List<File> = listOf(
    projectDir.resolve("../../../../bin"),
    projectDir.resolve("bin"),
    rootProject.layout.projectDirectory.asFile.resolve("bin"),
)

fun resolveBundledBinaries(): List<File> =
    bundledBinDirectories().flatMap { directory -> (directory.listFiles() ?: emptyArray()).toList() }

fun provideEditorExecutable(): File =
    resolveBundledBinaries()
        .also { println("[${it.joinToString()}]") }
        .firstOrNull { it.name.startsWith("godot.") && it.name.contains("editor") && !it.name.contains("console") }
        .also { println("Godot executable selected: $it") }
        ?: error("Could not find editor executable")

fun currentExportTarget(): String = when {
    HostManager.hostIsLinux -> "tests_linux"
    HostManager.hostIsMac -> "tests_macos"
    HostManager.hostIsMingw -> "tests_windows"
    else -> throw IllegalStateException("Unsupported OS for exporting")
}

fun File.ensureEmptyDirectory() {
    deleteRecursively()
    mkdirs()
}

fun findWindowsBundledBinary(target: String, consoleWrapper: Boolean): File? {
    val expectedPrefix = "godot.windows.template_${target}.x86_64.jvm."

    return resolveBundledBinaries().firstOrNull { file ->
        file.name.startsWith(expectedPrefix) && when {
            consoleWrapper -> file.name.endsWith(".console.exe")
            else -> file.name.endsWith(".exe") && !file.name.endsWith(".console.exe")
        }
    }
}

fun ensureWindowsExportTemplate(target: String, consoleWrapper: Boolean = false) {
    if (!HostManager.hostIsMingw) {
        return
    }

    val destinationName = buildString {
        append("godot.windows.template_${target}.x86_64")
        if (consoleWrapper) {
            append(".console")
        }
        append(".exe")
    }
    val destination = projectDir.resolve(destinationName)
    if (destination.exists()) {
        return
    }

    // Each CI export job only provides the template for the target it builds
    // (debug for "dev tests", release for "release tests"). If the other target's
    // template isn't present, skip it instead of failing the whole prepare step -
    // the export only uses the template matching its target.
    val source = findWindowsBundledBinary(target, consoleWrapper)
    if (source == null) {
        logger.lifecycle(
            "Skipping Windows ${target} export ${if (consoleWrapper) "console wrapper" else "template"}: " +
                "not present in the local bin directories.",
        )
        return
    }

    source.copyTo(destination, overwrite = true)
}

fun findExportedExecutable(): File? {
    val exportedFiles = projectDir.resolve("export").listFiles()?.toList().orEmpty()
    println("Test executables: [${exportedFiles.joinToString()}]")
    exportedFiles.forEach { it.setExecutable(true) }

    val exportedExecutable = when {
        HostManager.hostIsMingw -> exportedFiles.firstOrNull { it.name.endsWith(".console.exe") }
        HostManager.hostIsMac -> exportedFiles.firstOrNull { it.name.endsWith(".app") }
        else -> exportedFiles.firstOrNull { it.name.contains("x86_64") }
    } ?: exportedFiles.firstOrNull { it.name.endsWith(".exe") }

    return if (exportedExecutable?.name?.endsWith(".app") == true) {
        exportedExecutable.resolve("Contents/MacOS").listFiles()?.firstOrNull()
    } else {
        exportedExecutable
    }
}

fun requireExportedExecutable(): File =
    findExportedExecutable()
        ?: error("No exported test executable found in ${projectDir.resolve("export")}. Run exportDebug or exportRelease first.")

fun registerExportTask(name: String, exportFlag: String, description: String) = tasks.register<Exec>(name) {
    group = "verification"
    this.description = description
    dependsOn("importResources", "prepareHostExportTemplates")

    environment("JAVA_HOME", System.getProperty("java.home"))
    workingDir = projectDir

    doFirst {
        projectDir.resolve("export").ensureEmptyDirectory()
    }

    commandLine(
        provideEditorExecutable().absolutePath,
        "--headless",
        exportFlag,
        currentExportTarget(),
    )
}

tasks {
    val prepareHostExportTemplates = register("prepareHostExportTemplates") {
        group = "verification"
        description = "Ensures export presets can find the host export templates in a project-local path."

        doLast {
            ensureWindowsExportTemplate("debug")
            ensureWindowsExportTemplate("release")
            ensureWindowsExportTemplate("debug", consoleWrapper = true)
            ensureWindowsExportTemplate("release", consoleWrapper = true)
        }
    }

    val importResources = register<Exec>("importResources") {
        group = "verification"
        description = "Imports the Godot project after rebuilding JVM registrations."
        dependsOn(build)

        isIgnoreExitValue = true

        environment("JAVA_HOME", System.getProperty("java.home"))
        workingDir = projectDir

        val editorExecutable: String = provideEditorExecutable().absolutePath

        if (HostManager.hostIsMingw) {
            commandLine(
                "cmd",
                "/c",
                "$editorExecutable --headless --import --quiet",
            )
        } else {
            commandLine(
                "bash",
                "-c",
                "$editorExecutable --headless --import --quiet",
            )
        }
    }
    val exportDebug = registerExportTask("exportDebug", "--export-debug", "Exports the tests for the current host OS in debug mode")
    val exportRelease = registerExportTask("exportRelease", "--export-release", "Exports the tests for the current host OS in release mode")

    register<Exec>("runGDTests") {
        group = "verification"
        description = "Runs GDUnit tests from the source Godot project."

        dependsOn(importResources)

        setupTestExecution {
            TestExecutionCommand(
                executable = provideEditorExecutable().absolutePath,
                useProjectPathOverride = true,
                // Source tests run via the editor, where GdUnitCmdTool works fine.
                scriptArgs = listOf(
                    "-s",
                    "res://addons/gdUnit4/bin/GdUnitCmdTool.gd",
                    "-a",
                    "test",
                    "-c",
                    "--ignoreHeadlessMode",
                ),
            )
        }
    }
    register<Exec>("runExportedGDTests") {
        group = "verification"
        description = "Runs GDUnit tests from the exported package."

        setupTestExecution {
            TestExecutionCommand(
                executable = requireExportedExecutable().absolutePath,
                useProjectPathOverride = false,
                scriptArgs = emptyList(),
            )
        }
    }
}

data class TestExecutionCommand(
    val executable: String,
    val useProjectPathOverride: Boolean,
    val scriptArgs: List<String>,
)

fun shouldUseHeadlessTestExecution(): Boolean =
    HostManager.hostIsLinux &&
        System.getenv("DISPLAY").isNullOrBlank() &&
        System.getenv("WAYLAND_DISPLAY").isNullOrBlank()

fun Exec.setupTestExecution(commandProvider: () -> TestExecutionCommand) {
    this.isIgnoreExitValue = false

    doFirst {
        val command = commandProvider()
        val projectPathArgs = if (command.useProjectPathOverride) {
            listOf("--path", projectDir.absolutePath)
        } else {
            emptyList()
        }
        val runtimeArgs = buildList {
            if (shouldUseHeadlessTestExecution()) {
                add("--headless")
            }
            addAll(projectPathArgs)
            addAll(command.scriptArgs)
        }

        if (HostManager.hostIsMingw) {
            this@setupTestExecution.commandLine(
                "cmd",
                "/c",
                buildString {
                    append(windowsQuote(command.executable))
                    append(' ')
                    append(runtimeArgs.joinToString(" ", transform = ::windowsQuote))
                },
            )
        } else if (HostManager.hostIsLinux) {
            // Force line-buffered stdout/stderr so CI shows progress in real time.
            // Godot block-buffers when piped, so on a timeout-kill the buffered tail
            // (where an exported run actually stalls) is otherwise lost.
            this@setupTestExecution.commandLine(
                "stdbuf", "-oL", "-eL", command.executable, *runtimeArgs.toTypedArray(),
            )
        } else {
            this@setupTestExecution.commandLine(command.executable, *runtimeArgs.toTypedArray())
        }
    }
}

fun windowsQuote(argument: String): String {
    if (!argument.contains(" ")) {
        return argument
    }
    return "\"$argument\""
}
