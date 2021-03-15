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
import kotlin.Boolean
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
open class BoxContainer : Container() {
  open var alignment: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BOXCONTAINER_GET_ALIGNMENT, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BOXCONTAINER_SET_ALIGNMENT, NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_BOXCONTAINER, ____DO_NOT_TOUCH_THIS_isRef____())
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  open fun addSpacer(begin: Boolean) {
    TransferContext.writeArguments(BOOL to begin)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BOXCONTAINER_ADD_SPACER, NIL)
  }

  enum class AlignMode(
    id: Long
  ) {
    ALIGN_BEGIN(0),

    ALIGN_CENTER(1),

    ALIGN_END(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val ALIGN_BEGIN: Long = 0

    final const val ALIGN_CENTER: Long = 1

    final const val ALIGN_END: Long = 2
  }
}
