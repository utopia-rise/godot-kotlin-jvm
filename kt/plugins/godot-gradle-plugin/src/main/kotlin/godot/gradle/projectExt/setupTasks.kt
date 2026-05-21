package godot.gradle.projectExt

import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar
import godot.gradle.tasks.GenerateEmbeddedJreTask
import godot.gradle.tasks.android.checkAndroidJarAccessibleTask
import godot.gradle.tasks.android.checkD8ToolAccessibleTask
import godot.gradle.tasks.android.createBootstrapDexJarTask
import godot.gradle.tasks.android.createMainDexFileTask
import godot.gradle.tasks.android.packageMainDexJarTask
import godot.gradle.tasks.createCopyAndroidArtifactsTask
import godot.gradle.tasks.createCopyDesktopJarsTask
import godot.gradle.tasks.createCopyGraalArtifactsTask
import godot.gradle.tasks.createCopyIOSArtifactsTask
import godot.gradle.tasks.entryGenerationGenerateFilesTask
import godot.gradle.tasks.entryGenerationJarTask
import godot.gradle.tasks.entryGenerationSyncRegistrationFilesTask
import godot.gradle.tasks.entry_generation.entryGenerationIndexExistingRegistrationFilesTask
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
import godot.tools.common.constants.godotRegistrationPackage
import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.api.tasks.TaskProvider
import org.gradle.jvm.tasks.Jar
import org.gradle.api.tasks.SourceSetContainer

private const val legacyEntryServiceRelativePath = "META-INF/services/$godotRegistrationPackage.Entry"

