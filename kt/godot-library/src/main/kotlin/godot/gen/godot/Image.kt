// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.Image
import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.Dictionary
import godot.core.GodotError
import godot.core.PackedByteArray
import godot.core.Rect2
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_BYTE_ARRAY
import godot.core.VariantType.RECT2
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR2
import godot.core.VariantType.VECTOR2I
import godot.core.Vector2
import godot.core.Vector2i
import godot.core.memory.TransferContext
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Image datatype.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/assets_pipeline/importing_images.html]($DOCS_URL/tutorials/assets_pipeline/importing_images.html)
 *
 * Native image datatype. Contains image data which can be converted to an [godot.ImageTexture] and provides commonly used *image processing* methods. The maximum width and height for an [godot.Image] are [MAX_WIDTH] and [MAX_HEIGHT].
 *
 * An [godot.Image] cannot be assigned to a `texture` property of an object directly (such as [godot.Sprite2D]), and has to be converted manually to an [godot.ImageTexture] first.
 *
 * **Note:** The maximum image size is 16384×16384 pixels due to graphics hardware limitations. Larger images may fail to import.
 */
@GodotBaseType
public open class Image : Resource() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_IMAGE, scriptIndex)
    return true
  }

  /**
   * Returns the image's width.
   */
  public fun getWidth(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_GET_WIDTH, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the image's height.
   */
  public fun getHeight(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_GET_HEIGHT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the image's size (width and height).
   */
  public fun getSize(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_GET_SIZE, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns `true` if the image has generated mipmaps.
   */
  public fun hasMipmaps(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_HAS_MIPMAPS, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the image's format. See [enum Format] constants.
   */
  public fun getFormat(): Image.Format {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_GET_FORMAT, LONG)
    return Image.Format.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns a copy of the image's raw data.
   */
  public fun getData(): PackedByteArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_GET_DATA, PACKED_BYTE_ARRAY)
    return TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray
  }

  /**
   * Converts the image's format. See [enum Format] constants.
   */
  public fun convert(format: Image.Format): Unit {
    TransferContext.writeArguments(LONG to format.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_CONVERT, NIL)
  }

  /**
   * Returns the offset where the image's mipmap with index [mipmap] is stored in the `data` dictionary.
   */
  public fun getMipmapOffset(mipmap: Long): Long {
    TransferContext.writeArguments(LONG to mipmap)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_GET_MIPMAP_OFFSET, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Resizes the image to the nearest power of 2 for the width and height. If [square] is `true` then set width and height to be the same. New pixels are calculated using the [interpolation] mode defined via [enum Interpolation] constants.
   */
  public fun resizeToPo2(square: Boolean = false, interpolation: Image.Interpolation =
      Image.Interpolation.INTERPOLATE_BILINEAR): Unit {
    TransferContext.writeArguments(BOOL to square, LONG to interpolation.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_RESIZE_TO_PO2, NIL)
  }

  /**
   * Resizes the image to the given [width] and [height]. New pixels are calculated using the [interpolation] mode defined via [enum Interpolation] constants.
   */
  public fun resize(
    width: Long,
    height: Long,
    interpolation: Image.Interpolation = Image.Interpolation.INTERPOLATE_BILINEAR
  ): Unit {
    TransferContext.writeArguments(LONG to width, LONG to height, LONG to interpolation.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_RESIZE, NIL)
  }

  /**
   * Shrinks the image by a factor of 2.
   */
  public fun shrinkX2(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_SHRINK_X2, NIL)
  }

  /**
   * Crops the image to the given [width] and [height]. If the specified size is larger than the current size, the extra area is filled with black pixels.
   */
  public fun crop(width: Long, height: Long): Unit {
    TransferContext.writeArguments(LONG to width, LONG to height)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_CROP, NIL)
  }

  /**
   * Flips the image horizontally.
   */
  public fun flipX(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_FLIP_X, NIL)
  }

  /**
   * Flips the image vertically.
   */
  public fun flipY(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_FLIP_Y, NIL)
  }

  /**
   * Generates mipmaps for the image. Mipmaps are precalculated lower-resolution copies of the image that are automatically used if the image needs to be scaled down when rendered. They help improve image quality and performance when rendering. This method returns an error if the image is compressed, in a custom format, or if the image's width/height is `0`.
   */
  public fun generateMipmaps(renormalize: Boolean = false): GodotError {
    TransferContext.writeArguments(BOOL to renormalize)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_GENERATE_MIPMAPS, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Removes the image's mipmaps.
   */
  public fun clearMipmaps(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_CLEAR_MIPMAPS, NIL)
  }

  /**
   * Creates an empty image of given size and format. See [enum Format] constants. If [useMipmaps] is `true`, then generate mipmaps for this image. See the [generateMipmaps].
   */
  public fun create(
    width: Long,
    height: Long,
    useMipmaps: Boolean,
    format: Image.Format
  ): Unit {
    TransferContext.writeArguments(LONG to width, LONG to height, BOOL to useMipmaps, LONG to format.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_CREATE, NIL)
  }

  /**
   * Creates a new image of given size and format. See [enum Format] constants. Fills the image with the given raw data. If [useMipmaps] is `true` then loads mipmaps for this image from [data]. See [generateMipmaps].
   */
  public fun createFromData(
    width: Long,
    height: Long,
    useMipmaps: Boolean,
    format: Image.Format,
    `data`: PackedByteArray
  ): Unit {
    TransferContext.writeArguments(LONG to width, LONG to height, BOOL to useMipmaps, LONG to format.id, PACKED_BYTE_ARRAY to data)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_CREATE_FROM_DATA, NIL)
  }

  /**
   * Returns `true` if the image has no data.
   */
  public fun isEmpty(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_IS_EMPTY, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Loads an image from file [path]. See [godot.Supported image formats]($DOCS_URL/tutorials/assets_pipeline/importing_images.html#supported-image-formats) for a list of supported image formats and limitations.
   *
   * **Warning:** This method should only be used in the editor or in cases when you need to load external images at run-time, such as images located at the `user://` directory, and may not work in exported projects.
   *
   * See also [godot.ImageTexture] description for usage examples.
   */
  public fun load(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_LOAD, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Saves the image as a PNG file to the file at [path].
   */
  public fun savePng(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_SAVE_PNG, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Saves the image as a PNG file to a byte array.
   */
  public fun savePngToBuffer(): PackedByteArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_SAVE_PNG_TO_BUFFER,
        PACKED_BYTE_ARRAY)
    return TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray
  }

  /**
   * Saves the image as an EXR file to [path]. If [grayscale] is `true` and the image has only one channel, it will be saved explicitly as monochrome rather than one red channel. This function will return [ERR_UNAVAILABLE] if Godot was compiled without the TinyEXR module.
   *
   * **Note:** The TinyEXR module is disabled in non-editor builds, which means [saveExr] will return [ERR_UNAVAILABLE] when it is called from an exported project.
   */
  public fun saveExr(path: String, grayscale: Boolean = false): GodotError {
    TransferContext.writeArguments(STRING to path, BOOL to grayscale)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_SAVE_EXR, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns [ALPHA_BLEND] if the image has data for alpha values. Returns [ALPHA_BIT] if all the alpha values are stored in a single bit. Returns [ALPHA_NONE] if no data for alpha values is found.
   */
  public fun detectAlpha(): Image.AlphaMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_DETECT_ALPHA, LONG)
    return Image.AlphaMode.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns `true` if all the image's pixels have an alpha value of 0. Returns `false` if any pixel has an alpha value higher than 0.
   */
  public fun isInvisible(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_IS_INVISIBLE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   *
   */
  public fun detectUsedChannels(source: Image.CompressSource =
      Image.CompressSource.COMPRESS_SOURCE_GENERIC): Image.UsedChannels {
    TransferContext.writeArguments(LONG to source.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_DETECT_USED_CHANNELS, LONG)
    return Image.UsedChannels.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Compresses the image to use less memory. Can not directly access pixel data while the image is compressed. Returns error if the chosen compression mode is not available. See [enum CompressMode] and [enum CompressSource] constants.
   */
  public fun compress(
    mode: Image.CompressMode,
    source: Image.CompressSource = Image.CompressSource.COMPRESS_SOURCE_GENERIC,
    lossyQuality: Double = 0.7
  ): GodotError {
    TransferContext.writeArguments(LONG to mode.id, LONG to source.id, DOUBLE to lossyQuality)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_COMPRESS, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   *
   */
  public fun compressFromChannels(
    mode: Image.CompressMode,
    channels: Image.UsedChannels,
    lossyQuality: Double = 0.7
  ): GodotError {
    TransferContext.writeArguments(LONG to mode.id, LONG to channels.id, DOUBLE to lossyQuality)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_COMPRESS_FROM_CHANNELS, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Decompresses the image if it is VRAM compressed in a supported format. Returns [OK] if the format is supported, otherwise [ERR_UNAVAILABLE].
   *
   * **Note:** The following formats can be decompressed: DXT, RGTC, BPTC. The formats ETC1 and ETC2 are not supported.
   */
  public fun decompress(): GodotError {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_DECOMPRESS, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns `true` if the image is compressed.
   */
  public fun isCompressed(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_IS_COMPRESSED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Blends low-alpha pixels with nearby pixels.
   */
  public fun fixAlphaEdges(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_FIX_ALPHA_EDGES, NIL)
  }

  /**
   * Multiplies color values with alpha values. Resulting color values for a pixel are `(color * alpha)/256`.
   */
  public fun premultiplyAlpha(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_PREMULTIPLY_ALPHA, NIL)
  }

  /**
   * Converts the raw data from the sRGB colorspace to a linear scale.
   */
  public fun srgbToLinear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_SRGB_TO_LINEAR, NIL)
  }

  /**
   * Converts the image's data to represent coordinates on a 3D plane. This is used when the image represents a normal map. A normal map can add lots of detail to a 3D surface without increasing the polygon count.
   */
  public fun normalMapToXy(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_NORMAL_MAP_TO_XY, NIL)
  }

  /**
   * Converts a standard RGBE (Red Green Blue Exponent) image to an sRGB image.
   */
  public fun rgbeToSrgb(): Image? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_RGBE_TO_SRGB, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Image?
  }

  /**
   * Converts a bump map to a normal map. A bump map provides a height offset per-pixel, while a normal map provides a normal direction per pixel.
   */
  public fun bumpMapToNormalMap(bumpScale: Double = 1.0): Unit {
    TransferContext.writeArguments(DOUBLE to bumpScale)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_BUMP_MAP_TO_NORMAL_MAP, NIL)
  }

  /**
   * Compute image metrics on the current image and the compared image.
   *
   * The dictionary contains `max`, `mean`, `mean_squared`, `root_mean_squared` and `peak_snr`.
   */
  public fun computeImageMetrics(comparedImage: Image, useLuma: Boolean): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(OBJECT to comparedImage, BOOL to useLuma)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_COMPUTE_IMAGE_METRICS,
        DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  /**
   * Copies [srcRect] from [src] image to this image at coordinates [dst], clipped accordingly to both image bounds. This image and [src] image **must** have the same format. [srcRect] with non-positive size is treated as empty.
   */
  public fun blitRect(
    src: Image,
    srcRect: Rect2,
    dst: Vector2
  ): Unit {
    TransferContext.writeArguments(OBJECT to src, RECT2 to srcRect, VECTOR2 to dst)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_BLIT_RECT, NIL)
  }

  /**
   * Blits [srcRect] area from [src] image to this image at the coordinates given by [dst], clipped accordingly to both image bounds. [src] pixel is copied onto [dst] if the corresponding [mask] pixel's alpha value is not 0. This image and [src] image **must** have the same format. [src] image and [mask] image **must** have the same size (width and height) but they can have different formats. [srcRect] with non-positive size is treated as empty.
   */
  public fun blitRectMask(
    src: Image,
    mask: Image,
    srcRect: Rect2,
    dst: Vector2
  ): Unit {
    TransferContext.writeArguments(OBJECT to src, OBJECT to mask, RECT2 to srcRect, VECTOR2 to dst)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_BLIT_RECT_MASK, NIL)
  }

  /**
   * Alpha-blends [srcRect] from [src] image to this image at coordinates [dst], clipped accordingly to both image bounds. This image and [src] image **must** have the same format. [srcRect] with non-positive size is treated as empty.
   */
  public fun blendRect(
    src: Image,
    srcRect: Rect2,
    dst: Vector2
  ): Unit {
    TransferContext.writeArguments(OBJECT to src, RECT2 to srcRect, VECTOR2 to dst)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_BLEND_RECT, NIL)
  }

  /**
   * Alpha-blends [srcRect] from [src] image to this image using [mask] image at coordinates [dst], clipped accordingly to both image bounds. Alpha channels are required for both [src] and [mask]. [dst] pixels and [src] pixels will blend if the corresponding mask pixel's alpha value is not 0. This image and [src] image **must** have the same format. [src] image and [mask] image **must** have the same size (width and height) but they can have different formats. [srcRect] with non-positive size is treated as empty.
   */
  public fun blendRectMask(
    src: Image,
    mask: Image,
    srcRect: Rect2,
    dst: Vector2
  ): Unit {
    TransferContext.writeArguments(OBJECT to src, OBJECT to mask, RECT2 to srcRect, VECTOR2 to dst)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_BLEND_RECT_MASK, NIL)
  }

  /**
   * Fills the image with [color].
   */
  public fun fill(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_FILL, NIL)
  }

  /**
   * Fills [rect] with [color].
   */
  public fun fillRect(rect: Rect2, color: Color): Unit {
    TransferContext.writeArguments(RECT2 to rect, COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_FILL_RECT, NIL)
  }

  /**
   * Returns a [godot.Rect2i] enclosing the visible portion of the image, considering each pixel with a non-zero alpha channel as visible.
   */
  public fun getUsedRect(): Rect2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_GET_USED_RECT, RECT2)
    return TransferContext.readReturnValue(RECT2, false) as Rect2
  }

  public fun getRect(rect: Rect2): Image? {
    TransferContext.writeArguments(RECT2 to rect)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_GET_RECT, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Image?
  }

  /**
   * Copies [src] image to this image.
   */
  public fun copyFrom(src: Image): Unit {
    TransferContext.writeArguments(OBJECT to src)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_COPY_FROM, NIL)
  }

  /**
   * Returns the color of the pixel at [point].
   *
   * This is the same as [getPixel], but with a [godot.Vector2i] argument instead of two integer arguments.
   */
  public fun getPixelv(point: Vector2i): Color {
    TransferContext.writeArguments(VECTOR2I to point)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_GET_PIXELV, COLOR)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  /**
   * Returns the color of the pixel at `(x, y)`.
   *
   * This is the same as [getPixelv], but with two integer arguments instead of a [godot.Vector2i] argument.
   */
  public fun getPixel(x: Long, y: Long): Color {
    TransferContext.writeArguments(LONG to x, LONG to y)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_GET_PIXEL, COLOR)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  /**
   * Sets the [godot.core.Color] of the pixel at [point] to [color].
   *
   * **Example:**
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * var img_width = 10
   *
   * var img_height = 5
   *
   * var img = Image.new()
   *
   * img.create(img_width, img_height, false, Image.FORMAT_RGBA8)
   *
   *
   *
   * img.set_pixelv(Vector2i(1, 2), Color.red) # Sets the color at (1, 2) to red.
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * int imgWidth = 10;
   *
   * int imgHeight = 5;
   *
   * var img = new Image();
   *
   * img.Create(imgWidth, imgHeight, false, Image.Format.Rgba8);
   *
   *
   *
   * img.SetPixelv(new Vector2i(1, 2), Colors.Red); // Sets the color at (1, 2) to red.
   *
   * [/csharp]
   *
   * [/codeblocks]
   *
   * This is the same as [setPixel], but with a [godot.Vector2i] argument instead of two integer arguments.
   */
  public fun setPixelv(point: Vector2i, color: Color): Unit {
    TransferContext.writeArguments(VECTOR2I to point, COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_SET_PIXELV, NIL)
  }

  /**
   * Sets the [godot.core.Color] of the pixel at `(x, y)` to [color].
   *
   * **Example:**
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * var img_width = 10
   *
   * var img_height = 5
   *
   * var img = Image.new()
   *
   * img.create(img_width, img_height, false, Image.FORMAT_RGBA8)
   *
   *
   *
   * img.set_pixel(1, 2, Color.red) # Sets the color at (1, 2) to red.
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * int imgWidth = 10;
   *
   * int imgHeight = 5;
   *
   * var img = new Image();
   *
   * img.Create(imgWidth, imgHeight, false, Image.Format.Rgba8);
   *
   *
   *
   * img.SetPixel(1, 2, Colors.Red); // Sets the color at (1, 2) to red.
   *
   * [/csharp]
   *
   * [/codeblocks]
   *
   * This is the same as [setPixelv], but with a two integer arguments instead of a [godot.Vector2i] argument.
   */
  public fun setPixel(
    x: Long,
    y: Long,
    color: Color
  ): Unit {
    TransferContext.writeArguments(LONG to x, LONG to y, COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_SET_PIXEL, NIL)
  }

  /**
   *
   */
  public fun adjustBcs(
    brightness: Double,
    contrast: Double,
    saturation: Double
  ): Unit {
    TransferContext.writeArguments(DOUBLE to brightness, DOUBLE to contrast, DOUBLE to saturation)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_ADJUST_BCS, NIL)
  }

  /**
   * Loads an image from the binary contents of a PNG file.
   */
  public fun loadPngFromBuffer(buffer: PackedByteArray): GodotError {
    TransferContext.writeArguments(PACKED_BYTE_ARRAY to buffer)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_LOAD_PNG_FROM_BUFFER, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Loads an image from the binary contents of a JPEG file.
   */
  public fun loadJpgFromBuffer(buffer: PackedByteArray): GodotError {
    TransferContext.writeArguments(PACKED_BYTE_ARRAY to buffer)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_LOAD_JPG_FROM_BUFFER, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Loads an image from the binary contents of a WebP file.
   */
  public fun loadWebpFromBuffer(buffer: PackedByteArray): GodotError {
    TransferContext.writeArguments(PACKED_BYTE_ARRAY to buffer)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_LOAD_WEBP_FROM_BUFFER, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Loads an image from the binary contents of a TGA file.
   */
  public fun loadTgaFromBuffer(buffer: PackedByteArray): GodotError {
    TransferContext.writeArguments(PACKED_BYTE_ARRAY to buffer)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_LOAD_TGA_FROM_BUFFER, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Loads an image from the binary contents of a BMP file.
   *
   * **Note:** Godot's BMP module doesn't support 16-bit per pixel images. Only 1-bit, 4-bit, 8-bit, 24-bit, and 32-bit per pixel images are supported.
   */
  public fun loadBmpFromBuffer(buffer: PackedByteArray): GodotError {
    TransferContext.writeArguments(PACKED_BYTE_ARRAY to buffer)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_LOAD_BMP_FROM_BUFFER, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
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

  public enum class UsedChannels(
    id: Long
  ) {
    /**
     *
     */
    USED_CHANNELS_L(0),
    /**
     *
     */
    USED_CHANNELS_LA(1),
    /**
     *
     */
    USED_CHANNELS_R(2),
    /**
     *
     */
    USED_CHANNELS_RG(3),
    /**
     *
     */
    USED_CHANNELS_RGB(4),
    /**
     *
     */
    USED_CHANNELS_RGBA(5),
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
     * It's slower than [INTERPOLATE_BILINEAR], but produces higher-quality results with far fewer aliasing artifacts.
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
     * Use ETC compression.
     */
    COMPRESS_ETC(1),
    /**
     * Use ETC2 compression.
     */
    COMPRESS_ETC2(2),
    /**
     * Use BPTC compression.
     */
    COMPRESS_BPTC(3),
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
     *
     */
    FORMAT_RGB565(7),
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
     * [godot.Ericsson Texture Compression format 1](https://en.wikipedia.org/wiki/Ericsson_Texture_Compression#ETC1), also referred to as "ETC1", and is part of the OpenGL ES graphics standard. This format cannot store an alpha channel.
     */
    FORMAT_ETC(25),
    /**
     * [godot.Ericsson Texture Compression format 2](https://en.wikipedia.org/wiki/Ericsson_Texture_Compression#ETC2_and_EAC) (`R11_EAC` variant), which provides one channel of unsigned data.
     */
    FORMAT_ETC2_R11(26),
    /**
     * [godot.Ericsson Texture Compression format 2](https://en.wikipedia.org/wiki/Ericsson_Texture_Compression#ETC2_and_EAC) (`SIGNED_R11_EAC` variant), which provides one channel of signed data.
     */
    FORMAT_ETC2_R11S(27),
    /**
     * [godot.Ericsson Texture Compression format 2](https://en.wikipedia.org/wiki/Ericsson_Texture_Compression#ETC2_and_EAC) (`RG11_EAC` variant), which provides two channels of unsigned data.
     */
    FORMAT_ETC2_RG11(28),
    /**
     * [godot.Ericsson Texture Compression format 2](https://en.wikipedia.org/wiki/Ericsson_Texture_Compression#ETC2_and_EAC) (`SIGNED_RG11_EAC` variant), which provides two channels of signed data.
     */
    FORMAT_ETC2_RG11S(29),
    /**
     * [godot.Ericsson Texture Compression format 2](https://en.wikipedia.org/wiki/Ericsson_Texture_Compression#ETC2_and_EAC) (`RGB8` variant), which is a follow-up of ETC1 and compresses RGB888 data.
     *
     * **Note:** When creating an [godot.ImageTexture], an sRGB to linear color space conversion is performed.
     */
    FORMAT_ETC2_RGB8(30),
    /**
     * [godot.Ericsson Texture Compression format 2](https://en.wikipedia.org/wiki/Ericsson_Texture_Compression#ETC2_and_EAC) (`RGBA8`variant), which compresses RGBA8888 data with full alpha support.
     *
     * **Note:** When creating an [godot.ImageTexture], an sRGB to linear color space conversion is performed.
     */
    FORMAT_ETC2_RGBA8(31),
    /**
     * [godot.Ericsson Texture Compression format 2](https://en.wikipedia.org/wiki/Ericsson_Texture_Compression#ETC2_and_EAC) (`RGB8_PUNCHTHROUGH_ALPHA1` variant), which compresses RGBA data to make alpha either fully transparent or fully opaque.
     *
     * **Note:** When creating an [godot.ImageTexture], an sRGB to linear color space conversion is performed.
     */
    FORMAT_ETC2_RGB8A1(32),
    /**
     *
     */
    FORMAT_ETC2_RA_AS_RG(33),
    /**
     *
     */
    FORMAT_DXT5_RA_AS_RG(34),
    /**
     * Represents the size of the [enum Format] enum.
     */
    FORMAT_MAX(35),
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
     * The maximal width allowed for [godot.Image] resources.
     */
    public final const val MAX_WIDTH: Long = 16777216

    /**
     * The maximal height allowed for [godot.Image] resources.
     */
    public final const val MAX_HEIGHT: Long = 16777216
  }
}
