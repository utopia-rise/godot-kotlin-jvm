// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.common.interop.VoidPtr
import godot.internal.reflection.TypeManager
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.VECTOR3
import godot.core.Vector3
import godot.internal.memory.TransferContext
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

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
  public final inline var size: Vector3
    @JvmName("sizeProperty")
    get() = getSize()
    @JvmName("sizeProperty")
    set(`value`) {
      setSize(value)
    }

  /**
   * The 3D texture to be used. Values are linearly interpolated between the texture's pixels.
   * **Note:** To get better performance, the 3D texture's resolution should reflect the [size] of
   * the attractor. Since particle attraction is usually low-frequency data, the texture can be kept at
   * a low resolution such as 64×64×64.
   */
  public final inline var texture: Texture3D?
    @JvmName("textureProperty")
    get() = getTexture()
    @JvmName("textureProperty")
    set(`value`) {
      setTexture(value)
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
  public final fun sizeMutate(block: Vector3.() -> Unit): Vector3 = size.apply{
      block(this)
      size = this
  }


  public final fun setSize(size: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to size)
    TransferContext.callMethod(ptr, MethodBindings.setSizePtr, NIL)
  }

  public final fun getSize(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSizePtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setTexture(texture: Texture3D?): Unit {
    TransferContext.writeArguments(OBJECT to texture)
    TransferContext.callMethod(ptr, MethodBindings.setTexturePtr, NIL)
  }

  public final fun getTexture(): Texture3D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTexturePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Texture3D?)
  }

  public companion object

  internal object MethodBindings {
    public val setSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticlesAttractorVectorField3D", "set_size", 3460891852)

    public val getSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticlesAttractorVectorField3D", "get_size", 3360562783)

    public val setTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticlesAttractorVectorField3D", "set_texture", 1188404210)

    public val getTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticlesAttractorVectorField3D", "get_texture", 373985333)
  }
}
