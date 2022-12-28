// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * Computes and stores baked lightmaps for fast global illumination.
 *
 * The [godot.LightmapGI] node is used to compute and store baked lightmaps. Lightmaps are used to provide high-quality indirect lighting with very little light leaking. [godot.LightmapGI] can also provide rough reflections using spherical harmonics if [directional] is enabled. Dynamic objects can receive indirect lighting thanks to *light probes*, which can be automatically placed by setting [generateProbesSubdiv] to a value other than [GENERATE_PROBES_DISABLED]. Additional lightmap probes can also be added by creating [godot.LightmapProbe] nodes. The downside is that lightmaps are fully static and cannot be baked in an exported project. Baking a [godot.LightmapGI] node is also slower compared to [godot.VoxelGI].
 *
 * **Procedural generation:** Lightmap baking functionality is only available in the editor. This means [godot.LightmapGI] is not suited to procedurally generated or user-built levels. For procedurally generated or user-built levels, use [godot.VoxelGI] or SDFGI instead (see [godot.Environment.sdfgiEnabled]).
 *
 * **Performance:** [godot.LightmapGI] provides the best possible run-time performance for global illumination. It is suitable for low-end hardware including integrated graphics and mobile devices.
 *
 * **Note:** Due to how lightmaps work, most properties only have a visible effect once lightmaps are baked again.
 *
 * **Note:** Lightmap baking on [godot.CSGShape3D]s and [godot.PrimitiveMesh]es is not supported, as these cannot store UV2 data required for baking.
 *
 * **Note:** If no custom lightmappers are installed, [godot.LightmapGI] can only be baked when using the Vulkan backend (Clustered or Mobile), not OpenGL.
 */
