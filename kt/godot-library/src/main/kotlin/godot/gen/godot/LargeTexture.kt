// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import kotlin.Any
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress

/**
 * A [godot.Texture] capable of storing many smaller textures with offsets.
 *
 * A [godot.Texture] capable of storing many smaller textures with offsets.
 *
 * You can dynamically add pieces ([godot.Texture]s) to this [godot.LargeTexture] using different offsets.
 */
@GodotBaseType
open class LargeTexture : Texture() {
  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_LARGETEXTURE)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    __id = buffer.long
    buffer.rewind()
  }

  open fun _getData(): VariantArray<Any?> {
    throw NotImplementedError("_get_data is not implemented for LargeTexture")
  }

  open fun _setData(data: VariantArray<Any?>) {
  }

  /**
   * Adds `texture` to this [godot.LargeTexture], starting on offset `ofs`.
   */
  open fun addPiece(ofs: Vector2, texture: Texture): Long {
    TransferContext.writeArguments(VECTOR2 to ofs, OBJECT to texture)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LARGETEXTURE_ADD_PIECE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Clears the [godot.LargeTexture].
   */
  open fun clear() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LARGETEXTURE_CLEAR, NIL)
  }

  /**
   * Returns the number of pieces currently in this [godot.LargeTexture].
   */
  open fun getPieceCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LARGETEXTURE_GET_PIECE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the offset of the piece with the index `idx`.
   */
  open fun getPieceOffset(idx: Long): Vector2 {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LARGETEXTURE_GET_PIECE_OFFSET,
        VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the [godot.Texture] of the piece with the index `idx`.
   */
  open fun getPieceTexture(idx: Long): Texture? {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LARGETEXTURE_GET_PIECE_TEXTURE,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Texture?
  }

  /**
   * Sets the offset of the piece with the index `idx` to `ofs`.
   */
  open fun setPieceOffset(idx: Long, ofs: Vector2) {
    TransferContext.writeArguments(LONG to idx, VECTOR2 to ofs)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LARGETEXTURE_SET_PIECE_OFFSET, NIL)
  }

  /**
   * Sets the [godot.Texture] of the piece with index `idx` to `texture`.
   */
  open fun setPieceTexture(idx: Long, texture: Texture) {
    TransferContext.writeArguments(LONG to idx, OBJECT to texture)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LARGETEXTURE_SET_PIECE_TEXTURE, NIL)
  }

  /**
   * Sets the size of this [godot.LargeTexture].
   */
  open fun setSize(size: Vector2) {
    TransferContext.writeArguments(VECTOR2 to size)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LARGETEXTURE_SET_SIZE, NIL)
  }
}
