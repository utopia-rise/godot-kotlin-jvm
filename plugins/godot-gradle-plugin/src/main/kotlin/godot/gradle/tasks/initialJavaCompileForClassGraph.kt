package godot.gradle.tasks

import org.gradle.api.Project
import org.gradle.api.tasks.SourceSetContainer
import org.gradle.api.tasks.TaskProvider
import org.gradle.api.tasks.compile.JavaCompile

fun Project.initialJavaCompileForClassGraph(): TaskProvider<JavaCompile> {
    val mainSourceSet =  project.extensions
        .getByType(SourceSetContainer::class.java)
        .getByName("main")

    val classGraphJavaCompile = tasks.register("intitialForClassGraphCompileJava", JavaCompile::class.java) {
        it.source = mainSourceSet.allJava.asFileTree
        it.destinationDirectory.set(layout.buildDirectory.dir("classes/java/main"))
        it.classpath = mainSourceSet.compileClasspath
    }

    tasks.withType(JavaCompile::class.java) { javaCompile ->
        javaCompile.options.compilerArgs.add("-parameters")
    }

    return classGraphJavaCompile
}
