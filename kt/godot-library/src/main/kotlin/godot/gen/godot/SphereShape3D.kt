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
 * A 3D sphere shape, intended for use in physics. Usually used to provide a shape for a
 * [CollisionShape3D].
 * **Performance:** [SphereShape3D] is fast to check collisions against. It is faster than
 * [BoxShape3D], [CapsuleShape3D], and [CylinderShape3D].
 */
@GodotBaseType
public open class SphereShape3D : Shape3D() {
  /**
   * The sphere's radius. The shape's diameter is double the radius.
   */
  public final inline var radius: Float
    @JvmName("radiusProperty")
    get() = getRadius()
    @JvmName("radiusProperty")
    set(`value`) {
      setRadius(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_SPHERESHAPE3D, scriptIndex)
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

  internal object MethodBindings {
    public val setRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SphereShape3D", "set_radius", 373806689)

    public val getRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SphereShape3D", "get_radius", 1740695150)
  }
}
