// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.STRING
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_VISUALSHADERNODEPARAMETER_INDEX: Int = 749

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
    Internals.callConstructor(this, ENGINE_CLASS_VISUALSHADERNODEPARAMETER_INDEX, scriptIndex)
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

  public final fun setQualifier(qualifier: Qualifier): Unit {
    Internals.writeArguments(LONG to qualifier.id)
    Internals.callMethod(rawPtr, MethodBindings.setQualifierPtr, NIL)
  }

  public final fun getQualifier(): Qualifier {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getQualifierPtr, LONG)
    return VisualShaderNodeParameter.Qualifier.from(Internals.readReturnValue(LONG) as Long)
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
        Internals.getMethodBindPtr("VisualShaderNodeParameter", "set_parameter_name", 83702148)

    public val getParameterNamePtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeParameter", "get_parameter_name", 201670096)

    public val setQualifierPtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeParameter", "set_qualifier", 1276489447)

    public val getQualifierPtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeParameter", "get_qualifier", 3558406205)
  }
}
