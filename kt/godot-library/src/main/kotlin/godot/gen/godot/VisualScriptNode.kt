// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.ANY
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Any
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class VisualScriptNode internal constructor() : Resource() {
  public val portsChanged: Signal0 by signal()

  public override fun __new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_VISUALSCRIPTNODE, scriptIndex)
  }

  public fun getVisualScript(): VisualScript? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTNODE_GET_VISUAL_SCRIPT,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as VisualScript?
  }

  public fun setDefaultInputValue(portIdx: Long, `value`: Any): Unit {
    TransferContext.writeArguments(LONG to portIdx, ANY to value)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTNODE_SET_DEFAULT_INPUT_VALUE, NIL)
  }

  public fun getDefaultInputValue(portIdx: Long): Any? {
    TransferContext.writeArguments(LONG to portIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTNODE_GET_DEFAULT_INPUT_VALUE, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  public fun portsChangedNotify(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTNODE_PORTS_CHANGED_NOTIFY, NIL)
  }

  public companion object
}
