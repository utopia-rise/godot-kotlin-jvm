// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.Image
import godot.annotation.GodotBaseType
import godot.core.GodotError
import godot.core.RID
import godot.core.TransferContext
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

/**
 * A [godot.Texture] based on an [godot.Image].
 *
 * A [godot.Texture] based on an [godot.Image]. Can be created from an [godot.Image] with [createFromImage].
 *
 * **Note:** The maximum image size is 16384×16384 pixels due to graphics hardware limitations. Larger images will fail to import.
 */
@GodotBaseType
open class ImageTexture : Texture() {
  /**
   * The storage quality for [STORAGE_COMPRESS_LOSSY].
   */
  open var lossyQuality: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGETEXTURE_GET_LOSSY_QUALITY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGETEXTURE_SET_LOSSY_QUALITY,
          NIL)
    }

  /**
   * The storage type (raw, lossy, or compressed).
   */
  open var storage: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGETEXTURE_GET_STORAGE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGETEXTURE_SET_STORAGE, NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_IMAGETEXTURE, ____DO_NOT_TOUCH_THIS_isRef____())
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  open fun _reloadHook(rid: RID) {
  }

  /**
   * Create a new [godot.ImageTexture] with `width` and `height`.
   *
   * `format` is a value from [enum Image.Format], `flags` is any combination of [enum Texture.Flags].
   */
  open fun create(
    width: Long,
    height: Long,
    format: Long,
    flags: Long = 7
  ) {
    TransferContext.writeArguments(LONG to width, LONG to height, LONG to format, LONG to flags)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGETEXTURE_CREATE, NIL)
  }

  /**
   * Create a new [godot.ImageTexture] from an [godot.Image] with `flags` from [enum Texture.Flags]. An sRGB to linear color space conversion can take place, according to [enum Image.Format].
   */
  open fun createFromImage(image: Image, flags: Long = 7) {
    TransferContext.writeArguments(OBJECT to image, LONG to flags)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGETEXTURE_CREATE_FROM_IMAGE, NIL)
  }

  /**
   * Returns the format of the [godot.ImageTexture], one of [enum Image.Format].
   */
  open fun getFormat(): Image.Format {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGETEXTURE_GET_FORMAT, LONG)
    return Image.Format.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Load an [godot.ImageTexture] from a file path.
   */
  open fun load(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGETEXTURE_LOAD, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Sets the [godot.Image] of this [godot.ImageTexture].
   */
  open fun setData(image: Image) {
    TransferContext.writeArguments(OBJECT to image)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGETEXTURE_SET_DATA, NIL)
  }

  /**
   * Resizes the [godot.ImageTexture] to the specified dimensions.
   */
  open fun setSizeOverride(size: Vector2) {
    TransferContext.writeArguments(VECTOR2 to size)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGETEXTURE_SET_SIZE_OVERRIDE, NIL)
  }

  enum class Storage(
    id: Long
  ) {
    /**
     * [godot.Image] data is stored raw and unaltered.
     */
    STORAGE_RAW(0),

    /**
     * [godot.Image] data is compressed with a lossy algorithm. You can set the storage quality with [lossyQuality].
     */
    STORAGE_COMPRESS_LOSSY(1),

    /**
     * [godot.Image] data is compressed with a lossless algorithm.
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
     * [godot.Image] data is compressed with a lossless algorithm.
     */
    final const val STORAGE_COMPRESS_LOSSLESS: Long = 2

    /**
     * [godot.Image] data is compressed with a lossy algorithm. You can set the storage quality with [lossyQuality].
     */
    final const val STORAGE_COMPRESS_LOSSY: Long = 1

    /**
     * [godot.Image] data is stored raw and unaltered.
     */
    final const val STORAGE_RAW: Long = 0
  }
}
