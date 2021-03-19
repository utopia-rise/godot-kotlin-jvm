// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import kotlin.Double
import kotlin.Long
import kotlin.Suppress

/**
 * A CubeMap is a 6-sided 3D texture.
 * 
 * A 6-sided 3D texture typically used for faking reflections. It can be used to make an object look as if it's reflecting its surroundings. This usually delivers much better performance than other reflection methods.
 */
@GodotBaseType
open class CubeMap : Resource() {
  /**
   * The render flags for the [godot.CubeMap]. See the [enum Flags] constants for details.
   */
  open var flags: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CUBEMAP_GET_FLAGS, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CUBEMAP_SET_FLAGS, NIL)
    }

  /**
   * The lossy storage quality of the [godot.CubeMap] if the storage mode is set to [STORAGE_COMPRESS_LOSSY].
   */
  open var lossyStorageQuality: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CUBEMAP_GET_LOSSY_STORAGE_QUALITY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CUBEMAP_SET_LOSSY_STORAGE_QUALITY,
          NIL)
    }

  /**
   * The [godot.CubeMap]'s storage mode. See [enum Storage] constants.
   */
  open var storageMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CUBEMAP_GET_STORAGE_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CUBEMAP_SET_STORAGE_MODE, NIL)
    }

  override fun __new() {
    callConstructor(ENGINECLASS_CUBEMAP)
  }

  /**
   * Returns the [godot.CubeMap]'s height.
   */
  open fun getHeight(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CUBEMAP_GET_HEIGHT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns an [godot.Image] for a side of the [godot.CubeMap] using one of the [enum Side] constants.
   */
  open fun getSide(side: Long): Image? {
    TransferContext.writeArguments(LONG to side)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CUBEMAP_GET_SIDE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Image?
  }

  /**
   * Returns the [godot.CubeMap]'s width.
   */
  open fun getWidth(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CUBEMAP_GET_WIDTH, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Sets an [godot.Image] for a side of the [godot.CubeMap] using one of the [enum Side] constants.
   */
  open fun setSide(side: Long, image: Image) {
    TransferContext.writeArguments(LONG to side, OBJECT to image)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CUBEMAP_SET_SIDE, NIL)
  }

  enum class Flags(
    id: Long
  ) {
    /**
     * Generate mipmaps, to enable smooth zooming out of the texture.
     */
    FLAG_MIPMAPS(1),

    /**
     * Repeat (instead of clamp to edge).
     */
    FLAG_REPEAT(2),

    /**
     * Turn on magnifying filter, to enable smooth zooming in of the texture.
     */
    FLAG_FILTER(4),

    /**
     * Default flags. Generate mipmaps, repeat, and filter are enabled.
     */
    FLAGS_DEFAULT(7);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class Side(
    id: Long
  ) {
    /**
     * Identifier for the left face of the [godot.CubeMap].
     */
    SIDE_LEFT(0),

    /**
     * Identifier for the right face of the [godot.CubeMap].
     */
    SIDE_RIGHT(1),

    /**
     * Identifier for the bottom face of the [godot.CubeMap].
     */
    SIDE_BOTTOM(2),

    /**
     * Identifier for the top face of the [godot.CubeMap].
     */
    SIDE_TOP(3),

    /**
     * Identifier for the front face of the [godot.CubeMap].
     */
    SIDE_FRONT(4),

    /**
     * Identifier for the back face of the [godot.CubeMap].
     */
    SIDE_BACK(5);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class Storage(
    id: Long
  ) {
    /**
     * Store the [godot.CubeMap] without any compression.
     */
    STORAGE_RAW(0),

    /**
     * Store the [godot.CubeMap] with strong compression that reduces image quality.
     */
    STORAGE_COMPRESS_LOSSY(1),

    /**
     * Store the [godot.CubeMap] with moderate compression that doesn't reduce image quality.
     */
    STORAGE_COMPRESS_LOSSLESS(2);

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
     * Default flags. Generate mipmaps, repeat, and filter are enabled.
     */
    final const val FLAGS_DEFAULT: Long = 7

    /**
     * Turn on magnifying filter, to enable smooth zooming in of the texture.
     */
    final const val FLAG_FILTER: Long = 4

    /**
     * Generate mipmaps, to enable smooth zooming out of the texture.
     */
    final const val FLAG_MIPMAPS: Long = 1

    /**
     * Repeat (instead of clamp to edge).
     */
    final const val FLAG_REPEAT: Long = 2

    /**
     * Identifier for the back face of the [godot.CubeMap].
     */
    final const val SIDE_BACK: Long = 5

    /**
     * Identifier for the bottom face of the [godot.CubeMap].
     */
    final const val SIDE_BOTTOM: Long = 2

    /**
     * Identifier for the front face of the [godot.CubeMap].
     */
    final const val SIDE_FRONT: Long = 4

    /**
     * Identifier for the left face of the [godot.CubeMap].
     */
    final const val SIDE_LEFT: Long = 0

    /**
     * Identifier for the right face of the [godot.CubeMap].
     */
    final const val SIDE_RIGHT: Long = 1

    /**
     * Identifier for the top face of the [godot.CubeMap].
     */
    final const val SIDE_TOP: Long = 3

    /**
     * Store the [godot.CubeMap] with moderate compression that doesn't reduce image quality.
     */
    final const val STORAGE_COMPRESS_LOSSLESS: Long = 2

    /**
     * Store the [godot.CubeMap] with strong compression that reduces image quality.
     */
    final const val STORAGE_COMPRESS_LOSSY: Long = 1

    /**
     * Store the [godot.CubeMap] without any compression.
     */
    final const val STORAGE_RAW: Long = 0
  }
}
