package godot.codegen.poet

import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import godot.tools.common.constants.GENERATED_COMMENT
import godot.tools.common.constants.godotApiPackage

class RegistrationFileSpec {
    val registrationFile = FileSpec.builder(godotApiPackage, "RegisterEngineTypes")
    val registerVariantMappingFunBuilder = FunSpec.builder("registerVariantMapping")
    val registerMethodsFunBuilder = FunSpec.builder("registerEngineTypeMethods")
    val registerTypesFunBuilder = FunSpec.builder("registerEngineTypes")

    fun build() = registrationFile
        .addFunction(registerTypesFunBuilder.build())
        .addFunction(registerVariantMappingFunBuilder.build())
        .addFunction(registerMethodsFunBuilder.build())
        .addFileComment(GENERATED_COMMENT)
        .build()
}
