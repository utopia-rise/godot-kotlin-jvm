package godot.registrar.generator.generator.typehint.primitives

import com.squareup.kotlinpoet.MemberName
import godot.core.PropertyHint
import godot.registrar.generator.generator.typehint.PropertyTypeHintGenerator
import godot.registrar.generator.ext.asEnumName
import godot.registration.model.RegisteredProperty
import godot.registration.model.hint.property.*

class JvmPrimitivesTypeHintGenerator(
    private val registeredProperty: RegisteredProperty
) : PropertyTypeHintGenerator(registeredProperty) {
    override fun getPropertyTypeHint(): MemberName {
        return when (propertyHintAnnotation) {
            is RangeHint<*> -> PropertyHint.RANGE.asEnumName()
            is ExpEasingHint -> PropertyHint.EXP_EASING.asEnumName()
            is FileHint -> if (propertyHintAnnotation.global) {
                PropertyHint.GLOBAL_FILE.asEnumName()
            } else {
                PropertyHint.FILE.asEnumName()
            }

            is DirHint -> if (propertyHintAnnotation.global) {
                PropertyHint.GLOBAL_DIR.asEnumName()
            } else {
                PropertyHint.DIR.asEnumName()
            }

            is MultilineTextHint -> PropertyHint.MULTILINE_TEXT.asEnumName()
            is PlaceHolderTextHint -> PropertyHint.PLACEHOLDER_TEXT.asEnumName()
            null -> PropertyHint.NONE.asEnumName()
            else -> PropertyHint.NONE.asEnumName()
        }
    }
}

