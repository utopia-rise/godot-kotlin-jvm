package godot.dependencies.gradle

import org.ajoberstar.grgit.Grgit
import org.ajoberstar.grgit.gradle.GrgitPlugin
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.artifacts.dsl.DependencyHandler
import org.jetbrains.kotlin.gradle.plugin.KotlinDependencyHandler

class DependenciesPlugin: Plugin<Project> {
    override fun apply(target: Project) {
        target.plugins.apply(GrgitPlugin::class.java)
        grgit = target.extensions.getByType(Grgit::class.java)
        // no op
    }
}

internal lateinit var grgit: Grgit

val KotlinDependencyHandler.deps get() = DependenciesVersions
val DependencyHandler.deps get() = DependenciesVersions
