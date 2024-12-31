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

private const val ENGINECLASS_CYLINDERSHAPE3D: Int = 222

/**
 * A 3D cylinder shape, intended for use in physics. Usually used to provide a shape for a
 * [CollisionShape3D].
 * **Note:** There are several known bugs with cylinder collision shapes. Using [CapsuleShape3D] or
 * [BoxShape3D] instead is recommended.
 * **Performance:** [CylinderShape3D] is fast to check collisions against, but it is slower than
 * [CapsuleShape3D], [BoxShape3D], and [SphereShape3D].
 */
@GodotBaseType
public open class CylinderShape3D : Shape3D() {
  /**
   * The cylinder's height.
   */
  public final inline var height: Float
    @JvmName("heightProperty")
    get() = getHeight()
    @JvmName("heightProperty")
    set(`value`) {
      setHeight(value)
    }

  /**
   * The cylinder's radius.
   */
  public final inline var radius: Float
    @JvmName("radiusProperty")
    get() = getRadius()
    @JvmName("radiusProperty")
    set(`value`) {
      setRadius(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_CYLINDERSHAPE3D, scriptIndex)
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

  public object MethodBindings {
    internal val setRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CylinderShape3D", "set_radius", 373806689)

    internal val getRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CylinderShape3D", "get_radius", 1740695150)

    internal val setHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CylinderShape3D", "set_height", 373806689)

    internal val getHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CylinderShape3D", "get_height", 1740695150)
  }
}
