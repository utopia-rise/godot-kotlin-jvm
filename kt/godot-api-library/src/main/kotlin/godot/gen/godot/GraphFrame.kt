// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.Signal0
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.COLOR
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

private const val ENGINE_CLASS_GRAPHFRAME_INDEX: Int = 287

/**
 * GraphFrame is a special [GraphElement] to which other [GraphElement]s can be attached. It can be
 * configured to automatically resize to enclose all attached [GraphElement]s. If the frame is moved,
 * all the attached [GraphElement]s inside it will be moved as well.
 * A GraphFrame is always kept behind the connection layer and other [GraphElement]s inside a
 * [GraphEdit].
 */
@GodotBaseType
public open class GraphFrame : GraphElement() {
  /**
   * Emitted when [autoshrinkEnabled] or [autoshrinkMargin] changes.
   */
  public val autoshrinkChanged: Signal0 by Signal0

  /**
   * Title of the frame.
   */
  public final inline var title: String
    @JvmName("titleProperty")
    get() = getTitle()
    @JvmName("titleProperty")
    set(`value`) {
      setTitle(value)
    }

  /**
   * If `true`, the frame's rect will be adjusted automatically to enclose all attached
   * [GraphElement]s.
   */
  public final inline var autoshrinkEnabled: Boolean
    @JvmName("autoshrinkEnabledProperty")
    get() = isAutoshrinkEnabled()
    @JvmName("autoshrinkEnabledProperty")
    set(`value`) {
      setAutoshrinkEnabled(value)
    }

  /**
   * The margin around the attached nodes that is used to calculate the size of the frame when
   * [autoshrinkEnabled] is `true`.
   */
  public final inline var autoshrinkMargin: Int
    @JvmName("autoshrinkMarginProperty")
    get() = getAutoshrinkMargin()
    @JvmName("autoshrinkMarginProperty")
    set(`value`) {
      setAutoshrinkMargin(value)
    }

  /**
   * The margin inside the frame that can be used to drag the frame.
   */
  public final inline var dragMargin: Int
    @JvmName("dragMarginProperty")
    get() = getDragMargin()
    @JvmName("dragMarginProperty")
    set(`value`) {
      setDragMargin(value)
    }

  /**
   * If `true`, the tint color will be used to tint the frame.
   */
  public final inline var tintColorEnabled: Boolean
    @JvmName("tintColorEnabledProperty")
    get() = isTintColorEnabled()
    @JvmName("tintColorEnabledProperty")
    set(`value`) {
      setTintColorEnabled(value)
    }

  /**
   * The color of the frame when [tintColorEnabled] is `true`.
   */
  @CoreTypeLocalCopy
  public final inline var tintColor: Color
    @JvmName("tintColorProperty")
    get() = getTintColor()
    @JvmName("tintColorProperty")
    set(`value`) {
      setTintColor(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_GRAPHFRAME_INDEX, scriptIndex)
  }

  /**
   * The color of the frame when [tintColorEnabled] is `true`.
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
   * val myCoreType = graphframe.tintColor
   * //Your changes
   * graphframe.tintColor = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun tintColorMutate(block: Color.() -> Unit): Color = tintColor.apply{
      block(this)
      tintColor = this
  }


  public final fun setTitle(title: String): Unit {
    Internals.writeArguments(STRING to title)
    Internals.callMethod(rawPtr, MethodBindings.setTitlePtr, NIL)
  }

  public final fun getTitle(): String {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTitlePtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  /**
   * Returns the [HBoxContainer] used for the title bar, only containing a [Label] for displaying
   * the title by default.
   * This can be used to add custom controls to the title bar such as option or close buttons.
   */
  public final fun getTitlebarHbox(): HBoxContainer? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTitlebarHboxPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as HBoxContainer?)
  }

  public final fun setAutoshrinkEnabled(shrink: Boolean): Unit {
    Internals.writeArguments(BOOL to shrink)
    Internals.callMethod(rawPtr, MethodBindings.setAutoshrinkEnabledPtr, NIL)
  }

  public final fun isAutoshrinkEnabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isAutoshrinkEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setAutoshrinkMargin(autoshrinkMargin: Int): Unit {
    Internals.writeArguments(LONG to autoshrinkMargin.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setAutoshrinkMarginPtr, NIL)
  }

  public final fun getAutoshrinkMargin(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getAutoshrinkMarginPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setDragMargin(dragMargin: Int): Unit {
    Internals.writeArguments(LONG to dragMargin.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setDragMarginPtr, NIL)
  }

  public final fun getDragMargin(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getDragMarginPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setTintColorEnabled(enable: Boolean): Unit {
    Internals.writeArguments(BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setTintColorEnabledPtr, NIL)
  }

  public final fun isTintColorEnabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isTintColorEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setTintColor(color: Color): Unit {
    Internals.writeArguments(COLOR to color)
    Internals.callMethod(rawPtr, MethodBindings.setTintColorPtr, NIL)
  }

  public final fun getTintColor(): Color {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTintColorPtr, COLOR)
    return (Internals.readReturnValue(COLOR) as Color)
  }

  public companion object

  internal object MethodBindings {
    public val setTitlePtr: VoidPtr =
        Internals.getMethodBindPtr("GraphFrame", "set_title", 83702148)

    public val getTitlePtr: VoidPtr =
        Internals.getMethodBindPtr("GraphFrame", "get_title", 201670096)

    public val getTitlebarHboxPtr: VoidPtr =
        Internals.getMethodBindPtr("GraphFrame", "get_titlebar_hbox", 3590609951)

    public val setAutoshrinkEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("GraphFrame", "set_autoshrink_enabled", 2586408642)

    public val isAutoshrinkEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("GraphFrame", "is_autoshrink_enabled", 36873697)

    public val setAutoshrinkMarginPtr: VoidPtr =
        Internals.getMethodBindPtr("GraphFrame", "set_autoshrink_margin", 1286410249)

    public val getAutoshrinkMarginPtr: VoidPtr =
        Internals.getMethodBindPtr("GraphFrame", "get_autoshrink_margin", 3905245786)

    public val setDragMarginPtr: VoidPtr =
        Internals.getMethodBindPtr("GraphFrame", "set_drag_margin", 1286410249)

    public val getDragMarginPtr: VoidPtr =
        Internals.getMethodBindPtr("GraphFrame", "get_drag_margin", 3905245786)

    public val setTintColorEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("GraphFrame", "set_tint_color_enabled", 2586408642)

    public val isTintColorEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("GraphFrame", "is_tint_color_enabled", 36873697)

    public val setTintColorPtr: VoidPtr =
        Internals.getMethodBindPtr("GraphFrame", "set_tint_color", 2920490490)

    public val getTintColorPtr: VoidPtr =
        Internals.getMethodBindPtr("GraphFrame", "get_tint_color", 3444240500)
  }
}
