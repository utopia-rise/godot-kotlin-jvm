package godot.gradle

import godot.gradle.projectExt.checkKotlinVersionCompatibility
import godot.gradle.projectExt.configureThirdPartyPlugins
import godot.gradle.projectExt.setupConfigurationsAndCompilations
import godot.gradle.projectExt.setupTasks
import org.gradle.api.Plugin
import org.gradle.api.Project


class GodotPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        target.checkKotlinVersionCompatibility()

        target.extensions.create("godot", GodotExtension::class.java).also {
            it.configureExtensionDefaults()
        }

        target.configureThirdPartyPlugins()
        target.setupConfigurationsAndCompilations()
        target.setupTasks()
    }
}
