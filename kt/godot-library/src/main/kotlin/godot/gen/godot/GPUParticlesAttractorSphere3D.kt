// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress

/**
 * A spheroid-shaped attractor that influences particles from [godot.GPUParticles3D] nodes.
 *
 * A spheroid-shaped attractor that influences particles from [godot.GPUParticles3D] nodes. Can be used to attract particles towards its origin, or to push them away from its origin.
 *
 * Particle attractors work in real-time and can be moved, rotated and scaled during gameplay. Unlike collision shapes, non-uniform scaling of attractors is also supported.
 *
 * **Note:** Particle attractors only affect [godot.GPUParticles3D], not [godot.CPUParticles3D].
 */
@GodotBaseType
public open class GPUParticlesAttractorSphere3D : GPUParticlesAttractor3D() {
  /**
   * The attractor sphere's radius in 3D units.
   *
   * **Note:** Stretched ellipses can be obtained by using non-uniform scaling on the [godot.GPUParticlesAttractorSphere3D] node.
   */
  public var radius: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GPUPARTICLESATTRACTORSPHERE3D_GET_RADIUS, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GPUPARTICLESATTRACTORSPHERE3D_SET_RADIUS, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_GPUPARTICLESATTRACTORSPHERE3D, scriptIndex)
    return true
  }

  public companion object
}
