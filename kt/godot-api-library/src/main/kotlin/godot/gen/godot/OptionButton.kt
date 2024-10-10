// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Signal1
import godot.core.TypeManager
import godot.core.VariantCaster.ANY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

private const val ENGINE_CLASS_OPTIONBUTTON_INDEX: Int = 394

/**
 * [OptionButton] is a type of button that brings up a dropdown with selectable items when pressed.
 * The item selected becomes the "current" item and is displayed as the button text.
 * See also [BaseButton] which contains common properties and methods associated with this node.
 * **Note:** The ID values used for items are limited to 32 bits, not full 64 bits of [int]. This
 * has a range of `-2^32` to `2^32 - 1`, i.e. `-2147483648` to `2147483647`.
 * **Note:** The [Button.text] and [Button.icon] properties are set automatically based on the
 * selected item. They shouldn't be changed manually.
 */
@GodotBaseType
public open class OptionButton : Button() {
  /**
   * Emitted when the current item has been changed by the user. The index of the item selected is
   * passed as argument.
   * [allowReselect] must be enabled to reselect an item.
   */
  public val itemSelected: Signal1<Long> by Signal1

  /**
   * Emitted when the user navigates to an item using the [ProjectSettings.input/uiUp] or
   * [ProjectSettings.input/uiDown] input actions. The index of the item selected is passed as
   * argument.
   */
  public val itemFocused: Signal1<Long> by Signal1

  /**
   * The index of the currently selected item, or `-1` if no item is selected.
   */
  public final inline val selected: Int
    @JvmName("selectedProperty")
    get() = getSelected()

  /**
   * If `true`, minimum size will be determined by the longest item's text, instead of the currently
   * selected one's.
   * **Note:** For performance reasons, the minimum size doesn't update immediately when adding,
   * removing or modifying items.
   */
  public final inline var fitToLongestItem: Boolean
    @JvmName("fitToLongestItemProperty")
    get() = isFitToLongestItem()
    @JvmName("fitToLongestItemProperty")
    set(`value`) {
      setFitToLongestItem(value)
    }

  /**
   * If `true`, the currently selected item can be selected again.
   */
  public final inline var allowReselect: Boolean
    @JvmName("allowReselectProperty")
    get() = getAllowReselect()
    @JvmName("allowReselectProperty")
    set(`value`) {
      setAllowReselect(value)
    }

  /**
   * The number of items to select from.
   */
  public final inline var itemCount: Int
    @JvmName("itemCountProperty")
    get() = getItemCount()
    @JvmName("itemCountProperty")
    set(`value`) {
      setItemCount(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINE_CLASS_OPTIONBUTTON_INDEX, scriptIndex)
  }

  /**
   * Adds an item, with text [label] and (optionally) [id]. If no [id] is passed, the item index
   * will be used as the item's ID. New items are appended at the end.
   */
  @JvmOverloads
  public final fun addItem(label: String, id: Int = -1): Unit {
    TransferContext.writeArguments(STRING to label, LONG to id.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addItemPtr, NIL)
  }

  /**
   * Adds an item, with a [texture] icon, text [label] and (optionally) [id]. If no [id] is passed,
   * the item index will be used as the item's ID. New items are appended at the end.
   */
  @JvmOverloads
  public final fun addIconItem(
    texture: Texture2D?,
    label: String,
    id: Int = -1,
  ): Unit {
    TransferContext.writeArguments(OBJECT to texture, STRING to label, LONG to id.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addIconItemPtr, NIL)
  }

