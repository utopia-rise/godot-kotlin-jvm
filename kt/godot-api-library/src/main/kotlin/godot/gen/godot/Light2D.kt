// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.COLOR
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_LIGHT2D_INDEX: Int = 348

/**
 * Casts light in a 2D environment. A light is defined as a color, an energy value, a mode (see
 * constants), and various other parameters (range and shadows-related).
 */
@GodotBaseType
public open class Light2D internal constructor() : Node2D() {
  /**
   * If `true`, Light2D will emit light.
   */
  public final inline var enabled: Boolean
    @JvmName("enabledProperty")
    get() = isEnabled()
    @JvmName("enabledProperty")
    set(`value`) {
      setEnabled(value)
    }

  /**
   * If `true`, Light2D will only appear when editing the scene.
   */
  public final inline var editorOnly: Boolean
    @JvmName("editorOnlyProperty")
    get() = isEditorOnly()
    @JvmName("editorOnlyProperty")
    set(`value`) {
      setEditorOnly(value)
    }

  /**
   * The Light2D's [Color].
   */
  @CoreTypeLocalCopy
  public final inline var color: Color
    @JvmName("colorProperty")
    get() = getColor()
    @JvmName("colorProperty")
    set(`value`) {
      setColor(value)
    }

  /**
   * The Light2D's energy value. The larger the value, the stronger the light.
   */
  public final inline var energy: Float
    @JvmName("energyProperty")
    get() = getEnergy()
    @JvmName("energyProperty")
    set(`value`) {
      setEnergy(value)
    }

  /**
   * The Light2D's blend mode. See [BlendMode] constants for values.
   */
  public final inline var blendMode: BlendMode
    @JvmName("blendModeProperty")
    get() = getBlendMode()
    @JvmName("blendModeProperty")
    set(`value`) {
      setBlendMode(value)
    }

  /**
   * Minimum `z` value of objects that are affected by the Light2D.
   */
  public final inline var rangeZMin: Int
    @JvmName("rangeZMinProperty")
    get() = getZRangeMin()
    @JvmName("rangeZMinProperty")
    set(`value`) {
      setZRangeMin(value)
    }

  /**
   * Maximum `z` value of objects that are affected by the Light2D.
   */
  public final inline var rangeZMax: Int
    @JvmName("rangeZMaxProperty")
    get() = getZRangeMax()
    @JvmName("rangeZMaxProperty")
    set(`value`) {
      setZRangeMax(value)
    }

  /**
   * Minimum layer value of objects that are affected by the Light2D.
   */
  public final inline var rangeLayerMin: Int
    @JvmName("rangeLayerMinProperty")
    get() = getLayerRangeMin()
    @JvmName("rangeLayerMinProperty")
    set(`value`) {
      setLayerRangeMin(value)
    }

  /**
   * Maximum layer value of objects that are affected by the Light2D.
   */
  public final inline var rangeLayerMax: Int
    @JvmName("rangeLayerMaxProperty")
    get() = getLayerRangeMax()
    @JvmName("rangeLayerMaxProperty")
    set(`value`) {
      setLayerRangeMax(value)
    }

  /**
   * The layer mask. Only objects with a matching [CanvasItem.lightMask] will be affected by the
   * Light2D. See also [shadowItemCullMask], which affects which objects can cast shadows.
   * **Note:** [rangeItemCullMask] is ignored by [DirectionalLight2D], which will always light a 2D
   * node regardless of the 2D node's [CanvasItem.lightMask].
   */
  public final inline var rangeItemCullMask: Int
    @JvmName("rangeItemCullMaskProperty")
    get() = getItemCullMask()
    @JvmName("rangeItemCullMaskProperty")
    set(`value`) {
      setItemCullMask(value)
    }

  /**
   * If `true`, the Light2D will cast shadows.
   */
  public final inline var shadowEnabled: Boolean
    @JvmName("shadowEnabledProperty")
    get() = isShadowEnabled()
    @JvmName("shadowEnabledProperty")
    set(`value`) {
      setShadowEnabled(value)
    }

