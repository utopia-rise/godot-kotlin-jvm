// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotApiMember
import godot.`annotation`.GodotBaseType
import godot.common.interop.VoidPtr
import godot.core.Rect2
import godot.core.Signal1
import godot.core.TypeManager
import godot.core.VariantCaster.ANY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.RECT2
import godot.core.VariantParser.STRING
import godot.core.VariantParser.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

/**
 * A control that provides a horizontal bar with tabs. Similar to [TabContainer] but is only in
 * charge of drawing tabs, not interacting with children.
 */
@GodotBaseType
public open class TabBar : Control() {
  /**
   * Emitted when a tab is selected via click, directional input, or script, even if it is the
   * current tab.
   */
  @GodotApiMember
  public val tabSelected: Signal1<Long> by Signal1

  /**
   * Emitted when switching to another tab.
   */
  @GodotApiMember
  public val tabChanged: Signal1<Long> by Signal1

  /**
   * Emitted when a tab is clicked, even if it is the current tab.
   */
  @GodotApiMember
  public val tabClicked: Signal1<Long> by Signal1

  /**
   * Emitted when a tab is right-clicked. [selectWithRmb] must be enabled.
   */
  @GodotApiMember
  public val tabRmbClicked: Signal1<Long> by Signal1

  /**
   * Emitted when a tab's close button is pressed.
   * **Note:** Tabs are not removed automatically once the close button is pressed, this behavior
   * needs to be programmed manually. For example:
   *
   * gdscript:
   * ```gdscript
   * $TabBar.tab_close_pressed.connect($TabBar.remove_tab)
   * ```
   * csharp:
   * ```csharp
   * GetNode<TabBar>("TabBar").TabClosePressed += GetNode<TabBar>("TabBar").RemoveTab;
   * ```
   */
  @GodotApiMember
  public val tabClosePressed: Signal1<Long> by Signal1

  /**
   * Emitted when a tab's right button is pressed. See [setTabButtonIcon].
   */
  @GodotApiMember
  public val tabButtonPressed: Signal1<Long> by Signal1

  /**
   * Emitted when a tab is hovered by the mouse.
   */
  @GodotApiMember
  public val tabHovered: Signal1<Long> by Signal1

  /**
   * Emitted when the active tab is rearranged via mouse drag. See [dragToRearrangeEnabled].
   */
  @GodotApiMember
  public val activeTabRearranged: Signal1<Long> by Signal1

  /**
   * The index of the current selected tab. A value of `-1` means that no tab is selected and can
   * only be set when [deselectEnabled] is `true` or if all tabs are hidden or disabled.
   */
  public final inline var currentTab: Int
    @JvmName("currentTabProperty")
    get() = getCurrentTab()
    @JvmName("currentTabProperty")
    set(`value`) {
      setCurrentTab(value)
    }

  /**
   * Sets the position at which tabs will be placed. See [AlignmentMode] for details.
   */
  public final inline var tabAlignment: AlignmentMode
    @JvmName("tabAlignmentProperty")
    get() = getTabAlignment()
    @JvmName("tabAlignmentProperty")
    set(`value`) {
      setTabAlignment(value)
    }

  /**
   * If `true`, tabs overflowing this node's width will be hidden, displaying two navigation buttons
   * instead. Otherwise, this node's minimum size is updated so that all tabs are visible.
   */
  public final inline var clipTabs: Boolean
    @JvmName("clipTabsProperty")
    get() = getClipTabs()
    @JvmName("clipTabsProperty")
    set(`value`) {
      setClipTabs(value)
    }

  /**
   * Sets when the close button will appear on the tabs. See [CloseButtonDisplayPolicy] for details.
   */
  public final inline var tabCloseDisplayPolicy: CloseButtonDisplayPolicy
    @JvmName("tabCloseDisplayPolicyProperty")
    get() = getTabCloseDisplayPolicy()
    @JvmName("tabCloseDisplayPolicyProperty")
    set(`value`) {
      setTabCloseDisplayPolicy(value)
    }

