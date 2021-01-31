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
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class SurfaceTool : Reference() {
  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_SURFACETOOL)

  open fun addBones(bones: PoolIntArray) {
    TransferContext.writeArguments(POOL_INT_ARRAY to bones)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SURFACETOOL_ADD_BONES, NIL)
  }

  open fun addColor(color: Color) {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SURFACETOOL_ADD_COLOR, NIL)
  }

  open fun addIndex(index: Long) {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SURFACETOOL_ADD_INDEX, NIL)
  }

  open fun addNormal(normal: Vector3) {
    TransferContext.writeArguments(VECTOR3 to normal)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SURFACETOOL_ADD_NORMAL, NIL)
  }

  open fun addSmoothGroup(smooth: Boolean) {
    TransferContext.writeArguments(BOOL to smooth)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SURFACETOOL_ADD_SMOOTH_GROUP, NIL)
  }

  open fun addTangent(tangent: Plane) {
    TransferContext.writeArguments(PLANE to tangent)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SURFACETOOL_ADD_TANGENT, NIL)
  }

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

  open fun addUv(uv: Vector2) {
    TransferContext.writeArguments(VECTOR2 to uv)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SURFACETOOL_ADD_UV, NIL)
  }

  open fun addUv2(uv2: Vector2) {
    TransferContext.writeArguments(VECTOR2 to uv2)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SURFACETOOL_ADD_UV2, NIL)
  }

  open fun addVertex(vertex: Vector3) {
    TransferContext.writeArguments(VECTOR3 to vertex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SURFACETOOL_ADD_VERTEX, NIL)
  }

  open fun addWeights(weights: PoolRealArray) {
    TransferContext.writeArguments(POOL_REAL_ARRAY to weights)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SURFACETOOL_ADD_WEIGHTS, NIL)
  }

  open fun appendFrom(
    existing: Mesh,
    surface: Long,
    transform: Transform
  ) {
    TransferContext.writeArguments(OBJECT to existing, LONG to surface, TRANSFORM to transform)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SURFACETOOL_APPEND_FROM, NIL)
  }

  open fun begin(primitive: Long) {
    TransferContext.writeArguments(LONG to primitive)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SURFACETOOL_BEGIN, NIL)
  }

  open fun clear() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SURFACETOOL_CLEAR, NIL)
  }

  open fun commit(existing: ArrayMesh? = null, flags: Long = 97280): ArrayMesh? {
    TransferContext.writeArguments(OBJECT to existing, LONG to flags)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SURFACETOOL_COMMIT, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as ArrayMesh?
  }

  open fun commitToArrays(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SURFACETOOL_COMMIT_TO_ARRAYS, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  open fun createFrom(existing: Mesh, surface: Long) {
    TransferContext.writeArguments(OBJECT to existing, LONG to surface)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SURFACETOOL_CREATE_FROM, NIL)
  }

  open fun createFromBlendShape(
    existing: Mesh,
    surface: Long,
    blendShape: String
  ) {
    TransferContext.writeArguments(OBJECT to existing, LONG to surface, STRING to blendShape)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SURFACETOOL_CREATE_FROM_BLEND_SHAPE,
        NIL)
  }

  open fun deindex() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SURFACETOOL_DEINDEX, NIL)
  }

  open fun generateNormals(flip: Boolean = false) {
    TransferContext.writeArguments(BOOL to flip)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SURFACETOOL_GENERATE_NORMALS, NIL)
  }

  open fun generateTangents() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SURFACETOOL_GENERATE_TANGENTS, NIL)
  }

  open fun index() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SURFACETOOL_INDEX, NIL)
  }

  open fun setMaterial(material: Material) {
    TransferContext.writeArguments(OBJECT to material)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SURFACETOOL_SET_MATERIAL, NIL)
  }
}
