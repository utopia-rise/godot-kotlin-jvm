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
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_FLOAT_32_ARRAY
import godot.core.VariantParser.PACKED_INT_32_ARRAY
import godot.core.VariantParser.PACKED_VECTOR3_ARRAY
import godot.core.VariantParser.TRANSFORM3D
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_NAVIGATIONMESHSOURCEGEOMETRYDATA3D_INDEX: Int = 394

/**
 * Container for parsed source geometry data used in navigation mesh baking.
 */
@GodotBaseType
public open class NavigationMeshSourceGeometryData3D : Resource() {
  public final inline var vertices: PackedFloat32Array
    @JvmName("verticesProperty")
    get() = getVertices()
    @JvmName("verticesProperty")
    set(`value`) {
      setVertices(value)
    }

  public final inline var indices: PackedInt32Array
    @JvmName("indicesProperty")
    get() = getIndices()
    @JvmName("indicesProperty")
    set(`value`) {
      setIndices(value)
    }

  public final inline var projectedObstructions: VariantArray<Any?>
    @JvmName("projectedObstructionsProperty")
    get() = getProjectedObstructions()
    @JvmName("projectedObstructionsProperty")
    set(`value`) {
      setProjectedObstructions(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_NAVIGATIONMESHSOURCEGEOMETRYDATA3D_INDEX,
        scriptIndex)
  }

  /**
   * Sets the parsed source geometry data vertices. The vertices need to be matched with
   * appropriated indices.
   * **Warning:** Inappropriate data can crash the baking process of the involved third-party
   * libraries.
   */
  public final fun setVertices(vertices: PackedFloat32Array): Unit {
    Internals.writeArguments(PACKED_FLOAT_32_ARRAY to vertices)
    Internals.callMethod(rawPtr, MethodBindings.setVerticesPtr, NIL)
  }

