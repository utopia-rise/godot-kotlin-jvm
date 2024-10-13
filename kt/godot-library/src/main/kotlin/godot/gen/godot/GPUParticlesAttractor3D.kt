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
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.memory.TransferContext
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Particle attractors can be used to attract particles towards the attractor's origin, or to push
 * them away from the attractor's origin.
 * Particle attractors work in real-time and can be moved, rotated and scaled during gameplay.
 * Unlike collision shapes, non-uniform scaling of attractors is also supported.
 * Attractors can be temporarily disabled by hiding them, or by setting their [strength] to `0.0`.
 * **Note:** Particle attractors only affect [GPUParticles3D], not [CPUParticles3D].
 */
@GodotBaseType
public open class GPUParticlesAttractor3D internal constructor() : VisualInstance3D() {
  /**
   * Adjusts the strength of the attractor. If [strength] is negative, particles will be pushed in
   * the opposite direction. Particles will be pushed *away* from the attractor's origin if
   * [directionality] is `0.0`, or towards local +Z if [directionality] is greater than `0.0`.
   */
  public final inline var strength: Float
    @JvmName("strengthProperty")
    get() = getStrength()
    @JvmName("strengthProperty")
    set(`value`) {
      setStrength(value)
    }

  /**
   * The particle attractor's attenuation. Higher values result in more gradual pushing of particles
   * as they come closer to the attractor's origin. Zero or negative values will cause particles to be
   * pushed very fast as soon as the touch the attractor's edges.
   */
  public final inline var attenuation: Float
    @JvmName("attenuationProperty")
    get() = getAttenuation()
    @JvmName("attenuationProperty")
    set(`value`) {
      setAttenuation(value)
    }

  /**
   * Adjusts how directional the attractor is. At `0.0`, the attractor is not directional at all: it
   * will attract particles towards its center. At `1.0`, the attractor is fully directional: particles
   * will always be pushed towards local -Z (or +Z if [strength] is negative).
   * **Note:** If [directionality] is greater than `0.0`, the direction in which particles are
   * pushed can be changed by rotating the [GPUParticlesAttractor3D] node.
   */
  public final inline var directionality: Float
    @JvmName("directionalityProperty")
    get() = getDirectionality()
    @JvmName("directionalityProperty")
    set(`value`) {
      setDirectionality(value)
    }

  /**
   * The particle rendering layers ([VisualInstance3D.layers]) that will be affected by the
   * attractor. By default, all particles are affected by an attractor.
   * After configuring particle nodes accordingly, specific layers can be unchecked to prevent
   * certain particles from being affected by attractors. For example, this can be used if you're using
   * an attractor as part of a spell effect but don't want the attractor to affect unrelated weather
   * particles at the same position.
   * Particle attraction can also be disabled on a per-process material basis by setting
   * [ParticleProcessMaterial.attractorInteractionEnabled] on the [GPUParticles3D] node.
   */
  public final inline var cullMask: Long
    @JvmName("cullMaskProperty")
    get() = getCullMask()
    @JvmName("cullMaskProperty")
    set(`value`) {
      setCullMask(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_GPUPARTICLESATTRACTOR3D, scriptIndex)
  }

  public final fun setCullMask(mask: Long): Unit {
    TransferContext.writeArguments(LONG to mask)
    TransferContext.callMethod(ptr, MethodBindings.setCullMaskPtr, NIL)
  }

  public final fun getCullMask(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCullMaskPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setStrength(strength: Float): Unit {
    TransferContext.writeArguments(DOUBLE to strength.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setStrengthPtr, NIL)
  }

  public final fun getStrength(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getStrengthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setAttenuation(attenuation: Float): Unit {
    TransferContext.writeArguments(DOUBLE to attenuation.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setAttenuationPtr, NIL)
  }

  public final fun getAttenuation(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAttenuationPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setDirectionality(amount: Float): Unit {
    TransferContext.writeArguments(DOUBLE to amount.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setDirectionalityPtr, NIL)
  }

  public final fun getDirectionality(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDirectionalityPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public companion object

  internal object MethodBindings {
    public val setCullMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticlesAttractor3D", "set_cull_mask", 1286410249)

    public val getCullMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticlesAttractor3D", "get_cull_mask", 3905245786)

    public val setStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticlesAttractor3D", "set_strength", 373806689)

    public val getStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticlesAttractor3D", "get_strength", 1740695150)

    public val setAttenuationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticlesAttractor3D", "set_attenuation", 373806689)

    public val getAttenuationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticlesAttractor3D", "get_attenuation", 1740695150)

    public val setDirectionalityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticlesAttractor3D", "set_directionality", 373806689)

    public val getDirectionalityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticlesAttractor3D", "get_directionality", 1740695150)
  }
}
