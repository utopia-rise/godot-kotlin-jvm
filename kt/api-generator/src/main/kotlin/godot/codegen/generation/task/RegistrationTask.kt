package godot.codegen.generation.task

import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import godot.tools.common.constants.godotPackage
import java.io.File

class RegistrationTask(
    val directory: File,
) : GenerationTask<FileSpec.Builder, Unit>() {

    override val generator = FileSpec.builder(godotPackage, "RegisterEngineTypes")

    val variantMapper = FunSpec.builder("registerVariantMapping")
    val engineMethods = FunSpec.builder("registerEngineTypeMethods")
    val engineTypes = FunSpec.builder("registerEngineTypes")

    override fun executeSingle() {
        generator.addFunction(variantMapper.build())
        generator.addFunction(engineMethods.build())
        generator.addFunction(engineTypes.build())
        generator.build().writeTo(directory)
    }
}
