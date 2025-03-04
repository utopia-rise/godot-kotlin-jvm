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
    val mainCompilation = kotlinJvmExtension.target.compilations.getByName("main")

    val mainSourceSet =  project.extensions
        .getByType(SourceSetContainer::class.java)
        .getByName("main")

    val scalaCompileTask = tasks.getByName("compileScala") as ScalaCompile

    val initialCompileScala = tasks.register("initialCompileScala", org.gradle.api.tasks.scala.ScalaCompile::class.java) { scalaCompile ->
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

    val classGraphJavaCompile = tasks.register("intitialForClassGraphCompileJava", JavaCompile::class.java) {
        it.source = mainSourceSet.allJava.asFileTree
        it.destinationDirectory.set(layout.buildDirectory.dir("classes/java/main"))
        it.classpath = mainSourceSet.compileClasspath
    }

    val classGraphKotlinCompile = kotlinJvmExtension.target.compilations.create("initialForClassGraphCompile") { kotlinCompile ->
        kotlinCompile.defaultSourceSet {
            this.kotlin.srcDirs(mainSourceSet.allSource.srcDirs)
        }

        kotlinCompile.compileDependencyFiles += mainCompilation.compileDependencyFiles
        kotlinCompile.runtimeDependencyFiles += mainCompilation.runtimeDependencyFiles

        kotlinCompile.compileTaskProvider.get().dependsOn(initialCompileScala)
        kotlinCompile.compileTaskProvider.get().dependsOn(classGraphJavaCompile)
    }

    tasks.withType(JavaCompile::class.java) { javaCompile ->
        javaCompile.options.compilerArgs.add("-parameters")
    }

    tasks.withType(KotlinCompile::class.java) { kotlinCompile ->
        kotlinCompile.compilerOptions {
            javaParameters.set(true)
        }
    }

    kotlinJvmExtension.target.compilations.getByName("main") {
        it.compileDependencyFiles += initialCompileScala.get().outputs.files
    }

    return classGraphKotlinCompile
}
