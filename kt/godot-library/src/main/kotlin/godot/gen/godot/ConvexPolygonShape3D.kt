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
 * A 3D convex polyhedron shape used for physics collision.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/675](https://godotengine.org/asset-library/asset/675)
 *
 * A 3D convex polyhedron shape, intended for use in physics. Usually used to provide a shape for a [godot.CollisionShape3D].
 *
 * [godot.ConvexPolygonShape3D] is *solid*, which means it detects collisions from objects that are fully inside it, unlike [godot.ConcavePolygonShape3D] which is hollow. This makes it more suitable for both detection and physics.
 *
 * **Convex decomposition:** A concave polyhedron can be split up into several convex polyhedra. This allows dynamic physics bodies to have complex concave collisions (at a performance cost) and can be achieved by using several [godot.ConvexPolygonShape3D] nodes. To generate a convex decomposition from a mesh, select the [godot.MeshInstance3D] node, go to the **Mesh** menu that appears above the viewport, and choose **Create Multiple Convex Collision Siblings**. Alternatively, [godot.MeshInstance3D.createMultipleConvexCollisions] can be called in a script to perform this decomposition at run-time.
 *
 * **Performance:** [godot.ConvexPolygonShape3D] is faster to check collisions against compared to [godot.ConcavePolygonShape3D], but it is slower than primitive collision shapes such as [godot.SphereShape3D] and [godot.BoxShape3D]. Its use should generally be limited to medium-sized objects that cannot have their collision accurately represented by primitive shapes.
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
      return (TransferContext.readReturnValue(PACKED_VECTOR3_ARRAY, false) as PackedVector3Array)
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
