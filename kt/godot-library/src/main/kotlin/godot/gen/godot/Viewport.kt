// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.RID
import godot.core.Rect2
import godot.core.Transform2D
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.RECT2
import godot.core.VariantType.STRING
import godot.core.VariantType.TRANSFORM2D
import godot.core.VariantType.VECTOR2
import godot.core.VariantType._RID
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * A [Viewport] creates a different view into the screen, or a sub-view inside another viewport.
 * Child 2D nodes will display on it, and child Camera3D 3D nodes will render on it too.
 * Optionally, a viewport can have its own 2D or 3D world, so it doesn't share what it draws with
 * other viewports.
 * Viewports can also choose to be audio listeners, so they generate positional audio depending on a
 * 2D or 3D camera child of it.
 * Also, viewports can be assigned to different screens in case the devices have multiple screens.
 * Finally, viewports can also behave as render targets, in which case they will not be visible
 * unless the associated texture is used to draw.
 */
@GodotBaseType
public open class Viewport internal constructor() : Node() {
  /**
   * Emitted when the size of the viewport is changed, whether by resizing of window, or some other
   * means.
   */
  public val sizeChanged: Signal0 by signal()

  /**
   * Emitted when a Control node grabs keyboard focus.
   * **Note:** A Control node losing focus doesn't cause this signal to be emitted.
   */
  public val guiFocusChanged: Signal1<Control> by signal("node")

