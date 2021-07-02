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
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.TRANSFORM
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 *
 */
@GodotBaseType
public open class PhysicalBone : PhysicsBody() {
  /**
   *
   */
  public open var bodyOffset: Transform
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICALBONE_GET_BODY_OFFSET,
          TRANSFORM)
      return TransferContext.readReturnValue(TRANSFORM, false) as Transform
    }
    set(`value`) {
      TransferContext.writeArguments(TRANSFORM to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICALBONE_SET_BODY_OFFSET, NIL)
    }

  /**
   *
   */
  public open var bounce: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICALBONE_GET_BOUNCE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICALBONE_SET_BOUNCE, NIL)
    }

  /**
   *
   */
  public open var friction: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICALBONE_GET_FRICTION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICALBONE_SET_FRICTION, NIL)
    }

  /**
   *
   */
  public open var gravityScale: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICALBONE_GET_GRAVITY_SCALE,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICALBONE_SET_GRAVITY_SCALE,
          NIL)
    }

  /**
   *
   */
  public open var jointOffset: Transform
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICALBONE_GET_JOINT_OFFSET,
          TRANSFORM)
      return TransferContext.readReturnValue(TRANSFORM, false) as Transform
    }
    set(`value`) {
      TransferContext.writeArguments(TRANSFORM to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICALBONE_SET_JOINT_OFFSET,
          NIL)
    }

  /**
   *
   */
  public open var jointType: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICALBONE_GET_JOINT_TYPE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICALBONE_SET_JOINT_TYPE, NIL)
    }

  /**
   *
   */
  public open var mass: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICALBONE_GET_MASS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICALBONE_SET_MASS, NIL)
    }

  /**
   *
   */
  public open var weight: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICALBONE_GET_WEIGHT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICALBONE_SET_WEIGHT, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_PHYSICALBONE)
  }

  @CoreTypeHelper
  public open fun bodyOffset(schedule: Transform.() -> Unit): Transform = bodyOffset.apply{
      schedule(this)
      bodyOffset = this
  }


  @CoreTypeHelper
  public open fun jointOffset(schedule: Transform.() -> Unit): Transform = jointOffset.apply{
      schedule(this)
      jointOffset = this
  }


  public open fun _directStateChanged(arg0: Object): Unit {
  }

  /**
   *
   */
  public open fun applyCentralImpulse(impulse: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to impulse)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICALBONE_APPLY_CENTRAL_IMPULSE,
        NIL)
  }

  /**
   *
   */
  public open fun applyImpulse(position: Vector3, impulse: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to position, VECTOR3 to impulse)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICALBONE_APPLY_IMPULSE, NIL)
  }

  /**
   *
   */
  public open fun getBoneId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICALBONE_GET_BONE_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   *
   */
  public open fun getSimulatePhysics(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICALBONE_GET_SIMULATE_PHYSICS,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   *
   */
  public open fun isSimulatingPhysics(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICALBONE_IS_SIMULATING_PHYSICS,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   *
   */
  public open fun isStaticBody(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICALBONE_IS_STATIC_BODY, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public enum class JointType(
    id: Long
  ) {
    /**
     *
     */
    JOINT_TYPE_NONE(0),
    /**
     *
     */
    JOINT_TYPE_PIN(1),
    /**
     *
     */
    JOINT_TYPE_CONE(2),
    /**
     *
     */
    JOINT_TYPE_HINGE(3),
    /**
     *
     */
    JOINT_TYPE_SLIDER(4),
    /**
     *
     */
    JOINT_TYPE_6DOF(5),
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
     *
     */
    public final const val JOINT_TYPE_6DOF: Long = 5

    /**
     *
     */
    public final const val JOINT_TYPE_CONE: Long = 2

    /**
     *
     */
    public final const val JOINT_TYPE_HINGE: Long = 3

    /**
     *
     */
    public final const val JOINT_TYPE_NONE: Long = 0

    /**
     *
     */
    public final const val JOINT_TYPE_PIN: Long = 1

    /**
     *
     */
    public final const val JOINT_TYPE_SLIDER: Long = 4
  }
}
