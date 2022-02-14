// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.GodotError
import godot.core.PackedFloat32Array
import godot.core.PackedInt32Array
import godot.core.Plane
import godot.core.TransferContext
import godot.core.VariantType.ANY
import godot.core.VariantType.COLOR
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_FLOAT_32_ARRAY
import godot.core.VariantType.PACKED_INT_32_ARRAY
import godot.core.VariantType.PLANE
import godot.core.VariantType.VECTOR2
import godot.core.VariantType.VECTOR3
import godot.core.Vector2
import godot.core.Vector3
import kotlin.Any
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Helper tool to access and edit [godot.Mesh] data.
 *
 * MeshDataTool provides access to individual vertices in a [godot.Mesh]. It allows users to read and edit vertex data of meshes. It also creates an array of faces and edges.
 *
 * To use MeshDataTool, load a mesh with [createFromSurface]. When you are finished editing the data commit the data to a mesh with [commitToSurface].
 *
 * Below is an example of how MeshDataTool may be used.
 *
 * [codeblocks]
 *
 * [gdscript]
 *
 * var mesh = ArrayMesh.new()
 *
 * mesh.add_surface_from_arrays(Mesh.PRIMITIVE_TRIANGLES, BoxMesh.new().get_mesh_arrays())
 *
 * var mdt = MeshDataTool.new()
 *
 * mdt.create_from_surface(mesh, 0)
 *
 * for i in range(mdt.get_vertex_count()):
 *
 *     var vertex = mdt.get_vertex(i)
 *
 *     # In this example we extend the mesh by one unit, which results in separated faces as it is flat shaded.
 *
 *     vertex += mdt.get_vertex_normal(i)
 *
 *     # Save your change.
 *
 *     mdt.set_vertex(i, vertex)
 *
 * mesh.surface_remove(0)
 *
 * mdt.commit_to_surface(mesh)
 *
 * var mi = MeshInstance.new()
 *
 * mi.mesh = mesh
 *
 * add_child(mi)
 *
 * [/gdscript]
 *
 * [csharp]
 *
 * var mesh = new ArrayMesh();
 *
 * mesh.AddSurfaceFromArrays(Mesh.PrimitiveType.Triangles, new BoxMesh().GetMeshArrays());
 *
 * var mdt = new MeshDataTool();
 *
 * mdt.CreateFromSurface(mesh, 0);
 *
 * for (var i = 0; i < mdt.GetVertexCount(); i++)
 *
 * {
 *
 *     Vector3 vertex = mdt.GetVertex(i);
 *
 *     // In this example we extend the mesh by one unit, which results in separated faces as it is flat shaded.
 *
 *     vertex += mdt.GetVertexNormal(i);
 *
 *     // Save your change.
 *
 *     mdt.SetVertex(i, vertex);
 *
 * }
 *
 * mesh.SurfaceRemove(0);
 *
 * mdt.CommitToSurface(mesh);
 *
 * var mi = new MeshInstance();
 *
 * mi.Mesh = mesh;
 *
 * AddChild(mi);
 *
 * [/csharp]
 *
 * [/codeblocks]
 *
 * See also [godot.ArrayMesh], [godot.ImmediateMesh] and [godot.SurfaceTool] for procedural geometry generation.
 *
 * **Note:** Godot uses clockwise [winding order](https://learnopengl.com/Advanced-OpenGL/Face-culling) for front faces of triangle primitive modes.
 */
@GodotBaseType
public open class MeshDataTool : RefCounted() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_MESHDATATOOL)
  }

  /**
   * Clears all data currently in MeshDataTool.
   */
  public open fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHDATATOOL_CLEAR, NIL)
  }

  /**
   * Uses specified surface of given [godot.Mesh] to populate data for MeshDataTool.
   *
   * Requires [godot.Mesh] with primitive type [godot.Mesh.PRIMITIVE_TRIANGLES].
   */
  public open fun createFromSurface(mesh: ArrayMesh, surface: Long): GodotError {
    TransferContext.writeArguments(OBJECT to mesh, LONG to surface)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHDATATOOL_CREATE_FROM_SURFACE,
        LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Adds a new surface to specified [godot.Mesh] with edited data.
   */
  public open fun commitToSurface(mesh: ArrayMesh): GodotError {
    TransferContext.writeArguments(OBJECT to mesh)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHDATATOOL_COMMIT_TO_SURFACE,
        LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns the [godot.Mesh]'s format. Format is an integer made up of [godot.Mesh] format flags combined together. For example, a mesh containing both vertices and normals would return a format of `3` because [godot.Mesh.ARRAY_FORMAT_VERTEX] is `1` and [godot.Mesh.ARRAY_FORMAT_NORMAL] is `2`.
   *
   * See [enum Mesh.ArrayFormat] for a list of format flags.
   */
  public open fun getFormat(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHDATATOOL_GET_FORMAT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the total number of vertices in [godot.Mesh].
   */
  public open fun getVertexCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHDATATOOL_GET_VERTEX_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the number of edges in this [godot.Mesh].
   */
  public open fun getEdgeCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHDATATOOL_GET_EDGE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the number of faces in this [godot.Mesh].
   */
  public open fun getFaceCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHDATATOOL_GET_FACE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Sets the position of the given vertex.
   */
  public open fun setVertex(idx: Long, vertex: Vector3): Unit {
    TransferContext.writeArguments(LONG to idx, VECTOR3 to vertex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHDATATOOL_SET_VERTEX, NIL)
  }

  /**
   * Returns the vertex at given index.
   */
  public open fun getVertex(idx: Long): Vector3 {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHDATATOOL_GET_VERTEX, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Sets the normal of the given vertex.
   */
  public open fun setVertexNormal(idx: Long, normal: Vector3): Unit {
    TransferContext.writeArguments(LONG to idx, VECTOR3 to normal)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHDATATOOL_SET_VERTEX_NORMAL, NIL)
  }

  /**
   * Returns the normal of the given vertex.
   */
  public open fun getVertexNormal(idx: Long): Vector3 {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHDATATOOL_GET_VERTEX_NORMAL,
        VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Sets the tangent of the given vertex.
   */
  public open fun setVertexTangent(idx: Long, tangent: Plane): Unit {
    TransferContext.writeArguments(LONG to idx, PLANE to tangent)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHDATATOOL_SET_VERTEX_TANGENT,
        NIL)
  }

  /**
   * Returns the tangent of the given vertex.
   */
  public open fun getVertexTangent(idx: Long): Plane {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHDATATOOL_GET_VERTEX_TANGENT,
        PLANE)
    return TransferContext.readReturnValue(PLANE, false) as Plane
  }

  /**
   * Sets the UV of the given vertex.
   */
  public open fun setVertexUv(idx: Long, uv: Vector2): Unit {
    TransferContext.writeArguments(LONG to idx, VECTOR2 to uv)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHDATATOOL_SET_VERTEX_UV, NIL)
  }

  /**
   * Returns the UV of the given vertex.
   */
  public open fun getVertexUv(idx: Long): Vector2 {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHDATATOOL_GET_VERTEX_UV, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Sets the UV2 of the given vertex.
   */
  public open fun setVertexUv2(idx: Long, uv2: Vector2): Unit {
    TransferContext.writeArguments(LONG to idx, VECTOR2 to uv2)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHDATATOOL_SET_VERTEX_UV2, NIL)
  }

  /**
   * Returns the UV2 of the given vertex.
   */
  public open fun getVertexUv2(idx: Long): Vector2 {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHDATATOOL_GET_VERTEX_UV2,
        VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Sets the color of the given vertex.
   */
  public open fun setVertexColor(idx: Long, color: Color): Unit {
    TransferContext.writeArguments(LONG to idx, COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHDATATOOL_SET_VERTEX_COLOR, NIL)
  }

  /**
   * Returns the color of the given vertex.
   */
  public open fun getVertexColor(idx: Long): Color {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHDATATOOL_GET_VERTEX_COLOR,
        COLOR)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  /**
   * Sets the bones of the given vertex.
   */
  public open fun setVertexBones(idx: Long, bones: PackedInt32Array): Unit {
    TransferContext.writeArguments(LONG to idx, PACKED_INT_32_ARRAY to bones)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHDATATOOL_SET_VERTEX_BONES, NIL)
  }

  /**
   * Returns the bones of the given vertex.
   */
  public open fun getVertexBones(idx: Long): PackedInt32Array {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHDATATOOL_GET_VERTEX_BONES,
        PACKED_INT_32_ARRAY)
    return TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array
  }

  /**
   * Sets the bone weights of the given vertex.
   */
  public open fun setVertexWeights(idx: Long, weights: PackedFloat32Array): Unit {
    TransferContext.writeArguments(LONG to idx, PACKED_FLOAT_32_ARRAY to weights)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHDATATOOL_SET_VERTEX_WEIGHTS,
        NIL)
  }

  /**
   * Returns bone weights of the given vertex.
   */
  public open fun getVertexWeights(idx: Long): PackedFloat32Array {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHDATATOOL_GET_VERTEX_WEIGHTS,
        PACKED_FLOAT_32_ARRAY)
    return TransferContext.readReturnValue(PACKED_FLOAT_32_ARRAY, false) as PackedFloat32Array
  }

  /**
   * Sets the metadata associated with the given vertex.
   */
  public open fun setVertexMeta(idx: Long, meta: Any): Unit {
    TransferContext.writeArguments(LONG to idx, ANY to meta)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHDATATOOL_SET_VERTEX_META, NIL)
  }

  /**
   * Returns the metadata associated with the given vertex.
   */
  public open fun getVertexMeta(idx: Long): Any? {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHDATATOOL_GET_VERTEX_META, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Returns an array of edges that share the given vertex.
   */
  public open fun getVertexEdges(idx: Long): PackedInt32Array {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHDATATOOL_GET_VERTEX_EDGES,
        PACKED_INT_32_ARRAY)
    return TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array
  }

  /**
   * Returns an array of faces that share the given vertex.
   */
  public open fun getVertexFaces(idx: Long): PackedInt32Array {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHDATATOOL_GET_VERTEX_FACES,
        PACKED_INT_32_ARRAY)
    return TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array
  }

  /**
   * Returns index of specified vertex connected to given edge.
   *
   * Vertex argument can only be 0 or 1 because edges are comprised of two vertices.
   */
  public open fun getEdgeVertex(idx: Long, vertex: Long): Long {
    TransferContext.writeArguments(LONG to idx, LONG to vertex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHDATATOOL_GET_EDGE_VERTEX, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns array of faces that touch given edge.
   */
  public open fun getEdgeFaces(idx: Long): PackedInt32Array {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHDATATOOL_GET_EDGE_FACES,
        PACKED_INT_32_ARRAY)
    return TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array
  }

  /**
   * Sets the metadata of the given edge.
   */
  public open fun setEdgeMeta(idx: Long, meta: Any): Unit {
    TransferContext.writeArguments(LONG to idx, ANY to meta)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHDATATOOL_SET_EDGE_META, NIL)
  }

  /**
   * Returns meta information assigned to given edge.
   */
  public open fun getEdgeMeta(idx: Long): Any? {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHDATATOOL_GET_EDGE_META, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Returns the specified vertex of the given face.
   *
   * Vertex argument must be either 0, 1, or 2 because faces contain three vertices.
   */
  public open fun getFaceVertex(idx: Long, vertex: Long): Long {
    TransferContext.writeArguments(LONG to idx, LONG to vertex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHDATATOOL_GET_FACE_VERTEX, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns specified edge associated with given face.
   *
   * Edge argument must be either 0, 1, or 2 because a face only has three edges.
   */
  public open fun getFaceEdge(idx: Long, edge: Long): Long {
    TransferContext.writeArguments(LONG to idx, LONG to edge)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHDATATOOL_GET_FACE_EDGE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Sets the metadata of the given face.
   */
  public open fun setFaceMeta(idx: Long, meta: Any): Unit {
    TransferContext.writeArguments(LONG to idx, ANY to meta)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHDATATOOL_SET_FACE_META, NIL)
  }

  /**
   * Returns the metadata associated with the given face.
   */
  public open fun getFaceMeta(idx: Long): Any? {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHDATATOOL_GET_FACE_META, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Calculates and returns the face normal of the given face.
   */
  public open fun getFaceNormal(idx: Long): Vector3 {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHDATATOOL_GET_FACE_NORMAL,
        VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Sets the material to be used by newly-constructed [godot.Mesh].
   */
  public open fun setMaterial(material: Material): Unit {
    TransferContext.writeArguments(OBJECT to material)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHDATATOOL_SET_MATERIAL, NIL)
  }

  /**
   * Returns the material assigned to the [godot.Mesh].
   */
  public open fun getMaterial(): Material? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHDATATOOL_GET_MATERIAL, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Material?
  }

  public companion object
}
