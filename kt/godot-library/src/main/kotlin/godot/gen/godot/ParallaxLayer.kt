// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.common.interop.VoidPtr
import godot.core.TypeManager
import godot.core.VariantParser.NIL
import godot.core.VariantParser.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * A ParallaxLayer must be the child of a [ParallaxBackground] node. Each ParallaxLayer can be set
 * to move at different speeds relative to the camera movement or the [ParallaxBackground.scrollOffset]
 * value.
 * This node's children will be affected by its scroll offset.
 * **Note:** Any changes to this node's position and scale made after it enters the scene will be
 * ignored.
 */
@GodotBaseType
public open class ParallaxLayer : Node2D() {
  /**
   * Multiplies the ParallaxLayer's motion. If an axis is set to `0`, it will not scroll.
   */
  @CoreTypeLocalCopy
  public final inline var motionScale: Vector2
    @JvmName("motionScaleProperty")
    get() = getMotionScale()
    @JvmName("motionScaleProperty")
    set(`value`) {
      setMotionScale(value)
    }

  /**
   * The ParallaxLayer's offset relative to the parent ParallaxBackground's
   * [ParallaxBackground.scrollOffset].
   */
  @CoreTypeLocalCopy
  public final inline var motionOffset: Vector2
    @JvmName("motionOffsetProperty")
    get() = getMotionOffset()
    @JvmName("motionOffsetProperty")
    set(`value`) {
      setMotionOffset(value)
    }

  /**
   * The interval, in pixels, at which the [ParallaxLayer] is drawn repeatedly. Useful for creating
   * an infinitely scrolling background. If an axis is set to `0`, the [ParallaxLayer] will be drawn
   * only once along that direction.
   * **Note:** If you want the repetition to pixel-perfect match a [Texture2D] displayed by a child
   * node, you should account for any scale applied to the texture when defining this interval. For
   * example, if you use a child [Sprite2D] scaled to `0.5` to display a 600x600 texture, and want this
   * sprite to be repeated continuously horizontally, you should set the mirroring to `Vector2(300,
   * 0)`.
   * **Note:** If the length of the viewport axis is bigger than twice the repeated axis size, it
   * will not repeat infinitely, as the parallax layer only draws 2 instances of the layer at any given
   * time. The visibility window is calculated from the parent [ParallaxBackground]'s position, not the
   * layer's own position. So, if you use mirroring, **do not** change the [ParallaxLayer] position
   * relative to its parent. Instead, if you need to adjust the background's position, set the
   * [CanvasLayer.offset] property in the parent [ParallaxBackground].
   * **Note:** Despite the name, the layer will not be mirrored, it will only be repeated.
   */
  @CoreTypeLocalCopy
  public final inline var motionMirroring: Vector2
    @JvmName("motionMirroringProperty")
    get() = getMirroring()
    @JvmName("motionMirroringProperty")
    set(`value`) {
      setMirroring(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_PARALLAXLAYER, scriptIndex)
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
  public final fun motionScaleMutate(block: Vector2.() -> Unit): Vector2 = motionScale.apply{
      block(this)
      motionScale = this
  }


  /**
   * The ParallaxLayer's offset relative to the parent ParallaxBackground's
   * [ParallaxBackground.scrollOffset].
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
  public final fun motionOffsetMutate(block: Vector2.() -> Unit): Vector2 = motionOffset.apply{
      block(this)
      motionOffset = this
  }


  /**
   * The interval, in pixels, at which the [ParallaxLayer] is drawn repeatedly. Useful for creating
   * an infinitely scrolling background. If an axis is set to `0`, the [ParallaxLayer] will be drawn
   * only once along that direction.
   * **Note:** If you want the repetition to pixel-perfect match a [Texture2D] displayed by a child
   * node, you should account for any scale applied to the texture when defining this interval. For
   * example, if you use a child [Sprite2D] scaled to `0.5` to display a 600x600 texture, and want this
   * sprite to be repeated continuously horizontally, you should set the mirroring to `Vector2(300,
   * 0)`.
   * **Note:** If the length of the viewport axis is bigger than twice the repeated axis size, it
   * will not repeat infinitely, as the parallax layer only draws 2 instances of the layer at any given
   * time. The visibility window is calculated from the parent [ParallaxBackground]'s position, not the
   * layer's own position. So, if you use mirroring, **do not** change the [ParallaxLayer] position
   * relative to its parent. Instead, if you need to adjust the background's position, set the
   * [CanvasLayer.offset] property in the parent [ParallaxBackground].
   * **Note:** Despite the name, the layer will not be mirrored, it will only be repeated.
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
  public final fun motionMirroringMutate(block: Vector2.() -> Unit): Vector2 =
      motionMirroring.apply{
      block(this)
      motionMirroring = this
  }


  public final fun setMotionScale(scale: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to scale)
    TransferContext.callMethod(ptr, MethodBindings.setMotionScalePtr, NIL)
  }

  public final fun getMotionScale(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMotionScalePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun setMotionOffset(offset: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to offset)
    TransferContext.callMethod(ptr, MethodBindings.setMotionOffsetPtr, NIL)
  }

  public final fun getMotionOffset(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMotionOffsetPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun setMirroring(mirror: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to mirror)
    TransferContext.callMethod(ptr, MethodBindings.setMirroringPtr, NIL)
  }

  public final fun getMirroring(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMirroringPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  public companion object

  internal object MethodBindings {
    public val setMotionScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParallaxLayer", "set_motion_scale", 743155724)

    public val getMotionScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParallaxLayer", "get_motion_scale", 3341600327)

    public val setMotionOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParallaxLayer", "set_motion_offset", 743155724)

    public val getMotionOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParallaxLayer", "get_motion_offset", 3341600327)

    public val setMirroringPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParallaxLayer", "set_mirroring", 743155724)

    public val getMirroringPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParallaxLayer", "get_mirroring", 3341600327)
  }
}
