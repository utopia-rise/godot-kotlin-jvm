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
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress

@GodotBaseType
open class BitMap : Resource() {
  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_BITMAP)

  open fun _get_data(): Dictionary<Any?, Any?> {
    throw NotImplementedError("_get_data is not implemented for BitMap")
  }

  open fun _set_data(arg0: Dictionary<Any?, Any?>) {
  }

  open fun create(size: Vector2) {
    TransferContext.writeArguments(VECTOR2 to size)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BITMAP_CREATE, NIL)
  }

  open fun createFromImageAlpha(image: Image, threshold: Double = 0.1) {
    TransferContext.writeArguments(OBJECT to image, DOUBLE to threshold)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BITMAP_CREATE_FROM_IMAGE_ALPHA, NIL)
  }

  open fun getBit(position: Vector2): Boolean {
    TransferContext.writeArguments(VECTOR2 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BITMAP_GET_BIT, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun getSize(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BITMAP_GET_SIZE, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  open fun getTrueBitCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BITMAP_GET_TRUE_BIT_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun growMask(pixels: Long, rect: Rect2) {
    TransferContext.writeArguments(LONG to pixels, RECT2 to rect)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BITMAP_GROW_MASK, NIL)
  }

  open fun opaqueToPolygons(rect: Rect2, epsilon: Double = 2.0): VariantArray<Any?> {
    TransferContext.writeArguments(RECT2 to rect, DOUBLE to epsilon)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BITMAP_OPAQUE_TO_POLYGONS, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  open fun setBit(position: Vector2, bit: Boolean) {
    TransferContext.writeArguments(VECTOR2 to position, BOOL to bit)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BITMAP_SET_BIT, NIL)
  }

  open fun setBitRect(rect: Rect2, bit: Boolean) {
    TransferContext.writeArguments(RECT2 to rect, BOOL to bit)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BITMAP_SET_BIT_RECT, NIL)
  }

  companion object
}
