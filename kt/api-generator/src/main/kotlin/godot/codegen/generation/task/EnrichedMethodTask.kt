package godot.codegen.generation.task

import com.squareup.kotlinpoet.FunSpec
import godot.codegen.models.enriched.EnrichedClass
import godot.codegen.models.enriched.EnrichedMethod
import godot.tools.common.mapping.MemberNameMapping

class EnrichedMethodTask(
    val method: EnrichedMethod,
    val owner: EnrichedClass,
) : MethodTask() {

    override val generator = FunSpec.builder(method.name.applyJvmNameIfNecessary())

    override fun executeSingle() = generator.build()
}

private fun String.applyJvmNameIfNecessary() = MemberNameMapping.KotlinNameToJavaName.GodotApi.functions[this] ?: this
