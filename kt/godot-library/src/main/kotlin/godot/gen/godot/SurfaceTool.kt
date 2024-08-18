// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.AABB
import godot.core.Color
import godot.core.PackedColorArray
import godot.core.PackedFloat32Array
import godot.core.PackedInt32Array
import godot.core.PackedVector2Array
import godot.core.PackedVector3Array
import godot.core.Plane
import godot.core.Transform3D
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_COLOR_ARRAY
import godot.core.VariantType.PACKED_FLOAT_32_ARRAY
import godot.core.VariantType.PACKED_INT_32_ARRAY
import godot.core.VariantType.PACKED_VECTOR2_ARRAY
import godot.core.VariantType.PACKED_VECTOR3_ARRAY
import godot.core.VariantType.PLANE
import godot.core.VariantType.STRING
import godot.core.VariantType.TRANSFORM3D
import godot.core.VariantType.VECTOR2
import godot.core.VariantType.VECTOR3
import godot.core.Vector2
import godot.core.Vector3
import godot.core.memory.TransferContext
import godot.util.VoidPtr
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
 * gdscript:
 * ```gdscript
 * var st = SurfaceTool.new()
 * st.begin(Mesh.PRIMITIVE_TRIANGLES)
 * st.set_color(Color(1, 0, 0))
 * st.set_uv(Vector2(0, 0))
 * st.add_vertex(Vector3(0, 0, 0))
 * ```
 * csharp:
 * ```csharp
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
 * Vertex attributes must be passed **before** calling [addVertex]. Failure to do so will result in
 * an error when committing the vertex information to a mesh.
 * Additionally, the attributes used before the first vertex is added determine the format of the
 * mesh. For example, if you only add UVs to the first vertex, you cannot add color to any of the
 * subsequent vertices.
 * See also [ArrayMesh], [ImmediateMesh] and [MeshDataTool] for procedural geometry generation.
 * **Note:** Godot uses clockwise [url=https://learnopengl.com/Advanced-OpenGL/Face-culling]winding
 * order[/url] for front faces of triangle primitive modes.
 */
@GodotBaseType
public open class SurfaceTool : RefCounted() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SURFACETOOL, scriptIndex)
    return true
  }

  /**
   * Set to [SKIN_8_WEIGHTS] to indicate that up to 8 bone influences per vertex may be used.
   * By default, only 4 bone influences are used ([SKIN_4_WEIGHTS])
   * **Note:** This function takes an enum, not the exact number of weights.
   */
  public fun setSkinWeightCount(count: SkinWeightCount): Unit {
    TransferContext.writeArguments(LONG to count.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setSkinWeightCountPtr, NIL)
  }

  /**
   * By default, returns [SKIN_4_WEIGHTS] to indicate only 4 bone influences per vertex are used.
   * Returns [SKIN_8_WEIGHTS] if up to 8 influences are used.
   * **Note:** This function returns an enum, not the exact number of weights.
   */
  public fun getSkinWeightCount(): SkinWeightCount {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSkinWeightCountPtr, LONG)
    return SurfaceTool.SkinWeightCount.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets the color format for this custom [channelIndex]. Use [CUSTOM_MAX] to disable.
   * Must be invoked after [begin] and should be set before [commit] or [commitToArrays].
   */
  public fun setCustomFormat(channelIndex: Int, format: CustomFormat): Unit {
    TransferContext.writeArguments(LONG to channelIndex.toLong(), LONG to format.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setCustomFormatPtr, NIL)
  }

  /**
   * Returns the format for custom [channelIndex] (currently up to 4). Returns [CUSTOM_MAX] if this
   * custom channel is unused.
   */
  public fun getCustomFormat(channelIndex: Int): CustomFormat {
    TransferContext.writeArguments(LONG to channelIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCustomFormatPtr, LONG)
    return SurfaceTool.CustomFormat.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Called before adding any vertices. Takes the primitive type as an argument (e.g.
   * [Mesh.PRIMITIVE_TRIANGLES]).
   */
  public fun begin(primitive: Mesh.PrimitiveType): Unit {
    TransferContext.writeArguments(LONG to primitive.id)
    TransferContext.callMethod(rawPtr, MethodBindings.beginPtr, NIL)
  }

  /**
   * Specifies the position of current vertex. Should be called after specifying other vertex
   * properties (e.g. Color, UV).
   */
  public fun addVertex(vertex: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to vertex)
    TransferContext.callMethod(rawPtr, MethodBindings.addVertexPtr, NIL)
  }

  /**
   * Specifies a [Color] to use for the *next* vertex. If every vertex needs to have this
   * information set and you fail to submit it for the first vertex, this information may not be used
   * at all.
   * **Note:** The material must have [BaseMaterial3D.vertexColorUseAsAlbedo] enabled for the vertex
   * color to be visible.
   */
  public fun setColor(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.setColorPtr, NIL)
  }

  /**
   * Specifies a normal to use for the *next* vertex. If every vertex needs to have this information
   * set and you fail to submit it for the first vertex, this information may not be used at all.
   */
  public fun setNormal(normal: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to normal)
    TransferContext.callMethod(rawPtr, MethodBindings.setNormalPtr, NIL)
  }

  /**
   * Specifies a tangent to use for the *next* vertex. If every vertex needs to have this
   * information set and you fail to submit it for the first vertex, this information may not be used
   * at all.
   */
  public fun setTangent(tangent: Plane): Unit {
    TransferContext.writeArguments(PLANE to tangent)
    TransferContext.callMethod(rawPtr, MethodBindings.setTangentPtr, NIL)
  }

  /**
   * Specifies a set of UV coordinates to use for the *next* vertex. If every vertex needs to have
   * this information set and you fail to submit it for the first vertex, this information may not be
   * used at all.
   */
  public fun setUv(uv: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to uv)
    TransferContext.callMethod(rawPtr, MethodBindings.setUvPtr, NIL)
  }

  /**
   * Specifies an optional second set of UV coordinates to use for the *next* vertex. If every
   * vertex needs to have this information set and you fail to submit it for the first vertex, this
   * information may not be used at all.
   */
  public fun setUv2(uv2: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to uv2)
    TransferContext.callMethod(rawPtr, MethodBindings.setUv2Ptr, NIL)
  }

  /**
   * Specifies an array of bones to use for the *next* vertex. [bones] must contain 4 integers.
   */
  public fun setBones(bones: PackedInt32Array): Unit {
    TransferContext.writeArguments(PACKED_INT_32_ARRAY to bones)
    TransferContext.callMethod(rawPtr, MethodBindings.setBonesPtr, NIL)
  }

  /**
   * Specifies weight values to use for the *next* vertex. [weights] must contain 4 values. If every
   * vertex needs to have this information set and you fail to submit it for the first vertex, this
   * information may not be used at all.
   */
  public fun setWeights(weights: PackedFloat32Array): Unit {
    TransferContext.writeArguments(PACKED_FLOAT_32_ARRAY to weights)
    TransferContext.callMethod(rawPtr, MethodBindings.setWeightsPtr, NIL)
  }

  /**
   * Sets the custom value on this vertex for [channelIndex].
   * [setCustomFormat] must be called first for this [channelIndex]. Formats which are not RGBA will
   * ignore other color channels.
   */
  public fun setCustom(channelIndex: Int, customColor: Color): Unit {
    TransferContext.writeArguments(LONG to channelIndex.toLong(), COLOR to customColor)
    TransferContext.callMethod(rawPtr, MethodBindings.setCustomPtr, NIL)
  }

  /**
   * Specifies the smooth group to use for the *next* vertex. If this is never called, all vertices
   * will have the default smooth group of `0` and will be smoothed with adjacent vertices of the same
   * group. To produce a mesh with flat normals, set the smooth group to `-1`.
   * **Note:** This function actually takes a `uint32_t`, so C# users should use `uint32.MaxValue`
   * instead of `-1` to produce a mesh with flat normals.
   */
  public fun setSmoothGroup(index: Long): Unit {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(rawPtr, MethodBindings.setSmoothGroupPtr, NIL)
  }

  /**
   * Inserts a triangle fan made of array data into [Mesh] being constructed.
   * Requires the primitive type be set to [Mesh.PRIMITIVE_TRIANGLES].
   */
  @JvmOverloads
  public fun addTriangleFan(
    vertices: PackedVector3Array,
    uvs: PackedVector2Array = PackedVector2Array(),
    colors: PackedColorArray = PackedColorArray(),
    uv2s: PackedVector2Array = PackedVector2Array(),
    normals: PackedVector3Array = PackedVector3Array(),
    tangents: VariantArray<Plane> = godot.core.variantArrayOf(),
  ): Unit {
    TransferContext.writeArguments(PACKED_VECTOR3_ARRAY to vertices, PACKED_VECTOR2_ARRAY to uvs, PACKED_COLOR_ARRAY to colors, PACKED_VECTOR2_ARRAY to uv2s, PACKED_VECTOR3_ARRAY to normals, ARRAY to tangents)
    TransferContext.callMethod(rawPtr, MethodBindings.addTriangleFanPtr, NIL)
  }

  /**
   * Adds a vertex to index array if you are using indexed vertices. Does not need to be called
   * before adding vertices.
   */
  public fun addIndex(index: Int): Unit {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addIndexPtr, NIL)
  }

  /**
   * Shrinks the vertex array by creating an index array. This can improve performance by avoiding
   * vertex reuse.
   */
  public fun index(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.indexPtr, NIL)
  }

  /**
   * Removes the index array by expanding the vertex array.
   */
  public fun deindex(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.deindexPtr, NIL)
  }

  /**
   * Generates normals from vertices so you do not have to do it manually. If [flip] is `true`, the
   * resulting normals will be inverted. [generateNormals] should be called *after* generating geometry
   * and *before* committing the mesh using [commit] or [commitToArrays]. For correct display of
   * normal-mapped surfaces, you will also have to generate tangents using [generateTangents].
   * **Note:** [generateNormals] only works if the primitive type to be set to
   * [Mesh.PRIMITIVE_TRIANGLES].
   * **Note:** [generateNormals] takes smooth groups into account. To generate smooth normals, set
   * the smooth group to a value greater than or equal to `0` using [setSmoothGroup] or leave the
   * smooth group at the default of `0`. To generate flat normals, set the smooth group to `-1` using
   * [setSmoothGroup] prior to adding vertices.
   */
  @JvmOverloads
  public fun generateNormals(flip: Boolean = false): Unit {
    TransferContext.writeArguments(BOOL to flip)
    TransferContext.callMethod(rawPtr, MethodBindings.generateNormalsPtr, NIL)
  }

  /**
   * Generates a tangent vector for each vertex. Requires that each vertex have UVs and normals set
   * already (see [generateNormals]).
   */
  public fun generateTangents(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.generateTangentsPtr, NIL)
  }

  /**
   * Optimizes triangle sorting for performance. Requires that [getPrimitiveType] is
   * [Mesh.PRIMITIVE_TRIANGLES].
   */
  public fun optimizeIndicesForCache(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.optimizeIndicesForCachePtr, NIL)
  }

  /**
   * Returns the axis-aligned bounding box of the vertex positions.
   */
  public fun getAabb(): AABB {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAabbPtr, godot.core.VariantType.AABB)
    return (TransferContext.readReturnValue(godot.core.VariantType.AABB, false) as AABB)
  }

  /**
   * Generates an LOD for a given [ndThreshold] in linear units (square root of quadric error
   * metric), using at most [targetIndexCount] indices.
   */
  @JvmOverloads
  public fun generateLod(ndThreshold: Float, targetIndexCount: Int = 3): PackedInt32Array {
    TransferContext.writeArguments(DOUBLE to ndThreshold.toDouble(), LONG to targetIndexCount.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.generateLodPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  /**
   * Sets [Material] to be used by the [Mesh] you are constructing.
   */
  public fun setMaterial(material: Material): Unit {
    TransferContext.writeArguments(OBJECT to material)
    TransferContext.callMethod(rawPtr, MethodBindings.setMaterialPtr, NIL)
  }

  /**
   * Returns the type of mesh geometry, such as [Mesh.PRIMITIVE_TRIANGLES].
   */
  public fun getPrimitiveType(): Mesh.PrimitiveType {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPrimitiveTypePtr, LONG)
    return Mesh.PrimitiveType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Clear all information passed into the surface tool so far.
   */
  public fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearPtr, NIL)
  }

  /**
   * Creates a vertex array from an existing [Mesh].
   */
  public fun createFrom(existing: Mesh, surface: Int): Unit {
    TransferContext.writeArguments(OBJECT to existing, LONG to surface.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.createFromPtr, NIL)
  }

  /**
   * Creates this SurfaceTool from existing vertex arrays such as returned by [commitToArrays],
   * [Mesh.surfaceGetArrays], [Mesh.surfaceGetBlendShapeArrays], [ImporterMesh.getSurfaceArrays], and
   * [ImporterMesh.getSurfaceBlendShapeArrays]. [primitiveType] controls the type of mesh data,
   * defaulting to [Mesh.PRIMITIVE_TRIANGLES].
   */
  @JvmOverloads
  public fun createFromArrays(arrays: VariantArray<Any?>, primitiveType: Mesh.PrimitiveType =
      Mesh.PrimitiveType.PRIMITIVE_TRIANGLES): Unit {
    TransferContext.writeArguments(ARRAY to arrays, LONG to primitiveType.id)
    TransferContext.callMethod(rawPtr, MethodBindings.createFromArraysPtr, NIL)
  }

  /**
   * Creates a vertex array from the specified blend shape of an existing [Mesh]. This can be used
   * to extract a specific pose from a blend shape.
   */
  public fun createFromBlendShape(
    existing: Mesh,
    surface: Int,
    blendShape: String,
  ): Unit {
    TransferContext.writeArguments(OBJECT to existing, LONG to surface.toLong(), STRING to blendShape)
    TransferContext.callMethod(rawPtr, MethodBindings.createFromBlendShapePtr, NIL)
  }

  /**
   * Append vertices from a given [Mesh] surface onto the current vertex array with specified
   * [Transform3D].
   */
  public fun appendFrom(
    existing: Mesh,
    surface: Int,
    transform: Transform3D,
  ): Unit {
    TransferContext.writeArguments(OBJECT to existing, LONG to surface.toLong(), TRANSFORM3D to transform)
    TransferContext.callMethod(rawPtr, MethodBindings.appendFromPtr, NIL)
  }

  /**
   * Returns a constructed [ArrayMesh] from current information passed in. If an existing
   * [ArrayMesh] is passed in as an argument, will add an extra surface to the existing [ArrayMesh].
   * **FIXME:** Document possible values for [flags], it changed in 4.0. Likely some combinations of
   * [Mesh.ArrayFormat].
   */
  @JvmOverloads
  public fun commit(existing: ArrayMesh? = null, flags: Long = 0): ArrayMesh? {
    TransferContext.writeArguments(OBJECT to existing, LONG to flags)
    TransferContext.callMethod(rawPtr, MethodBindings.commitPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as ArrayMesh?)
  }

  /**
   * Commits the data to the same format used by [ArrayMesh.addSurfaceFromArrays],
   * [ImporterMesh.addSurface], and [createFromArrays]. This way you can further process the mesh data
   * using the [ArrayMesh] or [ImporterMesh] APIs.
   */
  public fun commitToArrays(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.commitToArraysPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>)
  }

  public enum class CustomFormat(
    id: Long,
  ) {
    /**
     * Limits range of data passed to [setCustom] to unsigned normalized 0 to 1 stored in 8 bits per
     * channel. See [Mesh.ARRAY_CUSTOM_RGBA8_UNORM].
     */
    CUSTOM_RGBA8_UNORM(0),
    /**
     * Limits range of data passed to [setCustom] to signed normalized -1 to 1 stored in 8 bits per
     * channel. See [Mesh.ARRAY_CUSTOM_RGBA8_SNORM].
     */
    CUSTOM_RGBA8_SNORM(1),
    /**
     * Stores data passed to [setCustom] as half precision floats, and uses only red and green color
     * channels. See [Mesh.ARRAY_CUSTOM_RG_HALF].
     */
    CUSTOM_RG_HALF(2),
    /**
     * Stores data passed to [setCustom] as half precision floats and uses all color channels. See
     * [Mesh.ARRAY_CUSTOM_RGBA_HALF].
     */
    CUSTOM_RGBA_HALF(3),
    /**
     * Stores data passed to [setCustom] as full precision floats, and uses only red color channel.
     * See [Mesh.ARRAY_CUSTOM_R_FLOAT].
     */
    CUSTOM_R_FLOAT(4),
    /**
     * Stores data passed to [setCustom] as full precision floats, and uses only red and green color
     * channels. See [Mesh.ARRAY_CUSTOM_RG_FLOAT].
     */
    CUSTOM_RG_FLOAT(5),
    /**
     * Stores data passed to [setCustom] as full precision floats, and uses only red, green and blue
     * color channels. See [Mesh.ARRAY_CUSTOM_RGB_FLOAT].
     */
    CUSTOM_RGB_FLOAT(6),
    /**
     * Stores data passed to [setCustom] as full precision floats, and uses all color channels. See
     * [Mesh.ARRAY_CUSTOM_RGBA_FLOAT].
     */
    CUSTOM_RGBA_FLOAT(7),
    /**
     * Used to indicate a disabled custom channel.
     */
    CUSTOM_MAX(8),
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

  internal object MethodBindings {
    public val setSkinWeightCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SurfaceTool", "set_skin_weight_count")

    public val getSkinWeightCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SurfaceTool", "get_skin_weight_count")

    public val setCustomFormatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SurfaceTool", "set_custom_format")

    public val getCustomFormatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SurfaceTool", "get_custom_format")

    public val beginPtr: VoidPtr = TypeManager.getMethodBindPtr("SurfaceTool", "begin")

    public val addVertexPtr: VoidPtr = TypeManager.getMethodBindPtr("SurfaceTool", "add_vertex")

    public val setColorPtr: VoidPtr = TypeManager.getMethodBindPtr("SurfaceTool", "set_color")

    public val setNormalPtr: VoidPtr = TypeManager.getMethodBindPtr("SurfaceTool", "set_normal")

    public val setTangentPtr: VoidPtr = TypeManager.getMethodBindPtr("SurfaceTool", "set_tangent")

    public val setUvPtr: VoidPtr = TypeManager.getMethodBindPtr("SurfaceTool", "set_uv")

    public val setUv2Ptr: VoidPtr = TypeManager.getMethodBindPtr("SurfaceTool", "set_uv2")

    public val setBonesPtr: VoidPtr = TypeManager.getMethodBindPtr("SurfaceTool", "set_bones")

    public val setWeightsPtr: VoidPtr = TypeManager.getMethodBindPtr("SurfaceTool", "set_weights")

    public val setCustomPtr: VoidPtr = TypeManager.getMethodBindPtr("SurfaceTool", "set_custom")

    public val setSmoothGroupPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SurfaceTool", "set_smooth_group")

    public val addTriangleFanPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SurfaceTool", "add_triangle_fan")

    public val addIndexPtr: VoidPtr = TypeManager.getMethodBindPtr("SurfaceTool", "add_index")

    public val indexPtr: VoidPtr = TypeManager.getMethodBindPtr("SurfaceTool", "index")

    public val deindexPtr: VoidPtr = TypeManager.getMethodBindPtr("SurfaceTool", "deindex")

    public val generateNormalsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SurfaceTool", "generate_normals")

    public val generateTangentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SurfaceTool", "generate_tangents")

    public val optimizeIndicesForCachePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SurfaceTool", "optimize_indices_for_cache")

    public val getAabbPtr: VoidPtr = TypeManager.getMethodBindPtr("SurfaceTool", "get_aabb")

    public val generateLodPtr: VoidPtr = TypeManager.getMethodBindPtr("SurfaceTool", "generate_lod")

    public val setMaterialPtr: VoidPtr = TypeManager.getMethodBindPtr("SurfaceTool", "set_material")

    public val getPrimitiveTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SurfaceTool", "get_primitive_type")

    public val clearPtr: VoidPtr = TypeManager.getMethodBindPtr("SurfaceTool", "clear")

    public val createFromPtr: VoidPtr = TypeManager.getMethodBindPtr("SurfaceTool", "create_from")

    public val createFromArraysPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SurfaceTool", "create_from_arrays")

    public val createFromBlendShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SurfaceTool", "create_from_blend_shape")

    public val appendFromPtr: VoidPtr = TypeManager.getMethodBindPtr("SurfaceTool", "append_from")

    public val commitPtr: VoidPtr = TypeManager.getMethodBindPtr("SurfaceTool", "commit")

    public val commitToArraysPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SurfaceTool", "commit_to_arrays")
  }
}
