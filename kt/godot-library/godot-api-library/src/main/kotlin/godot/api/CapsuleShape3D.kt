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
import godot.core.MethodStringName0
import godot.core.MethodStringName1
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.NIL
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmStatic

/**
 * A 3D capsule shape, intended for use in physics. Usually used to provide a shape for a
 * [CollisionShape3D].
 *
 * **Performance:** [CapsuleShape3D] is fast to check collisions against. It is faster than
 * [CylinderShape3D], but slower than [SphereShape3D] and [BoxShape3D].
 */
@GodotBaseType
public open class CapsuleShape3D : Shape3D() {
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
    createNativeObject(143, scriptIndex)
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

  public companion object {
    @JvmStatic
    public val setRadiusName: MethodStringName1<CapsuleShape3D, Unit, Float> =
        MethodStringName1<CapsuleShape3D, Unit, Float>("set_radius")

    @JvmStatic
    public val getRadiusName: MethodStringName0<CapsuleShape3D, Float> =
        MethodStringName0<CapsuleShape3D, Float>("get_radius")

    @JvmStatic
    public val setHeightName: MethodStringName1<CapsuleShape3D, Unit, Float> =
        MethodStringName1<CapsuleShape3D, Unit, Float>("set_height")

    @JvmStatic
    public val getHeightName: MethodStringName0<CapsuleShape3D, Float> =
        MethodStringName0<CapsuleShape3D, Float>("get_height")
  }

  public object MethodBindings {
    internal val setRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CapsuleShape3D", "set_radius", 373806689)

    internal val getRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CapsuleShape3D", "get_radius", 1740695150)

    internal val setHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CapsuleShape3D", "set_height", 373806689)

    internal val getHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CapsuleShape3D", "get_height", 1740695150)
  }
}
