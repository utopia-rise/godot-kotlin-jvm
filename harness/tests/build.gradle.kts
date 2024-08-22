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
    registrationFileBaseDir.set(projectDir.resolve("scripts").also { it.mkdirs() })
    isRegistrationFileHierarchyEnabled.set(true)
    enableGodotCoroutines.set(true)

    //uncomment to test android
//    isAndroidExportEnabled.set(true)
//    d8ToolPath.set(File("${System.getenv("ANDROID_SDK_ROOT")}/build-tools/35.0.0/d8"))
//    androidCompileSdkDir.set(File("${System.getenv("ANDROID_SDK_ROOT")}/platforms/android-35"))

//    uncomment to test graal vm native image
//    isGraalNativeImageExportEnabled.set(true)
//    graalVmDirectory.set(File(System.getenv("JAVA_HOME")))
//    additionalGraalResourceConfigurationFiles.set(
//        arrayOf(
//            projectDir.resolve("graal").resolve("resource-config.json").absolutePath,
//         )
//    )
//    additionalGraalReflectionConfigurationFiles.set(
//        arrayOf(
//            projectDir.resolve("graal").resolve("reflect-config.json").absolutePath,
//        )
//    )
//    windowsDeveloperVCVarsPath.set(File(System.getenv("VC_VARS_PATH")))

    // uncomment to test ios
//    isIOSExportEnabled.set(true)
}

dependencies {
    implementation("joda-time:joda-time:2.10.6") // external dependency to test dependency inclusion in mainCompilation

    implementation("com.godot.tests:hierarchical-library")
    implementation("com.godot.tests:flattened-library")
    implementation("com.godot.tests:fqname-library")


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
                "$editorExecutable --headless --import",
            )
        } else {
            commandLine(
                "bash",
                "-c",
                "$editorExecutable --headless --import",
            )
        }
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
    register<Exec>("runGutTests") {
        group = "verification"

        dependsOn(importResources)

        setupTestExecution {
            provideEditorExecutable().absolutePath
        }
    }
    register<Exec>("runExportedGutTests") {
        group = "verification"

        dependsOn(importResources, exportRelease)

        val executable = projectDir
            .resolve("export")
            .listFiles()
            ?.filter { it.isFile }
            ?.also {
                println("Test executables: [${it.joinToString()}]")
                it.forEach { file -> file.setExecutable(true) }
            }
            ?.firstOrNull { file ->
                listOf("exe", "x64_64", "app")
                    .any { executableExtensions -> file.name.contains(executableExtensions) }
            }
            ?.let { executable ->
                if (executable.name.contains("app")) {
                    executable.resolve("Contents/MacOS").listFiles().firstOrNull()
                } else {
                    executable
                }
            }
            ?.absolutePath

        this.enabled = executable != null

        setupTestExecution {
            executable ?: ""
        }
    }
}

fun Exec.setupTestExecution(executableProvider: () -> String) {
    var didAllTestsPass = false
    var isJvmClosed = false
    val testOutputFile = File("${projectDir}/test_output.txt")
    this.standardOutput = testOutputFile.outputStream()
    this.errorOutput = testOutputFile.outputStream()

    this.doLast {
        val testOutput = testOutputFile.readText()
        val outputLines = testOutput.split("\n")

        outputLines.forEach { line ->
            when {
                line.contains("All tests passed") -> {
                    didAllTestsPass = true
                }

                line.contains("JVM Memory cleaned") -> {
                    isJvmClosed = true
                }
            }
        }

        val error = when {
            !didAllTestsPass -> Exception("ERROR: Some assertions failed")
            !isJvmClosed -> Exception("ERROR: JVM has not closed properly")
            else -> null
        }

        println(testOutput)

        error?.let { throw it }
    }

    this.isIgnoreExitValue = true

    doFirst {
        if (HostManager.hostIsMingw) {
            this@setupTestExecution.commandLine(
                "cmd",
                "/c",
                "${executableProvider()} -s --headless --path $projectDir addons/gut/gut_cmdln.gd",
            )
        } else {
            this@setupTestExecution.commandLine(
                "bash",
                "-c",
                "${executableProvider()} -s --headless --path $projectDir addons/gut/gut_cmdln.gd",
            )
        }
    }
}

fun provideEditorExecutable(): File = (projectDir
    .resolve("../../../../bin")
    .listFiles()
    ?.also {
        println("[${it.joinToString()}]")
    }
    ?.firstOrNull { it.name.startsWith("godot.") }
    ?: throw Exception("Could not find editor executable"))
