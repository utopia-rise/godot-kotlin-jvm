// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.Dictionary
import godot.core.PackedVector3Array
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DICTIONARY
import godot.core.VariantParser.PACKED_VECTOR3_ARRAY
import godot.core.VariantParser.VECTOR3
import godot.core.Vector3
import kotlin.Any
import kotlin.Boolean
import kotlin.Suppress
import kotlin.Unit

/**
 * Creates a bounding volume hierarchy (BVH) tree structure around triangle geometry.
 *
 * The triangle BVH tree can be used for efficient intersection queries without involving a physics
 * engine.
 *
 * For example, this can be used in editor tools to select objects with complex shapes based on the
 * mouse cursor position.
 *
 * **Performance:** Creating the BVH tree for complex geometry is a slow process and best done in a
 * background thread.
 */
@GodotBaseType
public open class TriangleMesh : RefCounted() {
  public override fun new(scriptPtr: VoidPtr): Unit {
    createNativeObject(715, scriptPtr)
  }

  /**
   * Creates the BVH tree from an array of faces. Each 3 vertices of the input [faces] array
   * represent one triangle (face).
   *
   * Returns `true` if the tree is successfully built, `false` otherwise.
   */
  public final fun createFromFaces(faces: PackedVector3Array): Boolean {
    TransferContext.writeArguments(PACKED_VECTOR3_ARRAY to faces)
    TransferContext.callMethod(ptr, MethodBindings.createFromFacesPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns a copy of the geometry faces. Each 3 vertices of the array represent one triangle
   * (face).
   */
  public final fun getFaces(): PackedVector3Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFacesPtr, PACKED_VECTOR3_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR3_ARRAY) as PackedVector3Array)
  }

  /**
   * Tests for intersection with a segment going from [begin] to [end].
   *
   * If an intersection with a triangle happens returns a [Dictionary] with the following fields:
   *
   * `position`: The position on the intersected triangle.
   *
   * `normal`: The normal of the intersected triangle.
   *
   * `face_index`: The index of the intersected triangle.
   *
   * Returns an empty [Dictionary] if no intersection happens.
   *
   * See also [intersectRay], which is similar but uses an infinite-length ray.
   */
  public final fun intersectSegment(begin: Vector3, end: Vector3): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(VECTOR3 to begin, VECTOR3 to end)
    TransferContext.callMethod(ptr, MethodBindings.intersectSegmentPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY) as Dictionary<Any?, Any?>)
  }

  /**
   * Tests for intersection with a ray starting at [begin] and facing [dir] and extending toward
   * infinity.
   *
   * If an intersection with a triangle happens, returns a [Dictionary] with the following fields:
   *
   * `position`: The position on the intersected triangle.
   *
   * `normal`: The normal of the intersected triangle.
   *
   * `face_index`: The index of the intersected triangle.
   *
   * Returns an empty [Dictionary] if no intersection happens.
   *
   * See also [intersectSegment], which is similar but uses a finite-length segment.
   */
  public final fun intersectRay(begin: Vector3, dir: Vector3): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(VECTOR3 to begin, VECTOR3 to dir)
    TransferContext.callMethod(ptr, MethodBindings.intersectRayPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY) as Dictionary<Any?, Any?>)
  }

  public companion object

  public object MethodBindings {
    internal val createFromFacesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TriangleMesh", "create_from_faces", 2637816732)

    internal val getFacesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TriangleMesh", "get_faces", 497664490)

    internal val intersectSegmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TriangleMesh", "intersect_segment", 3648293151)

    internal val intersectRayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TriangleMesh", "intersect_ray", 3648293151)
  }
}
