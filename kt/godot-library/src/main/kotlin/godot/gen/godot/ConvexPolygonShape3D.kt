// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedVector3Array
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_VECTOR3_ARRAY
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

/**
 * Convex polygon shape resource for 3D physics.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/675](https://godotengine.org/asset-library/asset/675)
 *
 * 3D convex polygon shape resource to be added as a *direct* child of a [godot.PhysicsBody3D] or [godot.Area3D] using a [godot.CollisionShape3D] node. Unlike [godot.ConcavePolygonShape3D], [godot.ConvexPolygonShape3D] cannot store concave polygon shapes. [godot.ConvexPolygonShape3D]s can be manually drawn in the editor using the [godot.CollisionPolygon3D] node.
 *
 * **Convex decomposition:** Concave objects' collisions can be represented accurately using *several* [godot.ConvexPolygonShape3D]s. This allows dynamic physics bodies to have complex concave collisions (at a performance cost). This is available in the editor by selecting the [godot.MeshInstance3D], going to the **Mesh** menu and choosing **Create Multiple Convex Collision Siblings**. Alternatively, [godot.MeshInstance3D.createMultipleConvexCollisions] can be called in a script to perform this decomposition at run-time.
 *
 * **Performance:** [godot.ConvexPolygonShape3D] is faster to check collisions against compared to [godot.ConcavePolygonShape3D], but it is slower than primitive collision shapes such as [godot.SphereShape3D] or [godot.BoxShape3D]. Its use should generally be limited to medium-sized objects that cannot have their collision accurately represented by a primitive shape.
 */
@GodotBaseType
public open class ConvexPolygonShape3D : Shape3D() {
  /**
   * The list of 3D points forming the convex polygon shape.
   */
  public var points: PackedVector3Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONVEXPOLYGONSHAPE3D_GET_POINTS,
          PACKED_VECTOR3_ARRAY)
      return TransferContext.readReturnValue(PACKED_VECTOR3_ARRAY, false) as PackedVector3Array
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_VECTOR3_ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONVEXPOLYGONSHAPE3D_SET_POINTS,
          NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_CONVEXPOLYGONSHAPE3D, scriptIndex)
    return true
  }

  public companion object
}
