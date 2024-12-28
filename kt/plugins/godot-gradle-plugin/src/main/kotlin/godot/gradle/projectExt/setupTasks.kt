package godot.gradle.projectExt

import godot.gradle.tasks.android.checkAndroidJarAccessibleTask
import godot.gradle.tasks.android.checkD8ToolAccessibleTask
import godot.gradle.tasks.android.createMainDexFileTask
import godot.gradle.tasks.android.packageBootstrapDexJarTask
import godot.gradle.tasks.android.packageMainDexJarTask
import godot.gradle.tasks.classGraphSymbolsProcess
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
import godot.gradle.tasks.setupAfterIdeaSyncTasks
import godot.gradle.tasks.setupBuildTask
import godot.gradle.tasks.setupCleanTask
import org.gradle.api.Project
import org.gradle.api.tasks.compile.JavaCompile
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

fun Project.setupTasks() {
    afterEvaluate {
        with(it) {
            tasks.withType(JavaCompile::class.java) { javaCompile ->
                javaCompile.options.compilerArgs.add("-parameters")
            }

            tasks.withType(KotlinCompile::class.java) { kotlinCompile ->
                kotlinCompile.compilerOptions {
                    javaParameters.set(true)
                }
            }

            val packageBootstrapJarTask = packageBootstrapJarTask()
            val packageMainJarTask = packageMainJarTask()
            val generateGdIgnoreFilesTask = generateGdIgnoreFilesTask()

            classGraphSymbolsProcess(packageMainJarTask)

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
