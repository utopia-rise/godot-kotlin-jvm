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
import godot.core.PackedByteArray
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.PACKED_BYTE_ARRAY
import godot.core.VariantParser.STRING
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * [RDShaderSPIRV] represents a [RDShaderFile]'s [url=https://www.khronos.org/spir/]SPIR-V[/url]
 * code for various shader stages, as well as possible compilation error messages. SPIR-V is a
 * low-level intermediate shader representation. This intermediate representation is not used directly
 * by GPUs for rendering, but it can be compiled into binary shaders that GPUs can understand. Unlike
 * compiled shaders, SPIR-V is portable across GPU models and driver versions.
 * This object is used by [RenderingDevice].
 */
@GodotBaseType
public open class RDShaderSPIRV : Resource() {
  /**
   * The SPIR-V bytecode for the vertex shader stage.
   */
  public final inline var bytecodeVertex: PackedByteArray
    @JvmName("bytecodeVertexProperty")
    get() = getStageBytecode(RenderingDevice.ShaderStage.SHADER_STAGE_VERTEX)
    @JvmName("bytecodeVertexProperty")
    set(`value`) {
      setStageBytecode(RenderingDevice.ShaderStage.SHADER_STAGE_VERTEX, value)
    }

  /**
   * The SPIR-V bytecode for the fragment shader stage.
   */
  public final inline var bytecodeFragment: PackedByteArray
    @JvmName("bytecodeFragmentProperty")
    get() = getStageBytecode(RenderingDevice.ShaderStage.SHADER_STAGE_FRAGMENT)
    @JvmName("bytecodeFragmentProperty")
    set(`value`) {
      setStageBytecode(RenderingDevice.ShaderStage.SHADER_STAGE_FRAGMENT, value)
    }

  /**
   * The SPIR-V bytecode for the tessellation control shader stage.
   */
  public final inline var bytecodeTesselationControl: PackedByteArray
    @JvmName("bytecodeTesselationControlProperty")
    get() = getStageBytecode(RenderingDevice.ShaderStage.SHADER_STAGE_TESSELATION_CONTROL)
    @JvmName("bytecodeTesselationControlProperty")
    set(`value`) {
      setStageBytecode(RenderingDevice.ShaderStage.SHADER_STAGE_TESSELATION_CONTROL, value)
    }

  /**
   * The SPIR-V bytecode for the tessellation evaluation shader stage.
   */
  public final inline var bytecodeTesselationEvaluation: PackedByteArray
    @JvmName("bytecodeTesselationEvaluationProperty")
    get() = getStageBytecode(RenderingDevice.ShaderStage.SHADER_STAGE_TESSELATION_EVALUATION)
    @JvmName("bytecodeTesselationEvaluationProperty")
    set(`value`) {
      setStageBytecode(RenderingDevice.ShaderStage.SHADER_STAGE_TESSELATION_EVALUATION, value)
    }

  /**
   * The SPIR-V bytecode for the compute shader stage.
   */
  public final inline var bytecodeCompute: PackedByteArray
    @JvmName("bytecodeComputeProperty")
    get() = getStageBytecode(RenderingDevice.ShaderStage.SHADER_STAGE_COMPUTE)
    @JvmName("bytecodeComputeProperty")
    set(`value`) {
      setStageBytecode(RenderingDevice.ShaderStage.SHADER_STAGE_COMPUTE, value)
    }

  /**
   * The compilation error message for the vertex shader stage (set by the SPIR-V compiler and
   * Godot). If empty, shader compilation was successful.
   */
  public final inline var compileErrorVertex: String
    @JvmName("compileErrorVertexProperty")
    get() = getStageCompileError(RenderingDevice.ShaderStage.SHADER_STAGE_VERTEX)
    @JvmName("compileErrorVertexProperty")
    set(`value`) {
      setStageCompileError(RenderingDevice.ShaderStage.SHADER_STAGE_VERTEX, value)
    }

  /**
   * The compilation error message for the fragment shader stage (set by the SPIR-V compiler and
   * Godot). If empty, shader compilation was successful.
   */
  public final inline var compileErrorFragment: String
    @JvmName("compileErrorFragmentProperty")
    get() = getStageCompileError(RenderingDevice.ShaderStage.SHADER_STAGE_FRAGMENT)
    @JvmName("compileErrorFragmentProperty")
    set(`value`) {
      setStageCompileError(RenderingDevice.ShaderStage.SHADER_STAGE_FRAGMENT, value)
    }

