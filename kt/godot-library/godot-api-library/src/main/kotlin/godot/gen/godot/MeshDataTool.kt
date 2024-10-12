// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.PackedFloat32Array
import godot.core.PackedInt32Array
import godot.core.Plane
import godot.core.VariantCaster.ANY
import godot.core.VariantParser.COLOR
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_FLOAT_32_ARRAY
import godot.core.VariantParser.PACKED_INT_32_ARRAY
import godot.core.VariantParser.PLANE
import godot.core.VariantParser.VECTOR2
import godot.core.VariantParser.VECTOR3
import godot.core.Vector2
import godot.core.Vector3
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

private const val ENGINE_CLASS_MESHDATATOOL_INDEX: Int = 368

/**
 * MeshDataTool provides access to individual vertices in a [Mesh]. It allows users to read and edit
 * vertex data of meshes. It also creates an array of faces and edges.
 * To use MeshDataTool, load a mesh with [createFromSurface]. When you are finished editing the data
 * commit the data to a mesh with [commitToSurface].
 * Below is an example of how MeshDataTool may be used.
 *
 * gdscript:
 * ```gdscript
 * var mesh = ArrayMesh.new()
 * mesh.add_surface_from_arrays(Mesh.PRIMITIVE_TRIANGLES, BoxMesh.new().get_mesh_arrays())
 * var mdt = MeshDataTool.new()
 * mdt.create_from_surface(mesh, 0)
 * for i in range(mdt.get_vertex_count()):
 *     var vertex = mdt.get_vertex(i)
 *     # In this example we extend the mesh by one unit, which results in separated faces as it is
 * flat shaded.
 *     vertex += mdt.get_vertex_normal(i)
 *     # Save your change.
 *     mdt.set_vertex(i, vertex)
 * mesh.clear_surfaces()
 * mdt.commit_to_surface(mesh)
 * var mi = MeshInstance.new()
 * mi.mesh = mesh
 * add_child(mi)
 * ```
 * csharp:
 * ```csharp
 * var mesh = new ArrayMesh();
 * mesh.AddSurfaceFromArrays(Mesh.PrimitiveType.Triangles, new BoxMesh().GetMeshArrays());
 * var mdt = new MeshDataTool();
 * mdt.CreateFromSurface(mesh, 0);
 * for (var i = 0; i < mdt.GetVertexCount(); i++)
 * {
 *     Vector3 vertex = mdt.GetVertex(i);
 *     // In this example we extend the mesh by one unit, which results in separated faces as it is
 * flat shaded.
 *     vertex += mdt.GetVertexNormal(i);
 *     // Save your change.
 *     mdt.SetVertex(i, vertex);
 * }
 * mesh.ClearSurfaces();
 * mdt.CommitToSurface(mesh);
 * var mi = new MeshInstance();
 * mi.Mesh = mesh;
 * AddChild(mi);
 * ```
 *
 * See also [ArrayMesh], [ImmediateMesh] and [SurfaceTool] for procedural geometry generation.
 * **Note:** Godot uses clockwise [url=https://learnopengl.com/Advanced-OpenGL/Face-culling]winding
 * order[/url] for front faces of triangle primitive modes.
 */
