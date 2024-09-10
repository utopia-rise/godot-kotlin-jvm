// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * A parameter represents a variable in the shader which is set externally, i.e. from the
 * [ShaderMaterial]. Parameters are exposed as properties in the [ShaderMaterial] and can be assigned
 * from the Inspector or from a script.
 */
@GodotBaseType
public open class VisualShaderNodeParameter internal constructor() : VisualShaderNode() {
  /**
   * Name of the parameter, by which it can be accessed through the [ShaderMaterial] properties.
   */
  public var parameterName: String
    @JvmName("parameterNameProperty")
    get() = getParameterName()
    @JvmName("parameterNameProperty")
    set(`value`) {
      setParameterName(value)
    }

  /**
   * Defines the scope of the parameter.
   */
  public var qualifier: Qualifier
    @JvmName("qualifierProperty")
    get() = getQualifier()
    @JvmName("qualifierProperty")
    set(`value`) {
      setQualifier(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_VISUALSHADERNODEPARAMETER, scriptIndex)
  }

  public fun setParameterName(name: String): Unit {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.setParameterNamePtr, NIL)
  }

  public fun getParameterName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getParameterNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun setQualifier(qualifier: Qualifier): Unit {
    TransferContext.writeArguments(LONG to qualifier.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setQualifierPtr, NIL)
  }

  public fun getQualifier(): Qualifier {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getQualifierPtr, LONG)
    return VisualShaderNodeParameter.Qualifier.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public enum class Qualifier(
    id: Long,
  ) {
    /**
     * The parameter will be tied to the [ShaderMaterial] using this shader.
     */
    QUAL_NONE(0),
    /**
     * The parameter will use a global value, defined in Project Settings.
     */
    QUAL_GLOBAL(1),
    /**
     * The parameter will be tied to the node with attached [ShaderMaterial] using this shader.
     */
    QUAL_INSTANCE(2),
    /**
     * Represents the size of the [Qualifier] enum.
     */
    QUAL_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Qualifier = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setParameterNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeParameter", "set_parameter_name", 83702148)

    public val getParameterNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeParameter", "get_parameter_name", 201670096)

    public val setQualifierPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeParameter", "set_qualifier", 1276489447)

    public val getQualifierPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeParameter", "get_qualifier", 3558406205)
  }
}
