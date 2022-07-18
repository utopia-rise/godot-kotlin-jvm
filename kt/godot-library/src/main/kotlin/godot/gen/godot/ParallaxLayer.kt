// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
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
public open class ParallaxLayer : Node2D() {
  /**
   * Multiplies the ParallaxLayer's motion. If an axis is set to `0`, it will not scroll.
   */
  public var motionScale: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_PARALLAXLAYER_GET_MOTION_SCALE,
          VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_PARALLAXLAYER_SET_MOTION_SCALE,
          NIL.ordinal)
    }

  /**
   * The ParallaxLayer's offset relative to the parent ParallaxBackground's [godot.ParallaxBackground.scrollOffset].
   */
  public var motionOffset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_PARALLAXLAYER_GET_MOTION_OFFSET,
          VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_PARALLAXLAYER_SET_MOTION_OFFSET,
          NIL.ordinal)
    }

  /**
   * The ParallaxLayer's [godot.Texture2D] mirroring. Useful for creating an infinite scrolling background. If an axis is set to `0`, the [godot.Texture2D] will not be mirrored.
   */
  public var motionMirroring: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_PARALLAXLAYER_GET_MIRRORING,
          VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_PARALLAXLAYER_SET_MIRRORING,
          NIL.ordinal)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_PARALLAXLAYER)
  }

  public companion object
}
