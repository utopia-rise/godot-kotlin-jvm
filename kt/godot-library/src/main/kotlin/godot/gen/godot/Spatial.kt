// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
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
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
open class Spatial : Node() {
  val visibilityChanged: Signal0 by signal()

  open var gizmo: SpatialGizmo?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_GET_GIZMO, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as SpatialGizmo?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_SET_GIZMO, NIL)
    }

  open var globalTransform: Transform
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_GET_GLOBAL_TRANSFORM,
          TRANSFORM)
      return TransferContext.readReturnValue(TRANSFORM, false) as Transform
    }
    set(value) {
      TransferContext.writeArguments(TRANSFORM to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_SET_GLOBAL_TRANSFORM, NIL)
    }

  open var rotation: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_GET_ROTATION, VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(value) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_SET_ROTATION, NIL)
    }

  open var rotationDegrees: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_GET_ROTATION_DEGREES,
          VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(value) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_SET_ROTATION_DEGREES, NIL)
    }

  open var scale: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_GET_SCALE, VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(value) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_SET_SCALE, NIL)
    }

  open var transform: Transform
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_GET_TRANSFORM, TRANSFORM)
      return TransferContext.readReturnValue(TRANSFORM, false) as Transform
    }
    set(value) {
      TransferContext.writeArguments(TRANSFORM to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_SET_TRANSFORM, NIL)
    }

  open var translation: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_GET_TRANSLATION, VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(value) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_SET_TRANSLATION, NIL)
    }

  open var visible: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_GET_VISIBLE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_SET_VISIBLE, NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_SPATIAL)

  open fun globalTransform(schedule: Transform.() -> Unit): Transform = globalTransform.apply{
      schedule(this)
      globalTransform = this
  }


  open fun rotation(schedule: Vector3.() -> Unit): Vector3 = rotation.apply{
      schedule(this)
      rotation = this
  }


  open fun rotationDegrees(schedule: Vector3.() -> Unit): Vector3 = rotationDegrees.apply{
      schedule(this)
      rotationDegrees = this
  }


  open fun scale(schedule: Vector3.() -> Unit): Vector3 = scale.apply{
      schedule(this)
      scale = this
  }


  open fun transform(schedule: Transform.() -> Unit): Transform = transform.apply{
      schedule(this)
      transform = this
  }


  open fun translation(schedule: Vector3.() -> Unit): Vector3 = translation.apply{
      schedule(this)
      translation = this
  }


  open fun _updateGizmo() {
  }

  open fun forceUpdateTransform() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_FORCE_UPDATE_TRANSFORM, NIL)
  }

  open fun getParentSpatial(): Spatial? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_GET_PARENT_SPATIAL, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Spatial?
  }

  open fun getWorld(): World? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_GET_WORLD, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as World?
  }

  open fun globalRotate(axis: Vector3, angle: Double) {
    TransferContext.writeArguments(VECTOR3 to axis, DOUBLE to angle)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_GLOBAL_ROTATE, NIL)
  }

  open fun globalScale(scale: Vector3) {
    TransferContext.writeArguments(VECTOR3 to scale)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_GLOBAL_SCALE, NIL)
  }

  open fun globalTranslate(offset: Vector3) {
    TransferContext.writeArguments(VECTOR3 to offset)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_GLOBAL_TRANSLATE, NIL)
  }

  open fun hide() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_HIDE, NIL)
  }

  open fun isLocalTransformNotificationEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SPATIAL_IS_LOCAL_TRANSFORM_NOTIFICATION_ENABLED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun isScaleDisabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_IS_SCALE_DISABLED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun isSetAsToplevel(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_IS_SET_AS_TOPLEVEL, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun isTransformNotificationEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SPATIAL_IS_TRANSFORM_NOTIFICATION_ENABLED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun isVisibleInTree(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_IS_VISIBLE_IN_TREE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun lookAt(target: Vector3, up: Vector3) {
    TransferContext.writeArguments(VECTOR3 to target, VECTOR3 to up)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_LOOK_AT, NIL)
  }

  open fun lookAtFromPosition(
    position: Vector3,
    target: Vector3,
    up: Vector3
  ) {
    TransferContext.writeArguments(VECTOR3 to position, VECTOR3 to target, VECTOR3 to up)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_LOOK_AT_FROM_POSITION, NIL)
  }

  open fun orthonormalize() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_ORTHONORMALIZE, NIL)
  }

  open fun rotate(axis: Vector3, angle: Double) {
    TransferContext.writeArguments(VECTOR3 to axis, DOUBLE to angle)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_ROTATE, NIL)
  }

  open fun rotateObjectLocal(axis: Vector3, angle: Double) {
    TransferContext.writeArguments(VECTOR3 to axis, DOUBLE to angle)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_ROTATE_OBJECT_LOCAL, NIL)
  }

  open fun rotateX(angle: Double) {
    TransferContext.writeArguments(DOUBLE to angle)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_ROTATE_X, NIL)
  }

  open fun rotateY(angle: Double) {
    TransferContext.writeArguments(DOUBLE to angle)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_ROTATE_Y, NIL)
  }

  open fun rotateZ(angle: Double) {
    TransferContext.writeArguments(DOUBLE to angle)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_ROTATE_Z, NIL)
  }

  open fun scaleObjectLocal(scale: Vector3) {
    TransferContext.writeArguments(VECTOR3 to scale)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_SCALE_OBJECT_LOCAL, NIL)
  }

  open fun setAsToplevel(enable: Boolean) {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_SET_AS_TOPLEVEL, NIL)
  }

  open fun setDisableScale(disable: Boolean) {
    TransferContext.writeArguments(BOOL to disable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_SET_DISABLE_SCALE, NIL)
  }

  open fun setIdentity() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_SET_IDENTITY, NIL)
  }

  open fun setIgnoreTransformNotification(enabled: Boolean) {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SPATIAL_SET_IGNORE_TRANSFORM_NOTIFICATION, NIL)
  }

  open fun setNotifyLocalTransform(enable: Boolean) {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_SET_NOTIFY_LOCAL_TRANSFORM,
        NIL)
  }

  open fun setNotifyTransform(enable: Boolean) {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_SET_NOTIFY_TRANSFORM, NIL)
  }

  open fun show() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_SHOW, NIL)
  }

  open fun toGlobal(localPoint: Vector3): Vector3 {
    TransferContext.writeArguments(VECTOR3 to localPoint)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_TO_GLOBAL, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  open fun toLocal(globalPoint: Vector3): Vector3 {
    TransferContext.writeArguments(VECTOR3 to globalPoint)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_TO_LOCAL, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  open fun translate(offset: Vector3) {
    TransferContext.writeArguments(VECTOR3 to offset)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_TRANSLATE, NIL)
  }

  open fun translateObjectLocal(offset: Vector3) {
    TransferContext.writeArguments(VECTOR3 to offset)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_TRANSLATE_OBJECT_LOCAL, NIL)
  }

  open fun updateGizmo() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIAL_UPDATE_GIZMO, NIL)
  }

  companion object {
    final const val NOTIFICATION_ENTER_WORLD: Long = 41

    final const val NOTIFICATION_EXIT_WORLD: Long = 42

    final const val NOTIFICATION_TRANSFORM_CHANGED: Long = 2000

    final const val NOTIFICATION_VISIBILITY_CHANGED: Long = 43
  }
}
