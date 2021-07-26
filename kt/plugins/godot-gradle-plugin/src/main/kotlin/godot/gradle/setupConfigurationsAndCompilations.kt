package godot.gradle

import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar
import godot.utils.GodotBuildProperties
import org.gradle.api.Project
import org.gradle.api.tasks.Exec
import org.gradle.nativeplatform.platform.internal.DefaultNativePlatform
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmProjectExtension
import java.io.File

/**
 * Set's up all configurations and compilations needed for kotlin_jvm to work and defines proper task dependencies between them.
 *
 * ## Overview
 * General overview of what this function set's up to happen on each build the user performs on his code:
 * - Creates a `bootstrap.jar` which contains all glue code for the `cpp -> jvm -> cpp` communication but no user code.
 * This `bootstrap.jar` is loaded automatically at startup by the `cpp` side of the module
 * - Applies our kotlin symbol processor to the `main` configuration and compilation to automatically generate the entry files.
 * - Configures a `Shadow Jar (Fat Jar) which includes all dependencies.
 * - Uses the created `Shadow Jar` named `main.jar` together with the created `godot-bootstrap.jar` at startup
 */
fun Project.setupConfigurationsAndCompilations(godotExtension: GodotExtension, jvm: KotlinJvmProjectExtension) {
    //add our dependencies to the main compilation -> convenience for the user
    jvm.target.compilations.getByName("main").apply {
        dependencies {
            compileOnly("com.utopia-rise:godot-library:${GodotBuildProperties.godotKotlinVersion}")
            compileOnly("com.utopia-rise:godot-kotlin-symbol-processor:${GodotBuildProperties.godotKotlinVersion}")
        }
        dependencies.add(
            "ksp",
            "com.utopia-rise:godot-kotlin-symbol-processor:${GodotBuildProperties.godotKotlinVersion}"
        )
    }

    //bootstrap configuration containing all glue code but no user code
    val bootstrapConfiguration = configurations.create("bootstrap") {
        with(it.dependencies) {
            add(dependencies.create("org.jetbrains.kotlin:kotlin-stdlib:${jvm.coreLibrariesVersion}"))
            add(dependencies.create("com.utopia-rise:godot-library:${GodotBuildProperties.godotKotlinVersion}"))
        }
    }

    afterEvaluate {
        with(tasks) {
            val createBuildLock = with(create("createBuildLock")) {
                doFirst {
                    val buildLockDir = getBuildLockDir(projectDir)
                    File(buildLockDir, "buildLock.lock").createNewFile()
                }
            }

            val deleteBuildLock = with(create("deleteBuildLock")) {
                doLast {
                    val buildLockDir = getBuildLockDir(projectDir)
                    File(buildLockDir, "buildLock.lock").delete()
                }
            }

            val bootstrapJar = with(create("bootstrapJar", ShadowJar::class.java)) {
                archiveBaseName.set("godot-bootstrap")
                configurations.clear()
                configurations.add(bootstrapConfiguration)

                dependsOn(createBuildLock)
            }

            val shadowJar = with(named("shadowJar", ShadowJar::class.java).get()) {
                archiveBaseName.set("main")
                archiveVersion.set("")
                archiveClassifier.set("")

                dependencies {
                    it.exclude(it.dependency("org.jetbrains.kotlin:kotlin-stdlib.*"))
                    it.exclude(it.dependency("com.utopia-rise:godot-library:.*"))
                }

                dependsOn(createBuildLock)
            }

            val checkD8ToolAccessible = with(create("checkD8ToolAccessible")) {
                group = "godot-kotlin-jvm"
                description = "Checks if the d8 tool is accessible and executable. Needed for android builds only"

                doLast {
                    try {
                        val d8Tool = godotExtension.d8ToolPath
                            ?: throw IllegalArgumentException("d8 tool not set! Make sure you've either set the ANDROID_SDK_ROOT environment variable or set the d8ToolPath. For more information, visit: https://godot-kotl.in/en/stable/user-guide/exporting/#android")
                        val result = exec {
                            with(it) {
                                workingDir = projectDir
                                isIgnoreExitValue = true

                                if (DefaultNativePlatform.getCurrentOperatingSystem().isWindows) {
                                    commandLine("cmd", "/c", d8Tool, "--version")
                                } else {
                                    commandLine(d8Tool, "--version")
                                }
                            }
                        }
                        if (result.exitValue != 0) {
                            throw IllegalArgumentException("d8 tool not found! Make sure you've either set the ANDROID_SDK_ROOT environment variable or set the d8ToolPath. For more information, visit: https://godot-kotl.in/en/stable/user-guide/exporting/#android")
                        }
                    } catch (e: Throwable) {
                        throw IllegalArgumentException("d8 tool not found! Make sure you've either set the ANDROID_SDK_ROOT environment variable or set the d8ToolPath. For more information, visit: https://godot-kotl.in/en/stable/user-guide/exporting/#android")
                    }
                }
            }

            val checkAndroidJarAccessible = with(create("checkAndroidJarAccessible")) {
                group = "godot-kotlin-jvm"
                description = "Checks if the android.jar is present in the provided androidCompileSdkDir. Needed for android builds only"

                doLast {
                    val androidSdkDir = godotExtension.androidCompileSdkDir

                    when {
                        androidSdkDir == null -> throw IllegalArgumentException("androidCompileSdkDir not set. Make sure you've either set the ANDROID_SDK_ROOT environment variable or set the androidCompileSdkDir. For more information, visit: https://godot-kotl.in/en/stable/user-guide/exporting/#android")
                        !androidSdkDir.isDirectory -> throw IllegalArgumentException("the androidCompileSdkDir you provided is not a directory")
                        else -> {
                            val content = androidSdkDir.listFiles()
                            if (content == null || content.none { it.name == "android.jar" }) {
                                throw IllegalArgumentException("the androidCompileSdkDir you provided does not contain the necessary android.jar file. Check your android sdk setup. Found files: ${content?.joinToString { it.name }}\nFor more information, visit: https://godot-kotl.in/en/stable/user-guide/exporting/#android")
                            }
                        }
                    }
                }
            }

            // d8 doc: https://developer.android.com/studio/command-line/d8
            val createGodotBootstrapDexJar = with(create("createGodotBootstrapDexJar", Exec::class.java)) {
                group = "godot-kotlin-jvm"
                description =
                    "Converts the godot-bootstrap.jar to an android compatible version. Needed for android builds only"

                dependsOn(checkD8ToolAccessible, checkAndroidJarAccessible, shadowJar, bootstrapJar)
                val libsDir = project.buildDir.resolve("libs")
                val godotBootstrapJar = File(libsDir, "godot-bootstrap.jar")

                workingDir = libsDir
                if (DefaultNativePlatform.getCurrentOperatingSystem().isWindows) {
                    commandLine(
                        "cmd",
                        "/c",
                        godotExtension.d8ToolPath,
                        "\"${godotBootstrapJar.absolutePath}\"",
                        "--output",
                        "godot-bootstrap-dex.jar",
                        "--lib",
                        "${godotExtension.androidCompileSdkDir}/android.jar",
                    )
                } else {
                    commandLine(
                        godotExtension.d8ToolPath,
                        godotBootstrapJar.absolutePath,
                        "--output",
                        "godot-bootstrap-dex.jar",
                        "--lib",
                        "${godotExtension.androidCompileSdkDir}/android.jar",
                    )
                }
            }

            // d8 doc: https://developer.android.com/studio/command-line/d8
            val createMainDexFile = with(create("createMainDexFile", Exec::class.java)) {
                group = "godot-kotlin-jvm"
                description = "Converts the main.jar to an android dex file. Needed for android builds only"

                dependsOn(checkD8ToolAccessible, checkAndroidJarAccessible, shadowJar, bootstrapJar)

                val libsDir = project.buildDir.resolve("libs")
                val mainJar = File(libsDir, "main.jar")
                val godotBootstrapJar = File(libsDir, "godot-bootstrap.jar")

                workingDir = libsDir
                if (DefaultNativePlatform.getCurrentOperatingSystem().isWindows) {
                    commandLine(
                        "cmd",
                        "/c",
                        godotExtension.d8ToolPath,
                        "\"${mainJar.absolutePath}\"",
                        "--lib",
                        "${godotExtension.androidCompileSdkDir}/android.jar",
                    )
                } else {
                    commandLine(
                        godotExtension.d8ToolPath,
                        mainJar.absolutePath,
                        "--lib",
                        "${godotExtension.androidCompileSdkDir}/android.jar",
                        "--classpath",
                        godotBootstrapJar.absolutePath,
                    )
                }
            }

            val createMainDexJar = with(create("createMainDexJar", ShadowJar::class.java)) {
                group = "godot-kotlin-jvm"
                description = "Packs the android dex file of main, together with the needed entry service file into a jar. Needed for android builds only"

                archiveBaseName.set("main-dex")

                from("src/main/resources").include("**/godot.runtime.Entry")
                from("${project.buildDir.absolutePath}/libs/").include("classes.dex")

                dependsOn(createMainDexFile)
            }

            val generateServiceFile = with(create("generateServiceFile")) {
                group = "godot-kotlin-jvm"
                description = "Converts the main.jar to an android compatible version. Needed for android builds only"

                doLast {
                    generateServiceFile()
                }
            }

            @Suppress("UNUSED_VARIABLE")
            val build = with(getByName("build")) {
                dependsOn(bootstrapJar, shadowJar, generateServiceFile)
                finalizedBy(deleteBuildLock)
                if (godotExtension.isAndroidExportEnabled.get()) {
                    finalizedBy(createGodotBootstrapDexJar, createMainDexJar)
                }
            }

            @Suppress("UNUSED_VARIABLE")
            val clean = with(getByName("clean")) {
                dependsOn(createBuildLock)
                finalizedBy(deleteBuildLock)
            }
        }
    }
}

private fun getBuildLockDir(projectDir: File): File {
    val name = "${projectDir.name}_buildLockDir"  //keep the same in the Bootstrap class!
    val tmpDir = System.getProperty("java.io.tmpdir")
    val lockDir = File(tmpDir, name)

    return if (lockDir.exists() && lockDir.isDirectory) {
        lockDir
    } else {
        lockDir.delete()
        lockDir.mkdirs()
        lockDir
    }
}

private fun Project.generateServiceFile() {
    val metaInfServicesDir = projectDir.resolve("src/main/resources/META-INF/services")
    metaInfServicesDir.mkdirs()
    File(metaInfServicesDir, "godot.runtime.Entry").writeText("godot.Entry")
}
