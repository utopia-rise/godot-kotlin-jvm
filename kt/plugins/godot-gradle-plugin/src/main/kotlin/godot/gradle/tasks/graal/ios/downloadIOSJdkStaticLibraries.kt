package godot.gradle.tasks.graal.ios

import godot.tools.common.IOS_GRAAL_JDK_BUILD_VERSION
import godot.tools.common.IOS_JDK_VERSION
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
                val iosJdkDirectory = layout
                    .buildDirectory
                    .asFile
                    .get()
                    .resolve("libs")
                    .resolve("ios")
                    .resolve("ios-jdk")
                    .resolve(IOS_JDK_VERSION)

                val iosGraalJdkReleaseBaseLink = "https://github.com/utopia-rise/ios-graal-jdk-$IOS_JDK_VERSION/releases/download/$IOS_GRAAL_JDK_BUILD_VERSION/"

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
