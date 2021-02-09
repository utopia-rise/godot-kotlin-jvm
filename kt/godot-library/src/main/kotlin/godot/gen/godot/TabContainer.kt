// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

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
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class TabContainer : Container() {
  val prePopupPressed: Signal0 by signal()

  val tabChanged: Signal1<Long> by signal("tab")

  val tabSelected: Signal1<Long> by signal("tab")

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

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_TABCONTAINER)

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

  open fun getCurrentTabControl(): Control? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TABCONTAINER_GET_CURRENT_TAB_CONTROL, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Control?
  }

  open fun getPopup(): Popup? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABCONTAINER_GET_POPUP, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Popup?
  }

  open fun getPreviousTab(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABCONTAINER_GET_PREVIOUS_TAB, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getTabControl(tabIdx: Long): Control? {
    TransferContext.writeArguments(LONG to tabIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABCONTAINER_GET_TAB_CONTROL,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Control?
  }

  open fun getTabCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABCONTAINER_GET_TAB_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getTabDisabled(tabIdx: Long): Boolean {
    TransferContext.writeArguments(LONG to tabIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABCONTAINER_GET_TAB_DISABLED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun getTabIcon(tabIdx: Long): Texture? {
    TransferContext.writeArguments(LONG to tabIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABCONTAINER_GET_TAB_ICON, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Texture?
  }

  open fun getTabTitle(tabIdx: Long): String {
    TransferContext.writeArguments(LONG to tabIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABCONTAINER_GET_TAB_TITLE, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun getTabsRearrangeGroup(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TABCONTAINER_GET_TABS_REARRANGE_GROUP, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun setPopup(popup: Node) {
    TransferContext.writeArguments(OBJECT to popup)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABCONTAINER_SET_POPUP, NIL)
  }

  open fun setTabDisabled(tabIdx: Long, disabled: Boolean) {
    TransferContext.writeArguments(LONG to tabIdx, BOOL to disabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABCONTAINER_SET_TAB_DISABLED, NIL)
  }

  open fun setTabIcon(tabIdx: Long, icon: Texture) {
    TransferContext.writeArguments(LONG to tabIdx, OBJECT to icon)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABCONTAINER_SET_TAB_ICON, NIL)
  }

  open fun setTabTitle(tabIdx: Long, title: String) {
    TransferContext.writeArguments(LONG to tabIdx, STRING to title)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TABCONTAINER_SET_TAB_TITLE, NIL)
  }

  open fun setTabsRearrangeGroup(groupId: Long) {
    TransferContext.writeArguments(LONG to groupId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TABCONTAINER_SET_TABS_REARRANGE_GROUP, NIL)
  }

  enum class TabAlign(
    id: Long
  ) {
    ALIGN_LEFT(0),

    ALIGN_CENTER(1),

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
    final const val ALIGN_CENTER: Long = 1

    final const val ALIGN_LEFT: Long = 0

    final const val ALIGN_RIGHT: Long = 2
  }
}
