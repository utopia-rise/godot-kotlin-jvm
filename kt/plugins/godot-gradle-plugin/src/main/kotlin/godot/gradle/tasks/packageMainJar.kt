package godot.gradle.tasks

import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar
import godot.gradle.projectExt.godotApiArtifactName
import godot.gradle.projectExt.godotCoreArtifactName
import godot.gradle.projectExt.godotExtensionArtifactName
import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.api.tasks.TaskProvider

fun Project.packageMainJarTask(
    classGraphGenerationTask: TaskProvider<out Task>
): TaskProvider<out Task> {
    return tasks.named("shadowJar", ShadowJar::class.java) {
        with(it) {
            group = "godot-kotlin-jvm"
            description = "Creates a fat jar containing game code and all dependencies of it"

            archiveBaseName.set("main")
            archiveVersion.set("")
            archiveClassifier.set("")

            dependsOn(classGraphGenerationTask)

            // merges all service files from all dependencies into on
            // needed so we can loop over and load all entry files from within Bootstrap.kt
            mergeServiceFiles()

            dependencies { dependencyFilter ->
                dependencyFilter.exclude(dependencyFilter.dependency("org.jetbrains.kotlin:kotlin-stdlib.*"))
                dependencyFilter.exclude(dependencyFilter.dependency("com.utopia-rise:$godotCoreArtifactName:.*"))
                dependencyFilter.exclude(dependencyFilter.dependency("com.utopia-rise:$godotApiArtifactName:.*"))
                dependencyFilter.exclude(dependencyFilter.dependency("com.utopia-rise:$godotExtensionArtifactName:.*"))
            }
        }
    }
}
