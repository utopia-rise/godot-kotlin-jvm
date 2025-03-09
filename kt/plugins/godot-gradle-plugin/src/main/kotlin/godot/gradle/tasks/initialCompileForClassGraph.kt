package godot.gradle.tasks

import godot.gradle.projectExt.kotlinJvmExtension
import org.gradle.api.Project
import org.gradle.api.tasks.SourceSetContainer
import org.gradle.api.tasks.compile.JavaCompile
import org.gradle.api.tasks.scala.ScalaCompile
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmCompilerOptions
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmOptions
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinWithJavaCompilation
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

fun Project.initialCompileForClassGraph(): KotlinWithJavaCompilation<KotlinJvmOptions, KotlinJvmCompilerOptions> {
    tasks.withType(JavaCompile::class.java) { javaCompile ->
        javaCompile.options.compilerArgs.add("-parameters")
    }

    val mainCompilation = kotlinJvmExtension.target.compilations.getByName("main")

    val allSourceSets = project
        .extensions
        .getByType(SourceSetContainer::class.java)

    val allSources = allSourceSets.flatMap { it.allSource }

    val scalaCompileTask = tasks.findByName("compileScala") as? ScalaCompile

    val initialCompileScalaTaskProvider = scalaCompileTask?.let {
        tasks.register("initialCompileScala", ScalaCompile::class.java) { scalaCompile ->
            scalaCompile.group = "godot-kotlin-jvm-internal"
            scalaCompile.description = "Compiles users source files initially so godot kotlin jvm can process them"

            scalaCompile.source = allSourceSets.getByName("main").allSource.filter { it.extension == "scala" }.asFileTree
//            scalaCompile.setSource(allSources.filter { it.extension == "scala" })// Include Scala sources
            scalaCompile.classpath = mainCompilation.compileDependencyFiles // Include compiled Kotlin classes

            // Output directory for compiled Scala classes
            scalaCompile.destinationDirectory.set(layout.buildDirectory.dir("classes/scala/main"))

            // Add Scala compilation options
            scalaCompile.scalaCompileOptions.incrementalOptions.analysisFile.set(
                // Use the provider from the default compile task
                scalaCompileTask.scalaCompileOptions.incrementalOptions.analysisFile
            )
            scalaCompile.scalaCompileOptions.incrementalOptions.classfileBackupDir.set(
                // Use the provider from the default compile task
                scalaCompileTask.scalaCompileOptions.incrementalOptions.classfileBackupDir
            )
        }
    }

    val classGraphKotlinCompile = kotlinJvmExtension
        .target
        .compilations
        .create("initialForClassGraph") { kotlinCompile ->
            kotlinCompile.defaultSourceSet {
                this.kotlin.srcDirs(allSourceSets.flatMap { it.allSource.srcDirs })
            }

            kotlinCompile.compileDependencyFiles += mainCompilation.compileDependencyFiles
            kotlinCompile.runtimeDependencyFiles += mainCompilation.runtimeDependencyFiles

            val compileTask = kotlinCompile.compileTaskProvider.get()

            compileTask.outputs.dir(layout.buildDirectory.asFile.get().resolve("classes/kotlin/main"))

            initialCompileScalaTaskProvider?.let {
                kotlinCompile.compileTaskProvider.get().dependsOn(initialCompileScalaTaskProvider)
            }
        }

    tasks.withType(KotlinCompile::class.java) { kotlinCompile ->
        kotlinCompile.compilerOptions {
            javaParameters.set(true)
        }
    }

    if (initialCompileScalaTaskProvider != null) {
        kotlinJvmExtension.target.compilations.getByName("main") {
            it.compileDependencyFiles += initialCompileScalaTaskProvider.get().outputs.files
        }
    }

    return classGraphKotlinCompile
}
