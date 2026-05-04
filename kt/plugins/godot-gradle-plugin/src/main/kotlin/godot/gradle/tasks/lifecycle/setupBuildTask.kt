package godot.gradle.tasks

import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar
import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.api.tasks.TaskProvider
import org.gradle.jvm.tasks.Jar

fun Project.setupBuildTask(
    packageBootstrapJarTask: TaskProvider<out Task>,
    packageMainJarTask: TaskProvider<out Task>,
    packageBootstrapDexJarTask: TaskProvider<out Task>,
    packageMainDexJarTask: TaskProvider<out Task>,
    createGraalNativeImageTask: TaskProvider<out Task>,
    createIOSTask: TaskProvider<out Task>,
    generateGdIgnoreFilesTask: TaskProvider<out Task>,
    copyJarTask: TaskProvider<out Task>,
) {
    tasks
        .withType(Jar::class.java)
        .filter { jarTask -> jarTask !is ShadowJar }
        .forEach { task ->
            task.dependsOn(
                generateGdIgnoreFilesTask
            )

            task.finalizedBy(
                copyJarTask,
                packageBootstrapJarTask,
                packageMainJarTask
            )
        }

    val buildTask = tasks.named("build")

    tasks.register("buildRelease") { task ->
        task.group = "build"
        task.description = "Builds the desktop release jars."
        task.dependsOn(buildTask)
    }

    tasks.register("buildAndroid") { task ->
        task.group = "build"
        task.description = "Builds the desktop jars and Android dex artifacts."
        task.dependsOn(buildTask, packageBootstrapDexJarTask, packageMainDexJarTask)
    }

    tasks.register("buildAndroidRelease") { task ->
        task.group = "build"
        task.description = "Builds the desktop release jars and Android dex artifacts."
        task.dependsOn(buildTask, packageBootstrapDexJarTask, packageMainDexJarTask)
    }

    tasks.register("buildGraalNativeImage") { task ->
        task.group = "build"
        task.description = "Builds the desktop jars and GraalVM native image."
        task.dependsOn(buildTask, createGraalNativeImageTask)
    }

    tasks.register("buildGraalNativeImageRelease") { task ->
        task.group = "build"
        task.description = "Builds the desktop release jars and GraalVM native image."
        task.dependsOn(buildTask, createGraalNativeImageTask)
    }

    tasks.register("buildIOS") { task ->
        task.group = "build"
        task.description = "Builds the desktop jars and iOS static library."
        task.dependsOn(buildTask, createIOSTask)
    }

    tasks.register("buildIOSRelease") { task ->
        task.group = "build"
        task.description = "Builds the desktop release jars and iOS static library."
        task.dependsOn(buildTask, createIOSTask)
    }
}