  /**
   * The compilation error message for the tessellation control shader stage (set by the SPIR-V
   * compiler and Godot). If empty, shader compilation was successful.
   */
  public final inline var compileErrorTesselationControl: String
    @JvmName("compileErrorTesselationControlProperty")
    get() = getStageCompileError(RenderingDevice.ShaderStage.SHADER_STAGE_TESSELATION_CONTROL)
    @JvmName("compileErrorTesselationControlProperty")
    set(`value`) {
      setStageCompileError(RenderingDevice.ShaderStage.SHADER_STAGE_TESSELATION_CONTROL, value)
    }

  /**
   * The compilation error message for the tessellation evaluation shader stage (set by the SPIR-V
   * compiler and Godot). If empty, shader compilation was successful.
   */
  public final inline var compileErrorTesselationEvaluation: String
    @JvmName("compileErrorTesselationEvaluationProperty")
    get() = getStageCompileError(RenderingDevice.ShaderStage.SHADER_STAGE_TESSELATION_EVALUATION)
    @JvmName("compileErrorTesselationEvaluationProperty")
    set(`value`) {
      setStageCompileError(RenderingDevice.ShaderStage.SHADER_STAGE_TESSELATION_EVALUATION, value)
    }

  /**
   * The compilation error message for the compute shader stage (set by the SPIR-V compiler and
   * Godot). If empty, shader compilation was successful.
   */
  public final inline var compileErrorCompute: String
    @JvmName("compileErrorComputeProperty")
    get() = getStageCompileError(RenderingDevice.ShaderStage.SHADER_STAGE_COMPUTE)
    @JvmName("compileErrorComputeProperty")
    set(`value`) {
      setStageCompileError(RenderingDevice.ShaderStage.SHADER_STAGE_COMPUTE, value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(533, scriptIndex)
  }

  /**
   * Sets the SPIR-V [bytecode] for the given shader [stage]. Equivalent to setting one of
   * [bytecodeCompute], [bytecodeFragment], [bytecodeTesselationControl],
   * [bytecodeTesselationEvaluation], [bytecodeVertex].
   */
  public final fun setStageBytecode(stage: RenderingDevice.ShaderStage, bytecode: PackedByteArray):
      Unit {
    TransferContext.writeArguments(LONG to stage.id, PACKED_BYTE_ARRAY to bytecode)
    TransferContext.callMethod(ptr, MethodBindings.setStageBytecodePtr, NIL)
  }

  /**
   * Equivalent to getting one of [bytecodeCompute], [bytecodeFragment],
   * [bytecodeTesselationControl], [bytecodeTesselationEvaluation], [bytecodeVertex].
   */
  public final fun getStageBytecode(stage: RenderingDevice.ShaderStage): PackedByteArray {
    TransferContext.writeArguments(LONG to stage.id)
    TransferContext.callMethod(ptr, MethodBindings.getStageBytecodePtr, PACKED_BYTE_ARRAY)
    return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY) as PackedByteArray)
  }

  /**
   * Sets the compilation error message for the given shader [stage] to [compileError]. Equivalent
   * to setting one of [compileErrorCompute], [compileErrorFragment], [compileErrorTesselationControl],
   * [compileErrorTesselationEvaluation], [compileErrorVertex].
   */
  public final fun setStageCompileError(stage: RenderingDevice.ShaderStage, compileError: String):
      Unit {
    TransferContext.writeArguments(LONG to stage.id, STRING to compileError)
    TransferContext.callMethod(ptr, MethodBindings.setStageCompileErrorPtr, NIL)
  }

  /**
   * Returns the compilation error message for the given shader [stage]. Equivalent to getting one
   * of [compileErrorCompute], [compileErrorFragment], [compileErrorTesselationControl],
   * [compileErrorTesselationEvaluation], [compileErrorVertex].
   */
  public final fun getStageCompileError(stage: RenderingDevice.ShaderStage): String {
    TransferContext.writeArguments(LONG to stage.id)
    TransferContext.callMethod(ptr, MethodBindings.getStageCompileErrorPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  public companion object

  public object MethodBindings {
    internal val setStageBytecodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDShaderSPIRV", "set_stage_bytecode", 3514097977)

    internal val getStageBytecodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDShaderSPIRV", "get_stage_bytecode", 3816765404)

    internal val setStageCompileErrorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDShaderSPIRV", "set_stage_compile_error", 620821314)

    internal val getStageCompileErrorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDShaderSPIRV", "get_stage_compile_error", 3354920045)
  }
}
