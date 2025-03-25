// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.STRING
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
  public final inline var parameterName: String
    @JvmName("parameterNameProperty")
    get() = getParameterName()
    @JvmName("parameterNameProperty")
    set(`value`) {
      setParameterName(value)
    }

  /**
   * Defines the scope of the parameter.
   */
  public final inline var qualifier: Qualifier
    @JvmName("qualifierProperty")
    get() = getQualifier()
    @JvmName("qualifierProperty")
    set(`value`) {
      setQualifier(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(772, scriptIndex)
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

  public final fun setQualifier(qualifier: Qualifier): Unit {
    TransferContext.writeArguments(LONG to qualifier.id)
    TransferContext.callMethod(ptr, MethodBindings.setQualifierPtr, NIL)
  }

  public final fun getQualifier(): Qualifier {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getQualifierPtr, LONG)
    return Qualifier.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public enum class Qualifier(
    id: Long,
  ) {
    /**
     * The parameter will be tied to the [ShaderMaterial] using this shader.
     */
    NONE(0),
    /**
     * The parameter will use a global value, defined in Project Settings.
     */
    GLOBAL(1),
    /**
     * The parameter will be tied to the node with attached [ShaderMaterial] using this shader.
     */
    INSTANCE(2),
    /**
     * Represents the size of the [Qualifier] enum.
     */
    MAX(3),
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

  public object MethodBindings {
    internal val setParameterNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeParameter", "set_parameter_name", 83702148)

    internal val getParameterNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeParameter", "get_parameter_name", 201670096)

    internal val setQualifierPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeParameter", "set_qualifier", 1276489447)

    internal val getQualifierPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeParameter", "get_qualifier", 3558406205)
  }
}
