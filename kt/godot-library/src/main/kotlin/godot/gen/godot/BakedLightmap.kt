// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.BakedLightmap
import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
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
  /**
   * Grid subdivision size for lightmapper calculation. The default value will work for most cases. Increase for better lighting on small details or if your scene is very large.
   */
  open var bakeCellSize: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_GET_BAKE_CELL_SIZE,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_SET_BAKE_CELL_SIZE,
          NIL)
    }

  /**
   * If a [godot.Mesh.lightmapSizeHint] isn't specified, the lightmap baker will dynamically set the lightmap size using this value. This value is measured in texels per world unit. The maximum lightmap texture size is 4096x4096.
   */
  open var bakeDefaultTexelsPerUnit: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_GET_BAKE_DEFAULT_TEXELS_PER_UNIT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_SET_BAKE_DEFAULT_TEXELS_PER_UNIT, NIL)
    }

  /**
   * Multiplies the light sources' intensity by this value. For instance, if the value is set to 2, lights will be twice as bright. If the value is set to 0.5, lights will be half as bright.
   */
  open var bakeEnergy: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_GET_BAKE_ENERGY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_SET_BAKE_ENERGY,
          NIL)
    }

  /**
   * The size of the affected area.
   */
  open var bakeExtents: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_GET_BAKE_EXTENTS,
          VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(value) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_SET_BAKE_EXTENTS,
          NIL)
    }

  /**
   * If `true`, the lightmap can capture light values greater than `1.0`. Turning this off will result in a smaller file size.
   */
  open var bakeHdr: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_GET_BAKE_HDR, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_SET_BAKE_HDR, NIL)
    }

  /**
   * Lightmapping mode. See [enum BakeMode].
   */
  open var bakeMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_GET_BAKE_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_SET_BAKE_MODE, NIL)
    }

  /**
   * Defines how far the light will travel before it is no longer effective. The higher the number, the farther the light will travel. For instance, if the value is set to 2, the light will go twice as far. If the value is set to 0.5, the light will only go half as far.
   */
  open var bakePropagation: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_GET_BAKE_PROPAGATION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_SET_BAKE_PROPAGATION, NIL)
    }

  /**
   * Three quality modes are available. Higher quality requires more rendering time. See [enum BakeQuality].
   */
  open var bakeQuality: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_GET_BAKE_QUALITY,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_SET_BAKE_QUALITY,
          NIL)
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

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_BAKEDLIGHTMAP, ____DO_NOT_TOUCH_THIS_isRef____())
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  open fun bakeExtents(schedule: Vector3.() -> Unit): Vector3 = bakeExtents.apply{
      schedule(this)
      bakeExtents = this
  }


  /**
   * Bakes the lightmaps within the currently edited scene. Returns a [enum BakeError] to signify if the bake was successful, or if unsuccessful, how the bake failed.
   */
  open fun bake(fromNode: Node? = null, createVisualDebug: Boolean = false):
      BakedLightmap.BakeError {
    TransferContext.writeArguments(OBJECT to fromNode, BOOL to createVisualDebug)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_BAKE, LONG)
    return BakedLightmap.BakeError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Executes a dry run bake of lightmaps within the currently edited scene.
   */
  open fun debugBake() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_DEBUG_BAKE, NIL)
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
    BAKE_QUALITY_HIGH(2);

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

    /**
     * Returns if user cancels baking.
     */
    BAKE_ERROR_USER_ABORTED(4);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class BakeMode(
    id: Long
  ) {
    /**
     * Less precise but faster bake mode.
     */
    BAKE_MODE_CONE_TRACE(0),

    /**
     * More precise bake mode but can take considerably longer to bake.
     */
    BAKE_MODE_RAY_TRACE(1);

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
    final const val BAKE_ERROR_USER_ABORTED: Long = 4

    /**
     * Less precise but faster bake mode.
     */
    final const val BAKE_MODE_CONE_TRACE: Long = 0

    /**
     * More precise bake mode but can take considerably longer to bake.
     */
    final const val BAKE_MODE_RAY_TRACE: Long = 1

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
  }
}
