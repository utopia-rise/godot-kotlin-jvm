// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress

/**
 * A sphere-shaped 3D particle collision shape affecting [GPUParticles3D] nodes.
 * Particle collision shapes work in real-time and can be moved, rotated and scaled during gameplay.
 * Unlike attractors, non-uniform scaling of collision shapes is *not* supported.
 * **Note:** [ParticleProcessMaterial.collisionMode] must be [constant
 * ParticleProcessMaterial.COLLISION_RIGID] or [constant
 * ParticleProcessMaterial.COLLISION_HIDE_ON_CONTACT] on the [GPUParticles3D]'s process material for
 * collision to work.
 * **Note:** Particle collision only affects [GPUParticles3D], not [CPUParticles3D].
 */
@GodotBaseType
public open class GPUParticlesCollisionSphere3D : GPUParticlesCollision3D() {
  /**
   * The collision sphere's radius in 3D units.
   */
  public var radius: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRadiusPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setRadiusPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_GPUPARTICLESCOLLISIONSPHERE3D, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticlesCollisionSphere3D", "set_radius")

    public val getRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticlesCollisionSphere3D", "get_radius")
  }
}
