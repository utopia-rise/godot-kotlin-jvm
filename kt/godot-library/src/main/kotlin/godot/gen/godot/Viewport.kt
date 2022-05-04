// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.RID
import godot.core.Rect2
import godot.core.TransferContext
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
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.signal
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Base class for viewports.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/586](https://godotengine.org/asset-library/asset/586)
 *
 * A Viewport creates a different view into the screen, or a sub-view inside another viewport. Children 2D Nodes will display on it, and children Camera3D 3D nodes will render on it too.
 *
 * Optionally, a viewport can have its own 2D or 3D world, so they don't share what they draw with other viewports.
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
      return TransferContext.readReturnValue(BOOL, false) as Boolean
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
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_USE_XR, NIL)
    }

  /**
   * If `true`, the viewport will process 3D audio streams.
   */
  public var audioListenerEnable3d: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_IS_AUDIO_LISTENER_3D,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_AS_AUDIO_LISTENER_3D,
          NIL)
    }

  /**
   * If `true`, the viewport will use the [godot.World3D] defined in [world3d].
   */
  public var ownWorld3d: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_IS_USING_OWN_WORLD_3D,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
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
      return TransferContext.readReturnValue(OBJECT, true) as World3D?
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
      return TransferContext.readReturnValue(OBJECT, true) as World2D?
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
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_TRANSPARENT_BACKGROUND, NIL)
    }

  /**
   *
   */
  public var handleInputLocally: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORT_IS_HANDLING_INPUT_LOCALLY, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
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
      return TransferContext.readReturnValue(BOOL, false) as Boolean
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
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_SNAP_2D_VERTICES_TO_PIXEL, NIL)
    }

  /**
   * The multisample anti-aliasing mode. A higher number results in smoother edges at the cost of significantly worse performance. A value of 2 or 4 is best unless targeting very high-end systems. See also bilinear scaling 3d [scaling3dMode] for supersampling, which provides higher quality but is much more expensive.
   */
  public var msaa: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_MSAA, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_MSAA, NIL)
    }

  /**
   * Sets the screen-space antialiasing method used. Screen-space antialiasing works by selectively blurring edges in a post-process shader. It differs from MSAA which takes multiple coverage samples while rendering objects. Screen-space AA methods are typically faster than MSAA and will smooth out specular aliasing, but tend to make scenes appear blurry.
   */
  public var screenSpaceAa: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_SCREEN_SPACE_AA,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_SCREEN_SPACE_AA, NIL)
    }

  /**
   *
   */
  public var useDebanding: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_IS_USING_DEBANDING, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_USE_DEBANDING, NIL)
    }

  /**
   * If `true`, [godot.OccluderInstance3D] nodes will be usable for occlusion culling in 3D for this viewport. For the root viewport, [godot.ProjectSettings.rendering/occlusionCulling/useOcclusionCulling] must be set to `true` instead.
   *
   * **Note:** Enabling occlusion culling has a cost on the CPU. Only enable occlusion culling if you actually plan to use it, and think whether your scene can actually benefit from occlusion culling. Large, open scenes with few or no objects blocking the view will generally not benefit much from occlusion culling. Large open scenes generally benefit more from mesh LOD and visibility ranges ([godot.GeometryInstance3D.visibilityRangeBegin] and [godot.GeometryInstance3D.visibilityRangeEnd]) compared to occlusion culling.
   */
  public var useOcclusionCulling: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORT_IS_USING_OCCLUSION_CULLING, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
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
  public var meshLodThreshold: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_MESH_LOD_THRESHOLD,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_MESH_LOD_THRESHOLD,
          NIL)
    }

  /**
   * The overlay mode for test rendered geometry in debug purposes.
   */
  public var debugDraw: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_DEBUG_DRAW, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_DEBUG_DRAW, NIL)
    }

  /**
   * Sets scaling 3d mode. Bilinear scaling renders at different resolution to either undersample or supersample the viewport. FidelityFX Super Resolution 1.0, abbreviated to FSR, is an upscaling technology that produces high quality images at fast framerates by using a spatially aware upscaling algorithm. FSR is slightly more expensive than bilinear, but it produces significantly higher image quality. FSR should be used where possible.
   *
   * To control this property on the root viewport, set the [godot.ProjectSettings.rendering/scaling3d/mode] project setting.
   */
  public var scaling3dMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_SCALING_3D_MODE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_SCALING_3D_MODE, NIL)
    }

  /**
   * Scales the 3D render buffer based on the viewport size uses an image filter specified in [godot.ProjectSettings.rendering/scaling3d/mode] to scale the output image to the full viewport size. Values lower than `1.0` can be used to speed up 3D rendering at the cost of quality (undersampling). Values greater than `1.0` are only valid for bilinear mode and can be used to improve 3D rendering quality at a high performance cost (supersampling). See also [godot.ProjectSettings.rendering/antiAliasing/quality/msaa] for multi-sample antialiasing, which is significantly cheaper but only smoothens the edges of polygons.
   *
   * When using FSR upscaling, AMD recommends exposing the following values as preset options to users "Ultra Quality: 0.77", "Quality: 0.67", "Balanced: 0.59", "Performance: 0.5" instead of exposing the entire scale.
   *
   * To control this property on the root viewport, set the [godot.ProjectSettings.rendering/scaling3d/scale] project setting.
   */
  public var scaling3dScale: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_SCALING_3D_SCALE,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_SCALING_3D_SCALE,
          NIL)
    }

  /**
   * Affects the final texture sharpness by reading from a lower or higher mipmap when using FSR. Mipmap bias does nothing when FSR is not being used. Negative values make textures sharper, while positive values make textures blurrier. This value is used to adjust the mipmap bias calculated internally which is based on the selected quality. The formula for this is `-log2(1.0 / scale) + mipmap_bias`. This updates the rendering server's mipmap bias when called
   *
   * To control this property on the root viewport, set the [godot.ProjectSettings.rendering/scaling3d/fsrMipmapBias] project setting.
   */
  public var fsrMipmapBias: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_FSR_MIPMAP_BIAS,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_FSR_MIPMAP_BIAS, NIL)
    }

  /**
   * Determines how sharp the upscaled image will be when using the FSR upscaling mode. Sharpness halves with every whole number. Values go from 0.0 (sharpest) to 2.0. Values above 2.0 won't make a visible difference.
   *
   * To control this property on the root viewport, set the [godot.ProjectSettings.rendering/scaling3d/fsrSharpness] project setting.
   */
  public var fsrSharpness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_FSR_SHARPNESS,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_FSR_SHARPNESS, NIL)
    }

  /**
   * Sets the default filter mode used by [godot.CanvasItem]s in this Viewport. See [enum DefaultCanvasItemTextureFilter] for options.
   */
  public var canvasItemDefaultTextureFilter: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_DEFAULT_CANVAS_ITEM_TEXTURE_FILTER, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_DEFAULT_CANVAS_ITEM_TEXTURE_FILTER, NIL)
    }

  /**
   * Sets the default repeat mode used by [godot.CanvasItem]s in this Viewport. See [enum DefaultCanvasItemTextureRepeat] for options.
   */
  public var canvasItemDefaultTextureRepeat: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_DEFAULT_CANVAS_ITEM_TEXTURE_REPEAT, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
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
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_AS_AUDIO_LISTENER_2D,
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
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_PHYSICS_OBJECT_PICKING, NIL)
    }

  /**
   * If `true`, the viewport will not receive input events.
   */
  public var guiDisableInput: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_IS_INPUT_DISABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
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
      return TransferContext.readReturnValue(BOOL, false) as Boolean
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
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_EMBEDDING_SUBWINDOWS,
          NIL)
    }

  /**
   *
   */
  public var sdfOversize: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_SDF_OVERSIZE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_SDF_OVERSIZE, NIL)
    }

  /**
   *
   */
  public var sdfScale: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_SDF_SCALE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_SDF_SCALE, NIL)
    }

  /**
   * The shadow atlas' resolution (used for omni and spot lights). The value will be rounded up to the nearest power of 2.
   *
   * **Note:** If this is set to 0, shadows won't be visible.
   */
  public var shadowAtlasSize: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_SHADOW_ATLAS_SIZE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_SHADOW_ATLAS_SIZE,
          NIL)
    }

  /**
   *
   */
  public var shadowAtlas16Bits: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_SHADOW_ATLAS_16_BITS,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_SHADOW_ATLAS_16_BITS,
          NIL)
    }

  /**
   * The subdivision amount of the first quadrant on the shadow atlas.
   */
  public val shadowAtlasQuad0: Long
    get() {
      TransferContext.writeArguments(LONG to 0)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_SHADOW_ATLAS_QUADRANT_SUBDIV, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }

  /**
   * The subdivision amount of the second quadrant on the shadow atlas.
   */
  public val shadowAtlasQuad1: Long
    get() {
      TransferContext.writeArguments(LONG to 1)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_SHADOW_ATLAS_QUADRANT_SUBDIV, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }

  /**
   * The subdivision amount of the third quadrant on the shadow atlas.
   */
  public val shadowAtlasQuad2: Long
    get() {
      TransferContext.writeArguments(LONG to 2)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_SHADOW_ATLAS_QUADRANT_SUBDIV, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }

  /**
   * The subdivision amount of the fourth quadrant on the shadow atlas.
   */
  public val shadowAtlasQuad3: Long
    get() {
      TransferContext.writeArguments(LONG to 3)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_SHADOW_ATLAS_QUADRANT_SUBDIV, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }

  /**
   * The canvas transform of the viewport, useful for changing the on-screen positions of all child [godot.CanvasItem]s. This is relative to the global canvas transform of the viewport.
   */
  public var canvasTransform: Transform2D
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_CANVAS_TRANSFORM,
          TRANSFORM2D)
      return TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D
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
      return TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D
    }
    set(`value`) {
      TransferContext.writeArguments(TRANSFORM2D to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_GLOBAL_CANVAS_TRANSFORM, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_VIEWPORT)
  }

  /**
   * Returns the first valid [godot.World2D] for this viewport, searching the [world2d] property of itself and any Viewport ancestor.
   */
  public fun findWorld2d(): World2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_FIND_WORLD_2D, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as World2D?
  }

  /**
   * Returns the total transform of the viewport.
   */
  public fun getFinalTransform(): Transform2D {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_FINAL_TRANSFORM,
        TRANSFORM2D)
    return TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D
  }

  /**
   * Returns the visible rectangle in global screen coordinates.
   */
  public fun getVisibleRect(): Rect2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_VISIBLE_RECT, RECT2)
    return TransferContext.readReturnValue(RECT2, false) as Rect2
  }

  /**
   *
   */
  public fun getRenderInfo(type: Viewport.RenderInfoType, info: Viewport.RenderInfo): Long {
    TransferContext.writeArguments(LONG to type.id, LONG to info.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_RENDER_INFO, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the viewport's texture.
   *
   * **Note:** Due to the way OpenGL works, the resulting [godot.ViewportTexture] is flipped vertically. You can use [godot.Image.flipY] on the result of [godot.Texture2D.getImage] to flip it back, for example:
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * var img = get_viewport().get_texture().get_image()
   *
   * img.flip_y()
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * Image img = GetViewport().GetTexture().GetImage();
   *
   * img.FlipY();
   *
   * [/csharp]
   *
   * [/codeblocks]
   */
  public fun getTexture(): ViewportTexture? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_TEXTURE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as ViewportTexture?
  }

  /**
   * Returns the viewport's RID from the [godot.RenderingServer].
   */
  public fun getViewportRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_VIEWPORT_RID, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Returns `true` if the viewport is currently embedding windows.
   */
  public fun pushTextInput(text: String): Unit {
    TransferContext.writeArguments(STRING to text)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_PUSH_TEXT_INPUT, NIL)
  }

  /**
   *
   */
  public fun pushInput(event: InputEvent, inLocalCoords: Boolean = false): Unit {
    TransferContext.writeArguments(OBJECT to event, BOOL to inLocalCoords)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_PUSH_INPUT, NIL)
  }

  /**
   *
   */
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
    return TransferContext.readReturnValue(OBJECT, true) as Camera2D?
  }

  /**
   * Returns the mouse's position in this [godot.Viewport] using the coordinate system of this [godot.Viewport].
   */
  public fun getMousePosition(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_MOUSE_POSITION,
        VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Moves the mouse pointer to the specified position in this [godot.Viewport] using the coordinate system of this [godot.Viewport].
   */
  public fun warpMouse(position: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_WARP_MOUSE, NIL)
  }

  /**
   * Returns the drag data from the GUI, that was previously returned by [godot.Control.GetDragData].
   */
  public fun guiGetDragData(): Any? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GUI_GET_DRAG_DATA, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Returns `true` if the viewport is currently performing a drag operation.
   *
   * Alternative to [godot.Node.NOTIFICATION_DRAG_BEGIN] and [godot.Node.NOTIFICATION_DRAG_END] when you prefer polling the value.
   */
  public fun guiIsDragging(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GUI_IS_DRAGGING, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the drag operation is successful.
   */
  public fun guiIsDragSuccessful(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GUI_IS_DRAG_SUCCESSFUL,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
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
    return TransferContext.readReturnValue(OBJECT, true) as Control?
  }

  /**
   * Sets the number of subdivisions to use in the specified quadrant. A higher number of subdivisions allows you to have more shadows in the scene at once, but reduces the quality of the shadows. A good practice is to have quadrants with a varying number of subdivisions and to have as few subdivisions as possible.
   */
  public fun setShadowAtlasQuadrantSubdiv(quadrant: Long,
      subdiv: Viewport.ShadowAtlasQuadrantSubdiv): Unit {
    TransferContext.writeArguments(LONG to quadrant, LONG to subdiv.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_SHADOW_ATLAS_QUADRANT_SUBDIV, NIL)
  }

  /**
   * Stops the input from propagating further down the [godot.SceneTree].
   */
  public fun setInputAsHandled(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_INPUT_AS_HANDLED, NIL)
  }

  /**
   *
   */
  public fun isInputHandled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_IS_INPUT_HANDLED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the first valid [godot.World3D] for this viewport, searching the [world3d] property of itself and any Viewport ancestor.
   */
  public fun findWorld3d(): World3D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_FIND_WORLD_3D, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as World3D?
  }

  /**
   * Returns the currently active 3D camera.
   */
  public fun getCamera3d(): Camera3D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_CAMERA_3D, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Camera3D?
  }

  public enum class SDFOversize(
    id: Long
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class RenderInfo(
    id: Long
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class SDFScale(
    id: Long
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class DebugDraw(
    id: Long
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
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class Scaling3DMode(
    id: Long
  ) {
    /**
     * Use bilinear scaling for the viewport's 3D buffer. The amount of scaling can be set using [scaling3dScale]. Values less then `1.0` will result in undersampling while values greater than `1.0` will result in supersampling. A value of `1.0` disables scaling.
     */
    SCALING_3D_MODE_BILINEAR(0),
    /**
     * Use AMD FidelityFX Super Resolution 1.0 upscaling for the viewport's 3D buffer. The amount of scaling can be set using [scaling3dScale]. Values less then `1.0` will be result in the viewport being upscaled using FSR. Values greater than `1.0` are not supported and bilinear downsampling will be used instead. A value of `1.0` disables scaling.
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class RenderInfoType(
    id: Long
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class ScreenSpaceAA(
    id: Long
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class DefaultCanvasItemTextureFilter(
    id: Long
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class ShadowAtlasQuadrantSubdiv(
    id: Long
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
     * This quadrant will be split 256 ways and used by up to 256 shadow maps. Unless the [shadowAtlasSize] is very high, the shadows in this quadrant will be very low resolution.
     */
    SHADOW_ATLAS_QUADRANT_SUBDIV_256(5),
    /**
     * This quadrant will be split 1024 ways and used by up to 1024 shadow maps. Unless the [shadowAtlasSize] is very high, the shadows in this quadrant will be very low resolution.
     */
    SHADOW_ATLAS_QUADRANT_SUBDIV_1024(6),
    /**
     * Represents the size of the [enum ShadowAtlasQuadrantSubdiv] enum.
     */
    SHADOW_ATLAS_QUADRANT_SUBDIV_MAX(7),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class DefaultCanvasItemTextureRepeat(
    id: Long
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class MSAA(
    id: Long
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object
}
