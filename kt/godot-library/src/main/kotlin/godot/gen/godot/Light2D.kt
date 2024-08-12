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
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Casts light in a 2D environment. A light is defined as a color, an energy value, a mode (see
 * constants), and various other parameters (range and shadows-related).
 */
@GodotBaseType
public open class Light2D internal constructor() : Node2D() {
  /**
   * If `true`, Light2D will emit light.
   */
  public var enabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEnabledPtr, NIL)
    }

  /**
   * If `true`, Light2D will only appear when editing the scene.
   */
  public var editorOnly: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isEditorOnlyPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEditorOnlyPtr, NIL)
    }

  /**
   * The Light2D's [Color].
   */
  @CoreTypeLocalCopy
  public var color: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getColorPtr, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setColorPtr, NIL)
    }

  /**
   * The Light2D's energy value. The larger the value, the stronger the light.
   */
  public var energy: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEnergyPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setEnergyPtr, NIL)
    }

  /**
   * The Light2D's blend mode. See [BlendMode] constants for values.
   */
  public var blendMode: BlendMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBlendModePtr, LONG)
      return Light2D.BlendMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setBlendModePtr, NIL)
    }

  /**
   * Minimum `z` value of objects that are affected by the Light2D.
   */
  public var rangeZMin: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getZRangeMinPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setZRangeMinPtr, NIL)
    }

  /**
   * Maximum `z` value of objects that are affected by the Light2D.
   */
  public var rangeZMax: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getZRangeMaxPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setZRangeMaxPtr, NIL)
    }

  /**
   * Minimum layer value of objects that are affected by the Light2D.
   */
  public var rangeLayerMin: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLayerRangeMinPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setLayerRangeMinPtr, NIL)
    }

  /**
   * Maximum layer value of objects that are affected by the Light2D.
   */
  public var rangeLayerMax: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLayerRangeMaxPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setLayerRangeMaxPtr, NIL)
    }

  /**
   * The layer mask. Only objects with a matching [CanvasItem.lightMask] will be affected by the
   * Light2D. See also [shadowItemCullMask], which affects which objects can cast shadows.
   * **Note:** [rangeItemCullMask] is ignored by [DirectionalLight2D], which will always light a 2D
   * node regardless of the 2D node's [CanvasItem.lightMask].
   */
  public var rangeItemCullMask: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getItemCullMaskPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setItemCullMaskPtr, NIL)
    }

  /**
   * If `true`, the Light2D will cast shadows.
   */
  public var shadowEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isShadowEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setShadowEnabledPtr, NIL)
    }

  /**
   * [Color] of shadows cast by the Light2D.
   */
  @CoreTypeLocalCopy
  public var shadowColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getShadowColorPtr, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setShadowColorPtr, NIL)
    }

  /**
   * Shadow filter type. See [ShadowFilter] for possible values.
   */
  public var shadowFilter: ShadowFilter
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getShadowFilterPtr, LONG)
      return Light2D.ShadowFilter.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setShadowFilterPtr, NIL)
    }

  /**
   * Smoothing value for shadows. Higher values will result in softer shadows, at the cost of
   * visible streaks that can appear in shadow rendering. [shadowFilterSmooth] only has an effect if
   * [shadowFilter] is [SHADOW_FILTER_PCF5] or [SHADOW_FILTER_PCF13].
   */
  public var shadowFilterSmooth: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getShadowSmoothPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setShadowSmoothPtr, NIL)
    }

  /**
   * The shadow mask. Used with [LightOccluder2D] to cast shadows. Only occluders with a matching
   * [CanvasItem.lightMask] will cast shadows. See also [rangeItemCullMask], which affects which
   * objects can *receive* the light.
   */
  public var shadowItemCullMask: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getItemShadowCullMaskPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setItemShadowCullMaskPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_LIGHT2D, scriptIndex)
    return true
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
  public open fun colorMutate(block: Color.() -> Unit): Color = color.apply{
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
  public open fun shadowColorMutate(block: Color.() -> Unit): Color = shadowColor.apply{
      block(this)
      shadowColor = this
  }


  /**
   * Sets the light's height, which is used in 2D normal mapping. See [PointLight2D.height] and
   * [DirectionalLight2D.height].
   */
  public fun setHeight(height: Float): Unit {
    TransferContext.writeArguments(DOUBLE to height.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setHeightPtr, NIL)
  }

  /**
   * Returns the light's height, which is used in 2D normal mapping. See [PointLight2D.height] and
   * [DirectionalLight2D.height].
   */
  public fun getHeight(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getHeightPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setEnabledPtr: VoidPtr = TypeManager.getMethodBindPtr("Light2D", "set_enabled")

    public val isEnabledPtr: VoidPtr = TypeManager.getMethodBindPtr("Light2D", "is_enabled")

    public val setEditorOnlyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light2D", "set_editor_only")

    public val isEditorOnlyPtr: VoidPtr = TypeManager.getMethodBindPtr("Light2D", "is_editor_only")

    public val setColorPtr: VoidPtr = TypeManager.getMethodBindPtr("Light2D", "set_color")

    public val getColorPtr: VoidPtr = TypeManager.getMethodBindPtr("Light2D", "get_color")

    public val setEnergyPtr: VoidPtr = TypeManager.getMethodBindPtr("Light2D", "set_energy")

    public val getEnergyPtr: VoidPtr = TypeManager.getMethodBindPtr("Light2D", "get_energy")

    public val setZRangeMinPtr: VoidPtr = TypeManager.getMethodBindPtr("Light2D", "set_z_range_min")

    public val getZRangeMinPtr: VoidPtr = TypeManager.getMethodBindPtr("Light2D", "get_z_range_min")

    public val setZRangeMaxPtr: VoidPtr = TypeManager.getMethodBindPtr("Light2D", "set_z_range_max")

    public val getZRangeMaxPtr: VoidPtr = TypeManager.getMethodBindPtr("Light2D", "get_z_range_max")

    public val setLayerRangeMinPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light2D", "set_layer_range_min")

    public val getLayerRangeMinPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light2D", "get_layer_range_min")

    public val setLayerRangeMaxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light2D", "set_layer_range_max")

    public val getLayerRangeMaxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light2D", "get_layer_range_max")

    public val setItemCullMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light2D", "set_item_cull_mask")

    public val getItemCullMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light2D", "get_item_cull_mask")

    public val setItemShadowCullMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light2D", "set_item_shadow_cull_mask")

    public val getItemShadowCullMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light2D", "get_item_shadow_cull_mask")

    public val setShadowEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light2D", "set_shadow_enabled")

    public val isShadowEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light2D", "is_shadow_enabled")

    public val setShadowSmoothPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light2D", "set_shadow_smooth")

    public val getShadowSmoothPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light2D", "get_shadow_smooth")

    public val setShadowFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light2D", "set_shadow_filter")

    public val getShadowFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light2D", "get_shadow_filter")

    public val setShadowColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light2D", "set_shadow_color")

    public val getShadowColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light2D", "get_shadow_color")

    public val setBlendModePtr: VoidPtr = TypeManager.getMethodBindPtr("Light2D", "set_blend_mode")

    public val getBlendModePtr: VoidPtr = TypeManager.getMethodBindPtr("Light2D", "get_blend_mode")

    public val setHeightPtr: VoidPtr = TypeManager.getMethodBindPtr("Light2D", "set_height")

    public val getHeightPtr: VoidPtr = TypeManager.getMethodBindPtr("Light2D", "get_height")
  }
}
