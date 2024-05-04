package godot.gradle.projectExt

import godot.gradle.tasks.android.checkAndroidJarAccessibleTask
import godot.gradle.tasks.android.checkD8ToolAccessibleTask
import godot.gradle.tasks.android.createMainDexFileTask
import godot.gradle.tasks.android.packageBootstrapDexJarTask
import godot.gradle.tasks.android.packageMainDexJarTask
import godot.gradle.tasks.createBuildLockTask
import godot.gradle.tasks.deleteBuildLockTask
import godot.gradle.tasks.generateGdIgnoreFilesTask
import godot.gradle.tasks.graal.*
import godot.gradle.tasks.graal.ios.*
import godot.gradle.tasks.packageBootstrapJarTask
import godot.gradle.tasks.packageMainJarTask
import godot.gradle.tasks.setupBuildTask
import godot.gradle.tasks.setupCleanTask
import godot.gradle.tasks.setupAfterIdeaSyncTasks
import org.gradle.api.Project

fun Project.setupTasks() {
    afterEvaluate {
        with(it) {
            val createBuildLockTask = createBuildLockTask()
            val deleteBuildLockTask = deleteBuildLockTask()
            val packageBootstrapJarTask = packageBootstrapJarTask(
                createBuildLockTask = createBuildLockTask,
                deleteBuildLockTask = deleteBuildLockTask
            )
            val packageMainJarTask = packageMainJarTask(
                createBuildLockTask = createBuildLockTask,
                deleteBuildLockTask = deleteBuildLockTask
            )
            val generateGdIgnoreFilesTask = generateGdIgnoreFilesTask()

            // START: android specific tasks
            val checkD8ToolAccessibleTask = checkD8ToolAccessibleTask()
            val checkAndroidJarAccessibleTask = checkAndroidJarAccessibleTask()
            val packageBootstrapDexJarTask = packageBootstrapDexJarTask(
                checkAndroidJarAccessibleTask = checkAndroidJarAccessibleTask,
                checkD8ToolAccessibleTask = checkD8ToolAccessibleTask,
                packageBootstrapJarTask = packageBootstrapJarTask
            )
            val createMainDexFileTask = createMainDexFileTask(
                checkAndroidJarAccessibleTask = checkAndroidJarAccessibleTask,
                checkD8ToolAccessibleTask = checkD8ToolAccessibleTask,
                packageBootstrapDexJarTask = packageBootstrapDexJarTask,
                packageMainJarTask = packageMainJarTask
            )
            val packageMainDexJarTask = packageMainDexJarTask(
                createMainDexFileTask = createMainDexFileTask
            )
            // END: android specific tasks

            // START: graal native image specific tasks
            val checkNativeImageToolAccessibleTask = checkNativeImageToolAccessibleTask()
            val copyDefaultGraalJniConfigTask = copyDefaultGraalJniConfigTask()
            val copyDefaultGraalIOSConfigsTask = copyDefaultGraalIOSConfigsTask(
                copyDefaultGraalJniConfigTask
            )
            val createGraalNativeImageTask = createGraalNativeImageTask(
                checkNativeImageToolAccessibleTask = checkNativeImageToolAccessibleTask,
                checkPresenceOfDefaultGraalJniConfigTask = copyDefaultGraalJniConfigTask,
                packageMainJarTask = packageMainJarTask,
                packageBootstrapJarTask = packageBootstrapJarTask
            )
            val createIOSGraalNativeImageTask = createIOSGraalNativeImageTask(
                checkNativeImageToolAccessibleTask = checkNativeImageToolAccessibleTask,
                copyDefaultGraalIOSConfigsTask = copyDefaultGraalIOSConfigsTask,
                downloadIOSCapCacheTask = downloadIOSCapCacheFiles(),
                packageMainJarTask = packageMainJarTask,
                packageBootstrapJarTask = packageBootstrapJarTask
            )
            val createIOSStaticLibraryTask = createIOSStaticLibraryTask(
                downloadStaticJdkLibrariesTask = downloadIOSJdkStaticLibraries(),
                createIOSGraalNativeImageTask = createIOSGraalNativeImageTask
            )
            // END: graal native image specific tasks

            @Suppress("UNUSED_VARIABLE")
            val buildTask = setupBuildTask(
                createBuildLockTask = createBuildLockTask,
                packageBootstrapJarTask = packageBootstrapJarTask,
                packageMainJarTask = packageMainJarTask,
                deleteBuildLockTask = deleteBuildLockTask,
                packageBootstrapDexJarTask = packageBootstrapDexJarTask,
                packageMainDexJarTask = packageMainDexJarTask,
                createGraalNativeImageTask = createGraalNativeImageTask,
                createIOSTask = createIOSStaticLibraryTask,
                generateGdIgnoreFilesTask = generateGdIgnoreFilesTask,
            )

            @Suppress("UNUSED_VARIABLE")
            val cleanTask = setupCleanTask(
                createBuildLockTask = createBuildLockTask,
                deleteBuildLockTask = deleteBuildLockTask,
                generateGdIgnoreFilesTask = generateGdIgnoreFilesTask,
            )

            setupAfterIdeaSyncTasks(
                generateGdIgnoreFilesTask = generateGdIgnoreFilesTask
            )
        }
    }
}
