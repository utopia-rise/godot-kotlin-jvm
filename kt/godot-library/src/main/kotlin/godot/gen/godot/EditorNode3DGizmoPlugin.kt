// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.PackedInt32Array
import godot.core.Plane
import godot.core.Transform3D
import godot.core.VariantArray
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.Vector2
import godot.core.memory.TransferContext
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * A class used by the editor to define Node3D gizmo types.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/plugins/editor/3d_gizmos.html]($DOCS_URL/tutorials/plugins/editor/3d_gizmos.html)
 *
 * [godot.EditorNode3DGizmoPlugin] allows you to define a new type of Gizmo. There are two main ways to do so: extending [godot.EditorNode3DGizmoPlugin] for the simpler gizmos, or creating a new [godot.EditorNode3DGizmo] type. See the tutorial in the documentation for more info.
 *
 * To use [godot.EditorNode3DGizmoPlugin], register it using the [godot.EditorPlugin.addNode3dGizmoPlugin] method first.
 */
@GodotBaseType
public open class EditorNode3DGizmoPlugin internal constructor() : Resource() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_EDITORNODE3DGIZMOPLUGIN, scriptIndex)
    return true
  }

  /**
   * Override this method to define which Node3D nodes have a gizmo from this plugin. Whenever a [godot.Node3D] node is added to a scene this method is called, if it returns `true` the node gets a generic [godot.EditorNode3DGizmo] assigned and is added to this plugin's list of active gizmos.
   */
  public open fun _hasGizmo(forNode3d: Node3D): Boolean {
    throw NotImplementedError("_has_gizmo is not implemented for EditorNode3DGizmoPlugin")
  }

  /**
   * Override this method to return a custom [godot.EditorNode3DGizmo] for the spatial nodes of your choice, return `null` for the rest of nodes. See also [_hasGizmo].
   */
  public open fun _createGizmo(forNode3d: Node3D): EditorNode3DGizmo? {
    throw NotImplementedError("_create_gizmo is not implemented for EditorNode3DGizmoPlugin")
  }

  /**
   * Override this method to provide the name that will appear in the gizmo visibility menu.
   */
  public open fun _getGizmoName(): String {
    throw NotImplementedError("_get_gizmo_name is not implemented for EditorNode3DGizmoPlugin")
  }

  /**
   * Override this method to set the gizmo's priority. Gizmos with higher priority will have precedence when processing inputs like handles or subgizmos selection.
   *
   * All built-in editor gizmos return a priority of `-1`. If not overridden, this method will return `0`, which means custom gizmos will automatically get higher priority than built-in gizmos.
   */
  public open fun _getPriority(): Long {
    throw NotImplementedError("_get_priority is not implemented for EditorNode3DGizmoPlugin")
  }

  /**
   * Override this method to define whether the gizmos handled by this plugin can be hidden or not. Returns `true` if not overridden.
   */
  public open fun _canBeHidden(): Boolean {
    throw NotImplementedError("_can_be_hidden is not implemented for EditorNode3DGizmoPlugin")
  }

  /**
   * Override this method to define whether Node3D with this gizmo should be selectable even when the gizmo is hidden.
   */
  public open fun _isSelectableWhenHidden(): Boolean {
    throw NotImplementedError("_is_selectable_when_hidden is not implemented for EditorNode3DGizmoPlugin")
  }

  /**
   * Override this method to add all the gizmo elements whenever a gizmo update is requested. It's common to call [godot.EditorNode3DGizmo.clear] at the beginning of this method and then add visual elements depending on the node's properties.
   */
  public open fun _redraw(gizmo: EditorNode3DGizmo): Unit {
  }

  /**
   * Override this method to provide gizmo's handle names. The [secondary] argument is `true` when the requested handle is secondary (see [godot.EditorNode3DGizmo.addHandles] for more information). Called for this plugin's active gizmos.
   */
  public open fun _getHandleName(
    gizmo: EditorNode3DGizmo,
    handleId: Long,
    secondary: Boolean,
  ): String {
    throw NotImplementedError("_get_handle_name is not implemented for EditorNode3DGizmoPlugin")
  }

  /**
   * Override this method to return `true` whenever to given handle should be highlighted in the editor. The [secondary] argument is `true` when the requested handle is secondary (see [godot.EditorNode3DGizmo.addHandles] for more information). Called for this plugin's active gizmos.
   */
  public open fun _isHandleHighlighted(
    gizmo: EditorNode3DGizmo,
    handleId: Long,
    secondary: Boolean,
  ): Boolean {
    throw NotImplementedError("_is_handle_highlighted is not implemented for EditorNode3DGizmoPlugin")
  }

  /**
   * Override this method to return the current value of a handle. This value will be requested at the start of an edit and used as the `restore` argument in [_commitHandle].
   *
   * The [secondary] argument is `true` when the requested handle is secondary (see [godot.EditorNode3DGizmo.addHandles] for more information).
   *
   * Called for this plugin's active gizmos.
   */
  public open fun _getHandleValue(
    gizmo: EditorNode3DGizmo,
    handleId: Long,
    secondary: Boolean,
  ): Any? {
    throw NotImplementedError("_get_handle_value is not implemented for EditorNode3DGizmoPlugin")
  }

  /**
   * Override this method to update the node's properties when the user drags a gizmo handle (previously added with [godot.EditorNode3DGizmo.addHandles]). The provided [screenPos] is the mouse position in screen coordinates and the [camera] can be used to convert it to raycasts.
   *
   * The [secondary] argument is `true` when the edited handle is secondary (see [godot.EditorNode3DGizmo.addHandles] for more information).
   *
   * Called for this plugin's active gizmos.
   */
  public open fun _setHandle(
    gizmo: EditorNode3DGizmo,
    handleId: Long,
    secondary: Boolean,
    camera: Camera3D,
    screenPos: Vector2,
  ): Unit {
  }

  /**
   * Override this method to commit a handle being edited (handles must have been previously added by [godot.EditorNode3DGizmo.addHandles] during [_redraw]). This usually means creating an [godot.UndoRedo] action for the change, using the current handle value as "do" and the [restore] argument as "undo".
   *
   * If the [cancel] argument is `true`, the [restore] value should be directly set, without any [godot.UndoRedo] action.
   *
   * The [secondary] argument is `true` when the committed handle is secondary (see [godot.EditorNode3DGizmo.addHandles] for more information).
   *
   * Called for this plugin's active gizmos.
   */
  public open fun _commitHandle(
    gizmo: EditorNode3DGizmo,
    handleId: Long,
    secondary: Boolean,
    restore: Any,
    cancel: Boolean,
  ): Unit {
  }

  /**
   * Override this method to allow selecting subgizmos using mouse clicks. Given a [camera] and a [screenPos] in screen coordinates, this method should return which subgizmo should be selected. The returned value should be a unique subgizmo identifier, which can have any non-negative value and will be used in other virtual methods like [_getSubgizmoTransform] or [_commitSubgizmos]. Called for this plugin's active gizmos.
   */
  public open fun _subgizmosIntersectRay(
    gizmo: EditorNode3DGizmo,
    camera: Camera3D,
    screenPos: Vector2,
  ): Long {
    throw NotImplementedError("_subgizmos_intersect_ray is not implemented for EditorNode3DGizmoPlugin")
  }

  /**
   * Override this method to allow selecting subgizmos using mouse drag box selection. Given a [camera] and [frustumPlanes], this method should return which subgizmos are contained within the frustums. The [frustumPlanes] argument consists of an `Array` with all the `Plane`s that make up the selection frustum. The returned value should contain a list of unique subgizmo identifiers, these identifiers can have any non-negative value and will be used in other virtual methods like [_getSubgizmoTransform] or [_commitSubgizmos]. Called for this plugin's active gizmos.
   */
  public open fun _subgizmosIntersectFrustum(
    gizmo: EditorNode3DGizmo,
    camera: Camera3D,
    frustumPlanes: VariantArray<Plane>,
  ): PackedInt32Array {
    throw NotImplementedError("_subgizmos_intersect_frustum is not implemented for EditorNode3DGizmoPlugin")
  }

  /**
   * Override this method to return the current transform of a subgizmo. As with all subgizmo methods, the transform should be in local space respect to the gizmo's Node3D. This transform will be requested at the start of an edit and used in the `restore` argument in [_commitSubgizmos]. Called for this plugin's active gizmos.
   */
  public open fun _getSubgizmoTransform(gizmo: EditorNode3DGizmo, subgizmoId: Long): Transform3D {
    throw NotImplementedError("_get_subgizmo_transform is not implemented for EditorNode3DGizmoPlugin")
  }

  /**
   * Override this method to update the node properties during subgizmo editing (see [_subgizmosIntersectRay] and [_subgizmosIntersectFrustum]). The [transform] is given in the Node3D's local coordinate system. Called for this plugin's active gizmos.
   */
  public open fun _setSubgizmoTransform(
    gizmo: EditorNode3DGizmo,
    subgizmoId: Long,
    transform: Transform3D,
  ): Unit {
  }

  /**
   * Override this method to commit a group of subgizmos being edited (see [_subgizmosIntersectRay] and [_subgizmosIntersectFrustum]). This usually means creating an [godot.UndoRedo] action for the change, using the current transforms as "do" and the [restores] transforms as "undo".
   *
   * If the [cancel] argument is `true`, the [restores] transforms should be directly set, without any [godot.UndoRedo] action. As with all subgizmo methods, transforms are given in local space respect to the gizmo's Node3D. Called for this plugin's active gizmos.
   */
  public open fun _commitSubgizmos(
    gizmo: EditorNode3DGizmo,
    ids: PackedInt32Array,
    restores: VariantArray<Transform3D>,
    cancel: Boolean,
  ): Unit {
  }

  /**
   * Creates an unshaded material with its variants (selected and/or editable) and adds them to the internal material list. They can then be accessed with [getMaterial] and used in [godot.EditorNode3DGizmo.addMesh] and [godot.EditorNode3DGizmo.addLines]. Should not be overridden.
   */
  public fun createMaterial(
    name: String,
    color: Color,
    billboard: Boolean = false,
    onTop: Boolean = false,
    useVertexColor: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(STRING to name, COLOR to color, BOOL to billboard, BOOL to onTop, BOOL to useVertexColor)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORNODE3DGIZMOPLUGIN_CREATE_MATERIAL, NIL)
  }

  /**
   * Creates an icon material with its variants (selected and/or editable) and adds them to the internal material list. They can then be accessed with [getMaterial] and used in [godot.EditorNode3DGizmo.addUnscaledBillboard]. Should not be overridden.
   */
  public fun createIconMaterial(
    name: String,
    texture: Texture2D,
    onTop: Boolean = false,
    color: Color = Color(Color(1, 1, 1, 1)),
  ): Unit {
    TransferContext.writeArguments(STRING to name, OBJECT to texture, BOOL to onTop, COLOR to color)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORNODE3DGIZMOPLUGIN_CREATE_ICON_MATERIAL, NIL)
  }

  /**
   * Creates a handle material with its variants (selected and/or editable) and adds them to the internal material list. They can then be accessed with [getMaterial] and used in [godot.EditorNode3DGizmo.addHandles]. Should not be overridden.
   *
   * You can optionally provide a texture to use instead of the default icon.
   */
  public fun createHandleMaterial(
    name: String,
    billboard: Boolean = false,
    texture: Texture2D? = null,
  ): Unit {
    TransferContext.writeArguments(STRING to name, BOOL to billboard, OBJECT to texture)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORNODE3DGIZMOPLUGIN_CREATE_HANDLE_MATERIAL, NIL)
  }

  /**
   * Adds a new material to the internal material list for the plugin. It can then be accessed with [getMaterial]. Should not be overridden.
   */
  public fun addMaterial(name: String, material: StandardMaterial3D): Unit {
    TransferContext.writeArguments(STRING to name, OBJECT to material)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORNODE3DGIZMOPLUGIN_ADD_MATERIAL, NIL)
  }

  /**
   * Gets material from the internal list of materials. If an [godot.EditorNode3DGizmo] is provided, it will try to get the corresponding variant (selected and/or editable).
   */
  public fun getMaterial(name: String, gizmo: EditorNode3DGizmo? = null): StandardMaterial3D? {
    TransferContext.writeArguments(STRING to name, OBJECT to gizmo)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORNODE3DGIZMOPLUGIN_GET_MATERIAL, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as StandardMaterial3D?
  }

  public companion object
}
