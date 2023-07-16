package godot.gradle.tasks.graal.ios

import godot.gradle.tasks.graal.copyToGraalFromPluginResourceIfDoesNotExists
import godot.gradle.tasks.graal.iosJniConfig
import godot.gradle.tasks.graal.iosReflectionConfig
import godot.gradle.tasks.graal.iosResourceConfig
import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.api.tasks.TaskProvider
import org.jetbrains.kotlin.gradle.internal.ensureParentDirsCreated

fun Project.checkPresenceOfDefaultGraalIOSConfigsTask(
    checkPresenceOfDefaultGraalJniConfigTask: TaskProvider<out Task>,
): TaskProvider<out Task> = tasks.register("checkPresenceOfDefaultGraalJniConfig") {
    with(it) {
        group = "godot-kotlin-jvm"
        description =
            "Checks if the default configs for ios graalVM native image are present and creates them if they're not"

        dependsOn(checkPresenceOfDefaultGraalJniConfigTask)

        val iosLibDir = buildDir.resolve("libs").resolve("ios")

        iosLibDir.ensureParentDirsCreated()

        doLast {
            val jsonConfigs = iosLibDir.resolve("graal-configs")

            // Configurations from gluon substrate: https://github.com/gluonhq/substrate/tree/master/src/main/resources/config

            copyToGraalFromPluginResourceIfDoesNotExists(
                jsonConfigs
                    .resolve(iosJniConfig),
                "ios/$iosJniConfig"
            )
            copyToGraalFromPluginResourceIfDoesNotExists(
                jsonConfigs
                    .resolve(iosReflectionConfig),
                "ios/$iosReflectionConfig"
            )
            copyToGraalFromPluginResourceIfDoesNotExists(
                jsonConfigs
                    .resolve(iosResourceConfig),
                "ios/$iosResourceConfig"
            )

            // Cap files from gluon substrate: https://github.com/gluonhq/substrate/tree/master/src/main/resources/native/ios/cap
            // From what I understand cap files are constant native values dependants on OS

            val capCacheDir = iosLibDir.resolve("capcache")
            capCacheDir.ensureParentDirsCreated()

            copyToGraalFromPluginResourceIfDoesNotExists(
                capCacheDir
                    .resolve("AArch64LibCHelperDirectives.cap"),
                "ios/capcache/AArch64LibCHelperDirectives.cap"
            )
            copyToGraalFromPluginResourceIfDoesNotExists(
                capCacheDir
                    .resolve("AMD64LibCHelperDirectives.cap"),
                "ios/capcache/AMD64LibCHelperDirectives.cap"
            )
            copyToGraalFromPluginResourceIfDoesNotExists(
                capCacheDir
                    .resolve("BuiltinDirectives.cap"),
                "ios/capcache/BuiltinDirectives.cap"
            )
            copyToGraalFromPluginResourceIfDoesNotExists(
                capCacheDir
                    .resolve("JNIHeaderDirectives.cap"),
                "ios/capcache/JNIHeaderDirectives.cap"
            )
            copyToGraalFromPluginResourceIfDoesNotExists(
                capCacheDir
                    .resolve("JNIHeaderDirectivesJDK19OrLater.cap"),
                "ios/capcache/JNIHeaderDirectivesJDK19OrLater.cap"
            )
            copyToGraalFromPluginResourceIfDoesNotExists(
                capCacheDir
                    .resolve("LibFFIHeaderDirectives.cap"),
                "ios/capcache/LibFFIHeaderDirectives.cap"
            )
            copyToGraalFromPluginResourceIfDoesNotExists(
                capCacheDir
                    .resolve("LLVMDirectives.cap"),
                "ios/capcache/LLVMDirectives.cap"
            )
            copyToGraalFromPluginResourceIfDoesNotExists(
                capCacheDir
                    .resolve("PosixDirectives.cap"),
                "ios/capcache/PosixDirectives.cap"
            )
            copyToGraalFromPluginResourceIfDoesNotExists(
                capCacheDir
                    .resolve("RISCV64LibCHelperDirectives.cap"),
                "ios/capcache/RISCV64LibCHelperDirectives.cap"
            )
        }
    }
}
