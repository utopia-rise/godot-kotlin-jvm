package godot.gradle.projectExt

import com.github.jengelman.gradle.plugins.shadow.ShadowPlugin
import org.gradle.api.Project
import org.gradle.api.plugins.scala.ScalaPlugin

fun Project.configureThirdPartyPlugins() {
    pluginManager.apply(ShadowPlugin::class.java)
    pluginManager.apply(ScalaPlugin::class.java)
}
