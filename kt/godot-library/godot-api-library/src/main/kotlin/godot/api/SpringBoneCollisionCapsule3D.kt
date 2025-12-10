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
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.NIL
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * A capsule shape collision that interacts with [SpringBoneSimulator3D].
 */
@GodotBaseType
public open class SpringBoneCollisionCapsule3D : SpringBoneCollision3D() {
  /**
   * The capsule's radius.
   *
   * **Note:** The [radius] of a capsule cannot be greater than half of its [height]. Otherwise, the
   * capsule becomes a sphere. If the [radius] is greater than half of the [height], the properties
   * adjust to a valid value.
   */
  public final inline var radius: Float
    @JvmName("radiusProperty")
    get() = getRadius()
    @JvmName("radiusProperty")
    set(`value`) {
      setRadius(value)
    }

  /**
   * The capsule's full height, including the hemispheres.
   *
   * **Note:** The [height] of a capsule must be at least twice its [radius]. Otherwise, the capsule
   * becomes a sphere. If the [height] is less than twice the [radius], the properties adjust to a
   * valid value.
   */
  public final inline var height: Float
    @JvmName("heightProperty")
    get() = getHeight()
    @JvmName("heightProperty")
    set(`value`) {
      setHeight(value)
    }

  /**
   * The capsule's height, excluding the hemispheres. This is the height of the central cylindrical
   * part in the middle of the capsule, and is the distance between the centers of the two hemispheres.
   * This is a wrapper for [height].
   */
  public final inline var midHeight: Float
    @JvmName("midHeightProperty")
    get() = getMidHeight()
    @JvmName("midHeightProperty")
    set(`value`) {
      setMidHeight(value)
    }

  /**
   * If `true`, the collision acts to trap the joint within the collision.
   */
  public final inline var inside: Boolean
    @JvmName("insideProperty")
    get() = isInside()
    @JvmName("insideProperty")
    set(`value`) {
      setInside(value)
    }

  public override fun new(scriptPtr: VoidPtr): Unit {
    createNativeObject(639, scriptPtr)
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

  public final fun setMidHeight(midHeight: Float): Unit {
    TransferContext.writeArguments(DOUBLE to midHeight.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setMidHeightPtr, NIL)
  }

  public final fun getMidHeight(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMidHeightPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setInside(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setInsidePtr, NIL)
  }

  public final fun isInside(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isInsidePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public companion object

  public object MethodBindings {
    internal val setRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneCollisionCapsule3D", "set_radius", 373806689)

    internal val getRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneCollisionCapsule3D", "get_radius", 1740695150)

    internal val setHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneCollisionCapsule3D", "set_height", 373806689)

    internal val getHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneCollisionCapsule3D", "get_height", 1740695150)

    internal val setMidHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneCollisionCapsule3D", "set_mid_height", 373806689)

    internal val getMidHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneCollisionCapsule3D", "get_mid_height", 1740695150)

    internal val setInsidePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneCollisionCapsule3D", "set_inside", 2586408642)

    internal val isInsidePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneCollisionCapsule3D", "is_inside", 36873697)
  }
}
