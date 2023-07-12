// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedByteArray
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_BYTE_ARRAY
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * SPIR-V intermediate representation as part of a [godot.RDShaderFile] (used by [godot.RenderingDevice]).
 *
 * [godot.RDShaderSPIRV] represents a [godot.RDShaderFile]'s [godot.SPIR-V](https://www.khronos.org/spir/) code for various shader stages, as well as possible compilation error messages. SPIR-V a low-level intermediate shader representation. This intermediate representation is not used directly by GPUs for rendering, but it can be compiled into binary shaders that GPUs can understand. Unlike compiled shaders, SPIR-V is portable across GPU models and driver versions.
 *
 * This object is used by [godot.RenderingDevice].
 */
@GodotBaseType
public open class RDShaderSPIRV : Resource() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_RDSHADERSPIRV, scriptIndex)
    return true
  }

  /**
   * Sets the SPIR-V [bytecode] for the given shader [stage]. Equivalent to setting one of [bytecodeCompute], [bytecodeFragment], [bytecodeTesselationControl], [bytecodeTesselationEvaluation], [bytecodeVertex].
   */
  public fun setStageBytecode(stage: RenderingDevice.ShaderStage, bytecode: PackedByteArray): Unit {
    TransferContext.writeArguments(LONG to stage.id, PACKED_BYTE_ARRAY to bytecode)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDSHADERSPIRV_SET_STAGE_BYTECODE,
        NIL)
  }

  /**
   * Equivalent to getting one of [bytecodeCompute], [bytecodeFragment], [bytecodeTesselationControl], [bytecodeTesselationEvaluation], [bytecodeVertex].
   */
  public fun getStageBytecode(stage: RenderingDevice.ShaderStage): PackedByteArray {
    TransferContext.writeArguments(LONG to stage.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDSHADERSPIRV_GET_STAGE_BYTECODE,
        PACKED_BYTE_ARRAY)
    return TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray
  }

  /**
   * Sets the compilation error message for the given shader [stage] to [compileError]. Equivalent to setting one of [compileErrorCompute], [compileErrorFragment], [compileErrorTesselationControl], [compileErrorTesselationEvaluation], [compileErrorVertex].
   */
  public fun setStageCompileError(stage: RenderingDevice.ShaderStage, compileError: String): Unit {
    TransferContext.writeArguments(LONG to stage.id, STRING to compileError)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RDSHADERSPIRV_SET_STAGE_COMPILE_ERROR, NIL)
  }

  /**
   * Returns the compilation error message for the given shader [stage]. Equivalent to getting one of [compileErrorCompute], [compileErrorFragment], [compileErrorTesselationControl], [compileErrorTesselationEvaluation], [compileErrorVertex].
   */
  public fun getStageCompileError(stage: RenderingDevice.ShaderStage): String {
    TransferContext.writeArguments(LONG to stage.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RDSHADERSPIRV_GET_STAGE_COMPILE_ERROR, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  public companion object
}
