// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.Rect2
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.RECT2
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.signals.Signal0
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
open class Sprite : Node2D() {
  val frameChanged: Signal0 by signal()

  val textureChanged: Signal0 by signal()

  open var centered: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE_GET_CENTERED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE_SET_CENTERED, NIL)
    }

  open var flipH: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE_GET_FLIP_H, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE_SET_FLIP_H, NIL)
    }

  open var flipV: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE_GET_FLIP_V, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE_SET_FLIP_V, NIL)
    }

  open var frame: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE_GET_FRAME, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE_SET_FRAME, NIL)
    }

  open var frameCoords: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE_GET_FRAME_COORDS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE_SET_FRAME_COORDS, NIL)
    }

  open var hframes: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE_GET_HFRAMES, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE_SET_HFRAMES, NIL)
    }

  open var normalMap: Texture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE_GET_NORMAL_MAP, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE_SET_NORMAL_MAP, NIL)
    }

  open var offset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE_GET_OFFSET, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE_SET_OFFSET, NIL)
    }

  open var regionEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE_GET_REGION_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE_SET_REGION_ENABLED, NIL)
    }

  open var regionFilterClip: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE_GET_REGION_FILTER_CLIP,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE_SET_REGION_FILTER_CLIP,
          NIL)
    }

  open var regionRect: Rect2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE_GET_REGION_RECT, RECT2)
      return TransferContext.readReturnValue(RECT2, false) as Rect2
    }
    set(value) {
      TransferContext.writeArguments(RECT2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE_SET_REGION_RECT, NIL)
    }

  open var texture: Texture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE_GET_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE_SET_TEXTURE, NIL)
    }

  open var vframes: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE_GET_VFRAMES, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE_SET_VFRAMES, NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_SPRITE)

  open fun frameCoords(schedule: Vector2.() -> Unit): Vector2 = frameCoords.apply{
      schedule(this)
      frameCoords = this
  }


  open fun offset(schedule: Vector2.() -> Unit): Vector2 = offset.apply{
      schedule(this)
      offset = this
  }


  open fun regionRect(schedule: Rect2.() -> Unit): Rect2 = regionRect.apply{
      schedule(this)
      regionRect = this
  }


  open fun _textureChanged() {
  }

  open fun getRect(): Rect2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE_GET_RECT, RECT2)
    return TransferContext.readReturnValue(RECT2, false) as Rect2
  }

  open fun isPixelOpaque(pos: Vector2): Boolean {
    TransferContext.writeArguments(VECTOR2 to pos)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE_IS_PIXEL_OPAQUE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }
}
