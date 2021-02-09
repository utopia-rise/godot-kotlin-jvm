// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
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
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
open class Camera : Spatial() {
  open var cullMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_GET_CULL_MASK, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_SET_CULL_MASK, NIL)
    }

  open var current: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_GET_CURRENT, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_SET_CURRENT, NIL)
    }

  open var dopplerTracking: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_GET_DOPPLER_TRACKING, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_SET_DOPPLER_TRACKING, NIL)
    }

  open var environment: Environment?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_GET_ENVIRONMENT, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Environment?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_SET_ENVIRONMENT, NIL)
    }

  open var far: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_GET_FAR, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_SET_FAR, NIL)
    }

  open var fov: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_GET_FOV, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_SET_FOV, NIL)
    }

  open var frustumOffset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_GET_FRUSTUM_OFFSET,
          VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_SET_FRUSTUM_OFFSET, NIL)
    }

  open var hOffset: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_GET_H_OFFSET, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_SET_H_OFFSET, NIL)
    }

  open var keepAspect: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_GET_KEEP_ASPECT, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_SET_KEEP_ASPECT, NIL)
    }

  open var near: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_GET_NEAR, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_SET_NEAR, NIL)
    }

  open var projection: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_GET_PROJECTION, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_SET_PROJECTION, NIL)
    }

  open var size: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_GET_SIZE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_SET_SIZE, NIL)
    }

  open var vOffset: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_GET_V_OFFSET, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_SET_V_OFFSET, NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_CAMERA)

  open fun frustumOffset(schedule: Vector2.() -> Unit): Vector2 = frustumOffset.apply{
      schedule(this)
      frustumOffset = this
  }


  open fun clearCurrent(enableNext: Boolean = true) {
    TransferContext.writeArguments(BOOL to enableNext)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_CLEAR_CURRENT, NIL)
  }

  open fun getCameraRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_GET_CAMERA_RID, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  open fun getCameraTransform(): Transform {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_GET_CAMERA_TRANSFORM,
        TRANSFORM)
    return TransferContext.readReturnValue(TRANSFORM, false) as Transform
  }

  open fun getCullMaskBit(layer: Long): Boolean {
    TransferContext.writeArguments(LONG to layer)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_GET_CULL_MASK_BIT, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun getFrustum(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_GET_FRUSTUM, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  open fun isPositionBehind(worldPoint: Vector3): Boolean {
    TransferContext.writeArguments(VECTOR3 to worldPoint)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_IS_POSITION_BEHIND, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun makeCurrent() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_MAKE_CURRENT, NIL)
  }

  open fun projectLocalRayNormal(screenPoint: Vector2): Vector3 {
    TransferContext.writeArguments(VECTOR2 to screenPoint)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_PROJECT_LOCAL_RAY_NORMAL,
        VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  open fun projectPosition(screenPoint: Vector2, zDepth: Double): Vector3 {
    TransferContext.writeArguments(VECTOR2 to screenPoint, DOUBLE to zDepth)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_PROJECT_POSITION, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  open fun projectRayNormal(screenPoint: Vector2): Vector3 {
    TransferContext.writeArguments(VECTOR2 to screenPoint)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_PROJECT_RAY_NORMAL, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  open fun projectRayOrigin(screenPoint: Vector2): Vector3 {
    TransferContext.writeArguments(VECTOR2 to screenPoint)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_PROJECT_RAY_ORIGIN, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  open fun setCullMaskBit(layer: Long, enable: Boolean) {
    TransferContext.writeArguments(LONG to layer, BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_SET_CULL_MASK_BIT, NIL)
  }

  open fun setFrustum(
    size: Double,
    offset: Vector2,
    zNear: Double,
    zFar: Double
  ) {
    TransferContext.writeArguments(DOUBLE to size, VECTOR2 to offset, DOUBLE to zNear, DOUBLE to
        zFar)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_SET_FRUSTUM, NIL)
  }

  open fun setOrthogonal(
    size: Double,
    zNear: Double,
    zFar: Double
  ) {
    TransferContext.writeArguments(DOUBLE to size, DOUBLE to zNear, DOUBLE to zFar)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_SET_ORTHOGONAL, NIL)
  }

  open fun setPerspective(
    fov: Double,
    zNear: Double,
    zFar: Double
  ) {
    TransferContext.writeArguments(DOUBLE to fov, DOUBLE to zNear, DOUBLE to zFar)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_SET_PERSPECTIVE, NIL)
  }

  open fun unprojectPosition(worldPoint: Vector3): Vector2 {
    TransferContext.writeArguments(VECTOR3 to worldPoint)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA_UNPROJECT_POSITION, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  enum class KeepAspect(
    id: Long
  ) {
    KEEP_WIDTH(0),

    KEEP_HEIGHT(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class Projection(
    id: Long
  ) {
    PROJECTION_PERSPECTIVE(0),

    PROJECTION_ORTHOGONAL(1),

    PROJECTION_FRUSTUM(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class DopplerTracking(
    id: Long
  ) {
    DOPPLER_TRACKING_DISABLED(0),

    DOPPLER_TRACKING_IDLE_STEP(1),

    DOPPLER_TRACKING_PHYSICS_STEP(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val DOPPLER_TRACKING_DISABLED: Long = 0

    final const val DOPPLER_TRACKING_IDLE_STEP: Long = 1

    final const val DOPPLER_TRACKING_PHYSICS_STEP: Long = 2

    final const val KEEP_HEIGHT: Long = 1

    final const val KEEP_WIDTH: Long = 0

    final const val PROJECTION_FRUSTUM: Long = 2

    final const val PROJECTION_ORTHOGONAL: Long = 1

    final const val PROJECTION_PERSPECTIVE: Long = 0
  }
}
