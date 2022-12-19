// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.LONG
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * Base class for flow containers.
 *
 * Arranges child [godot.Control] nodes vertically or horizontally in a left-to-right or top-to-bottom flow.
 *
 * A line is filled with [godot.Control] nodes until no more fit on the same line, similar to text in an autowrapped label.
 */
@GodotBaseType
public open class FlowContainer internal constructor() : Container() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_FLOWCONTAINER, scriptIndex)
    return true
  }

  /**
   * Returns the current line count.
   */
  public fun getLineCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FLOWCONTAINER_GET_LINE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public companion object
}
