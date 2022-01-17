package godot.gradle.projectExt

import godot.gradle.tasks.android.checkAndroidJarAccessibleTask
import godot.gradle.tasks.android.checkD8ToolAccessibleTask
import godot.gradle.tasks.android.createMainDexFileTask
import godot.gradle.tasks.android.packageBootstrapDexJarTask
import godot.gradle.tasks.android.packageMainDexJarTask
import godot.gradle.tasks.createBuildLockTask
import godot.gradle.tasks.deleteBuildLockTask
import godot.gradle.tasks.generateEntryServiceFileTask
import godot.gradle.tasks.godotruntime.*
import godot.gradle.tasks.graal.checkNativeImageToolAccessibleTask
import godot.gradle.tasks.graal.checkPresenceOfDefaultGraalJniConfigTask
import godot.gradle.tasks.graal.createGraalNativeImageTask
import godot.gradle.tasks.packageBootstrapJarTask
import godot.gradle.tasks.packageMainJarTask
import godot.gradle.tasks.setupBuildTask
import godot.gradle.tasks.setupCleanTask
import org.gradle.api.Project

fun Project.setupTasks() {

    //we run this before evaluation, we want to be able to configure them in the DSL
    //any other stage, and any task configurations are going to be impossible
    //START: godot runtime specific tasks
    val godotBinaryDownloadTask = createGodotBinaryDownloadTask()

    @Suppress("UNUSED_VARIABLE")
    val godotBinarySetupTask = createGodotBinarySetupTask(
        downloadTask = godotBinaryDownloadTask.get(),
    )

    val godotEditorBinaryExecTask = createGodotEditorBinaryExecTask()

    @Suppress("UNUSED_VARIABLE")
    val godotEditorBinaryRunTask = createGodotEditorBinaryRunTask(
        execTask = godotEditorBinaryExecTask.get(),
        downloadTask = godotBinarySetupTask.get(),
    )
    //END: godot runtime specific tasks

    afterEvaluate {
        with(this) {
            val createBuildLockTask = createBuildLockTask()
            val deleteBuildLockTask = deleteBuildLockTask()
            val generateEntryServiceFileTask = generateEntryServiceFileTask()
            val packageBootstrapJarTask = packageBootstrapJarTask(
                createBuildLockTask = createBuildLockTask,
                deleteBuildLockTask = deleteBuildLockTask
            )
            val packageMainJarTask = packageMainJarTask(
                createBuildLockTask = createBuildLockTask,
                deleteBuildLockTask = deleteBuildLockTask,
                generateEntryServiceFileTask = generateEntryServiceFileTask
            )

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
            val checkPresenceOfDefaultGraalJniConfigTask = checkPresenceOfDefaultGraalJniConfigTask()
            val createGraalNativeImageTask = createGraalNativeImageTask(
                checkNativeImageToolAccessibleTask = checkNativeImageToolAccessibleTask,
                checkPresenceOfDefaultGraalJniConfigTask = checkPresenceOfDefaultGraalJniConfigTask,
                packageMainJarTask = packageMainJarTask,
                packageBootstrapJarTask = packageBootstrapJarTask
            )
            // END: graal native image specific tasks


            @Suppress("UNUSED_VARIABLE")
            val buildTask = setupBuildTask(
                createBuildLockTask = createBuildLockTask,
                packageBootstrapJarTask = packageBootstrapJarTask,
                packageMainJarTask = packageMainJarTask,
                generateEntryServiceFileTask = generateEntryServiceFileTask,
                deleteBuildLockTask = deleteBuildLockTask,
                packageBootstrapDexJarTask = packageBootstrapDexJarTask,
                packageMainDexJarTask = packageMainDexJarTask,
                createGraalNativeImageTask = createGraalNativeImageTask
            )

            @Suppress("UNUSED_VARIABLE")
            val cleanTask = setupCleanTask(
                createBuildLockTask = createBuildLockTask,
                deleteBuildLockTask = deleteBuildLockTask,
            )
            //START: godot runtime specific tasks

            //this task needs to be configured at this stage, when the configuration is ready.
            val godotBinaryExtractTask = createGodotBinaryExtractTask()
            val godotEditorPermissionTask = createGodotEditorPermissionTasks(
                extractTask= godotBinaryExtractTask.get(),
                execTask = godotEditorBinaryExecTask.get(),
                downloadTask = godotBinaryDownloadTask.get()
            )
            godotBinaryDownloadTask.get().finalizedBy(godotBinaryExtractTask)
            godotEditorBinaryExecTask.get().dependsOn(godotBinaryExtractTask)
            //godotEditorBinaryRunTask.get().dependsOn(godotBinaryExtractTask)
            //END: godot runtime specific tasks
        }
    }
}
