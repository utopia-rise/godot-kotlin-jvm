// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.GodotBaseType
import godot.core.RID
import godot.core.TransferContext
import godot.core.Transform
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.TRANSFORM
import godot.core.VariantType.VECTOR2
import godot.core.VariantType.VECTOR3
import godot.core.VariantType._RID
import godot.core.Vector2
import godot.core.Vector3
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Camera node, displays from a point of view.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/678](https://godotengine.org/asset-library/asset/678)
 *
 * Camera is a special node that displays what is visible from its current location. Cameras register themselves in the nearest [godot.Viewport] node (when ascending the tree). Only one camera can be active per viewport. If no viewport is available ascending the tree, the camera will register in the global viewport. In other words, a camera just provides 3D display capabilities to a [godot.Viewport], and, without one, a scene registered in that [godot.Viewport] (or higher viewports) can't be displayed.
 */
@GodotBaseType
public open class Camera : Spatial() {
  /**
   * The culling mask that describes which 3D render layers are rendered by this camera.
   */
  public open var cullMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_GET_CULL_MASK, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_SET_CULL_MASK, NIL)
    }

  /**
   * If `true`, the ancestor [godot.Viewport] is currently using this camera.
   */
  public open var current: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_GET_CURRENT, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_SET_CURRENT, NIL)
    }

  /**
   * If not [DOPPLER_TRACKING_DISABLED], this camera will simulate the [godot.Doppler effect](https://en.wikipedia.org/wiki/Doppler_effect) for objects changed in particular `_process` methods. The Doppler effect is only simulated for [godot.AudioStreamPlayer3D] nodes that have [godot.AudioStreamPlayer3D.dopplerTracking] set to a value other than [godot.AudioStreamPlayer3D.DOPPLER_TRACKING_DISABLED].
   *
   * **Note:** To toggle the Doppler effect preview in the editor, use the Perspective menu in the top-left corner of the 3D viewport and toggle **Enable Doppler**.
   */
  public open var dopplerTracking: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_GET_DOPPLER_TRACKING, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_SET_DOPPLER_TRACKING, NIL)
    }

  /**
   * The [godot.Environment] to use for this camera.
   */
  public open var environment: Environment?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_GET_ENVIRONMENT, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Environment?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_SET_ENVIRONMENT, NIL)
    }

  /**
   * The distance to the far culling boundary for this camera relative to its local Z axis.
   */
  public open var far: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_GET_FAR, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_SET_FAR, NIL)
    }

  /**
   * The camera's field of view angle (in degrees). Only applicable in perspective mode. Since [keepAspect] locks one axis, `fov` sets the other axis' field of view angle.
   *
   * For reference, the default vertical field of view value (`70.0`) is equivalent to a horizontal FOV of:
   *
   * - ~86.07 degrees in a 4:3 viewport
   *
   * - ~96.50 degrees in a 16:10 viewport
   *
   * - ~102.45 degrees in a 16:9 viewport
   *
   * - ~117.06 degrees in a 21:9 viewport
   */
  public open var fov: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_GET_FOV, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_SET_FOV, NIL)
    }

  /**
   * The camera's frustum offset. This can be changed from the default to create "tilted frustum" effects such as [godot.Y-shearing](https://zdoom.org/wiki/Y-shearing).
   */
  public open var frustumOffset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_GET_FRUSTUM_OFFSET,
          VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_SET_FRUSTUM_OFFSET, NIL)
    }

  /**
   * The horizontal (X) offset of the camera viewport.
   */
  public open var hOffset: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_GET_H_OFFSET, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_SET_H_OFFSET, NIL)
    }

  /**
   * The axis to lock during [fov]/[size] adjustments. Can be either [KEEP_WIDTH] or [KEEP_HEIGHT].
   */
  public open var keepAspect: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_GET_KEEP_ASPECT, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_SET_KEEP_ASPECT, NIL)
    }

  /**
   * The distance to the near culling boundary for this camera relative to its local Z axis.
   */
  public open var near: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_GET_NEAR, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_SET_NEAR, NIL)
    }

  /**
   * The camera's projection mode. In [PROJECTION_PERSPECTIVE] mode, objects' Z distance from the camera's local space scales their perceived size.
   */
  public open var projection: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_GET_PROJECTION, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_SET_PROJECTION, NIL)
    }

  /**
   * The camera's size measured as 1/2 the width or height. Only applicable in orthogonal and frustum modes. Since [keepAspect] locks on axis, `size` sets the other axis' size length.
   */
  public open var size: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_GET_SIZE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_SET_SIZE, NIL)
    }

  /**
   * The vertical (Y) offset of the camera viewport.
   */
  public open var vOffset: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_GET_V_OFFSET, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_SET_V_OFFSET, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_CAMERA)
  }

  @CoreTypeHelper
  public open fun frustumOffset(schedule: Vector2.() -> Unit): Vector2 = frustumOffset.apply{
      schedule(this)
      frustumOffset = this
  }


  /**
   * If this is the current camera, remove it from being current. If `enable_next` is `true`, request to make the next camera current, if any.
   */
  public open fun clearCurrent(enableNext: Boolean = true): Unit {
    TransferContext.writeArguments(BOOL to enableNext)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_CLEAR_CURRENT, NIL)
  }

  /**
   * Returns the camera's RID from the [godot.VisualServer].
   */
  public open fun getCameraRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_GET_CAMERA_RID, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Returns the transform of the camera plus the vertical ([vOffset]) and horizontal ([hOffset]) offsets; and any other adjustments made to the position and orientation of the camera by subclassed cameras such as [godot.ClippedCamera], [godot.InterpolatedCamera] and [godot.ARVRCamera].
   */
  public open fun getCameraTransform(): Transform {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_GET_CAMERA_TRANSFORM,
        TRANSFORM)
    return TransferContext.readReturnValue(TRANSFORM, false) as Transform
  }

  /**
   * Returns `true` if the given `layer` in the [cullMask] is enabled, `false` otherwise.
   */
  public open fun getCullMaskBit(layer: Long): Boolean {
    TransferContext.writeArguments(LONG to layer)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_GET_CULL_MASK_BIT, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the camera's frustum planes in world space units as an array of [godot.core.Plane]s in the following order: near, far, left, top, right, bottom. Not to be confused with [frustumOffset].
   */
  public open fun getFrustum(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_GET_FRUSTUM, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns `true` if the given position is behind the camera.
   *
   * **Note:** A position which returns `false` may still be outside the camera's field of view.
   */
  public open fun isPositionBehind(worldPoint: Vector3): Boolean {
    TransferContext.writeArguments(VECTOR3 to worldPoint)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_IS_POSITION_BEHIND, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Makes this camera the current camera for the [godot.Viewport] (see class description). If the camera node is outside the scene tree, it will attempt to become current once it's added.
   */
  public open fun makeCurrent(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_MAKE_CURRENT, NIL)
  }

  /**
   * Returns a normal vector from the screen point location directed along the camera. Orthogonal cameras are normalized. Perspective cameras account for perspective, screen width/height, etc.
   */
  public open fun projectLocalRayNormal(screenPoint: Vector2): Vector3 {
    TransferContext.writeArguments(VECTOR2 to screenPoint)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_PROJECT_LOCAL_RAY_NORMAL,
        VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Returns the 3D point in world space that maps to the given 2D coordinate in the [godot.Viewport] rectangle on a plane that is the given `z_depth` distance into the scene away from the camera.
   */
  public open fun projectPosition(screenPoint: Vector2, zDepth: Double): Vector3 {
    TransferContext.writeArguments(VECTOR2 to screenPoint, DOUBLE to zDepth)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_PROJECT_POSITION, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Returns a normal vector in world space, that is the result of projecting a point on the [godot.Viewport] rectangle by the inverse camera projection. This is useful for casting rays in the form of (origin, normal) for object intersection or picking.
   */
  public open fun projectRayNormal(screenPoint: Vector2): Vector3 {
    TransferContext.writeArguments(VECTOR2 to screenPoint)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_PROJECT_RAY_NORMAL, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Returns a 3D position in world space, that is the result of projecting a point on the [godot.Viewport] rectangle by the inverse camera projection. This is useful for casting rays in the form of (origin, normal) for object intersection or picking.
   */
  public open fun projectRayOrigin(screenPoint: Vector2): Vector3 {
    TransferContext.writeArguments(VECTOR2 to screenPoint)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_PROJECT_RAY_ORIGIN, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Enables or disables the given `layer` in the [cullMask].
   */
  public open fun setCullMaskBit(layer: Long, enable: Boolean): Unit {
    TransferContext.writeArguments(LONG to layer, BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_SET_CULL_MASK_BIT, NIL)
  }

  /**
   * Sets the camera projection to frustum mode (see [PROJECTION_FRUSTUM]), by specifying a `size`, an `offset`, and the `z_near` and `z_far` clip planes in world space units.
   */
  public open fun setFrustum(
    size: Double,
    offset: Vector2,
    zNear: Double,
    zFar: Double
  ): Unit {
    TransferContext.writeArguments(DOUBLE to size, VECTOR2 to offset, DOUBLE to zNear, DOUBLE to
        zFar)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_SET_FRUSTUM, NIL)
  }

  /**
   * Sets the camera projection to orthogonal mode (see [PROJECTION_ORTHOGONAL]), by specifying a `size`, and the `z_near` and `z_far` clip planes in world space units. (As a hint, 2D games often use this projection, with values specified in pixels.)
   */
  public open fun setOrthogonal(
    size: Double,
    zNear: Double,
    zFar: Double
  ): Unit {
    TransferContext.writeArguments(DOUBLE to size, DOUBLE to zNear, DOUBLE to zFar)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_SET_ORTHOGONAL, NIL)
  }

  /**
   * Sets the camera projection to perspective mode (see [PROJECTION_PERSPECTIVE]), by specifying a `fov` (field of view) angle in degrees, and the `z_near` and `z_far` clip planes in world space units.
   */
  public open fun setPerspective(
    fov: Double,
    zNear: Double,
    zFar: Double
  ): Unit {
    TransferContext.writeArguments(DOUBLE to fov, DOUBLE to zNear, DOUBLE to zFar)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_SET_PERSPECTIVE, NIL)
  }

  /**
   * Returns the 2D coordinate in the [godot.Viewport] rectangle that maps to the given 3D point in world space.
   *
   * **Note:** When using this to position GUI elements over a 3D viewport, use [isPositionBehind] to prevent them from appearing if the 3D point is behind the camera:
   *
   * ```
   * 				# This code block is part of a script that inherits from Spatial.
   * 				# `control` is a reference to a node inheriting from Control.
   * 				control.visible = not get_viewport().get_camera().is_position_behind(global_transform.origin)
   * 				control.rect_position = get_viewport().get_camera().unproject_position(global_transform.origin)
   * 				```
   */
  public open fun unprojectPosition(worldPoint: Vector3): Vector2 {
    TransferContext.writeArguments(VECTOR3 to worldPoint)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_UNPROJECT_POSITION, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  public enum class KeepAspect(
    id: Long
  ) {
    /**
     * Preserves the horizontal aspect ratio; also known as Vert- scaling. This is usually the best option for projects running in portrait mode, as taller aspect ratios will benefit from a wider vertical FOV.
     */
    KEEP_WIDTH(0),
    /**
     * Preserves the vertical aspect ratio; also known as Hor+ scaling. This is usually the best option for projects running in landscape mode, as wider aspect ratios will automatically benefit from a wider horizontal FOV.
     */
    KEEP_HEIGHT(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class Projection(
    id: Long
  ) {
    /**
     * Perspective projection. Objects on the screen becomes smaller when they are far away.
     */
    PROJECTION_PERSPECTIVE(0),
    /**
     * Orthogonal projection, also known as orthographic projection. Objects remain the same size on the screen no matter how far away they are.
     */
    PROJECTION_ORTHOGONAL(1),
    /**
     * Frustum projection. This mode allows adjusting [frustumOffset] to create "tilted frustum" effects.
     */
    PROJECTION_FRUSTUM(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class DopplerTracking(
    id: Long
  ) {
    /**
     * Disables [godot.Doppler effect](https://en.wikipedia.org/wiki/Doppler_effect) simulation (default).
     */
    DOPPLER_TRACKING_DISABLED(0),
    /**
     * Simulate [godot.Doppler effect](https://en.wikipedia.org/wiki/Doppler_effect) by tracking positions of objects that are changed in `_process`. Changes in the relative velocity of this camera compared to those objects affect how audio is perceived (changing the audio's [godot.AudioStreamPlayer3D.pitchScale]).
     */
    DOPPLER_TRACKING_IDLE_STEP(1),
    /**
     * Simulate [godot.Doppler effect](https://en.wikipedia.org/wiki/Doppler_effect) by tracking positions of objects that are changed in `_physics_process`. Changes in the relative velocity of this camera compared to those objects affect how audio is perceived (changing the audio's [godot.AudioStreamPlayer3D.pitchScale]).
     */
    DOPPLER_TRACKING_PHYSICS_STEP(2),
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
     * Disables [godot.Doppler effect](https://en.wikipedia.org/wiki/Doppler_effect) simulation (default).
     */
    public final const val DOPPLER_TRACKING_DISABLED: Long = 0

    /**
     * Simulate [godot.Doppler effect](https://en.wikipedia.org/wiki/Doppler_effect) by tracking positions of objects that are changed in `_process`. Changes in the relative velocity of this camera compared to those objects affect how audio is perceived (changing the audio's [godot.AudioStreamPlayer3D.pitchScale]).
     */
    public final const val DOPPLER_TRACKING_IDLE_STEP: Long = 1

    /**
     * Simulate [godot.Doppler effect](https://en.wikipedia.org/wiki/Doppler_effect) by tracking positions of objects that are changed in `_physics_process`. Changes in the relative velocity of this camera compared to those objects affect how audio is perceived (changing the audio's [godot.AudioStreamPlayer3D.pitchScale]).
     */
    public final const val DOPPLER_TRACKING_PHYSICS_STEP: Long = 2

    /**
     * Preserves the vertical aspect ratio; also known as Hor+ scaling. This is usually the best option for projects running in landscape mode, as wider aspect ratios will automatically benefit from a wider horizontal FOV.
     */
    public final const val KEEP_HEIGHT: Long = 1

    /**
     * Preserves the horizontal aspect ratio; also known as Vert- scaling. This is usually the best option for projects running in portrait mode, as taller aspect ratios will benefit from a wider vertical FOV.
     */
    public final const val KEEP_WIDTH: Long = 0

    /**
     * Frustum projection. This mode allows adjusting [frustumOffset] to create "tilted frustum" effects.
     */
    public final const val PROJECTION_FRUSTUM: Long = 2

    /**
     * Orthogonal projection, also known as orthographic projection. Objects remain the same size on the screen no matter how far away they are.
     */
    public final const val PROJECTION_ORTHOGONAL: Long = 1

    /**
     * Perspective projection. Objects on the screen becomes smaller when they are far away.
     */
    public final const val PROJECTION_PERSPECTIVE: Long = 0
  }
}
