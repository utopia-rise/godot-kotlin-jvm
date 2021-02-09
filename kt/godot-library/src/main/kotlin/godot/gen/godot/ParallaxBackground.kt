// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.Transform2D
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
open class ParallaxBackground : CanvasLayer() {
  open var scrollBaseOffset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARALLAXBACKGROUND_GET_SCROLL_BASE_OFFSET, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARALLAXBACKGROUND_SET_SCROLL_BASE_OFFSET, NIL)
    }

  open var scrollBaseScale: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARALLAXBACKGROUND_GET_SCROLL_BASE_SCALE, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARALLAXBACKGROUND_SET_SCROLL_BASE_SCALE, NIL)
    }

  open var scrollIgnoreCameraZoom: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARALLAXBACKGROUND_GET_SCROLL_IGNORE_CAMERA_ZOOM, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARALLAXBACKGROUND_SET_SCROLL_IGNORE_CAMERA_ZOOM, NIL)
    }

  open var scrollLimitBegin: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARALLAXBACKGROUND_GET_SCROLL_LIMIT_BEGIN, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARALLAXBACKGROUND_SET_SCROLL_LIMIT_BEGIN, NIL)
    }

  open var scrollLimitEnd: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARALLAXBACKGROUND_GET_SCROLL_LIMIT_END, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARALLAXBACKGROUND_SET_SCROLL_LIMIT_END, NIL)
    }

  open var scrollOffset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARALLAXBACKGROUND_GET_SCROLL_OFFSET, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARALLAXBACKGROUND_SET_SCROLL_OFFSET, NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_PARALLAXBACKGROUND)

  open fun scrollBaseOffset(schedule: Vector2.() -> Unit): Vector2 = scrollBaseOffset.apply{
      schedule(this)
      scrollBaseOffset = this
  }


  open fun scrollBaseScale(schedule: Vector2.() -> Unit): Vector2 = scrollBaseScale.apply{
      schedule(this)
      scrollBaseScale = this
  }


  open fun scrollLimitBegin(schedule: Vector2.() -> Unit): Vector2 = scrollLimitBegin.apply{
      schedule(this)
      scrollLimitBegin = this
  }


  open fun scrollLimitEnd(schedule: Vector2.() -> Unit): Vector2 = scrollLimitEnd.apply{
      schedule(this)
      scrollLimitEnd = this
  }


  open fun scrollOffset(schedule: Vector2.() -> Unit): Vector2 = scrollOffset.apply{
      schedule(this)
      scrollOffset = this
  }


  open fun _cameraMoved(arg0: Transform2D, arg1: Vector2) {
  }
}
