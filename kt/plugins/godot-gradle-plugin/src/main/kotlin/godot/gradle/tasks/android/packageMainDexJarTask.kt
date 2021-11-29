package godot.gradle.tasks.android

import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar
import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.api.tasks.TaskProvider

fun Project.packageMainDexJarTask(
    createMainDexFileTask: TaskProvider<out Task>
): TaskProvider<out Task> {
    return tasks.register("packageMainDexJar", ShadowJar::class.java) {
        with(it) {
            group = "godot-kotlin-jvm"
            description =
                "Packs the android dex file of main, together with the needed entry service file into a jar. Needed for android builds only"

            archiveBaseName.set("main-dex")

            from("src/main/resources").include("**/godot.runtime.Entry")
            from("${project.buildDir.absolutePath}/libs/").include("*.dex")

            dependsOn(createMainDexFileTask)
        }
    }
}
