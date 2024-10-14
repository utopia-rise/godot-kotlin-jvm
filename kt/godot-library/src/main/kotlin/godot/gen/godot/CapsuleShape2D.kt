// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.common.interop.VoidPtr
import godot.core.TypeManager
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.NIL
import godot.core.memory.TransferContext
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * A 2D capsule shape, intended for use in physics. Usually used to provide a shape for a
 * [CollisionShape2D].
 * **Performance:** [CapsuleShape2D] is fast to check collisions against, but it is slower than
 * [RectangleShape2D] and [CircleShape2D].
 */
@GodotBaseType
public open class CapsuleShape2D : Shape2D() {
  /**
   * The capsule's radius.
   */
  public final inline var radius: Float
    @JvmName("radiusProperty")
    get() = getRadius()
    @JvmName("radiusProperty")
    set(`value`) {
      setRadius(value)
    }

  /**
   * The capsule's height.
   */
  public final inline var height: Float
    @JvmName("heightProperty")
    get() = getHeight()
    @JvmName("heightProperty")
    set(`value`) {
      setHeight(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_CAPSULESHAPE2D, scriptIndex)
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

  public final fun setHeight(height: Float): Unit {
    TransferContext.writeArguments(DOUBLE to height.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setHeightPtr, NIL)
  }

  public final fun getHeight(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getHeightPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public companion object

  internal object MethodBindings {
    public val setRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CapsuleShape2D", "set_radius", 373806689)

    public val getRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CapsuleShape2D", "get_radius", 1740695150)

    public val setHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CapsuleShape2D", "set_height", 373806689)

    public val getHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CapsuleShape2D", "get_height", 1740695150)
  }
}
