// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import kotlin.Boolean
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Directional light from a distance, as from the Sun.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/3d/lights_and_shadows.html]($DOCS_URL/tutorials/3d/lights_and_shadows.html)
 *
 * A directional light is a type of [godot.Light] node that models an infinite number of parallel rays covering the entire scene. It is used for lights with strong intensity that are located far away from the scene to model sunlight or moonlight. The worldspace location of the DirectionalLight transform (origin) is ignored. Only the basis is used to determine light direction.
 */
@GodotBaseType
public open class DirectionalLight : Light() {
  /**
   * If `true`, shadow detail is sacrificed in exchange for smoother transitions between splits. Enabling shadow blend splitting also has a moderate performance cost. This is ignored when [directionalShadowMode] is [SHADOW_ORTHOGONAL].
   */
  public open var directionalShadowBlendSplits: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_DIRECTIONALLIGHT_GET_DIRECTIONAL_SHADOW_BLEND_SPLITS, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_DIRECTIONALLIGHT_SET_DIRECTIONAL_SHADOW_BLEND_SPLITS, NIL)
    }

  /**
   * Optimizes shadow rendering for detail versus movement. See [enum ShadowDepthRange].
   */
  public open var directionalShadowDepthRange: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_DIRECTIONALLIGHT_GET_DIRECTIONAL_SHADOW_DEPTH_RANGE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_DIRECTIONALLIGHT_SET_DIRECTIONAL_SHADOW_DEPTH_RANGE, NIL)
    }

  /**
   * The light's shadow rendering algorithm. See [enum ShadowMode].
   */
  public open var directionalShadowMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_DIRECTIONALLIGHT_GET_DIRECTIONAL_SHADOW_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_DIRECTIONALLIGHT_SET_DIRECTIONAL_SHADOW_MODE, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_DIRECTIONALLIGHT)
  }

  public enum class ShadowMode(
    id: Long
  ) {
    /**
     * Renders the entire scene's shadow map from an orthogonal point of view. This is the fastest directional shadow mode. May result in blurrier shadows on close objects.
     */
    SHADOW_ORTHOGONAL(0),
    /**
     * Splits the view frustum in 2 areas, each with its own shadow map. This shadow mode is a compromise between [SHADOW_ORTHOGONAL] and [godot.SHADOW_PARALLEL_4_SPLITS] in terms of performance.
     */
    SHADOW_PARALLEL_2_SPLITS(1),
    /**
     * Splits the view frustum in 4 areas, each with its own shadow map. This is the slowest directional shadow mode.
     */
    SHADOW_PARALLEL_4_SPLITS(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class ShadowDepthRange(
    id: Long
  ) {
    /**
     * Keeps the shadow stable when the camera moves, at the cost of lower effective shadow resolution.
     */
    SHADOW_DEPTH_RANGE_STABLE(0),
    /**
     * Tries to achieve maximum shadow resolution. May result in saw effect on shadow edges. This mode typically works best in games where the camera will often move at high speeds, such as most racing games.
     */
    SHADOW_DEPTH_RANGE_OPTIMIZED(1),
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
     * Tries to achieve maximum shadow resolution. May result in saw effect on shadow edges. This mode typically works best in games where the camera will often move at high speeds, such as most racing games.
     */
    public final const val SHADOW_DEPTH_RANGE_OPTIMIZED: Long = 1

    /**
     * Keeps the shadow stable when the camera moves, at the cost of lower effective shadow resolution.
     */
    public final const val SHADOW_DEPTH_RANGE_STABLE: Long = 0

    /**
     * Renders the entire scene's shadow map from an orthogonal point of view. This is the fastest directional shadow mode. May result in blurrier shadows on close objects.
     */
    public final const val SHADOW_ORTHOGONAL: Long = 0

    /**
     * Splits the view frustum in 2 areas, each with its own shadow map. This shadow mode is a compromise between [SHADOW_ORTHOGONAL] and [godot.SHADOW_PARALLEL_4_SPLITS] in terms of performance.
     */
    public final const val SHADOW_PARALLEL_2_SPLITS: Long = 1

    /**
     * Splits the view frustum in 4 areas, each with its own shadow map. This is the slowest directional shadow mode.
     */
    public final const val SHADOW_PARALLEL_4_SPLITS: Long = 2
  }
}
