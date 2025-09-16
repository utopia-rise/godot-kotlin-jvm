// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier", "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST", "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT", "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

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
import kotlin.Int
import kotlin.Suppress
import kotlin.jvm.JvmName

/**
 * A sphere shape collision that interacts with [SpringBoneSimulator3D].
 */
@GodotBaseType
public open class SpringBoneCollisionSphere3D : SpringBoneCollision3D() {
  /**
   * The sphere's radius.
   */
  public final inline var radius: Float
    @JvmName("radiusProperty")
    get() = getRadius()
    @JvmName("radiusProperty")
    set(`value`) {
      setRadius(value)
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

  override fun new(scriptIndex: Int) {
    createNativeObject(624, scriptIndex)
  }

  public final fun setRadius(radius: Float) {
    TransferContext.writeArguments(DOUBLE to radius.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setRadiusPtr, NIL)
  }

  public final fun getRadius(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRadiusPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setInside(enabled: Boolean) {
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
        TypeManager.getMethodBindPtr("SpringBoneCollisionSphere3D", "set_radius", 373_806_689)

    internal val getRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneCollisionSphere3D", "get_radius", 1_740_695_150)

    internal val setInsidePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneCollisionSphere3D", "set_inside", 2_586_408_642)

    internal val isInsidePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneCollisionSphere3D", "is_inside", 36_873_697)
  }
}
