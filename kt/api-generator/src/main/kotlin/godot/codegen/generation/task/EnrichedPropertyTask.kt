package godot.codegen.generation.task

import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.PropertySpec
import godot.codegen.models.enriched.EnrichedProperty

class EnrichedPropertyTask(
    val property: EnrichedProperty,
) : PropertyTask() {

    override val builder = run {
        // We can't trust the property alone because some of them don't have a getter so we have to check on the setter's first parameter as well.
        val argumentIndex = if (property.isIndexed) 1 else 0
        val propertyTypeName = (property.getterMethod ?: property.setterMethod!!.arguments[argumentIndex]).getCastedType().typeName
        PropertySpec.builder(property.name, propertyTypeName).addModifiers(KModifier.FINAL)
    }

    override fun executeSingle() = builder.build()
}
