// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.Color
import godot.core.Plane
import godot.core.PoolColorArray
import godot.core.PoolIntArray
import godot.core.PoolRealArray
import godot.core.PoolVector2Array
import godot.core.PoolVector3Array
import godot.core.TransferContext
import godot.core.Transform
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PLANE
import godot.core.VariantType.POOL_COLOR_ARRAY
import godot.core.VariantType.POOL_INT_ARRAY
import godot.core.VariantType.POOL_REAL_ARRAY
import godot.core.VariantType.POOL_VECTOR2_ARRAY
import godot.core.VariantType.POOL_VECTOR3_ARRAY
import godot.core.VariantType.STRING
import godot.core.VariantType.TRANSFORM
import godot.core.VariantType.VECTOR2
import godot.core.VariantType.VECTOR3
import godot.core.Vector2
import godot.core.Vector3
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.Suppress

/**
 * Helper tool to create geometry.
 *
 * The [godot.SurfaceTool] is used to construct a [godot.Mesh] by specifying vertex attributes individually. It can be used to construct a [godot.Mesh] from a script. All properties except indices need to be added before calling [addVertex]. For example, to add vertex colors and UVs:
 *
 * ```
 * 		var st = SurfaceTool.new()
 * 		st.begin(Mesh.PRIMITIVE_TRIANGLES)
 * 		st.add_color(Color(1, 0, 0))
 * 		st.add_uv(Vector2(0, 0))
 * 		st.add_vertex(Vector3(0, 0, 0))
 * 		```
 *
 * The above [godot.SurfaceTool] now contains one vertex of a triangle which has a UV coordinate and a specified [godot.core.Color]. If another vertex were added without calling [addUv] or [addColor], then the last values would be used.
 *
 * Vertex attributes must be passed **before** calling [addVertex]. Failure to do so will result in an error when committing the vertex information to a mesh.
 *
 * Additionally, the attributes used before the first vertex is added determine the format of the mesh. For example, if you only add UVs to the first vertex, you cannot add color to any of the subsequent vertices.
 *
 * See also [godot.ArrayMesh], [godot.ImmediateGeometry] and [godot.MeshDataTool] for procedural geometry generation.
 *
 * **Note:** Godot uses clockwise [winding order](https://learnopengl.com/Advanced-OpenGL/Face-culling) for front faces of triangle primitive modes.
 */
