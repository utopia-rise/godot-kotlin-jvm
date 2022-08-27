// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.Rect2
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.RECT2
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * 2D sprite node in 3D environment.
 *
 * A node that displays 2D texture information in a 3D environment.
 */
@GodotBaseType
public open class SpriteBase3D : GeometryInstance() {
  /**
   *
   */
  public open var alphaCut: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_GET_ALPHA_CUT, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_SET_ALPHA_CUT, NIL)
    }

  /**
   * The direction in which the front of the texture faces.
   */
  public open var axis: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_GET_AXIS, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_SET_AXIS, NIL)
    }

  /**
   *
   */
  public open var billboard: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_GET_BILLBOARD, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_SET_BILLBOARD, NIL)
    }

  /**
   * If `true`, texture will be centered.
   */
  public open var centered: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_GET_CENTERED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_SET_CENTERED, NIL)
    }

  /**
   * If `true`, texture can be seen from the back as well, if `false`, it is invisible when looking at it from behind.
   */
  public open var doubleSided: Boolean
    get() {
      TransferContext.writeArguments(LONG to 2L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_GET_DOUBLE_SIDED,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 2L, BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_SET_DOUBLE_SIDED,
          NIL)
    }

  /**
   * If `true`, the label is rendered at the same size regardless of distance.
   */
  public open var fixedSize: Boolean
    get() {
      TransferContext.writeArguments(LONG to 4L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_GET_FIXED_SIZE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 4L, BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_SET_FIXED_SIZE, NIL)
    }

  /**
   * If `true`, texture is flipped horizontally.
   */
  public open var flipH: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_GET_FLIP_H, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_SET_FLIP_H, NIL)
    }

  /**
   * If `true`, texture is flipped vertically.
   */
  public open var flipV: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_GET_FLIP_V, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_SET_FLIP_V, NIL)
    }

  /**
   * A color value used to *multiply* the texture's colors. Can be used for mood-coloring or to simulate the color of light.
   *
   * **Note:** If a [godot.GeometryInstance.materialOverride] is defined on the [godot.SpriteBase3D], the material override must be configured to take vertex colors into account for albedo. Otherwise, the color defined in [modulate] will be ignored. For a [godot.SpatialMaterial], [godot.SpatialMaterial.vertexColorUseAsAlbedo] must be `true`. For a [godot.ShaderMaterial], `ALBEDO *= COLOR.rgb;` must be inserted in the shader's `fragment()` function.
   */
  public open var modulate: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_GET_MODULATE, COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_SET_MODULATE, NIL)
    }

  /**
   * If `true`, depth testing is disabled and the object will be drawn in render order.
   */
  public open var noDepthTest: Boolean
    get() {
      TransferContext.writeArguments(LONG to 3L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_GET_NO_DEPTH_TEST,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 3L, BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_SET_NO_DEPTH_TEST,
          NIL)
    }

  /**
   * The texture's drawing offset.
   */
  public open var offset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_GET_OFFSET, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_SET_OFFSET, NIL)
    }

  /**
   * The texture's visibility on a scale from `0` (fully invisible) to `1` (fully visible). [opacity] is a multiplier for the [modulate] color's alpha channel.
   *
   * **Note:** If a [godot.GeometryInstance.materialOverride] is defined on the [godot.SpriteBase3D], the material override must be configured to take vertex colors into account for albedo. Otherwise, the opacity defined in [opacity] will be ignored. For a [godot.SpatialMaterial], [godot.SpatialMaterial.vertexColorUseAsAlbedo] must be `true`. For a [godot.ShaderMaterial], `ALPHA *= COLOR.a;` must be inserted in the shader's `fragment()` function.
   */
  public open var opacity: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_GET_OPACITY, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_SET_OPACITY, NIL)
    }

  /**
   * The size of one pixel's width on the sprite to scale it in 3D.
   */
  public open var pixelSize: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_GET_PIXEL_SIZE,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_SET_PIXEL_SIZE, NIL)
    }

  /**
   * Sets the render priority for the sprite. Higher priority objects will be sorted in front of lower priority objects.
   *
   * **Note:** This only applies if [alphaCut] is set to [ALPHA_CUT_DISABLED] (default value).
   *
   * **Note:** This only applies to sorting of transparent objects. This will not impact how transparent objects are sorted relative to opaque objects. This is because opaque objects are not sorted, while transparent objects are sorted from back to front (subject to priority).
   */
  public open var renderPriority: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_GET_RENDER_PRIORITY,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_SET_RENDER_PRIORITY,
          NIL)
    }

  /**
   * If `true`, the [godot.Light] in the [godot.Environment] has effects on the sprite.
   */
  public open var shaded: Boolean
    get() {
      TransferContext.writeArguments(LONG to 1L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_GET_SHADED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 1L, BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_SET_SHADED, NIL)
    }

  /**
   * If `true`, the texture's transparency and the opacity are used to make those parts of the sprite invisible.
   */
  public open var transparent: Boolean
    get() {
      TransferContext.writeArguments(LONG to 0L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_GET_TRANSPARENT,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 0L, BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_SET_TRANSPARENT, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_SPRITEBASE3D)
  }

  @CoreTypeHelper
  public open fun modulate(schedule: Color.() -> Unit): Color = modulate.apply{
      schedule(this)
      modulate = this
  }


  @CoreTypeHelper
  public open fun offset(schedule: Vector2.() -> Unit): Vector2 = offset.apply{
      schedule(this)
      offset = this
  }


  public open fun _imUpdate(): Unit {
  }

  public open fun _queueUpdate(): Unit {
  }

  /**
   *
   */
  public open fun generateTriangleMesh(): TriangleMesh? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_GENERATE_TRIANGLE_MESH,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as TriangleMesh?
  }

  /**
   * Returns the rectangle representing this sprite.
   */
  public open fun getItemRect(): Rect2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_GET_ITEM_RECT, RECT2)
    return TransferContext.readReturnValue(RECT2, false) as Rect2
  }

  public enum class DrawFlags(
    id: Long
  ) {
    /**
     * If set, the texture's transparency and the opacity are used to make those parts of the sprite invisible.
     */
    FLAG_TRANSPARENT(0),
    /**
     * If set, lights in the environment affect the sprite.
     */
    FLAG_SHADED(1),
    /**
     * If set, texture can be seen from the back as well, if not, it is invisible when looking at it from behind.
     */
    FLAG_DOUBLE_SIDED(2),
    /**
     * Disables the depth test, so this object is drawn on top of all others. However, objects drawn after it in the draw order may cover it.
     */
    FLAG_DISABLE_DEPTH_TEST(3),
    /**
     * Sprite is scaled by depth so that it always appears the same size on screen.
     */
    FLAG_FIXED_SIZE(4),
    /**
     * Represents the size of the [enum DrawFlags] enum.
     */
    FLAG_MAX(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class AlphaCutMode(
    id: Long
  ) {
    /**
     *
     */
    ALPHA_CUT_DISABLED(0),
    /**
     *
     */
    ALPHA_CUT_DISCARD(1),
    /**
     *
     */
    ALPHA_CUT_OPAQUE_PREPASS(2),
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
     *
     */
    public final const val ALPHA_CUT_DISABLED: Long = 0

    /**
     *
     */
    public final const val ALPHA_CUT_DISCARD: Long = 1

    /**
     *
     */
    public final const val ALPHA_CUT_OPAQUE_PREPASS: Long = 2

    /**
     * Disables the depth test, so this object is drawn on top of all others. However, objects drawn after it in the draw order may cover it.
     */
    public final const val FLAG_DISABLE_DEPTH_TEST: Long = 3

    /**
     * If set, texture can be seen from the back as well, if not, it is invisible when looking at it from behind.
     */
    public final const val FLAG_DOUBLE_SIDED: Long = 2

    /**
     * Sprite is scaled by depth so that it always appears the same size on screen.
     */
    public final const val FLAG_FIXED_SIZE: Long = 4

    /**
     * Represents the size of the [enum DrawFlags] enum.
     */
    public final const val FLAG_MAX: Long = 5

    /**
     * If set, lights in the environment affect the sprite.
     */
    public final const val FLAG_SHADED: Long = 1

    /**
     * If set, the texture's transparency and the opacity are used to make those parts of the sprite invisible.
     */
    public final const val FLAG_TRANSPARENT: Long = 0
  }
}
