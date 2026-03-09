package godot.gradle.tasks

import godot.gradle.projectExt.kotlinJvmExtension
import org.gradle.api.Project
import org.gradle.api.tasks.SourceSetContainer
import org.gradle.api.tasks.TaskProvider
import org.gradle.api.tasks.scala.ScalaCompile

fun Project.initialScalaCompileForClassGraph(): TaskProvider<ScalaCompile> {
    val mainCompilation = kotlinJvmExtension.target.compilations.getByName("main")

    val mainSourceSet =  project.extensions
        .getByType(SourceSetContainer::class.java)
        .getByName("main")

    val scalaCompileTask = tasks.getByName("compileScala") as ScalaCompile

    return tasks.register("initialCompileScala", org.gradle.api.tasks.scala.ScalaCompile::class.java) { scalaCompile ->
        scalaCompile.source = mainSourceSet.allSource.filter { it.extension == "scala" }.asFileTree // Include Scala sources
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
