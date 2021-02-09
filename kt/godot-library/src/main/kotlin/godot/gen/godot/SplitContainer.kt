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
import godot.signals.Signal1
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
open class SplitContainer : Container() {
  val dragged: Signal1<Long> by signal("offset")

  open var collapsed: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPLITCONTAINER_GET_COLLAPSED,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPLITCONTAINER_SET_COLLAPSED, NIL)
    }

  open var draggerVisibility: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPLITCONTAINER_GET_DRAGGER_VISIBILITY, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPLITCONTAINER_SET_DRAGGER_VISIBILITY, NIL)
    }

  open var splitOffset: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPLITCONTAINER_GET_SPLIT_OFFSET,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPLITCONTAINER_SET_SPLIT_OFFSET,
          NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_SPLITCONTAINER)

  override fun _gui_input(event: InputEvent) {
  }

  open fun clampSplitOffset() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPLITCONTAINER_CLAMP_SPLIT_OFFSET,
        NIL)
  }

  enum class DraggerVisibility(
    id: Long
  ) {
    DRAGGER_VISIBLE(0),

    DRAGGER_HIDDEN(1),

    DRAGGER_HIDDEN_COLLAPSED(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val DRAGGER_HIDDEN: Long = 1

    final const val DRAGGER_HIDDEN_COLLAPSED: Long = 2

    final const val DRAGGER_VISIBLE: Long = 0
  }
}
