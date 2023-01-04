// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedVector2Array
import godot.core.Rect2i
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.RECT2I
import godot.core.VariantType.VECTOR2I
import godot.core.Vector2i
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Boolean matrix.
 *
 * A two-dimensional array of boolean values, can be used to efficiently store a binary matrix (every matrix element takes only one bit) and query the values using natural cartesian coordinates.
 */
@GodotBaseType
public open class BitMap : Resource() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_BITMAP, scriptIndex)
    return true
  }

  /**
   * Creates a bitmap with the specified size, filled with `false`.
   */
  public fun create(size: Vector2i): Unit {
    TransferContext.writeArguments(VECTOR2I to size)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BITMAP_CREATE, NIL)
  }

  /**
   * Creates a bitmap that matches the given image dimensions, every element of the bitmap is set to `false` if the alpha value of the image at that position is equal to [threshold] or less, and `true` in other case.
   */
  public fun createFromImageAlpha(image: Image, threshold: Double = 0.1): Unit {
    TransferContext.writeArguments(OBJECT to image, DOUBLE to threshold)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BITMAP_CREATE_FROM_IMAGE_ALPHA, NIL)
  }

  /**
   * Sets the bitmap's element at the specified position, to the specified value.
   */
  public fun setBitv(position: Vector2i, bit: Boolean): Unit {
    TransferContext.writeArguments(VECTOR2I to position, BOOL to bit)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BITMAP_SET_BITV, NIL)
  }

  /**
   * Sets the bitmap's element at the specified position, to the specified value.
   */
  public fun setBit(
    x: Long,
    y: Long,
    bit: Boolean
  ): Unit {
    TransferContext.writeArguments(LONG to x, LONG to y, BOOL to bit)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BITMAP_SET_BIT, NIL)
  }

  /**
   * Returns bitmap's value at the specified position.
   */
  public fun getBitv(position: Vector2i): Boolean {
    TransferContext.writeArguments(VECTOR2I to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BITMAP_GET_BITV, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns bitmap's value at the specified position.
   */
  public fun getBit(x: Long, y: Long): Boolean {
    TransferContext.writeArguments(LONG to x, LONG to y)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BITMAP_GET_BIT, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Sets a rectangular portion of the bitmap to the specified value.
   */
  public fun setBitRect(rect: Rect2i, bit: Boolean): Unit {
    TransferContext.writeArguments(RECT2I to rect, BOOL to bit)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BITMAP_SET_BIT_RECT, NIL)
  }

  /**
   * Returns the number of bitmap elements that are set to `true`.
   */
  public fun getTrueBitCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BITMAP_GET_TRUE_BIT_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns bitmap's dimensions.
   */
  public fun getSize(): Vector2i {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BITMAP_GET_SIZE, VECTOR2I)
    return TransferContext.readReturnValue(VECTOR2I, false) as Vector2i
  }

  /**
   * Resizes the image to [newSize].
   */
  public fun resize(newSize: Vector2i): Unit {
    TransferContext.writeArguments(VECTOR2I to newSize)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BITMAP_RESIZE, NIL)
  }

  /**
   * Applies morphological dilation or erosion to the bitmap. If [pixels] is positive, dilation is applied to the bitmap. If [pixels] is negative, erosion is applied to the bitmap. [rect] defines the area where the morphological operation is applied. Pixels located outside the [rect] are unaffected by [growMask].
   */
  public fun growMask(pixels: Long, rect: Rect2i): Unit {
    TransferContext.writeArguments(LONG to pixels, RECT2I to rect)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BITMAP_GROW_MASK, NIL)
  }

  /**
   * Returns an image of the same size as the bitmap and with a [enum Image.Format] of type [godot.Image.FORMAT_L8]. `true` bits of the bitmap are being converted into white pixels, and `false` bits into black.
   */
  public fun convertToImage(): Image? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BITMAP_CONVERT_TO_IMAGE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Image?
  }

  /**
   * Creates an [godot.Array] of polygons covering a rectangular portion of the bitmap. It uses a marching squares algorithm, followed by Ramer-Douglas-Peucker (RDP) reduction of the number of vertices. Each polygon is described as a [godot.PackedVector2Array] of its vertices.
   *
   * To get polygons covering the whole bitmap, pass:
   *
   * ```
   * 				Rect2(Vector2(), get_size())
   * 				```
   *
   * [epsilon] is passed to RDP to control how accurately the polygons cover the bitmap: a lower [epsilon] corresponds to more points in the polygons.
   */
  public fun opaqueToPolygons(rect: Rect2i, epsilon: Double = 2.0):
      VariantArray<PackedVector2Array> {
    TransferContext.writeArguments(RECT2I to rect, DOUBLE to epsilon)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BITMAP_OPAQUE_TO_POLYGONS, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<PackedVector2Array>
  }

  public companion object
}
