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
import godot.core.Rect2
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.COLOR
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.RECT2
import godot.core.VariantParser.VECTOR2
import godot.core.Vector2
import godot.core.Vector3
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * A node that displays 2D texture information in a 3D environment. See also [Sprite3D] where many
 * other properties are defined.
 */
@GodotBaseType
public open class SpriteBase3D internal constructor() : GeometryInstance3D() {
  /**
   * If `true`, texture will be centered.
   */
  public final inline var centered: Boolean
    @JvmName("centeredProperty")
    get() = isCentered()
    @JvmName("centeredProperty")
    set(`value`) {
      setCentered(value)
    }

  /**
   * The texture's drawing offset.
   *
   * **Warning:**
   * Be careful when trying to modify a local
   * [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this
   * getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again
   * afterward.
   */
  @CoreTypeLocalCopy
  public final inline var offset: Vector2
    @JvmName("offsetProperty")
    get() = getOffset()
    @JvmName("offsetProperty")
    set(`value`) {
      setOffset(value)
    }

  /**
   * If `true`, texture is flipped horizontally.
   */
  public final inline var flipH: Boolean
    @JvmName("flipHProperty")
    get() = isFlippedH()
    @JvmName("flipHProperty")
    set(`value`) {
      setFlipH(value)
    }

  /**
   * If `true`, texture is flipped vertically.
   */
  public final inline var flipV: Boolean
    @JvmName("flipVProperty")
    get() = isFlippedV()
    @JvmName("flipVProperty")
    set(`value`) {
      setFlipV(value)
    }

  /**
   * A color value used to *multiply* the texture's colors. Can be used for mood-coloring or to
   * simulate the color of ambient light.
   *
   * **Note:** Unlike [CanvasItem.modulate] for 2D, colors with values above `1.0` (overbright) are
   * not supported.
   *
   * **Note:** If a [GeometryInstance3D.materialOverride] is defined on the [SpriteBase3D], the
   * material override must be configured to take vertex colors into account for albedo. Otherwise, the
   * color defined in [modulate] will be ignored. For a [BaseMaterial3D],
   * [BaseMaterial3D.vertexColorUseAsAlbedo] must be `true`. For a [ShaderMaterial], `ALBEDO *=
   * COLOR.rgb;` must be inserted in the shader's `fragment()` function.
   *
   * **Warning:**
   * Be careful when trying to modify a local
   * [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this
   * getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again
   * afterward.
   */
  @CoreTypeLocalCopy
  public final inline var modulate: Color
    @JvmName("modulateProperty")
    get() = getModulate()
    @JvmName("modulateProperty")
    set(`value`) {
      setModulate(value)
    }

  /**
   * The size of one pixel's width on the sprite to scale it in 3D.
   */
  public final inline var pixelSize: Float
    @JvmName("pixelSizeProperty")
    get() = getPixelSize()
    @JvmName("pixelSizeProperty")
    set(`value`) {
      setPixelSize(value)
    }

  /**
   * The direction in which the front of the texture faces.
   */
  public final inline var axis: Vector3.Axis
    @JvmName("axisProperty")
    get() = getAxis()
    @JvmName("axisProperty")
    set(`value`) {
      setAxis(value)
    }

  /**
   * The billboard mode to use for the sprite. See [BaseMaterial3D.BillboardMode] for possible
   * values.
   *
   * **Note:** When billboarding is enabled and the material also casts shadows, billboards will
   * face **the** camera in the scene when rendering shadows. In scenes with multiple cameras, the
   * intended shadow cannot be determined and this will result in undefined behavior. See
   * [url=https://github.com/godotengine/godot/pull/72638]GitHub Pull Request #72638[/url] for details.
   */
  public final inline var billboard: BaseMaterial3D.BillboardMode
    @JvmName("billboardProperty")
    get() = getBillboardMode()
    @JvmName("billboardProperty")
    set(`value`) {
      setBillboardMode(value)
    }

