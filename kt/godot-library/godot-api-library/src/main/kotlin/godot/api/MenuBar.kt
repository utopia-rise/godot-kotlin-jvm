// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * A horizontal menu bar that creates a menu for each [PopupMenu] child. New items are created by
 * adding [PopupMenu]s to this node. Item title is determined by [Window.title], or node name if
 * [Window.title] is empty. Item title can be overridden using [setMenuTitle].
 */
@GodotBaseType
public open class MenuBar : Control() {
  /**
   * Flat [MenuBar] don't display item decoration.
   */
  public final inline var flat: Boolean
    @JvmName("flatProperty")
    get() = isFlat()
    @JvmName("flatProperty")
    set(`value`) {
      setFlat(value)
    }

  /**
   * Position order in the global menu to insert [MenuBar] items at. All menu items in the [MenuBar]
   * are always inserted as a continuous range. Menus with lower [startIndex] are inserted first. Menus
   * with [startIndex] equal to `-1` are inserted last.
   */
  public final inline var startIndex: Int
    @JvmName("startIndexProperty")
    get() = getStartIndex()
    @JvmName("startIndexProperty")
    set(`value`) {
      setStartIndex(value)
    }

  /**
   * If `true`, when the cursor hovers above menu item, it will close the current [PopupMenu] and
   * open the other one.
   */
  public final inline var switchOnHover: Boolean
    @JvmName("switchOnHoverProperty")
    get() = isSwitchOnHover()
    @JvmName("switchOnHoverProperty")
    set(`value`) {
      setSwitchOnHover(value)
    }

  /**
   * If `true`, [MenuBar] will use system global menu when supported.
   *
   * **Note:** If `true` and global menu is supported, this node is not displayed, has zero size,
   * and all its child nodes except [PopupMenu]s are inaccessible.
   *
   * **Note:** This property overrides the value of the [PopupMenu.preferNativeMenu] property of the
   * child nodes.
   */
  public final inline var preferGlobalMenu: Boolean
    @JvmName("preferGlobalMenuProperty")
    get() = isPreferGlobalMenu()
    @JvmName("preferGlobalMenuProperty")
    set(`value`) {
      setPreferGlobalMenu(value)
    }

  /**
   * Base text writing direction.
   */
  public final inline var textDirection: Control.TextDirection
    @JvmName("textDirectionProperty")
    get() = getTextDirection()
    @JvmName("textDirectionProperty")
    set(`value`) {
      setTextDirection(value)
    }

  /**
   * Language code used for line-breaking and text shaping algorithms, if left empty current locale
   * is used instead.
   */
  public final inline var language: String
    @JvmName("languageProperty")
    get() = getLanguage()
    @JvmName("languageProperty")
    set(`value`) {
      setLanguage(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(349, scriptIndex)
  }

  public final fun setSwitchOnHover(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setSwitchOnHoverPtr, NIL)
  }

  public final fun isSwitchOnHover(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isSwitchOnHoverPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * If `true`, shortcuts are disabled and cannot be used to trigger the button.
   */
  public final fun setDisableShortcuts(disabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to disabled)
    TransferContext.callMethod(ptr, MethodBindings.setDisableShortcutsPtr, NIL)
  }

