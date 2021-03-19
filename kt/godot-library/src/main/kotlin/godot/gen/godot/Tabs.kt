// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.Rect2
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.RECT2
import godot.core.VariantType.STRING
import godot.signals.Signal1
import godot.signals.signal
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.Suppress

/**
 * Tabs control.
 * 
 * Simple tabs control, similar to [godot.TabContainer] but is only in charge of drawing tabs, not interact with children.
 */
@GodotBaseType
open class Tabs : Control() {
  /**
   * Emitted when the active tab is rearranged via mouse drag. See [dragToRearrangeEnabled].
   */
  val repositionActiveTabRequest: Signal1<Long> by signal("idx_to")

  /**
   * Emitted when a tab is right-clicked.
   */
  val rightButtonPressed: Signal1<Long> by signal("tab")

  /**
   * Emitted when switching to another tab.
   */
  val tabChanged: Signal1<Long> by signal("tab")

  /**
   * Emitted when a tab is clicked, even if it is the current tab.
   */
  val tabClicked: Signal1<Long> by signal("tab")

  /**
   * Emitted when a tab is closed.
   */
  val tabClose: Signal1<Long> by signal("tab")

  /**
   * Emitted when a tab is hovered by the mouse.
   */
  val tabHover: Signal1<Long> by signal("tab")

