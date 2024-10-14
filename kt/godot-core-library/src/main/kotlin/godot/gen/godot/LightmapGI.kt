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
import godot.core.Color
import godot.internal.reflection.TypeManager
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.COLOR
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.internal.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * The [LightmapGI] node is used to compute and store baked lightmaps. Lightmaps are used to provide
 * high-quality indirect lighting with very little light leaking. [LightmapGI] can also provide rough
 * reflections using spherical harmonics if [directional] is enabled. Dynamic objects can receive
 * indirect lighting thanks to *light probes*, which can be automatically placed by setting
 * [generateProbesSubdiv] to a value other than [GENERATE_PROBES_DISABLED]. Additional lightmap probes
 * can also be added by creating [LightmapProbe] nodes. The downside is that lightmaps are fully static
 * and cannot be baked in an exported project. Baking a [LightmapGI] node is also slower compared to
 * [VoxelGI].
 * **Procedural generation:** Lightmap baking functionality is only available in the editor. This
 * means [LightmapGI] is not suited to procedurally generated or user-built levels. For procedurally
 * generated or user-built levels, use [VoxelGI] or SDFGI instead (see [Environment.sdfgiEnabled]).
 * **Performance:** [LightmapGI] provides the best possible run-time performance for global
 * illumination. It is suitable for low-end hardware including integrated graphics and mobile devices.
 * **Note:** Due to how lightmaps work, most properties only have a visible effect once lightmaps
 * are baked again.
 * **Note:** Lightmap baking on [CSGShape3D]s and [PrimitiveMesh]es is not supported, as these
 * cannot store UV2 data required for baking.
 * **Note:** If no custom lightmappers are installed, [LightmapGI] can only be baked from devices
 * that support the Forward+ or Mobile rendering backends.
 */
@GodotBaseType
public open class LightmapGI : VisualInstance3D() {
  /**
   * The quality preset to use when baking lightmaps. This affects bake times, but output file sizes
   * remain mostly identical across quality levels.
   * To further speed up bake times, decrease [bounces], disable [useDenoiser] and increase the
   * lightmap texel size on 3D scenes in the Import doc.
   */
  public final inline var quality: BakeQuality
    @JvmName("qualityProperty")
    get() = getBakeQuality()
    @JvmName("qualityProperty")
    set(`value`) {
      setBakeQuality(value)
    }

  /**
   * Number of light bounces that are taken into account during baking. Higher values result in
   * brighter, more realistic lighting, at the cost of longer bake times. If set to `0`, only
   * environment lighting, direct light and emissive lighting is baked.
   */
  public final inline var bounces: Int
    @JvmName("bouncesProperty")
    get() = getBounces()
    @JvmName("bouncesProperty")
    set(`value`) {
      setBounces(value)
    }

  /**
   * The energy multiplier for each bounce. Higher values will make indirect lighting brighter. A
   * value of `1.0` represents physically accurate behavior, but higher values can be used to make
   * indirect lighting propagate more visibly when using a low number of bounces. This can be used to
   * speed up bake times by lowering the number of [bounces] then increasing [bounceIndirectEnergy].
   * **Note:** [bounceIndirectEnergy] only has an effect if [bounces] is set to a value greater than
   * or equal to `1`.
   */
  public final inline var bounceIndirectEnergy: Float
    @JvmName("bounceIndirectEnergyProperty")
    get() = getBounceIndirectEnergy()
    @JvmName("bounceIndirectEnergyProperty")
    set(`value`) {
      setBounceIndirectEnergy(value)
    }

  /**
   * If `true`, bakes lightmaps to contain directional information as spherical harmonics. This
   * results in more realistic lighting appearance, especially with normal mapped materials and for
   * lights that have their direct light baked ([Light3D.lightBakeMode] set to [Light3D.BAKE_STATIC]
   * and with [Light3D.editorOnly] set to `false`). The directional information is also used to provide
   * rough reflections for static and dynamic objects. This has a small run-time performance cost as
   * the shader has to perform more work to interpret the direction information from the lightmap.
   * Directional lightmaps also take longer to bake and result in larger file sizes.
   * **Note:** The property's name has no relationship with [DirectionalLight3D]. [directional]
   * works with all light types.
   */
  public final inline var directional: Boolean
    @JvmName("directionalProperty")
    get() = isDirectional()
    @JvmName("directionalProperty")
    set(`value`) {
      setDirectional(value)
    }

