// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Baked signed distance field 3D particle attractor affecting [godot.GPUParticles3D] nodes.
 *
 * Baked signed distance field 3D particle attractor affecting [godot.GPUParticles3D] nodes.
 *
 * Signed distance fields (SDF) allow for efficiently representing approximate collision shapes for convex and concave objects of any shape. This is more flexible than [godot.GPUParticlesCollisionHeightField3D], but it requires a baking step.
 *
 * **Baking:** The signed distance field texture can be baked by selecting the [godot.GPUParticlesCollisionSDF3D] node in the editor, then clicking **Bake SDF** at the top of the 3D viewport. Any *visible* [godot.MeshInstance3D]s within the [size] will be taken into account for baking, regardless of their [godot.GeometryInstance3D.giMode].
 *
 * **Note:** Baking a [godot.GPUParticlesCollisionSDF3D]'s [texture] is only possible within the editor, as there is no bake method exposed for use in exported projects. However, it's still possible to load pre-baked [godot.Texture3D]s into its [texture] property in an exported project.
 *
 * **Note:** [godot.ParticleProcessMaterial.collisionMode] must be [godot.ParticleProcessMaterial.COLLISION_RIGID] or [godot.ParticleProcessMaterial.COLLISION_HIDE_ON_CONTACT] on the [godot.GPUParticles3D]'s process material for collision to work.
 *
 * **Note:** Particle collision only affects [godot.GPUParticles3D], not [godot.CPUParticles3D].
 */
@GodotBaseType
public open class GPUParticlesCollisionSDF3D : GPUParticlesCollision3D() {
  /**
   * The collision SDF's size in 3D units. To improve SDF quality, the [size] should be set as small as possible while covering the parts of the scene you need.
   */
  @CoreTypeLocalCopy
  public var size: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GPUPARTICLESCOLLISIONSDF3D_GET_SIZE, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GPUPARTICLESCOLLISIONSDF3D_SET_SIZE, NIL)
    }

  /**
   * The bake resolution to use for the signed distance field [texture]. The texture must be baked again for changes to the [resolution] property to be effective. Higher resolutions have a greater performance cost and take more time to bake. Higher resolutions also result in larger baked textures, leading to increased VRAM and storage space requirements. To improve performance and reduce bake times, use the lowest resolution possible for the object you're representing the collision of.
   */
  public var resolution: Resolution
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GPUPARTICLESCOLLISIONSDF3D_GET_RESOLUTION, LONG)
      return GPUParticlesCollisionSDF3D.Resolution.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GPUPARTICLESCOLLISIONSDF3D_SET_RESOLUTION, NIL)
    }

  /**
   * The collision shape's thickness. Unlike other particle colliders, [godot.GPUParticlesCollisionSDF3D] is actually hollow on the inside. [thickness] can be increased to prevent particles from tunneling through the collision shape at high speeds, or when the [godot.GPUParticlesCollisionSDF3D] is moved.
   */
  public var thickness: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GPUPARTICLESCOLLISIONSDF3D_GET_THICKNESS, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GPUPARTICLESCOLLISIONSDF3D_SET_THICKNESS, NIL)
    }

  /**
   * The visual layers to account for when baking the particle collision SDF. Only [godot.MeshInstance3D]s whose [godot.VisualInstance3D.layers] match with this [bakeMask] will be included in the generated particle collision SDF. By default, all objects are taken into account for the particle collision SDF baking.
   */
  public var bakeMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GPUPARTICLESCOLLISIONSDF3D_GET_BAKE_MASK, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GPUPARTICLESCOLLISIONSDF3D_SET_BAKE_MASK, NIL)
    }

  /**
   * The 3D texture representing the signed distance field.
   */
  public var texture: Texture3D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GPUPARTICLESCOLLISIONSDF3D_GET_TEXTURE, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture3D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GPUPARTICLESCOLLISIONSDF3D_SET_TEXTURE, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_GPUPARTICLESCOLLISIONSDF3D, scriptIndex)
    return true
  }

  /**
   * The collision SDF's size in 3D units. To improve SDF quality, the [size] should be set as small as possible while covering the parts of the scene you need.
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
   * val myCoreType = gpuparticlescollisionsdf3d.size
   * //Your changes
   * gpuparticlescollisionsdf3d.size = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun sizeMutate(block: Vector3.() -> Unit): Vector3 = size.apply{
      block(this)
      size = this
  }


  /**
   * Based on [value], enables or disables the specified layer in the [bakeMask], given a [layerNumber] between 1 and 32.
   */
  public fun setBakeMaskValue(layerNumber: Int, `value`: Boolean): Unit {
    TransferContext.writeArguments(LONG to layerNumber.toLong(), BOOL to value)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GPUPARTICLESCOLLISIONSDF3D_SET_BAKE_MASK_VALUE, NIL)
  }

  /**
   * Returns whether or not the specified layer of the [bakeMask] is enabled, given a [layerNumber] between 1 and 32.
   */
  public fun getBakeMaskValue(layerNumber: Int): Boolean {
    TransferContext.writeArguments(LONG to layerNumber.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GPUPARTICLESCOLLISIONSDF3D_GET_BAKE_MASK_VALUE, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public enum class Resolution(
    id: Long,
  ) {
    /**
     * Bake a 16×16×16 signed distance field. This is the fastest option, but also the least precise.
     */
    RESOLUTION_16(0),
    /**
     * Bake a 32×32×32 signed distance field.
     */
    RESOLUTION_32(1),
    /**
     * Bake a 64×64×64 signed distance field.
     */
    RESOLUTION_64(2),
    /**
     * Bake a 128×128×128 signed distance field.
     */
    RESOLUTION_128(3),
    /**
     * Bake a 256×256×256 signed distance field.
     */
    RESOLUTION_256(4),
    /**
     * Bake a 512×512×512 signed distance field. This is the slowest option, but also the most precise.
     */
    RESOLUTION_512(5),
    /**
     * Represents the size of the [enum Resolution] enum.
     */
    RESOLUTION_MAX(6),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object
}
