package godot.entrygenerator.generator.property.defaultvalue

import com.squareup.kotlinpoet.ClassName
import godot.entrygenerator.extension.assignmentPsi
import org.jetbrains.kotlin.descriptors.ClassDescriptor
import org.jetbrains.kotlin.descriptors.PropertyDescriptor
import org.jetbrains.kotlin.js.resolve.diagnostics.findPsi
import org.jetbrains.kotlin.psi.KtClass
import org.jetbrains.kotlin.psi.KtEnumEntry
import org.jetbrains.kotlin.resolve.BindingContext
import org.jetbrains.kotlin.resolve.descriptorUtil.fqNameSafe

class EnumFlagDefaultValueExtractor(propertyDescriptor: PropertyDescriptor, bindingContext: BindingContext) : DefaultValueExtractor(propertyDescriptor, bindingContext) {

    override fun getDefaultValue(variantClassName: ClassName?): Pair<String, Array<out Any>> {
        if (propertyHintAnnotation == null || propertyHintAnnotation.fqName?.asString() != "godot.annotation.EnumFlag") {
            throw IllegalStateException("The property \"${propertyDescriptor.fqNameSafe}\" is not annotated with @EnumFlag!")
        }
        if (propertyDescriptor.isLateInit || !isVisibleInEditor()) {
            return "%L" to arrayOf("null")
        }

        val enumEntries = getPsiKtClass(getClassDescriptor())
            .declarations
            .filterIsInstance<KtEnumEntry>()

        //check for the enum size
        //the way the intFlag is generated from the enums requires an enum to contain at most 32 entries
        if (enumEntries.size > 32) {
            throw IllegalStateException("The enum of the enumFlag ${propertyDescriptor.fqNameSafe} you tried to register has too many entries. A enum that you want to use for registering an EnumFlag can at most contain 32 enums")
        }

        return getDefaultValueTemplateStringWithTemplateArguments(propertyDescriptor.assignmentPsi) ?: "" to arrayOf()
    }

    private fun getClassDescriptor() = propertyDescriptor
        .type
        .arguments
        .first()
        .type
        .constructor
        .declarationDescriptor as ClassDescriptor

    private fun getPsiKtClass(classDescriptor: ClassDescriptor) = classDescriptor.findPsi() as KtClass
}
