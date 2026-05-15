package godot.gradle

import godot.entrygenerator.settings.RegisteredNameMode
import godot.entrygenerator.settings.RegistrationFileLayoutMode
import godot.gradle.ext.environmentVariable
import godot.gradle.ext.executableFileOrNull
import godot.gradle.ext.existingDirectoryOrNull
import godot.gradle.ext.existingFileOrNull
import godot.tools.common.KOTLIN_VERSION
import godot.tools.common.constants.FileExtensions
import org.gradle.api.Project
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.model.ObjectFactory
import org.gradle.api.provider.Property
import org.gradle.api.provider.SetProperty
import java.io.File

open class GodotExtension(objects: ObjectFactory) {
    /**
     * Marks this Gradle project as a reusable Godot Kotlin/JVM library rather than a runnable Godot project.
     *
     * When enabled, the plugin keeps the compile setup and library dependencies, but skips entry scanning,
     * entry generation, `.gdj` generation/synchronization, and the runtime jar packaging/copy pipeline.
     *
     * Defaults to `false`.
     */
    val isLibrary: Property<Boolean> = objects.property(Boolean::class.java)

    /**
     * Directory of the Godot project that contains `project.godot`.
     *
     * Defaults to the Gradle project's directory. Override this when the Gradle project lives in a subdirectory
     * or any non-standard layout where the Godot project root is elsewhere.
     */
    val godotProjectDirectory: DirectoryProperty = objects.directoryProperty()

    /**
     * Base directory where registration files (`.gdj` files) are generated. Defaults to `<projectDir>/gdj`.
     *
     * Files from the current project are written directly under this directory.
     * Files from external projects are written under a subdirectory named after their source project.
     */
    val registrationFilesDirectory: DirectoryProperty = objects.directoryProperty()

    /**
     * Controls how registration files are laid out inside each project-specific directory.
     *
     * - [RegistrationFileLayoutMode.FLAT]: write `.gdj` files directly into the project directory.
     * - [RegistrationFileLayoutMode.HIERARCHICAL]: mirror the package hierarchy before the `.gdj` file.
     *
     * This setting does not change the top-level project split. External projects are always generated under
     * `<registrationFilesDirectory>/<sourceProjectName>/...`.
     *
     * Defaults to [RegistrationFileLayoutMode.FLAT].
     */
    val registrationFilesLayoutMode: Property<RegistrationFileLayoutMode> = objects.property(RegistrationFileLayoutMode::class.java)

    /**
     * Controls how Godot registration names are computed when `@RegisterClass` does not provide a custom name.
     *
     * - [RegisteredNameMode.SIMPLE_NAME]: use the Kotlin class name.
     * - [RegisteredNameMode.FQ_NAME]: use the fully qualified class name.
     * - [RegisteredNameMode.PROJECT_PREFIX]: use the Kotlin class name for the current project, and prefix
     *   external classes with their source project name.
     *
     * Defaults to [RegisteredNameMode.SIMPLE_NAME].
     */
    val registrationNameMode: Property<RegisteredNameMode> = objects.property(RegisteredNameMode::class.java)

    /**
     * JVM source languages enabled for the project's initial compilation pass.
     *
     * This controls which language-specific compile tasks and support dependencies are wired into the
     * regular `classes` phase that feeds entry generation and packaging.
     *
     * Defaults to Kotlin, Java, and Scala.
     */
    val languages: SetProperty<GodotLanguage> = objects.setProperty(GodotLanguage::class.java)

    /**
     * File path to the d8 executable used for desugaring and converting jars to dex files.
     *
     * example: "${System.getenv("ANDROID_SDK_ROOT")}/build-tools/36.0.0/d8"
     */
    val d8ToolPath: Property<String> = objects.property(String::class.java)

    /**
     * Directory of the Android SDK platform used for compilation.
     *
     * example: "${System.getenv("ANDROID_SDK_ROOT")}/platforms/android-36"
     */
    val androidCompileSdkDirectory: Property<String> = objects.property(String::class.java)

    /**
     * Minimum Android API level passed to d8.
     *
     * example: 21
     */
    val androidMinApiLevel: Property<Int> = objects.property(Int::class.java)

    /**
     * GraalVM home directory used to locate the `native-image` executable.
     *
     * example: "${System.getenv("GRAALVM_HOME")}"
     */
    val graalVmHomeDirectory: Property<String> = objects.property(String::class.java)

    /**
     * Windows-specific file path to the Visual Studio VCVARS script used to initialize native developer tools.
     *
     * example: ${System.getenv("VC_VARS_PATH")}
     */
    val windowsDeveloperVcVarsPath: Property<String> = objects.property(String::class.java)