  /**
   * If `true`, the texture's transparency and the opacity are used to make those parts of the
   * sprite invisible.
   */
  public final inline var transparent: Boolean
    @JvmName("transparentProperty")
    get() = getDrawFlag(SpriteBase3D.DrawFlags.FLAG_TRANSPARENT)
    @JvmName("transparentProperty")
    set(`value`) {
      setDrawFlag(SpriteBase3D.DrawFlags.FLAG_TRANSPARENT, value)
    }

  /**
   * If `true`, the [Light3D] in the [Environment] has effects on the sprite.
   */
  public final inline var shaded: Boolean
    @JvmName("shadedProperty")
    get() = getDrawFlag(SpriteBase3D.DrawFlags.FLAG_SHADED)
    @JvmName("shadedProperty")
    set(`value`) {
      setDrawFlag(SpriteBase3D.DrawFlags.FLAG_SHADED, value)
    }

  /**
   * If `true`, texture can be seen from the back as well, if `false`, it is invisible when looking
   * at it from behind.
   */
  public final inline var doubleSided: Boolean
    @JvmName("doubleSidedProperty")
    get() = getDrawFlag(SpriteBase3D.DrawFlags.FLAG_DOUBLE_SIDED)
    @JvmName("doubleSidedProperty")
    set(`value`) {
      setDrawFlag(SpriteBase3D.DrawFlags.FLAG_DOUBLE_SIDED, value)
    }

  /**
   * If `true`, depth testing is disabled and the object will be drawn in render order.
   */
  public final inline var noDepthTest: Boolean
    @JvmName("noDepthTestProperty")
    get() = getDrawFlag(SpriteBase3D.DrawFlags.FLAG_DISABLE_DEPTH_TEST)
    @JvmName("noDepthTestProperty")
    set(`value`) {
      setDrawFlag(SpriteBase3D.DrawFlags.FLAG_DISABLE_DEPTH_TEST, value)
    }

  /**
   * If `true`, the label is rendered at the same size regardless of distance.
   */
  public final inline var fixedSize: Boolean
    @JvmName("fixedSizeProperty")
    get() = getDrawFlag(SpriteBase3D.DrawFlags.FLAG_FIXED_SIZE)
    @JvmName("fixedSizeProperty")
    set(`value`) {
      setDrawFlag(SpriteBase3D.DrawFlags.FLAG_FIXED_SIZE, value)
    }

  /**
   * The alpha cutting mode to use for the sprite. See [AlphaCutMode] for possible values.
   */
  public final inline var alphaCut: AlphaCutMode
    @JvmName("alphaCutProperty")
    get() = getAlphaCutMode()
    @JvmName("alphaCutProperty")
    set(`value`) {
      setAlphaCutMode(value)
    }

  /**
   * Threshold at which the alpha scissor will discard values.
   */
  public final inline var alphaScissorThreshold: Float
    @JvmName("alphaScissorThresholdProperty")
    get() = getAlphaScissorThreshold()
    @JvmName("alphaScissorThresholdProperty")
    set(`value`) {
      setAlphaScissorThreshold(value)
    }

  /**
   * The hashing scale for Alpha Hash. Recommended values between `0` and `2`.
   */
  public final inline var alphaHashScale: Float
    @JvmName("alphaHashScaleProperty")
    get() = getAlphaHashScale()
    @JvmName("alphaHashScaleProperty")
    set(`value`) {
      setAlphaHashScale(value)
    }

  /**
   * The type of alpha antialiasing to apply. See [BaseMaterial3D.AlphaAntiAliasing].
   */
  public final inline var alphaAntialiasingMode: BaseMaterial3D.AlphaAntiAliasing
    @JvmName("alphaAntialiasingModeProperty")
    get() = getAlphaAntialiasing()
    @JvmName("alphaAntialiasingModeProperty")
    set(`value`) {
      setAlphaAntialiasing(value)
    }

