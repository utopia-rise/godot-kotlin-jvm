// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.Transform3D
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.TRANSFORM3D
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Parameters to be sent to a 3D body motion test.
 *
 * This class contains parameters used in [godot.PhysicsServer3D.bodyTestMotion].
 */
@GodotBaseType
public open class PhysicsTestMotionParameters3D : RefCounted() {
  /**
   * Transform in global space where the motion should start. Usually set to [godot.Node3D.globalTransform] for the current body's transform.
   */
  public open var from: Transform3D
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSTESTMOTIONPARAMETERS3D_GET_FROM, TRANSFORM3D)
      return TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D
    }
    set(`value`) {
      TransferContext.writeArguments(TRANSFORM3D to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSTESTMOTIONPARAMETERS3D_SET_FROM, NIL)
    }

  /**
   * Motion vector to define the length and direction of the motion to test.
   */
  public open var motion: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSTESTMOTIONPARAMETERS3D_GET_MOTION, VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSTESTMOTIONPARAMETERS3D_SET_MOTION, NIL)
    }

  /**
   * Increases the size of the shapes involved in the collision detection.
   */
  public open var margin: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSTESTMOTIONPARAMETERS3D_GET_MARGIN, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSTESTMOTIONPARAMETERS3D_SET_MARGIN, NIL)
    }

  /**
   * Maximum number of returned collisions, between `1` and `32`. Always returns the deepest detected collisions.
   */
  public open var maxCollisions: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSTESTMOTIONPARAMETERS3D_GET_MAX_COLLISIONS, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSTESTMOTIONPARAMETERS3D_SET_MAX_COLLISIONS, NIL)
    }

  /**
   * If set to `true`, shapes of type [godot.PhysicsServer3D.SHAPE_SEPARATION_RAY] are used to detect collisions and can stop the motion. Can be useful when snapping to the ground.
   *
   * If set to `false`, shapes of type [godot.PhysicsServer3D.SHAPE_SEPARATION_RAY] are only used for separation when overlapping with other bodies. That's the main use for separation ray shapes.
   */
  public open var collideSeparationRay: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSTESTMOTIONPARAMETERS3D_IS_COLLIDE_SEPARATION_RAY_ENABLED,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSTESTMOTIONPARAMETERS3D_SET_COLLIDE_SEPARATION_RAY_ENABLED,
          NIL)
    }

  /**
   * Optional array of body [RID] to exclude from collision.
   */
  public open var excludeBodies: VariantArray<Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSTESTMOTIONPARAMETERS3D_GET_EXCLUDE_BODIES, ARRAY)
      return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSTESTMOTIONPARAMETERS3D_SET_EXCLUDE_BODIES, NIL)
    }

  /**
   * Optional array of object unique instance ID to exclude from collision. See [godot.Object.getInstanceId].
   */
  public open var excludeObjects: VariantArray<Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSTESTMOTIONPARAMETERS3D_GET_EXCLUDE_OBJECTS, ARRAY)
      return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSTESTMOTIONPARAMETERS3D_SET_EXCLUDE_OBJECTS, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_PHYSICSTESTMOTIONPARAMETERS3D)
  }

  public companion object
}
