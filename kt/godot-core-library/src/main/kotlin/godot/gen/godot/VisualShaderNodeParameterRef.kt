// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.MemoryManager
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantParser.NIL
import godot.core.VariantParser.STRING
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

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
    MemoryManager.createNativeObject(ENGINECLASS_VISUALSHADERNODEPARAMETERREF, this, scriptIndex)
  }

  public final fun setParameterName(name: String): Unit {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(ptr, MethodBindings.setParameterNamePtr, NIL)
  }

  public final fun getParameterName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getParameterNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  public companion object

  internal object MethodBindings {
    public val setParameterNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeParameterRef", "set_parameter_name", 83702148)

    public val getParameterNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeParameterRef", "get_parameter_name", 201670096)
  }
}
