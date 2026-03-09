package godot.gradle.projectExt

import godot.gradle.tasks.GenerateEmbeddedJreTask
import godot.gradle.tasks.android.checkAndroidJarAccessibleTask
import godot.gradle.tasks.android.checkD8ToolAccessibleTask
import godot.gradle.tasks.android.createBootstrapDexJarTask
import godot.gradle.tasks.android.createMainDexFileTask
import godot.gradle.tasks.android.packageBootstrapDexJarTask
import godot.gradle.tasks.android.packageMainDexJarTask
import godot.gradle.tasks.classGraphSymbolsProcess
import godot.gradle.tasks.createCopyJarsTask
import godot.gradle.tasks.deleteClassGraphGeneratedSourceTask
import godot.gradle.tasks.generateGdIgnoreFilesTask
import godot.gradle.tasks.graal.checkNativeImageToolAccessibleTask
import godot.gradle.tasks.graal.copyDefaultGraalJniConfigTask
import godot.gradle.tasks.graal.createGraalNativeImageTask
import godot.gradle.tasks.graal.ios.copyDefaultGraalIOSConfigsTask
import godot.gradle.tasks.graal.ios.createIOSGraalNativeImageTask
import godot.gradle.tasks.graal.ios.createIOSStaticLibraryTask
import godot.gradle.tasks.graal.ios.downloadIOSCapCacheFiles
import godot.gradle.tasks.graal.ios.downloadIOSJdkStaticLibraries
import godot.gradle.tasks.initialJavaCompileForClassGraph
import godot.gradle.tasks.initialKotlinCompileForClassGraph
import godot.gradle.tasks.initialScalaCompileForClassGraph
import godot.gradle.tasks.packageBootstrapJarTask
import godot.gradle.tasks.packageMainJarTask
import godot.gradle.tasks.setupAfterIdeaSyncTasks
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
            val classGraphScalaCompile = initialScalaCompileForClassGraph()
            val classGraphJavaCompile = initialJavaCompileForClassGraph()
            val classGraphKotlinCompile = initialKotlinCompileForClassGraph(
                classGraphScalaCompile,
                classGraphJavaCompile
            )

            val deleteClassGraphGeneratedTask = deleteClassGraphGeneratedSourceTask()

            val classGraphGenerationTask = classGraphSymbolsProcess(
                classGraphKotlinCompile,
                deleteClassGraphGeneratedTask
            )

            val packageBootstrapJarTask = packageBootstrapJarTask()
            val packageMainJarTask = packageMainJarTask(classGraphGenerationTask = classGraphGenerationTask)
            val generateGdIgnoreFilesTask = generateGdIgnoreFilesTask()

            // START: android specific tasks
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

            val copyJarTask = createCopyJarsTask(
                packageBootstrapJarTask = packageBootstrapJarTask,
                packageMainJarTask = packageMainJarTask,
            )

            @Suppress("UNUSED_VARIABLE")
            val buildTask = setupBuildTask(
                packageBootstrapJarTask = packageBootstrapJarTask,
                packageMainJarTask = packageMainJarTask,
                packageBootstrapDexJarTask = packageBootstrapDexJarTask,
                packageMainDexJarTask = packageMainDexJarTask,
                createGraalNativeImageTask = createGraalNativeImageTask,
                createIOSTask = createIOSStaticLibraryTask,
                generateGdIgnoreFilesTask = generateGdIgnoreFilesTask,
                copyJarTask = copyJarTask,
            )

            @Suppress("UNUSED_VARIABLE")
            val cleanTask = setupCleanTask(
                generateGdIgnoreFilesTask = generateGdIgnoreFilesTask,
            )

            setupAfterIdeaSyncTasks(
                generateGdIgnoreFilesTask = generateGdIgnoreFilesTask,
            )
        }
    }
}
