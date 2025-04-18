// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * This resource defines a custom rendering effect that can be applied to [Viewport]s through the
 * viewports' [Environment]. You can implement a callback that is called during rendering at a given
 * stage of the rendering pipeline and allows you to insert additional passes. Note that this callback
 * happens on the rendering thread. CompositorEffect is an abstract base class and must be extended to
 * implement specific rendering logic.
 */
@GodotBaseType
public open class CompositorEffect : Resource() {
  /**
   * If `true` this rendering effect is applied to any viewport it is added to.
   */
  public final inline var enabled: Boolean
    @JvmName("enabledProperty")
    get() = getEnabled()
    @JvmName("enabledProperty")
    set(`value`) {
      setEnabled(value)
    }

  /**
   * The type of effect that is implemented, determines at what stage of rendering the callback is
   * called.
   */
  public final inline var effectCallbackType: EffectCallbackType
    @JvmName("effectCallbackTypeProperty")
    get() = getEffectCallbackType()
    @JvmName("effectCallbackTypeProperty")
    set(`value`) {
      setEffectCallbackType(value)
    }

  /**
   * If `true` and MSAA is enabled, this will trigger a color buffer resolve before the effect is
   * run.
   *
   * **Note:** In [_renderCallback], to access the resolved buffer use:
   *
   * ```
   * var render_scene_buffers = render_data.get_render_scene_buffers()
   * var color_buffer = render_scene_buffers.get_texture("render_buffers", "color")
   * ```
   */
  public final inline var accessResolvedColor: Boolean
    @JvmName("accessResolvedColorProperty")
    get() = getAccessResolvedColor()
    @JvmName("accessResolvedColorProperty")
    set(`value`) {
      setAccessResolvedColor(value)
    }

  /**
   * If `true` and MSAA is enabled, this will trigger a depth buffer resolve before the effect is
   * run.
   *
   * **Note:** In [_renderCallback], to access the resolved buffer use:
   *
   * ```
   * var render_scene_buffers = render_data.get_render_scene_buffers()
   * var depth_buffer = render_scene_buffers.get_texture("render_buffers", "depth")
   * ```
   */
  public final inline var accessResolvedDepth: Boolean
    @JvmName("accessResolvedDepthProperty")
    get() = getAccessResolvedDepth()
    @JvmName("accessResolvedDepthProperty")
    set(`value`) {
      setAccessResolvedDepth(value)
    }

  /**
   * If `true` this triggers motion vectors being calculated during the opaque render state.
   *
   * **Note:** In [_renderCallback], to access the motion vector buffer use:
   *
   * ```
   * var render_scene_buffers = render_data.get_render_scene_buffers()
   * var motion_buffer = render_scene_buffers.get_velocity_texture()
   * ```
   */
  public final inline var needsMotionVectors: Boolean
    @JvmName("needsMotionVectorsProperty")
    get() = getNeedsMotionVectors()
    @JvmName("needsMotionVectorsProperty")
    set(`value`) {
      setNeedsMotionVectors(value)
    }

  /**
   * If `true` this triggers normal and roughness data to be output during our depth pre-pass, only
   * applicable for the Forward+ renderer.
   *
   * **Note:** In [_renderCallback], to access the roughness buffer use:
   *
   * ```
   * var render_scene_buffers = render_data.get_render_scene_buffers()
   * var roughness_buffer = render_scene_buffers.get_texture("forward_clustered",
   * "normal_roughness")
   * ```
   *
   * The raw normal and roughness buffer is stored in an optimized format, different than the one
   * available in Spatial shaders. When sampling the buffer, a conversion function must be applied. Use
   * this function, copied from
   * [url=https://github.com/godotengine/godot/blob/da5f39889f155658cef7f7ec3cc1abb94e17d815/servers/rendering/renderer_rd/shaders/forward_clustered/scene_forward_clustered_inc.glsl#L334-L341]here[/url]:
   *
   * ```
   * vec4 normal_roughness_compatibility(vec4 p_normal_roughness) {
   *     float roughness = p_normal_roughness.w;
   *     if (roughness > 0.5) {
   *         roughness = 1.0 - roughness;
   *     }
   *     roughness /= (127.0 / 255.0);
   *     return vec4(normalize(p_normal_roughness.xyz * 2.0 - 1.0) * 0.5 + 0.5, roughness);
   * }
   * ```
   */
  public final inline var needsNormalRoughness: Boolean
    @JvmName("needsNormalRoughnessProperty")
    get() = getNeedsNormalRoughness()
    @JvmName("needsNormalRoughnessProperty")
    set(`value`) {
      setNeedsNormalRoughness(value)
    }

