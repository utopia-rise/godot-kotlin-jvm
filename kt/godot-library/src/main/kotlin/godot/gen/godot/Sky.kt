// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.util.VoidPtr
import kotlin.Long
import kotlin.Suppress

/**
 * The base class for [godot.PanoramaSky] and [godot.ProceduralSky].
 *
 * The base class for [godot.PanoramaSky] and [godot.ProceduralSky].
 */
@GodotBaseType
open class Sky : Resource() {
  /**
   * The [godot.Sky]'s radiance map size. The higher the radiance map size, the more detailed the lighting from the [godot.Sky] will be.
   *
   * See [enum RadianceSize] constants for values.
   *
   * **Note:** Some hardware will have trouble with higher radiance sizes, especially [godot.RADIANCE_SIZE_512] and above. Only use such high values on high-end hardware.
   */
  open var radianceSize: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKY_GET_RADIANCE_SIZE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKY_SET_RADIANCE_SIZE, NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_SKY)

  enum class RadianceSize(
    id: Long
  ) {
    /**
     * Radiance texture size is 32×32 pixels.
     */
    RADIANCE_SIZE_32(0),

    /**
     * Radiance texture size is 64×64 pixels.
     */
    RADIANCE_SIZE_64(1),

    /**
     * Radiance texture size is 128×128 pixels.
     */
    RADIANCE_SIZE_128(2),

    /**
     * Radiance texture size is 256×256 pixels.
     */
    RADIANCE_SIZE_256(3),

    /**
     * Radiance texture size is 512×512 pixels.
     */
    RADIANCE_SIZE_512(4),

    /**
     * Radiance texture size is 1024×1024 pixels.
     */
    RADIANCE_SIZE_1024(5),

    /**
     * Radiance texture size is 2048×2048 pixels.
     */
    RADIANCE_SIZE_2048(6),

    /**
     * Represents the size of the [enum RadianceSize] enum.
     */
    RADIANCE_SIZE_MAX(7);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    /**
     * Radiance texture size is 1024×1024 pixels.
     */
    final const val RADIANCE_SIZE_1024: Long = 5

    /**
     * Radiance texture size is 128×128 pixels.
     */
    final const val RADIANCE_SIZE_128: Long = 2

    /**
     * Radiance texture size is 2048×2048 pixels.
     */
    final const val RADIANCE_SIZE_2048: Long = 6

    /**
     * Radiance texture size is 256×256 pixels.
     */
    final const val RADIANCE_SIZE_256: Long = 3

    /**
     * Radiance texture size is 32×32 pixels.
     */
    final const val RADIANCE_SIZE_32: Long = 0

    /**
     * Radiance texture size is 512×512 pixels.
     */
    final const val RADIANCE_SIZE_512: Long = 4

    /**
     * Radiance texture size is 64×64 pixels.
     */
    final const val RADIANCE_SIZE_64: Long = 1

    /**
     * Represents the size of the [enum RadianceSize] enum.
     */
    final const val RADIANCE_SIZE_MAX: Long = 7
  }
}
