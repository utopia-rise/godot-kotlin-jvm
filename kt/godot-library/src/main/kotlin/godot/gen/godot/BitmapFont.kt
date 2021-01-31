// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.GodotError
import godot.core.PoolIntArray
import godot.core.Rect2
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.RECT2
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.UninitializedPropertyAccessException

@GodotBaseType
open class BitmapFont : Font() {
  open var ascent: Double
    get() = super.getFontAscent()
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BITMAPFONT_SET_ASCENT, NIL)
    }

  open var distanceField: Boolean
    get() {
      throw
          UninitializedPropertyAccessException("Cannot access property distanceField: has no getter")
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BITMAPFONT_SET_DISTANCE_FIELD,
          NIL)
    }

  open var fallback: BitmapFont?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BITMAPFONT_GET_FALLBACK, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as BitmapFont?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BITMAPFONT_SET_FALLBACK, NIL)
    }

  open var height: Double
    get() = super.getFontHeight()
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BITMAPFONT_SET_HEIGHT, NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_BITMAPFONT)

  open fun _get_chars(): PoolIntArray {
    throw NotImplementedError("_get_chars is not implemented for BitmapFont")
  }

  open fun _get_kernings(): PoolIntArray {
    throw NotImplementedError("_get_kernings is not implemented for BitmapFont")
  }

  open fun _get_textures(): VariantArray<Any?> {
    throw NotImplementedError("_get_textures is not implemented for BitmapFont")
  }

  open fun _set_chars(arg0: PoolIntArray) {
  }

  open fun _set_kernings(arg0: PoolIntArray) {
  }

  open fun _set_textures(arg0: VariantArray<Any?>) {
  }

  open fun addChar(
    character: Long,
    texture: Long,
    rect: Rect2,
    align: Vector2 = Vector2(0.0, 0.0),
    advance: Double = -1.0
  ) {
    TransferContext.writeArguments(LONG to character, LONG to texture, RECT2 to rect, VECTOR2 to
        align, DOUBLE to advance)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BITMAPFONT_ADD_CHAR, NIL)
  }

  open fun addKerningPair(
    charA: Long,
    charB: Long,
    kerning: Long
  ) {
    TransferContext.writeArguments(LONG to charA, LONG to charB, LONG to kerning)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BITMAPFONT_ADD_KERNING_PAIR, NIL)
  }

  open fun addTexture(texture: Texture) {
    TransferContext.writeArguments(OBJECT to texture)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BITMAPFONT_ADD_TEXTURE, NIL)
  }

  open fun clear() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BITMAPFONT_CLEAR, NIL)
  }

  open fun createFromFnt(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BITMAPFONT_CREATE_FROM_FNT, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun getCharSize(char: Long, next: Long = 0): Vector2 {
    TransferContext.writeArguments(LONG to char, LONG to next)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BITMAPFONT_GET_CHAR_SIZE, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  open fun getKerningPair(charA: Long, charB: Long): Long {
    TransferContext.writeArguments(LONG to charA, LONG to charB)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BITMAPFONT_GET_KERNING_PAIR, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getTexture(idx: Long): Texture? {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BITMAPFONT_GET_TEXTURE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Texture?
  }

  open fun getTextureCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BITMAPFONT_GET_TEXTURE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  companion object
}
