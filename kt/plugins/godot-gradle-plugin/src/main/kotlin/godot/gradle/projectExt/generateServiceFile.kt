package godot.gradle.projectExt

import org.gradle.api.Project
import java.io.File

fun Project.generateServiceFile() {
    val metaInfServicesDir = projectDir.resolve("src/main/resources/META-INF/services")
    metaInfServicesDir.mkdirs()
    File(metaInfServicesDir, "godot.registration.Entry").writeText("godot.Entry")
}
