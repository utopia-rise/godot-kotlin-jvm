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
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.JVM_INT
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
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Helper tool to create geometry.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/676](https://godotengine.org/asset-library/asset/676)
 *
 * The [godot.SurfaceTool] is used to construct a [godot.Mesh] by specifying vertex attributes individually. It can be used to construct a [godot.Mesh] from a script. All properties except indices need to be added before calling [addVertex]. For example, to add vertex colors and UVs:
 *
 * [codeblocks]
 *
 * [gdscript]
 *
 * var st = SurfaceTool.new()
 *
 * st.begin(Mesh.PRIMITIVE_TRIANGLES)
 *
 * st.set_color(Color(1, 0, 0))
 *
 * st.set_uv(Vector2(0, 0))
 *
 * st.add_vertex(Vector3(0, 0, 0))
 *
 * [/gdscript]
 *
 * [csharp]
 *
 * var st = new SurfaceTool();
 *
 * st.Begin(Mesh.PrimitiveType.Triangles);
 *
 * st.SetColor(new Color(1, 0, 0));
 *
 * st.SetUv(new Vector2(0, 0));
 *
 * st.AddVertex(new Vector3(0, 0, 0));
 *
 * [/csharp]
 *
 * [/codeblocks]
 *
 * The above [godot.SurfaceTool] now contains one vertex of a triangle which has a UV coordinate and a specified [godot.core.Color]. If another vertex were added without calling [setUv] or [setColor], then the last values would be used.
 *
 * Vertex attributes must be passed **before** calling [addVertex]. Failure to do so will result in an error when committing the vertex information to a mesh.
 *
 * Additionally, the attributes used before the first vertex is added determine the format of the mesh. For example, if you only add UVs to the first vertex, you cannot add color to any of the subsequent vertices.
 *
 * See also [godot.ArrayMesh], [godot.ImmediateMesh] and [godot.MeshDataTool] for procedural geometry generation.
 *
 * **Note:** Godot uses clockwise [winding order](https://learnopengl.com/Advanced-OpenGL/Face-culling) for front faces of triangle primitive modes.
 */
@GodotBaseType
public open class SurfaceTool : RefCounted() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SURFACETOOL, scriptIndex)
    return true
  }

  /**
   * Set to [godot.SKIN_8_WEIGHTS] to indicate that up to 8 bone influences per vertex may be used.
   *
   * By default, only 4 bone influences are used ([godot.SKIN_4_WEIGHTS])
   *
   * **Note:** This function takes an enum, not the exact number of weights.
   */
  public fun setSkinWeightCount(count: SkinWeightCount): Unit {
    TransferContext.writeArguments(LONG to count.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SURFACETOOL_SET_SKIN_WEIGHT_COUNT,
        NIL)
  }

  /**
   * By default, returns [godot.SKIN_4_WEIGHTS] to indicate only 4 bone influences per vertex are used.
   *
   * Returns [godot.SKIN_8_WEIGHTS] if up to 8 influences are used.
   *
   * **Note:** This function returns an enum, not the exact number of weights.
   */
  public fun getSkinWeightCount(): SkinWeightCount {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SURFACETOOL_GET_SKIN_WEIGHT_COUNT,
        LONG)
    return SurfaceTool.SkinWeightCount.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Sets the color format for this custom [channelIndex]. Use [CUSTOM_MAX] to disable.
   *
   * Must be invoked after [begin] and should be set before [commit] or [commitToArrays].
   */
  public fun setCustomFormat(channelIndex: Long, format: CustomFormat): Unit {
    TransferContext.writeArguments(LONG to channelIndex, LONG to format.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SURFACETOOL_SET_CUSTOM_FORMAT, NIL)
  }

  /**
   * Returns the format for custom [channelIndex] (currently up to 4). Returns [CUSTOM_MAX] if this custom channel is unused.
   */
  public fun getCustomFormat(channelIndex: Long): CustomFormat {
    TransferContext.writeArguments(LONG to channelIndex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SURFACETOOL_GET_CUSTOM_FORMAT, LONG)
    return SurfaceTool.CustomFormat.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Called before adding any vertices. Takes the primitive type as an argument (e.g. [godot.Mesh.PRIMITIVE_TRIANGLES]).
   */
  public fun begin(primitive: Mesh.PrimitiveType): Unit {
    TransferContext.writeArguments(LONG to primitive.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SURFACETOOL_BEGIN, NIL)
  }

  /**
   * Specifies the position of current vertex. Should be called after specifying other vertex properties (e.g. Color, UV).
   */
  public fun addVertex(vertex: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to vertex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SURFACETOOL_ADD_VERTEX, NIL)
  }

  /**
   * Specifies a [godot.core.Color] to use for the *next* vertex. If every vertex needs to have this information set and you fail to submit it for the first vertex, this information may not be used at all.
   *
   * **Note:** The material must have [godot.BaseMaterial3D.vertexColorUseAsAlbedo] enabled for the vertex color to be visible.
   */
  public fun setColor(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SURFACETOOL_SET_COLOR, NIL)
  }

  /**
   * Specifies a normal to use for the *next* vertex. If every vertex needs to have this information set and you fail to submit it for the first vertex, this information may not be used at all.
   */
  public fun setNormal(normal: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to normal)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SURFACETOOL_SET_NORMAL, NIL)
  }

  /**
   * Specifies a tangent to use for the *next* vertex. If every vertex needs to have this information set and you fail to submit it for the first vertex, this information may not be used at all.
   */
  public fun setTangent(tangent: Plane): Unit {
    TransferContext.writeArguments(PLANE to tangent)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SURFACETOOL_SET_TANGENT, NIL)
  }

  /**
   * Specifies a set of UV coordinates to use for the *next* vertex. If every vertex needs to have this information set and you fail to submit it for the first vertex, this information may not be used at all.
   */
  public fun setUv(uv: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to uv)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SURFACETOOL_SET_UV, NIL)
  }

  /**
   * Specifies an optional second set of UV coordinates to use for the *next* vertex. If every vertex needs to have this information set and you fail to submit it for the first vertex, this information may not be used at all.
   */
  public fun setUv2(uv2: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to uv2)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SURFACETOOL_SET_UV2, NIL)
  }

  /**
   * Specifies an array of bones to use for the *next* vertex. [bones] must contain 4 integers.
   */
  public fun setBones(bones: PackedInt32Array): Unit {
    TransferContext.writeArguments(PACKED_INT_32_ARRAY to bones)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SURFACETOOL_SET_BONES, NIL)
  }

  /**
   * Specifies weight values to use for the *next* vertex. [weights] must contain 4 values. If every vertex needs to have this information set and you fail to submit it for the first vertex, this information may not be used at all.
   */
  public fun setWeights(weights: PackedFloat32Array): Unit {
    TransferContext.writeArguments(PACKED_FLOAT_32_ARRAY to weights)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SURFACETOOL_SET_WEIGHTS, NIL)
  }

  /**
   * Sets the custom value on this vertex for [channelIndex].
   *
   * [setCustomFormat] must be called first for this [channelIndex]. Formats which are not RGBA will ignore other color channels.
   */
  public fun setCustom(channelIndex: Long, customColor: Color): Unit {
    TransferContext.writeArguments(LONG to channelIndex, COLOR to customColor)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SURFACETOOL_SET_CUSTOM, NIL)
  }

  /**
   * Specifies whether the current vertex (if using only vertex arrays) or current index (if also using index arrays) should use smooth normals for normal calculation.
   */
  public fun setSmoothGroup(index: Long): Unit {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SURFACETOOL_SET_SMOOTH_GROUP, NIL)
  }

  /**
   * Inserts a triangle fan made of array data into [godot.Mesh] being constructed.
   *
   * Requires the primitive type be set to [godot.Mesh.PRIMITIVE_TRIANGLES].
   */
  public fun addTriangleFan(
    vertices: PackedVector3Array,
    uvs: PackedVector2Array = PackedVector2Array(),
    colors: PackedColorArray = PackedColorArray(),
    uv2s: PackedVector2Array = PackedVector2Array(),
    normals: PackedVector3Array = PackedVector3Array(),
    tangents: VariantArray<Any?> = godot.core.variantArrayOf()
  ): Unit {
    TransferContext.writeArguments(PACKED_VECTOR3_ARRAY to vertices, PACKED_VECTOR2_ARRAY to uvs, PACKED_COLOR_ARRAY to colors, PACKED_VECTOR2_ARRAY to uv2s, PACKED_VECTOR3_ARRAY to normals, ARRAY to tangents)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SURFACETOOL_ADD_TRIANGLE_FAN, NIL)
  }

  /**
   * Adds a vertex to index array if you are using indexed vertices. Does not need to be called before adding vertices.
   */
  public fun addIndex(index: Long): Unit {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SURFACETOOL_ADD_INDEX, NIL)
  }

  /**
   * Shrinks the vertex array by creating an index array. This can improve performance by avoiding vertex reuse.
   */
  public fun index(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SURFACETOOL_INDEX, NIL)
  }

  /**
   * Removes the index array by expanding the vertex array.
   */
  public fun deindex(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SURFACETOOL_DEINDEX, NIL)
  }

  /**
   * Generates normals from vertices so you do not have to do it manually. If [flip] is `true`, the resulting normals will be inverted. [generateNormals] should be called *after* generating geometry and *before* committing the mesh using [commit] or [commitToArrays]. For correct display of normal-mapped surfaces, you will also have to generate tangents using [generateTangents].
   *
   * **Note:** [generateNormals] only works if the primitive type to be set to [godot.Mesh.PRIMITIVE_TRIANGLES].
   *
   * **Note:** [generateNormals] takes smooth groups into account. If you don't specify any smooth group for each vertex, [generateNormals] will smooth normals for you.
   */
  public fun generateNormals(flip: Boolean = false): Unit {
    TransferContext.writeArguments(BOOL to flip)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SURFACETOOL_GENERATE_NORMALS, NIL)
  }

  /**
   * Generates a tangent vector for each vertex. Requires that each vertex have UVs and normals set already (see [generateNormals]).
   */
  public fun generateTangents(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SURFACETOOL_GENERATE_TANGENTS, NIL)
  }

  /**
   * Optimizes triangle sorting for performance. Requires that [getPrimitiveType] is [godot.Mesh.PRIMITIVE_TRIANGLES].
   */
  public fun optimizeIndicesForCache(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SURFACETOOL_OPTIMIZE_INDICES_FOR_CACHE, NIL)
  }

  /**
   * Returns the axis-aligned bounding box of the vertex positions.
   */
  public fun getAabb(): AABB {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SURFACETOOL_GET_AABB,
        godot.core.VariantType.AABB)
    return TransferContext.readReturnValue(godot.core.VariantType.AABB, false) as AABB
  }

  /**
   * Generates a LOD for a given [ndThreshold] in linear units (square root of quadric error metric), using at most [targetIndexCount] indices.
   *
   * Deprecated. Unused internally and neglects to preserve normals or UVs. Consider using [godot.ImporterMesh.generateLods] instead.
   */
  public fun generateLod(ndThreshold: Double, targetIndexCount: Long = 3): PackedInt32Array {
    TransferContext.writeArguments(DOUBLE to ndThreshold, LONG to targetIndexCount)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SURFACETOOL_GENERATE_LOD,
        PACKED_INT_32_ARRAY)
    return TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array
  }

  /**
   * Sets [godot.Material] to be used by the [godot.Mesh] you are constructing.
   */
  public fun setMaterial(material: Material): Unit {
    TransferContext.writeArguments(OBJECT to material)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SURFACETOOL_SET_MATERIAL, NIL)
  }

  /**
   * Returns the type of mesh geometry, such as [godot.Mesh.PRIMITIVE_TRIANGLES].
   */
  public fun getPrimitiveType(): Mesh.PrimitiveType {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SURFACETOOL_GET_PRIMITIVE_TYPE,
        LONG)
    return Mesh.PrimitiveType.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Clear all information passed into the surface tool so far.
   */
  public fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SURFACETOOL_CLEAR, NIL)
  }

  /**
   * Creates a vertex array from an existing [godot.Mesh].
   */
  public fun createFrom(existing: Mesh, surface: Long): Unit {
    TransferContext.writeArguments(OBJECT to existing, LONG to surface)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SURFACETOOL_CREATE_FROM, NIL)
  }

  /**
   * Creates a vertex array from the specified blend shape of an existing [godot.Mesh]. This can be used to extract a specific pose from a blend shape.
   */
  public fun createFromBlendShape(
    existing: Mesh,
    surface: Long,
    blendShape: String
  ): Unit {
    TransferContext.writeArguments(OBJECT to existing, LONG to surface, STRING to blendShape)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SURFACETOOL_CREATE_FROM_BLEND_SHAPE,
        NIL)
  }

  /**
   * Append vertices from a given [godot.Mesh] surface onto the current vertex array with specified [godot.Transform3D].
   */
  public fun appendFrom(
    existing: Mesh,
    surface: Long,
    transform: Transform3D
  ): Unit {
    TransferContext.writeArguments(OBJECT to existing, LONG to surface, TRANSFORM3D to transform)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SURFACETOOL_APPEND_FROM, NIL)
  }

  /**
   * Returns a constructed [godot.ArrayMesh] from current information passed in. If an existing [godot.ArrayMesh] is passed in as an argument, will add an extra surface to the existing [godot.ArrayMesh].
   *
   * **FIXME:** Document possible values for [flags], it changed in 4.0. Likely some combinations of [enum Mesh.ArrayFormat].
   */
  public fun commit(existing: ArrayMesh? = null, flags: Long = 0): ArrayMesh? {
    TransferContext.writeArguments(OBJECT to existing, LONG to flags)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SURFACETOOL_COMMIT, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as ArrayMesh?
  }

  /**
   * Commits the data to the same format used by [godot.ArrayMesh.addSurfaceFromArrays]. This way you can further process the mesh data using the [godot.ArrayMesh] API.
   */
  public fun commitToArrays(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SURFACETOOL_COMMIT_TO_ARRAYS, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  public enum class CustomFormat(
    id: Long
  ) {
    /**
     * Limits range of data passed to [setCustom] to unsigned normalized 0 to 1 stored in 8 bits per channel. See [godot.Mesh.ARRAY_CUSTOM_RGBA8_UNORM].
     */
    CUSTOM_RGBA8_UNORM(0),
    /**
     * Limits range of data passed to [setCustom] to signed normalized -1 to 1 stored in 8 bits per channel. See [godot.Mesh.ARRAY_CUSTOM_RGBA8_SNORM].
     */
    CUSTOM_RGBA8_SNORM(1),
    /**
     * Stores data passed to [setCustom] as half precision floats, and uses only red and green color channels. See [godot.Mesh.ARRAY_CUSTOM_RG_HALF].
     */
    CUSTOM_RG_HALF(2),
    /**
     * Stores data passed to [setCustom] as half precision floats and uses all color channels. See [godot.Mesh.ARRAY_CUSTOM_RGBA_HALF].
     */
    CUSTOM_RGBA_HALF(3),
    /**
     * Stores data passed to [setCustom] as full precision floats, and uses only red color channel. See [godot.Mesh.ARRAY_CUSTOM_R_FLOAT].
     */
    CUSTOM_R_FLOAT(4),
    /**
     * Stores data passed to [setCustom] as full precision floats, and uses only red and green color channels. See [godot.Mesh.ARRAY_CUSTOM_RG_FLOAT].
     */
    CUSTOM_RG_FLOAT(5),
    /**
     * Stores data passed to [setCustom] as full precision floats, and uses only red, green and blue color channels. See [godot.Mesh.ARRAY_CUSTOM_RGB_FLOAT].
     */
    CUSTOM_RGB_FLOAT(6),
    /**
     * Stores data passed to [setCustom] as full precision floats, and uses all color channels. See [godot.Mesh.ARRAY_CUSTOM_RGBA_FLOAT].
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class SkinWeightCount(
    id: Long
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object
}
