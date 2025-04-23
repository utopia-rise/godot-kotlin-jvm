package godot.gradle.tasks

import godot.gradle.projectExt.kotlinJvmExtension
import org.gradle.api.Project
import org.gradle.api.tasks.SourceSetContainer
import org.gradle.api.tasks.TaskProvider
import org.gradle.api.tasks.compile.JavaCompile
import org.gradle.api.tasks.scala.ScalaCompile
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmCompilerOptions
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmOptions
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinWithJavaCompilation
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

fun Project.initialKotlinCompileForClassGraph(
    classGraphScalaCompile: TaskProvider<ScalaCompile>,
    classGraphJavaCompile: TaskProvider<JavaCompile>
): KotlinWithJavaCompilation<KotlinJvmOptions, KotlinJvmCompilerOptions> {
    val mainCompilation = kotlinJvmExtension.target.compilations.getByName("main")

    val mainSourceSet =  project.extensions
        .getByType(SourceSetContainer::class.java)
        .getByName("main")

    val classGraphKotlinCompile = kotlinJvmExtension.target.compilations.create("initialForClassGraphCompile") { kotlinCompile ->
        kotlinCompile.defaultSourceSet {
            this.kotlin.srcDirs(mainSourceSet.allSource.srcDirs)
        }

        kotlinCompile.compileDependencyFiles += mainCompilation.compileDependencyFiles
        kotlinCompile.compileDependencyFiles += classGraphScalaCompile.get().outputs.files
        kotlinCompile.compileDependencyFiles += classGraphJavaCompile.get().outputs.files
        kotlinCompile.runtimeDependencyFiles += mainCompilation.runtimeDependencyFiles

        kotlinCompile.compileTaskProvider.get().dependsOn(classGraphScalaCompile)
        kotlinCompile.compileTaskProvider.get().dependsOn(classGraphJavaCompile)
    }

    tasks.withType(KotlinCompile::class.java) { kotlinCompile ->
        kotlinCompile.compilerOptions {
            javaParameters.set(true)
        }
    }

    kotlinJvmExtension.target.compilations.getByName("main") {
        it.compileDependencyFiles += classGraphScalaCompile.get().outputs.files
    }

    return classGraphKotlinCompile
}
