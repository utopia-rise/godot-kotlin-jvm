// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Signal0
import godot.core.VariantParser.NIL
import godot.core.VariantParser.STRING
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_VISUALSHADERNODEINPUT_INDEX: Int = 738

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
    Internals.callConstructor(this, ENGINE_CLASS_VISUALSHADERNODEINPUT_INDEX, scriptIndex)
  }

  public final fun setInputName(name: String): Unit {
    Internals.writeArguments(STRING to name)
    Internals.callMethod(rawPtr, MethodBindings.setInputNamePtr, NIL)
  }

  public final fun getInputName(): String {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getInputNamePtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  /**
   * Returns a translated name of the current constant in the Godot Shader Language. E.g. `"ALBEDO"`
   * if the [inputName] equal to `"albedo"`.
   */
  public final fun getInputRealName(): String {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getInputRealNamePtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  public companion object

  internal object MethodBindings {
    public val setInputNamePtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeInput", "set_input_name", 83702148)

    public val getInputNamePtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeInput", "get_input_name", 201670096)

    public val getInputRealNamePtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeInput", "get_input_real_name", 201670096)
  }
}
