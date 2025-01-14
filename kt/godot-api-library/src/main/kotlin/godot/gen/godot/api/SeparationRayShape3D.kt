// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.NIL
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * A 3D ray shape, intended for use in physics. Usually used to provide a shape for a
 * [CollisionShape3D]. When a [SeparationRayShape3D] collides with an object, it tries to separate
 * itself from it by moving its endpoint to the collision point. For example, a [SeparationRayShape3D]
 * next to a character can allow it to instantly move up when touching stairs.
 */
@GodotBaseType
public open class SeparationRayShape3D : Shape3D() {
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
    createNativeObject(ENGINECLASS_SEPARATIONRAYSHAPE3D, scriptIndex)
  }

  public final fun setLength(length: Float): Unit {
    TransferContext.writeArguments(DOUBLE to length.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setLengthPtr, NIL)
  }

  public final fun getLength(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLengthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setSlideOnSlope(active: Boolean): Unit {
    TransferContext.writeArguments(BOOL to active)
    TransferContext.callMethod(ptr, MethodBindings.setSlideOnSlopePtr, NIL)
  }

  public final fun getSlideOnSlope(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSlideOnSlopePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public companion object

  internal object MethodBindings {
    public val setLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SeparationRayShape3D", "set_length", 373806689)

    public val getLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SeparationRayShape3D", "get_length", 1740695150)

    public val setSlideOnSlopePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SeparationRayShape3D", "set_slide_on_slope", 2586408642)

    public val getSlideOnSlopePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SeparationRayShape3D", "get_slide_on_slope", 36873697)
  }
}
