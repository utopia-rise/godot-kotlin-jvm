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
 * Convex polygon shape resource for 2D physics.
 *
 * 2D convex polygon shape to be added as a *direct* child of a [godot.PhysicsBody2D] or [godot.Area2D] using a [godot.CollisionShape2D] node. A convex polygon, whatever its shape, is internally decomposed into as many convex polygons as needed to ensure all collision checks against it are always done on convex polygons (which are faster to check). See also [godot.CollisionPolygon2D].
 *
 * The main difference between a [godot.ConvexPolygonShape2D] and a [godot.ConcavePolygonShape2D] is that a concave polygon assumes it is concave and uses a more complex method of collision detection, and a convex one forces itself to be convex to speed up collision detection.
 *
 * **Performance:** [godot.ConvexPolygonShape2D] is faster to check collisions against compared to [godot.ConcavePolygonShape2D], but it is slower than primitive collision shapes such as [godot.CircleShape2D] or [godot.RectangleShape2D]. Its use should generally be limited to medium-sized objects that cannot have their collision accurately represented by a primitive shape.
 */
@GodotBaseType
public open class ConvexPolygonShape2D : Shape2D() {
  /**
   * The polygon's list of vertices. Can be in either clockwise or counterclockwise order. Only set this property with convex hull points, use [setPointCloud] to generate a convex hull shape from concave shape points.
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
   * Based on the set of points provided, this creates and assigns the [points] property using the convex hull algorithm. Removing all unneeded points. See [godot.Geometry2D.convexHull] for details.
   */
  public fun setPointCloud(pointCloud: PackedVector2Array): Unit {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to pointCloud)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_CONVEXPOLYGONSHAPE2D_SET_POINT_CLOUD, NIL)
  }

  public companion object
}
