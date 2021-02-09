// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.Image
import godot.annotation.GodotBaseType
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
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class Image : Resource() {
  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_IMAGE)

  open fun _get_data(): Dictionary<Any?, Any?> {
    throw NotImplementedError("_get_data is not implemented for Image")
  }

  open fun _set_data(data: Dictionary<Any?, Any?>) {
  }

  open fun blendRect(
    src: Image,
    srcRect: Rect2,
    dst: Vector2
  ) {
    TransferContext.writeArguments(OBJECT to src, RECT2 to srcRect, VECTOR2 to dst)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_BLEND_RECT, NIL)
  }

  open fun blendRectMask(
    src: Image,
    mask: Image,
    srcRect: Rect2,
    dst: Vector2
  ) {
    TransferContext.writeArguments(OBJECT to src, OBJECT to mask, RECT2 to srcRect, VECTOR2 to dst)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_BLEND_RECT_MASK, NIL)
  }

  open fun blitRect(
    src: Image,
    srcRect: Rect2,
    dst: Vector2
  ) {
    TransferContext.writeArguments(OBJECT to src, RECT2 to srcRect, VECTOR2 to dst)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_BLIT_RECT, NIL)
  }

  open fun blitRectMask(
    src: Image,
    mask: Image,
    srcRect: Rect2,
    dst: Vector2
  ) {
    TransferContext.writeArguments(OBJECT to src, OBJECT to mask, RECT2 to srcRect, VECTOR2 to dst)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_BLIT_RECT_MASK, NIL)
  }

  open fun bumpmapToNormalmap(bumpScale: Double = 1.0) {
    TransferContext.writeArguments(DOUBLE to bumpScale)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_BUMPMAP_TO_NORMALMAP, NIL)
  }

  open fun clearMipmaps() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_CLEAR_MIPMAPS, NIL)
  }

  open fun compress(
    mode: Long,
    source: Long,
    lossyQuality: Double
  ): GodotError {
    TransferContext.writeArguments(LONG to mode, LONG to source, DOUBLE to lossyQuality)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_COMPRESS, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun convert(format: Long) {
    TransferContext.writeArguments(LONG to format)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_CONVERT, NIL)
  }

  open fun copyFrom(src: Image) {
    TransferContext.writeArguments(OBJECT to src)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_COPY_FROM, NIL)
  }

  open fun create(
    width: Long,
    height: Long,
    useMipmaps: Boolean,
    format: Long
  ) {
    TransferContext.writeArguments(LONG to width, LONG to height, BOOL to useMipmaps, LONG to
        format)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_CREATE, NIL)
  }

  open fun createFromData(
    width: Long,
    height: Long,
    useMipmaps: Boolean,
    format: Long,
    data: PoolByteArray
  ) {
    TransferContext.writeArguments(LONG to width, LONG to height, BOOL to useMipmaps, LONG to
        format, POOL_BYTE_ARRAY to data)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_CREATE_FROM_DATA, NIL)
  }

  open fun crop(width: Long, height: Long) {
    TransferContext.writeArguments(LONG to width, LONG to height)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_CROP, NIL)
  }

  open fun decompress(): GodotError {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_DECOMPRESS, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun detectAlpha(): Image.AlphaMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_DETECT_ALPHA, LONG)
    return Image.AlphaMode.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun expandX2Hq2x() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_EXPAND_X2_HQ2X, NIL)
  }

  open fun fill(color: Color) {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_FILL, NIL)
  }

  open fun fixAlphaEdges() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_FIX_ALPHA_EDGES, NIL)
  }

  open fun flipX() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_FLIP_X, NIL)
  }

  open fun flipY() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_FLIP_Y, NIL)
  }

  open fun generateMipmaps(renormalize: Boolean = false): GodotError {
    TransferContext.writeArguments(BOOL to renormalize)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_GENERATE_MIPMAPS, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun getData(): PoolByteArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_GET_DATA, POOL_BYTE_ARRAY)
    return TransferContext.readReturnValue(POOL_BYTE_ARRAY, false) as PoolByteArray
  }

  open fun getFormat(): Image.Format {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_GET_FORMAT, LONG)
    return Image.Format.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun getHeight(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_GET_HEIGHT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getMipmapOffset(mipmap: Long): Long {
    TransferContext.writeArguments(LONG to mipmap)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_GET_MIPMAP_OFFSET, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getPixel(x: Long, y: Long): Color {
    TransferContext.writeArguments(LONG to x, LONG to y)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_GET_PIXEL, COLOR)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  open fun getPixelv(src: Vector2): Color {
    TransferContext.writeArguments(VECTOR2 to src)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_GET_PIXELV, COLOR)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  open fun getRect(rect: Rect2): Image? {
    TransferContext.writeArguments(RECT2 to rect)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_GET_RECT, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Image?
  }

  open fun getSize(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_GET_SIZE, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  open fun getUsedRect(): Rect2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_GET_USED_RECT, RECT2)
    return TransferContext.readReturnValue(RECT2, false) as Rect2
  }

  open fun getWidth(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_GET_WIDTH, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun hasMipmaps(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_HAS_MIPMAPS, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun isCompressed(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_IS_COMPRESSED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun isEmpty(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_IS_EMPTY, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun isInvisible(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_IS_INVISIBLE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun load(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_LOAD, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun loadJpgFromBuffer(buffer: PoolByteArray): GodotError {
    TransferContext.writeArguments(POOL_BYTE_ARRAY to buffer)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_LOAD_JPG_FROM_BUFFER, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun loadPngFromBuffer(buffer: PoolByteArray): GodotError {
    TransferContext.writeArguments(POOL_BYTE_ARRAY to buffer)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_LOAD_PNG_FROM_BUFFER, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun loadWebpFromBuffer(buffer: PoolByteArray): GodotError {
    TransferContext.writeArguments(POOL_BYTE_ARRAY to buffer)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_LOAD_WEBP_FROM_BUFFER, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun lock() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_LOCK, NIL)
  }

  open fun normalmapToXy() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_NORMALMAP_TO_XY, NIL)
  }

  open fun premultiplyAlpha() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_PREMULTIPLY_ALPHA, NIL)
  }

  open fun resize(
    width: Long,
    height: Long,
    interpolation: Long = 1
  ) {
    TransferContext.writeArguments(LONG to width, LONG to height, LONG to interpolation)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_RESIZE, NIL)
  }

  open fun resizeToPo2(square: Boolean = false) {
    TransferContext.writeArguments(BOOL to square)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_RESIZE_TO_PO2, NIL)
  }

  open fun rgbeToSrgb(): Image? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_RGBE_TO_SRGB, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Image?
  }

  open fun saveExr(path: String, grayscale: Boolean = false): GodotError {
    TransferContext.writeArguments(STRING to path, BOOL to grayscale)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_SAVE_EXR, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun savePng(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_SAVE_PNG, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun savePngToBuffer(): PoolByteArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_SAVE_PNG_TO_BUFFER,
        POOL_BYTE_ARRAY)
    return TransferContext.readReturnValue(POOL_BYTE_ARRAY, false) as PoolByteArray
  }

  open fun setPixel(
    x: Long,
    y: Long,
    color: Color
  ) {
    TransferContext.writeArguments(LONG to x, LONG to y, COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_SET_PIXEL, NIL)
  }

  open fun setPixelv(dst: Vector2, color: Color) {
    TransferContext.writeArguments(VECTOR2 to dst, COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_SET_PIXELV, NIL)
  }

  open fun shrinkX2() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_SHRINK_X2, NIL)
  }

  open fun srgbToLinear() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_SRGB_TO_LINEAR, NIL)
  }

  open fun unlock() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGE_UNLOCK, NIL)
  }

  enum class AlphaMode(
    id: Long
  ) {
    ALPHA_NONE(0),

    ALPHA_BIT(1),

    ALPHA_BLEND(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class CompressSource(
    id: Long
  ) {
    COMPRESS_SOURCE_GENERIC(0),

    COMPRESS_SOURCE_SRGB(1),

    COMPRESS_SOURCE_NORMAL(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class Interpolation(
    id: Long
  ) {
    INTERPOLATE_NEAREST(0),

    INTERPOLATE_BILINEAR(1),

    INTERPOLATE_CUBIC(2),

    INTERPOLATE_TRILINEAR(3),

    INTERPOLATE_LANCZOS(4);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class CompressMode(
    id: Long
  ) {
    COMPRESS_S3TC(0),

    COMPRESS_PVRTC2(1),

    COMPRESS_PVRTC4(2),

    COMPRESS_ETC(3),

    COMPRESS_ETC2(4);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class Format(
    id: Long
  ) {
    FORMAT_L8(0),

    FORMAT_LA8(1),

    FORMAT_R8(2),

    FORMAT_RG8(3),

    FORMAT_RGB8(4),

    FORMAT_RGBA8(5),

    FORMAT_RGBA4444(6),

    FORMAT_RGBA5551(7),

    FORMAT_RF(8),

    FORMAT_RGF(9),

    FORMAT_RGBF(10),

    FORMAT_RGBAF(11),

    FORMAT_RH(12),

    FORMAT_RGH(13),

    FORMAT_RGBH(14),

    FORMAT_RGBAH(15),

    FORMAT_RGBE9995(16),

    FORMAT_DXT1(17),

    FORMAT_DXT3(18),

    FORMAT_DXT5(19),

    FORMAT_RGTC_R(20),

    FORMAT_RGTC_RG(21),

    FORMAT_BPTC_RGBA(22),

    FORMAT_BPTC_RGBF(23),

    FORMAT_BPTC_RGBFU(24),

    FORMAT_PVRTC2(25),

    FORMAT_PVRTC2A(26),

    FORMAT_PVRTC4(27),

    FORMAT_PVRTC4A(28),

    FORMAT_ETC(29),

    FORMAT_ETC2_R11(30),

    FORMAT_ETC2_R11S(31),

    FORMAT_ETC2_RG11(32),

    FORMAT_ETC2_RG11S(33),

    FORMAT_ETC2_RGB8(34),

    FORMAT_ETC2_RGBA8(35),

    FORMAT_ETC2_RGB8A1(36),

    FORMAT_MAX(37);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val ALPHA_BIT: Long = 1

    final const val ALPHA_BLEND: Long = 2

    final const val ALPHA_NONE: Long = 0

    final const val COMPRESS_ETC: Long = 3

    final const val COMPRESS_ETC2: Long = 4

    final const val COMPRESS_PVRTC2: Long = 1

    final const val COMPRESS_PVRTC4: Long = 2

    final const val COMPRESS_S3TC: Long = 0

    final const val COMPRESS_SOURCE_GENERIC: Long = 0

    final const val COMPRESS_SOURCE_NORMAL: Long = 2

    final const val COMPRESS_SOURCE_SRGB: Long = 1

    final const val FORMAT_BPTC_RGBA: Long = 22

    final const val FORMAT_BPTC_RGBF: Long = 23

    final const val FORMAT_BPTC_RGBFU: Long = 24

    final const val FORMAT_DXT1: Long = 17

    final const val FORMAT_DXT3: Long = 18

    final const val FORMAT_DXT5: Long = 19

    final const val FORMAT_ETC: Long = 29

    final const val FORMAT_ETC2_R11: Long = 30

    final const val FORMAT_ETC2_R11S: Long = 31

    final const val FORMAT_ETC2_RG11: Long = 32

    final const val FORMAT_ETC2_RG11S: Long = 33

    final const val FORMAT_ETC2_RGB8: Long = 34

    final const val FORMAT_ETC2_RGB8A1: Long = 36

    final const val FORMAT_ETC2_RGBA8: Long = 35

    final const val FORMAT_L8: Long = 0

    final const val FORMAT_LA8: Long = 1

    final const val FORMAT_MAX: Long = 37

    final const val FORMAT_PVRTC2: Long = 25

    final const val FORMAT_PVRTC2A: Long = 26

    final const val FORMAT_PVRTC4: Long = 27

    final const val FORMAT_PVRTC4A: Long = 28

    final const val FORMAT_R8: Long = 2

    final const val FORMAT_RF: Long = 8

    final const val FORMAT_RG8: Long = 3

    final const val FORMAT_RGB8: Long = 4

    final const val FORMAT_RGBA4444: Long = 6

    final const val FORMAT_RGBA5551: Long = 7

    final const val FORMAT_RGBA8: Long = 5

    final const val FORMAT_RGBAF: Long = 11

    final const val FORMAT_RGBAH: Long = 15

    final const val FORMAT_RGBE9995: Long = 16

    final const val FORMAT_RGBF: Long = 10

    final const val FORMAT_RGBH: Long = 14

    final const val FORMAT_RGF: Long = 9

    final const val FORMAT_RGH: Long = 13

    final const val FORMAT_RGTC_R: Long = 20

    final const val FORMAT_RGTC_RG: Long = 21

    final const val FORMAT_RH: Long = 12

    final const val INTERPOLATE_BILINEAR: Long = 1

    final const val INTERPOLATE_CUBIC: Long = 2

    final const val INTERPOLATE_LANCZOS: Long = 4

    final const val INTERPOLATE_NEAREST: Long = 0

    final const val INTERPOLATE_TRILINEAR: Long = 3

    final const val MAX_HEIGHT: Long = 16384

    final const val MAX_WIDTH: Long = 16384
  }
}
