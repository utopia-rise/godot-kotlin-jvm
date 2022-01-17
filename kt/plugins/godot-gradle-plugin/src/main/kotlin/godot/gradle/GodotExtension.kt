package godot.gradle

import godot.gradle.tasks.godotruntime.OS
import org.apache.commons.lang3.SystemUtils
import org.gradle.api.model.ObjectFactory
import org.gradle.api.provider.Property
import java.io.File

open class GodotExtension(objects: ObjectFactory) {
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

    /**
     * Properties to download a prebuilt Godot binary that contains the kotlin/JVM module.
     *
     *
     * the version of the module we want to download. If unset, no download will happen.
     * example: 0.3.3-3.4.2
     * */
    val godotKotlinJVMVersion = objects.property(String::class.java)

    /**
     * The base url to the "repository" where the binaries are stored.
     * It will be resolved as <godotKotlinJVMDownloadBaseURL>/<godotKotlinJVMVersion>/<platform specific download, eg: godotKotlinJVMDownloadBaseURL>
     * The default points to the releases section of the official github repository.
     * example for the full resolved url: https://github.com/utopia-rise/godot-kotlin-jvm/releases/download/0.3.3-3.4.2/godot-kotlin-jvm_editor_x11_.zip
     * */
    val godotKotlinJVMDownloadBaseURL = objects.property(String::class.java)
    /**
     * The target OS for godot.
     * */
    val os= objects.property(OS::class.java)


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

        godotKotlinJVMVersion.set("")
        godotKotlinJVMDownloadBaseURL.set("https://github.com/utopia-rise/godot-kotlin-jvm/releases/download/")
        when {
            SystemUtils.IS_OS_WINDOWS -> os.set(OS.WINDOWS)
            SystemUtils.IS_OS_MAC -> os.set(OS.MAC)
            //linux is treated as the default fallback.
            else -> {
                os.set(OS.LINUX)
            }
        }
    }
}
