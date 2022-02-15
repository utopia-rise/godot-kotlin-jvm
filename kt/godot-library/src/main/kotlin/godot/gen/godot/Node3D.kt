// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Basis
import godot.core.NodePath
import godot.core.Quaternion
import godot.core.TransferContext
import godot.core.Transform3D
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BASIS
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import godot.core.VariantType.QUATERNION
import godot.core.VariantType.STRING
import godot.core.VariantType.TRANSFORM3D
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Most basic 3D game object, parent of all 3D-related nodes.
 *
 * Tutorials:
 * [https://github.com/godotengine/godot-demo-projects/tree/master/3d](https://github.com/godotengine/godot-demo-projects/tree/master/3d)
 *
 * Most basic 3D game object, with a 3D [godot.Transform3D] and visibility settings. All other 3D game objects inherit from Node3D. Use [godot.Node3D] as a parent node to move, scale, rotate and show/hide children in a 3D project.
 *
 * Affine operations (rotate, scale, translate) happen in parent's local coordinate system, unless the [godot.Node3D] object is set as top-level. Affine operations in this coordinate system correspond to direct affine operations on the [godot.Node3D]'s transform. The word local below refers to this coordinate system. The coordinate system that is attached to the [godot.Node3D] object itself is referred to as object-local coordinate system.
 *
 * **Note:** Unless otherwise specified, all methods that have angle parameters must have angles specified as *radians*. To convert degrees to radians, use [@GlobalScope.deg2rad].
 */
@GodotBaseType
public open class Node3D : Node() {
  /**
   * Emitted when node visibility changes.
   */
  public val visibilityChanged: Signal0 by signal()

  /**
   * Local space [godot.Transform3D] of this node, with respect to the parent node.
   */
  public open var transform: Transform3D
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE3D_GET_TRANSFORM, TRANSFORM3D)
      return TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D
    }
    set(`value`) {
      TransferContext.writeArguments(TRANSFORM3D to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE3D_SET_TRANSFORM, NIL)
    }

  /**
   * World3D space (global) [godot.Transform3D] of this node.
   */
  public open var globalTransform: Transform3D
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE3D_GET_GLOBAL_TRANSFORM,
          TRANSFORM3D)
      return TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D
    }
    set(`value`) {
      TransferContext.writeArguments(TRANSFORM3D to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE3D_SET_GLOBAL_TRANSFORM, NIL)
    }

  /**
   * Local position or translation of this node relative to the parent. This is equivalent to `transform.origin`.
   */
  public open var position: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE3D_GET_POSITION, VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE3D_SET_POSITION, NIL)
    }

  /**
   * Rotation part of the local transformation in radians, specified in terms of Euler angles. The angles construct a rotaton in the order specified by the [rotationOrder] property.
   *
   * **Note:** In the mathematical sense, rotation is a matrix and not a vector. The three Euler angles, which are the three independent parameters of the Euler-angle parametrization of the rotation matrix, are stored in a [godot.core.Vector3] data structure not because the rotation is a vector, but only because [godot.core.Vector3] exists as a convenient data-structure to store 3 floating-point numbers. Therefore, applying affine operations on the rotation "vector" is not meaningful.
   */
  public open var rotation: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE3D_GET_ROTATION, VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE3D_SET_ROTATION, NIL)
    }

  /**
   * Access to the node rotation as a [godot.Quaternion]. This property is ideal for tweening complex rotations.
   */
  public open var quaternion: Quaternion
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE3D_GET_QUATERNION, QUATERNION)
      return TransferContext.readReturnValue(QUATERNION, false) as Quaternion
    }
    set(`value`) {
      TransferContext.writeArguments(QUATERNION to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE3D_SET_QUATERNION, NIL)
    }

  /**
   * Direct access to the 3x3 basis of the [godot.Transform3D] property.
   */
  public open var basis: Basis
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE3D_GET_BASIS, BASIS)
      return TransferContext.readReturnValue(BASIS, false) as Basis
    }
    set(`value`) {
      TransferContext.writeArguments(BASIS to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE3D_SET_BASIS, NIL)
    }

  /**
   * Scale part of the local transformation.
   */
  public open var scale: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE3D_GET_SCALE, VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE3D_SET_SCALE, NIL)
    }

  /**
   * Specify how rotation (and scale) will be presented in the editor.
   */
  public open var rotationEditMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE3D_GET_ROTATION_EDIT_MODE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE3D_SET_ROTATION_EDIT_MODE,
          NIL)
    }

  /**
   * Specify the axis rotation order of the [rotation] property. The final orientation is constructed by rotating the Euler angles in the order specified by this property.
   */
  public open var rotationOrder: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE3D_GET_ROTATION_ORDER, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE3D_SET_ROTATION_ORDER, NIL)
    }

  /**
   * If `true`, the node will not inherit its transformations from its parent. Node transformations are only in global space.
   */
  public open var topLevel: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE3D_GET_TOP_LEVEL, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE3D_SET_TOP_LEVEL, NIL)
    }

  /**
   * If `true`, this node is drawn. The node is only visible if all of its antecedents are visible as well (in other words, [isVisibleInTree] must return `true`).
   */
  public open var visible: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE3D_GET_VISIBLE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE3D_SET_VISIBLE, NIL)
    }

  /**
   * Defines the visibility range parent for this node and its subtree. The visibility parent must be a GeometryInstance3D. Any visual instance will only be visible if the visibility parent (and all of its visibility ancestors) is hidden by being closer to the camera than its own [godot.GeometryInstance3D.visibilityRangeBegin]. Nodes hidden via the [godot.Node3D.visible] property are essentially removed from the visibility dependency tree, so dependent instances will not take the hidden node or its ancestors into account.
   */
  public open var visibilityParent: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE3D_GET_VISIBILITY_PARENT,
          NODE_PATH)
      return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE3D_SET_VISIBILITY_PARENT, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_NODE3D)
  }

  /**
   * Returns the parent [godot.Node3D], or an empty [godot.Object] if no parent exists or parent is not of type [godot.Node3D].
   */
  public open fun getParentNode3d(): Node3D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE3D_GET_PARENT_NODE_3D, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Node3D?
  }

  /**
   * Sets whether the node ignores notification that its transformation (global or local) changed.
   */
  public open fun setIgnoreTransformNotification(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NODE3D_SET_IGNORE_TRANSFORM_NOTIFICATION, NIL)
  }

  /**
   * Sets whether the node uses a scale of `(1, 1, 1)` or its local transformation scale. Changes to the local transformation scale are preserved.
   */
  public open fun setDisableScale(disable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to disable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE3D_SET_DISABLE_SCALE, NIL)
  }

  /**
   * Returns whether this node uses a scale of `(1, 1, 1)` or its local transformation scale.
   */
  public open fun isScaleDisabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE3D_IS_SCALE_DISABLED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the current [godot.World3D] resource this [godot.Node3D] node is registered to.
   */
  public open fun getWorld3d(): World3D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE3D_GET_WORLD_3D, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as World3D?
  }

  /**
   * Forces the transform to update. Transform changes in physics are not instant for performance reasons. Transforms are accumulated and then set. Use this if you need an up-to-date transform when doing physics operations.
   */
  public open fun forceUpdateTransform(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE3D_FORCE_UPDATE_TRANSFORM, NIL)
  }

  /**
   * Updates all the [godot.Node3DGizmo]s attached to this node.
   */
  public open fun updateGizmos(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE3D_UPDATE_GIZMOS, NIL)
  }

  /**
   * Attach a gizmo to this `Node3D`.
   */
  public open fun addGizmo(gizmo: Node3DGizmo): Unit {
    TransferContext.writeArguments(OBJECT to gizmo)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE3D_ADD_GIZMO, NIL)
  }

  /**
   * Returns all the gizmos attached to this `Node3D`.
   */
  public open fun getGizmos(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE3D_GET_GIZMOS, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Clear all gizmos attached to this `Node3D`.
   */
  public open fun clearGizmos(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE3D_CLEAR_GIZMOS, NIL)
  }

  /**
   * Set subgizmo selection for this node in the editor.
   */
  public open fun setSubgizmoSelection(
    gizmo: Node3DGizmo,
    id: Long,
    transform: Transform3D
  ): Unit {
    TransferContext.writeArguments(OBJECT to gizmo, LONG to id, TRANSFORM3D to transform)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE3D_SET_SUBGIZMO_SELECTION, NIL)
  }

  /**
   * Clears subgizmo selection for this node in the editor. Useful when subgizmo IDs become invalid after a property change.
   */
  public open fun clearSubgizmoSelection(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE3D_CLEAR_SUBGIZMO_SELECTION,
        NIL)
  }

  /**
   * Returns `true` if the node is present in the [godot.SceneTree], its [visible] property is `true` and all its antecedents are also visible. If any antecedent is hidden, this node will not be visible in the scene tree.
   */
  public open fun isVisibleInTree(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE3D_IS_VISIBLE_IN_TREE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Enables rendering of this node. Changes [visible] to `true`.
   */
  public open fun show(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE3D_SHOW, NIL)
  }

  /**
   * Disables rendering of this node. Changes [visible] to `false`.
   */
  public open fun hide(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE3D_HIDE, NIL)
  }

  /**
   * Sets whether the node notifies about its local transformation changes. [godot.Node3D] will not propagate this by default.
   */
  public open fun setNotifyLocalTransform(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE3D_SET_NOTIFY_LOCAL_TRANSFORM,
        NIL)
  }

  /**
   * Returns whether node notifies about its local transformation changes. [godot.Node3D] will not propagate this by default.
   */
  public open fun isLocalTransformNotificationEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NODE3D_IS_LOCAL_TRANSFORM_NOTIFICATION_ENABLED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Sets whether the node notifies about its global and local transformation changes. [godot.Node3D] will not propagate this by default, unless it is in the editor context and it has a valid gizmo.
   */
  public open fun setNotifyTransform(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE3D_SET_NOTIFY_TRANSFORM, NIL)
  }

  /**
   * Returns whether the node notifies about its global and local transformation changes. [godot.Node3D] will not propagate this by default.
   */
  public open fun isTransformNotificationEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NODE3D_IS_TRANSFORM_NOTIFICATION_ENABLED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Rotates the local transformation around axis, a unit [godot.core.Vector3], by specified angle in radians.
   */
  public open fun rotate(axis: Vector3, angle: Double): Unit {
    TransferContext.writeArguments(VECTOR3 to axis, DOUBLE to angle)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE3D_ROTATE, NIL)
  }

  /**
   * Rotates the global (world) transformation around axis, a unit [godot.core.Vector3], by specified angle in radians. The rotation axis is in global coordinate system.
   */
  public open fun globalRotate(axis: Vector3, angle: Double): Unit {
    TransferContext.writeArguments(VECTOR3 to axis, DOUBLE to angle)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE3D_GLOBAL_ROTATE, NIL)
  }

  /**
   * Scales the global (world) transformation by the given [godot.core.Vector3] scale factors.
   */
  public open fun globalScale(scale: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to scale)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE3D_GLOBAL_SCALE, NIL)
  }

  /**
   * Moves the global (world) transformation by [godot.core.Vector3] offset. The offset is in global coordinate system.
   */
  public open fun globalTranslate(offset: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to offset)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE3D_GLOBAL_TRANSLATE, NIL)
  }

  /**
   * Rotates the local transformation around axis, a unit [godot.core.Vector3], by specified angle in radians. The rotation axis is in object-local coordinate system.
   */
  public open fun rotateObjectLocal(axis: Vector3, angle: Double): Unit {
    TransferContext.writeArguments(VECTOR3 to axis, DOUBLE to angle)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE3D_ROTATE_OBJECT_LOCAL, NIL)
  }

  /**
   * Scales the local transformation by given 3D scale factors in object-local coordinate system.
   */
  public open fun scaleObjectLocal(scale: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to scale)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE3D_SCALE_OBJECT_LOCAL, NIL)
  }

  /**
   * Changes the node's position by the given offset [godot.core.Vector3] in local space.
   */
  public open fun translateObjectLocal(offset: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to offset)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE3D_TRANSLATE_OBJECT_LOCAL, NIL)
  }

  /**
   * Rotates the local transformation around the X axis by angle in radians.
   */
  public open fun rotateX(angle: Double): Unit {
    TransferContext.writeArguments(DOUBLE to angle)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE3D_ROTATE_X, NIL)
  }

  /**
   * Rotates the local transformation around the Y axis by angle in radians.
   */
  public open fun rotateY(angle: Double): Unit {
    TransferContext.writeArguments(DOUBLE to angle)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE3D_ROTATE_Y, NIL)
  }

  /**
   * Rotates the local transformation around the Z axis by angle in radians.
   */
  public open fun rotateZ(angle: Double): Unit {
    TransferContext.writeArguments(DOUBLE to angle)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE3D_ROTATE_Z, NIL)
  }

  /**
   * Changes the node's position by the given offset [godot.core.Vector3].
   *
   * Note that the translation `offset` is affected by the node's scale, so if scaled by e.g. `(10, 1, 1)`, a translation by an offset of `(2, 0, 0)` would actually add 20 (`2 * 10`) to the X coordinate.
   */
  public open fun translate(offset: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to offset)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE3D_TRANSLATE, NIL)
  }

  /**
   * Resets this node's transformations (like scale, skew and taper) preserving its rotation and translation by performing Gram-Schmidt orthonormalization on this node's [godot.Transform3D].
   */
  public open fun orthonormalize(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE3D_ORTHONORMALIZE, NIL)
  }

  /**
   * Reset all transformations for this node (sets its [godot.Transform3D] to the identity matrix).
   */
  public open fun setIdentity(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE3D_SET_IDENTITY, NIL)
  }

  /**
   * Rotates the node so that the local forward axis (-Z) points toward the `target` position.
   *
   * The local up axis (+Y) points as close to the `up` vector as possible while staying perpendicular to the local forward axis. The resulting transform is orthogonal, and the scale is preserved. Non-uniform scaling may not work correctly.
   *
   * The `target` position cannot be the same as the node's position, the `up` vector cannot be zero, and the direction from the node's position to the `target` vector cannot be parallel to the `up` vector.
   *
   * Operations take place in global space.
   */
  public open fun lookAt(target: Vector3, up: Vector3 = Vector3(0.0, 1.0, 0.0)): Unit {
    TransferContext.writeArguments(VECTOR3 to target, VECTOR3 to up)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE3D_LOOK_AT, NIL)
  }

  /**
   * Moves the node to the specified `position`, and then rotates the node to point toward the `target` as per [lookAt]. Operations take place in global space.
   */
  public open fun lookAtFromPosition(
    position: Vector3,
    target: Vector3,
    up: Vector3 = Vector3(0.0, 1.0, 0.0)
  ): Unit {
    TransferContext.writeArguments(VECTOR3 to position, VECTOR3 to target, VECTOR3 to up)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE3D_LOOK_AT_FROM_POSITION, NIL)
  }

  /**
   * Transforms `global_point` from world space to this node's local space.
   */
  public open fun toLocal(globalPoint: Vector3): Vector3 {
    TransferContext.writeArguments(VECTOR3 to globalPoint)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE3D_TO_LOCAL, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Transforms `local_point` from this node's local space to world space.
   */
  public open fun toGlobal(localPoint: Vector3): Vector3 {
    TransferContext.writeArguments(VECTOR3 to localPoint)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE3D_TO_GLOBAL, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Returns `true` if the property identified by `name` can be reverted to a default value.
   */
  public open fun propertyCanRevert(name: String): Boolean {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE3D_PROPERTY_CAN_REVERT, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the default value of the Node3D property with given `name`.
   */
  public open fun propertyGetRevert(name: String): Any? {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE3D_PROPERTY_GET_REVERT, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  public enum class RotationEditMode(
    id: Long
  ) {
    /**
     *
     */
    ROTATION_EDIT_MODE_EULER(0),
    /**
     *
     */
    ROTATION_EDIT_MODE_QUATERNION(1),
    /**
     *
     */
    ROTATION_EDIT_MODE_BASIS(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class RotationOrder(
    id: Long
  ) {
    /**
     *
     */
    ROTATION_ORDER_XYZ(0),
    /**
     *
     */
    ROTATION_ORDER_XZY(1),
    /**
     *
     */
    ROTATION_ORDER_YXZ(2),
    /**
     *
     */
    ROTATION_ORDER_YZX(3),
    /**
     *
     */
    ROTATION_ORDER_ZXY(4),
    /**
     *
     */
    ROTATION_ORDER_ZYX(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object {
    /**
     * Node3D nodes receives this notification when their global transform changes. This means that either the current or a parent node changed its transform.
     *
     * In order for [NOTIFICATION_TRANSFORM_CHANGED] to work, users first need to ask for it, with [setNotifyTransform]. The notification is also sent if the node is in the editor context and it has at least one valid gizmo.
     */
    public final const val NOTIFICATION_TRANSFORM_CHANGED: Long = 2000

    /**
     * Node3D nodes receives this notification when they are registered to new [godot.World3D] resource.
     */
    public final const val NOTIFICATION_ENTER_WORLD: Long = 41

    /**
     * Node3D nodes receives this notification when they are unregistered from current [godot.World3D] resource.
     */
    public final const val NOTIFICATION_EXIT_WORLD: Long = 42

    /**
     * Node3D nodes receives this notification when their visibility changes.
     */
    public final const val NOTIFICATION_VISIBILITY_CHANGED: Long = 43
  }
}
