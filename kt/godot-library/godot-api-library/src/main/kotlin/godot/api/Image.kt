// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.ClockDirection
import godot.core.Color
import godot.core.Dictionary
import godot.core.Error
import godot.core.PackedByteArray
import godot.core.Rect2i
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.COLOR
import godot.core.VariantParser.DICTIONARY
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_BYTE_ARRAY
import godot.core.VariantParser.RECT2I
import godot.core.VariantParser.STRING
import godot.core.VariantParser.VECTOR2I
import godot.core.Vector2i
import kotlin.Any
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

/**
 * Native image datatype. Contains image data which can be converted to an [ImageTexture] and
 * provides commonly used *image processing* methods. The maximum width and height for an [Image] are
 * [MAX_WIDTH] and [MAX_HEIGHT].
 * An [Image] cannot be assigned to a texture property of an object directly (such as
 * [Sprite2D.texture]), and has to be converted manually to an [ImageTexture] first.
 * **Note:** The maximum image size is 16384×16384 pixels due to graphics hardware limitations.
 * Larger images may fail to import.
 */
@GodotBaseType
public open class Image : Resource() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(282, scriptIndex)
  }

  /**
   * Returns the image's width.
   */
  public final fun getWidth(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getWidthPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the image's height.
   */
  public final fun getHeight(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getHeightPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the image's size (width and height).
   */
  public final fun getSize(): Vector2i {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSizePtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I) as Vector2i)
  }

  /**
   * Returns `true` if the image has generated mipmaps.
   */
  public final fun hasMipmaps(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.hasMipmapsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the image's format. See [Format] constants.
   */
  public final fun getFormat(): Format {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFormatPtr, LONG)
    return Image.Format.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns a copy of the image's raw data.
   */
  public final fun getData(): PackedByteArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDataPtr, PACKED_BYTE_ARRAY)
    return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY) as PackedByteArray)
  }

  /**
   * Returns size (in bytes) of the image's raw data.
   */
  public final fun getDataSize(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDataSizePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Converts the image's format. See [Format] constants.
   */
  public final fun convert(format: Format): Unit {
    TransferContext.writeArguments(LONG to format.id)
    TransferContext.callMethod(ptr, MethodBindings.convertPtr, NIL)
  }

  /**
   * Returns the number of mipmap levels or 0 if the image has no mipmaps. The largest main level
   * image is not counted as a mipmap level by this method, so if you want to include it you can add 1
   * to this count.
   */
  public final fun getMipmapCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMipmapCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the offset where the image's mipmap with index [mipmap] is stored in the [data]
   * dictionary.
   */
  public final fun getMipmapOffset(mipmap: Int): Long {
    TransferContext.writeArguments(LONG to mipmap.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getMipmapOffsetPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Resizes the image to the nearest power of 2 for the width and height. If [square] is `true`
   * then set width and height to be the same. New pixels are calculated using the [interpolation] mode
   * defined via [Interpolation] constants.
   */
  @JvmOverloads
  public final fun resizeToPo2(square: Boolean = false, interpolation: Interpolation =
      Image.Interpolation.INTERPOLATE_BILINEAR): Unit {
    TransferContext.writeArguments(BOOL to square, LONG to interpolation.id)
    TransferContext.callMethod(ptr, MethodBindings.resizeToPo2Ptr, NIL)
  }

  /**
   * Resizes the image to the given [width] and [height]. New pixels are calculated using the
   * [interpolation] mode defined via [Interpolation] constants.
   */
  @JvmOverloads
  public final fun resize(
    width: Int,
    height: Int,
    interpolation: Interpolation = Image.Interpolation.INTERPOLATE_BILINEAR,
  ): Unit {
    TransferContext.writeArguments(LONG to width.toLong(), LONG to height.toLong(), LONG to interpolation.id)
    TransferContext.callMethod(ptr, MethodBindings.resizePtr, NIL)
  }

  /**
   * Shrinks the image by a factor of 2 on each axis (this divides the pixel count by 4).
   */
  public final fun shrinkX2(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.shrinkX2Ptr, NIL)
  }

  /**
   * Crops the image to the given [width] and [height]. If the specified size is larger than the
   * current size, the extra area is filled with black pixels.
   */
  public final fun crop(width: Int, height: Int): Unit {
    TransferContext.writeArguments(LONG to width.toLong(), LONG to height.toLong())
    TransferContext.callMethod(ptr, MethodBindings.cropPtr, NIL)
  }

  /**
   * Flips the image horizontally.
   */
  public final fun flipX(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.flipXPtr, NIL)
  }

  /**
   * Flips the image vertically.
   */
  public final fun flipY(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.flipYPtr, NIL)
  }

  /**
   * Generates mipmaps for the image. Mipmaps are precalculated lower-resolution copies of the image
   * that are automatically used if the image needs to be scaled down when rendered. They help improve
   * image quality and performance when rendering. This method returns an error if the image is
   * compressed, in a custom format, or if the image's width/height is `0`. Enabling [renormalize] when
   * generating mipmaps for normal map textures will make sure all resulting vector values are
   * normalized.
   * It is possible to check if the image has mipmaps by calling [hasMipmaps] or [getMipmapCount].
   * Calling [generateMipmaps] on an image that already has mipmaps will replace existing mipmaps in
   * the image.
   */
  @JvmOverloads
  public final fun generateMipmaps(renormalize: Boolean = false): Error {
    TransferContext.writeArguments(BOOL to renormalize)
    TransferContext.callMethod(ptr, MethodBindings.generateMipmapsPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Removes the image's mipmaps.
   */
  public final fun clearMipmaps(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.clearMipmapsPtr, NIL)
  }

  /**
   * Overwrites data of an existing [Image]. Non-static equivalent of [createFromData].
   */
  public final fun setData(
    width: Int,
    height: Int,
    useMipmaps: Boolean,
    format: Format,
    `data`: PackedByteArray,
  ): Unit {
    TransferContext.writeArguments(LONG to width.toLong(), LONG to height.toLong(), BOOL to useMipmaps, LONG to format.id, PACKED_BYTE_ARRAY to data)
    TransferContext.callMethod(ptr, MethodBindings.setDataPtr, NIL)
  }

  /**
   * Returns `true` if the image has no data.
   */
  public final fun isEmpty(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isEmptyPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Loads an image from file [path]. See
   * [url=$DOCS_URL/tutorials/assets_pipeline/importing_images.html#supported-image-formats]Supported
   * image formats[/url] for a list of supported image formats and limitations.
   * **Warning:** This method should only be used in the editor or in cases when you need to load
   * external images at run-time, such as images located at the `user://` directory, and may not work
   * in exported projects.
   * See also [ImageTexture] description for usage examples.
   */
  public final fun load(path: String): Error {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(ptr, MethodBindings.loadPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Saves the image as a PNG file to the file at [path].
   */
  public final fun savePng(path: String): Error {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(ptr, MethodBindings.savePngPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Saves the image as a PNG file to a byte array.
   */
  public final fun savePngToBuffer(): PackedByteArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.savePngToBufferPtr, PACKED_BYTE_ARRAY)
    return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY) as PackedByteArray)
  }

  /**
   * Saves the image as a JPEG file to [path] with the specified [quality] between `0.01` and `1.0`
   * (inclusive). Higher [quality] values result in better-looking output at the cost of larger file
   * sizes. Recommended [quality] values are between `0.75` and `0.90`. Even at quality `1.00`, JPEG
   * compression remains lossy.
   * **Note:** JPEG does not save an alpha channel. If the [Image] contains an alpha channel, the
   * image will still be saved, but the resulting JPEG file won't contain the alpha channel.
   */
  @JvmOverloads
  public final fun saveJpg(path: String, quality: Float = 0.75f): Error {
    TransferContext.writeArguments(STRING to path, DOUBLE to quality.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.saveJpgPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Saves the image as a JPEG file to a byte array with the specified [quality] between `0.01` and
   * `1.0` (inclusive). Higher [quality] values result in better-looking output at the cost of larger
   * byte array sizes (and therefore memory usage). Recommended [quality] values are between `0.75` and
   * `0.90`. Even at quality `1.00`, JPEG compression remains lossy.
   * **Note:** JPEG does not save an alpha channel. If the [Image] contains an alpha channel, the
   * image will still be saved, but the resulting byte array won't contain the alpha channel.
   */
  @JvmOverloads
  public final fun saveJpgToBuffer(quality: Float = 0.75f): PackedByteArray {
    TransferContext.writeArguments(DOUBLE to quality.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.saveJpgToBufferPtr, PACKED_BYTE_ARRAY)
    return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY) as PackedByteArray)
  }

  /**
   * Saves the image as an EXR file to [path]. If [grayscale] is `true` and the image has only one
   * channel, it will be saved explicitly as monochrome rather than one red channel. This function will
   * return [ERR_UNAVAILABLE] if Godot was compiled without the TinyEXR module.
   * **Note:** The TinyEXR module is disabled in non-editor builds, which means [saveExr] will
   * return [ERR_UNAVAILABLE] when it is called from an exported project.
   */
  @JvmOverloads
  public final fun saveExr(path: String, grayscale: Boolean = false): Error {
    TransferContext.writeArguments(STRING to path, BOOL to grayscale)
    TransferContext.callMethod(ptr, MethodBindings.saveExrPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Saves the image as an EXR file to a byte array. If [grayscale] is `true` and the image has only
   * one channel, it will be saved explicitly as monochrome rather than one red channel. This function
   * will return an empty byte array if Godot was compiled without the TinyEXR module.
   * **Note:** The TinyEXR module is disabled in non-editor builds, which means [saveExr] will
   * return an empty byte array when it is called from an exported project.
   */
  @JvmOverloads
  public final fun saveExrToBuffer(grayscale: Boolean = false): PackedByteArray {
    TransferContext.writeArguments(BOOL to grayscale)
    TransferContext.callMethod(ptr, MethodBindings.saveExrToBufferPtr, PACKED_BYTE_ARRAY)
    return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY) as PackedByteArray)
  }

  /**
   * Saves the image as a WebP (Web Picture) file to the file at [path]. By default it will save
   * lossless. If [lossy] is `true`, the image will be saved lossy, using the [quality] setting between
   * `0.0` and `1.0` (inclusive). Lossless WebP offers more efficient compression than PNG.
   * **Note:** The WebP format is limited to a size of 16383×16383 pixels, while PNG can save larger
   * images.
   */
  @JvmOverloads
  public final fun saveWebp(
    path: String,
    lossy: Boolean = false,
    quality: Float = 0.75f,
  ): Error {
    TransferContext.writeArguments(STRING to path, BOOL to lossy, DOUBLE to quality.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.saveWebpPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Saves the image as a WebP (Web Picture) file to a byte array. By default it will save lossless.
   * If [lossy] is `true`, the image will be saved lossy, using the [quality] setting between `0.0` and
   * `1.0` (inclusive). Lossless WebP offers more efficient compression than PNG.
   * **Note:** The WebP format is limited to a size of 16383×16383 pixels, while PNG can save larger
   * images.
   */
  @JvmOverloads
  public final fun saveWebpToBuffer(lossy: Boolean = false, quality: Float = 0.75f):
      PackedByteArray {
    TransferContext.writeArguments(BOOL to lossy, DOUBLE to quality.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.saveWebpToBufferPtr, PACKED_BYTE_ARRAY)
    return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY) as PackedByteArray)
  }

  /**
   * Returns [ALPHA_BLEND] if the image has data for alpha values. Returns [ALPHA_BIT] if all the
   * alpha values are stored in a single bit. Returns [ALPHA_NONE] if no data for alpha values is
   * found.
   */
  public final fun detectAlpha(): AlphaMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.detectAlphaPtr, LONG)
    return Image.AlphaMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns `true` if all the image's pixels have an alpha value of 0. Returns `false` if any pixel
   * has an alpha value higher than 0.
   */
  public final fun isInvisible(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isInvisiblePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the color channels used by this image, as one of the [UsedChannels] constants. If the
   * image is compressed, the original [source] must be specified.
   */
  @JvmOverloads
  public final fun detectUsedChannels(source: CompressSource = Image.CompressSource.GENERIC):
      UsedChannels {
    TransferContext.writeArguments(LONG to source.id)
    TransferContext.callMethod(ptr, MethodBindings.detectUsedChannelsPtr, LONG)
    return Image.UsedChannels.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Compresses the image to use less memory. Can not directly access pixel data while the image is
   * compressed. Returns error if the chosen compression mode is not available.
   * The [source] parameter helps to pick the best compression method for DXT and ETC2 formats. It
   * is ignored for ASTC compression.
   * For ASTC compression, the [astcFormat] parameter must be supplied.
   */
  @JvmOverloads
  public final fun compress(
    mode: CompressMode,
    source: CompressSource = Image.CompressSource.GENERIC,
    astcFormat: ASTCFormat = Image.ASTCFormat.ASTC_FORMAT_4x4,
  ): Error {
    TransferContext.writeArguments(LONG to mode.id, LONG to source.id, LONG to astcFormat.id)
    TransferContext.callMethod(ptr, MethodBindings.compressPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Compresses the image to use less memory. Can not directly access pixel data while the image is
   * compressed. Returns error if the chosen compression mode is not available.
   * This is an alternative to [compress] that lets the user supply the channels used in order for
   * the compressor to pick the best DXT and ETC2 formats. For other formats (non DXT or ETC2), this
   * argument is ignored.
   * For ASTC compression, the [astcFormat] parameter must be supplied.
   */
  @JvmOverloads
  public final fun compressFromChannels(
    mode: CompressMode,
    channels: UsedChannels,
    astcFormat: ASTCFormat = Image.ASTCFormat.ASTC_FORMAT_4x4,
  ): Error {
    TransferContext.writeArguments(LONG to mode.id, LONG to channels.id, LONG to astcFormat.id)
    TransferContext.callMethod(ptr, MethodBindings.compressFromChannelsPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Decompresses the image if it is VRAM compressed in a supported format. Returns [OK] if the
   * format is supported, otherwise [ERR_UNAVAILABLE].
   * **Note:** The following formats can be decompressed: DXT, RGTC, BPTC. The formats ETC1 and ETC2
   * are not supported.
   */
  public final fun decompress(): Error {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.decompressPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns `true` if the image is compressed.
   */
  public final fun isCompressed(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isCompressedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Rotates the image in the specified [direction] by `90` degrees. The width and height of the
   * image must be greater than `1`. If the width and height are not equal, the image will be resized.
   */
  public final fun rotate90(direction: ClockDirection): Unit {
    TransferContext.writeArguments(LONG to direction.id)
    TransferContext.callMethod(ptr, MethodBindings.rotate90Ptr, NIL)
  }

  /**
   * Rotates the image by `180` degrees. The width and height of the image must be greater than `1`.
   */
  public final fun rotate180(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.rotate180Ptr, NIL)
  }

  /**
   * Blends low-alpha pixels with nearby pixels.
   */
  public final fun fixAlphaEdges(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.fixAlphaEdgesPtr, NIL)
  }

  /**
   * Multiplies color values with alpha values. Resulting color values for a pixel are `(color *
   * alpha)/256`. See also [CanvasItemMaterial.blendMode].
   */
  public final fun premultiplyAlpha(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.premultiplyAlphaPtr, NIL)
  }

  /**
   * Converts the raw data from the sRGB colorspace to a linear scale. Only works on images with
   * [FORMAT_RGB8] or [FORMAT_RGBA8] formats.
   */
  public final fun srgbToLinear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.srgbToLinearPtr, NIL)
  }

  /**
   * Converts the entire image from the linear colorspace to the sRGB colorspace. Only works on
   * images with [FORMAT_RGB8] or [FORMAT_RGBA8] formats.
   */
  public final fun linearToSrgb(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.linearToSrgbPtr, NIL)
  }

  /**
   * Converts the image's data to represent coordinates on a 3D plane. This is used when the image
   * represents a normal map. A normal map can add lots of detail to a 3D surface without increasing
   * the polygon count.
   */
  public final fun normalMapToXy(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.normalMapToXyPtr, NIL)
  }

  /**
   * Converts a standard RGBE (Red Green Blue Exponent) image to an sRGB image.
   */
  public final fun rgbeToSrgb(): Image? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.rgbeToSrgbPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Image?)
  }

  /**
   * Converts a bump map to a normal map. A bump map provides a height offset per-pixel, while a
   * normal map provides a normal direction per pixel.
   */
  @JvmOverloads
  public final fun bumpMapToNormalMap(bumpScale: Float = 1.0f): Unit {
    TransferContext.writeArguments(DOUBLE to bumpScale.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.bumpMapToNormalMapPtr, NIL)
  }

  /**
   * Compute image metrics on the current image and the compared image.
   * The dictionary contains `max`, `mean`, `mean_squared`, `root_mean_squared` and `peak_snr`.
   */
  public final fun computeImageMetrics(comparedImage: Image?, useLuma: Boolean):
      Dictionary<Any?, Any?> {
    TransferContext.writeArguments(OBJECT to comparedImage, BOOL to useLuma)
    TransferContext.callMethod(ptr, MethodBindings.computeImageMetricsPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY) as Dictionary<Any?, Any?>)
  }

  /**
   * Copies [srcRect] from [src] image to this image at coordinates [dst], clipped accordingly to
   * both image bounds. This image and [src] image **must** have the same format. [srcRect] with
   * non-positive size is treated as empty.
   * **Note:** The alpha channel data in [src] will overwrite the corresponding data in this image
   * at the target position. To blend alpha channels, use [blendRect] instead.
   */
  public final fun blitRect(
    src: Image?,
    srcRect: Rect2i,
    dst: Vector2i,
  ): Unit {
    TransferContext.writeArguments(OBJECT to src, RECT2I to srcRect, VECTOR2I to dst)
    TransferContext.callMethod(ptr, MethodBindings.blitRectPtr, NIL)
  }

  /**
   * Blits [srcRect] area from [src] image to this image at the coordinates given by [dst], clipped
   * accordingly to both image bounds. [src] pixel is copied onto [dst] if the corresponding [mask]
   * pixel's alpha value is not 0. This image and [src] image **must** have the same format. [src]
   * image and [mask] image **must** have the same size (width and height) but they can have different
   * formats. [srcRect] with non-positive size is treated as empty.
   */
  public final fun blitRectMask(
    src: Image?,
    mask: Image?,
    srcRect: Rect2i,
    dst: Vector2i,
  ): Unit {
    TransferContext.writeArguments(OBJECT to src, OBJECT to mask, RECT2I to srcRect, VECTOR2I to dst)
    TransferContext.callMethod(ptr, MethodBindings.blitRectMaskPtr, NIL)
  }

  /**
   * Alpha-blends [srcRect] from [src] image to this image at coordinates [dst], clipped accordingly
   * to both image bounds. This image and [src] image **must** have the same format. [srcRect] with
   * non-positive size is treated as empty.
   */
  public final fun blendRect(
    src: Image?,
    srcRect: Rect2i,
    dst: Vector2i,
  ): Unit {
    TransferContext.writeArguments(OBJECT to src, RECT2I to srcRect, VECTOR2I to dst)
    TransferContext.callMethod(ptr, MethodBindings.blendRectPtr, NIL)
  }

  /**
   * Alpha-blends [srcRect] from [src] image to this image using [mask] image at coordinates [dst],
   * clipped accordingly to both image bounds. Alpha channels are required for both [src] and [mask].
   * [dst] pixels and [src] pixels will blend if the corresponding mask pixel's alpha value is not 0.
   * This image and [src] image **must** have the same format. [src] image and [mask] image **must**
   * have the same size (width and height) but they can have different formats. [srcRect] with
   * non-positive size is treated as empty.
   */
  public final fun blendRectMask(
    src: Image?,
    mask: Image?,
    srcRect: Rect2i,
    dst: Vector2i,
  ): Unit {
    TransferContext.writeArguments(OBJECT to src, OBJECT to mask, RECT2I to srcRect, VECTOR2I to dst)
    TransferContext.callMethod(ptr, MethodBindings.blendRectMaskPtr, NIL)
  }

  /**
   * Fills the image with [color].
   */
  public final fun fill(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(ptr, MethodBindings.fillPtr, NIL)
  }

  /**
   * Fills [rect] with [color].
   */
  public final fun fillRect(rect: Rect2i, color: Color): Unit {
    TransferContext.writeArguments(RECT2I to rect, COLOR to color)
    TransferContext.callMethod(ptr, MethodBindings.fillRectPtr, NIL)
  }

  /**
   * Returns a [Rect2i] enclosing the visible portion of the image, considering each pixel with a
   * non-zero alpha channel as visible.
   */
  public final fun getUsedRect(): Rect2i {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getUsedRectPtr, RECT2I)
    return (TransferContext.readReturnValue(RECT2I) as Rect2i)
  }

  /**
   * Returns a new [Image] that is a copy of this [Image]'s area specified with [region].
   */
  public final fun getRegion(region: Rect2i): Image? {
    TransferContext.writeArguments(RECT2I to region)
    TransferContext.callMethod(ptr, MethodBindings.getRegionPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Image?)
  }

  /**
   * Copies [src] image to this image.
   */
  public final fun copyFrom(src: Image?): Unit {
    TransferContext.writeArguments(OBJECT to src)
    TransferContext.callMethod(ptr, MethodBindings.copyFromPtr, NIL)
  }

  /**
   * Returns the color of the pixel at [point].
   * This is the same as [getPixel], but with a [Vector2i] argument instead of two integer
   * arguments.
   */
  public final fun getPixelv(point: Vector2i): Color {
    TransferContext.writeArguments(VECTOR2I to point)
    TransferContext.callMethod(ptr, MethodBindings.getPixelvPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  /**
   * Returns the color of the pixel at `(x, y)`.
   * This is the same as [getPixelv], but with two integer arguments instead of a [Vector2i]
   * argument.
   */
  public final fun getPixel(x: Int, y: Int): Color {
    TransferContext.writeArguments(LONG to x.toLong(), LONG to y.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getPixelPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  /**
   * Sets the [Color] of the pixel at [point] to [color].
   *
   * gdscript:
   * ```gdscript
   * var img_width = 10
   * var img_height = 5
   * var img = Image.create(img_width, img_height, false, Image.FORMAT_RGBA8)
   *
   * img.set_pixelv(Vector2i(1, 2), Color.RED) # Sets the color at (1, 2) to red.
   * ```
   * csharp:
   * ```csharp
   * int imgWidth = 10;
   * int imgHeight = 5;
   * var img = Image.Create(imgWidth, imgHeight, false, Image.Format.Rgba8);
   *
   * img.SetPixelv(new Vector2I(1, 2), Colors.Red); // Sets the color at (1, 2) to red.
   * ```
   *
   * This is the same as [setPixel], but with a [Vector2i] argument instead of two integer
   * arguments.
   */
  public final fun setPixelv(point: Vector2i, color: Color): Unit {
    TransferContext.writeArguments(VECTOR2I to point, COLOR to color)
    TransferContext.callMethod(ptr, MethodBindings.setPixelvPtr, NIL)
  }

  /**
   * Sets the [Color] of the pixel at `(x, y)` to [color].
   *
   * gdscript:
   * ```gdscript
   * var img_width = 10
   * var img_height = 5
   * var img = Image.create(img_width, img_height, false, Image.FORMAT_RGBA8)
   *
   * img.set_pixel(1, 2, Color.RED) # Sets the color at (1, 2) to red.
   * ```
   * csharp:
   * ```csharp
   * int imgWidth = 10;
   * int imgHeight = 5;
   * var img = Image.Create(imgWidth, imgHeight, false, Image.Format.Rgba8);
   *
   * img.SetPixel(1, 2, Colors.Red); // Sets the color at (1, 2) to red.
   * ```
   *
   * This is the same as [setPixelv], but with a two integer arguments instead of a [Vector2i]
   * argument.
   */
  public final fun setPixel(
    x: Int,
    y: Int,
    color: Color,
  ): Unit {
    TransferContext.writeArguments(LONG to x.toLong(), LONG to y.toLong(), COLOR to color)
    TransferContext.callMethod(ptr, MethodBindings.setPixelPtr, NIL)
  }

  /**
   * Adjusts this image's [brightness], [contrast], and [saturation] by the given values. Does not
   * work if the image is compressed (see [isCompressed]).
   */
  public final fun adjustBcs(
    brightness: Float,
    contrast: Float,
    saturation: Float,
  ): Unit {
    TransferContext.writeArguments(DOUBLE to brightness.toDouble(), DOUBLE to contrast.toDouble(), DOUBLE to saturation.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.adjustBcsPtr, NIL)
  }

  /**
   * Loads an image from the binary contents of a PNG file.
   */
  public final fun loadPngFromBuffer(buffer: PackedByteArray): Error {
    TransferContext.writeArguments(PACKED_BYTE_ARRAY to buffer)
    TransferContext.callMethod(ptr, MethodBindings.loadPngFromBufferPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Loads an image from the binary contents of a JPEG file.
   */
  public final fun loadJpgFromBuffer(buffer: PackedByteArray): Error {
    TransferContext.writeArguments(PACKED_BYTE_ARRAY to buffer)
    TransferContext.callMethod(ptr, MethodBindings.loadJpgFromBufferPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Loads an image from the binary contents of a WebP file.
   */
  public final fun loadWebpFromBuffer(buffer: PackedByteArray): Error {
    TransferContext.writeArguments(PACKED_BYTE_ARRAY to buffer)
    TransferContext.callMethod(ptr, MethodBindings.loadWebpFromBufferPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Loads an image from the binary contents of a TGA file.
   * **Note:** This method is only available in engine builds with the TGA module enabled. By
   * default, the TGA module is enabled, but it can be disabled at build-time using the
   * `module_tga_enabled=no` SCons option.
   */
  public final fun loadTgaFromBuffer(buffer: PackedByteArray): Error {
    TransferContext.writeArguments(PACKED_BYTE_ARRAY to buffer)
    TransferContext.callMethod(ptr, MethodBindings.loadTgaFromBufferPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Loads an image from the binary contents of a BMP file.
   * **Note:** Godot's BMP module doesn't support 16-bit per pixel images. Only 1-bit, 4-bit, 8-bit,
   * 24-bit, and 32-bit per pixel images are supported.
   * **Note:** This method is only available in engine builds with the BMP module enabled. By
   * default, the BMP module is enabled, but it can be disabled at build-time using the
   * `module_bmp_enabled=no` SCons option.
   */
  public final fun loadBmpFromBuffer(buffer: PackedByteArray): Error {
    TransferContext.writeArguments(PACKED_BYTE_ARRAY to buffer)
    TransferContext.callMethod(ptr, MethodBindings.loadBmpFromBufferPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Loads an image from the binary contents of a
   * [url=https://github.com/KhronosGroup/KTX-Software]KTX[/url] file. Unlike most image formats, KTX
   * can store VRAM-compressed data and embed mipmaps.
   * **Note:** Godot's libktx implementation only supports 2D images. Cubemaps, texture arrays, and
   * de-padding are not supported.
   * **Note:** This method is only available in engine builds with the KTX module enabled. By
   * default, the KTX module is enabled, but it can be disabled at build-time using the
   * `module_ktx_enabled=no` SCons option.
   */
  public final fun loadKtxFromBuffer(buffer: PackedByteArray): Error {
    TransferContext.writeArguments(PACKED_BYTE_ARRAY to buffer)
    TransferContext.callMethod(ptr, MethodBindings.loadKtxFromBufferPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Loads an image from the UTF-8 binary contents of an **uncompressed** SVG file (**.svg**).
   * **Note:** Beware when using compressed SVG files (like **.svgz**), they need to be
   * `decompressed` before loading.
   * **Note:** This method is only available in engine builds with the SVG module enabled. By
   * default, the SVG module is enabled, but it can be disabled at build-time using the
   * `module_svg_enabled=no` SCons option.
   */
  @JvmOverloads
  public final fun loadSvgFromBuffer(buffer: PackedByteArray, scale: Float = 1.0f): Error {
    TransferContext.writeArguments(PACKED_BYTE_ARRAY to buffer, DOUBLE to scale.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.loadSvgFromBufferPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Loads an image from the string contents of an SVG file (**.svg**).
   * **Note:** This method is only available in engine builds with the SVG module enabled. By
   * default, the SVG module is enabled, but it can be disabled at build-time using the
   * `module_svg_enabled=no` SCons option.
   */
  @JvmOverloads
  public final fun loadSvgFromString(svgStr: String, scale: Float = 1.0f): Error {
    TransferContext.writeArguments(STRING to svgStr, DOUBLE to scale.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.loadSvgFromStringPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public enum class Format(
    id: Long,
  ) {
    /**
     * Texture format with a single 8-bit depth representing luminance.
     */
    L8(0),
    /**
     * OpenGL texture format with two values, luminance and alpha each stored with 8 bits.
     */
    LA8(1),
    /**
     * OpenGL texture format `RED` with a single component and a bitdepth of 8.
     */
    R8(2),
    /**
     * OpenGL texture format `RG` with two components and a bitdepth of 8 for each.
     */
    RG8(3),
    /**
     * OpenGL texture format `RGB` with three components, each with a bitdepth of 8.
     * **Note:** When creating an [ImageTexture], an sRGB to linear color space conversion is
     * performed.
     */
    RGB8(4),
    /**
     * OpenGL texture format `RGBA` with four components, each with a bitdepth of 8.
     * **Note:** When creating an [ImageTexture], an sRGB to linear color space conversion is
     * performed.
     */
    RGBA8(5),
    /**
     * OpenGL texture format `RGBA` with four components, each with a bitdepth of 4.
     */
    RGBA4444(6),
    /**
     * OpenGL texture format `RGB` with three components. Red and blue have a bitdepth of 5, and
     * green has a bitdepth of 6.
     */
    RGB565(7),
    /**
     * OpenGL texture format `GL_R32F` where there's one component, a 32-bit floating-point value.
     */
    RF(8),
    /**
     * OpenGL texture format `GL_RG32F` where there are two components, each a 32-bit floating-point
     * values.
     */
    RGF(9),
    /**
     * OpenGL texture format `GL_RGB32F` where there are three components, each a 32-bit
     * floating-point values.
     */
    RGBF(10),
    /**
     * OpenGL texture format `GL_RGBA32F` where there are four components, each a 32-bit
     * floating-point values.
     */
    RGBAF(11),
    /**
     * OpenGL texture format `GL_R16F` where there's one component, a 16-bit "half-precision"
     * floating-point value.
     */
    RH(12),
    /**
     * OpenGL texture format `GL_RG16F` where there are two components, each a 16-bit
     * "half-precision" floating-point value.
     */
    RGH(13),
    /**
     * OpenGL texture format `GL_RGB16F` where there are three components, each a 16-bit
     * "half-precision" floating-point value.
     */
    RGBH(14),
    /**
     * OpenGL texture format `GL_RGBA16F` where there are four components, each a 16-bit
     * "half-precision" floating-point value.
     */
    RGBAH(15),
    /**
     * A special OpenGL texture format where the three color components have 9 bits of precision and
     * all three share a single 5-bit exponent.
     */
    RGBE9995(16),
    /**
     * The [url=https://en.wikipedia.org/wiki/S3_Texture_Compression]S3TC[/url] texture format that
     * uses Block Compression 1, and is the smallest variation of S3TC, only providing 1 bit of alpha
     * and color data being premultiplied with alpha.
     * **Note:** When creating an [ImageTexture], an sRGB to linear color space conversion is
     * performed.
     */
    DXT1(17),
    /**
     * The [url=https://en.wikipedia.org/wiki/S3_Texture_Compression]S3TC[/url] texture format that
     * uses Block Compression 2, and color data is interpreted as not having been premultiplied by
     * alpha. Well suited for images with sharp alpha transitions between translucent and opaque areas.
     * **Note:** When creating an [ImageTexture], an sRGB to linear color space conversion is
     * performed.
     */
    DXT3(18),
    /**
     * The [url=https://en.wikipedia.org/wiki/S3_Texture_Compression]S3TC[/url] texture format also
     * known as Block Compression 3 or BC3 that contains 64 bits of alpha channel data followed by 64
     * bits of DXT1-encoded color data. Color data is not premultiplied by alpha, same as DXT3. DXT5
     * generally produces superior results for transparent gradients compared to DXT3.
     * **Note:** When creating an [ImageTexture], an sRGB to linear color space conversion is
     * performed.
     */
    DXT5(19),
    /**
     * Texture format that uses
     * [url=https://www.khronos.org/opengl/wiki/Red_Green_Texture_Compression]Red Green Texture
     * Compression[/url], normalizing the red channel data using the same compression algorithm that
     * DXT5 uses for the alpha channel.
     */
    RGTC_R(20),
    /**
     * Texture format that uses
     * [url=https://www.khronos.org/opengl/wiki/Red_Green_Texture_Compression]Red Green Texture
     * Compression[/url], normalizing the red and green channel data using the same compression
     * algorithm that DXT5 uses for the alpha channel.
     */
    RGTC_RG(21),
    /**
     * Texture format that uses
     * [url=https://www.khronos.org/opengl/wiki/BPTC_Texture_Compression]BPTC[/url] compression with
     * unsigned normalized RGBA components.
     * **Note:** When creating an [ImageTexture], an sRGB to linear color space conversion is
     * performed.
     */
    BPTC_RGBA(22),
    /**
     * Texture format that uses
     * [url=https://www.khronos.org/opengl/wiki/BPTC_Texture_Compression]BPTC[/url] compression with
     * signed floating-point RGB components.
     */
    BPTC_RGBF(23),
    /**
     * Texture format that uses
     * [url=https://www.khronos.org/opengl/wiki/BPTC_Texture_Compression]BPTC[/url] compression with
     * unsigned floating-point RGB components.
     */
    BPTC_RGBFU(24),
    /**
     * [url=https://en.wikipedia.org/wiki/Ericsson_Texture_Compression#ETC1]Ericsson Texture
     * Compression format 1[/url], also referred to as "ETC1", and is part of the OpenGL ES graphics
     * standard. This format cannot store an alpha channel.
     */
    ETC(25),
    /**
     * [url=https://en.wikipedia.org/wiki/Ericsson_Texture_Compression#ETC2_and_EAC]Ericsson Texture
     * Compression format 2[/url] (`R11_EAC` variant), which provides one channel of unsigned data.
     */
    ETC2_R11(26),
    /**
     * [url=https://en.wikipedia.org/wiki/Ericsson_Texture_Compression#ETC2_and_EAC]Ericsson Texture
     * Compression format 2[/url] (`SIGNED_R11_EAC` variant), which provides one channel of signed
     * data.
     */
    ETC2_R11S(27),
    /**
     * [url=https://en.wikipedia.org/wiki/Ericsson_Texture_Compression#ETC2_and_EAC]Ericsson Texture
     * Compression format 2[/url] (`RG11_EAC` variant), which provides two channels of unsigned data.
     */
    ETC2_RG11(28),
    /**
     * [url=https://en.wikipedia.org/wiki/Ericsson_Texture_Compression#ETC2_and_EAC]Ericsson Texture
     * Compression format 2[/url] (`SIGNED_RG11_EAC` variant), which provides two channels of signed
     * data.
     */
    ETC2_RG11S(29),
    /**
     * [url=https://en.wikipedia.org/wiki/Ericsson_Texture_Compression#ETC2_and_EAC]Ericsson Texture
     * Compression format 2[/url] (`RGB8` variant), which is a follow-up of ETC1 and compresses RGB888
     * data.
     * **Note:** When creating an [ImageTexture], an sRGB to linear color space conversion is
     * performed.
     */
    ETC2_RGB8(30),
    /**
     * [url=https://en.wikipedia.org/wiki/Ericsson_Texture_Compression#ETC2_and_EAC]Ericsson Texture
     * Compression format 2[/url] (`RGBA8`variant), which compresses RGBA8888 data with full alpha
     * support.
     * **Note:** When creating an [ImageTexture], an sRGB to linear color space conversion is
     * performed.
     */
    ETC2_RGBA8(31),
    /**
     * [url=https://en.wikipedia.org/wiki/Ericsson_Texture_Compression#ETC2_and_EAC]Ericsson Texture
     * Compression format 2[/url] (`RGB8_PUNCHTHROUGH_ALPHA1` variant), which compresses RGBA data to
     * make alpha either fully transparent or fully opaque.
     * **Note:** When creating an [ImageTexture], an sRGB to linear color space conversion is
     * performed.
     */
    ETC2_RGB8A1(32),
    /**
     * [url=https://en.wikipedia.org/wiki/Ericsson_Texture_Compression#ETC2_and_EAC]Ericsson Texture
     * Compression format 2[/url] (`RGBA8` variant), which compresses RA data and interprets it as two
     * channels (red and green). See also [FORMAT_ETC2_RGBA8].
     */
    ETC2_RA_AS_RG(33),
    /**
     * The [url=https://en.wikipedia.org/wiki/S3_Texture_Compression]S3TC[/url] texture format also
     * known as Block Compression 3 or BC3, which compresses RA data and interprets it as two channels
     * (red and green). See also [FORMAT_DXT5].
     */
    DXT5_RA_AS_RG(34),
    /**
     * [url=https://en.wikipedia.org/wiki/Adaptive_scalable_texture_compression]Adaptive Scalable
     * Texture Compression[/url]. This implements the 4×4 (high quality) mode.
     */
    ASTC_4x4(35),
    /**
     * Same format as [FORMAT_ASTC_4x4], but with the hint to let the GPU know it is used for HDR.
     */
    ASTC_4x4_HDR(36),
    /**
     * [url=https://en.wikipedia.org/wiki/Adaptive_scalable_texture_compression]Adaptive Scalable
     * Texture Compression[/url]. This implements the 8×8 (low quality) mode.
     */
    ASTC_8x8(37),
    /**
     * Same format as [FORMAT_ASTC_8x8], but with the hint to let the GPU know it is used for HDR.
     */
    ASTC_8x8_HDR(38),
    /**
     * Represents the size of the [Format] enum.
     */
    MAX(39),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Format = entries.single { it.id == `value` }
    }
  }

  public enum class Interpolation(
    id: Long,
  ) {
    /**
     * Performs nearest-neighbor interpolation. If the image is resized, it will be pixelated.
     */
    INTERPOLATE_NEAREST(0),
    /**
     * Performs bilinear interpolation. If the image is resized, it will be blurry. This mode is
     * faster than [INTERPOLATE_CUBIC], but it results in lower quality.
     */
    INTERPOLATE_BILINEAR(1),
    /**
     * Performs cubic interpolation. If the image is resized, it will be blurry. This mode often
     * gives better results compared to [INTERPOLATE_BILINEAR], at the cost of being slower.
     */
    INTERPOLATE_CUBIC(2),
    /**
     * Performs bilinear separately on the two most-suited mipmap levels, then linearly interpolates
     * between them.
     * It's slower than [INTERPOLATE_BILINEAR], but produces higher-quality results with far fewer
     * aliasing artifacts.
     * If the image does not have mipmaps, they will be generated and used internally, but no
     * mipmaps will be generated on the resulting image.
     * **Note:** If you intend to scale multiple copies of the original image, it's better to call
     * [generateMipmaps]] on it in advance, to avoid wasting processing power in generating them again
     * and again.
     * On the other hand, if the image already has mipmaps, they will be used, and a new set will be
     * generated for the resulting image.
     */
    INTERPOLATE_TRILINEAR(3),
    /**
     * Performs Lanczos interpolation. This is the slowest image resizing mode, but it typically
     * gives the best results, especially when downscaling images.
     */
    INTERPOLATE_LANCZOS(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Interpolation = entries.single { it.id == `value` }
    }
  }

  public enum class AlphaMode(
    id: Long,
  ) {
    /**
     * Image does not have alpha.
     */
    NONE(0),
    /**
     * Image stores alpha in a single bit.
     */
    BIT(1),
    /**
     * Image uses alpha.
     */
    BLEND(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): AlphaMode = entries.single { it.id == `value` }
    }
  }

  public enum class CompressMode(
    id: Long,
  ) {
    /**
     * Use S3TC compression.
     */
    S3TC(0),
    /**
     * Use ETC compression.
     */
    ETC(1),
    /**
     * Use ETC2 compression.
     */
    ETC2(2),
    /**
     * Use BPTC compression.
     */
    BPTC(3),
    /**
     * Use ASTC compression.
     */
    ASTC(4),
    /**
     * Represents the size of the [CompressMode] enum.
     */
    MAX(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): CompressMode = entries.single { it.id == `value` }
    }
  }

  public enum class UsedChannels(
    id: Long,
  ) {
    /**
     * The image only uses one channel for luminance (grayscale).
     */
    L(0),
    /**
     * The image uses two channels for luminance and alpha, respectively.
     */
    LA(1),
    /**
     * The image only uses the red channel.
     */
    R(2),
    /**
     * The image uses two channels for red and green.
     */
    RG(3),
    /**
     * The image uses three channels for red, green, and blue.
     */
    RGB(4),
    /**
     * The image uses four channels for red, green, blue, and alpha.
     */
    RGBA(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): UsedChannels = entries.single { it.id == `value` }
    }
  }

  public enum class CompressSource(
    id: Long,
  ) {
    /**
     * Source texture (before compression) is a regular texture. Default for all textures.
     */
    GENERIC(0),
    /**
     * Source texture (before compression) is in sRGB space.
     */
    SRGB(1),
    /**
     * Source texture (before compression) is a normal texture (e.g. it can be compressed into two
     * channels).
     */
    NORMAL(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): CompressSource = entries.single { it.id == `value` }
    }
  }

  public enum class ASTCFormat(
    id: Long,
  ) {
    /**
     * Hint to indicate that the high quality 4×4 ASTC compression format should be used.
     */
    ASTC_FORMAT_4x4(0),
    /**
     * Hint to indicate that the low quality 8×8 ASTC compression format should be used.
     */
    ASTC_FORMAT_8x8(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ASTCFormat = entries.single { it.id == `value` }
    }
  }

  public companion object {
    /**
     * The maximal width allowed for [Image] resources.
     */
    public final const val MAX_WIDTH: Long = 16777216

    /**
     * The maximal height allowed for [Image] resources.
     */
    public final const val MAX_HEIGHT: Long = 16777216

    /**
     * Creates an empty image of given size and format. See [Format] constants. If [useMipmaps] is
     * `true`, then generate mipmaps for this image. See the [generateMipmaps].
     */
    @JvmStatic
    public final fun create(
      width: Int,
      height: Int,
      useMipmaps: Boolean,
      format: Format,
    ): Image? {
      TransferContext.writeArguments(LONG to width.toLong(), LONG to height.toLong(), BOOL to useMipmaps, LONG to format.id)
      TransferContext.callMethod(0, MethodBindings.createPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT) as Image?)
    }

    /**
     * Creates an empty image of given size and format. See [Format] constants. If [useMipmaps] is
     * `true`, then generate mipmaps for this image. See the [generateMipmaps].
     */
    @JvmStatic
    public final fun createEmpty(
      width: Int,
      height: Int,
      useMipmaps: Boolean,
      format: Format,
    ): Image? {
      TransferContext.writeArguments(LONG to width.toLong(), LONG to height.toLong(), BOOL to useMipmaps, LONG to format.id)
      TransferContext.callMethod(0, MethodBindings.createEmptyPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT) as Image?)
    }

    /**
     * Creates a new image of given size and format. See [Format] constants. Fills the image with
     * the given raw data. If [useMipmaps] is `true` then loads mipmaps for this image from [data]. See
     * [generateMipmaps].
     */
    @JvmStatic
    public final fun createFromData(
      width: Int,
      height: Int,
      useMipmaps: Boolean,
      format: Format,
      `data`: PackedByteArray,
    ): Image? {
      TransferContext.writeArguments(LONG to width.toLong(), LONG to height.toLong(), BOOL to useMipmaps, LONG to format.id, PACKED_BYTE_ARRAY to data)
      TransferContext.callMethod(0, MethodBindings.createFromDataPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT) as Image?)
    }

    /**
     * Creates a new [Image] and loads data from the specified file.
     */
    @JvmStatic
    public final fun loadFromFile(path: String): Image? {
      TransferContext.writeArguments(STRING to path)
      TransferContext.callMethod(0, MethodBindings.loadFromFilePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT) as Image?)
    }
  }

  public object MethodBindings {
    internal val getWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Image", "get_width", 3905245786)

    internal val getHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Image", "get_height", 3905245786)

    internal val getSizePtr: VoidPtr = TypeManager.getMethodBindPtr("Image", "get_size", 3690982128)

    internal val hasMipmapsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Image", "has_mipmaps", 36873697)

    internal val getFormatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Image", "get_format", 3847873762)

    internal val getDataPtr: VoidPtr = TypeManager.getMethodBindPtr("Image", "get_data", 2362200018)

    internal val getDataSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Image", "get_data_size", 3905245786)

    internal val convertPtr: VoidPtr = TypeManager.getMethodBindPtr("Image", "convert", 2120693146)

    internal val getMipmapCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Image", "get_mipmap_count", 3905245786)

    internal val getMipmapOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Image", "get_mipmap_offset", 923996154)

    internal val resizeToPo2Ptr: VoidPtr =
        TypeManager.getMethodBindPtr("Image", "resize_to_po2", 4189212329)

    internal val resizePtr: VoidPtr = TypeManager.getMethodBindPtr("Image", "resize", 994498151)

    internal val shrinkX2Ptr: VoidPtr =
        TypeManager.getMethodBindPtr("Image", "shrink_x2", 3218959716)

    internal val cropPtr: VoidPtr = TypeManager.getMethodBindPtr("Image", "crop", 3937882851)

    internal val flipXPtr: VoidPtr = TypeManager.getMethodBindPtr("Image", "flip_x", 3218959716)

    internal val flipYPtr: VoidPtr = TypeManager.getMethodBindPtr("Image", "flip_y", 3218959716)

    internal val generateMipmapsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Image", "generate_mipmaps", 1633102583)

    internal val clearMipmapsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Image", "clear_mipmaps", 3218959716)

    internal val createPtr: VoidPtr = TypeManager.getMethodBindPtr("Image", "create", 986942177)

    internal val createEmptyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Image", "create_empty", 986942177)

    internal val createFromDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Image", "create_from_data", 299398494)

    internal val setDataPtr: VoidPtr = TypeManager.getMethodBindPtr("Image", "set_data", 2740482212)

    internal val isEmptyPtr: VoidPtr = TypeManager.getMethodBindPtr("Image", "is_empty", 36873697)

    internal val loadPtr: VoidPtr = TypeManager.getMethodBindPtr("Image", "load", 166001499)

    internal val loadFromFilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Image", "load_from_file", 736337515)

    internal val savePngPtr: VoidPtr = TypeManager.getMethodBindPtr("Image", "save_png", 2113323047)

    internal val savePngToBufferPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Image", "save_png_to_buffer", 2362200018)

    internal val saveJpgPtr: VoidPtr = TypeManager.getMethodBindPtr("Image", "save_jpg", 2800019068)

    internal val saveJpgToBufferPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Image", "save_jpg_to_buffer", 592235273)

    internal val saveExrPtr: VoidPtr = TypeManager.getMethodBindPtr("Image", "save_exr", 3108122999)

    internal val saveExrToBufferPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Image", "save_exr_to_buffer", 3178917920)

    internal val saveWebpPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Image", "save_webp", 2781156876)

    internal val saveWebpToBufferPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Image", "save_webp_to_buffer", 1214628238)

    internal val detectAlphaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Image", "detect_alpha", 2030116505)

    internal val isInvisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Image", "is_invisible", 36873697)

    internal val detectUsedChannelsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Image", "detect_used_channels", 2703139984)

    internal val compressPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Image", "compress", 2975424957)

    internal val compressFromChannelsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Image", "compress_from_channels", 4212890953)

    internal val decompressPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Image", "decompress", 166280745)

    internal val isCompressedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Image", "is_compressed", 36873697)

    internal val rotate90Ptr: VoidPtr =
        TypeManager.getMethodBindPtr("Image", "rotate_90", 1901204267)

    internal val rotate180Ptr: VoidPtr =
        TypeManager.getMethodBindPtr("Image", "rotate_180", 3218959716)

    internal val fixAlphaEdgesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Image", "fix_alpha_edges", 3218959716)

    internal val premultiplyAlphaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Image", "premultiply_alpha", 3218959716)

    internal val srgbToLinearPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Image", "srgb_to_linear", 3218959716)

    internal val linearToSrgbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Image", "linear_to_srgb", 3218959716)

    internal val normalMapToXyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Image", "normal_map_to_xy", 3218959716)

    internal val rgbeToSrgbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Image", "rgbe_to_srgb", 564927088)

    internal val bumpMapToNormalMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Image", "bump_map_to_normal_map", 3423495036)

    internal val computeImageMetricsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Image", "compute_image_metrics", 3080961247)

    internal val blitRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Image", "blit_rect", 2903928755)

    internal val blitRectMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Image", "blit_rect_mask", 3383581145)

    internal val blendRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Image", "blend_rect", 2903928755)

    internal val blendRectMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Image", "blend_rect_mask", 3383581145)

    internal val fillPtr: VoidPtr = TypeManager.getMethodBindPtr("Image", "fill", 2920490490)

    internal val fillRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Image", "fill_rect", 514693913)

    internal val getUsedRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Image", "get_used_rect", 410525958)

    internal val getRegionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Image", "get_region", 2601441065)

    internal val copyFromPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Image", "copy_from", 532598488)

    internal val getPixelvPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Image", "get_pixelv", 1532707496)

    internal val getPixelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Image", "get_pixel", 2165839948)

    internal val setPixelvPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Image", "set_pixelv", 287851464)

    internal val setPixelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Image", "set_pixel", 3733378741)

    internal val adjustBcsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Image", "adjust_bcs", 2385087082)

    internal val loadPngFromBufferPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Image", "load_png_from_buffer", 680677267)

    internal val loadJpgFromBufferPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Image", "load_jpg_from_buffer", 680677267)

    internal val loadWebpFromBufferPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Image", "load_webp_from_buffer", 680677267)

    internal val loadTgaFromBufferPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Image", "load_tga_from_buffer", 680677267)

    internal val loadBmpFromBufferPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Image", "load_bmp_from_buffer", 680677267)

    internal val loadKtxFromBufferPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Image", "load_ktx_from_buffer", 680677267)

    internal val loadSvgFromBufferPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Image", "load_svg_from_buffer", 311853421)

    internal val loadSvgFromStringPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Image", "load_svg_from_string", 3254053600)
  }
}
