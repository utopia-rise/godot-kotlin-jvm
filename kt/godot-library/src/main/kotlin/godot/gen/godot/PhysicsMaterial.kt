// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Holds physics-related properties of a surface, namely its roughness and bounciness. This class is
 * used to apply these properties to a physics body.
 */
@GodotBaseType
public open class PhysicsMaterial : Resource() {
  /**
   * The body's friction. Values range from `0` (frictionless) to `1` (maximum friction).
   */
  public var friction: Float
    @JvmName("frictionProperty")
    get() = getFriction()
    @JvmName("frictionProperty")
    set(`value`) {
      setFriction(value)
    }

  /**
   * If `true`, the physics engine will use the friction of the object marked as "rough" when two
   * objects collide. If `false`, the physics engine will use the lowest friction of all colliding
   * objects instead. If `true` for both colliding objects, the physics engine will use the highest
   * friction.
   */
  public var rough: Boolean
    @JvmName("roughProperty")
    get() = isRough()
    @JvmName("roughProperty")
    set(`value`) {
      setRough(value)
    }

  /**
   * The body's bounciness. Values range from `0` (no bounce) to `1` (full bounciness).
   * **Note:** Even with [bounce] set to `1.0`, some energy will be lost over time due to linear and
   * angular damping. To have a physics body that preserves all its energy over time, set [bounce] to
   * `1.0`, the body's linear damp mode to **Replace** (if applicable), its linear damp to `0.0`, its
   * angular damp mode to **Replace** (if applicable), and its angular damp to `0.0`.
   */
  public var bounce: Float
    @JvmName("bounceProperty")
    get() = getBounce()
    @JvmName("bounceProperty")
    set(`value`) {
      setBounce(value)
    }

  /**
   * If `true`, subtracts the bounciness from the colliding object's bounciness instead of adding
   * it.
   */
  public var absorbent: Boolean
    @JvmName("absorbentProperty")
    get() = isAbsorbent()
    @JvmName("absorbentProperty")
    set(`value`) {
      setAbsorbent(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_PHYSICSMATERIAL, scriptIndex)
  }

  public fun setFriction(friction: Float): Unit {
    TransferContext.writeArguments(DOUBLE to friction.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setFrictionPtr, NIL)
  }

  public fun getFriction(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFrictionPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun setRough(rough: Boolean): Unit {
    TransferContext.writeArguments(BOOL to rough)
    TransferContext.callMethod(rawPtr, MethodBindings.setRoughPtr, NIL)
  }

  public fun isRough(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isRoughPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun setBounce(bounce: Float): Unit {
    TransferContext.writeArguments(DOUBLE to bounce.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setBouncePtr, NIL)
  }

  public fun getBounce(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getBouncePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun setAbsorbent(absorbent: Boolean): Unit {
    TransferContext.writeArguments(BOOL to absorbent)
    TransferContext.callMethod(rawPtr, MethodBindings.setAbsorbentPtr, NIL)
  }

  public fun isAbsorbent(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isAbsorbentPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public companion object

  internal object MethodBindings {
    public val setFrictionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsMaterial", "set_friction", 373806689)

    public val getFrictionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsMaterial", "get_friction", 1740695150)

    public val setRoughPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsMaterial", "set_rough", 2586408642)

    public val isRoughPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsMaterial", "is_rough", 36873697)

    public val setBouncePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsMaterial", "set_bounce", 373806689)

    public val getBouncePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsMaterial", "get_bounce", 1740695150)

    public val setAbsorbentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsMaterial", "set_absorbent", 2586408642)

    public val isAbsorbentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsMaterial", "is_absorbent", 36873697)
  }
}
