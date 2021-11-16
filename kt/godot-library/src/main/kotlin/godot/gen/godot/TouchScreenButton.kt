// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Button for touch screen devices for gameplay use.
 *
 * TouchScreenButton allows you to create on-screen buttons for touch devices. It's intended for gameplay use, such as a unit you have to touch to move. Unlike [godot.Button], TouchScreenButton supports multitouch out of the box. Several TouchScreenButtons can be pressed at the same time with touch input.
 *
 * This node inherits from [godot.Node2D]. Unlike with [godot.Control] nodes, you cannot set anchors on it. If you want to create menus or user interfaces, you may want to use [godot.Button] nodes instead. To make button nodes react to touch events, you can enable the Emulate Mouse option in the Project Settings.
 *
 * You can configure TouchScreenButton to be visible only on touch devices, helping you develop your game both for desktop and mobile devices.
 */
@GodotBaseType
public open class TouchScreenButton : Node2D() {
  public val signalPressed: Signal0 by signal()

  /**
   * Emitted when the button is released (up).
   */
  public val released: Signal0 by signal()

  /**
   * The button's action. Actions can be handled with [godot.InputEventAction].
   */
  public open var action: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TOUCHSCREENBUTTON_GET_ACTION,
          STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TOUCHSCREENBUTTON_SET_ACTION, NIL)
    }

  /**
   * The button's bitmask.
   */
  public open var bitmask: BitMap?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TOUCHSCREENBUTTON_GET_BITMASK,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as BitMap?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TOUCHSCREENBUTTON_SET_BITMASK,
          NIL)
    }

  /**
   * The button's texture for the normal state.
   */
  public open var normal: Texture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TOUCHSCREENBUTTON_GET_NORMAL,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TOUCHSCREENBUTTON_SET_NORMAL, NIL)
    }

  /**
   * If `true`, the [pressed] and [released] signals are emitted whenever a pressed finger goes in and out of the button, even if the pressure started outside the active area of the button.
   *
   * **Note:** This is a "pass-by" (not "bypass") press mode.
   */
  public open var passbyPress: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TOUCHSCREENBUTTON_GET_PASSBY_PRESS, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TOUCHSCREENBUTTON_SET_PASSBY_PRESS, NIL)
    }

  /**
   * The button's texture for the pressed state.
   */
  public open var pressed: Texture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TOUCHSCREENBUTTON_GET_PRESSED,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TOUCHSCREENBUTTON_SET_PRESSED,
          NIL)
    }

  /**
   * The button's shape.
   */
  public open var shape: Shape2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TOUCHSCREENBUTTON_GET_SHAPE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Shape2D?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TOUCHSCREENBUTTON_SET_SHAPE, NIL)
    }

  /**
   * If `true`, the button's shape is centered in the provided texture. If no texture is used, this property has no effect.
   */
  public open var shapeCentered: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TOUCHSCREENBUTTON_GET_SHAPE_CENTERED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TOUCHSCREENBUTTON_SET_SHAPE_CENTERED, NIL)
    }

  /**
   * If `true`, the button's shape is visible.
   */
  public open var shapeVisible: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TOUCHSCREENBUTTON_GET_SHAPE_VISIBLE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TOUCHSCREENBUTTON_SET_SHAPE_VISIBLE, NIL)
    }

  /**
   * The button's visibility mode. See [enum VisibilityMode] for possible values.
   */
  public open var visibilityMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TOUCHSCREENBUTTON_GET_VISIBILITY_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TOUCHSCREENBUTTON_SET_VISIBILITY_MODE, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_TOUCHSCREENBUTTON)
  }

  public override fun _input(event: InputEvent): Unit {
  }

  /**
   * Returns `true` if this button is currently pressed.
   */
  public open fun isPressed(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TOUCHSCREENBUTTON_IS_PRESSED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public enum class VisibilityMode(
    id: Long
  ) {
    /**
     * Always visible.
     */
    VISIBILITY_ALWAYS(0),
    /**
     * Visible on touch screens only.
     */
    VISIBILITY_TOUCHSCREEN_ONLY(1),
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
     * Always visible.
     */
    public final const val VISIBILITY_ALWAYS: Long = 0

    /**
     * Visible on touch screens only.
     */
    public final const val VISIBILITY_TOUCHSCREEN_ONLY: Long = 1
  }
}
