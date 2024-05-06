package godot.gradle.tasks.graal.ios

import godot.utils.GodotBuildProperties
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
                val capCacheDirectory = buildDir
                    .resolve("graal")
                    .resolve("ios")
                    .resolve("capcache")
                    .resolve("${GodotBuildProperties.iosCapCacheVersion}-${GodotBuildProperties.iosJdkVersion}")

                val iosCapCacheReleaseBaseLink = "https://github.com/utopia-rise/cap-cache-generator/releases/download/${GodotBuildProperties.iosCapCacheVersion}-${GodotBuildProperties.iosJdkVersion}"

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