@GodotBaseType
public open class MeshDataTool : RefCounted() {
  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_MESHDATATOOL_INDEX, scriptIndex)
  }

  /**
   * Clears all data currently in MeshDataTool.
   */
  public final fun clear(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.clearPtr, NIL)
  }

  /**
   * Uses specified surface of given [Mesh] to populate data for MeshDataTool.
   * Requires [Mesh] with primitive type [Mesh.PRIMITIVE_TRIANGLES].
   */
  public final fun createFromSurface(mesh: ArrayMesh?, surface: Int): Error {
    Internals.writeArguments(OBJECT to mesh, LONG to surface.toLong())
    Internals.callMethod(rawPtr, MethodBindings.createFromSurfacePtr, LONG)
    return Error.from(Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Adds a new surface to specified [Mesh] with edited data.
   */
  @JvmOverloads
  public final fun commitToSurface(mesh: ArrayMesh?, compressionFlags: Long = 0): Error {
    Internals.writeArguments(OBJECT to mesh, LONG to compressionFlags)
    Internals.callMethod(rawPtr, MethodBindings.commitToSurfacePtr, LONG)
    return Error.from(Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the [Mesh]'s format as a combination of the [Mesh.ArrayFormat] flags. For example, a
   * mesh containing both vertices and normals would return a format of `3` because
   * [Mesh.ARRAY_FORMAT_VERTEX] is `1` and [Mesh.ARRAY_FORMAT_NORMAL] is `2`.
   */
  public final fun getFormat(): Long {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getFormatPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the total number of vertices in [Mesh].
   */
  public final fun getVertexCount(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getVertexCountPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the number of edges in this [Mesh].
   */
  public final fun getEdgeCount(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getEdgeCountPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the number of faces in this [Mesh].
   */
  public final fun getFaceCount(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getFaceCountPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Sets the position of the given vertex.
   */
  public final fun setVertex(idx: Int, vertex: Vector3): Unit {
    Internals.writeArguments(LONG to idx.toLong(), VECTOR3 to vertex)
    Internals.callMethod(rawPtr, MethodBindings.setVertexPtr, NIL)
  }

  /**
   * Returns the position of the given vertex.
   */
  public final fun getVertex(idx: Int): Vector3 {
    Internals.writeArguments(LONG to idx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getVertexPtr, VECTOR3)
    return (Internals.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Sets the normal of the given vertex.
   */
  public final fun setVertexNormal(idx: Int, normal: Vector3): Unit {
    Internals.writeArguments(LONG to idx.toLong(), VECTOR3 to normal)
    Internals.callMethod(rawPtr, MethodBindings.setVertexNormalPtr, NIL)
  }

  /**
   * Returns the normal of the given vertex.
   */
  public final fun getVertexNormal(idx: Int): Vector3 {
    Internals.writeArguments(LONG to idx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getVertexNormalPtr, VECTOR3)
    return (Internals.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Sets the tangent of the given vertex.
   */
  public final fun setVertexTangent(idx: Int, tangent: Plane): Unit {
    Internals.writeArguments(LONG to idx.toLong(), PLANE to tangent)
    Internals.callMethod(rawPtr, MethodBindings.setVertexTangentPtr, NIL)
  }

  /**
   * Returns the tangent of the given vertex.
   */
  public final fun getVertexTangent(idx: Int): Plane {
    Internals.writeArguments(LONG to idx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getVertexTangentPtr, PLANE)
    return (Internals.readReturnValue(PLANE) as Plane)
  }

  /**
   * Sets the UV of the given vertex.
   */
  public final fun setVertexUv(idx: Int, uv: Vector2): Unit {
    Internals.writeArguments(LONG to idx.toLong(), VECTOR2 to uv)
    Internals.callMethod(rawPtr, MethodBindings.setVertexUvPtr, NIL)
  }

  /**
   * Returns the UV of the given vertex.
   */
  public final fun getVertexUv(idx: Int): Vector2 {
    Internals.writeArguments(LONG to idx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getVertexUvPtr, VECTOR2)
    return (Internals.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Sets the UV2 of the given vertex.
   */
  public final fun setVertexUv2(idx: Int, uv2: Vector2): Unit {
    Internals.writeArguments(LONG to idx.toLong(), VECTOR2 to uv2)
    Internals.callMethod(rawPtr, MethodBindings.setVertexUv2Ptr, NIL)
  }

  /**
   * Returns the UV2 of the given vertex.
   */
  public final fun getVertexUv2(idx: Int): Vector2 {
    Internals.writeArguments(LONG to idx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getVertexUv2Ptr, VECTOR2)
    return (Internals.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Sets the color of the given vertex.
   */
  public final fun setVertexColor(idx: Int, color: Color): Unit {
    Internals.writeArguments(LONG to idx.toLong(), COLOR to color)
    Internals.callMethod(rawPtr, MethodBindings.setVertexColorPtr, NIL)
  }

  /**
   * Returns the color of the given vertex.
   */
  public final fun getVertexColor(idx: Int): Color {
    Internals.writeArguments(LONG to idx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getVertexColorPtr, COLOR)
    return (Internals.readReturnValue(COLOR) as Color)
  }

  /**
   * Sets the bones of the given vertex.
   */
  public final fun setVertexBones(idx: Int, bones: PackedInt32Array): Unit {
    Internals.writeArguments(LONG to idx.toLong(), PACKED_INT_32_ARRAY to bones)
    Internals.callMethod(rawPtr, MethodBindings.setVertexBonesPtr, NIL)
  }

  /**
   * Returns the bones of the given vertex.
   */
  public final fun getVertexBones(idx: Int): PackedInt32Array {
    Internals.writeArguments(LONG to idx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getVertexBonesPtr, PACKED_INT_32_ARRAY)
    return (Internals.readReturnValue(PACKED_INT_32_ARRAY) as PackedInt32Array)
  }

  /**
   * Sets the bone weights of the given vertex.
   */
  public final fun setVertexWeights(idx: Int, weights: PackedFloat32Array): Unit {
    Internals.writeArguments(LONG to idx.toLong(), PACKED_FLOAT_32_ARRAY to weights)
    Internals.callMethod(rawPtr, MethodBindings.setVertexWeightsPtr, NIL)
  }

  /**
   * Returns bone weights of the given vertex.
   */
  public final fun getVertexWeights(idx: Int): PackedFloat32Array {
    Internals.writeArguments(LONG to idx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getVertexWeightsPtr, PACKED_FLOAT_32_ARRAY)
    return (Internals.readReturnValue(PACKED_FLOAT_32_ARRAY) as PackedFloat32Array)
  }

  /**
   * Sets the metadata associated with the given vertex.
   */
  public final fun setVertexMeta(idx: Int, meta: Any?): Unit {
    Internals.writeArguments(LONG to idx.toLong(), ANY to meta)
    Internals.callMethod(rawPtr, MethodBindings.setVertexMetaPtr, NIL)
  }

  /**
   * Returns the metadata associated with the given vertex.
   */
  public final fun getVertexMeta(idx: Int): Any? {
    Internals.writeArguments(LONG to idx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getVertexMetaPtr, ANY)
    return (Internals.readReturnValue(ANY) as Any?)
  }

  /**
   * Returns an array of edges that share the given vertex.
   */
  public final fun getVertexEdges(idx: Int): PackedInt32Array {
    Internals.writeArguments(LONG to idx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getVertexEdgesPtr, PACKED_INT_32_ARRAY)
    return (Internals.readReturnValue(PACKED_INT_32_ARRAY) as PackedInt32Array)
  }

  /**
   * Returns an array of faces that share the given vertex.
   */
  public final fun getVertexFaces(idx: Int): PackedInt32Array {
    Internals.writeArguments(LONG to idx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getVertexFacesPtr, PACKED_INT_32_ARRAY)
    return (Internals.readReturnValue(PACKED_INT_32_ARRAY) as PackedInt32Array)
  }

  /**
   * Returns index of specified vertex connected to given edge.
   * Vertex argument can only be 0 or 1 because edges are comprised of two vertices.
   */
  public final fun getEdgeVertex(idx: Int, vertex: Int): Int {
    Internals.writeArguments(LONG to idx.toLong(), LONG to vertex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getEdgeVertexPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns array of faces that touch given edge.
   */
  public final fun getEdgeFaces(idx: Int): PackedInt32Array {
    Internals.writeArguments(LONG to idx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getEdgeFacesPtr, PACKED_INT_32_ARRAY)
    return (Internals.readReturnValue(PACKED_INT_32_ARRAY) as PackedInt32Array)
  }

  /**
   * Sets the metadata of the given edge.
   */
  public final fun setEdgeMeta(idx: Int, meta: Any?): Unit {
    Internals.writeArguments(LONG to idx.toLong(), ANY to meta)
    Internals.callMethod(rawPtr, MethodBindings.setEdgeMetaPtr, NIL)
  }

  /**
   * Returns meta information assigned to given edge.
   */
  public final fun getEdgeMeta(idx: Int): Any? {
    Internals.writeArguments(LONG to idx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getEdgeMetaPtr, ANY)
    return (Internals.readReturnValue(ANY) as Any?)
  }

  /**
   * Returns the specified vertex index of the given face.
   * Vertex argument must be either 0, 1, or 2 because faces contain three vertices.
   * **Example:**
   *
   * gdscript:
   * ```gdscript
   * var index = mesh_data_tool.get_face_vertex(0, 1) # Gets the index of the second vertex of the
   * first face.
   * var position = mesh_data_tool.get_vertex(index)
   * var normal = mesh_data_tool.get_vertex_normal(index)
   * ```
   * csharp:
   * ```csharp
   * int index = meshDataTool.GetFaceVertex(0, 1); // Gets the index of the second vertex of the
   * first face.
   * Vector3 position = meshDataTool.GetVertex(index);
   * Vector3 normal = meshDataTool.GetVertexNormal(index);
   * ```
   */
  public final fun getFaceVertex(idx: Int, vertex: Int): Int {
    Internals.writeArguments(LONG to idx.toLong(), LONG to vertex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getFaceVertexPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns specified edge associated with given face.
   * Edge argument must be either 0, 1, or 2 because a face only has three edges.
   */
  public final fun getFaceEdge(idx: Int, edge: Int): Int {
    Internals.writeArguments(LONG to idx.toLong(), LONG to edge.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getFaceEdgePtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Sets the metadata of the given face.
   */
  public final fun setFaceMeta(idx: Int, meta: Any?): Unit {
    Internals.writeArguments(LONG to idx.toLong(), ANY to meta)
    Internals.callMethod(rawPtr, MethodBindings.setFaceMetaPtr, NIL)
  }

  /**
   * Returns the metadata associated with the given face.
   */
  public final fun getFaceMeta(idx: Int): Any? {
    Internals.writeArguments(LONG to idx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getFaceMetaPtr, ANY)
    return (Internals.readReturnValue(ANY) as Any?)
  }

  /**
   * Calculates and returns the face normal of the given face.
   */
  public final fun getFaceNormal(idx: Int): Vector3 {
    Internals.writeArguments(LONG to idx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getFaceNormalPtr, VECTOR3)
    return (Internals.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Sets the material to be used by newly-constructed [Mesh].
   */
  public final fun setMaterial(material: Material?): Unit {
    Internals.writeArguments(OBJECT to material)
    Internals.callMethod(rawPtr, MethodBindings.setMaterialPtr, NIL)
  }

  /**
   * Returns the material assigned to the [Mesh].
   */
  public final fun getMaterial(): Material? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getMaterialPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Material?)
  }

  public companion object

  public object MethodBindings {
    internal val clearPtr: VoidPtr = Internals.getMethodBindPtr("MeshDataTool", "clear", 3218959716)

    internal val createFromSurfacePtr: VoidPtr =
        Internals.getMethodBindPtr("MeshDataTool", "create_from_surface", 2727020678)

    internal val commitToSurfacePtr: VoidPtr =
        Internals.getMethodBindPtr("MeshDataTool", "commit_to_surface", 2021686445)

    internal val getFormatPtr: VoidPtr =
        Internals.getMethodBindPtr("MeshDataTool", "get_format", 3905245786)

    internal val getVertexCountPtr: VoidPtr =
        Internals.getMethodBindPtr("MeshDataTool", "get_vertex_count", 3905245786)

    internal val getEdgeCountPtr: VoidPtr =
        Internals.getMethodBindPtr("MeshDataTool", "get_edge_count", 3905245786)

    internal val getFaceCountPtr: VoidPtr =
        Internals.getMethodBindPtr("MeshDataTool", "get_face_count", 3905245786)

    internal val setVertexPtr: VoidPtr =
        Internals.getMethodBindPtr("MeshDataTool", "set_vertex", 1530502735)

    internal val getVertexPtr: VoidPtr =
        Internals.getMethodBindPtr("MeshDataTool", "get_vertex", 711720468)

    internal val setVertexNormalPtr: VoidPtr =
        Internals.getMethodBindPtr("MeshDataTool", "set_vertex_normal", 1530502735)

    internal val getVertexNormalPtr: VoidPtr =
        Internals.getMethodBindPtr("MeshDataTool", "get_vertex_normal", 711720468)

    internal val setVertexTangentPtr: VoidPtr =
        Internals.getMethodBindPtr("MeshDataTool", "set_vertex_tangent", 1104099133)

    internal val getVertexTangentPtr: VoidPtr =
        Internals.getMethodBindPtr("MeshDataTool", "get_vertex_tangent", 1372055458)

    internal val setVertexUvPtr: VoidPtr =
        Internals.getMethodBindPtr("MeshDataTool", "set_vertex_uv", 163021252)

    internal val getVertexUvPtr: VoidPtr =
        Internals.getMethodBindPtr("MeshDataTool", "get_vertex_uv", 2299179447)

    internal val setVertexUv2Ptr: VoidPtr =
        Internals.getMethodBindPtr("MeshDataTool", "set_vertex_uv2", 163021252)

    internal val getVertexUv2Ptr: VoidPtr =
        Internals.getMethodBindPtr("MeshDataTool", "get_vertex_uv2", 2299179447)

    internal val setVertexColorPtr: VoidPtr =
        Internals.getMethodBindPtr("MeshDataTool", "set_vertex_color", 2878471219)

    internal val getVertexColorPtr: VoidPtr =
        Internals.getMethodBindPtr("MeshDataTool", "get_vertex_color", 3457211756)

    internal val setVertexBonesPtr: VoidPtr =
        Internals.getMethodBindPtr("MeshDataTool", "set_vertex_bones", 3500328261)

    internal val getVertexBonesPtr: VoidPtr =
        Internals.getMethodBindPtr("MeshDataTool", "get_vertex_bones", 1706082319)

    internal val setVertexWeightsPtr: VoidPtr =
        Internals.getMethodBindPtr("MeshDataTool", "set_vertex_weights", 1345852415)

    internal val getVertexWeightsPtr: VoidPtr =
        Internals.getMethodBindPtr("MeshDataTool", "get_vertex_weights", 1542882410)

    internal val setVertexMetaPtr: VoidPtr =
        Internals.getMethodBindPtr("MeshDataTool", "set_vertex_meta", 2152698145)

    internal val getVertexMetaPtr: VoidPtr =
        Internals.getMethodBindPtr("MeshDataTool", "get_vertex_meta", 4227898402)

    internal val getVertexEdgesPtr: VoidPtr =
        Internals.getMethodBindPtr("MeshDataTool", "get_vertex_edges", 1706082319)

    internal val getVertexFacesPtr: VoidPtr =
        Internals.getMethodBindPtr("MeshDataTool", "get_vertex_faces", 1706082319)

    internal val getEdgeVertexPtr: VoidPtr =
        Internals.getMethodBindPtr("MeshDataTool", "get_edge_vertex", 3175239445)

    internal val getEdgeFacesPtr: VoidPtr =
        Internals.getMethodBindPtr("MeshDataTool", "get_edge_faces", 1706082319)

    internal val setEdgeMetaPtr: VoidPtr =
        Internals.getMethodBindPtr("MeshDataTool", "set_edge_meta", 2152698145)

    internal val getEdgeMetaPtr: VoidPtr =
        Internals.getMethodBindPtr("MeshDataTool", "get_edge_meta", 4227898402)

    internal val getFaceVertexPtr: VoidPtr =
        Internals.getMethodBindPtr("MeshDataTool", "get_face_vertex", 3175239445)

    internal val getFaceEdgePtr: VoidPtr =
        Internals.getMethodBindPtr("MeshDataTool", "get_face_edge", 3175239445)

    internal val setFaceMetaPtr: VoidPtr =
        Internals.getMethodBindPtr("MeshDataTool", "set_face_meta", 2152698145)

    internal val getFaceMetaPtr: VoidPtr =
        Internals.getMethodBindPtr("MeshDataTool", "get_face_meta", 4227898402)

    internal val getFaceNormalPtr: VoidPtr =
        Internals.getMethodBindPtr("MeshDataTool", "get_face_normal", 711720468)

    internal val setMaterialPtr: VoidPtr =
        Internals.getMethodBindPtr("MeshDataTool", "set_material", 2757459619)

    internal val getMaterialPtr: VoidPtr =
        Internals.getMethodBindPtr("MeshDataTool", "get_material", 5934680)
  }
}
