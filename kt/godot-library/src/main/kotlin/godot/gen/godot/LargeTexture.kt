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
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress

@GodotBaseType
open class LargeTexture : Texture() {
  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_LARGETEXTURE)

  open fun _get_data(): VariantArray<Any?> {
    throw NotImplementedError("_get_data is not implemented for LargeTexture")
  }

  open fun _set_data(data: VariantArray<Any?>) {
  }

  open fun addPiece(ofs: Vector2, texture: Texture): Long {
    TransferContext.writeArguments(VECTOR2 to ofs, OBJECT to texture)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LARGETEXTURE_ADD_PIECE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun clear() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LARGETEXTURE_CLEAR, NIL)
  }

  open fun getPieceCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LARGETEXTURE_GET_PIECE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getPieceOffset(idx: Long): Vector2 {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LARGETEXTURE_GET_PIECE_OFFSET,
        VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  open fun getPieceTexture(idx: Long): Texture? {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LARGETEXTURE_GET_PIECE_TEXTURE,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Texture?
  }

  open fun setPieceOffset(idx: Long, ofs: Vector2) {
    TransferContext.writeArguments(LONG to idx, VECTOR2 to ofs)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LARGETEXTURE_SET_PIECE_OFFSET, NIL)
  }

  open fun setPieceTexture(idx: Long, texture: Texture) {
    TransferContext.writeArguments(LONG to idx, OBJECT to texture)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LARGETEXTURE_SET_PIECE_TEXTURE, NIL)
  }

  open fun setSize(size: Vector2) {
    TransferContext.writeArguments(VECTOR2 to size)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LARGETEXTURE_SET_SIZE, NIL)
  }

  companion object
}
