// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.common.interop.VoidPtr
import godot.core.Signal0
import godot.core.TypeManager
import godot.core.VariantParser.NIL
import godot.core.VariantParser.STRING
import godot.core.memory.TransferContext
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Gives access to input variables (built-ins) available for the shader. See the shading reference
 * for the list of available built-ins for each shader type (check `Tutorials` section for link).
 */
@GodotBaseType
public open class VisualShaderNodeInput : VisualShaderNode() {
  /**
   * Emitted when input is changed via [inputName].
   */
  public val inputTypeChanged: Signal0 by Signal0

  /**
   * One of the several input constants in lower-case style like: "vertex" (`VERTEX`) or
   * "point_size" (`POINT_SIZE`).
   */
  public final inline var inputName: String
    @JvmName("inputNameProperty")
    get() = getInputName()
    @JvmName("inputNameProperty")
    set(`value`) {
      setInputName(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_VISUALSHADERNODEINPUT, scriptIndex)
  }

  public final fun setInputName(name: String): Unit {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(ptr, MethodBindings.setInputNamePtr, NIL)
  }

  public final fun getInputName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getInputNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns a translated name of the current constant in the Godot Shader Language. E.g. `"ALBEDO"`
   * if the [inputName] equal to `"albedo"`.
   */
  public final fun getInputRealName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getInputRealNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  public companion object

  internal object MethodBindings {
    public val setInputNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeInput", "set_input_name", 83702148)

    public val getInputNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeInput", "get_input_name", 201670096)

    public val getInputRealNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeInput", "get_input_real_name", 201670096)
  }
}
