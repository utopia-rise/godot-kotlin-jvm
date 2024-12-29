// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.Color
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.COLOR
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.getBlendModePtr
import godot.getColorPtr
import godot.getEnergyPtr
import godot.getHeightPtr
import godot.getItemCullMaskPtr
import godot.getItemShadowCullMaskPtr
import godot.getLayerRangeMaxPtr
import godot.getLayerRangeMinPtr
import godot.getShadowColorPtr
import godot.getShadowFilterPtr
import godot.getShadowSmoothPtr
import godot.getZRangeMaxPtr
import godot.getZRangeMinPtr
import godot.isEditorOnlyPtr
import godot.isEnabledPtr
import godot.isShadowEnabledPtr
import godot.setBlendModePtr
import godot.setColorPtr
import godot.setEditorOnlyPtr
import godot.setEnabledPtr
import godot.setEnergyPtr
import godot.setHeightPtr
import godot.setItemCullMaskPtr
import godot.setItemShadowCullMaskPtr
import godot.setLayerRangeMaxPtr
import godot.setLayerRangeMinPtr
import godot.setShadowColorPtr
import godot.setShadowEnabledPtr
import godot.setShadowFilterPtr
import godot.setShadowSmoothPtr
import godot.setZRangeMaxPtr
import godot.setZRangeMinPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINECLASS_LIGHT2D: Int = 348

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
    createNativeObject(ENGINECLASS_LIGHT2D, scriptIndex)
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
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setEnabledPtr, NIL)
  }

  public final fun isEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setEditorOnly(editorOnly: Boolean): Unit {
    TransferContext.writeArguments(BOOL to editorOnly)
    TransferContext.callMethod(ptr, MethodBindings.setEditorOnlyPtr, NIL)
  }

  public final fun isEditorOnly(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isEditorOnlyPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setColor(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(ptr, MethodBindings.setColorPtr, NIL)
  }

  public final fun getColor(): Color {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  public final fun setEnergy(energy: Float): Unit {
    TransferContext.writeArguments(DOUBLE to energy.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setEnergyPtr, NIL)
  }

  public final fun getEnergy(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getEnergyPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setZRangeMin(z: Int): Unit {
    TransferContext.writeArguments(LONG to z.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setZRangeMinPtr, NIL)
  }

  public final fun getZRangeMin(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getZRangeMinPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setZRangeMax(z: Int): Unit {
    TransferContext.writeArguments(LONG to z.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setZRangeMaxPtr, NIL)
  }

  public final fun getZRangeMax(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getZRangeMaxPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setLayerRangeMin(layer: Int): Unit {
    TransferContext.writeArguments(LONG to layer.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setLayerRangeMinPtr, NIL)
  }

  public final fun getLayerRangeMin(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLayerRangeMinPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setLayerRangeMax(layer: Int): Unit {
    TransferContext.writeArguments(LONG to layer.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setLayerRangeMaxPtr, NIL)
  }

  public final fun getLayerRangeMax(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLayerRangeMaxPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setItemCullMask(itemCullMask: Int): Unit {
    TransferContext.writeArguments(LONG to itemCullMask.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setItemCullMaskPtr, NIL)
  }

  public final fun getItemCullMask(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getItemCullMaskPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setItemShadowCullMask(itemShadowCullMask: Int): Unit {
    TransferContext.writeArguments(LONG to itemShadowCullMask.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setItemShadowCullMaskPtr, NIL)
  }

  public final fun getItemShadowCullMask(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getItemShadowCullMaskPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setShadowEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setShadowEnabledPtr, NIL)
  }

  public final fun isShadowEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isShadowEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setShadowSmooth(smooth: Float): Unit {
    TransferContext.writeArguments(DOUBLE to smooth.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setShadowSmoothPtr, NIL)
  }

  public final fun getShadowSmooth(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getShadowSmoothPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setShadowFilter(filter: ShadowFilter): Unit {
    TransferContext.writeArguments(LONG to filter.id)
    TransferContext.callMethod(ptr, MethodBindings.setShadowFilterPtr, NIL)
  }

  public final fun getShadowFilter(): ShadowFilter {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getShadowFilterPtr, LONG)
    return Light2D.ShadowFilter.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setShadowColor(shadowColor: Color): Unit {
    TransferContext.writeArguments(COLOR to shadowColor)
    TransferContext.callMethod(ptr, MethodBindings.setShadowColorPtr, NIL)
  }

  public final fun getShadowColor(): Color {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getShadowColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  public final fun setBlendMode(mode: BlendMode): Unit {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(ptr, MethodBindings.setBlendModePtr, NIL)
  }

  public final fun getBlendMode(): BlendMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBlendModePtr, LONG)
    return Light2D.BlendMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets the light's height, which is used in 2D normal mapping. See [PointLight2D.height] and
   * [DirectionalLight2D.height].
   */
  public final fun setHeight(height: Float): Unit {
    TransferContext.writeArguments(DOUBLE to height.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setHeightPtr, NIL)
  }

  /**
   * Returns the light's height, which is used in 2D normal mapping. See [PointLight2D.height] and
   * [DirectionalLight2D.height].
   */
  public final fun getHeight(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getHeightPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
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
        TypeManager.getMethodBindPtr("Light2D", "set_enabled", 2586408642)

    internal val isEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light2D", "is_enabled", 36873697)

    internal val setEditorOnlyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light2D", "set_editor_only", 2586408642)

    internal val isEditorOnlyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light2D", "is_editor_only", 36873697)

    internal val setColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light2D", "set_color", 2920490490)

    internal val getColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light2D", "get_color", 3444240500)

    internal val setEnergyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light2D", "set_energy", 373806689)

    internal val getEnergyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light2D", "get_energy", 1740695150)

    internal val setZRangeMinPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light2D", "set_z_range_min", 1286410249)

    internal val getZRangeMinPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light2D", "get_z_range_min", 3905245786)

    internal val setZRangeMaxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light2D", "set_z_range_max", 1286410249)

    internal val getZRangeMaxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light2D", "get_z_range_max", 3905245786)

    internal val setLayerRangeMinPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light2D", "set_layer_range_min", 1286410249)

    internal val getLayerRangeMinPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light2D", "get_layer_range_min", 3905245786)

    internal val setLayerRangeMaxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light2D", "set_layer_range_max", 1286410249)

    internal val getLayerRangeMaxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light2D", "get_layer_range_max", 3905245786)

    internal val setItemCullMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light2D", "set_item_cull_mask", 1286410249)

    internal val getItemCullMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light2D", "get_item_cull_mask", 3905245786)

    internal val setItemShadowCullMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light2D", "set_item_shadow_cull_mask", 1286410249)

    internal val getItemShadowCullMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light2D", "get_item_shadow_cull_mask", 3905245786)

    internal val setShadowEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light2D", "set_shadow_enabled", 2586408642)

    internal val isShadowEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light2D", "is_shadow_enabled", 36873697)

    internal val setShadowSmoothPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light2D", "set_shadow_smooth", 373806689)

    internal val getShadowSmoothPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light2D", "get_shadow_smooth", 1740695150)

    internal val setShadowFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light2D", "set_shadow_filter", 3209356555)

    internal val getShadowFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light2D", "get_shadow_filter", 1973619177)

    internal val setShadowColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light2D", "set_shadow_color", 2920490490)

    internal val getShadowColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light2D", "get_shadow_color", 3444240500)

    internal val setBlendModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light2D", "set_blend_mode", 2916638796)

    internal val getBlendModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light2D", "get_blend_mode", 936255250)

    internal val setHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light2D", "set_height", 373806689)

    internal val getHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light2D", "get_height", 1740695150)
  }
}
