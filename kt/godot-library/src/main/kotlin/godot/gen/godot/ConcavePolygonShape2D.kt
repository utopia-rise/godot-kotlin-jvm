// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedVector2Array
import godot.core.TransferContext
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_VECTOR2_ARRAY
import kotlin.Suppress
import kotlin.Unit

/**
 * Concave polygon shape resource for 2D physics.
 *
 * 2D concave polygon shape to be added as a *direct* child of a [godot.PhysicsBody2D] or [godot.Area2D] using a [godot.CollisionShape2D] node. It is made out of segments and is optimal for complex polygonal concave collisions. However, it is not advised to use for [godot.RigidBody2D] nodes. A CollisionPolygon2D in convex decomposition mode (solids) or several convex objects are advised for that instead. Otherwise, a concave polygon 2D shape is better for static collisions.
 *
 * The main difference between a [godot.ConvexPolygonShape2D] and a [godot.ConcavePolygonShape2D] is that a concave polygon assumes it is concave and uses a more complex method of collision detection, and a convex one forces itself to be convex to speed up collision detection.
 *
 * **Performance:** Due to its complexity, [godot.ConcavePolygonShape2D] is the slowest collision shape to check collisions against. Its use should generally be limited to level geometry. For convex geometry, using [godot.ConvexPolygonShape2D] will perform better. For dynamic physics bodies that need concave collision, several [godot.ConvexPolygonShape2D]s can be used to represent its collision by using convex decomposition; see [godot.ConvexPolygonShape2D]'s documentation for instructions. However, consider using primitive collision shapes such as [godot.CircleShape2D] or [godot.RectangleShape2D] first.
 *
 * **Warning:** Using this shape for an [godot.Area2D] (via a [godot.CollisionShape2D] node) may give unexpected results: the area will only detect collisions with the segments in the [godot.ConcavePolygonShape2D] (and not with any "inside" of the shape, for example).
 */
@GodotBaseType
public open class ConcavePolygonShape2D : Shape2D() {
  /**
   * The array of points that make up the [godot.ConcavePolygonShape2D]'s line segments.
   */
  public var segments: PackedVector2Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CONCAVEPOLYGONSHAPE2D_GET_SEGMENTS, PACKED_VECTOR2_ARRAY)
      return TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY, false) as PackedVector2Array
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CONCAVEPOLYGONSHAPE2D_SET_SEGMENTS, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_CONCAVEPOLYGONSHAPE2D)
  }

  public companion object
}
