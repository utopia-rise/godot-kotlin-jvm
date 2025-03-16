package godot.codegen.traits

import godot.codegen.constants.GodotMeta
import godot.codegen.extensions.getTypeClass
import godot.codegen.poet.TypeClass

interface CastableTrait : TypedTrait {
    val meta: String?

    private val metaInformation: GodotMeta.MetaInformation?
        get() {
            val metaString = meta
            return if (metaString != null) GodotMeta[metaString] else null
        }

    fun getToBufferCastingMethod() = metaInformation?.toBufferCastMethodLiteral ?: GodotMeta.CastLiterals.none
    fun getFromBufferCastingMethod() = metaInformation?.fromBufferCastMethodLiteral ?: GodotMeta.CastLiterals.none

    fun getCastedType() = metaInformation?.castedType?.let { TypeClass(it) } ?: getTypeClass()
    fun getBufferType() = metaInformation?.bufferType?.let { TypeClass(it) } ?: getTypeClass()
}