  /**
   * Sets the maximum width which all tabs should be limited to. Unlimited if set to `0`.
   */
  public final inline var maxTabWidth: Int
    @JvmName("maxTabWidthProperty")
    get() = getMaxTabWidth()
    @JvmName("maxTabWidthProperty")
    set(`value`) {
      setMaxTabWidth(value)
    }

  /**
   * if `true`, the mouse's scroll wheel can be used to navigate the scroll view.
   */
  public final inline var scrollingEnabled: Boolean
    @JvmName("scrollingEnabledProperty")
    get() = getScrollingEnabled()
    @JvmName("scrollingEnabledProperty")
    set(`value`) {
      setScrollingEnabled(value)
    }

  /**
   * If `true`, tabs can be rearranged with mouse drag.
   */
  public final inline var dragToRearrangeEnabled: Boolean
    @JvmName("dragToRearrangeEnabledProperty")
    get() = getDragToRearrangeEnabled()
    @JvmName("dragToRearrangeEnabledProperty")
    set(`value`) {
      setDragToRearrangeEnabled(value)
    }

  /**
   * [TabBar]s with the same rearrange group ID will allow dragging the tabs between them. Enable
   * drag with [dragToRearrangeEnabled].
   * Setting this to `-1` will disable rearranging between [TabBar]s.
   */
  public final inline var tabsRearrangeGroup: Int
    @JvmName("tabsRearrangeGroupProperty")
    get() = getTabsRearrangeGroup()
    @JvmName("tabsRearrangeGroupProperty")
    set(`value`) {
      setTabsRearrangeGroup(value)
    }

  /**
   * If `true`, the tab offset will be changed to keep the currently selected tab visible.
   */
  public final inline var scrollToSelected: Boolean
    @JvmName("scrollToSelectedProperty")
    get() = getScrollToSelected()
    @JvmName("scrollToSelectedProperty")
    set(`value`) {
      setScrollToSelected(value)
    }

  /**
   * If `true`, enables selecting a tab with the right mouse button.
   */
  public final inline var selectWithRmb: Boolean
    @JvmName("selectWithRmbProperty")
    get() = getSelectWithRmb()
    @JvmName("selectWithRmbProperty")
    set(`value`) {
      setSelectWithRmb(value)
    }

  /**
   * If `true`, all tabs can be deselected so that no tab is selected. Click on the current tab to
   * deselect it.
   */
  public final inline var deselectEnabled: Boolean
    @JvmName("deselectEnabledProperty")
    get() = getDeselectEnabled()
    @JvmName("deselectEnabledProperty")
    set(`value`) {
      setDeselectEnabled(value)
    }

  /**
   * The number of tabs currently in the bar.
   */
  public final inline var tabCount: Int
    @JvmName("tabCountProperty")
    get() = getTabCount()
    @JvmName("tabCountProperty")
    set(`value`) {
      setTabCount(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_TABBAR, scriptIndex)
  }

  public final fun setTabCount(count: Int): Unit {
    TransferContext.writeArguments(LONG to count.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setTabCountPtr, NIL)
  }

  public final fun getTabCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTabCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setCurrentTab(tabIdx: Int): Unit {
    TransferContext.writeArguments(LONG to tabIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setCurrentTabPtr, NIL)
  }

