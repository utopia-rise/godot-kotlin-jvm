package godot.gradle

import godot.gradle.projectExt.checkKotlinVersionCompatibility
import godot.gradle.projectExt.configureThirdPartyPlugins
import godot.gradle.projectExt.setupConfigurationsAndCompilations
import godot.gradle.projectExt.setupTasks
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
    }
}
