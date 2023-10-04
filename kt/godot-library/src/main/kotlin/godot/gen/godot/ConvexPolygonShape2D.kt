// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedVector2Array
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_VECTOR2_ARRAY
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * A 2D convex polygon shape used for physics collision.
 *
 * A 2D convex polygon shape, intended for use in physics. Used internally in [godot.CollisionPolygon2D] when it's in `BUILD_SOLIDS` mode.
 *
 * [godot.ConvexPolygonShape2D] is *solid*, which means it detects collisions from objects that are fully inside it, unlike [godot.ConcavePolygonShape2D] which is hollow. This makes it more suitable for both detection and physics.
 *
 * **Convex decomposition:** A concave polygon can be split up into several convex polygons. This allows dynamic physics bodies to have complex concave collisions (at a performance cost) and can be achieved by using several [godot.ConvexPolygonShape2D] nodes or by using the [godot.CollisionPolygon2D] node in `BUILD_SOLIDS` mode. To generate a collision polygon from a sprite, select the [godot.Sprite2D] node, go to the **Sprite2D** menu that appears above the viewport, and choose **Create Polygon2D Sibling**.
 *
 * **Performance:** [godot.ConvexPolygonShape2D] is faster to check collisions against compared to [godot.ConcavePolygonShape2D], but it is slower than primitive collision shapes such as [godot.CircleShape2D] and [godot.RectangleShape2D]. Its use should generally be limited to medium-sized objects that cannot have their collision accurately represented by primitive shapes.
 */
@GodotBaseType
public open class ConvexPolygonShape2D : Shape2D() {
  /**
   * The polygon's list of vertices that form a convex hull. Can be in either clockwise or counterclockwise order.
   *
   * **Warning:** Only set this property to a list of points that actually form a convex hull. Use [setPointCloud] to generate the convex hull of an arbitrary set of points.
   */
  public var points: PackedVector2Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONVEXPOLYGONSHAPE2D_GET_POINTS,
          PACKED_VECTOR2_ARRAY)
      return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY, false) as PackedVector2Array)
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONVEXPOLYGONSHAPE2D_SET_POINTS,
          NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_CONVEXPOLYGONSHAPE2D, scriptIndex)
    return true
  }

  /**
   * Based on the set of points provided, this assigns the [points] property using the convex hull algorithm, removing all unneeded points. See [godot.Geometry2D.convexHull] for details.
   */
  public fun setPointCloud(pointCloud: PackedVector2Array): Unit {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to pointCloud)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_CONVEXPOLYGONSHAPE2D_SET_POINT_CLOUD, NIL)
  }

  public companion object
}
