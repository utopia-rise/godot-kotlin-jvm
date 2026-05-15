package godot.gradle.tasks.android

import godot.gradle.GodotPlugin
import godot.gradle.projectExt.godotJvmExtension
import org.gradle.api.DefaultTask
import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.InputFile
import org.gradle.api.tasks.Optional
import org.gradle.api.tasks.OutputFile
import org.gradle.api.tasks.TaskAction
import org.gradle.api.tasks.TaskProvider
import org.gradle.nativeplatform.platform.internal.DefaultNativePlatform
import java.io.File

abstract class CreateBootstrapDexJarTask : DefaultTask() {
    @get:InputFile
    abstract val bootstrapJar: RegularFileProperty

    @get:OutputFile
    abstract val mainDexRulesFile: RegularFileProperty

    @get:OutputFile
    abstract val bootstrapDexJar: RegularFileProperty

    @get:Input
    @get:Optional
    abstract val d8ToolPath: Property<String>

    @get:Input
    @get:Optional
    abstract val androidJarPath: Property<String>

    @get:Input
    abstract val androidMinApiLevel: Property<Int>

    @TaskAction
    fun createBootstrapDexJar() {
        val libsDir = bootstrapJar.get().asFile.parentFile
        val mainDexRules = writeMainDexRules(mainDexRulesFile.get().asFile)
        val command = buildList {
            if (DefaultNativePlatform.getCurrentOperatingSystem().isWindows) {
                add("cmd")
                add("/c")
            }
            add(d8ToolPath.get())
            add(bootstrapJar.get().asFile.absolutePath)
            add("--output")
            add(bootstrapDexJar.get().asFile.name)
            add("--lib")
            add(androidJarPath.get())
            add("--min-api")
            add(androidMinApiLevel.get().toString())
            add("--main-dex-rules")
            add(mainDexRules.absolutePath)
        }

        val process = ProcessBuilder(command)
            .directory(libsDir)
            .inheritIO()
            .start()

        require(process.waitFor() == 0) {
            "Failed to create the bootstrap dex jar"
        }
    }
}

private fun writeMainDexRules(targetFile: File): File {
    targetFile.parentFile.mkdirs()
    targetFile.outputStream().use { outputStream ->
        requireNotNull(GodotPlugin::class.java.getResourceAsStream("android/main-dex-rules.proguard"))
            .copyTo(outputStream)
    }
    return targetFile
}

fun Project.createBootstrapDexJarTask(
    checkAndroidJarAccessibleTask: TaskProvider<out Task>,
    checkD8ToolAccessibleTask: TaskProvider<out Task>,
    packageBootstrapJarTask: TaskProvider<out Task>
): TaskProvider<out Task> {
    val libsDirectory = layout.buildDirectory.dir("libs")
    val d8ToolPath = godotJvmExtension.d8ToolPath
    val androidCompileSdkDirectory = godotJvmExtension.androidCompileSdkDirectory
    val androidMinApiLevel = godotJvmExtension.androidMinApiLevel

    return tasks.register("createBootstrapDexJar", CreateBootstrapDexJarTask::class.java) {
        with(it) {
            group = "godot-kotlin-jvm"
            description = "Converts the godot-bootstrap.jar to an android compatible version. Needed for android builds only"

            dependsOn(checkD8ToolAccessibleTask, checkAndroidJarAccessibleTask, packageBootstrapJarTask)

            this.bootstrapJar.set(libsDirectory.map { directory -> directory.file("godot-bootstrap.jar") })
            this.mainDexRulesFile.set(layout.buildDirectory.file("main-dex-rules.proguard"))
            this.bootstrapDexJar.set(libsDirectory.map { directory -> directory.file("godot-bootstrap-dex.jar") })
            this.d8ToolPath.set(d8ToolPath)
            this.androidJarPath.set(androidCompileSdkDirectory.map { compileSdkDirectory ->
                File(compileSdkDirectory).resolve("android.jar").absolutePath
            })
            this.androidMinApiLevel.set(androidMinApiLevel)
        }
    }
}
