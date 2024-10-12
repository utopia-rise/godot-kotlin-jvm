// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Signal0
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_TOUCHSCREENBUTTON_INDEX: Int = 673

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
  public val pressed: Signal0 by Signal0

  /**
   * Emitted when the button is released (up).
   */
  public val released: Signal0 by Signal0

  /**
   * The button's texture for the normal state.
   */
  public final inline var textureNormal: Texture2D?
    @JvmName("textureNormalProperty")
    get() = getTextureNormal()
    @JvmName("textureNormalProperty")
    set(`value`) {
      setTextureNormal(value)
    }

  /**
   * The button's texture for the pressed state.
   */
  public final inline var texturePressed: Texture2D?
    @JvmName("texturePressedProperty")
    get() = getTexturePressed()
    @JvmName("texturePressedProperty")
    set(`value`) {
      setTexturePressed(value)
    }

  /**
   * The button's bitmask.
   */
  public final inline var bitmask: BitMap?
    @JvmName("bitmaskProperty")
    get() = getBitmask()
    @JvmName("bitmaskProperty")
    set(`value`) {
      setBitmask(value)
    }

  /**
   * The button's shape.
   */
  public final inline var shape: Shape2D?
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
  public final inline var shapeCentered: Boolean
    @JvmName("shapeCenteredProperty")
    get() = isShapeCentered()
    @JvmName("shapeCenteredProperty")
    set(`value`) {
      setShapeCentered(value)
    }

  /**
   * If `true`, the button's shape is visible in the editor.
   */
  public final inline var shapeVisible: Boolean
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
  public final inline var passbyPress: Boolean
    @JvmName("passbyPressProperty")
    get() = isPassbyPressEnabled()
    @JvmName("passbyPressProperty")
    set(`value`) {
      setPassbyPress(value)
    }

  /**
   * The button's action. Actions can be handled with [InputEventAction].
   */
  public final inline var action: String
    @JvmName("actionProperty")
    get() = getAction()
    @JvmName("actionProperty")
    set(`value`) {
      setAction(value)
    }

  /**
   * The button's visibility mode. See [VisibilityMode] for possible values.
   */
  public final inline var visibilityMode: VisibilityMode
    @JvmName("visibilityModeProperty")
    get() = getVisibilityMode()
    @JvmName("visibilityModeProperty")
    set(`value`) {
      setVisibilityMode(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_TOUCHSCREENBUTTON_INDEX, scriptIndex)
  }

  public final fun setTextureNormal(texture: Texture2D?): Unit {
    Internals.writeArguments(OBJECT to texture)
    Internals.callMethod(rawPtr, MethodBindings.setTextureNormalPtr, NIL)
  }

  public final fun getTextureNormal(): Texture2D? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTextureNormalPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Texture2D?)
  }

  public final fun setTexturePressed(texture: Texture2D?): Unit {
    Internals.writeArguments(OBJECT to texture)
    Internals.callMethod(rawPtr, MethodBindings.setTexturePressedPtr, NIL)
  }

  public final fun getTexturePressed(): Texture2D? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTexturePressedPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Texture2D?)
  }

  public final fun setBitmask(bitmask: BitMap?): Unit {
    Internals.writeArguments(OBJECT to bitmask)
    Internals.callMethod(rawPtr, MethodBindings.setBitmaskPtr, NIL)
  }

  public final fun getBitmask(): BitMap? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getBitmaskPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as BitMap?)
  }

  public final fun setShape(shape: Shape2D?): Unit {
    Internals.writeArguments(OBJECT to shape)
    Internals.callMethod(rawPtr, MethodBindings.setShapePtr, NIL)
  }

  public final fun getShape(): Shape2D? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getShapePtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Shape2D?)
  }

  public final fun setShapeCentered(bool: Boolean): Unit {
    Internals.writeArguments(BOOL to bool)
    Internals.callMethod(rawPtr, MethodBindings.setShapeCenteredPtr, NIL)
  }

  public final fun isShapeCentered(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isShapeCenteredPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setShapeVisible(bool: Boolean): Unit {
    Internals.writeArguments(BOOL to bool)
    Internals.callMethod(rawPtr, MethodBindings.setShapeVisiblePtr, NIL)
  }

  public final fun isShapeVisible(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isShapeVisiblePtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setAction(action: String): Unit {
    Internals.writeArguments(STRING to action)
    Internals.callMethod(rawPtr, MethodBindings.setActionPtr, NIL)
  }

  public final fun getAction(): String {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getActionPtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  public final fun setVisibilityMode(mode: VisibilityMode): Unit {
    Internals.writeArguments(LONG to mode.id)
    Internals.callMethod(rawPtr, MethodBindings.setVisibilityModePtr, NIL)
  }

  public final fun getVisibilityMode(): VisibilityMode {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getVisibilityModePtr, LONG)
    return TouchScreenButton.VisibilityMode.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setPassbyPress(enabled: Boolean): Unit {
    Internals.writeArguments(BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.setPassbyPressPtr, NIL)
  }

  public final fun isPassbyPressEnabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isPassbyPressEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if this button is currently pressed.
   */
  public final fun isPressed(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isPressedPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
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

  public object MethodBindings {
    internal val setTextureNormalPtr: VoidPtr =
        Internals.getMethodBindPtr("TouchScreenButton", "set_texture_normal", 4051416890)

    internal val getTextureNormalPtr: VoidPtr =
        Internals.getMethodBindPtr("TouchScreenButton", "get_texture_normal", 3635182373)

    internal val setTexturePressedPtr: VoidPtr =
        Internals.getMethodBindPtr("TouchScreenButton", "set_texture_pressed", 4051416890)

    internal val getTexturePressedPtr: VoidPtr =
        Internals.getMethodBindPtr("TouchScreenButton", "get_texture_pressed", 3635182373)

    internal val setBitmaskPtr: VoidPtr =
        Internals.getMethodBindPtr("TouchScreenButton", "set_bitmask", 698588216)

    internal val getBitmaskPtr: VoidPtr =
        Internals.getMethodBindPtr("TouchScreenButton", "get_bitmask", 2459671998)

    internal val setShapePtr: VoidPtr =
        Internals.getMethodBindPtr("TouchScreenButton", "set_shape", 771364740)

    internal val getShapePtr: VoidPtr =
        Internals.getMethodBindPtr("TouchScreenButton", "get_shape", 522005891)

    internal val setShapeCenteredPtr: VoidPtr =
        Internals.getMethodBindPtr("TouchScreenButton", "set_shape_centered", 2586408642)

    internal val isShapeCenteredPtr: VoidPtr =
        Internals.getMethodBindPtr("TouchScreenButton", "is_shape_centered", 36873697)

    internal val setShapeVisiblePtr: VoidPtr =
        Internals.getMethodBindPtr("TouchScreenButton", "set_shape_visible", 2586408642)

    internal val isShapeVisiblePtr: VoidPtr =
        Internals.getMethodBindPtr("TouchScreenButton", "is_shape_visible", 36873697)

    internal val setActionPtr: VoidPtr =
        Internals.getMethodBindPtr("TouchScreenButton", "set_action", 83702148)

    internal val getActionPtr: VoidPtr =
        Internals.getMethodBindPtr("TouchScreenButton", "get_action", 201670096)

    internal val setVisibilityModePtr: VoidPtr =
        Internals.getMethodBindPtr("TouchScreenButton", "set_visibility_mode", 3031128463)

    internal val getVisibilityModePtr: VoidPtr =
        Internals.getMethodBindPtr("TouchScreenButton", "get_visibility_mode", 2558996468)

    internal val setPassbyPressPtr: VoidPtr =
        Internals.getMethodBindPtr("TouchScreenButton", "set_passby_press", 2586408642)

    internal val isPassbyPressEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("TouchScreenButton", "is_passby_press_enabled", 36873697)

    internal val isPressedPtr: VoidPtr =
        Internals.getMethodBindPtr("TouchScreenButton", "is_pressed", 36873697)
  }
}
