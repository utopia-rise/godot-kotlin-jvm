// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

/**
 * A base type for the parameters within the visual shader graph.
 *
 * A parameter represents a variable in the shader which is set externally, i.e. from the [godot.ShaderMaterial]. Parameters are exposed as properties in the [godot.ShaderMaterial] and can be assigned from the Inspector or from a script.
 */
@GodotBaseType
public open class VisualShaderNodeParameter internal constructor() : VisualShaderNode() {
  /**
   * Name of the parameter, by which it can be accessed through the [godot.ShaderMaterial] properties.
   */
  public var parameterName: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEPARAMETER_GET_PARAMETER_NAME, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEPARAMETER_SET_PARAMETER_NAME, NIL)
    }

  /**
   *
   */
  public var qualifier: VisualShaderNodeParameter.Qualifier
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEPARAMETER_GET_QUALIFIER, LONG)
      return VisualShaderNodeParameter.Qualifier.values()[TransferContext.readReturnValue(JVM_INT) as Int]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEPARAMETER_SET_QUALIFIER, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISUALSHADERNODEPARAMETER, scriptIndex)
    return true
  }

  public enum class Qualifier(
    id: Long
  ) {
    /**
     *
     */
    QUAL_NONE(0),
    /**
     *
     */
    QUAL_GLOBAL(1),
    /**
     *
     */
    QUAL_INSTANCE(2),
    /**
     * Represents the size of the [enum Qualifier] enum.
     */
    QUAL_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object
}
