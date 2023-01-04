// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.BOOL
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * Real-time heightmap-shaped 3D particle attractor affecting [godot.GPUParticles3D] nodes.
 *
 * Real-time heightmap-shaped 3D particle attractor affecting [godot.GPUParticles3D] nodes.
 *
 * Heightmap shapes allow for efficiently representing collisions for convex and concave objects with a single "floor" (such as terrain). This is less flexible than [godot.GPUParticlesCollisionSDF3D], but it doesn't require a baking step.
 *
 * [godot.GPUParticlesCollisionHeightField3D] can also be regenerated in real-time when it is moved, when the camera moves, or even continuously. This makes [godot.GPUParticlesCollisionHeightField3D] a good choice for weather effects such as rain and snow and games with highly dynamic geometry. However, since heightmaps cannot represent overhangs, [godot.GPUParticlesCollisionHeightField3D] is not suited for indoor particle collision.
 *
 * **Note:** [godot.ParticleProcessMaterial.collisionMode] must be `true` on the [godot.GPUParticles3D]'s process material for collision to work.
 *
 * **Note:** Particle collision only affects [godot.GPUParticles3D], not [godot.CPUParticles3D].
 */
@GodotBaseType
public open class GPUParticlesCollisionHeightField3D : GPUParticlesCollision3D() {
  /**
   * The collision heightmap's extents in 3D units. To improve heightmap quality, [extents] should be set as small as possible while covering the parts of the scene you need.
   */
  public var extents: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GPUPARTICLESCOLLISIONHEIGHTFIELD3D_GET_EXTENTS, VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GPUPARTICLESCOLLISIONHEIGHTFIELD3D_SET_EXTENTS, NIL)
    }

  /**
   * Higher resolutions can represent small details more accurately in large scenes, at the cost of lower performance. If [updateMode] is [UPDATE_MODE_ALWAYS], consider using the lowest resolution possible.
   */
  public var resolution: Resolution
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GPUPARTICLESCOLLISIONHEIGHTFIELD3D_GET_RESOLUTION, LONG)
      return GPUParticlesCollisionHeightField3D.Resolution.values()[TransferContext.readReturnValue(JVM_INT) as Int]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GPUPARTICLESCOLLISIONHEIGHTFIELD3D_SET_RESOLUTION, NIL)
    }

  /**
   * The update policy to use for the generated heightmap.
   */
  public var updateMode: UpdateMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GPUPARTICLESCOLLISIONHEIGHTFIELD3D_GET_UPDATE_MODE, LONG)
      return GPUParticlesCollisionHeightField3D.UpdateMode.values()[TransferContext.readReturnValue(JVM_INT) as Int]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GPUPARTICLESCOLLISIONHEIGHTFIELD3D_SET_UPDATE_MODE, NIL)
    }

  /**
   * If `true`, the [godot.GPUParticlesCollisionHeightField3D] will follow the current camera in global space. The [godot.GPUParticlesCollisionHeightField3D] does not need to be a child of the [godot.Camera3D] node for this to work.
   *
   * Following the camera has a performance cost, as it will force the heightmap to update whenever the camera moves. Consider lowering [resolution] to improve performance if [followCameraEnabled] is `true`.
   */
  public var followCameraEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GPUPARTICLESCOLLISIONHEIGHTFIELD3D_IS_FOLLOW_CAMERA_ENABLED,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GPUPARTICLESCOLLISIONHEIGHTFIELD3D_SET_FOLLOW_CAMERA_ENABLED,
          NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_GPUPARTICLESCOLLISIONHEIGHTFIELD3D, scriptIndex)
    return true
  }

  public enum class Resolution(
    id: Long
  ) {
    /**
     * Generate a 256×256 heightmap. Intended for small-scale scenes, or larger scenes with no distant particles.
     */
    RESOLUTION_256(0),
    /**
     * Generate a 512×512 heightmap. Intended for medium-scale scenes, or larger scenes with no distant particles.
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

  public enum class UpdateMode(
    id: Long
  ) {
    /**
     * Only update the heightmap when the [godot.GPUParticlesCollisionHeightField3D] node is moved, or when the camera moves if [followCameraEnabled] is `true`. An update can be forced by slightly moving the [godot.GPUParticlesCollisionHeightField3D] in any direction.
     */
    UPDATE_MODE_WHEN_MOVED(0),
    /**
     * Update the heightmap every frame. This has a significant performance cost. This update should only be used when geometry that particles can collide with changes significantly during gameplay.
     */
    UPDATE_MODE_ALWAYS(1),
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
