package godot.gradle

import godot.gradle.projectExt.checkKotlinVersionCompatibility
import godot.gradle.projectExt.configureThirdPartyPlugins
import godot.gradle.projectExt.godotCoroutineLibraryArtifactName
import godot.gradle.projectExt.godotJvmExtension
import godot.gradle.projectExt.setupConfigurationsAndCompilations
import godot.gradle.projectExt.setupTasks
import godot.utils.GodotBuildProperties
import org.gradle.api.Plugin
import org.gradle.api.Project

abstract class GodotPlugin : Plugin<Project> {
    override fun apply(target: Project) = with(target) {
        checkKotlinVersionCompatibility()

        extensions.create("godot", GodotExtension::class.java).also {
            it.configureExtensionDefaults(this)
        }

        configureThirdPartyPlugins()
        setupConfigurationsAndCompilations()
        setupTasks()

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
        }
    }
}
