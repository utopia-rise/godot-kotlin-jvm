// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.Plane
import godot.core.Projection
import godot.core.RID
import godot.core.Transform3D
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PROJECTION
import godot.core.VariantType.TRANSFORM3D
import godot.core.VariantType.VECTOR2
import godot.core.VariantType.VECTOR3
import godot.core.VariantType._RID
import godot.core.Vector2
import godot.core.Vector3
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * [Camera3D] is a special node that displays what is visible from its current location. Cameras
 * register themselves in the nearest [Viewport] node (when ascending the tree). Only one camera can be
 * active per viewport. If no viewport is available ascending the tree, the camera will register in the
 * global viewport. In other words, a camera just provides 3D display capabilities to a [Viewport],
 * and, without one, a scene registered in that [Viewport] (or higher viewports) can't be displayed.
 */
@GodotBaseType
public open class Camera3D : Node3D() {
  /**
   * The axis to lock during [fov]/[size] adjustments. Can be either [KEEPWIDTH] or [KEEPHEIGHT].
   */
  public var keepAspect: KeepAspect
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getKeepAspectModePtr, LONG)
      return Camera3D.KeepAspect.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setKeepAspectModePtr, NIL)
    }

  /**
   * The culling mask that describes which [VisualInstance3D.layers] are rendered by this camera. By
   * default, all 20 user-visible layers are rendered.
   * **Note:** Since the [cullMask] allows for 32 layers to be stored in total, there are an
   * additional 12 layers that are only used internally by the engine and aren't exposed in the editor.
   * Setting [cullMask] using a script allows you to toggle those reserved layers, which can be useful
   * for editor plugins.
   * To adjust [cullMask] more easily using a script, use [getCullMaskValue] and [setCullMaskValue].
   * **Note:** [VoxelGI], SDFGI and [LightmapGI] will always take all layers into account to
   * determine what contributes to global illumination. If this is an issue, set
   * [GeometryInstance3D.giMode] to [GeometryInstance3D.GIMODEDISABLED] for meshes and
   * [Light3D.lightBakeMode] to [Light3D.BAKEDISABLED] for lights to exclude them from global
   * illumination.
   */
  public var cullMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCullMaskPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCullMaskPtr, NIL)
    }

  /**
   * The [Environment] to use for this camera.
   */
  public var environment: Environment?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEnvironmentPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Environment?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEnvironmentPtr, NIL)
    }

  /**
   * The [CameraAttributes] to use for this camera.
   */
  public var attributes: Material?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAttributesPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Material?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAttributesPtr, NIL)
    }

  /**
   * The horizontal (X) offset of the camera viewport.
   */
  public var hOffset: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getHOffsetPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setHOffsetPtr, NIL)
    }

  /**
   * The vertical (Y) offset of the camera viewport.
   */
  public var vOffset: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVOffsetPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setVOffsetPtr, NIL)
    }

  /**
   * If not [DOPPLERTRACKINGDISABLED], this camera will simulate the
   * [url=https://en.wikipedia.org/wiki/Doppler_effect]Doppler effect[/url] for objects changed in
   * particular `_process` methods. See [DopplerTracking] for possible values.
   */
  public var dopplerTracking: DopplerTracking
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDopplerTrackingPtr, LONG)
      return Camera3D.DopplerTracking.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setDopplerTrackingPtr, NIL)
    }

  /**
   * The camera's projection mode. In [PROJECTIONPERSPECTIVE] mode, objects' Z distance from the
   * camera's local space scales their perceived size.
   */
  public var projection: ProjectionType
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getProjectionPtr, LONG)
      return Camera3D.ProjectionType.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setProjectionPtr, NIL)
    }

  /**
   * If `true`, the ancestor [Viewport] is currently using this camera.
   * If multiple cameras are in the scene, one will always be made current. For example, if two
   * [Camera3D] nodes are present in the scene and only one is current, setting one camera's [current]
   * to `false` will cause the other camera to be made current.
   */
  public var current: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isCurrentPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCurrentPtr, NIL)
    }

  /**
   * The camera's field of view angle (in degrees). Only applicable in perspective mode. Since
   * [keepAspect] locks one axis, [fov] sets the other axis' field of view angle.
   * For reference, the default vertical field of view value (`75.0`) is equivalent to a horizontal
   * FOV of:
   * - ~91.31 degrees in a 4:3 viewport
   * - ~101.67 degrees in a 16:10 viewport
   * - ~107.51 degrees in a 16:9 viewport
   * - ~121.63 degrees in a 21:9 viewport
   */
  public var fov: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFovPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setFovPtr, NIL)
    }

  /**
   * The camera's size in meters measured as the diameter of the width or height, depending on
   * [keepAspect]. Only applicable in orthogonal and frustum modes.
   */
  public var size: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSizePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSizePtr, NIL)
    }

  /**
   * The camera's frustum offset. This can be changed from the default to create "tilted frustum"
   * effects such as [url=https://zdoom.org/wiki/Y-shearing]Y-shearing[/url].
   * **Note:** Only effective if [projection] is [PROJECTIONFRUSTUM].
   */
  @CoreTypeLocalCopy
  public var frustumOffset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFrustumOffsetPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFrustumOffsetPtr, NIL)
    }

  /**
   * The distance to the near culling boundary for this camera relative to its local Z axis. Lower
   * values allow the camera to see objects more up close to its origin, at the cost of lower precision
   * across the *entire* range. Values lower than the default can lead to increased Z-fighting.
   */
  public var near: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getNearPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setNearPtr, NIL)
    }

  /**
   * The distance to the far culling boundary for this camera relative to its local Z axis. Higher
   * values allow the camera to see further away, while decreasing [far] can improve performance if it
   * results in objects being partially or fully culled.
   */
  public var far: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFarPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setFarPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_CAMERA3D, scriptIndex)
    return true
  }

  /**
   * The camera's frustum offset. This can be changed from the default to create "tilted frustum"
   * effects such as [url=https://zdoom.org/wiki/Y-shearing]Y-shearing[/url].
   * **Note:** Only effective if [projection] is [PROJECTIONFRUSTUM].
   *
   * This is a helper function to make dealing with local copies easier. 
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = camera3d.frustumOffset
   * //Your changes
   * camera3d.frustumOffset = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun frustumOffsetMutate(block: Vector2.() -> Unit): Vector2 = frustumOffset.apply{
      block(this)
      frustumOffset = this
  }


  /**
   * Returns a normal vector in world space, that is the result of projecting a point on the
   * [Viewport] rectangle by the inverse camera projection. This is useful for casting rays in the form
   * of (origin, normal) for object intersection or picking.
   */
  public fun projectRayNormal(screenPoint: Vector2): Vector3 {
    TransferContext.writeArguments(VECTOR2 to screenPoint)
    TransferContext.callMethod(rawPtr, MethodBindings.projectRayNormalPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  /**
   * Returns a normal vector from the screen point location directed along the camera. Orthogonal
   * cameras are normalized. Perspective cameras account for perspective, screen width/height, etc.
   */
  public fun projectLocalRayNormal(screenPoint: Vector2): Vector3 {
    TransferContext.writeArguments(VECTOR2 to screenPoint)
    TransferContext.callMethod(rawPtr, MethodBindings.projectLocalRayNormalPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  /**
   * Returns a 3D position in world space, that is the result of projecting a point on the
   * [Viewport] rectangle by the inverse camera projection. This is useful for casting rays in the form
   * of (origin, normal) for object intersection or picking.
   */
  public fun projectRayOrigin(screenPoint: Vector2): Vector3 {
    TransferContext.writeArguments(VECTOR2 to screenPoint)
    TransferContext.callMethod(rawPtr, MethodBindings.projectRayOriginPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  /**
   * Returns the 2D coordinate in the [Viewport] rectangle that maps to the given 3D point in world
   * space.
   * **Note:** When using this to position GUI elements over a 3D viewport, use [isPositionBehind]
   * to prevent them from appearing if the 3D point is behind the camera:
   * [codeblock]
   * # This code block is part of a script that inherits from Node3D.
   * # `control` is a reference to a node inheriting from Control.
   * control.visible = not
   * get_viewport().get_camera_3d().is_position_behind(global_transform.origin)
   * control.position = get_viewport().get_camera_3d().unproject_position(global_transform.origin)
   * [/codeblock]
   */
  public fun unprojectPosition(worldPoint: Vector3): Vector2 {
    TransferContext.writeArguments(VECTOR3 to worldPoint)
    TransferContext.callMethod(rawPtr, MethodBindings.unprojectPositionPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Returns `true` if the given position is behind the camera (the blue part of the linked
   * diagram).
   * [url=https://raw.githubusercontent.com/godotengine/godot-docs/master/img/camera3d_position_frustum.png]See
   * this diagram[/url] for an overview of position query methods.
   * **Note:** A position which returns `false` may still be outside the camera's field of view.
   */
  public fun isPositionBehind(worldPoint: Vector3): Boolean {
    TransferContext.writeArguments(VECTOR3 to worldPoint)
    TransferContext.callMethod(rawPtr, MethodBindings.isPositionBehindPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the 3D point in world space that maps to the given 2D coordinate in the [Viewport]
   * rectangle on a plane that is the given [zDepth] distance into the scene away from the camera.
   */
  public fun projectPosition(screenPoint: Vector2, zDepth: Float): Vector3 {
    TransferContext.writeArguments(VECTOR2 to screenPoint, DOUBLE to zDepth.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.projectPositionPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  /**
   * Sets the camera projection to perspective mode (see [PROJECTIONPERSPECTIVE]), by specifying a
   * [fov] (field of view) angle in degrees, and the [zNear] and [zFar] clip planes in world space
   * units.
   */
  public fun setPerspective(
    fov: Float,
    zNear: Float,
    zFar: Float,
  ): Unit {
    TransferContext.writeArguments(DOUBLE to fov.toDouble(), DOUBLE to zNear.toDouble(), DOUBLE to zFar.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setPerspectivePtr, NIL)
  }

  /**
   * Sets the camera projection to orthogonal mode (see [PROJECTIONORTHOGONAL]), by specifying a
   * [size], and the [zNear] and [zFar] clip planes in world space units. (As a hint, 2D games often
   * use this projection, with values specified in pixels.)
   */
  public fun setOrthogonal(
    size: Float,
    zNear: Float,
    zFar: Float,
  ): Unit {
    TransferContext.writeArguments(DOUBLE to size.toDouble(), DOUBLE to zNear.toDouble(), DOUBLE to zFar.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setOrthogonalPtr, NIL)
  }

  /**
   * Sets the camera projection to frustum mode (see [PROJECTIONFRUSTUM]), by specifying a [size],
   * an [offset], and the [zNear] and [zFar] clip planes in world space units. See also
   * [frustumOffset].
   */
  public fun setFrustum(
    size: Float,
    offset: Vector2,
    zNear: Float,
    zFar: Float,
  ): Unit {
    TransferContext.writeArguments(DOUBLE to size.toDouble(), VECTOR2 to offset, DOUBLE to zNear.toDouble(), DOUBLE to zFar.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setFrustumPtr, NIL)
  }

  /**
   * Makes this camera the current camera for the [Viewport] (see class description). If the camera
   * node is outside the scene tree, it will attempt to become current once it's added.
   */
  public fun makeCurrent(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.makeCurrentPtr, NIL)
  }

  /**
   * If this is the current camera, remove it from being current. If [enableNext] is `true`, request
   * to make the next camera current, if any.
   */
  @JvmOverloads
  public fun clearCurrent(enableNext: Boolean = true): Unit {
    TransferContext.writeArguments(BOOL to enableNext)
    TransferContext.callMethod(rawPtr, MethodBindings.clearCurrentPtr, NIL)
  }

  /**
   * Returns the transform of the camera plus the vertical ([vOffset]) and horizontal ([hOffset])
   * offsets; and any other adjustments made to the position and orientation of the camera by
   * subclassed cameras such as [XRCamera3D].
   */
  public fun getCameraTransform(): Transform3D {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCameraTransformPtr, TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D)
  }

  /**
   * Returns the projection matrix that this camera uses to render to its associated viewport. The
   * camera must be part of the scene tree to function.
   */
  public fun getCameraProjection(): Projection {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCameraProjectionPtr, PROJECTION)
    return (TransferContext.readReturnValue(PROJECTION, false) as Projection)
  }

  /**
   * Returns the camera's frustum planes in world space units as an array of [Plane]s in the
   * following order: near, far, left, top, right, bottom. Not to be confused with [frustumOffset].
   */
  public fun getFrustum(): VariantArray<Plane> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFrustumPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Plane>)
  }

  /**
   * Returns `true` if the given position is inside the camera's frustum (the green part of the
   * linked diagram).
   * [url=https://raw.githubusercontent.com/godotengine/godot-docs/master/img/camera3d_position_frustum.png]See
   * this diagram[/url] for an overview of position query methods.
   */
  public fun isPositionInFrustum(worldPoint: Vector3): Boolean {
    TransferContext.writeArguments(VECTOR3 to worldPoint)
    TransferContext.callMethod(rawPtr, MethodBindings.isPositionInFrustumPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the camera's RID from the [RenderingServer].
   */
  public fun getCameraRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCameraRidPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Returns the RID of a pyramid shape encompassing the camera's view frustum, ignoring the
   * camera's near plane. The tip of the pyramid represents the position of the camera.
   */
  public fun getPyramidShapeRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPyramidShapeRidPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Based on [value], enables or disables the specified layer in the [cullMask], given a
   * [layerNumber] between 1 and 20.
   */
  public fun setCullMaskValue(layerNumber: Int, `value`: Boolean): Unit {
    TransferContext.writeArguments(LONG to layerNumber.toLong(), BOOL to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setCullMaskValuePtr, NIL)
  }

  /**
   * Returns whether or not the specified layer of the [cullMask] is enabled, given a [layerNumber]
   * between 1 and 20.
   */
  public fun getCullMaskValue(layerNumber: Int): Boolean {
    TransferContext.writeArguments(LONG to layerNumber.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCullMaskValuePtr, BOOL)
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
     * Orthogonal projection, also known as orthographic projection. Objects remain the same size on
     * the screen no matter how far away they are.
     */
    PROJECTION_ORTHOGONAL(1),
    /**
     * Frustum projection. This mode allows adjusting [frustumOffset] to create "tilted frustum"
     * effects.
     */
    PROJECTION_FRUSTUM(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class KeepAspect(
    id: Long,
  ) {
    /**
     * Preserves the horizontal aspect ratio; also known as Vert- scaling. This is usually the best
     * option for projects running in portrait mode, as taller aspect ratios will benefit from a wider
     * vertical FOV.
     */
    KEEP_WIDTH(0),
    /**
     * Preserves the vertical aspect ratio; also known as Hor+ scaling. This is usually the best
     * option for projects running in landscape mode, as wider aspect ratios will automatically benefit
     * from a wider horizontal FOV.
     */
    KEEP_HEIGHT(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class DopplerTracking(
    id: Long,
  ) {
    /**
     * Disables [url=https://en.wikipedia.org/wiki/Doppler_effect]Doppler effect[/url] simulation
     * (default).
     */
    DOPPLER_TRACKING_DISABLED(0),
    /**
     * Simulate [url=https://en.wikipedia.org/wiki/Doppler_effect]Doppler effect[/url] by tracking
     * positions of objects that are changed in `_process`. Changes in the relative velocity of this
     * camera compared to those objects affect how audio is perceived (changing the audio's
     * [AudioStreamPlayer3D.pitchScale]).
     */
    DOPPLER_TRACKING_IDLE_STEP(1),
    /**
     * Simulate [url=https://en.wikipedia.org/wiki/Doppler_effect]Doppler effect[/url] by tracking
     * positions of objects that are changed in `_physics_process`. Changes in the relative velocity of
     * this camera compared to those objects affect how audio is perceived (changing the audio's
     * [AudioStreamPlayer3D.pitchScale]).
     */
    DOPPLER_TRACKING_PHYSICS_STEP(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val projectRayNormalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera3D", "project_ray_normal")

    public val projectLocalRayNormalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera3D", "project_local_ray_normal")

    public val projectRayOriginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera3D", "project_ray_origin")

    public val unprojectPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera3D", "unproject_position")

    public val isPositionBehindPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera3D", "is_position_behind")

    public val projectPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera3D", "project_position")

    public val setPerspectivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera3D", "set_perspective")

    public val setOrthogonalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera3D", "set_orthogonal")

    public val setFrustumPtr: VoidPtr = TypeManager.getMethodBindPtr("Camera3D", "set_frustum")

    public val makeCurrentPtr: VoidPtr = TypeManager.getMethodBindPtr("Camera3D", "make_current")

    public val clearCurrentPtr: VoidPtr = TypeManager.getMethodBindPtr("Camera3D", "clear_current")

    public val setCurrentPtr: VoidPtr = TypeManager.getMethodBindPtr("Camera3D", "set_current")

    public val isCurrentPtr: VoidPtr = TypeManager.getMethodBindPtr("Camera3D", "is_current")

    public val getCameraTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera3D", "get_camera_transform")

    public val getCameraProjectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera3D", "get_camera_projection")

    public val getFovPtr: VoidPtr = TypeManager.getMethodBindPtr("Camera3D", "get_fov")

    public val getFrustumOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera3D", "get_frustum_offset")

    public val getSizePtr: VoidPtr = TypeManager.getMethodBindPtr("Camera3D", "get_size")

    public val getFarPtr: VoidPtr = TypeManager.getMethodBindPtr("Camera3D", "get_far")

    public val getNearPtr: VoidPtr = TypeManager.getMethodBindPtr("Camera3D", "get_near")

    public val setFovPtr: VoidPtr = TypeManager.getMethodBindPtr("Camera3D", "set_fov")

    public val setFrustumOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera3D", "set_frustum_offset")

    public val setSizePtr: VoidPtr = TypeManager.getMethodBindPtr("Camera3D", "set_size")

    public val setFarPtr: VoidPtr = TypeManager.getMethodBindPtr("Camera3D", "set_far")

    public val setNearPtr: VoidPtr = TypeManager.getMethodBindPtr("Camera3D", "set_near")

    public val getProjectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera3D", "get_projection")

    public val setProjectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera3D", "set_projection")

    public val setHOffsetPtr: VoidPtr = TypeManager.getMethodBindPtr("Camera3D", "set_h_offset")

    public val getHOffsetPtr: VoidPtr = TypeManager.getMethodBindPtr("Camera3D", "get_h_offset")

    public val setVOffsetPtr: VoidPtr = TypeManager.getMethodBindPtr("Camera3D", "set_v_offset")

    public val getVOffsetPtr: VoidPtr = TypeManager.getMethodBindPtr("Camera3D", "get_v_offset")

    public val setCullMaskPtr: VoidPtr = TypeManager.getMethodBindPtr("Camera3D", "set_cull_mask")

    public val getCullMaskPtr: VoidPtr = TypeManager.getMethodBindPtr("Camera3D", "get_cull_mask")

    public val setEnvironmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera3D", "set_environment")

    public val getEnvironmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera3D", "get_environment")

    public val setAttributesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera3D", "set_attributes")

    public val getAttributesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera3D", "get_attributes")

    public val setKeepAspectModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera3D", "set_keep_aspect_mode")

    public val getKeepAspectModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera3D", "get_keep_aspect_mode")

    public val setDopplerTrackingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera3D", "set_doppler_tracking")

    public val getDopplerTrackingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera3D", "get_doppler_tracking")

    public val getFrustumPtr: VoidPtr = TypeManager.getMethodBindPtr("Camera3D", "get_frustum")

    public val isPositionInFrustumPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera3D", "is_position_in_frustum")

    public val getCameraRidPtr: VoidPtr = TypeManager.getMethodBindPtr("Camera3D", "get_camera_rid")

    public val getPyramidShapeRidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera3D", "get_pyramid_shape_rid")

    public val setCullMaskValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera3D", "set_cull_mask_value")

    public val getCullMaskValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera3D", "get_cull_mask_value")
  }
}
