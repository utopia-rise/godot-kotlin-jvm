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
import godot.core.Signal0
import godot.core.Signal1
import godot.core.VariantCaster.ANY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING
import godot.core.VariantParser.VECTOR2
import godot.core.Vector2
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Arranges child controls into a tabbed view, creating a tab for each one. The active tab's
 * corresponding control is made visible, while all other child controls are hidden. Ignores
 * non-control children.
 * **Note:** The drawing of the clickable tabs is handled by this node; [TabBar] is not needed.
 */
@GodotBaseType
public open class TabContainer : Container() {
  /**
   * Emitted when the active tab is rearranged via mouse drag. See [dragToRearrangeEnabled].
   */
  public val activeTabRearranged: Signal1<Long> by Signal1

  /**
   * Emitted when switching to another tab.
   */
  public val tabChanged: Signal1<Long> by Signal1

  /**
   * Emitted when a tab is clicked, even if it is the current tab.
   */
  public val tabClicked: Signal1<Long> by Signal1

  /**
   * Emitted when a tab is hovered by the mouse.
   */
  public val tabHovered: Signal1<Long> by Signal1

  /**
   * Emitted when a tab is selected via click, directional input, or script, even if it is the
   * current tab.
   */
  public val tabSelected: Signal1<Long> by Signal1

  /**
   * Emitted when the user clicks on the button icon on this tab.
   */
  public val tabButtonPressed: Signal1<Long> by Signal1

  /**
   * Emitted when the [TabContainer]'s [Popup] button is clicked. See [setPopup] for details.
   */
  public val prePopupPressed: Signal0 by Signal0

  /**
   * Sets the position at which tabs will be placed. See [TabBar.AlignmentMode] for details.
   */
  public final inline var tabAlignment: TabBar.AlignmentMode
    @JvmName("tabAlignmentProperty")
    get() = getTabAlignment()
    @JvmName("tabAlignmentProperty")
    set(`value`) {
      setTabAlignment(value)
    }

  /**
   * The current tab index. When set, this index's [Control] node's `visible` property is set to
   * `true` and all others are set to `false`.
   * A value of `-1` means that no tab is selected.
   */
  public final inline var currentTab: Int
    @JvmName("currentTabProperty")
    get() = getCurrentTab()
    @JvmName("currentTabProperty")
    set(`value`) {
      setCurrentTab(value)
    }

