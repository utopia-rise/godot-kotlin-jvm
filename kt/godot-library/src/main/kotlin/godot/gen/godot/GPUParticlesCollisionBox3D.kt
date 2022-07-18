// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import kotlin.Suppress
import kotlin.Unit

/**
 * Box-shaped 3D particle collision shape affecting [godot.GPUParticles3D] nodes.
 *
 * Box-shaped 3D particle collision shape affecting [godot.GPUParticles3D] nodes.
 *
 * **Note:** [godot.ParticlesMaterial.collisionEnabled] must be `true` on the [godot.GPUParticles3D]'s process material for collision to work.
 *
 * **Note:** Particle collision only affects [godot.GPUParticles3D], not [godot.CPUParticles3D].
 */
@GodotBaseType
public open class GPUParticlesCollisionBox3D : GPUParticlesCollision3D() {
  /**
   * The collision box's extents in 3D units.
   */
  public var extents: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLESCOLLISIONBOX3D_GET_EXTENTS,
          VECTOR3.ordinal)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLESCOLLISIONBOX3D_SET_EXTENTS,
          NIL.ordinal)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_GPUPARTICLESCOLLISIONBOX3D)
  }

  public companion object
}
