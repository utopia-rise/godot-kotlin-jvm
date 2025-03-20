package godot.codegen.generation.task.traits

import godot.codegen.constants.GodotMeta

interface MetaGenerationTrait : HasTypeGenerationTrait {
    val meta: String?

    private val metaInformation: GodotMeta.MetaInformation?
        get() {
            val metaString = meta
            return if (metaString != null) GodotMeta[metaString] else null
        }

    fun getToBufferCastingMethod() = metaInformation?.toBufferCastMethodLiteral ?: GodotMeta.CastLiterals.none
    fun getFromBufferCastingMethod() = metaInformation?.fromBufferCastMethodLiteral ?: GodotMeta.CastLiterals.none

    fun getCastedType() = metaInformation?.castedType ?: getTypeName()
    fun getBufferType() = metaInformation?.bufferType ?: getTypeName()

    fun getCastedClass() = metaInformation?.castedType ?: getClassName()
    fun getBufferClass() = metaInformation?.bufferType ?: getClassName()
}
