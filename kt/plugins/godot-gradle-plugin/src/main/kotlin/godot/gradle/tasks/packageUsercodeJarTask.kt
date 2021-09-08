package godot.gradle.tasks

import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar
import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.api.tasks.TaskProvider

fun Project.packageUsercodeJarTask(
    createBuildLockTask: TaskProvider<out Task>,
    deleteBuildLockTask: TaskProvider<out Task>
): TaskProvider<out Task> {
    return tasks.named("shadowJar", ShadowJar::class.java) {
        with(it) {
            group = "godot-kotlin-jvm"
            description = "Creates a fat jar containing game code and all dependencies of it"

            archiveBaseName.set("usercode")
            archiveVersion.set("")
            archiveClassifier.set("")

            dependsOn(
                createBuildLockTask
            )
            finalizedBy(deleteBuildLockTask)
        }
    }
}
