// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.Control
import godot.`annotation`.GodotBaseType
import godot.core.Rect2
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.RECT2
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.signals.Signal1
import godot.signals.signal
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Tab bar control.
 *
 * Simple tabs control, similar to [godot.TabContainer] but is only in charge of drawing tabs, not interacting with children.
 */
@GodotBaseType
public open class TabBar : Control() {
  /**
   * Emitted when a tab is hovered by the mouse.
   */
  public val tabHovered: Signal1<Long> by signal("tab")

  /**
   * Emitted when the active tab is rearranged via mouse drag. See [dragToRearrangeEnabled].
   */
  public val activeTabRearranged: Signal1<Long> by signal("idxTo")

  /**
   * Emitted when a tab is right-clicked. [selectWithRmb] must be enabled.
   */
  public val tabRmbClicked: Signal1<Long> by signal("tab")

  /**
   * Emitted when a tab is clicked, even if it is the current tab.
   */
  public val tabClicked: Signal1<Long> by signal("tab")

  /**
   * Emitted when a tab's right button is pressed. See [setTabButtonIcon].
   */
  public val tabButtonPressed: Signal1<Long> by signal("tab")

  /**
   * Emitted when a tab is selected via click or script, even if it is the current tab.
   */
  public val tabSelected: Signal1<Long> by signal("tab")

  /**
   * Emitted when switching to another tab.
   */
  public val tabChanged: Signal1<Long> by signal("tab")

  /**
   * Emitted when a tab's close button is pressed.
   *
   * **Note:** Tabs are not removed automatically once the close button is pressed, this behavior needs to be programmed manually. For example:
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * $TabBar.tab_close_pressed.connect($TabBar.remove_tab)
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * GetNode<TabBar>("TabBar").TabClosePressed += GetNode<TabBar>("TabBar").RemoveTab;
   *
   * [/csharp]
   *
   * [/codeblocks]
   */
  public val tabClosePressed: Signal1<Long> by signal("tab")