  /**
   * Sets the position of the tab bar. See [TabPosition] for details.
   */
  public final inline var tabsPosition: TabPosition
    @JvmName("tabsPositionProperty")
    get() = getTabsPosition()
    @JvmName("tabsPositionProperty")
    set(`value`) {
      setTabsPosition(value)
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
   * If `true`, tabs are visible. If `false`, tabs' content and titles are hidden.
   */
  public final inline var tabsVisible: Boolean
    @JvmName("tabsVisibleProperty")
    get() = areTabsVisible()
    @JvmName("tabsVisibleProperty")
    set(`value`) {
      setTabsVisible(value)
    }

  /**
   * If `true`, all tabs are drawn in front of the panel. If `false`, inactive tabs are drawn behind
   * the panel.
   */
  public final inline var allTabsInFront: Boolean
    @JvmName("allTabsInFrontProperty")
    get() = isAllTabsInFront()
    @JvmName("allTabsInFrontProperty")
    set(`value`) {
      setAllTabsInFront(value)
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
   * [TabContainer]s with the same rearrange group ID will allow dragging the tabs between them.
   * Enable drag with [dragToRearrangeEnabled].
   * Setting this to `-1` will disable rearranging between [TabContainer]s.
   */
  public final inline var tabsRearrangeGroup: Int
    @JvmName("tabsRearrangeGroupProperty")
    get() = getTabsRearrangeGroup()
    @JvmName("tabsRearrangeGroupProperty")
    set(`value`) {
      setTabsRearrangeGroup(value)
    }

  /**
   * If `true`, child [Control] nodes that are hidden have their minimum size take into account in
   * the total, instead of only the currently visible one.
   */
  public final inline var useHiddenTabsForMinSize: Boolean
    @JvmName("useHiddenTabsForMinSizeProperty")
    get() = getUseHiddenTabsForMinSize()
    @JvmName("useHiddenTabsForMinSizeProperty")
    set(`value`) {
      setUseHiddenTabsForMinSize(value)
    }

  /**
   * The focus access mode for the internal [TabBar] node.
   */
  public final inline var tabFocusMode: Control.FocusMode
    @JvmName("tabFocusModeProperty")
    get() = getTabFocusMode()
    @JvmName("tabFocusModeProperty")
    set(`value`) {
      setTabFocusMode(value)
    }

  /**
   * If `true`, all tabs can be deselected so that no tab is selected. Click on the [currentTab] to
   * deselect it.
   * Only the tab header will be shown if no tabs are selected.
   */
  public final inline var deselectEnabled: Boolean
    @JvmName("deselectEnabledProperty")
    get() = getDeselectEnabled()
    @JvmName("deselectEnabledProperty")
    set(`value`) {
      setDeselectEnabled(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(638, scriptIndex)
  }

  /**
   * Returns the number of tabs.
   */
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
   * Returns the child [Control] node located at the active tab index.
   */
  public final fun getCurrentTabControl(): Control? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCurrentTabControlPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Control?)
  }

  /**
   * Returns the [TabBar] contained in this container.
   * **Warning:** This is a required internal node, removing and freeing it or editing its tabs may
   * cause a crash. If you wish to edit the tabs, use the methods provided in [TabContainer].
   */
  public final fun getTabBar(): TabBar? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTabBarPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as TabBar?)
  }

  /**
   * Returns the [Control] node from the tab at index [tabIdx].
   */
  public final fun getTabControl(tabIdx: Int): Control? {
    TransferContext.writeArguments(LONG to tabIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getTabControlPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Control?)
  }

  public final fun setTabAlignment(alignment: TabBar.AlignmentMode): Unit {
    TransferContext.writeArguments(LONG to alignment.id)
    TransferContext.callMethod(ptr, MethodBindings.setTabAlignmentPtr, NIL)
  }

  public final fun getTabAlignment(): TabBar.AlignmentMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTabAlignmentPtr, LONG)
    return TabBar.AlignmentMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setTabsPosition(tabsPosition: TabPosition): Unit {
    TransferContext.writeArguments(LONG to tabsPosition.id)
    TransferContext.callMethod(ptr, MethodBindings.setTabsPositionPtr, NIL)
  }

  public final fun getTabsPosition(): TabPosition {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTabsPositionPtr, LONG)
    return TabContainer.TabPosition.from(TransferContext.readReturnValue(LONG) as Long)
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

  public final fun setTabsVisible(visible: Boolean): Unit {
    TransferContext.writeArguments(BOOL to visible)
    TransferContext.callMethod(ptr, MethodBindings.setTabsVisiblePtr, NIL)
  }

  public final fun areTabsVisible(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.areTabsVisiblePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setAllTabsInFront(isFront: Boolean): Unit {
    TransferContext.writeArguments(BOOL to isFront)
    TransferContext.callMethod(ptr, MethodBindings.setAllTabsInFrontPtr, NIL)
  }

  public final fun isAllTabsInFront(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isAllTabsInFrontPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets a custom title for the tab at index [tabIdx] (tab titles default to the name of the
   * indexed child node). Set it back to the child's name to make the tab default to it again.
   */
  public final fun setTabTitle(tabIdx: Int, title: String): Unit {
    TransferContext.writeArguments(LONG to tabIdx.toLong(), STRING to title)
    TransferContext.callMethod(ptr, MethodBindings.setTabTitlePtr, NIL)
  }

  /**
   * Returns the title of the tab at index [tabIdx]. Tab titles default to the name of the indexed
   * child node, but this can be overridden with [setTabTitle].
   */
  public final fun getTabTitle(tabIdx: Int): String {
    TransferContext.writeArguments(LONG to tabIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getTabTitlePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Sets a custom tooltip text for tab at index [tabIdx].
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
   * Sets an icon for the tab at index [tabIdx].
   */
  public final fun setTabIcon(tabIdx: Int, icon: Texture2D?): Unit {
    TransferContext.writeArguments(LONG to tabIdx.toLong(), OBJECT to icon)
    TransferContext.callMethod(ptr, MethodBindings.setTabIconPtr, NIL)
  }

  /**
   * Returns the [Texture2D] for the tab at index [tabIdx] or `null` if the tab has no [Texture2D].
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
   * Sets the button icon from the tab at index [tabIdx].
   */
  public final fun setTabButtonIcon(tabIdx: Int, icon: Texture2D?): Unit {
    TransferContext.writeArguments(LONG to tabIdx.toLong(), OBJECT to icon)
    TransferContext.callMethod(ptr, MethodBindings.setTabButtonIconPtr, NIL)
  }

  /**
   * Returns the button icon from the tab at index [tabIdx].
   */
  public final fun getTabButtonIcon(tabIdx: Int): Texture2D? {
    TransferContext.writeArguments(LONG to tabIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getTabButtonIconPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Texture2D?)
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

  /**
   * Returns the index of the tab tied to the given [control]. The control must be a child of the
   * [TabContainer].
   */
  public final fun getTabIdxFromControl(control: Control?): Int {
    TransferContext.writeArguments(OBJECT to control)
    TransferContext.callMethod(ptr, MethodBindings.getTabIdxFromControlPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * If set on a [Popup] node instance, a popup menu icon appears in the top-right corner of the
   * [TabContainer] (setting it to `null` will make it go away). Clicking it will expand the [Popup]
   * node.
   */
  public final fun setPopup(popup: Node?): Unit {
    TransferContext.writeArguments(OBJECT to popup)
    TransferContext.callMethod(ptr, MethodBindings.setPopupPtr, NIL)
  }

  /**
   * Returns the [Popup] node instance if one has been set already with [setPopup].
   * **Warning:** This is a required internal node, removing and freeing it may cause a crash. If
   * you wish to hide it or any of its children, use their [Window.visible] property.
   */
  public final fun getPopup(): Popup? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPopupPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Popup?)
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

  public final fun setUseHiddenTabsForMinSize(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setUseHiddenTabsForMinSizePtr, NIL)
  }

  public final fun getUseHiddenTabsForMinSize(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getUseHiddenTabsForMinSizePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setTabFocusMode(focusMode: Control.FocusMode): Unit {
    TransferContext.writeArguments(LONG to focusMode.id)
    TransferContext.callMethod(ptr, MethodBindings.setTabFocusModePtr, NIL)
  }

  public final fun getTabFocusMode(): Control.FocusMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTabFocusModePtr, LONG)
    return Control.FocusMode.from(TransferContext.readReturnValue(LONG) as Long)
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

  public enum class TabPosition(
    id: Long,
  ) {
    /**
     * Places the tab bar at the top.
     */
    POSITION_TOP(0),
    /**
     * Places the tab bar at the bottom. The tab bar's [StyleBox] will be flipped vertically.
     */
    POSITION_BOTTOM(1),
    /**
     * Represents the size of the [TabPosition] enum.
     */
    POSITION_MAX(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): TabPosition = entries.single { it.id == `value` }
    }
  }

  public companion object

  public object MethodBindings {
    internal val getTabCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "get_tab_count", 3905245786)

    internal val setCurrentTabPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "set_current_tab", 1286410249)

    internal val getCurrentTabPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "get_current_tab", 3905245786)

    internal val getPreviousTabPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "get_previous_tab", 3905245786)

    internal val selectPreviousAvailablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "select_previous_available", 2240911060)

    internal val selectNextAvailablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "select_next_available", 2240911060)

    internal val getCurrentTabControlPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "get_current_tab_control", 2783021301)

    internal val getTabBarPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "get_tab_bar", 1865451809)

    internal val getTabControlPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "get_tab_control", 1065994134)

    internal val setTabAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "set_tab_alignment", 2413632353)

    internal val getTabAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "get_tab_alignment", 2178122193)

    internal val setTabsPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "set_tabs_position", 256673370)

    internal val getTabsPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "get_tabs_position", 919937023)

    internal val setClipTabsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "set_clip_tabs", 2586408642)

    internal val getClipTabsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "get_clip_tabs", 36873697)

    internal val setTabsVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "set_tabs_visible", 2586408642)

    internal val areTabsVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "are_tabs_visible", 36873697)

    internal val setAllTabsInFrontPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "set_all_tabs_in_front", 2586408642)

    internal val isAllTabsInFrontPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "is_all_tabs_in_front", 36873697)

    internal val setTabTitlePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "set_tab_title", 501894301)

    internal val getTabTitlePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "get_tab_title", 844755477)

    internal val setTabTooltipPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "set_tab_tooltip", 501894301)

    internal val getTabTooltipPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "get_tab_tooltip", 844755477)

    internal val setTabIconPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "set_tab_icon", 666127730)

    internal val getTabIconPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "get_tab_icon", 3536238170)

    internal val setTabIconMaxWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "set_tab_icon_max_width", 3937882851)

    internal val getTabIconMaxWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "get_tab_icon_max_width", 923996154)

    internal val setTabDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "set_tab_disabled", 300928843)

    internal val isTabDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "is_tab_disabled", 1116898809)

    internal val setTabHiddenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "set_tab_hidden", 300928843)

    internal val isTabHiddenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "is_tab_hidden", 1116898809)

    internal val setTabMetadataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "set_tab_metadata", 2152698145)

    internal val getTabMetadataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "get_tab_metadata", 4227898402)

    internal val setTabButtonIconPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "set_tab_button_icon", 666127730)

    internal val getTabButtonIconPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "get_tab_button_icon", 3536238170)

    internal val getTabIdxAtPointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "get_tab_idx_at_point", 3820158470)

    internal val getTabIdxFromControlPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "get_tab_idx_from_control", 2787397975)

    internal val setPopupPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "set_popup", 1078189570)

    internal val getPopupPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "get_popup", 111095082)

    internal val setDragToRearrangeEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "set_drag_to_rearrange_enabled", 2586408642)

    internal val getDragToRearrangeEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "get_drag_to_rearrange_enabled", 36873697)

    internal val setTabsRearrangeGroupPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "set_tabs_rearrange_group", 1286410249)

    internal val getTabsRearrangeGroupPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "get_tabs_rearrange_group", 3905245786)

    internal val setUseHiddenTabsForMinSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "set_use_hidden_tabs_for_min_size", 2586408642)

    internal val getUseHiddenTabsForMinSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "get_use_hidden_tabs_for_min_size", 36873697)

    internal val setTabFocusModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "set_tab_focus_mode", 3232914922)

    internal val getTabFocusModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "get_tab_focus_mode", 2132829277)

    internal val setDeselectEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "set_deselect_enabled", 2586408642)

    internal val getDeselectEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "get_deselect_enabled", 36873697)
  }
}
