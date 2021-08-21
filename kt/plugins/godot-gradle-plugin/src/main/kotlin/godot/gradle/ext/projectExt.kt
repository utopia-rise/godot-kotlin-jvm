package godot.gradle.ext

import com.google.devtools.ksp.gradle.KspExtension
import godot.gradle.GodotExtension
import godot.gradle.tasks.TaskRegistry
import godot.utils.GodotBuildProperties
import org.gradle.api.Project
import org.gradle.plugins.ide.idea.model.IdeaModel
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmProjectExtension
import org.jetbrains.kotlin.gradle.plugin.KotlinPluginWrapper
import java.io.File

fun Project.getBuildLockDir(): File {
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

fun Project.generateServiceFile() {
    val metaInfServicesDir = projectDir.resolve("src/main/resources/META-INF/services")
    metaInfServicesDir.mkdirs()
    File(metaInfServicesDir, "godot.runtime.Entry").writeText("godot.Entry")
}

val Project.godotJvmExtension: GodotExtension
    get() = extensions.getByType(GodotExtension::class.java)

val Project.kotlinJvmExtension: KotlinJvmProjectExtension
    get() = extensions
        .findByType(KotlinJvmProjectExtension::class.java)
        ?: rootProject.extensions.getByType(KotlinJvmProjectExtension::class.java)



val Project.kspExtension: KspExtension
    get() = requireNotNull(
        extensions
            .findByType(KspExtension::class.java)
    ) {
        "kspExtension not found"
    }

val Project.ideaExtension: IdeaModel
    get() = requireNotNull(
        extensions
            .findByType(IdeaModel::class.java)
    ) {
        "idea extension not found"
    }

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
fun Project.setupConfigurationsAndCompilations() {
    //add our dependencies to the main compilation -> convenience for the user
    kotlinJvmExtension.target.compilations.getByName("main").apply {
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
    @Suppress("UNUSED_VARIABLE")
    val bootstrapConfiguration = configurations.create("bootstrap") {
        with(it.dependencies) {
            add(dependencies.create("org.jetbrains.kotlin:kotlin-stdlib:${kotlinJvmExtension.coreLibrariesVersion}"))
            add(dependencies.create("com.utopia-rise:godot-library:${GodotBuildProperties.godotKotlinVersion}"))
        }
    }

    afterEvaluate {
        with(tasks) {
            TaskRegistry.values().forEach { taskRegistryEntry ->
                register(taskRegistryEntry.taskName, taskRegistryEntry.taskClass.java) { godotJvmGradleTask ->
                    godotJvmGradleTask.setup()
                }
            }

            @Suppress("UNUSED_VARIABLE")
            val build = with(getByName("build")) {
                dependsOn(
                    TaskRegistry.PACKAGE_BOOTSTRAP_JAR.taskName,
                    TaskRegistry.PACKAGE_MAIN_JAR.taskName,
                    TaskRegistry.GENERATE_ENTRY_SERVICE_FILE.taskName,
                )
                finalizedBy(TaskRegistry.DELETE_BUILD_LOCK.taskName)

                if (godotJvmExtension.isAndroidExportEnabled.get()) {
                    finalizedBy(
                        TaskRegistry.PACKAGE_BOOTSTRAP_DEX_JAR.taskName,
                        TaskRegistry.PACKAGE_MAIN_DEX_JAR.taskName,
                    )
                }
                if (godotJvmExtension.isGraalNativeImageExportEnabled.get()) {
                    finalizedBy(
                        TaskRegistry.CREATE_GRAAL_NATIVE_IMAGE.taskName,
                    )
                }
            }

            @Suppress("UNUSED_VARIABLE")
            val clean = with(getByName("clean")) {
                dependsOn(
                    TaskRegistry.CREATE_BUILD_LOCK.taskName,
                )
                finalizedBy(
                    TaskRegistry.DELETE_BUILD_LOCK.taskName,
                )
            }
        }
    }
}

fun Project.configureThirdPartyPlugins() {
    kotlinJvmExtension
        .sourceSets
        .getByName("main")
        .kotlin
        .srcDirs(buildDir.resolve("generated/ksp/main/kotlin/"))

    afterEvaluate {
        kspExtension.apply {
            arg(
                "srcDirs",
                kotlinJvmExtension
                    .sourceSets
                    .getByName("main")
                    .kotlin
                    .srcDirs
                    .joinToString(File.pathSeparator) { it.absolutePath.replace(File.separator, "/") }
            )
            arg(
                "projectBasePath",
                projectDir.absolutePath.replace(File.separator, "/")
            )
        }

        ideaExtension.apply {
            module { ideaModule ->
                ideaModule.generatedSourceDirs.add(buildDir.resolve("generated/ksp/main/kotlin/"))
            }
        }
    }
}

fun Project.checkKotlinVersionCompatibility() {
    val kotlinPlugin = plugins.findPlugin(KotlinPluginWrapper::class.java)
    val kotlinPluginVersion = buildscript
        .configurations
        .firstOrNull { it.name == "classpath" }
        ?.dependencies
        ?.firstOrNull { it.name == "org.jetbrains.kotlin.jvm.gradle.plugin" }
        ?.version

    val isSuppressingKotlinIncompatibility =
        (findProperty("godot.jvm.suppressKotlinIncompatibility") as? String)?.toBoolean() ?: false

    if (!isSuppressingKotlinIncompatibility) {
        logger.info("Kotlin plugin already applied: ${kotlinPlugin != null}; detected version: ${kotlinPluginVersion ?: "none"}")

        when {
            kotlinPlugin != null && kotlinPluginVersion != null && kotlinPluginVersion != GodotBuildProperties.supportedKotlinVersion -> throw IllegalArgumentException(
                "Detected that a kotlin plugin with version $kotlinPluginVersion is already applied. But Godot-Kotlin is only compatible with kotlin ${GodotBuildProperties.supportedKotlinVersion}, please change the version to ${GodotBuildProperties.supportedKotlinVersion}"
            )
            kotlinPlugin == null && kotlinPluginVersion != null && kotlinPluginVersion != GodotBuildProperties.supportedKotlinVersion -> throw IllegalArgumentException(
                "Detected that kotlin plugin version $kotlinPluginVersion is already defined. But Godot-Kotlin is only compatible with kotlin ${GodotBuildProperties.supportedKotlinVersion}, please change the version to ${GodotBuildProperties.supportedKotlinVersion}"
            )
            kotlinPlugin == null && kotlinPluginVersion == null || kotlinPluginVersion == GodotBuildProperties.supportedKotlinVersion -> {
                pluginManager.apply("org.jetbrains.kotlin.jvm") // the version will be the one with which this plugin was built
            }
        }
    } else {
        // warn is not really visible enough in the log. As this is a very important print, error is used to print it more visible
        logger.error("Found property \"godot.jvm.suppressKotlinIncompatibility\" is set to \"true\". This is an advanced feature! Only use it if you know what you're doing. We cannot guarantee that our compiler plugin is compatible with other kotlin version that ${GodotBuildProperties.supportedKotlinVersion} (found version: $kotlinPluginVersion). Setting this property to true can lead to build and/or runtime errors.")
    }
}