  /**
   * Select tab at index `tab_idx`.
   */
  public var currentTab: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_GET_CURRENT_TAB, LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_SET_CURRENT_TAB, NIL.ordinal)
    }

  /**
   * Sets the position at which tabs will be placed. See [enum AlignmentMode] for details.
   */
  public var tabAlignment: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_GET_TAB_ALIGNMENT, LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_SET_TAB_ALIGNMENT, NIL.ordinal)
    }

  /**
   * If `true`, tabs overflowing this node's width will be hidden, displaying two navigation buttons instead. Otherwise, this node's minimum size is updated so that all tabs are visible.
   */
  public var clipTabs: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_GET_CLIP_TABS, BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_SET_CLIP_TABS, NIL.ordinal)
    }

  /**
   * Sets when the close button will appear on the tabs. See [enum CloseButtonDisplayPolicy] for details.
   */
  public var tabCloseDisplayPolicy: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_GET_TAB_CLOSE_DISPLAY_POLICY,
          LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_SET_TAB_CLOSE_DISPLAY_POLICY,
          NIL.ordinal)
    }

  /**
   * Sets the maximum width which all tabs should be limited to. Unlimited if set to `0`.
   */
  public var maxTabWidth: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_GET_MAX_TAB_WIDTH, LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_SET_MAX_TAB_WIDTH, NIL.ordinal)
    }

  /**
   * if `true`, the mouse's scroll wheel can be used to navigate the scroll view.
   */
  public var scrollingEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_GET_SCROLLING_ENABLED,
          BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_SET_SCROLLING_ENABLED,
          NIL.ordinal)
    }

  /**
   * If `true`, tabs can be rearranged with mouse drag.
   */
  public var dragToRearrangeEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_GET_DRAG_TO_REARRANGE_ENABLED,
          BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_SET_DRAG_TO_REARRANGE_ENABLED,
          NIL.ordinal)
    }

  /**
   * [godot.TabBar]s with the same rearrange group ID will allow dragging the tabs between them. Enable drag with [dragToRearrangeEnabled].
   *
   * Setting this to `-1` will disable rearranging between [godot.TabBar]s.
   */
  public var tabsRearrangeGroup: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_GET_TABS_REARRANGE_GROUP,
          LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_SET_TABS_REARRANGE_GROUP,
          NIL.ordinal)
    }

  /**
   * If `true`, the tab offset will be changed to keep the the currently selected tab visible.
   */
  public var scrollToSelected: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_GET_SCROLL_TO_SELECTED,
          BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_SET_SCROLL_TO_SELECTED,
          NIL.ordinal)
    }

  /**
   * If `true`, enables selecting a tab with the right mouse button.
   */
  public var selectWithRmb: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_GET_SELECT_WITH_RMB,
          BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_SET_SELECT_WITH_RMB,
          NIL.ordinal)
    }

  /**
   * The number of tabs currently in the bar.
   */
  public var tabCount: Material?
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_GET_TAB_COUNT, OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as Material?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_SET_TAB_COUNT, NIL.ordinal)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_TABBAR)
  }

  /**
   * Returns the previously active tab index.
   */
  public fun getPreviousTab(): Long {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_GET_PREVIOUS_TAB, LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Sets a `title` for the tab at index `tab_idx`.
   */
  public fun setTabTitle(tabIdx: Long, title: String): Unit {
    TransferContext.writeArguments(LONG to tabIdx, STRING to title)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_SET_TAB_TITLE, NIL.ordinal)
  }

  /**
   * Returns the title of the tab at index `tab_idx`.
   */
  public fun getTabTitle(tabIdx: Long): String {
    TransferContext.writeArguments(LONG to tabIdx)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_GET_TAB_TITLE, STRING.ordinal)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Sets tab title base writing direction.
   */
  public fun setTabTextDirection(tabIdx: Long, direction: Control.TextDirection): Unit {
    TransferContext.writeArguments(LONG to tabIdx, LONG to direction.id)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_SET_TAB_TEXT_DIRECTION,
        NIL.ordinal)
  }

  /**
   * Returns tab title text base writing direction.
   */
  public fun getTabTextDirection(tabIdx: Long): Control.TextDirection {
    TransferContext.writeArguments(LONG to tabIdx)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_GET_TAB_TEXT_DIRECTION,
        LONG.ordinal)
    return Control.TextDirection.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  public fun setTabOpentypeFeature(
    tabIdx: Long,
    tag: String,
    values: Long
  ): Unit {
    TransferContext.writeArguments(LONG to tabIdx, STRING to tag, LONG to values)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_SET_TAB_OPENTYPE_FEATURE,
        NIL.ordinal)
  }

  public fun getTabOpentypeFeature(tabIdx: Long, tag: String): Long {
    TransferContext.writeArguments(LONG to tabIdx, STRING to tag)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_GET_TAB_OPENTYPE_FEATURE,
        LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public fun clearTabOpentypeFeatures(tabIdx: Long): Unit {
    TransferContext.writeArguments(LONG to tabIdx)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_CLEAR_TAB_OPENTYPE_FEATURES,
        NIL.ordinal)
  }

  /**
   * Sets language code of tab title used for line-breaking and text shaping algorithms, if left empty current locale is used instead.
   */
  public fun setTabLanguage(tabIdx: Long, language: String): Unit {
    TransferContext.writeArguments(LONG to tabIdx, STRING to language)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_SET_TAB_LANGUAGE, NIL.ordinal)
  }

  /**
   * Returns tab title language code.
   */
  public fun getTabLanguage(tabIdx: Long): String {
    TransferContext.writeArguments(LONG to tabIdx)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_GET_TAB_LANGUAGE, STRING.ordinal)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Sets an `icon` for the tab at index `tab_idx`.
   */
  public fun setTabIcon(tabIdx: Long, icon: Texture2D): Unit {
    TransferContext.writeArguments(LONG to tabIdx, OBJECT to icon)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_SET_TAB_ICON, NIL.ordinal)
  }

  /**
   * Returns the [godot.Texture2D] for the tab at index `tab_idx` or `null` if the tab has no [godot.Texture2D].
   */
  public fun getTabIcon(tabIdx: Long): Texture2D? {
    TransferContext.writeArguments(LONG to tabIdx)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_GET_TAB_ICON, OBJECT.ordinal)
    return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
  }

  /**
   * Sets an `icon` for the button of the tab at index `tab_idx` (located to the right, before the close button), making it visible and clickable (See [tabButtonPressed]). Giving it a `null` value will hide the button.
   */
  public fun setTabButtonIcon(tabIdx: Long, icon: Texture2D): Unit {
    TransferContext.writeArguments(LONG to tabIdx, OBJECT to icon)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_SET_TAB_BUTTON_ICON, NIL.ordinal)
  }

  /**
   * Returns the [godot.Texture2D] for the right button of the tab at index `tab_idx` or `null` if the button has no [godot.Texture2D].
   */
  public fun getTabButtonIcon(tabIdx: Long): Texture2D? {
    TransferContext.writeArguments(LONG to tabIdx)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_GET_TAB_BUTTON_ICON,
        OBJECT.ordinal)
    return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
  }

  /**
   * If `disabled` is `true`, disables the tab at index `tab_idx`, making it non-interactable.
   */
  public fun setTabDisabled(tabIdx: Long, disabled: Boolean): Unit {
    TransferContext.writeArguments(LONG to tabIdx, BOOL to disabled)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_SET_TAB_DISABLED, NIL.ordinal)
  }

  /**
   * Returns `true` if the tab at index `tab_idx` is disabled.
   */
  public fun isTabDisabled(tabIdx: Long): Boolean {
    TransferContext.writeArguments(LONG to tabIdx)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_IS_TAB_DISABLED, BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * If `hidden` is `true`, hides the tab at index `tab_idx`, making it disappear from the tab area.
   */
  public fun setTabHidden(tabIdx: Long, hidden: Boolean): Unit {
    TransferContext.writeArguments(LONG to tabIdx, BOOL to hidden)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_SET_TAB_HIDDEN, NIL.ordinal)
  }

  /**
   * Returns `true` if the tab at index `tab_idx` is hidden.
   */
  public fun isTabHidden(tabIdx: Long): Boolean {
    TransferContext.writeArguments(LONG to tabIdx)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_IS_TAB_HIDDEN, BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Removes the tab at index `tab_idx`.
   */
  public fun removeTab(tabIdx: Long): Unit {
    TransferContext.writeArguments(LONG to tabIdx)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_REMOVE_TAB, NIL.ordinal)
  }

  /**
   * Adds a new tab.
   */
  public fun addTab(title: String = "", icon: Texture2D? = null): Unit {
    TransferContext.writeArguments(STRING to title, OBJECT to icon)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_ADD_TAB, NIL.ordinal)
  }

  /**
   * Returns the index of the tab at local coordinates `point`. Returns `-1` if the point is outside the control boundaries or if there's no tab at the queried position.
   */
  public fun getTabIdxAtPoint(point: Vector2): Long {
    TransferContext.writeArguments(VECTOR2 to point)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_GET_TAB_IDX_AT_POINT,
        LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the number of hidden tabs offsetted to the left.
   */
  public fun getTabOffset(): Long {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_GET_TAB_OFFSET, LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns `true` if the offset buttons (the ones that appear when there's not enough space for all tabs) are visible.
   */
  public fun getOffsetButtonsVisible(): Boolean {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_GET_OFFSET_BUTTONS_VISIBLE,
        BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Moves the scroll view to make the tab visible.
   */
  public fun ensureTabVisible(idx: Long): Unit {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_ENSURE_TAB_VISIBLE, NIL.ordinal)
  }

  /**
   * Returns tab [godot.core.Rect2] with local position and size.
   */
  public fun getTabRect(tabIdx: Long): Rect2 {
    TransferContext.writeArguments(LONG to tabIdx)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_GET_TAB_RECT, RECT2.ordinal)
    return TransferContext.readReturnValue(RECT2, false) as Rect2
  }

  /**
   * Moves a tab from `from` to `to`.
   */
  public fun moveTab(from: Long, to: Long): Unit {
    TransferContext.writeArguments(LONG to from, LONG to to)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_MOVE_TAB, NIL.ordinal)
  }

  public enum class AlignmentMode(
    id: Long
  ) {
    /**
     * Places tabs to the left.
     */
    ALIGNMENT_LEFT(0),
    /**
     * Places tabs in the middle.
     */
    ALIGNMENT_CENTER(1),
    /**
     * Places tabs to the right.
     */
    ALIGNMENT_RIGHT(2),
    /**
     * Represents the size of the [enum AlignmentMode] enum.
     */
    ALIGNMENT_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class CloseButtonDisplayPolicy(
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
    CLOSE_BUTTON_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object
}
