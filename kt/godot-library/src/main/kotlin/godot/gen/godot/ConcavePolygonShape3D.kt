// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedVector3Array
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_VECTOR3_ARRAY
import kotlin.Boolean
import kotlin.Suppress
import kotlin.Unit

/**
 * Concave polygon shape resource (also called "trimesh") for 3D physics.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/675](https://godotengine.org/asset-library/asset/675)
 *
 * 3D concave polygon shape resource (also called "trimesh") to be added as a *direct* child of a [godot.PhysicsBody3D] or [godot.Area3D] using a [godot.CollisionShape3D] node. This shape is created by feeding a list of triangles. Despite its name, [godot.ConcavePolygonShape3D] can also store convex polygon shapes. However, unlike [godot.ConvexPolygonShape3D], [godot.ConcavePolygonShape3D] is *not* limited to storing convex shapes exclusively.
 *
 * **Note:** When used for collision, [godot.ConcavePolygonShape3D] is intended to work with static [godot.PhysicsBody3D] nodes like [godot.StaticBody3D] and will not work with [godot.CharacterBody3D] or [godot.RigidBody3D] with a mode other than Static.
 *
 * **Performance:** Due to its complexity, [godot.ConcavePolygonShape3D] is the slowest collision shape to check collisions against. Its use should generally be limited to level geometry. For convex geometry, using [godot.ConvexPolygonShape3D] will perform better. For dynamic physics bodies that need concave collision, several [godot.ConvexPolygonShape3D]s can be used to represent its collision by using convex decomposition; see [godot.ConvexPolygonShape3D]'s documentation for instructions. However, consider using primitive collision shapes such as [godot.SphereShape3D] or [godot.BoxShape3D] first.
 *
 * **Warning:** Using this shape for an [godot.Area3D] (via a [godot.CollisionShape3D] node, created e.g. by using the *Create Trimesh Collision Sibling* option in the *Mesh* menu that appears when selecting a [godot.MeshInstance3D] node) may give unexpected results: the area will only detect collisions with the triangle faces in the [godot.ConcavePolygonShape3D] (and not with any "inside" of the shape, for example); moreover it will only detect all such collisions if [backfaceCollision] is `true`.
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

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_CONCAVEPOLYGONSHAPE3D)
  }

  public companion object
}
