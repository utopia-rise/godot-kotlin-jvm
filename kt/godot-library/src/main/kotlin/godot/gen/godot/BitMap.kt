// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.Dictionary
import godot.core.Rect2
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.RECT2
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress

/**
 * Boolean matrix.
 *
 * A two-dimensional array of boolean values, can be used to efficiently store a binary matrix (every matrix element takes only one bit) and query the values using natural cartesian coordinates.
 */
@GodotBaseType
open class BitMap : Resource() {
  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_BITMAP)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  open fun _getData(): Dictionary<Any?, Any?> {
    throw NotImplementedError("_get_data is not implemented for BitMap")
  }

  open fun _setData(arg0: Dictionary<Any?, Any?>) {
  }

  /**
   * Creates a bitmap with the specified size, filled with `false`.
   */
  open fun create(size: Vector2) {
    TransferContext.writeArguments(VECTOR2 to size)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BITMAP_CREATE, NIL)
  }

  /**
   * Creates a bitmap that matches the given image dimensions, every element of the bitmap is set to `false` if the alpha value of the image at that position is equal to `threshold` or less, and `true` in other case.
   */
  open fun createFromImageAlpha(image: Image, threshold: Double = 0.1) {
    TransferContext.writeArguments(OBJECT to image, DOUBLE to threshold)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BITMAP_CREATE_FROM_IMAGE_ALPHA, NIL)
  }

  /**
   * Returns bitmap's value at the specified position.
   */
  open fun getBit(position: Vector2): Boolean {
    TransferContext.writeArguments(VECTOR2 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BITMAP_GET_BIT, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns bitmap's dimensions.
   */
  open fun getSize(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BITMAP_GET_SIZE, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the amount of bitmap elements that are set to `true`.
   */
  open fun getTrueBitCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BITMAP_GET_TRUE_BIT_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Applies morphological dilation to the bitmap. The first argument is the dilation amount, Rect2 is the area where the dilation will be applied.
   */
  open fun growMask(pixels: Long, rect: Rect2) {
    TransferContext.writeArguments(LONG to pixels, RECT2 to rect)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BITMAP_GROW_MASK, NIL)
  }

  /**
   *
   */
  open fun opaqueToPolygons(rect: Rect2, epsilon: Double = 2.0): VariantArray<Any?> {
    TransferContext.writeArguments(RECT2 to rect, DOUBLE to epsilon)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BITMAP_OPAQUE_TO_POLYGONS, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Sets the bitmap's element at the specified position, to the specified value.
   */
  open fun setBit(position: Vector2, bit: Boolean) {
    TransferContext.writeArguments(VECTOR2 to position, BOOL to bit)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BITMAP_SET_BIT, NIL)
  }

  /**
   * Sets a rectangular portion of the bitmap to the specified value.
   */
  open fun setBitRect(rect: Rect2, bit: Boolean) {
    TransferContext.writeArguments(RECT2 to rect, BOOL to bit)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BITMAP_SET_BIT_RECT, NIL)
  }
}
