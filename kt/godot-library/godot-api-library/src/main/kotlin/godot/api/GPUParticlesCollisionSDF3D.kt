// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.VECTOR3
import godot.core.Vector3
import godot.getBakeMaskPtr
import godot.getBakeMaskValuePtr
import godot.getResolutionPtr
import godot.getSizePtr
import godot.getTexturePtr
import godot.getThicknessPtr
import godot.setBakeMaskPtr
import godot.setBakeMaskValuePtr
import godot.setResolutionPtr
import godot.setSizePtr
import godot.setTexturePtr
import godot.setThicknessPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINECLASS_GPUPARTICLESCOLLISIONSDF3D: Int = 277

/**
 * A baked signed distance field 3D particle collision shape affecting [GPUParticles3D] nodes.
 * Signed distance fields (SDF) allow for efficiently representing approximate collision shapes for
 * convex and concave objects of any shape. This is more flexible than
 * [GPUParticlesCollisionHeightField3D], but it requires a baking step.
 * **Baking:** The signed distance field texture can be baked by selecting the
 * [GPUParticlesCollisionSDF3D] node in the editor, then clicking **Bake SDF** at the top of the 3D
 * viewport. Any *visible* [MeshInstance3D]s within the [size] will be taken into account for baking,
 * regardless of their [GeometryInstance3D.giMode].
 * **Note:** Baking a [GPUParticlesCollisionSDF3D]'s [texture] is only possible within the editor,
 * as there is no bake method exposed for use in exported projects. However, it's still possible to
 * load pre-baked [Texture3D]s into its [texture] property in an exported project.
 * **Note:** [ParticleProcessMaterial.collisionMode] must be
 * [ParticleProcessMaterial.COLLISION_RIGID] or [ParticleProcessMaterial.COLLISION_HIDE_ON_CONTACT] on
 * the [GPUParticles3D]'s process material for collision to work.
 * **Note:** Particle collision only affects [GPUParticles3D], not [CPUParticles3D].
 */
@GodotBaseType
public open class GPUParticlesCollisionSDF3D : GPUParticlesCollision3D() {
  /**
   * The collision SDF's size in 3D units. To improve SDF quality, the [size] should be set as small
   * as possible while covering the parts of the scene you need.
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
   * The bake resolution to use for the signed distance field [texture]. The texture must be baked
   * again for changes to the [resolution] property to be effective. Higher resolutions have a greater
   * performance cost and take more time to bake. Higher resolutions also result in larger baked
   * textures, leading to increased VRAM and storage space requirements. To improve performance and
   * reduce bake times, use the lowest resolution possible for the object you're representing the
   * collision of.
   */
  public final inline var resolution: Resolution
    @JvmName("resolutionProperty")
    get() = getResolution()
    @JvmName("resolutionProperty")
    set(`value`) {
      setResolution(value)
    }

  /**
   * The collision shape's thickness. Unlike other particle colliders, [GPUParticlesCollisionSDF3D]
   * is actually hollow on the inside. [thickness] can be increased to prevent particles from tunneling
   * through the collision shape at high speeds, or when the [GPUParticlesCollisionSDF3D] is moved.
   */
  public final inline var thickness: Float
    @JvmName("thicknessProperty")
    get() = getThickness()
    @JvmName("thicknessProperty")
    set(`value`) {
      setThickness(value)
    }

  /**
   * The visual layers to account for when baking the particle collision SDF. Only [MeshInstance3D]s
   * whose [VisualInstance3D.layers] match with this [bakeMask] will be included in the generated
   * particle collision SDF. By default, all objects are taken into account for the particle collision
   * SDF baking.
   */
  public final inline var bakeMask: Long
    @JvmName("bakeMaskProperty")
    get() = getBakeMask()
    @JvmName("bakeMaskProperty")
    set(`value`) {
      setBakeMask(value)
    }

  /**
   * The 3D texture representing the signed distance field.
   */
  public final inline var texture: Texture3D?
    @JvmName("textureProperty")
    get() = getTexture()
    @JvmName("textureProperty")
    set(`value`) {
      setTexture(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_GPUPARTICLESCOLLISIONSDF3D, scriptIndex)
  }

  /**
   * The collision SDF's size in 3D units. To improve SDF quality, the [size] should be set as small
   * as possible while covering the parts of the scene you need.
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

  public final fun setResolution(resolution: Resolution): Unit {
    TransferContext.writeArguments(LONG to resolution.id)
    TransferContext.callMethod(ptr, MethodBindings.setResolutionPtr, NIL)
  }

  public final fun getResolution(): Resolution {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getResolutionPtr, LONG)
    return GPUParticlesCollisionSDF3D.Resolution.from(TransferContext.readReturnValue(LONG) as Long)
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

  public final fun setThickness(thickness: Float): Unit {
    TransferContext.writeArguments(DOUBLE to thickness.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setThicknessPtr, NIL)
  }

  public final fun getThickness(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getThicknessPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setBakeMask(mask: Long): Unit {
    TransferContext.writeArguments(LONG to mask)
    TransferContext.callMethod(ptr, MethodBindings.setBakeMaskPtr, NIL)
  }

  public final fun getBakeMask(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBakeMaskPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Based on [value], enables or disables the specified layer in the [bakeMask], given a
   * [layerNumber] between 1 and 32.
   */
  public final fun setBakeMaskValue(layerNumber: Int, `value`: Boolean): Unit {
    TransferContext.writeArguments(LONG to layerNumber.toLong(), BOOL to value)
    TransferContext.callMethod(ptr, MethodBindings.setBakeMaskValuePtr, NIL)
  }

  /**
   * Returns whether or not the specified layer of the [bakeMask] is enabled, given a [layerNumber]
   * between 1 and 32.
   */
  public final fun getBakeMaskValue(layerNumber: Int): Boolean {
    TransferContext.writeArguments(LONG to layerNumber.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getBakeMaskValuePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public enum class Resolution(
    id: Long,
  ) {
    /**
     * Bake a 16×16×16 signed distance field. This is the fastest option, but also the least
     * precise.
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
     * Bake a 512×512×512 signed distance field. This is the slowest option, but also the most
     * precise.
     */
    RESOLUTION_512(5),
    /**
     * Represents the size of the [Resolution] enum.
     */
    RESOLUTION_MAX(6),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Resolution = entries.single { it.id == `value` }
    }
  }

  public companion object

  public object MethodBindings {
    internal val setSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticlesCollisionSDF3D", "set_size", 3460891852)

    internal val getSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticlesCollisionSDF3D", "get_size", 3360562783)

    internal val setResolutionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticlesCollisionSDF3D", "set_resolution", 1155629297)

    internal val getResolutionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticlesCollisionSDF3D", "get_resolution", 2919555867)

    internal val setTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticlesCollisionSDF3D", "set_texture", 1188404210)

    internal val getTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticlesCollisionSDF3D", "get_texture", 373985333)

    internal val setThicknessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticlesCollisionSDF3D", "set_thickness", 373806689)

    internal val getThicknessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticlesCollisionSDF3D", "get_thickness", 1740695150)

    internal val setBakeMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticlesCollisionSDF3D", "set_bake_mask", 1286410249)

    internal val getBakeMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticlesCollisionSDF3D", "get_bake_mask", 3905245786)

    internal val setBakeMaskValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticlesCollisionSDF3D", "set_bake_mask_value", 300928843)

    internal val getBakeMaskValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticlesCollisionSDF3D", "get_bake_mask_value", 1116898809)
  }
}
