// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.NodePath
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.COLOR
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.NIL
import godot.core.VariantParser.NODE_PATH
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_ROOTMOTIONVIEW_INDEX: Int = 502

/**
 * *Root motion* refers to an animation technique where a mesh's skeleton is used to give impulse to
 * a character. When working with 3D animations, a popular technique is for animators to use the root
 * skeleton bone to give motion to the rest of the skeleton. This allows animating characters in a way
 * where steps actually match the floor below. It also allows precise interaction with objects during
 * cinematics. See also [AnimationMixer].
 * **Note:** [RootMotionView] is only visible in the editor. It will be hidden automatically in the
 * running project.
 */
@GodotBaseType
public open class RootMotionView : VisualInstance3D() {
  /**
   * Path to an [AnimationMixer] node to use as a basis for root motion.
   */
  public final inline var animationPath: NodePath
    @JvmName("animationPathProperty")
    get() = getAnimationPath()
    @JvmName("animationPathProperty")
    set(`value`) {
      setAnimationPath(value)
    }

  /**
   * The grid's color.
   */
  @CoreTypeLocalCopy
  public final inline var color: Color
    @JvmName("colorProperty")
    get() = getColor()
    @JvmName("colorProperty")
    set(`value`) {
      setColor(value)
    }

  /**
   * The grid's cell size in 3D units.
   */
  public final inline var cellSize: Float
    @JvmName("cellSizeProperty")
    get() = getCellSize()
    @JvmName("cellSizeProperty")
    set(`value`) {
      setCellSize(value)
    }

  /**
   * The grid's radius in 3D units. The grid's opacity will fade gradually as the distance from the
   * origin increases until this [radius] is reached.
   */
  public final inline var radius: Float
    @JvmName("radiusProperty")
    get() = getRadius()
    @JvmName("radiusProperty")
    set(`value`) {
      setRadius(value)
    }

  /**
   * If `true`, the grid's points will all be on the same Y coordinate (*local* Y = 0). If `false`,
   * the points' original Y coordinate is preserved.
   */
  public final inline var zeroY: Boolean
    @JvmName("zeroYProperty")
    get() = getZeroY()
    @JvmName("zeroYProperty")
    set(`value`) {
      setZeroY(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_ROOTMOTIONVIEW_INDEX, scriptIndex)
  }

  /**
   * The grid's color.
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
   * val myCoreType = rootmotionview.color
   * //Your changes
   * rootmotionview.color = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun colorMutate(block: Color.() -> Unit): Color = color.apply{
      block(this)
      color = this
  }


  public final fun setAnimationPath(path: NodePath): Unit {
    Internals.writeArguments(NODE_PATH to path)
    Internals.callMethod(rawPtr, MethodBindings.setAnimationPathPtr, NIL)
  }

  public final fun getAnimationPath(): NodePath {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getAnimationPathPtr, NODE_PATH)
    return (Internals.readReturnValue(NODE_PATH) as NodePath)
  }

  public final fun setColor(color: Color): Unit {
    Internals.writeArguments(COLOR to color)
    Internals.callMethod(rawPtr, MethodBindings.setColorPtr, NIL)
  }

  public final fun getColor(): Color {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getColorPtr, COLOR)
    return (Internals.readReturnValue(COLOR) as Color)
  }

  public final fun setCellSize(size: Float): Unit {
    Internals.writeArguments(DOUBLE to size.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setCellSizePtr, NIL)
  }

  public final fun getCellSize(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCellSizePtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setRadius(size: Float): Unit {
    Internals.writeArguments(DOUBLE to size.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setRadiusPtr, NIL)
  }

  public final fun getRadius(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getRadiusPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setZeroY(enable: Boolean): Unit {
    Internals.writeArguments(BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setZeroYPtr, NIL)
  }

  public final fun getZeroY(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getZeroYPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public companion object

  internal object MethodBindings {
    public val setAnimationPathPtr: VoidPtr =
        Internals.getMethodBindPtr("RootMotionView", "set_animation_path", 1348162250)

    public val getAnimationPathPtr: VoidPtr =
        Internals.getMethodBindPtr("RootMotionView", "get_animation_path", 4075236667)

    public val setColorPtr: VoidPtr =
        Internals.getMethodBindPtr("RootMotionView", "set_color", 2920490490)

    public val getColorPtr: VoidPtr =
        Internals.getMethodBindPtr("RootMotionView", "get_color", 3444240500)

    public val setCellSizePtr: VoidPtr =
        Internals.getMethodBindPtr("RootMotionView", "set_cell_size", 373806689)

    public val getCellSizePtr: VoidPtr =
        Internals.getMethodBindPtr("RootMotionView", "get_cell_size", 1740695150)

    public val setRadiusPtr: VoidPtr =
        Internals.getMethodBindPtr("RootMotionView", "set_radius", 373806689)

    public val getRadiusPtr: VoidPtr =
        Internals.getMethodBindPtr("RootMotionView", "get_radius", 1740695150)

    public val setZeroYPtr: VoidPtr =
        Internals.getMethodBindPtr("RootMotionView", "set_zero_y", 2586408642)

    public val getZeroYPtr: VoidPtr =
        Internals.getMethodBindPtr("RootMotionView", "get_zero_y", 36873697)
  }
}
