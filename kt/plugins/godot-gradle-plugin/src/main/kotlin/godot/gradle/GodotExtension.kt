package godot.gradle

import godot.tools.common.constants.FileExtensions
import org.gradle.api.Project
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.model.ObjectFactory
import org.gradle.api.provider.Property
import java.io.File

open class GodotExtension(objects: ObjectFactory) {
    /**
     * Registers every class with this prefix. Especially useful for library authors
     */
    val classPrefix: Property<String> = objects.property(String::class.java)

    /**
     * Base directory where registration files ('.gdj' files) are generated to. Defaults to `<projectDir>/gdj`
     */
    val registrationFileBaseDir: RegularFileProperty = objects.fileProperty()

    /**
     * Defines whether the registration files follow the package hierarchy or if they are all generated to the [registrationFileBaseDir]. Defaults to `true`
     *
     * Examples:
     *
     * **true**:
     * ```
     *  -[registrationFileBaseDir]
     *      | packagePathOne
     *          | ClassOne.gdj
     *          | ClassTwo.gdj
     *      | packagePathTwo
     *          | ClassThree.gdj
     *          | ClassFour.gdj
     * ```
     * **false**:
     * ```
     *  -[registrationFileBaseDir]
     *      | ClassOne.gdj
     *      | ClassTwo.gdj
     *      | ClassThree.gdj
     *      | ClassFour.gdj
     * ```
     */
    val isRegistrationFileHierarchyEnabled: Property<Boolean> = objects.property(Boolean::class.java)

    /**
     * Defines whether classes should be registered with the full fqName or just with their simple name. Defaults to false
     *
     * **Note:** the custom class name in the `@RegisterClass` annotation takes precedence over this property!
     *
     * Examples:
     *
     * **true**: `com.company.MyClass` -> `com_company_MyClass`
     *
     * **false**: `com.company.MyClass` -> `MyClass`
     */
    val isFqNameRegistrationEnabled: Property<Boolean> = objects.property(Boolean::class.java)

    /**
     * Only has a visible effect when this project is used as a library. This project name defines to what directory the
     * registration files are generated to. Defaults to the gradle project name
     *
     * Example:
     * ```
     *  -[registrationFileBaseDir]
     *      | dependencies
     *          | <your_defined_project_name>
     *              | ClassFromThisProject.gdj
     *      | ClassFromConsumingProject.gdj
     *  ```
     */
    val projectName: Property<String> = objects.property(String::class.java)

    /**
     * Defines whether registration files should be generated or not. Defaults to `true`.
     *
     * Only really useful for library authors to disable the registration file generation if a project is only used as a
     * library where the registration files are not needed.
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
     * example: "${System.getenv("ANDROID_SDK_ROOT")}/build-tools/35.0.0/d8"
     */
    var d8ToolPath: RegularFileProperty = objects.fileProperty()

    /**
     * path to the sdk dir for your target sdk compilation dir
     *
     * example: "${System.getenv("ANDROID_SDK_ROOT")}/platforms/android-35"
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
     * enable verbose mode on native image generation.
     *
     * if set to true, native-image tool will be in verbose mode.
     */
    val isGraalVmNativeImageGenerationVerbose: Property<Boolean> = objects.property(Boolean::class.java)

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
        isRegistrationFileHierarchyEnabled.set(true)
        isFqNameRegistrationEnabled.set(false)

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

        System.getenv("VC_VARS_PATH")?.let {
            windowsDeveloperVCVarsPath.set(File(it))
        }

        isIOSExportEnabled.set(false)
    }
}
