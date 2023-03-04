package godot.gradle

import org.gradle.api.file.RegularFileProperty
import org.gradle.api.model.ObjectFactory
import org.gradle.api.provider.Property
import java.io.File

open class GodotExtension(objects: ObjectFactory) {
    val classPrefix: Property<String> = objects.property(String::class.java)
    val dummyFileBaseDir: RegularFileProperty = objects.fileProperty()
    val isDummyFileHierarchyEnabled: Property<Boolean> = objects.property(Boolean::class.java)
    val isFqNameRegistrationEnabled: Property<Boolean> = objects.property(Boolean::class.java)
    val projectName: Property<String> = objects.property(String::class.java)
    /**
     * enable android export
     *
     * is set to true, d8 tool and androidCompileSdk dir have to be resolvable
     */
    val isAndroidExportEnabled: Property<Boolean> = objects.property(Boolean::class.java)

    /**
     * path to the d8 tool used for desugaring and converting the jar to a dex file
     *
     * example: "${System.getenv("ANDROID_SDK_ROOT")}/build-tools/31.0.0/d8"
     */
    var d8ToolPath = objects.fileProperty()

    /**
     * path to the sdk dir for your target sdk compilation dir
     *
     * example: "${System.getenv("ANDROID_SDK_ROOT")}/platforms/android-30"
     */
    var androidCompileSdkDir = objects.fileProperty()

    /**
     * Min android api version.
     *
     * example: 21
     */
    var androidMinApi = objects.property(Int::class.java)

    /**
     * enable Graal Native Image Export
     *
     * if is set to true, native-image tool and graalvm home has to be resolvable
     */
    val isGraalNativeImageExportEnabled = objects.property(Boolean::class.java)

    /**
     * path to the native-image tool used to convert jar to native.
     *
     * example: "${System.getenv("GRAALVM_HOME")}/bin/native-image"
     */
    val nativeImageToolPath = objects.fileProperty()

    /**
     * Windows specific.
     * Path to Visual Studio VCVARS to initialize native developer tools.
     *
     * example: System.getenv("VC_VARS_PATH")
     */
    val windowsDeveloperVCVarsPath = objects.property(String::class.java)

    /**
     * Additional Graal JNI/reflection configurations.
     *
     * example: arrayOf("my-jni-configuration-file.json", "another-conf.json")
     */
    val additionalGraalJniConfigurationFiles = objects.property(Array<String>::class.java)

    /**
     * enable verbose mode on native image generation.
     *
     * if set to true, native-image tool will be in verbose mode.
     */
    val isGraalVmNativeImageGenerationVerbose = objects.property(Boolean::class.java)

    internal fun configureExtensionDefaults() {
        val buildToolsDir = System.getenv("ANDROID_SDK_ROOT")?.let { androidSdkRoot ->
            File("$androidSdkRoot/build-tools/")
        }
        val platformsDir = System.getenv("ANDROID_SDK_ROOT")?.let { androidSdkRoot ->
            File("$androidSdkRoot/platforms/")
        }
        val d8Tool = buildToolsDir
            ?.listFiles()
            ?.last { it.isDirectory }
            ?.resolve("d8")

        val androidCompileSdkDirFile = platformsDir
            ?.listFiles()
            ?.last { it.isDirectory }

        isDummyFileHierarchyEnabled.set(true)
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
        nativeImageToolPath.set(System.getenv("native-image")?.let { File(it) })
        additionalGraalJniConfigurationFiles.set(arrayOf())
        isGraalVmNativeImageGenerationVerbose.set(false)
        windowsDeveloperVCVarsPath.set("\"%VC_VARS_PATH%\"")
    }
}
