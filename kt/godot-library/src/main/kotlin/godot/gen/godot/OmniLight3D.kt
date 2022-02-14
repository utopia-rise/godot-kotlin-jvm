// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Omnidirectional light, such as a light bulb or a candle.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/3d/lights_and_shadows.html]($DOCS_URL/tutorials/3d/lights_and_shadows.html)
 *
 * An Omnidirectional light is a type of [godot.Light3D] that emits light in all directions. The light is attenuated by distance and this attenuation can be configured by changing its energy, radius, and attenuation parameters.
 */
@GodotBaseType
public open class OmniLight3D : Light3D() {
  /**
   * See [enum ShadowMode].
   */
  public open var omniShadowMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OMNILIGHT3D_GET_OMNI_SHADOW_MODE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OMNILIGHT3D_SET_OMNI_SHADOW_MODE,
          NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_OMNILIGHT3D)
  }

  public enum class ShadowMode(
    id: Long
  ) {
    /**
     * Shadows are rendered to a dual-paraboloid texture. Faster than [SHADOW_CUBE], but lower-quality.
     */
    SHADOW_DUAL_PARABOLOID(0),
    /**
     * Shadows are rendered to a cubemap. Slower than [SHADOW_DUAL_PARABOLOID], but higher-quality.
     */
    SHADOW_CUBE(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object
}
