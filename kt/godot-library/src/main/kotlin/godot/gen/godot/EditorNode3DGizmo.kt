// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.PackedInt32Array
import godot.core.PackedVector3Array
import godot.core.TransferContext
import godot.core.Transform3D
import godot.core.VariantArray
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_INT_32_ARRAY
import godot.core.VariantType.PACKED_VECTOR3_ARRAY
import godot.core.VariantType.TRANSFORM3D
import godot.core.Vector2
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Gizmo for editing Node3D objects.
 *
 * Gizmo that is used for providing custom visualization and editing (handles and subgizmos) for Node3D objects. Can be overridden to create custom gizmos, but for simple gizmos creating a [godot.EditorNode3DGizmoPlugin] is usually recommended.
 */
@GodotBaseType
public open class EditorNode3DGizmo internal constructor() : Node3DGizmo() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_EDITORNODE3DGIZMO)
  }

  /**
   * Override this method to add all the gizmo elements whenever a gizmo update is requested. It's common to call [clear] at the beginning of this method and then add visual elements depending on the node's properties.
   */
  public open fun _redraw(): Unit {
  }

  /**
   * Override this method to return the name of an edited handle (handles must have been previously added by [addHandles]). Handles can be named for reference to the user when editing.
   *
   * The `secondary` argument is `true` when the requested handle is secondary (see [addHandles] for more information).
   */
  public open fun _getHandleName(id: Long, secondary: Boolean): String {
    throw NotImplementedError("_get_handle_name·is·not·implemented·for·EditorNode3DGizmo")
  }

  /**
   * Override this method to return `true` whenever the given handle should be highlighted in the editor.
   *
   * The `secondary` argument is `true` when the requested handle is secondary (see [addHandles] for more information).
   */
  public open fun _isHandleHighlighted(id: Long, secondary: Boolean): Boolean {
    throw NotImplementedError("_is_handle_highlighted·is·not·implemented·for·EditorNode3DGizmo")
  }

  /**
   * Override this method to return the current value of a handle. This value will be requested at the start of an edit and used as the `restore` argument in [_commitHandle].
   *
   * The `secondary` argument is `true` when the requested handle is secondary (see [addHandles] for more information).
   */
  public open fun _getHandleValue(id: Long, secondary: Boolean): Any? {
    throw NotImplementedError("_get_handle_value·is·not·implemented·for·EditorNode3DGizmo")
  }

  /**
   * Override this method to update the node properties when the user drags a gizmo handle (previously added with [addHandles]). The provided `point` is the mouse position in screen coordinates and the `camera` can be used to convert it to raycasts.
   *
   * The `secondary` argument is `true` when the edited handle is secondary (see [addHandles] for more information).
   */
  public open fun _setHandle(
    id: Long,
    secondary: Boolean,
    camera: Camera3D,
    point: Vector2
  ): Unit {
  }

  /**
   * Override this method to commit a handle being edited (handles must have been previously added by [addHandles]). This usually means creating an [godot.UndoRedo] action for the change, using the current handle value as "do" and the `restore` argument as "undo".
   *
   * If the `cancel` argument is `true`, the `restore` value should be directly set, without any [godot.UndoRedo] action.
   *
   * The `secondary` argument is `true` when the committed handle is secondary (see [addHandles] for more information).
   */
  public open fun _commitHandle(
    id: Long,
    secondary: Boolean,
    restore: Any,
    cancel: Boolean
  ): Unit {
  }

  /**
   * Override this method to allow selecting subgizmos using mouse clicks. Given a `camera` and a `point` in screen coordinates, this method should return which subgizmo should be selected. The returned value should be a unique subgizmo identifier, which can have any non-negative value and will be used in other virtual methods like [_getSubgizmoTransform] or [_commitSubgizmos].
   */
  public open fun _subgizmosIntersectRay(camera: Camera3D, point: Vector2): Long {
    throw NotImplementedError("_subgizmos_intersect_ray·is·not·implemented·for·EditorNode3DGizmo")
  }

  /**
   * Override this method to allow selecting subgizmos using mouse drag box selection. Given a `camera` and a `frustum`, this method should return which subgizmos are contained within the frustum. The `frustum` argument consists of an `Array` with all the `Plane`s that make up the selection frustum. The returned value should contain a list of unique subgizmo identifiers, which can have any non-negative value and will be used in other virtual methods like [_getSubgizmoTransform] or [_commitSubgizmos].
   */
  public open fun _subgizmosIntersectFrustum(camera: Camera3D, frustum: VariantArray<Any?>):
      PackedInt32Array {
    throw NotImplementedError("_subgizmos_intersect_frustum·is·not·implemented·for·EditorNode3DGizmo")
  }

  /**
   * Override this method to update the node properties during subgizmo editing (see [_subgizmosIntersectRay] and [_subgizmosIntersectFrustum]). The `transform` is given in the Node3D's local coordinate system.
   */
  public open fun _setSubgizmoTransform(id: Long, transform: Transform3D): Unit {
  }

  /**
   * Override this method to return the current transform of a subgizmo. This transform will be requested at the start of an edit and used as the `restore` argument in [_commitSubgizmos].
   */
  public open fun _getSubgizmoTransform(id: Long): Transform3D {
    throw NotImplementedError("_get_subgizmo_transform·is·not·implemented·for·EditorNode3DGizmo")
  }

  /**
   * Override this method to commit a group of subgizmos being edited (see [_subgizmosIntersectRay] and [_subgizmosIntersectFrustum]). This usually means creating an [godot.UndoRedo] action for the change, using the current transforms as "do" and the `restore` transforms as "undo".
   *
   * If the `cancel` argument is `true`, the `restore` transforms should be directly set, without any [godot.UndoRedo] action.
   */
  public open fun _commitSubgizmos(
    ids: PackedInt32Array,
    restores: VariantArray<Any?>,
    cancel: Boolean
  ): Unit {
  }

  /**
   * Adds lines to the gizmo (as sets of 2 points), with a given material. The lines are used for visualizing the gizmo. Call this method during [_redraw].
   */
  public open fun addLines(
    lines: PackedVector3Array,
    material: Material,
    billboard: Boolean = false,
    modulate: Color = Color(Color(1, 1, 1, 1))
  ): Unit {
    TransferContext.writeArguments(PACKED_VECTOR3_ARRAY to lines, OBJECT to material, BOOL to billboard, COLOR to modulate)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORNODE3DGIZMO_ADD_LINES, NIL)
  }

  /**
   * Adds a mesh to the gizmo with the specified `material`, local `transform` and `skeleton`. Call this method during [_redraw].
   */
  public open fun addMesh(
    mesh: Mesh,
    material: Material? = null,
    transform: Transform3D = Transform3D(),
    skeleton: SkinReference? = null
  ): Unit {
    TransferContext.writeArguments(OBJECT to mesh, OBJECT to material, TRANSFORM3D to transform, OBJECT to skeleton)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORNODE3DGIZMO_ADD_MESH, NIL)
  }

  /**
   * Adds the specified `segments` to the gizmo's collision shape for picking. Call this method during [_redraw].
   */
  public open fun addCollisionSegments(segments: PackedVector3Array): Unit {
    TransferContext.writeArguments(PACKED_VECTOR3_ARRAY to segments)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORNODE3DGIZMO_ADD_COLLISION_SEGMENTS, NIL)
  }

  /**
   * Adds collision triangles to the gizmo for picking. A [godot.TriangleMesh] can be generated from a regular [godot.Mesh] too. Call this method during [_redraw].
   */
  public open fun addCollisionTriangles(triangles: TriangleMesh): Unit {
    TransferContext.writeArguments(OBJECT to triangles)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORNODE3DGIZMO_ADD_COLLISION_TRIANGLES, NIL)
  }

  /**
   * Adds an unscaled billboard for visualization and selection. Call this method during [_redraw].
   */
  public open fun addUnscaledBillboard(
    material: Material,
    defaultScale: Double = 1.0,
    modulate: Color = Color(Color(1, 1, 1, 1))
  ): Unit {
    TransferContext.writeArguments(OBJECT to material, DOUBLE to defaultScale, COLOR to modulate)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORNODE3DGIZMO_ADD_UNSCALED_BILLBOARD, NIL)
  }

  /**
   * Adds a list of handles (points) which can be used to edit the properties of the gizmo's Node3D. The `ids` argument can be used to specify a custom identifier for each handle, if an empty `Array` is passed, the ids will be assigned automatically from the `handles` argument order.
   *
   * The `secondary` argument marks the added handles as secondary, meaning they will normally have less selection priority than regular handles. When the user is holding the shift key secondary handles will switch to have higher priority than regular handles. This change in priority can be used to place multiple handles at the same point while still giving the user control on their selection.
   *
   * There are virtual methods which will be called upon editing of these handles. Call this method during [_redraw].
   */
  public open fun addHandles(
    handles: PackedVector3Array,
    material: Material,
    ids: PackedInt32Array,
    billboard: Boolean = false,
    secondary: Boolean = false
  ): Unit {
    TransferContext.writeArguments(PACKED_VECTOR3_ARRAY to handles, OBJECT to material, PACKED_INT_32_ARRAY to ids, BOOL to billboard, BOOL to secondary)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORNODE3DGIZMO_ADD_HANDLES, NIL)
  }

  /**
   * Sets the reference [godot.Node3D] node for the gizmo. `node` must inherit from [godot.Node3D].
   */
  public open fun setSpatialNode(node: Node): Unit {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORNODE3DGIZMO_SET_SPATIAL_NODE,
        NIL)
  }

  /**
   * Returns the Node3D node associated with this gizmo.
   */
  public open fun getSpatialNode(): Node3D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORNODE3DGIZMO_GET_SPATIAL_NODE,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Node3D?
  }

  /**
   * Returns the [godot.EditorNode3DGizmoPlugin] that owns this gizmo. It's useful to retrieve materials using [godot.EditorNode3DGizmoPlugin.getMaterial].
   */
  public open fun getPlugin(): EditorNode3DGizmoPlugin? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORNODE3DGIZMO_GET_PLUGIN,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as EditorNode3DGizmoPlugin?
  }

  /**
   * Removes everything in the gizmo including meshes, collisions and handles.
   */
  public open fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORNODE3DGIZMO_CLEAR, NIL)
  }

  /**
   * Sets the gizmo's hidden state. If `true`, the gizmo will be hidden. If `false`, it will be shown.
   */
  public open fun setHidden(hidden: Boolean): Unit {
    TransferContext.writeArguments(BOOL to hidden)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORNODE3DGIZMO_SET_HIDDEN, NIL)
  }

  /**
   * Returns `true` if the given subgizmo is currently selected. Can be used to highlight selected elements during [_redraw].
   */
  public open fun isSubgizmoSelected(id: Long): Boolean {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORNODE3DGIZMO_IS_SUBGIZMO_SELECTED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns a list of the currently selected subgizmos. Can be used to highlight selected elements during [_redraw].
   */
  public open fun getSubgizmoSelection(): PackedInt32Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORNODE3DGIZMO_GET_SUBGIZMO_SELECTION, PACKED_INT_32_ARRAY)
    return TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array
  }

  public companion object
}
