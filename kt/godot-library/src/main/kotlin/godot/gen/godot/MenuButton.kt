// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Special button that brings up a [godot.PopupMenu] when clicked.
 *
 * Special button that brings up a [godot.PopupMenu] when clicked.
 *
 * New items can be created inside this [godot.PopupMenu] using `get_popup().add_item("My Item Name")`. You can also create them directly from the editor. To do so, select the [godot.MenuButton] node, then in the toolbar at the top of the 2D editor, click **Items** then click **Add** in the popup. You will be able to give each item new properties.
 *
 * See also [godot.BaseButton] which contains common properties and methods associated with this node.
 */
@GodotBaseType
public open class MenuButton : Button() {
  /**
   * Emitted when the [godot.PopupMenu] of this MenuButton is about to show.
   */
  public val aboutToPopup: Signal0 by signal()

  /**
   * If `true`, when the cursor hovers above another [godot.MenuButton] within the same parent which also has `switch_on_hover` enabled, it will close the current [godot.MenuButton] and open the other one.
   */
  public var switchOnHover: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MENUBUTTON_IS_SWITCH_ON_HOVER,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MENUBUTTON_SET_SWITCH_ON_HOVER,
          NIL)
    }

  /**
   * The number of items currently in the list.
   */
  public var itemCount: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MENUBUTTON_GET_ITEM_COUNT, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MENUBUTTON_SET_ITEM_COUNT, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_MENUBUTTON, scriptIndex)
    return true
  }

  /**
   * Returns the [godot.PopupMenu] contained in this button.
   *
   * **Warning:** This is a required internal node, removing and freeing it may cause a crash. If you wish to hide it or any of its children, use their [godot.Window.visible] property.
   */
  public fun getPopup(): PopupMenu? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MENUBUTTON_GET_POPUP, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as PopupMenu?
  }

  /**
   * Adjusts popup position and sizing for the [godot.MenuButton], then shows the [godot.PopupMenu]. Prefer this over using `get_popup().popup()`.
   */
  public fun showPopup(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MENUBUTTON_SHOW_POPUP, NIL)
  }

  /**
   * If `true`, shortcuts are disabled and cannot be used to trigger the button.
   */
  public fun setDisableShortcuts(disabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to disabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MENUBUTTON_SET_DISABLE_SHORTCUTS,
        NIL)
  }

  public companion object
}
