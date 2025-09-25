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
import godot.core.GodotEnum
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.COLOR
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.VECTOR2
import godot.core.VariantParser.VECTOR2I
import godot.core.VariantParser.VECTOR3
import godot.core.Vector2
import godot.core.Vector2i
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
 * Composition layers allow 2D viewports to be displayed inside of the headset by the XR compositor
 * through special projections that retain their quality. This allows for rendering clear text while
 * keeping the layer at a native resolution.
 *
 * **Note:** If the OpenXR runtime doesn't support the given composition layer type, a fallback mesh
 * can be generated with a [ViewportTexture], in order to emulate the composition layer.
 */
@GodotBaseType
public abstract class OpenXRCompositionLayer : Node3D() {
  /**
   * The [SubViewport] to render on the composition layer.
   */
  public final inline var layerViewport: SubViewport?
    @JvmName("layerViewportProperty")
    get() = getLayerViewport()
    @JvmName("layerViewportProperty")
    set(`value`) {
      setLayerViewport(value)
    }

  /**
   * If enabled, an Android surface will be created (with the dimensions from [androidSurfaceSize])
   * which will provide the 2D content for the composition layer, rather than using [layerViewport].
   *
   * See [getAndroidSurface] for information about how to get the surface so that your application
   * can draw to it.
   *
   * **Note:** This will only work in Android builds.
   */
  public final inline var useAndroidSurface: Boolean
    @JvmName("useAndroidSurfaceProperty")
    get() = getUseAndroidSurface()
    @JvmName("useAndroidSurfaceProperty")
    set(`value`) {
      setUseAndroidSurface(value)
    }

  /**
   * The size of the Android surface to create if [useAndroidSurface] is enabled.
   *
   * **Warning:**
   * Be careful when trying to modify a local
   * [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this
   * getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again
   * afterward.
   */
  @CoreTypeLocalCopy
  public final inline var androidSurfaceSize: Vector2i
    @JvmName("androidSurfaceSizeProperty")
    get() = getAndroidSurfaceSize()
    @JvmName("androidSurfaceSizeProperty")
    set(`value`) {
      setAndroidSurfaceSize(value)
    }

  /**
   * The sort order for this composition layer. Higher numbers will be shown in front of lower
   * numbers.
   *
   * **Note:** This will have no effect if a fallback mesh is being used.
   */
  public final inline var sortOrder: Int
    @JvmName("sortOrderProperty")
    get() = getSortOrder()
    @JvmName("sortOrderProperty")
    set(`value`) {
      setSortOrder(value)
    }

  /**
   * Enables the blending the layer using its alpha channel.
   *
   * Can be combined with [Viewport.transparentBg] to give the layer a transparent background.
   */
  public final inline var alphaBlend: Boolean
    @JvmName("alphaBlendProperty")
    get() = getAlphaBlend()
    @JvmName("alphaBlendProperty")
    set(`value`) {
      setAlphaBlend(value)
    }

  /**
   * Enables a technique called "hole punching", which allows putting the composition layer behind
   * the main projection layer (i.e. setting [sortOrder] to a negative value) while "punching a hole"
   * through everything rendered by Godot so that the layer is still visible.
   *
   * This can be used to create the illusion that the composition layer exists in the same 3D space
   * as everything rendered by Godot, allowing objects to appear to pass both behind or in front of the
   * composition layer.
   */
  public final inline var enableHolePunch: Boolean
    @JvmName("enableHolePunchProperty")
    get() = getEnableHolePunch()
    @JvmName("enableHolePunchProperty")
    set(`value`) {
      setEnableHolePunch(value)
    }

  /**
   * The minification filter of the swapchain state.
   *
   * **Note:** This property only has an effect on devices that support the OpenXR
   * XR_FB_swapchain_update_state OpenGLES/Vulkan extensions.
   */
  public final inline var swapchainStateMinFilter: Filter
    @JvmName("swapchainStateMinFilterProperty")
    get() = getMinFilter()
    @JvmName("swapchainStateMinFilterProperty")
    set(`value`) {
      setMinFilter(value)
    }

  /**
   * The magnification filter of the swapchain state.
   *
   * **Note:** This property only has an effect on devices that support the OpenXR
   * XR_FB_swapchain_update_state OpenGLES/Vulkan extensions.
   */
  public final inline var swapchainStateMagFilter: Filter
    @JvmName("swapchainStateMagFilterProperty")
    get() = getMagFilter()
    @JvmName("swapchainStateMagFilterProperty")
    set(`value`) {
      setMagFilter(value)
    }

