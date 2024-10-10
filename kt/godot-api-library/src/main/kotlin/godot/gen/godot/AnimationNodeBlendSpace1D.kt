// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

private const val ENGINE_CLASS_ANIMATIONNODEBLENDSPACE1D_INDEX: Int = 57

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
  public final inline var minSpace: Float
    @JvmName("minSpaceProperty")
    get() = getMinSpace()
    @JvmName("minSpaceProperty")
    set(`value`) {
      setMinSpace(value)
    }

  /**
   * The blend space's axis's upper limit for the points' position. See [addBlendPoint].
   */
  public final inline var maxSpace: Float
    @JvmName("maxSpaceProperty")
    get() = getMaxSpace()
    @JvmName("maxSpaceProperty")
    set(`value`) {
      setMaxSpace(value)
    }

  /**
   * Position increment to snap to when moving a point on the axis.
   */
  public final inline var snap: Float
    @JvmName("snapProperty")
    get() = getSnap()
    @JvmName("snapProperty")
    set(`value`) {
      setSnap(value)
    }

  /**
   * Label of the virtual axis of the blend space.
   */
  public final inline var valueLabel: String
    @JvmName("valueLabelProperty")
    get() = getValueLabel()
    @JvmName("valueLabelProperty")
    set(`value`) {
      setValueLabel(value)
    }

  /**
   * Controls the interpolation between animations. See [BlendMode] constants.
   */
  public final inline var blendMode: BlendMode
    @JvmName("blendModeProperty")
    get() = getBlendMode()
    @JvmName("blendModeProperty")
    set(`value`) {
      setBlendMode(value)
    }

  /**
   * If `false`, the blended animations' frame are stopped when the blend value is `0`.
   * If `true`, forcing the blended animations to advance frame.
   */
  public final inline var sync: Boolean
    @JvmName("syncProperty")
    get() = isUsingSync()
    @JvmName("syncProperty")
    set(`value`) {
      setUseSync(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_ANIMATIONNODEBLENDSPACE1D_INDEX, scriptIndex)
  }

  /**
   * Adds a new point that represents a [node] on the virtual axis at a given position set by [pos].
   * You can insert it at a specific index using the [atIndex] argument. If you use the default value
   * for [atIndex], the point is inserted at the end of the blend points array.
   */
  @JvmOverloads
  public final fun addBlendPoint(
    node: AnimationRootNode?,
    pos: Float,
    atIndex: Int = -1,
  ): Unit {
    Internals.writeArguments(OBJECT to node, DOUBLE to pos.toDouble(), LONG to atIndex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.addBlendPointPtr, NIL)
  }

  /**
   * Updates the position of the point at index [point] on the blend axis.
   */
  public final fun setBlendPointPosition(point: Int, pos: Float): Unit {
    Internals.writeArguments(LONG to point.toLong(), DOUBLE to pos.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setBlendPointPositionPtr, NIL)
  }

  /**
   * Returns the position of the point at index [point].
   */
  public final fun getBlendPointPosition(point: Int): Float {
    Internals.writeArguments(LONG to point.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getBlendPointPositionPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Changes the [AnimationNode] referenced by the point at index [point].
   */
  public final fun setBlendPointNode(point: Int, node: AnimationRootNode?): Unit {
    Internals.writeArguments(LONG to point.toLong(), OBJECT to node)
    Internals.callMethod(rawPtr, MethodBindings.setBlendPointNodePtr, NIL)
  }

  /**
   * Returns the [AnimationNode] referenced by the point at index [point].
   */
  public final fun getBlendPointNode(point: Int): AnimationRootNode? {
    Internals.writeArguments(LONG to point.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getBlendPointNodePtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as AnimationRootNode?)
  }

  /**
   * Removes the point at index [point] from the blend axis.
   */
  public final fun removeBlendPoint(point: Int): Unit {
    Internals.writeArguments(LONG to point.toLong())
    Internals.callMethod(rawPtr, MethodBindings.removeBlendPointPtr, NIL)
  }

  /**
   * Returns the number of points on the blend axis.
   */
  public final fun getBlendPointCount(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getBlendPointCountPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setMinSpace(minSpace: Float): Unit {
    Internals.writeArguments(DOUBLE to minSpace.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setMinSpacePtr, NIL)
  }

  public final fun getMinSpace(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getMinSpacePtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setMaxSpace(maxSpace: Float): Unit {
    Internals.writeArguments(DOUBLE to maxSpace.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setMaxSpacePtr, NIL)
  }

  public final fun getMaxSpace(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getMaxSpacePtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setSnap(snap: Float): Unit {
    Internals.writeArguments(DOUBLE to snap.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setSnapPtr, NIL)
  }

  public final fun getSnap(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSnapPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setValueLabel(text: String): Unit {
    Internals.writeArguments(STRING to text)
    Internals.callMethod(rawPtr, MethodBindings.setValueLabelPtr, NIL)
  }

  public final fun getValueLabel(): String {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getValueLabelPtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  public final fun setBlendMode(mode: BlendMode): Unit {
    Internals.writeArguments(LONG to mode.id)
    Internals.callMethod(rawPtr, MethodBindings.setBlendModePtr, NIL)
  }

  public final fun getBlendMode(): BlendMode {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getBlendModePtr, LONG)
    return AnimationNodeBlendSpace1D.BlendMode.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setUseSync(enable: Boolean): Unit {
    Internals.writeArguments(BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setUseSyncPtr, NIL)
  }

  public final fun isUsingSync(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isUsingSyncPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
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
        Internals.getMethodBindPtr("AnimationNodeBlendSpace1D", "add_blend_point", 285050433)

    public val setBlendPointPositionPtr: VoidPtr =
        Internals.getMethodBindPtr("AnimationNodeBlendSpace1D", "set_blend_point_position", 1602489585)

    public val getBlendPointPositionPtr: VoidPtr =
        Internals.getMethodBindPtr("AnimationNodeBlendSpace1D", "get_blend_point_position", 2339986948)

    public val setBlendPointNodePtr: VoidPtr =
        Internals.getMethodBindPtr("AnimationNodeBlendSpace1D", "set_blend_point_node", 4240341528)

    public val getBlendPointNodePtr: VoidPtr =
        Internals.getMethodBindPtr("AnimationNodeBlendSpace1D", "get_blend_point_node", 665599029)

    public val removeBlendPointPtr: VoidPtr =
        Internals.getMethodBindPtr("AnimationNodeBlendSpace1D", "remove_blend_point", 1286410249)

    public val getBlendPointCountPtr: VoidPtr =
        Internals.getMethodBindPtr("AnimationNodeBlendSpace1D", "get_blend_point_count", 3905245786)

    public val setMinSpacePtr: VoidPtr =
        Internals.getMethodBindPtr("AnimationNodeBlendSpace1D", "set_min_space", 373806689)

    public val getMinSpacePtr: VoidPtr =
        Internals.getMethodBindPtr("AnimationNodeBlendSpace1D", "get_min_space", 1740695150)

    public val setMaxSpacePtr: VoidPtr =
        Internals.getMethodBindPtr("AnimationNodeBlendSpace1D", "set_max_space", 373806689)

    public val getMaxSpacePtr: VoidPtr =
        Internals.getMethodBindPtr("AnimationNodeBlendSpace1D", "get_max_space", 1740695150)

    public val setSnapPtr: VoidPtr =
        Internals.getMethodBindPtr("AnimationNodeBlendSpace1D", "set_snap", 373806689)

    public val getSnapPtr: VoidPtr =
        Internals.getMethodBindPtr("AnimationNodeBlendSpace1D", "get_snap", 1740695150)

    public val setValueLabelPtr: VoidPtr =
        Internals.getMethodBindPtr("AnimationNodeBlendSpace1D", "set_value_label", 83702148)

    public val getValueLabelPtr: VoidPtr =
        Internals.getMethodBindPtr("AnimationNodeBlendSpace1D", "get_value_label", 201670096)

    public val setBlendModePtr: VoidPtr =
        Internals.getMethodBindPtr("AnimationNodeBlendSpace1D", "set_blend_mode", 2600869457)

    public val getBlendModePtr: VoidPtr =
        Internals.getMethodBindPtr("AnimationNodeBlendSpace1D", "get_blend_mode", 1547667849)

    public val setUseSyncPtr: VoidPtr =
        Internals.getMethodBindPtr("AnimationNodeBlendSpace1D", "set_use_sync", 2586408642)

    public val isUsingSyncPtr: VoidPtr =
        Internals.getMethodBindPtr("AnimationNodeBlendSpace1D", "is_using_sync", 36873697)
  }
}
