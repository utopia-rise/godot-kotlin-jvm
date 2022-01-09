// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.CoreTypeHelper
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
 * Creates a sub-view into the screen.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/586](https://godotengine.org/asset-library/asset/586)
 *
 * A Viewport creates a different view into the screen, or a sub-view inside another viewport. Children 2D Nodes will display on it, and children Camera 3D nodes will render on it too.
 *
 * Optionally, a viewport can have its own 2D or 3D world, so they don't share what they draw with other viewports.
 *
 * If a viewport is a child of a [godot.ViewportContainer], it will automatically take up its size, otherwise it must be set manually.
 *
 * Viewports can also choose to be audio listeners, so they generate positional audio depending on a 2D or 3D camera child of it.
 *
 * Also, viewports can be assigned to different screens in case the devices have multiple screens.
 *
 * Finally, viewports can also behave as render targets, in which case they will not be visible unless the associated texture is used to draw.
 *
 * **Note:** By default, a newly created Viewport in Godot 3.x will appear to be upside down. Enabling [renderTargetVFlip] will display the Viewport with the correct orientation.
 */
@GodotBaseType
public open class Viewport : Node() {
  /**
   * Emitted when a Control node grabs keyboard focus.
   */
  public val guiFocusChanged: Signal1<Control> by signal("node")

  /**
   * Emitted when the size of the viewport is changed, whether by [setSizeOverride], resize of window, or some other means.
   */
  public val sizeChanged: Signal0 by signal()

  /**
   * If `true`, the viewport will be used in AR/VR process.
   */
  public open var arvr: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_ARVR, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_ARVR, NIL)
    }

  /**
   * If `true`, the viewport will process 2D audio streams.
   */
  public open var audioListenerEnable2d: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_AUDIO_LISTENER_ENABLE_2D, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_AUDIO_LISTENER_ENABLE_2D, NIL)
    }

  /**
   * If `true`, the viewport will process 3D audio streams.
   */
  public open var audioListenerEnable3d: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_AUDIO_LISTENER_ENABLE_3D, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_AUDIO_LISTENER_ENABLE_3D, NIL)
    }

  /**
   * The canvas transform of the viewport, useful for changing the on-screen positions of all child [godot.CanvasItem]s. This is relative to the global canvas transform of the viewport.
   */
  public open var canvasTransform: Transform2D
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
   * If `true`, uses a fast post-processing filter to make banding significantly less visible. In some cases, debanding may introduce a slightly noticeable dithering pattern. It's recommended to enable debanding only when actually needed since the dithering pattern will make lossless-compressed screenshots larger.
   *
   * **Note:** Only available on the GLES3 backend. [hdr] must also be `true` for debanding to be effective.
   */
  public open var debanding: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_DEBANDING, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_DEBANDING, NIL)
    }

  /**
   * The overlay mode for test rendered geometry in debug purposes.
   */
  public open var debugDraw: Long
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
   * If `true`, the viewport will disable 3D rendering. For actual disabling use `usage`.
   */
  public open var disable3d: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_DISABLE_3D, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_DISABLE_3D, NIL)
    }

  /**
   * Enables fast approximate antialiasing. FXAA is a popular screen-space antialiasing method, which is fast but will make the image look blurry, especially at lower resolutions. It can still work relatively well at large resolutions such as 1440p and 4K. Some of the lost sharpness can be recovered by enabling contrast-adaptive sharpening (see [sharpenIntensity]).
   */
  public open var fxaa: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_FXAA, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_FXAA, NIL)
    }

  /**
   * The global canvas transform of the viewport. The canvas transform is relative to this.
   */
  public open var globalCanvasTransform: Transform2D
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

  /**
   * If `true`, the viewport will not receive input events.
   */
  public open var guiDisableInput: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_GUI_DISABLE_INPUT,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_GUI_DISABLE_INPUT,
          NIL)
    }

  /**
   * If `true`, the GUI controls on the viewport will lay pixel perfectly.
   */
  public open var guiSnapControlsToPixels: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_GUI_SNAP_CONTROLS_TO_PIXELS, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_GUI_SNAP_CONTROLS_TO_PIXELS, NIL)
    }

  /**
   *
   */
  public open var handleInputLocally: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_HANDLE_INPUT_LOCALLY,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_HANDLE_INPUT_LOCALLY,
          NIL)
    }

  /**
   * If `true`, the viewport rendering will receive benefits from High Dynamic Range algorithm. High Dynamic Range allows the viewport to receive values that are outside the 0-1 range. In Godot HDR uses 16 bits, meaning it does not store the full range of a floating point number.
   *
   * **Note:** Requires [usage] to be set to [godot.USAGE_3D] or [godot.USAGE_3D_NO_EFFECTS], since HDR is not supported for 2D.
   */
  public open var hdr: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_HDR, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_HDR, NIL)
    }

  /**
   * If `true`, the result after 3D rendering will not have a linear to sRGB color conversion applied. This is important when the viewport is used as a render target where the result is used as a texture on a 3D object rendered in another viewport. It is also important if the viewport is used to create data that is not color based (noise, heightmaps, pickmaps, etc.). Do not enable this when the viewport is used as a texture on a 2D object or if the viewport is your final output. For the GLES2 driver this will convert the sRGB output to linear, this should only be used for VR plugins that require input in linear color space!
   */
  public open var keep3dLinear: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_KEEP_3D_LINEAR, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_KEEP_3D_LINEAR, NIL)
    }

  /**
   * The multisample anti-aliasing mode. A higher number results in smoother edges at the cost of significantly worse performance. A value of 4 is best unless targeting very high-end systems.
   */
  public open var msaa: Long
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
   * If `true`, the viewport will use [godot.World] defined in `world` property.
   */
  public open var ownWorld: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_OWN_WORLD, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_OWN_WORLD, NIL)
    }

  /**
   * If `true`, the objects rendered by viewport become subjects of mouse picking process.
   */
  public open var physicsObjectPicking: Boolean
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
   * If `true`, renders the Viewport directly to the screen instead of to the root viewport. Only available in GLES2. This is a low-level optimization and should not be used in most cases. If used, reading from the Viewport or from `SCREEN_TEXTURE` becomes unavailable. For more information see [godot.VisualServer.viewportSetRenderDirectToScreen].
   */
  public open var renderDirectToScreen: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_RENDER_DIRECT_TO_SCREEN, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_RENDER_DIRECT_TO_SCREEN, NIL)
    }

  /**
   * The clear mode when viewport used as a render target.
   *
   * **Note:** This property is intended for 2D usage.
   */
  public open var renderTargetClearMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_RENDER_TARGET_CLEAR_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_RENDER_TARGET_CLEAR_MODE, NIL)
    }

  /**
   * The update mode when viewport used as a render target.
   */
  public open var renderTargetUpdateMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_RENDER_TARGET_UPDATE_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_RENDER_TARGET_UPDATE_MODE, NIL)
    }

  /**
   * If `true`, the result of rendering will be flipped vertically. Since Viewports in Godot 3.x render upside-down, it's recommended to set this to `true` in most situations.
   */
  public open var renderTargetVFlip: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_RENDER_TARGET_V_FLIP,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_RENDER_TARGET_V_FLIP,
          NIL)
    }

  /**
   * The subdivision amount of the first quadrant on the shadow atlas.
   */
  public open var shadowAtlasQuad0: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_SHADOW_ATLAS_QUAD_0,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_SHADOW_ATLAS_QUAD_0,
          NIL)
    }

  /**
   * The subdivision amount of the second quadrant on the shadow atlas.
   */
  public open var shadowAtlasQuad1: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_SHADOW_ATLAS_QUAD_1,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_SHADOW_ATLAS_QUAD_1,
          NIL)
    }

  /**
   * The subdivision amount of the third quadrant on the shadow atlas.
   */
  public open var shadowAtlasQuad2: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_SHADOW_ATLAS_QUAD_2,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_SHADOW_ATLAS_QUAD_2,
          NIL)
    }

  /**
   * The subdivision amount of the fourth quadrant on the shadow atlas.
   */
  public open var shadowAtlasQuad3: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_SHADOW_ATLAS_QUAD_3,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_SHADOW_ATLAS_QUAD_3,
          NIL)
    }

  /**
   * The shadow atlas' resolution (used for omni and spot lights). The value will be rounded up to the nearest power of 2.
   *
   * **Note:** If this is set to 0, shadows won't be visible. Since user-created viewports default to a value of 0, this value must be set above 0 manually.
   */
  public open var shadowAtlasSize: Long
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
   * If set to a value greater than `0.0`, contrast-adaptive sharpening will be applied to the 3D viewport. This has a low performance cost and can be used to recover some of the sharpness lost from using FXAA. Values around `0.5` generally give the best results. See also [fxaa].
   */
  public open var sharpenIntensity: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_SHARPEN_INTENSITY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_SHARPEN_INTENSITY,
          NIL)
    }

  /**
   * The width and height of viewport. Must be set to a value greater than or equal to 2 pixels on both dimensions. Otherwise, nothing will be displayed.
   */
  public open var size: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_SIZE, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_SIZE, NIL)
    }

  /**
   * If `true`, the size override affects stretch as well.
   */
  public open var sizeOverrideStretch: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_SIZE_OVERRIDE_STRETCH, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_SIZE_OVERRIDE_STRETCH, NIL)
    }

  /**
   * If `true`, the viewport should render its background as transparent.
   */
  public open var transparentBg: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_TRANSPARENT_BG, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_TRANSPARENT_BG, NIL)
    }

  /**
   * The rendering mode of viewport.
   */
  public open var usage: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_USAGE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_USAGE, NIL)
    }

  /**
   * The custom [godot.World] which can be used as 3D environment source.
   */
  public open var world: World?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_WORLD, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as World?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_WORLD, NIL)
    }

  /**
   * The custom [godot.World2D] which can be used as 2D environment source.
   */
  public open var world2d: World2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_WORLD_2D, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as World2D?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_WORLD_2D, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_VIEWPORT)
  }

  @CoreTypeHelper
  public open fun canvasTransform(schedule: Transform2D.() -> Unit): Transform2D =
      canvasTransform.apply{
      schedule(this)
      canvasTransform = this
  }


  @CoreTypeHelper
  public open fun globalCanvasTransform(schedule: Transform2D.() -> Unit): Transform2D =
      globalCanvasTransform.apply{
      schedule(this)
      globalCanvasTransform = this
  }


  @CoreTypeHelper
  public open fun size(schedule: Vector2.() -> Unit): Vector2 = size.apply{
      schedule(this)
      size = this
  }


  public open fun _guiRemoveFocus(): Unit {
  }

  public open fun _guiShowTooltip(): Unit {
  }

  public open fun _ownWorldChanged(): Unit {
  }

  public open fun _postGuiGrabClickFocus(): Unit {
  }

  public open fun _processPicking(ignorePaused: Boolean): Unit {
  }

  public open fun _subwindowVisibilityChanged(): Unit {
  }

  public open fun _vpInput(arg0: InputEvent): Unit {
  }

  public open fun _vpInputText(text: String): Unit {
  }

  public open fun _vpUnhandledInput(arg0: InputEvent): Unit {
  }

  /**
   * Returns the first valid [godot.World] for this viewport, searching the [world] property of itself and any Viewport ancestor.
   */
  public open fun findWorld(): World? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_FIND_WORLD, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as World?
  }

  /**
   * Returns the first valid [godot.World2D] for this viewport, searching the [world2d] property of itself and any Viewport ancestor.
   */
  public open fun findWorld2d(): World2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_FIND_WORLD_2D, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as World2D?
  }

  /**
   * Returns the active 3D camera.
   */
  public open fun getCamera(): Camera? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_CAMERA, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Camera?
  }

  /**
   * Returns the total transform of the viewport.
   */
  public open fun getFinalTransform(): Transform2D {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_FINAL_TRANSFORM,
        TRANSFORM2D)
    return TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D
  }

  /**
   * Returns the topmost modal in the stack.
   */
  public open fun getModalStackTop(): Control? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_MODAL_STACK_TOP,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Control?
  }

  /**
   * Returns the mouse position relative to the viewport.
   */
  public open fun getMousePosition(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_MOUSE_POSITION,
        VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns information about the viewport from the rendering pipeline.
   */
  public open fun getRenderInfo(info: Long): Long {
    TransferContext.writeArguments(LONG to info)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_RENDER_INFO, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the size override set with [setSizeOverride].
   */
  public open fun getSizeOverride(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_SIZE_OVERRIDE, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the viewport's texture.
   *
   * **Note:** Due to the way OpenGL works, the resulting [godot.ViewportTexture] is flipped vertically. You can use [godot.Image.flipY] on the result of [godot.Texture.getData] to flip it back, for example:
   *
   * ```
   * 				var img = get_viewport().get_texture().get_data()
   * 				img.flip_y()
   * 				```
   */
  public open fun getTexture(): ViewportTexture? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_TEXTURE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as ViewportTexture?
  }

  /**
   * Returns the viewport's RID from the [godot.VisualServer].
   */
  public open fun getViewportRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_VIEWPORT_RID, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Returns the visible rectangle in global screen coordinates.
   */
  public open fun getVisibleRect(): Rect2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_VISIBLE_RECT, RECT2)
    return TransferContext.readReturnValue(RECT2, false) as Rect2
  }

  /**
   * Returns the drag data from the GUI, that was previously returned by [godot.Control.getDragData].
   */
  public open fun guiGetDragData(): Any? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GUI_GET_DRAG_DATA, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Returns `true` if there are visible modals on-screen.
   */
  public open fun guiHasModalStack(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GUI_HAS_MODAL_STACK, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the viewport is currently performing a drag operation.
   */
  public open fun guiIsDragging(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GUI_IS_DRAGGING, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   *
   */
  public open fun input(localEvent: InputEvent): Unit {
    TransferContext.writeArguments(OBJECT to localEvent)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_INPUT, NIL)
  }

  /**
   *
   */
  public open fun isInputHandled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_IS_INPUT_HANDLED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the size override is enabled. See [setSizeOverride].
   */
  public open fun isSizeOverrideEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_IS_SIZE_OVERRIDE_ENABLED,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Attaches this [godot.Viewport] to the root [godot.Viewport] with the specified rectangle. This bypasses the need for another node to display this [godot.Viewport] but makes you responsible for updating the position of this [godot.Viewport] manually.
   */
  public open fun setAttachToScreenRect(rect: Rect2): Unit {
    TransferContext.writeArguments(RECT2 to rect)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_ATTACH_TO_SCREEN_RECT,
        NIL)
  }

  /**
   * Stops the input from propagating further down the [godot.SceneTree].
   */
  public open fun setInputAsHandled(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_INPUT_AS_HANDLED, NIL)
  }

  /**
   * Sets the size override of the viewport. If the `enable` parameter is `true` the override is used, otherwise it uses the default size. If the size parameter is `(-1, -1)`, it won't update the size.
   */
  public open fun setSizeOverride(
    enable: Boolean,
    size: Vector2 = Vector2(-1.0, -1.0),
    margin: Vector2 = Vector2(0.0, 0.0)
  ): Unit {
    TransferContext.writeArguments(BOOL to enable, VECTOR2 to size, VECTOR2 to margin)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_SIZE_OVERRIDE, NIL)
  }

  /**
   *
   */
  public open fun unhandledInput(localEvent: InputEvent): Unit {
    TransferContext.writeArguments(OBJECT to localEvent)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_UNHANDLED_INPUT, NIL)
  }

  /**
   * Forces update of the 2D and 3D worlds.
   */
  public open fun updateWorlds(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_UPDATE_WORLDS, NIL)
  }

  /**
   * Warps the mouse to a position relative to the viewport.
   */
  public open fun warpMouse(toPosition: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to toPosition)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_WARP_MOUSE, NIL)
  }

  public enum class ClearMode(
    id: Long
  ) {
    /**
     * Always clear the render target before drawing.
     */
    CLEAR_MODE_ALWAYS(0),
    /**
     * Never clear the render target.
     */
    CLEAR_MODE_NEVER(1),
    /**
     * Clear the render target next frame, then switch to [CLEAR_MODE_NEVER].
     */
    CLEAR_MODE_ONLY_NEXT_FRAME(2),
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
    RENDER_INFO_VERTICES_IN_FRAME(1),
    /**
     * Amount of material changes in frame.
     */
    RENDER_INFO_MATERIAL_CHANGES_IN_FRAME(2),
    /**
     * Amount of shader changes in frame.
     */
    RENDER_INFO_SHADER_CHANGES_IN_FRAME(3),
    /**
     * Amount of surface changes in frame.
     */
    RENDER_INFO_SURFACE_CHANGES_IN_FRAME(4),
    /**
     * Amount of draw calls in frame.
     */
    RENDER_INFO_DRAW_CALLS_IN_FRAME(5),
    /**
     * Amount of items or joined items in frame.
     */
    RENDER_INFO_2D_ITEMS_IN_FRAME(6),
    /**
     * Amount of draw calls in frame.
     */
    RENDER_INFO_2D_DRAW_CALLS_IN_FRAME(7),
    /**
     * Represents the size of the [enum RenderInfo] enum.
     */
    RENDER_INFO_MAX(8),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class Usage(
    id: Long
  ) {
    /**
     * Allocates all buffers needed for drawing 2D scenes. This takes less VRAM than the 3D usage modes. Note that 3D rendering effects such as glow and HDR are not available when using this mode.
     */
    USAGE_2D(0),
    /**
     * Allocates buffers needed for 2D scenes without allocating a buffer for screen copy. Accordingly, you cannot read from the screen. Of the [enum Usage] types, this requires the least VRAM. Note that 3D rendering effects such as glow and HDR are not available when using this mode.
     */
    USAGE_2D_NO_SAMPLING(1),
    /**
     * Allocates full buffers for drawing 3D scenes and all 3D effects including buffers needed for 2D scenes and effects.
     */
    USAGE_3D(2),
    /**
     * Allocates buffers needed for drawing 3D scenes. But does not allocate buffers needed for reading from the screen and post-processing effects. Saves some VRAM.
     */
    USAGE_3D_NO_EFFECTS(3),
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
     * Objected are displayed semi-transparent with additive blending so you can see where they intersect.
     */
    DEBUG_DRAW_OVERDRAW(2),
    /**
     * Objects are displayed in wireframe style.
     */
    DEBUG_DRAW_WIREFRAME(3),
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

  public enum class UpdateMode(
    id: Long
  ) {
    /**
     * Do not update the render target.
     */
    UPDATE_DISABLED(0),
    /**
     * Update the render target once, then switch to [UPDATE_DISABLED].
     */
    UPDATE_ONCE(1),
    /**
     * Update the render target only when it is visible. This is the default value.
     */
    UPDATE_WHEN_VISIBLE(2),
    /**
     * Always update the render target.
     */
    UPDATE_ALWAYS(3),
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
     * Multisample anti-aliasing mode disabled. This is the default value.
     */
    MSAA_DISABLED(0),
    /**
     * Use 2x Multisample Antialiasing.
     */
    MSAA_2X(1),
    /**
     * Use 4x Multisample Antialiasing.
     */
    MSAA_4X(2),
    /**
     * Use 8x Multisample Antialiasing. Likely unsupported on low-end and older hardware.
     */
    MSAA_8X(3),
    /**
     * Use 16x Multisample Antialiasing. Likely unsupported on medium and low-end hardware.
     */
    MSAA_16X(4),
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
     * Always clear the render target before drawing.
     */
    public final const val CLEAR_MODE_ALWAYS: Long = 0

    /**
     * Never clear the render target.
     */
    public final const val CLEAR_MODE_NEVER: Long = 1

    /**
     * Clear the render target next frame, then switch to [CLEAR_MODE_NEVER].
     */
    public final const val CLEAR_MODE_ONLY_NEXT_FRAME: Long = 2

    /**
     * Objects are displayed normally.
     */
    public final const val DEBUG_DRAW_DISABLED: Long = 0

    /**
     * Objected are displayed semi-transparent with additive blending so you can see where they intersect.
     */
    public final const val DEBUG_DRAW_OVERDRAW: Long = 2

    /**
     * Objects are displayed without light information.
     */
    public final const val DEBUG_DRAW_UNSHADED: Long = 1

    /**
     * Objects are displayed in wireframe style.
     */
    public final const val DEBUG_DRAW_WIREFRAME: Long = 3

    /**
     * Use 16x Multisample Antialiasing. Likely unsupported on medium and low-end hardware.
     */
    public final const val MSAA_16X: Long = 4

    /**
     * Use 2x Multisample Antialiasing.
     */
    public final const val MSAA_2X: Long = 1

    /**
     * Use 4x Multisample Antialiasing.
     */
    public final const val MSAA_4X: Long = 2

    /**
     * Use 8x Multisample Antialiasing. Likely unsupported on low-end and older hardware.
     */
    public final const val MSAA_8X: Long = 3

    /**
     * Multisample anti-aliasing mode disabled. This is the default value.
     */
    public final const val MSAA_DISABLED: Long = 0

    /**
     * Amount of draw calls in frame.
     */
    public final const val RENDER_INFO_2D_DRAW_CALLS_IN_FRAME: Long = 7

    /**
     * Amount of items or joined items in frame.
     */
    public final const val RENDER_INFO_2D_ITEMS_IN_FRAME: Long = 6

    /**
     * Amount of draw calls in frame.
     */
    public final const val RENDER_INFO_DRAW_CALLS_IN_FRAME: Long = 5

    /**
     * Amount of material changes in frame.
     */
    public final const val RENDER_INFO_MATERIAL_CHANGES_IN_FRAME: Long = 2

    /**
     * Represents the size of the [enum RenderInfo] enum.
     */
    public final const val RENDER_INFO_MAX: Long = 8

    /**
     * Amount of objects in frame.
     */
    public final const val RENDER_INFO_OBJECTS_IN_FRAME: Long = 0

    /**
     * Amount of shader changes in frame.
     */
    public final const val RENDER_INFO_SHADER_CHANGES_IN_FRAME: Long = 3

    /**
     * Amount of surface changes in frame.
     */
    public final const val RENDER_INFO_SURFACE_CHANGES_IN_FRAME: Long = 4

    /**
     * Amount of vertices in frame.
     */
    public final const val RENDER_INFO_VERTICES_IN_FRAME: Long = 1

    /**
     * This quadrant will only be used by one shadow map.
     */
    public final const val SHADOW_ATLAS_QUADRANT_SUBDIV_1: Long = 1

    /**
     * This quadrant will be split 1024 ways and used by up to 1024 shadow maps. Unless the [shadowAtlasSize] is very high, the shadows in this quadrant will be very low resolution.
     */
    public final const val SHADOW_ATLAS_QUADRANT_SUBDIV_1024: Long = 6

    /**
     * This quadrant will be split 16 ways and used by up to 16 shadow maps.
     */
    public final const val SHADOW_ATLAS_QUADRANT_SUBDIV_16: Long = 3

    /**
     * This quadrant will be split 256 ways and used by up to 256 shadow maps. Unless the [shadowAtlasSize] is very high, the shadows in this quadrant will be very low resolution.
     */
    public final const val SHADOW_ATLAS_QUADRANT_SUBDIV_256: Long = 5

    /**
     * This quadrant will be split in 4 and used by up to 4 shadow maps.
     */
    public final const val SHADOW_ATLAS_QUADRANT_SUBDIV_4: Long = 2

    /**
     * This quadrant will be split 64 ways and used by up to 64 shadow maps.
     */
    public final const val SHADOW_ATLAS_QUADRANT_SUBDIV_64: Long = 4

    /**
     * This quadrant will not be used.
     */
    public final const val SHADOW_ATLAS_QUADRANT_SUBDIV_DISABLED: Long = 0

    /**
     * Represents the size of the [enum ShadowAtlasQuadrantSubdiv] enum.
     */
    public final const val SHADOW_ATLAS_QUADRANT_SUBDIV_MAX: Long = 7

    /**
     * Always update the render target.
     */
    public final const val UPDATE_ALWAYS: Long = 3

    /**
     * Do not update the render target.
     */
    public final const val UPDATE_DISABLED: Long = 0

    /**
     * Update the render target once, then switch to [UPDATE_DISABLED].
     */
    public final const val UPDATE_ONCE: Long = 1

    /**
     * Update the render target only when it is visible. This is the default value.
     */
    public final const val UPDATE_WHEN_VISIBLE: Long = 2

    /**
     * Allocates all buffers needed for drawing 2D scenes. This takes less VRAM than the 3D usage modes. Note that 3D rendering effects such as glow and HDR are not available when using this mode.
     */
    public final const val USAGE_2D: Long = 0

    /**
     * Allocates buffers needed for 2D scenes without allocating a buffer for screen copy. Accordingly, you cannot read from the screen. Of the [enum Usage] types, this requires the least VRAM. Note that 3D rendering effects such as glow and HDR are not available when using this mode.
     */
    public final const val USAGE_2D_NO_SAMPLING: Long = 1

    /**
     * Allocates full buffers for drawing 3D scenes and all 3D effects including buffers needed for 2D scenes and effects.
     */
    public final const val USAGE_3D: Long = 2

    /**
     * Allocates buffers needed for drawing 3D scenes. But does not allocate buffers needed for reading from the screen and post-processing effects. Saves some VRAM.
     */
    public final const val USAGE_3D_NO_EFFECTS: Long = 3
  }
}
