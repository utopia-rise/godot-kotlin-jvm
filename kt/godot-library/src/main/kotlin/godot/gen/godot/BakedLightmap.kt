// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.BakedLightmap
import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Prerendered indirect light map for a scene.
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/3.4/tutorials/3d/baked_lightmaps.html](https://docs.godotengine.org/en/3.4/tutorials/3d/baked_lightmaps.html)
 *
 * Baked lightmaps are an alternative workflow for adding indirect (or baked) lighting to a scene. Unlike the [godot.GIProbe] approach, baked lightmaps work fine on low-end PCs and mobile devices as they consume almost no resources in run-time.
 *
 * **Note:** Due to how lightmaps work, most properties only have a visible effect once lightmaps are baked again.
 */
@GodotBaseType
public open class BakedLightmap : VisualInstance() {
  /**
   * When enabled, the lightmapper will merge the textures for all meshes into a single large layered texture. Not supported in GLES2.
   */
  public open var atlasGenerate: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_GET_ATLAS_GENERATE,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_SET_ATLAS_GENERATE,
          NIL)
    }

  /**
   * Maximum size of each lightmap layer, only used when [atlasGenerate] is enabled.
   */
  public open var atlasMaxSize: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_GET_ATLAS_MAX_SIZE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_SET_ATLAS_MAX_SIZE,
          NIL)
    }

  /**
   * Raycasting bias used during baking to avoid floating point precision issues.
   */
  public open var bias: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_GET_BIAS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_SET_BIAS, NIL)
    }

  /**
   * The energy multiplier for each bounce. Higher values will make indirect lighting brighter. A value of `1.0` represents physically accurate behavior, but higher values can be used to make indirect lighting propagate more visibly when using a low number of bounces. This can be used to speed up bake times by lowering the number of [bounces] then increasing [bounceIndirectEnergy]. Unlike [godot.BakedLightmapData.energy], this property does not affect direct lighting emitted by light nodes, emissive materials and the environment.
   *
   * **Note:** [bounceIndirectEnergy] only has an effect if [bounces] is set to a value greater than or equal to `1`.
   */
  public open var bounceIndirectEnergy: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_GET_BOUNCE_INDIRECT_ENERGY, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_SET_BOUNCE_INDIRECT_ENERGY, NIL)
    }

  /**
   * Number of light bounces that are taken into account during baking. See also [bounceIndirectEnergy].
   */
  public open var bounces: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_GET_BOUNCES, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_SET_BOUNCES, NIL)
    }

  /**
   * Grid size used for real-time capture information on dynamic objects.
   */
  public open var captureCellSize: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_GET_CAPTURE_CELL_SIZE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_SET_CAPTURE_CELL_SIZE, NIL)
    }

  /**
   * When enabled, an octree containing the scene's lighting information will be computed. This octree will then be used to light dynamic objects in the scene.
   */
  public open var captureEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_GET_CAPTURE_ENABLED,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_SET_CAPTURE_ENABLED,
          NIL)
    }

  /**
   * Bias value to reduce the amount of light proagation in the captured octree.
   */
  public open var capturePropagation: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_GET_CAPTURE_PROPAGATION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_SET_CAPTURE_PROPAGATION, NIL)
    }

  /**
   * Bake quality of the capture data.
   */
  public open var captureQuality: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_GET_CAPTURE_QUALITY,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_SET_CAPTURE_QUALITY,
          NIL)
    }

  /**
   * If a baked mesh doesn't have a UV2 size hint, this value will be used to roughly compute a suitable lightmap size.
   */
  public open var defaultTexelsPerUnit: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_GET_DEFAULT_TEXELS_PER_UNIT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_SET_DEFAULT_TEXELS_PER_UNIT, NIL)
    }

  /**
   * The environment color when [environmentMode] is set to [ENVIRONMENT_MODE_CUSTOM_COLOR].
   */
  public open var environmentCustomColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_GET_ENVIRONMENT_CUSTOM_COLOR, COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_SET_ENVIRONMENT_CUSTOM_COLOR, NIL)
    }

  /**
   * The energy scaling factor when when [environmentMode] is set to [ENVIRONMENT_MODE_CUSTOM_COLOR] or [ENVIRONMENT_MODE_CUSTOM_SKY].
   */
  public open var environmentCustomEnergy: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_GET_ENVIRONMENT_CUSTOM_ENERGY, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_SET_ENVIRONMENT_CUSTOM_ENERGY, NIL)
    }

  /**
   * The [godot.Sky] resource to use when [environmentMode] is set o [ENVIRONMENT_MODE_CUSTOM_SKY].
   */
  public open var environmentCustomSky: Sky?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_GET_ENVIRONMENT_CUSTOM_SKY, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Sky?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_SET_ENVIRONMENT_CUSTOM_SKY, NIL)
    }

  /**
   * The rotation of the baked custom sky.
   */
  public open var environmentCustomSkyRotationDegrees: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_GET_ENVIRONMENT_CUSTOM_SKY_ROTATION_DEGREES,
          VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_SET_ENVIRONMENT_CUSTOM_SKY_ROTATION_DEGREES, NIL)
    }

  /**
   * Minimum ambient light for all the lightmap texels. This doesn't take into account any occlusion from the scene's geometry, it simply ensures a minimum amount of light on all the lightmap texels. Can be used for artistic control on shadow color.
   */
  public open var environmentMinLight: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_GET_ENVIRONMENT_MIN_LIGHT, COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_SET_ENVIRONMENT_MIN_LIGHT, NIL)
    }

  /**
   * Decides which environment to use during baking.
   */
  public open var environmentMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_GET_ENVIRONMENT_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_SET_ENVIRONMENT_MODE, NIL)
    }

  /**
   * Size of the baked lightmap. Only meshes inside this region will be included in the baked lightmap, also used as the bounds of the captured region for dynamic lighting.
   */
  public open var extents: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_GET_EXTENTS,
          VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_SET_EXTENTS, NIL)
    }

  /**
   * Deprecated, in previous versions it determined the location where lightmaps were be saved.
   */
  public open var imagePath: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_GET_IMAGE_PATH,
          STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_SET_IMAGE_PATH, NIL)
    }

  /**
   * The calculated light data.
   */
  public open var lightData: BakedLightmapData?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_GET_LIGHT_DATA,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as BakedLightmapData?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_SET_LIGHT_DATA, NIL)
    }

  /**
   * Determines the amount of samples per texel used in indrect light baking. The amount of samples for each quality level can be configured in the project settings.
   */
  public open var quality: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_GET_QUALITY, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_SET_QUALITY, NIL)
    }

  /**
   * Store full color values in the lightmap textures. When disabled, lightmap textures will store a single brightness channel. Can be disabled to reduce disk usage if the scene contains only white lights or you don't mind losing color information in indirect lighting.
   */
  public open var useColor: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_GET_USE_COLOR, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_SET_USE_COLOR, NIL)
    }

  /**
   * When enabled, a lightmap denoiser will be used to reduce the noise inherent to Monte Carlo based global illumination.
   */
  public open var useDenoiser: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_GET_USE_DENOISER,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_SET_USE_DENOISER,
          NIL)
    }

  /**
   * If `true`, stores the lightmap textures in a high dynamic range format (EXR). If `false`, stores the lightmap texture in a low dynamic range PNG image. This can be set to `false` to reduce disk usage, but light values over 1.0 will be clamped and you may see banding caused by the reduced precision.
   *
   * **Note:** Setting [useHdr] to `true` will decrease lightmap banding even when using the GLES2 backend or if [godot.ProjectSettings.rendering/quality/depth/hdr] is `false`.
   */
  public open var useHdr: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_GET_USE_HDR, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_SET_USE_HDR, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_BAKEDLIGHTMAP)
  }

  @CoreTypeHelper
  public open fun environmentCustomColor(schedule: Color.() -> Unit): Color =
      environmentCustomColor.apply{
      schedule(this)
      environmentCustomColor = this
  }


  @CoreTypeHelper
  public open fun environmentCustomSkyRotationDegrees(schedule: Vector3.() -> Unit): Vector3 =
      environmentCustomSkyRotationDegrees.apply{
      schedule(this)
      environmentCustomSkyRotationDegrees = this
  }


  @CoreTypeHelper
  public open fun environmentMinLight(schedule: Color.() -> Unit): Color =
      environmentMinLight.apply{
      schedule(this)
      environmentMinLight = this
  }


  @CoreTypeHelper
  public open fun extents(schedule: Vector3.() -> Unit): Vector3 = extents.apply{
      schedule(this)
      extents = this
  }


  /**
   * Bakes the lightmap, scanning from the given `from_node` root and saves the resulting [godot.BakedLightmapData] in `data_save_path`. If no root node is provided, parent of this node will be used as root instead. If no save path is provided it will try to match the path from the current [lightData].
   */
  public open fun bake(fromNode: Node? = null, dataSavePath: String = ""): BakedLightmap.BakeError {
    TransferContext.writeArguments(OBJECT to fromNode, STRING to dataSavePath)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_BAKE, LONG)
    return BakedLightmap.BakeError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  public enum class BakeQuality(
    id: Long
  ) {
    /**
     * The lowest bake quality mode. Fastest to calculate.
     */
    BAKE_QUALITY_LOW(0),
    /**
     * The default bake quality mode.
     */
    BAKE_QUALITY_MEDIUM(1),
    /**
     * A higher bake quality mode. Takes longer to calculate.
     */
    BAKE_QUALITY_HIGH(2),
    /**
     * The highest bake quality mode. Takes the longest to calculate.
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

  public enum class BakeError(
    id: Long
  ) {
    /**
     * Baking was successful.
     */
    BAKE_ERROR_OK(0),
    /**
     * Returns if no viable save path is found. This can happen where an [imagePath] is not specified or when the save location is invalid.
     */
    BAKE_ERROR_NO_SAVE_PATH(1),
    /**
     * Currently unused.
     */
    BAKE_ERROR_NO_MESHES(2),
    /**
     * Returns when the baker cannot save per-mesh textures to file.
     */
    BAKE_ERROR_CANT_CREATE_IMAGE(3),
    /**
     * The size of the generated lightmaps is too large.
     */
    BAKE_ERROR_LIGHTMAP_SIZE(4),
    /**
     * Some mesh contains UV2 values outside the `[0,1]` range.
     */
    BAKE_ERROR_INVALID_MESH(5),
    /**
     * Returns if user cancels baking.
     */
    BAKE_ERROR_USER_ABORTED(6),
    /**
     * Returns if lightmapper can't be created. Unless you are using a custom lightmapper, please report this as bug.
     */
    BAKE_ERROR_NO_LIGHTMAPPER(7),
    /**
     * There is no root node to start baking from. Either provide `from_node` argument or attach this node to a parent that should be used as root.
     */
    BAKE_ERROR_NO_ROOT(8),
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
     * No environment is used during baking.
     */
    ENVIRONMENT_MODE_DISABLED(0),
    /**
     * The baked environment is automatically picked from the current scene.
     */
    ENVIRONMENT_MODE_SCENE(1),
    /**
     * A custom sky is used as environment during baking.
     */
    ENVIRONMENT_MODE_CUSTOM_SKY(2),
    /**
     * A custom solid color is used as environment during baking.
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

  public companion object {
    /**
     * Returns when the baker cannot save per-mesh textures to file.
     */
    public final const val BAKE_ERROR_CANT_CREATE_IMAGE: Long = 3

    /**
     * Some mesh contains UV2 values outside the `[0,1]` range.
     */
    public final const val BAKE_ERROR_INVALID_MESH: Long = 5

    /**
     * The size of the generated lightmaps is too large.
     */
    public final const val BAKE_ERROR_LIGHTMAP_SIZE: Long = 4

    /**
     * Returns if lightmapper can't be created. Unless you are using a custom lightmapper, please report this as bug.
     */
    public final const val BAKE_ERROR_NO_LIGHTMAPPER: Long = 7

    /**
     * Currently unused.
     */
    public final const val BAKE_ERROR_NO_MESHES: Long = 2

    /**
     * There is no root node to start baking from. Either provide `from_node` argument or attach this node to a parent that should be used as root.
     */
    public final const val BAKE_ERROR_NO_ROOT: Long = 8

    /**
     * Returns if no viable save path is found. This can happen where an [imagePath] is not specified or when the save location is invalid.
     */
    public final const val BAKE_ERROR_NO_SAVE_PATH: Long = 1

    /**
     * Baking was successful.
     */
    public final const val BAKE_ERROR_OK: Long = 0

    /**
     * Returns if user cancels baking.
     */
    public final const val BAKE_ERROR_USER_ABORTED: Long = 6

    /**
     * A higher bake quality mode. Takes longer to calculate.
     */
    public final const val BAKE_QUALITY_HIGH: Long = 2

    /**
     * The lowest bake quality mode. Fastest to calculate.
     */
    public final const val BAKE_QUALITY_LOW: Long = 0

    /**
     * The default bake quality mode.
     */
    public final const val BAKE_QUALITY_MEDIUM: Long = 1

    /**
     * The highest bake quality mode. Takes the longest to calculate.
     */
    public final const val BAKE_QUALITY_ULTRA: Long = 3

    /**
     * A custom solid color is used as environment during baking.
     */
    public final const val ENVIRONMENT_MODE_CUSTOM_COLOR: Long = 3

    /**
     * A custom sky is used as environment during baking.
     */
    public final const val ENVIRONMENT_MODE_CUSTOM_SKY: Long = 2

    /**
     * No environment is used during baking.
     */
    public final const val ENVIRONMENT_MODE_DISABLED: Long = 0

    /**
     * The baked environment is automatically picked from the current scene.
     */
    public final const val ENVIRONMENT_MODE_SCENE: Long = 1
  }
}
