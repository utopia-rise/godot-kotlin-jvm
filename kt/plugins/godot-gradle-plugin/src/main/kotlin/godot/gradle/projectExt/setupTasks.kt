package godot.gradle.projectExt

import godot.gradle.tasks.GenerateEmbeddedJreTask
import godot.gradle.tasks.android.checkAndroidJarAccessibleTask
import godot.gradle.tasks.android.checkD8ToolAccessibleTask
import godot.gradle.tasks.android.createBootstrapDexJarTask
import godot.gradle.tasks.android.createMainDexFileTask
import godot.gradle.tasks.android.packageBootstrapDexJarTask
import godot.gradle.tasks.android.packageMainDexJarTask
import godot.gradle.tasks.classGraphGenerateEntryFilesTask
import godot.gradle.tasks.classGraphGeneratedEntryJarTask
import godot.gradle.tasks.classGraphUpdateRegistrationFilesTask
import godot.gradle.tasks.createCopyJarsTask
import godot.gradle.tasks.generateGdIgnoreFilesTask
import godot.gradle.tasks.graal.checkNativeImageToolAccessibleTask
import godot.gradle.tasks.graal.copyDefaultGraalJniConfigTask
import godot.gradle.tasks.graal.createGraalNativeImageTask
import godot.gradle.tasks.graal.ios.copyDefaultGraalIOSConfigsTask
import godot.gradle.tasks.graal.ios.createIOSGraalNativeImageTask
import godot.gradle.tasks.graal.ios.createIOSStaticLibraryTask
import godot.gradle.tasks.graal.ios.downloadIOSCapCacheFiles
import godot.gradle.tasks.graal.ios.downloadIOSJdkStaticLibraries
import godot.gradle.tasks.packageBootstrapJarTask
import godot.gradle.tasks.packageMainJarTask
import godot.gradle.tasks.packageUserJarTask
import godot.gradle.tasks.setupBuildTask
import godot.gradle.tasks.setupCleanTask
import org.gradle.api.Project

fun Project.setupTasks() {
    tasks.register("generateEmbeddedJre", GenerateEmbeddedJreTask::class.java) { task ->
        task.group = "godot-kotlin-jvm"
        task.description = "Generates an embedded jre using jlink"
    }

    afterEvaluate {
        with(it) {
            val classesTask = tasks.named("classes")

            // Step 1: package the first user-code artifact, scan it to generate entry files and staged .gdj files, then sync .gdj files.
            val packageUserJarTask = packageUserJarTask(
                userClassesTask = classesTask,
            )
            val generateEntryFilesTask = classGraphGenerateEntryFilesTask(
                packageUserJarTask = packageUserJarTask,
            )
            val updateRegistrationFilesTask = classGraphUpdateRegistrationFilesTask(
                generateEntryFilesTask = generateEntryFilesTask,
            )
            val generatedEntryJarTask = classGraphGeneratedEntryJarTask(
                generateEntryFilesTask = generateEntryFilesTask,
            )

            // Step 2: package the two runtime jars.
            val packageBootstrapJarTask = packageBootstrapJarTask()
            val packageMainJarTask = packageMainJarTask(
                generatedEntryJarTask = generatedEntryJarTask,
                updateRegistrationFilesTask = updateRegistrationFilesTask,
                userClassesTask = classesTask,
            )

            // Step 3: project housekeeping around the packaged jars.
            val generateGdIgnoreFilesTask = generateGdIgnoreFilesTask()
            val copyJarTask = createCopyJarsTask(
                packageBootstrapJarTask = packageBootstrapJarTask,
                packageMainJarTask = packageMainJarTask,
            )

            // Step 4: optional Android packaging derives from bootstrap.jar and main.jar.
            val checkD8ToolAccessibleTask = checkD8ToolAccessibleTask()
            val checkAndroidJarAccessibleTask = checkAndroidJarAccessibleTask()
            val createBootstrapDexJarTask = createBootstrapDexJarTask(
                checkAndroidJarAccessibleTask = checkAndroidJarAccessibleTask,
                checkD8ToolAccessibleTask = checkD8ToolAccessibleTask,
                packageBootstrapJarTask = packageBootstrapJarTask,
            )
            val packageBootstrapDexJarTask = packageBootstrapDexJarTask(
                createBootstrapDexJarTask = createBootstrapDexJarTask,
            )
            val createMainDexFileTask = createMainDexFileTask(
                checkAndroidJarAccessibleTask = checkAndroidJarAccessibleTask,
                checkD8ToolAccessibleTask = checkD8ToolAccessibleTask,
                packageBootstrapDexJarTask = packageBootstrapDexJarTask,
                packageMainJarTask = packageMainJarTask,
            )
            val packageMainDexJarTask = packageMainDexJarTask(
                createMainDexFileTask = createMainDexFileTask
            )

            // Step 5: optional Graal packaging also derives from bootstrap.jar and main.jar.
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

            // Step 6: wire the lifecycle tasks that users actually call.
            setupBuildTask(
                packageBootstrapJarTask = packageBootstrapJarTask,
                packageMainJarTask = packageMainJarTask,
                packageBootstrapDexJarTask = packageBootstrapDexJarTask,
                packageMainDexJarTask = packageMainDexJarTask,
                createGraalNativeImageTask = createGraalNativeImageTask,
                createIOSTask = createIOSStaticLibraryTask,
                generateGdIgnoreFilesTask = generateGdIgnoreFilesTask,
                copyJarTask = copyJarTask,
            )

            setupCleanTask(
                generateGdIgnoreFilesTask = generateGdIgnoreFilesTask,
            )
        }
    }
}
