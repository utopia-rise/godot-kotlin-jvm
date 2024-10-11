// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.VECTOR2
import godot.core.VariantParser.VECTOR3
import godot.core.Vector2
import godot.core.Vector3
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

private const val ENGINE_CLASS_NOISE_INDEX: Int = 409

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
  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_NOISE_INDEX, scriptIndex)
  }

  /**
   * Returns the 1D noise value at the given (x) coordinate.
   */
  public final fun getNoise1d(x: Float): Float {
    Internals.writeArguments(DOUBLE to x.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.getNoise1dPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns the 2D noise value at the given position.
   */
  public final fun getNoise2d(x: Float, y: Float): Float {
    Internals.writeArguments(DOUBLE to x.toDouble(), DOUBLE to y.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.getNoise2dPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns the 2D noise value at the given position.
   */
  public final fun getNoise2dv(v: Vector2): Float {
    Internals.writeArguments(VECTOR2 to v)
    Internals.callMethod(rawPtr, MethodBindings.getNoise2dvPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns the 3D noise value at the given position.
   */
  public final fun getNoise3d(
    x: Float,
    y: Float,
    z: Float,
  ): Float {
    Internals.writeArguments(DOUBLE to x.toDouble(), DOUBLE to y.toDouble(), DOUBLE to z.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.getNoise3dPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns the 3D noise value at the given position.
   */
  public final fun getNoise3dv(v: Vector3): Float {
    Internals.writeArguments(VECTOR3 to v)
    Internals.callMethod(rawPtr, MethodBindings.getNoise3dvPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns an [Image] containing 2D noise values.
   * **Note:** With [normalize] set to `false`, the default implementation expects the noise
   * generator to return values in the range `-1.0` to `1.0`.
   */
  @JvmOverloads
  public final fun getImage(
    width: Int,
    height: Int,
    invert: Boolean = false,
    in3dSpace: Boolean = false,
    normalize: Boolean = true,
  ): Image? {
    Internals.writeArguments(LONG to width.toLong(), LONG to height.toLong(), BOOL to invert, BOOL to in3dSpace, BOOL to normalize)
    Internals.callMethod(rawPtr, MethodBindings.getImagePtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Image?)
  }

  /**
   * Returns an [Image] containing seamless 2D noise values.
   * **Note:** With [normalize] set to `false`, the default implementation expects the noise
   * generator to return values in the range `-1.0` to `1.0`.
   */
  @JvmOverloads
  public final fun getSeamlessImage(
    width: Int,
    height: Int,
    invert: Boolean = false,
    in3dSpace: Boolean = false,
    skirt: Float = 0.1f,
    normalize: Boolean = true,
  ): Image? {
    Internals.writeArguments(LONG to width.toLong(), LONG to height.toLong(), BOOL to invert, BOOL to in3dSpace, DOUBLE to skirt.toDouble(), BOOL to normalize)
    Internals.callMethod(rawPtr, MethodBindings.getSeamlessImagePtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Image?)
  }

  /**
   * Returns an [Array] of [Image]s containing 3D noise values for use with [ImageTexture3D.create].
   * **Note:** With [normalize] set to `false`, the default implementation expects the noise
   * generator to return values in the range `-1.0` to `1.0`.
   */
  @JvmOverloads
  public final fun getImage3d(
    width: Int,
    height: Int,
    depth: Int,
    invert: Boolean = false,
    normalize: Boolean = true,
  ): VariantArray<Image> {
    Internals.writeArguments(LONG to width.toLong(), LONG to height.toLong(), LONG to depth.toLong(), BOOL to invert, BOOL to normalize)
    Internals.callMethod(rawPtr, MethodBindings.getImage3dPtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<Image>)
  }

  /**
   * Returns an [Array] of [Image]s containing seamless 3D noise values for use with
   * [ImageTexture3D.create].
   * **Note:** With [normalize] set to `false`, the default implementation expects the noise
   * generator to return values in the range `-1.0` to `1.0`.
   */
  @JvmOverloads
  public final fun getSeamlessImage3d(
    width: Int,
    height: Int,
    depth: Int,
    invert: Boolean = false,
    skirt: Float = 0.1f,
    normalize: Boolean = true,
  ): VariantArray<Image> {
    Internals.writeArguments(LONG to width.toLong(), LONG to height.toLong(), LONG to depth.toLong(), BOOL to invert, DOUBLE to skirt.toDouble(), BOOL to normalize)
    Internals.callMethod(rawPtr, MethodBindings.getSeamlessImage3dPtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<Image>)
  }

  public companion object

  public object MethodBindings {
    internal val getNoise1dPtr: VoidPtr =
        Internals.getMethodBindPtr("Noise", "get_noise_1d", 3919130443)

    internal val getNoise2dPtr: VoidPtr =
        Internals.getMethodBindPtr("Noise", "get_noise_2d", 2753205203)

    internal val getNoise2dvPtr: VoidPtr =
        Internals.getMethodBindPtr("Noise", "get_noise_2dv", 2276447920)

    internal val getNoise3dPtr: VoidPtr =
        Internals.getMethodBindPtr("Noise", "get_noise_3d", 973811851)

    internal val getNoise3dvPtr: VoidPtr =
        Internals.getMethodBindPtr("Noise", "get_noise_3dv", 1109078154)

    internal val getImagePtr: VoidPtr = Internals.getMethodBindPtr("Noise", "get_image", 3180683109)

    internal val getSeamlessImagePtr: VoidPtr =
        Internals.getMethodBindPtr("Noise", "get_seamless_image", 2770743602)

    internal val getImage3dPtr: VoidPtr =
        Internals.getMethodBindPtr("Noise", "get_image_3d", 3977814329)

    internal val getSeamlessImage3dPtr: VoidPtr =
        Internals.getMethodBindPtr("Noise", "get_seamless_image_3d", 451006340)
  }
}
