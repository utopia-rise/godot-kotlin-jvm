package godot.gradle

import godot.gradle.projectExt.checkKotlinVersionCompatibility
import godot.gradle.projectExt.configureThirdPartyPlugins
import godot.gradle.projectExt.setupConfigurationsAndCompilations
import godot.gradle.projectExt.setupTasks
import godot.gradle.properties.GodotKotlinJvmPropertiesFileImpl
import godot.plugins.common.GodotKotlinJvmPropertiesFile
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.tooling.provider.model.ToolingModelBuilder
import org.gradle.tooling.provider.model.ToolingModelBuilderRegistry
import javax.inject.Inject


abstract class GodotPlugin : Plugin<Project> {

    @get:Inject
    abstract val registry: ToolingModelBuilderRegistry

    override fun apply(target: Project) {
        target.checkKotlinVersionCompatibility()

        val extension = target.extensions.create("godot", GodotExtension::class.java).also {
            it.configureExtensionDefaults(target)
        }

        target.configureThirdPartyPlugins()
        target.setupConfigurationsAndCompilations()
        target.setupTasks()

        target.afterEvaluate {
            registry.register(
                PropertiesModelBuilder(
                    isFqNameRegistrationEnabled = extension.isFqNameRegistrationEnabled.get(),
                    isRegistrationFileHierarchyEnabled = extension.isRegistrationFileHierarchyEnabled.get(),
                    registrationFileBaseDir = extension.registrationFileBaseDir.get().asFile.relativeTo(target.projectDir).path
                )
            )
        }
    }

    internal class PropertiesModelBuilder(
        private val isFqNameRegistrationEnabled: Boolean,
        private val isRegistrationFileHierarchyEnabled: Boolean,
        private val registrationFileBaseDir: String,
    ): ToolingModelBuilder {
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
