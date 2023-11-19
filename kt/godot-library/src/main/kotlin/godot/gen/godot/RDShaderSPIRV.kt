// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedByteArray
import godot.core.TypeManager
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_BYTE_ARRAY
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress

/**
 * SPIR-V intermediate representation as part of a [godot.RDShaderFile] (used by [godot.RenderingDevice]).
 *
 * [godot.RDShaderSPIRV] represents a [godot.RDShaderFile]'s [godot.SPIR-V](https://www.khronos.org/spir/) code for various shader stages, as well as possible compilation error messages. SPIR-V a low-level intermediate shader representation. This intermediate representation is not used directly by GPUs for rendering, but it can be compiled into binary shaders that GPUs can understand. Unlike compiled shaders, SPIR-V is portable across GPU models and driver versions.
 *
 * This object is used by [godot.RenderingDevice].
 */
@GodotBaseType
public open class RDShaderSPIRV : Resource() {
  /**
   * The SPIR-V bytecode for the vertex shader stage.
   */
  public var bytecodeVertex: PackedByteArray
    get() {
      TransferContext.writeArguments(LONG to 0L)
      TransferContext.callMethod(rawPtr, MethodBindings.getStageBytecodePtr, PACKED_BYTE_ARRAY)
      return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 0L, PACKED_BYTE_ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setStageBytecodePtr, NIL)
    }

  /**
   * The SPIR-V bytecode for the fragment shader stage.
   */
  public var bytecodeFragment: PackedByteArray
    get() {
      TransferContext.writeArguments(LONG to 1L)
      TransferContext.callMethod(rawPtr, MethodBindings.getStageBytecodePtr, PACKED_BYTE_ARRAY)
      return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 1L, PACKED_BYTE_ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setStageBytecodePtr, NIL)
    }

  /**
   * The SPIR-V bytecode for the tessellation control shader stage.
   */
  public var bytecodeTesselationControl: PackedByteArray
    get() {
      TransferContext.writeArguments(LONG to 2L)
      TransferContext.callMethod(rawPtr, MethodBindings.getStageBytecodePtr, PACKED_BYTE_ARRAY)
      return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 2L, PACKED_BYTE_ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setStageBytecodePtr, NIL)
    }

  /**
   * The SPIR-V bytecode for the tessellation evaluation shader stage.
   */
  public var bytecodeTesselationEvaluation: PackedByteArray
    get() {
      TransferContext.writeArguments(LONG to 3L)
      TransferContext.callMethod(rawPtr, MethodBindings.getStageBytecodePtr, PACKED_BYTE_ARRAY)
      return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 3L, PACKED_BYTE_ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setStageBytecodePtr, NIL)
    }

  /**
   * The SPIR-V bytecode for the compute shader stage.
   */
  public var bytecodeCompute: PackedByteArray
    get() {
      TransferContext.writeArguments(LONG to 4L)
      TransferContext.callMethod(rawPtr, MethodBindings.getStageBytecodePtr, PACKED_BYTE_ARRAY)
      return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 4L, PACKED_BYTE_ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setStageBytecodePtr, NIL)
    }

  /**
   * The compilation error message for the vertex shader stage (set by the SPIR-V compiler and Godot). If empty, shader compilation was successful.
   */
  public var compileErrorVertex: String
    get() {
      TransferContext.writeArguments(LONG to 0L)
      TransferContext.callMethod(rawPtr, MethodBindings.getStageCompileErrorPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 0L, STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setStageCompileErrorPtr, NIL)
    }

  /**
   * The compilation error message for the fragment shader stage (set by the SPIR-V compiler and Godot). If empty, shader compilation was successful.
   */
  public var compileErrorFragment: String
    get() {
      TransferContext.writeArguments(LONG to 1L)
      TransferContext.callMethod(rawPtr, MethodBindings.getStageCompileErrorPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 1L, STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setStageCompileErrorPtr, NIL)
    }

  /**
   * The compilation error message for the tessellation control shader stage (set by the SPIR-V compiler and Godot). If empty, shader compilation was successful.
   */
  public var compileErrorTesselationControl: String
    get() {
      TransferContext.writeArguments(LONG to 2L)
      TransferContext.callMethod(rawPtr, MethodBindings.getStageCompileErrorPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 2L, STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setStageCompileErrorPtr, NIL)
    }

  /**
   * The compilation error message for the tessellation evaluation shader stage (set by the SPIR-V compiler and Godot). If empty, shader compilation was successful.
   */
  public var compileErrorTesselationEvaluation: String
    get() {
      TransferContext.writeArguments(LONG to 3L)
      TransferContext.callMethod(rawPtr, MethodBindings.getStageCompileErrorPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 3L, STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setStageCompileErrorPtr, NIL)
    }

  /**
   * The compilation error message for the compute shader stage (set by the SPIR-V compiler and Godot). If empty, shader compilation was successful.
   */
  public var compileErrorCompute: String
    get() {
      TransferContext.writeArguments(LONG to 4L)
      TransferContext.callMethod(rawPtr, MethodBindings.getStageCompileErrorPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 4L, STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setStageCompileErrorPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_RDSHADERSPIRV, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setStageBytecodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDShaderSPIRV", "set_stage_bytecode")

    public val getStageBytecodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDShaderSPIRV", "get_stage_bytecode")

    public val setStageCompileErrorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDShaderSPIRV", "set_stage_compile_error")

    public val getStageCompileErrorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDShaderSPIRV", "get_stage_compile_error")
  }
}
