package godot.codegen.generation

import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.PropertySpec
import godot.codegen.extensions.getTypeName
import godot.codegen.models.enriched.EnrichedConstant
import godot.codegen.services.IApiGenerationService
import godot.codegen.traits.addKdoc

object ConstantGenerator {

    fun generate(constant: EnrichedConstant, context: IApiGenerationService): PropertySpec {
        return PropertySpec
            .builder(constant.name, constant.getTypeName())
            .addModifiers(KModifier.CONST, KModifier.FINAL)
            .initializer("%L", constant.value)
            .addKdoc(constant)
            .build()
    }
}
