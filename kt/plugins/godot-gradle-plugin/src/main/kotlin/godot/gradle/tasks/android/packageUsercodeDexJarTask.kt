package godot.gradle.tasks.android

import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar
import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.api.tasks.TaskProvider

fun Project.packageUsercodeDexJarTask(
    createUsercodeDexFileTask: TaskProvider<out Task>
): TaskProvider<out Task> {
    return tasks.register("packageUsercodeDexJar", ShadowJar::class.java) {
        with(it) {
            group = "godot-kotlin-jvm"
            description =
                "Packs the android dex file of usercode, together with the needed entry service file into a jar. Needed for android builds only"

            archiveBaseName.set("usercode-dex")

            from("src/main/resources").include("**/godot.registration.Entry")
            from("${project.buildDir.absolutePath}/libs/").include("*.dex")

            dependsOn(createUsercodeDexFileTask)
        }
    }
}
