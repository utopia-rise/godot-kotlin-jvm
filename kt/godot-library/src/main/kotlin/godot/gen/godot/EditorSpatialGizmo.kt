// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
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
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Custom gizmo for editing Spatial objects.
 *
 * Custom gizmo that is used for providing custom visualization and editing (handles) for 3D Spatial objects. See [godot.EditorSpatialGizmoPlugin] for more information.
 */
@GodotBaseType
public open class EditorSpatialGizmo : SpatialGizmo() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_EDITORSPATIALGIZMO)
  }

  /**
   * Adds the specified `segments` to the gizmo's collision shape for picking. Call this function during [redraw].
   */
  public open fun addCollisionSegments(segments: PoolVector3Array): Unit {
    TransferContext.writeArguments(POOL_VECTOR3_ARRAY to segments)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORSPATIALGIZMO_ADD_COLLISION_SEGMENTS, NIL)
  }

  /**
   * Adds collision triangles to the gizmo for picking. A [godot.TriangleMesh] can be generated from a regular [godot.Mesh] too. Call this function during [redraw].
   */
  public open fun addCollisionTriangles(triangles: TriangleMesh): Unit {
    TransferContext.writeArguments(OBJECT to triangles)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORSPATIALGIZMO_ADD_COLLISION_TRIANGLES, NIL)
  }

  /**
   * Adds a list of handles (points) which can be used to deform the object being edited.
   *
   * There are virtual functions which will be called upon editing of these handles. Call this function during [redraw].
   */
  public open fun addHandles(
    handles: PoolVector3Array,
    material: Material,
    billboard: Boolean = false,
    secondary: Boolean = false
  ): Unit {
    TransferContext.writeArguments(POOL_VECTOR3_ARRAY to handles, OBJECT to material, BOOL to
        billboard, BOOL to secondary)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORSPATIALGIZMO_ADD_HANDLES, NIL)
  }

  /**
   * Adds lines to the gizmo (as sets of 2 points), with a given material. The lines are used for visualizing the gizmo. Call this function during [redraw].
   */
  public open fun addLines(
    lines: PoolVector3Array,
    material: Material,
    billboard: Boolean = false,
    modulate: Color = Color(1,1,1,1)
  ): Unit {
    TransferContext.writeArguments(POOL_VECTOR3_ARRAY to lines, OBJECT to material, BOOL to
        billboard, COLOR to modulate)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORSPATIALGIZMO_ADD_LINES, NIL)
  }

  /**
   * Adds a mesh to the gizmo with the specified `billboard` state, `skeleton` and `material`. If `billboard` is `true`, the mesh will rotate to always face the camera. Call this function during [redraw].
   */
  public open fun addMesh(
    mesh: Mesh,
    billboard: Boolean = false,
    skeleton: SkinReference? = null,
    material: Material? = null
  ): Unit {
    TransferContext.writeArguments(OBJECT to mesh, BOOL to billboard, OBJECT to skeleton, OBJECT to
        material)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORSPATIALGIZMO_ADD_MESH, NIL)
  }

  /**
   * Adds an unscaled billboard for visualization. Call this function during [redraw].
   */
  public open fun addUnscaledBillboard(
    material: Material,
    defaultScale: Double = 1.0,
    modulate: Color = Color(1,1,1,1)
  ): Unit {
    TransferContext.writeArguments(OBJECT to material, DOUBLE to defaultScale, COLOR to modulate)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORSPATIALGIZMO_ADD_UNSCALED_BILLBOARD, NIL)
  }

  /**
   * Removes everything in the gizmo including meshes, collisions and handles.
   */
  public open fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORSPATIALGIZMO_CLEAR, NIL)
  }

  /**
   * Commit a handle being edited (handles must have been previously added by [addHandles]).
   *
   * If the `cancel` parameter is `true`, an option to restore the edited value to the original is provided.
   */
  public open fun _commitHandle(
    index: Long,
    restore: Any?,
    cancel: Boolean
  ): Unit {
  }

  /**
   * Gets the name of an edited handle (handles must have been previously added by [addHandles]).
   *
   * Handles can be named for reference to the user when editing.
   */
  public open fun _getHandleName(index: Long): String {
    throw NotImplementedError("get_handle_name is not implemented for EditorSpatialGizmo")
  }

  /**
   * Gets actual value of a handle. This value can be anything and used for eventually undoing the motion when calling [commitHandle].
   */
  public open fun _getHandleValue(index: Long): Any? {
    throw NotImplementedError("get_handle_value is not implemented for EditorSpatialGizmo")
  }

  /**
   * Returns the [godot.EditorSpatialGizmoPlugin] that owns this gizmo. It's useful to retrieve materials using [godot.EditorSpatialGizmoPlugin.getMaterial].
   */
  public open fun getPlugin(): EditorSpatialGizmoPlugin? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORSPATIALGIZMO_GET_PLUGIN,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as EditorSpatialGizmoPlugin?
  }

  /**
   * Returns the Spatial node associated with this gizmo.
   */
  public open fun getSpatialNode(): Spatial? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORSPATIALGIZMO_GET_SPATIAL_NODE,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Spatial?
  }

  /**
   * Returns `true` if the handle at index `index` is highlighted by being hovered with the mouse.
   */
  public open fun _isHandleHighlighted(index: Long): Boolean {
    throw NotImplementedError("is_handle_highlighted is not implemented for EditorSpatialGizmo")
  }

  /**
   * This function is called when the [godot.Spatial] this gizmo refers to changes (the [godot.Spatial.updateGizmo] is called).
   */
  public open fun _redraw(): Unit {
  }

  /**
   * This function is used when the user drags a gizmo handle (previously added with [addHandles]) in screen coordinates.
   *
   * The [godot.Camera] is also provided so screen coordinates can be converted to raycasts.
   */
  public open fun _setHandle(
    index: Long,
    camera: Camera,
    point: Vector2
  ): Unit {
  }

  /**
   * Sets the gizmo's hidden state. If `true`, the gizmo will be hidden. If `false`, it will be shown.
   */
  public open fun setHidden(hidden: Boolean): Unit {
    TransferContext.writeArguments(BOOL to hidden)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORSPATIALGIZMO_SET_HIDDEN, NIL)
  }

  /**
   * Sets the reference [godot.Spatial] node for the gizmo. `node` must inherit from [godot.Spatial].
   */
  public open fun setSpatialNode(node: Node): Unit {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORSPATIALGIZMO_SET_SPATIAL_NODE,
        NIL)
  }
}
