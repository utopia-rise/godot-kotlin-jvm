// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * Abstract base class for 3D particle collision shapes affecting [godot.GPUParticles3D] nodes.
 *
 * Particle collision shapes can be used to make particles stop or bounce against them.
 *
 * Particle collision shapes work in real-time and can be moved, rotated and scaled during gameplay. Unlike attractors, non-uniform scaling of collision shapes is *not* supported.
 *
 * Particle collision shapes can be temporarily disabled by hiding them.
 *
 * **Note:** [godot.ParticleProcessMaterial.collisionMode] must be [godot.ParticleProcessMaterial.COLLISION_RIGID] or [godot.ParticleProcessMaterial.COLLISION_HIDE_ON_CONTACT] on the [godot.GPUParticles3D]'s process material for collision to work.
 *
 * **Note:** Particle collision only affects [godot.GPUParticles3D], not [godot.CPUParticles3D].
 *
 * **Note:** Particles pushed by a collider that is being moved will not be interpolated, which can result in visible stuttering. This can be alleviated by setting [godot.GPUParticles3D.fixedFps] to `0` or a value that matches or exceeds the target framerate.
 */
@GodotBaseType
public open class GPUParticlesCollision3D internal constructor() : VisualInstance3D() {
  /**
   * The particle rendering layers ([godot.VisualInstance3D.layers]) that will be affected by the collision shape. By default, all particles that have [godot.ParticleProcessMaterial.collisionMode] set to [godot.ParticleProcessMaterial.COLLISION_RIGID] or [godot.ParticleProcessMaterial.COLLISION_HIDE_ON_CONTACT] will be affected by a collision shape.
   *
   * After configuring particle nodes accordingly, specific layers can be unchecked to prevent certain particles from being affected by attractors. For example, this can be used if you're using an attractor as part of a spell effect but don't want the attractor to affect unrelated weather particles at the same position.
   *
   * Particle attraction can also be disabled on a per-process material basis by setting [godot.ParticleProcessMaterial.attractorInteractionEnabled] on the [godot.GPUParticles3D] node.
   */
  public var cullMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GPUPARTICLESCOLLISION3D_GET_CULL_MASK, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GPUPARTICLESCOLLISION3D_SET_CULL_MASK, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_GPUPARTICLESCOLLISION3D, scriptIndex)
    return true
  }

  public companion object
}