@GodotBaseType
public open class LightmapGI : VisualInstance3D() {
  /**
   * The quality preset to use when baking lightmaps. This affects bake times, but output file sizes remain mostly identical across quality levels.
   *
   * To further speed up bake times, decrease [bounces], disable [useDenoiser] and increase the lightmap texel size on 3D scenes in the Import doc.
   */
  public var quality: LightmapGI.BakeQuality
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHTMAPGI_GET_BAKE_QUALITY, LONG)
      return LightmapGI.BakeQuality.values()[TransferContext.readReturnValue(JVM_INT) as Int]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHTMAPGI_SET_BAKE_QUALITY, NIL)
    }

  /**
   * Number of light bounces that are taken into account during baking. Higher values result in brighter, more realistic lighting, at the cost of longer bake times. If set to `0`, only environment lighting, direct light and emissive lighting is baked.
   */
  public var bounces: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHTMAPGI_GET_BOUNCES, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHTMAPGI_SET_BOUNCES, NIL)
    }

  /**
   * If `true`, bakes lightmaps to contain directional information as spherical harmonics. This results in more realistic lighting appearance, especially with normal mapped materials and for lights that have their direct light baked ([godot.Light3D.lightBakeMode] set to [godot.Light3D.BAKE_STATIC]). The directional information is also used to provide rough reflections for static and dynamic objects. This has a small run-time performance cost as the shader has to perform more work to interpret the direction information from the lightmap. Directional lightmaps also take longer to bake and result in larger file sizes.
   *
   * **Note:** The property's name has no relationship with [godot.DirectionalLight3D]. [directional] works with all light types.
   */
  public var directional: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHTMAPGI_IS_DIRECTIONAL, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHTMAPGI_SET_DIRECTIONAL, NIL)
    }

  /**
   * If `true`, ignore environment lighting when baking lightmaps.
   */
  public var interior: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHTMAPGI_IS_INTERIOR, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHTMAPGI_SET_INTERIOR, NIL)
    }

  /**
   * If `true`, uses a CPU-based denoising algorithm on the generated lightmap. This eliminates most noise within the generated lightmap at the cost of longer bake times. File sizes are generally not impacted significantly by the use of a denoiser, although lossless compression may do a better job at compressing a denoised image.
   *
   * **Note:** The built-in denoiser (OpenImageDenoise) may crash when denoising lightmaps in large scenes. If you encounter a crash at the end of lightmap baking, try disabling [useDenoiser].
   */
  public var useDenoiser: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHTMAPGI_IS_USING_DENOISER,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHTMAPGI_SET_USE_DENOISER, NIL)
    }

  /**
   * The bias to use when computing shadows. Increasing [bias] can fix shadow acne on the resulting baked lightmap, but can introduce peter-panning (shadows not connecting to their casters). Real-time [godot.Light3D] shadows are not affected by this [bias] property.
   */
  public var bias: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHTMAPGI_GET_BIAS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHTMAPGI_SET_BIAS, NIL)
    }

  /**
   * The maximum texture size for the generated texture atlas. Higher values will result in fewer slices being generated, but may not work on all hardware as a result of hardware limitations on texture sizes. Leave [maxTextureSize] at its default value of `16384` if unsure.
   */
  public var maxTextureSize: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHTMAPGI_GET_MAX_TEXTURE_SIZE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHTMAPGI_SET_MAX_TEXTURE_SIZE,
          NIL)
    }

  /**
   * The environment mode to use when baking lightmaps.
   */
  public var environmentMode: LightmapGI.EnvironmentMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHTMAPGI_GET_ENVIRONMENT_MODE,
          LONG)
      return LightmapGI.EnvironmentMode.values()[TransferContext.readReturnValue(JVM_INT) as Int]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHTMAPGI_SET_ENVIRONMENT_MODE,
          NIL)
    }

  /**
   * The sky to use as a source of environment lighting. Only effective if [environmentMode] is [ENVIRONMENT_MODE_CUSTOM_SKY].
   */
  public var environmentCustomSky: Sky?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_LIGHTMAPGI_GET_ENVIRONMENT_CUSTOM_SKY, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Sky?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_LIGHTMAPGI_SET_ENVIRONMENT_CUSTOM_SKY, NIL)
    }

  /**
   * The color to use for environment lighting. Only effective if [environmentMode] is [ENVIRONMENT_MODE_CUSTOM_COLOR].
   */
  public var environmentCustomColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_LIGHTMAPGI_GET_ENVIRONMENT_CUSTOM_COLOR, COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_LIGHTMAPGI_SET_ENVIRONMENT_CUSTOM_COLOR, NIL)
    }

  /**
   * The color multiplier to use for environment lighting. Only effective if [environmentMode] is [ENVIRONMENT_MODE_CUSTOM_COLOR].
   */
  public var environmentCustomEnergy: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_LIGHTMAPGI_GET_ENVIRONMENT_CUSTOM_ENERGY, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_LIGHTMAPGI_SET_ENVIRONMENT_CUSTOM_ENERGY, NIL)
    }

  /**
   * The [godot.CameraAttributes] resource that specifies exposure levels to bake at. Auto-exposure and non exposure properties will be ignored. Exposure settings should be used to reduce the dynamic range present when baking. If exposure is too high, the [godot.LightmapGI] will have banding artifacts or may have over-exposure artifacts.
   */
  public var cameraAttributes: Material?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHTMAPGI_GET_CAMERA_ATTRIBUTES,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Material?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHTMAPGI_SET_CAMERA_ATTRIBUTES,
          NIL)
    }

  /**
   * The level of subdivision to use when automatically generating [godot.LightmapProbe]s for dynamic object lighting. Higher values result in more accurate indirect lighting on dynamic objects, at the cost of longer bake times and larger file sizes.
   *
   * **Note:** Automatically generated [godot.LightmapProbe]s are not visible as nodes in the Scene tree dock, and cannot be modified this way after they are generated.
   *
   * **Note:** Regardless of [generateProbesSubdiv], direct lighting on dynamic objects is always applied using [godot.Light3D] nodes in real-time.
   */
  public var generateProbesSubdiv: LightmapGI.GenerateProbes
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHTMAPGI_GET_GENERATE_PROBES,
          LONG)
      return LightmapGI.GenerateProbes.values()[TransferContext.readReturnValue(JVM_INT) as Int]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHTMAPGI_SET_GENERATE_PROBES,
          NIL)
    }

  /**
   * The [godot.LightmapGIData] associated to this [godot.LightmapGI] node. This resource is automatically created after baking, and is not meant to be created manually.
   */
  public var lightData: LightmapGIData?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHTMAPGI_GET_LIGHT_DATA, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as LightmapGIData?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHTMAPGI_SET_LIGHT_DATA, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_LIGHTMAPGI, scriptIndex)
    return true
  }

  public enum class BakeQuality(
    id: Long
  ) {
    /**
     * Low bake quality (fastest bake times). The quality of this preset can be adjusted by changing [godot.ProjectSettings.rendering/lightmapping/bakeQuality/lowQualityRayCount] and [godot.ProjectSettings.rendering/lightmapping/bakeQuality/lowQualityProbeRayCount].
     */
    BAKE_QUALITY_LOW(0),
    /**
     * Medium bake quality (fast bake times). The quality of this preset can be adjusted by changing [godot.ProjectSettings.rendering/lightmapping/bakeQuality/mediumQualityRayCount] and [godot.ProjectSettings.rendering/lightmapping/bakeQuality/mediumQualityProbeRayCount].
     */
    BAKE_QUALITY_MEDIUM(1),
    /**
     * High bake quality (slow bake times). The quality of this preset can be adjusted by changing [godot.ProjectSettings.rendering/lightmapping/bakeQuality/highQualityRayCount] and [godot.ProjectSettings.rendering/lightmapping/bakeQuality/highQualityProbeRayCount].
     */
    BAKE_QUALITY_HIGH(2),
    /**
     * Highest bake quality (slowest bake times). The quality of this preset can be adjusted by changing [godot.ProjectSettings.rendering/lightmapping/bakeQuality/highQualityRayCount] and [godot.ProjectSettings.rendering/lightmapping/bakeQuality/ultraQualityProbeRayCount].
     */
    BAKE_QUALITY_ULTRA(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class GenerateProbes(
    id: Long
  ) {
    /**
     * Don't generate lightmap probes for lighting dynamic objects.
     */
    GENERATE_PROBES_DISABLED(0),
    /**
     * Lowest level of subdivision (fastest bake times, smallest file sizes).
     */
    GENERATE_PROBES_SUBDIV_4(1),
    /**
     * Low level of subdivision (fast bake times, small file sizes).
     */
    GENERATE_PROBES_SUBDIV_8(2),
    /**
     * High level of subdivision (slow bake times, large file sizes).
     */
    GENERATE_PROBES_SUBDIV_16(3),
    /**
     * Highest level of subdivision (slowest bake times, largest file sizes).
     */
    GENERATE_PROBES_SUBDIV_32(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class BakeError(
    id: Long
  ) {
    /**
     * Lightmap baking was successful.
     */
    BAKE_ERROR_OK(0),
    /**
     * Lightmap baking failed as there is no lightmapper available in this Godot build.
     */
    BAKE_ERROR_NO_LIGHTMAPPER(1),
    /**
     * Lightmap baking failed as the [godot.LightmapGIData] save path isn't configured in the resource.
     */
    BAKE_ERROR_NO_SAVE_PATH(2),
    /**
     * Lightmap baking failed as there are no meshes whose [godot.GeometryInstance3D.giMode] is [godot.GeometryInstance3D.GI_MODE_STATIC] and with valid UV2 mapping in the current scene. You may need to select 3D scenes in the Import dock and change their global illumination mode accordingly.
     */
    BAKE_ERROR_NO_MESHES(3),
    /**
     * Lightmap baking failed as the lightmapper failed to analyze some of the meshes marked as static for baking.
     */
    BAKE_ERROR_MESHES_INVALID(4),
    /**
     * Lightmap baking failed as the resulting image couldn't be saved or imported by Godot after it was saved.
     */
    BAKE_ERROR_CANT_CREATE_IMAGE(5),
    /**
     * The user aborted the lightmap baking operation (typically by clicking the **Cancel** button in the progress dialog).
     */
    BAKE_ERROR_USER_ABORTED(6),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class EnvironmentMode(
    id: Long
  ) {
    /**
     * Ignore environment lighting when baking lightmaps.
     */
    ENVIRONMENT_MODE_DISABLED(0),
    /**
     * Use the scene's environment lighting when baking lightmaps.
     *
     * **Note:** If baking lightmaps in a scene with no [godot.WorldEnvironment] node, this will act like [ENVIRONMENT_MODE_DISABLED]. The editor's preview sky and sun is *not* taken into account by [godot.LightmapGI] when baking lightmaps.
     */
    ENVIRONMENT_MODE_SCENE(1),
    /**
     * Use [environmentCustomSky] as a source of environment lighting when baking lightmaps.
     */
    ENVIRONMENT_MODE_CUSTOM_SKY(2),
    /**
     * Use [environmentCustomColor] multiplied by [environmentCustomEnergy] as a constant source of environment lighting when baking lightmaps.
     */
    ENVIRONMENT_MODE_CUSTOM_COLOR(3),
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
