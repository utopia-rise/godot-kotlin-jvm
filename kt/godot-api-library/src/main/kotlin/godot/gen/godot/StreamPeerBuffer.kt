// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedByteArray
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_BYTE_ARRAY
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_STREAMPEERBUFFER_INDEX: Int = 553

/**
 * A data buffer stream peer that uses a byte array as the stream. This object can be used to handle
 * binary data from network sessions. To handle binary data stored in files, [FileAccess] can be used
 * directly.
 * A [StreamPeerBuffer] object keeps an internal cursor which is the offset in bytes to the start of
 * the buffer. Get and put operations are performed at the cursor position and will move the cursor
 * accordingly.
 */
@GodotBaseType
public open class StreamPeerBuffer : StreamPeer() {
  /**
   * The underlying data buffer. Setting this value resets the cursor.
   */
  public final inline var dataArray: PackedByteArray
    @JvmName("dataArrayProperty")
    get() = getDataArray()
    @JvmName("dataArrayProperty")
    set(`value`) {
      setDataArray(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_STREAMPEERBUFFER_INDEX, scriptIndex)
  }

  /**
   * Moves the cursor to the specified position. [position] must be a valid index of [dataArray].
   */
  public final fun seek(position: Int): Unit {
    Internals.writeArguments(LONG to position.toLong())
    Internals.callMethod(rawPtr, MethodBindings.seekPtr, NIL)
  }

  /**
   * Returns the size of [dataArray].
   */
  public final fun getSize(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSizePtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the current cursor position.
   */
  public final fun getPosition(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getPositionPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Resizes the [dataArray]. This *doesn't* update the cursor.
   */
  public final fun resize(size: Int): Unit {
    Internals.writeArguments(LONG to size.toLong())
    Internals.callMethod(rawPtr, MethodBindings.resizePtr, NIL)
  }

  public final fun setDataArray(`data`: PackedByteArray): Unit {
    Internals.writeArguments(PACKED_BYTE_ARRAY to data)
    Internals.callMethod(rawPtr, MethodBindings.setDataArrayPtr, NIL)
  }

  public final fun getDataArray(): PackedByteArray {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getDataArrayPtr, PACKED_BYTE_ARRAY)
    return (Internals.readReturnValue(PACKED_BYTE_ARRAY) as PackedByteArray)
  }

  /**
   * Clears the [dataArray] and resets the cursor.
   */
  public final fun clear(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.clearPtr, NIL)
  }

  /**
   * Returns a new [StreamPeerBuffer] with the same [dataArray] content.
   */
  public final fun duplicate(): StreamPeerBuffer? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.duplicatePtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as StreamPeerBuffer?)
  }

  public companion object

  internal object MethodBindings {
    public val seekPtr: VoidPtr = Internals.getMethodBindPtr("StreamPeerBuffer", "seek", 1286410249)

    public val getSizePtr: VoidPtr =
        Internals.getMethodBindPtr("StreamPeerBuffer", "get_size", 3905245786)

    public val getPositionPtr: VoidPtr =
        Internals.getMethodBindPtr("StreamPeerBuffer", "get_position", 3905245786)

    public val resizePtr: VoidPtr =
        Internals.getMethodBindPtr("StreamPeerBuffer", "resize", 1286410249)

    public val setDataArrayPtr: VoidPtr =
        Internals.getMethodBindPtr("StreamPeerBuffer", "set_data_array", 2971499966)

    public val getDataArrayPtr: VoidPtr =
        Internals.getMethodBindPtr("StreamPeerBuffer", "get_data_array", 2362200018)

    public val clearPtr: VoidPtr =
        Internals.getMethodBindPtr("StreamPeerBuffer", "clear", 3218959716)

    public val duplicatePtr: VoidPtr =
        Internals.getMethodBindPtr("StreamPeerBuffer", "duplicate", 2474064677)
  }
}
