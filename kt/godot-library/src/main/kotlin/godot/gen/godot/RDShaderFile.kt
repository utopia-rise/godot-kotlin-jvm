// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Compiled shader file in SPIR-V form (used by [godot.RenderingDevice]). Not to be confused with Godot's own [godot.Shader].
 *
 * Compiled shader file in SPIR-V form.
 *
 * See also [godot.RDShaderSource]. [godot.RDShaderFile] is only meant to be used with the [godot.RenderingDevice] API. It should not be confused with Godot's own [godot.Shader] resource, which is what Godot's various nodes use for high-level shader programming.
 */
@GodotBaseType
public open class RDShaderFile : Resource() {
  /**
   * The base compilation error message, which indicates errors not related to a specific shader stage if non-empty. If empty, shader compilation is not necessarily successful (check [godot.RDShaderSPIRV]'s error message members).
   */
  public var baseError: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDSHADERFILE_GET_BASE_ERROR,
          STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDSHADERFILE_SET_BASE_ERROR, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_RDSHADERFILE, scriptIndex)
    return true
  }

  /**
   * Sets the SPIR-V [bytecode] that will be compiled for the specified [version].
   */
  public fun setBytecode(bytecode: RDShaderSPIRV, version: StringName = StringName("")): Unit {
    TransferContext.writeArguments(OBJECT to bytecode, STRING_NAME to version)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDSHADERFILE_SET_BYTECODE, NIL)
  }

  /**
   * Returns the SPIR-V intermediate representation for the specified shader [version].
   */
  public fun getSpirv(version: StringName = StringName("")): RDShaderSPIRV? {
    TransferContext.writeArguments(STRING_NAME to version)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDSHADERFILE_GET_SPIRV, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as RDShaderSPIRV?
  }

  /**
   * Returns the list of compiled versions for this shader.
   */
  public fun getVersionList(): VariantArray<StringName> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDSHADERFILE_GET_VERSION_LIST,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<StringName>
  }

  public companion object
}
