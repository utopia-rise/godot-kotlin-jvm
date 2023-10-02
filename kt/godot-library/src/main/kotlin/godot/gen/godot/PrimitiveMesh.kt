// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.GodotBaseType
import godot.core.AABB
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit

/**
 * Base class for all primitive meshes. Handles applying a [godot.Material] to a primitive mesh.
 *
 * Base class for all primitive meshes. Handles applying a [godot.Material] to a primitive mesh. Examples include [godot.BoxMesh], [godot.CapsuleMesh], [godot.CylinderMesh], [godot.PlaneMesh], [godot.PrismMesh], and [godot.SphereMesh].
 */
@GodotBaseType
public open class PrimitiveMesh : Mesh() {
  /**
   * The current [godot.Material] of the primitive mesh.
   */
  public var material: Material?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PRIMITIVEMESH_GET_MATERIAL,
          OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Material?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PRIMITIVEMESH_SET_MATERIAL, NIL)
    }

  /**
   * Overrides the [AABB] with one defined by user for use with frustum culling. Especially useful to avoid unexpected culling when using a shader to offset vertices.
   */
  public var customAabb: AABB
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PRIMITIVEMESH_GET_CUSTOM_AABB,
          godot.core.VariantType.AABB)
      return (TransferContext.readReturnValue(godot.core.VariantType.AABB, false) as AABB)
    }
    set(`value`) {
      TransferContext.writeArguments(godot.core.VariantType.AABB to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PRIMITIVEMESH_SET_CUSTOM_AABB,
          NIL)
    }

  /**
   * If set, the order of the vertices in each triangle are reversed resulting in the backside of the mesh being drawn.
   *
   * This gives the same result as using [godot.BaseMaterial3D.CULL_FRONT] in [godot.BaseMaterial3D.cullMode].
   */
  public var flipFaces: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PRIMITIVEMESH_GET_FLIP_FACES,
          BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PRIMITIVEMESH_SET_FLIP_FACES, NIL)
    }

  /**
   * If set, generates UV2 UV coordinates applying a padding using the [uv2Padding] setting. UV2 is needed for lightmapping.
   */
  public var addUv2: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PRIMITIVEMESH_GET_ADD_UV2, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PRIMITIVEMESH_SET_ADD_UV2, NIL)
    }

  /**
   * If [addUv2] is set, specifies the padding in pixels applied along seams of the mesh. Lower padding values allow making better use of the lightmap texture (resulting in higher texel density), but may introduce visible lightmap bleeding along edges.
   *
   * If the size of the lightmap texture can't be determined when generating the mesh, UV2 is calculated assuming a texture size of 1024x1024.
   */
  public var uv2Padding: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PRIMITIVEMESH_GET_UV2_PADDING,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PRIMITIVEMESH_SET_UV2_PADDING,
          NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_PRIMITIVEMESH, scriptIndex)
    return true
  }

  /**
   * Overrides the [AABB] with one defined by user for use with frustum culling. Especially useful to avoid unexpected culling when using a shader to offset vertices.
   *
   * This is a helper function to make dealing with local copies easier. 
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = primitivemesh.customAabb
   * //Your changes
   * primitivemesh.customAabb = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun customAabb(block: AABB.() -> Unit): AABB = customAabb.apply{
      block(this)
      customAabb = this
  }


  /**
   *
   */
  public open fun _createMeshArray(): VariantArray<Any?> {
    throw NotImplementedError("_create_mesh_array is not implemented for PrimitiveMesh")
  }

  /**
   * Returns mesh arrays used to constitute surface of [godot.Mesh]. The result can be passed to [godot.ArrayMesh.addSurfaceFromArrays] to create a new surface. For example:
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * var c = CylinderMesh.new()
   *
   * var arr_mesh = ArrayMesh.new()
   *
   * arr_mesh.add_surface_from_arrays(Mesh.PRIMITIVE_TRIANGLES, c.get_mesh_arrays())
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * var c = new CylinderMesh();
   *
   * var arrMesh = new ArrayMesh();
   *
   * arrMesh.AddSurfaceFromArrays(Mesh.PrimitiveType.Triangles, c.GetMeshArrays());
   *
   * [/csharp]
   *
   * [/codeblocks]
   */
  public fun getMeshArrays(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PRIMITIVEMESH_GET_MESH_ARRAYS,
        ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>)
  }

  public companion object
}
