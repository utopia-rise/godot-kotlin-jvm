// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Rect2
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.RECT2
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.signals.Signal1
import godot.signals.signal
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * A control that provides a horizontal bar with tabs.
 *
 * A control that provides a horizontal bar with tabs. Similar to [godot.TabContainer] but is only in charge of drawing tabs, not interacting with children.
 */
@GodotBaseType
public open class TabBar : Control() {
  /**
   * Emitted when a tab is selected via click or script, even if it is the current tab.
   */
  public val tabSelected: Signal1<Long> by signal("tab")

  /**
   * Emitted when switching to another tab.
   */
  public val tabChanged: Signal1<Long> by signal("tab")

  /**
   * Emitted when a tab is clicked, even if it is the current tab.
   */
  public val tabClicked: Signal1<Long> by signal("tab")

  /**
   * Emitted when a tab is right-clicked. [selectWithRmb] must be enabled.
   */
  public val tabRmbClicked: Signal1<Long> by signal("tab")

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
   * Emitted when a tab's right button is pressed. See [setTabButtonIcon].
   */
  public val tabButtonPressed: Signal1<Long> by signal("tab")

  /**
   * Emitted when a tab is hovered by the mouse.
   */
  public val tabHovered: Signal1<Long> by signal("tab")

  /**
   * Emitted when the active tab is rearranged via mouse drag. See [dragToRearrangeEnabled].
   */
  public val activeTabRearranged: Signal1<Long> by signal("idxTo")