  /**
   * [Color] of shadows cast by the Light2D.
   */
  @CoreTypeLocalCopy
  public final inline var shadowColor: Color
    @JvmName("shadowColorProperty")
    get() = getShadowColor()
    @JvmName("shadowColorProperty")
    set(`value`) {
      setShadowColor(value)
    }

  /**
   * Shadow filter type. See [ShadowFilter] for possible values.
   */
  public final inline var shadowFilter: ShadowFilter
    @JvmName("shadowFilterProperty")
    get() = getShadowFilter()
    @JvmName("shadowFilterProperty")
    set(`value`) {
      setShadowFilter(value)
    }

  /**
   * Smoothing value for shadows. Higher values will result in softer shadows, at the cost of
   * visible streaks that can appear in shadow rendering. [shadowFilterSmooth] only has an effect if
   * [shadowFilter] is [SHADOW_FILTER_PCF5] or [SHADOW_FILTER_PCF13].
   */
  public final inline var shadowFilterSmooth: Float
    @JvmName("shadowFilterSmoothProperty")
    get() = getShadowSmooth()
    @JvmName("shadowFilterSmoothProperty")
    set(`value`) {
      setShadowSmooth(value)
    }

  /**
   * The shadow mask. Used with [LightOccluder2D] to cast shadows. Only occluders with a matching
   * [CanvasItem.lightMask] will cast shadows. See also [rangeItemCullMask], which affects which
   * objects can *receive* the light.
   */
  public final inline var shadowItemCullMask: Int
    @JvmName("shadowItemCullMaskProperty")
    get() = getItemShadowCullMask()
    @JvmName("shadowItemCullMaskProperty")
    set(`value`) {
      setItemShadowCullMask(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_LIGHT2D_INDEX, scriptIndex)
  }

  /**
   * The Light2D's [Color].
   *
   * This is a helper function to make dealing with local copies easier.
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = light2d.color
   * //Your changes
   * light2d.color = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun colorMutate(block: Color.() -> Unit): Color = color.apply{
      block(this)
      color = this
  }


  /**
   * [Color] of shadows cast by the Light2D.
   *
   * This is a helper function to make dealing with local copies easier.
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = light2d.shadowColor
   * //Your changes
   * light2d.shadowColor = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun shadowColorMutate(block: Color.() -> Unit): Color = shadowColor.apply{
      block(this)
      shadowColor = this
  }


  public final fun setEnabled(enabled: Boolean): Unit {
    Internals.writeArguments(BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.setEnabledPtr, NIL)
  }

  public final fun isEnabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setEditorOnly(editorOnly: Boolean): Unit {
    Internals.writeArguments(BOOL to editorOnly)
    Internals.callMethod(rawPtr, MethodBindings.setEditorOnlyPtr, NIL)
  }

  public final fun isEditorOnly(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isEditorOnlyPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setColor(color: Color): Unit {
    Internals.writeArguments(COLOR to color)
    Internals.callMethod(rawPtr, MethodBindings.setColorPtr, NIL)
  }

  public final fun getColor(): Color {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getColorPtr, COLOR)
    return (Internals.readReturnValue(COLOR) as Color)
  }

  public final fun setEnergy(energy: Float): Unit {
    Internals.writeArguments(DOUBLE to energy.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setEnergyPtr, NIL)
  }

  public final fun getEnergy(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getEnergyPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setZRangeMin(z: Int): Unit {
    Internals.writeArguments(LONG to z.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setZRangeMinPtr, NIL)
  }

  public final fun getZRangeMin(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getZRangeMinPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setZRangeMax(z: Int): Unit {
    Internals.writeArguments(LONG to z.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setZRangeMaxPtr, NIL)
  }

  public final fun getZRangeMax(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getZRangeMaxPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setLayerRangeMin(layer: Int): Unit {
    Internals.writeArguments(LONG to layer.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setLayerRangeMinPtr, NIL)
  }

  public final fun getLayerRangeMin(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getLayerRangeMinPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setLayerRangeMax(layer: Int): Unit {
    Internals.writeArguments(LONG to layer.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setLayerRangeMaxPtr, NIL)
  }

  public final fun getLayerRangeMax(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getLayerRangeMaxPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setItemCullMask(itemCullMask: Int): Unit {
    Internals.writeArguments(LONG to itemCullMask.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setItemCullMaskPtr, NIL)
  }

  public final fun getItemCullMask(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getItemCullMaskPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setItemShadowCullMask(itemShadowCullMask: Int): Unit {
    Internals.writeArguments(LONG to itemShadowCullMask.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setItemShadowCullMaskPtr, NIL)
  }

  public final fun getItemShadowCullMask(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getItemShadowCullMaskPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setShadowEnabled(enabled: Boolean): Unit {
    Internals.writeArguments(BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.setShadowEnabledPtr, NIL)
  }

  public final fun isShadowEnabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isShadowEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setShadowSmooth(smooth: Float): Unit {
    Internals.writeArguments(DOUBLE to smooth.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setShadowSmoothPtr, NIL)
  }

  public final fun getShadowSmooth(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getShadowSmoothPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setShadowFilter(filter: ShadowFilter): Unit {
    Internals.writeArguments(LONG to filter.id)
    Internals.callMethod(rawPtr, MethodBindings.setShadowFilterPtr, NIL)
  }

  public final fun getShadowFilter(): ShadowFilter {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getShadowFilterPtr, LONG)
    return Light2D.ShadowFilter.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setShadowColor(shadowColor: Color): Unit {
    Internals.writeArguments(COLOR to shadowColor)
    Internals.callMethod(rawPtr, MethodBindings.setShadowColorPtr, NIL)
  }

  public final fun getShadowColor(): Color {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getShadowColorPtr, COLOR)
    return (Internals.readReturnValue(COLOR) as Color)
  }

  public final fun setBlendMode(mode: BlendMode): Unit {
    Internals.writeArguments(LONG to mode.id)
    Internals.callMethod(rawPtr, MethodBindings.setBlendModePtr, NIL)
  }

  public final fun getBlendMode(): BlendMode {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getBlendModePtr, LONG)
    return Light2D.BlendMode.from(Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Sets the light's height, which is used in 2D normal mapping. See [PointLight2D.height] and
   * [DirectionalLight2D.height].
   */
  public final fun setHeight(height: Float): Unit {
    Internals.writeArguments(DOUBLE to height.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setHeightPtr, NIL)
  }

