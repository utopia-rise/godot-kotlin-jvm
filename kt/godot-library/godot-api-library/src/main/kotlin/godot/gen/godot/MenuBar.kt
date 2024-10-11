// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
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

private const val ENGINE_CLASS_MENUBAR_INDEX: Int = 364

/**
 * A horizontal menu bar that creates a [MenuButton] for each [PopupMenu] child. New items are
 * created by adding [PopupMenu]s to this node.
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
   * Position in the global menu to insert first [MenuBar] item at.
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
    Internals.callConstructor(this, ENGINE_CLASS_MENUBAR_INDEX, scriptIndex)
  }

  public final fun setSwitchOnHover(enable: Boolean): Unit {
    Internals.writeArguments(BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setSwitchOnHoverPtr, NIL)
  }

  public final fun isSwitchOnHover(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isSwitchOnHoverPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * If `true`, shortcuts are disabled and cannot be used to trigger the button.
   */
  public final fun setDisableShortcuts(disabled: Boolean): Unit {
    Internals.writeArguments(BOOL to disabled)
    Internals.callMethod(rawPtr, MethodBindings.setDisableShortcutsPtr, NIL)
  }

  public final fun setPreferGlobalMenu(enabled: Boolean): Unit {
    Internals.writeArguments(BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.setPreferGlobalMenuPtr, NIL)
  }

  public final fun isPreferGlobalMenu(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isPreferGlobalMenuPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true`, if system global menu is supported and used by this [MenuBar].
   */
  public final fun isNativeMenu(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isNativeMenuPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns number of menu items.
   */
  public final fun getMenuCount(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getMenuCountPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setTextDirection(direction: Control.TextDirection): Unit {
    Internals.writeArguments(LONG to direction.id)
    Internals.callMethod(rawPtr, MethodBindings.setTextDirectionPtr, NIL)
  }

  public final fun getTextDirection(): Control.TextDirection {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTextDirectionPtr, LONG)
    return Control.TextDirection.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setLanguage(language: String): Unit {
    Internals.writeArguments(STRING to language)
    Internals.callMethod(rawPtr, MethodBindings.setLanguagePtr, NIL)
  }

  public final fun getLanguage(): String {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getLanguagePtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  public final fun setFlat(enabled: Boolean): Unit {
    Internals.writeArguments(BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.setFlatPtr, NIL)
  }

  public final fun isFlat(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isFlatPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setStartIndex(enabled: Int): Unit {
    Internals.writeArguments(LONG to enabled.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setStartIndexPtr, NIL)
  }

  public final fun getStartIndex(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getStartIndexPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Sets menu item title.
   */
  public final fun setMenuTitle(menu: Int, title: String): Unit {
    Internals.writeArguments(LONG to menu.toLong(), STRING to title)
    Internals.callMethod(rawPtr, MethodBindings.setMenuTitlePtr, NIL)
  }

  /**
   * Returns menu item title.
   */
  public final fun getMenuTitle(menu: Int): String {
    Internals.writeArguments(LONG to menu.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getMenuTitlePtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  /**
   * Sets menu item tooltip.
   */
  public final fun setMenuTooltip(menu: Int, tooltip: String): Unit {
    Internals.writeArguments(LONG to menu.toLong(), STRING to tooltip)
    Internals.callMethod(rawPtr, MethodBindings.setMenuTooltipPtr, NIL)
  }

  /**
   * Returns menu item tooltip.
   */
  public final fun getMenuTooltip(menu: Int): String {
    Internals.writeArguments(LONG to menu.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getMenuTooltipPtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  /**
   * If `true`, menu item is disabled.
   */
  public final fun setMenuDisabled(menu: Int, disabled: Boolean): Unit {
    Internals.writeArguments(LONG to menu.toLong(), BOOL to disabled)
    Internals.callMethod(rawPtr, MethodBindings.setMenuDisabledPtr, NIL)
  }

  /**
   * Returns `true`, if menu item is disabled.
   */
  public final fun isMenuDisabled(menu: Int): Boolean {
    Internals.writeArguments(LONG to menu.toLong())
    Internals.callMethod(rawPtr, MethodBindings.isMenuDisabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * If `true`, menu item is hidden.
   */
  public final fun setMenuHidden(menu: Int, hidden: Boolean): Unit {
    Internals.writeArguments(LONG to menu.toLong(), BOOL to hidden)
    Internals.callMethod(rawPtr, MethodBindings.setMenuHiddenPtr, NIL)
  }

  /**
   * Returns `true`, if menu item is hidden.
   */
  public final fun isMenuHidden(menu: Int): Boolean {
    Internals.writeArguments(LONG to menu.toLong())
    Internals.callMethod(rawPtr, MethodBindings.isMenuHiddenPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns [PopupMenu] associated with menu item.
   */
  public final fun getMenuPopup(menu: Int): PopupMenu? {
    Internals.writeArguments(LONG to menu.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getMenuPopupPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as PopupMenu?)
  }

  public companion object

  public object MethodBindings {
    internal val setSwitchOnHoverPtr: VoidPtr =
        Internals.getMethodBindPtr("MenuBar", "set_switch_on_hover", 2586408642)

    internal val isSwitchOnHoverPtr: VoidPtr =
        Internals.getMethodBindPtr("MenuBar", "is_switch_on_hover", 2240911060)

    internal val setDisableShortcutsPtr: VoidPtr =
        Internals.getMethodBindPtr("MenuBar", "set_disable_shortcuts", 2586408642)

    internal val setPreferGlobalMenuPtr: VoidPtr =
        Internals.getMethodBindPtr("MenuBar", "set_prefer_global_menu", 2586408642)

    internal val isPreferGlobalMenuPtr: VoidPtr =
        Internals.getMethodBindPtr("MenuBar", "is_prefer_global_menu", 36873697)

    internal val isNativeMenuPtr: VoidPtr =
        Internals.getMethodBindPtr("MenuBar", "is_native_menu", 36873697)

    internal val getMenuCountPtr: VoidPtr =
        Internals.getMethodBindPtr("MenuBar", "get_menu_count", 3905245786)

    internal val setTextDirectionPtr: VoidPtr =
        Internals.getMethodBindPtr("MenuBar", "set_text_direction", 119160795)

    internal val getTextDirectionPtr: VoidPtr =
        Internals.getMethodBindPtr("MenuBar", "get_text_direction", 797257663)

    internal val setLanguagePtr: VoidPtr =
        Internals.getMethodBindPtr("MenuBar", "set_language", 83702148)

    internal val getLanguagePtr: VoidPtr =
        Internals.getMethodBindPtr("MenuBar", "get_language", 201670096)

    internal val setFlatPtr: VoidPtr = Internals.getMethodBindPtr("MenuBar", "set_flat", 2586408642)

    internal val isFlatPtr: VoidPtr = Internals.getMethodBindPtr("MenuBar", "is_flat", 36873697)

    internal val setStartIndexPtr: VoidPtr =
        Internals.getMethodBindPtr("MenuBar", "set_start_index", 1286410249)

    internal val getStartIndexPtr: VoidPtr =
        Internals.getMethodBindPtr("MenuBar", "get_start_index", 3905245786)

    internal val setMenuTitlePtr: VoidPtr =
        Internals.getMethodBindPtr("MenuBar", "set_menu_title", 501894301)

    internal val getMenuTitlePtr: VoidPtr =
        Internals.getMethodBindPtr("MenuBar", "get_menu_title", 844755477)

    internal val setMenuTooltipPtr: VoidPtr =
        Internals.getMethodBindPtr("MenuBar", "set_menu_tooltip", 501894301)

    internal val getMenuTooltipPtr: VoidPtr =
        Internals.getMethodBindPtr("MenuBar", "get_menu_tooltip", 844755477)

    internal val setMenuDisabledPtr: VoidPtr =
        Internals.getMethodBindPtr("MenuBar", "set_menu_disabled", 300928843)

    internal val isMenuDisabledPtr: VoidPtr =
        Internals.getMethodBindPtr("MenuBar", "is_menu_disabled", 1116898809)

    internal val setMenuHiddenPtr: VoidPtr =
        Internals.getMethodBindPtr("MenuBar", "set_menu_hidden", 300928843)

    internal val isMenuHiddenPtr: VoidPtr =
        Internals.getMethodBindPtr("MenuBar", "is_menu_hidden", 1116898809)

    internal val getMenuPopupPtr: VoidPtr =
        Internals.getMethodBindPtr("MenuBar", "get_menu_popup", 2100501353)
  }
}
