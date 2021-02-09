// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

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
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class Tabs : Control() {
  val repositionActiveTabRequest: Signal1<Long> by signal("idx_to")

  val rightButtonPressed: Signal1<Long> by signal("tab")

  val tabChanged: Signal1<Long> by signal("tab")

  val tabClicked: Signal1<Long> by signal("tab")

  val tabClose: Signal1<Long> by signal("tab")

  val tabHover: Signal1<Long> by signal("tab")

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

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_TABS)

  override fun _guiInput(event: InputEvent) {
  }

  open fun _onMouseExited() {
  }

  open fun _updateHover() {
  }

  open fun addTab(title: String = "", icon: Texture? = null) {
    TransferContext.writeArguments(STRING to title, OBJECT to icon)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABS_ADD_TAB, NIL)
  }

  open fun ensureTabVisible(idx: Long) {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABS_ENSURE_TAB_VISIBLE, NIL)
  }

  open fun getOffsetButtonsVisible(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABS_GET_OFFSET_BUTTONS_VISIBLE,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun getSelectWithRmb(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABS_GET_SELECT_WITH_RMB, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun getTabCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABS_GET_TAB_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getTabDisabled(tabIdx: Long): Boolean {
    TransferContext.writeArguments(LONG to tabIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABS_GET_TAB_DISABLED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun getTabIcon(tabIdx: Long): Texture? {
    TransferContext.writeArguments(LONG to tabIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABS_GET_TAB_ICON, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Texture?
  }

  open fun getTabOffset(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABS_GET_TAB_OFFSET, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getTabRect(tabIdx: Long): Rect2 {
    TransferContext.writeArguments(LONG to tabIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABS_GET_TAB_RECT, RECT2)
    return TransferContext.readReturnValue(RECT2, false) as Rect2
  }

  open fun getTabTitle(tabIdx: Long): String {
    TransferContext.writeArguments(LONG to tabIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABS_GET_TAB_TITLE, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun getTabsRearrangeGroup(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABS_GET_TABS_REARRANGE_GROUP, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun moveTab(from: Long, to: Long) {
    TransferContext.writeArguments(LONG to from, LONG to to)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABS_MOVE_TAB, NIL)
  }

  open fun removeTab(tabIdx: Long) {
    TransferContext.writeArguments(LONG to tabIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABS_REMOVE_TAB, NIL)
  }

  open fun setSelectWithRmb(enabled: Boolean) {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABS_SET_SELECT_WITH_RMB, NIL)
  }

  open fun setTabDisabled(tabIdx: Long, disabled: Boolean) {
    TransferContext.writeArguments(LONG to tabIdx, BOOL to disabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABS_SET_TAB_DISABLED, NIL)
  }

  open fun setTabIcon(tabIdx: Long, icon: Texture) {
    TransferContext.writeArguments(LONG to tabIdx, OBJECT to icon)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABS_SET_TAB_ICON, NIL)
  }

  open fun setTabTitle(tabIdx: Long, title: String) {
    TransferContext.writeArguments(LONG to tabIdx, STRING to title)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABS_SET_TAB_TITLE, NIL)
  }

  open fun setTabsRearrangeGroup(groupId: Long) {
    TransferContext.writeArguments(LONG to groupId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABS_SET_TABS_REARRANGE_GROUP, NIL)
  }

  enum class CloseButtonDisplayPolicy(
    id: Long
  ) {
    CLOSE_BUTTON_SHOW_NEVER(0),

    CLOSE_BUTTON_SHOW_ACTIVE_ONLY(1),

    CLOSE_BUTTON_SHOW_ALWAYS(2),

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
    ALIGN_LEFT(0),

    ALIGN_CENTER(1),

    ALIGN_RIGHT(2),

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
    final const val ALIGN_CENTER: Long = 1

    final const val ALIGN_LEFT: Long = 0

    final const val ALIGN_MAX: Long = 3

    final const val ALIGN_RIGHT: Long = 2

    final const val CLOSE_BUTTON_MAX: Long = 3

    final const val CLOSE_BUTTON_SHOW_ACTIVE_ONLY: Long = 1

    final const val CLOSE_BUTTON_SHOW_ALWAYS: Long = 2

    final const val CLOSE_BUTTON_SHOW_NEVER: Long = 0
  }
}
