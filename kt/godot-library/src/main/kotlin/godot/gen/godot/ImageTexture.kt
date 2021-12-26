// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.Image
import godot.`annotation`.GodotBaseType
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
import kotlin.Unit

/**
 * A [godot.Texture] based on an [godot.Image].
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/3.4/tutorials/assets_pipeline/importing_images.html](https://docs.godotengine.org/en/3.4/tutorials/assets_pipeline/importing_images.html)
 *
 * A [godot.Texture] based on an [godot.Image]. For an image to be displayed, an [godot.ImageTexture] has to be created from it using the [createFromImage] method:
 *
 * ```
 * 		var texture = ImageTexture.new()
 * 		var image = Image.new()
 * 		image.load("res://icon.png")
 * 		texture.create_from_image(image)
 * 		$Sprite.texture = texture
 * 		```
 *
 * This way, textures can be created at run-time by loading images both from within the editor and externally.
 *
 * **Warning:** Prefer to load imported textures with [@GDScript.load] over loading them from within the filesystem dynamically with [godot.Image.load], as it may not work in exported projects:
 *
 * ```
 * 		var texture = load("res://icon.png")
 * 		$Sprite.texture = texture
 * 		```
 *
 * This is because images have to be imported as [godot.StreamTexture] first to be loaded with [@GDScript.load]. If you'd still like to load an image file just like any other [godot.Resource], import it as an [godot.Image] resource instead, and then load it normally using the [@GDScript.load] method.
 *
 * But do note that the image data can still be retrieved from an imported texture as well using the [godot.Texture.getData] method, which returns a copy of the data:
 *
 * ```
 * 		var texture = load("res://icon.png")
 * 		var image : Image = texture.get_data()
 * 		```
 *
 * An [godot.ImageTexture] is not meant to be operated from within the editor interface directly, and is mostly useful for rendering images on screen dynamically via code. If you need to generate images procedurally from within the editor, consider saving and importing images as custom texture resources implementing a new [godot.EditorImportPlugin].
 *
 * **Note:** The maximum texture size is 16384×16384 pixels due to graphics hardware limitations.
 */
@GodotBaseType
public open class ImageTexture : Texture() {
  /**
   * The storage quality for [STORAGE_COMPRESS_LOSSY].
   */
  public open var lossyQuality: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGETEXTURE_GET_LOSSY_QUALITY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGETEXTURE_SET_LOSSY_QUALITY,
          NIL)
    }

  /**
   * The storage type (raw, lossy, or compressed).
   */
  public open var storage: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGETEXTURE_GET_STORAGE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGETEXTURE_SET_STORAGE, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_IMAGETEXTURE)
  }

  public open fun _reloadHook(rid: RID): Unit {
  }

  /**
   * Create a new [godot.ImageTexture] with `width` and `height`.
   *
   * `format` is a value from [enum Image.Format], `flags` is any combination of [enum Texture.Flags].
   */
  public open fun create(
    width: Long,
    height: Long,
    format: Long,
    flags: Long = 7
  ): Unit {
    TransferContext.writeArguments(LONG to width, LONG to height, LONG to format, LONG to flags)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGETEXTURE_CREATE, NIL)
  }

  /**
   * Initializes the texture by allocating and setting the data from an [godot.Image] with `flags` from [enum Texture.Flags]. An sRGB to linear color space conversion can take place, according to [enum Image.Format].
   */
  public open fun createFromImage(image: Image, flags: Long = 7): Unit {
    TransferContext.writeArguments(OBJECT to image, LONG to flags)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGETEXTURE_CREATE_FROM_IMAGE, NIL)
  }

  /**
   * Returns the format of the texture, one of [enum Image.Format].
   */
  public open fun getFormat(): Image.Format {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGETEXTURE_GET_FORMAT, LONG)
    return Image.Format.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Loads an image from a file path and creates a texture from it.
   *
   * **Note:** This method is deprecated and will be removed in Godot 4.0, use [godot.Image.load] and [createFromImage] instead.
   */
  public open fun load(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGETEXTURE_LOAD, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Replaces the texture's data with a new [godot.Image].
   *
   * **Note:** The texture has to be initialized first with the [createFromImage] method before it can be updated. The new image dimensions, format, and mipmaps configuration should match the existing texture's image configuration, otherwise it has to be re-created with the [createFromImage] method.
   *
   * Use this method over [createFromImage] if you need to update the texture frequently, which is faster than allocating additional memory for a new texture each time.
   */
  public open fun setData(image: Image): Unit {
    TransferContext.writeArguments(OBJECT to image)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGETEXTURE_SET_DATA, NIL)
  }

  /**
   * Resizes the texture to the specified dimensions.
   */
  public open fun setSizeOverride(size: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to size)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGETEXTURE_SET_SIZE_OVERRIDE, NIL)
  }

  public enum class Storage(
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
    STORAGE_COMPRESS_LOSSLESS(2),
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
     * [godot.Image] data is compressed with a lossless algorithm.
     */
    public final const val STORAGE_COMPRESS_LOSSLESS: Long = 2

    /**
     * [godot.Image] data is compressed with a lossy algorithm. You can set the storage quality with [lossyQuality].
     */
    public final const val STORAGE_COMPRESS_LOSSY: Long = 1

    /**
     * [godot.Image] data is stored raw and unaltered.
     */
    public final const val STORAGE_RAW: Long = 0
  }
}
