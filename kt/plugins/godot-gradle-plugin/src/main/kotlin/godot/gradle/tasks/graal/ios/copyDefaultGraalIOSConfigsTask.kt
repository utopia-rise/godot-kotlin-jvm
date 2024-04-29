package godot.gradle.tasks.graal.ios

import godot.gradle.tasks.graal.*
import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.api.tasks.TaskProvider
import org.jetbrains.kotlin.gradle.internal.ensureParentDirsCreated

fun Project.copyDefaultGraalIOSConfigsTask(
    checkPresenceOfDefaultGraalJniConfigTask: TaskProvider<out Task>,
): TaskProvider<out Task> = tasks.register("copyDefaultGraalIOSJniConfig") {
    with(it) {
        group = "godot-kotlin-jvm"
        description =
            "Checks if the default configs for ios graalVM native image are present and creates them if they're not"

        dependsOn(checkPresenceOfDefaultGraalJniConfigTask)

        doLast {
            listOf(
                // Configurations from gluon substrate: https://github.com/gluonhq/substrate/tree/master/src/main/resources/config

                "ios/$iosJniConfig",
                "ios/$iosReflectionConfig",
                "ios/$iosResourceConfig",

                // Cap files from gluon substrate: https://github.com/gluonhq/substrate/tree/master/src/main/resources/native/ios/cap
                // Cap files are representations of native structures and size.

                "ios/capcache/AArch64LibCHelperDirectives.cap",
                "ios/capcache/AMD64LibCHelperDirectives.cap",
                "ios/capcache/BuiltinDirectives.cap",
                "ios/capcache/JNIHeaderDirectives.cap",
                "ios/capcache/JNIHeaderDirectivesJDK19OrLater.cap",
                "ios/capcache/JNIHeaderDirectivesJDK20OrLater.cap",
                "ios/capcache/JNIHeaderDirectivesJDK21OrLater.cap",
                "ios/capcache/JNIHeaderDirectivesJDK22OrLater.cap",
                "ios/capcache/LibFFIHeaderDirectives.cap",
                "ios/capcache/LLVMDirectives.cap",
                "ios/capcache/PosixDirectives.cap",
                "ios/capcache/RISCV64LibCHelperDirectives.cap"
            ).forEach { resource -> copyToGraalBuildDirectory(resource) }
        }
    }
}