    /**
     * Additional Graal JNI configurations.
     *
     * example: arrayOf("my-jni-configuration-file.json", "another-conf.json")
     */
    val additionalGraalJniConfigurationFiles: Property<Array<String>> = objects.property(Array<String>::class.java)

    /**
     * Additional Graal reflection configurations.
     *
     * example: arrayOf("my-reflection-configuration-file.json", "another-conf.json")
     */
    val additionalGraalReflectionConfigurationFiles = objects.property(Array<String>::class.java)

    /**
     * Additional Graal resource configurations.
     *
     * example: arrayOf("my-resource-configuration-file.json", "another-conf.json")
     */
    val additionalGraalResourceConfigurationFiles = objects.property(Array<String>::class.java)

    /**
     * Enable verbose mode on native image generation.
     *
     * If set to true, native-image tool will be in verbose mode.
     */
    val isGraalNativeImageVerboseEnabled: Property<Boolean> = objects.property(Boolean::class.java)


    /**
     * Enables the use of coroutines in the context of Godot lifecycle callbacks (signals).
     *
     * If set to true, the plugin adds `godot-coroutine-library`.
     */
    val isGodotCoroutinesEnabled: Property<Boolean> = objects.property(Boolean::class.java)

    /**
     * JDK/toolchain version to use for Java and Kotlin compilation.
     *
     * Defaults to the current built-in JDK toolchain version and must be at least 11.
     */
    val javaVersion: Property<Int> = objects.property(Int::class.java)

    /**
     * Kotlin Gradle plugin version to use for the build.
     *
     * Defaults to the Kotlin version this Godot Kotlin/JVM release was built with.
     * If you override it, it must be at least that version.
     */
    val kotlinVersion: Property<String> = objects.property(String::class.java)

    /**
     * Scala language version used for Scala support.
     */
    val scalaVersion: Property<String> = objects.property(String::class.java)

    internal fun configureExtensionDefaults(target: Project) {
        val androidSdkRoot = environmentVariable("ANDROID_SDK_ROOT")
            ?.let(::File)
            ?.existingDirectoryOrNull()

        val buildToolsDir = androidSdkRoot?.resolve("build-tools")?.let { buildToolsDir ->
            if (buildToolsDir.exists() && buildToolsDir.isDirectory) {
                buildToolsDir
            } else null
        }

        val platformsDir = androidSdkRoot?.resolve("platforms")?.let { platformsFolder ->
            if (platformsFolder.exists() && platformsFolder.isDirectory) {
                platformsFolder
            } else null
        }

        val d8Tool = buildToolsDir
            ?.listFiles()
            ?.filter { it.isDirectory }
            ?.maxByOrNull { it.name }
            ?.resolve("d8")
            ?.executableFileOrNull()

        val androidCompileSdkDirectoryFile = platformsDir
            ?.listFiles()
            ?.filter { it.isDirectory }
            ?.filter { it.resolve("android.jar").existingFileOrNull() != null }
            ?.maxByOrNull { it.name }

        godotProjectDirectory.convention(target.layout.projectDirectory)
        isLibrary.convention(false)
        registrationFilesDirectory.convention(godotProjectDirectory.dir(FileExtensions.GodotKotlinJvm.registrationFile))
        registrationFilesLayoutMode.convention(RegistrationFileLayoutMode.FLAT)
        registrationNameMode.convention(RegisteredNameMode.SIMPLE_NAME)
        languages.convention(GodotLanguage.entries.toSet())

        if (d8Tool != null) {
            d8ToolPath.convention(d8Tool.absolutePath)
        }

        if (androidCompileSdkDirectoryFile != null) {
            androidCompileSdkDirectory.convention(androidCompileSdkDirectoryFile.absolutePath)
        }

        androidMinApiLevel.convention(21)

        environmentVariable("GRAALVM_HOME")?.let(graalVmHomeDirectory::convention)
        additionalGraalJniConfigurationFiles.convention(arrayOf())
        additionalGraalReflectionConfigurationFiles.convention(arrayOf())
        additionalGraalResourceConfigurationFiles.convention(arrayOf())
        isGraalNativeImageVerboseEnabled.convention(false)

        isGodotCoroutinesEnabled.convention(false)

        javaVersion.convention(17)
        kotlinVersion.convention(KOTLIN_VERSION)
        scalaVersion.convention("3.6.3")

        environmentVariable("VC_VARS_PATH")?.let(windowsDeveloperVcVarsPath::convention)
    }
}