  /**
   * Select tab at index `tab_idx`.
   */
  public var currentTab: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_GET_CURRENT_TAB, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_SET_CURRENT_TAB, NIL)
    }

  /**
   * Sets the position at which tabs will be placed. See [enum AlignmentMode] for details.
   */
  public var tabAlignment: AlignmentMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_GET_TAB_ALIGNMENT, LONG)
      return TabBar.AlignmentMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_SET_TAB_ALIGNMENT, NIL)
    }

  /**
   * If `true`, tabs overflowing this node's width will be hidden, displaying two navigation buttons instead. Otherwise, this node's minimum size is updated so that all tabs are visible.
   */
  public var clipTabs: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_GET_CLIP_TABS, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_SET_CLIP_TABS, NIL)
    }

  /**
   * Sets when the close button will appear on the tabs. See [enum CloseButtonDisplayPolicy] for details.
   */
  public var tabCloseDisplayPolicy: CloseButtonDisplayPolicy
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TABBAR_GET_TAB_CLOSE_DISPLAY_POLICY, LONG)
      return TabBar.CloseButtonDisplayPolicy.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TABBAR_SET_TAB_CLOSE_DISPLAY_POLICY, NIL)
    }

  /**
   * Sets the maximum width which all tabs should be limited to. Unlimited if set to `0`.
   */
  public var maxTabWidth: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_GET_MAX_TAB_WIDTH, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_SET_MAX_TAB_WIDTH, NIL)
    }

  /**
   * if `true`, the mouse's scroll wheel can be used to navigate the scroll view.
   */
  public var scrollingEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_GET_SCROLLING_ENABLED,
          BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_SET_SCROLLING_ENABLED, NIL)
    }

  /**
   * If `true`, tabs can be rearranged with mouse drag.
   */
  public var dragToRearrangeEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TABBAR_GET_DRAG_TO_REARRANGE_ENABLED, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TABBAR_SET_DRAG_TO_REARRANGE_ENABLED, NIL)
    }

  /**
   * [godot.TabBar]s with the same rearrange group ID will allow dragging the tabs between them. Enable drag with [dragToRearrangeEnabled].
   *
   * Setting this to `-1` will disable rearranging between [godot.TabBar]s.
   */
  public var tabsRearrangeGroup: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_GET_TABS_REARRANGE_GROUP,
          LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_SET_TABS_REARRANGE_GROUP,
          NIL)
    }

  /**
   * If `true`, the tab offset will be changed to keep the currently selected tab visible.
   */
  public var scrollToSelected: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_GET_SCROLL_TO_SELECTED,
          BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_SET_SCROLL_TO_SELECTED,
          NIL)
    }

  /**
   * If `true`, enables selecting a tab with the right mouse button.
   */
  public var selectWithRmb: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_GET_SELECT_WITH_RMB, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_SET_SELECT_WITH_RMB, NIL)
    }

  /**
   * The number of tabs currently in the bar.
   */
  public var tabCount: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_GET_TAB_COUNT, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_SET_TAB_COUNT, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_TABBAR, scriptIndex)
    return true
  }

  /**
   * Returns the previously active tab index.
   */
  public fun getPreviousTab(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_GET_PREVIOUS_TAB, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Sets a [title] for the tab at index [tabIdx].
   */
  public fun setTabTitle(tabIdx: Int, title: String): Unit {
    TransferContext.writeArguments(LONG to tabIdx.toLong(), STRING to title)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_SET_TAB_TITLE, NIL)
  }

  /**
   * Returns the title of the tab at index [tabIdx].
   */
  public fun getTabTitle(tabIdx: Int): String {
    TransferContext.writeArguments(LONG to tabIdx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_GET_TAB_TITLE, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Sets tab title base writing direction.
   */
  public fun setTabTextDirection(tabIdx: Int, direction: Control.TextDirection): Unit {
    TransferContext.writeArguments(LONG to tabIdx.toLong(), LONG to direction.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_SET_TAB_TEXT_DIRECTION, NIL)
  }

  /**
   * Returns tab title text base writing direction.
   */
  public fun getTabTextDirection(tabIdx: Int): Control.TextDirection {
    TransferContext.writeArguments(LONG to tabIdx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_GET_TAB_TEXT_DIRECTION, LONG)
    return Control.TextDirection.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets language code of tab title used for line-breaking and text shaping algorithms, if left empty current locale is used instead.
   */
  public fun setTabLanguage(tabIdx: Int, language: String): Unit {
    TransferContext.writeArguments(LONG to tabIdx.toLong(), STRING to language)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_SET_TAB_LANGUAGE, NIL)
  }

  /**
   * Returns tab title language code.
   */
  public fun getTabLanguage(tabIdx: Int): String {
    TransferContext.writeArguments(LONG to tabIdx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_GET_TAB_LANGUAGE, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Sets an [icon] for the tab at index [tabIdx].
   */
  public fun setTabIcon(tabIdx: Int, icon: Texture2D): Unit {
    TransferContext.writeArguments(LONG to tabIdx.toLong(), OBJECT to icon)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_SET_TAB_ICON, NIL)
  }

  /**
   * Returns the icon for the tab at index [tabIdx] or `null` if the tab has no icon.
   */
  public fun getTabIcon(tabIdx: Int): Texture2D? {
    TransferContext.writeArguments(LONG to tabIdx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_GET_TAB_ICON, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
  }

  /**
   * Sets the maximum allowed width of the icon for the tab at index [tabIdx]. This limit is applied on top of the default size of the icon and on top of [theme_item icon_max_width]. The height is adjusted according to the icon's ratio.
   */
  public fun setTabIconMaxWidth(tabIdx: Int, width: Int): Unit {
    TransferContext.writeArguments(LONG to tabIdx.toLong(), LONG to width.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_SET_TAB_ICON_MAX_WIDTH, NIL)
  }

  /**
   * Returns the maximum allowed width of the icon for the tab at index [tabIdx].
   */
  public fun getTabIconMaxWidth(tabIdx: Int): Int {
    TransferContext.writeArguments(LONG to tabIdx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_GET_TAB_ICON_MAX_WIDTH, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Sets an [icon] for the button of the tab at index [tabIdx] (located to the right, before the close button), making it visible and clickable (See [tabButtonPressed]). Giving it a `null` value will hide the button.
   */
  public fun setTabButtonIcon(tabIdx: Int, icon: Texture2D): Unit {
    TransferContext.writeArguments(LONG to tabIdx.toLong(), OBJECT to icon)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_SET_TAB_BUTTON_ICON, NIL)
  }

  /**
   * Returns the icon for the right button of the tab at index [tabIdx] or `null` if the right button has no icon.
   */
  public fun getTabButtonIcon(tabIdx: Int): Texture2D? {
    TransferContext.writeArguments(LONG to tabIdx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_GET_TAB_BUTTON_ICON, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
  }

  /**
   * If [disabled] is `true`, disables the tab at index [tabIdx], making it non-interactable.
   */
  public fun setTabDisabled(tabIdx: Int, disabled: Boolean): Unit {
    TransferContext.writeArguments(LONG to tabIdx.toLong(), BOOL to disabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_SET_TAB_DISABLED, NIL)
  }

  /**
   * Returns `true` if the tab at index [tabIdx] is disabled.
   */
  public fun isTabDisabled(tabIdx: Int): Boolean {
    TransferContext.writeArguments(LONG to tabIdx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_IS_TAB_DISABLED, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * If [hidden] is `true`, hides the tab at index [tabIdx], making it disappear from the tab area.
   */
  public fun setTabHidden(tabIdx: Int, hidden: Boolean): Unit {
    TransferContext.writeArguments(LONG to tabIdx.toLong(), BOOL to hidden)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_SET_TAB_HIDDEN, NIL)
  }

  /**
   * Returns `true` if the tab at index [tabIdx] is hidden.
   */
  public fun isTabHidden(tabIdx: Int): Boolean {
    TransferContext.writeArguments(LONG to tabIdx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_IS_TAB_HIDDEN, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Sets the metadata value for the tab at index [tabIdx], which can be retrieved later using [getTabMetadata].
   */
  public fun setTabMetadata(tabIdx: Int, metadata: Any?): Unit {
    TransferContext.writeArguments(LONG to tabIdx.toLong(), ANY to metadata)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_SET_TAB_METADATA, NIL)
  }

  /**
   * Returns the metadata value set to the tab at index [tabIdx] using [setTabMetadata]. If no metadata was previously set, returns `null` by default.
   */
  public fun getTabMetadata(tabIdx: Int): Any? {
    TransferContext.writeArguments(LONG to tabIdx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_GET_TAB_METADATA, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  /**
   * Removes the tab at index [tabIdx].
   */
  public fun removeTab(tabIdx: Int): Unit {
    TransferContext.writeArguments(LONG to tabIdx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_REMOVE_TAB, NIL)
  }

  /**
   * Adds a new tab.
   */
  @JvmOverloads
  public fun addTab(title: String = "", icon: Texture2D? = null): Unit {
    TransferContext.writeArguments(STRING to title, OBJECT to icon)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_ADD_TAB, NIL)
  }

  /**
   * Returns the index of the tab at local coordinates [point]. Returns `-1` if the point is outside the control boundaries or if there's no tab at the queried position.
   */
  public fun getTabIdxAtPoint(point: Vector2): Int {
    TransferContext.writeArguments(VECTOR2 to point)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_GET_TAB_IDX_AT_POINT, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the number of hidden tabs offsetted to the left.
   */
  public fun getTabOffset(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_GET_TAB_OFFSET, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns `true` if the offset buttons (the ones that appear when there's not enough space for all tabs) are visible.
   */
  public fun getOffsetButtonsVisible(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_GET_OFFSET_BUTTONS_VISIBLE,
        BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Moves the scroll view to make the tab visible.
   */
  public fun ensureTabVisible(idx: Int): Unit {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_ENSURE_TAB_VISIBLE, NIL)
  }

  /**
   * Returns tab [godot.core.Rect2] with local position and size.
   */
  public fun getTabRect(tabIdx: Int): Rect2 {
    TransferContext.writeArguments(LONG to tabIdx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_GET_TAB_RECT, RECT2)
    return (TransferContext.readReturnValue(RECT2, false) as Rect2)
  }

  /**
   * Moves a tab from [from] to [to].
   */
  public fun moveTab(from: Int, to: Int): Unit {
    TransferContext.writeArguments(LONG to from.toLong(), LONG to to.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_MOVE_TAB, NIL)
  }

  /**
   * Clears all tabs.
   */
  public fun clearTabs(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABBAR_CLEAR_TABS, NIL)
  }

  public enum class AlignmentMode(
    id: Long,
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class CloseButtonDisplayPolicy(
    id: Long,
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object
}