  /**
   * Threshold at which antialiasing will be applied on the alpha channel.
   */
  public final inline var alphaAntialiasingEdge: Float
    @JvmName("alphaAntialiasingEdgeProperty")
    get() = getAlphaAntialiasingEdge()
    @JvmName("alphaAntialiasingEdgeProperty")
    set(`value`) {
      setAlphaAntialiasingEdge(value)
    }

  /**
   * Filter flags for the texture. See [BaseMaterial3D.TextureFilter] for options.
   *
   * **Note:** Linear filtering may cause artifacts around the edges, which are especially
   * noticeable on opaque textures. To prevent this, use textures with transparent or identical colors
   * around the edges.
   */
  public final inline var textureFilter: BaseMaterial3D.TextureFilter
    @JvmName("textureFilterProperty")
    get() = getTextureFilter()
    @JvmName("textureFilterProperty")
    set(`value`) {
      setTextureFilter(value)
    }

  /**
   * Sets the render priority for the sprite. Higher priority objects will be sorted in front of
   * lower priority objects.
   *
   * **Note:** This only applies if [alphaCut] is set to [ALPHA_CUT_DISABLED] (default value).
   *
   * **Note:** This only applies to sorting of transparent objects. This will not impact how
   * transparent objects are sorted relative to opaque objects. This is because opaque objects are not
   * sorted, while transparent objects are sorted from back to front (subject to priority).
   */
  public final inline var renderPriority: Int
    @JvmName("renderPriorityProperty")
    get() = getRenderPriority()
    @JvmName("renderPriorityProperty")
    set(`value`) {
      setRenderPriority(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(629, scriptIndex)
  }

  /**
   * This is a helper function for [offset] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = spritebase3d.offset
   * //Your changes
   * spritebase3d.offset = myCoreType
   * ``````
   *
   * The texture's drawing offset.
   */
  @CoreTypeHelper
  public final fun offsetMutate(block: Vector2.() -> Unit): Vector2 = offset.apply {
     block(this)
     offset = this
  }

  /**
   * This is a helper function for [modulate] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = spritebase3d.modulate
   * //Your changes
   * spritebase3d.modulate = myCoreType
   * ``````
   *
   * A color value used to *multiply* the texture's colors. Can be used for mood-coloring or to
   * simulate the color of ambient light.
   *
   * **Note:** Unlike [CanvasItem.modulate] for 2D, colors with values above `1.0` (overbright) are
   * not supported.
   *
   * **Note:** If a [GeometryInstance3D.materialOverride] is defined on the [SpriteBase3D], the
   * material override must be configured to take vertex colors into account for albedo. Otherwise, the
   * color defined in [modulate] will be ignored. For a [BaseMaterial3D],
   * [BaseMaterial3D.vertexColorUseAsAlbedo] must be `true`. For a [ShaderMaterial], `ALBEDO *=
   * COLOR.rgb;` must be inserted in the shader's `fragment()` function.
   */
  @CoreTypeHelper
  public final fun modulateMutate(block: Color.() -> Unit): Color = modulate.apply {
     block(this)
     modulate = this
  }

  public final fun setCentered(centered: Boolean): Unit {
    TransferContext.writeArguments(BOOL to centered)
    TransferContext.callMethod(ptr, MethodBindings.setCenteredPtr, NIL)
  }

  public final fun isCentered(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isCenteredPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setOffset(offset: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to offset)
    TransferContext.callMethod(ptr, MethodBindings.setOffsetPtr, NIL)
  }

  public final fun getOffset(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getOffsetPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun setFlipH(flipH: Boolean): Unit {
    TransferContext.writeArguments(BOOL to flipH)
    TransferContext.callMethod(ptr, MethodBindings.setFlipHPtr, NIL)
  }

  public final fun isFlippedH(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isFlippedHPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setFlipV(flipV: Boolean): Unit {
    TransferContext.writeArguments(BOOL to flipV)
    TransferContext.callMethod(ptr, MethodBindings.setFlipVPtr, NIL)
  }

  public final fun isFlippedV(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isFlippedVPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setModulate(modulate: Color): Unit {
    TransferContext.writeArguments(COLOR to modulate)
    TransferContext.callMethod(ptr, MethodBindings.setModulatePtr, NIL)
  }

  public final fun getModulate(): Color {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getModulatePtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  public final fun setRenderPriority(priority: Int): Unit {
    TransferContext.writeArguments(LONG to priority.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setRenderPriorityPtr, NIL)
  }

  public final fun getRenderPriority(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRenderPriorityPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setPixelSize(pixelSize: Float): Unit {
    TransferContext.writeArguments(DOUBLE to pixelSize.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setPixelSizePtr, NIL)
  }

  public final fun getPixelSize(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPixelSizePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setAxis(axis: Vector3.Axis): Unit {
    TransferContext.writeArguments(LONG to axis.id)
    TransferContext.callMethod(ptr, MethodBindings.setAxisPtr, NIL)
  }

  public final fun getAxis(): Vector3.Axis {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAxisPtr, LONG)
    return Vector3.Axis.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * If `true`, the specified flag will be enabled. See [SpriteBase3D.DrawFlags] for a list of
   * flags.
   */
  public final fun setDrawFlag(flag: DrawFlags, enabled: Boolean): Unit {
    TransferContext.writeArguments(LONG to flag.id, BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setDrawFlagPtr, NIL)
  }

  /**
   * Returns the value of the specified flag.
   */
  public final fun getDrawFlag(flag: DrawFlags): Boolean {
    TransferContext.writeArguments(LONG to flag.id)
    TransferContext.callMethod(ptr, MethodBindings.getDrawFlagPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setAlphaCutMode(mode: AlphaCutMode): Unit {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(ptr, MethodBindings.setAlphaCutModePtr, NIL)
  }

  public final fun getAlphaCutMode(): AlphaCutMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAlphaCutModePtr, LONG)
    return AlphaCutMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setAlphaScissorThreshold(threshold: Float): Unit {
    TransferContext.writeArguments(DOUBLE to threshold.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setAlphaScissorThresholdPtr, NIL)
  }

  public final fun getAlphaScissorThreshold(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAlphaScissorThresholdPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setAlphaHashScale(threshold: Float): Unit {
    TransferContext.writeArguments(DOUBLE to threshold.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setAlphaHashScalePtr, NIL)
  }

  public final fun getAlphaHashScale(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAlphaHashScalePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setAlphaAntialiasing(alphaAa: BaseMaterial3D.AlphaAntiAliasing): Unit {
    TransferContext.writeArguments(LONG to alphaAa.id)
    TransferContext.callMethod(ptr, MethodBindings.setAlphaAntialiasingPtr, NIL)
  }

  public final fun getAlphaAntialiasing(): BaseMaterial3D.AlphaAntiAliasing {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAlphaAntialiasingPtr, LONG)
    return BaseMaterial3D.AlphaAntiAliasing.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setAlphaAntialiasingEdge(edge: Float): Unit {
    TransferContext.writeArguments(DOUBLE to edge.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setAlphaAntialiasingEdgePtr, NIL)
  }

  public final fun getAlphaAntialiasingEdge(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAlphaAntialiasingEdgePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setBillboardMode(mode: BaseMaterial3D.BillboardMode): Unit {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(ptr, MethodBindings.setBillboardModePtr, NIL)
  }

  public final fun getBillboardMode(): BaseMaterial3D.BillboardMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBillboardModePtr, LONG)
    return BaseMaterial3D.BillboardMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setTextureFilter(mode: BaseMaterial3D.TextureFilter): Unit {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(ptr, MethodBindings.setTextureFilterPtr, NIL)
  }

  public final fun getTextureFilter(): BaseMaterial3D.TextureFilter {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTextureFilterPtr, LONG)
    return BaseMaterial3D.TextureFilter.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the rectangle representing this sprite.
   */
  public final fun getItemRect(): Rect2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getItemRectPtr, RECT2)
    return (TransferContext.readReturnValue(RECT2) as Rect2)
  }

  /**
   * Returns a [TriangleMesh] with the sprite's vertices following its current configuration (such
   * as its [axis] and [pixelSize]).
   */
  public final fun generateTriangleMesh(): TriangleMesh? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.generateTriangleMeshPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as TriangleMesh?)
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
    DISABLED(0),
    /**
     * This mode only allows fully transparent or fully opaque pixels. Harsh edges will be visible
     * unless some form of screen-space antialiasing is enabled (see
     * [ProjectSettings.rendering/antiAliasing/quality/screenSpaceAa]). On the bright side, this mode
     * doesn't suffer from transparency sorting issues when multiple transparent materials are
     * overlapping. This mode is also known as *alpha testing* or *1-bit transparency*.
     */
    DISCARD(1),
    /**
     * This mode draws fully opaque pixels in the depth prepass. This is slower than
     * [ALPHA_CUT_DISABLED] or [ALPHA_CUT_DISCARD], but it allows displaying translucent areas and
     * smooth edges while using proper sorting.
     */
    OPAQUE_PREPASS(2),
    /**
     * This mode draws cuts off all values below a spatially-deterministic threshold, the rest will
     * remain opaque.
     */
    HASH(3),
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

  public object MethodBindings {
    internal val setCenteredPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "set_centered", 2586408642)

    internal val isCenteredPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "is_centered", 36873697)

    internal val setOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "set_offset", 743155724)

    internal val getOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "get_offset", 3341600327)

    internal val setFlipHPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "set_flip_h", 2586408642)

    internal val isFlippedHPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "is_flipped_h", 36873697)

    internal val setFlipVPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "set_flip_v", 2586408642)

    internal val isFlippedVPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "is_flipped_v", 36873697)

