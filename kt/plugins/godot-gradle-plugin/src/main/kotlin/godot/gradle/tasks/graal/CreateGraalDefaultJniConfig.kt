package godot.gradle.tasks.graal

import godot.gradle.GodotExtension
import godot.gradle.tasks.GodotJvmTask
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction
import org.jetbrains.kotlin.gradle.internal.ensureParentDirsCreated
import java.io.InputStream

open class CreateGraalDefaultJniConfig: DefaultTask(), GodotJvmTask {

    override fun setup() {
        group = "godot-kotlin-jvm"
        description = "Checks if the default jni config for Godot Kotlin with graalVM native image is present"
    }

    @TaskAction
    fun execute() {
        val godotKotlinJniConfig = project.projectDir.resolve("graal").resolve("godot-kotlin-graal-jni-config.json")
        if (!godotKotlinJniConfig.exists()) {
            val jniConfigContent = GodotExtension::class.java.getResource("godot-kotlin-graal-jni-config.json")?.content
            require(jniConfigContent is InputStream)
            godotKotlinJniConfig.ensureParentDirsCreated()
            godotKotlinJniConfig.createNewFile()
            godotKotlinJniConfig.writeBytes(jniConfigContent.readAllBytes())
        }
    }
}
