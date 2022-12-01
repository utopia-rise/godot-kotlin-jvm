// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.RID
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.Signal4
import godot.signals.signal
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class RigidDynamicBody2D : PhysicsBody2D() {
  public val bodyEntered: Signal1<Node> by signal("body")

  public val bodyShapeEntered: Signal4<RID, Node, Long, Long> by signal("bodyRid", "body",
      "bodyShapeIndex", "localShapeIndex")

  public val sleepingStateChanged: Signal0 by signal()

  public val bodyExited: Signal1<Node> by signal("body")

  public val bodyShapeExited: Signal4<RID, Node, Long, Long> by signal("bodyRid", "body",
      "bodyShapeIndex", "localShapeIndex")

  public var mass: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_GET_MASS,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_SET_MASS, NIL)
    }

  public var inertia: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_GET_INERTIA,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_SET_INERTIA,
          NIL)
    }

  public var centerOfMassMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_GET_CENTER_OF_MASS_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_SET_CENTER_OF_MASS_MODE, NIL)
    }

  public var centerOfMass: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_GET_CENTER_OF_MASS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_SET_CENTER_OF_MASS, NIL)
    }

  public var physicsMaterialOverride: PhysicsMaterial?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_GET_PHYSICS_MATERIAL_OVERRIDE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as PhysicsMaterial?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_SET_PHYSICS_MATERIAL_OVERRIDE, NIL)
    }

  public var gravityScale: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_GET_GRAVITY_SCALE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_SET_GRAVITY_SCALE, NIL)
    }

  public var customIntegrator: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_IS_USING_CUSTOM_INTEGRATOR, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_SET_USE_CUSTOM_INTEGRATOR, NIL)
    }

  public var continuousCd: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_GET_CONTINUOUS_COLLISION_DETECTION_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_SET_CONTINUOUS_COLLISION_DETECTION_MODE, NIL)
    }

  public var contactsReported: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_GET_MAX_CONTACTS_REPORTED, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_SET_MAX_CONTACTS_REPORTED, NIL)
    }

  public var contactMonitor: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_IS_CONTACT_MONITOR_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_SET_CONTACT_MONITOR, NIL)
    }

  public var sleeping: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_IS_SLEEPING,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_SET_SLEEPING,
          NIL)
    }

  public var canSleep: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_IS_ABLE_TO_SLEEP, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_SET_CAN_SLEEP,
          NIL)
    }

  public var lockRotation: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_IS_LOCK_ROTATION_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_SET_LOCK_ROTATION_ENABLED, NIL)
    }

  public var freeze: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_IS_FREEZE_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_SET_FREEZE_ENABLED, NIL)
    }

  public var freezeMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_GET_FREEZE_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_SET_FREEZE_MODE, NIL)
    }

  public var linearVelocity: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_GET_LINEAR_VELOCITY, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_SET_LINEAR_VELOCITY, NIL)
    }

  public var linearDampMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_GET_LINEAR_DAMP_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_SET_LINEAR_DAMP_MODE, NIL)
    }

  public var linearDamp: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_GET_LINEAR_DAMP, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_SET_LINEAR_DAMP, NIL)
    }

  public var angularVelocity: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_GET_ANGULAR_VELOCITY, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_SET_ANGULAR_VELOCITY, NIL)
    }

  public var angularDampMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_GET_ANGULAR_DAMP_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_SET_ANGULAR_DAMP_MODE, NIL)
    }

  public var angularDamp: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_GET_ANGULAR_DAMP, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_SET_ANGULAR_DAMP, NIL)
    }

  public var constantForce: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_GET_CONSTANT_FORCE, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_SET_CONSTANT_FORCE, NIL)
    }

  public var constantTorque: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_GET_CONSTANT_TORQUE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_SET_CONSTANT_TORQUE, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_RIGIDDYNAMICBODY2D, scriptIndex)
    return true
  }

  public open fun _integrateForces(state: PhysicsDirectBodyState2D): Unit {
  }

  public fun setAxisVelocity(axisVelocity: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to axisVelocity)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_SET_AXIS_VELOCITY, NIL)
  }

  public fun applyCentralImpulse(impulse: Vector2 = Vector2(0, 0)): Unit {
    TransferContext.writeArguments(VECTOR2 to impulse)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_APPLY_CENTRAL_IMPULSE, NIL)
  }

  public fun applyImpulse(impulse: Vector2, position: Vector2 = Vector2(0, 0)): Unit {
    TransferContext.writeArguments(VECTOR2 to impulse, VECTOR2 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_APPLY_IMPULSE,
        NIL)
  }

  public fun applyTorqueImpulse(torque: Double): Unit {
    TransferContext.writeArguments(DOUBLE to torque)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_APPLY_TORQUE_IMPULSE, NIL)
  }

  public fun applyCentralForce(force: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to force)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_APPLY_CENTRAL_FORCE, NIL)
  }

  public fun applyForce(force: Vector2, position: Vector2 = Vector2(0, 0)): Unit {
    TransferContext.writeArguments(VECTOR2 to force, VECTOR2 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_APPLY_FORCE, NIL)
  }

  public fun applyTorque(torque: Double): Unit {
    TransferContext.writeArguments(DOUBLE to torque)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_APPLY_TORQUE,
        NIL)
  }

  public fun addConstantCentralForce(force: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to force)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_ADD_CONSTANT_CENTRAL_FORCE, NIL)
  }

  public fun addConstantForce(force: Vector2, position: Vector2 = Vector2(0, 0)): Unit {
    TransferContext.writeArguments(VECTOR2 to force, VECTOR2 to position)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_ADD_CONSTANT_FORCE, NIL)
  }

  public fun addConstantTorque(torque: Double): Unit {
    TransferContext.writeArguments(DOUBLE to torque)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_ADD_CONSTANT_TORQUE, NIL)
  }

  public fun getCollidingBodies(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RIGIDDYNAMICBODY2D_GET_COLLIDING_BODIES, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  public enum class FreezeMode(
    id: Long
  ) {
    FREEZE_MODE_STATIC(0),
    FREEZE_MODE_KINEMATIC(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class CCDMode(
    id: Long
  ) {
    CCD_MODE_DISABLED(0),
    CCD_MODE_CAST_RAY(1),
    CCD_MODE_CAST_SHAPE(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class DampMode(
    id: Long
  ) {
    DAMP_MODE_COMBINE(0),
    DAMP_MODE_REPLACE(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class CenterOfMassMode(
    id: Long
  ) {
    CENTER_OF_MASS_MODE_AUTO(0),
    CENTER_OF_MASS_MODE_CUSTOM(1),
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
