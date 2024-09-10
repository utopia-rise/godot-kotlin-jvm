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
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * TouchScreenButton allows you to create on-screen buttons for touch devices. It's intended for
 * gameplay use, such as a unit you have to touch to move. Unlike [Button], TouchScreenButton supports
 * multitouch out of the box. Several TouchScreenButtons can be pressed at the same time with touch
 * input.
 * This node inherits from [Node2D]. Unlike with [Control] nodes, you cannot set anchors on it. If
 * you want to create menus or user interfaces, you may want to use [Button] nodes instead. To make
 * button nodes react to touch events, you can enable the Emulate Mouse option in the Project Settings.
 * You can configure TouchScreenButton to be visible only on touch devices, helping you develop your
 * game both for desktop and mobile devices.
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
    @JvmName("textureNormalProperty")
    get() = getTextureNormal()
    @JvmName("textureNormalProperty")
    set(`value`) {
      setTextureNormal(value)
    }

  /**
   * The button's texture for the pressed state.
   */
  public var texturePressed: Texture2D?
    @JvmName("texturePressedProperty")
    get() = getTexturePressed()
    @JvmName("texturePressedProperty")
    set(`value`) {
      setTexturePressed(value)
    }

  /**
   * The button's bitmask.
   */
  public var bitmask: BitMap?
    @JvmName("bitmaskProperty")
    get() = getBitmask()
    @JvmName("bitmaskProperty")
    set(`value`) {
      setBitmask(value)
    }

  /**
   * The button's shape.
   */
  public var shape: Shape2D?
    @JvmName("shapeProperty")
    get() = getShape()
    @JvmName("shapeProperty")
    set(`value`) {
      setShape(value)
    }

  /**
   * If `true`, the button's shape is centered in the provided texture. If no texture is used, this
   * property has no effect.
   */
  public var shapeCentered: Boolean
    @JvmName("shapeCenteredProperty")
    get() = isShapeCentered()
    @JvmName("shapeCenteredProperty")
    set(`value`) {
      setShapeCentered(value)
    }

  /**
   * If `true`, the button's shape is visible in the editor.
   */
  public var shapeVisible: Boolean
    @JvmName("shapeVisibleProperty")
    get() = isShapeVisible()
    @JvmName("shapeVisibleProperty")
    set(`value`) {
      setShapeVisible(value)
    }

  /**
   * If `true`, the [signal pressed] and [signal released] signals are emitted whenever a pressed
   * finger goes in and out of the button, even if the pressure started outside the active area of the
   * button.
   * **Note:** This is a "pass-by" (not "bypass") press mode.
   */
  public var passbyPress: Boolean
    @JvmName("passbyPressProperty")
    get() = isPassbyPressEnabled()
    @JvmName("passbyPressProperty")
    set(`value`) {
      setPassbyPress(value)
    }

  /**
   * The button's action. Actions can be handled with [InputEventAction].
   */
  public var action: String
    @JvmName("actionProperty")
    get() = getAction()
    @JvmName("actionProperty")
    set(`value`) {
      setAction(value)
    }

  /**
   * The button's visibility mode. See [VisibilityMode] for possible values.
   */
  public var visibilityMode: VisibilityMode
    @JvmName("visibilityModeProperty")
    get() = getVisibilityMode()
    @JvmName("visibilityModeProperty")
    set(`value`) {
      setVisibilityMode(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_TOUCHSCREENBUTTON, scriptIndex)
  }

  public fun setTextureNormal(texture: Texture2D?): Unit {
    TransferContext.writeArguments(OBJECT to texture)
    TransferContext.callMethod(rawPtr, MethodBindings.setTextureNormalPtr, NIL)
  }

  public fun getTextureNormal(): Texture2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTextureNormalPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
  }

  public fun setTexturePressed(texture: Texture2D?): Unit {
    TransferContext.writeArguments(OBJECT to texture)
    TransferContext.callMethod(rawPtr, MethodBindings.setTexturePressedPtr, NIL)
  }

  public fun getTexturePressed(): Texture2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTexturePressedPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
  }

  public fun setBitmask(bitmask: BitMap?): Unit {
    TransferContext.writeArguments(OBJECT to bitmask)
    TransferContext.callMethod(rawPtr, MethodBindings.setBitmaskPtr, NIL)
  }

  public fun getBitmask(): BitMap? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getBitmaskPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as BitMap?)
  }

  public fun setShape(shape: Shape2D?): Unit {
    TransferContext.writeArguments(OBJECT to shape)
    TransferContext.callMethod(rawPtr, MethodBindings.setShapePtr, NIL)
  }

  public fun getShape(): Shape2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getShapePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Shape2D?)
  }

  public fun setShapeCentered(bool: Boolean): Unit {
    TransferContext.writeArguments(BOOL to bool)
    TransferContext.callMethod(rawPtr, MethodBindings.setShapeCenteredPtr, NIL)
  }

  public fun isShapeCentered(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isShapeCenteredPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun setShapeVisible(bool: Boolean): Unit {
    TransferContext.writeArguments(BOOL to bool)
    TransferContext.callMethod(rawPtr, MethodBindings.setShapeVisiblePtr, NIL)
  }

  public fun isShapeVisible(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isShapeVisiblePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun setAction(action: String): Unit {
    TransferContext.writeArguments(STRING to action)
    TransferContext.callMethod(rawPtr, MethodBindings.setActionPtr, NIL)
  }

  public fun getAction(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getActionPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun setVisibilityMode(mode: VisibilityMode): Unit {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setVisibilityModePtr, NIL)
  }

  public fun getVisibilityMode(): VisibilityMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getVisibilityModePtr, LONG)
    return TouchScreenButton.VisibilityMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun setPassbyPress(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.setPassbyPressPtr, NIL)
  }

  public fun isPassbyPressEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isPassbyPressEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
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
      public fun from(`value`: Long): VisibilityMode = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setTextureNormalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TouchScreenButton", "set_texture_normal", 4051416890)

    public val getTextureNormalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TouchScreenButton", "get_texture_normal", 3635182373)

    public val setTexturePressedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TouchScreenButton", "set_texture_pressed", 4051416890)

    public val getTexturePressedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TouchScreenButton", "get_texture_pressed", 3635182373)

    public val setBitmaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TouchScreenButton", "set_bitmask", 698588216)

    public val getBitmaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TouchScreenButton", "get_bitmask", 2459671998)

    public val setShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TouchScreenButton", "set_shape", 771364740)

    public val getShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TouchScreenButton", "get_shape", 522005891)

    public val setShapeCenteredPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TouchScreenButton", "set_shape_centered", 2586408642)

    public val isShapeCenteredPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TouchScreenButton", "is_shape_centered", 36873697)

    public val setShapeVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TouchScreenButton", "set_shape_visible", 2586408642)

    public val isShapeVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TouchScreenButton", "is_shape_visible", 36873697)

    public val setActionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TouchScreenButton", "set_action", 83702148)

    public val getActionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TouchScreenButton", "get_action", 201670096)

    public val setVisibilityModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TouchScreenButton", "set_visibility_mode", 3031128463)

    public val getVisibilityModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TouchScreenButton", "get_visibility_mode", 2558996468)

    public val setPassbyPressPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TouchScreenButton", "set_passby_press", 2586408642)

    public val isPassbyPressEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TouchScreenButton", "is_passby_press_enabled", 36873697)

    public val isPressedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TouchScreenButton", "is_pressed", 36873697)
  }
}