  /**
   * Select tab at index `tab_idx`.
   */
  open var currentTab: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABS_GET_CURRENT_TAB, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABS_SET_CURRENT_TAB, NIL)
    }

  /**
   * If `true`, tabs can be rearranged with mouse drag.
   */
  open var dragToRearrangeEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TABS_GET_DRAG_TO_REARRANGE_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TABS_SET_DRAG_TO_REARRANGE_ENABLED, NIL)
    }

  /**
   * if `true`, the mouse's scroll wheel cab be used to navigate the scroll view.
   */
  open var scrollingEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABS_GET_SCROLLING_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABS_SET_SCROLLING_ENABLED, NIL)
    }

  /**
   * The alignment of all tabs. See [enum TabAlign] for details.
   */
  open var tabAlign: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABS_GET_TAB_ALIGN, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABS_SET_TAB_ALIGN, NIL)
    }

  /**
   * Sets when the close button will appear on the tabs. See [enum CloseButtonDisplayPolicy] for details.
   */
  open var tabCloseDisplayPolicy: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABS_GET_TAB_CLOSE_DISPLAY_POLICY,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABS_SET_TAB_CLOSE_DISPLAY_POLICY,
          NIL)
    }

  override fun __new() {
    callConstructor(ENGINECLASS_TABS)
  }

  override fun _guiInput(event: InputEvent) {
  }

  open fun _onMouseExited() {
  }

  open fun _updateHover() {
  }

  /**
   * Adds a new tab.
   */
  open fun addTab(title: String = "", icon: Texture? = null) {
    TransferContext.writeArguments(STRING to title, OBJECT to icon)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABS_ADD_TAB, NIL)
  }

  /**
   * Moves the scroll view to make the tab visible.
   */
  open fun ensureTabVisible(idx: Long) {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABS_ENSURE_TAB_VISIBLE, NIL)
  }

  /**
   * Returns `true` if the offset buttons (the ones that appear when there's not enough space for all tabs) are visible.
   */
  open fun getOffsetButtonsVisible(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABS_GET_OFFSET_BUTTONS_VISIBLE,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if select with right mouse button is enabled.
   */
  open fun getSelectWithRmb(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABS_GET_SELECT_WITH_RMB, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the number of tabs.
   */
  open fun getTabCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABS_GET_TAB_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns `true` if the tab at index `tab_idx` is disabled.
   */
  open fun getTabDisabled(tabIdx: Long): Boolean {
    TransferContext.writeArguments(LONG to tabIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABS_GET_TAB_DISABLED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the [godot.Texture] for the tab at index `tab_idx` or `null` if the tab has no [godot.Texture].
   */
  open fun getTabIcon(tabIdx: Long): Texture? {
    TransferContext.writeArguments(LONG to tabIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABS_GET_TAB_ICON, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Texture?
  }

  /**
   * Returns the number of hidden tabs offsetted to the left.
   */
  open fun getTabOffset(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABS_GET_TAB_OFFSET, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns tab [godot.core.Rect2] with local position and size.
   */
  open fun getTabRect(tabIdx: Long): Rect2 {
    TransferContext.writeArguments(LONG to tabIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABS_GET_TAB_RECT, RECT2)
    return TransferContext.readReturnValue(RECT2, false) as Rect2
  }

  /**
   * Returns the title of the tab at index `tab_idx`. Tab titles default to the name of the indexed child node, but this can be overridden with [setTabTitle].
   */
  open fun getTabTitle(tabIdx: Long): String {
    TransferContext.writeArguments(LONG to tabIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABS_GET_TAB_TITLE, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the [godot.Tabs]' rearrange group ID.
   */
  open fun getTabsRearrangeGroup(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABS_GET_TABS_REARRANGE_GROUP, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Moves a tab from `from` to `to`.
   */
  open fun moveTab(from: Long, to: Long) {
    TransferContext.writeArguments(LONG to from, LONG to to)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABS_MOVE_TAB, NIL)
  }

  /**
   * Removes the tab at index `tab_idx`.
   */
  open fun removeTab(tabIdx: Long) {
    TransferContext.writeArguments(LONG to tabIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABS_REMOVE_TAB, NIL)
  }

  /**
   * If `true`, enables selecting a tab with the right mouse button.
   */
  open fun setSelectWithRmb(enabled: Boolean) {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABS_SET_SELECT_WITH_RMB, NIL)
  }

  /**
   * If `disabled` is `false`, hides the tab at index `tab_idx`.
   *
   * **Note:** Its title text will remain unless it is also removed with [setTabTitle].
   */
  open fun setTabDisabled(tabIdx: Long, disabled: Boolean) {
    TransferContext.writeArguments(LONG to tabIdx, BOOL to disabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABS_SET_TAB_DISABLED, NIL)
  }

  /**
   * Sets an `icon` for the tab at index `tab_idx`.
   */
  open fun setTabIcon(tabIdx: Long, icon: Texture) {
    TransferContext.writeArguments(LONG to tabIdx, OBJECT to icon)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABS_SET_TAB_ICON, NIL)
  }

  /**
   * Sets a `title` for the tab at index `tab_idx`.
   */
  open fun setTabTitle(tabIdx: Long, title: String) {
    TransferContext.writeArguments(LONG to tabIdx, STRING to title)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABS_SET_TAB_TITLE, NIL)
  }

  /**
   * Defines the rearrange group ID. Choose for each [godot.Tabs] the same value to dragging tabs between [godot.Tabs]. Enable drag with `set_drag_to_rearrange_enabled(true)`.
   */
  open fun setTabsRearrangeGroup(groupId: Long) {
    TransferContext.writeArguments(LONG to groupId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABS_SET_TABS_REARRANGE_GROUP, NIL)
  }

  enum class CloseButtonDisplayPolicy(
    id: Long
  ) {
    /**
     * Never show the close buttons.
     */
    CLOSE_BUTTON_SHOW_NEVER(0),

    /**
     * Only show the close button on the currently active tab.
     */
    CLOSE_BUTTON_SHOW_ACTIVE_ONLY(1),

    /**
     * Show the close button on all tabs.
     */
    CLOSE_BUTTON_SHOW_ALWAYS(2),

    /**
     * Represents the size of the [enum CloseButtonDisplayPolicy] enum.
     */
    CLOSE_BUTTON_MAX(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class TabAlign(
    id: Long
  ) {
    /**
     * Align the tabs to the left.
     */
    ALIGN_LEFT(0),

    /**
     * Align the tabs to the center.
     */
    ALIGN_CENTER(1),

    /**
     * Align the tabs to the right.
     */
    ALIGN_RIGHT(2),

    /**
     * Represents the size of the [enum TabAlign] enum.
     */
    ALIGN_MAX(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    /**
     * Align the tabs to the center.
     */
    final const val ALIGN_CENTER: Long = 1

    /**
     * Align the tabs to the left.
     */
    final const val ALIGN_LEFT: Long = 0

    /**
     * Represents the size of the [enum TabAlign] enum.
     */
    final const val ALIGN_MAX: Long = 3

    /**
     * Align the tabs to the right.
     */
    final const val ALIGN_RIGHT: Long = 2

    /**
     * Represents the size of the [enum CloseButtonDisplayPolicy] enum.
     */
    final const val CLOSE_BUTTON_MAX: Long = 3

    /**
     * Only show the close button on the currently active tab.
     */
    final const val CLOSE_BUTTON_SHOW_ACTIVE_ONLY: Long = 1

    /**
     * Show the close button on all tabs.
     */
    final const val CLOSE_BUTTON_SHOW_ALWAYS: Long = 2

    /**
     * Never show the close buttons.
     */
    final const val CLOSE_BUTTON_SHOW_NEVER: Long = 0
  }
}
