// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedFloat32Array
import godot.core.PackedInt32Array
import godot.core.PackedVector3Array
import godot.core.Transform3D
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_FLOAT_32_ARRAY
import godot.core.VariantType.PACKED_INT_32_ARRAY
import godot.core.VariantType.PACKED_VECTOR3_ARRAY
import godot.core.VariantType.TRANSFORM3D
import godot.core.memory.TransferContext
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * Container for parsed source geometry data used in navigation mesh baking.
 *
 * Container for parsed source geometry data used in navigation mesh baking.
 */
@GodotBaseType
public open class NavigationMeshSourceGeometryData3D : Resource() {
  public var vertices: PackedFloat32Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESHSOURCEGEOMETRYDATA3D_GET_VERTICES,
          PACKED_FLOAT_32_ARRAY)
      return (TransferContext.readReturnValue(PACKED_FLOAT_32_ARRAY, false) as PackedFloat32Array)
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_FLOAT_32_ARRAY to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESHSOURCEGEOMETRYDATA3D_SET_VERTICES, NIL)
    }

  public var indices: PackedInt32Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESHSOURCEGEOMETRYDATA3D_GET_INDICES,
          PACKED_INT_32_ARRAY)
      return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_INT_32_ARRAY to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESHSOURCEGEOMETRYDATA3D_SET_INDICES, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_NAVIGATIONMESHSOURCEGEOMETRYDATA3D, scriptIndex)
    return true
  }

  /**
   * Clears the internal data.
   */
  public fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESHSOURCEGEOMETRYDATA3D_CLEAR, NIL)
  }

  /**
   * Returns **true** when parsed source geometry data exists.
   */
  public fun hasData(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESHSOURCEGEOMETRYDATA3D_HAS_DATA, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Adds the geometry data of a [godot.Mesh] resource to the navigation mesh baking data. The mesh must have valid triangulated mesh data to be considered. Since [godot.NavigationMesh] resource have no transform all vertex positions need to be offset by the node's transform using the `xform` parameter.
   */
  public fun addMesh(mesh: Mesh, xform: Transform3D): Unit {
    TransferContext.writeArguments(OBJECT to mesh, TRANSFORM3D to xform)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESHSOURCEGEOMETRYDATA3D_ADD_MESH, NIL)
  }

  /**
   * Adds an [godot.Array] the size of [godot.Mesh.ARRAY_MAX] and with vertices at index [godot.Mesh.ARRAY_VERTEX] and indices at index [godot.Mesh.ARRAY_INDEX] to the navigation mesh baking data. The array must have valid triangulated mesh data to be considered. Since [godot.NavigationMesh] resource have no transform all vertex positions need to be offset by the node's transform using the `xform` parameter.
   */
  public fun addMeshArray(meshArray: VariantArray<Any?>, xform: Transform3D): Unit {
    TransferContext.writeArguments(ARRAY to meshArray, TRANSFORM3D to xform)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESHSOURCEGEOMETRYDATA3D_ADD_MESH_ARRAY, NIL)
  }

  /**
   * Adds an array of vertex positions to the geometry data for navigation mesh baking to form triangulated faces. For each face the array must have three vertex positions in clockwise winding order. Since [godot.NavigationMesh] resource have no transform all vertex positions need to be offset by the node's transform using the `xform` parameter.
   */
  public fun addFaces(faces: PackedVector3Array, xform: Transform3D): Unit {
    TransferContext.writeArguments(PACKED_VECTOR3_ARRAY to faces, TRANSFORM3D to xform)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESHSOURCEGEOMETRYDATA3D_ADD_FACES, NIL)
  }

  public companion object
}