  /**
   * If `true` this triggers specular data being rendered to a separate buffer and combined after
   * effects have been applied, only applicable for the Forward+ renderer.
   */
  public final inline var needsSeparateSpecular: Boolean
    @JvmName("needsSeparateSpecularProperty")
    get() = getNeedsSeparateSpecular()
    @JvmName("needsSeparateSpecularProperty")
    set(`value`) {
      setNeedsSeparateSpecular(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(165, scriptIndex)
  }

  /**
   * Implement this function with your custom rendering code. [effectCallbackType] should always
   * match the effect callback type you've specified in [effectCallbackType]. [renderData] provides
   * access to the rendering state, it is only valid during rendering and should not be stored.
   */
  public open fun _renderCallback(effectCallbackType: Int, renderData: RenderData?): Unit {
    throw NotImplementedError("_renderCallback is not implemented for CompositorEffect")
  }

  public final fun setEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setEnabledPtr, NIL)
  }

  public final fun getEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setEffectCallbackType(effectCallbackType: EffectCallbackType): Unit {
    TransferContext.writeArguments(LONG to effectCallbackType.id)
    TransferContext.callMethod(ptr, MethodBindings.setEffectCallbackTypePtr, NIL)
  }

  public final fun getEffectCallbackType(): EffectCallbackType {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getEffectCallbackTypePtr, LONG)
    return EffectCallbackType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setAccessResolvedColor(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setAccessResolvedColorPtr, NIL)
  }

  public final fun getAccessResolvedColor(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAccessResolvedColorPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setAccessResolvedDepth(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setAccessResolvedDepthPtr, NIL)
  }

  public final fun getAccessResolvedDepth(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAccessResolvedDepthPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setNeedsMotionVectors(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setNeedsMotionVectorsPtr, NIL)
  }

  public final fun getNeedsMotionVectors(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getNeedsMotionVectorsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setNeedsNormalRoughness(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setNeedsNormalRoughnessPtr, NIL)
  }

  public final fun getNeedsNormalRoughness(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getNeedsNormalRoughnessPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setNeedsSeparateSpecular(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setNeedsSeparateSpecularPtr, NIL)
  }

  public final fun getNeedsSeparateSpecular(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getNeedsSeparateSpecularPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public enum class EffectCallbackType(
    id: Long,
  ) {
    /**
     * The callback is called before our opaque rendering pass, but after depth prepass (if
     * applicable).
     */
    PRE_OPAQUE(0),
    /**
     * The callback is called after our opaque rendering pass, but before our sky is rendered.
     */
    POST_OPAQUE(1),
    /**
     * The callback is called after our sky is rendered, but before our back buffers are created
     * (and if enabled, before subsurface scattering and/or screen space reflections).
     */
    POST_SKY(2),
    /**
     * The callback is called before our transparent rendering pass, but after our sky is rendered
     * and we've created our back buffers.
     */
    PRE_TRANSPARENT(3),
    /**
     * The callback is called after our transparent rendering pass, but before any built-in
     * post-processing effects and output to our render target.
     */
    POST_TRANSPARENT(4),
    /**
     * Represents the size of the [EffectCallbackType] enum.
     */
    MAX(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): EffectCallbackType = entries.single { it.id == `value` }
    }
  }

  public companion object

  public object MethodBindings {
    internal val setEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CompositorEffect", "set_enabled", 2586408642)

    internal val getEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CompositorEffect", "get_enabled", 36873697)

    internal val setEffectCallbackTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CompositorEffect", "set_effect_callback_type", 1390728419)

    internal val getEffectCallbackTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CompositorEffect", "get_effect_callback_type", 1221912590)

    internal val setAccessResolvedColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CompositorEffect", "set_access_resolved_color", 2586408642)

    internal val getAccessResolvedColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CompositorEffect", "get_access_resolved_color", 36873697)

    internal val setAccessResolvedDepthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CompositorEffect", "set_access_resolved_depth", 2586408642)

    internal val getAccessResolvedDepthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CompositorEffect", "get_access_resolved_depth", 36873697)

    internal val setNeedsMotionVectorsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CompositorEffect", "set_needs_motion_vectors", 2586408642)

    internal val getNeedsMotionVectorsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CompositorEffect", "get_needs_motion_vectors", 36873697)

    internal val setNeedsNormalRoughnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CompositorEffect", "set_needs_normal_roughness", 2586408642)

    internal val getNeedsNormalRoughnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CompositorEffect", "get_needs_normal_roughness", 36873697)

    internal val setNeedsSeparateSpecularPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CompositorEffect", "set_needs_separate_specular", 2586408642)

    internal val getNeedsSeparateSpecularPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CompositorEffect", "get_needs_separate_specular", 36873697)
  }
}
