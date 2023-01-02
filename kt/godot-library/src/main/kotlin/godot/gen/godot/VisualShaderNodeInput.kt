// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress

/**
 * Represents the input shader parameter within the visual shader graph.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/shaders/shader_reference/index.html]($DOCS_URL/tutorials/shaders/shader_reference/index.html)
 *
 * Gives access to input variables (built-ins) available for the shader. See the shading reference for the list of available built-ins for each shader type (check `Tutorials` section for link).
 */
@GodotBaseType
public open class VisualShaderNodeInput : VisualShaderNode() {
  /**
   * Emitted when input is changed via [inputName].
   */
  public val inputTypeChanged: Signal0 by signal()

  /**
   * One of the several input constants in lower-case style like: "vertex" (`VERTEX`) or "point_size" (`POINT_SIZE`).
   */
  public var inputName: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEINPUT_GET_INPUT_NAME, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEINPUT_SET_INPUT_NAME, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISUALSHADERNODEINPUT, scriptIndex)
    return true
  }

  /**
   * Returns a translated name of the current constant in the Godot Shader Language. E.g. `"ALBEDO"` if the [inputName] equal to `"albedo"`.
   */
  public fun getInputRealName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEINPUT_GET_INPUT_REAL_NAME, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  public companion object
}
