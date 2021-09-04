package godot.gradle.tasks.graal

import godot.gradle.GodotExtension
import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.api.tasks.TaskProvider
import org.jetbrains.kotlin.gradle.internal.ensureParentDirsCreated
import java.io.InputStream

fun Project.checkPresenceOfDefaultGraalJniConfigTask(): TaskProvider<out Task> {
    return tasks.register("createDefaultGraalJniConfigIfNotPresent") {
        with(it) {
            group = "godot-kotlin-jvm"
            description =
                "Checks if the default jni config for graalVM native image is present and creates it if it's not"

            doLast {
                val godotKotlinJniConfig = projectDir.resolve("graal").resolve("godot-kotlin-graal-jni-config.json")
                if (!godotKotlinJniConfig.exists()) {
                    val jniConfigContent =
                        GodotExtension::class.java.getResource("godot-kotlin-graal-jni-config.json")?.content
                    require(jniConfigContent is InputStream)
                    godotKotlinJniConfig.ensureParentDirsCreated()
                    godotKotlinJniConfig.createNewFile()
                    godotKotlinJniConfig.writeBytes(jniConfigContent.readAllBytes())
                }
            }
        }
    }
}
