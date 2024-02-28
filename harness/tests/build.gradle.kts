import org.jetbrains.kotlin.konan.target.HostManager
import java.io.OutputStream

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

    //uncomment to test android
//    isAndroidExportEnabled.set(true)
//    d8ToolPath.set(File("${System.getenv("ANDROID_SDK_ROOT")}/build-tools/30.0.3/d8"))
//    androidCompileSdkDir.set(File("${System.getenv("ANDROID_SDK_ROOT")}/platforms/android-30"))

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
    register("runGutTests", Exec::class.java) {
        group = "verification"

        val editorExecutable: String = projectDir
                .resolve("../../../../bin")
                .listFiles()
                .also {
                    println("[${it.joinToString()}]")
                }
                ?.firstOrNull { it.startsWith("godot.") }
                ?.absolutePath
                ?: run {
                    throw Exception("Could not find editor executable")
                }

        var testCount = 0
        var successfulTestCount = 0
        var isJvmClosed = false

        doLast {
            if (testCount == 0) {
                throw Exception("ERROR: No tests were found")
            }
            if (testCount != successfulTestCount) {
                throw Exception("ERROR: Some assertions failed")
            }
            if (!isJvmClosed) {
                throw Exception("ERROR: JVM has not closed properly")
            }
        }

        standardOutput = object : OutputStream() {
            override fun write(b: Int) {
                val string = String(byteArrayOf(b.toByte()))
                if (string.contains("Tests")) {
                    testCount++
                }
                if (string.contains("Passing")) {
                    successfulTestCount++
                }
                if (string.contains("Shutting down JVM")) {
                    isJvmClosed = true
                }
                print(string)
            }
        }

        if (HostManager.hostIsMingw) {
            commandLine(
                    "cmd",
                    "/c",
                    editorExecutable,
                    "-s",
                    "--headless",
                    "--path",
                    projectDir,
                    "addons/gut/gut_cmdln.gd",
            )
        } else {
            commandLine(
                    "bash",
                    "-c",
                    editorExecutable,
                    "-s",
                    "--headless",
                    "--path",
                    projectDir,
                    "addons/gut/gut_cmdln.gd",
            )
        }
    }
}
