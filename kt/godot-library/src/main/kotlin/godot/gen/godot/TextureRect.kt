// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
open class TextureRect : Control() {
  open var expand: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURERECT_GET_EXPAND, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURERECT_SET_EXPAND, NIL)
    }

  open var flipH: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURERECT_GET_FLIP_H, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURERECT_SET_FLIP_H, NIL)
    }

  open var flipV: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURERECT_GET_FLIP_V, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURERECT_SET_FLIP_V, NIL)
    }

  open var stretchMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURERECT_GET_STRETCH_MODE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURERECT_SET_STRETCH_MODE, NIL)
    }

  open var texture: Texture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURERECT_GET_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURERECT_SET_TEXTURE, NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_TEXTURERECT)

  open fun _texture_changed() {
  }

  enum class StretchMode(
    id: Long
  ) {
    STRETCH_SCALE_ON_EXPAND(0),

    STRETCH_SCALE(1),

    STRETCH_TILE(2),

    STRETCH_KEEP(3),

    STRETCH_KEEP_CENTERED(4),

    STRETCH_KEEP_ASPECT(5),

    STRETCH_KEEP_ASPECT_CENTERED(6),

    STRETCH_KEEP_ASPECT_COVERED(7);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val STRETCH_KEEP: Long = 3

    final const val STRETCH_KEEP_ASPECT: Long = 5

    final const val STRETCH_KEEP_ASPECT_CENTERED: Long = 6

    final const val STRETCH_KEEP_ASPECT_COVERED: Long = 7

    final const val STRETCH_KEEP_CENTERED: Long = 4

    final const val STRETCH_SCALE: Long = 1

    final const val STRETCH_SCALE_ON_EXPAND: Long = 0

    final const val STRETCH_TILE: Long = 2
  }
}
