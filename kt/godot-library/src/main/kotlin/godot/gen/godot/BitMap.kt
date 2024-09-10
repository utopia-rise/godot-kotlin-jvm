// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedVector2Array
import godot.core.Rect2i
import godot.core.TypeManager
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
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * A two-dimensional array of boolean values, can be used to efficiently store a binary matrix
 * (every matrix element takes only one bit) and query the values using natural cartesian coordinates.
 */
@GodotBaseType
public open class BitMap : Resource() {
  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_BITMAP, scriptIndex)
  }

  /**
   * Creates a bitmap with the specified size, filled with `false`.
   */
  public fun create(size: Vector2i): Unit {
    TransferContext.writeArguments(VECTOR2I to size)
    TransferContext.callMethod(rawPtr, MethodBindings.createPtr, NIL)
  }

  /**
   * Creates a bitmap that matches the given image dimensions, every element of the bitmap is set to
   * `false` if the alpha value of the image at that position is equal to [threshold] or less, and
   * `true` in other case.
   */
  @JvmOverloads
  public fun createFromImageAlpha(image: Image?, threshold: Float = 0.1f): Unit {
    TransferContext.writeArguments(OBJECT to image, DOUBLE to threshold.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.createFromImageAlphaPtr, NIL)
  }

  /**
   * Sets the bitmap's element at the specified position, to the specified value.
   */
  public fun setBitv(position: Vector2i, bit: Boolean): Unit {
    TransferContext.writeArguments(VECTOR2I to position, BOOL to bit)
    TransferContext.callMethod(rawPtr, MethodBindings.setBitvPtr, NIL)
  }

  /**
   * Sets the bitmap's element at the specified position, to the specified value.
   */
  public fun setBit(
    x: Int,
    y: Int,
    bit: Boolean,
  ): Unit {
    TransferContext.writeArguments(LONG to x.toLong(), LONG to y.toLong(), BOOL to bit)
    TransferContext.callMethod(rawPtr, MethodBindings.setBitPtr, NIL)
  }

  /**
   * Returns bitmap's value at the specified position.
   */
  public fun getBitv(position: Vector2i): Boolean {
    TransferContext.writeArguments(VECTOR2I to position)
    TransferContext.callMethod(rawPtr, MethodBindings.getBitvPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns bitmap's value at the specified position.
   */
  public fun getBit(x: Int, y: Int): Boolean {
    TransferContext.writeArguments(LONG to x.toLong(), LONG to y.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getBitPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Sets a rectangular portion of the bitmap to the specified value.
   */
  public fun setBitRect(rect: Rect2i, bit: Boolean): Unit {
    TransferContext.writeArguments(RECT2I to rect, BOOL to bit)
    TransferContext.callMethod(rawPtr, MethodBindings.setBitRectPtr, NIL)
  }

  /**
   * Returns the number of bitmap elements that are set to `true`.
   */
  public fun getTrueBitCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTrueBitCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns bitmap's dimensions.
   */
  public fun getSize(): Vector2i {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSizePtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
  }

  /**
   * Resizes the image to [newSize].
   */
  public fun resize(newSize: Vector2i): Unit {
    TransferContext.writeArguments(VECTOR2I to newSize)
    TransferContext.callMethod(rawPtr, MethodBindings.resizePtr, NIL)
  }

  /**
   * Applies morphological dilation or erosion to the bitmap. If [pixels] is positive, dilation is
   * applied to the bitmap. If [pixels] is negative, erosion is applied to the bitmap. [rect] defines
   * the area where the morphological operation is applied. Pixels located outside the [rect] are
   * unaffected by [growMask].
   */
  public fun growMask(pixels: Int, rect: Rect2i): Unit {
    TransferContext.writeArguments(LONG to pixels.toLong(), RECT2I to rect)
    TransferContext.callMethod(rawPtr, MethodBindings.growMaskPtr, NIL)
  }

  /**
   * Returns an image of the same size as the bitmap and with a [Image.Format] of type
   * [Image.FORMAT_L8]. `true` bits of the bitmap are being converted into white pixels, and `false`
   * bits into black.
   */
  public fun convertToImage(): Image? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.convertToImagePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Image?)
  }

  /**
   * Creates an [Array] of polygons covering a rectangular portion of the bitmap. It uses a marching
   * squares algorithm, followed by Ramer-Douglas-Peucker (RDP) reduction of the number of vertices.
   * Each polygon is described as a [PackedVector2Array] of its vertices.
   * To get polygons covering the whole bitmap, pass:
   * [codeblock]
   * Rect2(Vector2(), get_size())
   * [/codeblock]
   * [epsilon] is passed to RDP to control how accurately the polygons cover the bitmap: a lower
   * [epsilon] corresponds to more points in the polygons.
   */
  @JvmOverloads
  public fun opaqueToPolygons(rect: Rect2i, epsilon: Float = 2.0f):
      VariantArray<PackedVector2Array> {
    TransferContext.writeArguments(RECT2I to rect, DOUBLE to epsilon.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.opaqueToPolygonsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<PackedVector2Array>)
  }

  public companion object

  internal object MethodBindings {
    public val createPtr: VoidPtr = TypeManager.getMethodBindPtr("BitMap", "create", 1130785943)

    public val createFromImageAlphaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BitMap", "create_from_image_alpha", 106271684)

    public val setBitvPtr: VoidPtr = TypeManager.getMethodBindPtr("BitMap", "set_bitv", 4153096796)

    public val setBitPtr: VoidPtr = TypeManager.getMethodBindPtr("BitMap", "set_bit", 1383440665)

    public val getBitvPtr: VoidPtr = TypeManager.getMethodBindPtr("BitMap", "get_bitv", 3900751641)

    public val getBitPtr: VoidPtr = TypeManager.getMethodBindPtr("BitMap", "get_bit", 2522259332)

    public val setBitRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BitMap", "set_bit_rect", 472162941)

    public val getTrueBitCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BitMap", "get_true_bit_count", 3905245786)

    public val getSizePtr: VoidPtr = TypeManager.getMethodBindPtr("BitMap", "get_size", 3690982128)

    public val resizePtr: VoidPtr = TypeManager.getMethodBindPtr("BitMap", "resize", 1130785943)

    public val growMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BitMap", "grow_mask", 3317281434)

    public val convertToImagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BitMap", "convert_to_image", 4190603485)

    public val opaqueToPolygonsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BitMap", "opaque_to_polygons", 48478126)
  }
}
