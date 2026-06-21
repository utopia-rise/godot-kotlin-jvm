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



tasks {
    fun currentExportTarget(): String = when {
        HostManager.hostIsLinux -> "tests_linux"
        HostManager.hostIsMac -> "tests_macos"
        HostManager.hostIsMingw -> "tests_windows"
        else -> throw IllegalStateException("Unsupported OS for exporting")
    }

    fun resolveBundledBinaries(): List<File> =
        listOf(
            projectDir.resolve("../../../../bin"),
            projectDir.resolve("bin"),
            rootProject.layout.projectDirectory.asFile.resolve("bin"),
        )
            .flatMap { directory -> (directory.listFiles() ?: emptyArray()).toList() }

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

        val source = findWindowsBundledBinary(target, consoleWrapper) ?: throw IllegalStateException(
            "Could not find Windows ${target} export ${if (consoleWrapper) "console wrapper" else "template"} in the local bin directories."
        )

        source.copyTo(destination, overwrite = true)
    }

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
    val exportDebug by registering(Exec::class) {
        group = "verification"
        description = "Exports the tests for the current host OS in debug mode"
        dependsOn(importResources, prepareHostExportTemplates)

        environment("JAVA_HOME", System.getProperty("java.home"))
        workingDir = projectDir

        projectDir.resolve("export").deleteRecursively()
        projectDir.resolve("export").mkdirs()

        commandLine(
            provideEditorExecutable().absolutePath,
            "--headless",
            "--export-debug",
            currentExportTarget(),
        )
    }
    val exportRelease by registering(Exec::class) {
        group = "verification"
        description = "Exports the tests for the current host OS in release mode"
        dependsOn(importResources, prepareHostExportTemplates)

        environment("JAVA_HOME", System.getProperty("java.home"))
        workingDir = projectDir

        projectDir.resolve("export").deleteRecursively()
        projectDir.resolve("export").mkdirs()

        commandLine(
            provideEditorExecutable().absolutePath,
            "--headless",
            "--export-release",
            currentExportTarget(),
        )
    }
    register<Exec>("runGDTests") {
        group = "verification"
        description = "Runs GDUnit tests from the source Godot project."

        dependsOn(importResources)

        setupTestExecution {
            TestExecutionCommand(
                executable = provideEditorExecutable().absolutePath,
                useProjectPathOverride = true,
                reportDirectory = "//reports",
            )
        }
    }
    register<Exec>("runExportedGDTests") {
        group = "verification"
        description = "Runs GDUnit tests from the exported package."

        val hasExistingExport = projectDir.resolve("export")
            .listFiles()
            ?.any { exportedFile ->
                exportedFile.name.endsWith(".exe") ||
                    exportedFile.name.endsWith(".app") ||
                    exportedFile.name.contains("x86_64")
            } == true
        if (!hasExistingExport) {
            dependsOn(exportDebug)
        }

        setupTestExecution {
            val executable = projectDir
                .resolve("export")
                .listFiles()
                ?.also {
                    println("Test executables: [${it.joinToString()}]")
                    it.forEach { file -> file.setExecutable(true) }
                }
                ?.let { exportedFiles ->
                    when {
                        HostManager.hostIsMingw -> exportedFiles.firstOrNull { it.name.endsWith(".console.exe") }
                        HostManager.hostIsMac -> exportedFiles.firstOrNull { it.name.endsWith(".app") }
                        else -> exportedFiles.firstOrNull { it.name.contains("x86_64") }
                    } ?: exportedFiles.firstOrNull { it.name.endsWith(".exe") }
                }
                ?.let { exportedExecutable ->
                    if (exportedExecutable.name.endsWith(".app")) {
                        exportedExecutable.resolve("Contents/MacOS").listFiles()?.firstOrNull()
                    } else {
                        exportedExecutable
                    }
                }
                ?.absolutePath

            TestExecutionCommand(
                executable = executable ?: "no_test_executable_found",
                useProjectPathOverride = false,
                reportDirectory = "//reports",
            )
        }
    }
}

data class TestExecutionCommand(
    val executable: String,
    val useProjectPathOverride: Boolean,
    val reportDirectory: String,
)

fun Exec.setupTestExecution(commandProvider: () -> TestExecutionCommand) {
    this.isIgnoreExitValue = false

    doFirst {
        val command = commandProvider()
        val projectPathArgs = if (command.useProjectPathOverride) {
            listOf("--path", projectDir.absolutePath)
        } else {
            emptyList()
        }
        val gdUnitArgs = listOf(
            "-s",
            "res://addons/gdUnit4/bin/GdUnitCmdTool.gd",
            "-rd",
            command.reportDirectory,
            "-a",
            "test",
            "-c",
        )

        if (HostManager.hostIsMingw) {
            this@setupTestExecution.commandLine(
                "cmd",
                "/c",
                buildString {
                    append(windowsQuote(command.executable))
                    append(' ')
                    append((projectPathArgs + gdUnitArgs).joinToString(" ", transform = ::windowsQuote))
                },
            )
        } else {
            this@setupTestExecution.commandLine(command.executable, *(projectPathArgs + gdUnitArgs).toTypedArray())
        }
    }
}

fun windowsQuote(argument: String): String {
    if (!argument.contains(" ")) {
        return argument
    }
    return "\"$argument\""
}

fun provideEditorExecutable(): File = (
        listOf(
            projectDir.resolve("../../../../bin"),
            projectDir.resolve("bin"),
            rootProject.layout.projectDirectory.asFile.resolve("bin"),
        )
            .flatMap { (it.listFiles() ?: arrayOf()).toList() }
            .also {
                println("[${it.joinToString()}]")
            }
            .firstOrNull { it.name.startsWith("godot.") && it.name.contains("editor") && !it.name.contains("console") }
            .also{ println("Godot executable selected: $it")}
            ?: throw Exception("Could not find editor executable"))
