// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.signal
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.Suppress

/**
 * Tabbed container.
 *
 * Sets the active tab's `visible` property to the value `true`. Sets all other children's to `false`.
 *
 * Ignores non-[godot.Control] children.
 *
 * Individual tabs are always visible unless you use [setTabDisabled] and [setTabTitle] to hide it.
 *
 * To hide only a tab's content, nest the content inside a child [godot.Control], so it receives the [godot.TabContainer]'s visibility setting instead.
 */
@GodotBaseType
open class TabContainer : Container() {
  /**
   * Emitted when the [godot.TabContainer]'s [godot.Popup] button is clicked. See [setPopup] for details.
   */
  val prePopupPressed: Signal0 by signal()

  /**
   * Emitted when switching to another tab.
   */
  val tabChanged: Signal1<Long> by signal("tab")

  /**
   * Emitted when a tab is selected, even if it is the current tab.
   */
  val tabSelected: Signal1<Long> by signal("tab")

  /**
   * If `true`, all tabs are drawn in front of the panel. If `false`, inactive tabs are drawn behind the panel.
   */
  open var allTabsInFront: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TABCONTAINER_GET_ALL_TABS_IN_FRONT, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TABCONTAINER_SET_ALL_TABS_IN_FRONT, NIL)
    }

  /**
   * The current tab index. When set, this index's [godot.Control] node's `visible` property is set to `true` and all others are set to `false`.
   */
  open var currentTab: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABCONTAINER_GET_CURRENT_TAB,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABCONTAINER_SET_CURRENT_TAB, NIL)
    }

  /**
   * If `true`, tabs can be rearranged with mouse drag.
   */
  open var dragToRearrangeEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TABCONTAINER_GET_DRAG_TO_REARRANGE_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TABCONTAINER_SET_DRAG_TO_REARRANGE_ENABLED, NIL)
    }

  /**
   * The alignment of all tabs in the tab container. See the [enum TabAlign] constants for details.
   */
  open var tabAlign: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABCONTAINER_GET_TAB_ALIGN, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABCONTAINER_SET_TAB_ALIGN, NIL)
    }

  /**
   * If `true`, tabs are visible. If `false`, tabs' content and titles are hidden.
   */
  open var tabsVisible: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABCONTAINER_GET_TABS_VISIBLE,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABCONTAINER_SET_TABS_VISIBLE,
          NIL)
    }

  /**
   * If `true`, children [godot.Control] nodes that are hidden have their minimum size take into account in the total, instead of only the currently visible one.
   */
  open var useHiddenTabsForMinSize: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TABCONTAINER_GET_USE_HIDDEN_TABS_FOR_MIN_SIZE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TABCONTAINER_SET_USE_HIDDEN_TABS_FOR_MIN_SIZE, NIL)
    }

  override fun __new() {
    callConstructor(ENGINECLASS_TABCONTAINER)
  }

  open fun _childRenamedCallback() {
  }

  override fun _guiInput(event: InputEvent) {
  }

  open fun _onMouseExited() {
  }

  open fun _onThemeChanged() {
  }

  open fun _updateCurrentTab() {
  }

  /**
   * Returns the child [godot.Control] node located at the active tab index.
   */
  open fun getCurrentTabControl(): Control? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TABCONTAINER_GET_CURRENT_TAB_CONTROL, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Control?
  }

  /**
   * Returns the [godot.Popup] node instance if one has been set already with [setPopup].
   */
  open fun getPopup(): Popup? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABCONTAINER_GET_POPUP, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Popup?
  }

  /**
   * Returns the previously active tab index.
   */
  open fun getPreviousTab(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABCONTAINER_GET_PREVIOUS_TAB, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the [godot.Control] node from the tab at index `tab_idx`.
   */
  open fun getTabControl(tabIdx: Long): Control? {
    TransferContext.writeArguments(LONG to tabIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABCONTAINER_GET_TAB_CONTROL,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Control?
  }

  /**
   * Returns the number of tabs.
   */
  open fun getTabCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABCONTAINER_GET_TAB_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns `true` if the tab at index `tab_idx` is disabled.
   */
  open fun getTabDisabled(tabIdx: Long): Boolean {
    TransferContext.writeArguments(LONG to tabIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABCONTAINER_GET_TAB_DISABLED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the [godot.Texture] for the tab at index `tab_idx` or `null` if the tab has no [godot.Texture].
   */
  open fun getTabIcon(tabIdx: Long): Texture? {
    TransferContext.writeArguments(LONG to tabIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABCONTAINER_GET_TAB_ICON, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Texture?
  }

  /**
   * Returns the title of the tab at index `tab_idx`. Tab titles default to the name of the indexed child node, but this can be overridden with [setTabTitle].
   */
  open fun getTabTitle(tabIdx: Long): String {
    TransferContext.writeArguments(LONG to tabIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABCONTAINER_GET_TAB_TITLE, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the [godot.TabContainer] rearrange group id.
   */
  open fun getTabsRearrangeGroup(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TABCONTAINER_GET_TABS_REARRANGE_GROUP, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * If set on a [godot.Popup] node instance, a popup menu icon appears in the top-right corner of the [godot.TabContainer]. Clicking it will expand the [godot.Popup] node.
   */
  open fun setPopup(popup: Node) {
    TransferContext.writeArguments(OBJECT to popup)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABCONTAINER_SET_POPUP, NIL)
  }

  /**
   * If `disabled` is `false`, hides the tab at index `tab_idx`.
   *
   * **Note:** Its title text will remain, unless also removed with [setTabTitle].
   */
  open fun setTabDisabled(tabIdx: Long, disabled: Boolean) {
    TransferContext.writeArguments(LONG to tabIdx, BOOL to disabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABCONTAINER_SET_TAB_DISABLED, NIL)
  }

  /**
   * Sets an icon for the tab at index `tab_idx`.
   */
  open fun setTabIcon(tabIdx: Long, icon: Texture) {
    TransferContext.writeArguments(LONG to tabIdx, OBJECT to icon)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABCONTAINER_SET_TAB_ICON, NIL)
  }

  /**
   * Sets a title for the tab at index `tab_idx`. Tab titles default to the name of the indexed child node, but this can be overridden with [setTabTitle].
   */
  open fun setTabTitle(tabIdx: Long, title: String) {
    TransferContext.writeArguments(LONG to tabIdx, STRING to title)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABCONTAINER_SET_TAB_TITLE, NIL)
  }

  /**
   * Defines rearrange group id, choose for each [godot.TabContainer] the same value to enable tab drag between [godot.TabContainer]. Enable drag with `set_drag_to_rearrange_enabled(true)`.
   */
  open fun setTabsRearrangeGroup(groupId: Long) {
    TransferContext.writeArguments(LONG to groupId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TABCONTAINER_SET_TABS_REARRANGE_GROUP, NIL)
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
    ALIGN_RIGHT(2);

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
     * Align the tabs to the right.
     */
    final const val ALIGN_RIGHT: Long = 2
  }
}
