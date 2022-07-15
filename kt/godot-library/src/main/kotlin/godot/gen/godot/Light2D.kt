// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Casts light in a 2D environment.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/2d/2d_lights_and_shadows.html]($DOCS_URL/tutorials/2d/2d_lights_and_shadows.html)
 *
 * Casts light in a 2D environment. Light is defined by a (usually grayscale) texture, a color, an energy value, a mode (see constants), and various other parameters (range and shadows-related).
 *
 * **Note:** Light2D can also be used as a mask.
 */
@GodotBaseType
public open class Light2D : Node2D() {
  /**
   * The Light2D's [godot.core.Color].
   */
  public open var color: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT2D_GET_COLOR, COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT2D_SET_COLOR, NIL)
    }

  /**
   * If `true`, Light2D will only appear when editing the scene.
   */
  public open var editorOnly: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT2D_GET_EDITOR_ONLY, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT2D_SET_EDITOR_ONLY, NIL)
    }

  /**
   * If `true`, Light2D will emit light.
   */
  public open var enabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT2D_GET_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT2D_SET_ENABLED, NIL)
    }

  /**
   * The Light2D's energy value. The larger the value, the stronger the light.
   */
  public open var energy: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT2D_GET_ENERGY, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT2D_SET_ENERGY, NIL)
    }

  /**
   * The Light2D's mode. See [enum Mode] constants for values.
   */
  public open var mode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT2D_GET_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT2D_SET_MODE, NIL)
    }

  /**
   * The offset of the Light2D's `texture`.
   */
  public open var offset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT2D_GET_OFFSET, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT2D_SET_OFFSET, NIL)
    }

  /**
   * The height of the Light2D. Used with 2D normal mapping.
   */
  public open var rangeHeight: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT2D_GET_RANGE_HEIGHT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT2D_SET_RANGE_HEIGHT, NIL)
    }

  /**
   * The layer mask. Only objects with a matching mask will be affected by the Light2D.
   */
  public open var rangeItemCullMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT2D_GET_RANGE_ITEM_CULL_MASK,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT2D_SET_RANGE_ITEM_CULL_MASK,
          NIL)
    }

  /**
   * Maximum layer value of objects that are affected by the Light2D.
   */
  public open var rangeLayerMax: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT2D_GET_RANGE_LAYER_MAX, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT2D_SET_RANGE_LAYER_MAX, NIL)
    }

  /**
   * Minimum layer value of objects that are affected by the Light2D.
   */
  public open var rangeLayerMin: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT2D_GET_RANGE_LAYER_MIN, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT2D_SET_RANGE_LAYER_MIN, NIL)
    }

  /**
   * Maximum `z` value of objects that are affected by the Light2D.
   */
  public open var rangeZMax: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT2D_GET_RANGE_Z_MAX, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT2D_SET_RANGE_Z_MAX, NIL)
    }

  /**
   * Minimum `z` value of objects that are affected by the Light2D.
   */
  public open var rangeZMin: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT2D_GET_RANGE_Z_MIN, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT2D_SET_RANGE_Z_MIN, NIL)
    }

  /**
   * Shadow buffer size.
   */
  public open var shadowBufferSize: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT2D_GET_SHADOW_BUFFER_SIZE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT2D_SET_SHADOW_BUFFER_SIZE,
          NIL)
    }

  /**
   * [godot.core.Color] of shadows cast by the Light2D.
   */
  public open var shadowColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT2D_GET_SHADOW_COLOR, COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT2D_SET_SHADOW_COLOR, NIL)
    }

  /**
   * If `true`, the Light2D will cast shadows.
   */
  public open var shadowEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT2D_GET_SHADOW_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT2D_SET_SHADOW_ENABLED, NIL)
    }

  /**
   * Shadow filter type. See [enum ShadowFilter] for possible values.
   */
  public open var shadowFilter: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT2D_GET_SHADOW_FILTER, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT2D_SET_SHADOW_FILTER, NIL)
    }

  /**
   * Smoothing value for shadows.
   */
  public open var shadowFilterSmooth: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT2D_GET_SHADOW_FILTER_SMOOTH,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT2D_SET_SHADOW_FILTER_SMOOTH,
          NIL)
    }

  /**
   * Smooth shadow gradient length.
   */
  public open var shadowGradientLength: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_LIGHT2D_GET_SHADOW_GRADIENT_LENGTH, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_LIGHT2D_SET_SHADOW_GRADIENT_LENGTH, NIL)
    }

  /**
   * The shadow mask. Used with [godot.LightOccluder2D] to cast shadows. Only occluders with a matching light mask will cast shadows.
   */
  public open var shadowItemCullMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT2D_GET_SHADOW_ITEM_CULL_MASK,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT2D_SET_SHADOW_ITEM_CULL_MASK,
          NIL)
    }

  /**
   * [godot.Texture] used for the Light2D's appearance.
   */
  public open var texture: Texture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT2D_GET_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT2D_SET_TEXTURE, NIL)
    }

  /**
   * The `texture`'s scale factor.
   */
  public open var textureScale: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT2D_GET_TEXTURE_SCALE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT2D_SET_TEXTURE_SCALE, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_LIGHT2D)
  }

  @CoreTypeHelper
  public open fun color(schedule: Color.() -> Unit): Color = color.apply{
      schedule(this)
      color = this
  }


  @CoreTypeHelper
  public open fun offset(schedule: Vector2.() -> Unit): Vector2 = offset.apply{
      schedule(this)
      offset = this
  }


  @CoreTypeHelper
  public open fun shadowColor(schedule: Color.() -> Unit): Color = shadowColor.apply{
      schedule(this)
      shadowColor = this
  }


  public enum class ShadowFilter(
    id: Long
  ) {
    /**
     * No filter applies to the shadow map. See [shadowFilter].
     */
    SHADOW_FILTER_NONE(0),
    /**
     * Percentage closer filtering (3 samples) applies to the shadow map. See [shadowFilter].
     */
    SHADOW_FILTER_PCF3(1),
    /**
     * Percentage closer filtering (5 samples) applies to the shadow map. See [shadowFilter].
     */
    SHADOW_FILTER_PCF5(2),
    /**
     * Percentage closer filtering (7 samples) applies to the shadow map. See [shadowFilter].
     */
    SHADOW_FILTER_PCF7(3),
    /**
     * Percentage closer filtering (9 samples) applies to the shadow map. See [shadowFilter].
     */
    SHADOW_FILTER_PCF9(4),
    /**
     * Percentage closer filtering (13 samples) applies to the shadow map. See [shadowFilter].
     */
    SHADOW_FILTER_PCF13(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class Mode(
    id: Long
  ) {
    /**
     * Adds the value of pixels corresponding to the Light2D to the values of pixels under it. This is the common behavior of a light.
     */
    MODE_ADD(0),
    /**
     * Subtracts the value of pixels corresponding to the Light2D to the values of pixels under it, resulting in inversed light effect.
     */
    MODE_SUB(1),
    /**
     * Mix the value of pixels corresponding to the Light2D to the values of pixels under it by linear interpolation.
     */
    MODE_MIX(2),
    /**
     * The light texture of the Light2D is used as a mask, hiding or revealing parts of the screen underneath depending on the value of each pixel of the light (mask) texture.
     */
    MODE_MASK(3),
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
     * Adds the value of pixels corresponding to the Light2D to the values of pixels under it. This is the common behavior of a light.
     */
    public final const val MODE_ADD: Long = 0

    /**
     * The light texture of the Light2D is used as a mask, hiding or revealing parts of the screen underneath depending on the value of each pixel of the light (mask) texture.
     */
    public final const val MODE_MASK: Long = 3

    /**
     * Mix the value of pixels corresponding to the Light2D to the values of pixels under it by linear interpolation.
     */
    public final const val MODE_MIX: Long = 2

    /**
     * Subtracts the value of pixels corresponding to the Light2D to the values of pixels under it, resulting in inversed light effect.
     */
    public final const val MODE_SUB: Long = 1

    /**
     * No filter applies to the shadow map. See [shadowFilter].
     */
    public final const val SHADOW_FILTER_NONE: Long = 0

    /**
     * Percentage closer filtering (13 samples) applies to the shadow map. See [shadowFilter].
     */
    public final const val SHADOW_FILTER_PCF13: Long = 5

    /**
     * Percentage closer filtering (3 samples) applies to the shadow map. See [shadowFilter].
     */
    public final const val SHADOW_FILTER_PCF3: Long = 1

    /**
     * Percentage closer filtering (5 samples) applies to the shadow map. See [shadowFilter].
     */
    public final const val SHADOW_FILTER_PCF5: Long = 2

    /**
     * Percentage closer filtering (7 samples) applies to the shadow map. See [shadowFilter].
     */
    public final const val SHADOW_FILTER_PCF7: Long = 3

    /**
     * Percentage closer filtering (9 samples) applies to the shadow map. See [shadowFilter].
     */
    public final const val SHADOW_FILTER_PCF9: Long = 4
  }
}
