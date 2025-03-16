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

/**
 * A spheroid-shaped attractor that influences particles from [GPUParticles3D] nodes. Can be used to
 * attract particles towards its origin, or to push them away from its origin.
 *
 * Particle attractors work in real-time and can be moved, rotated and scaled during gameplay.
 * Unlike collision shapes, non-uniform scaling of attractors is also supported.
 *
 * **Note:** Particle attractors only affect [GPUParticles3D], not [CPUParticles3D].
 */
@GodotBaseType
public open class GPUParticlesAttractorSphere3D : GPUParticlesAttractor3D() {
  /**
   * The attractor sphere's radius in 3D units.
   *
   * **Note:** Stretched ellipses can be obtained by using non-uniform scaling on the
   * [GPUParticlesAttractorSphere3D] node.
   */
  public final inline var radius: Float
    @JvmName("radiusProperty")
    get() = getRadius()
    @JvmName("radiusProperty")
    set(`value`) {
      setRadius(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(247, scriptIndex)
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
        TypeManager.getMethodBindPtr("GPUParticlesAttractorSphere3D", "set_radius", 373806689)

    internal val getRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticlesAttractorSphere3D", "get_radius", 1740695150)
  }
}
