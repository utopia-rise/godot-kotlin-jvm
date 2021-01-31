// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.Color
import godot.core.PoolVector3Array
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.POOL_VECTOR3_ARRAY
import godot.core.Vector2
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class EditorSpatialGizmo : SpatialGizmo() {
  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_EDITORSPATIALGIZMO)

  open fun addCollisionSegments(segments: PoolVector3Array) {
    TransferContext.writeArguments(POOL_VECTOR3_ARRAY to segments)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORSPATIALGIZMO_ADD_COLLISION_SEGMENTS, NIL)
  }

  open fun addCollisionTriangles(triangles: TriangleMesh) {
    TransferContext.writeArguments(OBJECT to triangles)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORSPATIALGIZMO_ADD_COLLISION_TRIANGLES, NIL)
  }

  open fun addHandles(
    handles: PoolVector3Array,
    material: Material,
    billboard: Boolean = false,
    secondary: Boolean = false
  ) {
    TransferContext.writeArguments(POOL_VECTOR3_ARRAY to handles, OBJECT to material, BOOL to
        billboard, BOOL to secondary)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORSPATIALGIZMO_ADD_HANDLES, NIL)
  }

  open fun addLines(
    lines: PoolVector3Array,
    material: Material,
    billboard: Boolean = false,
    modulate: Color = Color(1,1,1,1)
  ) {
    TransferContext.writeArguments(POOL_VECTOR3_ARRAY to lines, OBJECT to material, BOOL to
        billboard, COLOR to modulate)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORSPATIALGIZMO_ADD_LINES, NIL)
  }

  open fun addMesh(
    mesh: ArrayMesh,
    billboard: Boolean = false,
    skeleton: SkinReference? = null,
    material: Material? = null
  ) {
    TransferContext.writeArguments(OBJECT to mesh, BOOL to billboard, OBJECT to skeleton, OBJECT to
        material)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORSPATIALGIZMO_ADD_MESH, NIL)
  }

  open fun addUnscaledBillboard(
    material: Material,
    defaultScale: Double = 1.0,
    modulate: Color = Color(1,1,1,1)
  ) {
    TransferContext.writeArguments(OBJECT to material, DOUBLE to defaultScale, COLOR to modulate)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORSPATIALGIZMO_ADD_UNSCALED_BILLBOARD, NIL)
  }

  open fun clear() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORSPATIALGIZMO_CLEAR, NIL)
  }

  open fun commit_handle(
    index: Long,
    restore: Any,
    cancel: Boolean
  ) {
  }

  open fun get_handle_name(index: Long): String {
    throw NotImplementedError("get_handle_name is not implemented for EditorSpatialGizmo")
  }

  open fun get_handle_value(index: Long): Any? {
    throw NotImplementedError("get_handle_value is not implemented for EditorSpatialGizmo")
  }

  open fun getPlugin(): EditorSpatialGizmoPlugin? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORSPATIALGIZMO_GET_PLUGIN,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as EditorSpatialGizmoPlugin?
  }

  open fun getSpatialNode(): Spatial? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORSPATIALGIZMO_GET_SPATIAL_NODE,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Spatial?
  }

  open fun is_handle_highlighted(index: Long): Boolean {
    throw NotImplementedError("is_handle_highlighted is not implemented for EditorSpatialGizmo")
  }

  open fun redraw() {
  }

  open fun set_handle(
    index: Long,
    camera: Camera,
    point: Vector2
  ) {
  }

  open fun setHidden(hidden: Boolean) {
    TransferContext.writeArguments(BOOL to hidden)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORSPATIALGIZMO_SET_HIDDEN, NIL)
  }

  open fun setSpatialNode(node: Node) {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORSPATIALGIZMO_SET_SPATIAL_NODE,
        NIL)
  }
}
