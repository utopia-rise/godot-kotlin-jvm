// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantArray
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class VisualScriptCustomNode : VisualScriptNode() {
  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_VISUALSCRIPTCUSTOMNODE)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    __id = buffer.long
    buffer.rewind()
  }

  open fun _getCaption(): String {
    throw NotImplementedError("_get_caption is not implemented for VisualScriptCustomNode")
  }

  open fun _getCategory(): String {
    throw NotImplementedError("_get_category is not implemented for VisualScriptCustomNode")
  }

  open fun _getInputValuePortCount(): Long {
    throw
        NotImplementedError("_get_input_value_port_count is not implemented for VisualScriptCustomNode")
  }

  open fun _getInputValuePortName(idx: Long): String {
    throw
        NotImplementedError("_get_input_value_port_name is not implemented for VisualScriptCustomNode")
  }

  open fun _getInputValuePortType(idx: Long): Long {
    throw
        NotImplementedError("_get_input_value_port_type is not implemented for VisualScriptCustomNode")
  }

  open fun _getOutputSequencePortCount(): Long {
    throw
        NotImplementedError("_get_output_sequence_port_count is not implemented for VisualScriptCustomNode")
  }

  open fun _getOutputSequencePortText(idx: Long): String {
    throw
        NotImplementedError("_get_output_sequence_port_text is not implemented for VisualScriptCustomNode")
  }

  open fun _getOutputValuePortCount(): Long {
    throw
        NotImplementedError("_get_output_value_port_count is not implemented for VisualScriptCustomNode")
  }

  open fun _getOutputValuePortName(idx: Long): String {
    throw
        NotImplementedError("_get_output_value_port_name is not implemented for VisualScriptCustomNode")
  }

  open fun _getOutputValuePortType(idx: Long): Long {
    throw
        NotImplementedError("_get_output_value_port_type is not implemented for VisualScriptCustomNode")
  }

  open fun _getText(): String {
    throw NotImplementedError("_get_text is not implemented for VisualScriptCustomNode")
  }

  open fun _getWorkingMemorySize(): Long {
    throw
        NotImplementedError("_get_working_memory_size is not implemented for VisualScriptCustomNode")
  }

  open fun _hasInputSequencePort(): Boolean {
    throw
        NotImplementedError("_has_input_sequence_port is not implemented for VisualScriptCustomNode")
  }

  open fun _scriptChanged() {
  }

  open fun _step(
    inputs: VariantArray<Any?>,
    outputs: VariantArray<Any?>,
    startMode: Long,
    workingMem: VariantArray<Any?>
  ): Any? {
    throw NotImplementedError("_step is not implemented for VisualScriptCustomNode")
  }

  enum class StartMode(
    id: Long
  ) {
    START_MODE_BEGIN_SEQUENCE(0),

    START_MODE_CONTINUE_SEQUENCE(1),

    START_MODE_RESUME_YIELD(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val START_MODE_BEGIN_SEQUENCE: Long = 0

    final const val START_MODE_CONTINUE_SEQUENCE: Long = 1

    final const val START_MODE_RESUME_YIELD: Long = 2

    final const val STEP_EXIT_FUNCTION_BIT: Long = 134217728

    final const val STEP_GO_BACK_BIT: Long = 33554432

    final const val STEP_NO_ADVANCE_BIT: Long = 67108864

    final const val STEP_PUSH_STACK_BIT: Long = 16777216

    final const val STEP_YIELD_BIT: Long = 268435456
  }
}
