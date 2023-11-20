// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

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
  /**
   * Emitted when the button is pressed (down).
   */
  public val pressed: Signal0 by signal()

  /**
   * Emitted when the button is released (up).
   */
  public val released: Signal0 by signal()

  /**
   * The button's texture for the normal state.
   */
  public var textureNormal: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTextureNormalPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTextureNormalPtr, NIL)
    }

  /**
   * The button's texture for the pressed state.
   */
  public var texturePressed: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTexturePressedPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTexturePressedPtr, NIL)
    }

  /**
   * The button's bitmask.
   */
  public var bitmask: BitMap?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBitmaskPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as BitMap?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setBitmaskPtr, NIL)
    }

  /**
   * The button's shape.
   */
  public var shape: Shape2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getShapePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Shape2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setShapePtr, NIL)
    }

  /**
   * If `true`, the button's shape is centered in the provided texture. If no texture is used, this property has no effect.
   */
  public var shapeCentered: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isShapeCenteredPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setShapeCenteredPtr, NIL)
    }

  /**
   * If `true`, the button's shape is visible in the editor.
   */
  public var shapeVisible: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isShapeVisiblePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setShapeVisiblePtr, NIL)
    }

  /**
   * If `true`, the [pressed] and [released] signals are emitted whenever a pressed finger goes in and out of the button, even if the pressure started outside the active area of the button.
   *
   * **Note:** This is a "pass-by" (not "bypass") press mode.
   */
  public var passbyPress: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isPassbyPressEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPassbyPressPtr, NIL)
    }

  /**
   * The button's action. Actions can be handled with [godot.InputEventAction].
   */
  public var action: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getActionPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setActionPtr, NIL)
    }

  /**
   * The button's visibility mode. See [enum VisibilityMode] for possible values.
   */
  public var visibilityMode: VisibilityMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVisibilityModePtr, LONG)
      return TouchScreenButton.VisibilityMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setVisibilityModePtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_TOUCHSCREENBUTTON, scriptIndex)
    return true
  }

  /**
   * Returns `true` if this button is currently pressed.
   */
  public fun isPressed(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isPressedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public enum class VisibilityMode(
    id: Long,
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setTextureNormalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TouchScreenButton", "set_texture_normal")

    public val getTextureNormalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TouchScreenButton", "get_texture_normal")

    public val setTexturePressedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TouchScreenButton", "set_texture_pressed")

    public val getTexturePressedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TouchScreenButton", "get_texture_pressed")

    public val setBitmaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TouchScreenButton", "set_bitmask")

    public val getBitmaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TouchScreenButton", "get_bitmask")

    public val setShapePtr: VoidPtr = TypeManager.getMethodBindPtr("TouchScreenButton", "set_shape")

    public val getShapePtr: VoidPtr = TypeManager.getMethodBindPtr("TouchScreenButton", "get_shape")

    public val setShapeCenteredPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TouchScreenButton", "set_shape_centered")

    public val isShapeCenteredPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TouchScreenButton", "is_shape_centered")

    public val setShapeVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TouchScreenButton", "set_shape_visible")

    public val isShapeVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TouchScreenButton", "is_shape_visible")

    public val setActionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TouchScreenButton", "set_action")

    public val getActionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TouchScreenButton", "get_action")

    public val setVisibilityModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TouchScreenButton", "set_visibility_mode")

    public val getVisibilityModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TouchScreenButton", "get_visibility_mode")

    public val setPassbyPressPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TouchScreenButton", "set_passby_press")

    public val isPassbyPressEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TouchScreenButton", "is_passby_press_enabled")

    public val isPressedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TouchScreenButton", "is_pressed")
  }
}