  /**
   * Disable 3D rendering (but keep 2D rendering).
   */
  public var disable3d: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.is3dDisabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDisable3dPtr, NIL)
    }

  /**
   * If `true`, the viewport will use the primary XR interface to render XR output. When applicable
   * this can result in a stereoscopic image and the resulting render being output to a headset.
   */
  public var useXr: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isUsingXrPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUseXrPtr, NIL)
    }

  /**
   * If `true`, the viewport will use a unique copy of the [World3D] defined in [world3d].
   */
  public var ownWorld3d: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isUsingOwnWorld3dPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUseOwnWorld3dPtr, NIL)
    }

  /**
   * The custom [World3D] which can be used as 3D environment source.
   */
  public var world3d: World3D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getWorld3dPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as World3D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setWorld3dPtr, NIL)
    }

  /**
   * The custom [World2D] which can be used as 2D environment source.
   */
  public var world2d: World2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getWorld2dPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as World2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setWorld2dPtr, NIL)
    }

  /**
   * If `true`, the viewport should render its background as transparent.
   */
  public var transparentBg: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.hasTransparentBackgroundPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTransparentBackgroundPtr, NIL)
    }

  /**
   * If `true`, this viewport will mark incoming input events as handled by itself. If `false`, this
   * is instead done by the first parent viewport that is set to handle input locally.
   * A [SubViewportContainer] will automatically set this property to `false` for the [Viewport]
   * contained inside of it.
   * See also [setInputAsHandled] and [isInputHandled].
   */
  public var handleInputLocally: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isHandlingInputLocallyPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setHandleInputLocallyPtr, NIL)
    }

  /**
   * If `true`, [CanvasItem] nodes will internally snap to full pixels. Their position can still be
   * sub-pixel, but the decimals will not have effect. This can lead to a crisper appearance at the
   * cost of less smooth movement, especially when [Camera2D] smoothing is enabled.
   */
  public var snap2dTransformsToPixel: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isSnap2dTransformsToPixelEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSnap2dTransformsToPixelPtr, NIL)
    }

  /**
   * If `true`, vertices of [CanvasItem] nodes will snap to full pixels. Only affects the final
   * vertex positions, not the transforms. This can lead to a crisper appearance at the cost of less
   * smooth movement, especially when [Camera2D] smoothing is enabled.
   */
  public var snap2dVerticesToPixel: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isSnap2dVerticesToPixelEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSnap2dVerticesToPixelPtr, NIL)
    }

  /**
   * The multisample anti-aliasing mode for 2D/Canvas rendering. A higher number results in smoother
   * edges at the cost of significantly worse performance. A value of 2 or 4 is best unless targeting
   * very high-end systems. This has no effect on shader-induced aliasing or texture aliasing.
   */
  public var msaa2d: MSAA
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMsaa2dPtr, LONG)
      return Viewport.MSAA.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setMsaa2dPtr, NIL)
    }

  /**
   * The multisample anti-aliasing mode for 3D rendering. A higher number results in smoother edges
   * at the cost of significantly worse performance. A value of 2 or 4 is best unless targeting very
   * high-end systems. See also bilinear scaling 3d [scaling3dMode] for supersampling, which provides
   * higher quality but is much more expensive. This has no effect on shader-induced aliasing or
   * texture aliasing.
   */
  public var msaa3d: MSAA
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMsaa3dPtr, LONG)
      return Viewport.MSAA.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setMsaa3dPtr, NIL)
    }

  /**
   * Sets the screen-space antialiasing method used. Screen-space antialiasing works by selectively
   * blurring edges in a post-process shader. It differs from MSAA which takes multiple coverage
   * samples while rendering objects. Screen-space AA methods are typically faster than MSAA and will
   * smooth out specular aliasing, but tend to make scenes appear blurry.
   */
  public var screenSpaceAa: ScreenSpaceAA
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getScreenSpaceAaPtr, LONG)
      return Viewport.ScreenSpaceAA.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setScreenSpaceAaPtr, NIL)
    }

  /**
   * Enables Temporal Anti-Aliasing for this viewport. TAA works by jittering the camera and
   * accumulating the images of the last rendered frames, motion vector rendering is used to account
   * for camera and object motion.
   * **Note:** The implementation is not complete yet, some visual instances such as particles and
   * skinned meshes may show artifacts.
   */
  public var useTaa: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isUsingTaaPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUseTaaPtr, NIL)
    }

  /**
   * If `true`, uses a fast post-processing filter to make banding significantly less visible in 3D.
   * 2D rendering is *not* affected by debanding unless the [Environment.backgroundMode] is
   * [Environment.BG_CANVAS]. See also [ProjectSettings.rendering/antiAliasing/quality/useDebanding].
   * In some cases, debanding may introduce a slightly noticeable dithering pattern. It's
   * recommended to enable debanding only when actually needed since the dithering pattern will make
   * lossless-compressed screenshots larger.
   */
  public var useDebanding: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isUsingDebandingPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUseDebandingPtr, NIL)
    }

  /**
   * If `true`, [OccluderInstance3D] nodes will be usable for occlusion culling in 3D for this
   * viewport. For the root viewport, [ProjectSettings.rendering/occlusionCulling/useOcclusionCulling]
   * must be set to `true` instead.
   * **Note:** Enabling occlusion culling has a cost on the CPU. Only enable occlusion culling if
   * you actually plan to use it, and think whether your scene can actually benefit from occlusion
   * culling. Large, open scenes with few or no objects blocking the view will generally not benefit
   * much from occlusion culling. Large open scenes generally benefit more from mesh LOD and visibility
   * ranges ([GeometryInstance3D.visibilityRangeBegin] and [GeometryInstance3D.visibilityRangeEnd])
   * compared to occlusion culling.
   * **Note:** Due to memory constraints, occlusion culling is not supported by default in Web
   * export templates. It can be enabled by compiling custom Web export templates with
   * `module_raycast_enabled=yes`.
   */
  public var useOcclusionCulling: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isUsingOcclusionCullingPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUseOcclusionCullingPtr, NIL)
    }

  /**
   * The automatic LOD bias to use for meshes rendered within the [Viewport] (this is analogous to
   * [ReflectionProbe.meshLodThreshold]). Higher values will use less detailed versions of meshes that
   * have LOD variations generated. If set to `0.0`, automatic LOD is disabled. Increase
   * [meshLodThreshold] to improve performance at the cost of geometry detail.
   * To control this property on the root viewport, set the
   * [ProjectSettings.rendering/meshLod/lodChange/thresholdPixels] project setting.
   * **Note:** [meshLodThreshold] does not affect [GeometryInstance3D] visibility ranges (also known
   * as "manual" LOD or hierarchical LOD).
   */
  public var meshLodThreshold: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMeshLodThresholdPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setMeshLodThresholdPtr, NIL)
    }

  /**
   * The overlay mode for test rendered geometry in debug purposes.
   */
  public var debugDraw: DebugDraw
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDebugDrawPtr, LONG)
      return Viewport.DebugDraw.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setDebugDrawPtr, NIL)
    }

  /**
   * If `true`, 2D rendering will use an high dynamic range (HDR) format framebuffer matching the
   * bit depth of the 3D framebuffer. When using the Forward+ renderer this will be an `RGBA16`
   * framebuffer, while when using the Mobile renderer it will be an `RGB10_A2` framebuffer.
   * Additionally, 2D rendering will take place in linear color space and will be converted to sRGB
   * space immediately before blitting to the screen (if the Viewport is attached to the screen).
   * Practically speaking, this means that the end result of the Viewport will not be clamped into the
   * `0-1` range and can be used in 3D rendering without color space adjustments. This allows 2D
   * rendering to take advantage of effects requiring high dynamic range (e.g. 2D glow) as well as
   * substantially improves the appearance of effects requiring highly detailed gradients.
   * **Note:** This setting will have no effect when using the GL Compatibility renderer as the GL
   * Compatibility renderer always renders in low dynamic range for performance reasons.
   */
  public var useHdr2d: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isUsingHdr2dPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUseHdr2dPtr, NIL)
    }

  /**
   * Sets scaling 3d mode. Bilinear scaling renders at different resolution to either undersample or
   * supersample the viewport. FidelityFX Super Resolution 1.0, abbreviated to FSR, is an upscaling
   * technology that produces high quality images at fast framerates by using a spatially aware
   * upscaling algorithm. FSR is slightly more expensive than bilinear, but it produces significantly
   * higher image quality. FSR should be used where possible.
   * To control this property on the root viewport, set the
   * [ProjectSettings.rendering/scaling3d/mode] project setting.
   */
  public var scaling3dMode: Scaling3DMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getScaling3dModePtr, LONG)
      return Viewport.Scaling3DMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setScaling3dModePtr, NIL)
    }

  /**
   * Scales the 3D render buffer based on the viewport size uses an image filter specified in
   * [ProjectSettings.rendering/scaling3d/mode] to scale the output image to the full viewport size.
   * Values lower than `1.0` can be used to speed up 3D rendering at the cost of quality
   * (undersampling). Values greater than `1.0` are only valid for bilinear mode and can be used to
   * improve 3D rendering quality at a high performance cost (supersampling). See also
   * [ProjectSettings.rendering/antiAliasing/quality/msaa3d] for multi-sample antialiasing, which is
   * significantly cheaper but only smooths the edges of polygons.
   * When using FSR upscaling, AMD recommends exposing the following values as preset options to
   * users "Ultra Quality: 0.77", "Quality: 0.67", "Balanced: 0.59", "Performance: 0.5" instead of
   * exposing the entire scale.
   * To control this property on the root viewport, set the
   * [ProjectSettings.rendering/scaling3d/scale] project setting.
   */
  public var scaling3dScale: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getScaling3dScalePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setScaling3dScalePtr, NIL)
    }

  /**
   * Affects the final texture sharpness by reading from a lower or higher mipmap (also called
   * "texture LOD bias"). Negative values make mipmapped textures sharper but grainier when viewed at a
   * distance, while positive values make mipmapped textures blurrier (even when up close).
   * Enabling temporal antialiasing ([useTaa]) will automatically apply a `-0.5` offset to this
   * value, while enabling FXAA ([screenSpaceAa]) will automatically apply a `-0.25` offset to this
   * value. If both TAA and FXAA are enabled at the same time, an offset of `-0.75` is applied to this
   * value.
   * **Note:** If [scaling3dScale] is lower than `1.0` (exclusive), [textureMipmapBias] is used to
   * adjust the automatic mipmap bias which is calculated internally based on the scale factor. The
   * formula for this is `log2(scaling_3d_scale) + mipmap_bias`.
   * To control this property on the root viewport, set the
   * [ProjectSettings.rendering/textures/defaultFilters/textureMipmapBias] project setting.
   */
  public var textureMipmapBias: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTextureMipmapBiasPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setTextureMipmapBiasPtr, NIL)
    }

  /**
   * Determines how sharp the upscaled image will be when using the FSR upscaling mode. Sharpness
   * halves with every whole number. Values go from 0.0 (sharpest) to 2.0. Values above 2.0 won't make
   * a visible difference.
   * To control this property on the root viewport, set the
   * [ProjectSettings.rendering/scaling3d/fsrSharpness] project setting.
   */
  public var fsrSharpness: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFsrSharpnessPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setFsrSharpnessPtr, NIL)
    }

  /**
   * The Variable Rate Shading (VRS) mode that is used for this viewport. Note, if hardware does not
   * support VRS this property is ignored.
   */
  public var vrsMode: VRSMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVrsModePtr, LONG)
      return Viewport.VRSMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setVrsModePtr, NIL)
    }

  /**
   * Sets the update mode for Variable Rate Shading (VRS) for the viewport. VRS requires the input
   * texture to be converted to the format usable by the VRS method supported by the hardware. The
   * update mode defines how often this happens. If the GPU does not support VRS, or VRS is not
   * enabled, this property is ignored.
   */
  public var vrsUpdateMode: VRSUpdateMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVrsUpdateModePtr, LONG)
      return Viewport.VRSUpdateMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setVrsUpdateModePtr, NIL)
    }

  /**
   * Texture to use when [vrsMode] is set to [Viewport.VRS_TEXTURE].
   * The texture *must* use a lossless compression format so that colors can be matched precisely.
   * The following VRS densities are mapped to various colors, with brighter colors representing a
   * lower level of shading precision:
   * [codeblock lang=text]
   * - 1×1 = rgb(0, 0, 0)     - #000000
   * - 1×2 = rgb(0, 85, 0)    - #005500
   * - 2×1 = rgb(85, 0, 0)    - #550000
   * - 2×2 = rgb(85, 85, 0)   - #555500
   * - 2×4 = rgb(85, 170, 0)  - #55aa00
   * - 4×2 = rgb(170, 85, 0)  - #aa5500
   * - 4×4 = rgb(170, 170, 0) - #aaaa00
   * - 4×8 = rgb(170, 255, 0) - #aaff00 - Not supported on most hardware
   * - 8×4 = rgb(255, 170, 0) - #ffaa00 - Not supported on most hardware
   * - 8×8 = rgb(255, 255, 0) - #ffff00 - Not supported on most hardware
   * [/codeblock]
   */
  public var vrsTexture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVrsTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setVrsTexturePtr, NIL)
    }

  /**
   * Sets the default filter mode used by [CanvasItem]s in this Viewport. See
   * [DefaultCanvasItemTextureFilter] for options.
   */
  public var canvasItemDefaultTextureFilter: DefaultCanvasItemTextureFilter
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDefaultCanvasItemTextureFilterPtr, LONG)
      return Viewport.DefaultCanvasItemTextureFilter.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setDefaultCanvasItemTextureFilterPtr, NIL)
    }

  /**
   * Sets the default repeat mode used by [CanvasItem]s in this Viewport. See
   * [DefaultCanvasItemTextureRepeat] for options.
   */
  public var canvasItemDefaultTextureRepeat: DefaultCanvasItemTextureRepeat
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDefaultCanvasItemTextureRepeatPtr, LONG)
      return Viewport.DefaultCanvasItemTextureRepeat.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setDefaultCanvasItemTextureRepeatPtr, NIL)
    }

  /**
   * If `true`, the viewport will process 2D audio streams.
   */
  public var audioListenerEnable2d: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isAudioListener2dPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAsAudioListener2dPtr, NIL)
    }

  /**
   * If `true`, the viewport will process 3D audio streams.
   */
  public var audioListenerEnable3d: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isAudioListener3dPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAsAudioListener3dPtr, NIL)
    }

  /**
   * If `true`, the objects rendered by viewport become subjects of mouse picking process.
   * **Note:** The number of simultaneously pickable objects is limited to 64 and they are selected
   * in a non-deterministic order, which can be different in each picking process.
   */
  public var physicsObjectPicking: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPhysicsObjectPickingPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPhysicsObjectPickingPtr, NIL)
    }

  /**
   * If `true`, objects receive mouse picking events sorted primarily by their [CanvasItem.zIndex]
   * and secondarily by their position in the scene tree. If `false`, the order is undetermined.
   * **Note:** This setting is disabled by default because of its potential expensive computational
   * cost.
   * **Note:** Sorting happens after selecting the pickable objects. Because of the limitation of 64
   * simultaneously pickable objects, it is not guaranteed that the object with the highest
   * [CanvasItem.zIndex] receives the picking event.
   */
  public var physicsObjectPickingSort: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPhysicsObjectPickingSortPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPhysicsObjectPickingSortPtr, NIL)
    }

  /**
   * If `true`, the input_event signal will only be sent to one physics object in the mouse picking
   * process. If you want to get the top object only, you must also enable [physicsObjectPickingSort].
   * If `false`, an input_event signal will be sent to all physics objects in the mouse picking
   * process.
   * This applies to 2D CanvasItem object picking only.
   */
  public var physicsObjectPickingFirstOnly: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPhysicsObjectPickingFirstOnlyPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPhysicsObjectPickingFirstOnlyPtr, NIL)
    }

  /**
   * If `true`, the viewport will not receive input events.
   */
  public var guiDisableInput: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isInputDisabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDisableInputPtr, NIL)
    }

  /**
   * If `true`, the GUI controls on the viewport will lay pixel perfectly.
   */
  public var guiSnapControlsToPixels: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isSnapControlsToPixelsEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSnapControlsToPixelsPtr, NIL)
    }

  /**
   * If `true`, sub-windows (popups and dialogs) will be embedded inside application window as
   * control-like nodes. If `false`, they will appear as separate windows handled by the operating
   * system.
   */
  public var guiEmbedSubwindows: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isEmbeddingSubwindowsPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEmbeddingSubwindowsPtr, NIL)
    }

  /**
   * Controls how much of the original viewport's size should be covered by the 2D signed distance
   * field. This SDF can be sampled in [CanvasItem] shaders and is also used for [GPUParticles2D]
   * collision. Higher values allow portions of occluders located outside the viewport to still be
   * taken into account in the generated signed distance field, at the cost of performance. If you
   * notice particles falling through [LightOccluder2D]s as the occluders leave the viewport, increase
   * this setting.
   * The percentage is added on each axis and on both sides. For example, with the default
   * [SDF_OVERSIZE_120_PERCENT], the signed distance field will cover 20&#37; of the viewport's size
   * outside the viewport on each side (top, right, bottom, left).
   */
  public var sdfOversize: SDFOversize
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSdfOversizePtr, LONG)
      return Viewport.SDFOversize.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setSdfOversizePtr, NIL)
    }

  /**
   * The resolution scale to use for the 2D signed distance field. Higher values lead to a more
   * precise and more stable signed distance field as the camera moves, at the cost of performance.
   */
  public var sdfScale: SDFScale
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSdfScalePtr, LONG)
      return Viewport.SDFScale.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setSdfScalePtr, NIL)
    }

  /**
   * The shadow atlas' resolution (used for omni and spot lights). The value is rounded up to the
   * nearest power of 2.
   * **Note:** If this is set to `0`, no positional shadows will be visible at all. This can improve
   * performance significantly on low-end systems by reducing both the CPU and GPU load (as fewer draw
   * calls are needed to draw the scene without shadows).
   */
  public var positionalShadowAtlasSize: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPositionalShadowAtlasSizePtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setPositionalShadowAtlasSizePtr, NIL)
    }

  /**
   * Use 16 bits for the omni/spot shadow depth map. Enabling this results in shadows having less
   * precision and may result in shadow acne, but can lead to performance improvements on some devices.
   */
  public var positionalShadowAtlas16Bits: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPositionalShadowAtlas16BitsPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPositionalShadowAtlas16BitsPtr, NIL)
    }

  /**
   * The subdivision amount of the first quadrant on the shadow atlas.
   */
  public var positionalShadowAtlasQuad0: PositionalShadowAtlasQuadrantSubdiv
    get() {
      TransferContext.writeArguments(LONG to 0L)
      TransferContext.callMethod(rawPtr, MethodBindings.getPositionalShadowAtlasQuadrantSubdivPtr,
          LONG)
      return Viewport.PositionalShadowAtlasQuadrantSubdiv.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 0L, LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setPositionalShadowAtlasQuadrantSubdivPtr,
          NIL)
    }

  /**
   * The subdivision amount of the second quadrant on the shadow atlas.
   */
  public var positionalShadowAtlasQuad1: PositionalShadowAtlasQuadrantSubdiv
    get() {
      TransferContext.writeArguments(LONG to 1L)
      TransferContext.callMethod(rawPtr, MethodBindings.getPositionalShadowAtlasQuadrantSubdivPtr,
          LONG)
      return Viewport.PositionalShadowAtlasQuadrantSubdiv.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 1L, LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setPositionalShadowAtlasQuadrantSubdivPtr,
          NIL)
    }

  /**
   * The subdivision amount of the third quadrant on the shadow atlas.
   */
  public var positionalShadowAtlasQuad2: PositionalShadowAtlasQuadrantSubdiv
    get() {
      TransferContext.writeArguments(LONG to 2L)
      TransferContext.callMethod(rawPtr, MethodBindings.getPositionalShadowAtlasQuadrantSubdivPtr,
          LONG)
      return Viewport.PositionalShadowAtlasQuadrantSubdiv.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 2L, LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setPositionalShadowAtlasQuadrantSubdivPtr,
          NIL)
    }

  /**
   * The subdivision amount of the fourth quadrant on the shadow atlas.
   */
  public var positionalShadowAtlasQuad3: PositionalShadowAtlasQuadrantSubdiv
    get() {
      TransferContext.writeArguments(LONG to 3L)
      TransferContext.callMethod(rawPtr, MethodBindings.getPositionalShadowAtlasQuadrantSubdivPtr,
          LONG)
      return Viewport.PositionalShadowAtlasQuadrantSubdiv.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 3L, LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setPositionalShadowAtlasQuadrantSubdivPtr,
          NIL)
    }

  /**
   * The canvas transform of the viewport, useful for changing the on-screen positions of all child
   * [CanvasItem]s. This is relative to the global canvas transform of the viewport.
   */
  @CoreTypeLocalCopy
  public var canvasTransform: Transform2D
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCanvasTransformPtr, TRANSFORM2D)
      return (TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D)
    }
    set(`value`) {
      TransferContext.writeArguments(TRANSFORM2D to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCanvasTransformPtr, NIL)
    }

  /**
   * The global canvas transform of the viewport. The canvas transform is relative to this.
   */
  @CoreTypeLocalCopy
  public var globalCanvasTransform: Transform2D
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGlobalCanvasTransformPtr, TRANSFORM2D)
      return (TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D)
    }
    set(`value`) {
      TransferContext.writeArguments(TRANSFORM2D to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setGlobalCanvasTransformPtr, NIL)
    }

  /**
   * The rendering layers in which this [Viewport] renders [CanvasItem] nodes.
   */
  public var canvasCullMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCanvasCullMaskPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCanvasCullMaskPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VIEWPORT, scriptIndex)
    return true
  }

  /**
   * The canvas transform of the viewport, useful for changing the on-screen positions of all child
   * [CanvasItem]s. This is relative to the global canvas transform of the viewport.
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
   * val myCoreType = viewport.canvasTransform
   * //Your changes
   * viewport.canvasTransform = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun canvasTransformMutate(block: Transform2D.() -> Unit): Transform2D =
      canvasTransform.apply{
      block(this)
      canvasTransform = this
  }


  /**
   * The global canvas transform of the viewport. The canvas transform is relative to this.
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
   * val myCoreType = viewport.globalCanvasTransform
   * //Your changes
   * viewport.globalCanvasTransform = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun globalCanvasTransformMutate(block: Transform2D.() -> Unit): Transform2D =
      globalCanvasTransform.apply{
      block(this)
      globalCanvasTransform = this
  }


  /**
   * Returns the first valid [World2D] for this viewport, searching the [world2d] property of itself
   * and any Viewport ancestor.
   */
  public fun findWorld2d(): World2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.findWorld2dPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as World2D?)
  }

  /**
   * Returns the transform from the viewport's coordinate system to the embedder's coordinate
   * system.
   */
  public fun getFinalTransform(): Transform2D {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFinalTransformPtr, TRANSFORM2D)
    return (TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D)
  }

  /**
   * Returns the transform from the Viewport's coordinates to the screen coordinates of the
   * containing window manager window.
   */
  public fun getScreenTransform(): Transform2D {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getScreenTransformPtr, TRANSFORM2D)
    return (TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D)
  }

  /**
   * Returns the visible rectangle in global screen coordinates.
   */
  public fun getVisibleRect(): Rect2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getVisibleRectPtr, RECT2)
    return (TransferContext.readReturnValue(RECT2, false) as Rect2)
  }

  /**
   * Returns rendering statistics of the given type. See [RenderInfoType] and [RenderInfo] for
   * options.
   */
  public fun getRenderInfo(type: RenderInfoType, info: RenderInfo): Int {
    TransferContext.writeArguments(LONG to type.id, LONG to info.id)
    TransferContext.callMethod(rawPtr, MethodBindings.getRenderInfoPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the viewport's texture.
   * **Note:** When trying to store the current texture (e.g. in a file), it might be completely
   * black or outdated if used too early, especially when used in e.g. [Node.Ready]. To make sure the
   * texture you get is correct, you can await [signal RenderingServer.frame_post_draw] signal.
   * [codeblock]
   * func _ready():
   *     await RenderingServer.frame_post_draw
   *     $Viewport.get_texture().get_image().save_png("user://Screenshot.png")
   * [/codeblock]
   */
  public fun getTexture(): ViewportTexture? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTexturePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as ViewportTexture?)
  }

  /**
   * Returns the viewport's RID from the [RenderingServer].
   */
  public fun getViewportRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getViewportRidPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Helper method which calls the `set_text()` method on the currently focused [Control], provided
   * that it is defined (e.g. if the focused Control is [Button] or [LineEdit]).
   */
  public fun pushTextInput(text: String): Unit {
    TransferContext.writeArguments(STRING to text)
    TransferContext.callMethod(rawPtr, MethodBindings.pushTextInputPtr, NIL)
  }

  /**
   * Triggers the given [event] in this [Viewport]. This can be used to pass an [InputEvent] between
   * viewports, or to locally apply inputs that were sent over the network or saved to a file.
   * If [inLocalCoords] is `false`, the event's position is in the embedder's coordinates and will
   * be converted to viewport coordinates. If [inLocalCoords] is `true`, the event's position is in
   * viewport coordinates.
   * While this method serves a similar purpose as [Input.parseInputEvent], it does not remap the
   * specified [event] based on project settings like
   * [ProjectSettings.inputDevices/pointing/emulateTouchFromMouse].
   * Calling this method will propagate calls to child nodes for following methods in the given
   * order:
   * - [Node.Input]
   * - [Control.GuiInput] for [Control] nodes
   * - [Node.ShortcutInput]
   * - [Node.UnhandledKeyInput]
   * - [Node.UnhandledInput]
   * If an earlier method marks the input as handled via [setInputAsHandled], any later method in
   * this list will not be called.
   * If none of the methods handle the event and [physicsObjectPicking] is `true`, the event is used
   * for physics object picking.
   */
  @JvmOverloads
  public fun pushInput(event: InputEvent, inLocalCoords: Boolean = false): Unit {
    TransferContext.writeArguments(OBJECT to event, BOOL to inLocalCoords)
    TransferContext.callMethod(rawPtr, MethodBindings.pushInputPtr, NIL)
  }

  /**
   * Triggers the given [event] in this [Viewport]. This can be used to pass an [InputEvent] between
   * viewports, or to locally apply inputs that were sent over the network or saved to a file.
   * If [inLocalCoords] is `false`, the event's position is in the embedder's coordinates and will
   * be converted to viewport coordinates. If [inLocalCoords] is `true`, the event's position is in
   * viewport coordinates.
   * Calling this method will propagate calls to child nodes for following methods in the given
   * order:
   * - [Node.ShortcutInput]
   * - [Node.UnhandledKeyInput]
   * - [Node.UnhandledInput]
   * If an earlier method marks the input as handled via [setInputAsHandled], any later method in
   * this list will not be called.
   * If none of the methods handle the event and [physicsObjectPicking] is `true`, the event is used
   * for physics object picking.
   * **Note:** This method doesn't propagate input events to embedded [Window]s or [SubViewport]s.
   */
  @JvmOverloads
  public fun pushUnhandledInput(event: InputEvent, inLocalCoords: Boolean = false): Unit {
    TransferContext.writeArguments(OBJECT to event, BOOL to inLocalCoords)
    TransferContext.callMethod(rawPtr, MethodBindings.pushUnhandledInputPtr, NIL)
  }

  /**
   * Returns the mouse's position in this [Viewport] using the coordinate system of this [Viewport].
   */
  public fun getMousePosition(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMousePositionPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Moves the mouse pointer to the specified position in this [Viewport] using the coordinate
   * system of this [Viewport].
   * **Note:** [warpMouse] is only supported on Windows, macOS and Linux. It has no effect on
   * Android, iOS and Web.
   */
  public fun warpMouse(position: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.warpMousePtr, NIL)
  }

  /**
   * Force instantly updating the display based on the current mouse cursor position. This includes
   * updating the mouse cursor shape and sending necessary [signal Control.mouse_entered], [signal
   * CollisionObject2D.mouse_entered], [signal CollisionObject3D.mouse_entered] and [signal
   * Window.mouse_entered] signals and their respective `mouse_exited` counterparts.
   */
  public fun updateMouseCursorState(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.updateMouseCursorStatePtr, NIL)
  }

  /**
   * Returns the drag data from the GUI, that was previously returned by [Control.GetDragData].
   */
  public fun guiGetDragData(): Any? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.guiGetDragDataPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  /**
   * Returns `true` if the viewport is currently performing a drag operation.
   * Alternative to [Node.NOTIFICATION_DRAG_BEGIN] and [Node.NOTIFICATION_DRAG_END] when you prefer
   * polling the value.
   */
  public fun guiIsDragging(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.guiIsDraggingPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if the drag operation is successful.
   */
  public fun guiIsDragSuccessful(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.guiIsDragSuccessfulPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Removes the focus from the currently focused [Control] within this viewport. If no [Control]
   * has the focus, does nothing.
   */
  public fun guiReleaseFocus(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.guiReleaseFocusPtr, NIL)
  }

  /**
   * Returns the [Control] having the focus within this viewport. If no [Control] has the focus,
   * returns null.
   */
  public fun guiGetFocusOwner(): Control? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.guiGetFocusOwnerPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Control?)
  }

  /**
   * Returns the [Control] that the mouse is currently hovering over in this viewport. If no
   * [Control] has the cursor, returns null.
   * Typically the leaf [Control] node or deepest level of the subtree which claims hover. This is
   * very useful when used together with [Node.isAncestorOf] to find if the mouse is within a control
   * tree.
   */
  public fun guiGetHoveredControl(): Control? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.guiGetHoveredControlPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Control?)
  }

  /**
   * Stops the input from propagating further down the [SceneTree].
   * **Note:** This does not affect the methods in [Input], only the way events are propagated.
   */
  public fun setInputAsHandled(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.setInputAsHandledPtr, NIL)
  }

  /**
   * Returns whether the current [InputEvent] has been handled. Input events are not handled until
   * [setInputAsHandled] has been called during the lifetime of an [InputEvent].
   * This is usually done as part of input handling methods like [Node.Input], [Control.GuiInput] or
   * others, as well as in corresponding signal handlers.
   * If [handleInputLocally] is set to `false`, this method will try finding the first parent
   * viewport that is set to handle input locally, and return its value for [isInputHandled] instead.
   */
  public fun isInputHandled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isInputHandledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns a list of the visible embedded [Window]s inside the viewport.
   * **Note:** [Window]s inside other viewports will not be listed.
   */
  public fun getEmbeddedSubwindows(): VariantArray<Window> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getEmbeddedSubwindowsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Window>)
  }

  /**
   * Set/clear individual bits on the rendering layer mask. This simplifies editing this
   * [Viewport]'s layers.
   */
  public fun setCanvasCullMaskBit(layer: Long, enable: Boolean): Unit {
    TransferContext.writeArguments(LONG to layer, BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setCanvasCullMaskBitPtr, NIL)
  }

  /**
   * Returns an individual bit on the rendering layer mask.
   */
  public fun getCanvasCullMaskBit(layer: Long): Boolean {
    TransferContext.writeArguments(LONG to layer)
    TransferContext.callMethod(rawPtr, MethodBindings.getCanvasCullMaskBitPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the currently active 2D camera. Returns null if there are no active cameras.
   */
  public fun getCamera2d(): Camera2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCamera2dPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Camera2D?)
  }

  /**
   * Returns the first valid [World3D] for this viewport, searching the [world3d] property of itself
   * and any Viewport ancestor.
   */
  public fun findWorld3d(): World3D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.findWorld3dPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as World3D?)
  }

  /**
   * Returns the currently active 3D camera.
   */
  public fun getCamera3d(): Camera3D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCamera3dPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Camera3D?)
  }

  public enum class PositionalShadowAtlasQuadrantSubdiv(
    id: Long,
  ) {
    /**
     * This quadrant will not be used.
     */
    SHADOW_ATLAS_QUADRANT_SUBDIV_DISABLED(0),
    /**
     * This quadrant will only be used by one shadow map.
     */
    SHADOW_ATLAS_QUADRANT_SUBDIV_1(1),
    /**
     * This quadrant will be split in 4 and used by up to 4 shadow maps.
     */
    SHADOW_ATLAS_QUADRANT_SUBDIV_4(2),
    /**
     * This quadrant will be split 16 ways and used by up to 16 shadow maps.
     */
    SHADOW_ATLAS_QUADRANT_SUBDIV_16(3),
    /**
     * This quadrant will be split 64 ways and used by up to 64 shadow maps.
     */
    SHADOW_ATLAS_QUADRANT_SUBDIV_64(4),
    /**
     * This quadrant will be split 256 ways and used by up to 256 shadow maps. Unless the
     * [positionalShadowAtlasSize] is very high, the shadows in this quadrant will be very low
     * resolution.
     */
    SHADOW_ATLAS_QUADRANT_SUBDIV_256(5),
    /**
     * This quadrant will be split 1024 ways and used by up to 1024 shadow maps. Unless the
     * [positionalShadowAtlasSize] is very high, the shadows in this quadrant will be very low
     * resolution.
     */
    SHADOW_ATLAS_QUADRANT_SUBDIV_1024(6),
    /**
     * Represents the size of the [PositionalShadowAtlasQuadrantSubdiv] enum.
     */
    SHADOW_ATLAS_QUADRANT_SUBDIV_MAX(7),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): PositionalShadowAtlasQuadrantSubdiv =
          entries.single { it.id == `value` }
    }
  }

  public enum class Scaling3DMode(
    id: Long,
  ) {
    /**
     * Use bilinear scaling for the viewport's 3D buffer. The amount of scaling can be set using
     * [scaling3dScale]. Values less than `1.0` will result in undersampling while values greater than
     * `1.0` will result in supersampling. A value of `1.0` disables scaling.
     */
    SCALING_3D_MODE_BILINEAR(0),
    /**
     * Use AMD FidelityFX Super Resolution 1.0 upscaling for the viewport's 3D buffer. The amount of
     * scaling can be set using [scaling3dScale]. Values less than `1.0` will be result in the viewport
     * being upscaled using FSR. Values greater than `1.0` are not supported and bilinear downsampling
     * will be used instead. A value of `1.0` disables scaling.
     */
    SCALING_3D_MODE_FSR(1),
    /**
     * Use AMD FidelityFX Super Resolution 2.2 upscaling for the viewport's 3D buffer. The amount of
     * scaling can be set using [Viewport.scaling3dScale]. Values less than `1.0` will be result in the
     * viewport being upscaled using FSR2. Values greater than `1.0` are not supported and bilinear
     * downsampling will be used instead. A value of `1.0` will use FSR2 at native resolution as a TAA
     * solution.
     */
    SCALING_3D_MODE_FSR2(2),
    /**
     * Represents the size of the [Scaling3DMode] enum.
     */
    SCALING_3D_MODE_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Scaling3DMode = entries.single { it.id == `value` }
    }
  }

  public enum class MSAA(
    id: Long,
  ) {
    /**
     * Multisample antialiasing mode disabled. This is the default value, and is also the fastest
     * setting.
     */
    MSAA_DISABLED(0),
    /**
     * Use 2× Multisample Antialiasing. This has a moderate performance cost. It helps reduce
     * aliasing noticeably, but 4× MSAA still looks substantially better.
     */
    MSAA_2X(1),
    /**
     * Use 4× Multisample Antialiasing. This has a significant performance cost, and is generally a
     * good compromise between performance and quality.
     */
    MSAA_4X(2),
    /**
     * Use 8× Multisample Antialiasing. This has a very high performance cost. The difference
     * between 4× and 8× MSAA may not always be visible in real gameplay conditions. Likely unsupported
     * on low-end and older hardware.
     */
    MSAA_8X(3),
    /**
     * Represents the size of the [MSAA] enum.
     */
    MSAA_MAX(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): MSAA = entries.single { it.id == `value` }
    }
  }

  public enum class ScreenSpaceAA(
    id: Long,
  ) {
    /**
     * Do not perform any antialiasing in the full screen post-process.
     */
    SCREEN_SPACE_AA_DISABLED(0),
    /**
     * Use fast approximate antialiasing. FXAA is a popular screen-space antialiasing method, which
     * is fast but will make the image look blurry, especially at lower resolutions. It can still work
     * relatively well at large resolutions such as 1440p and 4K.
     */
    SCREEN_SPACE_AA_FXAA(1),
    /**
     * Represents the size of the [ScreenSpaceAA] enum.
     */
    SCREEN_SPACE_AA_MAX(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ScreenSpaceAA = entries.single { it.id == `value` }
    }
  }

  public enum class RenderInfo(
    id: Long,
  ) {
    /**
     * Amount of objects in frame.
     */
    RENDER_INFO_OBJECTS_IN_FRAME(0),
    /**
     * Amount of vertices in frame.
     */
    RENDER_INFO_PRIMITIVES_IN_FRAME(1),
    /**
     * Amount of draw calls in frame.
     */
    RENDER_INFO_DRAW_CALLS_IN_FRAME(2),
    /**
     * Represents the size of the [RenderInfo] enum.
     */
    RENDER_INFO_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): RenderInfo = entries.single { it.id == `value` }
    }
  }

  public enum class RenderInfoType(
    id: Long,
  ) {
    /**
     * Visible render pass (excluding shadows).
     */
    RENDER_INFO_TYPE_VISIBLE(0),
    /**
     * Shadow render pass. Objects will be rendered several times depending on the number of amounts
     * of lights with shadows and the number of directional shadow splits.
     */
    RENDER_INFO_TYPE_SHADOW(1),
    /**
     * Canvas item rendering. This includes all 2D rendering.
     */
    RENDER_INFO_TYPE_CANVAS(2),
    /**
     * Represents the size of the [RenderInfoType] enum.
     */
    RENDER_INFO_TYPE_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): RenderInfoType = entries.single { it.id == `value` }
    }
  }

  public enum class DebugDraw(
    id: Long,
  ) {
    /**
     * Objects are displayed normally.
     */
    DEBUG_DRAW_DISABLED(0),
    /**
     * Objects are displayed without light information.
     */
    DEBUG_DRAW_UNSHADED(1),
    /**
     * Objects are displayed without textures and only with lighting information.
     */
    DEBUG_DRAW_LIGHTING(2),
    /**
     * Objects are displayed semi-transparent with additive blending so you can see where they are
     * drawing over top of one another. A higher overdraw means you are wasting performance on drawing
     * pixels that are being hidden behind others.
     */
    DEBUG_DRAW_OVERDRAW(3),
    /**
     * Objects are displayed as wireframe models.
     */
    DEBUG_DRAW_WIREFRAME(4),
    /**
     * Objects are displayed without lighting information and their textures replaced by normal
     * mapping.
     */
    DEBUG_DRAW_NORMAL_BUFFER(5),
    /**
     * Objects are displayed with only the albedo value from [VoxelGI]s.
     */
    DEBUG_DRAW_VOXEL_GI_ALBEDO(6),
    /**
     * Objects are displayed with only the lighting value from [VoxelGI]s.
     */
    DEBUG_DRAW_VOXEL_GI_LIGHTING(7),
    /**
     * Objects are displayed with only the emission color from [VoxelGI]s.
     */
    DEBUG_DRAW_VOXEL_GI_EMISSION(8),
    /**
     * Draws the shadow atlas that stores shadows from [OmniLight3D]s and [SpotLight3D]s in the
     * upper left quadrant of the [Viewport].
     */
    DEBUG_DRAW_SHADOW_ATLAS(9),
    /**
     * Draws the shadow atlas that stores shadows from [DirectionalLight3D]s in the upper left
     * quadrant of the [Viewport].
     */
    DEBUG_DRAW_DIRECTIONAL_SHADOW_ATLAS(10),
    /**
     * Draws the scene luminance buffer (if available) in the upper left quadrant of the [Viewport].
     */
    DEBUG_DRAW_SCENE_LUMINANCE(11),
    /**
     * Draws the screen-space ambient occlusion texture instead of the scene so that you can clearly
     * see how it is affecting objects. In order for this display mode to work, you must have
     * [Environment.ssaoEnabled] set in your [WorldEnvironment].
     */
    DEBUG_DRAW_SSAO(12),
    /**
     * Draws the screen-space indirect lighting texture instead of the scene so that you can clearly
     * see how it is affecting objects. In order for this display mode to work, you must have
     * [Environment.ssilEnabled] set in your [WorldEnvironment].
     */
    DEBUG_DRAW_SSIL(13),
    /**
     * Colors each PSSM split for the [DirectionalLight3D]s in the scene a different color so you
     * can see where the splits are. In order, they will be colored red, green, blue, and yellow.
     */
    DEBUG_DRAW_PSSM_SPLITS(14),
    /**
     * Draws the decal atlas used by [Decal]s and light projector textures in the upper left
     * quadrant of the [Viewport].
     */
    DEBUG_DRAW_DECAL_ATLAS(15),
    /**
     * Draws the cascades used to render signed distance field global illumination (SDFGI).
     * Does nothing if the current environment's [Environment.sdfgiEnabled] is `false` or SDFGI is
     * not supported on the platform.
     */
    DEBUG_DRAW_SDFGI(16),
    /**
     * Draws the probes used for signed distance field global illumination (SDFGI).
     * Does nothing if the current environment's [Environment.sdfgiEnabled] is `false` or SDFGI is
     * not supported on the platform.
     */
    DEBUG_DRAW_SDFGI_PROBES(17),
    /**
     * Draws the buffer used for global illumination (GI).
     */
    DEBUG_DRAW_GI_BUFFER(18),
    /**
     * Draws all of the objects at their highest polycount, without low level of detail (LOD).
     */
    DEBUG_DRAW_DISABLE_LOD(19),
    /**
     * Draws the cluster used by [OmniLight3D] nodes to optimize light rendering.
     */
    DEBUG_DRAW_CLUSTER_OMNI_LIGHTS(20),
    /**
     * Draws the cluster used by [SpotLight3D] nodes to optimize light rendering.
     */
    DEBUG_DRAW_CLUSTER_SPOT_LIGHTS(21),
    /**
     * Draws the cluster used by [Decal] nodes to optimize decal rendering.
     */
    DEBUG_DRAW_CLUSTER_DECALS(22),
    /**
     * Draws the cluster used by [ReflectionProbe] nodes to optimize decal rendering.
     */
    DEBUG_DRAW_CLUSTER_REFLECTION_PROBES(23),
    /**
     * Draws the buffer used for occlusion culling.
     */
    DEBUG_DRAW_OCCLUDERS(24),
    /**
     * Draws vector lines over the viewport to indicate the movement of pixels between frames.
     */
    DEBUG_DRAW_MOTION_VECTORS(25),
    /**
     * Draws the internal resolution buffer of the scene before post-processing is applied.
     */
    DEBUG_DRAW_INTERNAL_BUFFER(26),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): DebugDraw = entries.single { it.id == `value` }
    }
  }

  public enum class DefaultCanvasItemTextureFilter(
    id: Long,
  ) {
    /**
     * The texture filter reads from the nearest pixel only. This makes the texture look pixelated
     * from up close, and grainy from a distance (due to mipmaps not being sampled).
     */
    DEFAULT_CANVAS_ITEM_TEXTURE_FILTER_NEAREST(0),
    /**
     * The texture filter blends between the nearest 4 pixels. This makes the texture look smooth
     * from up close, and grainy from a distance (due to mipmaps not being sampled).
     */
    DEFAULT_CANVAS_ITEM_TEXTURE_FILTER_LINEAR(1),
    /**
     * The texture filter blends between the nearest 4 pixels and between the nearest 2 mipmaps (or
     * uses the nearest mipmap if
     * [ProjectSettings.rendering/textures/defaultFilters/useNearestMipmapFilter] is `true`). This
     * makes the texture look smooth from up close, and smooth from a distance.
     * Use this for non-pixel art textures that may be viewed at a low scale (e.g. due to [Camera2D]
     * zoom or sprite scaling), as mipmaps are important to smooth out pixels that are smaller than
     * on-screen pixels.
     */
    DEFAULT_CANVAS_ITEM_TEXTURE_FILTER_LINEAR_WITH_MIPMAPS(2),
    /**
     * The texture filter reads from the nearest pixel and blends between the nearest 2 mipmaps (or
     * uses the nearest mipmap if
     * [ProjectSettings.rendering/textures/defaultFilters/useNearestMipmapFilter] is `true`). This
     * makes the texture look pixelated from up close, and smooth from a distance.
     * Use this for non-pixel art textures that may be viewed at a low scale (e.g. due to [Camera2D]
     * zoom or sprite scaling), as mipmaps are important to smooth out pixels that are smaller than
     * on-screen pixels.
     */
    DEFAULT_CANVAS_ITEM_TEXTURE_FILTER_NEAREST_WITH_MIPMAPS(3),
    /**
     * Represents the size of the [DefaultCanvasItemTextureFilter] enum.
     */
    DEFAULT_CANVAS_ITEM_TEXTURE_FILTER_MAX(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): DefaultCanvasItemTextureFilter =
          entries.single { it.id == `value` }
    }
  }

  public enum class DefaultCanvasItemTextureRepeat(
    id: Long,
  ) {
    /**
     * Disables textures repeating. Instead, when reading UVs outside the 0-1 range, the value will
     * be clamped to the edge of the texture, resulting in a stretched out look at the borders of the
     * texture.
     */
    DEFAULT_CANVAS_ITEM_TEXTURE_REPEAT_DISABLED(0),
    /**
     * Enables the texture to repeat when UV coordinates are outside the 0-1 range. If using one of
     * the linear filtering modes, this can result in artifacts at the edges of a texture when the
     * sampler filters across the edges of the texture.
     */
    DEFAULT_CANVAS_ITEM_TEXTURE_REPEAT_ENABLED(1),
    /**
     * Flip the texture when repeating so that the edge lines up instead of abruptly changing.
     */
    DEFAULT_CANVAS_ITEM_TEXTURE_REPEAT_MIRROR(2),
    /**
     * Represents the size of the [DefaultCanvasItemTextureRepeat] enum.
     */
    DEFAULT_CANVAS_ITEM_TEXTURE_REPEAT_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): DefaultCanvasItemTextureRepeat =
          entries.single { it.id == `value` }
    }
  }

  public enum class SDFOversize(
    id: Long,
  ) {
    /**
     * The signed distance field only covers the viewport's own rectangle.
     */
    SDF_OVERSIZE_100_PERCENT(0),
    /**
     * The signed distance field is expanded to cover 20&#37; of the viewport's size around the
     * borders.
     */
    SDF_OVERSIZE_120_PERCENT(1),
    /**
     * The signed distance field is expanded to cover 50&#37; of the viewport's size around the
     * borders.
     */
    SDF_OVERSIZE_150_PERCENT(2),
    /**
     * The signed distance field is expanded to cover 100&#37; (double) of the viewport's size
     * around the borders.
     */
    SDF_OVERSIZE_200_PERCENT(3),
    /**
     * Represents the size of the [SDFOversize] enum.
     */
    SDF_OVERSIZE_MAX(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): SDFOversize = entries.single { it.id == `value` }
    }
  }

  public enum class SDFScale(
    id: Long,
  ) {
    /**
     * The signed distance field is rendered at full resolution.
     */
    SDF_SCALE_100_PERCENT(0),
    /**
     * The signed distance field is rendered at half the resolution of this viewport.
     */
    SDF_SCALE_50_PERCENT(1),
    /**
     * The signed distance field is rendered at a quarter the resolution of this viewport.
     */
    SDF_SCALE_25_PERCENT(2),
    /**
     * Represents the size of the [SDFScale] enum.
     */
    SDF_SCALE_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): SDFScale = entries.single { it.id == `value` }
    }
  }

  public enum class VRSMode(
    id: Long,
  ) {
    /**
     * Variable Rate Shading is disabled.
     */
    VRS_DISABLED(0),
    /**
     * Variable Rate Shading uses a texture. Note, for stereoscopic use a texture atlas with a
     * texture for each view.
     */
    VRS_TEXTURE(1),
    /**
     * Variable Rate Shading's texture is supplied by the primary [XRInterface].
     */
    VRS_XR(2),
    /**
     * Represents the size of the [VRSMode] enum.
     */
    VRS_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): VRSMode = entries.single { it.id == `value` }
    }
  }

  public enum class VRSUpdateMode(
    id: Long,
  ) {
    /**
     * The input texture for variable rate shading will not be processed.
     */
    VRS_UPDATE_DISABLED(0),
    /**
     * The input texture for variable rate shading will be processed once.
     */
    VRS_UPDATE_ONCE(1),
    /**
     * The input texture for variable rate shading will be processed each frame.
     */
    VRS_UPDATE_ALWAYS(2),
    /**
     * Represents the size of the [VRSUpdateMode] enum.
     */
    VRS_UPDATE_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): VRSUpdateMode = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setWorld2dPtr: VoidPtr = TypeManager.getMethodBindPtr("Viewport", "set_world_2d")

    public val getWorld2dPtr: VoidPtr = TypeManager.getMethodBindPtr("Viewport", "get_world_2d")

    public val findWorld2dPtr: VoidPtr = TypeManager.getMethodBindPtr("Viewport", "find_world_2d")

    public val setCanvasTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "set_canvas_transform")

    public val getCanvasTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "get_canvas_transform")

    public val setGlobalCanvasTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "set_global_canvas_transform")

    public val getGlobalCanvasTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "get_global_canvas_transform")

    public val getFinalTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "get_final_transform")

    public val getScreenTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "get_screen_transform")

    public val getVisibleRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "get_visible_rect")

    public val setTransparentBackgroundPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "set_transparent_background")

    public val hasTransparentBackgroundPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "has_transparent_background")

    public val setUseHdr2dPtr: VoidPtr = TypeManager.getMethodBindPtr("Viewport", "set_use_hdr_2d")

    public val isUsingHdr2dPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "is_using_hdr_2d")

    public val setMsaa2dPtr: VoidPtr = TypeManager.getMethodBindPtr("Viewport", "set_msaa_2d")

    public val getMsaa2dPtr: VoidPtr = TypeManager.getMethodBindPtr("Viewport", "get_msaa_2d")

    public val setMsaa3dPtr: VoidPtr = TypeManager.getMethodBindPtr("Viewport", "set_msaa_3d")

    public val getMsaa3dPtr: VoidPtr = TypeManager.getMethodBindPtr("Viewport", "get_msaa_3d")

    public val setScreenSpaceAaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "set_screen_space_aa")

    public val getScreenSpaceAaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "get_screen_space_aa")

    public val setUseTaaPtr: VoidPtr = TypeManager.getMethodBindPtr("Viewport", "set_use_taa")

    public val isUsingTaaPtr: VoidPtr = TypeManager.getMethodBindPtr("Viewport", "is_using_taa")

    public val setUseDebandingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "set_use_debanding")

    public val isUsingDebandingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "is_using_debanding")

    public val setUseOcclusionCullingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "set_use_occlusion_culling")

    public val isUsingOcclusionCullingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "is_using_occlusion_culling")

    public val setDebugDrawPtr: VoidPtr = TypeManager.getMethodBindPtr("Viewport", "set_debug_draw")

    public val getDebugDrawPtr: VoidPtr = TypeManager.getMethodBindPtr("Viewport", "get_debug_draw")

    public val getRenderInfoPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "get_render_info")

    public val getTexturePtr: VoidPtr = TypeManager.getMethodBindPtr("Viewport", "get_texture")

    public val setPhysicsObjectPickingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "set_physics_object_picking")

    public val getPhysicsObjectPickingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "get_physics_object_picking")

    public val setPhysicsObjectPickingSortPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "set_physics_object_picking_sort")

    public val getPhysicsObjectPickingSortPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "get_physics_object_picking_sort")

    public val setPhysicsObjectPickingFirstOnlyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "set_physics_object_picking_first_only")

    public val getPhysicsObjectPickingFirstOnlyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "get_physics_object_picking_first_only")

    public val getViewportRidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "get_viewport_rid")

    public val pushTextInputPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "push_text_input")

    public val pushInputPtr: VoidPtr = TypeManager.getMethodBindPtr("Viewport", "push_input")

    public val pushUnhandledInputPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "push_unhandled_input")

    public val getMousePositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "get_mouse_position")

    public val warpMousePtr: VoidPtr = TypeManager.getMethodBindPtr("Viewport", "warp_mouse")

    public val updateMouseCursorStatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "update_mouse_cursor_state")

    public val guiGetDragDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "gui_get_drag_data")

    public val guiIsDraggingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "gui_is_dragging")

    public val guiIsDragSuccessfulPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "gui_is_drag_successful")

    public val guiReleaseFocusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "gui_release_focus")

    public val guiGetFocusOwnerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "gui_get_focus_owner")

    public val guiGetHoveredControlPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "gui_get_hovered_control")

    public val setDisableInputPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "set_disable_input")

    public val isInputDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "is_input_disabled")

    public val setPositionalShadowAtlasSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "set_positional_shadow_atlas_size")

    public val getPositionalShadowAtlasSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "get_positional_shadow_atlas_size")

    public val setPositionalShadowAtlas16BitsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "set_positional_shadow_atlas_16_bits")

    public val getPositionalShadowAtlas16BitsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "get_positional_shadow_atlas_16_bits")

    public val setSnapControlsToPixelsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "set_snap_controls_to_pixels")

    public val isSnapControlsToPixelsEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "is_snap_controls_to_pixels_enabled")

    public val setSnap2dTransformsToPixelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "set_snap_2d_transforms_to_pixel")

    public val isSnap2dTransformsToPixelEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "is_snap_2d_transforms_to_pixel_enabled")

    public val setSnap2dVerticesToPixelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "set_snap_2d_vertices_to_pixel")

    public val isSnap2dVerticesToPixelEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "is_snap_2d_vertices_to_pixel_enabled")

    public val setPositionalShadowAtlasQuadrantSubdivPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "set_positional_shadow_atlas_quadrant_subdiv")

    public val getPositionalShadowAtlasQuadrantSubdivPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "get_positional_shadow_atlas_quadrant_subdiv")

    public val setInputAsHandledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "set_input_as_handled")

    public val isInputHandledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "is_input_handled")

    public val setHandleInputLocallyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "set_handle_input_locally")

    public val isHandlingInputLocallyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "is_handling_input_locally")

    public val setDefaultCanvasItemTextureFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "set_default_canvas_item_texture_filter")

    public val getDefaultCanvasItemTextureFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "get_default_canvas_item_texture_filter")

    public val setEmbeddingSubwindowsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "set_embedding_subwindows")

    public val isEmbeddingSubwindowsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "is_embedding_subwindows")

    public val getEmbeddedSubwindowsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "get_embedded_subwindows")

    public val setCanvasCullMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "set_canvas_cull_mask")

    public val getCanvasCullMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "get_canvas_cull_mask")

    public val setCanvasCullMaskBitPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "set_canvas_cull_mask_bit")

    public val getCanvasCullMaskBitPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "get_canvas_cull_mask_bit")

    public val setDefaultCanvasItemTextureRepeatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "set_default_canvas_item_texture_repeat")

    public val getDefaultCanvasItemTextureRepeatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "get_default_canvas_item_texture_repeat")

    public val setSdfOversizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "set_sdf_oversize")

    public val getSdfOversizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "get_sdf_oversize")

    public val setSdfScalePtr: VoidPtr = TypeManager.getMethodBindPtr("Viewport", "set_sdf_scale")

    public val getSdfScalePtr: VoidPtr = TypeManager.getMethodBindPtr("Viewport", "get_sdf_scale")

    public val setMeshLodThresholdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "set_mesh_lod_threshold")

    public val getMeshLodThresholdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "get_mesh_lod_threshold")

    public val setAsAudioListener2dPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "set_as_audio_listener_2d")

    public val isAudioListener2dPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "is_audio_listener_2d")

    public val getCamera2dPtr: VoidPtr = TypeManager.getMethodBindPtr("Viewport", "get_camera_2d")

    public val setWorld3dPtr: VoidPtr = TypeManager.getMethodBindPtr("Viewport", "set_world_3d")

    public val getWorld3dPtr: VoidPtr = TypeManager.getMethodBindPtr("Viewport", "get_world_3d")

    public val findWorld3dPtr: VoidPtr = TypeManager.getMethodBindPtr("Viewport", "find_world_3d")

    public val setUseOwnWorld3dPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "set_use_own_world_3d")

    public val isUsingOwnWorld3dPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "is_using_own_world_3d")

    public val getCamera3dPtr: VoidPtr = TypeManager.getMethodBindPtr("Viewport", "get_camera_3d")

    public val setAsAudioListener3dPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "set_as_audio_listener_3d")

    public val isAudioListener3dPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "is_audio_listener_3d")

    public val setDisable3dPtr: VoidPtr = TypeManager.getMethodBindPtr("Viewport", "set_disable_3d")

    public val is3dDisabledPtr: VoidPtr = TypeManager.getMethodBindPtr("Viewport", "is_3d_disabled")

    public val setUseXrPtr: VoidPtr = TypeManager.getMethodBindPtr("Viewport", "set_use_xr")

    public val isUsingXrPtr: VoidPtr = TypeManager.getMethodBindPtr("Viewport", "is_using_xr")

    public val setScaling3dModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "set_scaling_3d_mode")

    public val getScaling3dModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "get_scaling_3d_mode")

    public val setScaling3dScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "set_scaling_3d_scale")

    public val getScaling3dScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "get_scaling_3d_scale")

    public val setFsrSharpnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "set_fsr_sharpness")

    public val getFsrSharpnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "get_fsr_sharpness")

    public val setTextureMipmapBiasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "set_texture_mipmap_bias")

    public val getTextureMipmapBiasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "get_texture_mipmap_bias")

    public val setVrsModePtr: VoidPtr = TypeManager.getMethodBindPtr("Viewport", "set_vrs_mode")

    public val getVrsModePtr: VoidPtr = TypeManager.getMethodBindPtr("Viewport", "get_vrs_mode")

    public val setVrsUpdateModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "set_vrs_update_mode")

    public val getVrsUpdateModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "get_vrs_update_mode")

    public val setVrsTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "set_vrs_texture")

    public val getVrsTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Viewport", "get_vrs_texture")
  }
}
