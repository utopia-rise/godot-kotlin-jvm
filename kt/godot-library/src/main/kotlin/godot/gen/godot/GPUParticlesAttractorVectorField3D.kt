// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * A box-shaped attractor with varying directions and strengths defined in it that influences
 * particles from [GPUParticles3D] nodes.
 * Unlike [GPUParticlesAttractorBox3D], [GPUParticlesAttractorVectorField3D] uses a [texture] to
 * affect attraction strength within the box. This can be used to create complex attraction scenarios
 * where particles travel in different directions depending on their location. This can be useful for
 * weather effects such as sandstorms.
 * Particle attractors work in real-time and can be moved, rotated and scaled during gameplay.
 * Unlike collision shapes, non-uniform scaling of attractors is also supported.
 * **Note:** Particle attractors only affect [GPUParticles3D], not [CPUParticles3D].
 */
@GodotBaseType
public open class GPUParticlesAttractorVectorField3D : GPUParticlesAttractor3D() {
  /**
   * The size of the vector field box in 3D units.
   */
  @CoreTypeLocalCopy
  public var size: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSizePtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSizePtr, NIL)
    }

  /**
   * The 3D texture to be used. Values are linearly interpolated between the texture's pixels.
   * **Note:** To get better performance, the 3D texture's resolution should reflect the [size] of
   * the attractor. Since particle attraction is usually low-frequency data, the texture can be kept at
   * a low resolution such as 64×64×64.
   */
  public var texture: Texture3D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture3D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTexturePtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_GPUPARTICLESATTRACTORVECTORFIELD3D, scriptIndex)
  }

  /**
   * The size of the vector field box in 3D units.
   *
   * This is a helper function to make dealing with local copies easier. 
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = gpuparticlesattractorvectorfield3d.size
   * //Your changes
   * gpuparticlesattractorvectorfield3d.size = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun sizeMutate(block: Vector3.() -> Unit): Vector3 = size.apply{
      block(this)
      size = this
  }


  public companion object

  internal object MethodBindings {
    public val setSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticlesAttractorVectorField3D", "set_size")

    public val getSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticlesAttractorVectorField3D", "get_size")

    public val setTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticlesAttractorVectorField3D", "set_texture")

    public val getTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticlesAttractorVectorField3D", "get_texture")
  }
}
