// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.OBJECT
import godot.core.VariantType.VECTOR2
import godot.core.VariantType.VECTOR3
import godot.core.Vector2
import godot.core.Vector3
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

/**
 * This class defines the interface for noise generation libraries to inherit from.
 * A default [getSeamlessImage] implementation is provided for libraries that do not provide
 * seamless noise. This function requests a larger image from the [getImage] method, reverses the
 * quadrants of the image, then uses the strips of extra width to blend over the seams.
 * Inheriting noise classes can optionally override this function to provide a more optimal
 * algorithm.
 */
@GodotBaseType
public open class Noise internal constructor() : Resource() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_NOISE, scriptIndex)
    return true
  }

  /**
   * Returns the 1D noise value at the given (x) coordinate.
   */
  public fun getNoise1d(x: Float): Float {
    TransferContext.writeArguments(DOUBLE to x.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.getNoise1dPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns the 2D noise value at the given position.
   */
  public fun getNoise2d(x: Float, y: Float): Float {
    TransferContext.writeArguments(DOUBLE to x.toDouble(), DOUBLE to y.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.getNoise2dPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns the 2D noise value at the given position.
   */
  public fun getNoise2dv(v: Vector2): Float {
    TransferContext.writeArguments(VECTOR2 to v)
    TransferContext.callMethod(rawPtr, MethodBindings.getNoise2dvPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns the 3D noise value at the given position.
   */
  public fun getNoise3d(
    x: Float,
    y: Float,
    z: Float,
  ): Float {
    TransferContext.writeArguments(DOUBLE to x.toDouble(), DOUBLE to y.toDouble(), DOUBLE to z.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.getNoise3dPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns the 3D noise value at the given position.
   */
  public fun getNoise3dv(v: Vector3): Float {
    TransferContext.writeArguments(VECTOR3 to v)
    TransferContext.callMethod(rawPtr, MethodBindings.getNoise3dvPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns an [Image] containing 2D noise values.
   * **Note:** With [normalize] set to `false`, the default implementation expects the noise
   * generator to return values in the range `-1.0` to `1.0`.
   */
  @JvmOverloads
  public fun getImage(
    width: Int,
    height: Int,
    invert: Boolean = false,
    in3dSpace: Boolean = false,
    normalize: Boolean = true,
  ): Image? {
    TransferContext.writeArguments(LONG to width.toLong(), LONG to height.toLong(), BOOL to invert, BOOL to in3dSpace, BOOL to normalize)
    TransferContext.callMethod(rawPtr, MethodBindings.getImagePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Image?)
  }

  /**
   * Returns an [Image] containing seamless 2D noise values.
   * **Note:** With [normalize] set to `false`, the default implementation expects the noise
   * generator to return values in the range `-1.0` to `1.0`.
   */
  @JvmOverloads
  public fun getSeamlessImage(
    width: Int,
    height: Int,
    invert: Boolean = false,
    in3dSpace: Boolean = false,
    skirt: Float = 0.1f,
    normalize: Boolean = true,
  ): Image? {
    TransferContext.writeArguments(LONG to width.toLong(), LONG to height.toLong(), BOOL to invert, BOOL to in3dSpace, DOUBLE to skirt.toDouble(), BOOL to normalize)
    TransferContext.callMethod(rawPtr, MethodBindings.getSeamlessImagePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Image?)
  }

  /**
   * Returns an [Array] of [Image]s containing 3D noise values for use with [ImageTexture3D.create].
   * **Note:** With [normalize] set to `false`, the default implementation expects the noise
   * generator to return values in the range `-1.0` to `1.0`.
   */
  @JvmOverloads
  public fun getImage3d(
    width: Int,
    height: Int,
    depth: Int,
    invert: Boolean = false,
    normalize: Boolean = true,
  ): VariantArray<Image> {
    TransferContext.writeArguments(LONG to width.toLong(), LONG to height.toLong(), LONG to depth.toLong(), BOOL to invert, BOOL to normalize)
    TransferContext.callMethod(rawPtr, MethodBindings.getImage3dPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Image>)
  }

  /**
   * Returns an [Array] of [Image]s containing seamless 3D noise values for use with
   * [ImageTexture3D.create].
   * **Note:** With [normalize] set to `false`, the default implementation expects the noise
   * generator to return values in the range `-1.0` to `1.0`.
   */
  @JvmOverloads
  public fun getSeamlessImage3d(
    width: Int,
    height: Int,
    depth: Int,
    invert: Boolean = false,
    skirt: Float = 0.1f,
    normalize: Boolean = true,
  ): VariantArray<Image> {
    TransferContext.writeArguments(LONG to width.toLong(), LONG to height.toLong(), LONG to depth.toLong(), BOOL to invert, DOUBLE to skirt.toDouble(), BOOL to normalize)
    TransferContext.callMethod(rawPtr, MethodBindings.getSeamlessImage3dPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Image>)
  }

  public companion object

  internal object MethodBindings {
    public val getNoise1dPtr: VoidPtr = TypeManager.getMethodBindPtr("Noise", "get_noise_1d")

    public val getNoise2dPtr: VoidPtr = TypeManager.getMethodBindPtr("Noise", "get_noise_2d")

    public val getNoise2dvPtr: VoidPtr = TypeManager.getMethodBindPtr("Noise", "get_noise_2dv")

    public val getNoise3dPtr: VoidPtr = TypeManager.getMethodBindPtr("Noise", "get_noise_3d")

    public val getNoise3dvPtr: VoidPtr = TypeManager.getMethodBindPtr("Noise", "get_noise_3dv")

    public val getImagePtr: VoidPtr = TypeManager.getMethodBindPtr("Noise", "get_image")

    public val getSeamlessImagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Noise", "get_seamless_image")

    public val getImage3dPtr: VoidPtr = TypeManager.getMethodBindPtr("Noise", "get_image_3d")

    public val getSeamlessImage3dPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Noise", "get_seamless_image_3d")
  }
}
