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
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * A horizontal menu bar that creates a [godot.MenuButton] for each [godot.PopupMenu] child.
 *
 * A horizontal menu bar that creates a [godot.MenuButton] for each [godot.PopupMenu] child. New items are created by adding [godot.PopupMenu]s to this node.
 */
@GodotBaseType
public open class MenuBar : Control() {
  /**
   * Flat [godot.MenuBar] don't display item decoration.
   */
  public var flat: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MENUBAR_IS_FLAT, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MENUBAR_SET_FLAT, NIL)
    }

  /**
   * Position in the global menu to insert first [godot.MenuBar] item at.
   */
  public var startIndex: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MENUBAR_GET_START_INDEX, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MENUBAR_SET_START_INDEX, NIL)
    }

  /**
   * If `true`, when the cursor hovers above menu item, it will close the current [godot.PopupMenu] and open the other one.
   */
  public var switchOnHover: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MENUBAR_IS_SWITCH_ON_HOVER, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MENUBAR_SET_SWITCH_ON_HOVER, NIL)
    }

  /**
   * If `true`, [godot.MenuBar] will use system global menu when supported.
   */
  public var preferGlobalMenu: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MENUBAR_IS_PREFER_GLOBAL_MENU,
          BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MENUBAR_SET_PREFER_GLOBAL_MENU,
          NIL)
    }

  /**
   * Base text writing direction.
   */
  public var textDirection: Control.TextDirection
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MENUBAR_GET_TEXT_DIRECTION, LONG)
      return Control.TextDirection.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MENUBAR_SET_TEXT_DIRECTION, NIL)
    }

  /**
   * Language code used for line-breaking and text shaping algorithms, if left empty current locale is used instead.
   */
  public var language: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MENUBAR_GET_LANGUAGE, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MENUBAR_SET_LANGUAGE, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_MENUBAR, scriptIndex)
    return true
  }

  /**
   * If `true`, shortcuts are disabled and cannot be used to trigger the button.
   */
  public fun setDisableShortcuts(disabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to disabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MENUBAR_SET_DISABLE_SHORTCUTS, NIL)
  }

  /**
   * Returns `true`, if system global menu is supported and used by this [godot.MenuBar].
   */
  public fun isNativeMenu(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MENUBAR_IS_NATIVE_MENU, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns number of menu items.
   */
  public fun getMenuCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MENUBAR_GET_MENU_COUNT, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Sets menu item title.
   */
  public fun setMenuTitle(menu: Int, title: String): Unit {
    TransferContext.writeArguments(LONG to menu.toLong(), STRING to title)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MENUBAR_SET_MENU_TITLE, NIL)
  }

  /**
   * Returns menu item title.
   */
  public fun getMenuTitle(menu: Int): String {
    TransferContext.writeArguments(LONG to menu.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MENUBAR_GET_MENU_TITLE, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Sets menu item tooltip.
   */
  public fun setMenuTooltip(menu: Int, tooltip: String): Unit {
    TransferContext.writeArguments(LONG to menu.toLong(), STRING to tooltip)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MENUBAR_SET_MENU_TOOLTIP, NIL)
  }

  /**
   * Returns menu item tooltip.
   */
  public fun getMenuTooltip(menu: Int): String {
    TransferContext.writeArguments(LONG to menu.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MENUBAR_GET_MENU_TOOLTIP, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * If `true`, menu item is disabled.
   */
  public fun setMenuDisabled(menu: Int, disabled: Boolean): Unit {
    TransferContext.writeArguments(LONG to menu.toLong(), BOOL to disabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MENUBAR_SET_MENU_DISABLED, NIL)
  }

  /**
   * Returns `true`, if menu item is disabled.
   */
  public fun isMenuDisabled(menu: Int): Boolean {
    TransferContext.writeArguments(LONG to menu.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MENUBAR_IS_MENU_DISABLED, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * If `true`, menu item is hidden.
   */
  public fun setMenuHidden(menu: Int, hidden: Boolean): Unit {
    TransferContext.writeArguments(LONG to menu.toLong(), BOOL to hidden)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MENUBAR_SET_MENU_HIDDEN, NIL)
  }

  /**
   * Returns `true`, if menu item is hidden.
   */
  public fun isMenuHidden(menu: Int): Boolean {
    TransferContext.writeArguments(LONG to menu.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MENUBAR_IS_MENU_HIDDEN, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns [godot.PopupMenu] associated with menu item.
   */
  public fun getMenuPopup(menu: Int): PopupMenu? {
    TransferContext.writeArguments(LONG to menu.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MENUBAR_GET_MENU_POPUP, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as PopupMenu?)
  }

  public companion object
}