  /**
   * If `true`, a texture with the lighting information will be generated to speed up the generation
   * of indirect lighting at the cost of some accuracy. The geometry might exhibit extra light leak
   * artifacts when using low resolution lightmaps or UVs that stretch the lightmap significantly
   * across surfaces. Leave [useTextureForBounces] at its default value of `true` if unsure.
   * **Note:** [useTextureForBounces] only has an effect if [bounces] is set to a value greater than
   * or equal to `1`.
   */
  public final inline var useTextureForBounces: Boolean
    @JvmName("useTextureForBouncesProperty")
    get() = isUsingTextureForBounces()
    @JvmName("useTextureForBouncesProperty")
    set(`value`) {
      setUseTextureForBounces(value)
    }

  /**
   * If `true`, ignore environment lighting when baking lightmaps.
   */
  public final inline var interior: Boolean
    @JvmName("interiorProperty")
    get() = isInterior()
    @JvmName("interiorProperty")
    set(`value`) {
      setInterior(value)
    }

  /**
   * If `true`, uses a GPU-based denoising algorithm on the generated lightmap. This eliminates most
   * noise within the generated lightmap at the cost of longer bake times. File sizes are generally not
   * impacted significantly by the use of a denoiser, although lossless compression may do a better job
   * at compressing a denoised image.
   */
  public final inline var useDenoiser: Boolean
    @JvmName("useDenoiserProperty")
    get() = isUsingDenoiser()
    @JvmName("useDenoiserProperty")
    set(`value`) {
      setUseDenoiser(value)
    }

  /**
   * The strength of denoising step applied to the generated lightmaps. Only effective if
   * [useDenoiser] is `true` and [ProjectSettings.rendering/lightmapping/denoising/denoiser] is set to
   * JNLM.
   */
  public final inline var denoiserStrength: Float
    @JvmName("denoiserStrengthProperty")
    get() = getDenoiserStrength()
    @JvmName("denoiserStrengthProperty")
    set(`value`) {
      setDenoiserStrength(value)
    }

  /**
   * The distance in pixels from which the denoiser samples. Lower values preserve more details, but
   * may give blotchy results if the lightmap quality is not high enough. Only effective if
   * [useDenoiser] is `true` and [ProjectSettings.rendering/lightmapping/denoising/denoiser] is set to
   * JNLM.
   */
  public final inline var denoiserRange: Int
    @JvmName("denoiserRangeProperty")
    get() = getDenoiserRange()
    @JvmName("denoiserRangeProperty")
    set(`value`) {
      setDenoiserRange(value)
    }

  /**
   * The bias to use when computing shadows. Increasing [bias] can fix shadow acne on the resulting
   * baked lightmap, but can introduce peter-panning (shadows not connecting to their casters).
   * Real-time [Light3D] shadows are not affected by this [bias] property.
   */
  public final inline var bias: Float
    @JvmName("biasProperty")
    get() = getBias()
    @JvmName("biasProperty")
    set(`value`) {
      setBias(value)
    }

  /**
   * Scales the lightmap texel density of all meshes for the current bake. This is a multiplier that
   * builds upon the existing lightmap texel size defined in each imported 3D scene, along with the
   * per-mesh density multiplier (which is designed to be used when the same mesh is used at different
   * scales). Lower values will result in faster bake times.
   */
  public final inline var texelScale: Float
    @JvmName("texelScaleProperty")
    get() = getTexelScale()
    @JvmName("texelScaleProperty")
    set(`value`) {
      setTexelScale(value)
    }

  /**
   * The maximum texture size for the generated texture atlas. Higher values will result in fewer
   * slices being generated, but may not work on all hardware as a result of hardware limitations on
   * texture sizes. Leave [maxTextureSize] at its default value of `16384` if unsure.
   */
  public final inline var maxTextureSize: Int
    @JvmName("maxTextureSizeProperty")
    get() = getMaxTextureSize()
    @JvmName("maxTextureSizeProperty")
    set(`value`) {
      setMaxTextureSize(value)
    }

  /**
   * The environment mode to use when baking lightmaps.
   */
  public final inline var environmentMode: EnvironmentMode
    @JvmName("environmentModeProperty")
    get() = getEnvironmentMode()
    @JvmName("environmentModeProperty")
    set(`value`) {
      setEnvironmentMode(value)
    }

