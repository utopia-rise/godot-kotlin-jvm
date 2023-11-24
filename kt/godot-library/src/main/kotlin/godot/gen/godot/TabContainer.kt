// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * A container that creates a tab for each child control, displaying only the active tab's control.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/ui/gui_containers.html]($DOCS_URL/tutorials/ui/gui_containers.html)
 *
 * Arranges child controls into a tabbed view, creating a tab for each one. The active tab's corresponding control is made visible, while all other child controls are hidden. Ignores non-control children.
 *
 * **Note:** The drawing of the clickable tabs is handled by this node; [godot.TabBar] is not needed.
 */
@GodotBaseType
public open class TabContainer : Container() {
  /**
   * Emitted when the active tab is rearranged via mouse drag. See [dragToRearrangeEnabled].
   */
  public val activeTabRearranged: Signal1<Long> by signal("idxTo")

  /**
   * Emitted when switching to another tab.
   */
  public val tabChanged: Signal1<Long> by signal("tab")

  /**
   * Emitted when a tab is clicked, even if it is the current tab.
   */
  public val tabClicked: Signal1<Long> by signal("tab")

  /**
   * Emitted when a tab is hovered by the mouse.
   */
  public val tabHovered: Signal1<Long> by signal("tab")

  /**
   * Emitted when a tab is selected, even if it is the current tab.
   */
  public val tabSelected: Signal1<Long> by signal("tab")

  /**
   * Emitted when the user clicks on the button icon on this tab.
   */
  public val tabButtonPressed: Signal1<Long> by signal("tab")

  /**
   * Emitted when the [godot.TabContainer]'s [godot.Popup] button is clicked. See [setPopup] for details.
   */
  public val prePopupPressed: Signal0 by signal()

