package godot.gradle

import godot.entrygenerator.settings.RegisteredNameMode
import godot.entrygenerator.settings.RegistrationFileLayoutMode
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

    @Deprecated(
        message = "Use registrationFilesDirectory instead.",
        replaceWith = ReplaceWith("registrationFilesDirectory"),
    )
    val registrationFileBaseDir: DirectoryProperty
        get() = registrationFilesDirectory

    @Deprecated(
        message = "Use registrationFilesLayoutMode instead.",
        replaceWith = ReplaceWith("registrationFilesLayoutMode"),
    )
    val registrationFileLayoutMode: Property<RegistrationFileLayoutMode>
        get() = registrationFilesLayoutMode

    @Deprecated(
        message = "Use registrationNameMode instead.",
        replaceWith = ReplaceWith("registrationNameMode"),
    )
    val registeredNameMode: Property<RegisteredNameMode>
        get() = registrationNameMode

    @Deprecated(
        message = "Use d8ToolPath instead.",
        replaceWith = ReplaceWith("d8ToolPath"),
    )
    val d8ToolFile: Property<String>
        get() = d8ToolPath

    @Deprecated(
        message = "Use androidCompileSdkDirectory instead.",
        replaceWith = ReplaceWith("androidCompileSdkDirectory"),
    )
    val androidCompileSdkDir: Property<String>
        get() = androidCompileSdkDirectory

    @Deprecated(
        message = "Use androidMinApiLevel instead.",
        replaceWith = ReplaceWith("androidMinApiLevel"),
    )
    val androidMinApi: Property<Int>
        get() = androidMinApiLevel

    @Deprecated(
        message = "Use graalVmHomeDirectory instead.",
        replaceWith = ReplaceWith("graalVmHomeDirectory"),
    )
    val graalVmDirectory: Property<String>
        get() = graalVmHomeDirectory

    @Deprecated(
        message = "Use windowsDeveloperVcVarsPath instead.",
        replaceWith = ReplaceWith("windowsDeveloperVcVarsPath"),
    )
    val windowsDeveloperVcVarsFile: Property<String>
        get() = windowsDeveloperVcVarsPath

    @Deprecated(
        message = "Use windowsDeveloperVcVarsPath instead.",
        replaceWith = ReplaceWith("windowsDeveloperVcVarsPath"),
    )
    val windowsDeveloperVCVarsPath: Property<String>
        get() = windowsDeveloperVcVarsPath

    @Deprecated(
        message = "Use isGraalNativeImageVerboseEnabled instead.",
        replaceWith = ReplaceWith("isGraalNativeImageVerboseEnabled"),
    )
    val isGraalVmNativeImageGenerationVerbose: Property<Boolean>
        get() = isGraalNativeImageVerboseEnabled

    internal fun configureExtensionDefaults(target: Project) {
        val androidSdkRoot = System.getenv("ANDROID_SDK_ROOT")?.let { androidSdkRoot ->
            File(androidSdkRoot)
        }

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
            ?.last { it.isDirectory }
            ?.resolve("d8")

        val androidCompileSdkDirectoryFile = platformsDir
            ?.listFiles()
            ?.last { it.isDirectory }

        godotProjectDirectory.set(target.projectDir)
        isLibrary.set(false)
        registrationFilesDirectory.set(godotProjectDirectory.dir(FileExtensions.GodotKotlinJvm.registrationFile))
        registrationFilesLayoutMode.set(RegistrationFileLayoutMode.FLAT)
        registrationNameMode.set(RegisteredNameMode.SIMPLE_NAME)
        languages.set(GodotLanguage.entries.toSet())

        if (d8Tool != null) {
            d8ToolPath.set(d8Tool.absolutePath)
        }

        if (androidCompileSdkDirectoryFile != null) {
            androidCompileSdkDirectory.set(androidCompileSdkDirectoryFile.absolutePath)
        }

        androidMinApiLevel.set(21)

        graalVmHomeDirectory.set(System.getenv("GRAALVM_HOME"))
        additionalGraalJniConfigurationFiles.set(arrayOf())
        additionalGraalReflectionConfigurationFiles.set(arrayOf())
        additionalGraalResourceConfigurationFiles.set(arrayOf())
        isGraalNativeImageVerboseEnabled.set(false)

        isGodotCoroutinesEnabled.set(false)

        javaVersion.set(17)
        kotlinVersion.set(KOTLIN_VERSION)
        scalaVersion.set("3.6.3")

        windowsDeveloperVcVarsPath.set(System.getenv("VC_VARS_PATH"))
    }
}
