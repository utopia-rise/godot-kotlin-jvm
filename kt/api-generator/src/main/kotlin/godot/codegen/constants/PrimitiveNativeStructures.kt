package godot.codegen.constants

import godot.codegen.models.NativeStructure
import godot.codegen.models.enriched.toEnriched

object PrimitiveNativeStructures {
    private val uint8 = NativeStructure("uint8_t", "").toEnriched()
    private val int32 = NativeStructure("int32_t", "").toEnriched()
    private val void = NativeStructure("void", "").toEnriched()
    private val float = NativeStructure("float", "").toEnriched()

    val all = listOf(
        uint8,
        int32,
        void,
        float
    )
}