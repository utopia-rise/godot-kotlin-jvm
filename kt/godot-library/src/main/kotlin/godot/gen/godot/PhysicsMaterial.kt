// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import kotlin.Boolean
import kotlin.Double
import kotlin.Suppress
import kotlin.Unit

/**
 * A material for physics properties.
 *
 * Provides a means of modifying the collision properties of a [godot.PhysicsBody3D].
 */
@GodotBaseType
public open class PhysicsMaterial : Resource() {
  /**
   * The body's friction. Values range from `0` (frictionless) to `1` (maximum friction).
   */
  public open var friction: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSMATERIAL_GET_FRICTION,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSMATERIAL_SET_FRICTION, NIL)
    }

  /**
   * If `true`, the physics engine will use the friction of the object marked as "rough" when two objects collide. If `false`, the physics engine will use the lowest friction of all colliding objects instead. If `true` for both colliding objects, the physics engine will use the highest friction.
   */
  public open var rough: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSMATERIAL_GET_ROUGH, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSMATERIAL_SET_ROUGH, NIL)
    }

  /**
   * The body's bounciness. Values range from `0` (no bounce) to `1` (full bounciness).
   */
  public open var bounce: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSMATERIAL_GET_BOUNCE,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSMATERIAL_SET_BOUNCE, NIL)
    }

  /**
   * If `true`, subtracts the bounciness from the colliding object's bounciness instead of adding it.
   */
  public open var absorbent: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSMATERIAL_GET_ABSORBENT,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSMATERIAL_SET_ABSORBENT,
          NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_PHYSICSMATERIAL)
  }

  public companion object
}
