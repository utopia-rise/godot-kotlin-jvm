package godot.gradle.tasks.graal.ios

import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.api.tasks.TaskProvider
import org.jetbrains.kotlin.gradle.internal.ensureParentDirsCreated
import java.net.URL

fun Project.downloadIOSJdkStaticLibraries(): TaskProvider<out Task> = tasks
    .register("downloadIOSJdkStaticLibraries") {
        with(it) {
            group = "godot-kotlin-jvm-internal"
            description = "INTERNAL TASK ! Downloads ios static JDK libraries."

            doLast {
                val iosJdkDirectory = buildDir
                    .resolve("libs")
                    .resolve("ios")
                    .resolve("ios-jdk")
                    .resolve("21")

                val iosGraalJdkReleaseBaseLink = "https://github.com/utopia-rise/ios-graal-jdk-21/releases/download/v23.1.3-21-b33/"

                val libJavaFileName = "libjava-release.a"

                val libJavaFile = iosJdkDirectory.resolve(libJavaFileName)

                if (!libJavaFile.exists()) {
                    libJavaFile.ensureParentDirsCreated()
                    libJavaFile.createNewFile()
                    libJavaFile.writeBytes(URL("$iosGraalJdkReleaseBaseLink/$libJavaFileName").readBytes())
                }

                val libJvmFileName = "libjvm-release.a"

                val libJvmFile = iosJdkDirectory.resolve(libJvmFileName)

                if (!libJvmFile.exists()) {
                    libJvmFile.createNewFile()
                    libJvmFile.writeBytes(URL("$iosGraalJdkReleaseBaseLink/$libJvmFileName").readBytes())
                }
            }
        }
}
