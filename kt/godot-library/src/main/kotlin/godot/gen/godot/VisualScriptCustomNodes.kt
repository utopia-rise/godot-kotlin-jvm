// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public object VisualScriptCustomNodes : Object() {
  public val customNodesUpdated: Signal0 by signal()

  public override fun new(scriptIndex: Int): Boolean {
    rawPtr = TransferContext.getSingleton(ENGINECLASS_VISUALSCRIPTCUSTOMNODES)
    return false
  }

  public fun addCustomNode(
    name: String,
    category: String,
    script: Script
  ): Unit {
    TransferContext.writeArguments(STRING to name, STRING to category, OBJECT to script)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTCUSTOMNODES_ADD_CUSTOM_NODE, NIL)
  }

  public fun removeCustomNode(name: String, category: String): Unit {
    TransferContext.writeArguments(STRING to name, STRING to category)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTCUSTOMNODES_REMOVE_CUSTOM_NODE, NIL)
  }
}
