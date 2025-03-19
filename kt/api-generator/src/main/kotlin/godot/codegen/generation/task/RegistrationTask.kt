package godot.codegen.generation.task

import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import godot.tools.common.constants.godotPackage
import java.io.File

class RegistrationTask(
    val directory: File,
) : GenerationTask<Unit>() {

    val builder = FileSpec.builder(godotPackage, "RegisterEngineTypes")

    val variantMapper = FunSpec.builder("registerVariantMapping")
    val engineMethods = FunSpec.builder("registerEngineTypeMethods")
    val engineTypes = FunSpec.builder("registerEngineTypes")

    override fun executeSingle() {
        builder.addFunction(variantMapper.build())
        builder.addFunction(engineMethods.build())
        builder.addFunction(engineTypes.build())
        builder.build().writeTo(directory)
    }
}
