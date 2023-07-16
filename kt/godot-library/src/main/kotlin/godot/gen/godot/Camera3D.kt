// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Plane
import godot.core.RID
import godot.core.Transform3D
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.TRANSFORM3D
import godot.core.VariantType.VECTOR2
import godot.core.VariantType.VECTOR3
import godot.core.VariantType._RID
import godot.core.Vector2
import godot.core.Vector3
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Camera node, displays from a point of view.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/678](https://godotengine.org/asset-library/asset/678)
 *
 * [godot.Camera3D] is a special node that displays what is visible from its current location. Cameras register themselves in the nearest [godot.Viewport] node (when ascending the tree). Only one camera can be active per viewport. If no viewport is available ascending the tree, the camera will register in the global viewport. In other words, a camera just provides 3D display capabilities to a [godot.Viewport], and, without one, a scene registered in that [godot.Viewport] (or higher viewports) can't be displayed.
 */
@GodotBaseType
public open class Camera3D : Node3D() {
  /**
   * The axis to lock during [fov]/[size] adjustments. Can be either [KEEP_WIDTH] or [KEEP_HEIGHT].
   */
  public var keepAspect: KeepAspect
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA3D_GET_KEEP_ASPECT_MODE,
          LONG)
      return Camera3D.KeepAspect.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA3D_SET_KEEP_ASPECT_MODE,
          NIL)
    }

  /**
   * The culling mask that describes which 3D render layers are rendered by this camera.
   */
  public var cullMask: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA3D_GET_CULL_MASK, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA3D_SET_CULL_MASK, NIL)
    }

  /**
   * The [godot.Environment] to use for this camera.
   */
  public var environment: Environment?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA3D_GET_ENVIRONMENT, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Environment?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA3D_SET_ENVIRONMENT, NIL)
    }

  /**
   * The [godot.CameraAttributes] to use for this camera.
   */
  public var attributes: Material?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA3D_GET_ATTRIBUTES, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Material?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA3D_SET_ATTRIBUTES, NIL)
    }

  /**
   * The horizontal (X) offset of the camera viewport.
   */
  public var hOffset: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA3D_GET_H_OFFSET, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA3D_SET_H_OFFSET, NIL)
    }

  /**
   * The vertical (Y) offset of the camera viewport.
   */
  public var vOffset: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA3D_GET_V_OFFSET, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA3D_SET_V_OFFSET, NIL)
    }

  /**
   * If not [DOPPLER_TRACKING_DISABLED], this camera will simulate the [godot.Doppler effect](https://en.wikipedia.org/wiki/Doppler_effect) for objects changed in particular `_process` methods. See [enum DopplerTracking] for possible values.
   */
  public var dopplerTracking: DopplerTracking
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA3D_GET_DOPPLER_TRACKING,
          LONG)
      return Camera3D.DopplerTracking.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA3D_SET_DOPPLER_TRACKING,
          NIL)
    }

  /**
   * The camera's projection mode. In [PROJECTION_PERSPECTIVE] mode, objects' Z distance from the camera's local space scales their perceived size.
   */
  public var projection: ProjectionType
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA3D_GET_PROJECTION, LONG)
      return Camera3D.ProjectionType.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA3D_SET_PROJECTION, NIL)
    }

  /**
   * If `true`, the ancestor [godot.Viewport] is currently using this camera.
   *
   * If multiple cameras are in the scene, one will always be made current. For example, if two [godot.Camera3D] nodes are present in the scene and only one is current, setting one camera's [current] to `false` will cause the other camera to be made current.
   */
  public var current: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA3D_IS_CURRENT, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA3D_SET_CURRENT, NIL)
    }

  /**
   * The camera's field of view angle (in degrees). Only applicable in perspective mode. Since [keepAspect] locks one axis, `fov` sets the other axis' field of view angle.
   *
   * For reference, the default vertical field of view value (`75.0`) is equivalent to a horizontal FOV of:
   *
   * - ~91.31 degrees in a 4:3 viewport
   *
   * - ~101.67 degrees in a 16:10 viewport
   *
   * - ~107.51 degrees in a 16:9 viewport
   *
   * - ~121.63 degrees in a 21:9 viewport
   */
  public var fov: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA3D_GET_FOV, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA3D_SET_FOV, NIL)
    }

  /**
   * The camera's size in meters measured as the diameter of the width or height, depending on [keepAspect]. Only applicable in orthogonal and frustum modes.
   */
  public var size: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA3D_GET_SIZE, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA3D_SET_SIZE, NIL)
    }

  /**
   * The camera's frustum offset. This can be changed from the default to create "tilted frustum" effects such as [godot.Y-shearing](https://zdoom.org/wiki/Y-shearing).
   *
   * **Note:** Only effective if [projection] is [PROJECTION_FRUSTUM].
   */
  public var frustumOffset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA3D_GET_FRUSTUM_OFFSET,
          VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA3D_SET_FRUSTUM_OFFSET, NIL)
    }

  /**
   * The distance to the near culling boundary for this camera relative to its local Z axis.
   */
  public var near: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA3D_GET_NEAR, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA3D_SET_NEAR, NIL)
    }

  /**
   * The distance to the far culling boundary for this camera relative to its local Z axis.
   */
  public var far: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA3D_GET_FAR, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA3D_SET_FAR, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_CAMERA3D, scriptIndex)
    return true
  }

  /**
   * Returns a normal vector in world space, that is the result of projecting a point on the [godot.Viewport] rectangle by the inverse camera projection. This is useful for casting rays in the form of (origin, normal) for object intersection or picking.
   */
  public fun projectRayNormal(screenPoint: Vector2): Vector3 {
    TransferContext.writeArguments(VECTOR2 to screenPoint)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA3D_PROJECT_RAY_NORMAL,
        VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  /**
   * Returns a normal vector from the screen point location directed along the camera. Orthogonal cameras are normalized. Perspective cameras account for perspective, screen width/height, etc.
   */
  public fun projectLocalRayNormal(screenPoint: Vector2): Vector3 {
    TransferContext.writeArguments(VECTOR2 to screenPoint)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA3D_PROJECT_LOCAL_RAY_NORMAL,
        VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  /**
   * Returns a 3D position in world space, that is the result of projecting a point on the [godot.Viewport] rectangle by the inverse camera projection. This is useful for casting rays in the form of (origin, normal) for object intersection or picking.
   */
  public fun projectRayOrigin(screenPoint: Vector2): Vector3 {
    TransferContext.writeArguments(VECTOR2 to screenPoint)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA3D_PROJECT_RAY_ORIGIN,
        VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  /**
   * Returns the 2D coordinate in the [godot.Viewport] rectangle that maps to the given 3D point in world space.
   *
   * **Note:** When using this to position GUI elements over a 3D viewport, use [isPositionBehind] to prevent them from appearing if the 3D point is behind the camera:
   *
   * ```
   * 				# This code block is part of a script that inherits from Node3D.
   * 				# `control` is a reference to a node inheriting from Control.
   * 				control.visible = not get_viewport().get_camera_3d().is_position_behind(global_transform.origin)
   * 				control.position = get_viewport().get_camera_3d().unproject_position(global_transform.origin)
   * 				```
   */
  public fun unprojectPosition(worldPoint: Vector3): Vector2 {
    TransferContext.writeArguments(VECTOR3 to worldPoint)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA3D_UNPROJECT_POSITION,
        VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Returns `true` if the given position is behind the camera (the blue part of the linked diagram). [godot.See this diagram](https://raw.githubusercontent.com/godotengine/godot-docs/master/img/camera3d_position_frustum.png) for an overview of position query methods.
   *
   * **Note:** A position which returns `false` may still be outside the camera's field of view.
   */
  public fun isPositionBehind(worldPoint: Vector3): Boolean {
    TransferContext.writeArguments(VECTOR3 to worldPoint)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA3D_IS_POSITION_BEHIND, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the 3D point in world space that maps to the given 2D coordinate in the [godot.Viewport] rectangle on a plane that is the given [zDepth] distance into the scene away from the camera.
   */
  public fun projectPosition(screenPoint: Vector2, zDepth: Float): Vector3 {
    TransferContext.writeArguments(VECTOR2 to screenPoint, DOUBLE to zDepth.toDouble())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA3D_PROJECT_POSITION, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  /**
   * Sets the camera projection to perspective mode (see [PROJECTION_PERSPECTIVE]), by specifying a [fov] (field of view) angle in degrees, and the [zNear] and [zFar] clip planes in world space units.
   */
  public fun setPerspective(
    fov: Float,
    zNear: Float,
    zFar: Float,
  ): Unit {
    TransferContext.writeArguments(DOUBLE to fov.toDouble(), DOUBLE to zNear.toDouble(), DOUBLE to zFar.toDouble())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA3D_SET_PERSPECTIVE, NIL)
  }

  /**
   * Sets the camera projection to orthogonal mode (see [PROJECTION_ORTHOGONAL]), by specifying a [size], and the [zNear] and [zFar] clip planes in world space units. (As a hint, 2D games often use this projection, with values specified in pixels.)
   */
  public fun setOrthogonal(
    size: Float,
    zNear: Float,
    zFar: Float,
  ): Unit {
    TransferContext.writeArguments(DOUBLE to size.toDouble(), DOUBLE to zNear.toDouble(), DOUBLE to zFar.toDouble())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA3D_SET_ORTHOGONAL, NIL)
  }

  /**
   * Sets the camera projection to frustum mode (see [PROJECTION_FRUSTUM]), by specifying a [size], an [offset], and the [zNear] and [zFar] clip planes in world space units. See also [frustumOffset].
   */
  public fun setFrustum(
    size: Float,
    offset: Vector2,
    zNear: Float,
    zFar: Float,
  ): Unit {
    TransferContext.writeArguments(DOUBLE to size.toDouble(), VECTOR2 to offset, DOUBLE to zNear.toDouble(), DOUBLE to zFar.toDouble())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA3D_SET_FRUSTUM, NIL)
  }

  /**
   * Makes this camera the current camera for the [godot.Viewport] (see class description). If the camera node is outside the scene tree, it will attempt to become current once it's added.
   */
  public fun makeCurrent(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA3D_MAKE_CURRENT, NIL)
  }

  /**
   * If this is the current camera, remove it from being current. If [enableNext] is `true`, request to make the next camera current, if any.
   */
  public fun clearCurrent(enableNext: Boolean = true): Unit {
    TransferContext.writeArguments(BOOL to enableNext)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA3D_CLEAR_CURRENT, NIL)
  }

  /**
   * Returns the transform of the camera plus the vertical ([vOffset]) and horizontal ([hOffset]) offsets; and any other adjustments made to the position and orientation of the camera by subclassed cameras such as [godot.XRCamera3D].
   */
  public fun getCameraTransform(): Transform3D {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA3D_GET_CAMERA_TRANSFORM,
        TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D)
  }

  /**
   * Returns the camera's frustum planes in world space units as an array of [godot.core.Plane]s in the following order: near, far, left, top, right, bottom. Not to be confused with [frustumOffset].
   */
  public fun getFrustum(): VariantArray<Plane> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA3D_GET_FRUSTUM, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Plane>)
  }

  /**
   * Returns `true` if the given position is inside the camera's frustum (the green part of the linked diagram). [godot.See this diagram](https://raw.githubusercontent.com/godotengine/godot-docs/master/img/camera3d_position_frustum.png) for an overview of position query methods.
   */
  public fun isPositionInFrustum(worldPoint: Vector3): Boolean {
    TransferContext.writeArguments(VECTOR3 to worldPoint)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA3D_IS_POSITION_IN_FRUSTUM,
        BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the camera's RID from the [godot.RenderingServer].
   */
  public fun getCameraRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA3D_GET_CAMERA_RID, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Returns the RID of a pyramid shape encompassing the camera's view frustum, ignoring the camera's near plane. The tip of the pyramid represents the position of the camera.
   */
  public fun getPyramidShapeRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA3D_GET_PYRAMID_SHAPE_RID,
        _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Based on [value], enables or disables the specified layer in the [cullMask], given a [layerNumber] between 1 and 20.
   */
  public fun setCullMaskValue(layerNumber: Int, `value`: Boolean): Unit {
    TransferContext.writeArguments(LONG to layerNumber.toLong(), BOOL to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA3D_SET_CULL_MASK_VALUE, NIL)
  }

  /**
   * Returns whether or not the specified layer of the [cullMask] is enabled, given a [layerNumber] between 1 and 20.
   */
  public fun getCullMaskValue(layerNumber: Int): Boolean {
    TransferContext.writeArguments(LONG to layerNumber.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA3D_GET_CULL_MASK_VALUE, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public enum class ProjectionType(
    id: Long,
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

  public enum class KeepAspect(
    id: Long,
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

  public enum class DopplerTracking(
    id: Long,
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

  public companion object
}
