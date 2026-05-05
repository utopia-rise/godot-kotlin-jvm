package godot.gradle.projectExt

import godot.tools.common.BUILD_VERSION
import godot.tools.common.KOTLIN_COROUTINE_VERSION
import godot.tools.common.KOTLIN_VERSION
import org.gradle.api.Project
import org.gradle.api.tasks.compile.JavaCompile
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

/**
 * Set's up all configurations and compilations needed for kotlin_jvm to work and defines proper task dependencies between them.
 *
 * ## Overview
 * General overview of what this plugin sets up around the user's regular project compilation:
 * - Configures the normal `main` source set dependencies so Kotlin, Java, and Scala user code compile against the
 *   Godot Kotlin/JVM libraries and Scala runtime.
 * - Configures compiler flags that the entry-generation scan relies on, such as parameter metadata for Java and Kotlin.
 * - Creates a dedicated `bootstrap` configuration used to build `bootstrap.jar`, which contains the glue code for the
 *   `cpp -> jvm -> cpp` communication but no user project classes.
 * - The user's normal compiled output is later packaged into an intermediary `user.jar`, then used by entry generation to
 *   produce generated entry sources and `.gdj` files, then merged into the final `main.jar`.
 * - At runtime, the module uses `godot-bootstrap.jar` together with `main.jar`.
 */
fun Project.setupConfigurationsAndCompilations() {
    afterEvaluate {
        // Add all consumer-project main compilation dependencies in one place, after the user's
        // `godot { ... }` configuration has had a chance to override extension defaults.
        dependencies.add("compileOnly", "com.utopia-rise:common:$BUILD_VERSION")
        dependencies.add("compileOnly", "com.utopia-rise:$godotCoreArtifactName:$BUILD_VERSION")
        dependencies.add("compileOnly", "com.utopia-rise:$godotApiArtifactName:$BUILD_VERSION")
        dependencies.add("compileOnly", "com.utopia-rise:$godotExtensionArtifactName:$BUILD_VERSION")
        dependencies.add("compileOnly", "com.utopia-rise:$godotBootstrapArtifactName:$BUILD_VERSION")
        dependencies.add("implementation", "org.scala-lang:scala3-library_3:${godotJvmExtension.scalaLanguageVersion.get()}")

        if (godotJvmExtension.isGodotCoroutinesEnabled.get()) {
            dependencies.add(
                "implementation",
                "com.utopia-rise:${godotCoroutineLibraryArtifactName}:$BUILD_VERSION"
            )
            dependencies.add(
                "implementation",
                "org.jetbrains.kotlinx:kotlinx-coroutines-core:$KOTLIN_COROUTINE_VERSION"
            )
        }

        if (!godotJvmExtension.isLibrary.get()) {
            dependencies.add(
                "compileOnly",
                "com.utopia-rise:godot-class-graph-symbol-processor:$BUILD_VERSION"
            )
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
    configurations.create("bootstrap") {
        with(it.dependencies) {
            add(dependencies.create("org.jetbrains.kotlin:kotlin-stdlib:${kotlinJvmExtension.coreLibrariesVersion}"))
            add(dependencies.create("com.utopia-rise:common:$BUILD_VERSION"))
            add(dependencies.create("com.utopia-rise:$godotInternalArtifactName:$BUILD_VERSION"))
            add(dependencies.create("com.utopia-rise:$godotCoreArtifactName:$BUILD_VERSION"))
            add(dependencies.create("com.utopia-rise:$godotApiArtifactName:$BUILD_VERSION"))
            add(dependencies.create("com.utopia-rise:$godotBootstrapArtifactName:$BUILD_VERSION"))
            add(dependencies.create("com.utopia-rise:$godotExtensionArtifactName:$BUILD_VERSION"))
            // add reflection explicitly so it's usable in exported projects as well. See: GH-571
            add(dependencies.create("org.jetbrains.kotlin:kotlin-reflect:$KOTLIN_VERSION"))
        }
    }
}
