package godot.gradle.projectExt

import godot.gradle.tasks.android.checkAndroidJarAccessibleTask
import godot.gradle.tasks.android.checkD8ToolAccessibleTask
import godot.gradle.tasks.android.packageUsercodeDexJarTask
import godot.gradle.tasks.createBuildLockTask
import godot.gradle.tasks.deleteBuildLockTask
import godot.gradle.tasks.graal.checkNativeImageToolAccessibleTask
import godot.gradle.tasks.graal.checkPresenceOfDefaultGraalJniConfigTask
import godot.gradle.tasks.graal.createGraalNativeImageTask
import godot.gradle.tasks.packageUsercodeJarTask
import godot.gradle.tasks.setupBuildTask
import godot.gradle.tasks.setupCleanTask
import org.gradle.api.Project

fun Project.setupTasks() {
    afterEvaluate {
        with(it) {
            val createBuildLockTask = createBuildLockTask()
            val deleteBuildLockTask = deleteBuildLockTask()
            val packageUsercodeJarTask = packageUsercodeJarTask(
                createBuildLockTask = createBuildLockTask,
                deleteBuildLockTask = deleteBuildLockTask,
            )

            // START: android specific tasks
            val checkD8ToolAccessibleTask = checkD8ToolAccessibleTask()
            val checkAndroidJarAccessibleTask = checkAndroidJarAccessibleTask()
            val packageUsercodeDexJarTask = packageUsercodeDexJarTask(
                checkAndroidJarAccessibleTask = checkAndroidJarAccessibleTask,
                checkD8ToolAccessibleTask = checkD8ToolAccessibleTask,
                packageUsercodeJarTask = packageUsercodeJarTask
            )
            // END: android specific tasks

            // START: graal native image specific tasks
            val checkNativeImageToolAccessibleTask = checkNativeImageToolAccessibleTask()
            val checkPresenceOfDefaultGraalJniConfigTask = checkPresenceOfDefaultGraalJniConfigTask()
            val createGraalNativeImageTask = createGraalNativeImageTask(
                checkNativeImageToolAccessibleTask = checkNativeImageToolAccessibleTask,
                checkPresenceOfDefaultGraalJniConfigTask = checkPresenceOfDefaultGraalJniConfigTask,
                packageUsercodeJarTask = packageUsercodeJarTask,
                deleteBuildLockTask = deleteBuildLockTask
            )
            // END: graal native image specific tasks

            @Suppress("UNUSED_VARIABLE")
            val buildTask = setupBuildTask(
                createBuildLockTask = createBuildLockTask,
                packageUsercodeJarTask = packageUsercodeJarTask,
                deleteBuildLockTask = deleteBuildLockTask,
                packageUsercodeDexJarTask = packageUsercodeDexJarTask,
                createGraalNativeImageTask = createGraalNativeImageTask
            )

            @Suppress("UNUSED_VARIABLE")
            val cleanTask = setupCleanTask(
                createBuildLockTask = createBuildLockTask,
                deleteBuildLockTask = deleteBuildLockTask,
            )
        }
    }
}
