// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.NIL
import godot.core.VariantParser.STRING
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_VISUALSHADERNODEPARAMETERREF_INDEX: Int = 671

/**
 * Creating a reference to a [VisualShaderNodeParameter] allows you to reuse this parameter in
 * different shaders or shader stages easily.
 */
@GodotBaseType
public open class VisualShaderNodeParameterRef : VisualShaderNode() {
  /**
   * The name of the parameter which this reference points to.
   */
  public final inline var parameterName: String
    @JvmName("parameterNameProperty")
    get() = getParameterName()
    @JvmName("parameterNameProperty")
    set(`value`) {
      setParameterName(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_VISUALSHADERNODEPARAMETERREF_INDEX, scriptIndex)
  }

  public final fun setParameterName(name: String): Unit {
    Internals.writeArguments(STRING to name)
    Internals.callMethod(rawPtr, MethodBindings.setParameterNamePtr, NIL)
  }

  public final fun getParameterName(): String {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getParameterNamePtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  public companion object

  internal object MethodBindings {
    public val setParameterNamePtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeParameterRef", "set_parameter_name", 83702148)

    public val getParameterNamePtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeParameterRef", "get_parameter_name", 201670096)
  }
}
