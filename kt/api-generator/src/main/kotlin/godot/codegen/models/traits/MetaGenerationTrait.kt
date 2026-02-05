package godot.codegen.models.traits

import com.squareup.kotlinpoet.TypeName
import godot.codegen.constants.GodotMeta

interface MetaGenerationTrait : HasTypeGenerationTrait {
    val meta: String?
    override val nullable: Boolean
        get() = metaInformation?.isNullable ?: super.nullable

    private val metaInformation: GodotMeta.MetaInformation?
        get() {
            val metaString = meta
            return if (metaString != null) GodotMeta[metaString] else null
        }

    fun getToBufferCastingMethod() = metaInformation?.toBufferCastMethodLiteral ?: GodotMeta.CastLiterals.none
    fun getFromBufferCastingMethod() = metaInformation?.fromBufferCastMethodLiteral ?: GodotMeta.CastLiterals.none

    fun getCastedType(): TypeName = metaInformation?.castedType ?: getTypeName()
    fun getBufferType(): TypeName = metaInformation?.bufferType ?: getTypeName()

    fun getCastedClass() = metaInformation?.castedType ?: getClassName()
    fun getBufferClass() = metaInformation?.bufferType ?: getClassName()
}
