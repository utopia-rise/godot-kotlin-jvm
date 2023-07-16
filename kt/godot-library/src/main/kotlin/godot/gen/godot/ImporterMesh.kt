// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.PackedInt32Array
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_INT_32_ARRAY
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR2I
import godot.core.Vector2i
import godot.core.memory.TransferContext
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * A [godot.Resource] that contains vertex array-based geometry during the import process.
 *
 * ImporterMesh is a type of [godot.Resource] analogous to [godot.ArrayMesh]. It contains vertex array-based geometry, divided in *surfaces*. Each surface contains a completely separate array and a material used to draw it. Design wise, a mesh with multiple surfaces is preferred to a single surface, because objects created in 3D editing software commonly contain multiple materials.
 *
 * Unlike its runtime counterpart, [godot.ImporterMesh] contains mesh data before various import steps, such as lod and shadow mesh generation, have taken place. Modify surface data by calling [clear], followed by [addSurface] for each surface.
 */
@GodotBaseType
public open class ImporterMesh : Resource() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_IMPORTERMESH, scriptIndex)
    return true
  }

  /**
   * Adds name for a blend shape that will be added with [addSurface]. Must be called before surface is added.
   */
  public fun addBlendShape(name: String): Unit {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMPORTERMESH_ADD_BLEND_SHAPE, NIL)
  }

  /**
   * Returns the number of blend shapes that the mesh holds.
   */
  public fun getBlendShapeCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMPORTERMESH_GET_BLEND_SHAPE_COUNT,
        LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the name of the blend shape at this index.
   */
  public fun getBlendShapeName(blendShapeIdx: Int): String {
    TransferContext.writeArguments(LONG to blendShapeIdx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMPORTERMESH_GET_BLEND_SHAPE_NAME,
        STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Sets the blend shape mode to one of [enum Mesh.BlendShapeMode].
   */
  public fun setBlendShapeMode(mode: Mesh.BlendShapeMode): Unit {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMPORTERMESH_SET_BLEND_SHAPE_MODE,
        NIL)
  }

  /**
   * Returns the blend shape mode for this Mesh.
   */
  public fun getBlendShapeMode(): Mesh.BlendShapeMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMPORTERMESH_GET_BLEND_SHAPE_MODE,
        LONG)
    return Mesh.BlendShapeMode.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
  }

  /**
   * Creates a new surface. [godot.Mesh.getSurfaceCount] will become the `surf_idx` for this new surface.
   *
   * Surfaces are created to be rendered using a [primitive], which may be any of the values defined in [enum Mesh.PrimitiveType].
   *
   * The [arrays] argument is an array of arrays. Each of the [godot.Mesh.ARRAY_MAX] elements contains an array with some of the mesh data for this surface as described by the corresponding member of [enum Mesh.ArrayType] or `null` if it is not used by the surface. For example, `arrays[0]` is the array of vertices. That first vertex sub-array is always required; the others are optional. Adding an index array puts this surface into "index mode" where the vertex and other arrays become the sources of data and the index array defines the vertex order. All sub-arrays must have the same length as the vertex array (or be an exact multiple of the vertex array's length, when multiple elements of a sub-array correspond to a single vertex) or be empty, except for [godot.Mesh.ARRAY_INDEX] if it is used.
   *
   * The [blendShapes] argument is an array of vertex data for each blend shape. Each element is an array of the same structure as [arrays], but [godot.Mesh.ARRAY_VERTEX], [godot.Mesh.ARRAY_NORMAL], and [godot.Mesh.ARRAY_TANGENT] are set if and only if they are set in [arrays] and all other entries are `null`.
   *
   * The [lods] argument is a dictionary with [float] keys and [godot.PackedInt32Array] values. Each entry in the dictionary represents a LOD level of the surface, where the value is the [godot.Mesh.ARRAY_INDEX] array to use for the LOD level and the key is roughly proportional to the distance at which the LOD stats being used. I.e., increasing the key of a LOD also increases the distance that the objects has to be from the camera before the LOD is used.
   *
   * The [flags] argument is the bitwise or of, as required: One value of [enum Mesh.ArrayCustomFormat] left shifted by `ARRAY_FORMAT_CUSTOMn_SHIFT` for each custom channel in use, [godot.Mesh.ARRAY_FLAG_USE_DYNAMIC_UPDATE], [godot.Mesh.ARRAY_FLAG_USE_8_BONE_WEIGHTS], or [godot.Mesh.ARRAY_FLAG_USES_EMPTY_VERTEX_ARRAY].
   *
   * **Note:** When using indices, it is recommended to only use points, lines, or triangles.
   */
  @JvmOverloads
  public fun addSurface(
    primitive: Mesh.PrimitiveType,
    arrays: VariantArray<Any?>,
    blendShapes: VariantArray<VariantArray<Any?>> = godot.core.variantArrayOf(),
    lods: Dictionary<Any?, Any?> = Dictionary(),
    material: Material? = null,
    name: String = "",
    flags: Int = 0,
  ): Unit {
    TransferContext.writeArguments(LONG to primitive.id, ARRAY to arrays, ARRAY to blendShapes, DICTIONARY to lods, OBJECT to material, STRING to name, LONG to flags.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMPORTERMESH_ADD_SURFACE, NIL)
  }

  /**
   * Returns the number of surfaces that the mesh holds.
   */
  public fun getSurfaceCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMPORTERMESH_GET_SURFACE_COUNT,
        LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the primitive type of the requested surface (see [addSurface]).
   */
  public fun getSurfacePrimitiveType(surfaceIdx: Int): Mesh.PrimitiveType {
    TransferContext.writeArguments(LONG to surfaceIdx.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_IMPORTERMESH_GET_SURFACE_PRIMITIVE_TYPE, LONG)
    return Mesh.PrimitiveType.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
  }

  /**
   * Gets the name assigned to this surface.
   */
  public fun getSurfaceName(surfaceIdx: Int): String {
    TransferContext.writeArguments(LONG to surfaceIdx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMPORTERMESH_GET_SURFACE_NAME,
        STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns the arrays for the vertices, normals, uvs, etc. that make up the requested surface. See [addSurface].
   */
  public fun getSurfaceArrays(surfaceIdx: Int): VariantArray<Any?> {
    TransferContext.writeArguments(LONG to surfaceIdx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMPORTERMESH_GET_SURFACE_ARRAYS,
        ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>)
  }

  /**
   * Returns a single set of blend shape arrays for the requested blend shape index for a surface.
   */
  public fun getSurfaceBlendShapeArrays(surfaceIdx: Int, blendShapeIdx: Int): VariantArray<Any?> {
    TransferContext.writeArguments(LONG to surfaceIdx.toLong(), LONG to blendShapeIdx.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_IMPORTERMESH_GET_SURFACE_BLEND_SHAPE_ARRAYS, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>)
  }

  /**
   * Returns the number of lods that the mesh holds on a given surface.
   */
  public fun getSurfaceLodCount(surfaceIdx: Int): Int {
    TransferContext.writeArguments(LONG to surfaceIdx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMPORTERMESH_GET_SURFACE_LOD_COUNT,
        LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the screen ratio which activates a lod for a surface.
   */
  public fun getSurfaceLodSize(surfaceIdx: Int, lodIdx: Int): Float {
    TransferContext.writeArguments(LONG to surfaceIdx.toLong(), LONG to lodIdx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMPORTERMESH_GET_SURFACE_LOD_SIZE,
        DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns the index buffer of a lod for a surface.
   */
  public fun getSurfaceLodIndices(surfaceIdx: Int, lodIdx: Int): PackedInt32Array {
    TransferContext.writeArguments(LONG to surfaceIdx.toLong(), LONG to lodIdx.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_IMPORTERMESH_GET_SURFACE_LOD_INDICES, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  /**
   * Returns a [godot.Material] in a given surface. Surface is rendered using this material.
   */
  public fun getSurfaceMaterial(surfaceIdx: Int): Material? {
    TransferContext.writeArguments(LONG to surfaceIdx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMPORTERMESH_GET_SURFACE_MATERIAL,
        OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Material?)
  }

  /**
   * Returns the format of the surface that the mesh holds.
   */
  public fun getSurfaceFormat(surfaceIdx: Int): Int {
    TransferContext.writeArguments(LONG to surfaceIdx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMPORTERMESH_GET_SURFACE_FORMAT,
        LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Sets a name for a given surface.
   */
  public fun setSurfaceName(surfaceIdx: Int, name: String): Unit {
    TransferContext.writeArguments(LONG to surfaceIdx.toLong(), STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMPORTERMESH_SET_SURFACE_NAME, NIL)
  }

  /**
   * Sets a [godot.Material] for a given surface. Surface will be rendered using this material.
   */
  public fun setSurfaceMaterial(surfaceIdx: Int, material: Material): Unit {
    TransferContext.writeArguments(LONG to surfaceIdx.toLong(), OBJECT to material)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMPORTERMESH_SET_SURFACE_MATERIAL,
        NIL)
  }

  /**
   * Generates all lods for this ImporterMesh.
   *
   * [normalMergeAngle] and [normalSplitAngle] are in degrees and used in the same way as the importer settings in `lods`. As a good default, use 25 and 60 respectively.
   *
   * The number of generated lods can be accessed using [getSurfaceLodCount], and each LOD is available in [getSurfaceLodSize] and [getSurfaceLodIndices].
   *
   * [boneTransformArray] is an [godot.Array] which can be either empty or contain [godot.Transform3D]s which, for each of the mesh's bone IDs, will apply mesh skinning when generating the LOD mesh variations. This is usually used to account for discrepancies in scale between the mesh itself and its skinning data.
   */
  public fun generateLods(
    normalMergeAngle: Float,
    normalSplitAngle: Float,
    boneTransformArray: VariantArray<Any?>,
  ): Unit {
    TransferContext.writeArguments(DOUBLE to normalMergeAngle.toDouble(), DOUBLE to normalSplitAngle.toDouble(), ARRAY to boneTransformArray)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMPORTERMESH_GENERATE_LODS, NIL)
  }

  /**
   * Returns the mesh data represented by this [godot.ImporterMesh] as a usable [godot.ArrayMesh].
   *
   * This method caches the returned mesh, and subsequent calls will return the cached data until [clear] is called.
   *
   * If not yet cached and [baseMesh] is provided, [baseMesh] will be used and mutated.
   */
  @JvmOverloads
  public fun getMesh(baseMesh: ArrayMesh? = null): ArrayMesh? {
    TransferContext.writeArguments(OBJECT to baseMesh)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMPORTERMESH_GET_MESH, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as ArrayMesh?)
  }

  /**
   * Removes all surfaces and blend shapes from this [godot.ImporterMesh].
   */
  public fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMPORTERMESH_CLEAR, NIL)
  }

  /**
   * Sets the size hint of this mesh for lightmap-unwrapping in UV-space.
   */
  public fun setLightmapSizeHint(size: Vector2i): Unit {
    TransferContext.writeArguments(VECTOR2I to size)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMPORTERMESH_SET_LIGHTMAP_SIZE_HINT,
        NIL)
  }

  /**
   * Returns the size hint of this mesh for lightmap-unwrapping in UV-space.
   */
  public fun getLightmapSizeHint(): Vector2i {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMPORTERMESH_GET_LIGHTMAP_SIZE_HINT,
        VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
  }

  public companion object
}
