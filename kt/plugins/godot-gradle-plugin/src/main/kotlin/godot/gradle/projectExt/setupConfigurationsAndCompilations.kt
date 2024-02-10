package godot.gradle.projectExt

import godot.utils.GodotBuildProperties
import org.gradle.api.Project

/**
 * Set's up all configurations and compilations needed for kotlin_jvm to work and defines proper task dependencies between them.
 *
 * ## Overview
 * General overview of what this function set's up to happen on each build the user performs on his code:
 * - Applies our kotlin symbol processor to the `main` configuration and compilation to automatically generate the entry files.
 * - Configures a `Shadow Jar (Fat Jar) which includes all dependencies.
 * - Uses the created `Shadow Jar` named `usercode.jar` at startup
 */
fun Project.setupConfigurationsAndCompilations() {
    //add our dependencies to the main compilation -> convenience for the user
    kotlinJvmExtension.target.compilations.getByName("main").apply {
        dependencies {
            implementation("com.utopia-rise:$godotLibraryArtifactName:${GodotBuildProperties.assembledGodotKotlinJvmVersion}")
//            implementation("com.utopia-rise:godot-kotlin-symbol-processor:${GodotBuildProperties.assembledGodotKotlinJvmVersion}")
        }
        dependencies.add(
            "ksp",
            "com.utopia-rise:godot-kotlin-symbol-processor:${GodotBuildProperties.assembledGodotKotlinJvmVersion}"
        )
    }
}
