// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.Transform
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.TRANSFORM
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Most basic 3D game object, parent of all 3D-related nodes.
 *
 * Tutorials:
 * [https://github.com/godotengine/godot-demo-projects/tree/master/3d](https://github.com/godotengine/godot-demo-projects/tree/master/3d)
 *
 * Most basic 3D game object, with a 3D [godot.core.Transform] and visibility settings. All other 3D game objects inherit from Spatial. Use [godot.Spatial] as a parent node to move, scale, rotate and show/hide children in a 3D project.
 *
 * Affine operations (rotate, scale, translate) happen in parent's local coordinate system, unless the [godot.Spatial] object is set as top-level. Affine operations in this coordinate system correspond to direct affine operations on the [godot.Spatial]'s transform. The word local below refers to this coordinate system. The coordinate system that is attached to the [godot.Spatial] object itself is referred to as object-local coordinate system.
 *
 * **Note:** Unless otherwise specified, all methods that have angle parameters must have angles specified as *radians*. To convert degrees to radians, use [@GDScript.deg2rad].
 */
@GodotBaseType
public open class Spatial : Node() {
  /**
   * Emitted by portal system gameplay monitor when a node enters the gameplay area.
   */
  public val gameplayEntered: Signal0 by signal()

  /**
   * Emitted by portal system gameplay monitor when a node exits the gameplay area.
   */
  public val gameplayExited: Signal0 by signal()

  /**
   * Emitted when node visibility changes.
   */
  public val visibilityChanged: Signal0 by signal()

  /**
   * The [godot.SpatialGizmo] for this node. Used for example in [godot.EditorSpatialGizmo] as custom visualization and editing handles in Editor.
   */
  public open var gizmo: SpatialGizmo?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_GET_GIZMO, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as SpatialGizmo?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_SET_GIZMO, NIL)
    }

  /**
   * World space (global) [godot.core.Transform] of this node.
   */
  public open var globalTransform: Transform
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_GET_GLOBAL_TRANSFORM,
          TRANSFORM)
      return TransferContext.readReturnValue(TRANSFORM, false) as Transform
    }
    set(`value`) {
      TransferContext.writeArguments(TRANSFORM to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_SET_GLOBAL_TRANSFORM, NIL)
    }

  /**
   * Rotation part of the local transformation in radians, specified in terms of YXZ-Euler angles in the format (X angle, Y angle, Z angle).
   *
   * **Note:** In the mathematical sense, rotation is a matrix and not a vector. The three Euler angles, which are the three independent parameters of the Euler-angle parametrization of the rotation matrix, are stored in a [godot.core.Vector3] data structure not because the rotation is a vector, but only because [godot.core.Vector3] exists as a convenient data-structure to store 3 floating-point numbers. Therefore, applying affine operations on the rotation "vector" is not meaningful.
   */
  public open var rotation: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_GET_ROTATION, VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_SET_ROTATION, NIL)
    }

  /**
   * Rotation part of the local transformation in degrees, specified in terms of YXZ-Euler angles in the format (X angle, Y angle, Z angle).
   */
  public open var rotationDegrees: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_GET_ROTATION_DEGREES,
          VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_SET_ROTATION_DEGREES, NIL)
    }

  /**
   * Scale part of the local transformation.
   *
   * **Note:** Mixed negative scales in 3D are not decomposable from the transformation matrix. Due to the way scale is represented with transformation matrices in Godot, the scale values will either be all positive or all negative.
   */
  public open var scale: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_GET_SCALE, VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_SET_SCALE, NIL)
    }

  /**
   * Local space [godot.core.Transform] of this node, with respect to the parent node.
   */
  public open var transform: Transform
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_GET_TRANSFORM, TRANSFORM)
      return TransferContext.readReturnValue(TRANSFORM, false) as Transform
    }
    set(`value`) {
      TransferContext.writeArguments(TRANSFORM to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_SET_TRANSFORM, NIL)
    }

  /**
   * Local translation of this node.
   */
  public open var translation: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_GET_TRANSLATION, VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_SET_TRANSLATION, NIL)
    }

  /**
   * If `true`, this node is drawn. The node is only visible if all of its antecedents are visible as well (in other words, [isVisibleInTree] must return `true`).
   */
  public open var visible: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_GET_VISIBLE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_SET_VISIBLE, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_SPATIAL)
  }

  @CoreTypeHelper
  public open fun globalTransform(schedule: Transform.() -> Unit): Transform =
      globalTransform.apply{
      schedule(this)
      globalTransform = this
  }


  @CoreTypeHelper
  public open fun rotation(schedule: Vector3.() -> Unit): Vector3 = rotation.apply{
      schedule(this)
      rotation = this
  }


  @CoreTypeHelper
  public open fun rotationDegrees(schedule: Vector3.() -> Unit): Vector3 = rotationDegrees.apply{
      schedule(this)
      rotationDegrees = this
  }


  @CoreTypeHelper
  public open fun scale(schedule: Vector3.() -> Unit): Vector3 = scale.apply{
      schedule(this)
      scale = this
  }


  @CoreTypeHelper
  public open fun transform(schedule: Transform.() -> Unit): Transform = transform.apply{
      schedule(this)
      transform = this
  }


  @CoreTypeHelper
  public open fun translation(schedule: Vector3.() -> Unit): Vector3 = translation.apply{
      schedule(this)
      translation = this
  }


  public open fun _updateGizmo(): Unit {
  }

  /**
   * Forces the transform to update. Transform changes in physics are not instant for performance reasons. Transforms are accumulated and then set. Use this if you need an up-to-date transform when doing physics operations.
   */
  public open fun forceUpdateTransform(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_FORCE_UPDATE_TRANSFORM, NIL)
  }

  /**
   * When using physics interpolation, there will be circumstances in which you want to know the interpolated (displayed) transform of a node rather than the standard transform (which may only be accurate to the most recent physics tick).
   *
   * This is particularly important for frame-based operations that take place in [godot.Node.Process], rather than [godot.Node.PhysicsProcess]. Examples include [godot.Camera]s focusing on a node, or finding where to fire lasers from on a frame rather than physics tick.
   */
  public open fun getGlobalTransformInterpolated(): Transform {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SPATIAL_GET_GLOBAL_TRANSFORM_INTERPOLATED, TRANSFORM)
    return TransferContext.readReturnValue(TRANSFORM, false) as Transform
  }

  /**
   * Returns the parent [godot.Spatial], or an empty [godot.Object] if no parent exists or parent is not of type [godot.Spatial].
   */
  public open fun getParentSpatial(): Spatial? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_GET_PARENT_SPATIAL, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Spatial?
  }

  /**
   * Returns the current [godot.World] resource this [godot.Spatial] node is registered to.
   */
  public open fun getWorld(): World? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_GET_WORLD, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as World?
  }

  /**
   * Rotates the global (world) transformation around axis, a unit [godot.core.Vector3], by specified angle in radians. The rotation axis is in global coordinate system.
   */
  public open fun globalRotate(axis: Vector3, angle: Double): Unit {
    TransferContext.writeArguments(VECTOR3 to axis, DOUBLE to angle)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_GLOBAL_ROTATE, NIL)
  }

  /**
   * Scales the global (world) transformation by the given [godot.core.Vector3] scale factors.
   */
  public open fun globalScale(scale: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to scale)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_GLOBAL_SCALE, NIL)
  }

  /**
   * Moves the global (world) transformation by [godot.core.Vector3] offset. The offset is in global coordinate system.
   */
  public open fun globalTranslate(offset: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to offset)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_GLOBAL_TRANSLATE, NIL)
  }

  /**
   * Disables rendering of this node. Changes [visible] to `false`.
   */
  public open fun hide(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_HIDE, NIL)
  }

  /**
   * Returns whether node notifies about its local transformation changes. [godot.Spatial] will not propagate this by default.
   */
  public open fun isLocalTransformNotificationEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SPATIAL_IS_LOCAL_TRANSFORM_NOTIFICATION_ENABLED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns whether this node uses a scale of `(1, 1, 1)` or its local transformation scale.
   */
  public open fun isScaleDisabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_IS_SCALE_DISABLED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns whether this node is set as Toplevel, that is whether it ignores its parent nodes transformations.
   */
  public open fun isSetAsToplevel(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_IS_SET_AS_TOPLEVEL, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns whether the node notifies about its global and local transformation changes. [godot.Spatial] will not propagate this by default.
   */
  public open fun isTransformNotificationEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SPATIAL_IS_TRANSFORM_NOTIFICATION_ENABLED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the node is present in the [godot.SceneTree], its [visible] property is `true` and all its antecedents are also visible. If any antecedent is hidden, this node will not be visible in the scene tree.
   */
  public open fun isVisibleInTree(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_IS_VISIBLE_IN_TREE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
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
  public open fun lookAt(target: Vector3, up: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to target, VECTOR3 to up)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_LOOK_AT, NIL)
  }

  /**
   * Moves the node to the specified `position`, and then rotates itself to point toward the `target` as per [lookAt]. Operations take place in global space.
   */
  public open fun lookAtFromPosition(
    position: Vector3,
    target: Vector3,
    up: Vector3
  ): Unit {
    TransferContext.writeArguments(VECTOR3 to position, VECTOR3 to target, VECTOR3 to up)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_LOOK_AT_FROM_POSITION, NIL)
  }

  /**
   * Resets this node's transformations (like scale, skew and taper) preserving its rotation and translation by performing Gram-Schmidt orthonormalization on this node's [godot.core.Transform].
   */
  public open fun orthonormalize(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_ORTHONORMALIZE, NIL)
  }

  /**
   * Rotates the local transformation around axis, a unit [godot.core.Vector3], by specified angle in radians.
   */
  public open fun rotate(axis: Vector3, angle: Double): Unit {
    TransferContext.writeArguments(VECTOR3 to axis, DOUBLE to angle)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_ROTATE, NIL)
  }

  /**
   * Rotates the local transformation around axis, a unit [godot.core.Vector3], by specified angle in radians. The rotation axis is in object-local coordinate system.
   */
  public open fun rotateObjectLocal(axis: Vector3, angle: Double): Unit {
    TransferContext.writeArguments(VECTOR3 to axis, DOUBLE to angle)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_ROTATE_OBJECT_LOCAL, NIL)
  }

  /**
   * Rotates the local transformation around the X axis by angle in radians.
   */
  public open fun rotateX(angle: Double): Unit {
    TransferContext.writeArguments(DOUBLE to angle)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_ROTATE_X, NIL)
  }

  /**
   * Rotates the local transformation around the Y axis by angle in radians.
   */
  public open fun rotateY(angle: Double): Unit {
    TransferContext.writeArguments(DOUBLE to angle)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_ROTATE_Y, NIL)
  }

  /**
   * Rotates the local transformation around the Z axis by angle in radians.
   */
  public open fun rotateZ(angle: Double): Unit {
    TransferContext.writeArguments(DOUBLE to angle)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_ROTATE_Z, NIL)
  }

  /**
   * Scales the local transformation by given 3D scale factors in object-local coordinate system.
   */
  public open fun scaleObjectLocal(scale: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to scale)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_SCALE_OBJECT_LOCAL, NIL)
  }

  /**
   * Makes the node ignore its parents transformations. Node transformations are only in global space.
   */
  public open fun setAsToplevel(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_SET_AS_TOPLEVEL, NIL)
  }

  /**
   * Sets whether the node uses a scale of `(1, 1, 1)` or its local transformation scale. Changes to the local transformation scale are preserved.
   */
  public open fun setDisableScale(disable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to disable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_SET_DISABLE_SCALE, NIL)
  }

  /**
   * Reset all transformations for this node (sets its [godot.core.Transform] to the identity matrix).
   */
  public open fun setIdentity(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_SET_IDENTITY, NIL)
  }

  /**
   * Sets whether the node ignores notification that its transformation (global or local) changed.
   */
  public open fun setIgnoreTransformNotification(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SPATIAL_SET_IGNORE_TRANSFORM_NOTIFICATION, NIL)
  }

  /**
   * Sets whether the node notifies about its local transformation changes. [godot.Spatial] will not propagate this by default.
   */
  public open fun setNotifyLocalTransform(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_SET_NOTIFY_LOCAL_TRANSFORM,
        NIL)
  }

  /**
   * Sets whether the node notifies about its global and local transformation changes. [godot.Spatial] will not propagate this by default, unless it is in the editor context and it has a valid gizmo.
   */
  public open fun setNotifyTransform(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_SET_NOTIFY_TRANSFORM, NIL)
  }

  /**
   * Enables rendering of this node. Changes [visible] to `true`.
   */
  public open fun show(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_SHOW, NIL)
  }

  /**
   * Transforms `local_point` from this node's local space to world space.
   */
  public open fun toGlobal(localPoint: Vector3): Vector3 {
    TransferContext.writeArguments(VECTOR3 to localPoint)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_TO_GLOBAL, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Transforms `global_point` from world space to this node's local space.
   */
  public open fun toLocal(globalPoint: Vector3): Vector3 {
    TransferContext.writeArguments(VECTOR3 to globalPoint)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_TO_LOCAL, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Changes the node's position by the given offset [godot.core.Vector3].
   *
   * Note that the translation `offset` is affected by the node's scale, so if scaled by e.g. `(10, 1, 1)`, a translation by an offset of `(2, 0, 0)` would actually add 20 (`2 * 10`) to the X coordinate.
   */
  public open fun translate(offset: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to offset)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_TRANSLATE, NIL)
  }

  /**
   * Changes the node's position by the given offset [godot.core.Vector3] in local space.
   */
  public open fun translateObjectLocal(offset: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to offset)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_TRANSLATE_OBJECT_LOCAL, NIL)
  }

  /**
   * Updates the [godot.SpatialGizmo] of this node.
   */
  public open fun updateGizmo(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_UPDATE_GIZMO, NIL)
  }

  public companion object {
    /**
     * Spatial nodes receives this notification if the portal system gameplay monitor detects they have entered the gameplay area.
     */
    public final const val NOTIFICATION_ENTER_GAMEPLAY: Long = 45

    /**
     * Spatial nodes receives this notification when they are registered to new [godot.World] resource.
     */
    public final const val NOTIFICATION_ENTER_WORLD: Long = 41

    /**
     * Spatial nodes receives this notification if the portal system gameplay monitor detects they have exited the gameplay area.
     */
    public final const val NOTIFICATION_EXIT_GAMEPLAY: Long = 46

    /**
     * Spatial nodes receives this notification when they are unregistered from current [godot.World] resource.
     */
    public final const val NOTIFICATION_EXIT_WORLD: Long = 42

    /**
     * Spatial nodes receives this notification when their global transform changes. This means that either the current or a parent node changed its transform.
     *
     * In order for [NOTIFICATION_TRANSFORM_CHANGED] to work, users first need to ask for it, with [setNotifyTransform]. The notification is also sent if the node is in the editor context and it has a valid gizmo.
     */
    public final const val NOTIFICATION_TRANSFORM_CHANGED: Long = 2000

    /**
     * Spatial nodes receives this notification when their visibility changes.
     */
    public final const val NOTIFICATION_VISIBILITY_CHANGED: Long = 43
  }
}
