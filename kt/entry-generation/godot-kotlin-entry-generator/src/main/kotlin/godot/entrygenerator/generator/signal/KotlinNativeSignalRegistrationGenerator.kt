package godot.entrygenerator.generator.signal

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FunSpec
import godot.entrygenerator.mapper.TypeToVariantAsClassNameMapper
import org.jetbrains.kotlin.descriptors.PropertyDescriptor
import org.jetbrains.kotlin.psi.KtTypeArgumentList
import org.jetbrains.kotlin.psi.KtValueArgumentList
import org.jetbrains.kotlin.resolve.descriptorUtil.fqNameSafe
import org.jetbrains.kotlin.resolve.source.KotlinSourceElement

class KotlinNativeSignalRegistrationGenerator: SignalRegistrationGenerator() {
    override fun registerSignal(propertyDescriptor: PropertyDescriptor, className: ClassName, registerClassControlFlow: FunSpec.Builder) {
        val (signalArgumentsStringTemplate, arrayOfClassNames) = getSignalArguments(propertyDescriptor)

        registerClassControlFlow
            .addStatement(
                "signal(%S,·$signalArgumentsStringTemplate)",
                propertyDescriptor.name,
                *arrayOfClassNames
            )
    }

    private fun getSignalArguments(propertyDescriptor: PropertyDescriptor): Pair<String, Array<ClassName>> {
        val signalDelegate = (propertyDescriptor
            .source as KotlinSourceElement)
            .psi // whole property including annotation
            .children
            .last() // property delegate including `by`keyword. Ex: by signal<Boolean>("someName")
            .children
            .last() // property delegate. EX: signal<Boolean>("someName")

        return if (signalDelegate.children.any { it is KtTypeArgumentList }) { //if the signal has any arguments
            val typeArgumentsAsClassNames = signalDelegate
                .children
                .filterIsInstance<KtTypeArgumentList>()
                .first() //the type argument list. Ex: <Boolean, String>
                .children
                .map { it.text } //extracted each type argument as string
                .map {
                    TypeToVariantAsClassNameMapper.mapTypeToVariantAsClassName(it) //convert string to ClassName for kotlinPoet to get correct imports
                }
                .toTypedArray() //convert to typed array to pass as varargs to kotlinPoet addStatement function

            val valueArgumentsAsString = signalDelegate
                .children
                .filterIsInstance<KtValueArgumentList>()
                .first() //the value argument list. Ex: ("name1", "name2")
                .children
                .map { it.text } //extracted each value argument as string


            if (typeArgumentsAsClassNames.size != valueArgumentsAsString.size) {
                throw IllegalStateException("The value argument list has not the same size as the type argument list in this signal declaration: ${signalDelegate.text}")
            }

            Pair(assembleSignalParameterMapStringTemplate(valueArgumentsAsString), typeArgumentsAsClassNames)
        } else { //if the signal does not have any arguments, an empty map will be passed to the registration
            Pair("mapOf()", arrayOf())
        }
    }

    private fun assembleSignalParameterMapStringTemplate(
        valueArgumentsAsString: List<String>
    ): String {
        return buildString {
            append("mapOf(")

            valueArgumentsAsString.forEachIndexed { index, valueArgumentAsString ->
                append("$valueArgumentAsString·to·%T")

                if (index != valueArgumentsAsString.size - 1) {
                    append(",·")
                }
            }

            append(")")
        }
    }
}
