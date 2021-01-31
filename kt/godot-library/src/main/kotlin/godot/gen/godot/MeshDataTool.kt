// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.Color
import godot.core.GodotError
import godot.core.Plane
import godot.core.PoolIntArray
import godot.core.PoolRealArray
import godot.core.TransferContext
import godot.core.VariantType.ANY
import godot.core.VariantType.COLOR
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PLANE
import godot.core.VariantType.POOL_INT_ARRAY
import godot.core.VariantType.POOL_REAL_ARRAY
import godot.core.VariantType.VECTOR2
import godot.core.VariantType.VECTOR3
import godot.core.Vector2
import godot.core.Vector3
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
open class MeshDataTool : Reference() {
  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_MESHDATATOOL)

  open fun clear() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHDATATOOL_CLEAR, NIL)
  }

  open fun commitToSurface(mesh: ArrayMesh): GodotError {
    TransferContext.writeArguments(OBJECT to mesh)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHDATATOOL_COMMIT_TO_SURFACE,
        LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun createFromSurface(mesh: ArrayMesh, surface: Long): GodotError {
    TransferContext.writeArguments(OBJECT to mesh, LONG to surface)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHDATATOOL_CREATE_FROM_SURFACE,
        LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun getEdgeCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHDATATOOL_GET_EDGE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getEdgeFaces(idx: Long): PoolIntArray {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHDATATOOL_GET_EDGE_FACES,
        POOL_INT_ARRAY)
    return TransferContext.readReturnValue(POOL_INT_ARRAY, false) as PoolIntArray
  }

  open fun getEdgeMeta(idx: Long): Any? {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHDATATOOL_GET_EDGE_META, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  open fun getEdgeVertex(idx: Long, vertex: Long): Long {
    TransferContext.writeArguments(LONG to idx, LONG to vertex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHDATATOOL_GET_EDGE_VERTEX, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getFaceCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHDATATOOL_GET_FACE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getFaceEdge(idx: Long, edge: Long): Long {
    TransferContext.writeArguments(LONG to idx, LONG to edge)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHDATATOOL_GET_FACE_EDGE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getFaceMeta(idx: Long): Any? {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHDATATOOL_GET_FACE_META, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  open fun getFaceNormal(idx: Long): Vector3 {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHDATATOOL_GET_FACE_NORMAL,
        VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  open fun getFaceVertex(idx: Long, vertex: Long): Long {
    TransferContext.writeArguments(LONG to idx, LONG to vertex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHDATATOOL_GET_FACE_VERTEX, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getFormat(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHDATATOOL_GET_FORMAT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getMaterial(): Material? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHDATATOOL_GET_MATERIAL, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Material?
  }

  open fun getVertex(idx: Long): Vector3 {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHDATATOOL_GET_VERTEX, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  open fun getVertexBones(idx: Long): PoolIntArray {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHDATATOOL_GET_VERTEX_BONES,
        POOL_INT_ARRAY)
    return TransferContext.readReturnValue(POOL_INT_ARRAY, false) as PoolIntArray
  }

  open fun getVertexColor(idx: Long): Color {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHDATATOOL_GET_VERTEX_COLOR,
        COLOR)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  open fun getVertexCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHDATATOOL_GET_VERTEX_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getVertexEdges(idx: Long): PoolIntArray {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHDATATOOL_GET_VERTEX_EDGES,
        POOL_INT_ARRAY)
    return TransferContext.readReturnValue(POOL_INT_ARRAY, false) as PoolIntArray
  }

  open fun getVertexFaces(idx: Long): PoolIntArray {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHDATATOOL_GET_VERTEX_FACES,
        POOL_INT_ARRAY)
    return TransferContext.readReturnValue(POOL_INT_ARRAY, false) as PoolIntArray
  }

  open fun getVertexMeta(idx: Long): Any? {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHDATATOOL_GET_VERTEX_META, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  open fun getVertexNormal(idx: Long): Vector3 {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHDATATOOL_GET_VERTEX_NORMAL,
        VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  open fun getVertexTangent(idx: Long): Plane {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHDATATOOL_GET_VERTEX_TANGENT,
        PLANE)
    return TransferContext.readReturnValue(PLANE, false) as Plane
  }

  open fun getVertexUv(idx: Long): Vector2 {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHDATATOOL_GET_VERTEX_UV, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  open fun getVertexUv2(idx: Long): Vector2 {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHDATATOOL_GET_VERTEX_UV2,
        VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  open fun getVertexWeights(idx: Long): PoolRealArray {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHDATATOOL_GET_VERTEX_WEIGHTS,
        POOL_REAL_ARRAY)
    return TransferContext.readReturnValue(POOL_REAL_ARRAY, false) as PoolRealArray
  }

  open fun setEdgeMeta(idx: Long, meta: Any) {
    TransferContext.writeArguments(LONG to idx, ANY to meta)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHDATATOOL_SET_EDGE_META, NIL)
  }

  open fun setFaceMeta(idx: Long, meta: Any) {
    TransferContext.writeArguments(LONG to idx, ANY to meta)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHDATATOOL_SET_FACE_META, NIL)
  }

  open fun setMaterial(material: Material) {
    TransferContext.writeArguments(OBJECT to material)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHDATATOOL_SET_MATERIAL, NIL)
  }

  open fun setVertex(idx: Long, vertex: Vector3) {
    TransferContext.writeArguments(LONG to idx, VECTOR3 to vertex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHDATATOOL_SET_VERTEX, NIL)
  }

  open fun setVertexBones(idx: Long, bones: PoolIntArray) {
    TransferContext.writeArguments(LONG to idx, POOL_INT_ARRAY to bones)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHDATATOOL_SET_VERTEX_BONES, NIL)
  }

  open fun setVertexColor(idx: Long, color: Color) {
    TransferContext.writeArguments(LONG to idx, COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHDATATOOL_SET_VERTEX_COLOR, NIL)
  }

  open fun setVertexMeta(idx: Long, meta: Any) {
    TransferContext.writeArguments(LONG to idx, ANY to meta)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHDATATOOL_SET_VERTEX_META, NIL)
  }

  open fun setVertexNormal(idx: Long, normal: Vector3) {
    TransferContext.writeArguments(LONG to idx, VECTOR3 to normal)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHDATATOOL_SET_VERTEX_NORMAL, NIL)
  }

  open fun setVertexTangent(idx: Long, tangent: Plane) {
    TransferContext.writeArguments(LONG to idx, PLANE to tangent)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHDATATOOL_SET_VERTEX_TANGENT,
        NIL)
  }

  open fun setVertexUv(idx: Long, uv: Vector2) {
    TransferContext.writeArguments(LONG to idx, VECTOR2 to uv)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHDATATOOL_SET_VERTEX_UV, NIL)
  }

  open fun setVertexUv2(idx: Long, uv2: Vector2) {
    TransferContext.writeArguments(LONG to idx, VECTOR2 to uv2)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHDATATOOL_SET_VERTEX_UV2, NIL)
  }

  open fun setVertexWeights(idx: Long, weights: PoolRealArray) {
    TransferContext.writeArguments(LONG to idx, POOL_REAL_ARRAY to weights)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHDATATOOL_SET_VERTEX_WEIGHTS,
        NIL)
  }

  companion object
}
