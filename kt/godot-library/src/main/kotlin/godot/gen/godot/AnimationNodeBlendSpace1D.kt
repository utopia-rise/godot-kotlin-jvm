// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * A resource used by [AnimationNodeBlendTree].
 * [AnimationNodeBlendSpace1D] represents a virtual axis on which any type of [AnimationRootNode]s
 * can be added using [addBlendPoint]. Outputs the linear blend of the two [AnimationRootNode]s
 * adjacent to the current value.
 * You can set the extents of the axis with [minSpace] and [maxSpace].
 */
@GodotBaseType
public open class AnimationNodeBlendSpace1D : AnimationRootNode() {
  /**
   * The blend space's axis's lower limit for the points' position. See [addBlendPoint].
   */
  public var minSpace: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMinSpacePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setMinSpacePtr, NIL)
    }

  /**
   * The blend space's axis's upper limit for the points' position. See [addBlendPoint].
   */
  public var maxSpace: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMaxSpacePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setMaxSpacePtr, NIL)
    }

  /**
   * Position increment to snap to when moving a point on the axis.
   */
  public var snap: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSnapPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSnapPtr, NIL)
    }

  /**
   * Label of the virtual axis of the blend space.
   */
  public var valueLabel: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getValueLabelPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setValueLabelPtr, NIL)
    }

  /**
   * Controls the interpolation between animations. See [BlendMode] constants.
   */
  public var blendMode: BlendMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBlendModePtr, LONG)
      return AnimationNodeBlendSpace1D.BlendMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setBlendModePtr, NIL)
    }

  /**
   * If `false`, the blended animations' frame are stopped when the blend value is `0`.
   * If `true`, forcing the blended animations to advance frame.
   */
  public var sync: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isUsingSyncPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUseSyncPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_ANIMATIONNODEBLENDSPACE1D, scriptIndex)
  }

  /**
   * Adds a new point that represents a [node] on the virtual axis at a given position set by [pos].
   * You can insert it at a specific index using the [atIndex] argument. If you use the default value
   * for [atIndex], the point is inserted at the end of the blend points array.
   */
  @JvmOverloads
  public fun addBlendPoint(
    node: AnimationRootNode,
    pos: Float,
    atIndex: Int = -1,
  ): Unit {
    TransferContext.writeArguments(OBJECT to node, DOUBLE to pos.toDouble(), LONG to atIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addBlendPointPtr, NIL)
  }

  /**
   * Updates the position of the point at index [point] on the blend axis.
   */
  public fun setBlendPointPosition(point: Int, pos: Float): Unit {
    TransferContext.writeArguments(LONG to point.toLong(), DOUBLE to pos.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setBlendPointPositionPtr, NIL)
  }

  /**
   * Returns the position of the point at index [point].
   */
  public fun getBlendPointPosition(point: Int): Float {
    TransferContext.writeArguments(LONG to point.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getBlendPointPositionPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Changes the [AnimationNode] referenced by the point at index [point].
   */
  public fun setBlendPointNode(point: Int, node: AnimationRootNode): Unit {
    TransferContext.writeArguments(LONG to point.toLong(), OBJECT to node)
    TransferContext.callMethod(rawPtr, MethodBindings.setBlendPointNodePtr, NIL)
  }

  /**
   * Returns the [AnimationNode] referenced by the point at index [point].
   */
  public fun getBlendPointNode(point: Int): AnimationRootNode? {
    TransferContext.writeArguments(LONG to point.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getBlendPointNodePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?)
  }

  /**
   * Removes the point at index [point] from the blend axis.
   */
  public fun removeBlendPoint(point: Int): Unit {
    TransferContext.writeArguments(LONG to point.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeBlendPointPtr, NIL)
  }

  /**
   * Returns the number of points on the blend axis.
   */
  public fun getBlendPointCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getBlendPointCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public enum class BlendMode(
    id: Long,
  ) {
    /**
     * The interpolation between animations is linear.
     */
    BLEND_MODE_INTERPOLATED(0),
    /**
     * The blend space plays the animation of the animation node which blending position is closest
     * to. Useful for frame-by-frame 2D animations.
     */
    BLEND_MODE_DISCRETE(1),
    /**
     * Similar to [BLEND_MODE_DISCRETE], but starts the new animation at the last animation's
     * playback position.
     */
    BLEND_MODE_DISCRETE_CARRY(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): BlendMode = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val addBlendPointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace1D", "add_blend_point")

    public val setBlendPointPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace1D", "set_blend_point_position")

    public val getBlendPointPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace1D", "get_blend_point_position")

    public val setBlendPointNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace1D", "set_blend_point_node")

    public val getBlendPointNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace1D", "get_blend_point_node")

    public val removeBlendPointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace1D", "remove_blend_point")

    public val getBlendPointCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace1D", "get_blend_point_count")

    public val setMinSpacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace1D", "set_min_space")

    public val getMinSpacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace1D", "get_min_space")

    public val setMaxSpacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace1D", "set_max_space")

    public val getMaxSpacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace1D", "get_max_space")

    public val setSnapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace1D", "set_snap")

    public val getSnapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace1D", "get_snap")

    public val setValueLabelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace1D", "set_value_label")

    public val getValueLabelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace1D", "get_value_label")

    public val setBlendModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace1D", "set_blend_mode")

    public val getBlendModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace1D", "get_blend_mode")

    public val setUseSyncPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace1D", "set_use_sync")

    public val isUsingSyncPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace1D", "is_using_sync")
  }
}
