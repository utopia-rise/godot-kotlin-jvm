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
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_FLOAT_32_ARRAY
import godot.core.VariantType.PACKED_INT_32_ARRAY
import godot.core.VariantType.PACKED_VECTOR3_ARRAY
import godot.core.VariantType.TRANSFORM3D
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * Container for parsed source geometry data used in navigation mesh baking.
 */
@GodotBaseType
public open class NavigationMeshSourceGeometryData3D : Resource() {
  public var vertices: PackedFloat32Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVerticesPtr, PACKED_FLOAT_32_ARRAY)
      return (TransferContext.readReturnValue(PACKED_FLOAT_32_ARRAY, false) as PackedFloat32Array)
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_FLOAT_32_ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setVerticesPtr, NIL)
    }

  public var indices: PackedInt32Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getIndicesPtr, PACKED_INT_32_ARRAY)
      return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_INT_32_ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setIndicesPtr, NIL)
    }

  public var projectedObstructions: VariantArray<Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getProjectedObstructionsPtr, ARRAY)
      return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>)
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setProjectedObstructionsPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_NAVIGATIONMESHSOURCEGEOMETRYDATA3D, scriptIndex)
  }

  /**
   * Appends arrays of [vertices] and [indices] at the end of the existing arrays. Adds the existing
   * index as an offset to the appended indices.
   */
  public fun appendArrays(vertices: PackedFloat32Array, indices: PackedInt32Array): Unit {
    TransferContext.writeArguments(PACKED_FLOAT_32_ARRAY to vertices, PACKED_INT_32_ARRAY to indices)
    TransferContext.callMethod(rawPtr, MethodBindings.appendArraysPtr, NIL)
  }

  /**
   * Clears the internal data.
   */
  public fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearPtr, NIL)
  }

  /**
   * Returns `true` when parsed source geometry data exists.
   */
  public fun hasData(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.hasDataPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Adds the geometry data of a [Mesh] resource to the navigation mesh baking data. The mesh must
   * have valid triangulated mesh data to be considered. Since [NavigationMesh] resources have no
   * transform, all vertex positions need to be offset by the node's transform using [xform].
   */
  public fun addMesh(mesh: Mesh, xform: Transform3D): Unit {
    TransferContext.writeArguments(OBJECT to mesh, TRANSFORM3D to xform)
    TransferContext.callMethod(rawPtr, MethodBindings.addMeshPtr, NIL)
  }

  /**
   * Adds an [Array] the size of [Mesh.ARRAY_MAX] and with vertices at index [Mesh.ARRAY_VERTEX] and
   * indices at index [Mesh.ARRAY_INDEX] to the navigation mesh baking data. The array must have valid
   * triangulated mesh data to be considered. Since [NavigationMesh] resources have no transform, all
   * vertex positions need to be offset by the node's transform using [xform].
   */
  public fun addMeshArray(meshArray: VariantArray<Any?>, xform: Transform3D): Unit {
    TransferContext.writeArguments(ARRAY to meshArray, TRANSFORM3D to xform)
    TransferContext.callMethod(rawPtr, MethodBindings.addMeshArrayPtr, NIL)
  }

  /**
   * Adds an array of vertex positions to the geometry data for navigation mesh baking to form
   * triangulated faces. For each face the array must have three vertex positions in clockwise winding
   * order. Since [NavigationMesh] resources have no transform, all vertex positions need to be offset
   * by the node's transform using [xform].
   */
  public fun addFaces(faces: PackedVector3Array, xform: Transform3D): Unit {
    TransferContext.writeArguments(PACKED_VECTOR3_ARRAY to faces, TRANSFORM3D to xform)
    TransferContext.callMethod(rawPtr, MethodBindings.addFacesPtr, NIL)
  }

  /**
   * Adds the geometry data of another [NavigationMeshSourceGeometryData3D] to the navigation mesh
   * baking data.
   */
  public fun merge(otherGeometry: NavigationMeshSourceGeometryData3D): Unit {
    TransferContext.writeArguments(OBJECT to otherGeometry)
    TransferContext.callMethod(rawPtr, MethodBindings.mergePtr, NIL)
  }

  /**
   * Adds a projected obstruction shape to the source geometry. The [vertices] are considered
   * projected on a xz-axes plane, placed at the global y-axis [elevation] and extruded by [height]. If
   * [carve] is `true` the carved shape will not be affected by additional offsets (e.g. agent radius)
   * of the navigation mesh baking process.
   */
  public fun addProjectedObstruction(
    vertices: PackedVector3Array,
    elevation: Float,
    height: Float,
    carve: Boolean,
  ): Unit {
    TransferContext.writeArguments(PACKED_VECTOR3_ARRAY to vertices, DOUBLE to elevation.toDouble(), DOUBLE to height.toDouble(), BOOL to carve)
    TransferContext.callMethod(rawPtr, MethodBindings.addProjectedObstructionPtr, NIL)
  }

  /**
   * Clears all projected obstructions.
   */
  public fun clearProjectedObstructions(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearProjectedObstructionsPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val setVerticesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMeshSourceGeometryData3D", "set_vertices")

    public val getVerticesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMeshSourceGeometryData3D", "get_vertices")

    public val setIndicesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMeshSourceGeometryData3D", "set_indices")

    public val getIndicesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMeshSourceGeometryData3D", "get_indices")

    public val appendArraysPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMeshSourceGeometryData3D", "append_arrays")

    public val clearPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMeshSourceGeometryData3D", "clear")

    public val hasDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMeshSourceGeometryData3D", "has_data")

    public val addMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMeshSourceGeometryData3D", "add_mesh")

    public val addMeshArrayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMeshSourceGeometryData3D", "add_mesh_array")

    public val addFacesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMeshSourceGeometryData3D", "add_faces")

    public val mergePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMeshSourceGeometryData3D", "merge")

    public val addProjectedObstructionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMeshSourceGeometryData3D", "add_projected_obstruction")

    public val clearProjectedObstructionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMeshSourceGeometryData3D", "clear_projected_obstructions")

    public val setProjectedObstructionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMeshSourceGeometryData3D", "set_projected_obstructions")

    public val getProjectedObstructionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMeshSourceGeometryData3D", "get_projected_obstructions")
  }
}
