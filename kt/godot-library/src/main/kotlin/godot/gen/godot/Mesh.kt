// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.GodotBaseType
import godot.core.AABB
import godot.core.Dictionary
import godot.core.PackedVector3Array
import godot.core.StringName
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_VECTOR3_ARRAY
import godot.core.VariantType.VECTOR2I
import godot.core.Vector2i
import godot.core.memory.TransferContext
import kotlin.Any
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * A [godot.Resource] that contains vertex array-based geometry.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/678](https://godotengine.org/asset-library/asset/678)
 *
 * Mesh is a type of [godot.Resource] that contains vertex array-based geometry, divided in *surfaces*. Each surface contains a completely separate array and a material used to draw it. Design wise, a mesh with multiple surfaces is preferred to a single surface, because objects created in 3D editing software commonly contain multiple materials.
 */
@GodotBaseType
public open class Mesh : Resource() {
  /**
   * Sets a hint to be used for lightmap resolution.
   */
  public var lightmapSizeHint: Vector2i
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESH_GET_LIGHTMAP_SIZE_HINT,
          VECTOR2I)
      return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2I to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESH_SET_LIGHTMAP_SIZE_HINT, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_MESH, scriptIndex)
    return true
  }

  /**
   * Sets a hint to be used for lightmap resolution.
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
   * val myCoreType = mesh.lightmapSizeHint
   * //Your changes
   * mesh.lightmapSizeHint = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun lightmapSizeHint(block: Vector2i.() -> Unit): Vector2i = lightmapSizeHint.apply{
      block(this)
      lightmapSizeHint = this
  }


  /**
   * Virtual method to override the surface count for a custom class extending [godot.Mesh].
   */
  public open fun _getSurfaceCount(): Int {
    throw NotImplementedError("_get_surface_count is not implemented for Mesh")
  }

  /**
   * Virtual method to override the surface array length for a custom class extending [godot.Mesh].
   */
  public open fun _surfaceGetArrayLen(index: Int): Int {
    throw NotImplementedError("_surface_get_array_len is not implemented for Mesh")
  }

  /**
   * Virtual method to override the surface array index length for a custom class extending [godot.Mesh].
   */
  public open fun _surfaceGetArrayIndexLen(index: Int): Int {
    throw NotImplementedError("_surface_get_array_index_len is not implemented for Mesh")
  }

  /**
   * Virtual method to override the surface arrays for a custom class extending [godot.Mesh].
   */
  public open fun _surfaceGetArrays(index: Int): VariantArray<Any?> {
    throw NotImplementedError("_surface_get_arrays is not implemented for Mesh")
  }

  /**
   * Virtual method to override the blend shape arrays for a custom class extending [godot.Mesh].
   */
  public open fun _surfaceGetBlendShapeArrays(index: Int): VariantArray<VariantArray<Any?>> {
    throw NotImplementedError("_surface_get_blend_shape_arrays is not implemented for Mesh")
  }

  /**
   * Virtual method to override the surface LODs for a custom class extending [godot.Mesh].
   */
  public open fun _surfaceGetLods(index: Int): Dictionary<Any?, Any?> {
    throw NotImplementedError("_surface_get_lods is not implemented for Mesh")
  }

  /**
   * Virtual method to override the surface format for a custom class extending [godot.Mesh].
   */
  public open fun _surfaceGetFormat(index: Int): Long {
    throw NotImplementedError("_surface_get_format is not implemented for Mesh")
  }

  /**
   * Virtual method to override the surface primitive type for a custom class extending [godot.Mesh].
   */
  public open fun _surfaceGetPrimitiveType(index: Int): Long {
    throw NotImplementedError("_surface_get_primitive_type is not implemented for Mesh")
  }

  /**
   * Virtual method to override the setting of a [material] at the given [index] for a custom class extending [godot.Mesh].
   */
  public open fun _surfaceSetMaterial(index: Int, material: Material): Unit {
  }

  /**
   * Virtual method to override the surface material for a custom class extending [godot.Mesh].
   */
  public open fun _surfaceGetMaterial(index: Int): Material? {
    throw NotImplementedError("_surface_get_material is not implemented for Mesh")
  }

  /**
   * Virtual method to override the number of blend shapes for a custom class extending [godot.Mesh].
   */
  public open fun _getBlendShapeCount(): Int {
    throw NotImplementedError("_get_blend_shape_count is not implemented for Mesh")
  }

  /**
   * Virtual method to override the retrieval of blend shape names for a custom class extending [godot.Mesh].
   */
  public open fun _getBlendShapeName(index: Int): StringName {
    throw NotImplementedError("_get_blend_shape_name is not implemented for Mesh")
  }

  /**
   * Virtual method to override the names of blend shapes for a custom class extending [godot.Mesh].
   */
  public open fun _setBlendShapeName(index: Int, name: StringName): Unit {
  }

  /**
   * Virtual method to override the [AABB] for a custom class extending [godot.Mesh].
   */
  public open fun _getAabb(): AABB {
    throw NotImplementedError("_get_aabb is not implemented for Mesh")
  }

  /**
   * Returns the smallest [AABB] enclosing this mesh in local space. Not affected by `custom_aabb`.
   *
   * **Note:** This is only implemented for [godot.ArrayMesh] and [godot.PrimitiveMesh].
   */
  public fun getAabb(): AABB {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESH_GET_AABB,
        godot.core.VariantType.AABB)
    return (TransferContext.readReturnValue(godot.core.VariantType.AABB, false) as AABB)
  }

  /**
   * Returns all the vertices that make up the faces of the mesh. Each three vertices represent one triangle.
   */
  public fun getFaces(): PackedVector3Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESH_GET_FACES,
        PACKED_VECTOR3_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR3_ARRAY, false) as PackedVector3Array)
  }

  /**
   * Returns the number of surfaces that the [godot.Mesh] holds.
   */
  public fun getSurfaceCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESH_GET_SURFACE_COUNT, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the arrays for the vertices, normals, uvs, etc. that make up the requested surface (see [godot.ArrayMesh.addSurfaceFromArrays]).
   */
  public fun surfaceGetArrays(surfIdx: Int): VariantArray<Any?> {
    TransferContext.writeArguments(LONG to surfIdx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESH_SURFACE_GET_ARRAYS, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>)
  }

  /**
   * Returns the blend shape arrays for the requested surface.
   */
  public fun surfaceGetBlendShapeArrays(surfIdx: Int): VariantArray<VariantArray<Any?>> {
    TransferContext.writeArguments(LONG to surfIdx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESH_SURFACE_GET_BLEND_SHAPE_ARRAYS,
        ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<VariantArray<Any?>>)
  }

  /**
   * Sets a [godot.Material] for a given surface. Surface will be rendered using this material.
   */
  public fun surfaceSetMaterial(surfIdx: Int, material: Material): Unit {
    TransferContext.writeArguments(LONG to surfIdx.toLong(), OBJECT to material)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESH_SURFACE_SET_MATERIAL, NIL)
  }

  /**
   * Returns a [godot.Material] in a given surface. Surface is rendered using this material.
   */
  public fun surfaceGetMaterial(surfIdx: Int): Material? {
    TransferContext.writeArguments(LONG to surfIdx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESH_SURFACE_GET_MATERIAL, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Material?)
  }

  /**
   * Creates a placeholder version of this resource ([godot.PlaceholderMesh]).
   */
  public fun createPlaceholder(): Resource? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESH_CREATE_PLACEHOLDER, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Resource?)
  }

  /**
   * Calculate a [godot.ConcavePolygonShape3D] from the mesh.
   */
  public fun createTrimeshShape(): ConcavePolygonShape3D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESH_CREATE_TRIMESH_SHAPE, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as ConcavePolygonShape3D?)
  }

  /**
   * Calculate a [godot.ConvexPolygonShape3D] from the mesh.
   *
   * If [clean] is `true` (default), duplicate and interior vertices are removed automatically. You can set it to `false` to make the process faster if not needed.
   *
   * If [simplify] is `true`, the geometry can be further simplified to reduce the number of vertices. Disabled by default.
   */
  @JvmOverloads
  public fun createConvexShape(clean: Boolean = true, simplify: Boolean = false):
      ConvexPolygonShape3D? {
    TransferContext.writeArguments(BOOL to clean, BOOL to simplify)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESH_CREATE_CONVEX_SHAPE, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as ConvexPolygonShape3D?)
  }

  /**
   * Calculate an outline mesh at a defined offset (margin) from the original mesh.
   *
   * **Note:** This method typically returns the vertices in reverse order (e.g. clockwise to counterclockwise).
   */
  public fun createOutline(margin: Float): Mesh? {
    TransferContext.writeArguments(DOUBLE to margin.toDouble())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESH_CREATE_OUTLINE, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Mesh?)
  }

  /**
   * Generate a [godot.TriangleMesh] from the mesh. Considers only surfaces using one of these primitive types: [PRIMITIVE_TRIANGLES], [PRIMITIVE_TRIANGLE_STRIP].
   */
  public fun generateTriangleMesh(): TriangleMesh? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESH_GENERATE_TRIANGLE_MESH, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as TriangleMesh?)
  }

  public enum class PrimitiveType(
    id: Long,
  ) {
    /**
     * Render array as points (one vertex equals one point).
     */
    PRIMITIVE_POINTS(0),
    /**
     * Render array as lines (every two vertices a line is created).
     */
    PRIMITIVE_LINES(1),
    /**
     * Render array as line strip.
     */
    PRIMITIVE_LINE_STRIP(2),
    /**
     * Render array as triangles (every three vertices a triangle is created).
     */
    PRIMITIVE_TRIANGLES(3),
    /**
     * Render array as triangle strips.
     */
    PRIMITIVE_TRIANGLE_STRIP(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class ArrayType(
    id: Long,
  ) {
    /**
     * [godot.PackedVector3Array], [godot.PackedVector2Array], or [godot.Array] of vertex positions.
     */
    ARRAY_VERTEX(0),
    /**
     * [godot.PackedVector3Array] of vertex normals.
     */
    ARRAY_NORMAL(1),
    /**
     * [godot.PackedFloat32Array] of vertex tangents. Each element in groups of 4 floats, first 3 floats determine the tangent, and the last the binormal direction as -1 or 1.
     */
    ARRAY_TANGENT(2),
    /**
     * [godot.PackedColorArray] of vertex colors.
     */
    ARRAY_COLOR(3),
    /**
     * [godot.PackedVector2Array] for UV coordinates.
     */
    ARRAY_TEX_UV(4),
    /**
     * [godot.PackedVector2Array] for second UV coordinates.
     */
    ARRAY_TEX_UV2(5),
    /**
     * Contains custom color channel 0. [godot.PackedByteArray] if `(format >> Mesh.ARRAY_FORMAT_CUSTOM0_SHIFT) & Mesh.ARRAY_FORMAT_CUSTOM_MASK` is [godot.ARRAY_CUSTOM_RGBA8_UNORM], [godot.ARRAY_CUSTOM_RGBA8_UNORM], [ARRAY_CUSTOM_RG_HALF] or [ARRAY_CUSTOM_RGBA_HALF]. [godot.PackedFloat32Array] otherwise.
     */
    ARRAY_CUSTOM0(6),
    /**
     * Contains custom color channel 1. [godot.PackedByteArray] if `(format >> Mesh.ARRAY_FORMAT_CUSTOM1_SHIFT) & Mesh.ARRAY_FORMAT_CUSTOM_MASK` is [godot.ARRAY_CUSTOM_RGBA8_UNORM], [godot.ARRAY_CUSTOM_RGBA8_UNORM], [ARRAY_CUSTOM_RG_HALF] or [ARRAY_CUSTOM_RGBA_HALF]. [godot.PackedFloat32Array] otherwise.
     */
    ARRAY_CUSTOM1(7),
    /**
     * Contains custom color channel 2. [godot.PackedByteArray] if `(format >> Mesh.ARRAY_FORMAT_CUSTOM2_SHIFT) & Mesh.ARRAY_FORMAT_CUSTOM_MASK` is [godot.ARRAY_CUSTOM_RGBA8_UNORM], [godot.ARRAY_CUSTOM_RGBA8_UNORM], [ARRAY_CUSTOM_RG_HALF] or [ARRAY_CUSTOM_RGBA_HALF]. [godot.PackedFloat32Array] otherwise.
     */
    ARRAY_CUSTOM2(8),
    /**
     * Contains custom color channel 3. [godot.PackedByteArray] if `(format >> Mesh.ARRAY_FORMAT_CUSTOM3_SHIFT) & Mesh.ARRAY_FORMAT_CUSTOM_MASK` is [godot.ARRAY_CUSTOM_RGBA8_UNORM], [godot.ARRAY_CUSTOM_RGBA8_UNORM], [ARRAY_CUSTOM_RG_HALF] or [ARRAY_CUSTOM_RGBA_HALF]. [godot.PackedFloat32Array] otherwise.
     */
    ARRAY_CUSTOM3(9),
    /**
     * [godot.PackedFloat32Array] or [godot.PackedInt32Array] of bone indices. Contains either 4 or 8 numbers per vertex depending on the presence of the [godot.ARRAY_FLAG_USE_8_BONE_WEIGHTS] flag.
     */
    ARRAY_BONES(10),
    /**
     * [godot.PackedFloat32Array] or [godot.PackedFloat64Array] of bone weights in the range `0.0` to `1.0` (inclusive). Contains either 4 or 8 numbers per vertex depending on the presence of the [godot.ARRAY_FLAG_USE_8_BONE_WEIGHTS] flag.
     */
    ARRAY_WEIGHTS(11),
    /**
     * [godot.PackedInt32Array] of integers used as indices referencing vertices, colors, normals, tangents, and textures. All of those arrays must have the same number of elements as the vertex array. No index can be beyond the vertex array size. When this index array is present, it puts the function into "index mode," where the index selects the *i*'th vertex, normal, tangent, color, UV, etc. This means if you want to have different normals or colors along an edge, you have to duplicate the vertices.
     *
     * For triangles, the index array is interpreted as triples, referring to the vertices of each triangle. For lines, the index array is in pairs indicating the start and end of each line.
     */
    ARRAY_INDEX(12),
    /**
     * Represents the size of the [enum ArrayType] enum.
     */
    ARRAY_MAX(13),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class ArrayCustomFormat(
    id: Long,
  ) {
    /**
     * Indicates this custom channel contains unsigned normalized byte colors from 0 to 1, encoded as [godot.PackedByteArray].
     */
    ARRAY_CUSTOM_RGBA8_UNORM(0),
    /**
     * Indicates this custom channel contains signed normalized byte colors from -1 to 1, encoded as [godot.PackedByteArray].
     */
    ARRAY_CUSTOM_RGBA8_SNORM(1),
    /**
     * Indicates this custom channel contains half precision float colors, encoded as [godot.PackedByteArray]. Only red and green channels are used.
     */
    ARRAY_CUSTOM_RG_HALF(2),
    /**
     * Indicates this custom channel contains half precision float colors, encoded as [godot.PackedByteArray].
     */
    ARRAY_CUSTOM_RGBA_HALF(3),
    /**
     * Indicates this custom channel contains full float colors, in a [godot.PackedFloat32Array]. Only the red channel is used.
     */
    ARRAY_CUSTOM_R_FLOAT(4),
    /**
     * Indicates this custom channel contains full float colors, in a [godot.PackedFloat32Array]. Only red and green channels are used.
     */
    ARRAY_CUSTOM_RG_FLOAT(5),
    /**
     * Indicates this custom channel contains full float colors, in a [godot.PackedFloat32Array]. Only red, green and blue channels are used.
     */
    ARRAY_CUSTOM_RGB_FLOAT(6),
    /**
     * Indicates this custom channel contains full float colors, in a [godot.PackedFloat32Array].
     */
    ARRAY_CUSTOM_RGBA_FLOAT(7),
    /**
     * Represents the size of the [enum ArrayCustomFormat] enum.
     */
    ARRAY_CUSTOM_MAX(8),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class ArrayFormat(
    id: Long,
  ) {
    /**
     * Mesh array contains vertices. All meshes require a vertex array so this should always be present.
     */
    ARRAY_FORMAT_VERTEX(1),
    /**
     * Mesh array contains normals.
     */
    ARRAY_FORMAT_NORMAL(2),
    /**
     * Mesh array contains tangents.
     */
    ARRAY_FORMAT_TANGENT(4),
    /**
     * Mesh array contains colors.
     */
    ARRAY_FORMAT_COLOR(8),
    /**
     * Mesh array contains UVs.
     */
    ARRAY_FORMAT_TEX_UV(16),
    /**
     * Mesh array contains second UV.
     */
    ARRAY_FORMAT_TEX_UV2(32),
    /**
     * Mesh array contains custom channel index 0.
     */
    ARRAY_FORMAT_CUSTOM0(64),
    /**
     * Mesh array contains custom channel index 1.
     */
    ARRAY_FORMAT_CUSTOM1(128),
    /**
     * Mesh array contains custom channel index 2.
     */
    ARRAY_FORMAT_CUSTOM2(256),
    /**
     * Mesh array contains custom channel index 3.
     */
    ARRAY_FORMAT_CUSTOM3(512),
    /**
     * Mesh array contains bones.
     */
    ARRAY_FORMAT_BONES(1024),
    /**
     * Mesh array contains bone weights.
     */
    ARRAY_FORMAT_WEIGHTS(2048),
    /**
     * Mesh array uses indices.
     */
    ARRAY_FORMAT_INDEX(4096),
    /**
     * Mask of mesh channels permitted in blend shapes.
     */
    ARRAY_FORMAT_BLEND_SHAPE_MASK(7),
    /**
     * Shift of first custom channel.
     */
    ARRAY_FORMAT_CUSTOM_BASE(13),
    /**
     * Number of format bits per custom channel. See [enum ArrayCustomFormat].
     */
    ARRAY_FORMAT_CUSTOM_BITS(3),
    /**
     * Amount to shift [enum ArrayCustomFormat] for custom channel index 0.
     */
    ARRAY_FORMAT_CUSTOM0_SHIFT(13),
    /**
     * Amount to shift [enum ArrayCustomFormat] for custom channel index 1.
     */
    ARRAY_FORMAT_CUSTOM1_SHIFT(16),
    /**
     * Amount to shift [enum ArrayCustomFormat] for custom channel index 2.
     */
    ARRAY_FORMAT_CUSTOM2_SHIFT(19),
    /**
     * Amount to shift [enum ArrayCustomFormat] for custom channel index 3.
     */
    ARRAY_FORMAT_CUSTOM3_SHIFT(22),
    /**
     * Mask of custom format bits per custom channel. Must be shifted by one of the SHIFT constants. See [enum ArrayCustomFormat].
     */
    ARRAY_FORMAT_CUSTOM_MASK(7),
    /**
     * Shift of first compress flag. Compress flags should be passed to [godot.ArrayMesh.addSurfaceFromArrays] and [godot.SurfaceTool.commit].
     */
    ARRAY_COMPRESS_FLAGS_BASE(25),
    /**
     * Flag used to mark that the array contains 2D vertices.
     */
    ARRAY_FLAG_USE_2D_VERTICES(33554432),
    /**
     * Flag indices that the mesh data will use `GL_DYNAMIC_DRAW` on GLES. Unused on Vulkan.
     */
    ARRAY_FLAG_USE_DYNAMIC_UPDATE(67108864),
    /**
     * Flag used to mark that the mesh contains up to 8 bone influences per vertex. This flag indicates that [ARRAY_BONES] and [ARRAY_WEIGHTS] elements will have double length.
     */
    ARRAY_FLAG_USE_8_BONE_WEIGHTS(134217728),
    /**
     * Flag used to mark that the mesh intentionally contains no vertex array.
     */
    ARRAY_FLAG_USES_EMPTY_VERTEX_ARRAY(268435456),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class BlendShapeMode(
    id: Long,
  ) {
    /**
     * Blend shapes are normalized.
     */
    BLEND_SHAPE_MODE_NORMALIZED(0),
    /**
     * Blend shapes are relative to base weight.
     */
    BLEND_SHAPE_MODE_RELATIVE(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object
}
