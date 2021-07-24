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

    val isGraalExportEnabled = objects.property(Boolean::class.java)
    val nativeImageToolPath = objects.property(String::class.java)
    val windowsDeveloperVCVarsPath = objects.property(String::class.java)
    val additionalGraalJniConfigurationFiles = objects.property(Array<String>::class.java)
    val isGraalVmNativeImageGenerationVerbose = objects.property(Boolean::class.java)
}
