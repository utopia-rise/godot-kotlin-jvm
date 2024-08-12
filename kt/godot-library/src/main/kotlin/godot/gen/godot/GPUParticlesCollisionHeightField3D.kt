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
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * A real-time heightmap-shaped 3D particle collision shape affecting [GPUParticles3D] nodes.
 * Heightmap shapes allow for efficiently representing collisions for convex and concave objects
 * with a single "floor" (such as terrain). This is less flexible than [GPUParticlesCollisionSDF3D],
 * but it doesn't require a baking step.
 * [GPUParticlesCollisionHeightField3D] can also be regenerated in real-time when it is moved, when
 * the camera moves, or even continuously. This makes [GPUParticlesCollisionHeightField3D] a good
 * choice for weather effects such as rain and snow and games with highly dynamic geometry. However,
 * this class is limited since heightmaps cannot represent overhangs (e.g. indoors or caves).
 * **Note:** [ParticleProcessMaterial.collisionMode] must be `true` on the [GPUParticles3D]'s
 * process material for collision to work.
 * **Note:** Particle collision only affects [GPUParticles3D], not [CPUParticles3D].
 */
@GodotBaseType
public open class GPUParticlesCollisionHeightField3D : GPUParticlesCollision3D() {
  /**
   * The collision heightmap's size in 3D units. To improve heightmap quality, [size] should be set
   * as small as possible while covering the parts of the scene you need.
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
   * Higher resolutions can represent small details more accurately in large scenes, at the cost of
   * lower performance. If [updateMode] is [UPDATE_MODE_ALWAYS], consider using the lowest resolution
   * possible.
   */
  public var resolution: Resolution
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getResolutionPtr, LONG)
      return GPUParticlesCollisionHeightField3D.Resolution.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setResolutionPtr, NIL)
    }

  /**
   * The update policy to use for the generated heightmap.
   */
  public var updateMode: UpdateMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getUpdateModePtr, LONG)
      return GPUParticlesCollisionHeightField3D.UpdateMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setUpdateModePtr, NIL)
    }

  /**
   * If `true`, the [GPUParticlesCollisionHeightField3D] will follow the current camera in global
   * space. The [GPUParticlesCollisionHeightField3D] does not need to be a child of the [Camera3D] node
   * for this to work.
   * Following the camera has a performance cost, as it will force the heightmap to update whenever
   * the camera moves. Consider lowering [resolution] to improve performance if [followCameraEnabled]
   * is `true`.
   */
  public var followCameraEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isFollowCameraEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFollowCameraEnabledPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_GPUPARTICLESCOLLISIONHEIGHTFIELD3D, scriptIndex)
    return true
  }

  /**
   * The collision heightmap's size in 3D units. To improve heightmap quality, [size] should be set
   * as small as possible while covering the parts of the scene you need.
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
   * val myCoreType = gpuparticlescollisionheightfield3d.size
   * //Your changes
   * gpuparticlescollisionheightfield3d.size = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun sizeMutate(block: Vector3.() -> Unit): Vector3 = size.apply{
      block(this)
      size = this
  }


  public enum class Resolution(
    id: Long,
  ) {
    /**
     * Generate a 256×256 heightmap. Intended for small-scale scenes, or larger scenes with no
     * distant particles.
     */
    RESOLUTION_256(0),
    /**
     * Generate a 512×512 heightmap. Intended for medium-scale scenes, or larger scenes with no
     * distant particles.
     */
    RESOLUTION_512(1),
    /**
     * Generate a 1024×1024 heightmap. Intended for large scenes with distant particles.
     */
    RESOLUTION_1024(2),
    /**
     * Generate a 2048×2048 heightmap. Intended for very large scenes with distant particles.
     */
    RESOLUTION_2048(3),
    /**
     * Generate a 4096×4096 heightmap. Intended for huge scenes with distant particles.
     */
    RESOLUTION_4096(4),
    /**
     * Generate a 8192×8192 heightmap. Intended for gigantic scenes with distant particles.
     */
    RESOLUTION_8192(5),
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class UpdateMode(
    id: Long,
  ) {
    /**
     * Only update the heightmap when the [GPUParticlesCollisionHeightField3D] node is moved, or
     * when the camera moves if [followCameraEnabled] is `true`. An update can be forced by slightly
     * moving the [GPUParticlesCollisionHeightField3D] in any direction, or by calling
     * [RenderingServer.particlesCollisionHeightFieldUpdate].
     */
    UPDATE_MODE_WHEN_MOVED(0),
    /**
     * Update the heightmap every frame. This has a significant performance cost. This update should
     * only be used when geometry that particles can collide with changes significantly during
     * gameplay.
     */
    UPDATE_MODE_ALWAYS(1),
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

  internal object MethodBindings {
    public val setSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticlesCollisionHeightField3D", "set_size")

    public val getSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticlesCollisionHeightField3D", "get_size")

    public val setResolutionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticlesCollisionHeightField3D", "set_resolution")

    public val getResolutionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticlesCollisionHeightField3D", "get_resolution")

    public val setUpdateModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticlesCollisionHeightField3D", "set_update_mode")

    public val getUpdateModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticlesCollisionHeightField3D", "get_update_mode")

    public val setFollowCameraEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticlesCollisionHeightField3D", "set_follow_camera_enabled")

    public val isFollowCameraEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GPUParticlesCollisionHeightField3D", "is_follow_camera_enabled")
  }
}
