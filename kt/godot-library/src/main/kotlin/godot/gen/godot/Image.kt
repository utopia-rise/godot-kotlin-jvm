// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.Image
import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.Dictionary
import godot.core.GodotError
import godot.core.PoolByteArray
import godot.core.Rect2
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.POOL_BYTE_ARRAY
import godot.core.VariantType.RECT2
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Image datatype.
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/3.3/getting_started/workflow/assets/importing_images.html](https://docs.godotengine.org/en/3.3/getting_started/workflow/assets/importing_images.html)
 *
 * Native image datatype. Contains image data which can be converted to an [godot.ImageTexture] and provides commonly used *image processing* methods. The maximum width and height for an [godot.Image] are [MAX_WIDTH] and [MAX_HEIGHT].
 *
 * An [godot.Image] cannot be assigned to a `texture` property of an object directly (such as [godot.Sprite]), and has to be converted manually to an [godot.ImageTexture] first.
 *
 * **Note:** The maximum image size is 16384×16384 pixels due to graphics hardware limitations. Larger images may fail to import.
 */
@GodotBaseType
public open class Image : Resource() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_IMAGE)
  }

  public open fun _getData(): Dictionary<Any?, Any?> {
    throw NotImplementedError("_get_data is not implemented for Image")
  }

  public open fun _setData(`data`: Dictionary<Any?, Any?>): Unit {
  }

  /**
   * Alpha-blends `src_rect` from `src` image to this image at coordinates `dest`.
   */
  public open fun blendRect(
    src: Image,
    srcRect: Rect2,
    dst: Vector2
  ): Unit {
    TransferContext.writeArguments(OBJECT to src, RECT2 to srcRect, VECTOR2 to dst)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_BLEND_RECT, NIL)
  }

  /**
   * Alpha-blends `src_rect` from `src` image to this image using `mask` image at coordinates `dst`. Alpha channels are required for both `src` and `mask`. `dst` pixels and `src` pixels will blend if the corresponding mask pixel's alpha value is not 0. `src` image and `mask` image **must** have the same size (width and height) but they can have different formats.
   */
  public open fun blendRectMask(
    src: Image,
    mask: Image,
    srcRect: Rect2,
    dst: Vector2
  ): Unit {
    TransferContext.writeArguments(OBJECT to src, OBJECT to mask, RECT2 to srcRect, VECTOR2 to dst)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_BLEND_RECT_MASK, NIL)
  }

  /**
   * Copies `src_rect` from `src` image to this image at coordinates `dst`.
   */
  public open fun blitRect(
    src: Image,
    srcRect: Rect2,
    dst: Vector2
  ): Unit {
    TransferContext.writeArguments(OBJECT to src, RECT2 to srcRect, VECTOR2 to dst)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_BLIT_RECT, NIL)
  }

  /**
   * Blits `src_rect` area from `src` image to this image at the coordinates given by `dst`. `src` pixel is copied onto `dst` if the corresponding `mask` pixel's alpha value is not 0. `src` image and `mask` image **must** have the same size (width and height) but they can have different formats.
   */
  public open fun blitRectMask(
    src: Image,
    mask: Image,
    srcRect: Rect2,
    dst: Vector2
  ): Unit {
    TransferContext.writeArguments(OBJECT to src, OBJECT to mask, RECT2 to srcRect, VECTOR2 to dst)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_BLIT_RECT_MASK, NIL)
  }

  /**
   * Converts a bumpmap to a normalmap. A bumpmap provides a height offset per-pixel, while a normalmap provides a normal direction per pixel.
   */
  public open fun bumpmapToNormalmap(bumpScale: Double = 1.0): Unit {
    TransferContext.writeArguments(DOUBLE to bumpScale)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_BUMPMAP_TO_NORMALMAP, NIL)
  }

  /**
   * Removes the image's mipmaps.
   */
  public open fun clearMipmaps(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_CLEAR_MIPMAPS, NIL)
  }

  /**
   * Compresses the image to use less memory. Can not directly access pixel data while the image is compressed. Returns error if the chosen compression mode is not available. See [enum CompressMode] and [enum CompressSource] constants.
   */
  public open fun compress(
    mode: Long,
    source: Long,
    lossyQuality: Double
  ): GodotError {
    TransferContext.writeArguments(LONG to mode, LONG to source, DOUBLE to lossyQuality)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_COMPRESS, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Converts the image's format. See [enum Format] constants.
   */
  public open fun convert(format: Long): Unit {
    TransferContext.writeArguments(LONG to format)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_CONVERT, NIL)
  }

  /**
   * Copies `src` image to this image.
   */
  public open fun copyFrom(src: Image): Unit {
    TransferContext.writeArguments(OBJECT to src)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_COPY_FROM, NIL)
  }

  /**
   * Creates an empty image of given size and format. See [enum Format] constants. If `use_mipmaps` is `true` then generate mipmaps for this image. See the [generateMipmaps].
   */
  public open fun create(
    width: Long,
    height: Long,
    useMipmaps: Boolean,
    format: Long
  ): Unit {
    TransferContext.writeArguments(LONG to width, LONG to height, BOOL to useMipmaps, LONG to
        format)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_CREATE, NIL)
  }

  /**
   * Creates a new image of given size and format. See [enum Format] constants. Fills the image with the given raw data. If `use_mipmaps` is `true` then loads mipmaps for this image from `data`. See [generateMipmaps].
   */
  public open fun createFromData(
    width: Long,
    height: Long,
    useMipmaps: Boolean,
    format: Long,
    `data`: PoolByteArray
  ): Unit {
    TransferContext.writeArguments(LONG to width, LONG to height, BOOL to useMipmaps, LONG to
        format, POOL_BYTE_ARRAY to data)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_CREATE_FROM_DATA, NIL)
  }

  /**
   * Crops the image to the given `width` and `height`. If the specified size is larger than the current size, the extra area is filled with black pixels.
   */
  public open fun crop(width: Long, height: Long): Unit {
    TransferContext.writeArguments(LONG to width, LONG to height)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_CROP, NIL)
  }

  /**
   * Decompresses the image if it is compressed. Returns an error if decompress function is not available.
   */
  public open fun decompress(): GodotError {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_DECOMPRESS, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns [ALPHA_BLEND] if the image has data for alpha values. Returns [ALPHA_BIT] if all the alpha values are stored in a single bit. Returns [ALPHA_NONE] if no data for alpha values is found.
   */
  public open fun detectAlpha(): Image.AlphaMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_DETECT_ALPHA, LONG)
    return Image.AlphaMode.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Stretches the image and enlarges it by a factor of 2. No interpolation is done.
   */
  public open fun expandX2Hq2x(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_EXPAND_X2_HQ2X, NIL)
  }

  /**
   * Fills the image with a given [godot.core.Color].
   */
  public open fun fill(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_FILL, NIL)
  }

  /**
   * Blends low-alpha pixels with nearby pixels.
   */
  public open fun fixAlphaEdges(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_FIX_ALPHA_EDGES, NIL)
  }

  /**
   * Flips the image horizontally.
   */
  public open fun flipX(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_FLIP_X, NIL)
  }

  /**
   * Flips the image vertically.
   */
  public open fun flipY(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_FLIP_Y, NIL)
  }

  /**
   * Generates mipmaps for the image. Mipmaps are precalculated and lower resolution copies of the image. Mipmaps are automatically used if the image needs to be scaled down when rendered. This improves image quality and the performance of the rendering. Returns an error if the image is compressed, in a custom format or if the image's width/height is 0.
   */
  public open fun generateMipmaps(renormalize: Boolean = false): GodotError {
    TransferContext.writeArguments(BOOL to renormalize)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_GENERATE_MIPMAPS, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns a copy of the image's raw data.
   */
  public open fun getData(): PoolByteArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_GET_DATA, POOL_BYTE_ARRAY)
    return TransferContext.readReturnValue(POOL_BYTE_ARRAY, false) as PoolByteArray
  }

  /**
   * Returns the image's format. See [enum Format] constants.
   */
  public open fun getFormat(): Image.Format {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_GET_FORMAT, LONG)
    return Image.Format.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns the image's height.
   */
  public open fun getHeight(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_GET_HEIGHT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the offset where the image's mipmap with index `mipmap` is stored in the `data` dictionary.
   */
  public open fun getMipmapOffset(mipmap: Long): Long {
    TransferContext.writeArguments(LONG to mipmap)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_GET_MIPMAP_OFFSET, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the color of the pixel at `(x, y)` if the image is locked. If the image is unlocked, it always returns a [godot.core.Color] with the value `(0, 0, 0, 1.0)`. This is the same as [getPixelv], but two integer arguments instead of a Vector2 argument.
   */
  public open fun getPixel(x: Long, y: Long): Color {
    TransferContext.writeArguments(LONG to x, LONG to y)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_GET_PIXEL, COLOR)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  /**
   * Returns the color of the pixel at `src` if the image is locked. If the image is unlocked, it always returns a [godot.core.Color] with the value `(0, 0, 0, 1.0)`. This is the same as [getPixel], but with a Vector2 argument instead of two integer arguments.
   */
  public open fun getPixelv(src: Vector2): Color {
    TransferContext.writeArguments(VECTOR2 to src)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_GET_PIXELV, COLOR)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  /**
   * Returns a new image that is a copy of the image's area specified with `rect`.
   */
  public open fun getRect(rect: Rect2): Image? {
    TransferContext.writeArguments(RECT2 to rect)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_GET_RECT, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Image?
  }

  /**
   * Returns the image's size (width and height).
   */
  public open fun getSize(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_GET_SIZE, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns a [godot.core.Rect2] enclosing the visible portion of the image, considering each pixel with a non-zero alpha channel as visible.
   */
  public open fun getUsedRect(): Rect2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_GET_USED_RECT, RECT2)
    return TransferContext.readReturnValue(RECT2, false) as Rect2
  }

  /**
   * Returns the image's width.
   */
  public open fun getWidth(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_GET_WIDTH, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns `true` if the image has generated mipmaps.
   */
  public open fun hasMipmaps(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_HAS_MIPMAPS, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the image is compressed.
   */
  public open fun isCompressed(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_IS_COMPRESSED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the image has no data.
   */
  public open fun isEmpty(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_IS_EMPTY, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if all the image's pixels have an alpha value of 0. Returns `false` if any pixel has an alpha value higher than 0.
   */
  public open fun isInvisible(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_IS_INVISIBLE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Loads an image from file `path`. See [godot.Supported image formats](https://docs.godotengine.org/en/3.3/getting_started/workflow/assets/importing_images.html#supported-image-formats) for a list of supported image formats and limitations.
   *
   * **Warning:** This method should only be used in the editor or in cases when you need to load external images at run-time, such as images located at the `user://` directory, and may not work in exported projects.
   *
   * See also [godot.ImageTexture] description for usage examples.
   */
  public open fun load(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_LOAD, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Loads an image from the binary contents of a BMP file.
   *
   * **Note:** Godot's BMP module doesn't support 16-bit per pixel images. Only 1-bit, 4-bit, 8-bit, 24-bit, and 32-bit per pixel images are supported.
   */
  public open fun loadBmpFromBuffer(buffer: PoolByteArray): GodotError {
    TransferContext.writeArguments(POOL_BYTE_ARRAY to buffer)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_LOAD_BMP_FROM_BUFFER, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Loads an image from the binary contents of a JPEG file.
   */
  public open fun loadJpgFromBuffer(buffer: PoolByteArray): GodotError {
    TransferContext.writeArguments(POOL_BYTE_ARRAY to buffer)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_LOAD_JPG_FROM_BUFFER, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Loads an image from the binary contents of a PNG file.
   */
  public open fun loadPngFromBuffer(buffer: PoolByteArray): GodotError {
    TransferContext.writeArguments(POOL_BYTE_ARRAY to buffer)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_LOAD_PNG_FROM_BUFFER, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Loads an image from the binary contents of a TGA file.
   */
  public open fun loadTgaFromBuffer(buffer: PoolByteArray): GodotError {
    TransferContext.writeArguments(POOL_BYTE_ARRAY to buffer)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_LOAD_TGA_FROM_BUFFER, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Loads an image from the binary contents of a WebP file.
   */
  public open fun loadWebpFromBuffer(buffer: PoolByteArray): GodotError {
    TransferContext.writeArguments(POOL_BYTE_ARRAY to buffer)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_LOAD_WEBP_FROM_BUFFER, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Locks the data for reading and writing access. Sends an error to the console if the image is not locked when reading or writing a pixel.
   */
  public open fun lock(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_LOCK, NIL)
  }

  /**
   * Converts the image's data to represent coordinates on a 3D plane. This is used when the image represents a normalmap. A normalmap can add lots of detail to a 3D surface without increasing the polygon count.
   */
  public open fun normalmapToXy(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_NORMALMAP_TO_XY, NIL)
  }

  /**
   * Multiplies color values with alpha values. Resulting color values for a pixel are `(color * alpha)/256`.
   */
  public open fun premultiplyAlpha(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_PREMULTIPLY_ALPHA, NIL)
  }

  /**
   * Resizes the image to the given `width` and `height`. New pixels are calculated using the `interpolation` mode defined via [enum Interpolation] constants.
   */
  public open fun resize(
    width: Long,
    height: Long,
    interpolation: Long = 1
  ): Unit {
    TransferContext.writeArguments(LONG to width, LONG to height, LONG to interpolation)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_RESIZE, NIL)
  }

  /**
   * Resizes the image to the nearest power of 2 for the width and height. If `square` is `true` then set width and height to be the same. New pixels are calculated using the `interpolation` mode defined via [enum Interpolation] constants.
   */
  public open fun resizeToPo2(square: Boolean = false, interpolation: Long = 1): Unit {
    TransferContext.writeArguments(BOOL to square, LONG to interpolation)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_RESIZE_TO_PO2, NIL)
  }

  /**
   * Converts a standard RGBE (Red Green Blue Exponent) image to an sRGB image.
   */
  public open fun rgbeToSrgb(): Image? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_RGBE_TO_SRGB, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Image?
  }

  /**
   * Saves the image as an EXR file to `path`. If `grayscale` is `true` and the image has only one channel, it will be saved explicitly as monochrome rather than one red channel. This function will return [ERR_UNAVAILABLE] if Godot was compiled without the TinyEXR module.
   */
  public open fun saveExr(path: String, grayscale: Boolean = false): GodotError {
    TransferContext.writeArguments(STRING to path, BOOL to grayscale)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_SAVE_EXR, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Saves the image as a PNG file to `path`.
   */
  public open fun savePng(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_SAVE_PNG, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   *
   */
  public open fun savePngToBuffer(): PoolByteArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_SAVE_PNG_TO_BUFFER,
        POOL_BYTE_ARRAY)
    return TransferContext.readReturnValue(POOL_BYTE_ARRAY, false) as PoolByteArray
  }

  /**
   * Sets the [godot.core.Color] of the pixel at `(x, y)` if the image is locked. Example:
   *
   * ```
   * 				var img = Image.new()
   * 				img.create(img_width, img_height, false, Image.FORMAT_RGBA8)
   * 				img.lock()
   * 				img.set_pixel(x, y, color) # Works
   * 				img.unlock()
   * 				img.set_pixel(x, y, color) # Does not have an effect
   * 				```
   */
  public open fun setPixel(
    x: Long,
    y: Long,
    color: Color
  ): Unit {
    TransferContext.writeArguments(LONG to x, LONG to y, COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_SET_PIXEL, NIL)
  }

  /**
   * Sets the [godot.core.Color] of the pixel at `(dst.x, dst.y)` if the image is locked. Note that the `dst` values must be integers. Example:
   *
   * ```
   * 				var img = Image.new()
   * 				img.create(img_width, img_height, false, Image.FORMAT_RGBA8)
   * 				img.lock()
   * 				img.set_pixelv(Vector2(x, y), color) # Works
   * 				img.unlock()
   * 				img.set_pixelv(Vector2(x, y), color) # Does not have an effect
   * 				```
   */
  public open fun setPixelv(dst: Vector2, color: Color): Unit {
    TransferContext.writeArguments(VECTOR2 to dst, COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_SET_PIXELV, NIL)
  }

  /**
   * Shrinks the image by a factor of 2.
   */
  public open fun shrinkX2(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_SHRINK_X2, NIL)
  }

  /**
   * Converts the raw data from the sRGB colorspace to a linear scale.
   */
  public open fun srgbToLinear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_SRGB_TO_LINEAR, NIL)
  }

  /**
   * Unlocks the data and prevents changes.
   */
  public open fun unlock(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_UNLOCK, NIL)
  }

  public enum class AlphaMode(
    id: Long
  ) {
    /**
     * Image does not have alpha.
     */
    ALPHA_NONE(0),
    /**
     * Image stores alpha in a single bit.
     */
    ALPHA_BIT(1),
    /**
     * Image uses alpha.
     */
    ALPHA_BLEND(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class CompressSource(
    id: Long
  ) {
    /**
     * Source texture (before compression) is a regular texture. Default for all textures.
     */
    COMPRESS_SOURCE_GENERIC(0),
    /**
     * Source texture (before compression) is in sRGB space.
     */
    COMPRESS_SOURCE_SRGB(1),
    /**
     * Source texture (before compression) is a normal texture (e.g. it can be compressed into two channels).
     */
    COMPRESS_SOURCE_NORMAL(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class Interpolation(
    id: Long
  ) {
    /**
     * Performs nearest-neighbor interpolation. If the image is resized, it will be pixelated.
     */
    INTERPOLATE_NEAREST(0),
    /**
     * Performs bilinear interpolation. If the image is resized, it will be blurry. This mode is faster than [INTERPOLATE_CUBIC], but it results in lower quality.
     */
    INTERPOLATE_BILINEAR(1),
    /**
     * Performs cubic interpolation. If the image is resized, it will be blurry. This mode often gives better results compared to [INTERPOLATE_BILINEAR], at the cost of being slower.
     */
    INTERPOLATE_CUBIC(2),
    /**
     * Performs bilinear separately on the two most-suited mipmap levels, then linearly interpolates between them.
     *
     * It's slower than [INTERPOLATE_BILINEAR], but produces higher-quality results with much less aliasing artifacts.
     *
     * If the image does not have mipmaps, they will be generated and used internally, but no mipmaps will be generated on the resulting image.
     *
     * **Note:** If you intend to scale multiple copies of the original image, it's better to call [generateMipmaps]] on it in advance, to avoid wasting processing power in generating them again and again.
     *
     * On the other hand, if the image already has mipmaps, they will be used, and a new set will be generated for the resulting image.
     */
    INTERPOLATE_TRILINEAR(3),
    /**
     * Performs Lanczos interpolation. This is the slowest image resizing mode, but it typically gives the best results, especially when downscalng images.
     */
    INTERPOLATE_LANCZOS(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class CompressMode(
    id: Long
  ) {
    /**
     * Use S3TC compression.
     */
    COMPRESS_S3TC(0),
    /**
     * Use PVRTC2 compression.
     */
    COMPRESS_PVRTC2(1),
    /**
     * Use PVRTC4 compression.
     */
    COMPRESS_PVRTC4(2),
    /**
     * Use ETC compression.
     */
    COMPRESS_ETC(3),
    /**
     * Use ETC2 compression.
     */
    COMPRESS_ETC2(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class Format(
    id: Long
  ) {
    /**
     * Texture format with a single 8-bit depth representing luminance.
     */
    FORMAT_L8(0),
    /**
     * OpenGL texture format with two values, luminance and alpha each stored with 8 bits.
     */
    FORMAT_LA8(1),
    /**
     * OpenGL texture format `RED` with a single component and a bitdepth of 8.
     */
    FORMAT_R8(2),
    /**
     * OpenGL texture format `RG` with two components and a bitdepth of 8 for each.
     */
    FORMAT_RG8(3),
    /**
     * OpenGL texture format `RGB` with three components, each with a bitdepth of 8.
     *
     * **Note:** When creating an [godot.ImageTexture], an sRGB to linear color space conversion is performed.
     */
    FORMAT_RGB8(4),
    /**
     * OpenGL texture format `RGBA` with four components, each with a bitdepth of 8.
     *
     * **Note:** When creating an [godot.ImageTexture], an sRGB to linear color space conversion is performed.
     */
    FORMAT_RGBA8(5),
    /**
     * OpenGL texture format `RGBA` with four components, each with a bitdepth of 4.
     */
    FORMAT_RGBA4444(6),
    /**
     * OpenGL texture format `GL_RGB5_A1` where 5 bits of depth for each component of RGB and one bit for alpha.
     */
    FORMAT_RGBA5551(7),
    /**
     * OpenGL texture format `GL_R32F` where there's one component, a 32-bit floating-point value.
     */
    FORMAT_RF(8),
    /**
     * OpenGL texture format `GL_RG32F` where there are two components, each a 32-bit floating-point values.
     */
    FORMAT_RGF(9),
    /**
     * OpenGL texture format `GL_RGB32F` where there are three components, each a 32-bit floating-point values.
     */
    FORMAT_RGBF(10),
    /**
     * OpenGL texture format `GL_RGBA32F` where there are four components, each a 32-bit floating-point values.
     */
    FORMAT_RGBAF(11),
    /**
     * OpenGL texture format `GL_R32F` where there's one component, a 16-bit "half-precision" floating-point value.
     */
    FORMAT_RH(12),
    /**
     * OpenGL texture format `GL_RG32F` where there are two components, each a 16-bit "half-precision" floating-point value.
     */
    FORMAT_RGH(13),
    /**
     * OpenGL texture format `GL_RGB32F` where there are three components, each a 16-bit "half-precision" floating-point value.
     */
    FORMAT_RGBH(14),
    /**
     * OpenGL texture format `GL_RGBA32F` where there are four components, each a 16-bit "half-precision" floating-point value.
     */
    FORMAT_RGBAH(15),
    /**
     * A special OpenGL texture format where the three color components have 9 bits of precision and all three share a single 5-bit exponent.
     */
    FORMAT_RGBE9995(16),
    /**
     * The [godot.S3TC](https://en.wikipedia.org/wiki/S3_Texture_Compression) texture format that uses Block Compression 1, and is the smallest variation of S3TC, only providing 1 bit of alpha and color data being premultiplied with alpha.
     *
     * **Note:** When creating an [godot.ImageTexture], an sRGB to linear color space conversion is performed.
     */
    FORMAT_DXT1(17),
    /**
     * The [godot.S3TC](https://en.wikipedia.org/wiki/S3_Texture_Compression) texture format that uses Block Compression 2, and color data is interpreted as not having been premultiplied by alpha. Well suited for images with sharp alpha transitions between translucent and opaque areas.
     *
     * **Note:** When creating an [godot.ImageTexture], an sRGB to linear color space conversion is performed.
     */
    FORMAT_DXT3(18),
    /**
     * The [godot.S3TC](https://en.wikipedia.org/wiki/S3_Texture_Compression) texture format also known as Block Compression 3 or BC3 that contains 64 bits of alpha channel data followed by 64 bits of DXT1-encoded color data. Color data is not premultiplied by alpha, same as DXT3. DXT5 generally produces superior results for transparent gradients compared to DXT3.
     *
     * **Note:** When creating an [godot.ImageTexture], an sRGB to linear color space conversion is performed.
     */
    FORMAT_DXT5(19),
    /**
     * Texture format that uses [godot.Red Green Texture Compression](https://www.khronos.org/opengl/wiki/Red_Green_Texture_Compression), normalizing the red channel data using the same compression algorithm that DXT5 uses for the alpha channel.
     */
    FORMAT_RGTC_R(20),
    /**
     * Texture format that uses [godot.Red Green Texture Compression](https://www.khronos.org/opengl/wiki/Red_Green_Texture_Compression), normalizing the red and green channel data using the same compression algorithm that DXT5 uses for the alpha channel.
     */
    FORMAT_RGTC_RG(21),
    /**
     * Texture format that uses [BPTC](https://www.khronos.org/opengl/wiki/BPTC_Texture_Compression) compression with unsigned normalized RGBA components.
     *
     * **Note:** When creating an [godot.ImageTexture], an sRGB to linear color space conversion is performed.
     */
    FORMAT_BPTC_RGBA(22),
    /**
     * Texture format that uses [BPTC](https://www.khronos.org/opengl/wiki/BPTC_Texture_Compression) compression with signed floating-point RGB components.
     */
    FORMAT_BPTC_RGBF(23),
    /**
     * Texture format that uses [BPTC](https://www.khronos.org/opengl/wiki/BPTC_Texture_Compression) compression with unsigned floating-point RGB components.
     */
    FORMAT_BPTC_RGBFU(24),
    /**
     * Texture format used on PowerVR-supported mobile platforms, uses 2-bit color depth with no alpha. More information can be found [here](https://en.wikipedia.org/wiki/PVRTC).
     *
     * **Note:** When creating an [godot.ImageTexture], an sRGB to linear color space conversion is performed.
     */
    FORMAT_PVRTC2(25),
    /**
     * Same as [godot.PVRTC2](https://en.wikipedia.org/wiki/PVRTC), but with an alpha component.
     */
    FORMAT_PVRTC2A(26),
    /**
     * Similar to [godot.PVRTC2](https://en.wikipedia.org/wiki/PVRTC), but with 4-bit color depth and no alpha.
     */
    FORMAT_PVRTC4(27),
    /**
     * Same as [godot.PVRTC4](https://en.wikipedia.org/wiki/PVRTC), but with an alpha component.
     */
    FORMAT_PVRTC4A(28),
    /**
     * [godot.Ericsson Texture Compression format 1](https://en.wikipedia.org/wiki/Ericsson_Texture_Compression#ETC1), also referred to as "ETC1", and is part of the OpenGL ES graphics standard. This format cannot store an alpha channel.
     */
    FORMAT_ETC(29),
    /**
     * [godot.Ericsson Texture Compression format 2](https://en.wikipedia.org/wiki/Ericsson_Texture_Compression#ETC2_and_EAC) (`R11_EAC` variant), which provides one channel of unsigned data.
     */
    FORMAT_ETC2_R11(30),
    /**
     * [godot.Ericsson Texture Compression format 2](https://en.wikipedia.org/wiki/Ericsson_Texture_Compression#ETC2_and_EAC) (`SIGNED_R11_EAC` variant), which provides one channel of signed data.
     */
    FORMAT_ETC2_R11S(31),
    /**
     * [godot.Ericsson Texture Compression format 2](https://en.wikipedia.org/wiki/Ericsson_Texture_Compression#ETC2_and_EAC) (`RG11_EAC` variant), which provides two channels of unsigned data.
     */
    FORMAT_ETC2_RG11(32),
    /**
     * [godot.Ericsson Texture Compression format 2](https://en.wikipedia.org/wiki/Ericsson_Texture_Compression#ETC2_and_EAC) (`SIGNED_RG11_EAC` variant), which provides two channels of signed data.
     */
    FORMAT_ETC2_RG11S(33),
    /**
     * [godot.Ericsson Texture Compression format 2](https://en.wikipedia.org/wiki/Ericsson_Texture_Compression#ETC2_and_EAC) (`RGB8` variant), which is a follow-up of ETC1 and compresses RGB888 data.
     *
     * **Note:** When creating an [godot.ImageTexture], an sRGB to linear color space conversion is performed.
     */
    FORMAT_ETC2_RGB8(34),
    /**
     * [godot.Ericsson Texture Compression format 2](https://en.wikipedia.org/wiki/Ericsson_Texture_Compression#ETC2_and_EAC) (`RGBA8`variant), which compresses RGBA8888 data with full alpha support.
     *
     * **Note:** When creating an [godot.ImageTexture], an sRGB to linear color space conversion is performed.
     */
    FORMAT_ETC2_RGBA8(35),
    /**
     * [godot.Ericsson Texture Compression format 2](https://en.wikipedia.org/wiki/Ericsson_Texture_Compression#ETC2_and_EAC) (`RGB8_PUNCHTHROUGH_ALPHA1` variant), which compresses RGBA data to make alpha either fully transparent or fully opaque.
     *
     * **Note:** When creating an [godot.ImageTexture], an sRGB to linear color space conversion is performed.
     */
    FORMAT_ETC2_RGB8A1(36),
    /**
     * Represents the size of the [enum Format] enum.
     */
    FORMAT_MAX(37),
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
     * Image stores alpha in a single bit.
     */
    public final const val ALPHA_BIT: Long = 1

    /**
     * Image uses alpha.
     */
    public final const val ALPHA_BLEND: Long = 2

    /**
     * Image does not have alpha.
     */
    public final const val ALPHA_NONE: Long = 0

    /**
     * Use ETC compression.
     */
    public final const val COMPRESS_ETC: Long = 3

    /**
     * Use ETC2 compression.
     */
    public final const val COMPRESS_ETC2: Long = 4

    /**
     * Use PVRTC2 compression.
     */
    public final const val COMPRESS_PVRTC2: Long = 1

    /**
     * Use PVRTC4 compression.
     */
    public final const val COMPRESS_PVRTC4: Long = 2

    /**
     * Use S3TC compression.
     */
    public final const val COMPRESS_S3TC: Long = 0

    /**
     * Source texture (before compression) is a regular texture. Default for all textures.
     */
    public final const val COMPRESS_SOURCE_GENERIC: Long = 0

    /**
     * Source texture (before compression) is a normal texture (e.g. it can be compressed into two channels).
     */
    public final const val COMPRESS_SOURCE_NORMAL: Long = 2

    /**
     * Source texture (before compression) is in sRGB space.
     */
    public final const val COMPRESS_SOURCE_SRGB: Long = 1

    /**
     * Texture format that uses [BPTC](https://www.khronos.org/opengl/wiki/BPTC_Texture_Compression) compression with unsigned normalized RGBA components.
     *
     * **Note:** When creating an [godot.ImageTexture], an sRGB to linear color space conversion is performed.
     */
    public final const val FORMAT_BPTC_RGBA: Long = 22

    /**
     * Texture format that uses [BPTC](https://www.khronos.org/opengl/wiki/BPTC_Texture_Compression) compression with signed floating-point RGB components.
     */
    public final const val FORMAT_BPTC_RGBF: Long = 23

    /**
     * Texture format that uses [BPTC](https://www.khronos.org/opengl/wiki/BPTC_Texture_Compression) compression with unsigned floating-point RGB components.
     */
    public final const val FORMAT_BPTC_RGBFU: Long = 24

    /**
     * The [godot.S3TC](https://en.wikipedia.org/wiki/S3_Texture_Compression) texture format that uses Block Compression 1, and is the smallest variation of S3TC, only providing 1 bit of alpha and color data being premultiplied with alpha.
     *
     * **Note:** When creating an [godot.ImageTexture], an sRGB to linear color space conversion is performed.
     */
    public final const val FORMAT_DXT1: Long = 17

    /**
     * The [godot.S3TC](https://en.wikipedia.org/wiki/S3_Texture_Compression) texture format that uses Block Compression 2, and color data is interpreted as not having been premultiplied by alpha. Well suited for images with sharp alpha transitions between translucent and opaque areas.
     *
     * **Note:** When creating an [godot.ImageTexture], an sRGB to linear color space conversion is performed.
     */
    public final const val FORMAT_DXT3: Long = 18

    /**
     * The [godot.S3TC](https://en.wikipedia.org/wiki/S3_Texture_Compression) texture format also known as Block Compression 3 or BC3 that contains 64 bits of alpha channel data followed by 64 bits of DXT1-encoded color data. Color data is not premultiplied by alpha, same as DXT3. DXT5 generally produces superior results for transparent gradients compared to DXT3.
     *
     * **Note:** When creating an [godot.ImageTexture], an sRGB to linear color space conversion is performed.
     */
    public final const val FORMAT_DXT5: Long = 19

    /**
     * [godot.Ericsson Texture Compression format 1](https://en.wikipedia.org/wiki/Ericsson_Texture_Compression#ETC1), also referred to as "ETC1", and is part of the OpenGL ES graphics standard. This format cannot store an alpha channel.
     */
    public final const val FORMAT_ETC: Long = 29

    /**
     * [godot.Ericsson Texture Compression format 2](https://en.wikipedia.org/wiki/Ericsson_Texture_Compression#ETC2_and_EAC) (`R11_EAC` variant), which provides one channel of unsigned data.
     */
    public final const val FORMAT_ETC2_R11: Long = 30

    /**
     * [godot.Ericsson Texture Compression format 2](https://en.wikipedia.org/wiki/Ericsson_Texture_Compression#ETC2_and_EAC) (`SIGNED_R11_EAC` variant), which provides one channel of signed data.
     */
    public final const val FORMAT_ETC2_R11S: Long = 31

    /**
     * [godot.Ericsson Texture Compression format 2](https://en.wikipedia.org/wiki/Ericsson_Texture_Compression#ETC2_and_EAC) (`RG11_EAC` variant), which provides two channels of unsigned data.
     */
    public final const val FORMAT_ETC2_RG11: Long = 32

    /**
     * [godot.Ericsson Texture Compression format 2](https://en.wikipedia.org/wiki/Ericsson_Texture_Compression#ETC2_and_EAC) (`SIGNED_RG11_EAC` variant), which provides two channels of signed data.
     */
    public final const val FORMAT_ETC2_RG11S: Long = 33

    /**
     * [godot.Ericsson Texture Compression format 2](https://en.wikipedia.org/wiki/Ericsson_Texture_Compression#ETC2_and_EAC) (`RGB8` variant), which is a follow-up of ETC1 and compresses RGB888 data.
     *
     * **Note:** When creating an [godot.ImageTexture], an sRGB to linear color space conversion is performed.
     */
    public final const val FORMAT_ETC2_RGB8: Long = 34

    /**
     * [godot.Ericsson Texture Compression format 2](https://en.wikipedia.org/wiki/Ericsson_Texture_Compression#ETC2_and_EAC) (`RGB8_PUNCHTHROUGH_ALPHA1` variant), which compresses RGBA data to make alpha either fully transparent or fully opaque.
     *
     * **Note:** When creating an [godot.ImageTexture], an sRGB to linear color space conversion is performed.
     */
    public final const val FORMAT_ETC2_RGB8A1: Long = 36

    /**
     * [godot.Ericsson Texture Compression format 2](https://en.wikipedia.org/wiki/Ericsson_Texture_Compression#ETC2_and_EAC) (`RGBA8`variant), which compresses RGBA8888 data with full alpha support.
     *
     * **Note:** When creating an [godot.ImageTexture], an sRGB to linear color space conversion is performed.
     */
    public final const val FORMAT_ETC2_RGBA8: Long = 35

    /**
     * Texture format with a single 8-bit depth representing luminance.
     */
    public final const val FORMAT_L8: Long = 0

    /**
     * OpenGL texture format with two values, luminance and alpha each stored with 8 bits.
     */
    public final const val FORMAT_LA8: Long = 1

    /**
     * Represents the size of the [enum Format] enum.
     */
    public final const val FORMAT_MAX: Long = 37

    /**
     * Texture format used on PowerVR-supported mobile platforms, uses 2-bit color depth with no alpha. More information can be found [here](https://en.wikipedia.org/wiki/PVRTC).
     *
     * **Note:** When creating an [godot.ImageTexture], an sRGB to linear color space conversion is performed.
     */
    public final const val FORMAT_PVRTC2: Long = 25

    /**
     * Same as [godot.PVRTC2](https://en.wikipedia.org/wiki/PVRTC), but with an alpha component.
     */
    public final const val FORMAT_PVRTC2A: Long = 26

    /**
     * Similar to [godot.PVRTC2](https://en.wikipedia.org/wiki/PVRTC), but with 4-bit color depth and no alpha.
     */
    public final const val FORMAT_PVRTC4: Long = 27

    /**
     * Same as [godot.PVRTC4](https://en.wikipedia.org/wiki/PVRTC), but with an alpha component.
     */
    public final const val FORMAT_PVRTC4A: Long = 28

    /**
     * OpenGL texture format `RED` with a single component and a bitdepth of 8.
     */
    public final const val FORMAT_R8: Long = 2

    /**
     * OpenGL texture format `GL_R32F` where there's one component, a 32-bit floating-point value.
     */
    public final const val FORMAT_RF: Long = 8

    /**
     * OpenGL texture format `RG` with two components and a bitdepth of 8 for each.
     */
    public final const val FORMAT_RG8: Long = 3

    /**
     * OpenGL texture format `RGB` with three components, each with a bitdepth of 8.
     *
     * **Note:** When creating an [godot.ImageTexture], an sRGB to linear color space conversion is performed.
     */
    public final const val FORMAT_RGB8: Long = 4

    /**
     * OpenGL texture format `RGBA` with four components, each with a bitdepth of 4.
     */
    public final const val FORMAT_RGBA4444: Long = 6

    /**
     * OpenGL texture format `GL_RGB5_A1` where 5 bits of depth for each component of RGB and one bit for alpha.
     */
    public final const val FORMAT_RGBA5551: Long = 7

    /**
     * OpenGL texture format `RGBA` with four components, each with a bitdepth of 8.
     *
     * **Note:** When creating an [godot.ImageTexture], an sRGB to linear color space conversion is performed.
     */
    public final const val FORMAT_RGBA8: Long = 5

    /**
     * OpenGL texture format `GL_RGBA32F` where there are four components, each a 32-bit floating-point values.
     */
    public final const val FORMAT_RGBAF: Long = 11

    /**
     * OpenGL texture format `GL_RGBA32F` where there are four components, each a 16-bit "half-precision" floating-point value.
     */
    public final const val FORMAT_RGBAH: Long = 15

    /**
     * A special OpenGL texture format where the three color components have 9 bits of precision and all three share a single 5-bit exponent.
     */
    public final const val FORMAT_RGBE9995: Long = 16

    /**
     * OpenGL texture format `GL_RGB32F` where there are three components, each a 32-bit floating-point values.
     */
    public final const val FORMAT_RGBF: Long = 10

    /**
     * OpenGL texture format `GL_RGB32F` where there are three components, each a 16-bit "half-precision" floating-point value.
     */
    public final const val FORMAT_RGBH: Long = 14

    /**
     * OpenGL texture format `GL_RG32F` where there are two components, each a 32-bit floating-point values.
     */
    public final const val FORMAT_RGF: Long = 9

    /**
     * OpenGL texture format `GL_RG32F` where there are two components, each a 16-bit "half-precision" floating-point value.
     */
    public final const val FORMAT_RGH: Long = 13

    /**
     * Texture format that uses [godot.Red Green Texture Compression](https://www.khronos.org/opengl/wiki/Red_Green_Texture_Compression), normalizing the red channel data using the same compression algorithm that DXT5 uses for the alpha channel.
     */
    public final const val FORMAT_RGTC_R: Long = 20

    /**
     * Texture format that uses [godot.Red Green Texture Compression](https://www.khronos.org/opengl/wiki/Red_Green_Texture_Compression), normalizing the red and green channel data using the same compression algorithm that DXT5 uses for the alpha channel.
     */
    public final const val FORMAT_RGTC_RG: Long = 21

    /**
     * OpenGL texture format `GL_R32F` where there's one component, a 16-bit "half-precision" floating-point value.
     */
    public final const val FORMAT_RH: Long = 12

    /**
     * Performs bilinear interpolation. If the image is resized, it will be blurry. This mode is faster than [INTERPOLATE_CUBIC], but it results in lower quality.
     */
    public final const val INTERPOLATE_BILINEAR: Long = 1

    /**
     * Performs cubic interpolation. If the image is resized, it will be blurry. This mode often gives better results compared to [INTERPOLATE_BILINEAR], at the cost of being slower.
     */
    public final const val INTERPOLATE_CUBIC: Long = 2

    /**
     * Performs Lanczos interpolation. This is the slowest image resizing mode, but it typically gives the best results, especially when downscalng images.
     */
    public final const val INTERPOLATE_LANCZOS: Long = 4

    /**
     * Performs nearest-neighbor interpolation. If the image is resized, it will be pixelated.
     */
    public final const val INTERPOLATE_NEAREST: Long = 0

    /**
     * Performs bilinear separately on the two most-suited mipmap levels, then linearly interpolates between them.
     *
     * It's slower than [INTERPOLATE_BILINEAR], but produces higher-quality results with much less aliasing artifacts.
     *
     * If the image does not have mipmaps, they will be generated and used internally, but no mipmaps will be generated on the resulting image.
     *
     * **Note:** If you intend to scale multiple copies of the original image, it's better to call [generateMipmaps]] on it in advance, to avoid wasting processing power in generating them again and again.
     *
     * On the other hand, if the image already has mipmaps, they will be used, and a new set will be generated for the resulting image.
     */
    public final const val INTERPOLATE_TRILINEAR: Long = 3

    /**
     * The maximal height allowed for [godot.Image] resources.
     */
    public final const val MAX_HEIGHT: Long = 16384

    /**
     * The maximal width allowed for [godot.Image] resources.
     */
    public final const val MAX_WIDTH: Long = 16384
  }
}
