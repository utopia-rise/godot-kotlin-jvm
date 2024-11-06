package godot.common.interop

import java.nio.ByteBuffer

interface VariantConverter {
    val id: Int

    fun toKotlin(buffer: ByteBuffer): Any?
    fun toGodot(buffer: ByteBuffer, any: Any?)
}