  /**
   * The sky to use as a source of environment lighting. Only effective if [environmentMode] is
   * [ENVIRONMENT_MODE_CUSTOM_SKY].
   */
  public final inline var environmentCustomSky: Sky?
    @JvmName("environmentCustomSkyProperty")
    get() = getEnvironmentCustomSky()
    @JvmName("environmentCustomSkyProperty")
    set(`value`) {
      setEnvironmentCustomSky(value)
    }

  /**
   * The color to use for environment lighting. Only effective if [environmentMode] is
   * [ENVIRONMENT_MODE_CUSTOM_COLOR].
   */
  @CoreTypeLocalCopy
  public final inline var environmentCustomColor: Color
    @JvmName("environmentCustomColorProperty")
    get() = getEnvironmentCustomColor()
    @JvmName("environmentCustomColorProperty")
    set(`value`) {
      setEnvironmentCustomColor(value)
    }

  /**
   * The color multiplier to use for environment lighting. Only effective if [environmentMode] is
   * [ENVIRONMENT_MODE_CUSTOM_COLOR].
   */
  public final inline var environmentCustomEnergy: Float
    @JvmName("environmentCustomEnergyProperty")
    get() = getEnvironmentCustomEnergy()
    @JvmName("environmentCustomEnergyProperty")
    set(`value`) {
      setEnvironmentCustomEnergy(value)
    }

  /**
   * The [CameraAttributes] resource that specifies exposure levels to bake at. Auto-exposure and
   * non exposure properties will be ignored. Exposure settings should be used to reduce the dynamic
   * range present when baking. If exposure is too high, the [LightmapGI] will have banding artifacts
   * or may have over-exposure artifacts.
   */
  public final inline var cameraAttributes: CameraAttributes?
    @JvmName("cameraAttributesProperty")
    get() = getCameraAttributes()
    @JvmName("cameraAttributesProperty")
    set(`value`) {
      setCameraAttributes(value)
    }

  /**
   * The level of subdivision to use when automatically generating [LightmapProbe]s for dynamic
   * object lighting. Higher values result in more accurate indirect lighting on dynamic objects, at
   * the cost of longer bake times and larger file sizes.
   * **Note:** Automatically generated [LightmapProbe]s are not visible as nodes in the Scene tree
   * dock, and cannot be modified this way after they are generated.
   * **Note:** Regardless of [generateProbesSubdiv], direct lighting on dynamic objects is always
   * applied using [Light3D] nodes in real-time.
   */
  public final inline var generateProbesSubdiv: GenerateProbes
    @JvmName("generateProbesSubdivProperty")
    get() = getGenerateProbes()
    @JvmName("generateProbesSubdivProperty")
    set(`value`) {
      setGenerateProbes(value)
    }

  /**
   * The [LightmapGIData] associated to this [LightmapGI] node. This resource is automatically
   * created after baking, and is not meant to be created manually.
   */
  public final inline var lightData: LightmapGIData?
    @JvmName("lightDataProperty")
    get() = getLightData()
    @JvmName("lightDataProperty")
    set(`value`) {
      setLightData(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_LIGHTMAPGI, scriptIndex)
  }

