// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.NIL
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINECLASS_CIRCLESHAPE2D: Int = 183

/**
 * A 2D circle shape, intended for use in physics. Usually used to provide a shape for a
 * [CollisionShape2D].
 * **Performance:** [CircleShape2D] is fast to check collisions against. It is faster than
 * [RectangleShape2D] and [CapsuleShape2D].
 */
@GodotBaseType
public open class CircleShape2D : Shape2D() {
  /**
   * The circle's radius.
   */
  public final inline var radius: Float
    @JvmName("radiusProperty")
    get() = getRadius()
    @JvmName("radiusProperty")
    set(`value`) {
      setRadius(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_CIRCLESHAPE2D, scriptIndex)
  }

  public final fun setRadius(radius: Float): Unit {
    TransferContext.writeArguments(DOUBLE to radius.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setRadiusPtr, NIL)
  }

  public final fun getRadius(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRadiusPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public companion object

  public object MethodBindings {
    internal val setRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CircleShape2D", "set_radius", 373806689)

    internal val getRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CircleShape2D", "get_radius", 1740695150)
  }
}
