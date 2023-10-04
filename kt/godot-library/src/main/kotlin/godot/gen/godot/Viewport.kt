// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.GodotBaseType
import godot.core.RID
import godot.core.Rect2
import godot.core.Transform2D
import godot.core.VariantType.ANY
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
 * Abstract base class for viewports. Encapsulates drawing and interaction with a game world.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/586](https://godotengine.org/asset-library/asset/586)
 *
 * A Viewport creates a different view into the screen, or a sub-view inside another viewport. Children 2D Nodes will display on it, and children Camera3D 3D nodes will render on it too.
 *
 * Optionally, a viewport can have its own 2D or 3D world, so it doesn't share what it draws with other viewports.
 *
 * Viewports can also choose to be audio listeners, so they generate positional audio depending on a 2D or 3D camera child of it.
 *
 * Also, viewports can be assigned to different screens in case the devices have multiple screens.
 *
 * Finally, viewports can also behave as render targets, in which case they will not be visible unless the associated texture is used to draw.
 */
@GodotBaseType
public open class Viewport internal constructor() : Node() {
  /**
   * Emitted when the size of the viewport is changed, whether by resizing of window, or some other means.
   */
  public val sizeChanged: Signal0 by signal()

  /**
   * Emitted when a Control node grabs keyboard focus.
   */
  public val guiFocusChanged: Signal1<Control> by signal("node")

  /**
   * Disable 3D rendering (but keep 2D rendering).
   */
  public var disable3d: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_IS_3D_DISABLED, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_DISABLE_3D, NIL)
    }

  /**
   * If `true`, the viewport will use the primary XR interface to render XR output. When applicable this can result in a stereoscopic image and the resulting render being output to a headset.
   */
  public var useXr: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_IS_USING_XR, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_USE_XR, NIL)
    }

  /**
   * If `true`, the viewport will use a unique copy of the [godot.World3D] defined in [world3d].
   */
  public var ownWorld3d: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_IS_USING_OWN_WORLD_3D,
          BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_USE_OWN_WORLD_3D,
          NIL)
    }

  /**
   * The custom [godot.World3D] which can be used as 3D environment source.
   */
  public var world3d: World3D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_WORLD_3D, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as World3D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_WORLD_3D, NIL)
    }

  /**
   * The custom [godot.World2D] which can be used as 2D environment source.
   */
  public var world2d: World2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_WORLD_2D, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as World2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_WORLD_2D, NIL)
    }

  /**
   * If `true`, the viewport should render its background as transparent.
   */
  public var transparentBg: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORT_HAS_TRANSPARENT_BACKGROUND, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_TRANSPARENT_BACKGROUND, NIL)
    }

  /**
   * If `true`, this viewport will mark incoming input events as handled by itself. If `false`, this is instead done by the first parent viewport that is set to handle input locally.
   *
   * A [godot.SubViewportContainer] will automatically set this property to `false` for the [godot.Viewport] contained inside of it.
   *
   * See also [setInputAsHandled] and [isInputHandled].
   */
  public var handleInputLocally: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORT_IS_HANDLING_INPUT_LOCALLY, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_HANDLE_INPUT_LOCALLY,
          NIL)
    }

  /**
   *
   */
  public var snap2dTransformsToPixel: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORT_IS_SNAP_2D_TRANSFORMS_TO_PIXEL_ENABLED, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_SNAP_2D_TRANSFORMS_TO_PIXEL, NIL)
    }

  /**
   *
   */
  public var snap2dVerticesToPixel: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORT_IS_SNAP_2D_VERTICES_TO_PIXEL_ENABLED, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_SNAP_2D_VERTICES_TO_PIXEL, NIL)
    }

  /**
   * The multisample anti-aliasing mode for 2D/Canvas rendering. A higher number results in smoother edges at the cost of significantly worse performance. A value of 2 or 4 is best unless targeting very high-end systems. This has no effect on shader-induced aliasing or texture aliasing.
   */
  public var msaa2d: MSAA
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_MSAA_2D, LONG)
      return Viewport.MSAA.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_MSAA_2D, NIL)
    }

  /**
   * The multisample anti-aliasing mode for 3D rendering. A higher number results in smoother edges at the cost of significantly worse performance. A value of 2 or 4 is best unless targeting very high-end systems. See also bilinear scaling 3d [scaling3dMode] for supersampling, which provides higher quality but is much more expensive. This has no effect on shader-induced aliasing or texture aliasing.
   */
  public var msaa3d: MSAA
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_MSAA_3D, LONG)
      return Viewport.MSAA.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_MSAA_3D, NIL)
    }

  /**
   * Sets the screen-space antialiasing method used. Screen-space antialiasing works by selectively blurring edges in a post-process shader. It differs from MSAA which takes multiple coverage samples while rendering objects. Screen-space AA methods are typically faster than MSAA and will smooth out specular aliasing, but tend to make scenes appear blurry.
   */
  public var screenSpaceAa: ScreenSpaceAA
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_SCREEN_SPACE_AA,
          LONG)
      return Viewport.ScreenSpaceAA.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_SCREEN_SPACE_AA, NIL)
    }

  /**
   * Enables Temporal Anti-Aliasing for this viewport. TAA works by jittering the camera and accumulating the images of the last rendered frames, motion vector rendering is used to account for camera and object motion.
   *
   * **Note:** The implementation is not complete yet, some visual instances such as particles and skinned meshes may show artifacts.
   */
  public var useTaa: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_IS_USING_TAA, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_USE_TAA, NIL)
    }

  /**
   * If `true`, uses a fast post-processing filter to make banding significantly less visible in 3D. 2D rendering is *not* affected by debanding unless the [godot.Environment.backgroundMode] is [godot.Environment.BG_CANVAS]. See also [godot.ProjectSettings.rendering/antiAliasing/quality/useDebanding].
   *
   * In some cases, debanding may introduce a slightly noticeable dithering pattern. It's recommended to enable debanding only when actually needed since the dithering pattern will make lossless-compressed screenshots larger.
   */
  public var useDebanding: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_IS_USING_DEBANDING, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_USE_DEBANDING, NIL)
    }

  /**
   * If `true`, [godot.OccluderInstance3D] nodes will be usable for occlusion culling in 3D for this viewport. For the root viewport, [godot.ProjectSettings.rendering/occlusionCulling/useOcclusionCulling] must be set to `true` instead.
   *
   * **Note:** Enabling occlusion culling has a cost on the CPU. Only enable occlusion culling if you actually plan to use it, and think whether your scene can actually benefit from occlusion culling. Large, open scenes with few or no objects blocking the view will generally not benefit much from occlusion culling. Large open scenes generally benefit more from mesh LOD and visibility ranges ([godot.GeometryInstance3D.visibilityRangeBegin] and [godot.GeometryInstance3D.visibilityRangeEnd]) compared to occlusion culling.
   *
   * **Note:** Due to memory constraints, occlusion culling is not supported by default in Web export templates. It can be enabled by compiling custom Web export templates with `module_raycast_enabled=yes`.
   */
  public var useOcclusionCulling: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORT_IS_USING_OCCLUSION_CULLING, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_USE_OCCLUSION_CULLING, NIL)
    }

  /**
   * The automatic LOD bias to use for meshes rendered within the [godot.Viewport] (this is analogous to [godot.ReflectionProbe.meshLodThreshold]). Higher values will use less detailed versions of meshes that have LOD variations generated. If set to `0.0`, automatic LOD is disabled. Increase [meshLodThreshold] to improve performance at the cost of geometry detail.
   *
   * To control this property on the root viewport, set the [godot.ProjectSettings.rendering/meshLod/lodChange/thresholdPixels] project setting.
   *
   * **Note:** [meshLodThreshold] does not affect [godot.GeometryInstance3D] visibility ranges (also known as "manual" LOD or hierarchical LOD).
   */
  public var meshLodThreshold: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_MESH_LOD_THRESHOLD,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_MESH_LOD_THRESHOLD,
          NIL)
    }

  /**
   * The overlay mode for test rendered geometry in debug purposes.
   */
  public var debugDraw: DebugDraw
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_DEBUG_DRAW, LONG)
      return Viewport.DebugDraw.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_DEBUG_DRAW, NIL)
    }

  /**
   * Sets scaling 3d mode. Bilinear scaling renders at different resolution to either undersample or supersample the viewport. FidelityFX Super Resolution 1.0, abbreviated to FSR, is an upscaling technology that produces high quality images at fast framerates by using a spatially aware upscaling algorithm. FSR is slightly more expensive than bilinear, but it produces significantly higher image quality. FSR should be used where possible.
   *
   * To control this property on the root viewport, set the [godot.ProjectSettings.rendering/scaling3d/mode] project setting.
   */
  public var scaling3dMode: Scaling3DMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_SCALING_3D_MODE,
          LONG)
      return Viewport.Scaling3DMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_SCALING_3D_MODE, NIL)
    }

  /**
   * Scales the 3D render buffer based on the viewport size uses an image filter specified in [godot.ProjectSettings.rendering/scaling3d/mode] to scale the output image to the full viewport size. Values lower than `1.0` can be used to speed up 3D rendering at the cost of quality (undersampling). Values greater than `1.0` are only valid for bilinear mode and can be used to improve 3D rendering quality at a high performance cost (supersampling). See also [godot.ProjectSettings.rendering/antiAliasing/quality/msaa3d] for multi-sample antialiasing, which is significantly cheaper but only smooths the edges of polygons.
   *
   * When using FSR upscaling, AMD recommends exposing the following values as preset options to users "Ultra Quality: 0.77", "Quality: 0.67", "Balanced: 0.59", "Performance: 0.5" instead of exposing the entire scale.
   *
   * To control this property on the root viewport, set the [godot.ProjectSettings.rendering/scaling3d/scale] project setting.
   */
  public var scaling3dScale: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_SCALING_3D_SCALE,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_SCALING_3D_SCALE,
          NIL)
    }

  /**
   * Affects the final texture sharpness by reading from a lower or higher mipmap (also called "texture LOD bias"). Negative values make mipmapped textures sharper but grainier when viewed at a distance, while positive values make mipmapped textures blurrier (even when up close).
   *
   * Enabling temporal antialiasing ([useTaa]) will automatically apply a `-0.5` offset to this value, while enabling FXAA ([screenSpaceAa]) will automatically apply a `-0.25` offset to this value. If both TAA and FXAA are enabled at the same time, an offset of `-0.75` is applied to this value.
   *
   * **Note:** If [scaling3dScale] is lower than `1.0` (exclusive), [textureMipmapBias] is used to adjust the automatic mipmap bias which is calculated internally based on the scale factor. The formula for this is `log2(scaling_3d_scale) + mipmap_bias`.
   *
   * To control this property on the root viewport, set the [godot.ProjectSettings.rendering/textures/defaultFilters/textureMipmapBias] project setting.
   */
  public var textureMipmapBias: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_TEXTURE_MIPMAP_BIAS,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_TEXTURE_MIPMAP_BIAS,
          NIL)
    }

  /**
   * Determines how sharp the upscaled image will be when using the FSR upscaling mode. Sharpness halves with every whole number. Values go from 0.0 (sharpest) to 2.0. Values above 2.0 won't make a visible difference.
   *
   * To control this property on the root viewport, set the [godot.ProjectSettings.rendering/scaling3d/fsrSharpness] project setting.
   */
  public var fsrSharpness: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_FSR_SHARPNESS,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_FSR_SHARPNESS, NIL)
    }

  /**
   * The Variable Rate Shading (VRS) mode that is used for this viewport. Note, if hardware does not support VRS this property is ignored.
   */
  public var vrsMode: VRSMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_VRS_MODE, LONG)
      return Viewport.VRSMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_VRS_MODE, NIL)
    }

  /**
   * Texture to use when [vrsMode] is set to [godot.Viewport.VRS_TEXTURE].
   *
   * The texture *must* use a lossless compression format so that colors can be matched precisely. The following VRS densities are mapped to various colors, with brighter colors representing a lower level of shading precision:
   *
   * ```
   * 			- 1x1 = rgb(0, 0, 0)     - #000000
   * 			- 1x2 = rgb(0, 85, 0)    - #005500
   * 			- 2x1 = rgb(85, 0, 0)    - #550000
   * 			- 2x2 = rgb(85, 85, 0)   - #555500
   * 			- 2x4 = rgb(85, 170, 0)  - #55aa00
   * 			- 4x2 = rgb(170, 85, 0)  - #aa5500
   * 			- 4x4 = rgb(170, 170, 0) - #aaaa00
   * 			- 4x8 = rgb(170, 255, 0) - #aaff00 - Not supported on most hardware
   * 			- 8x4 = rgb(255, 170, 0) - #ffaa00 - Not supported on most hardware
   * 			- 8x8 = rgb(255, 255, 0) - #ffff00 - Not supported on most hardware
   * 			```
   */
  public var vrsTexture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_VRS_TEXTURE, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_VRS_TEXTURE, NIL)
    }

  /**
   * Sets the default filter mode used by [godot.CanvasItem]s in this Viewport. See [enum DefaultCanvasItemTextureFilter] for options.
   */
  public var canvasItemDefaultTextureFilter: DefaultCanvasItemTextureFilter
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_DEFAULT_CANVAS_ITEM_TEXTURE_FILTER, LONG)
      return Viewport.DefaultCanvasItemTextureFilter.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_DEFAULT_CANVAS_ITEM_TEXTURE_FILTER, NIL)
    }

  /**
   * Sets the default repeat mode used by [godot.CanvasItem]s in this Viewport. See [enum DefaultCanvasItemTextureRepeat] for options.
   */
  public var canvasItemDefaultTextureRepeat: DefaultCanvasItemTextureRepeat
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_DEFAULT_CANVAS_ITEM_TEXTURE_REPEAT, LONG)
      return Viewport.DefaultCanvasItemTextureRepeat.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_DEFAULT_CANVAS_ITEM_TEXTURE_REPEAT, NIL)
    }

  /**
   * If `true`, the viewport will process 2D audio streams.
   */
  public var audioListenerEnable2d: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_IS_AUDIO_LISTENER_2D,
          BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_AS_AUDIO_LISTENER_2D,
          NIL)
    }

  /**
   * If `true`, the viewport will process 3D audio streams.
   */
  public var audioListenerEnable3d: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_IS_AUDIO_LISTENER_3D,
          BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_AS_AUDIO_LISTENER_3D,
          NIL)
    }

  /**
   * If `true`, the objects rendered by viewport become subjects of mouse picking process.
   */
  public var physicsObjectPicking: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_PHYSICS_OBJECT_PICKING, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_PHYSICS_OBJECT_PICKING, NIL)
    }

  /**
   * If `true`, objects receive mouse picking events sorted primarily by their [godot.CanvasItem.zIndex] and secondarily by their position in the scene tree. If `false`, the order is undetermined.
   *
   * **Note:** This setting is disabled by default because of its potential expensive computational cost.
   */
  public var physicsObjectPickingSort: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_PHYSICS_OBJECT_PICKING_SORT, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_PHYSICS_OBJECT_PICKING_SORT, NIL)
    }

  /**
   * If `true`, the viewport will not receive input events.
   */
  public var guiDisableInput: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_IS_INPUT_DISABLED, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_DISABLE_INPUT, NIL)
    }

  /**
   * If `true`, the GUI controls on the viewport will lay pixel perfectly.
   */
  public var guiSnapControlsToPixels: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORT_IS_SNAP_CONTROLS_TO_PIXELS_ENABLED, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_SNAP_CONTROLS_TO_PIXELS, NIL)
    }

  /**
   * If `true`, sub-windows (popups and dialogs) will be embedded inside application window as control-like nodes. If `false`, they will appear as separate windows handled by the operating system.
   */
  public var guiEmbedSubwindows: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_IS_EMBEDDING_SUBWINDOWS,
          BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_EMBEDDING_SUBWINDOWS,
          NIL)
    }

  /**
   *
   */
  public var sdfOversize: SDFOversize
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_SDF_OVERSIZE, LONG)
      return Viewport.SDFOversize.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_SDF_OVERSIZE, NIL)
    }

  /**
   *
   */
  public var sdfScale: SDFScale
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_SDF_SCALE, LONG)
      return Viewport.SDFScale.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_SDF_SCALE, NIL)
    }

  /**
   * The shadow atlas' resolution (used for omni and spot lights). The value is rounded up to the nearest power of 2.
   *
   * **Note:** If this is set to `0`, no positional shadows will be visible at all. This can improve performance significantly on low-end systems by reducing both the CPU and GPU load (as fewer draw calls are needed to draw the scene without shadows).
   */
  public var positionalShadowAtlasSize: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_POSITIONAL_SHADOW_ATLAS_SIZE, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_POSITIONAL_SHADOW_ATLAS_SIZE, NIL)
    }

  /**
   * Use 16 bits for the omni/spot shadow depth map. Enabling this results in shadows having less precision and may result in shadow acne, but can lead to performance improvements on some devices.
   */
  public var positionalShadowAtlas16Bits: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_POSITIONAL_SHADOW_ATLAS_16_BITS, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_POSITIONAL_SHADOW_ATLAS_16_BITS, NIL)
    }

  /**
   * The subdivision amount of the first quadrant on the shadow atlas.
   */
  public var positionalShadowAtlasQuad0: PositionalShadowAtlasQuadrantSubdiv
    get() {
      TransferContext.writeArguments(LONG to 0)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_POSITIONAL_SHADOW_ATLAS_QUADRANT_SUBDIV, LONG)
      return Viewport.PositionalShadowAtlasQuadrantSubdiv.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 0, LONG to value.id)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_POSITIONAL_SHADOW_ATLAS_QUADRANT_SUBDIV, NIL)
    }

  /**
   * The subdivision amount of the second quadrant on the shadow atlas.
   */
  public var positionalShadowAtlasQuad1: PositionalShadowAtlasQuadrantSubdiv
    get() {
      TransferContext.writeArguments(LONG to 1)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_POSITIONAL_SHADOW_ATLAS_QUADRANT_SUBDIV, LONG)
      return Viewport.PositionalShadowAtlasQuadrantSubdiv.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 1, LONG to value.id)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_POSITIONAL_SHADOW_ATLAS_QUADRANT_SUBDIV, NIL)
    }

  /**
   * The subdivision amount of the third quadrant on the shadow atlas.
   */
  public var positionalShadowAtlasQuad2: PositionalShadowAtlasQuadrantSubdiv
    get() {
      TransferContext.writeArguments(LONG to 2)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_POSITIONAL_SHADOW_ATLAS_QUADRANT_SUBDIV, LONG)
      return Viewport.PositionalShadowAtlasQuadrantSubdiv.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 2, LONG to value.id)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_POSITIONAL_SHADOW_ATLAS_QUADRANT_SUBDIV, NIL)
    }

  /**
   * The subdivision amount of the fourth quadrant on the shadow atlas.
   */
  public var positionalShadowAtlasQuad3: PositionalShadowAtlasQuadrantSubdiv
    get() {
      TransferContext.writeArguments(LONG to 3)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_POSITIONAL_SHADOW_ATLAS_QUADRANT_SUBDIV, LONG)
      return Viewport.PositionalShadowAtlasQuadrantSubdiv.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 3, LONG to value.id)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_POSITIONAL_SHADOW_ATLAS_QUADRANT_SUBDIV, NIL)
    }

  /**
   * The canvas transform of the viewport, useful for changing the on-screen positions of all child [godot.CanvasItem]s. This is relative to the global canvas transform of the viewport.
   */
  public var canvasTransform: Transform2D
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_CANVAS_TRANSFORM,
          TRANSFORM2D)
      return (TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D)
    }
    set(`value`) {
      TransferContext.writeArguments(TRANSFORM2D to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_CANVAS_TRANSFORM,
          NIL)
    }

  /**
   * The global canvas transform of the viewport. The canvas transform is relative to this.
   */
  public var globalCanvasTransform: Transform2D
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_GLOBAL_CANVAS_TRANSFORM, TRANSFORM2D)
      return (TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D)
    }
    set(`value`) {
      TransferContext.writeArguments(TRANSFORM2D to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_GLOBAL_CANVAS_TRANSFORM, NIL)
    }

  /**
   * The rendering layers in which this [godot.Viewport] renders [godot.CanvasItem] nodes.
   */
  public var canvasCullMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_CANVAS_CULL_MASK,
          LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_CANVAS_CULL_MASK,
          NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VIEWPORT, scriptIndex)
    return true
  }

  /**
   * The canvas transform of the viewport, useful for changing the on-screen positions of all child [godot.CanvasItem]s. This is relative to the global canvas transform of the viewport.
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
   * Returns the first valid [godot.World2D] for this viewport, searching the [world2d] property of itself and any Viewport ancestor.
   */
  public fun findWorld2d(): World2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_FIND_WORLD_2D, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as World2D?)
  }

  /**
   * Returns the transform from the viewport's coordinate system to the embedder's coordinate system.
   */
  public fun getFinalTransform(): Transform2D {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_FINAL_TRANSFORM,
        TRANSFORM2D)
    return (TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D)
  }

  /**
   * Returns the transform from the Viewport's coordinates to the screen coordinates of the containing window manager window.
   */
  public fun getScreenTransform(): Transform2D {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_SCREEN_TRANSFORM,
        TRANSFORM2D)
    return (TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D)
  }

  /**
   * Returns the visible rectangle in global screen coordinates.
   */
  public fun getVisibleRect(): Rect2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_VISIBLE_RECT, RECT2)
    return (TransferContext.readReturnValue(RECT2, false) as Rect2)
  }

  /**
   * Returns rendering statistics of the given type. See [enum RenderInfoType] and [enum RenderInfo] for options.
   */
  public fun getRenderInfo(type: RenderInfoType, info: RenderInfo): Int {
    TransferContext.writeArguments(LONG to type.id, LONG to info.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_RENDER_INFO, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the viewport's texture.
   *
   * **Note:** When trying to store the current texture (e.g. in a file), it might be completely black or outdated if used too early, especially when used in e.g. [godot.Node.Ready]. To make sure the texture you get is correct, you can await [godot.RenderingServer.framePostDraw] signal.
   *
   * ```
   * 				func _ready():
   * 				    await RenderingServer.frame_post_draw
   * 				    $Viewport.get_texture().get_image().save_png("user://Screenshot.png")
   * 				```
   */
  public fun getTexture(): ViewportTexture? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_TEXTURE, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as ViewportTexture?)
  }

  /**
   * Returns the viewport's RID from the [godot.RenderingServer].
   */
  public fun getViewportRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_VIEWPORT_RID, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Helper method which calls the `set_text()` method on the currently focused [godot.Control], provided that it is defined (e.g. if the focused Control is [godot.Button] or [godot.LineEdit]).
   */
  public fun pushTextInput(text: String): Unit {
    TransferContext.writeArguments(STRING to text)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_PUSH_TEXT_INPUT, NIL)
  }

  /**
   * Triggers the given [event] in this [godot.Viewport]. This can be used to pass an [godot.InputEvent] between viewports, or to locally apply inputs that were sent over the network or saved to a file.
   *
   * If [inLocalCoords] is `false`, the event's position is in the embedder's coordinates and will be converted to viewport coordinates. If [inLocalCoords] is `true`, the event's position is in viewport coordinates.
   *
   * While this method serves a similar purpose as [godot.Input.parseInputEvent], it does not remap the specified [event] based on project settings like [godot.ProjectSettings.inputDevices/pointing/emulateTouchFromMouse].
   *
   * Calling this method will propagate calls to child nodes for following methods in the given order:
   *
   * - [godot.Node.Input]
   *
   * - [godot.Control.GuiInput] for [godot.Control] nodes
   *
   * - [godot.Node.ShortcutInput]
   *
   * - [godot.Node.UnhandledInput]
   *
   * - [godot.Node.UnhandledKeyInput]
   *
   * If an earlier method marks the input as handled via [setInputAsHandled], any later method in this list will not be called.
   *
   * If none of the methods handle the event and [physicsObjectPicking] is `true`, the event is used for physics object picking.
   */
  @JvmOverloads
  public fun pushInput(event: InputEvent, inLocalCoords: Boolean = false): Unit {
    TransferContext.writeArguments(OBJECT to event, BOOL to inLocalCoords)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_PUSH_INPUT, NIL)
  }

  /**
   * Triggers the given [godot.InputEvent] in this [godot.Viewport]. This can be used to pass input events between viewports, or to locally apply inputs that were sent over the network or saved to a file.
   *
   * If [inLocalCoords] is `false`, the event's position is in the embedder's coordinates and will be converted to viewport coordinates. If [inLocalCoords] is `true`, the event's position is in viewport coordinates.
   *
   * While this method serves a similar purpose as [godot.Input.parseInputEvent], it does not remap the specified [event] based on project settings like [godot.ProjectSettings.inputDevices/pointing/emulateTouchFromMouse].
   *
   * Calling this method will propagate calls to child nodes for following methods in the given order:
   *
   * - [godot.Node.ShortcutInput]
   *
   * - [godot.Node.UnhandledInput]
   *
   * - [godot.Node.UnhandledKeyInput]
   *
   * If an earlier method marks the input as handled via [setInputAsHandled], any later method in this list will not be called.
   *
   * If none of the methods handle the event and [physicsObjectPicking] is `true`, the event is used for physics object picking.
   *
   * **Note:** This method doesn't propagate input events to embedded [godot.Window]s or [godot.SubViewport]s.
   *
   * *Deprecated.* Use [pushInput] instead.
   */
  @JvmOverloads
  public fun pushUnhandledInput(event: InputEvent, inLocalCoords: Boolean = false): Unit {
    TransferContext.writeArguments(OBJECT to event, BOOL to inLocalCoords)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_PUSH_UNHANDLED_INPUT, NIL)
  }

  /**
   * Returns the currently active 2D camera. Returns null if there are no active cameras.
   */
  public fun getCamera2d(): Camera2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_CAMERA_2D, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Camera2D?)
  }

  /**
   * Returns the mouse's position in this [godot.Viewport] using the coordinate system of this [godot.Viewport].
   */
  public fun getMousePosition(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_MOUSE_POSITION,
        VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Moves the mouse pointer to the specified position in this [godot.Viewport] using the coordinate system of this [godot.Viewport].
   *
   * **Note:** [warpMouse] is only supported on Windows, macOS and Linux. It has no effect on Android, iOS and Web.
   */
  public fun warpMouse(position: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_WARP_MOUSE, NIL)
  }

  /**
   * Force instantly updating the display based on the current mouse cursor position. This includes updating the mouse cursor shape and sending necessary [godot.Control.mouseEntered], [godot.CollisionObject2D.mouseEntered], [godot.CollisionObject3D.mouseEntered] and [godot.Window.mouseEntered] signals and their respective `mouse_exited` counterparts.
   */
  public fun updateMouseCursorState(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_UPDATE_MOUSE_CURSOR_STATE,
        NIL)
  }

  /**
   * Returns the drag data from the GUI, that was previously returned by [godot.Control.GetDragData].
   */
  public fun guiGetDragData(): Any? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GUI_GET_DRAG_DATA, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  /**
   * Returns `true` if the viewport is currently performing a drag operation.
   *
   * Alternative to [godot.Node.NOTIFICATION_DRAG_BEGIN] and [godot.Node.NOTIFICATION_DRAG_END] when you prefer polling the value.
   */
  public fun guiIsDragging(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GUI_IS_DRAGGING, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if the drag operation is successful.
   */
  public fun guiIsDragSuccessful(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GUI_IS_DRAG_SUCCESSFUL,
        BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Removes the focus from the currently focused [godot.Control] within this viewport. If no [godot.Control] has the focus, does nothing.
   */
  public fun guiReleaseFocus(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GUI_RELEASE_FOCUS, NIL)
  }

  /**
   * Returns the [godot.Control] having the focus within this viewport. If no [godot.Control] has the focus, returns null.
   */
  public fun guiGetFocusOwner(): Control? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GUI_GET_FOCUS_OWNER,
        OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Control?)
  }

  /**
   * Stops the input from propagating further down the [godot.SceneTree].
   *
   * **Note:** This does not affect the methods in [godot.Input], only the way events are propagated.
   */
  public fun setInputAsHandled(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_INPUT_AS_HANDLED, NIL)
  }

  /**
   * Returns whether the current [godot.InputEvent] has been handled. Input events are not handled until [setInputAsHandled] has been called during the lifetime of an [godot.InputEvent].
   *
   * This is usually done as part of input handling methods like [godot.Node.Input], [godot.Control.GuiInput] or others, as well as in corresponding signal handlers.
   *
   * If [handleInputLocally] is set to `false`, this method will try finding the first parent viewport that is set to handle input locally, and return its value for [isInputHandled] instead.
   */
  public fun isInputHandled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_IS_INPUT_HANDLED, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Set/clear individual bits on the rendering layer mask. This simplifies editing this [godot.Viewport]'s layers.
   */
  public fun setCanvasCullMaskBit(layer: Long, enable: Boolean): Unit {
    TransferContext.writeArguments(LONG to layer, BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_CANVAS_CULL_MASK_BIT,
        NIL)
  }

  /**
   * Returns an individual bit on the rendering layer mask.
   */
  public fun getCanvasCullMaskBit(layer: Long): Boolean {
    TransferContext.writeArguments(LONG to layer)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_CANVAS_CULL_MASK_BIT,
        BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the first valid [godot.World3D] for this viewport, searching the [world3d] property of itself and any Viewport ancestor.
   */
  public fun findWorld3d(): World3D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_FIND_WORLD_3D, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as World3D?)
  }

  /**
   * Returns the currently active 3D camera.
   */
  public fun getCamera3d(): Camera3D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_CAMERA_3D, OBJECT)
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
     * This quadrant will be split 256 ways and used by up to 256 shadow maps. Unless the [positionalShadowAtlasSize] is very high, the shadows in this quadrant will be very low resolution.
     */
    SHADOW_ATLAS_QUADRANT_SUBDIV_256(5),
    /**
     * This quadrant will be split 1024 ways and used by up to 1024 shadow maps. Unless the [positionalShadowAtlasSize] is very high, the shadows in this quadrant will be very low resolution.
     */
    SHADOW_ATLAS_QUADRANT_SUBDIV_1024(6),
    /**
     * Represents the size of the [enum PositionalShadowAtlasQuadrantSubdiv] enum.
     */
    SHADOW_ATLAS_QUADRANT_SUBDIV_MAX(7),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class Scaling3DMode(
    id: Long,
  ) {
    /**
     * Use bilinear scaling for the viewport's 3D buffer. The amount of scaling can be set using [scaling3dScale]. Values less than `1.0` will result in undersampling while values greater than `1.0` will result in supersampling. A value of `1.0` disables scaling.
     */
    SCALING_3D_MODE_BILINEAR(0),
    /**
     * Use AMD FidelityFX Super Resolution 1.0 upscaling for the viewport's 3D buffer. The amount of scaling can be set using [scaling3dScale]. Values less than `1.0` will be result in the viewport being upscaled using FSR. Values greater than `1.0` are not supported and bilinear downsampling will be used instead. A value of `1.0` disables scaling.
     */
    SCALING_3D_MODE_FSR(1),
    /**
     * Represents the size of the [enum Scaling3DMode] enum.
     */
    SCALING_3D_MODE_MAX(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class MSAA(
    id: Long,
  ) {
    /**
     * Multisample antialiasing mode disabled. This is the default value, and is also the fastest setting.
     */
    MSAA_DISABLED(0),
    /**
     * Use 2× Multisample Antialiasing. This has a moderate performance cost. It helps reduce aliasing noticeably, but 4× MSAA still looks substantially better.
     */
    MSAA_2X(1),
    /**
     * Use 4× Multisample Antialiasing. This has a significant performance cost, and is generally a good compromise between performance and quality.
     */
    MSAA_4X(2),
    /**
     * Use 8× Multisample Antialiasing. This has a very high performance cost. The difference between 4× and 8× MSAA may not always be visible in real gameplay conditions. Likely unsupported on low-end and older hardware.
     */
    MSAA_8X(3),
    /**
     * Represents the size of the [enum MSAA] enum.
     */
    MSAA_MAX(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
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
     * Use fast approximate antialiasing. FXAA is a popular screen-space antialiasing method, which is fast but will make the image look blurry, especially at lower resolutions. It can still work relatively well at large resolutions such as 1440p and 4K.
     */
    SCREEN_SPACE_AA_FXAA(1),
    /**
     * Represents the size of the [enum ScreenSpaceAA] enum.
     */
    SCREEN_SPACE_AA_MAX(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
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
     * Represents the size of the [enum RenderInfo] enum.
     */
    RENDER_INFO_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class RenderInfoType(
    id: Long,
  ) {
    /**
     *
     */
    RENDER_INFO_TYPE_VISIBLE(0),
    /**
     *
     */
    RENDER_INFO_TYPE_SHADOW(1),
    /**
     *
     */
    RENDER_INFO_TYPE_MAX(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
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
     *
     */
    DEBUG_DRAW_LIGHTING(2),
    /**
     * Objects are displayed semi-transparent with additive blending so you can see where they are drawing over top of one another. A higher overdraw means you are wasting performance on drawing pixels that are being hidden behind others.
     */
    DEBUG_DRAW_OVERDRAW(3),
    /**
     * Objects are displayed in wireframe style.
     */
    DEBUG_DRAW_WIREFRAME(4),
    /**
     *
     */
    DEBUG_DRAW_NORMAL_BUFFER(5),
    /**
     * Objects are displayed with only the albedo value from [godot.VoxelGI]s.
     */
    DEBUG_DRAW_VOXEL_GI_ALBEDO(6),
    /**
     * Objects are displayed with only the lighting value from [godot.VoxelGI]s.
     */
    DEBUG_DRAW_VOXEL_GI_LIGHTING(7),
    /**
     * Objects are displayed with only the emission color from [godot.VoxelGI]s.
     */
    DEBUG_DRAW_VOXEL_GI_EMISSION(8),
    /**
     * Draws the shadow atlas that stores shadows from [godot.OmniLight3D]s and [godot.SpotLight3D]s in the upper left quadrant of the [godot.Viewport].
     */
    DEBUG_DRAW_SHADOW_ATLAS(9),
    /**
     * Draws the shadow atlas that stores shadows from [godot.DirectionalLight3D]s in the upper left quadrant of the [godot.Viewport].
     */
    DEBUG_DRAW_DIRECTIONAL_SHADOW_ATLAS(10),
    /**
     *
     */
    DEBUG_DRAW_SCENE_LUMINANCE(11),
    /**
     * Draws the screen-space ambient occlusion texture instead of the scene so that you can clearly see how it is affecting objects. In order for this display mode to work, you must have [godot.Environment.ssaoEnabled] set in your [godot.WorldEnvironment].
     */
    DEBUG_DRAW_SSAO(12),
    /**
     * Draws the screen-space indirect lighting texture instead of the scene so that you can clearly see how it is affecting objects. In order for this display mode to work, you must have [godot.Environment.ssilEnabled] set in your [godot.WorldEnvironment].
     */
    DEBUG_DRAW_SSIL(13),
    /**
     * Colors each PSSM split for the [godot.DirectionalLight3D]s in the scene a different color so you can see where the splits are. In order, they will be colored red, green, blue, and yellow.
     */
    DEBUG_DRAW_PSSM_SPLITS(14),
    /**
     * Draws the decal atlas used by [godot.Decal]s and light projector textures in the upper left quadrant of the [godot.Viewport].
     */
    DEBUG_DRAW_DECAL_ATLAS(15),
    /**
     *
     */
    DEBUG_DRAW_SDFGI(16),
    /**
     *
     */
    DEBUG_DRAW_SDFGI_PROBES(17),
    /**
     *
     */
    DEBUG_DRAW_GI_BUFFER(18),
    /**
     *
     */
    DEBUG_DRAW_DISABLE_LOD(19),
    /**
     *
     */
    DEBUG_DRAW_CLUSTER_OMNI_LIGHTS(20),
    /**
     *
     */
    DEBUG_DRAW_CLUSTER_SPOT_LIGHTS(21),
    /**
     *
     */
    DEBUG_DRAW_CLUSTER_DECALS(22),
    /**
     *
     */
    DEBUG_DRAW_CLUSTER_REFLECTION_PROBES(23),
    /**
     *
     */
    DEBUG_DRAW_OCCLUDERS(24),
    /**
     *
     */
    DEBUG_DRAW_MOTION_VECTORS(25),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class DefaultCanvasItemTextureFilter(
    id: Long,
  ) {
    /**
     * The texture filter reads from the nearest pixel only. The simplest and fastest method of filtering, but the texture will look pixelized.
     */
    DEFAULT_CANVAS_ITEM_TEXTURE_FILTER_NEAREST(0),
    /**
     * The texture filter blends between the nearest 4 pixels. Use this when you want to avoid a pixelated style, but do not want mipmaps.
     */
    DEFAULT_CANVAS_ITEM_TEXTURE_FILTER_LINEAR(1),
    /**
     * The texture filter reads from the nearest pixel in the nearest mipmap. The fastest way to read from textures with mipmaps.
     */
    DEFAULT_CANVAS_ITEM_TEXTURE_FILTER_LINEAR_WITH_MIPMAPS(2),
    /**
     * The texture filter blends between the nearest 4 pixels and between the nearest 2 mipmaps.
     */
    DEFAULT_CANVAS_ITEM_TEXTURE_FILTER_NEAREST_WITH_MIPMAPS(3),
    /**
     * Max value for [enum DefaultCanvasItemTextureFilter] enum.
     */
    DEFAULT_CANVAS_ITEM_TEXTURE_FILTER_MAX(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class DefaultCanvasItemTextureRepeat(
    id: Long,
  ) {
    /**
     * Disables textures repeating. Instead, when reading UVs outside the 0-1 range, the value will be clamped to the edge of the texture, resulting in a stretched out look at the borders of the texture.
     */
    DEFAULT_CANVAS_ITEM_TEXTURE_REPEAT_DISABLED(0),
    /**
     * Enables the texture to repeat when UV coordinates are outside the 0-1 range. If using one of the linear filtering modes, this can result in artifacts at the edges of a texture when the sampler filters across the edges of the texture.
     */
    DEFAULT_CANVAS_ITEM_TEXTURE_REPEAT_ENABLED(1),
    /**
     * Flip the texture when repeating so that the edge lines up instead of abruptly changing.
     */
    DEFAULT_CANVAS_ITEM_TEXTURE_REPEAT_MIRROR(2),
    /**
     * Max value for [enum DefaultCanvasItemTextureRepeat] enum.
     */
    DEFAULT_CANVAS_ITEM_TEXTURE_REPEAT_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class SDFOversize(
    id: Long,
  ) {
    /**
     *
     */
    SDF_OVERSIZE_100_PERCENT(0),
    /**
     *
     */
    SDF_OVERSIZE_120_PERCENT(1),
    /**
     *
     */
    SDF_OVERSIZE_150_PERCENT(2),
    /**
     *
     */
    SDF_OVERSIZE_200_PERCENT(3),
    /**
     *
     */
    SDF_OVERSIZE_MAX(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class SDFScale(
    id: Long,
  ) {
    /**
     *
     */
    SDF_SCALE_100_PERCENT(0),
    /**
     *
     */
    SDF_SCALE_50_PERCENT(1),
    /**
     *
     */
    SDF_SCALE_25_PERCENT(2),
    /**
     *
     */
    SDF_SCALE_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class VRSMode(
    id: Long,
  ) {
    /**
     * VRS is disabled.
     */
    VRS_DISABLED(0),
    /**
     * VRS uses a texture. Note, for stereoscopic use a texture atlas with a texture for each view.
     */
    VRS_TEXTURE(1),
    /**
     * VRS texture is supplied by the primary [godot.XRInterface].
     */
    VRS_XR(2),
    /**
     * Represents the size of the [enum VRSMode] enum.
     */
    VRS_MAX(3),
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
}
