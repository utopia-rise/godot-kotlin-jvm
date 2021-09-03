package godot.gradle.tasks

import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar
import org.gradle.api.Project
import org.gradle.api.Task

fun Project.packageMainJarTask(
    createBuildLockTask: Task,
    deleteBuildLockTask: Task,
    generateEntryServiceFileTask: Task
): Task {
    return with(tasks.named("shadowJar", ShadowJar::class.java).get()) {
        group = "godot-kotlin-jvm"
        description = "Creates a fat jar containing game code and all dependencies of it"

        archiveBaseName.set("main")
        archiveVersion.set("")
        archiveClassifier.set("")

        dependencies {
            it.exclude(it.dependency("org.jetbrains.kotlin:kotlin-stdlib.*"))
            it.exclude(it.dependency("com.utopia-rise:godot-library:.*"))
        }

        dependsOn(
            createBuildLockTask,
            generateEntryServiceFileTask
        )
        finalizedBy(deleteBuildLockTask)
    }
}