    internal val setModulatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "set_modulate", 2920490490)

    internal val getModulatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "get_modulate", 3444240500)

    internal val setRenderPriorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "set_render_priority", 1286410249)

    internal val getRenderPriorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "get_render_priority", 3905245786)

    internal val setPixelSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "set_pixel_size", 373806689)

    internal val getPixelSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "get_pixel_size", 1740695150)

    internal val setAxisPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "set_axis", 1144690656)

    internal val getAxisPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "get_axis", 3050976882)

    internal val setDrawFlagPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "set_draw_flag", 1135633219)

    internal val getDrawFlagPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "get_draw_flag", 1733036628)

    internal val setAlphaCutModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "set_alpha_cut_mode", 227561226)

    internal val getAlphaCutModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "get_alpha_cut_mode", 336003791)

    internal val setAlphaScissorThresholdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "set_alpha_scissor_threshold", 373806689)

    internal val getAlphaScissorThresholdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "get_alpha_scissor_threshold", 1740695150)

    internal val setAlphaHashScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "set_alpha_hash_scale", 373806689)

    internal val getAlphaHashScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "get_alpha_hash_scale", 1740695150)

    internal val setAlphaAntialiasingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "set_alpha_antialiasing", 3212649852)

    internal val getAlphaAntialiasingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "get_alpha_antialiasing", 2889939400)

    internal val setAlphaAntialiasingEdgePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "set_alpha_antialiasing_edge", 373806689)

    internal val getAlphaAntialiasingEdgePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "get_alpha_antialiasing_edge", 1740695150)

    internal val setBillboardModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "set_billboard_mode", 4202036497)

    internal val getBillboardModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "get_billboard_mode", 1283840139)

    internal val setTextureFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "set_texture_filter", 22904437)

    internal val getTextureFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "get_texture_filter", 3289213076)

    internal val getItemRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "get_item_rect", 1639390495)

    internal val generateTriangleMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpriteBase3D", "generate_triangle_mesh", 3476533166)
  }
}
