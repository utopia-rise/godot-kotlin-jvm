// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Casts light in a 2D environment.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/2d/2d_lights_and_shadows.html]($DOCS_URL/tutorials/2d/2d_lights_and_shadows.html)
 *
 * Casts light in a 2D environment. A light is defined as a color, an energy value, a mode (see constants), and various other parameters (range and shadows-related).
 */
@GodotBaseType
public open class Light2D internal constructor() : Node2D() {
  /**
   * If `true`, Light2D will emit light.
   */
  public var enabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT2D_IS_ENABLED, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT2D_SET_ENABLED, NIL)
    }

  /**
   * If `true`, Light2D will only appear when editing the scene.
   */
  public var editorOnly: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT2D_IS_EDITOR_ONLY, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT2D_SET_EDITOR_ONLY, NIL)
    }

  /**
   * The Light2D's [godot.core.Color].
   */
  public var color: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT2D_GET_COLOR, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT2D_SET_COLOR, NIL)
    }

  /**
   * The Light2D's energy value. The larger the value, the stronger the light.
   */
  public var energy: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT2D_GET_ENERGY, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT2D_SET_ENERGY, NIL)
    }

  /**
   * The Light2D's blend mode. See [enum BlendMode] constants for values.
   */
  public var blendMode: BlendMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT2D_GET_BLEND_MODE, LONG)
      return Light2D.BlendMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT2D_SET_BLEND_MODE, NIL)
    }

  /**
   * Minimum `z` value of objects that are affected by the Light2D.
   */
  public var rangeZMin: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT2D_GET_Z_RANGE_MIN, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT2D_SET_Z_RANGE_MIN, NIL)
    }

  /**
   * Maximum `z` value of objects that are affected by the Light2D.
   */
  public var rangeZMax: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT2D_GET_Z_RANGE_MAX, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT2D_SET_Z_RANGE_MAX, NIL)
    }

  /**
   * Minimum layer value of objects that are affected by the Light2D.
   */
  public var rangeLayerMin: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT2D_GET_LAYER_RANGE_MIN, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT2D_SET_LAYER_RANGE_MIN, NIL)
    }

  /**
   * Maximum layer value of objects that are affected by the Light2D.
   */
  public var rangeLayerMax: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT2D_GET_LAYER_RANGE_MAX, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT2D_SET_LAYER_RANGE_MAX, NIL)
    }

  /**
   * The layer mask. Only objects with a matching [godot.CanvasItem.lightMask] will be affected by the Light2D. See also [shadowItemCullMask], which affects which objects can cast shadows.
   *
   * **Note:** [rangeItemCullMask] is ignored by [godot.DirectionalLight2D], which will always light a 2D node regardless of the 2D node's [godot.CanvasItem.lightMask].
   */
  public var rangeItemCullMask: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT2D_GET_ITEM_CULL_MASK, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT2D_SET_ITEM_CULL_MASK, NIL)
    }

  /**
   * If `true`, the Light2D will cast shadows.
   */
  public var shadowEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT2D_IS_SHADOW_ENABLED, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT2D_SET_SHADOW_ENABLED, NIL)
    }

  /**
   * [godot.core.Color] of shadows cast by the Light2D.
   */
  public var shadowColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT2D_GET_SHADOW_COLOR, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT2D_SET_SHADOW_COLOR, NIL)
    }

  /**
   * Shadow filter type. See [enum ShadowFilter] for possible values.
   */
  public var shadowFilter: ShadowFilter
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT2D_GET_SHADOW_FILTER, LONG)
      return Light2D.ShadowFilter.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT2D_SET_SHADOW_FILTER, NIL)
    }

  /**
   * Smoothing value for shadows. Higher values will result in softer shadows, at the cost of visible streaks that can appear in shadow rendering. [shadowFilterSmooth] only has an effect if [shadowFilter] is [godot.SHADOW_FILTER_PCF5] or [godot.SHADOW_FILTER_PCF13].
   */
  public var shadowFilterSmooth: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT2D_GET_SHADOW_SMOOTH, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT2D_SET_SHADOW_SMOOTH, NIL)
    }

  /**
   * The shadow mask. Used with [godot.LightOccluder2D] to cast shadows. Only occluders with a matching [godot.CanvasItem.lightMask] will cast shadows. See also [rangeItemCullMask], which affects which objects can *receive* the light.
   */
  public var shadowItemCullMask: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT2D_GET_ITEM_SHADOW_CULL_MASK,
          LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT2D_SET_ITEM_SHADOW_CULL_MASK,
          NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_LIGHT2D, scriptIndex)
    return true
  }

  /**
   * Sets the light's height, which is used in 2D normal mapping. See [godot.PointLight2D.height] and [godot.DirectionalLight2D.height].
   */
  public fun setHeight(height: Float): Unit {
    TransferContext.writeArguments(DOUBLE to height.toDouble())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT2D_SET_HEIGHT, NIL)
  }

  /**
   * Returns the light's height, which is used in 2D normal mapping. See [godot.PointLight2D.height] and [godot.DirectionalLight2D.height].
   */
  public fun getHeight(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT2D_GET_HEIGHT, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public enum class ShadowFilter(
    id: Long,
  ) {
    /**
     * No filter applies to the shadow map. This provides hard shadow edges and is the fastest to render. See [shadowFilter].
     */
    SHADOW_FILTER_NONE(0),
    /**
     * Percentage closer filtering (5 samples) applies to the shadow map. This is slower compared to hard shadow rendering. See [shadowFilter].
     */
    SHADOW_FILTER_PCF5(1),
    /**
     * Percentage closer filtering (13 samples) applies to the shadow map. This is the slowest shadow filtering mode, and should be used sparingly. See [shadowFilter].
     */
    SHADOW_FILTER_PCF13(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class BlendMode(
    id: Long,
  ) {
    /**
     * Adds the value of pixels corresponding to the Light2D to the values of pixels under it. This is the common behavior of a light.
     */
    BLEND_MODE_ADD(0),
    /**
     * Subtracts the value of pixels corresponding to the Light2D to the values of pixels under it, resulting in inversed light effect.
     */
    BLEND_MODE_SUB(1),
    /**
     * Mix the value of pixels corresponding to the Light2D to the values of pixels under it by linear interpolation.
     */
    BLEND_MODE_MIX(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object
}
