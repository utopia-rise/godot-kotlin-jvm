// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.signal
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Tabbed container.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/ui/gui_containers.html]($DOCS_URL/tutorials/ui/gui_containers.html)
 *
 * Arranges [godot.Control] children into a tabbed view, creating a tab for each one. The active tab's corresponding [godot.Control] has its `visible` property set to `true`, and all other children's to `false`.
 *
 * Ignores non-[godot.Control] children.
 *
 * **Note:** The drawing of the clickable tabs themselves is handled by this node. Adding [godot.TabBar]s as children is not needed.
 */
@GodotBaseType
public open class TabContainer : Container() {
  /**
   * Emitted when the [godot.TabContainer]'s [godot.Popup] button is clicked. See [setPopup] for details.
   */
  public val prePopupPressed: Signal0 by signal()

  /**
   * Emitted when a tab is selected, even if it is the current tab.
   */
  public val tabSelected: Signal1<Long> by signal("tab")

  /**
   * Emitted when switching to another tab.
   */
  public val tabChanged: Signal1<Long> by signal("tab")

  /**
   * Sets the position at which tabs will be placed. See [enum TabBar.AlignmentMode] for details.
   */
  public var tabAlignment: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABCONTAINER_GET_TAB_ALIGNMENT,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABCONTAINER_SET_TAB_ALIGNMENT,
          NIL)
    }

  /**
   * The current tab index. When set, this index's [godot.Control] node's `visible` property is set to `true` and all others are set to `false`.
   */
  public var currentTab: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABCONTAINER_GET_CURRENT_TAB,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABCONTAINER_SET_CURRENT_TAB, NIL)
    }

  /**
   * If `true`, tabs overflowing this node's width will be hidden, displaying two navigation buttons instead. Otherwise, this node's minimum size is updated so that all tabs are visible.
   */
  public var clipTabs: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABCONTAINER_GET_CLIP_TABS, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABCONTAINER_SET_CLIP_TABS, NIL)
    }

  /**
   * If `true`, tabs are visible. If `false`, tabs' content and titles are hidden.
   */
  public var tabsVisible: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABCONTAINER_ARE_TABS_VISIBLE,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABCONTAINER_SET_TABS_VISIBLE,
          NIL)
    }

  /**
   * If `true`, all tabs are drawn in front of the panel. If `false`, inactive tabs are drawn behind the panel.
   */
  public var allTabsInFront: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABCONTAINER_IS_ALL_TABS_IN_FRONT,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TABCONTAINER_SET_ALL_TABS_IN_FRONT, NIL)
    }

  /**
   * If `true`, tabs can be rearranged with mouse drag.
   */
  public var dragToRearrangeEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TABCONTAINER_GET_DRAG_TO_REARRANGE_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TABCONTAINER_SET_DRAG_TO_REARRANGE_ENABLED, NIL)
    }

  /**
   * [godot.TabContainer]s with the same rearrange group ID will allow dragging the tabs between them. Enable drag with [dragToRearrangeEnabled].
   *
   * Setting this to `-1` will disable rearranging between [godot.TabContainer]s.
   */
  public var tabsRearrangeGroup: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TABCONTAINER_GET_TABS_REARRANGE_GROUP, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TABCONTAINER_SET_TABS_REARRANGE_GROUP, NIL)
    }

  /**
   * If `true`, children [godot.Control] nodes that are hidden have their minimum size take into account in the total, instead of only the currently visible one.
   */
  public var useHiddenTabsForMinSize: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TABCONTAINER_GET_USE_HIDDEN_TABS_FOR_MIN_SIZE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TABCONTAINER_SET_USE_HIDDEN_TABS_FOR_MIN_SIZE, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_TABCONTAINER)
  }

  /**
   * Returns the number of tabs.
   */
  public fun getTabCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABCONTAINER_GET_TAB_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the previously active tab index.
   */
  public fun getPreviousTab(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABCONTAINER_GET_PREVIOUS_TAB, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the child [godot.Control] node located at the active tab index.
   */
  public fun getCurrentTabControl(): Control? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TABCONTAINER_GET_CURRENT_TAB_CONTROL, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Control?
  }

  /**
   * Returns the [godot.Control] node from the tab at index `tab_idx`.
   */
  public fun getTabControl(tabIdx: Long): Control? {
    TransferContext.writeArguments(LONG to tabIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABCONTAINER_GET_TAB_CONTROL,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Control?
  }

  /**
   * Sets a custom title for the tab at index `tab_idx` (tab titles default to the name of the indexed child node). Set it back to the child's name to make the tab default to it again.
   */
  public fun setTabTitle(tabIdx: Long, title: String): Unit {
    TransferContext.writeArguments(LONG to tabIdx, STRING to title)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABCONTAINER_SET_TAB_TITLE, NIL)
  }

  /**
   * Returns the title of the tab at index `tab_idx`. Tab titles default to the name of the indexed child node, but this can be overridden with [setTabTitle].
   */
  public fun getTabTitle(tabIdx: Long): String {
    TransferContext.writeArguments(LONG to tabIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABCONTAINER_GET_TAB_TITLE, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Sets an icon for the tab at index `tab_idx`.
   */
  public fun setTabIcon(tabIdx: Long, icon: Texture2D): Unit {
    TransferContext.writeArguments(LONG to tabIdx, OBJECT to icon)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABCONTAINER_SET_TAB_ICON, NIL)
  }

  /**
   * Returns the [godot.Texture2D] for the tab at index `tab_idx` or `null` if the tab has no [godot.Texture2D].
   */
  public fun getTabIcon(tabIdx: Long): Texture2D? {
    TransferContext.writeArguments(LONG to tabIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABCONTAINER_GET_TAB_ICON, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
  }

  /**
   * If `disabled` is `true`, disables the tab at index `tab_idx`, making it non-interactable.
   */
  public fun setTabDisabled(tabIdx: Long, disabled: Boolean): Unit {
    TransferContext.writeArguments(LONG to tabIdx, BOOL to disabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABCONTAINER_SET_TAB_DISABLED, NIL)
  }

  /**
   * Returns `true` if the tab at index `tab_idx` is disabled.
   */
  public fun isTabDisabled(tabIdx: Long): Boolean {
    TransferContext.writeArguments(LONG to tabIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABCONTAINER_IS_TAB_DISABLED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * If `hidden` is `true`, hides the tab at index `tab_idx`, making it disappear from the tab area.
   */
  public fun setTabHidden(tabIdx: Long, hidden: Boolean): Unit {
    TransferContext.writeArguments(LONG to tabIdx, BOOL to hidden)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABCONTAINER_SET_TAB_HIDDEN, NIL)
  }

  /**
   * Returns `true` if the tab at index `tab_idx` is hidden.
   */
  public fun isTabHidden(tabIdx: Long): Boolean {
    TransferContext.writeArguments(LONG to tabIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABCONTAINER_IS_TAB_HIDDEN, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the index of the tab at local coordinates `point`. Returns `-1` if the point is outside the control boundaries or if there's no tab at the queried position.
   */
  public fun getTabIdxAtPoint(point: Vector2): Long {
    TransferContext.writeArguments(VECTOR2 to point)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABCONTAINER_GET_TAB_IDX_AT_POINT,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the index of the tab tied to the given `control`. The control must be a child of the [godot.TabContainer].
   */
  public fun getTabIdxFromControl(control: Control): Long {
    TransferContext.writeArguments(OBJECT to control)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TABCONTAINER_GET_TAB_IDX_FROM_CONTROL, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * If set on a [godot.Popup] node instance, a popup menu icon appears in the top-right corner of the [godot.TabContainer] (setting it to `null` will make it go away). Clicking it will expand the [godot.Popup] node.
   */
  public fun setPopup(popup: Node): Unit {
    TransferContext.writeArguments(OBJECT to popup)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABCONTAINER_SET_POPUP, NIL)
  }

  /**
   * Returns the [godot.Popup] node instance if one has been set already with [setPopup].
   *
   * **Warning:** This is a required internal node, removing and freeing it may cause a crash. If you wish to hide it or any of its children, use their [godot.Window.visible] property.
   */
  public fun getPopup(): Popup? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABCONTAINER_GET_POPUP, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Popup?
  }

  public companion object
}
