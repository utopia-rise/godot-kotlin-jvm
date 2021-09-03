package godot.gradle.tasks.android

import godot.gradle.projectExt.godotJvmExtension
import org.gradle.api.Project
import org.gradle.api.Task

fun Project.checkAndroidJarAccessibleTask(): Task {
    return with(tasks.create("checkAndroidJarAccessible")) {
        group = "godot-kotlin-jvm"
        description =
            "Checks if the android.jar is present in the provided androidCompileSdkDir. Needed for android builds only"

        doLast {
            val androidSdkDir = godotJvmExtension.androidCompileSdkDir.orNull?.asFile

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
}