  /**
   * Returns the light's height, which is used in 2D normal mapping. See [PointLight2D.height] and
   * [DirectionalLight2D.height].
   */
  public final fun getHeight(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getHeightPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public enum class ShadowFilter(
    id: Long,
  ) {
    /**
     * No filter applies to the shadow map. This provides hard shadow edges and is the fastest to
     * render. See [shadowFilter].
     */
    SHADOW_FILTER_NONE(0),
    /**
     * Percentage closer filtering (5 samples) applies to the shadow map. This is slower compared to
     * hard shadow rendering. See [shadowFilter].
     */
    SHADOW_FILTER_PCF5(1),
    /**
     * Percentage closer filtering (13 samples) applies to the shadow map. This is the slowest
     * shadow filtering mode, and should be used sparingly. See [shadowFilter].
     */
    SHADOW_FILTER_PCF13(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ShadowFilter = entries.single { it.id == `value` }
    }
  }

  public enum class BlendMode(
    id: Long,
  ) {
    /**
     * Adds the value of pixels corresponding to the Light2D to the values of pixels under it. This
     * is the common behavior of a light.
     */
    BLEND_MODE_ADD(0),
    /**
     * Subtracts the value of pixels corresponding to the Light2D to the values of pixels under it,
     * resulting in inversed light effect.
     */
    BLEND_MODE_SUB(1),
    /**
     * Mix the value of pixels corresponding to the Light2D to the values of pixels under it by
     * linear interpolation.
     */
    BLEND_MODE_MIX(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): BlendMode = entries.single { it.id == `value` }
    }
  }

  public companion object

  public object MethodBindings {
    internal val setEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("Light2D", "set_enabled", 2586408642)

    internal val isEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("Light2D", "is_enabled", 36873697)

    internal val setEditorOnlyPtr: VoidPtr =
        Internals.getMethodBindPtr("Light2D", "set_editor_only", 2586408642)

