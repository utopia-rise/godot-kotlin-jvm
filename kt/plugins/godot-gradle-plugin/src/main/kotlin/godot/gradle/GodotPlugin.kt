package godot.gradle

import godot.gradle.projectExt.checkKotlinVersionCompatibility
import godot.gradle.projectExt.configureThirdPartyPlugins
import godot.gradle.projectExt.godotCoroutineLibraryArtifactName
import godot.gradle.projectExt.godotJvmExtension
import godot.gradle.projectExt.setupConfigurationsAndCompilations
import godot.gradle.projectExt.setupTasks
import godot.gradle.properties.GodotKotlinJvmPropertiesFileImpl
import godot.plugins.common.GodotKotlinJvmPropertiesFile
import godot.utils.GodotBuildProperties
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.tooling.provider.model.ToolingModelBuilder
import org.gradle.tooling.provider.model.ToolingModelBuilderRegistry
import javax.inject.Inject


abstract class GodotPlugin : Plugin<Project> {

    @get:Inject
    abstract val registry: ToolingModelBuilderRegistry

    override fun apply(target: Project) = with(target) {
        checkKotlinVersionCompatibility()

        val extension = extensions.create("godot", GodotExtension::class.java).also {
            it.configureExtensionDefaults(this)
        }

        configureThirdPartyPlugins()
        setupConfigurationsAndCompilations()
        setupTasks()

        // registers the tooling model builder, so it can be used by the ide plugin
        afterEvaluate {
            if (godotJvmExtension.isGodotCoroutinesEnabled.get()) {
                dependencies.add(
                    "implementation",
                    dependencies.create("com.utopia-rise:${godotCoroutineLibraryArtifactName}:${GodotBuildProperties.assembledGodotKotlinJvmVersion}")
                )
                dependencies.add(
                    "implementation",
                    dependencies.create("org.jetbrains.kotlinx:kotlinx-coroutines-core:${GodotBuildProperties.kotlinCoroutineVersion}")
                )
            }
            registry.register(
                PropertiesModelBuilder(
                    isFqNameRegistrationEnabled = extension.isFqNameRegistrationEnabled.get(),
                    isRegistrationFileHierarchyEnabled = extension.isRegistrationFileHierarchyEnabled.get(),
                    registrationFileBaseDir = extension.registrationFileBaseDir.get().asFile.relativeTo(projectDir).path
                )
            )
        }
    }


    /**
     * The PropertiesModelBuilder class is responsible for building the tooling model for the Godot-JVM properties file.
     *
     * This file is only virtually present and is then loaded by `FetchProjectModelsBuildAction` in the IDE plugin to load the users gradle configuration of our gradle plugin.
     *
     * @property isFqNameRegistrationEnabled A boolean value indicating whether fully qualified name registration is enabled.
     * @property isRegistrationFileHierarchyEnabled A boolean value indicating whether registration file hierarchy is enabled.
     * @property registrationFileBaseDir The base directory for the registration file.
     */
    internal class PropertiesModelBuilder(
        private val isFqNameRegistrationEnabled: Boolean,
        private val isRegistrationFileHierarchyEnabled: Boolean,
        private val registrationFileBaseDir: String,
    ) : ToolingModelBuilder {
        override fun canBuild(modelName: String): Boolean {
            return modelName == GodotKotlinJvmPropertiesFile::class.java.name
        }

        override fun buildAll(modelName: String, project: Project): Any {
            return GodotKotlinJvmPropertiesFileImpl(
                isFqNameRegistrationEnabled = isFqNameRegistrationEnabled,
                isRegistrationFileHierarchyEnabled = isRegistrationFileHierarchyEnabled,
                registrationFileBaseDir = registrationFileBaseDir,
            )
        }
    }
}
