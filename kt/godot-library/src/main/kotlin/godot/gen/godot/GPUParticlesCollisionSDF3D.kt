// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import kotlin.Double
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
 * **Baking:** The signed distance field texture can be baked by selecting the [godot.GPUParticlesCollisionSDF3D] node in the editor, then clicking **Bake SDF** at the top of the 3D viewport. Any *visible* [godot.MeshInstance3D]s touching the [extents] will be taken into account for baking, regardless of their [godot.GeometryInstance3D.giMode].
 *
 * **Note:** Baking a [godot.GPUParticlesCollisionSDF3D]'s [texture] is only possible within the editor, as there is no bake method exposed for use in exported projects. However, it's still possible to load pre-baked [godot.Texture3D]s into its [texture] property in an exported project.
 *
 * **Note:** [godot.ParticlesMaterial.collisionEnabled] must be `true` on the [godot.GPUParticles3D]'s process material for collision to work.
 *
 * **Note:** Particle collision only affects [godot.GPUParticles3D], not [godot.CPUParticles3D].
 */
@GodotBaseType
public open class GPUParticlesCollisionSDF3D : GPUParticlesCollision3D() {
  /**
   * The collision SDF's extents in 3D units. To improve SDF quality, the [extents] should be set as small as possible while covering the parts of the scene you need.
   */
  public var extents: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLESCOLLISIONSDF3D_GET_EXTENTS,
          VECTOR3.ordinal)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLESCOLLISIONSDF3D_SET_EXTENTS,
          NIL.ordinal)
    }

  /**
   * The bake resolution to use for the signed distance field [texture]. The texture must be baked again for changes to the [resolution] property to be effective. Higher resolutions have a greater performance cost and take more time to bake. Higher resolutions also result in larger baked textures, leading to increased VRAM and storage space requirements. To improve performance and reduce bake times, use the lowest resolution possible for the object you're representing the collision of.
   */
  public var resolution: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GPUPARTICLESCOLLISIONSDF3D_GET_RESOLUTION, LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GPUPARTICLESCOLLISIONSDF3D_SET_RESOLUTION, NIL.ordinal)
    }

  /**
   * The collision shape's thickness. Unlike other particle colliders, [godot.GPUParticlesCollisionSDF3D] is actually hollow on the inside. [thickness] can be increased to prevent particles from tunneling through the collision shape at high speeds, or when the [godot.GPUParticlesCollisionSDF3D] is moved.
   */
  public var thickness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GPUPARTICLESCOLLISIONSDF3D_GET_THICKNESS, DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GPUPARTICLESCOLLISIONSDF3D_SET_THICKNESS, NIL.ordinal)
    }

  /**
   * The 3D texture representing the signed distance field.
   */
  public var texture: Texture3D?
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLESCOLLISIONSDF3D_GET_TEXTURE,
          OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as Texture3D?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GPUPARTICLESCOLLISIONSDF3D_SET_TEXTURE,
          NIL.ordinal)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_GPUPARTICLESCOLLISIONSDF3D)
  }

  public enum class Resolution(
    id: Long
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object
}
