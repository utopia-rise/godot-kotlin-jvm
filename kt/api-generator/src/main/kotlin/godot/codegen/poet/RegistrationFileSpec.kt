package godot.codegen.poet

import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import godot.codegen.constants.GENERATED_COMMENT
import godot.codegen.constants.godotApiPackage

class RegistrationFileSpec {
    val registrationFile = FileSpec.builder(godotApiPackage, "RegisterEngineTypes")
    val registerVariantMappingFunBuilder = FunSpec.builder("registerVariantMapping")
    val registerMethodsFunBuilder = FunSpec.builder("registerEngineTypeMethods")
    val registerTypesFunBuilder = FunSpec.builder("registerEngineTypes")

    fun build(): FileSpec {
        registrationFile.addFunction(
            registerTypesFunBuilder.build()
        ).addFunction(registerVariantMappingFunBuilder.build())

        registrationFile.addFunction(registerMethodsFunBuilder.build())

        return registrationFile.addFileComment(GENERATED_COMMENT).build()
    }
}
