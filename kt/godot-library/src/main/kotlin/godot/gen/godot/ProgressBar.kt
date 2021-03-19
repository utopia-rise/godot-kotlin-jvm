// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import kotlin.Boolean
import kotlin.Suppress

/**
 * General-purpose progress bar.
 * 
 * General-purpose progress bar. Shows fill percentage from right to left.
 */
@GodotBaseType
open class ProgressBar : Range() {
  /**
   * If `true`, the fill percentage is displayed on the bar.
   */
  open var percentVisible: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROGRESSBAR_GET_PERCENT_VISIBLE,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROGRESSBAR_SET_PERCENT_VISIBLE,
          NIL)
    }

  override fun __new() {
    callConstructor(ENGINECLASS_PROGRESSBAR)
  }
}
