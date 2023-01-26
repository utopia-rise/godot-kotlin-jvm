// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

/**
 * Box-shaped 3D particle collision shape affecting [godot.GPUParticles3D] nodes.
 *
 * Box-shaped 3D particle collision shape affecting [godot.GPUParticles3D] nodes.
 *
 * **Note:** [godot.ParticleProcessMaterial.collisionMode] must be [godot.ParticleProcessMaterial.COLLISION_RIGID] or [godot.ParticleProcessMaterial.COLLISION_HIDE_ON_CONTACT] on the [godot.GPUParticles3D]'s process material for collision to work.
 *
 * **Note:** Particle collision only affects [godot.GPUParticles3D], not [godot.CPUParticles3D].
 */
@GodotBaseType
public open class GPUParticlesCollisionBox3D : GPUParticlesCollision3D() {
  /**
   * The collision box's size in 3D units.
   */
  public var size: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GPUPARTICLESCOLLISIONBOX3D_GET_SIZE, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GPUPARTICLESCOLLISIONBOX3D_SET_SIZE, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_GPUPARTICLESCOLLISIONBOX3D, scriptIndex)
    return true
  }

  public companion object
}
