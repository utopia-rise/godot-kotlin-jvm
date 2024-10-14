// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.common.interop.VoidPtr
import godot.core.Color
import godot.core.Signal0
import godot.internal.reflection.TypeManager
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.COLOR
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING
import godot.internal.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

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
    callConstructor(ENGINECLASS_GRAPHFRAME, scriptIndex)
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
    TransferContext.writeArguments(STRING to title)
    TransferContext.callMethod(ptr, MethodBindings.setTitlePtr, NIL)
  }

  public final fun getTitle(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTitlePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns the [HBoxContainer] used for the title bar, only containing a [Label] for displaying
   * the title by default.
   * This can be used to add custom controls to the title bar such as option or close buttons.
   */
  public final fun getTitlebarHbox(): HBoxContainer? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTitlebarHboxPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as HBoxContainer?)
  }

  public final fun setAutoshrinkEnabled(shrink: Boolean): Unit {
    TransferContext.writeArguments(BOOL to shrink)
    TransferContext.callMethod(ptr, MethodBindings.setAutoshrinkEnabledPtr, NIL)
  }

  public final fun isAutoshrinkEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isAutoshrinkEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setAutoshrinkMargin(autoshrinkMargin: Int): Unit {
    TransferContext.writeArguments(LONG to autoshrinkMargin.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setAutoshrinkMarginPtr, NIL)
  }

  public final fun getAutoshrinkMargin(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAutoshrinkMarginPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setDragMargin(dragMargin: Int): Unit {
    TransferContext.writeArguments(LONG to dragMargin.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setDragMarginPtr, NIL)
  }

  public final fun getDragMargin(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDragMarginPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setTintColorEnabled(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setTintColorEnabledPtr, NIL)
  }

  public final fun isTintColorEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isTintColorEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setTintColor(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(ptr, MethodBindings.setTintColorPtr, NIL)
  }

  public final fun getTintColor(): Color {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTintColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  public companion object

  internal object MethodBindings {
    public val setTitlePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphFrame", "set_title", 83702148)

    public val getTitlePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphFrame", "get_title", 201670096)

    public val getTitlebarHboxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphFrame", "get_titlebar_hbox", 3590609951)

    public val setAutoshrinkEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphFrame", "set_autoshrink_enabled", 2586408642)

    public val isAutoshrinkEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphFrame", "is_autoshrink_enabled", 36873697)

    public val setAutoshrinkMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphFrame", "set_autoshrink_margin", 1286410249)

    public val getAutoshrinkMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphFrame", "get_autoshrink_margin", 3905245786)

    public val setDragMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphFrame", "set_drag_margin", 1286410249)

    public val getDragMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphFrame", "get_drag_margin", 3905245786)

    public val setTintColorEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphFrame", "set_tint_color_enabled", 2586408642)

    public val isTintColorEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphFrame", "is_tint_color_enabled", 36873697)

    public val setTintColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphFrame", "set_tint_color", 2920490490)

    public val getTintColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphFrame", "get_tint_color", 3444240500)
  }
}
