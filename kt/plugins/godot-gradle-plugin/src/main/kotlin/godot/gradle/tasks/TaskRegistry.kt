package godot.gradle.tasks

import godot.gradle.tasks.android.AndroidJarAccessible
import godot.gradle.tasks.android.CreateBootstrapDexJar
import godot.gradle.tasks.android.CreateMainDexFile
import godot.gradle.tasks.android.PackageMainDexJar
import godot.gradle.tasks.graal.CreateGraalDefaultJniConfig
import godot.gradle.tasks.graal.CreateGraalNativeImage
import kotlin.reflect.KClass

enum class TaskRegistry(val taskName: String, val taskClass: KClass<out GodotJvmTask>) {
    CREATE_BUILD_LOCK("createBuildLock", CreateBuildLock::class),
    DELETE_BUILD_LOCK("deleteBuildLock", DeleteBuildLock::class),
    PACKAGE_BOOTSTRAP_JAR("packageBootstrapJar", PackageBootstrapJar::class),
    PACKAGE_MAIN_JAR("packageMainJar", PackageMainJar::class),
    ANDROID_JAR_ACCESSIBLE("checkAndroidJarAccessible", AndroidJarAccessible::class),
    PACKAGE_BOOTSTRAP_DEX_JAR("packageBootstrapDexJar", CreateBootstrapDexJar::class),
    CREATE_MAIN_DEX_FILE("createMainDexFile", CreateMainDexFile::class),
    PACKAGE_MAIN_DEX_JAR("packageMainDexJar", PackageMainDexJar::class),
    GENERATE_ENTRY_SERVICE_FILE("generateEntryServiceFile", GenerateEntryServiceFile::class),
    CREATE_GRAAL_DEFAULT_JNI_CONFIG("createGraalDefaultJniConfig", CreateGraalDefaultJniConfig::class),
    CREATE_GRAAL_NATIVE_IMAGE("createGraalNativeImage", CreateGraalNativeImage::class);

    override fun toString(): String {
        return taskName
    }
}
