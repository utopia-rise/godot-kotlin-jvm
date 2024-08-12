// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.GodotError
import godot.core.PackedFloat32Array
import godot.core.PackedInt32Array
import godot.core.Plane
import godot.core.TypeManager
import godot.core.VariantType.ANY
import godot.core.VariantType.COLOR
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
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

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
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_MESHDATATOOL, scriptIndex)
    return true
  }

  /**
   * Clears all data currently in MeshDataTool.
   */
  public fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearPtr, NIL)
  }

  /**
   * Uses specified surface of given [Mesh] to populate data for MeshDataTool.
   * Requires [Mesh] with primitive type [Mesh.PRIMITIVE_TRIANGLES].
   */
  public fun createFromSurface(mesh: ArrayMesh, surface: Int): GodotError {
    TransferContext.writeArguments(OBJECT to mesh, LONG to surface.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.createFromSurfacePtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Adds a new surface to specified [Mesh] with edited data.
   */
  @JvmOverloads
  public fun commitToSurface(mesh: ArrayMesh, compressionFlags: Long = 0): GodotError {
    TransferContext.writeArguments(OBJECT to mesh, LONG to compressionFlags)
    TransferContext.callMethod(rawPtr, MethodBindings.commitToSurfacePtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the [Mesh]'s format. Format is an integer made up of [Mesh] format flags combined
   * together. For example, a mesh containing both vertices and normals would return a format of `3`
   * because [Mesh.ARRAY_FORMAT_VERTEX] is `1` and [Mesh.ARRAY_FORMAT_NORMAL] is `2`.
   * See [Mesh.ArrayFormat] for a list of format flags.
   */
  public fun getFormat(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFormatPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Returns the total number of vertices in [Mesh].
   */
  public fun getVertexCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getVertexCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the number of edges in this [Mesh].
   */
  public fun getEdgeCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getEdgeCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the number of faces in this [Mesh].
   */
  public fun getFaceCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFaceCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Sets the position of the given vertex.
   */
  public fun setVertex(idx: Int, vertex: Vector3): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), VECTOR3 to vertex)
    TransferContext.callMethod(rawPtr, MethodBindings.setVertexPtr, NIL)
  }

  /**
   * Returns the position of the given vertex.
   */
  public fun getVertex(idx: Int): Vector3 {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getVertexPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  /**
   * Sets the normal of the given vertex.
   */
  public fun setVertexNormal(idx: Int, normal: Vector3): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), VECTOR3 to normal)
    TransferContext.callMethod(rawPtr, MethodBindings.setVertexNormalPtr, NIL)
  }

  /**
   * Returns the normal of the given vertex.
   */
  public fun getVertexNormal(idx: Int): Vector3 {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getVertexNormalPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  /**
   * Sets the tangent of the given vertex.
   */
  public fun setVertexTangent(idx: Int, tangent: Plane): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), PLANE to tangent)
    TransferContext.callMethod(rawPtr, MethodBindings.setVertexTangentPtr, NIL)
  }

  /**
   * Returns the tangent of the given vertex.
   */
  public fun getVertexTangent(idx: Int): Plane {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getVertexTangentPtr, PLANE)
    return (TransferContext.readReturnValue(PLANE, false) as Plane)
  }

  /**
   * Sets the UV of the given vertex.
   */
  public fun setVertexUv(idx: Int, uv: Vector2): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), VECTOR2 to uv)
    TransferContext.callMethod(rawPtr, MethodBindings.setVertexUvPtr, NIL)
  }

  /**
   * Returns the UV of the given vertex.
   */
  public fun getVertexUv(idx: Int): Vector2 {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getVertexUvPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Sets the UV2 of the given vertex.
   */
  public fun setVertexUv2(idx: Int, uv2: Vector2): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), VECTOR2 to uv2)
    TransferContext.callMethod(rawPtr, MethodBindings.setVertexUv2Ptr, NIL)
  }

  /**
   * Returns the UV2 of the given vertex.
   */
  public fun getVertexUv2(idx: Int): Vector2 {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getVertexUv2Ptr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Sets the color of the given vertex.
   */
  public fun setVertexColor(idx: Int, color: Color): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.setVertexColorPtr, NIL)
  }

  /**
   * Returns the color of the given vertex.
   */
  public fun getVertexColor(idx: Int): Color {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getVertexColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR, false) as Color)
  }

  /**
   * Sets the bones of the given vertex.
   */
  public fun setVertexBones(idx: Int, bones: PackedInt32Array): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), PACKED_INT_32_ARRAY to bones)
    TransferContext.callMethod(rawPtr, MethodBindings.setVertexBonesPtr, NIL)
  }

  /**
   * Returns the bones of the given vertex.
   */
  public fun getVertexBones(idx: Int): PackedInt32Array {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getVertexBonesPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  /**
   * Sets the bone weights of the given vertex.
   */
  public fun setVertexWeights(idx: Int, weights: PackedFloat32Array): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), PACKED_FLOAT_32_ARRAY to weights)
    TransferContext.callMethod(rawPtr, MethodBindings.setVertexWeightsPtr, NIL)
  }

  /**
   * Returns bone weights of the given vertex.
   */
  public fun getVertexWeights(idx: Int): PackedFloat32Array {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getVertexWeightsPtr, PACKED_FLOAT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_FLOAT_32_ARRAY, false) as PackedFloat32Array)
  }

  /**
   * Sets the metadata associated with the given vertex.
   */
  public fun setVertexMeta(idx: Int, meta: Any?): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), ANY to meta)
    TransferContext.callMethod(rawPtr, MethodBindings.setVertexMetaPtr, NIL)
  }

  /**
   * Returns the metadata associated with the given vertex.
   */
  public fun getVertexMeta(idx: Int): Any? {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getVertexMetaPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  /**
   * Returns an array of edges that share the given vertex.
   */
  public fun getVertexEdges(idx: Int): PackedInt32Array {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getVertexEdgesPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  /**
   * Returns an array of faces that share the given vertex.
   */
  public fun getVertexFaces(idx: Int): PackedInt32Array {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getVertexFacesPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  /**
   * Returns index of specified vertex connected to given edge.
   * Vertex argument can only be 0 or 1 because edges are comprised of two vertices.
   */
  public fun getEdgeVertex(idx: Int, vertex: Int): Int {
    TransferContext.writeArguments(LONG to idx.toLong(), LONG to vertex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getEdgeVertexPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns array of faces that touch given edge.
   */
  public fun getEdgeFaces(idx: Int): PackedInt32Array {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getEdgeFacesPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  /**
   * Sets the metadata of the given edge.
   */
  public fun setEdgeMeta(idx: Int, meta: Any?): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), ANY to meta)
    TransferContext.callMethod(rawPtr, MethodBindings.setEdgeMetaPtr, NIL)
  }

  /**
   * Returns meta information assigned to given edge.
   */
  public fun getEdgeMeta(idx: Int): Any? {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getEdgeMetaPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
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
  public fun getFaceVertex(idx: Int, vertex: Int): Int {
    TransferContext.writeArguments(LONG to idx.toLong(), LONG to vertex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getFaceVertexPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns specified edge associated with given face.
   * Edge argument must be either 0, 1, or 2 because a face only has three edges.
   */
  public fun getFaceEdge(idx: Int, edge: Int): Int {
    TransferContext.writeArguments(LONG to idx.toLong(), LONG to edge.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getFaceEdgePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Sets the metadata of the given face.
   */
  public fun setFaceMeta(idx: Int, meta: Any?): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), ANY to meta)
    TransferContext.callMethod(rawPtr, MethodBindings.setFaceMetaPtr, NIL)
  }

  /**
   * Returns the metadata associated with the given face.
   */
  public fun getFaceMeta(idx: Int): Any? {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getFaceMetaPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  /**
   * Calculates and returns the face normal of the given face.
   */
  public fun getFaceNormal(idx: Int): Vector3 {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getFaceNormalPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  /**
   * Sets the material to be used by newly-constructed [Mesh].
   */
  public fun setMaterial(material: Material): Unit {
    TransferContext.writeArguments(OBJECT to material)
    TransferContext.callMethod(rawPtr, MethodBindings.setMaterialPtr, NIL)
  }

  /**
   * Returns the material assigned to the [Mesh].
   */
  public fun getMaterial(): Material? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMaterialPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Material?)
  }

  public companion object

  internal object MethodBindings {
    public val clearPtr: VoidPtr = TypeManager.getMethodBindPtr("MeshDataTool", "clear")

    public val createFromSurfacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "create_from_surface")

    public val commitToSurfacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "commit_to_surface")

    public val getFormatPtr: VoidPtr = TypeManager.getMethodBindPtr("MeshDataTool", "get_format")

    public val getVertexCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "get_vertex_count")

    public val getEdgeCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "get_edge_count")

    public val getFaceCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "get_face_count")

    public val setVertexPtr: VoidPtr = TypeManager.getMethodBindPtr("MeshDataTool", "set_vertex")

    public val getVertexPtr: VoidPtr = TypeManager.getMethodBindPtr("MeshDataTool", "get_vertex")

    public val setVertexNormalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "set_vertex_normal")

    public val getVertexNormalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "get_vertex_normal")

    public val setVertexTangentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "set_vertex_tangent")

    public val getVertexTangentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "get_vertex_tangent")

    public val setVertexUvPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "set_vertex_uv")

    public val getVertexUvPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "get_vertex_uv")

    public val setVertexUv2Ptr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "set_vertex_uv2")

    public val getVertexUv2Ptr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "get_vertex_uv2")

    public val setVertexColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "set_vertex_color")

    public val getVertexColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "get_vertex_color")

    public val setVertexBonesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "set_vertex_bones")

    public val getVertexBonesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "get_vertex_bones")

    public val setVertexWeightsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "set_vertex_weights")

    public val getVertexWeightsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "get_vertex_weights")

    public val setVertexMetaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "set_vertex_meta")

    public val getVertexMetaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "get_vertex_meta")

    public val getVertexEdgesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "get_vertex_edges")

    public val getVertexFacesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "get_vertex_faces")

    public val getEdgeVertexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "get_edge_vertex")

    public val getEdgeFacesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "get_edge_faces")

    public val setEdgeMetaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "set_edge_meta")

    public val getEdgeMetaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "get_edge_meta")

    public val getFaceVertexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "get_face_vertex")

    public val getFaceEdgePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "get_face_edge")

    public val setFaceMetaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "set_face_meta")

    public val getFaceMetaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "get_face_meta")

    public val getFaceNormalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "get_face_normal")

    public val setMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "set_material")

    public val getMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshDataTool", "get_material")
  }
}
