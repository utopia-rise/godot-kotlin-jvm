// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.Signal0
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING
import godot.core.VariantParser.VECTOR2
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

/**
 * A resource used by [AnimationNodeBlendTree].
 *
 * [AnimationNodeBlendSpace2D] represents a virtual 2D space on which [AnimationRootNode]s are
 * placed. Outputs the linear blend of the three adjacent animations using a [Vector2] weight. Adjacent
 * in this context means the three [AnimationRootNode]s making up the triangle that contains the
 * current value.
 *
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
  public val trianglesUpdated: Signal0 by Signal0

  /**
   * If `true`, the blend space is triangulated automatically. The mesh updates every time you add
   * or remove points with [addBlendPoint] and [removeBlendPoint].
   */
  public final inline var autoTriangles: Boolean
    @JvmName("autoTrianglesProperty")
    get() = getAutoTriangles()
    @JvmName("autoTrianglesProperty")
    set(`value`) {
      setAutoTriangles(value)
    }

  /**
   * The blend space's X and Y axes' lower limit for the points' position. See [addBlendPoint].
   *
   * **Warning:**
   * Be careful when trying to modify a local
   * [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this
   * getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again
   * afterward.
   */
  @CoreTypeLocalCopy
  public final inline var minSpace: Vector2
    @JvmName("minSpaceProperty")
    get() = getMinSpace()
    @JvmName("minSpaceProperty")
    set(`value`) {
      setMinSpace(value)
    }

  /**
   * The blend space's X and Y axes' upper limit for the points' position. See [addBlendPoint].
   *
   * **Warning:**
   * Be careful when trying to modify a local
   * [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this
   * getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again
   * afterward.
   */
  @CoreTypeLocalCopy
  public final inline var maxSpace: Vector2
    @JvmName("maxSpaceProperty")
    get() = getMaxSpace()
    @JvmName("maxSpaceProperty")
    set(`value`) {
      setMaxSpace(value)
    }

  /**
   * Position increment to snap to when moving a point.
   *
   * **Warning:**
   * Be careful when trying to modify a local
   * [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this
   * getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again
   * afterward.
   */
  @CoreTypeLocalCopy
  public final inline var snap: Vector2
    @JvmName("snapProperty")
    get() = getSnap()
    @JvmName("snapProperty")
    set(`value`) {
      setSnap(value)
    }

  /**
   * Name of the blend space's X axis.
   */
  public final inline var xLabel: String
    @JvmName("xLabelProperty")
    get() = getXLabel()
    @JvmName("xLabelProperty")
    set(`value`) {
      setXLabel(value)
    }

  /**
   * Name of the blend space's Y axis.
   */
  public final inline var yLabel: String
    @JvmName("yLabelProperty")
    get() = getYLabel()
    @JvmName("yLabelProperty")
    set(`value`) {
      setYLabel(value)
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
   *
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
    createNativeObject(22, scriptIndex)
  }

  /**
   * This is a helper function for [minSpace] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = animationnodeblendspace2d.minSpace
   * //Your changes
   * animationnodeblendspace2d.minSpace = myCoreType
   * ``````
   *
   * The blend space's X and Y axes' lower limit for the points' position. See [addBlendPoint].
   */
  @CoreTypeHelper
  public final fun minSpaceMutate(block: Vector2.() -> Unit): Vector2 = minSpace.apply {
     block(this)
     minSpace = this
  }

  /**
   * This is a helper function for [maxSpace] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = animationnodeblendspace2d.maxSpace
   * //Your changes
   * animationnodeblendspace2d.maxSpace = myCoreType
   * ``````
   *
   * The blend space's X and Y axes' upper limit for the points' position. See [addBlendPoint].
   */
  @CoreTypeHelper
  public final fun maxSpaceMutate(block: Vector2.() -> Unit): Vector2 = maxSpace.apply {
     block(this)
     maxSpace = this
  }

  /**
   * This is a helper function for [snap] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = animationnodeblendspace2d.snap
   * //Your changes
   * animationnodeblendspace2d.snap = myCoreType
   * ``````
   *
   * Position increment to snap to when moving a point.
   */
  @CoreTypeHelper
  public final fun snapMutate(block: Vector2.() -> Unit): Vector2 = snap.apply {
     block(this)
     snap = this
  }

  /**
   * Adds a new point that represents a [node] at the position set by [pos]. You can insert it at a
   * specific index using the [atIndex] argument. If you use the default value for [atIndex], the point
   * is inserted at the end of the blend points array.
   */
  @JvmOverloads
  public final fun addBlendPoint(
    node: AnimationRootNode?,
    pos: Vector2,
    atIndex: Int = -1,
  ): Unit {
    TransferContext.writeArguments(OBJECT to node, VECTOR2 to pos, LONG to atIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.addBlendPointPtr, NIL)
  }

  /**
   * Updates the position of the point at index [point] in the blend space.
   */
  public final fun setBlendPointPosition(point: Int, pos: Vector2): Unit {
    TransferContext.writeArguments(LONG to point.toLong(), VECTOR2 to pos)
    TransferContext.callMethod(ptr, MethodBindings.setBlendPointPositionPtr, NIL)
  }

  /**
   * Returns the position of the point at index [point].
   */
  public final fun getBlendPointPosition(point: Int): Vector2 {
    TransferContext.writeArguments(LONG to point.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getBlendPointPositionPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Changes the [AnimationNode] referenced by the point at index [point].
   */
  public final fun setBlendPointNode(point: Int, node: AnimationRootNode?): Unit {
    TransferContext.writeArguments(LONG to point.toLong(), OBJECT to node)
    TransferContext.callMethod(ptr, MethodBindings.setBlendPointNodePtr, NIL)
  }

  /**
   * Returns the [AnimationRootNode] referenced by the point at index [point].
   */
  public final fun getBlendPointNode(point: Int): AnimationRootNode? {
    TransferContext.writeArguments(LONG to point.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getBlendPointNodePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as AnimationRootNode?)
  }

  /**
   * Removes the point at index [point] from the blend space.
   */
  public final fun removeBlendPoint(point: Int): Unit {
    TransferContext.writeArguments(LONG to point.toLong())
    TransferContext.callMethod(ptr, MethodBindings.removeBlendPointPtr, NIL)
  }

  /**
   * Returns the number of points in the blend space.
   */
  public final fun getBlendPointCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBlendPointCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Creates a new triangle using three points [x], [y], and [z]. Triangles can overlap. You can
   * insert the triangle at a specific index using the [atIndex] argument. If you use the default value
   * for [atIndex], the point is inserted at the end of the blend points array.
   */
  @JvmOverloads
  public final fun addTriangle(
    x: Int,
    y: Int,
    z: Int,
    atIndex: Int = -1,
  ): Unit {
    TransferContext.writeArguments(LONG to x.toLong(), LONG to y.toLong(), LONG to z.toLong(), LONG to atIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.addTrianglePtr, NIL)
  }

  /**
   * Returns the position of the point at index [point] in the triangle of index [triangle].
   */
  public final fun getTrianglePoint(triangle: Int, point: Int): Int {
    TransferContext.writeArguments(LONG to triangle.toLong(), LONG to point.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getTrianglePointPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Removes the triangle at index [triangle] from the blend space.
   */
  public final fun removeTriangle(triangle: Int): Unit {
    TransferContext.writeArguments(LONG to triangle.toLong())
    TransferContext.callMethod(ptr, MethodBindings.removeTrianglePtr, NIL)
  }

  /**
   * Returns the number of triangles in the blend space.
   */
  public final fun getTriangleCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTriangleCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setMinSpace(minSpace: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to minSpace)
    TransferContext.callMethod(ptr, MethodBindings.setMinSpacePtr, NIL)
  }

  public final fun getMinSpace(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMinSpacePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun setMaxSpace(maxSpace: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to maxSpace)
    TransferContext.callMethod(ptr, MethodBindings.setMaxSpacePtr, NIL)
  }

  public final fun getMaxSpace(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMaxSpacePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun setSnap(snap: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to snap)
    TransferContext.callMethod(ptr, MethodBindings.setSnapPtr, NIL)
  }

  public final fun getSnap(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSnapPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun setXLabel(text: String): Unit {
    TransferContext.writeArguments(STRING to text)
    TransferContext.callMethod(ptr, MethodBindings.setXLabelPtr, NIL)
  }

  public final fun getXLabel(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getXLabelPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  public final fun setYLabel(text: String): Unit {
    TransferContext.writeArguments(STRING to text)
    TransferContext.callMethod(ptr, MethodBindings.setYLabelPtr, NIL)
  }

  public final fun getYLabel(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getYLabelPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  public final fun setAutoTriangles(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setAutoTrianglesPtr, NIL)
  }

  public final fun getAutoTriangles(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAutoTrianglesPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setBlendMode(mode: BlendMode): Unit {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(ptr, MethodBindings.setBlendModePtr, NIL)
  }

  public final fun getBlendMode(): BlendMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBlendModePtr, LONG)
    return BlendMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setUseSync(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setUseSyncPtr, NIL)
  }

  public final fun isUsingSync(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isUsingSyncPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public enum class BlendMode(
    id: Long,
  ) {
    /**
     * The interpolation between animations is linear.
     */
    INTERPOLATED(0),
    /**
     * The blend space plays the animation of the animation node which blending position is closest
     * to. Useful for frame-by-frame 2D animations.
     */
    DISCRETE(1),
    /**
     * Similar to [BLEND_MODE_DISCRETE], but starts the new animation at the last animation's
     * playback position.
     */
    DISCRETE_CARRY(2),
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

  public object MethodBindings {
    internal val addBlendPointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace2D", "add_blend_point", 402261981)

    internal val setBlendPointPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace2D", "set_blend_point_position", 163021252)

    internal val getBlendPointPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace2D", "get_blend_point_position", 2299179447)

    internal val setBlendPointNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace2D", "set_blend_point_node", 4240341528)

    internal val getBlendPointNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace2D", "get_blend_point_node", 665599029)

    internal val removeBlendPointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace2D", "remove_blend_point", 1286410249)

    internal val getBlendPointCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace2D", "get_blend_point_count", 3905245786)

    internal val addTrianglePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace2D", "add_triangle", 753017335)

    internal val getTrianglePointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace2D", "get_triangle_point", 50157827)

    internal val removeTrianglePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace2D", "remove_triangle", 1286410249)

    internal val getTriangleCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace2D", "get_triangle_count", 3905245786)

    internal val setMinSpacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace2D", "set_min_space", 743155724)

    internal val getMinSpacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace2D", "get_min_space", 3341600327)

    internal val setMaxSpacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace2D", "set_max_space", 743155724)

    internal val getMaxSpacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace2D", "get_max_space", 3341600327)

    internal val setSnapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace2D", "set_snap", 743155724)

    internal val getSnapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace2D", "get_snap", 3341600327)

    internal val setXLabelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace2D", "set_x_label", 83702148)

    internal val getXLabelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace2D", "get_x_label", 201670096)

    internal val setYLabelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace2D", "set_y_label", 83702148)

    internal val getYLabelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace2D", "get_y_label", 201670096)

    internal val setAutoTrianglesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace2D", "set_auto_triangles", 2586408642)

    internal val getAutoTrianglesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace2D", "get_auto_triangles", 36873697)

    internal val setBlendModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace2D", "set_blend_mode", 81193520)

    internal val getBlendModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace2D", "get_blend_mode", 1398433632)

    internal val setUseSyncPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace2D", "set_use_sync", 2586408642)

    internal val isUsingSyncPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeBlendSpace2D", "is_using_sync", 36873697)
  }
}
