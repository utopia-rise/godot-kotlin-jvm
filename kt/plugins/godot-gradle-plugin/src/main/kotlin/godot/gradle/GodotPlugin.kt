package godot.gradle

import com.github.jengelman.gradle.plugins.shadow.ShadowPlugin
import com.google.devtools.ksp.gradle.KspGradleSubplugin
import godot.gradle.ext.checkKotlinVersionCompatibility
import godot.gradle.ext.configureThirdPartyPlugins
import godot.gradle.ext.setupConfigurationsAndCompilations
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.plugins.ide.idea.IdeaPlugin


class GodotPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        //apply needed third party plugins
        target.repositories.google() //add google repository for ksp (kotlin symbol processing
        target.pluginManager.apply(KspGradleSubplugin::class.java)
        target.pluginManager.apply(IdeaPlugin::class.java) //needed so idea can find and index the generated sources from ksp
        target.pluginManager.apply(ShadowPlugin::class.java)

        target.checkKotlinVersionCompatibility()

        target.extensions.create("godot", GodotExtension::class.java).also {
            it.configureExtensionDefaults()
        }

        target.configureThirdPartyPlugins()
        target.setupConfigurationsAndCompilations()
    }
}