  public final fun getCurrentTab(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCurrentTabPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the previously active tab index.
   */
  public final fun getPreviousTab(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPreviousTabPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Selects the first available tab with lower index than the currently selected. Returns `true` if
   * tab selection changed.
   */
  public final fun selectPreviousAvailable(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.selectPreviousAvailablePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Selects the first available tab with greater index than the currently selected. Returns `true`
   * if tab selection changed.
   */
  public final fun selectNextAvailable(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.selectNextAvailablePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets a [title] for the tab at index [tabIdx].
   */
  public final fun setTabTitle(tabIdx: Int, title: String): Unit {
    TransferContext.writeArguments(LONG to tabIdx.toLong(), STRING to title)
    TransferContext.callMethod(ptr, MethodBindings.setTabTitlePtr, NIL)
  }

  /**
   * Returns the title of the tab at index [tabIdx].
   */
  public final fun getTabTitle(tabIdx: Int): String {
    TransferContext.writeArguments(LONG to tabIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getTabTitlePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Sets a [tooltip] for tab at index [tabIdx].
   * **Note:** By default, if the [tooltip] is empty and the tab text is truncated (not all
   * characters fit into the tab), the title will be displayed as a tooltip. To hide the tooltip,
   * assign `" "` as the [tooltip] text.
   */
  public final fun setTabTooltip(tabIdx: Int, tooltip: String): Unit {
    TransferContext.writeArguments(LONG to tabIdx.toLong(), STRING to tooltip)
    TransferContext.callMethod(ptr, MethodBindings.setTabTooltipPtr, NIL)
  }

  /**
   * Returns the tooltip text of the tab at index [tabIdx].
   */
  public final fun getTabTooltip(tabIdx: Int): String {
    TransferContext.writeArguments(LONG to tabIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getTabTooltipPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Sets tab title base writing direction.
   */
  public final fun setTabTextDirection(tabIdx: Int, direction: Control.TextDirection): Unit {
    TransferContext.writeArguments(LONG to tabIdx.toLong(), LONG to direction.id)
    TransferContext.callMethod(ptr, MethodBindings.setTabTextDirectionPtr, NIL)
  }

  /**
   * Returns tab title text base writing direction.
   */
  public final fun getTabTextDirection(tabIdx: Int): Control.TextDirection {
    TransferContext.writeArguments(LONG to tabIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getTabTextDirectionPtr, LONG)
    return Control.TextDirection.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets language code of tab title used for line-breaking and text shaping algorithms, if left
   * empty current locale is used instead.
   */
  public final fun setTabLanguage(tabIdx: Int, language: String): Unit {
    TransferContext.writeArguments(LONG to tabIdx.toLong(), STRING to language)
    TransferContext.callMethod(ptr, MethodBindings.setTabLanguagePtr, NIL)
  }

  /**
   * Returns tab title language code.
   */
  public final fun getTabLanguage(tabIdx: Int): String {
    TransferContext.writeArguments(LONG to tabIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getTabLanguagePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Sets an [icon] for the tab at index [tabIdx].
   */
  public final fun setTabIcon(tabIdx: Int, icon: Texture2D?): Unit {
    TransferContext.writeArguments(LONG to tabIdx.toLong(), OBJECT to icon)
    TransferContext.callMethod(ptr, MethodBindings.setTabIconPtr, NIL)
  }

  /**
   * Returns the icon for the tab at index [tabIdx] or `null` if the tab has no icon.
   */
  public final fun getTabIcon(tabIdx: Int): Texture2D? {
    TransferContext.writeArguments(LONG to tabIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getTabIconPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Texture2D?)
  }

  /**
   * Sets the maximum allowed width of the icon for the tab at index [tabIdx]. This limit is applied
   * on top of the default size of the icon and on top of [theme_item icon_max_width]. The height is
   * adjusted according to the icon's ratio.
   */
  public final fun setTabIconMaxWidth(tabIdx: Int, width: Int): Unit {
    TransferContext.writeArguments(LONG to tabIdx.toLong(), LONG to width.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setTabIconMaxWidthPtr, NIL)
  }

  /**
   * Returns the maximum allowed width of the icon for the tab at index [tabIdx].
   */
  public final fun getTabIconMaxWidth(tabIdx: Int): Int {
    TransferContext.writeArguments(LONG to tabIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getTabIconMaxWidthPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Sets an [icon] for the button of the tab at index [tabIdx] (located to the right, before the
   * close button), making it visible and clickable (See [signal tab_button_pressed]). Giving it a
   * `null` value will hide the button.
   */
  public final fun setTabButtonIcon(tabIdx: Int, icon: Texture2D?): Unit {
    TransferContext.writeArguments(LONG to tabIdx.toLong(), OBJECT to icon)
    TransferContext.callMethod(ptr, MethodBindings.setTabButtonIconPtr, NIL)
  }

  /**
   * Returns the icon for the right button of the tab at index [tabIdx] or `null` if the right
   * button has no icon.
   */
  public final fun getTabButtonIcon(tabIdx: Int): Texture2D? {
    TransferContext.writeArguments(LONG to tabIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getTabButtonIconPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Texture2D?)
  }

  /**
   * If [disabled] is `true`, disables the tab at index [tabIdx], making it non-interactable.
   */
  public final fun setTabDisabled(tabIdx: Int, disabled: Boolean): Unit {
    TransferContext.writeArguments(LONG to tabIdx.toLong(), BOOL to disabled)
    TransferContext.callMethod(ptr, MethodBindings.setTabDisabledPtr, NIL)
  }

  /**
   * Returns `true` if the tab at index [tabIdx] is disabled.
   */
  public final fun isTabDisabled(tabIdx: Int): Boolean {
    TransferContext.writeArguments(LONG to tabIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.isTabDisabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * If [hidden] is `true`, hides the tab at index [tabIdx], making it disappear from the tab area.
   */
  public final fun setTabHidden(tabIdx: Int, hidden: Boolean): Unit {
    TransferContext.writeArguments(LONG to tabIdx.toLong(), BOOL to hidden)
    TransferContext.callMethod(ptr, MethodBindings.setTabHiddenPtr, NIL)
  }

  /**
   * Returns `true` if the tab at index [tabIdx] is hidden.
   */
  public final fun isTabHidden(tabIdx: Int): Boolean {
    TransferContext.writeArguments(LONG to tabIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.isTabHiddenPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets the metadata value for the tab at index [tabIdx], which can be retrieved later using
   * [getTabMetadata].
   */
  public final fun setTabMetadata(tabIdx: Int, metadata: Any?): Unit {
    TransferContext.writeArguments(LONG to tabIdx.toLong(), ANY to metadata)
    TransferContext.callMethod(ptr, MethodBindings.setTabMetadataPtr, NIL)
  }

  /**
   * Returns the metadata value set to the tab at index [tabIdx] using [setTabMetadata]. If no
   * metadata was previously set, returns `null` by default.
   */
  public final fun getTabMetadata(tabIdx: Int): Any? {
    TransferContext.writeArguments(LONG to tabIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getTabMetadataPtr, ANY)
    return (TransferContext.readReturnValue(ANY) as Any?)
  }

  /**
   * Removes the tab at index [tabIdx].
   */
  public final fun removeTab(tabIdx: Int): Unit {
    TransferContext.writeArguments(LONG to tabIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.removeTabPtr, NIL)
  }

  /**
   * Adds a new tab.
   */
  @JvmOverloads
  public final fun addTab(title: String = "", icon: Texture2D? = null): Unit {
    TransferContext.writeArguments(STRING to title, OBJECT to icon)
    TransferContext.callMethod(ptr, MethodBindings.addTabPtr, NIL)
  }

  /**
   * Returns the index of the tab at local coordinates [point]. Returns `-1` if the point is outside
   * the control boundaries or if there's no tab at the queried position.
   */
  public final fun getTabIdxAtPoint(point: Vector2): Int {
    TransferContext.writeArguments(VECTOR2 to point)
    TransferContext.callMethod(ptr, MethodBindings.getTabIdxAtPointPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setTabAlignment(alignment: AlignmentMode): Unit {
    TransferContext.writeArguments(LONG to alignment.id)
    TransferContext.callMethod(ptr, MethodBindings.setTabAlignmentPtr, NIL)
  }

  public final fun getTabAlignment(): AlignmentMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTabAlignmentPtr, LONG)
    return TabBar.AlignmentMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setClipTabs(clipTabs: Boolean): Unit {
    TransferContext.writeArguments(BOOL to clipTabs)
    TransferContext.callMethod(ptr, MethodBindings.setClipTabsPtr, NIL)
  }

  public final fun getClipTabs(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getClipTabsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the number of hidden tabs offsetted to the left.
   */
  public final fun getTabOffset(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTabOffsetPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns `true` if the offset buttons (the ones that appear when there's not enough space for
   * all tabs) are visible.
   */
  public final fun getOffsetButtonsVisible(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getOffsetButtonsVisiblePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Moves the scroll view to make the tab visible.
   */
  public final fun ensureTabVisible(idx: Int): Unit {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.ensureTabVisiblePtr, NIL)
  }

  /**
   * Returns tab [Rect2] with local position and size.
   */
  public final fun getTabRect(tabIdx: Int): Rect2 {
    TransferContext.writeArguments(LONG to tabIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getTabRectPtr, RECT2)
    return (TransferContext.readReturnValue(RECT2) as Rect2)
  }

  /**
   * Moves a tab from [from] to [to].
   */
  public final fun moveTab(from: Int, to: Int): Unit {
    TransferContext.writeArguments(LONG to from.toLong(), LONG to to.toLong())
    TransferContext.callMethod(ptr, MethodBindings.moveTabPtr, NIL)
  }

  public final fun setTabCloseDisplayPolicy(policy: CloseButtonDisplayPolicy): Unit {
    TransferContext.writeArguments(LONG to policy.id)
    TransferContext.callMethod(ptr, MethodBindings.setTabCloseDisplayPolicyPtr, NIL)
  }

  public final fun getTabCloseDisplayPolicy(): CloseButtonDisplayPolicy {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTabCloseDisplayPolicyPtr, LONG)
    return TabBar.CloseButtonDisplayPolicy.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setMaxTabWidth(width: Int): Unit {
    TransferContext.writeArguments(LONG to width.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setMaxTabWidthPtr, NIL)
  }

  public final fun getMaxTabWidth(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMaxTabWidthPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setScrollingEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setScrollingEnabledPtr, NIL)
  }

  public final fun getScrollingEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getScrollingEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setDragToRearrangeEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setDragToRearrangeEnabledPtr, NIL)
  }

  public final fun getDragToRearrangeEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDragToRearrangeEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setTabsRearrangeGroup(groupId: Int): Unit {
    TransferContext.writeArguments(LONG to groupId.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setTabsRearrangeGroupPtr, NIL)
  }

  public final fun getTabsRearrangeGroup(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTabsRearrangeGroupPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setScrollToSelected(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setScrollToSelectedPtr, NIL)
  }

  public final fun getScrollToSelected(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getScrollToSelectedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setSelectWithRmb(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setSelectWithRmbPtr, NIL)
  }

  public final fun getSelectWithRmb(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSelectWithRmbPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setDeselectEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setDeselectEnabledPtr, NIL)
  }

  public final fun getDeselectEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDeselectEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Clears all tabs.
   */
  public final fun clearTabs(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.clearTabsPtr, NIL)
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
     * Represents the size of the [AlignmentMode] enum.
     */
    ALIGNMENT_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): AlignmentMode = entries.single { it.id == `value` }
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
     * Represents the size of the [CloseButtonDisplayPolicy] enum.
     */
    CLOSE_BUTTON_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): CloseButtonDisplayPolicy = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setTabCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "set_tab_count", 1286410249)

    public val getTabCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "get_tab_count", 3905245786)

    public val setCurrentTabPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "set_current_tab", 1286410249)

    public val getCurrentTabPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "get_current_tab", 3905245786)

    public val getPreviousTabPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "get_previous_tab", 3905245786)

    public val selectPreviousAvailablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "select_previous_available", 2240911060)

    public val selectNextAvailablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "select_next_available", 2240911060)

    public val setTabTitlePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "set_tab_title", 501894301)

    public val getTabTitlePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "get_tab_title", 844755477)

    public val setTabTooltipPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "set_tab_tooltip", 501894301)

    public val getTabTooltipPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "get_tab_tooltip", 844755477)

    public val setTabTextDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "set_tab_text_direction", 1707680378)

    public val getTabTextDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "get_tab_text_direction", 4235602388)

    public val setTabLanguagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "set_tab_language", 501894301)

