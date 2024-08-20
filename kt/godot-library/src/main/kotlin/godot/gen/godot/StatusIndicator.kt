// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.Rect2
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import godot.core.VariantType.RECT2
import godot.core.VariantType.STRING
import godot.core.Vector2i
import godot.core.memory.TransferContext
import godot.signals.Signal2
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
public open class StatusIndicator : Node() {
  /**
   * Emitted when the status indicator is pressed.
   */
  public val pressed: Signal2<Long, Vector2i> by signal("mouseButton", "mousePosition")

  /**
   * Status indicator tooltip.
   */
  public var tooltip: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTooltipPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTooltipPtr, NIL)
    }

  /**
   * Status indicator icon.
   */
  public var icon: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getIconPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setIconPtr, NIL)
    }

  /**
   * Status indicator native popup menu. If this is set, the [signal pressed] signal is not emitted.
   * **Note:** Native popup is only supported if [NativeMenu] supports
   * [NativeMenu.FEATURE_POPUP_MENU] feature.
   */
  public var menu: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMenuPtr, NODE_PATH)
      return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMenuPtr, NIL)
    }

  /**
   * If `true`, the status indicator is visible.
   */
  public var visible: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isVisiblePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setVisiblePtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_STATUSINDICATOR, scriptIndex)
    return true
  }

  /**
   * Returns the status indicator rectangle in screen coordinates. If this status indicator is not
   * visible, returns an empty [Rect2].
   */
  public fun getRect(): Rect2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRectPtr, RECT2)
    return (TransferContext.readReturnValue(RECT2, false) as Rect2)
  }

  public companion object

  internal object MethodBindings {
    public val setTooltipPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StatusIndicator", "set_tooltip")

    public val getTooltipPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StatusIndicator", "get_tooltip")

    public val setIconPtr: VoidPtr = TypeManager.getMethodBindPtr("StatusIndicator", "set_icon")

    public val getIconPtr: VoidPtr = TypeManager.getMethodBindPtr("StatusIndicator", "get_icon")

    public val setVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("StatusIndicator", "set_visible")

    public val isVisiblePtr: VoidPtr = TypeManager.getMethodBindPtr("StatusIndicator", "is_visible")

    public val setMenuPtr: VoidPtr = TypeManager.getMethodBindPtr("StatusIndicator", "set_menu")

    public val getMenuPtr: VoidPtr = TypeManager.getMethodBindPtr("StatusIndicator", "get_menu")

    public val getRectPtr: VoidPtr = TypeManager.getMethodBindPtr("StatusIndicator", "get_rect")
  }
}
