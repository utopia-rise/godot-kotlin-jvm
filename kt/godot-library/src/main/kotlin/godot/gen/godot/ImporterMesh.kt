// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.Mesh
import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.PackedInt32Array
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_INT_32_ARRAY
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR2I
import godot.core.Vector2i
import kotlin.Any
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * A [godot.Resource] that contains vertex array-based geometry during the import process.
 *
 * ImporterMesh is a type of [godot.Resource] analogous to [godot.ArrayMesh]. It contains vertex array-based geometry, divided in *surfaces*. Each surface contains a completely separate array and a material used to draw it. Design wise, a mesh with multiple surfaces is preferred to a single surface, because objects created in 3D editing software commonly contain multiple materials.
 *
 *
 *
 * Unlike its runtime counterpart, [godot.ImporterMesh] contains mesh data before various import steps, such as lod and shadow mesh generation, have taken place. Modify surface data by calling [clear], followed by [addSurface] for each surface.
 */
@GodotBaseType
public open class ImporterMesh : Resource() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_IMPORTERMESH)
  }

  /**
   * Adds name for a blend shape that will be added with [addSurface]. Must be called before surface is added.
   */
  public open fun addBlendShape(name: String): Unit {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMPORTERMESH_ADD_BLEND_SHAPE, NIL)
  }

  /**
   * Returns the number of blend shapes that the mesh holds.
   */
  public open fun getBlendShapeCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMPORTERMESH_GET_BLEND_SHAPE_COUNT,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the name of the blend shape at this index.
   */
  public open fun getBlendShapeName(blendShapeIdx: Long): String {
    TransferContext.writeArguments(LONG to blendShapeIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMPORTERMESH_GET_BLEND_SHAPE_NAME,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Sets the blend shape mode to one of [enum Mesh.BlendShapeMode].
   */
  public open fun setBlendShapeMode(mode: Mesh.BlendShapeMode): Unit {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMPORTERMESH_SET_BLEND_SHAPE_MODE,
        NIL)
  }

  /**
   * Returns the blend shape mode for this Mesh.
   */
  public open fun getBlendShapeMode(): Mesh.BlendShapeMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMPORTERMESH_GET_BLEND_SHAPE_MODE,
        LONG)
    return Mesh.BlendShapeMode.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Creates a new surface, analogous to [godot.ArrayMesh.addSurfaceFromArrays].
   *
   * Surfaces are created to be rendered using a `primitive`, which may be any of the types defined in [enum Mesh.PrimitiveType]. (As a note, when using indices, it is recommended to only use points, lines, or triangles.) [godot.Mesh.getSurfaceCount] will become the `surf_idx` for this new surface.
   *
   * The `arrays` argument is an array of arrays. See [enum Mesh.ArrayType] for the values used in this array. For example, `arrays[0]` is the array of vertices. That first vertex sub-array is always required; the others are optional. Adding an index array puts this function into "index mode" where the vertex and other arrays become the sources of data and the index array defines the vertex order. All sub-arrays must have the same length as the vertex array or be empty, except for [godot.Mesh.ARRAY_INDEX] if it is used.
   */
  public open fun addSurface(
    primitive: Mesh.PrimitiveType,
    arrays: VariantArray<Any?>,
    blendShapes: VariantArray<Any?> = Array(),
    lods: Dictionary<Any?, Any?> = Dictionary(),
    material: Material? = null,
    name: String = "",
    flags: Long = 0
  ): Unit {
    TransferContext.writeArguments(LONG to primitive.id, ARRAY to arrays, ARRAY to blendShapes,
        DICTIONARY to lods, OBJECT to material, STRING to name, LONG to flags)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMPORTERMESH_ADD_SURFACE, NIL)
  }

  /**
   * Returns the amount of surfaces that the mesh holds.
   */
  public open fun getSurfaceCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMPORTERMESH_GET_SURFACE_COUNT,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the primitive type of the requested surface (see [addSurface]).
   */
  public open fun getSurfacePrimitiveType(surfaceIdx: Long): Mesh.PrimitiveType {
    TransferContext.writeArguments(LONG to surfaceIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_IMPORTERMESH_GET_SURFACE_PRIMITIVE_TYPE, LONG)
    return Mesh.PrimitiveType.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Gets the name assigned to this surface.
   */
  public open fun getSurfaceName(surfaceIdx: Long): String {
    TransferContext.writeArguments(LONG to surfaceIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMPORTERMESH_GET_SURFACE_NAME,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the arrays for the vertices, normals, uvs, etc. that make up the requested surface. See [addSurface].
   */
  public open fun getSurfaceArrays(surfaceIdx: Long): VariantArray<Any?> {
    TransferContext.writeArguments(LONG to surfaceIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMPORTERMESH_GET_SURFACE_ARRAYS,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns a single set of blend shape arrays for the requested blend shape index for a surface.
   */
  public open fun getSurfaceBlendShapeArrays(surfaceIdx: Long, blendShapeIdx: Long):
      VariantArray<Any?> {
    TransferContext.writeArguments(LONG to surfaceIdx, LONG to blendShapeIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_IMPORTERMESH_GET_SURFACE_BLEND_SHAPE_ARRAYS, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns the amount of lods that the mesh holds on a given surface.
   */
  public open fun getSurfaceLodCount(surfaceIdx: Long): Long {
    TransferContext.writeArguments(LONG to surfaceIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMPORTERMESH_GET_SURFACE_LOD_COUNT,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the screen ratio which activates a lod for a surface.
   */
  public open fun getSurfaceLodSize(surfaceIdx: Long, lodIdx: Long): Double {
    TransferContext.writeArguments(LONG to surfaceIdx, LONG to lodIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMPORTERMESH_GET_SURFACE_LOD_SIZE,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the index buffer of a lod for a surface.
   */
  public open fun getSurfaceLodIndices(surfaceIdx: Long, lodIdx: Long): PackedInt32Array {
    TransferContext.writeArguments(LONG to surfaceIdx, LONG to lodIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_IMPORTERMESH_GET_SURFACE_LOD_INDICES, PACKED_INT_32_ARRAY)
    return TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array
  }

  /**
   * Returns a [godot.Material] in a given surface. Surface is rendered using this material.
   */
  public open fun getSurfaceMaterial(surfaceIdx: Long): Material? {
    TransferContext.writeArguments(LONG to surfaceIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMPORTERMESH_GET_SURFACE_MATERIAL,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Material?
  }

  /**
   * Returns the format of the surface that the mesh holds.
   */
  public open fun getSurfaceFormat(surfaceIdx: Long): Long {
    TransferContext.writeArguments(LONG to surfaceIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMPORTERMESH_GET_SURFACE_FORMAT,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Sets a name for a given surface.
   */
  public open fun setSurfaceName(surfaceIdx: Long, name: String): Unit {
    TransferContext.writeArguments(LONG to surfaceIdx, STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMPORTERMESH_SET_SURFACE_NAME, NIL)
  }

  /**
   * Sets a [godot.Material] for a given surface. Surface will be rendered using this material.
   */
  public open fun setSurfaceMaterial(surfaceIdx: Long, material: Material): Unit {
    TransferContext.writeArguments(LONG to surfaceIdx, OBJECT to material)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMPORTERMESH_SET_SURFACE_MATERIAL,
        NIL)
  }

  /**
   * Returns the mesh data represented by this [godot.ImporterMesh] as a usable [godot.ArrayMesh].
   *
   * This method caches the returned mesh, and subsequent calls will return the cached data until [clear] is called.
   *
   * If not yet cached and `base_mesh` is provided, `base_mesh` will be used and mutated.
   */
  public open fun getMesh(baseMesh: ArrayMesh? = null): ArrayMesh? {
    TransferContext.writeArguments(OBJECT to baseMesh)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMPORTERMESH_GET_MESH, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as ArrayMesh?
  }

  /**
   * Removes all surfaces and blend shapes from this [godot.ImporterMesh].
   */
  public open fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMPORTERMESH_CLEAR, NIL)
  }

  /**
   * Sets the size hint of this mesh for lightmap-unwrapping in UV-space.
   */
  public open fun setLightmapSizeHint(size: Vector2i): Unit {
    TransferContext.writeArguments(VECTOR2I to size)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMPORTERMESH_SET_LIGHTMAP_SIZE_HINT,
        NIL)
  }

  /**
   * Returns the size hint of this mesh for lightmap-unwrapping in UV-space.
   */
  public open fun getLightmapSizeHint(): Vector2i {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMPORTERMESH_GET_LIGHTMAP_SIZE_HINT,
        VECTOR2I)
    return TransferContext.readReturnValue(VECTOR2I, false) as Vector2i
  }

  public companion object
}
