// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.Transform2D
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.TRANSFORM2D
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Suppress
import kotlin.Unit

/**
 * Parameters to be sent to a 2D body motion test.
 *
 * This class contains parameters used in [godot.PhysicsServer2D.bodyTestMotion].
 */
@GodotBaseType
public open class PhysicsTestMotionParameters2D : RefCounted() {
  /**
   * Transform in global space where the motion should start. Usually set to [godot.Node2D.globalTransform] for the current body's transform.
   */
  public var from: Transform2D
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSTESTMOTIONPARAMETERS2D_GET_FROM,
          TRANSFORM2D.ordinal)
      return TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D
    }
    set(`value`) {
      TransferContext.writeArguments(TRANSFORM2D to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSTESTMOTIONPARAMETERS2D_SET_FROM,
          NIL.ordinal)
    }

  /**
   * Motion vector to define the length and direction of the motion to test.
   */
  public var motion: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSTESTMOTIONPARAMETERS2D_GET_MOTION, VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSTESTMOTIONPARAMETERS2D_SET_MOTION, NIL.ordinal)
    }

  /**
   * Increases the size of the shapes involved in the collision detection.
   */
  public var margin: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSTESTMOTIONPARAMETERS2D_GET_MARGIN, DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSTESTMOTIONPARAMETERS2D_SET_MARGIN, NIL.ordinal)
    }

  /**
   * If set to `true`, shapes of type [godot.PhysicsServer2D.SHAPE_SEPARATION_RAY] are used to detect collisions and can stop the motion. Can be useful when snapping to the ground.
   *
   * If set to `false`, shapes of type [godot.PhysicsServer2D.SHAPE_SEPARATION_RAY] are only used for separation when overlapping with other bodies. That's the main use for separation ray shapes.
   */
  public var collideSeparationRay: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSTESTMOTIONPARAMETERS2D_IS_COLLIDE_SEPARATION_RAY_ENABLED,
          BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSTESTMOTIONPARAMETERS2D_SET_COLLIDE_SEPARATION_RAY_ENABLED,
          NIL.ordinal)
    }

  /**
   * Optional array of body [RID] to exclude from collision.
   */
  public var excludeBodies: VariantArray<Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSTESTMOTIONPARAMETERS2D_GET_EXCLUDE_BODIES, ARRAY.ordinal)
      return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSTESTMOTIONPARAMETERS2D_SET_EXCLUDE_BODIES, NIL.ordinal)
    }

  /**
   * Optional array of object unique instance ID to exclude from collision. See [godot.Object.getInstanceId].
   */
  public var excludeObjects: VariantArray<Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSTESTMOTIONPARAMETERS2D_GET_EXCLUDE_OBJECTS, ARRAY.ordinal)
      return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSTESTMOTIONPARAMETERS2D_SET_EXCLUDE_OBJECTS, NIL.ordinal)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_PHYSICSTESTMOTIONPARAMETERS2D)
  }

  public companion object
}
