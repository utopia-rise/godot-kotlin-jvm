// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * Abstract class for 3D particle attractors affecting [godot.GPUParticles3D] nodes.
 *
 * Particle attractors can be used to attract particles towards the attractor's origin, or to push them away from the attractor's origin.
 *
 * Particle attractors work in real-time and can be moved, rotated and scaled during gameplay. Unlike collision shapes, non-uniform scaling of attractors is also supported.
 *
 * Attractors can be temporarily disabled by hiding them, or by setting their [strength] to `0.0`.
 *
 * **Note:** Particle attractors only affect [godot.GPUParticles3D], not [godot.CPUParticles3D].
 */
@GodotBaseType
public open class GPUParticlesAttractor3D internal constructor() : VisualInstance3D() {
  /**
   * If [strength] is negative, particles will be pushed in the reverse direction. Particles will be pushed *away* from the attractor's  origin if [directionality] is `0.0`, or towards local +Z if [directionality] is greater than `0.0`.
   */
  public var strength: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getStrengthPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setStrengthPtr, NIL)
    }

  /**
   * The particle attractor's attenuation. Higher values result in more gradual pushing of particles as they come closer to the attractor's origin. Zero or negative values will cause particles to be pushed very fast as soon as the touch the attractor's edges.
   */
  public var attenuation: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAttenuationPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setAttenuationPtr, NIL)
    }

  /**
   * Adjusts how directional the attractor is. At `0.0`, the attractor is not directional at all: it will attract particles towards its center. At `1.0`, the attractor is fully directional: particles will always be pushed towards local -Z (or +Z if [strength] is negative).
   *
   * **Note:** If [directionality] is greater than `0.0`, the direction in which particles are pushed can be changed by rotating the [godot.GPUParticlesAttractor3D] node.
   */
  public var directionality: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDirectionalityPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setDirectionalityPtr, NIL)
    }

  /**
   * The particle rendering layers ([godot.VisualInstance3D.layers]) that will be affected by the attractor. By default, all particles are affected by an attractor.
   *
   * After configuring particle nodes accordingly, specific layers can be unchecked to prevent certain particles from being affected by attractors. For example, this can be used if you're using an attractor as part of a spell effect but don't want the attractor to affect unrelated weather particles at the same position.
   *
   * Particle attraction can also be disabled on a per-process material basis by setting [godot.ParticleProcessMaterial.attractorInteractionEnabled] on the [godot.GPUParticles3D] node.
   */
  public var cullMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCullMaskPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCullMaskPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_GPUPARTICLESATTRACTOR3D, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setCullMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticlesAttractor3D", "set_cull_mask")

    public val getCullMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticlesAttractor3D", "get_cull_mask")

    public val setStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticlesAttractor3D", "set_strength")

    public val getStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticlesAttractor3D", "get_strength")

    public val setAttenuationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticlesAttractor3D", "set_attenuation")

    public val getAttenuationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticlesAttractor3D", "get_attenuation")

    public val setDirectionalityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticlesAttractor3D", "set_directionality")

    public val getDirectionalityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticlesAttractor3D", "get_directionality")
  }
}
