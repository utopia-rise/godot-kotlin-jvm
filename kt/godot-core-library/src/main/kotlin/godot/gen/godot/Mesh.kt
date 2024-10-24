// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.AABB
import godot.core.Dictionary
import godot.core.PackedVector3Array
import godot.core.StringName
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_VECTOR3_ARRAY
import godot.core.VariantParser.VECTOR2I
import godot.core.Vector2i
import kotlin.Any
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

/**
 * Mesh is a type of [Resource] that contains vertex array-based geometry, divided in *surfaces*.
 * Each surface contains a completely separate array and a material used to draw it. Design wise, a
 * mesh with multiple surfaces is preferred to a single surface, because objects created in 3D editing
 * software commonly contain multiple materials. The maximum number of surfaces per mesh is
 * [RenderingServer.MAX_MESH_SURFACES].
 */
@GodotBaseType
public open class Mesh : Resource() {
  /**
   * Sets a hint to be used for lightmap resolution.
   */
  @CoreTypeLocalCopy
  public final inline var lightmapSizeHint: Vector2i
    @JvmName("lightmapSizeHintProperty")
    get() = getLightmapSizeHint()
    @JvmName("lightmapSizeHintProperty")
    set(`value`) {
      setLightmapSizeHint(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_MESH, scriptIndex)
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
  public final fun lightmapSizeHintMutate(block: Vector2i.() -> Unit): Vector2i =
      lightmapSizeHint.apply{
      block(this)
      lightmapSizeHint = this
  }


  /**
   * Virtual method to override the surface count for a custom class extending [Mesh].
   */
  public open fun _getSurfaceCount(): Int {
    throw NotImplementedError("_get_surface_count is not implemented for Mesh")
  }

  /**
   * Virtual method to override the surface array length for a custom class extending [Mesh].
   */
  public open fun _surfaceGetArrayLen(index: Int): Int {
    throw NotImplementedError("_surface_get_array_len is not implemented for Mesh")
  }

  /**
   * Virtual method to override the surface array index length for a custom class extending [Mesh].
   */
  public open fun _surfaceGetArrayIndexLen(index: Int): Int {
    throw NotImplementedError("_surface_get_array_index_len is not implemented for Mesh")
  }

  /**
   * Virtual method to override the surface arrays for a custom class extending [Mesh].
   */
  public open fun _surfaceGetArrays(index: Int): VariantArray<Any?> {
    throw NotImplementedError("_surface_get_arrays is not implemented for Mesh")
  }

  /**
   * Virtual method to override the blend shape arrays for a custom class extending [Mesh].
   */
  public open fun _surfaceGetBlendShapeArrays(index: Int): VariantArray<VariantArray<Any?>> {
    throw NotImplementedError("_surface_get_blend_shape_arrays is not implemented for Mesh")
  }

  /**
   * Virtual method to override the surface LODs for a custom class extending [Mesh].
   */
  public open fun _surfaceGetLods(index: Int): Dictionary<Any?, Any?> {
    throw NotImplementedError("_surface_get_lods is not implemented for Mesh")
  }

  /**
   * Virtual method to override the surface format for a custom class extending [Mesh].
   */
  public open fun _surfaceGetFormat(index: Int): Long {
    throw NotImplementedError("_surface_get_format is not implemented for Mesh")
  }

  /**
   * Virtual method to override the surface primitive type for a custom class extending [Mesh].
   */
  public open fun _surfaceGetPrimitiveType(index: Int): Long {
    throw NotImplementedError("_surface_get_primitive_type is not implemented for Mesh")
  }

  /**
   * Virtual method to override the setting of a [material] at the given [index] for a custom class
   * extending [Mesh].
   */
  public open fun _surfaceSetMaterial(index: Int, material: Material?): Unit {
  }

  /**
   * Virtual method to override the surface material for a custom class extending [Mesh].
   */
  public open fun _surfaceGetMaterial(index: Int): Material? {
    throw NotImplementedError("_surface_get_material is not implemented for Mesh")
  }

  /**
   * Virtual method to override the number of blend shapes for a custom class extending [Mesh].
   */
  public open fun _getBlendShapeCount(): Int {
    throw NotImplementedError("_get_blend_shape_count is not implemented for Mesh")
  }

  /**
   * Virtual method to override the retrieval of blend shape names for a custom class extending
   * [Mesh].
   */
  public open fun _getBlendShapeName(index: Int): StringName {
    throw NotImplementedError("_get_blend_shape_name is not implemented for Mesh")
  }

  /**
   * Virtual method to override the names of blend shapes for a custom class extending [Mesh].
   */
  public open fun _setBlendShapeName(index: Int, name: StringName): Unit {
  }

  /**
   * Virtual method to override the [AABB] for a custom class extending [Mesh].
   */
  public open fun _getAabb(): AABB {
    throw NotImplementedError("_get_aabb is not implemented for Mesh")
  }

  public final fun setLightmapSizeHint(size: Vector2i): Unit {
    TransferContext.writeArguments(VECTOR2I to size)
    TransferContext.callMethod(ptr, MethodBindings.setLightmapSizeHintPtr, NIL)
  }

  public final fun getLightmapSizeHint(): Vector2i {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLightmapSizeHintPtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I) as Vector2i)
  }

  /**
   * Returns the smallest [AABB] enclosing this mesh in local space. Not affected by `custom_aabb`.
   * **Note:** This is only implemented for [ArrayMesh] and [PrimitiveMesh].
   */
  public final fun getAabb(): AABB {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAabbPtr, godot.core.VariantParser.AABB)
    return (TransferContext.readReturnValue(godot.core.VariantParser.AABB) as AABB)
  }

  /**
   * Returns all the vertices that make up the faces of the mesh. Each three vertices represent one
   * triangle.
   */
  public final fun getFaces(): PackedVector3Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFacesPtr, PACKED_VECTOR3_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR3_ARRAY) as PackedVector3Array)
  }

  /**
   * Returns the number of surfaces that the [Mesh] holds. This is equivalent to
   * [MeshInstance3D.getSurfaceOverrideMaterialCount].
   */
  public final fun getSurfaceCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSurfaceCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the arrays for the vertices, normals, UVs, etc. that make up the requested surface (see
   * [ArrayMesh.addSurfaceFromArrays]).
   */
  public final fun surfaceGetArrays(surfIdx: Int): VariantArray<Any?> {
    TransferContext.writeArguments(LONG to surfIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.surfaceGetArraysPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Any?>)
  }

  /**
   * Returns the blend shape arrays for the requested surface.
   */
  public final fun surfaceGetBlendShapeArrays(surfIdx: Int): VariantArray<VariantArray<Any?>> {
    TransferContext.writeArguments(LONG to surfIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.surfaceGetBlendShapeArraysPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<VariantArray<Any?>>)
  }

  /**
   * Sets a [Material] for a given surface. Surface will be rendered using this material.
   * **Note:** This assigns the material within the [Mesh] resource, not the [Material] associated
   * to the [MeshInstance3D]'s Surface Material Override properties. To set the [Material] associated
   * to the [MeshInstance3D]'s Surface Material Override properties, use
   * [MeshInstance3D.setSurfaceOverrideMaterial] instead.
   */
  public final fun surfaceSetMaterial(surfIdx: Int, material: Material?): Unit {
    TransferContext.writeArguments(LONG to surfIdx.toLong(), OBJECT to material)
    TransferContext.callMethod(ptr, MethodBindings.surfaceSetMaterialPtr, NIL)
  }

  /**
   * Returns a [Material] in a given surface. Surface is rendered using this material.
   * **Note:** This returns the material within the [Mesh] resource, not the [Material] associated
   * to the [MeshInstance3D]'s Surface Material Override properties. To get the [Material] associated
   * to the [MeshInstance3D]'s Surface Material Override properties, use
   * [MeshInstance3D.getSurfaceOverrideMaterial] instead.
   */
  public final fun surfaceGetMaterial(surfIdx: Int): Material? {
    TransferContext.writeArguments(LONG to surfIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.surfaceGetMaterialPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Material?)
  }

  /**
   * Creates a placeholder version of this resource ([PlaceholderMesh]).
   */
  public final fun createPlaceholder(): Resource? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.createPlaceholderPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Resource?)
  }

  /**
   * Calculate a [ConcavePolygonShape3D] from the mesh.
   */
  public final fun createTrimeshShape(): ConcavePolygonShape3D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.createTrimeshShapePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as ConcavePolygonShape3D?)
  }

  /**
   * Calculate a [ConvexPolygonShape3D] from the mesh.
   * If [clean] is `true` (default), duplicate and interior vertices are removed automatically. You
   * can set it to `false` to make the process faster if not needed.
   * If [simplify] is `true`, the geometry can be further simplified to reduce the number of
   * vertices. Disabled by default.
   */
  @JvmOverloads
  public final fun createConvexShape(clean: Boolean = true, simplify: Boolean = false):
      ConvexPolygonShape3D? {
    TransferContext.writeArguments(BOOL to clean, BOOL to simplify)
    TransferContext.callMethod(ptr, MethodBindings.createConvexShapePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as ConvexPolygonShape3D?)
  }

  /**
   * Calculate an outline mesh at a defined offset (margin) from the original mesh.
   * **Note:** This method typically returns the vertices in reverse order (e.g. clockwise to
   * counterclockwise).
   */
  public final fun createOutline(margin: Float): Mesh? {
    TransferContext.writeArguments(DOUBLE to margin.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.createOutlinePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Mesh?)
  }

  /**
   * Generate a [TriangleMesh] from the mesh. Considers only surfaces using one of these primitive
   * types: [PRIMITIVE_TRIANGLES], [PRIMITIVE_TRIANGLE_STRIP].
   */
  public final fun generateTriangleMesh(): TriangleMesh? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.generateTriangleMeshPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as TriangleMesh?)
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
      public fun from(`value`: Long): PrimitiveType = entries.single { it.id == `value` }
    }
  }

  public enum class ArrayType(
    id: Long,
  ) {
    /**
     * [PackedVector3Array], [PackedVector2Array], or [Array] of vertex positions.
     */
    ARRAY_VERTEX(0),
    /**
     * [PackedVector3Array] of vertex normals.
     * **Note:** The array has to consist of normal vectors, otherwise they will be normalized by
     * the engine, potentially causing visual discrepancies.
     */
    ARRAY_NORMAL(1),
    /**
     * [PackedFloat32Array] of vertex tangents. Each element in groups of 4 floats, first 3 floats
     * determine the tangent, and the last the binormal direction as -1 or 1.
     */
    ARRAY_TANGENT(2),
    /**
     * [PackedColorArray] of vertex colors.
     */
    ARRAY_COLOR(3),
    /**
     * [PackedVector2Array] for UV coordinates.
     */
    ARRAY_TEX_UV(4),
    /**
     * [PackedVector2Array] for second UV coordinates.
     */
    ARRAY_TEX_UV2(5),
    /**
     * Contains custom color channel 0. [PackedByteArray] if `(format >>
     * Mesh.ARRAY_FORMAT_CUSTOM0_SHIFT) & Mesh.ARRAY_FORMAT_CUSTOM_MASK` is [ARRAY_CUSTOM_RGBA8_UNORM],
     * [ARRAY_CUSTOM_RGBA8_SNORM], [ARRAY_CUSTOM_RG_HALF], or [ARRAY_CUSTOM_RGBA_HALF].
     * [PackedFloat32Array] otherwise.
     */
    ARRAY_CUSTOM0(6),
    /**
     * Contains custom color channel 1. [PackedByteArray] if `(format >>
     * Mesh.ARRAY_FORMAT_CUSTOM1_SHIFT) & Mesh.ARRAY_FORMAT_CUSTOM_MASK` is [ARRAY_CUSTOM_RGBA8_UNORM],
     * [ARRAY_CUSTOM_RGBA8_SNORM], [ARRAY_CUSTOM_RG_HALF], or [ARRAY_CUSTOM_RGBA_HALF].
     * [PackedFloat32Array] otherwise.
     */
    ARRAY_CUSTOM1(7),
    /**
     * Contains custom color channel 2. [PackedByteArray] if `(format >>
     * Mesh.ARRAY_FORMAT_CUSTOM2_SHIFT) & Mesh.ARRAY_FORMAT_CUSTOM_MASK` is [ARRAY_CUSTOM_RGBA8_UNORM],
     * [ARRAY_CUSTOM_RGBA8_SNORM], [ARRAY_CUSTOM_RG_HALF], or [ARRAY_CUSTOM_RGBA_HALF].
     * [PackedFloat32Array] otherwise.
     */
    ARRAY_CUSTOM2(8),
    /**
     * Contains custom color channel 3. [PackedByteArray] if `(format >>
     * Mesh.ARRAY_FORMAT_CUSTOM3_SHIFT) & Mesh.ARRAY_FORMAT_CUSTOM_MASK` is [ARRAY_CUSTOM_RGBA8_UNORM],
     * [ARRAY_CUSTOM_RGBA8_SNORM], [ARRAY_CUSTOM_RG_HALF], or [ARRAY_CUSTOM_RGBA_HALF].
     * [PackedFloat32Array] otherwise.
     */
    ARRAY_CUSTOM3(9),
    /**
     * [PackedFloat32Array] or [PackedInt32Array] of bone indices. Contains either 4 or 8 numbers
     * per vertex depending on the presence of the [ARRAY_FLAG_USE_8_BONE_WEIGHTS] flag.
     */
    ARRAY_BONES(10),
    /**
     * [PackedFloat32Array] or [PackedFloat64Array] of bone weights in the range `0.0` to `1.0`
     * (inclusive). Contains either 4 or 8 numbers per vertex depending on the presence of the
     * [ARRAY_FLAG_USE_8_BONE_WEIGHTS] flag.
     */
    ARRAY_WEIGHTS(11),
    /**
     * [PackedInt32Array] of integers used as indices referencing vertices, colors, normals,
     * tangents, and textures. All of those arrays must have the same number of elements as the vertex
     * array. No index can be beyond the vertex array size. When this index array is present, it puts
     * the function into "index mode," where the index selects the *i*'th vertex, normal, tangent,
     * color, UV, etc. This means if you want to have different normals or colors along an edge, you
     * have to duplicate the vertices.
     * For triangles, the index array is interpreted as triples, referring to the vertices of each
     * triangle. For lines, the index array is in pairs indicating the start and end of each line.
     */
    ARRAY_INDEX(12),
    /**
     * Represents the size of the [ArrayType] enum.
     */
    ARRAY_MAX(13),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ArrayType = entries.single { it.id == `value` }
    }
  }

  public enum class ArrayCustomFormat(
    id: Long,
  ) {
    /**
     * Indicates this custom channel contains unsigned normalized byte colors from 0 to 1, encoded
     * as [PackedByteArray].
     */
    ARRAY_CUSTOM_RGBA8_UNORM(0),
    /**
     * Indicates this custom channel contains signed normalized byte colors from -1 to 1, encoded as
     * [PackedByteArray].
     */
    ARRAY_CUSTOM_RGBA8_SNORM(1),
    /**
     * Indicates this custom channel contains half precision float colors, encoded as
     * [PackedByteArray]. Only red and green channels are used.
     */
    ARRAY_CUSTOM_RG_HALF(2),
    /**
     * Indicates this custom channel contains half precision float colors, encoded as
     * [PackedByteArray].
     */
    ARRAY_CUSTOM_RGBA_HALF(3),
    /**
     * Indicates this custom channel contains full float colors, in a [PackedFloat32Array]. Only the
     * red channel is used.
     */
    ARRAY_CUSTOM_R_FLOAT(4),
    /**
     * Indicates this custom channel contains full float colors, in a [PackedFloat32Array]. Only red
     * and green channels are used.
     */
    ARRAY_CUSTOM_RG_FLOAT(5),
    /**
     * Indicates this custom channel contains full float colors, in a [PackedFloat32Array]. Only
     * red, green and blue channels are used.
     */
    ARRAY_CUSTOM_RGB_FLOAT(6),
    /**
     * Indicates this custom channel contains full float colors, in a [PackedFloat32Array].
     */
    ARRAY_CUSTOM_RGBA_FLOAT(7),
    /**
     * Represents the size of the [ArrayCustomFormat] enum.
     */
    ARRAY_CUSTOM_MAX(8),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ArrayCustomFormat = entries.single { it.id == `value` }
    }
  }

  public sealed interface ArrayFormat {
    public val flag: Long

    public infix fun or(other: ArrayFormat): ArrayFormat = ArrayFormatValue(flag.or(other.flag))

    public infix fun or(other: Long): ArrayFormat = ArrayFormatValue(flag.or(other))

    public infix fun xor(other: ArrayFormat): ArrayFormat = ArrayFormatValue(flag.xor(other.flag))

    public infix fun xor(other: Long): ArrayFormat = ArrayFormatValue(flag.xor(other))

    public infix fun and(other: ArrayFormat): ArrayFormat = ArrayFormatValue(flag.and(other.flag))

    public infix fun and(other: Long): ArrayFormat = ArrayFormatValue(flag.and(other))

    public operator fun plus(other: ArrayFormat): ArrayFormat =
        ArrayFormatValue(flag.plus(other.flag))

    public operator fun plus(other: Long): ArrayFormat = ArrayFormatValue(flag.plus(other))

    public operator fun minus(other: ArrayFormat): ArrayFormat =
        ArrayFormatValue(flag.minus(other.flag))

    public operator fun minus(other: Long): ArrayFormat = ArrayFormatValue(flag.minus(other))

    public operator fun times(other: ArrayFormat): ArrayFormat =
        ArrayFormatValue(flag.times(other.flag))

    public operator fun times(other: Long): ArrayFormat = ArrayFormatValue(flag.times(other))

    public operator fun div(other: ArrayFormat): ArrayFormat =
        ArrayFormatValue(flag.div(other.flag))

    public operator fun div(other: Long): ArrayFormat = ArrayFormatValue(flag.div(other))

    public operator fun rem(other: ArrayFormat): ArrayFormat =
        ArrayFormatValue(flag.rem(other.flag))

    public operator fun rem(other: Long): ArrayFormat = ArrayFormatValue(flag.rem(other))

    public fun unaryPlus(): ArrayFormat = ArrayFormatValue(flag.unaryPlus())

    public fun unaryMinus(): ArrayFormat = ArrayFormatValue(flag.unaryMinus())

    public fun inv(): ArrayFormat = ArrayFormatValue(flag.inv())

    public infix fun shl(bits: Int): ArrayFormat = ArrayFormatValue(flag shl bits)

    public infix fun shr(bits: Int): ArrayFormat = ArrayFormatValue(flag shr bits)

    public infix fun ushr(bits: Int): ArrayFormat = ArrayFormatValue(flag ushr bits)

    public companion object {
      public val ARRAY_FORMAT_VERTEX: ArrayFormat = ArrayFormatValue(1)

      public val ARRAY_FORMAT_NORMAL: ArrayFormat = ArrayFormatValue(2)

      public val ARRAY_FORMAT_TANGENT: ArrayFormat = ArrayFormatValue(4)

      public val ARRAY_FORMAT_COLOR: ArrayFormat = ArrayFormatValue(8)

      public val ARRAY_FORMAT_TEX_UV: ArrayFormat = ArrayFormatValue(16)

      public val ARRAY_FORMAT_TEX_UV2: ArrayFormat = ArrayFormatValue(32)

      public val ARRAY_FORMAT_CUSTOM0: ArrayFormat = ArrayFormatValue(64)

      public val ARRAY_FORMAT_CUSTOM1: ArrayFormat = ArrayFormatValue(128)

      public val ARRAY_FORMAT_CUSTOM2: ArrayFormat = ArrayFormatValue(256)

      public val ARRAY_FORMAT_CUSTOM3: ArrayFormat = ArrayFormatValue(512)

      public val ARRAY_FORMAT_BONES: ArrayFormat = ArrayFormatValue(1024)

      public val ARRAY_FORMAT_WEIGHTS: ArrayFormat = ArrayFormatValue(2048)

      public val ARRAY_FORMAT_INDEX: ArrayFormat = ArrayFormatValue(4096)

      public val ARRAY_FORMAT_BLEND_SHAPE_MASK: ArrayFormat = ArrayFormatValue(7)

      public val ARRAY_FORMAT_CUSTOM_BASE: ArrayFormat = ArrayFormatValue(13)

      public val ARRAY_FORMAT_CUSTOM_BITS: ArrayFormat = ArrayFormatValue(3)

      public val ARRAY_FORMAT_CUSTOM0_SHIFT: ArrayFormat = ArrayFormatValue(13)

      public val ARRAY_FORMAT_CUSTOM1_SHIFT: ArrayFormat = ArrayFormatValue(16)

      public val ARRAY_FORMAT_CUSTOM2_SHIFT: ArrayFormat = ArrayFormatValue(19)

      public val ARRAY_FORMAT_CUSTOM3_SHIFT: ArrayFormat = ArrayFormatValue(22)

      public val ARRAY_FORMAT_CUSTOM_MASK: ArrayFormat = ArrayFormatValue(7)

      public val ARRAY_COMPRESS_FLAGS_BASE: ArrayFormat = ArrayFormatValue(25)

      public val ARRAY_FLAG_USE_2D_VERTICES: ArrayFormat = ArrayFormatValue(33554432)

      public val ARRAY_FLAG_USE_DYNAMIC_UPDATE: ArrayFormat = ArrayFormatValue(67108864)

      public val ARRAY_FLAG_USE_8_BONE_WEIGHTS: ArrayFormat = ArrayFormatValue(134217728)

      public val ARRAY_FLAG_USES_EMPTY_VERTEX_ARRAY: ArrayFormat = ArrayFormatValue(268435456)

      public val ARRAY_FLAG_COMPRESS_ATTRIBUTES: ArrayFormat = ArrayFormatValue(536870912)
    }
  }

  @JvmInline
  internal value class ArrayFormatValue internal constructor(
    public override val flag: Long,
  ) : ArrayFormat

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
      public fun from(`value`: Long): BlendShapeMode = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setLightmapSizeHintPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Mesh", "set_lightmap_size_hint", 1130785943)

    public val getLightmapSizeHintPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Mesh", "get_lightmap_size_hint", 3690982128)

    public val getAabbPtr: VoidPtr = TypeManager.getMethodBindPtr("Mesh", "get_aabb", 1068685055)

    public val getFacesPtr: VoidPtr = TypeManager.getMethodBindPtr("Mesh", "get_faces", 497664490)

    public val getSurfaceCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Mesh", "get_surface_count", 3905245786)

    public val surfaceGetArraysPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Mesh", "surface_get_arrays", 663333327)

    public val surfaceGetBlendShapeArraysPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Mesh", "surface_get_blend_shape_arrays", 663333327)

    public val surfaceSetMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Mesh", "surface_set_material", 3671737478)

    public val surfaceGetMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Mesh", "surface_get_material", 2897466400)

    public val createPlaceholderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Mesh", "create_placeholder", 121922552)

    public val createTrimeshShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Mesh", "create_trimesh_shape", 4160111210)

    public val createConvexShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Mesh", "create_convex_shape", 2529984628)

    public val createOutlinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Mesh", "create_outline", 1208642001)

    public val generateTriangleMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Mesh", "generate_triangle_mesh", 3476533166)
  }
}

public infix fun Long.or(other: godot.Mesh.ArrayFormat): Long = this.or(other.flag)

public infix fun Long.xor(other: godot.Mesh.ArrayFormat): Long = this.xor(other.flag)

public infix fun Long.and(other: godot.Mesh.ArrayFormat): Long = this.and(other.flag)

public operator fun Long.plus(other: godot.Mesh.ArrayFormat): Long = this.plus(other.flag)

public operator fun Long.minus(other: godot.Mesh.ArrayFormat): Long = this.minus(other.flag)

public operator fun Long.times(other: godot.Mesh.ArrayFormat): Long = this.times(other.flag)

public operator fun Long.div(other: godot.Mesh.ArrayFormat): Long = this.div(other.flag)

public operator fun Long.rem(other: godot.Mesh.ArrayFormat): Long = this.rem(other.flag)
