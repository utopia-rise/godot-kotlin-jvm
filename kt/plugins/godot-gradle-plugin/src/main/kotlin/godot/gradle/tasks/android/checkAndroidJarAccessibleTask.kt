package godot.gradle.tasks.android

import godot.gradle.projectExt.godotJvmExtension
import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.api.tasks.TaskProvider

fun Project.checkAndroidJarAccessibleTask(): TaskProvider<Task> {
    return tasks.register("checkAndroidJarAccessible") {
        with(it) {
            group = "godot-kotlin-jvm"
            description =
                "Checks if the android.jar is present in the provided androidCompileSdkDirectory. Needed for android builds only"

            doLast {
                val androidSdkDir = godotJvmExtension.androidCompileSdkDirectory.orNull?.asFile

                when {
                    androidSdkDir == null -> throw IllegalArgumentException("androidCompileSdkDirectory not set. Make sure you've either set the ANDROID_SDK_ROOT environment variable or set the androidCompileSdkDirectory. For more information, visit: https://godot-kotl.in/en/stable/user-guide/exporting/#android")
                    !androidSdkDir.isDirectory -> throw IllegalArgumentException("the androidCompileSdkDirectory you provided is not a directory")
                    else -> {
                        val content = androidSdkDir.listFiles()
                        if (content == null || content.none { it.name == "android.jar" }) {
                            throw IllegalArgumentException("the androidCompileSdkDirectory you provided does not contain the necessary android.jar file. Check your Android SDK setup. Found files: ${content?.joinToString { it.name }}\nFor more information, visit: https://godot-kotl.in/en/stable/user-guide/exporting/#android")
                        }
                    }
                }
            }
        }
    }
}
