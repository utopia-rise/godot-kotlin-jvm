// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.PackedVector3Array
import godot.core.VariantParser.NIL
import godot.core.VariantParser.PACKED_VECTOR3_ARRAY
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * A 3D convex polyhedron shape, intended for use in physics. Usually used to provide a shape for a
 * [CollisionShape3D].
 * [ConvexPolygonShape3D] is *solid*, which means it detects collisions from objects that are fully
 * inside it, unlike [ConcavePolygonShape3D] which is hollow. This makes it more suitable for both
 * detection and physics.
 * **Convex decomposition:** A concave polyhedron can be split up into several convex polyhedra.
 * This allows dynamic physics bodies to have complex concave collisions (at a performance cost) and
 * can be achieved by using several [ConvexPolygonShape3D] nodes. To generate a convex decomposition
 * from a mesh, select the [MeshInstance3D] node, go to the **Mesh** menu that appears above the
 * viewport, and choose **Create Multiple Convex Collision Siblings**. Alternatively,
 * [MeshInstance3D.createMultipleConvexCollisions] can be called in a script to perform this
 * decomposition at run-time.
 * **Performance:** [ConvexPolygonShape3D] is faster to check collisions against compared to
 * [ConcavePolygonShape3D], but it is slower than primitive collision shapes such as [SphereShape3D]
 * and [BoxShape3D]. Its use should generally be limited to medium-sized objects that cannot have their
 * collision accurately represented by primitive shapes.
 */
@GodotBaseType
public open class ConvexPolygonShape3D : Shape3D() {
  /**
   * The list of 3D points forming the convex polygon shape.
   */
  public final inline var points: PackedVector3Array
    @JvmName("pointsProperty")
    get() = getPoints()
    @JvmName("pointsProperty")
    set(`value`) {
      setPoints(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_CONVEXPOLYGONSHAPE3D, scriptIndex)
  }

  public final fun setPoints(points: PackedVector3Array): Unit {
    TransferContext.writeArguments(PACKED_VECTOR3_ARRAY to points)
    TransferContext.callMethod(ptr, MethodBindings.setPointsPtr, NIL)
  }

  public final fun getPoints(): PackedVector3Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPointsPtr, PACKED_VECTOR3_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR3_ARRAY) as PackedVector3Array)
  }

  public companion object

  internal object MethodBindings {
    public val setPointsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ConvexPolygonShape3D", "set_points", 334873810)

    public val getPointsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ConvexPolygonShape3D", "get_points", 497664490)
  }
}
