// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.Signal4
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
open class RigidBody : PhysicsBody() {
  val bodyEntered: Signal1<Node> by signal("body")

  val bodyExited: Signal1<Node> by signal("body")

  val bodyShapeEntered: Signal4<Long, Node, Long, Long> by signal("body_id", "body", "body_shape",
      "local_shape")

  val bodyShapeExited: Signal4<Long, Node, Long, Long> by signal("body_id", "body", "body_shape",
      "local_shape")

  val sleepingStateChanged: Signal0 by signal()

  open var angularDamp: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_GET_ANGULAR_DAMP,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_SET_ANGULAR_DAMP, NIL)
    }

  open var angularVelocity: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_GET_ANGULAR_VELOCITY,
          VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(value) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_SET_ANGULAR_VELOCITY,
          NIL)
    }

  open var axisLockAngularX: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_GET_AXIS_LOCK_ANGULAR_X,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_SET_AXIS_LOCK_ANGULAR_X,
          NIL)
    }

  open var axisLockAngularY: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_GET_AXIS_LOCK_ANGULAR_Y,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_SET_AXIS_LOCK_ANGULAR_Y,
          NIL)
    }

  open var axisLockAngularZ: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_GET_AXIS_LOCK_ANGULAR_Z,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_SET_AXIS_LOCK_ANGULAR_Z,
          NIL)
    }

  open var axisLockLinearX: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_GET_AXIS_LOCK_LINEAR_X,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_SET_AXIS_LOCK_LINEAR_X,
          NIL)
    }

  open var axisLockLinearY: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_GET_AXIS_LOCK_LINEAR_Y,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_SET_AXIS_LOCK_LINEAR_Y,
          NIL)
    }

  open var axisLockLinearZ: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_GET_AXIS_LOCK_LINEAR_Z,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_SET_AXIS_LOCK_LINEAR_Z,
          NIL)
    }

  open var bounce: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_GET_BOUNCE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_SET_BOUNCE, NIL)
    }

  open var canSleep: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_GET_CAN_SLEEP, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_SET_CAN_SLEEP, NIL)
    }

  open var contactMonitor: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_GET_CONTACT_MONITOR,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_SET_CONTACT_MONITOR,
          NIL)
    }

  open var contactsReported: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_GET_CONTACTS_REPORTED,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_SET_CONTACTS_REPORTED,
          NIL)
    }

  open var continuousCd: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_GET_CONTINUOUS_CD, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_SET_CONTINUOUS_CD, NIL)
    }

  open var customIntegrator: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_GET_CUSTOM_INTEGRATOR,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_SET_CUSTOM_INTEGRATOR,
          NIL)
    }

  open var friction: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_GET_FRICTION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_SET_FRICTION, NIL)
    }

  open var gravityScale: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_GET_GRAVITY_SCALE,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_SET_GRAVITY_SCALE, NIL)
    }

  open var linearDamp: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_GET_LINEAR_DAMP, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_SET_LINEAR_DAMP, NIL)
    }

  open var linearVelocity: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_GET_LINEAR_VELOCITY,
          VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(value) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_SET_LINEAR_VELOCITY,
          NIL)
    }

  open var mass: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_GET_MASS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_SET_MASS, NIL)
    }

  open var mode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_GET_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_SET_MODE, NIL)
    }

  open var physicsMaterialOverride: PhysicsMaterial?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDBODY_GET_PHYSICS_MATERIAL_OVERRIDE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as PhysicsMaterial?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDBODY_SET_PHYSICS_MATERIAL_OVERRIDE, NIL)
    }

  open var sleeping: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_GET_SLEEPING, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_SET_SLEEPING, NIL)
    }

  open var weight: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_GET_WEIGHT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_SET_WEIGHT, NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_RIGIDBODY)

  open fun angularVelocity(schedule: Vector3.() -> Unit): Vector3 = angularVelocity.apply{
      schedule(this)
      angularVelocity = this
  }


  open fun linearVelocity(schedule: Vector3.() -> Unit): Vector3 = linearVelocity.apply{
      schedule(this)
      linearVelocity = this
  }


  open fun _bodyEnterTree(arg0: Long) {
  }

  open fun _bodyExitTree(arg0: Long) {
  }

  open fun _directStateChanged(arg0: Object) {
  }

  open fun _integrateForces(state: PhysicsDirectBodyState) {
  }

  open fun _reloadPhysicsCharacteristics() {
  }

  open fun addCentralForce(force: Vector3) {
    TransferContext.writeArguments(VECTOR3 to force)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_ADD_CENTRAL_FORCE, NIL)
  }

  open fun addForce(force: Vector3, position: Vector3) {
    TransferContext.writeArguments(VECTOR3 to force, VECTOR3 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_ADD_FORCE, NIL)
  }

  open fun addTorque(torque: Vector3) {
    TransferContext.writeArguments(VECTOR3 to torque)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_ADD_TORQUE, NIL)
  }

  open fun applyCentralImpulse(impulse: Vector3) {
    TransferContext.writeArguments(VECTOR3 to impulse)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_APPLY_CENTRAL_IMPULSE,
        NIL)
  }

  open fun applyImpulse(position: Vector3, impulse: Vector3) {
    TransferContext.writeArguments(VECTOR3 to position, VECTOR3 to impulse)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_APPLY_IMPULSE, NIL)
  }

  open fun applyTorqueImpulse(impulse: Vector3) {
    TransferContext.writeArguments(VECTOR3 to impulse)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_APPLY_TORQUE_IMPULSE, NIL)
  }

  open fun getCollidingBodies(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_GET_COLLIDING_BODIES,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  open fun setAxisVelocity(axisVelocity: Vector3) {
    TransferContext.writeArguments(VECTOR3 to axisVelocity)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDBODY_SET_AXIS_VELOCITY, NIL)
  }

  enum class Mode(
    id: Long
  ) {
    MODE_RIGID(0),

    MODE_STATIC(1),

    MODE_CHARACTER(2),

    MODE_KINEMATIC(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val MODE_CHARACTER: Long = 2

    final const val MODE_KINEMATIC: Long = 3

    final const val MODE_RIGID: Long = 0

    final const val MODE_STATIC: Long = 1
  }
}
