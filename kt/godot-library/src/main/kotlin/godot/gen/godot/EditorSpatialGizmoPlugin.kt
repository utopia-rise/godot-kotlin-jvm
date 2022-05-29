// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.Vector2
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Used by the editor to define Spatial gizmo types.
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/3.4/tutorials/plugins/editor/spatial_gizmos.html](https://docs.godotengine.org/en/3.4/tutorials/plugins/editor/spatial_gizmos.html)
 *
 * [godot.EditorSpatialGizmoPlugin] allows you to define a new type of Gizmo. There are two main ways to do so: extending [godot.EditorSpatialGizmoPlugin] for the simpler gizmos, or creating a new [godot.EditorSpatialGizmo] type. See the tutorial in the documentation for more info.
 *
 * To use [godot.EditorSpatialGizmoPlugin], register it using the [godot.EditorPlugin.addSpatialGizmoPlugin] method first.
 */
@GodotBaseType
public open class EditorSpatialGizmoPlugin : Resource() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_EDITORSPATIALGIZMOPLUGIN)
  }

  /**
   * Adds a new material to the internal material list for the plugin. It can then be accessed with [getMaterial]. Should not be overridden.
   */
  public open fun addMaterial(name: String, material: SpatialMaterial): Unit {
    TransferContext.writeArguments(STRING to name, OBJECT to material)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORSPATIALGIZMOPLUGIN_ADD_MATERIAL, NIL)
  }

  /**
   * Override this method to define whether the gizmo can be hidden or not. Returns `true` if not overridden.
   */
  public open fun _canBeHidden(): Boolean {
    throw NotImplementedError("can_be_hidden is not implemented for EditorSpatialGizmoPlugin")
  }

  /**
   * Override this method to commit gizmo handles. Called for this plugin's active gizmos.
   */
  public open fun _commitHandle(
    gizmo: EditorSpatialGizmo,
    index: Long,
    restore: Any?,
    cancel: Boolean
  ): Unit {
  }

  /**
   * Override this method to return a custom [godot.EditorSpatialGizmo] for the spatial nodes of your choice, return `null` for the rest of nodes. See also [hasGizmo].
   */
  public open fun _createGizmo(spatial: Spatial): EditorSpatialGizmo? {
    throw NotImplementedError("create_gizmo is not implemented for EditorSpatialGizmoPlugin")
  }

  /**
   * Creates a handle material with its variants (selected and/or editable) and adds them to the internal material list. They can then be accessed with [getMaterial] and used in [godot.EditorSpatialGizmo.addHandles]. Should not be overridden.
   *
   * You can optionally provide a texture to use instead of the default icon.
   */
  public open fun createHandleMaterial(
    name: String,
    billboard: Boolean = false,
    texture: Texture? = null
  ): Unit {
    TransferContext.writeArguments(STRING to name, BOOL to billboard, OBJECT to texture)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORSPATIALGIZMOPLUGIN_CREATE_HANDLE_MATERIAL, NIL)
  }

  /**
   * Creates an icon material with its variants (selected and/or editable) and adds them to the internal material list. They can then be accessed with [getMaterial] and used in [godot.EditorSpatialGizmo.addUnscaledBillboard]. Should not be overridden.
   */
  public open fun createIconMaterial(
    name: String,
    texture: Texture,
    onTop: Boolean = false,
    color: Color = Color(1,1,1,1)
  ): Unit {
    TransferContext.writeArguments(STRING to name, OBJECT to texture, BOOL to onTop, COLOR to color)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORSPATIALGIZMOPLUGIN_CREATE_ICON_MATERIAL, NIL)
  }

  /**
   * Creates an unshaded material with its variants (selected and/or editable) and adds them to the internal material list. They can then be accessed with [getMaterial] and used in [godot.EditorSpatialGizmo.addMesh] and [godot.EditorSpatialGizmo.addLines]. Should not be overridden.
   */
  public open fun createMaterial(
    name: String,
    color: Color,
    billboard: Boolean = false,
    onTop: Boolean = false,
    useVertexColor: Boolean = false
  ): Unit {
    TransferContext.writeArguments(STRING to name, COLOR to color, BOOL to billboard, BOOL to onTop,
        BOOL to useVertexColor)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORSPATIALGIZMOPLUGIN_CREATE_MATERIAL, NIL)
  }

  /**
   * Override this method to provide gizmo's handle names. Called for this plugin's active gizmos.
   */
  public open fun _getHandleName(gizmo: EditorSpatialGizmo, index: Long): String {
    throw NotImplementedError("get_handle_name is not implemented for EditorSpatialGizmoPlugin")
  }

  /**
   * Gets actual value of a handle from gizmo. Called for this plugin's active gizmos.
   */
  public open fun _getHandleValue(gizmo: EditorSpatialGizmo, index: Long): Any? {
    throw NotImplementedError("get_handle_value is not implemented for EditorSpatialGizmoPlugin")
  }

  /**
   * Gets material from the internal list of materials. If an [godot.EditorSpatialGizmo] is provided, it will try to get the corresponding variant (selected and/or editable).
   */
  public open fun getMaterial(name: String, gizmo: EditorSpatialGizmo? = null): SpatialMaterial? {
    TransferContext.writeArguments(STRING to name, OBJECT to gizmo)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORSPATIALGIZMOPLUGIN_GET_MATERIAL, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as SpatialMaterial?
  }

  /**
   * Override this method to provide the name that will appear in the gizmo visibility menu.
   */
  public open fun _getName(): String {
    throw NotImplementedError("get_name is not implemented for EditorSpatialGizmoPlugin")
  }

  /**
   * Override this method to set the gizmo's priority. Higher values correspond to higher priority. If a gizmo with higher priority conflicts with another gizmo, only the gizmo with higher priority will be used.
   *
   * All built-in editor gizmos return a priority of `-1`. If not overridden, this method will return `0`, which means custom gizmos will automatically override built-in gizmos.
   */
  public open fun _getPriority(): Long {
    throw NotImplementedError("get_priority is not implemented for EditorSpatialGizmoPlugin")
  }

  /**
   * Override this method to define which Spatial nodes have a gizmo from this plugin. Whenever a [godot.Spatial] node is added to a scene this method is called, if it returns `true` the node gets a generic [godot.EditorSpatialGizmo] assigned and is added to this plugin's list of active gizmos.
   */
  public open fun _hasGizmo(spatial: Spatial): Boolean {
    throw NotImplementedError("has_gizmo is not implemented for EditorSpatialGizmoPlugin")
  }

  /**
   * Gets whether a handle is highlighted or not. Called for this plugin's active gizmos.
   */
  public open fun _isHandleHighlighted(gizmo: EditorSpatialGizmo, index: Long): Boolean {
    throw
        NotImplementedError("is_handle_highlighted is not implemented for EditorSpatialGizmoPlugin")
  }

  /**
   * Override this method to define whether a Spatial with this gizmo should be selectable even when the gizmo is hidden.
   */
  public open fun _isSelectableWhenHidden(): Boolean {
    throw
        NotImplementedError("is_selectable_when_hidden is not implemented for EditorSpatialGizmoPlugin")
  }

  /**
   * Callback to redraw the provided gizmo. Called for this plugin's active gizmos.
   */
  public open fun _redraw(gizmo: EditorSpatialGizmo): Unit {
  }

  /**
   * Update the value of a handle after it has been updated. Called for this plugin's active gizmos.
   */
  public open fun _setHandle(
    gizmo: EditorSpatialGizmo,
    index: Long,
    camera: Camera,
    point: Vector2
  ): Unit {
  }
}
