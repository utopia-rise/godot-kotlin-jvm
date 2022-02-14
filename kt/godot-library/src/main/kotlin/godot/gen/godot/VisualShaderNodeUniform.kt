// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.TransferContext
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING_NAME
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * A base type for the uniforms within the visual shader graph.
 *
 * A uniform represents a variable in the shader which is set externally, i.e. from the [godot.ShaderMaterial]. Uniforms are exposed as properties in the [godot.ShaderMaterial] and can be assigned from the inspector or from a script.
 */
@GodotBaseType
public open class VisualShaderNodeUniform : VisualShaderNode() {
  /**
   * Name of the uniform, by which it can be accessed through the [godot.ShaderMaterial] properties.
   */
  public open var uniformName: StringName
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEUNIFORM_GET_UNIFORM_NAME, STRING_NAME)
      return TransferContext.readReturnValue(STRING_NAME, false) as StringName
    }
    set(`value`) {
      TransferContext.writeArguments(STRING_NAME to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEUNIFORM_SET_UNIFORM_NAME, NIL)
    }

  /**
   *
   */
  public open var qualifier: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEUNIFORM_GET_QUALIFIER, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEUNIFORM_SET_QUALIFIER, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_VISUALSHADERNODEUNIFORM)
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