  /**
   * The mipmap mode of the swapchain state.
   *
   * **Note:** This property only has an effect on devices that support the OpenXR
   * XR_FB_swapchain_update_state OpenGLES/Vulkan extensions.
   */
  public final inline var swapchainStateMipmapMode: MipmapMode
    @JvmName("swapchainStateMipmapModeProperty")
    get() = getMipmapMode()
    @JvmName("swapchainStateMipmapModeProperty")
    set(`value`) {
      setMipmapMode(value)
    }

  /**
   * The horizontal wrap mode of the swapchain state.
   *
   * **Note:** This property only has an effect on devices that support the OpenXR
   * XR_FB_swapchain_update_state OpenGLES/Vulkan extensions.
   */
  public final inline var swapchainStateHorizontalWrap: Wrap
    @JvmName("swapchainStateHorizontalWrapProperty")
    get() = getHorizontalWrap()
    @JvmName("swapchainStateHorizontalWrapProperty")
    set(`value`) {
      setHorizontalWrap(value)
    }

  /**
   * The vertical wrap mode of the swapchain state.
   *
   * **Note:** This property only has an effect on devices that support the OpenXR
   * XR_FB_swapchain_update_state OpenGLES/Vulkan extensions.
   */
  public final inline var swapchainStateVerticalWrap: Wrap
    @JvmName("swapchainStateVerticalWrapProperty")
    get() = getVerticalWrap()
    @JvmName("swapchainStateVerticalWrapProperty")
    set(`value`) {
      setVerticalWrap(value)
    }

  /**
   * The swizzle value for the red channel of the swapchain state.
   *
   * **Note:** This property only has an effect on devices that support the OpenXR
   * XR_FB_swapchain_update_state OpenGLES/Vulkan extensions.
   */
  public final inline var swapchainStateRedSwizzle: Swizzle
    @JvmName("swapchainStateRedSwizzleProperty")
    get() = getRedSwizzle()
    @JvmName("swapchainStateRedSwizzleProperty")
    set(`value`) {
      setRedSwizzle(value)
    }

  /**
   * The swizzle value for the green channel of the swapchain state.
   *
   * **Note:** This property only has an effect on devices that support the OpenXR
   * XR_FB_swapchain_update_state OpenGLES/Vulkan extensions.
   */
  public final inline var swapchainStateGreenSwizzle: Swizzle
    @JvmName("swapchainStateGreenSwizzleProperty")
    get() = getGreenSwizzle()
    @JvmName("swapchainStateGreenSwizzleProperty")
    set(`value`) {
      setGreenSwizzle(value)
    }

  /**
   * The swizzle value for the blue channel of the swapchain state.
   *
   * **Note:** This property only has an effect on devices that support the OpenXR
   * XR_FB_swapchain_update_state OpenGLES/Vulkan extensions.
   */
  public final inline var swapchainStateBlueSwizzle: Swizzle
    @JvmName("swapchainStateBlueSwizzleProperty")
    get() = getBlueSwizzle()
    @JvmName("swapchainStateBlueSwizzleProperty")
    set(`value`) {
      setBlueSwizzle(value)
    }

  /**
   * The swizzle value for the alpha channel of the swapchain state.
   *
   * **Note:** This property only has an effect on devices that support the OpenXR
   * XR_FB_swapchain_update_state OpenGLES/Vulkan extensions.
   */
  public final inline var swapchainStateAlphaSwizzle: Swizzle
    @JvmName("swapchainStateAlphaSwizzleProperty")
    get() = getAlphaSwizzle()
    @JvmName("swapchainStateAlphaSwizzleProperty")
    set(`value`) {
      setAlphaSwizzle(value)
    }

  /**
   * The max anisotropy of the swapchain state.
   *
   * **Note:** This property only has an effect on devices that support the OpenXR
   * XR_FB_swapchain_update_state OpenGLES/Vulkan extensions.
   */
  public final inline var swapchainStateMaxAnisotropy: Float
    @JvmName("swapchainStateMaxAnisotropyProperty")
    get() = getMaxAnisotropy()
    @JvmName("swapchainStateMaxAnisotropyProperty")
    set(`value`) {
      setMaxAnisotropy(value)
    }

