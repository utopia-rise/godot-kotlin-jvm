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
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
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
  public val autoshrinkChanged: Signal0 by signal()

  /**
   * Title of the frame.
   */
  public var title: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTitlePtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTitlePtr, NIL)
    }

  /**
   * If `true`, the frame's rect will be adjusted automatically to enclose all attached
   * [GraphElement]s.
   */
  public var autoshrinkEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isAutoshrinkEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAutoshrinkEnabledPtr, NIL)
    }

  /**
   * The margin around the attached nodes that is used to calculate the size of the frame when
   * [autoshrinkEnabled] is `true`.
   */
  public var autoshrinkMargin: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAutoshrinkMarginPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setAutoshrinkMarginPtr, NIL)
    }

  /**
   * The margin inside the frame that can be used to drag the frame.
   */
  public var dragMargin: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDragMarginPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setDragMarginPtr, NIL)
    }

  /**
   * If `true`, the tint color will be used to tint the frame.
   */
  public var tintColorEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isTintColorEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTintColorEnabledPtr, NIL)
    }

  /**
   * The color of the frame when [tintColorEnabled] is `true`.
   */
  @CoreTypeLocalCopy
  public var tintColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTintColorPtr, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTintColorPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_GRAPHFRAME, scriptIndex)
    return true
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
  public open fun tintColorMutate(block: Color.() -> Unit): Color = tintColor.apply{
      block(this)
      tintColor = this
  }


  /**
   * Returns the [HBoxContainer] used for the title bar, only containing a [Label] for displaying
   * the title by default.
   * This can be used to add custom controls to the title bar such as option or close buttons.
   */
  public fun getTitlebarHbox(): HBoxContainer? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTitlebarHboxPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as HBoxContainer?)
  }

  public companion object

  internal object MethodBindings {
    public val setTitlePtr: VoidPtr = TypeManager.getMethodBindPtr("GraphFrame", "set_title")

    public val getTitlePtr: VoidPtr = TypeManager.getMethodBindPtr("GraphFrame", "get_title")

    public val getTitlebarHboxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphFrame", "get_titlebar_hbox")

    public val setAutoshrinkEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphFrame", "set_autoshrink_enabled")

    public val isAutoshrinkEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphFrame", "is_autoshrink_enabled")

    public val setAutoshrinkMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphFrame", "set_autoshrink_margin")

    public val getAutoshrinkMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphFrame", "get_autoshrink_margin")

    public val setDragMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphFrame", "set_drag_margin")

    public val getDragMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphFrame", "get_drag_margin")

    public val setTintColorEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphFrame", "set_tint_color_enabled")

    public val isTintColorEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphFrame", "is_tint_color_enabled")

    public val setTintColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphFrame", "set_tint_color")

    public val getTintColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphFrame", "get_tint_color")
  }
}
