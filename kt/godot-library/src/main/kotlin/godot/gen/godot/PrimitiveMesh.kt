// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.AABB
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import kotlin.Any
import kotlin.Boolean
import kotlin.Suppress
import kotlin.Unit

/**
 * Base class for all primitive meshes. Handles applying a [godot.Material] to a primitive mesh.
 * 
 * Base class for all primitive meshes. Handles applying a [godot.Material] to a primitive mesh. Examples include [godot.CapsuleMesh], [godot.CubeMesh], [godot.CylinderMesh], [godot.PlaneMesh], [godot.PrismMesh], [godot.QuadMesh], and [godot.SphereMesh].
 */
@GodotBaseType
open class PrimitiveMesh : Mesh() {
  /**
   * Overrides the [AABB] with one defined by user for use with frustum culling. Especially useful to avoid unnexpected culling when  using a shader to offset vertices.
   */
  open var customAabb: AABB
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PRIMITIVEMESH_GET_CUSTOM_AABB,
          godot.core.VariantType.AABB)
      return TransferContext.readReturnValue(godot.core.VariantType.AABB, false) as AABB
    }
    set(value) {
      TransferContext.writeArguments(godot.core.VariantType.AABB to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PRIMITIVEMESH_SET_CUSTOM_AABB,
          NIL)
    }

  /**
   * If set, the order of the vertices in each triangle are reversed resulting in the backside of the mesh being drawn.
   *
   * This gives the same result as using [godot.SpatialMaterial.CULL_BACK] in [godot.SpatialMaterial.paramsCullMode].
   */
  open var flipFaces: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PRIMITIVEMESH_GET_FLIP_FACES,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PRIMITIVEMESH_SET_FLIP_FACES, NIL)
    }

  /**
   * The current [godot.Material] of the primitive mesh.
   */
  open var material: Material?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PRIMITIVEMESH_GET_MATERIAL,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Material?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PRIMITIVEMESH_SET_MATERIAL, NIL)
    }

  override fun __new() {
    callConstructor(ENGINECLASS_PRIMITIVEMESH)
  }

  open fun customAabb(schedule: AABB.() -> Unit): AABB = customAabb.apply{
      schedule(this)
      customAabb = this
  }


  open fun _update() {
  }

  /**
   * Returns mesh arrays used to constitute surface of [godot.Mesh]. The result can be passed to [godot.ArrayMesh.addSurfaceFromArrays] to create a new surface. For example:
   *
   * ```
   * 				var c := CylinderMesh.new()
   * 				var arr_mesh := ArrayMesh.new()
   * 				arr_mesh.add_surface_from_arrays(Mesh.PRIMITIVE_TRIANGLES, c.get_mesh_arrays())
   * 				```
   */
  open fun getMeshArrays(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PRIMITIVEMESH_GET_MESH_ARRAYS,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }
}
