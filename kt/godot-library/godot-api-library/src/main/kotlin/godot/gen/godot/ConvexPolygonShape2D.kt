// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedVector2Array
import godot.core.VariantParser.NIL
import godot.core.VariantParser.PACKED_VECTOR2_ARRAY
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_CONVEXPOLYGONSHAPE2D_INDEX: Int = 210

/**
 * A 2D convex polygon shape, intended for use in physics. Used internally in [CollisionPolygon2D]
 * when it's in [CollisionPolygon2D.BUILD_SOLIDS] mode.
 * [ConvexPolygonShape2D] is *solid*, which means it detects collisions from objects that are fully
 * inside it, unlike [ConcavePolygonShape2D] which is hollow. This makes it more suitable for both
 * detection and physics.
 * **Convex decomposition:** A concave polygon can be split up into several convex polygons. This
 * allows dynamic physics bodies to have complex concave collisions (at a performance cost) and can be
 * achieved by using several [ConvexPolygonShape2D] nodes or by using the [CollisionPolygon2D] node in
 * [CollisionPolygon2D.BUILD_SOLIDS] mode. To generate a collision polygon from a sprite, select the
 * [Sprite2D] node, go to the **Sprite2D** menu that appears above the viewport, and choose **Create
 * Polygon2D Sibling**.
 * **Performance:** [ConvexPolygonShape2D] is faster to check collisions against compared to
 * [ConcavePolygonShape2D], but it is slower than primitive collision shapes such as [CircleShape2D]
 * and [RectangleShape2D]. Its use should generally be limited to medium-sized objects that cannot have
 * their collision accurately represented by primitive shapes.
 */
@GodotBaseType
public open class ConvexPolygonShape2D : Shape2D() {
  /**
   * The polygon's list of vertices that form a convex hull. Can be in either clockwise or
   * counterclockwise order.
   * **Warning:** Only set this property to a list of points that actually form a convex hull. Use
   * [setPointCloud] to generate the convex hull of an arbitrary set of points.
   */
  public final inline var points: PackedVector2Array
    @JvmName("pointsProperty")
    get() = getPoints()
    @JvmName("pointsProperty")
    set(`value`) {
      setPoints(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_CONVEXPOLYGONSHAPE2D_INDEX, scriptIndex)
  }

  /**
   * Based on the set of points provided, this assigns the [points] property using the convex hull
   * algorithm, removing all unneeded points. See [Geometry2D.convexHull] for details.
   */
  public final fun setPointCloud(pointCloud: PackedVector2Array): Unit {
    Internals.writeArguments(PACKED_VECTOR2_ARRAY to pointCloud)
    Internals.callMethod(rawPtr, MethodBindings.setPointCloudPtr, NIL)
  }

  public final fun setPoints(points: PackedVector2Array): Unit {
    Internals.writeArguments(PACKED_VECTOR2_ARRAY to points)
    Internals.callMethod(rawPtr, MethodBindings.setPointsPtr, NIL)
  }

  public final fun getPoints(): PackedVector2Array {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getPointsPtr, PACKED_VECTOR2_ARRAY)
    return (Internals.readReturnValue(PACKED_VECTOR2_ARRAY) as PackedVector2Array)
  }

  public companion object

  public object MethodBindings {
    internal val setPointCloudPtr: VoidPtr =
        Internals.getMethodBindPtr("ConvexPolygonShape2D", "set_point_cloud", 1509147220)

    internal val setPointsPtr: VoidPtr =
        Internals.getMethodBindPtr("ConvexPolygonShape2D", "set_points", 1509147220)

    internal val getPointsPtr: VoidPtr =
        Internals.getMethodBindPtr("ConvexPolygonShape2D", "get_points", 2961356807)
  }
}
