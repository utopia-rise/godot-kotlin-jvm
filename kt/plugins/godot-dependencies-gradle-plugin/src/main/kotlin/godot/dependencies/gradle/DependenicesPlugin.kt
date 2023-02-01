package godot.dependencies.gradle

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.artifacts.dsl.DependencyHandler
import org.jetbrains.kotlin.gradle.plugin.KotlinDependencyHandler

class DependenciesPlugin: Plugin<Project> {
    override fun apply(target: Project) {
        // no op
    }
}

val KotlinDependencyHandler.deps get() = DependenciesVersions
val DependencyHandler.deps get() = DependenciesVersions

val KotlinDependencyHandler.godotKotlinJvmVersion get() = "${godot.dependencies.gradle.godotKotlinJvmVersion}-${DependenciesVersions.godotVersion}"
val DependencyHandler.godotKotlinJvmVersion get() = "${godot.dependencies.gradle.godotKotlinJvmVersion}-${DependenciesVersions.godotVersion}"