@GodotBaseType
open class SurfaceTool : Reference() {
  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_SURFACETOOL, ____DO_NOT_TOUCH_THIS_isRef____())
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  /**
   * Adds an array of bones for the next vertex to use. `bones` must contain 4 integers.
   */
  open fun addBones(bones: PoolIntArray) {
    TransferContext.writeArguments(POOL_INT_ARRAY to bones)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SURFACETOOL_ADD_BONES, NIL)
  }

  /**
   * Specifies a [godot.core.Color] for the next vertex to use.
   */
  open fun addColor(color: Color) {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SURFACETOOL_ADD_COLOR, NIL)
  }

  /**
   * Adds an index to index array if you are using indexed vertices. Does not need to be called before adding vertices.
   */
  open fun addIndex(index: Long) {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SURFACETOOL_ADD_INDEX, NIL)
  }

  /**
   * Specifies a normal for the next vertex to use.
   */
  open fun addNormal(normal: Vector3) {
    TransferContext.writeArguments(VECTOR3 to normal)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SURFACETOOL_ADD_NORMAL, NIL)
  }

  /**
   * Specifies whether the current vertex (if using only vertex arrays) or current index (if also using index arrays) should use smooth normals for normal calculation.
   */
  open fun addSmoothGroup(smooth: Boolean) {
    TransferContext.writeArguments(BOOL to smooth)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SURFACETOOL_ADD_SMOOTH_GROUP, NIL)
  }

  /**
   * Specifies a tangent for the next vertex to use.
   */
  open fun addTangent(tangent: Plane) {
    TransferContext.writeArguments(PLANE to tangent)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SURFACETOOL_ADD_TANGENT, NIL)
  }

  /**
   * Inserts a triangle fan made of array data into [godot.Mesh] being constructed.
   *
   * Requires the primitive type be set to [godot.Mesh.PRIMITIVE_TRIANGLES].
   */
  open fun addTriangleFan(
    vertices: PoolVector3Array,
    uvs: PoolVector2Array = PoolVector2Array(),
    colors: PoolColorArray = PoolColorArray(),
    uv2s: PoolVector2Array = PoolVector2Array(),
    normals: PoolVector3Array = PoolVector3Array(),
    tangents: VariantArray<Any?> = VariantArray()
  ) {
    TransferContext.writeArguments(POOL_VECTOR3_ARRAY to vertices, POOL_VECTOR2_ARRAY to uvs,
        POOL_COLOR_ARRAY to colors, POOL_VECTOR2_ARRAY to uv2s, POOL_VECTOR3_ARRAY to normals, ARRAY
        to tangents)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SURFACETOOL_ADD_TRIANGLE_FAN, NIL)
  }

  /**
   * Specifies a set of UV coordinates to use for the next vertex.
   */
  open fun addUv(uv: Vector2) {
    TransferContext.writeArguments(VECTOR2 to uv)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SURFACETOOL_ADD_UV, NIL)
  }

  /**
   * Specifies an optional second set of UV coordinates to use for the next vertex.
   */
  open fun addUv2(uv2: Vector2) {
    TransferContext.writeArguments(VECTOR2 to uv2)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SURFACETOOL_ADD_UV2, NIL)
  }

  /**
   * Specifies the position of current vertex. Should be called after specifying other vertex properties (e.g. Color, UV).
   */
  open fun addVertex(vertex: Vector3) {
    TransferContext.writeArguments(VECTOR3 to vertex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SURFACETOOL_ADD_VERTEX, NIL)
  }

  /**
   * Specifies weight values for next vertex to use. `weights` must contain 4 values.
   */
  open fun addWeights(weights: PoolRealArray) {
    TransferContext.writeArguments(POOL_REAL_ARRAY to weights)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SURFACETOOL_ADD_WEIGHTS, NIL)
  }

  /**
   * Append vertices from a given [godot.Mesh] surface onto the current vertex array with specified [godot.core.Transform].
   */
  open fun appendFrom(
    existing: Mesh,
    surface: Long,
    transform: Transform
  ) {
    TransferContext.writeArguments(OBJECT to existing, LONG to surface, TRANSFORM to transform)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SURFACETOOL_APPEND_FROM, NIL)
  }

  /**
   * Called before adding any vertices. Takes the primitive type as an argument (e.g. [godot.Mesh.PRIMITIVE_TRIANGLES]).
   */
  open fun begin(primitive: Long) {
    TransferContext.writeArguments(LONG to primitive)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SURFACETOOL_BEGIN, NIL)
  }

  /**
   * Clear all information passed into the surface tool so far.
   */
  open fun clear() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SURFACETOOL_CLEAR, NIL)
  }

  /**
   * Returns a constructed [godot.ArrayMesh] from current information passed in. If an existing [godot.ArrayMesh] is passed in as an argument, will add an extra surface to the existing [godot.ArrayMesh].
   *
   * Default flag is [godot.Mesh.ARRAY_COMPRESS_DEFAULT]. See `ARRAY_COMPRESS_*` constants in [enum Mesh.ArrayFormat] for other flags.
   */
  open fun commit(existing: ArrayMesh? = null, flags: Long = 97280): ArrayMesh? {
    TransferContext.writeArguments(OBJECT to existing, LONG to flags)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SURFACETOOL_COMMIT, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as ArrayMesh?
  }

  /**
   * Commits the data to the same format used by [godot.ArrayMesh.addSurfaceFromArrays]. This way you can further process the mesh data using the [godot.ArrayMesh] API.
   */
  open fun commitToArrays(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SURFACETOOL_COMMIT_TO_ARRAYS, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Creates a vertex array from an existing [godot.Mesh].
   */
  open fun createFrom(existing: Mesh, surface: Long) {
    TransferContext.writeArguments(OBJECT to existing, LONG to surface)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SURFACETOOL_CREATE_FROM, NIL)
  }

  /**
   * Creates a vertex array from the specified blend shape of an existing [godot.Mesh]. This can be used to extract a specific pose from a blend shape.
   */
  open fun createFromBlendShape(
    existing: Mesh,
    surface: Long,
    blendShape: String
  ) {
    TransferContext.writeArguments(OBJECT to existing, LONG to surface, STRING to blendShape)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SURFACETOOL_CREATE_FROM_BLEND_SHAPE,
        NIL)
  }

  /**
   * Removes the index array by expanding the vertex array.
   */
  open fun deindex() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SURFACETOOL_DEINDEX, NIL)
  }

  /**
   * Generates normals from vertices so you do not have to do it manually. If `flip` is `true`, the resulting normals will be inverted.
   *
   * Requires the primitive type to be set to [godot.Mesh.PRIMITIVE_TRIANGLES].
   */
  open fun generateNormals(flip: Boolean = false) {
    TransferContext.writeArguments(BOOL to flip)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SURFACETOOL_GENERATE_NORMALS, NIL)
  }

  /**
   * Generates a tangent vector for each vertex. Requires that each vertex have UVs and normals set already.
   */
  open fun generateTangents() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SURFACETOOL_GENERATE_TANGENTS, NIL)
  }

  /**
   * Shrinks the vertex array by creating an index array (avoids reusing vertices).
   */
  open fun index() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SURFACETOOL_INDEX, NIL)
  }

  /**
   * Sets [godot.Material] to be used by the [godot.Mesh] you are constructing.
   */
  open fun setMaterial(material: Material) {
    TransferContext.writeArguments(OBJECT to material)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SURFACETOOL_SET_MATERIAL, NIL)
  }
}
