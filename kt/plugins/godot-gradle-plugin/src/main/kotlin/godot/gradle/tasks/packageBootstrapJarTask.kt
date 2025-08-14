package godot.gradle.tasks

import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar
import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.api.tasks.TaskProvider

fun Project.packageBootstrapJarTask(): TaskProvider<out Task> {
    return tasks.register("packageBootstrapJar", ShadowJar::class.java) {
        with(it) {
            group = "godot-kotlin-jvm"
            description = "Creates a fat jar containing everything needed to load and run the main.jar"

            archiveBaseName.set("godot-bootstrap")
            configurations.add(this@packageBootstrapJarTask.configurations.getByName("bootstrap"))
            archiveVersion.set("") // otherwise the version is appended to the name and our export plugin cannot find it anymore
        }
    }
}