    internal val isEditorOnlyPtr: VoidPtr =
        Internals.getMethodBindPtr("Light2D", "is_editor_only", 36873697)

    internal val setColorPtr: VoidPtr =
        Internals.getMethodBindPtr("Light2D", "set_color", 2920490490)

    internal val getColorPtr: VoidPtr =
        Internals.getMethodBindPtr("Light2D", "get_color", 3444240500)

    internal val setEnergyPtr: VoidPtr =
        Internals.getMethodBindPtr("Light2D", "set_energy", 373806689)

    internal val getEnergyPtr: VoidPtr =
        Internals.getMethodBindPtr("Light2D", "get_energy", 1740695150)

    internal val setZRangeMinPtr: VoidPtr =
        Internals.getMethodBindPtr("Light2D", "set_z_range_min", 1286410249)

    internal val getZRangeMinPtr: VoidPtr =
        Internals.getMethodBindPtr("Light2D", "get_z_range_min", 3905245786)

    internal val setZRangeMaxPtr: VoidPtr =
        Internals.getMethodBindPtr("Light2D", "set_z_range_max", 1286410249)

    internal val getZRangeMaxPtr: VoidPtr =
        Internals.getMethodBindPtr("Light2D", "get_z_range_max", 3905245786)

    internal val setLayerRangeMinPtr: VoidPtr =
        Internals.getMethodBindPtr("Light2D", "set_layer_range_min", 1286410249)

    internal val getLayerRangeMinPtr: VoidPtr =
        Internals.getMethodBindPtr("Light2D", "get_layer_range_min", 3905245786)

    internal val setLayerRangeMaxPtr: VoidPtr =
        Internals.getMethodBindPtr("Light2D", "set_layer_range_max", 1286410249)

    internal val getLayerRangeMaxPtr: VoidPtr =
        Internals.getMethodBindPtr("Light2D", "get_layer_range_max", 3905245786)

    internal val setItemCullMaskPtr: VoidPtr =
        Internals.getMethodBindPtr("Light2D", "set_item_cull_mask", 1286410249)

    internal val getItemCullMaskPtr: VoidPtr =
        Internals.getMethodBindPtr("Light2D", "get_item_cull_mask", 3905245786)

    internal val setItemShadowCullMaskPtr: VoidPtr =
        Internals.getMethodBindPtr("Light2D", "set_item_shadow_cull_mask", 1286410249)

    internal val getItemShadowCullMaskPtr: VoidPtr =
        Internals.getMethodBindPtr("Light2D", "get_item_shadow_cull_mask", 3905245786)

    internal val setShadowEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("Light2D", "set_shadow_enabled", 2586408642)

    internal val isShadowEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("Light2D", "is_shadow_enabled", 36873697)

    internal val setShadowSmoothPtr: VoidPtr =
        Internals.getMethodBindPtr("Light2D", "set_shadow_smooth", 373806689)

    internal val getShadowSmoothPtr: VoidPtr =
        Internals.getMethodBindPtr("Light2D", "get_shadow_smooth", 1740695150)

    internal val setShadowFilterPtr: VoidPtr =
        Internals.getMethodBindPtr("Light2D", "set_shadow_filter", 3209356555)

    internal val getShadowFilterPtr: VoidPtr =
        Internals.getMethodBindPtr("Light2D", "get_shadow_filter", 1973619177)

    internal val setShadowColorPtr: VoidPtr =
        Internals.getMethodBindPtr("Light2D", "set_shadow_color", 2920490490)

    internal val getShadowColorPtr: VoidPtr =
        Internals.getMethodBindPtr("Light2D", "get_shadow_color", 3444240500)

    internal val setBlendModePtr: VoidPtr =
        Internals.getMethodBindPtr("Light2D", "set_blend_mode", 2916638796)

    internal val getBlendModePtr: VoidPtr =
        Internals.getMethodBindPtr("Light2D", "get_blend_mode", 936255250)

    internal val setHeightPtr: VoidPtr =
        Internals.getMethodBindPtr("Light2D", "set_height", 373806689)

    internal val getHeightPtr: VoidPtr =
        Internals.getMethodBindPtr("Light2D", "get_height", 1740695150)
  }
}
