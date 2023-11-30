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

/**
 * A 2D polyline shape used for physics collision.
 *
 * A 2D polyline shape, intended for use in physics. Used internally in [godot.CollisionPolygon2D] when it's in [godot.CollisionPolygon2D.BUILD_SEGMENTS] mode.
 *
 * Being just a collection of interconnected line segments, [godot.ConcavePolygonShape2D] is the most freely configurable single 2D shape. It can be used to form polygons of any nature, or even shapes that don't enclose an area. However, [godot.ConcavePolygonShape2D] is *hollow* even if the interconnected line segments do enclose an area, which often makes it unsuitable for physics or detection.
 *
 * **Note:** When used for collision, [godot.ConcavePolygonShape2D] is intended to work with static [godot.CollisionShape2D] nodes like [godot.StaticBody2D] and will likely not behave well for [godot.CharacterBody2D]s or [godot.RigidBody2D]s in a mode other than Static.
 *
 * **Warning:** Physics bodies that are small have a chance to clip through this shape when moving fast. This happens because on one frame, the physics body may be on the "outside" of the shape, and on the next frame it may be "inside" it. [godot.ConcavePolygonShape2D] is hollow, so it won't detect a collision.
 *
 * **Performance:** Due to its complexity, [godot.ConcavePolygonShape2D] is the slowest 2D collision shape to check collisions against. Its use should generally be limited to level geometry. If the polyline is closed, [godot.CollisionPolygon2D]'s [godot.CollisionPolygon2D.BUILD_SOLIDS] mode can be used, which decomposes the polygon into convex ones; see [godot.ConvexPolygonShape2D]'s documentation for instructions.
 */
@GodotBaseType
public open class ConcavePolygonShape2D : Shape2D() {
  /**
   * The array of points that make up the [godot.ConcavePolygonShape2D]'s line segments. The array (of length divisible by two) is naturally divided into pairs (one pair for each segment); each pair consists of the starting point of a segment and the endpoint of a segment.
   */
  public var segments: PackedVector2Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CONCAVEPOLYGONSHAPE2D_GET_SEGMENTS, PACKED_VECTOR2_ARRAY)
      return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY, false) as PackedVector2Array)
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CONCAVEPOLYGONSHAPE2D_SET_SEGMENTS, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_CONCAVEPOLYGONSHAPE2D, scriptIndex)
    return true
  }

  public companion object
}
