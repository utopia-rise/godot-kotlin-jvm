package godot.codegen.generation.task

import com.squareup.kotlinpoet.PropertySpec
import godot.codegen.extensions.getTypeName
import godot.codegen.models.enriched.EnrichedConstant

class ConstantTask(
    val constant: EnrichedConstant
) : GenerationTask<PropertySpec.Builder, PropertySpec>() {

    override val generator = PropertySpec.builder(constant.name, constant.getTypeName())

    override fun executeSingle() = generator.build()
}
