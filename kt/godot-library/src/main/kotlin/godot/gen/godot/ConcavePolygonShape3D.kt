// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedVector3Array
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_VECTOR3_ARRAY
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

/**
 * A 3D trimesh shape used for physics collision.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/675](https://godotengine.org/asset-library/asset/675)
 *
 * A 3D trimesh shape, intended for use in physics. Usually used to provide a shape for a [godot.CollisionShape3D].
 *
 * Being just a collection of interconnected triangles, [godot.ConcavePolygonShape3D] is the most freely configurable single 3D shape. It can be used to form polyhedra of any nature, or even shapes that don't enclose a volume. However, [godot.ConvexPolygonShape3D] is *hollow* even if the interconnected triangles do enclose a volume, which often makes it unsuitable for physics or detection.
 *
 * **Note:** When used for collision, [godot.ConcavePolygonShape3D] is intended to work with static [godot.CollisionShape3D] nodes like [godot.StaticBody3D] and will likely not behave well for [godot.CharacterBody3D]s or [godot.RigidBody3D]s in a mode other than Static.
 *
 * **Warning:** Physics bodies that are small have a chance to clip through this shape when moving fast. This happens because on one frame, the physics body may be on the "outside" of the shape, and on the next frame it may be "inside" it. [godot.ConcavePolygonShape3D] is hollow, so it won't detect a collision.
 *
 * **Performance:** Due to its complexity, [godot.ConcavePolygonShape3D] is the slowest 3D collision shape to check collisions against. Its use should generally be limited to level geometry. For convex geometry, [godot.ConvexPolygonShape3D] should be used. For dynamic physics bodies that need concave collision, several [godot.ConvexPolygonShape3D]s can be used to represent its collision by using convex decomposition; see [godot.ConvexPolygonShape3D]'s documentation for instructions.
 */
@GodotBaseType
public open class ConcavePolygonShape3D : Shape3D() {
  public var `data`: PackedVector3Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONCAVEPOLYGONSHAPE3D_GET_FACES,
          PACKED_VECTOR3_ARRAY)
      return TransferContext.readReturnValue(PACKED_VECTOR3_ARRAY, false) as PackedVector3Array
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_VECTOR3_ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONCAVEPOLYGONSHAPE3D_SET_FACES,
          NIL)
    }

  /**
   * If set to `true`, collisions occur on both sides of the concave shape faces. Otherwise they occur only along the face normals.
   */
  public var backfaceCollision: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CONCAVEPOLYGONSHAPE3D_IS_BACKFACE_COLLISION_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CONCAVEPOLYGONSHAPE3D_SET_BACKFACE_COLLISION_ENABLED, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_CONCAVEPOLYGONSHAPE3D, scriptIndex)
    return true
  }

  public companion object
}
