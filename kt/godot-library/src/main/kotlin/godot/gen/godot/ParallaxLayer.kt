// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
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
  @CoreTypeLocalCopy
  public var motionScale: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARALLAXLAYER_GET_MOTION_SCALE,
          VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARALLAXLAYER_SET_MOTION_SCALE,
          NIL)
    }

  /**
   * The ParallaxLayer's offset relative to the parent ParallaxBackground's [godot.ParallaxBackground.scrollOffset].
   */
  @CoreTypeLocalCopy
  public var motionOffset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARALLAXLAYER_GET_MOTION_OFFSET,
          VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARALLAXLAYER_SET_MOTION_OFFSET,
          NIL)
    }

  /**
   * The ParallaxLayer's [godot.Texture2D] repeating. Useful for creating an infinite scrolling background. If an axis is set to `0`, the [godot.Texture2D] will not be repeated.
   *
   * If the length of the viewport axis is bigger than twice the repeated axis size, it will not repeat infinitely, as the parallax layer only draws 2 instances of the texture at any given time.
   *
   * **Note:** Despite its name, the texture will not be mirrored, it will simply be repeated.
   */
  @CoreTypeLocalCopy
  public var motionMirroring: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARALLAXLAYER_GET_MIRRORING,
          VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARALLAXLAYER_SET_MIRRORING, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_PARALLAXLAYER, scriptIndex)
    return true
  }

  /**
   * Multiplies the ParallaxLayer's motion. If an axis is set to `0`, it will not scroll.
   *
   * This is a helper function to make dealing with local copies easier. 
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = parallaxlayer.motionScale
   * //Your changes
   * parallaxlayer.motionScale = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun motionScaleMutate(block: Vector2.() -> Unit): Vector2 = motionScale.apply{
      block(this)
      motionScale = this
  }


  /**
   * The ParallaxLayer's offset relative to the parent ParallaxBackground's [godot.ParallaxBackground.scrollOffset].
   *
   * This is a helper function to make dealing with local copies easier. 
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = parallaxlayer.motionOffset
   * //Your changes
   * parallaxlayer.motionOffset = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun motionOffsetMutate(block: Vector2.() -> Unit): Vector2 = motionOffset.apply{
      block(this)
      motionOffset = this
  }


  /**
   * The ParallaxLayer's [godot.Texture2D] repeating. Useful for creating an infinite scrolling background. If an axis is set to `0`, the [godot.Texture2D] will not be repeated.
   *
   * If the length of the viewport axis is bigger than twice the repeated axis size, it will not repeat infinitely, as the parallax layer only draws 2 instances of the texture at any given time.
   *
   * **Note:** Despite its name, the texture will not be mirrored, it will simply be repeated.
   *
   * This is a helper function to make dealing with local copies easier. 
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = parallaxlayer.motionMirroring
   * //Your changes
   * parallaxlayer.motionMirroring = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun motionMirroringMutate(block: Vector2.() -> Unit): Vector2 = motionMirroring.apply{
      block(this)
      motionMirroring = this
  }


  public companion object
}