  public final fun setPreferGlobalMenu(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setPreferGlobalMenuPtr, NIL)
  }

  public final fun isPreferGlobalMenu(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isPreferGlobalMenuPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true`, if system global menu is supported and used by this [MenuBar].
   */
  public final fun isNativeMenu(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isNativeMenuPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns number of menu items.
   */
  public final fun getMenuCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMenuCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setTextDirection(direction: Control.TextDirection): Unit {
    TransferContext.writeArguments(LONG to direction.id)
    TransferContext.callMethod(ptr, MethodBindings.setTextDirectionPtr, NIL)
  }

  public final fun getTextDirection(): Control.TextDirection {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTextDirectionPtr, LONG)
    return Control.TextDirection.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setLanguage(language: String): Unit {
    TransferContext.writeArguments(STRING to language)
    TransferContext.callMethod(ptr, MethodBindings.setLanguagePtr, NIL)
  }

  public final fun getLanguage(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLanguagePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  public final fun setFlat(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setFlatPtr, NIL)
  }

  public final fun isFlat(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isFlatPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setStartIndex(enabled: Int): Unit {
    TransferContext.writeArguments(LONG to enabled.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setStartIndexPtr, NIL)
  }

  public final fun getStartIndex(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getStartIndexPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Sets menu item title.
   */
  public final fun setMenuTitle(menu: Int, title: String): Unit {
    TransferContext.writeArguments(LONG to menu.toLong(), STRING to title)
    TransferContext.callMethod(ptr, MethodBindings.setMenuTitlePtr, NIL)
  }

  /**
   * Returns menu item title.
   */
  public final fun getMenuTitle(menu: Int): String {
    TransferContext.writeArguments(LONG to menu.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getMenuTitlePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Sets menu item tooltip.
   */
  public final fun setMenuTooltip(menu: Int, tooltip: String): Unit {
    TransferContext.writeArguments(LONG to menu.toLong(), STRING to tooltip)
    TransferContext.callMethod(ptr, MethodBindings.setMenuTooltipPtr, NIL)
  }

  /**
   * Returns menu item tooltip.
   */
  public final fun getMenuTooltip(menu: Int): String {
    TransferContext.writeArguments(LONG to menu.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getMenuTooltipPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * If `true`, menu item is disabled.
   */
  public final fun setMenuDisabled(menu: Int, disabled: Boolean): Unit {
    TransferContext.writeArguments(LONG to menu.toLong(), BOOL to disabled)
    TransferContext.callMethod(ptr, MethodBindings.setMenuDisabledPtr, NIL)
  }

  /**
   * Returns `true`, if menu item is disabled.
   */
  public final fun isMenuDisabled(menu: Int): Boolean {
    TransferContext.writeArguments(LONG to menu.toLong())
    TransferContext.callMethod(ptr, MethodBindings.isMenuDisabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * If `true`, menu item is hidden.
   */
  public final fun setMenuHidden(menu: Int, hidden: Boolean): Unit {
    TransferContext.writeArguments(LONG to menu.toLong(), BOOL to hidden)
    TransferContext.callMethod(ptr, MethodBindings.setMenuHiddenPtr, NIL)
  }

  /**
   * Returns `true`, if menu item is hidden.
   */
  public final fun isMenuHidden(menu: Int): Boolean {
    TransferContext.writeArguments(LONG to menu.toLong())
    TransferContext.callMethod(ptr, MethodBindings.isMenuHiddenPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns [PopupMenu] associated with menu item.
   */
  public final fun getMenuPopup(menu: Int): PopupMenu? {
    TransferContext.writeArguments(LONG to menu.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getMenuPopupPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as PopupMenu?)
  }

  public companion object

  public object MethodBindings {
    internal val setSwitchOnHoverPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MenuBar", "set_switch_on_hover", 2586408642)

    internal val isSwitchOnHoverPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MenuBar", "is_switch_on_hover", 2240911060)

    internal val setDisableShortcutsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MenuBar", "set_disable_shortcuts", 2586408642)

    internal val setPreferGlobalMenuPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MenuBar", "set_prefer_global_menu", 2586408642)

    internal val isPreferGlobalMenuPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MenuBar", "is_prefer_global_menu", 36873697)

    internal val isNativeMenuPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MenuBar", "is_native_menu", 36873697)

    internal val getMenuCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MenuBar", "get_menu_count", 3905245786)

    internal val setTextDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MenuBar", "set_text_direction", 119160795)

    internal val getTextDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MenuBar", "get_text_direction", 797257663)

    internal val setLanguagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MenuBar", "set_language", 83702148)

    internal val getLanguagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MenuBar", "get_language", 201670096)

    internal val setFlatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MenuBar", "set_flat", 2586408642)

    internal val isFlatPtr: VoidPtr = TypeManager.getMethodBindPtr("MenuBar", "is_flat", 36873697)

    internal val setStartIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MenuBar", "set_start_index", 1286410249)

    internal val getStartIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MenuBar", "get_start_index", 3905245786)

    internal val setMenuTitlePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MenuBar", "set_menu_title", 501894301)

    internal val getMenuTitlePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MenuBar", "get_menu_title", 844755477)

    internal val setMenuTooltipPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MenuBar", "set_menu_tooltip", 501894301)

    internal val getMenuTooltipPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MenuBar", "get_menu_tooltip", 844755477)

    internal val setMenuDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MenuBar", "set_menu_disabled", 300928843)

    internal val isMenuDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MenuBar", "is_menu_disabled", 1116898809)

    internal val setMenuHiddenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MenuBar", "set_menu_hidden", 300928843)

    internal val isMenuHiddenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MenuBar", "is_menu_hidden", 1116898809)

    internal val getMenuPopupPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MenuBar", "get_menu_popup", 2100501353)
  }
}