  /**
   * Returns the parsed source geometry data vertices array.
   */
  public final fun getVertices(): PackedFloat32Array {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getVerticesPtr, PACKED_FLOAT_32_ARRAY)
    return (Internals.readReturnValue(PACKED_FLOAT_32_ARRAY) as PackedFloat32Array)
  }

  /**
   * Sets the parsed source geometry data indices. The indices need to be matched with appropriated
   * vertices.
   * **Warning:** Inappropriate data can crash the baking process of the involved third-party
   * libraries.
   */
  public final fun setIndices(indices: PackedInt32Array): Unit {
    Internals.writeArguments(PACKED_INT_32_ARRAY to indices)
    Internals.callMethod(rawPtr, MethodBindings.setIndicesPtr, NIL)
  }

  /**
   * Returns the parsed source geometry data indices array.
   */
  public final fun getIndices(): PackedInt32Array {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getIndicesPtr, PACKED_INT_32_ARRAY)
    return (Internals.readReturnValue(PACKED_INT_32_ARRAY) as PackedInt32Array)
  }

  /**
   * Appends arrays of [vertices] and [indices] at the end of the existing arrays. Adds the existing
   * index as an offset to the appended indices.
   */
  public final fun appendArrays(vertices: PackedFloat32Array, indices: PackedInt32Array): Unit {
    Internals.writeArguments(PACKED_FLOAT_32_ARRAY to vertices, PACKED_INT_32_ARRAY to indices)
    Internals.callMethod(rawPtr, MethodBindings.appendArraysPtr, NIL)
  }

  /**
   * Clears the internal data.
   */
  public final fun clear(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.clearPtr, NIL)
  }

  /**
   * Returns `true` when parsed source geometry data exists.
   */
  public final fun hasData(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.hasDataPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Adds the geometry data of a [Mesh] resource to the navigation mesh baking data. The mesh must
   * have valid triangulated mesh data to be considered. Since [NavigationMesh] resources have no
   * transform, all vertex positions need to be offset by the node's transform using [xform].
   */
  public final fun addMesh(mesh: Mesh?, xform: Transform3D): Unit {
    Internals.writeArguments(OBJECT to mesh, TRANSFORM3D to xform)
    Internals.callMethod(rawPtr, MethodBindings.addMeshPtr, NIL)
  }

  /**
   * Adds an [Array] the size of [Mesh.ARRAY_MAX] and with vertices at index [Mesh.ARRAY_VERTEX] and
   * indices at index [Mesh.ARRAY_INDEX] to the navigation mesh baking data. The array must have valid
   * triangulated mesh data to be considered. Since [NavigationMesh] resources have no transform, all
   * vertex positions need to be offset by the node's transform using [xform].
   */
  public final fun addMeshArray(meshArray: VariantArray<Any?>, xform: Transform3D): Unit {
    Internals.writeArguments(ARRAY to meshArray, TRANSFORM3D to xform)
    Internals.callMethod(rawPtr, MethodBindings.addMeshArrayPtr, NIL)
  }

  /**
   * Adds an array of vertex positions to the geometry data for navigation mesh baking to form
   * triangulated faces. For each face the array must have three vertex positions in clockwise winding
   * order. Since [NavigationMesh] resources have no transform, all vertex positions need to be offset
   * by the node's transform using [xform].
   */
  public final fun addFaces(faces: PackedVector3Array, xform: Transform3D): Unit {
    Internals.writeArguments(PACKED_VECTOR3_ARRAY to faces, TRANSFORM3D to xform)
    Internals.callMethod(rawPtr, MethodBindings.addFacesPtr, NIL)
  }

  /**
   * Adds the geometry data of another [NavigationMeshSourceGeometryData3D] to the navigation mesh
   * baking data.
   */
  public final fun merge(otherGeometry: NavigationMeshSourceGeometryData3D?): Unit {
    Internals.writeArguments(OBJECT to otherGeometry)
    Internals.callMethod(rawPtr, MethodBindings.mergePtr, NIL)
  }

  /**
   * Adds a projected obstruction shape to the source geometry. The [vertices] are considered
   * projected on a xz-axes plane, placed at the global y-axis [elevation] and extruded by [height]. If
   * [carve] is `true` the carved shape will not be affected by additional offsets (e.g. agent radius)
   * of the navigation mesh baking process.
   */
  public final fun addProjectedObstruction(
    vertices: PackedVector3Array,
    elevation: Float,
    height: Float,
    carve: Boolean,
  ): Unit {
    Internals.writeArguments(PACKED_VECTOR3_ARRAY to vertices, DOUBLE to elevation.toDouble(), DOUBLE to height.toDouble(), BOOL to carve)
    Internals.callMethod(rawPtr, MethodBindings.addProjectedObstructionPtr, NIL)
  }

  /**
   * Clears all projected obstructions.
   */
  public final fun clearProjectedObstructions(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.clearProjectedObstructionsPtr, NIL)
  }

  /**
   * Sets the projected obstructions with an Array of Dictionaries with the following key value
   * pairs:
   *
   * gdscript:
   * ```gdscript
   * "vertices" : PackedFloat32Array
   * "elevation" : float
   * "height" : float
   * "carve" : bool
   * ```
   */
  public final fun setProjectedObstructions(projectedObstructions: VariantArray<Any?>): Unit {
    Internals.writeArguments(ARRAY to projectedObstructions)
    Internals.callMethod(rawPtr, MethodBindings.setProjectedObstructionsPtr, NIL)
  }

  /**
   * Returns the projected obstructions as an [Array] of dictionaries. Each [Dictionary] contains
   * the following entries:
   * - `vertices` - A [PackedFloat32Array] that defines the outline points of the projected shape.
   * - `elevation` - A [float] that defines the projected shape placement on the y-axis.
   * - `height` - A [float] that defines how much the projected shape is extruded along the y-axis.
   * - `carve` - A [bool] that defines how the obstacle affects the navigation mesh baking. If
   * `true` the projected shape will not be affected by addition offsets, e.g. agent radius.
   */
  public final fun getProjectedObstructions(): VariantArray<Any?> {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getProjectedObstructionsPtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<Any?>)
  }

  public companion object

  internal object MethodBindings {
    public val setVerticesPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMeshSourceGeometryData3D", "set_vertices", 2899603908)

    public val getVerticesPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMeshSourceGeometryData3D", "get_vertices", 675695659)

    public val setIndicesPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMeshSourceGeometryData3D", "set_indices", 3614634198)

    public val getIndicesPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMeshSourceGeometryData3D", "get_indices", 1930428628)

    public val appendArraysPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMeshSourceGeometryData3D", "append_arrays", 3117535015)

    public val clearPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMeshSourceGeometryData3D", "clear", 3218959716)

    public val hasDataPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMeshSourceGeometryData3D", "has_data", 2240911060)

    public val addMeshPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMeshSourceGeometryData3D", "add_mesh", 975462459)

    public val addMeshArrayPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMeshSourceGeometryData3D", "add_mesh_array", 4235710913)

    public val addFacesPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMeshSourceGeometryData3D", "add_faces", 1440358797)

    public val mergePtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMeshSourceGeometryData3D", "merge", 655828145)

    public val addProjectedObstructionPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMeshSourceGeometryData3D", "add_projected_obstruction", 3351846707)

    public val clearProjectedObstructionsPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMeshSourceGeometryData3D", "clear_projected_obstructions", 3218959716)

    public val setProjectedObstructionsPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMeshSourceGeometryData3D", "set_projected_obstructions", 381264803)

    public val getProjectedObstructionsPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMeshSourceGeometryData3D", "get_projected_obstructions", 3995934104)
  }
}
