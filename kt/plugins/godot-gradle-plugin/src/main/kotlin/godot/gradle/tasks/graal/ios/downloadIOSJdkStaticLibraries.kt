package godot.gradle.tasks.graal.ios

import godot.utils.GodotBuildProperties
import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.api.tasks.TaskProvider
import org.jetbrains.kotlin.gradle.internal.ensureParentDirsCreated
import java.net.URL

fun Project.downloadIOSJdkStaticLibraries(): TaskProvider<out Task> = tasks
    .register("downloadIOSJdkStaticLibraries") {
        with(it) {
            group = "godot-jvm-internal"
            description = "INTERNAL TASK ! Downloads ios static JDK libraries."

            doLast {
                val iosJdkDirectory = layout
                    .buildDirectory
                    .asFile
                    .get()
                    .resolve("libs")
                    .resolve("ios")
                    .resolve("ios-jdk")
                    .resolve("21")

                val iosGraalJdkReleaseBaseLink = "https://github.com/utopia-rise/ios-graal-jdk-${GodotBuildProperties.iosJdkVersion}/releases/download/${GodotBuildProperties.iosGraalJdkBuildVersion}/"

                val libJavaFileName = "libjava-release.a"

                val libJavaFile = iosJdkDirectory.resolve(libJavaFileName)

                if (!libJavaFile.exists()) {
                    libJavaFile.ensureParentDirsCreated()
                    libJavaFile.createNewFile()
                    URL("$iosGraalJdkReleaseBaseLink/$libJavaFileName").openStream().copyTo(
                        libJavaFile.outputStream()
                    )
                }

                val libJvmFileName = "libjvm-release.a"

                val libJvmFile = iosJdkDirectory.resolve(libJvmFileName)

                if (!libJvmFile.exists()) {
                    libJvmFile.createNewFile()
                    URL("$iosGraalJdkReleaseBaseLink/$libJvmFileName").openStream().copyTo(
                        libJvmFile.outputStream()
                    )
                }
            }
        }
}
