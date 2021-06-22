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
            implementation("com.utopia-rise:godot-annotation-processor-new:${GodotBuildProperties.godotKotlinVersion}")
        }
        dependencies.add("ksp", "com.utopia-rise:godot-annotation-processor-new:${GodotBuildProperties.godotKotlinVersion}")
    }

    //bootstrap configuration containing all glue code but no user code
    val bootstrapConfiguration = configurations.create("bootstrap") {
        with(it.dependencies) {
            add(dependencies.create("org.jetbrains.kotlin:kotlin-stdlib:${jvm.coreLibrariesVersion}"))
            add(dependencies.create("com.utopia-rise:godot-library:${GodotBuildProperties.godotKotlinVersion}"))
        }
    }

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
            exclude("**/module-info.class") //for android support: excludes java 9+ module info which cannot be parsed by the dx tool
            configurations.clear()
            configurations.add(bootstrapConfiguration)

            dependsOn(createBuildLock)
        }

        val shadowJar = with(named("shadowJar", ShadowJar::class.java).get()) {
            archiveBaseName.set("main")
            archiveVersion.set("")
            archiveClassifier.set("")
            exclude("**/module-info.class") //for android support: excludes java 9+ module info which cannot be parsed by the dx tool

            dependencies {
                it.exclude(it.dependency("org.jetbrains.kotlin:kotlin-stdlib.*"))
                it.exclude(it.dependency("com.utopia-rise:godot-library:.*"))
            }

            dependsOn(createBuildLock)
        }

        val checkDxToolAccessible = with(create("checkDxToolAccessible")) {
            group = "godot-kotlin-jvm"
            description = "Checks if the dx tool is accessible and executable. Needed for android builds only"

            doLast {
                try {
                    val result = exec {
                        with(it) {
                            workingDir = projectDir
                            isIgnoreExitValue = true

                            if (DefaultNativePlatform.getCurrentOperatingSystem().isWindows) {
                                commandLine("cmd", "/c", godotExtension.dxToolPath.get(), "--version")
                            } else {
                                commandLine(godotExtension.dxToolPath.get(), "--version")
                            }
                        }
                    }
                    if (result.exitValue != 0) {
                        throw IllegalArgumentException("dx tool not found! Make sure the dx tool is in you PATH variable or set \"dxToolPath\" to the absolute path of the dx tool. Normally the dx tool resides in <android-sdk-root>/build-tools/<version>/dx. For more information visit the docs. Provided path: ${godotExtension.dxToolPath.get()}") //TODO: add url once doc ist hosted
                    }
                } catch (e: Throwable) {
                    throw IllegalArgumentException("dx tool not found! Make sure the dx tool is in you PATH variable or set \"dxToolPath\" to the absolute path of the dx tool. Normally the dx tool resides in <android-sdk-root>/build-tools/<version>/dx. For more information visit the docs. Provided path: ${godotExtension.dxToolPath.get()}") //TODO: add url once doc ist hosted
                }
            }
        }

        val createGodotBootstrapDexJar = with(create("createGodotBootstrapDexJar", Exec::class.java)) {
            group = "godot-kotlin-jvm"
            description = "Converts the godot-bootstrap.jar to an android compatible version. Needed for android builds only"

            dependsOn(checkDxToolAccessible, shadowJar, bootstrapJar)
            val libsDir = project.buildDir.resolve("libs")
            val godotBootstrapJar = File(libsDir, "godot-bootstrap.jar")

            workingDir = libsDir
            if (DefaultNativePlatform.getCurrentOperatingSystem().isWindows) {
                commandLine("cmd", "/c", godotExtension.dxToolPath.get(), "--dex", "--output=\"godot-bootstrap-dex.jar\"", "\"${godotBootstrapJar.absolutePath}\"")
            } else {
                commandLine(godotExtension.dxToolPath.get(), "--dex", "--output=godot-bootstrap-dex.jar", godotBootstrapJar.absolutePath)
            }
        }

        val createMainDexJar = with(create("createMainDexJar", Exec::class.java)) {
            group = "godot-kotlin-jvm"
            description = "Converts the main.jar to an android compatible version. Needed for android builds only"

            dependsOn(checkDxToolAccessible, shadowJar, bootstrapJar)
            val libsDir = project.buildDir.resolve("libs")
            val mainJar = File(libsDir, "main.jar")

            workingDir = libsDir
            if (DefaultNativePlatform.getCurrentOperatingSystem().isWindows) {
                commandLine("cmd", "/c", godotExtension.dxToolPath.get(), "--dex", "--output=\"main-dex.jar\"", "\"${mainJar.absolutePath}\"")
            } else {
                commandLine(godotExtension.dxToolPath.get(), "--dex", "--output=main-dex.jar", mainJar.absolutePath)
            }
        }

        @Suppress("UNUSED_VARIABLE")
        val build = with(getByName("build")) {
            dependsOn(bootstrapJar, shadowJar)
            finalizedBy(deleteBuildLock)
            if(godotExtension.isAndroidExportEnabled.get()) {
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
