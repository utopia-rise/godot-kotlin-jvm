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
            // Configurations from gluon substrate: https://github.com/gluonhq/substrate/tree/master/src/main/resources/config

            copyToGraalBuildDirectory(
                "ios/$iosJniConfig"
            )
            copyToGraalBuildDirectory(
                "ios/$iosReflectionConfig"
            )
            copyToGraalBuildDirectory(
                "ios/$iosResourceConfig"
            )

            // Cap files from gluon substrate: https://github.com/gluonhq/substrate/tree/master/src/main/resources/native/ios/cap
            // From what I understand cap files are constant native values dependants on OS

            copyToGraalBuildDirectory(
                "ios/capcache/AArch64LibCHelperDirectives.cap"
            )
            copyToGraalBuildDirectory(
                "ios/capcache/AMD64LibCHelperDirectives.cap"
            )
            copyToGraalBuildDirectory(
                "ios/capcache/BuiltinDirectives.cap"
            )
            copyToGraalBuildDirectory(
                "ios/capcache/JNIHeaderDirectives.cap"
            )
            copyToGraalBuildDirectory(
                "ios/capcache/JNIHeaderDirectivesJDK19OrLater.cap"
            )
            copyToGraalBuildDirectory(
                "ios/capcache/JNIHeaderDirectivesJDK20OrLater.cap"
            )
            copyToGraalBuildDirectory(
                "ios/capcache/JNIHeaderDirectivesJDK21OrLater.cap"
            )
            copyToGraalBuildDirectory(
                "ios/capcache/JNIHeaderDirectivesJDK22OrLater.cap"
            )
            copyToGraalBuildDirectory(
                "ios/capcache/LibFFIHeaderDirectives.cap"
            )
            copyToGraalBuildDirectory(
                "ios/capcache/LLVMDirectives.cap"
            )
            copyToGraalBuildDirectory(
                "ios/capcache/PosixDirectives.cap"
            )
            copyToGraalBuildDirectory(
                "ios/capcache/RISCV64LibCHelperDirectives.cap"
            )
        }
    }
}
