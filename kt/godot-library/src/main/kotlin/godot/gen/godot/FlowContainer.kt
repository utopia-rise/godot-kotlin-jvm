// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.LONG
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Base class for flow containers.
 *
 * Arranges child [godot.Control] nodes vertically or horizontally in a left-to-right or top-to-bottom flow.
 *
 * A line is filled with [godot.Control] nodes until no more fit on the same line, similar to text in an autowrapped label.
 */
@GodotBaseType
public open class FlowContainer : Container() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_FLOWCONTAINER)
  }

  /**
   * Returns the current line count.
   */
  public open fun getLineCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FLOWCONTAINER_GET_LINE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public companion object
}
