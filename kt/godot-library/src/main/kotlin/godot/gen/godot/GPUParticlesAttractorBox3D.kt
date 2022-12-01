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
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

/**
 * Box-shaped 3D particle attractor affecting [godot.GPUParticles3D] nodes.
 *
 * Box-shaped 3D particle attractor affecting [godot.GPUParticles3D] nodes.
 *
 * **Note:** Particle attractors only affect [godot.GPUParticles3D], not [godot.CPUParticles3D].
 */
@GodotBaseType
public open class GPUParticlesAttractorBox3D : GPUParticlesAttractor3D() {
  /**
   * The attractor box's extents in 3D units.
   */
  public var extents: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GPUPARTICLESATTRACTORBOX3D_GET_EXTENTS, VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GPUPARTICLESATTRACTORBOX3D_SET_EXTENTS, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_GPUPARTICLESATTRACTORBOX3D, scriptIndex)
    return true
  }

  public companion object
}
