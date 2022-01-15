// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

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
 * An Omnidirectional light is a type of [godot.Light] that emits light in all directions. The light is attenuated by distance and this attenuation can be configured by changing its energy, radius, and attenuation parameters.
 *
 * **Note:** By default, only 32 OmniLights may affect a single mesh *resource* at once. Consider splitting your level into several meshes to decrease the likelihood that more than 32 lights will affect the same mesh resource. Splitting the level mesh will also improve frustum culling effectiveness, leading to greater performance. If you need to use more lights per mesh, you can increase [godot.ProjectSettings.rendering/limits/rendering/maxLightsPerObject] at the cost of shader compilation times.
 */
@GodotBaseType
public open class OmniLight : Light() {
  /**
   * See [enum ShadowDetail].
   */
  public open var omniShadowDetail: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OMNILIGHT_GET_OMNI_SHADOW_DETAIL,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OMNILIGHT_SET_OMNI_SHADOW_DETAIL,
          NIL)
    }

  /**
   * See [enum ShadowMode].
   */
  public open var omniShadowMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OMNILIGHT_GET_OMNI_SHADOW_MODE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OMNILIGHT_SET_OMNI_SHADOW_MODE,
          NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_OMNILIGHT)
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

  public enum class ShadowDetail(
    id: Long
  ) {
    /**
     * Use more detail vertically when computing the shadow.
     */
    SHADOW_DETAIL_VERTICAL(0),
    /**
     * Use more detail horizontally when computing the shadow.
     */
    SHADOW_DETAIL_HORIZONTAL(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object {
    /**
     * Shadows are rendered to a cubemap. Slower than [SHADOW_DUAL_PARABOLOID], but higher-quality.
     */
    public final const val SHADOW_CUBE: Long = 1

    /**
     * Use more detail horizontally when computing the shadow.
     */
    public final const val SHADOW_DETAIL_HORIZONTAL: Long = 1

    /**
     * Use more detail vertically when computing the shadow.
     */
    public final const val SHADOW_DETAIL_VERTICAL: Long = 0

    /**
     * Shadows are rendered to a dual-paraboloid texture. Faster than [SHADOW_CUBE], but lower-quality.
     */
    public final const val SHADOW_DUAL_PARABOLOID: Long = 0
  }
}
