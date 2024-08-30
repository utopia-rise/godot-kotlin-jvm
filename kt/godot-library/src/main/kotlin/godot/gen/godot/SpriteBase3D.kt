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
import godot.core.Rect2
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.RECT2
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.Vector3
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
 * A node that displays 2D texture information in a 3D environment. See also [Sprite3D] where many
 * other properties are defined.
 */
@GodotBaseType
public open class SpriteBase3D internal constructor() : GeometryInstance3D() {
  /**
   * If `true`, texture will be centered.
   */
  public var centered: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isCenteredPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCenteredPtr, NIL)
    }

  /**
   * The texture's drawing offset.
   */
  @CoreTypeLocalCopy
  public var offset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getOffsetPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setOffsetPtr, NIL)
    }

  /**
   * If `true`, texture is flipped horizontally.
   */
  public var flipH: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isFlippedHPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFlipHPtr, NIL)
    }

  /**
   * If `true`, texture is flipped vertically.
   */
  public var flipV: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isFlippedVPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFlipVPtr, NIL)
    }

  /**
   * A color value used to *multiply* the texture's colors. Can be used for mood-coloring or to
   * simulate the color of ambient light.
   * **Note:** Unlike [CanvasItem.modulate] for 2D, colors with values above `1.0` (overbright) are
   * not supported.
   * **Note:** If a [GeometryInstance3D.materialOverride] is defined on the [SpriteBase3D], the
   * material override must be configured to take vertex colors into account for albedo. Otherwise, the
   * color defined in [modulate] will be ignored. For a [BaseMaterial3D],
   * [BaseMaterial3D.vertexColorUseAsAlbedo] must be `true`. For a [ShaderMaterial], `ALBEDO *=
   * COLOR.rgb;` must be inserted in the shader's `fragment()` function.
   */
  @CoreTypeLocalCopy
  public var modulate: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getModulatePtr, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setModulatePtr, NIL)
    }

  /**
   * The size of one pixel's width on the sprite to scale it in 3D.
   */
  public var pixelSize: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPixelSizePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setPixelSizePtr, NIL)
    }

  /**
   * The direction in which the front of the texture faces.
   */
  public var axis: Vector3.Axis
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAxisPtr, LONG)
      return Vector3.Axis.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setAxisPtr, NIL)
    }

  /**
   * The billboard mode to use for the sprite. See [BaseMaterial3D.BillboardMode] for possible
   * values.
   * **Note:** When billboarding is enabled and the material also casts shadows, billboards will
   * face **the** camera in the scene when rendering shadows. In scenes with multiple cameras, the
   * intended shadow cannot be determined and this will result in undefined behavior. See
   * [url=https://github.com/godotengine/godot/pull/72638]GitHub Pull Request #72638[/url] for details.
   */
  public var billboard: BaseMaterial3D.BillboardMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBillboardModePtr, LONG)
      return BaseMaterial3D.BillboardMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setBillboardModePtr, NIL)
    }

  /**
   * If `true`, the texture's transparency and the opacity are used to make those parts of the
   * sprite invisible.
   */
  public var transparent: Boolean
    get() {
      TransferContext.writeArguments(LONG to 0L)
      TransferContext.callMethod(rawPtr, MethodBindings.getDrawFlagPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 0L, BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDrawFlagPtr, NIL)
    }

  /**
   * If `true`, the [Light3D] in the [Environment] has effects on the sprite.
   */
  public var shaded: Boolean
    get() {
      TransferContext.writeArguments(LONG to 1L)
      TransferContext.callMethod(rawPtr, MethodBindings.getDrawFlagPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 1L, BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDrawFlagPtr, NIL)
    }

  /**
   * If `true`, texture can be seen from the back as well, if `false`, it is invisible when looking
   * at it from behind.
   */
  public var doubleSided: Boolean
    get() {
      TransferContext.writeArguments(LONG to 2L)
      TransferContext.callMethod(rawPtr, MethodBindings.getDrawFlagPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 2L, BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDrawFlagPtr, NIL)
    }

  /**
   * If `true`, depth testing is disabled and the object will be drawn in render order.
   */
  public var noDepthTest: Boolean
    get() {
      TransferContext.writeArguments(LONG to 3L)
      TransferContext.callMethod(rawPtr, MethodBindings.getDrawFlagPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 3L, BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDrawFlagPtr, NIL)
    }

  /**
   * If `true`, the label is rendered at the same size regardless of distance.
   */
  public var fixedSize: Boolean
    get() {
      TransferContext.writeArguments(LONG to 4L)
      TransferContext.callMethod(rawPtr, MethodBindings.getDrawFlagPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 4L, BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDrawFlagPtr, NIL)
    }

  /**
   * The alpha cutting mode to use for the sprite. See [AlphaCutMode] for possible values.
   */
  public var alphaCut: AlphaCutMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAlphaCutModePtr, LONG)
      return SpriteBase3D.AlphaCutMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setAlphaCutModePtr, NIL)
    }

  /**
   * Threshold at which the alpha scissor will discard values.
   */
  public var alphaScissorThreshold: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAlphaScissorThresholdPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setAlphaScissorThresholdPtr, NIL)
    }

  /**
   * The hashing scale for Alpha Hash. Recommended values between `0` and `2`.
   */
  public var alphaHashScale: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAlphaHashScalePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setAlphaHashScalePtr, NIL)
    }

  /**
   * The type of alpha antialiasing to apply. See [BaseMaterial3D.AlphaAntiAliasing].
   */
  public var alphaAntialiasingMode: BaseMaterial3D.AlphaAntiAliasing
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAlphaAntialiasingPtr, LONG)
      return BaseMaterial3D.AlphaAntiAliasing.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setAlphaAntialiasingPtr, NIL)
    }

  /**
   * Threshold at which antialiasing will be applied on the alpha channel.
   */
  public var alphaAntialiasingEdge: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAlphaAntialiasingEdgePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setAlphaAntialiasingEdgePtr, NIL)
    }

  /**
   * Filter flags for the texture. See [BaseMaterial3D.TextureFilter] for options.
   * **Note:** Linear filtering may cause artifacts around the edges, which are especially
   * noticeable on opaque textures. To prevent this, use textures with transparent or identical colors
   * around the edges.
   */
  public var textureFilter: BaseMaterial3D.TextureFilter
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTextureFilterPtr, LONG)
      return BaseMaterial3D.TextureFilter.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setTextureFilterPtr, NIL)
    }

  /**
   * Sets the render priority for the sprite. Higher priority objects will be sorted in front of
   * lower priority objects.
   * **Note:** This only applies if [alphaCut] is set to [ALPHA_CUT_DISABLED] (default value).
   * **Note:** This only applies to sorting of transparent objects. This will not impact how
   * transparent objects are sorted relative to opaque objects. This is because opaque objects are not
   * sorted, while transparent objects are sorted from back to front (subject to priority).
   */
  public var renderPriority: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRenderPriorityPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setRenderPriorityPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SPRITEBASE3D, scriptIndex)
    return true
  }

  /**
   * The texture's drawing offset.
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
   * val myCoreType = spritebase3d.offset
   * //Your changes
   * spritebase3d.offset = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun offsetMutate(block: Vector2.() -> Unit): Vector2 = offset.apply{
      block(this)
      offset = this
  }


  /**
   * A color value used to *multiply* the texture's colors. Can be used for mood-coloring or to
   * simulate the color of ambient light.
   * **Note:** Unlike [CanvasItem.modulate] for 2D, colors with values above `1.0` (overbright) are
   * not supported.
   * **Note:** If a [GeometryInstance3D.materialOverride] is defined on the [SpriteBase3D], the
   * material override must be configured to take vertex colors into account for albedo. Otherwise, the
   * color defined in [modulate] will be ignored. For a [BaseMaterial3D],
   * [BaseMaterial3D.vertexColorUseAsAlbedo] must be `true`. For a [ShaderMaterial], `ALBEDO *=
   * COLOR.rgb;` must be inserted in the shader's `fragment()` function.
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
   * val myCoreType = spritebase3d.modulate
   * //Your changes
   * spritebase3d.modulate = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun modulateMutate(block: Color.() -> Unit): Color = modulate.apply{
      block(this)
      modulate = this
  }


  /**
   * Returns the rectangle representing this sprite.
   */
  public fun getItemRect(): Rect2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getItemRectPtr, RECT2)
    return (TransferContext.readReturnValue(RECT2, false) as Rect2)
  }

  /**
   * Returns a [TriangleMesh] with the sprite's vertices following its current configuration (such
   * as its [axis] and [pixelSize]).
   */
  public fun generateTriangleMesh(): TriangleMesh? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.generateTriangleMeshPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as TriangleMesh?)
  }

  public enum class DrawFlags(
    id: Long,
  ) {
    /**
     * If set, the texture's transparency and the opacity are used to make those parts of the sprite
     * invisible.
     */
    FLAG_TRANSPARENT(0),
    /**
     * If set, lights in the environment affect the sprite.
     */
    FLAG_SHADED(1),
    /**
     * If set, texture can be seen from the back as well. If not, the texture is invisible when
     * looking at it from behind.
     */
    FLAG_DOUBLE_SIDED(2),
    /**
     * Disables the depth test, so this object is drawn on top of all others. However, objects drawn
     * after it in the draw order may cover it.
     */
    FLAG_DISABLE_DEPTH_TEST(3),
    /**
     * Label is scaled by depth so that it always appears the same size on screen.
     */
    FLAG_FIXED_SIZE(4),
    /**
     * Represents the size of the [DrawFlags] enum.
     */
    FLAG_MAX(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): DrawFlags = entries.single { it.id == `value` }
    }
  }

  public enum class AlphaCutMode(
    id: Long,
  ) {
    /**
     * This mode performs standard alpha blending. It can display translucent areas, but
     * transparency sorting issues may be visible when multiple transparent materials are overlapping.
     */
    ALPHA_CUT_DISABLED(0),
    /**
     * This mode only allows fully transparent or fully opaque pixels. Harsh edges will be visible
     * unless some form of screen-space antialiasing is enabled (see
     * [ProjectSettings.rendering/antiAliasing/quality/screenSpaceAa]). On the bright side, this mode
     * doesn't suffer from transparency sorting issues when multiple transparent materials are
     * overlapping. This mode is also known as *alpha testing* or *1-bit transparency*.
     */
    ALPHA_CUT_DISCARD(1),
    /**
     * This mode draws fully opaque pixels in the depth prepass. This is slower than
     * [ALPHA_CUT_DISABLED] or [ALPHA_CUT_DISCARD], but it allows displaying translucent areas and
     * smooth edges while using proper sorting.
     */
    ALPHA_CUT_OPAQUE_PREPASS(2),
    /**
     * This mode draws cuts off all values below a spatially-deterministic threshold, the rest will
     * remain opaque.
     */
    ALPHA_CUT_HASH(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): AlphaCutMode = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setCenteredPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "set_centered")

    public val isCenteredPtr: VoidPtr = TypeManager.getMethodBindPtr("SpriteBase3D", "is_centered")

    public val setOffsetPtr: VoidPtr = TypeManager.getMethodBindPtr("SpriteBase3D", "set_offset")

    public val getOffsetPtr: VoidPtr = TypeManager.getMethodBindPtr("SpriteBase3D", "get_offset")

    public val setFlipHPtr: VoidPtr = TypeManager.getMethodBindPtr("SpriteBase3D", "set_flip_h")

    public val isFlippedHPtr: VoidPtr = TypeManager.getMethodBindPtr("SpriteBase3D", "is_flipped_h")

    public val setFlipVPtr: VoidPtr = TypeManager.getMethodBindPtr("SpriteBase3D", "set_flip_v")

    public val isFlippedVPtr: VoidPtr = TypeManager.getMethodBindPtr("SpriteBase3D", "is_flipped_v")

    public val setModulatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "set_modulate")

    public val getModulatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "get_modulate")

    public val setRenderPriorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "set_render_priority")

    public val getRenderPriorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "get_render_priority")

    public val setPixelSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "set_pixel_size")

    public val getPixelSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "get_pixel_size")

    public val setAxisPtr: VoidPtr = TypeManager.getMethodBindPtr("SpriteBase3D", "set_axis")

    public val getAxisPtr: VoidPtr = TypeManager.getMethodBindPtr("SpriteBase3D", "get_axis")

    public val setDrawFlagPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "set_draw_flag")

    public val getDrawFlagPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "get_draw_flag")

    public val setAlphaCutModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "set_alpha_cut_mode")

    public val getAlphaCutModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "get_alpha_cut_mode")

    public val setAlphaScissorThresholdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "set_alpha_scissor_threshold")

    public val getAlphaScissorThresholdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "get_alpha_scissor_threshold")

    public val setAlphaHashScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "set_alpha_hash_scale")

    public val getAlphaHashScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "get_alpha_hash_scale")

    public val setAlphaAntialiasingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "set_alpha_antialiasing")

    public val getAlphaAntialiasingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "get_alpha_antialiasing")

    public val setAlphaAntialiasingEdgePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "set_alpha_antialiasing_edge")

    public val getAlphaAntialiasingEdgePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "get_alpha_antialiasing_edge")

    public val setBillboardModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "set_billboard_mode")

    public val getBillboardModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "get_billboard_mode")

    public val setTextureFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "set_texture_filter")

    public val getTextureFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "get_texture_filter")

    public val getItemRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "get_item_rect")

    public val generateTriangleMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "generate_triangle_mesh")
  }
}
