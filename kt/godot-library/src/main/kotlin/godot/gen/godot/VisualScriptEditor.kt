// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.signals.Signal0
import godot.signals.signal
import kotlin.String
import kotlin.Suppress

@GodotBaseType
object VisualScriptEditor : Object() {
  val customNodesUpdated: Signal0 by signal()

  override fun __new() {
    rawPtr = TransferContext.getSingleton(ENGINESINGLETON_VISUALSCRIPTEDITOR)
  }

  override fun ____DO_NOT_TOUCH_THIS_isSingleton____() = true

  fun addCustomNode(
    name: String,
    category: String,
    script: Script
  ) {
    TransferContext.writeArguments(STRING to name, STRING to category, OBJECT to script)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__VISUALSCRIPTEDITOR_ADD_CUSTOM_NODE,
        NIL)
  }

  fun removeCustomNode(name: String, category: String) {
    TransferContext.writeArguments(STRING to name, STRING to category)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS__VISUALSCRIPTEDITOR_REMOVE_CUSTOM_NODE, NIL)
  }
}
