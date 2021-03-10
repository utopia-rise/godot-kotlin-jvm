// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import kotlin.Long
import kotlin.Suppress

/**
 * Omnidirectional light, such as a light bulb or a candle.
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/latest/tutorials/3d/lights_and_shadows.html](https://docs.godotengine.org/en/latest/tutorials/3d/lights_and_shadows.html)
 *
 * An Omnidirectional light is a type of [godot.Light] that emits light in all directions. The light is attenuated by distance and this attenuation can be configured by changing its energy, radius, and attenuation parameters.
 */
@GodotBaseType
open class OmniLight : Light() {
  /**
   * See [enum ShadowDetail].
   */
  open var omniShadowDetail: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OMNILIGHT_GET_OMNI_SHADOW_DETAIL,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OMNILIGHT_SET_OMNI_SHADOW_DETAIL,
          NIL)
    }

  /**
   * See [enum ShadowMode].
   */
  open var omniShadowMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OMNILIGHT_GET_OMNI_SHADOW_MODE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OMNILIGHT_SET_OMNI_SHADOW_MODE,
          NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_OMNILIGHT)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    __id = buffer.long
    buffer.rewind()
  }

  enum class ShadowMode(
    id: Long
  ) {
    /**
     * Shadows are rendered to a dual-paraboloid texture. Faster than [SHADOW_CUBE], but lower-quality.
     */
    SHADOW_DUAL_PARABOLOID(0),

    /**
     * Shadows are rendered to a cubemap. Slower than [SHADOW_DUAL_PARABOLOID], but higher-quality.
     */
    SHADOW_CUBE(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class ShadowDetail(
    id: Long
  ) {
    /**
     * Use more detail vertically when computing the shadow.
     */
    SHADOW_DETAIL_VERTICAL(0),

    /**
     * Use more detail horizontally when computing the shadow.
     */
    SHADOW_DETAIL_HORIZONTAL(1);

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
     * Shadows are rendered to a cubemap. Slower than [SHADOW_DUAL_PARABOLOID], but higher-quality.
     */
    final const val SHADOW_CUBE: Long = 1

    /**
     * Use more detail horizontally when computing the shadow.
     */
    final const val SHADOW_DETAIL_HORIZONTAL: Long = 1

    /**
     * Use more detail vertically when computing the shadow.
     */
    final const val SHADOW_DETAIL_VERTICAL: Long = 0

    /**
     * Shadows are rendered to a dual-paraboloid texture. Faster than [SHADOW_CUBE], but lower-quality.
     */
    final const val SHADOW_DUAL_PARABOLOID: Long = 0
  }
}
