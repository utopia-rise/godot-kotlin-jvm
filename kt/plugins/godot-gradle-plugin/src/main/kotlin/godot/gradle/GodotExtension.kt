package godot.gradle

import godot.entrygenerator.settings.RegistrationFileLayoutMode
import godot.entrygenerator.settings.RegisteredNameMode
import godot.tools.common.constants.FileExtensions
import org.gradle.api.Project
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.model.ObjectFactory
import org.gradle.api.provider.Property
import java.io.File

open class GodotExtension(objects: ObjectFactory) {
    /**
     * Base directory where registration files (`.gdj` files) are generated. Defaults to `<projectDir>/gdj`.
     *
     * Files from the current project are written directly under this directory.
     * Files from external projects are written under a subdirectory named after their source project.
     */
    val registrationFileBaseDir: RegularFileProperty = objects.fileProperty()

    /**
     * Controls how registration files are laid out inside each project-specific directory.
     *
     * - [RegistrationFileLayoutMode.FLAT]: write `.gdj` files directly into the project directory.
     * - [RegistrationFileLayoutMode.HIERARCHICAL]: mirror the package hierarchy before the `.gdj` file.
     *
     * This setting does not change the top-level project split. External projects are always generated under
     * `<registrationFileBaseDir>/<sourceProjectName>/...`.
     *
     * Defaults to [RegistrationFileLayoutMode.FLAT].
     */
    val registrationFileLayoutMode: Property<RegistrationFileLayoutMode> = objects.property(RegistrationFileLayoutMode::class.java)

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
    val registeredNameMode: Property<RegisteredNameMode> = objects.property(RegisteredNameMode::class.java)

    /**
     * Defines whether `.gdj` registration files should be generated at all. Defaults to `true`.
     *
     * This is mostly useful for library authors who do not need checked-in registration files in that project.
     * Entry source/resource generation still runs independently from this setting.
     */
    val isRegistrationFileGenerationEnabled: Property<Boolean> = objects.property(Boolean::class.java)

    /**
     * enable android export
     *
     * is set to true, d8 tool and androidCompileSdk dir have to be resolvable
     */
    val isAndroidExportEnabled: Property<Boolean> = objects.property(Boolean::class.java)

    /**
     * path to the d8 tool used for desugaring and converting the jar to a dex file
     *
     * example: "${System.getenv("ANDROID_SDK_ROOT")}/build-tools/36.0.0/d8"
     */
    var d8ToolPath: RegularFileProperty = objects.fileProperty()

    /**
     * path to the sdk dir for your target sdk compilation dir
     *
     * example: "${System.getenv("ANDROID_SDK_ROOT")}/platforms/android-36"
     */
    var androidCompileSdkDir: RegularFileProperty = objects.fileProperty()

    /**
     * Min android api version.
     *
     * example: 21
     */
    var androidMinApi: Property<Int> = objects.property(Int::class.java)

    /**
     * enable Graal Native Image Export
     *
     * if is set to true, native-image tool and graalvm home has to be resolvable
     */
    val isGraalNativeImageExportEnabled: Property<Boolean> = objects.property(Boolean::class.java)

    /**
     * enable ios Export, if true, [isGraalNativeImageExportEnabled] should be set to true
     *
     * if is set to true, native-image tool and graalvm home has to be resolvable
     */
    val isIOSExportEnabled: Property<Boolean> = objects.property(Boolean::class.java)

    /**
     * path to the native-image tool used to convert jar to native.
     *
     * example: "${System.getenv("GRAALVM_HOME")}"
     */
    val graalVmDirectory: RegularFileProperty = objects.fileProperty()

    /**
     * Windows specific.
     * Path to Visual Studio VCVARS to initialize native developer tools.
     *
     * example: ${System.getenv("VC_VARS_PATH")}
     */
    val windowsDeveloperVCVarsPath: RegularFileProperty = objects.fileProperty()

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
    val isGraalVmNativeImageGenerationVerbose: Property<Boolean> = objects.property(Boolean::class.java)


    /**
     * Enable the use of coroutines in the context of Godot lifecycle callbacks (signals)
     *
     * If set to true, import godot-coroutine-library
     */
    val isGodotCoroutinesEnabled: Property<Boolean> = objects.property(Boolean::class.java)

    /**
     * Sets the scala version used to support scala language, default 3.6.3
     */
    val scalaVersion: Property<String> = objects.property(String::class.java)

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

        val androidCompileSdkDirFile = platformsDir
            ?.listFiles()
            ?.last { it.isDirectory }

        registrationFileBaseDir.set(target.projectDir.resolve(FileExtensions.GodotKotlinJvm.registrationFile))
        registrationFileLayoutMode.set(RegistrationFileLayoutMode.FLAT)
        registeredNameMode.set(RegisteredNameMode.SIMPLE_NAME)
        isRegistrationFileGenerationEnabled.set(true)

        isAndroidExportEnabled.set(false)

        if (d8Tool != null) {
            d8ToolPath.set(d8Tool)
        }

        if (androidCompileSdkDirFile != null) {
            androidCompileSdkDir.set(androidCompileSdkDirFile)
        }

        androidMinApi.set(21)

        isGraalNativeImageExportEnabled.set(false)
        graalVmDirectory.set(
            System.getenv("GRAALVM_HOME")?.let {
                File(it)
            }
        )
        additionalGraalJniConfigurationFiles.set(arrayOf())
        additionalGraalReflectionConfigurationFiles.set(arrayOf())
        additionalGraalResourceConfigurationFiles.set(arrayOf())
        isGraalVmNativeImageGenerationVerbose.set(false)

        isGodotCoroutinesEnabled.set(false)

        scalaVersion.set("3.6.3")

        System.getenv("VC_VARS_PATH")?.let {
            windowsDeveloperVCVarsPath.set(File(it))
        }

        isIOSExportEnabled.set(false)
    }
}