    public val getTabLanguagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "get_tab_language", 844755477)

    public val setTabIconPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "set_tab_icon", 666127730)

    public val getTabIconPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "get_tab_icon", 3536238170)

    public val setTabIconMaxWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "set_tab_icon_max_width", 3937882851)

    public val getTabIconMaxWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "get_tab_icon_max_width", 923996154)

    public val setTabButtonIconPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "set_tab_button_icon", 666127730)

    public val getTabButtonIconPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "get_tab_button_icon", 3536238170)

    public val setTabDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "set_tab_disabled", 300928843)

    public val isTabDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "is_tab_disabled", 1116898809)

    public val setTabHiddenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "set_tab_hidden", 300928843)

    public val isTabHiddenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "is_tab_hidden", 1116898809)

    public val setTabMetadataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "set_tab_metadata", 2152698145)

    public val getTabMetadataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "get_tab_metadata", 4227898402)

    public val removeTabPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "remove_tab", 1286410249)

    public val addTabPtr: VoidPtr = TypeManager.getMethodBindPtr("TabBar", "add_tab", 1465444425)

    public val getTabIdxAtPointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "get_tab_idx_at_point", 3820158470)

    public val setTabAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "set_tab_alignment", 2413632353)

    public val getTabAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "get_tab_alignment", 2178122193)

    public val setClipTabsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "set_clip_tabs", 2586408642)

    public val getClipTabsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "get_clip_tabs", 36873697)

    public val getTabOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "get_tab_offset", 3905245786)

    public val getOffsetButtonsVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "get_offset_buttons_visible", 36873697)

    public val ensureTabVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "ensure_tab_visible", 1286410249)

    public val getTabRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "get_tab_rect", 3327874267)

    public val moveTabPtr: VoidPtr = TypeManager.getMethodBindPtr("TabBar", "move_tab", 3937882851)

    public val setTabCloseDisplayPolicyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "set_tab_close_display_policy", 2212906737)

    public val getTabCloseDisplayPolicyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "get_tab_close_display_policy", 2956568028)

    public val setMaxTabWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "set_max_tab_width", 1286410249)

    public val getMaxTabWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "get_max_tab_width", 3905245786)

    public val setScrollingEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "set_scrolling_enabled", 2586408642)

    public val getScrollingEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "get_scrolling_enabled", 36873697)

    public val setDragToRearrangeEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "set_drag_to_rearrange_enabled", 2586408642)

    public val getDragToRearrangeEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "get_drag_to_rearrange_enabled", 36873697)

    public val setTabsRearrangeGroupPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "set_tabs_rearrange_group", 1286410249)

    public val getTabsRearrangeGroupPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "get_tabs_rearrange_group", 3905245786)

    public val setScrollToSelectedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "set_scroll_to_selected", 2586408642)

    public val getScrollToSelectedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "get_scroll_to_selected", 36873697)

    public val setSelectWithRmbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "set_select_with_rmb", 2586408642)

    public val getSelectWithRmbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "get_select_with_rmb", 36873697)

    public val setDeselectEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "set_deselect_enabled", 2586408642)

    public val getDeselectEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "get_deselect_enabled", 36873697)

    public val clearTabsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabBar", "clear_tabs", 3218959716)
  }
}