  /**
   * The color to use for environment lighting. Only effective if [environmentMode] is
   * [ENVIRONMENT_MODE_CUSTOM_COLOR].
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
   * val myCoreType = lightmapgi.environmentCustomColor
   * //Your changes
   * lightmapgi.environmentCustomColor = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun environmentCustomColorMutate(block: Color.() -> Unit): Color =
      environmentCustomColor.apply{
      block(this)
      environmentCustomColor = this
  }


  public final fun setLightData(`data`: LightmapGIData?): Unit {
    TransferContext.writeArguments(OBJECT to data)
    TransferContext.callMethod(ptr, MethodBindings.setLightDataPtr, NIL)
  }

  public final fun getLightData(): LightmapGIData? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLightDataPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as LightmapGIData?)
  }

  public final fun setBakeQuality(bakeQuality: BakeQuality): Unit {
    TransferContext.writeArguments(LONG to bakeQuality.id)
    TransferContext.callMethod(ptr, MethodBindings.setBakeQualityPtr, NIL)
  }

  public final fun getBakeQuality(): BakeQuality {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBakeQualityPtr, LONG)
    return LightmapGI.BakeQuality.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setBounces(bounces: Int): Unit {
    TransferContext.writeArguments(LONG to bounces.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setBouncesPtr, NIL)
  }

  public final fun getBounces(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBouncesPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setBounceIndirectEnergy(bounceIndirectEnergy: Float): Unit {
    TransferContext.writeArguments(DOUBLE to bounceIndirectEnergy.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setBounceIndirectEnergyPtr, NIL)
  }

  public final fun getBounceIndirectEnergy(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBounceIndirectEnergyPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setGenerateProbes(subdivision: GenerateProbes): Unit {
    TransferContext.writeArguments(LONG to subdivision.id)
    TransferContext.callMethod(ptr, MethodBindings.setGenerateProbesPtr, NIL)
  }

  public final fun getGenerateProbes(): GenerateProbes {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getGenerateProbesPtr, LONG)
    return LightmapGI.GenerateProbes.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setBias(bias: Float): Unit {
    TransferContext.writeArguments(DOUBLE to bias.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setBiasPtr, NIL)
  }

  public final fun getBias(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBiasPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setEnvironmentMode(mode: EnvironmentMode): Unit {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(ptr, MethodBindings.setEnvironmentModePtr, NIL)
  }

  public final fun getEnvironmentMode(): EnvironmentMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getEnvironmentModePtr, LONG)
    return LightmapGI.EnvironmentMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setEnvironmentCustomSky(sky: Sky?): Unit {
    TransferContext.writeArguments(OBJECT to sky)
    TransferContext.callMethod(ptr, MethodBindings.setEnvironmentCustomSkyPtr, NIL)
  }

  public final fun getEnvironmentCustomSky(): Sky? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getEnvironmentCustomSkyPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Sky?)
  }

  public final fun setEnvironmentCustomColor(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(ptr, MethodBindings.setEnvironmentCustomColorPtr, NIL)
  }

  public final fun getEnvironmentCustomColor(): Color {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getEnvironmentCustomColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  public final fun setEnvironmentCustomEnergy(energy: Float): Unit {
    TransferContext.writeArguments(DOUBLE to energy.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setEnvironmentCustomEnergyPtr, NIL)
  }

  public final fun getEnvironmentCustomEnergy(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getEnvironmentCustomEnergyPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setTexelScale(texelScale: Float): Unit {
    TransferContext.writeArguments(DOUBLE to texelScale.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setTexelScalePtr, NIL)
  }

  public final fun getTexelScale(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTexelScalePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setMaxTextureSize(maxTextureSize: Int): Unit {
    TransferContext.writeArguments(LONG to maxTextureSize.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setMaxTextureSizePtr, NIL)
  }

  public final fun getMaxTextureSize(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMaxTextureSizePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setUseDenoiser(useDenoiser: Boolean): Unit {
    TransferContext.writeArguments(BOOL to useDenoiser)
    TransferContext.callMethod(ptr, MethodBindings.setUseDenoiserPtr, NIL)
  }

  public final fun isUsingDenoiser(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isUsingDenoiserPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setDenoiserStrength(denoiserStrength: Float): Unit {
    TransferContext.writeArguments(DOUBLE to denoiserStrength.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setDenoiserStrengthPtr, NIL)
  }

  public final fun getDenoiserStrength(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDenoiserStrengthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setDenoiserRange(denoiserRange: Int): Unit {
    TransferContext.writeArguments(LONG to denoiserRange.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setDenoiserRangePtr, NIL)
  }

  public final fun getDenoiserRange(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDenoiserRangePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setInterior(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setInteriorPtr, NIL)
  }

  public final fun isInterior(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isInteriorPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setDirectional(directional: Boolean): Unit {
    TransferContext.writeArguments(BOOL to directional)
    TransferContext.callMethod(ptr, MethodBindings.setDirectionalPtr, NIL)
  }

  public final fun isDirectional(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isDirectionalPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setUseTextureForBounces(useTextureForBounces: Boolean): Unit {
    TransferContext.writeArguments(BOOL to useTextureForBounces)
    TransferContext.callMethod(ptr, MethodBindings.setUseTextureForBouncesPtr, NIL)
  }

  public final fun isUsingTextureForBounces(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isUsingTextureForBouncesPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setCameraAttributes(cameraAttributes: CameraAttributes?): Unit {
    TransferContext.writeArguments(OBJECT to cameraAttributes)
    TransferContext.callMethod(ptr, MethodBindings.setCameraAttributesPtr, NIL)
  }

  public final fun getCameraAttributes(): CameraAttributes? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCameraAttributesPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as CameraAttributes?)
  }

  public enum class BakeQuality(
    id: Long,
  ) {
    /**
     * Low bake quality (fastest bake times). The quality of this preset can be adjusted by changing
     * [ProjectSettings.rendering/lightmapping/bakeQuality/lowQualityRayCount] and
     * [ProjectSettings.rendering/lightmapping/bakeQuality/lowQualityProbeRayCount].
     */
    BAKE_QUALITY_LOW(0),
    /**
     * Medium bake quality (fast bake times). The quality of this preset can be adjusted by changing
     * [ProjectSettings.rendering/lightmapping/bakeQuality/mediumQualityRayCount] and
     * [ProjectSettings.rendering/lightmapping/bakeQuality/mediumQualityProbeRayCount].
     */
    BAKE_QUALITY_MEDIUM(1),
    /**
     * High bake quality (slow bake times). The quality of this preset can be adjusted by changing
     * [ProjectSettings.rendering/lightmapping/bakeQuality/highQualityRayCount] and
     * [ProjectSettings.rendering/lightmapping/bakeQuality/highQualityProbeRayCount].
     */
    BAKE_QUALITY_HIGH(2),
    /**
     * Highest bake quality (slowest bake times). The quality of this preset can be adjusted by
     * changing [ProjectSettings.rendering/lightmapping/bakeQuality/ultraQualityRayCount] and
     * [ProjectSettings.rendering/lightmapping/bakeQuality/ultraQualityProbeRayCount].
     */
    BAKE_QUALITY_ULTRA(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): BakeQuality = entries.single { it.id == `value` }
    }
  }

  public enum class GenerateProbes(
    id: Long,
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
      public fun from(`value`: Long): GenerateProbes = entries.single { it.id == `value` }
    }
  }

  public enum class BakeError(
    id: Long,
  ) {
    /**
     * Lightmap baking was successful.
     */
    BAKE_ERROR_OK(0),
    /**
     * Lightmap baking failed because the root node for the edited scene could not be accessed.
     */
    BAKE_ERROR_NO_SCENE_ROOT(1),
    /**
     * Lightmap baking failed as the lightmap data resource is embedded in a foreign resource.
     */
    BAKE_ERROR_FOREIGN_DATA(2),
    /**
     * Lightmap baking failed as there is no lightmapper available in this Godot build.
     */
    BAKE_ERROR_NO_LIGHTMAPPER(3),
    /**
     * Lightmap baking failed as the [LightmapGIData] save path isn't configured in the resource.
     */
    BAKE_ERROR_NO_SAVE_PATH(4),
    /**
     * Lightmap baking failed as there are no meshes whose [GeometryInstance3D.giMode] is
     * [GeometryInstance3D.GI_MODE_STATIC] and with valid UV2 mapping in the current scene. You may
     * need to select 3D scenes in the Import dock and change their global illumination mode
     * accordingly.
     */
    BAKE_ERROR_NO_MESHES(5),
    /**
     * Lightmap baking failed as the lightmapper failed to analyze some of the meshes marked as
     * static for baking.
     */
    BAKE_ERROR_MESHES_INVALID(6),
    /**
     * Lightmap baking failed as the resulting image couldn't be saved or imported by Godot after it
     * was saved.
     */
    BAKE_ERROR_CANT_CREATE_IMAGE(7),
    /**
     * The user aborted the lightmap baking operation (typically by clicking the **Cancel** button
     * in the progress dialog).
     */
    BAKE_ERROR_USER_ABORTED(8),
    /**
     * Lightmap baking failed as the maximum texture size is too small to fit some of the meshes
     * marked for baking.
     */
    BAKE_ERROR_TEXTURE_SIZE_TOO_SMALL(9),
    /**
     * Lightmap baking failed as the lightmap is too small.
     */
    BAKE_ERROR_LIGHTMAP_TOO_SMALL(10),
    /**
     * Lightmap baking failed as the lightmap was unable to fit into an atlas.
     */
    BAKE_ERROR_ATLAS_TOO_SMALL(11),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): BakeError = entries.single { it.id == `value` }
    }
  }

  public enum class EnvironmentMode(
    id: Long,
  ) {
    /**
     * Ignore environment lighting when baking lightmaps.
     */
    ENVIRONMENT_MODE_DISABLED(0),
    /**
     * Use the scene's environment lighting when baking lightmaps.
     * **Note:** If baking lightmaps in a scene with no [WorldEnvironment] node, this will act like
     * [ENVIRONMENT_MODE_DISABLED]. The editor's preview sky and sun is *not* taken into account by
     * [LightmapGI] when baking lightmaps.
     */
    ENVIRONMENT_MODE_SCENE(1),
    /**
     * Use [environmentCustomSky] as a source of environment lighting when baking lightmaps.
     */
    ENVIRONMENT_MODE_CUSTOM_SKY(2),
    /**
     * Use [environmentCustomColor] multiplied by [environmentCustomEnergy] as a constant source of
     * environment lighting when baking lightmaps.
     */
    ENVIRONMENT_MODE_CUSTOM_COLOR(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): EnvironmentMode = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setLightDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightmapGI", "set_light_data", 1790597277)

    public val getLightDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightmapGI", "get_light_data", 290354153)

    public val setBakeQualityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightmapGI", "set_bake_quality", 1192215803)

    public val getBakeQualityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightmapGI", "get_bake_quality", 688832735)

    public val setBouncesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightmapGI", "set_bounces", 1286410249)

    public val getBouncesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightmapGI", "get_bounces", 3905245786)

    public val setBounceIndirectEnergyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightmapGI", "set_bounce_indirect_energy", 373806689)

    public val getBounceIndirectEnergyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightmapGI", "get_bounce_indirect_energy", 1740695150)

    public val setGenerateProbesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightmapGI", "set_generate_probes", 549981046)

    public val getGenerateProbesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightmapGI", "get_generate_probes", 3930596226)

    public val setBiasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightmapGI", "set_bias", 373806689)

    public val getBiasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightmapGI", "get_bias", 1740695150)

    public val setEnvironmentModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightmapGI", "set_environment_mode", 2282650285)

    public val getEnvironmentModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightmapGI", "get_environment_mode", 4128646479)

    public val setEnvironmentCustomSkyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightmapGI", "set_environment_custom_sky", 3336722921)

    public val getEnvironmentCustomSkyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightmapGI", "get_environment_custom_sky", 1177136966)

    public val setEnvironmentCustomColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightmapGI", "set_environment_custom_color", 2920490490)

    public val getEnvironmentCustomColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightmapGI", "get_environment_custom_color", 3444240500)

    public val setEnvironmentCustomEnergyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightmapGI", "set_environment_custom_energy", 373806689)

    public val getEnvironmentCustomEnergyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightmapGI", "get_environment_custom_energy", 1740695150)

    public val setTexelScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightmapGI", "set_texel_scale", 373806689)

    public val getTexelScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightmapGI", "get_texel_scale", 1740695150)

    public val setMaxTextureSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightmapGI", "set_max_texture_size", 1286410249)

    public val getMaxTextureSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightmapGI", "get_max_texture_size", 3905245786)

    public val setUseDenoiserPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightmapGI", "set_use_denoiser", 2586408642)

    public val isUsingDenoiserPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightmapGI", "is_using_denoiser", 36873697)

    public val setDenoiserStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightmapGI", "set_denoiser_strength", 373806689)

    public val getDenoiserStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightmapGI", "get_denoiser_strength", 1740695150)

    public val setDenoiserRangePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightmapGI", "set_denoiser_range", 1286410249)

    public val getDenoiserRangePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightmapGI", "get_denoiser_range", 3905245786)

    public val setInteriorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightmapGI", "set_interior", 2586408642)

    public val isInteriorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightmapGI", "is_interior", 36873697)

    public val setDirectionalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightmapGI", "set_directional", 2586408642)

    public val isDirectionalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightmapGI", "is_directional", 36873697)

    public val setUseTextureForBouncesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightmapGI", "set_use_texture_for_bounces", 2586408642)

    public val isUsingTextureForBouncesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightmapGI", "is_using_texture_for_bounces", 36873697)

    public val setCameraAttributesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightmapGI", "set_camera_attributes", 2817810567)

    public val getCameraAttributesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightmapGI", "get_camera_attributes", 3921283215)
  }
}
