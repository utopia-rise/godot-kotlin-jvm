package godot.gradle.tasks.graal.ios

import godot.tools.common.IOS_CAP_CACHE_VERSION
import godot.tools.common.IOS_JDK_VERSION
import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.api.tasks.TaskProvider
import java.net.URL

fun Project.downloadIOSCapCacheFiles(): TaskProvider<out Task> = tasks
    .register("downloadIOSCapCacheFiles") { task ->
        with(task) {
            group = "godot-kotlin-jvm-internal"
            description = "INTERNAL TASK ! Downloads CAP cache needed for iOS compilation using GraalVM native-image."

            doLast { _ ->
                val capCacheDirectory = layout
                    .buildDirectory
                    .asFile
                    .get()
                    .resolve("graal")
                    .resolve("ios")
                    .resolve("capcache")
                    .resolve("$IOS_CAP_CACHE_VERSION-$IOS_JDK_VERSION")

                val iosCapCacheReleaseBaseLink = "https://github.com/utopia-rise/cap-cache-generator/releases/download/$IOS_CAP_CACHE_VERSION-$IOS_JDK_VERSION"

                arrayOf(
                    "AArch64LibCHelperDirectives.cap",
                    "AMD64LibCHelperDirectives.cap",
                    "BuiltinDirectives.cap",
                    "JNIHeaderDirectives.cap",
                    "JNIHeaderDirectivesJDK19OrLater.cap",
                    "JNIHeaderDirectivesJDK20OrLater.cap",
                    "JNIHeaderDirectivesJDK21OrLater.cap",
                    "PosixDirectives.cap",
                    "RISCV64LibCHelperDirectives.cap"
                ).forEach {
                    capCacheDirectory.mkdirs()
                    val capFile = capCacheDirectory.resolve(it)

                    if (!capFile.exists()) {
                        capFile.createNewFile()

                        URL("$iosCapCacheReleaseBaseLink/$it").openStream().copyTo(capFile.outputStream())
                    }
                }
            }
        }
    }
