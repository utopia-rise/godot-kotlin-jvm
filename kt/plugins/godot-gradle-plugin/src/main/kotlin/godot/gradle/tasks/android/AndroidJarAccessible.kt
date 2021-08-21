package godot.gradle.tasks.android

import godot.gradle.ext.godotJvmExtension
import godot.gradle.tasks.GodotJvmTask
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

open class AndroidJarAccessible : DefaultTask(), GodotJvmTask {

    override fun setup() {
        group = "godot-kotlin-jvm"
        description = "Checks if the android.jar is present in the provided androidCompileSdkDir. Needed for android builds only"
    }

    @TaskAction
    fun execute() {
        val androidSdkDir = project
            .godotJvmExtension
            .androidCompileSdkDir

        when {
            androidSdkDir == null -> throw IllegalArgumentException("androidCompileSdkDir not set. Make sure you've either set the ANDROID_SDK_ROOT environment variable or set the androidCompileSdkDir. For more information, visit: https://godot-kotl.in/en/stable/user-guide/exporting/#android")
            !androidSdkDir.isDirectory -> throw IllegalArgumentException("the androidCompileSdkDir you provided is not a directory")
            else -> {
                val content = androidSdkDir.listFiles()
                if (content == null || content.none { it.name == "android.jar" }) {
                    throw IllegalArgumentException("the androidCompileSdkDir you provided does not contain the necessary android.jar file. Check your android sdk setup. Found files: ${content?.joinToString { it.name }}\nFor more information, visit: https://godot-kotl.in/en/stable/user-guide/exporting/#android")
                }
            }
        }
    }
}
