package godot.codegen.traits

import com.squareup.kotlinpoet.ClassName
import godot.codegen.constants.GodotMeta
import godot.codegen.extensions.getTypeClassName
import godot.codegen.poet.ClassTypeNameWrapper

interface CastableTrait : TypedTrait {
    val meta: String?

    private val metaInformation: GodotMeta.MetaInformation?
        get() {
            val metaString = meta
            return if (metaString != null) GodotMeta[metaString] else null
        }

    fun getToBufferCastingMethod() = metaInformation?.toBufferCastMethodLiteral ?: GodotMeta.CastLiterals.none

    fun getFromBufferCastingMethod() = metaInformation?.fromBufferCastMethodLiteral ?: GodotMeta.CastLiterals.none

    fun getCastedType() = getTypeClassName(metaInformation?.castedType)

    fun getBufferType() = getTypeClassName(metaInformation?.bufferType)

    private fun getTypeClassName(className: ClassName?): ClassTypeNameWrapper {
        if (className == null) {
            return getTypeClassName()
        }
        return ClassTypeNameWrapper(className)
    }
}