  /**
   * Sets the position at which tabs will be placed. See [enum TabBar.AlignmentMode] for details.
   */
  public var tabAlignment: TabBar.AlignmentMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTabAlignmentPtr, LONG)
      return TabBar.AlignmentMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setTabAlignmentPtr, NIL)
    }

  /**
   * The current tab index. When set, this index's [godot.Control] node's `visible` property is set to `true` and all others are set to `false`.
   */
  public var currentTab: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCurrentTabPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setCurrentTabPtr, NIL)
    }

  /**
   * If `true`, tabs overflowing this node's width will be hidden, displaying two navigation buttons instead. Otherwise, this node's minimum size is updated so that all tabs are visible.
   */
  public var clipTabs: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getClipTabsPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setClipTabsPtr, NIL)
    }

  /**
   * If `true`, tabs are visible. If `false`, tabs' content and titles are hidden.
   */
  public var tabsVisible: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.areTabsVisiblePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTabsVisiblePtr, NIL)
    }

  /**
   * If `true`, all tabs are drawn in front of the panel. If `false`, inactive tabs are drawn behind the panel.
   */
  public var allTabsInFront: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isAllTabsInFrontPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAllTabsInFrontPtr, NIL)
    }

  /**
   * If `true`, tabs can be rearranged with mouse drag.
   */
  public var dragToRearrangeEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDragToRearrangeEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDragToRearrangeEnabledPtr, NIL)
    }

  /**
   * [godot.TabContainer]s with the same rearrange group ID will allow dragging the tabs between them. Enable drag with [dragToRearrangeEnabled].
   *
   * Setting this to `-1` will disable rearranging between [godot.TabContainer]s.
   */
  public var tabsRearrangeGroup: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTabsRearrangeGroupPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setTabsRearrangeGroupPtr, NIL)
    }

  /**
   * If `true`, children [godot.Control] nodes that are hidden have their minimum size take into account in the total, instead of only the currently visible one.
   */
  public var useHiddenTabsForMinSize: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getUseHiddenTabsForMinSizePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUseHiddenTabsForMinSizePtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_TABCONTAINER, scriptIndex)
    return true
  }

  /**
   * Returns the number of tabs.
   */
  public fun getTabCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTabCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the previously active tab index.
   */
  public fun getPreviousTab(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPreviousTabPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the child [godot.Control] node located at the active tab index.
   */
  public fun getCurrentTabControl(): Control? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCurrentTabControlPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Control?)
  }

  /**
   * Returns the [godot.Control] node from the tab at index [tabIdx].
   */
  public fun getTabControl(tabIdx: Int): Control? {
    TransferContext.writeArguments(LONG to tabIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getTabControlPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Control?)
  }

  /**
   * Sets a custom title for the tab at index [tabIdx] (tab titles default to the name of the indexed child node). Set it back to the child's name to make the tab default to it again.
   */
  public fun setTabTitle(tabIdx: Int, title: String): Unit {
    TransferContext.writeArguments(LONG to tabIdx.toLong(), STRING to title)
    TransferContext.callMethod(rawPtr, MethodBindings.setTabTitlePtr, NIL)
  }

  /**
   * Returns the title of the tab at index [tabIdx]. Tab titles default to the name of the indexed child node, but this can be overridden with [setTabTitle].
   */
  public fun getTabTitle(tabIdx: Int): String {
    TransferContext.writeArguments(LONG to tabIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getTabTitlePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Sets an icon for the tab at index [tabIdx].
   */
  public fun setTabIcon(tabIdx: Int, icon: Texture2D): Unit {
    TransferContext.writeArguments(LONG to tabIdx.toLong(), OBJECT to icon)
    TransferContext.callMethod(rawPtr, MethodBindings.setTabIconPtr, NIL)
  }

  /**
   * Returns the [godot.Texture2D] for the tab at index [tabIdx] or `null` if the tab has no [godot.Texture2D].
   */
  public fun getTabIcon(tabIdx: Int): Texture2D? {
    TransferContext.writeArguments(LONG to tabIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getTabIconPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
  }

  /**
   * If [disabled] is `true`, disables the tab at index [tabIdx], making it non-interactable.
   */
  public fun setTabDisabled(tabIdx: Int, disabled: Boolean): Unit {
    TransferContext.writeArguments(LONG to tabIdx.toLong(), BOOL to disabled)
    TransferContext.callMethod(rawPtr, MethodBindings.setTabDisabledPtr, NIL)
  }

  /**
   * Returns `true` if the tab at index [tabIdx] is disabled.
   */
  public fun isTabDisabled(tabIdx: Int): Boolean {
    TransferContext.writeArguments(LONG to tabIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isTabDisabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * If [hidden] is `true`, hides the tab at index [tabIdx], making it disappear from the tab area.
   */
  public fun setTabHidden(tabIdx: Int, hidden: Boolean): Unit {
    TransferContext.writeArguments(LONG to tabIdx.toLong(), BOOL to hidden)
    TransferContext.callMethod(rawPtr, MethodBindings.setTabHiddenPtr, NIL)
  }

  /**
   * Returns `true` if the tab at index [tabIdx] is hidden.
   */
  public fun isTabHidden(tabIdx: Int): Boolean {
    TransferContext.writeArguments(LONG to tabIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isTabHiddenPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Sets the metadata value for the tab at index [tabIdx], which can be retrieved later using [getTabMetadata].
   */
  public fun setTabMetadata(tabIdx: Int, metadata: Any?): Unit {
    TransferContext.writeArguments(LONG to tabIdx.toLong(), ANY to metadata)
    TransferContext.callMethod(rawPtr, MethodBindings.setTabMetadataPtr, NIL)
  }

  /**
   * Returns the metadata value set to the tab at index [tabIdx] using [setTabMetadata]. If no metadata was previously set, returns `null` by default.
   */
  public fun getTabMetadata(tabIdx: Int): Any? {
    TransferContext.writeArguments(LONG to tabIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getTabMetadataPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  /**
   * Sets the button icon from the tab at index [tabIdx].
   */
  public fun setTabButtonIcon(tabIdx: Int, icon: Texture2D): Unit {
    TransferContext.writeArguments(LONG to tabIdx.toLong(), OBJECT to icon)
    TransferContext.callMethod(rawPtr, MethodBindings.setTabButtonIconPtr, NIL)
  }

  /**
   * Returns the button icon from the tab at index [tabIdx].
   */
  public fun getTabButtonIcon(tabIdx: Int): Texture2D? {
    TransferContext.writeArguments(LONG to tabIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getTabButtonIconPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
  }

  /**
   * Returns the index of the tab at local coordinates [point]. Returns `-1` if the point is outside the control boundaries or if there's no tab at the queried position.
   */
  public fun getTabIdxAtPoint(point: Vector2): Int {
    TransferContext.writeArguments(VECTOR2 to point)
    TransferContext.callMethod(rawPtr, MethodBindings.getTabIdxAtPointPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the index of the tab tied to the given [control]. The control must be a child of the [godot.TabContainer].
   */
  public fun getTabIdxFromControl(control: Control): Int {
    TransferContext.writeArguments(OBJECT to control)
    TransferContext.callMethod(rawPtr, MethodBindings.getTabIdxFromControlPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * If set on a [godot.Popup] node instance, a popup menu icon appears in the top-right corner of the [godot.TabContainer] (setting it to `null` will make it go away). Clicking it will expand the [godot.Popup] node.
   */
  public fun setPopup(popup: Node): Unit {
    TransferContext.writeArguments(OBJECT to popup)
    TransferContext.callMethod(rawPtr, MethodBindings.setPopupPtr, NIL)
  }

  /**
   * Returns the [godot.Popup] node instance if one has been set already with [setPopup].
   *
   * **Warning:** This is a required internal node, removing and freeing it may cause a crash. If you wish to hide it or any of its children, use their [godot.Window.visible] property.
   */
  public fun getPopup(): Popup? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPopupPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Popup?)
  }

  public companion object

  internal object MethodBindings {
    public val getTabCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "get_tab_count")

    public val setCurrentTabPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "set_current_tab")

    public val getCurrentTabPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "get_current_tab")

    public val getPreviousTabPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "get_previous_tab")

    public val getCurrentTabControlPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "get_current_tab_control")

    public val getTabControlPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "get_tab_control")

    public val setTabAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "set_tab_alignment")

    public val getTabAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "get_tab_alignment")

    public val setClipTabsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "set_clip_tabs")

    public val getClipTabsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "get_clip_tabs")

    public val setTabsVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "set_tabs_visible")

    public val areTabsVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "are_tabs_visible")

    public val setAllTabsInFrontPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "set_all_tabs_in_front")

    public val isAllTabsInFrontPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "is_all_tabs_in_front")

    public val setTabTitlePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "set_tab_title")

    public val getTabTitlePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "get_tab_title")

    public val setTabIconPtr: VoidPtr = TypeManager.getMethodBindPtr("TabContainer", "set_tab_icon")

    public val getTabIconPtr: VoidPtr = TypeManager.getMethodBindPtr("TabContainer", "get_tab_icon")

    public val setTabDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "set_tab_disabled")

    public val isTabDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "is_tab_disabled")

    public val setTabHiddenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "set_tab_hidden")

    public val isTabHiddenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "is_tab_hidden")

    public val setTabMetadataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "set_tab_metadata")

    public val getTabMetadataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "get_tab_metadata")

    public val setTabButtonIconPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "set_tab_button_icon")

    public val getTabButtonIconPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "get_tab_button_icon")

    public val getTabIdxAtPointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "get_tab_idx_at_point")

    public val getTabIdxFromControlPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "get_tab_idx_from_control")

    public val setPopupPtr: VoidPtr = TypeManager.getMethodBindPtr("TabContainer", "set_popup")

    public val getPopupPtr: VoidPtr = TypeManager.getMethodBindPtr("TabContainer", "get_popup")

    public val setDragToRearrangeEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "set_drag_to_rearrange_enabled")

    public val getDragToRearrangeEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "get_drag_to_rearrange_enabled")

    public val setTabsRearrangeGroupPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "set_tabs_rearrange_group")

    public val getTabsRearrangeGroupPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "get_tabs_rearrange_group")

    public val setUseHiddenTabsForMinSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "set_use_hidden_tabs_for_min_size")

    public val getUseHiddenTabsForMinSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TabContainer", "get_use_hidden_tabs_for_min_size")
  }
}
