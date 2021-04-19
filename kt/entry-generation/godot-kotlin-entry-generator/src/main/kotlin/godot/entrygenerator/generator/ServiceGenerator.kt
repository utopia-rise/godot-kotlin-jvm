package godot.entrygenerator.generator

import java.io.File

object ServiceGenerator {
    fun generateServiceFile(serviceFileDir: String) {
        val serviceFile = File(serviceFileDir, "godot.runtime.Entry")

        if (serviceFile.exists()) {
            serviceFile.delete()
        }

        serviceFile.writeText("godot.Entry")
    }
}
