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
import godot.core.Color
import godot.core.Error
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
import kotlin.Any
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

private const val ENGINECLASS_MESHDATATOOL: Int = 368

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
    createNativeObject(ENGINECLASS_MESHDATATOOL, scriptIndex)
  }

  /**
   * Clears all data currently in MeshDataTool.
   */
  public final fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.clearPtr, NIL)
  }

  /**
   * Uses specified surface of given [Mesh] to populate data for MeshDataTool.
   * Requires [Mesh] with primitive type [Mesh.PRIMITIVE_TRIANGLES].
   */
  public final fun createFromSurface(mesh: ArrayMesh?, surface: Int): Error {
    TransferContext.writeArguments(OBJECT to mesh, LONG to surface.toLong())
    TransferContext.callMethod(ptr, MethodBindings.createFromSurfacePtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Adds a new surface to specified [Mesh] with edited data.
   */
  @JvmOverloads
  public final fun commitToSurface(mesh: ArrayMesh?, compressionFlags: Long = 0): Error {
    TransferContext.writeArguments(OBJECT to mesh, LONG to compressionFlags)
    TransferContext.callMethod(ptr, MethodBindings.commitToSurfacePtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the [Mesh]'s format as a combination of the [Mesh.ArrayFormat] flags. For example, a
   * mesh containing both vertices and normals would return a format of `3` because
   * [Mesh.ARRAY_FORMAT_VERTEX] is `1` and [Mesh.ARRAY_FORMAT_NORMAL] is `2`.
   */
  public final fun getFormat(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFormatPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the total number of vertices in [Mesh].
   */
  public final fun getVertexCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getVertexCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the number of edges in this [Mesh].
   */
  public final fun getEdgeCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getEdgeCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the number of faces in this [Mesh].
   */
  public final fun getFaceCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFaceCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Sets the position of the given vertex.
   */
  public final fun setVertex(idx: Int, vertex: Vector3): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), VECTOR3 to vertex)
    TransferContext.callMethod(ptr, MethodBindings.setVertexPtr, NIL)
  }

  /**
   * Returns the position of the given vertex.
   */
  public final fun getVertex(idx: Int): Vector3 {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getVertexPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Sets the normal of the given vertex.
   */
  public final fun setVertexNormal(idx: Int, normal: Vector3): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), VECTOR3 to normal)
    TransferContext.callMethod(ptr, MethodBindings.setVertexNormalPtr, NIL)
  }

  /**
   * Returns the normal of the given vertex.
   */
  public final fun getVertexNormal(idx: Int): Vector3 {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getVertexNormalPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Sets the tangent of the given vertex.
   */
  public final fun setVertexTangent(idx: Int, tangent: Plane): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), PLANE to tangent)
    TransferContext.callMethod(ptr, MethodBindings.setVertexTangentPtr, NIL)
  }

  /**
   * Returns the tangent of the given vertex.
   */
  public final fun getVertexTangent(idx: Int): Plane {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getVertexTangentPtr, PLANE)
    return (TransferContext.readReturnValue(PLANE) as Plane)
  }

  /**
   * Sets the UV of the given vertex.
   */
  public final fun setVertexUv(idx: Int, uv: Vector2): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), VECTOR2 to uv)
    TransferContext.callMethod(ptr, MethodBindings.setVertexUvPtr, NIL)
  }

  /**
   * Returns the UV of the given vertex.
   */
  public final fun getVertexUv(idx: Int): Vector2 {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getVertexUvPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Sets the UV2 of the given vertex.
   */
  public final fun setVertexUv2(idx: Int, uv2: Vector2): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), VECTOR2 to uv2)
    TransferContext.callMethod(ptr, MethodBindings.setVertexUv2Ptr, NIL)
  }

  /**
   * Returns the UV2 of the given vertex.
   */
  public final fun getVertexUv2(idx: Int): Vector2 {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getVertexUv2Ptr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Sets the color of the given vertex.
   */
  public final fun setVertexColor(idx: Int, color: Color): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), COLOR to color)
    TransferContext.callMethod(ptr, MethodBindings.setVertexColorPtr, NIL)
  }

  /**
   * Returns the color of the given vertex.
   */
  public final fun getVertexColor(idx: Int): Color {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getVertexColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  /**
   * Sets the bones of the given vertex.
   */
  public final fun setVertexBones(idx: Int, bones: PackedInt32Array): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), PACKED_INT_32_ARRAY to bones)
    TransferContext.callMethod(ptr, MethodBindings.setVertexBonesPtr, NIL)
  }

  /**
   * Returns the bones of the given vertex.
   */
  public final fun getVertexBones(idx: Int): PackedInt32Array {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getVertexBonesPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY) as PackedInt32Array)
  }

  /**
   * Sets the bone weights of the given vertex.
   */
  public final fun setVertexWeights(idx: Int, weights: PackedFloat32Array): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), PACKED_FLOAT_32_ARRAY to weights)
    TransferContext.callMethod(ptr, MethodBindings.setVertexWeightsPtr, NIL)
  }

  /**
   * Returns bone weights of the given vertex.
   */
  public final fun getVertexWeights(idx: Int): PackedFloat32Array {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getVertexWeightsPtr, PACKED_FLOAT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_FLOAT_32_ARRAY) as PackedFloat32Array)
  }

  /**
   * Sets the metadata associated with the given vertex.
   */
  public final fun setVertexMeta(idx: Int, meta: Any?): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), ANY to meta)
    TransferContext.callMethod(ptr, MethodBindings.setVertexMetaPtr, NIL)
  }

  /**
   * Returns the metadata associated with the given vertex.
   */
  public final fun getVertexMeta(idx: Int): Any? {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getVertexMetaPtr, ANY)
    return (TransferContext.readReturnValue(ANY) as Any?)
  }

  /**
   * Returns an array of edges that share the given vertex.
   */
  public final fun getVertexEdges(idx: Int): PackedInt32Array {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getVertexEdgesPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY) as PackedInt32Array)
  }

  /**
   * Returns an array of faces that share the given vertex.
   */
  public final fun getVertexFaces(idx: Int): PackedInt32Array {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getVertexFacesPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY) as PackedInt32Array)
  }

  /**
   * Returns index of specified vertex connected to given edge.
   * Vertex argument can only be 0 or 1 because edges are comprised of two vertices.
   */
  public final fun getEdgeVertex(idx: Int, vertex: Int): Int {
    TransferContext.writeArguments(LONG to idx.toLong(), LONG to vertex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getEdgeVertexPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns array of faces that touch given edge.
   */
  public final fun getEdgeFaces(idx: Int): PackedInt32Array {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getEdgeFacesPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY) as PackedInt32Array)
  }

  /**
   * Sets the metadata of the given edge.
   */
  public final fun setEdgeMeta(idx: Int, meta: Any?): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), ANY to meta)
    TransferContext.callMethod(ptr, MethodBindings.setEdgeMetaPtr, NIL)
  }

  /**
   * Returns meta information assigned to given edge.
   */
  public final fun getEdgeMeta(idx: Int): Any? {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getEdgeMetaPtr, ANY)
    return (TransferContext.readReturnValue(ANY) as Any?)
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
    TransferContext.writeArguments(LONG to idx.toLong(), LONG to vertex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getFaceVertexPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns specified edge associated with given face.
   * Edge argument must be either 0, 1, or 2 because a face only has three edges.
   */
  public final fun getFaceEdge(idx: Int, edge: Int): Int {
    TransferContext.writeArguments(LONG to idx.toLong(), LONG to edge.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getFaceEdgePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Sets the metadata of the given face.
   */
  public final fun setFaceMeta(idx: Int, meta: Any?): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), ANY to meta)
    TransferContext.callMethod(ptr, MethodBindings.setFaceMetaPtr, NIL)
  }

  /**
   * Returns the metadata associated with the given face.
   */
  public final fun getFaceMeta(idx: Int): Any? {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getFaceMetaPtr, ANY)
    return (TransferContext.readReturnValue(ANY) as Any?)
  }

  /**
   * Calculates and returns the face normal of the given face.
   */
  public final fun getFaceNormal(idx: Int): Vector3 {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getFaceNormalPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Sets the material to be used by newly-constructed [Mesh].
   */
  public final fun setMaterial(material: Material?): Unit {
    TransferContext.writeArguments(OBJECT to material)
    TransferContext.callMethod(ptr, MethodBindings.setMaterialPtr, NIL)
  }

  /**
   * Returns the material assigned to the [Mesh].
   */
  public final fun getMaterial(): Material? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMaterialPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Material?)
  }

  public companion object

  public object MethodBindings {
    internal val clearPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "clear", 3218959716)

    internal val createFromSurfacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "create_from_surface", 2727020678)

    internal val commitToSurfacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "commit_to_surface", 2021686445)

    internal val getFormatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "get_format", 3905245786)

    internal val getVertexCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "get_vertex_count", 3905245786)

    internal val getEdgeCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "get_edge_count", 3905245786)

    internal val getFaceCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "get_face_count", 3905245786)

    internal val setVertexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "set_vertex", 1530502735)

    internal val getVertexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "get_vertex", 711720468)

    internal val setVertexNormalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "set_vertex_normal", 1530502735)

    internal val getVertexNormalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "get_vertex_normal", 711720468)

    internal val setVertexTangentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "set_vertex_tangent", 1104099133)

    internal val getVertexTangentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "get_vertex_tangent", 1372055458)

    internal val setVertexUvPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "set_vertex_uv", 163021252)

    internal val getVertexUvPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "get_vertex_uv", 2299179447)

    internal val setVertexUv2Ptr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "set_vertex_uv2", 163021252)

    internal val getVertexUv2Ptr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "get_vertex_uv2", 2299179447)

    internal val setVertexColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "set_vertex_color", 2878471219)

    internal val getVertexColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "get_vertex_color", 3457211756)

    internal val setVertexBonesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "set_vertex_bones", 3500328261)

    internal val getVertexBonesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "get_vertex_bones", 1706082319)

    internal val setVertexWeightsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "set_vertex_weights", 1345852415)

    internal val getVertexWeightsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "get_vertex_weights", 1542882410)

    internal val setVertexMetaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "set_vertex_meta", 2152698145)

    internal val getVertexMetaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "get_vertex_meta", 4227898402)

    internal val getVertexEdgesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "get_vertex_edges", 1706082319)

    internal val getVertexFacesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "get_vertex_faces", 1706082319)

    internal val getEdgeVertexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "get_edge_vertex", 3175239445)

    internal val getEdgeFacesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "get_edge_faces", 1706082319)

    internal val setEdgeMetaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "set_edge_meta", 2152698145)

    internal val getEdgeMetaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "get_edge_meta", 4227898402)

    internal val getFaceVertexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "get_face_vertex", 3175239445)

    internal val getFaceEdgePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "get_face_edge", 3175239445)

    internal val setFaceMetaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "set_face_meta", 2152698145)

    internal val getFaceMetaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "get_face_meta", 4227898402)

    internal val getFaceNormalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "get_face_normal", 711720468)

    internal val setMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "set_material", 2757459619)

    internal val getMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "get_material", 5934680)
  }
}
