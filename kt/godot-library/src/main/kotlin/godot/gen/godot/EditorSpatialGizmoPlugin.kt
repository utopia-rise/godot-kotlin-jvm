// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.Color
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.Vector2
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class EditorSpatialGizmoPlugin : Resource() {
  override fun __new(): VoidPtr =
      TransferContext.invokeConstructor(ENGINECLASS_EDITORSPATIALGIZMOPLUGIN)

  open fun addMaterial(name: String, material: SpatialMaterial) {
    TransferContext.writeArguments(STRING to name, OBJECT to material)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORSPATIALGIZMOPLUGIN_ADD_MATERIAL, NIL)
  }

  open fun _canBeHidden(): Boolean {
    throw NotImplementedError("can_be_hidden is not implemented for EditorSpatialGizmoPlugin")
  }

  open fun _commitHandle(
    gizmo: EditorSpatialGizmo,
    index: Long,
    restore: Any,
    cancel: Boolean
  ) {
  }

  open fun _createGizmo(spatial: Spatial): EditorSpatialGizmo? {
    throw NotImplementedError("create_gizmo is not implemented for EditorSpatialGizmoPlugin")
  }

  open fun createHandleMaterial(name: String, billboard: Boolean = false) {
    TransferContext.writeArguments(STRING to name, BOOL to billboard)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORSPATIALGIZMOPLUGIN_CREATE_HANDLE_MATERIAL, NIL)
  }

  open fun createIconMaterial(
    name: String,
    texture: Texture,
    onTop: Boolean = false,
    color: Color = Color(1,1,1,1)
  ) {
    TransferContext.writeArguments(STRING to name, OBJECT to texture, BOOL to onTop, COLOR to color)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORSPATIALGIZMOPLUGIN_CREATE_ICON_MATERIAL, NIL)
  }

  open fun createMaterial(
    name: String,
    color: Color,
    billboard: Boolean = false,
    onTop: Boolean = false,
    useVertexColor: Boolean = false
  ) {
    TransferContext.writeArguments(STRING to name, COLOR to color, BOOL to billboard, BOOL to onTop,
        BOOL to useVertexColor)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORSPATIALGIZMOPLUGIN_CREATE_MATERIAL, NIL)
  }

  open fun _getHandleName(gizmo: EditorSpatialGizmo, index: Long): String {
    throw NotImplementedError("get_handle_name is not implemented for EditorSpatialGizmoPlugin")
  }

  open fun _getHandleValue(gizmo: EditorSpatialGizmo, index: Long): Any? {
    throw NotImplementedError("get_handle_value is not implemented for EditorSpatialGizmoPlugin")
  }

  open fun getMaterial(name: String, gizmo: EditorSpatialGizmo): SpatialMaterial? {
    TransferContext.writeArguments(STRING to name, OBJECT to gizmo)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORSPATIALGIZMOPLUGIN_GET_MATERIAL, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as SpatialMaterial?
  }

  open fun _getName(): String {
    throw NotImplementedError("get_name is not implemented for EditorSpatialGizmoPlugin")
  }

  open fun _getPriority(): String {
    throw NotImplementedError("get_priority is not implemented for EditorSpatialGizmoPlugin")
  }

  open fun _hasGizmo(spatial: Spatial): Boolean {
    throw NotImplementedError("has_gizmo is not implemented for EditorSpatialGizmoPlugin")
  }

  open fun _isHandleHighlighted(gizmo: EditorSpatialGizmo, index: Long): Boolean {
    throw
        NotImplementedError("is_handle_highlighted is not implemented for EditorSpatialGizmoPlugin")
  }

  open fun _isSelectableWhenHidden(): Boolean {
    throw
        NotImplementedError("is_selectable_when_hidden is not implemented for EditorSpatialGizmoPlugin")
  }

  open fun _redraw(gizmo: EditorSpatialGizmo) {
  }

  open fun _setHandle(
    gizmo: EditorSpatialGizmo,
    index: Long,
    camera: Camera,
    point: Vector2
  ) {
  }
}
