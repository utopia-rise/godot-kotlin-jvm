import godot.entrygenerator.settings.RegistrationFileLayoutMode
import godot.gradle.GodotLanguage
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
    val importResources = register<Exec>("importResources") {
        group = "verification"

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
        description = "Exports the tests for the current host OS in debug mode"
        dependsOn(importResources, build)

        environment("JAVA_HOME", System.getProperty("java.home"))
        workingDir = projectDir

        val target = when {
            HostManager.hostIsLinux -> "tests_linux"
            HostManager.hostIsMac -> "tests_macos"
            HostManager.hostIsMingw -> "tests_windows"
            else -> throw IllegalStateException("Unsupported OS for exporting")
        }

        projectDir.resolve("export").mkdirs()

        commandLine(
            provideEditorExecutable().absolutePath,
            "--headless",
            "--export-debug",
            target,
        )
    }
    val exportRelease by registering(Exec::class) {
        description = "Exports the tests for the current host OS in release mode"
        dependsOn(importResources, build)

        environment("JAVA_HOME", System.getProperty("java.home"))
        workingDir = projectDir

        val target = when {
            HostManager.hostIsLinux -> "tests_linux"
            HostManager.hostIsMac -> "tests_macos"
            HostManager.hostIsMingw -> "tests_windows"
            else -> throw IllegalStateException("Unsupported OS for exporting")
        }

        projectDir.resolve("export").mkdirs()

        commandLine(
            provideEditorExecutable().absolutePath,
            "--headless",
            "--export-release",
            target,
        )
    }
    register<Exec>("runGDTests") {
        group = "verification"

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

        val executable = projectDir
            .resolve("export")
            .listFiles()
            ?.also {
                println("Test executables: [${it.joinToString()}]")
                it.forEach { file -> file.setExecutable(true) }
            }
            ?.firstOrNull { file ->
                listOf("exe", "x86_64", "app")
                    .any { executableExtensions -> file.name.contains(executableExtensions) }
            }
            ?.let { executable ->
                if (executable.name.contains("app")) {
                    executable.resolve("Contents/MacOS").listFiles()?.firstOrNull()
                } else {
                    executable
                }
            }
            ?.absolutePath

        setupTestExecution {
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
            "-d",
            "--remote-debug",
            "tcp://127.0.0.1:0",
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
