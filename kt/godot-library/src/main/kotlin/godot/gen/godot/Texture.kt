// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.Color
import godot.core.RID
import godot.core.Rect2
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.RECT2
import godot.core.VariantType.VECTOR2
import godot.core.VariantType._RID
import godot.core.Vector2
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
open class Texture : Resource() {
  open var flags: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURE_GET_FLAGS, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURE_SET_FLAGS, NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_TEXTURE)

  open fun draw(
    canvasItem: RID,
    position: Vector2,
    modulate: Color = Color(1,1,1,1),
    transpose: Boolean = false,
    normalMap: Texture? = null
  ) {
    TransferContext.writeArguments(_RID to canvasItem, VECTOR2 to position, COLOR to modulate, BOOL
        to transpose, OBJECT to normalMap)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURE_DRAW, NIL)
  }

  open fun drawRect(
    canvasItem: RID,
    rect: Rect2,
    tile: Boolean,
    modulate: Color = Color(1,1,1,1),
    transpose: Boolean = false,
    normalMap: Texture? = null
  ) {
    TransferContext.writeArguments(_RID to canvasItem, RECT2 to rect, BOOL to tile, COLOR to
        modulate, BOOL to transpose, OBJECT to normalMap)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURE_DRAW_RECT, NIL)
  }

  open fun drawRectRegion(
    canvasItem: RID,
    rect: Rect2,
    srcRect: Rect2,
    modulate: Color = Color(1,1,1,1),
    transpose: Boolean = false,
    normalMap: Texture? = null,
    clipUv: Boolean = true
  ) {
    TransferContext.writeArguments(_RID to canvasItem, RECT2 to rect, RECT2 to srcRect, COLOR to
        modulate, BOOL to transpose, OBJECT to normalMap, BOOL to clipUv)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURE_DRAW_RECT_REGION, NIL)
  }

  open fun getData(): Image? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURE_GET_DATA, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Image?
  }

  open fun getTextureHeight(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURE_GET_HEIGHT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getTextureSize(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURE_GET_SIZE, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  open fun getTextureWidth(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURE_GET_WIDTH, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun hasAlpha(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURE_HAS_ALPHA, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  enum class Flags(
    id: Long
  ) {
    FLAG_MIPMAPS(1),

    FLAG_REPEAT(2),

    FLAG_FILTER(4),

    FLAGS_DEFAULT(7),

    FLAG_ANISOTROPIC_FILTER(8),

    FLAG_CONVERT_TO_LINEAR(16),

    FLAG_MIRRORED_REPEAT(32),

    FLAG_VIDEO_SURFACE(2048);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val FLAGS_DEFAULT: Long = 7

    final const val FLAG_ANISOTROPIC_FILTER: Long = 8

    final const val FLAG_CONVERT_TO_LINEAR: Long = 16

    final const val FLAG_FILTER: Long = 4

    final const val FLAG_MIPMAPS: Long = 1

    final const val FLAG_MIRRORED_REPEAT: Long = 32

    final const val FLAG_REPEAT: Long = 2

    final const val FLAG_VIDEO_SURFACE: Long = 2048
  }
}
