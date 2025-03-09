package godot.codegen.generation

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.PropertySpec
import godot.codegen.extensions.getTypeName
import godot.codegen.models.enriched.EnrichedSignal
import godot.codegen.services.IApiGenerationService
import godot.codegen.traits.addKdoc
import godot.tools.common.constants.godotCorePackage

object SignalGenerator {

    fun generate(signal: EnrichedSignal, isSingleton: Boolean, context: IApiGenerationService): PropertySpec {
        val builder = PropertySpec
            .builder(
                signal.name,
                signal.getTypeName()
            )
            .addKdoc(signal)
            .delegate("%T", ClassName(godotCorePackage, "Signal" + signal.arguments.size))

        if (isSingleton) {
            builder.addAnnotation(JvmStatic::class)
        }

        return builder.build()
    }
}
