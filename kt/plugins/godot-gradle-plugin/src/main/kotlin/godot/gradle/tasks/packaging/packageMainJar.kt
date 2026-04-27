package godot.gradle.tasks

import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar
import godot.gradle.projectExt.godotApiArtifactName
import godot.gradle.projectExt.godotBootstrapArtifactName
import godot.gradle.projectExt.godotCoreArtifactName
import godot.gradle.projectExt.godotExtensionArtifactName
import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.api.tasks.TaskProvider
import org.gradle.api.tasks.bundling.Jar

fun Project.packageMainJarTask(
    generatedEntryJarTask: TaskProvider<Jar>,
    updateRegistrationFilesTask: TaskProvider<out Task>,
    userClassesTask: TaskProvider<out Task>,
): TaskProvider<out Task> {
    return tasks.named("shadowJar", ShadowJar::class.java) {
        with(it) {
            group = "godot-kotlin-jvm"
            description = "Creates a fat jar containing game code and all dependencies of it"

            archiveBaseName.set("main")
            archiveVersion.set("")
            archiveClassifier.set("")

            dependsOn(userClassesTask)
            dependsOn(generatedEntryJarTask)
            dependsOn(updateRegistrationFilesTask)
            from(generatedEntryJarTask.map { generatedJar ->
                zipTree(generatedJar.archiveFile)
            }) {
                exclude("META-INF/MANIFEST.MF")
            }

            // merges all service files from all dependencies into on
            // needed so we can loop over and load all entry files from within Bootstrap.kt
            mergeServiceFiles()

            dependencies { dependencyFilter ->
                dependencyFilter.exclude(dependencyFilter.dependency("org.jetbrains.kotlin:kotlin-stdlib.*"))
                dependencyFilter.exclude(dependencyFilter.dependency("com.utopia-rise:$godotCoreArtifactName:.*"))
                dependencyFilter.exclude(dependencyFilter.dependency("com.utopia-rise:$godotApiArtifactName:.*"))
                dependencyFilter.exclude(dependencyFilter.dependency("com.utopia-rise:$godotBootstrapArtifactName:.*"))
                dependencyFilter.exclude(dependencyFilter.dependency("com.utopia-rise:$godotExtensionArtifactName:.*"))
            }
        }
    }
}