  /**
   * The border color of the swapchain state that is used when the wrap mode clamps to the border.
   *
   * **Note:** This property only has an effect on devices that support the OpenXR
   * XR_FB_swapchain_update_state OpenGLES/Vulkan extensions.
   *
   * **Warning:**
   * Be careful when trying to modify a local
   * [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this
   * getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again
   * afterward.
   */
  @CoreTypeLocalCopy
  public final inline var swapchainStateBorderColor: Color
    @JvmName("swapchainStateBorderColorProperty")
    get() = getBorderColor()
    @JvmName("swapchainStateBorderColorProperty")
    set(`value`) {
      setBorderColor(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(426, scriptIndex)
  }

  /**
   * This is a helper function for [androidSurfaceSize] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = openxrcompositionlayer.androidSurfaceSize
   * //Your changes
   * openxrcompositionlayer.androidSurfaceSize = myCoreType
   * ``````
   *
   * The size of the Android surface to create if [useAndroidSurface] is enabled.
   */
  @CoreTypeHelper
  public final fun androidSurfaceSizeMutate(block: Vector2i.() -> Unit): Vector2i =
      androidSurfaceSize.apply {
     block(this)
     androidSurfaceSize = this
  }

  /**
   * This is a helper function for [swapchainStateBorderColor] to make dealing with local copies
   * easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = openxrcompositionlayer.swapchainStateBorderColor
   * //Your changes
   * openxrcompositionlayer.swapchainStateBorderColor = myCoreType
   * ``````
   *
   * The border color of the swapchain state that is used when the wrap mode clamps to the border.
   *
   * **Note:** This property only has an effect on devices that support the OpenXR
   * XR_FB_swapchain_update_state OpenGLES/Vulkan extensions.
   */
  @CoreTypeHelper
  public final fun swapchainStateBorderColorMutate(block: Color.() -> Unit): Color =
      swapchainStateBorderColor.apply {
     block(this)
     swapchainStateBorderColor = this
  }

  public final fun setLayerViewport(viewport: SubViewport?): Unit {
    TransferContext.writeArguments(OBJECT to viewport)
    TransferContext.callMethod(ptr, MethodBindings.setLayerViewportPtr, NIL)
  }

  public final fun getLayerViewport(): SubViewport? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLayerViewportPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as SubViewport?)
  }

  public final fun setUseAndroidSurface(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setUseAndroidSurfacePtr, NIL)
  }

  public final fun getUseAndroidSurface(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getUseAndroidSurfacePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setAndroidSurfaceSize(size: Vector2i): Unit {
    TransferContext.writeArguments(VECTOR2I to size)
    TransferContext.callMethod(ptr, MethodBindings.setAndroidSurfaceSizePtr, NIL)
  }

  public final fun getAndroidSurfaceSize(): Vector2i {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAndroidSurfaceSizePtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I) as Vector2i)
  }

  public final fun setEnableHolePunch(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setEnableHolePunchPtr, NIL)
  }

  public final fun getEnableHolePunch(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getEnableHolePunchPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setSortOrder(order: Int): Unit {
    TransferContext.writeArguments(LONG to order.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setSortOrderPtr, NIL)
  }

  public final fun getSortOrder(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSortOrderPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setAlphaBlend(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setAlphaBlendPtr, NIL)
  }

  public final fun getAlphaBlend(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAlphaBlendPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns a [JavaObject] representing an `android.view.Surface` if [useAndroidSurface] is enabled
   * and OpenXR has created the surface. Otherwise, this will return `null`.
   *
   * **Note:** The surface can only be created during an active OpenXR session. So, if
   * [useAndroidSurface] is enabled outside of an OpenXR session, it won't be created until a new
   * session fully starts.
   */
  public final fun getAndroidSurface(): JavaObject? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAndroidSurfacePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as JavaObject?)
  }

  /**
   * Returns `true` if the OpenXR runtime natively supports this composition layer type.
   *
   * **Note:** This will only return an accurate result after the OpenXR session has started.
   */
  public final fun isNativelySupported(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isNativelySupportedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setMinFilter(mode: Filter): Unit {
    TransferContext.writeArguments(LONG to mode.value)
    TransferContext.callMethod(ptr, MethodBindings.setMinFilterPtr, NIL)
  }

  public final fun getMinFilter(): Filter {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMinFilterPtr, LONG)
    return Filter.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setMagFilter(mode: Filter): Unit {
    TransferContext.writeArguments(LONG to mode.value)
    TransferContext.callMethod(ptr, MethodBindings.setMagFilterPtr, NIL)
  }

  public final fun getMagFilter(): Filter {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMagFilterPtr, LONG)
    return Filter.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setMipmapMode(mode: MipmapMode): Unit {
    TransferContext.writeArguments(LONG to mode.value)
    TransferContext.callMethod(ptr, MethodBindings.setMipmapModePtr, NIL)
  }

  public final fun getMipmapMode(): MipmapMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMipmapModePtr, LONG)
    return MipmapMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setHorizontalWrap(mode: Wrap): Unit {
    TransferContext.writeArguments(LONG to mode.value)
    TransferContext.callMethod(ptr, MethodBindings.setHorizontalWrapPtr, NIL)
  }

  public final fun getHorizontalWrap(): Wrap {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getHorizontalWrapPtr, LONG)
    return Wrap.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setVerticalWrap(mode: Wrap): Unit {
    TransferContext.writeArguments(LONG to mode.value)
    TransferContext.callMethod(ptr, MethodBindings.setVerticalWrapPtr, NIL)
  }

  public final fun getVerticalWrap(): Wrap {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getVerticalWrapPtr, LONG)
    return Wrap.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setRedSwizzle(mode: Swizzle): Unit {
    TransferContext.writeArguments(LONG to mode.value)
    TransferContext.callMethod(ptr, MethodBindings.setRedSwizzlePtr, NIL)
  }

  public final fun getRedSwizzle(): Swizzle {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRedSwizzlePtr, LONG)
    return Swizzle.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setGreenSwizzle(mode: Swizzle): Unit {
    TransferContext.writeArguments(LONG to mode.value)
    TransferContext.callMethod(ptr, MethodBindings.setGreenSwizzlePtr, NIL)
  }

  public final fun getGreenSwizzle(): Swizzle {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getGreenSwizzlePtr, LONG)
    return Swizzle.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setBlueSwizzle(mode: Swizzle): Unit {
    TransferContext.writeArguments(LONG to mode.value)
    TransferContext.callMethod(ptr, MethodBindings.setBlueSwizzlePtr, NIL)
  }

  public final fun getBlueSwizzle(): Swizzle {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBlueSwizzlePtr, LONG)
    return Swizzle.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setAlphaSwizzle(mode: Swizzle): Unit {
    TransferContext.writeArguments(LONG to mode.value)
    TransferContext.callMethod(ptr, MethodBindings.setAlphaSwizzlePtr, NIL)
  }

  public final fun getAlphaSwizzle(): Swizzle {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAlphaSwizzlePtr, LONG)
    return Swizzle.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setMaxAnisotropy(`value`: Float): Unit {
    TransferContext.writeArguments(DOUBLE to value.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setMaxAnisotropyPtr, NIL)
  }

  public final fun getMaxAnisotropy(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMaxAnisotropyPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setBorderColor(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(ptr, MethodBindings.setBorderColorPtr, NIL)
  }

  public final fun getBorderColor(): Color {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBorderColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  /**
   * Returns UV coordinates where the given ray intersects with the composition layer. [origin] and
   * [direction] must be in global space.
   *
   * Returns `Vector2(-1.0, -1.0)` if the ray doesn't intersect.
   */
  public final fun intersectsRay(origin: Vector3, direction: Vector3): Vector2 {
    TransferContext.writeArguments(VECTOR3 to origin, VECTOR3 to direction)
    TransferContext.callMethod(ptr, MethodBindings.intersectsRayPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  public enum class Filter(
    `value`: Long,
  ) : GodotEnum {
    /**
     * Perform nearest-neighbor filtering when sampling the texture.
     */
    NEAREST(0),
    /**
     * Perform linear filtering when sampling the texture.
     */
    LINEAR(1),
    /**
     * Perform cubic filtering when sampling the texture.
     */
    CUBIC(2),
    ;

    public override val `value`: Long
    init {
      this.`value` = `value`
    }

    public companion object {
      public fun from(`value`: Long): Filter = entries.single { it.`value` == `value` }
    }
  }

  public enum class MipmapMode(
    `value`: Long,
  ) : GodotEnum {
    /**
     * Disable mipmapping.
     *
     * **Note:** Mipmapping can only be disabled in the Compatibility renderer.
     */
    DISABLED(0),
    /**
     * Use the mipmap of the nearest resolution.
     */
    NEAREST(1),
    /**
     * Use linear interpolation of the two mipmaps of the nearest resolution.
     */
    LINEAR(2),
    ;

    public override val `value`: Long
    init {
      this.`value` = `value`
    }

    public companion object {
      public fun from(`value`: Long): MipmapMode = entries.single { it.`value` == `value` }
    }
  }

  public enum class Wrap(
    `value`: Long,
  ) : GodotEnum {
    /**
     * Clamp the texture to its specified border color.
     */
    CLAMP_TO_BORDER(0),
    /**
     * Clamp the texture to its edge color.
     */
    CLAMP_TO_EDGE(1),
    /**
     * Repeat the texture infinitely.
     */
    REPEAT(2),
    /**
     * Repeat the texture infinitely, mirroring it on each repeat.
     */
    MIRRORED_REPEAT(3),
    /**
     * Mirror the texture once and then clamp the texture to its edge color.
     *
     * **Note:** This wrap mode is not available in the Compatibility renderer.
     */
    MIRROR_CLAMP_TO_EDGE(4),
    ;

    public override val `value`: Long
    init {
      this.`value` = `value`
    }

    public companion object {
      public fun from(`value`: Long): Wrap = entries.single { it.`value` == `value` }
    }
  }

  public enum class Swizzle(
    `value`: Long,
  ) : GodotEnum {
    /**
     * Maps a color channel to the value of the red channel.
     */
    RED(0),
    /**
     * Maps a color channel to the value of the green channel.
     */
    GREEN(1),
    /**
     * Maps a color channel to the value of the blue channel.
     */
    BLUE(2),
    /**
     * Maps a color channel to the value of the alpha channel.
     */
    ALPHA(3),
    /**
     * Maps a color channel to the value of zero.
     */
    ZERO(4),
    /**
     * Maps a color channel to the value of one.
     */
    ONE(5),
    ;

    public override val `value`: Long
    init {
      this.`value` = `value`
    }

    public companion object {
      public fun from(`value`: Long): Swizzle = entries.single { it.`value` == `value` }
    }
  }

  public companion object

  public object MethodBindings {
    internal val setLayerViewportPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayer", "set_layer_viewport", 3888077664)

    internal val getLayerViewportPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayer", "get_layer_viewport", 3750751911)

    internal val setUseAndroidSurfacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayer", "set_use_android_surface", 2586408642)

    internal val getUseAndroidSurfacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayer", "get_use_android_surface", 36873697)

    internal val setAndroidSurfaceSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayer", "set_android_surface_size", 1130785943)

    internal val getAndroidSurfaceSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayer", "get_android_surface_size", 3690982128)

    internal val setEnableHolePunchPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayer", "set_enable_hole_punch", 2586408642)

    internal val getEnableHolePunchPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayer", "get_enable_hole_punch", 36873697)

    internal val setSortOrderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayer", "set_sort_order", 1286410249)

    internal val getSortOrderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayer", "get_sort_order", 3905245786)

    internal val setAlphaBlendPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayer", "set_alpha_blend", 2586408642)

    internal val getAlphaBlendPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayer", "get_alpha_blend", 36873697)

    internal val getAndroidSurfacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayer", "get_android_surface", 3277089691)

    internal val isNativelySupportedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayer", "is_natively_supported", 36873697)

    internal val setMinFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayer", "set_min_filter", 3653437593)

    internal val getMinFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayer", "get_min_filter", 845677307)

    internal val setMagFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayer", "set_mag_filter", 3653437593)

    internal val getMagFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayer", "get_mag_filter", 845677307)

    internal val setMipmapModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayer", "set_mipmap_mode", 3271133183)

    internal val getMipmapModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayer", "get_mipmap_mode", 3962697095)

    internal val setHorizontalWrapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayer", "set_horizontal_wrap", 15634990)

    internal val getHorizontalWrapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayer", "get_horizontal_wrap", 2798816834)

    internal val setVerticalWrapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayer", "set_vertical_wrap", 15634990)

    internal val getVerticalWrapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayer", "get_vertical_wrap", 2798816834)

    internal val setRedSwizzlePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayer", "set_red_swizzle", 741598951)

    internal val getRedSwizzlePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayer", "get_red_swizzle", 2334776767)

    internal val setGreenSwizzlePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayer", "set_green_swizzle", 741598951)

    internal val getGreenSwizzlePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayer", "get_green_swizzle", 2334776767)

    internal val setBlueSwizzlePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayer", "set_blue_swizzle", 741598951)

    internal val getBlueSwizzlePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayer", "get_blue_swizzle", 2334776767)

    internal val setAlphaSwizzlePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayer", "set_alpha_swizzle", 741598951)

    internal val getAlphaSwizzlePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayer", "get_alpha_swizzle", 2334776767)

    internal val setMaxAnisotropyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayer", "set_max_anisotropy", 373806689)

    internal val getMaxAnisotropyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayer", "get_max_anisotropy", 1740695150)

    internal val setBorderColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayer", "set_border_color", 2920490490)

    internal val getBorderColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayer", "get_border_color", 3444240500)

    internal val intersectsRayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayer", "intersects_ray", 1091262597)
  }
}
