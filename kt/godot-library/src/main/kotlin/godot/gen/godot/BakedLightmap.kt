// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.BakedLightmap
import godot.annotation.CoreTypeHelper
import godot.annotation.GodotBaseType
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
 * [https://docs.godotengine.org/en/latest/tutorials/3d/baked_lightmaps.html](https://docs.godotengine.org/en/latest/tutorials/3d/baked_lightmaps.html)
 *
 * Baked lightmaps are an alternative workflow for adding indirect (or baked) lighting to a scene. Unlike the [godot.GIProbe] approach, baked lightmaps work fine on low-end PCs and mobile devices as they consume almost no resources in run-time.
 *
 * **Note:** This node has many known bugs and will be [rewritten for Godot 4.0](https://godotengine.org/article/godot-40-will-get-new-modernized-lightmapper). See [godot.GitHub issue #30929](https://github.com/godotengine/godot/issues/30929).
 */
@GodotBaseType
open class BakedLightmap : VisualInstance() {
  open var atlasGenerate: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_GET_ATLAS_GENERATE,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_SET_ATLAS_GENERATE,
          NIL)
    }

  open var atlasMaxSize: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_GET_ATLAS_MAX_SIZE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_SET_ATLAS_MAX_SIZE,
          NIL)
    }

  open var bias: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_GET_BIAS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_SET_BIAS, NIL)
    }

  open var bounces: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_GET_BOUNCES, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_SET_BOUNCES, NIL)
    }

  /**
   * Grid size used for real-time capture information on dynamic objects. Cannot be larger than [bakeCellSize].
   */
  open var captureCellSize: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_GET_CAPTURE_CELL_SIZE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_SET_CAPTURE_CELL_SIZE, NIL)
    }

  open var captureEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_GET_CAPTURE_ENABLED,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_SET_CAPTURE_ENABLED,
          NIL)
    }

  open var capturePropagation: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_GET_CAPTURE_PROPAGATION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_SET_CAPTURE_PROPAGATION, NIL)
    }

  open var captureQuality: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_GET_CAPTURE_QUALITY,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_SET_CAPTURE_QUALITY,
          NIL)
    }

  open var defaultTexelsPerUnit: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_GET_DEFAULT_TEXELS_PER_UNIT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_SET_DEFAULT_TEXELS_PER_UNIT, NIL)
    }

  open var environmentCustomColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_GET_ENVIRONMENT_CUSTOM_COLOR, COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(value) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_SET_ENVIRONMENT_CUSTOM_COLOR, NIL)
    }

  open var environmentCustomEnergy: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_GET_ENVIRONMENT_CUSTOM_ENERGY, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_SET_ENVIRONMENT_CUSTOM_ENERGY, NIL)
    }

  open var environmentCustomSky: Sky?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_GET_ENVIRONMENT_CUSTOM_SKY, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Sky?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_SET_ENVIRONMENT_CUSTOM_SKY, NIL)
    }

  open var environmentCustomSkyRotationDegrees: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_GET_ENVIRONMENT_CUSTOM_SKY_ROTATION_DEGREES,
          VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(value) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_SET_ENVIRONMENT_CUSTOM_SKY_ROTATION_DEGREES, NIL)
    }

  open var environmentMinLight: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_GET_ENVIRONMENT_MIN_LIGHT, COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(value) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_SET_ENVIRONMENT_MIN_LIGHT, NIL)
    }

  open var environmentMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_GET_ENVIRONMENT_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_SET_ENVIRONMENT_MODE, NIL)
    }

  open var extents: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_GET_EXTENTS,
          VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(value) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_SET_EXTENTS, NIL)
    }

  /**
   * The location where lightmaps will be saved.
   */
  open var imagePath: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_GET_IMAGE_PATH,
          STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_SET_IMAGE_PATH, NIL)
    }

  /**
   * The calculated light data.
   */
  open var lightData: BakedLightmapData?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_GET_LIGHT_DATA,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as BakedLightmapData?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_SET_LIGHT_DATA, NIL)
    }

  open var quality: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_GET_QUALITY, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_SET_QUALITY, NIL)
    }

  open var useColor: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_GET_USE_COLOR, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_SET_USE_COLOR, NIL)
    }

  open var useDenoiser: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_GET_USE_DENOISER,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_SET_USE_DENOISER,
          NIL)
    }

  open var useHdr: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_GET_USE_HDR, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_SET_USE_HDR, NIL)
    }

  override fun __new() {
    callConstructor(ENGINECLASS_BAKEDLIGHTMAP)
  }

  @CoreTypeHelper
  open fun environmentCustomColor(schedule: Color.() -> Unit): Color = environmentCustomColor.apply{
      schedule(this)
      environmentCustomColor = this
  }


  @CoreTypeHelper
  open fun environmentCustomSkyRotationDegrees(schedule: Vector3.() -> Unit): Vector3 =
      environmentCustomSkyRotationDegrees.apply{
      schedule(this)
      environmentCustomSkyRotationDegrees = this
  }


  @CoreTypeHelper
  open fun environmentMinLight(schedule: Color.() -> Unit): Color = environmentMinLight.apply{
      schedule(this)
      environmentMinLight = this
  }


  @CoreTypeHelper
  open fun extents(schedule: Vector3.() -> Unit): Vector3 = extents.apply{
      schedule(this)
      extents = this
  }


  /**
   * Bakes the lightmaps within the currently edited scene. Returns a [enum BakeError] to signify if the bake was successful, or if unsuccessful, how the bake failed.
   */
  open fun bake(fromNode: Node? = null, dataSavePath: String = ""): BakedLightmap.BakeError {
    TransferContext.writeArguments(OBJECT to fromNode, STRING to dataSavePath)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_BAKE, LONG)
    return BakedLightmap.BakeError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  enum class BakeQuality(
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
     * The highest bake quality mode. Takes longer to calculate.
     */
    BAKE_QUALITY_HIGH(2),

    BAKE_QUALITY_ULTRA(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class BakeError(
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

    BAKE_ERROR_LIGHTMAP_SIZE(4),

    BAKE_ERROR_INVALID_MESH(5),

    /**
     * Returns if user cancels baking.
     */
    BAKE_ERROR_USER_ABORTED(6),

    BAKE_ERROR_NO_LIGHTMAPPER(7);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class EnvironmentMode(
    id: Long
  ) {
    ENVIRONMENT_MODE_DISABLED(0),

    ENVIRONMENT_MODE_SCENE(1),

    ENVIRONMENT_MODE_CUSTOM_SKY(2),

    ENVIRONMENT_MODE_CUSTOM_COLOR(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    /**
     * Returns when the baker cannot save per-mesh textures to file.
     */
    final const val BAKE_ERROR_CANT_CREATE_IMAGE: Long = 3

    final const val BAKE_ERROR_INVALID_MESH: Long = 5

    final const val BAKE_ERROR_LIGHTMAP_SIZE: Long = 4

    final const val BAKE_ERROR_NO_LIGHTMAPPER: Long = 7

    /**
     * Currently unused.
     */
    final const val BAKE_ERROR_NO_MESHES: Long = 2

    /**
     * Returns if no viable save path is found. This can happen where an [imagePath] is not specified or when the save location is invalid.
     */
    final const val BAKE_ERROR_NO_SAVE_PATH: Long = 1

    /**
     * Baking was successful.
     */
    final const val BAKE_ERROR_OK: Long = 0

    /**
     * Returns if user cancels baking.
     */
    final const val BAKE_ERROR_USER_ABORTED: Long = 6

    /**
     * The highest bake quality mode. Takes longer to calculate.
     */
    final const val BAKE_QUALITY_HIGH: Long = 2

    /**
     * The lowest bake quality mode. Fastest to calculate.
     */
    final const val BAKE_QUALITY_LOW: Long = 0

    /**
     * The default bake quality mode.
     */
    final const val BAKE_QUALITY_MEDIUM: Long = 1

    final const val BAKE_QUALITY_ULTRA: Long = 3

    final const val ENVIRONMENT_MODE_CUSTOM_COLOR: Long = 3

    final const val ENVIRONMENT_MODE_CUSTOM_SKY: Long = 2

    final const val ENVIRONMENT_MODE_DISABLED: Long = 0

    final const val ENVIRONMENT_MODE_SCENE: Long = 1
  }
}
