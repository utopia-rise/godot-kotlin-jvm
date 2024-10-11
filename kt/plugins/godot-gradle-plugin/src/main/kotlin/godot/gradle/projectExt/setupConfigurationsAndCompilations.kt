package godot.gradle.projectExt

import godot.utils.GodotBuildProperties
import org.gradle.api.Project

/**
 * Set's up all configurations and compilations needed for kotlin_jvm to work and defines proper task dependencies between them.
 *
 * ## Overview
 * General overview of what this function set's up to happen on each build the user performs on his code:
 * - Creates a `bootstrap.jar` which contains all glue code for the `cpp -> jvm -> cpp` communication but no user code.
 * This `bootstrap.jar` is loaded automatically at startup by the `cpp` side of the module
 * - Applies our kotlin symbol processor to the `main` configuration and compilation to automatically generate the entry files.
 * - Configures a `Shadow Jar (Fat Jar) which includes all dependencies.
 * - Uses the created `Shadow Jar` named `main.jar` together with the created `godot-bootstrap.jar` at startup
 */
fun Project.setupConfigurationsAndCompilations() {
    //add our dependencies to the main compilation -> convenience for the user
    kotlinJvmExtension.target.compilations.getByName("main").apply {
        dependencies {
            compileOnly("com.utopia-rise:$godotApiLibraryArtifactName:${GodotBuildProperties.assembledGodotKotlinJvmVersion}")
            compileOnly("com.utopia-rise:godot-kotlin-symbol-processor:${GodotBuildProperties.assembledGodotKotlinJvmVersion}")
        }
        dependencies.add(
            "ksp",
            "com.utopia-rise:godot-kotlin-symbol-processor:${GodotBuildProperties.assembledGodotKotlinJvmVersion}"
        )
    }

    //bootstrap configuration containing all glue code but no user code
    @Suppress("UNUSED_VARIABLE")
    val bootstrapConfiguration = configurations.create("bootstrap") {
        with(it.dependencies) {
            add(dependencies.create("org.jetbrains.kotlin:kotlin-stdlib:${kotlinJvmExtension.coreLibrariesVersion}"))
            add(dependencies.create("com.utopia-rise:$godotApiLibraryArtifactName:${GodotBuildProperties.assembledGodotKotlinJvmVersion}"))
            add(dependencies.create("com.utopia-rise:tools-common:${GodotBuildProperties.assembledGodotKotlinJvmVersion}"))

            // add reflection explicitly so it's usable in exported projects as well. See: GH-571
            add(dependencies.create("org.jetbrains.kotlin:kotlin-reflect:${GodotBuildProperties.supportedKotlinVersion}"))
        }
    }
}
