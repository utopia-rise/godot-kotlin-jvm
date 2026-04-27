package godot.gradle.tasks

import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.api.tasks.SourceSetContainer
import org.gradle.api.tasks.TaskProvider
import org.gradle.api.tasks.bundling.Jar

fun Project.packageUserJarTask(
    userClassesTask: TaskProvider<out Task>,
): TaskProvider<Jar> {
    val mainSourceSet = extensions
        .getByType(SourceSetContainer::class.java)
        .getByName("main")

    return tasks.register("packageUserJar", Jar::class.java) { task ->
        task.group = "godot-kotlin-jvm-internal"
        task.description = "Packages compiled user classes and resources into the intermediary jar used for ClassGraph scanning."

        task.archiveBaseName.set("user")
        task.archiveVersion.set("")
        task.archiveClassifier.set("")

        task.dependsOn(userClassesTask)
        task.from(mainSourceSet.output)
    }
}
