// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedByteArray
import godot.core.TypeManager
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_BYTE_ARRAY
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

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
    callConstructor(ENGINECLASS_STREAMPEERBUFFER, scriptIndex)
  }

  /**
   * Moves the cursor to the specified position. [position] must be a valid index of [dataArray].
   */
  public final fun seek(position: Int): Unit {
    TransferContext.writeArguments(LONG to position.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.seekPtr, NIL)
  }

  /**
   * Returns the size of [dataArray].
   */
  public final fun getSize(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSizePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the current cursor position.
   */
  public final fun getPosition(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPositionPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Resizes the [dataArray]. This *doesn't* update the cursor.
   */
  public final fun resize(size: Int): Unit {
    TransferContext.writeArguments(LONG to size.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.resizePtr, NIL)
  }

  public final fun setDataArray(`data`: PackedByteArray): Unit {
    TransferContext.writeArguments(PACKED_BYTE_ARRAY to data)
    TransferContext.callMethod(rawPtr, MethodBindings.setDataArrayPtr, NIL)
  }

  public final fun getDataArray(): PackedByteArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDataArrayPtr, PACKED_BYTE_ARRAY)
    return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY) as PackedByteArray)
  }

  /**
   * Clears the [dataArray] and resets the cursor.
   */
  public final fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearPtr, NIL)
  }

  /**
   * Returns a new [StreamPeerBuffer] with the same [dataArray] content.
   */
  public final fun duplicate(): StreamPeerBuffer? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.duplicatePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as StreamPeerBuffer?)
  }

  public companion object

  internal object MethodBindings {
    public val seekPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeerBuffer", "seek", 1286410249)

    public val getSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeerBuffer", "get_size", 3905245786)

    public val getPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeerBuffer", "get_position", 3905245786)

    public val resizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeerBuffer", "resize", 1286410249)

    public val setDataArrayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeerBuffer", "set_data_array", 2971499966)

    public val getDataArrayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeerBuffer", "get_data_array", 2362200018)

    public val clearPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeerBuffer", "clear", 3218959716)

    public val duplicatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeerBuffer", "duplicate", 2474064677)
  }
}