  /**
   * Sets the text of the item at index [idx].
   */
  public final fun setItemText(idx: Int, text: String): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), STRING to text)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemTextPtr, NIL)
  }

  /**
   * Sets the icon of the item at index [idx].
   */
  public final fun setItemIcon(idx: Int, texture: Texture2D?): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), OBJECT to texture)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemIconPtr, NIL)
  }

  /**
   * Sets whether the item at index [idx] is disabled.
   * Disabled items are drawn differently in the dropdown and are not selectable by the user. If the
   * current selected item is set as disabled, it will remain selected.
   */
  public final fun setItemDisabled(idx: Int, disabled: Boolean): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), BOOL to disabled)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemDisabledPtr, NIL)
  }

  /**
   * Sets the ID of the item at index [idx].
   */
  public final fun setItemId(idx: Int, id: Int): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), LONG to id.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setItemIdPtr, NIL)
  }

  /**
   * Sets the metadata of an item. Metadata may be of any type and can be used to store extra
   * information about an item, such as an external string ID.
   */
  public final fun setItemMetadata(idx: Int, metadata: Any?): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), ANY to metadata)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemMetadataPtr, NIL)
  }

  /**
   * Sets the tooltip of the item at index [idx].
   */
  public final fun setItemTooltip(idx: Int, tooltip: String): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), STRING to tooltip)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemTooltipPtr, NIL)
  }

  /**
   * Returns the text of the item at index [idx].
   */
  public final fun getItemText(idx: Int): String {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemTextPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns the icon of the item at index [idx].
   */
  public final fun getItemIcon(idx: Int): Texture2D? {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemIconPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Texture2D?)
  }

  /**
   * Returns the ID of the item at index [idx].
   */
  public final fun getItemId(idx: Int): Int {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the index of the item with the given [id].
   */
  public final fun getItemIndex(id: Int): Int {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemIndexPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Retrieves the metadata of an item. Metadata may be any type and can be used to store extra
   * information about an item, such as an external string ID.
   */
  public final fun getItemMetadata(idx: Int): Any? {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemMetadataPtr, ANY)
    return (TransferContext.readReturnValue(ANY) as Any?)
  }

  /**
   * Returns the tooltip of the item at index [idx].
   */
  public final fun getItemTooltip(idx: Int): String {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemTooltipPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns `true` if the item at index [idx] is disabled.
   */
  public final fun isItemDisabled(idx: Int): Boolean {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isItemDisabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if the item at index [idx] is marked as a separator.
   */
  public final fun isItemSeparator(idx: Int): Boolean {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isItemSeparatorPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Adds a separator to the list of items. Separators help to group items, and can optionally be
   * given a [text] header. A separator also gets an index assigned, and is appended at the end of the
   * item list.
   */
  @JvmOverloads
  public final fun addSeparator(text: String = ""): Unit {
    TransferContext.writeArguments(STRING to text)
    TransferContext.callMethod(rawPtr, MethodBindings.addSeparatorPtr, NIL)
  }

  /**
   * Clears all the items in the [OptionButton].
   */
  public final fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearPtr, NIL)
  }

  /**
   * Selects an item by index and makes it the current item. This will work even if the item is
   * disabled.
   * Passing `-1` as the index deselects any currently selected item.
   */
  public final fun select(idx: Int): Unit {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.selectPtr, NIL)
  }

  public final fun getSelected(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSelectedPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the ID of the selected item, or `-1` if no item is selected.
   */
  public final fun getSelectedId(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSelectedIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Gets the metadata of the selected item. Metadata for items can be set using [setItemMetadata].
   */
  public final fun getSelectedMetadata(): Any? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSelectedMetadataPtr, ANY)
    return (TransferContext.readReturnValue(ANY) as Any?)
  }

  /**
   * Removes the item at index [idx].
   */
  public final fun removeItem(idx: Int): Unit {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeItemPtr, NIL)
  }

  /**
   * Returns the [PopupMenu] contained in this button.
   * **Warning:** This is a required internal node, removing and freeing it may cause a crash. If
   * you wish to hide it or any of its children, use their [Window.visible] property.
   */
  public final fun getPopup(): PopupMenu? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPopupPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as PopupMenu?)
  }

  /**
   * Adjusts popup position and sizing for the [OptionButton], then shows the [PopupMenu]. Prefer
   * this over using `get_popup().popup()`.
   */
  public final fun showPopup(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.showPopupPtr, NIL)
  }

  public final fun setItemCount(count: Int): Unit {
    TransferContext.writeArguments(LONG to count.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setItemCountPtr, NIL)
  }

  public final fun getItemCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getItemCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns `true` if this button contains at least one item which is not disabled, or marked as a
   * separator.
   */
  public final fun hasSelectableItems(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.hasSelectableItemsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the index of the first item which is not disabled, or marked as a separator. If
   * [fromLast] is `true`, the items will be searched in reverse order.
   * Returns `-1` if no item is found.
   */
  @JvmOverloads
  public final fun getSelectableItem(fromLast: Boolean = false): Int {
    TransferContext.writeArguments(BOOL to fromLast)
    TransferContext.callMethod(rawPtr, MethodBindings.getSelectableItemPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setFitToLongestItem(fit: Boolean): Unit {
    TransferContext.writeArguments(BOOL to fit)
    TransferContext.callMethod(rawPtr, MethodBindings.setFitToLongestItemPtr, NIL)
  }

  public final fun isFitToLongestItem(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isFitToLongestItemPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setAllowReselect(allow: Boolean): Unit {
    TransferContext.writeArguments(BOOL to allow)
    TransferContext.callMethod(rawPtr, MethodBindings.setAllowReselectPtr, NIL)
  }

  public final fun getAllowReselect(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAllowReselectPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * If `true`, shortcuts are disabled and cannot be used to trigger the button.
   */
  public final fun setDisableShortcuts(disabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to disabled)
    TransferContext.callMethod(rawPtr, MethodBindings.setDisableShortcutsPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val addItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OptionButton", "add_item", 2697778442)

    public val addIconItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OptionButton", "add_icon_item", 3781678508)

    public val setItemTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OptionButton", "set_item_text", 501894301)

    public val setItemIconPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OptionButton", "set_item_icon", 666127730)

    public val setItemDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OptionButton", "set_item_disabled", 300928843)

    public val setItemIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OptionButton", "set_item_id", 3937882851)

    public val setItemMetadataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OptionButton", "set_item_metadata", 2152698145)

    public val setItemTooltipPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OptionButton", "set_item_tooltip", 501894301)

    public val getItemTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OptionButton", "get_item_text", 844755477)

    public val getItemIconPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OptionButton", "get_item_icon", 3536238170)

    public val getItemIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OptionButton", "get_item_id", 923996154)

    public val getItemIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OptionButton", "get_item_index", 923996154)

    public val getItemMetadataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OptionButton", "get_item_metadata", 4227898402)

    public val getItemTooltipPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OptionButton", "get_item_tooltip", 844755477)

    public val isItemDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OptionButton", "is_item_disabled", 1116898809)

    public val isItemSeparatorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OptionButton", "is_item_separator", 1116898809)

    public val addSeparatorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OptionButton", "add_separator", 3005725572)

    public val clearPtr: VoidPtr = TypeManager.getMethodBindPtr("OptionButton", "clear", 3218959716)

    public val selectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OptionButton", "select", 1286410249)

    public val getSelectedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OptionButton", "get_selected", 3905245786)

    public val getSelectedIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OptionButton", "get_selected_id", 3905245786)

    public val getSelectedMetadataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OptionButton", "get_selected_metadata", 1214101251)

    public val removeItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OptionButton", "remove_item", 1286410249)

    public val getPopupPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OptionButton", "get_popup", 229722558)

    public val showPopupPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OptionButton", "show_popup", 3218959716)

    public val setItemCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OptionButton", "set_item_count", 1286410249)

    public val getItemCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OptionButton", "get_item_count", 3905245786)

    public val hasSelectableItemsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OptionButton", "has_selectable_items", 36873697)

    public val getSelectableItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OptionButton", "get_selectable_item", 894402480)

    public val setFitToLongestItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OptionButton", "set_fit_to_longest_item", 2586408642)

    public val isFitToLongestItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OptionButton", "is_fit_to_longest_item", 36873697)

    public val setAllowReselectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OptionButton", "set_allow_reselect", 2586408642)

    public val getAllowReselectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OptionButton", "get_allow_reselect", 36873697)

    public val setDisableShortcutsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OptionButton", "set_disable_shortcuts", 2586408642)
  }
}
