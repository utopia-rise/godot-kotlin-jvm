// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantArray
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress

@GodotBaseType
public open class VisualScriptCustomNode : VisualScriptNode() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISUALSCRIPTCUSTOMNODE, scriptIndex)
    return true
  }

  public open fun _getOutputSequencePortCount(): Long {
    throw NotImplementedError("_get_output_sequence_port_count is not implemented for VisualScriptCustomNode")
  }

  public open fun _hasInputSequencePort(): Boolean {
    throw NotImplementedError("_has_input_sequence_port is not implemented for VisualScriptCustomNode")
  }

  public open fun _getOutputSequencePortText(seqIdx: Long): String {
    throw NotImplementedError("_get_output_sequence_port_text is not implemented for VisualScriptCustomNode")
  }

  public open fun _getInputValuePortCount(): Long {
    throw NotImplementedError("_get_input_value_port_count is not implemented for VisualScriptCustomNode")
  }

  public open fun _getInputValuePortType(inputIdx: Long): Long {
    throw NotImplementedError("_get_input_value_port_type is not implemented for VisualScriptCustomNode")
  }

  public open fun _getInputValuePortName(inputIdx: Long): String {
    throw NotImplementedError("_get_input_value_port_name is not implemented for VisualScriptCustomNode")
  }

  public open fun _getInputValuePortHint(inputIdx: Long): Long {
    throw NotImplementedError("_get_input_value_port_hint is not implemented for VisualScriptCustomNode")
  }

  public open fun _getInputValuePortHintString(inputIdx: Long): String {
    throw NotImplementedError("_get_input_value_port_hint_string is not implemented for VisualScriptCustomNode")
  }

  public open fun _getOutputValuePortCount(): Long {
    throw NotImplementedError("_get_output_value_port_count is not implemented for VisualScriptCustomNode")
  }

  public open fun _getOutputValuePortType(outputIdx: Long): Long {
    throw NotImplementedError("_get_output_value_port_type is not implemented for VisualScriptCustomNode")
  }

  public open fun _getOutputValuePortName(outputIdx: Long): String {
    throw NotImplementedError("_get_output_value_port_name is not implemented for VisualScriptCustomNode")
  }

  public open fun _getOutputValuePortHint(outputIdx: Long): Long {
    throw NotImplementedError("_get_output_value_port_hint is not implemented for VisualScriptCustomNode")
  }

  public open fun _getOutputValuePortHintString(outputIdx: Long): String {
    throw NotImplementedError("_get_output_value_port_hint_string is not implemented for VisualScriptCustomNode")
  }

  public open fun _getCaption(): String {
    throw NotImplementedError("_get_caption is not implemented for VisualScriptCustomNode")
  }

  public open fun _getText(): String {
    throw NotImplementedError("_get_text is not implemented for VisualScriptCustomNode")
  }

  public open fun _getCategory(): String {
    throw NotImplementedError("_get_category is not implemented for VisualScriptCustomNode")
  }

  public open fun _getWorkingMemorySize(): Long {
    throw NotImplementedError("_get_working_memory_size is not implemented for VisualScriptCustomNode")
  }

  public open fun _step(
    inputs: VariantArray<Any?>,
    outputs: VariantArray<Any?>,
    startMode: Long,
    workingMem: VariantArray<Any?>
  ): Any? {
    throw NotImplementedError("_step is not implemented for VisualScriptCustomNode")
  }

  public enum class StartMode(
    id: Long
  ) {
    START_MODE_BEGIN_SEQUENCE(0),
    START_MODE_CONTINUE_SEQUENCE(1),
    START_MODE_RESUME_YIELD(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object {
    public final const val STEP_PUSH_STACK_BIT: Long = 16777216

    public final const val STEP_GO_BACK_BIT: Long = 33554432

    public final const val STEP_NO_ADVANCE_BIT: Long = 67108864

    public final const val STEP_EXIT_FUNCTION_BIT: Long = 134217728

    public final const val STEP_YIELD_BIT: Long = 268435456
  }
}
