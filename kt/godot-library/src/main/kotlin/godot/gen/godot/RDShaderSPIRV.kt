// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedByteArray
import godot.core.TransferContext
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_BYTE_ARRAY
import godot.core.VariantType.STRING
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 *
 */
@GodotBaseType
public open class RDShaderSPIRV : Resource() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_RDSHADERSPIRV)
  }

  /**
   *
   */
  public fun setStageBytecode(stage: RenderingDevice.ShaderStage, bytecode: PackedByteArray): Unit {
    TransferContext.writeArguments(LONG to stage.id, PACKED_BYTE_ARRAY to bytecode)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_RDSHADERSPIRV_SET_STAGE_BYTECODE,
        NIL.ordinal)
  }

  /**
   *
   */
  public fun getStageBytecode(stage: RenderingDevice.ShaderStage): PackedByteArray {
    TransferContext.writeArguments(LONG to stage.id)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_RDSHADERSPIRV_GET_STAGE_BYTECODE,
        PACKED_BYTE_ARRAY.ordinal)
    return TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray
  }

  /**
   *
   */
  public fun setStageCompileError(stage: RenderingDevice.ShaderStage, compileError: String): Unit {
    TransferContext.writeArguments(LONG to stage.id, STRING to compileError)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_RDSHADERSPIRV_SET_STAGE_COMPILE_ERROR,
        NIL.ordinal)
  }

  /**
   *
   */
  public fun getStageCompileError(stage: RenderingDevice.ShaderStage): String {
    TransferContext.writeArguments(LONG to stage.id)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_RDSHADERSPIRV_GET_STAGE_COMPILE_ERROR,
        STRING.ordinal)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  public companion object
}