fun Project.setupTasks() {
    tasks.register("generateEmbeddedJre", GenerateEmbeddedJreTask::class.java) { task ->
        task.group = "godot-kotlin-jvm"
        task.description = "Generates an embedded jre using jlink"
    }

    afterEvaluate {
        with(it) {
            if (godotJvmExtension.isLibrary.get()) {
                tasks.named("jar", Jar::class.java) { jarTask ->
                    jarTask.group = "godot-kotlin-jvm"
                    jarTask.description = "Builds the reusable Godot Kotlin/JVM library jar."
                    jarTask.archiveBaseName.set(project.name)
                    jarTask.archiveVersion.set("")
                    jarTask.archiveClassifier.set("")
                }
                return@with
            }

            configureLegacyEntryServiceMigration()

            val classesTask = tasks.named("classes")

            // Step 1: package the first user-code artifact, scan it to generate entry files and staged .gdj files, then sync .gdj files.
            val packageUserJarTask = packageUserJarTask(
                userClassesTask = classesTask,
            )
            val generateEntryFilesTask = entryGenerationGenerateFilesTask(
                packageUserJarTask = packageUserJarTask,
            )
            val indexExistingRegistrationFilesTask = entryGenerationIndexExistingRegistrationFilesTask()
            val updateRegistrationFilesTask = entryGenerationSyncRegistrationFilesTask(
                generateEntryFilesTask = generateEntryFilesTask,
                indexExistingRegistrationFilesTask = indexExistingRegistrationFilesTask,
            )
            val generatedEntryJarTask = entryGenerationJarTask(
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
            // Step 4: optional Android packaging derives from bootstrap.jar and main.jar.
            val checkD8ToolAccessibleTask = checkD8ToolAccessibleTask()
            val checkAndroidJarAccessibleTask = checkAndroidJarAccessibleTask()
            val createBootstrapDexJarTask = createBootstrapDexJarTask(
                checkAndroidJarAccessibleTask = checkAndroidJarAccessibleTask,
                checkD8ToolAccessibleTask = checkD8ToolAccessibleTask,
                packageBootstrapJarTask = packageBootstrapJarTask,
            )
            val createMainDexFileTask = createMainDexFileTask(
                checkAndroidJarAccessibleTask = checkAndroidJarAccessibleTask,
                checkD8ToolAccessibleTask = checkD8ToolAccessibleTask,
                createBootstrapDexJarTask = createBootstrapDexJarTask,
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

            val copyDesktopJarsTask = createCopyDesktopJarsTask(
                packageBootstrapJarTask = packageBootstrapJarTask,
                packageMainJarTask = packageMainJarTask,
            )
            val copyAndroidArtifactsTask = createCopyAndroidArtifactsTask(
                createBootstrapDexJarTask = createBootstrapDexJarTask,
                packageMainDexJarTask = packageMainDexJarTask,
            )
            val copyGraalArtifactsTask = createCopyGraalArtifactsTask(
                createGraalNativeImageTask = createGraalNativeImageTask,
            )
            val copyIOSArtifactsTask = createCopyIOSArtifactsTask(
                createIOSTask = createIOSStaticLibraryTask,
            )

            // Step 6: wire the lifecycle tasks that users actually call.
            setupBuildLifecycleTasks(
                packageBootstrapJarTask = packageBootstrapJarTask,
                packageMainJarTask = packageMainJarTask,
                createBootstrapDexJarTask = createBootstrapDexJarTask,
                packageMainDexJarTask = packageMainDexJarTask,
                createGraalNativeImageTask = createGraalNativeImageTask,
                createIOSTask = createIOSStaticLibraryTask,
                generateGdIgnoreFilesTask = generateGdIgnoreFilesTask,
                copyDesktopJarsTask = copyDesktopJarsTask,
                copyAndroidArtifactsTask = copyAndroidArtifactsTask,
                copyGraalArtifactsTask = copyGraalArtifactsTask,
                copyIOSArtifactsTask = copyIOSArtifactsTask,
            )

            setupCleanLifecycleTasks(
                generateGdIgnoreFilesTask = generateGdIgnoreFilesTask,
            )
        }
    }
}

private fun Project.configureLegacyEntryServiceMigration() {
    val mainSourceSet = extensions
        .getByType(SourceSetContainer::class.java)
        .getByName("main")

    mainSourceSet.resources.exclude(legacyEntryServiceRelativePath)

    val legacyServiceFile = file("src/main/resources/$legacyEntryServiceRelativePath")
    if (legacyServiceFile.isFile) {
        logger.warn(
            "Legacy service file detected at ${legacyServiceFile.relativeTo(projectDir).invariantSeparatorsPath}. " +
                "It is now ignored because Entry metadata is generated under build/. " +
                "You can safely delete the legacy file from src/main/resources."
        )
    }
}

private fun Project.setupBuildLifecycleTasks(
    packageBootstrapJarTask: TaskProvider<out Task>,
    packageMainJarTask: TaskProvider<out Task>,
    createBootstrapDexJarTask: TaskProvider<out Task>,
    packageMainDexJarTask: TaskProvider<out Task>,
    createGraalNativeImageTask: TaskProvider<out Task>,
    createIOSTask: TaskProvider<out Task>,
    generateGdIgnoreFilesTask: TaskProvider<out Task>,
    copyDesktopJarsTask: TaskProvider<out Task>,
    copyAndroidArtifactsTask: TaskProvider<out Task>,
    copyGraalArtifactsTask: TaskProvider<out Task>,
    copyIOSArtifactsTask: TaskProvider<out Task>,
) {
    tasks
        .withType(Jar::class.java)
        .filter { jarTask -> jarTask !is ShadowJar }
        .forEach { task ->
            task.dependsOn(generateGdIgnoreFilesTask)
            task.finalizedBy(
                copyDesktopJarsTask,
                packageBootstrapJarTask,
                packageMainJarTask
            )
        }

    val buildTask = tasks.named("build")

    tasks.register("buildRelease") { task ->
        task.group = "build"
        task.description = "Builds the desktop release jars."
        task.dependsOn(buildTask)
    }

    tasks.register("buildAndroid") { task ->
        task.group = "build"
        task.description = "Builds the desktop jars and Android dex artifacts."
        task.dependsOn(createBootstrapDexJarTask, packageMainDexJarTask, copyAndroidArtifactsTask)
    }

    tasks.register("buildAndroidRelease") { task ->
        task.group = "build"
        task.description = "Builds the desktop release jars and Android dex artifacts."
        task.dependsOn(createBootstrapDexJarTask, packageMainDexJarTask, copyAndroidArtifactsTask)
    }

    tasks.register("buildGraalNativeImage") { task ->
        task.group = "build"
        task.description = "Builds the desktop jars and GraalVM native image."
        task.dependsOn(createGraalNativeImageTask, copyGraalArtifactsTask)
    }

    tasks.register("buildGraalNativeImageRelease") { task ->
        task.group = "build"
        task.description = "Builds the desktop release jars and GraalVM native image."
        task.dependsOn(createGraalNativeImageTask, copyGraalArtifactsTask)
    }

    tasks.register("buildIOS") { task ->
        task.group = "build"
        task.description = "Builds the desktop jars and iOS static library."
        task.dependsOn(createIOSTask, copyIOSArtifactsTask)
    }

    tasks.register("buildIOSRelease") { task ->
        task.group = "build"
        task.description = "Builds the desktop release jars and iOS static library."
        task.dependsOn(createIOSTask, copyIOSArtifactsTask)
    }
}

private fun Project.setupCleanLifecycleTasks(
    generateGdIgnoreFilesTask: TaskProvider<out Task>
) {
    tasks.named("clean") { task ->
        task.finalizedBy(generateGdIgnoreFilesTask)
    }
}
