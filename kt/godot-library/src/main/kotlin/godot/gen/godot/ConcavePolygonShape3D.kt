// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedVector3Array
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_VECTOR3_ARRAY
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * A 3D trimesh shape, intended for use in physics. Usually used to provide a shape for a
 * [CollisionShape3D].
 * Being just a collection of interconnected triangles, [ConcavePolygonShape3D] is the most freely
 * configurable single 3D shape. It can be used to form polyhedra of any nature, or even shapes that
 * don't enclose a volume. However, [ConcavePolygonShape3D] is *hollow* even if the interconnected
 * triangles do enclose a volume, which often makes it unsuitable for physics or detection.
 * **Note:** When used for collision, [ConcavePolygonShape3D] is intended to work with static
 * [CollisionShape3D] nodes like [StaticBody3D] and will likely not behave well for [CharacterBody3D]s
 * or [RigidBody3D]s in a mode other than Static.
 * **Warning:** Physics bodies that are small have a chance to clip through this shape when moving
 * fast. This happens because on one frame, the physics body may be on the "outside" of the shape, and
 * on the next frame it may be "inside" it. [ConcavePolygonShape3D] is hollow, so it won't detect a
 * collision.
 * **Performance:** Due to its complexity, [ConcavePolygonShape3D] is the slowest 3D collision shape
 * to check collisions against. Its use should generally be limited to level geometry. For convex
 * geometry, [ConvexPolygonShape3D] should be used. For dynamic physics bodies that need concave
 * collision, several [ConvexPolygonShape3D]s can be used to represent its collision by using convex
 * decomposition; see [ConvexPolygonShape3D]'s documentation for instructions.
 */
@GodotBaseType
public open class ConcavePolygonShape3D : Shape3D() {
  public var `data`: PackedVector3Array
    @JvmName("dataProperty")
    get() = getFaces()
    @JvmName("dataProperty")
    set(`value`) {
      setFaces(value)
    }

  /**
   * If set to `true`, collisions occur on both sides of the concave shape faces. Otherwise they
   * occur only along the face normals.
   */
  public var backfaceCollision: Boolean
    @JvmName("backfaceCollisionProperty")
    get() = isBackfaceCollisionEnabled()
    @JvmName("backfaceCollisionProperty")
    set(`value`) {
      setBackfaceCollisionEnabled(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_CONCAVEPOLYGONSHAPE3D, scriptIndex)
  }

  /**
   * Sets the faces of the trimesh shape from an array of vertices. The [faces] array should be
   * composed of triples such that each triple of vertices defines a triangle.
   */
  public fun setFaces(faces: PackedVector3Array): Unit {
    TransferContext.writeArguments(PACKED_VECTOR3_ARRAY to faces)
    TransferContext.callMethod(rawPtr, MethodBindings.setFacesPtr, NIL)
  }

  /**
   * Returns the faces of the trimesh shape as an array of vertices. The array (of length divisible
   * by three) is naturally divided into triples; each triple of vertices defines a triangle.
   */
  public fun getFaces(): PackedVector3Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFacesPtr, PACKED_VECTOR3_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR3_ARRAY, false) as PackedVector3Array)
  }

  public fun setBackfaceCollisionEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.setBackfaceCollisionEnabledPtr, NIL)
  }

  public fun isBackfaceCollisionEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isBackfaceCollisionEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public companion object

  internal object MethodBindings {
    public val setFacesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ConcavePolygonShape3D", "set_faces", 334873810)

    public val getFacesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ConcavePolygonShape3D", "get_faces", 497664490)

    public val setBackfaceCollisionEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ConcavePolygonShape3D", "set_backface_collision_enabled", 2586408642)

    public val isBackfaceCollisionEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ConcavePolygonShape3D", "is_backface_collision_enabled", 36873697)
  }
}
