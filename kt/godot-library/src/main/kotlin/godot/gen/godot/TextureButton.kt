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
open class TextureButton : BaseButton() {
  open var expand: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTUREBUTTON_GET_EXPAND, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTUREBUTTON_SET_EXPAND, NIL)
    }

  open var stretchMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTUREBUTTON_GET_STRETCH_MODE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTUREBUTTON_SET_STRETCH_MODE,
          NIL)
    }

  open var textureClickMask: BitMap?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTUREBUTTON_GET_TEXTURE_CLICK_MASK, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as BitMap?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTUREBUTTON_SET_TEXTURE_CLICK_MASK, NIL)
    }

  open var textureDisabled: Texture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTUREBUTTON_GET_TEXTURE_DISABLED, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TEXTUREBUTTON_SET_TEXTURE_DISABLED, NIL)
    }

  open var textureFocused: Texture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTUREBUTTON_GET_TEXTURE_FOCUSED,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTUREBUTTON_SET_TEXTURE_FOCUSED,
          NIL)
    }

  open var textureHover: Texture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTUREBUTTON_GET_TEXTURE_HOVER,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTUREBUTTON_SET_TEXTURE_HOVER,
          NIL)
    }

  open var textureNormal: Texture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTUREBUTTON_GET_TEXTURE_NORMAL,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTUREBUTTON_SET_TEXTURE_NORMAL,
          NIL)
    }

  open var texturePressed: Texture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTUREBUTTON_GET_TEXTURE_PRESSED,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTUREBUTTON_SET_TEXTURE_PRESSED,
          NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_TEXTUREBUTTON)

  enum class StretchMode(
    id: Long
  ) {
    STRETCH_SCALE(0),

    STRETCH_TILE(1),

    STRETCH_KEEP(2),

    STRETCH_KEEP_CENTERED(3),

    STRETCH_KEEP_ASPECT(4),

    STRETCH_KEEP_ASPECT_CENTERED(5),

    STRETCH_KEEP_ASPECT_COVERED(6);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val STRETCH_KEEP: Long = 2

    final const val STRETCH_KEEP_ASPECT: Long = 4

    final const val STRETCH_KEEP_ASPECT_CENTERED: Long = 5

    final const val STRETCH_KEEP_ASPECT_COVERED: Long = 6

    final const val STRETCH_KEEP_CENTERED: Long = 3

    final const val STRETCH_SCALE: Long = 0

    final const val STRETCH_TILE: Long = 1
  }
}
