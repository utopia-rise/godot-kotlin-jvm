// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * A resource used by [AnimationNodeBlendTree].
 * [AnimationNodeBlendSpace1D] represents a virtual 2D space on which [AnimationRootNode]s are
 * placed. Outputs the linear blend of the three adjacent animations using a [Vector2] weight. Adjacent
 * in this context means the three [AnimationRootNode]s making up the triangle that contains the
 * current value.
 * You can add vertices to the blend space with [addBlendPoint] and automatically triangulate it by
 * setting [autoTriangles] to `true`. Otherwise, use [addTriangle] and [removeTriangle] to triangulate
 * the blend space by hand.
 */
@GodotBaseType
public open class AnimationNodeBlendSpace2D : AnimationRootNode() {
  /**
   * Emitted every time the blend space's triangles are created, removed, or when one of their
   * vertices changes position.
   */
  public val trianglesUpdated: Signal0 by signal()

  /**
   * If `true`, the blend space is triangulated automatically. The mesh updates every time you add
   * or remove points with [addBlendPoint] and [removeBlendPoint].
   */
  public var autoTriangles: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAutoTrianglesPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAutoTrianglesPtr, NIL)
    }

  /**
   * The blend space's X and Y axes' lower limit for the points' position. See [addBlendPoint].
   */
  @CoreTypeLocalCopy
  public var minSpace: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMinSpacePtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMinSpacePtr, NIL)
    }

  /**
   * The blend space's X and Y axes' upper limit for the points' position. See [addBlendPoint].
   */
  @CoreTypeLocalCopy
  public var maxSpace: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMaxSpacePtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMaxSpacePtr, NIL)
    }

  /**
   * Position increment to snap to when moving a point.
   */
  @CoreTypeLocalCopy
  public var snap: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSnapPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSnapPtr, NIL)
    }

  /**
   * Name of the blend space's X axis.
   */
  public var xLabel: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getXLabelPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setXLabelPtr, NIL)
    }

  /**
   * Name of the blend space's Y axis.
   */
  public var yLabel: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getYLabelPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setYLabelPtr, NIL)
    }

  /**
   * Controls the interpolation between animations. See [BlendMode] constants.
   */
  public var blendMode: BlendMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBlendModePtr, LONG)
      return AnimationNodeBlendSpace2D.BlendMode.from(TransferContext.readReturnValue(LONG) as Long)
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
    callConstructor(ENGINECLASS_ANIMATIONNODEBLENDSPACE2D, scriptIndex)
  }

  /**
   * The blend space's X and Y axes' lower limit for the points' position. See [addBlendPoint].
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
   * val myCoreType = animationnodeblendspace2d.minSpace
   * //Your changes
   * animationnodeblendspace2d.minSpace = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun minSpaceMutate(block: Vector2.() -> Unit): Vector2 = minSpace.apply{
      block(this)
      minSpace = this
  }


  /**
   * The blend space's X and Y axes' upper limit for the points' position. See [addBlendPoint].
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
   * val myCoreType = animationnodeblendspace2d.maxSpace
   * //Your changes
   * animationnodeblendspace2d.maxSpace = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun maxSpaceMutate(block: Vector2.() -> Unit): Vector2 = maxSpace.apply{
      block(this)
      maxSpace = this
  }


  /**
   * Position increment to snap to when moving a point.
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
   * val myCoreType = animationnodeblendspace2d.snap
   * //Your changes
   * animationnodeblendspace2d.snap = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun snapMutate(block: Vector2.() -> Unit): Vector2 = snap.apply{
      block(this)
      snap = this
  }


  /**
   * Adds a new point that represents a [node] at the position set by [pos]. You can insert it at a
   * specific index using the [atIndex] argument. If you use the default value for [atIndex], the point
   * is inserted at the end of the blend points array.
   */
  @JvmOverloads
  public fun addBlendPoint(
    node: AnimationRootNode,
    pos: Vector2,
    atIndex: Int = -1,
  ): Unit {
    TransferContext.writeArguments(OBJECT to node, VECTOR2 to pos, LONG to atIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addBlendPointPtr, NIL)
  }

  /**
   * Updates the position of the point at index [point] on the blend axis.
   */
  public fun setBlendPointPosition(point: Int, pos: Vector2): Unit {
    TransferContext.writeArguments(LONG to point.toLong(), VECTOR2 to pos)
    TransferContext.callMethod(rawPtr, MethodBindings.setBlendPointPositionPtr, NIL)
  }

  /**
   * Returns the position of the point at index [point].
   */
  public fun getBlendPointPosition(point: Int): Vector2 {
    TransferContext.writeArguments(LONG to point.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getBlendPointPositionPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Changes the [AnimationNode] referenced by the point at index [point].
   */
  public fun setBlendPointNode(point: Int, node: AnimationRootNode): Unit {
    TransferContext.writeArguments(LONG to point.toLong(), OBJECT to node)
    TransferContext.callMethod(rawPtr, MethodBindings.setBlendPointNodePtr, NIL)
  }

  /**
   * Returns the [AnimationRootNode] referenced by the point at index [point].
   */
  public fun getBlendPointNode(point: Int): AnimationRootNode? {
    TransferContext.writeArguments(LONG to point.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getBlendPointNodePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?)
  }

  /**
   * Removes the point at index [point] from the blend space.
   */
  public fun removeBlendPoint(point: Int): Unit {
    TransferContext.writeArguments(LONG to point.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeBlendPointPtr, NIL)
  }

  /**
   * Returns the number of points in the blend space.
   */
  public fun getBlendPointCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getBlendPointCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Creates a new triangle using three points [x], [y], and [z]. Triangles can overlap. You can
   * insert the triangle at a specific index using the [atIndex] argument. If you use the default value
   * for [atIndex], the point is inserted at the end of the blend points array.
   */
  @JvmOverloads
  public fun addTriangle(
    x: Int,
    y: Int,
    z: Int,
    atIndex: Int = -1,
  ): Unit {
    TransferContext.writeArguments(LONG to x.toLong(), LONG to y.toLong(), LONG to z.toLong(), LONG to atIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addTrianglePtr, NIL)
  }

  /**
   * Returns the position of the point at index [point] in the triangle of index [triangle].
   */
  public fun getTrianglePoint(triangle: Int, point: Int): Int {
    TransferContext.writeArguments(LONG to triangle.toLong(), LONG to point.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getTrianglePointPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Removes the triangle at index [triangle] from the blend space.
   */
  public fun removeTriangle(triangle: Int): Unit {
    TransferContext.writeArguments(LONG to triangle.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeTrianglePtr, NIL)
  }

  /**
   * Returns the number of triangles in the blend space.
   */
  public fun getTriangleCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTriangleCountPtr, LONG)
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
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace2D", "add_blend_point")

    public val setBlendPointPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace2D", "set_blend_point_position")

    public val getBlendPointPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace2D", "get_blend_point_position")

    public val setBlendPointNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace2D", "set_blend_point_node")

    public val getBlendPointNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace2D", "get_blend_point_node")

    public val removeBlendPointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace2D", "remove_blend_point")

    public val getBlendPointCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace2D", "get_blend_point_count")

    public val addTrianglePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace2D", "add_triangle")

    public val getTrianglePointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace2D", "get_triangle_point")

    public val removeTrianglePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace2D", "remove_triangle")

    public val getTriangleCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace2D", "get_triangle_count")

    public val setMinSpacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace2D", "set_min_space")

    public val getMinSpacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace2D", "get_min_space")

    public val setMaxSpacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace2D", "set_max_space")

    public val getMaxSpacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace2D", "get_max_space")

    public val setSnapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace2D", "set_snap")

    public val getSnapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace2D", "get_snap")

    public val setXLabelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace2D", "set_x_label")

    public val getXLabelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace2D", "get_x_label")

    public val setYLabelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace2D", "set_y_label")

    public val getYLabelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace2D", "get_y_label")

    public val setAutoTrianglesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace2D", "set_auto_triangles")

    public val getAutoTrianglesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace2D", "get_auto_triangles")

    public val setBlendModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace2D", "set_blend_mode")

    public val getBlendModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace2D", "get_blend_mode")

    public val setUseSyncPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace2D", "set_use_sync")

    public val isUsingSyncPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace2D", "is_using_sync")
  }
}
