package godot.registrar.generator.builder

import godot.registrar.generator.GeneratorContext
import godot.registrar.generator.ext.getRegisteredName
import godot.registration.model.types.ScriptClass
import godot.tools.common.constants.godotRegistrarBasePackage
import java.io.File

class RegistrarServiceFileBuilder(
    private val context: GeneratorContext,
    private val serviceFile: File,
) {
    fun generate(registeredClasses: List<ScriptClass>) {
        serviceFile.parentFile.mkdirs()
        serviceFile.writeText(
            registeredClasses.joinToString(separator = "\n") { registeredClass ->
                "${godotRegistrarBasePackage}.${registeredClass.getRegisteredName(context.settings)}Registrar"
            }
        )
    }
}
