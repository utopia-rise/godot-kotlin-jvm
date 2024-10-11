// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Rect2
import godot.core.Signal1
import godot.core.VariantCaster.ANY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.RECT2
import godot.core.VariantParser.STRING
import godot.core.VariantParser.VECTOR2
import godot.core.Vector2
import godot.util.Internals
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

private const val ENGINE_CLASS_TABBAR_INDEX: Int = 637

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
  public val tabSelected: Signal1<Long> by Signal1

  /**
   * Emitted when switching to another tab.
   */
  public val tabChanged: Signal1<Long> by Signal1

  /**
   * Emitted when a tab is clicked, even if it is the current tab.
   */
  public val tabClicked: Signal1<Long> by Signal1

  /**
   * Emitted when a tab is right-clicked. [selectWithRmb] must be enabled.
   */
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
  public val tabClosePressed: Signal1<Long> by Signal1

  /**
   * Emitted when a tab's right button is pressed. See [setTabButtonIcon].
   */
  public val tabButtonPressed: Signal1<Long> by Signal1

  /**
   * Emitted when a tab is hovered by the mouse.
   */
  public val tabHovered: Signal1<Long> by Signal1

  /**
   * Emitted when the active tab is rearranged via mouse drag. See [dragToRearrangeEnabled].
   */
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
    Internals.callConstructor(this, ENGINE_CLASS_TABBAR_INDEX, scriptIndex)
  }

  public final fun setTabCount(count: Int): Unit {
    Internals.writeArguments(LONG to count.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setTabCountPtr, NIL)
  }

  public final fun getTabCount(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTabCountPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setCurrentTab(tabIdx: Int): Unit {
    Internals.writeArguments(LONG to tabIdx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setCurrentTabPtr, NIL)
  }

  public final fun getCurrentTab(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCurrentTabPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the previously active tab index.
   */
  public final fun getPreviousTab(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getPreviousTabPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Selects the first available tab with lower index than the currently selected. Returns `true` if
   * tab selection changed.
   */
  public final fun selectPreviousAvailable(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.selectPreviousAvailablePtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Selects the first available tab with greater index than the currently selected. Returns `true`
   * if tab selection changed.
   */
  public final fun selectNextAvailable(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.selectNextAvailablePtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets a [title] for the tab at index [tabIdx].
   */
  public final fun setTabTitle(tabIdx: Int, title: String): Unit {
    Internals.writeArguments(LONG to tabIdx.toLong(), STRING to title)
    Internals.callMethod(rawPtr, MethodBindings.setTabTitlePtr, NIL)
  }

  /**
   * Returns the title of the tab at index [tabIdx].
   */
  public final fun getTabTitle(tabIdx: Int): String {
    Internals.writeArguments(LONG to tabIdx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getTabTitlePtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  /**
   * Sets a [tooltip] for tab at index [tabIdx].
   * **Note:** By default, if the [tooltip] is empty and the tab text is truncated (not all
   * characters fit into the tab), the title will be displayed as a tooltip. To hide the tooltip,
   * assign `" "` as the [tooltip] text.
   */
  public final fun setTabTooltip(tabIdx: Int, tooltip: String): Unit {
    Internals.writeArguments(LONG to tabIdx.toLong(), STRING to tooltip)
    Internals.callMethod(rawPtr, MethodBindings.setTabTooltipPtr, NIL)
  }

  /**
   * Returns the tooltip text of the tab at index [tabIdx].
   */
  public final fun getTabTooltip(tabIdx: Int): String {
    Internals.writeArguments(LONG to tabIdx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getTabTooltipPtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  /**
   * Sets tab title base writing direction.
   */
  public final fun setTabTextDirection(tabIdx: Int, direction: Control.TextDirection): Unit {
    Internals.writeArguments(LONG to tabIdx.toLong(), LONG to direction.id)
    Internals.callMethod(rawPtr, MethodBindings.setTabTextDirectionPtr, NIL)
  }

  /**
   * Returns tab title text base writing direction.
   */
  public final fun getTabTextDirection(tabIdx: Int): Control.TextDirection {
    Internals.writeArguments(LONG to tabIdx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getTabTextDirectionPtr, LONG)
    return Control.TextDirection.from(Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Sets language code of tab title used for line-breaking and text shaping algorithms, if left
   * empty current locale is used instead.
   */
  public final fun setTabLanguage(tabIdx: Int, language: String): Unit {
    Internals.writeArguments(LONG to tabIdx.toLong(), STRING to language)
    Internals.callMethod(rawPtr, MethodBindings.setTabLanguagePtr, NIL)
  }

  /**
   * Returns tab title language code.
   */
  public final fun getTabLanguage(tabIdx: Int): String {
    Internals.writeArguments(LONG to tabIdx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getTabLanguagePtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  /**
   * Sets an [icon] for the tab at index [tabIdx].
   */
  public final fun setTabIcon(tabIdx: Int, icon: Texture2D?): Unit {
    Internals.writeArguments(LONG to tabIdx.toLong(), OBJECT to icon)
    Internals.callMethod(rawPtr, MethodBindings.setTabIconPtr, NIL)
  }

  /**
   * Returns the icon for the tab at index [tabIdx] or `null` if the tab has no icon.
   */
  public final fun getTabIcon(tabIdx: Int): Texture2D? {
    Internals.writeArguments(LONG to tabIdx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getTabIconPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Texture2D?)
  }

  /**
   * Sets the maximum allowed width of the icon for the tab at index [tabIdx]. This limit is applied
   * on top of the default size of the icon and on top of [theme_item icon_max_width]. The height is
   * adjusted according to the icon's ratio.
   */
  public final fun setTabIconMaxWidth(tabIdx: Int, width: Int): Unit {
    Internals.writeArguments(LONG to tabIdx.toLong(), LONG to width.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setTabIconMaxWidthPtr, NIL)
  }

  /**
   * Returns the maximum allowed width of the icon for the tab at index [tabIdx].
   */
  public final fun getTabIconMaxWidth(tabIdx: Int): Int {
    Internals.writeArguments(LONG to tabIdx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getTabIconMaxWidthPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Sets an [icon] for the button of the tab at index [tabIdx] (located to the right, before the
   * close button), making it visible and clickable (See [signal tab_button_pressed]). Giving it a
   * `null` value will hide the button.
   */
  public final fun setTabButtonIcon(tabIdx: Int, icon: Texture2D?): Unit {
    Internals.writeArguments(LONG to tabIdx.toLong(), OBJECT to icon)
    Internals.callMethod(rawPtr, MethodBindings.setTabButtonIconPtr, NIL)
  }

  /**
   * Returns the icon for the right button of the tab at index [tabIdx] or `null` if the right
   * button has no icon.
   */
  public final fun getTabButtonIcon(tabIdx: Int): Texture2D? {
    Internals.writeArguments(LONG to tabIdx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getTabButtonIconPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Texture2D?)
  }

  /**
   * If [disabled] is `true`, disables the tab at index [tabIdx], making it non-interactable.
   */
  public final fun setTabDisabled(tabIdx: Int, disabled: Boolean): Unit {
    Internals.writeArguments(LONG to tabIdx.toLong(), BOOL to disabled)
    Internals.callMethod(rawPtr, MethodBindings.setTabDisabledPtr, NIL)
  }

  /**
   * Returns `true` if the tab at index [tabIdx] is disabled.
   */
  public final fun isTabDisabled(tabIdx: Int): Boolean {
    Internals.writeArguments(LONG to tabIdx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.isTabDisabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * If [hidden] is `true`, hides the tab at index [tabIdx], making it disappear from the tab area.
   */
  public final fun setTabHidden(tabIdx: Int, hidden: Boolean): Unit {
    Internals.writeArguments(LONG to tabIdx.toLong(), BOOL to hidden)
    Internals.callMethod(rawPtr, MethodBindings.setTabHiddenPtr, NIL)
  }

  /**
   * Returns `true` if the tab at index [tabIdx] is hidden.
   */
  public final fun isTabHidden(tabIdx: Int): Boolean {
    Internals.writeArguments(LONG to tabIdx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.isTabHiddenPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets the metadata value for the tab at index [tabIdx], which can be retrieved later using
   * [getTabMetadata].
   */
  public final fun setTabMetadata(tabIdx: Int, metadata: Any?): Unit {
    Internals.writeArguments(LONG to tabIdx.toLong(), ANY to metadata)
    Internals.callMethod(rawPtr, MethodBindings.setTabMetadataPtr, NIL)
  }

  /**
   * Returns the metadata value set to the tab at index [tabIdx] using [setTabMetadata]. If no
   * metadata was previously set, returns `null` by default.
   */
  public final fun getTabMetadata(tabIdx: Int): Any? {
    Internals.writeArguments(LONG to tabIdx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getTabMetadataPtr, ANY)
    return (Internals.readReturnValue(ANY) as Any?)
  }

  /**
   * Removes the tab at index [tabIdx].
   */
  public final fun removeTab(tabIdx: Int): Unit {
    Internals.writeArguments(LONG to tabIdx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.removeTabPtr, NIL)
  }

  /**
   * Adds a new tab.
   */
  @JvmOverloads
  public final fun addTab(title: String = "", icon: Texture2D? = null): Unit {
    Internals.writeArguments(STRING to title, OBJECT to icon)
    Internals.callMethod(rawPtr, MethodBindings.addTabPtr, NIL)
  }

  /**
   * Returns the index of the tab at local coordinates [point]. Returns `-1` if the point is outside
   * the control boundaries or if there's no tab at the queried position.
   */
  public final fun getTabIdxAtPoint(point: Vector2): Int {
    Internals.writeArguments(VECTOR2 to point)
    Internals.callMethod(rawPtr, MethodBindings.getTabIdxAtPointPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setTabAlignment(alignment: AlignmentMode): Unit {
    Internals.writeArguments(LONG to alignment.id)
    Internals.callMethod(rawPtr, MethodBindings.setTabAlignmentPtr, NIL)
  }

  public final fun getTabAlignment(): AlignmentMode {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTabAlignmentPtr, LONG)
    return TabBar.AlignmentMode.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setClipTabs(clipTabs: Boolean): Unit {
    Internals.writeArguments(BOOL to clipTabs)
    Internals.callMethod(rawPtr, MethodBindings.setClipTabsPtr, NIL)
  }

  public final fun getClipTabs(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getClipTabsPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the number of hidden tabs offsetted to the left.
   */
  public final fun getTabOffset(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTabOffsetPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns `true` if the offset buttons (the ones that appear when there's not enough space for
   * all tabs) are visible.
   */
  public final fun getOffsetButtonsVisible(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getOffsetButtonsVisiblePtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Moves the scroll view to make the tab visible.
   */
  public final fun ensureTabVisible(idx: Int): Unit {
    Internals.writeArguments(LONG to idx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.ensureTabVisiblePtr, NIL)
  }

  /**
   * Returns tab [Rect2] with local position and size.
   */
  public final fun getTabRect(tabIdx: Int): Rect2 {
    Internals.writeArguments(LONG to tabIdx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getTabRectPtr, RECT2)
    return (Internals.readReturnValue(RECT2) as Rect2)
  }

  /**
   * Moves a tab from [from] to [to].
   */
  public final fun moveTab(from: Int, to: Int): Unit {
    Internals.writeArguments(LONG to from.toLong(), LONG to to.toLong())
    Internals.callMethod(rawPtr, MethodBindings.moveTabPtr, NIL)
  }

  public final fun setTabCloseDisplayPolicy(policy: CloseButtonDisplayPolicy): Unit {
    Internals.writeArguments(LONG to policy.id)
    Internals.callMethod(rawPtr, MethodBindings.setTabCloseDisplayPolicyPtr, NIL)
  }

  public final fun getTabCloseDisplayPolicy(): CloseButtonDisplayPolicy {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTabCloseDisplayPolicyPtr, LONG)
    return TabBar.CloseButtonDisplayPolicy.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setMaxTabWidth(width: Int): Unit {
    Internals.writeArguments(LONG to width.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setMaxTabWidthPtr, NIL)
  }

  public final fun getMaxTabWidth(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getMaxTabWidthPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setScrollingEnabled(enabled: Boolean): Unit {
    Internals.writeArguments(BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.setScrollingEnabledPtr, NIL)
  }

  public final fun getScrollingEnabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getScrollingEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setDragToRearrangeEnabled(enabled: Boolean): Unit {
    Internals.writeArguments(BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.setDragToRearrangeEnabledPtr, NIL)
  }

  public final fun getDragToRearrangeEnabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getDragToRearrangeEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setTabsRearrangeGroup(groupId: Int): Unit {
    Internals.writeArguments(LONG to groupId.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setTabsRearrangeGroupPtr, NIL)
  }

  public final fun getTabsRearrangeGroup(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTabsRearrangeGroupPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setScrollToSelected(enabled: Boolean): Unit {
    Internals.writeArguments(BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.setScrollToSelectedPtr, NIL)
  }

  public final fun getScrollToSelected(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getScrollToSelectedPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setSelectWithRmb(enabled: Boolean): Unit {
    Internals.writeArguments(BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.setSelectWithRmbPtr, NIL)
  }

  public final fun getSelectWithRmb(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSelectWithRmbPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setDeselectEnabled(enabled: Boolean): Unit {
    Internals.writeArguments(BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.setDeselectEnabledPtr, NIL)
  }

  public final fun getDeselectEnabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getDeselectEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Clears all tabs.
   */
  public final fun clearTabs(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.clearTabsPtr, NIL)
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

  public object MethodBindings {
    internal val setTabCountPtr: VoidPtr =
        Internals.getMethodBindPtr("TabBar", "set_tab_count", 1286410249)

    internal val getTabCountPtr: VoidPtr =
        Internals.getMethodBindPtr("TabBar", "get_tab_count", 3905245786)

    internal val setCurrentTabPtr: VoidPtr =
        Internals.getMethodBindPtr("TabBar", "set_current_tab", 1286410249)

    internal val getCurrentTabPtr: VoidPtr =
        Internals.getMethodBindPtr("TabBar", "get_current_tab", 3905245786)

    internal val getPreviousTabPtr: VoidPtr =
        Internals.getMethodBindPtr("TabBar", "get_previous_tab", 3905245786)

    internal val selectPreviousAvailablePtr: VoidPtr =
        Internals.getMethodBindPtr("TabBar", "select_previous_available", 2240911060)

    internal val selectNextAvailablePtr: VoidPtr =
        Internals.getMethodBindPtr("TabBar", "select_next_available", 2240911060)

    internal val setTabTitlePtr: VoidPtr =
        Internals.getMethodBindPtr("TabBar", "set_tab_title", 501894301)

    internal val getTabTitlePtr: VoidPtr =
        Internals.getMethodBindPtr("TabBar", "get_tab_title", 844755477)

    internal val setTabTooltipPtr: VoidPtr =
        Internals.getMethodBindPtr("TabBar", "set_tab_tooltip", 501894301)

    internal val getTabTooltipPtr: VoidPtr =
        Internals.getMethodBindPtr("TabBar", "get_tab_tooltip", 844755477)

    internal val setTabTextDirectionPtr: VoidPtr =
        Internals.getMethodBindPtr("TabBar", "set_tab_text_direction", 1707680378)

    internal val getTabTextDirectionPtr: VoidPtr =
        Internals.getMethodBindPtr("TabBar", "get_tab_text_direction", 4235602388)

    internal val setTabLanguagePtr: VoidPtr =
        Internals.getMethodBindPtr("TabBar", "set_tab_language", 501894301)

    internal val getTabLanguagePtr: VoidPtr =
        Internals.getMethodBindPtr("TabBar", "get_tab_language", 844755477)

    internal val setTabIconPtr: VoidPtr =
        Internals.getMethodBindPtr("TabBar", "set_tab_icon", 666127730)

    internal val getTabIconPtr: VoidPtr =
        Internals.getMethodBindPtr("TabBar", "get_tab_icon", 3536238170)

    internal val setTabIconMaxWidthPtr: VoidPtr =
        Internals.getMethodBindPtr("TabBar", "set_tab_icon_max_width", 3937882851)

    internal val getTabIconMaxWidthPtr: VoidPtr =
        Internals.getMethodBindPtr("TabBar", "get_tab_icon_max_width", 923996154)

    internal val setTabButtonIconPtr: VoidPtr =
        Internals.getMethodBindPtr("TabBar", "set_tab_button_icon", 666127730)

    internal val getTabButtonIconPtr: VoidPtr =
        Internals.getMethodBindPtr("TabBar", "get_tab_button_icon", 3536238170)

    internal val setTabDisabledPtr: VoidPtr =
        Internals.getMethodBindPtr("TabBar", "set_tab_disabled", 300928843)

    internal val isTabDisabledPtr: VoidPtr =
        Internals.getMethodBindPtr("TabBar", "is_tab_disabled", 1116898809)

    internal val setTabHiddenPtr: VoidPtr =
        Internals.getMethodBindPtr("TabBar", "set_tab_hidden", 300928843)

    internal val isTabHiddenPtr: VoidPtr =
        Internals.getMethodBindPtr("TabBar", "is_tab_hidden", 1116898809)

    internal val setTabMetadataPtr: VoidPtr =
        Internals.getMethodBindPtr("TabBar", "set_tab_metadata", 2152698145)

    internal val getTabMetadataPtr: VoidPtr =
        Internals.getMethodBindPtr("TabBar", "get_tab_metadata", 4227898402)

    internal val removeTabPtr: VoidPtr =
        Internals.getMethodBindPtr("TabBar", "remove_tab", 1286410249)

    internal val addTabPtr: VoidPtr = Internals.getMethodBindPtr("TabBar", "add_tab", 1465444425)

    internal val getTabIdxAtPointPtr: VoidPtr =
        Internals.getMethodBindPtr("TabBar", "get_tab_idx_at_point", 3820158470)

    internal val setTabAlignmentPtr: VoidPtr =
        Internals.getMethodBindPtr("TabBar", "set_tab_alignment", 2413632353)

    internal val getTabAlignmentPtr: VoidPtr =
        Internals.getMethodBindPtr("TabBar", "get_tab_alignment", 2178122193)

    internal val setClipTabsPtr: VoidPtr =
        Internals.getMethodBindPtr("TabBar", "set_clip_tabs", 2586408642)

    internal val getClipTabsPtr: VoidPtr =
        Internals.getMethodBindPtr("TabBar", "get_clip_tabs", 36873697)

    internal val getTabOffsetPtr: VoidPtr =
        Internals.getMethodBindPtr("TabBar", "get_tab_offset", 3905245786)

    internal val getOffsetButtonsVisiblePtr: VoidPtr =
        Internals.getMethodBindPtr("TabBar", "get_offset_buttons_visible", 36873697)

    internal val ensureTabVisiblePtr: VoidPtr =
        Internals.getMethodBindPtr("TabBar", "ensure_tab_visible", 1286410249)

    internal val getTabRectPtr: VoidPtr =
        Internals.getMethodBindPtr("TabBar", "get_tab_rect", 3327874267)

    internal val moveTabPtr: VoidPtr = Internals.getMethodBindPtr("TabBar", "move_tab", 3937882851)

    internal val setTabCloseDisplayPolicyPtr: VoidPtr =
        Internals.getMethodBindPtr("TabBar", "set_tab_close_display_policy", 2212906737)

    internal val getTabCloseDisplayPolicyPtr: VoidPtr =
        Internals.getMethodBindPtr("TabBar", "get_tab_close_display_policy", 2956568028)

    internal val setMaxTabWidthPtr: VoidPtr =
        Internals.getMethodBindPtr("TabBar", "set_max_tab_width", 1286410249)

    internal val getMaxTabWidthPtr: VoidPtr =
        Internals.getMethodBindPtr("TabBar", "get_max_tab_width", 3905245786)

    internal val setScrollingEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("TabBar", "set_scrolling_enabled", 2586408642)

    internal val getScrollingEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("TabBar", "get_scrolling_enabled", 36873697)

    internal val setDragToRearrangeEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("TabBar", "set_drag_to_rearrange_enabled", 2586408642)

    internal val getDragToRearrangeEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("TabBar", "get_drag_to_rearrange_enabled", 36873697)

    internal val setTabsRearrangeGroupPtr: VoidPtr =
        Internals.getMethodBindPtr("TabBar", "set_tabs_rearrange_group", 1286410249)

    internal val getTabsRearrangeGroupPtr: VoidPtr =
        Internals.getMethodBindPtr("TabBar", "get_tabs_rearrange_group", 3905245786)

    internal val setScrollToSelectedPtr: VoidPtr =
        Internals.getMethodBindPtr("TabBar", "set_scroll_to_selected", 2586408642)

    internal val getScrollToSelectedPtr: VoidPtr =
        Internals.getMethodBindPtr("TabBar", "get_scroll_to_selected", 36873697)

    internal val setSelectWithRmbPtr: VoidPtr =
        Internals.getMethodBindPtr("TabBar", "set_select_with_rmb", 2586408642)

    internal val getSelectWithRmbPtr: VoidPtr =
        Internals.getMethodBindPtr("TabBar", "get_select_with_rmb", 36873697)

    internal val setDeselectEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("TabBar", "set_deselect_enabled", 2586408642)

    internal val getDeselectEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("TabBar", "get_deselect_enabled", 36873697)

    internal val clearTabsPtr: VoidPtr =
        Internals.getMethodBindPtr("TabBar", "clear_tabs", 3218959716)
  }
}
