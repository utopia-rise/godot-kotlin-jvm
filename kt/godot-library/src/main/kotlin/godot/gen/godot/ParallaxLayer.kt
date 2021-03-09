// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import kotlin.Suppress
import kotlin.Unit

/**
 * A parallax scrolling layer to be used with [godot.ParallaxBackground].
 *
 * A ParallaxLayer must be the child of a [godot.ParallaxBackground] node. Each ParallaxLayer can be set to move at different speeds relative to the camera movement or the [godot.ParallaxBackground.scrollOffset] value.
 *
 * This node's children will be affected by its scroll offset.
 *
 * **Note:** Any changes to this node's position and scale made after it enters the scene will be ignored.
 */
@GodotBaseType
open class ParallaxLayer : Node2D() {
  /**
   * The ParallaxLayer's [godot.Texture] mirroring. Useful for creating an infinite scrolling background. If an axis is set to `0`, the [godot.Texture] will not be mirrored.
   */
  open var motionMirroring: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARALLAXLAYER_GET_MOTION_MIRRORING, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARALLAXLAYER_SET_MOTION_MIRRORING, NIL)
    }

  /**
   * The ParallaxLayer's offset relative to the parent ParallaxBackground's [godot.ParallaxBackground.scrollOffset].
   */
  open var motionOffset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARALLAXLAYER_GET_MOTION_OFFSET,
          VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARALLAXLAYER_SET_MOTION_OFFSET,
          NIL)
    }

  /**
   * Multiplies the ParallaxLayer's motion. If an axis is set to `0`, it will not scroll.
   */
  open var motionScale: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARALLAXLAYER_GET_MOTION_SCALE,
          VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARALLAXLAYER_SET_MOTION_SCALE,
          NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_PARALLAXLAYER)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  open fun motionMirroring(schedule: Vector2.() -> Unit): Vector2 = motionMirroring.apply{
      schedule(this)
      motionMirroring = this
  }


  open fun motionOffset(schedule: Vector2.() -> Unit): Vector2 = motionOffset.apply{
      schedule(this)
      motionOffset = this
  }


  open fun motionScale(schedule: Vector2.() -> Unit): Vector2 = motionScale.apply{
      schedule(this)
      motionScale = this
  }

}
