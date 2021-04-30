// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.BakedLightmap
import godot.annotation.CoreTypeHelper
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
 * [https://docs.godotengine.org/en/3.3/tutorials/3d/baked_lightmaps.html](https://docs.godotengine.org/en/3.3/tutorials/3d/baked_lightmaps.html)
 *
 * Baked lightmaps are an alternative workflow for adding indirect (or baked) lighting to a scene. Unlike the [godot.GIProbe] approach, baked lightmaps work fine on low-end PCs and mobile devices as they consume almost no resources in run-time.
 */
@GodotBaseType
open class BakedLightmap : VisualInstance() {
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
   * Grid size used for real-time capture information on dynamic objects.
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
   * Deprecated, in previous versions it determined the location where lightmaps were be saved.
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
    callConstructor(ENGINECLASS_BAKEDLIGHTMAP)
  }

  @CoreTypeHelper
  open fun bakeExtents(schedule: Vector3.() -> Unit): Vector3 = bakeExtents.apply{
      schedule(this)
      bakeExtents = this
  }


  /**
   * Bakes the lightmap, scanning from the given `from_node` root and saves the resulting [godot.BakedLightmapData] in `data_save_path`. If no save path is provided it will try to match the path from the current [lightData].
   */
  open fun bake(fromNode: Node? = null, createVisualDebug: Boolean = false):
      BakedLightmap.BakeError {
    TransferContext.writeArguments(OBJECT to fromNode, BOOL to createVisualDebug)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAP_BAKE, LONG)
    return BakedLightmap.BakeError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

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
     * A higher bake quality mode. Takes longer to calculate.
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
    BAKE_MODE_CONE_TRACE(0),

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

    final const val BAKE_MODE_CONE_TRACE: Long = 0

    final const val BAKE_MODE_RAY_TRACE: Long = 1

    /**
     * A higher bake quality mode. Takes longer to calculate.
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
