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
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * Editor-only helper for setting up root motion in [godot.AnimationTree].
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/animation/animation_tree.html#root-motion]($DOCS_URL/tutorials/animation/animation_tree.html#root-motion)
 *
 * *Root motion* refers to an animation technique where a mesh's skeleton is used to give impulse to a character. When working with 3D animations, a popular technique is for animators to use the root skeleton bone to give motion to the rest of the skeleton. This allows animating characters in a way where steps actually match the floor below. It also allows precise interaction with objects during cinematics. See also [godot.AnimationTree].
 *
 * **Note:** [godot.RootMotionView] is only visible in the editor. It will be hidden automatically in the running project.
 */
@GodotBaseType
public open class RootMotionView : VisualInstance3D() {
  /**
   * Path to an [godot.AnimationTree] node to use as a basis for root motion.
   */
  public var animationPath: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAnimationPathPtr, NODE_PATH)
      return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAnimationPathPtr, NIL)
    }

  /**
   * The grid's color.
   */
  @CoreTypeLocalCopy
  public var color: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getColorPtr, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setColorPtr, NIL)
    }

  /**
   * The grid's cell size in 3D units.
   */
  public var cellSize: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCellSizePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setCellSizePtr, NIL)
    }

  /**
   * The grid's radius in 3D units. The grid's opacity will fade gradually as the distance from the origin increases until this [radius] is reached.
   */
  public var radius: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRadiusPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setRadiusPtr, NIL)
    }

  /**
   * If `true`, the grid's points will all be on the same Y coordinate (*local* Y = 0). If `false`, the points' original Y coordinate is preserved.
   */
  public var zeroY: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getZeroYPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setZeroYPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_ROOTMOTIONVIEW, scriptIndex)
    return true
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
  public open fun colorMutate(block: Color.() -> Unit): Color = color.apply{
      block(this)
      color = this
  }


  public companion object

  internal object MethodBindings {
    public val setAnimationPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RootMotionView", "set_animation_path")

    public val getAnimationPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RootMotionView", "get_animation_path")

    public val setColorPtr: VoidPtr = TypeManager.getMethodBindPtr("RootMotionView", "set_color")

    public val getColorPtr: VoidPtr = TypeManager.getMethodBindPtr("RootMotionView", "get_color")

    public val setCellSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RootMotionView", "set_cell_size")

    public val getCellSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RootMotionView", "get_cell_size")

    public val setRadiusPtr: VoidPtr = TypeManager.getMethodBindPtr("RootMotionView", "set_radius")

    public val getRadiusPtr: VoidPtr = TypeManager.getMethodBindPtr("RootMotionView", "get_radius")

    public val setZeroYPtr: VoidPtr = TypeManager.getMethodBindPtr("RootMotionView", "set_zero_y")

    public val getZeroYPtr: VoidPtr = TypeManager.getMethodBindPtr("RootMotionView", "get_zero_y")
  }
}
