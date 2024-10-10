// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.NIL
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_SEPARATIONRAYSHAPE2D_INDEX: Int = 571

/**
 * A 2D ray shape, intended for use in physics. Usually used to provide a shape for a
 * [CollisionShape2D]. When a [SeparationRayShape2D] collides with an object, it tries to separate
 * itself from it by moving its endpoint to the collision point. For example, a [SeparationRayShape2D]
 * next to a character can allow it to instantly move up when touching stairs.
 */
@GodotBaseType
public open class SeparationRayShape2D : Shape2D() {
  /**
   * The ray's length.
   */
  public final inline var length: Float
    @JvmName("lengthProperty")
    get() = getLength()
    @JvmName("lengthProperty")
    set(`value`) {
      setLength(value)
    }

  /**
   * If `false` (default), the shape always separates and returns a normal along its own direction.
   * If `true`, the shape can return the correct normal and separate in any direction, allowing
   * sliding motion on slopes.
   */
  public final inline var slideOnSlope: Boolean
    @JvmName("slideOnSlopeProperty")
    get() = getSlideOnSlope()
    @JvmName("slideOnSlopeProperty")
    set(`value`) {
      setSlideOnSlope(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_SEPARATIONRAYSHAPE2D_INDEX, scriptIndex)
  }

  public final fun setLength(length: Float): Unit {
    Internals.writeArguments(DOUBLE to length.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setLengthPtr, NIL)
  }

  public final fun getLength(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getLengthPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setSlideOnSlope(active: Boolean): Unit {
    Internals.writeArguments(BOOL to active)
    Internals.callMethod(rawPtr, MethodBindings.setSlideOnSlopePtr, NIL)
  }

  public final fun getSlideOnSlope(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSlideOnSlopePtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public companion object

  internal object MethodBindings {
    public val setLengthPtr: VoidPtr =
        Internals.getMethodBindPtr("SeparationRayShape2D", "set_length", 373806689)

    public val getLengthPtr: VoidPtr =
        Internals.getMethodBindPtr("SeparationRayShape2D", "get_length", 1740695150)

    public val setSlideOnSlopePtr: VoidPtr =
        Internals.getMethodBindPtr("SeparationRayShape2D", "set_slide_on_slope", 2586408642)

    public val getSlideOnSlopePtr: VoidPtr =
        Internals.getMethodBindPtr("SeparationRayShape2D", "get_slide_on_slope", 36873697)
  }
}
