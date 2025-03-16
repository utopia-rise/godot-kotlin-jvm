// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.AABB
import godot.core.Color
import godot.core.PackedColorArray
import godot.core.PackedFloat32Array
import godot.core.PackedInt32Array
import godot.core.PackedVector2Array
import godot.core.PackedVector3Array
import godot.core.Plane
import godot.core.Transform3D
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.COLOR
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_COLOR_ARRAY
import godot.core.VariantParser.PACKED_FLOAT_32_ARRAY
import godot.core.VariantParser.PACKED_INT_32_ARRAY
import godot.core.VariantParser.PACKED_VECTOR2_ARRAY
import godot.core.VariantParser.PACKED_VECTOR3_ARRAY
import godot.core.VariantParser.PLANE
import godot.core.VariantParser.STRING
import godot.core.VariantParser.TRANSFORM3D
import godot.core.VariantParser.VECTOR2
import godot.core.VariantParser.VECTOR3
import godot.core.Vector2
import godot.core.Vector3
import kotlin.Any
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * The [SurfaceTool] is used to construct a [Mesh] by specifying vertex attributes individually. It
 * can be used to construct a [Mesh] from a script. All properties except indices need to be added
 * before calling [addVertex]. For example, to add vertex colors and UVs:
 *
 * ```gdscript
 * //gdscript
 * var st = SurfaceTool.new()
 * st.begin(Mesh.PRIMITIVE_TRIANGLES)
 * st.set_color(Color(1, 0, 0))
 * st.set_uv(Vector2(0, 0))
 * st.add_vertex(Vector3(0, 0, 0))
 * ```
 *
 * ```csharp
 * //csharp
 * var st = new SurfaceTool();
 * st.Begin(Mesh.PrimitiveType.Triangles);
 * st.SetColor(new Color(1, 0, 0));
 * st.SetUV(new Vector2(0, 0));
 * st.AddVertex(new Vector3(0, 0, 0));
 * ```
 *
 * The above [SurfaceTool] now contains one vertex of a triangle which has a UV coordinate and a
 * specified [Color]. If another vertex were added without calling [setUv] or [setColor], then the last
 * values would be used.
 *
 * Vertex attributes must be passed **before** calling [addVertex]. Failure to do so will result in
 * an error when committing the vertex information to a mesh.
 *
 * Additionally, the attributes used before the first vertex is added determine the format of the
 * mesh. For example, if you only add UVs to the first vertex, you cannot add color to any of the
 * subsequent vertices.
 *
 * See also [ArrayMesh], [ImmediateMesh] and [MeshDataTool] for procedural geometry generation.
 *
 * **Note:** Godot uses clockwise [url=https://learnopengl.com/Advanced-OpenGL/Face-culling]winding
 * order[/url] for front faces of triangle primitive modes.
 */
@GodotBaseType
public open class SurfaceTool : RefCounted() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(654, scriptIndex)
  }

  /**
   * Set to [SKIN_8_WEIGHTS] to indicate that up to 8 bone influences per vertex may be used.
   *
   * By default, only 4 bone influences are used ([SKIN_4_WEIGHTS]).
   *
   * **Note:** This function takes an enum, not the exact number of weights.
   */
  public final fun setSkinWeightCount(count: SkinWeightCount): Unit {
    TransferContext.writeArguments(LONG to count.id)
    TransferContext.callMethod(ptr, MethodBindings.setSkinWeightCountPtr, NIL)
  }

  /**
   * By default, returns [SKIN_4_WEIGHTS] to indicate only 4 bone influences per vertex are used.
   *
   * Returns [SKIN_8_WEIGHTS] if up to 8 influences are used.
   *
   * **Note:** This function returns an enum, not the exact number of weights.
   */
  public final fun getSkinWeightCount(): SkinWeightCount {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSkinWeightCountPtr, LONG)
    return SurfaceTool.SkinWeightCount.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets the color format for this custom [channelIndex]. Use [CUSTOM_MAX] to disable.
   *
   * Must be invoked after [begin] and should be set before [commit] or [commitToArrays].
   */
  public final fun setCustomFormat(channelIndex: Int, format: CustomFormat): Unit {
    TransferContext.writeArguments(LONG to channelIndex.toLong(), LONG to format.id)
    TransferContext.callMethod(ptr, MethodBindings.setCustomFormatPtr, NIL)
  }

  /**
   * Returns the format for custom [channelIndex] (currently up to 4). Returns [CUSTOM_MAX] if this
   * custom channel is unused.
   */
  public final fun getCustomFormat(channelIndex: Int): CustomFormat {
    TransferContext.writeArguments(LONG to channelIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getCustomFormatPtr, LONG)
    return SurfaceTool.CustomFormat.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Called before adding any vertices. Takes the primitive type as an argument (e.g.
   * [Mesh.PRIMITIVE_TRIANGLES]).
   */
  public final fun begin(primitive: Mesh.PrimitiveType): Unit {
    TransferContext.writeArguments(LONG to primitive.id)
    TransferContext.callMethod(ptr, MethodBindings.beginPtr, NIL)
  }

  /**
   * Specifies the position of current vertex. Should be called after specifying other vertex
   * properties (e.g. Color, UV).
   */
  public final fun addVertex(vertex: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to vertex)
    TransferContext.callMethod(ptr, MethodBindings.addVertexPtr, NIL)
  }

  /**
   * Specifies a [Color] to use for the *next* vertex. If every vertex needs to have this
   * information set and you fail to submit it for the first vertex, this information may not be used
   * at all.
   *
   * **Note:** The material must have [BaseMaterial3D.vertexColorUseAsAlbedo] enabled for the vertex
   * color to be visible.
   */
  public final fun setColor(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(ptr, MethodBindings.setColorPtr, NIL)
  }

  /**
   * Specifies a normal to use for the *next* vertex. If every vertex needs to have this information
   * set and you fail to submit it for the first vertex, this information may not be used at all.
   */
  public final fun setNormal(normal: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to normal)
    TransferContext.callMethod(ptr, MethodBindings.setNormalPtr, NIL)
  }

  /**
   * Specifies a tangent to use for the *next* vertex. If every vertex needs to have this
   * information set and you fail to submit it for the first vertex, this information may not be used
   * at all.
   */
  public final fun setTangent(tangent: Plane): Unit {
    TransferContext.writeArguments(PLANE to tangent)
    TransferContext.callMethod(ptr, MethodBindings.setTangentPtr, NIL)
  }

  /**
   * Specifies a set of UV coordinates to use for the *next* vertex. If every vertex needs to have
   * this information set and you fail to submit it for the first vertex, this information may not be
   * used at all.
   */
  public final fun setUv(uv: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to uv)
    TransferContext.callMethod(ptr, MethodBindings.setUvPtr, NIL)
  }

  /**
   * Specifies an optional second set of UV coordinates to use for the *next* vertex. If every
   * vertex needs to have this information set and you fail to submit it for the first vertex, this
   * information may not be used at all.
   */
  public final fun setUv2(uv2: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to uv2)
    TransferContext.callMethod(ptr, MethodBindings.setUv2Ptr, NIL)
  }

  /**
   * Specifies an array of bones to use for the *next* vertex. [bones] must contain 4 integers.
   */
  public final fun setBones(bones: PackedInt32Array): Unit {
    TransferContext.writeArguments(PACKED_INT_32_ARRAY to bones)
    TransferContext.callMethod(ptr, MethodBindings.setBonesPtr, NIL)
  }

  /**
   * Specifies weight values to use for the *next* vertex. [weights] must contain 4 values. If every
   * vertex needs to have this information set and you fail to submit it for the first vertex, this
   * information may not be used at all.
   */
  public final fun setWeights(weights: PackedFloat32Array): Unit {
    TransferContext.writeArguments(PACKED_FLOAT_32_ARRAY to weights)
    TransferContext.callMethod(ptr, MethodBindings.setWeightsPtr, NIL)
  }

  /**
   * Sets the custom value on this vertex for [channelIndex].
   *
   * [setCustomFormat] must be called first for this [channelIndex]. Formats which are not RGBA will
   * ignore other color channels.
   */
  public final fun setCustom(channelIndex: Int, customColor: Color): Unit {
    TransferContext.writeArguments(LONG to channelIndex.toLong(), COLOR to customColor)
    TransferContext.callMethod(ptr, MethodBindings.setCustomPtr, NIL)
  }

  /**
   * Specifies the smooth group to use for the *next* vertex. If this is never called, all vertices
   * will have the default smooth group of `0` and will be smoothed with adjacent vertices of the same
   * group. To produce a mesh with flat normals, set the smooth group to `-1`.
   *
   * **Note:** This function actually takes a `uint32_t`, so C# users should use `uint32.MaxValue`
   * instead of `-1` to produce a mesh with flat normals.
   */
  public final fun setSmoothGroup(index: Long): Unit {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(ptr, MethodBindings.setSmoothGroupPtr, NIL)
  }

  /**
   * Inserts a triangle fan made of array data into [Mesh] being constructed.
   *
   * Requires the primitive type be set to [Mesh.PRIMITIVE_TRIANGLES].
   */
  @JvmOverloads
  public final fun addTriangleFan(
    vertices: PackedVector3Array,
    uvs: PackedVector2Array = PackedVector2Array(),
    colors: PackedColorArray = PackedColorArray(),
    uv2s: PackedVector2Array = PackedVector2Array(),
    normals: PackedVector3Array = PackedVector3Array(),
    tangents: VariantArray<Plane> = godot.core.variantArrayOf(),
  ): Unit {
    TransferContext.writeArguments(PACKED_VECTOR3_ARRAY to vertices, PACKED_VECTOR2_ARRAY to uvs, PACKED_COLOR_ARRAY to colors, PACKED_VECTOR2_ARRAY to uv2s, PACKED_VECTOR3_ARRAY to normals, ARRAY to tangents)
    TransferContext.callMethod(ptr, MethodBindings.addTriangleFanPtr, NIL)
  }

  /**
   * Adds a vertex to index array if you are using indexed vertices. Does not need to be called
   * before adding vertices.
   */
  public final fun addIndex(index: Int): Unit {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.addIndexPtr, NIL)
  }

  /**
   * Shrinks the vertex array by creating an index array. This can improve performance by avoiding
   * vertex reuse.
   */
  public final fun index(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.indexPtr, NIL)
  }

  /**
   * Removes the index array by expanding the vertex array.
   */
  public final fun deindex(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.deindexPtr, NIL)
  }

  /**
   * Generates normals from vertices so you do not have to do it manually. If [flip] is `true`, the
   * resulting normals will be inverted. [generateNormals] should be called *after* generating geometry
   * and *before* committing the mesh using [commit] or [commitToArrays]. For correct display of
   * normal-mapped surfaces, you will also have to generate tangents using [generateTangents].
   *
   * **Note:** [generateNormals] only works if the primitive type is set to
   * [Mesh.PRIMITIVE_TRIANGLES].
   *
   * **Note:** [generateNormals] takes smooth groups into account. To generate smooth normals, set
   * the smooth group to a value greater than or equal to `0` using [setSmoothGroup] or leave the
   * smooth group at the default of `0`. To generate flat normals, set the smooth group to `-1` using
   * [setSmoothGroup] prior to adding vertices.
   */
  @JvmOverloads
  public final fun generateNormals(flip: Boolean = false): Unit {
    TransferContext.writeArguments(BOOL to flip)
    TransferContext.callMethod(ptr, MethodBindings.generateNormalsPtr, NIL)
  }

  /**
   * Generates a tangent vector for each vertex. Requires that each vertex already has UVs and
   * normals set (see [generateNormals]).
   */
  public final fun generateTangents(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.generateTangentsPtr, NIL)
  }

  /**
   * Optimizes triangle sorting for performance. Requires that [getPrimitiveType] is
   * [Mesh.PRIMITIVE_TRIANGLES].
   */
  public final fun optimizeIndicesForCache(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.optimizeIndicesForCachePtr, NIL)
  }

  /**
   * Returns the axis-aligned bounding box of the vertex positions.
   */
  public final fun getAabb(): AABB {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAabbPtr, godot.core.VariantParser.AABB)
    return (TransferContext.readReturnValue(godot.core.VariantParser.AABB) as AABB)
  }

  /**
   * Generates an LOD for a given [ndThreshold] in linear units (square root of quadric error
   * metric), using at most [targetIndexCount] indices.
   */
  @JvmOverloads
  public final fun generateLod(ndThreshold: Float, targetIndexCount: Int = 3): PackedInt32Array {
    TransferContext.writeArguments(DOUBLE to ndThreshold.toDouble(), LONG to targetIndexCount.toLong())
    TransferContext.callMethod(ptr, MethodBindings.generateLodPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY) as PackedInt32Array)
  }

  /**
   * Sets [Material] to be used by the [Mesh] you are constructing.
   */
  public final fun setMaterial(material: Material?): Unit {
    TransferContext.writeArguments(OBJECT to material)
    TransferContext.callMethod(ptr, MethodBindings.setMaterialPtr, NIL)
  }

  /**
   * Returns the type of mesh geometry, such as [Mesh.PRIMITIVE_TRIANGLES].
   */
  public final fun getPrimitiveType(): Mesh.PrimitiveType {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPrimitiveTypePtr, LONG)
    return Mesh.PrimitiveType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Clear all information passed into the surface tool so far.
   */
  public final fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.clearPtr, NIL)
  }

  /**
   * Creates a vertex array from an existing [Mesh].
   */
  public final fun createFrom(existing: Mesh?, surface: Int): Unit {
    TransferContext.writeArguments(OBJECT to existing, LONG to surface.toLong())
    TransferContext.callMethod(ptr, MethodBindings.createFromPtr, NIL)
  }

  /**
   * Creates this SurfaceTool from existing vertex arrays such as returned by [commitToArrays],
   * [Mesh.surfaceGetArrays], [Mesh.surfaceGetBlendShapeArrays], [ImporterMesh.getSurfaceArrays], and
   * [ImporterMesh.getSurfaceBlendShapeArrays]. [primitiveType] controls the type of mesh data,
   * defaulting to [Mesh.PRIMITIVE_TRIANGLES].
   */
  @JvmOverloads
  public final fun createFromArrays(arrays: VariantArray<Any?>, primitiveType: Mesh.PrimitiveType =
      Mesh.PrimitiveType.TRIANGLES): Unit {
    TransferContext.writeArguments(ARRAY to arrays, LONG to primitiveType.id)
    TransferContext.callMethod(ptr, MethodBindings.createFromArraysPtr, NIL)
  }

  /**
   * Creates a vertex array from the specified blend shape of an existing [Mesh]. This can be used
   * to extract a specific pose from a blend shape.
   */
  public final fun createFromBlendShape(
    existing: Mesh?,
    surface: Int,
    blendShape: String,
  ): Unit {
    TransferContext.writeArguments(OBJECT to existing, LONG to surface.toLong(), STRING to blendShape)
    TransferContext.callMethod(ptr, MethodBindings.createFromBlendShapePtr, NIL)
  }

  /**
   * Append vertices from a given [Mesh] surface onto the current vertex array with specified
   * [Transform3D].
   */
  public final fun appendFrom(
    existing: Mesh?,
    surface: Int,
    transform: Transform3D,
  ): Unit {
    TransferContext.writeArguments(OBJECT to existing, LONG to surface.toLong(), TRANSFORM3D to transform)
    TransferContext.callMethod(ptr, MethodBindings.appendFromPtr, NIL)
  }

  /**
   * Returns a constructed [ArrayMesh] from current information passed in. If an existing
   * [ArrayMesh] is passed in as an argument, will add an extra surface to the existing [ArrayMesh].
   *
   * The [flags] argument can be the bitwise OR of [Mesh.ARRAY_FLAG_USE_DYNAMIC_UPDATE],
   * [Mesh.ARRAY_FLAG_USE_8_BONE_WEIGHTS], or [Mesh.ARRAY_FLAG_USES_EMPTY_VERTEX_ARRAY].
   */
  @JvmOverloads
  public final fun commit(existing: ArrayMesh? = null, flags: Long = 0): ArrayMesh? {
    TransferContext.writeArguments(OBJECT to existing, LONG to flags)
    TransferContext.callMethod(ptr, MethodBindings.commitPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as ArrayMesh?)
  }

  /**
   * Commits the data to the same format used by [ArrayMesh.addSurfaceFromArrays],
   * [ImporterMesh.addSurface], and [createFromArrays]. This way you can further process the mesh data
   * using the [ArrayMesh] or [ImporterMesh] APIs.
   */
  public final fun commitToArrays(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.commitToArraysPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Any?>)
  }

  public enum class CustomFormat(
    id: Long,
  ) {
    /**
     * Limits range of data passed to [setCustom] to unsigned normalized 0 to 1 stored in 8 bits per
     * channel. See [Mesh.ARRAY_CUSTOM_RGBA8_UNORM].
     */
    RGBA8_UNORM(0),
    /**
     * Limits range of data passed to [setCustom] to signed normalized -1 to 1 stored in 8 bits per
     * channel. See [Mesh.ARRAY_CUSTOM_RGBA8_SNORM].
     */
    RGBA8_SNORM(1),
    /**
     * Stores data passed to [setCustom] as half precision floats, and uses only red and green color
     * channels. See [Mesh.ARRAY_CUSTOM_RG_HALF].
     */
    RG_HALF(2),
    /**
     * Stores data passed to [setCustom] as half precision floats and uses all color channels. See
     * [Mesh.ARRAY_CUSTOM_RGBA_HALF].
     */
    RGBA_HALF(3),
    /**
     * Stores data passed to [setCustom] as full precision floats, and uses only red color channel.
     * See [Mesh.ARRAY_CUSTOM_R_FLOAT].
     */
    R_FLOAT(4),
    /**
     * Stores data passed to [setCustom] as full precision floats, and uses only red and green color
     * channels. See [Mesh.ARRAY_CUSTOM_RG_FLOAT].
     */
    RG_FLOAT(5),
    /**
     * Stores data passed to [setCustom] as full precision floats, and uses only red, green and blue
     * color channels. See [Mesh.ARRAY_CUSTOM_RGB_FLOAT].
     */
    RGB_FLOAT(6),
    /**
     * Stores data passed to [setCustom] as full precision floats, and uses all color channels. See
     * [Mesh.ARRAY_CUSTOM_RGBA_FLOAT].
     */
    RGBA_FLOAT(7),
    /**
     * Used to indicate a disabled custom channel.
     */
    MAX(8),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): CustomFormat = entries.single { it.id == `value` }
    }
  }

  public enum class SkinWeightCount(
    id: Long,
  ) {
    /**
     * Each individual vertex can be influenced by only 4 bone weights.
     */
    SKIN_4_WEIGHTS(0),
    /**
     * Each individual vertex can be influenced by up to 8 bone weights.
     */
    SKIN_8_WEIGHTS(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): SkinWeightCount = entries.single { it.id == `value` }
    }
  }

  public companion object

  public object MethodBindings {
    internal val setSkinWeightCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SurfaceTool", "set_skin_weight_count", 618679515)

    internal val getSkinWeightCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SurfaceTool", "get_skin_weight_count", 1072401130)

    internal val setCustomFormatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SurfaceTool", "set_custom_format", 4087759856)

    internal val getCustomFormatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SurfaceTool", "get_custom_format", 839863283)

    internal val beginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SurfaceTool", "begin", 2230304113)

    internal val addVertexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SurfaceTool", "add_vertex", 3460891852)

    internal val setColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SurfaceTool", "set_color", 2920490490)

    internal val setNormalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SurfaceTool", "set_normal", 3460891852)

    internal val setTangentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SurfaceTool", "set_tangent", 3505987427)

    internal val setUvPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SurfaceTool", "set_uv", 743155724)

    internal val setUv2Ptr: VoidPtr =
        TypeManager.getMethodBindPtr("SurfaceTool", "set_uv2", 743155724)

    internal val setBonesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SurfaceTool", "set_bones", 3614634198)

    internal val setWeightsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SurfaceTool", "set_weights", 2899603908)

    internal val setCustomPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SurfaceTool", "set_custom", 2878471219)

    internal val setSmoothGroupPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SurfaceTool", "set_smooth_group", 1286410249)

    internal val addTriangleFanPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SurfaceTool", "add_triangle_fan", 2235017613)

    internal val addIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SurfaceTool", "add_index", 1286410249)

    internal val indexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SurfaceTool", "index", 3218959716)

    internal val deindexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SurfaceTool", "deindex", 3218959716)

    internal val generateNormalsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SurfaceTool", "generate_normals", 107499316)

    internal val generateTangentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SurfaceTool", "generate_tangents", 3218959716)

    internal val optimizeIndicesForCachePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SurfaceTool", "optimize_indices_for_cache", 3218959716)

    internal val getAabbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SurfaceTool", "get_aabb", 1068685055)

    internal val generateLodPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SurfaceTool", "generate_lod", 1938056459)

    internal val setMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SurfaceTool", "set_material", 2757459619)

    internal val getPrimitiveTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SurfaceTool", "get_primitive_type", 768822145)

    internal val clearPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SurfaceTool", "clear", 3218959716)

    internal val createFromPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SurfaceTool", "create_from", 1767024570)

    internal val createFromArraysPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SurfaceTool", "create_from_arrays", 1894639680)

    internal val createFromBlendShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SurfaceTool", "create_from_blend_shape", 1306185582)

    internal val appendFromPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SurfaceTool", "append_from", 2217967155)

    internal val commitPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SurfaceTool", "commit", 4107864055)

    internal val commitToArraysPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SurfaceTool", "commit_to_arrays", 2915620761)
  }
}
