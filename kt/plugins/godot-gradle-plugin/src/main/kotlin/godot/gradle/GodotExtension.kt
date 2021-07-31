package godot.gradle

import org.gradle.api.file.RegularFileProperty
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
    var d8ToolPath: File? = null

    /**
     * path to the sdk dir for your target sdk compilation dir
     *
     * example: "${System.getenv("ANDROID_SDK_ROOT")}/platforms/android-30"
     */
    var androidCompileSdkDir: File? = null

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
    val nativeImageToolPath = objects.property(String::class.java)

    /**
     * Windows specific.
     * Path to Visual Studio VCVARS to initialize native developer tools.
     *
     * example: System.getenv("VC_VARS_PATH")
     */
    val windowsDeveloperVCVarsPath = objects.property(String::class.java)

    /**
     * Additional Graal JNI/reflexion configurations.
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
}
