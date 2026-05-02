package godot.gradle.projectExt

import godot.utils.GodotBuildProperties
import org.gradle.api.Project
import org.gradle.api.tasks.compile.JavaCompile
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

/**
 * Set's up all configurations and compilations needed for kotlin_jvm to work and defines proper task dependencies between them.
 *
 * ## Overview
 * General overview of what this plugin sets up around the user's regular project compilation:
 * - Configures the normal `main` source set dependencies so Kotlin, Java and Scala user code compile against the
 *   Godot Kotlin/JVM libraries and Scala runtime.
 * - Configures compiler flags that the entry-generation scan relies on, such as parameter metadata for Java and Kotlin.
 * - Creates a dedicated `bootstrap` configuration used to build `bootstrap.jar`, which contains the glue code for the
 *   `cpp -> jvm -> cpp` communication but no user project classes.
 * - The user's normal compiled output is later packaged into an intermediary `user.jar`, scanned by ClassGraph to
 *   produce generated entry sources and `.gdj` files, then merged into the final `main.jar`.
 * - At runtime, the module uses `godot-bootstrap.jar` together with `main.jar`.
 */
fun Project.setupConfigurationsAndCompilations() {
    //add our dependencies to the main compilation -> convenience for the user
    kotlinJvmExtension.target.compilations.getByName("main").defaultSourceSet {
        dependencies {
            compileOnly("com.utopia-rise:common:${GodotBuildProperties.assembledGodotKotlinJvmVersion}")
            compileOnly("com.utopia-rise:godot-build-props:${GodotBuildProperties.assembledGodotKotlinJvmVersion}")
            compileOnly("com.utopia-rise:$godotCoreArtifactName:${GodotBuildProperties.assembledGodotKotlinJvmVersion}")
            compileOnly("com.utopia-rise:$godotApiArtifactName:${GodotBuildProperties.assembledGodotKotlinJvmVersion}")
            compileOnly("com.utopia-rise:$godotBootstrapArtifactName:${GodotBuildProperties.assembledGodotKotlinJvmVersion}")
            compileOnly("com.utopia-rise:$godotExtensionArtifactName:${GodotBuildProperties.assembledGodotKotlinJvmVersion}")
            compileOnly("com.utopia-rise:godot-class-graph-symbol-processor:${GodotBuildProperties.assembledGodotKotlinJvmVersion}")

            implementation("org.scala-lang:scala3-library_3:${godotJvmExtension.scalaVersion.get()}")
        }
    }

    tasks.withType(JavaCompile::class.java).configureEach { javaCompile ->
        javaCompile.options.compilerArgs.add("-parameters")
    }

    tasks.withType(KotlinCompile::class.java).configureEach { kotlinCompile ->
        kotlinCompile.compilerOptions {
            javaParameters.set(true)
        }
    }

    //bootstrap configuration containing all glue code but no user code
    @Suppress("UNUSED_VARIABLE")
    val bootstrapConfiguration = configurations.create("bootstrap") {
        with(it.dependencies) {
            add(dependencies.create("org.jetbrains.kotlin:kotlin-stdlib:${kotlinJvmExtension.coreLibrariesVersion}"))
            add(dependencies.create("com.utopia-rise:godot-build-props:${GodotBuildProperties.assembledGodotKotlinJvmVersion}"))
            add(dependencies.create("com.utopia-rise:common:${GodotBuildProperties.assembledGodotKotlinJvmVersion}"))
            add(dependencies.create("com.utopia-rise:$godotInternalArtifactName:${GodotBuildProperties.assembledGodotKotlinJvmVersion}"))
            add(dependencies.create("com.utopia-rise:$godotCoreArtifactName:${GodotBuildProperties.assembledGodotKotlinJvmVersion}"))
            add(dependencies.create("com.utopia-rise:$godotApiArtifactName:${GodotBuildProperties.assembledGodotKotlinJvmVersion}"))
            add(dependencies.create("com.utopia-rise:$godotBootstrapArtifactName:${GodotBuildProperties.assembledGodotKotlinJvmVersion}"))
            add(dependencies.create("com.utopia-rise:$godotExtensionArtifactName:${GodotBuildProperties.assembledGodotKotlinJvmVersion}"))
            // add reflection explicitly so it's usable in exported projects as well. See: GH-571
            add(dependencies.create("org.jetbrains.kotlin:kotlin-reflect:${GodotBuildProperties.supportedKotlinVersion}"))
        }
    }
}
