package godot.gradle

import godot.gradle.projectExt.checkJdkVersionCompatibility
import godot.gradle.projectExt.checkKotlinVersionCompatibility
import godot.gradle.projectExt.checkScalaVersionCompatibility
import godot.gradle.projectExt.configureThirdPartyPlugins
import godot.gradle.projectExt.optimizeLanguageCompilationTasks
import godot.gradle.projectExt.setupConfigurationsAndCompilations
import godot.gradle.projectExt.setupTasks
import org.gradle.api.Plugin
import org.gradle.api.Project

abstract class GodotPlugin : Plugin<Project> {
    override fun apply(target: Project) = with(target) {
        extensions.create("godot", GodotExtension::class.java).also {
            it.configureExtensionDefaults(this)
        }
        checkJdkVersionCompatibility()
        checkKotlinVersionCompatibility()
        checkScalaVersionCompatibility()

        configureThirdPartyPlugins()
        optimizeLanguageCompilationTasks()
        setupConfigurationsAndCompilations()
        setupTasks()
    }
}
