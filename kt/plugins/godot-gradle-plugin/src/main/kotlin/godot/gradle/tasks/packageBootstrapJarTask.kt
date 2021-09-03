package godot.gradle.tasks

import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar
import org.gradle.api.Project
import org.gradle.api.Task

fun Project.packageBootstrapJarTask(createBuildLockTask: Task, deleteBuildLockTask: Task): Task {
    return with(tasks.create("packageBootstrapJar", ShadowJar::class.java)) {
        group = "godot-kotlin-jvm"
        description = "Creates a fat jar containing everything needed to load and run the main.jar"

        archiveBaseName.set("godot-bootstrap")
        configurations.clear()
        configurations.add(this@packageBootstrapJarTask.configurations.getByName("bootstrap"))

        dependsOn(createBuildLockTask)
        finalizedBy(deleteBuildLockTask)
    }
}
