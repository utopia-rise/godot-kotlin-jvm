package godot.gradle.tasks

import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar
import godot.gradle.projectExt.godotLibraryArtifactName
import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.api.tasks.TaskProvider

fun Project.packageMainJarTask(
    createBuildLockTask: TaskProvider<out Task>,
    deleteBuildLockTask: TaskProvider<out Task>,
): TaskProvider<out Task> {
    return tasks.named("shadowJar", ShadowJar::class.java) {
        with(it) {
            group = "godot-kotlin-jvm"
            description = "Creates a fat jar containing game code and all dependencies of it"

            archiveBaseName.set("main")
            archiveVersion.set("")
            archiveClassifier.set("")

            // merges all service files from all dependencies into on
            // needed so we can loop over and load all entry files from within Bootstrap.kt
            mergeServiceFiles()

            dependencies {
                it.exclude(it.dependency("org.jetbrains.kotlin:kotlin-stdlib.*"))
                it.exclude(it.dependency("com.utopia-rise:$godotLibraryArtifactName:.*"))
            }

            dependsOn(
                createBuildLockTask,
            )
            finalizedBy(deleteBuildLockTask)
        }
    }
}
