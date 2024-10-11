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
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.DICTIONARY
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_INT_32_ARRAY
import godot.core.VariantParser.STRING
import godot.core.VariantParser.VECTOR2I
import godot.core.Vector2i
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

private const val ENGINE_CLASS_IMPORTERMESH_INDEX: Int = 311

/**
 * ImporterMesh is a type of [Resource] analogous to [ArrayMesh]. It contains vertex array-based
 * geometry, divided in *surfaces*. Each surface contains a completely separate array and a material
 * used to draw it. Design wise, a mesh with multiple surfaces is preferred to a single surface,
 * because objects created in 3D editing software commonly contain multiple materials.
 * Unlike its runtime counterpart, [ImporterMesh] contains mesh data before various import steps,
 * such as lod and shadow mesh generation, have taken place. Modify surface data by calling [clear],
 * followed by [addSurface] for each surface.
 */
@GodotBaseType
public open class ImporterMesh : Resource() {
  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_IMPORTERMESH_INDEX, scriptIndex)
  }

  /**
   * Adds name for a blend shape that will be added with [addSurface]. Must be called before surface
   * is added.
   */
  public final fun addBlendShape(name: String): Unit {
    Internals.writeArguments(STRING to name)
    Internals.callMethod(rawPtr, MethodBindings.addBlendShapePtr, NIL)
  }

  /**
   * Returns the number of blend shapes that the mesh holds.
   */
  public final fun getBlendShapeCount(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getBlendShapeCountPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the name of the blend shape at this index.
   */
  public final fun getBlendShapeName(blendShapeIdx: Int): String {
    Internals.writeArguments(LONG to blendShapeIdx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getBlendShapeNamePtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  /**
   * Sets the blend shape mode to one of [Mesh.BlendShapeMode].
   */
  public final fun setBlendShapeMode(mode: Mesh.BlendShapeMode): Unit {
    Internals.writeArguments(LONG to mode.id)
    Internals.callMethod(rawPtr, MethodBindings.setBlendShapeModePtr, NIL)
  }

  /**
   * Returns the blend shape mode for this Mesh.
   */
  public final fun getBlendShapeMode(): Mesh.BlendShapeMode {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getBlendShapeModePtr, LONG)
    return Mesh.BlendShapeMode.from(Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Creates a new surface. [Mesh.getSurfaceCount] will become the `surf_idx` for this new surface.
   * Surfaces are created to be rendered using a [primitive], which may be any of the values defined
   * in [Mesh.PrimitiveType].
   * The [arrays] argument is an array of arrays. Each of the [Mesh.ARRAY_MAX] elements contains an
   * array with some of the mesh data for this surface as described by the corresponding member of
   * [Mesh.ArrayType] or `null` if it is not used by the surface. For example, `arrays[0]` is the array
   * of vertices. That first vertex sub-array is always required; the others are optional. Adding an
   * index array puts this surface into "index mode" where the vertex and other arrays become the
   * sources of data and the index array defines the vertex order. All sub-arrays must have the same
   * length as the vertex array (or be an exact multiple of the vertex array's length, when multiple
   * elements of a sub-array correspond to a single vertex) or be empty, except for [Mesh.ARRAY_INDEX]
   * if it is used.
   * The [blendShapes] argument is an array of vertex data for each blend shape. Each element is an
   * array of the same structure as [arrays], but [Mesh.ARRAY_VERTEX], [Mesh.ARRAY_NORMAL], and
   * [Mesh.ARRAY_TANGENT] are set if and only if they are set in [arrays] and all other entries are
   * `null`.
   * The [lods] argument is a dictionary with [float] keys and [PackedInt32Array] values. Each entry
   * in the dictionary represents an LOD level of the surface, where the value is the
   * [Mesh.ARRAY_INDEX] array to use for the LOD level and the key is roughly proportional to the
   * distance at which the LOD stats being used. I.e., increasing the key of an LOD also increases the
   * distance that the objects has to be from the camera before the LOD is used.
   * The [flags] argument is the bitwise or of, as required: One value of [Mesh.ArrayCustomFormat]
   * left shifted by `ARRAY_FORMAT_CUSTOMn_SHIFT` for each custom channel in use,
   * [Mesh.ARRAY_FLAG_USE_DYNAMIC_UPDATE], [Mesh.ARRAY_FLAG_USE_8_BONE_WEIGHTS], or
   * [Mesh.ARRAY_FLAG_USES_EMPTY_VERTEX_ARRAY].
   * **Note:** When using indices, it is recommended to only use points, lines, or triangles.
   */
  @JvmOverloads
  public final fun addSurface(
    primitive: Mesh.PrimitiveType,
    arrays: VariantArray<Any?>,
    blendShapes: VariantArray<VariantArray<Any?>> = godot.core.variantArrayOf(),
    lods: Dictionary<Any?, Any?> = Dictionary(),
    material: Material? = null,
    name: String = "",
    flags: Long = 0,
  ): Unit {
    Internals.writeArguments(LONG to primitive.id, ARRAY to arrays, ARRAY to blendShapes, DICTIONARY to lods, OBJECT to material, STRING to name, LONG to flags)
    Internals.callMethod(rawPtr, MethodBindings.addSurfacePtr, NIL)
  }

  /**
   * Returns the number of surfaces that the mesh holds.
   */
  public final fun getSurfaceCount(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSurfaceCountPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the primitive type of the requested surface (see [addSurface]).
   */
  public final fun getSurfacePrimitiveType(surfaceIdx: Int): Mesh.PrimitiveType {
    Internals.writeArguments(LONG to surfaceIdx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getSurfacePrimitiveTypePtr, LONG)
    return Mesh.PrimitiveType.from(Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Gets the name assigned to this surface.
   */
  public final fun getSurfaceName(surfaceIdx: Int): String {
    Internals.writeArguments(LONG to surfaceIdx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getSurfaceNamePtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  /**
   * Returns the arrays for the vertices, normals, UVs, etc. that make up the requested surface. See
   * [addSurface].
   */
  public final fun getSurfaceArrays(surfaceIdx: Int): VariantArray<Any?> {
    Internals.writeArguments(LONG to surfaceIdx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getSurfaceArraysPtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<Any?>)
  }

  /**
   * Returns a single set of blend shape arrays for the requested blend shape index for a surface.
   */
  public final fun getSurfaceBlendShapeArrays(surfaceIdx: Int, blendShapeIdx: Int):
      VariantArray<Any?> {
    Internals.writeArguments(LONG to surfaceIdx.toLong(), LONG to blendShapeIdx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getSurfaceBlendShapeArraysPtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<Any?>)
  }

  /**
   * Returns the number of lods that the mesh holds on a given surface.
   */
  public final fun getSurfaceLodCount(surfaceIdx: Int): Int {
    Internals.writeArguments(LONG to surfaceIdx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getSurfaceLodCountPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the screen ratio which activates a lod for a surface.
   */
  public final fun getSurfaceLodSize(surfaceIdx: Int, lodIdx: Int): Float {
    Internals.writeArguments(LONG to surfaceIdx.toLong(), LONG to lodIdx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getSurfaceLodSizePtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns the index buffer of a lod for a surface.
   */
  public final fun getSurfaceLodIndices(surfaceIdx: Int, lodIdx: Int): PackedInt32Array {
    Internals.writeArguments(LONG to surfaceIdx.toLong(), LONG to lodIdx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getSurfaceLodIndicesPtr, PACKED_INT_32_ARRAY)
    return (Internals.readReturnValue(PACKED_INT_32_ARRAY) as PackedInt32Array)
  }

  /**
   * Returns a [Material] in a given surface. Surface is rendered using this material.
   */
  public final fun getSurfaceMaterial(surfaceIdx: Int): Material? {
    Internals.writeArguments(LONG to surfaceIdx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getSurfaceMaterialPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Material?)
  }

  /**
   * Returns the format of the surface that the mesh holds.
   */
  public final fun getSurfaceFormat(surfaceIdx: Int): Long {
    Internals.writeArguments(LONG to surfaceIdx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getSurfaceFormatPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Sets a name for a given surface.
   */
  public final fun setSurfaceName(surfaceIdx: Int, name: String): Unit {
    Internals.writeArguments(LONG to surfaceIdx.toLong(), STRING to name)
    Internals.callMethod(rawPtr, MethodBindings.setSurfaceNamePtr, NIL)
  }

  /**
   * Sets a [Material] for a given surface. Surface will be rendered using this material.
   */
  public final fun setSurfaceMaterial(surfaceIdx: Int, material: Material?): Unit {
    Internals.writeArguments(LONG to surfaceIdx.toLong(), OBJECT to material)
    Internals.callMethod(rawPtr, MethodBindings.setSurfaceMaterialPtr, NIL)
  }

  /**
   * Generates all lods for this ImporterMesh.
   * [normalMergeAngle] and [normalSplitAngle] are in degrees and used in the same way as the
   * importer settings in `lods`. As a good default, use 25 and 60 respectively.
   * The number of generated lods can be accessed using [getSurfaceLodCount], and each LOD is
   * available in [getSurfaceLodSize] and [getSurfaceLodIndices].
   * [boneTransformArray] is an [Array] which can be either empty or contain [Transform3D]s which,
   * for each of the mesh's bone IDs, will apply mesh skinning when generating the LOD mesh variations.
   * This is usually used to account for discrepancies in scale between the mesh itself and its
   * skinning data.
   */
  public final fun generateLods(
    normalMergeAngle: Float,
    normalSplitAngle: Float,
    boneTransformArray: VariantArray<Any?>,
  ): Unit {
    Internals.writeArguments(DOUBLE to normalMergeAngle.toDouble(), DOUBLE to normalSplitAngle.toDouble(), ARRAY to boneTransformArray)
    Internals.callMethod(rawPtr, MethodBindings.generateLodsPtr, NIL)
  }

  /**
   * Returns the mesh data represented by this [ImporterMesh] as a usable [ArrayMesh].
   * This method caches the returned mesh, and subsequent calls will return the cached data until
   * [clear] is called.
   * If not yet cached and [baseMesh] is provided, [baseMesh] will be used and mutated.
   */
  @JvmOverloads
  public final fun getMesh(baseMesh: ArrayMesh? = null): ArrayMesh? {
    Internals.writeArguments(OBJECT to baseMesh)
    Internals.callMethod(rawPtr, MethodBindings.getMeshPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as ArrayMesh?)
  }

  /**
   * Removes all surfaces and blend shapes from this [ImporterMesh].
   */
  public final fun clear(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.clearPtr, NIL)
  }

  /**
   * Sets the size hint of this mesh for lightmap-unwrapping in UV-space.
   */
  public final fun setLightmapSizeHint(size: Vector2i): Unit {
    Internals.writeArguments(VECTOR2I to size)
    Internals.callMethod(rawPtr, MethodBindings.setLightmapSizeHintPtr, NIL)
  }

  /**
   * Returns the size hint of this mesh for lightmap-unwrapping in UV-space.
   */
  public final fun getLightmapSizeHint(): Vector2i {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getLightmapSizeHintPtr, VECTOR2I)
    return (Internals.readReturnValue(VECTOR2I) as Vector2i)
  }

  public companion object

  public object MethodBindings {
    internal val addBlendShapePtr: VoidPtr =
        Internals.getMethodBindPtr("ImporterMesh", "add_blend_shape", 83702148)

    internal val getBlendShapeCountPtr: VoidPtr =
        Internals.getMethodBindPtr("ImporterMesh", "get_blend_shape_count", 3905245786)

    internal val getBlendShapeNamePtr: VoidPtr =
        Internals.getMethodBindPtr("ImporterMesh", "get_blend_shape_name", 844755477)

    internal val setBlendShapeModePtr: VoidPtr =
        Internals.getMethodBindPtr("ImporterMesh", "set_blend_shape_mode", 227983991)

    internal val getBlendShapeModePtr: VoidPtr =
        Internals.getMethodBindPtr("ImporterMesh", "get_blend_shape_mode", 836485024)

    internal val addSurfacePtr: VoidPtr =
        Internals.getMethodBindPtr("ImporterMesh", "add_surface", 1740448849)

    internal val getSurfaceCountPtr: VoidPtr =
        Internals.getMethodBindPtr("ImporterMesh", "get_surface_count", 3905245786)

    internal val getSurfacePrimitiveTypePtr: VoidPtr =
        Internals.getMethodBindPtr("ImporterMesh", "get_surface_primitive_type", 3552571330)

    internal val getSurfaceNamePtr: VoidPtr =
        Internals.getMethodBindPtr("ImporterMesh", "get_surface_name", 844755477)

    internal val getSurfaceArraysPtr: VoidPtr =
        Internals.getMethodBindPtr("ImporterMesh", "get_surface_arrays", 663333327)

    internal val getSurfaceBlendShapeArraysPtr: VoidPtr =
        Internals.getMethodBindPtr("ImporterMesh", "get_surface_blend_shape_arrays", 2345056839)

    internal val getSurfaceLodCountPtr: VoidPtr =
        Internals.getMethodBindPtr("ImporterMesh", "get_surface_lod_count", 923996154)

    internal val getSurfaceLodSizePtr: VoidPtr =
        Internals.getMethodBindPtr("ImporterMesh", "get_surface_lod_size", 3085491603)

    internal val getSurfaceLodIndicesPtr: VoidPtr =
        Internals.getMethodBindPtr("ImporterMesh", "get_surface_lod_indices", 1265128013)

    internal val getSurfaceMaterialPtr: VoidPtr =
        Internals.getMethodBindPtr("ImporterMesh", "get_surface_material", 2897466400)

    internal val getSurfaceFormatPtr: VoidPtr =
        Internals.getMethodBindPtr("ImporterMesh", "get_surface_format", 923996154)

    internal val setSurfaceNamePtr: VoidPtr =
        Internals.getMethodBindPtr("ImporterMesh", "set_surface_name", 501894301)

    internal val setSurfaceMaterialPtr: VoidPtr =
        Internals.getMethodBindPtr("ImporterMesh", "set_surface_material", 3671737478)

    internal val generateLodsPtr: VoidPtr =
        Internals.getMethodBindPtr("ImporterMesh", "generate_lods", 2491878677)

    internal val getMeshPtr: VoidPtr =
        Internals.getMethodBindPtr("ImporterMesh", "get_mesh", 1457573577)

    internal val clearPtr: VoidPtr = Internals.getMethodBindPtr("ImporterMesh", "clear", 3218959716)

    internal val setLightmapSizeHintPtr: VoidPtr =
        Internals.getMethodBindPtr("ImporterMesh", "set_lightmap_size_hint", 1130785943)

    internal val getLightmapSizeHintPtr: VoidPtr =
        Internals.getMethodBindPtr("ImporterMesh", "get_lightmap_size_hint", 3690982128)
  }
}
