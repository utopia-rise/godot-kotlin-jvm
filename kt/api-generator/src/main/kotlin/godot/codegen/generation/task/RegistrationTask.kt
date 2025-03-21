package godot.codegen.generation.task

import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import godot.tools.common.constants.godotPackage

class RegistrationTask(
) : GenerationTask<FileSpec>() {

    val builder = FileSpec.builder(godotPackage, "RegisterEngineTypes")

    val variantMapper = FunSpec.builder("registerVariantMapping")
    val engineMethods = FunSpec.builder("registerEngineTypeMethods")
    val engineTypes = FunSpec.builder("registerEngineTypes")

    override fun executeSingle(): FileSpec {
        builder.addFunction(variantMapper.build())
        builder.addFunction(engineMethods.build())
        builder.addFunction(engineTypes.build())
        return builder.build()
    }
}
