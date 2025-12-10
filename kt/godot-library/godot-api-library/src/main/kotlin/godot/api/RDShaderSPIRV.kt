// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.PackedByteArray
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.PACKED_BYTE_ARRAY
import godot.core.VariantParser.STRING
import kotlin.Byte
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * [RDShaderSPIRV] represents an [RDShaderFile]'s [url=https://www.khronos.org/spir/]SPIR-V[/url]
 * code for various shader stages, as well as possible compilation error messages. SPIR-V is a
 * low-level intermediate shader representation. This intermediate representation is not used directly
 * by GPUs for rendering, but it can be compiled into binary shaders that GPUs can understand. Unlike
 * compiled shaders, SPIR-V is portable across GPU models and driver versions.
 *
 * This object is used by [RenderingDevice].
 */
@GodotBaseType
public open class RDShaderSPIRV : Resource() {
  /**
   * The SPIR-V bytecode for the vertex shader stage.
   *
   * **Warning:**
   * Be careful when trying to modify a local
   * [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this
   * getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again
   * afterward.
   */
  @CoreTypeLocalCopy
  public final inline var bytecodeVertex: PackedByteArray
    @JvmName("bytecodeVertexProperty")
    get() = getStageBytecode(RenderingDevice.ShaderStage.VERTEX)
    @JvmName("bytecodeVertexProperty")
    set(`value`) {
      setStageBytecode(RenderingDevice.ShaderStage.VERTEX, value)
    }

  /**
   * The SPIR-V bytecode for the fragment shader stage.
   *
   * **Warning:**
   * Be careful when trying to modify a local
   * [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this
   * getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again
   * afterward.
   */
  @CoreTypeLocalCopy
  public final inline var bytecodeFragment: PackedByteArray
    @JvmName("bytecodeFragmentProperty")
    get() = getStageBytecode(RenderingDevice.ShaderStage.FRAGMENT)
    @JvmName("bytecodeFragmentProperty")
    set(`value`) {
      setStageBytecode(RenderingDevice.ShaderStage.FRAGMENT, value)
    }

  /**
   * The SPIR-V bytecode for the tessellation control shader stage.
   *
   * **Warning:**
   * Be careful when trying to modify a local
   * [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this
   * getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again
   * afterward.
   */
  @CoreTypeLocalCopy
  public final inline var bytecodeTesselationControl: PackedByteArray
    @JvmName("bytecodeTesselationControlProperty")
    get() = getStageBytecode(RenderingDevice.ShaderStage.TESSELATION_CONTROL)
    @JvmName("bytecodeTesselationControlProperty")
    set(`value`) {
      setStageBytecode(RenderingDevice.ShaderStage.TESSELATION_CONTROL, value)
    }

  /**
   * The SPIR-V bytecode for the tessellation evaluation shader stage.
   *
   * **Warning:**
   * Be careful when trying to modify a local
   * [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this
   * getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again
   * afterward.
   */
  @CoreTypeLocalCopy
  public final inline var bytecodeTesselationEvaluation: PackedByteArray
    @JvmName("bytecodeTesselationEvaluationProperty")
    get() = getStageBytecode(RenderingDevice.ShaderStage.TESSELATION_EVALUATION)
    @JvmName("bytecodeTesselationEvaluationProperty")
    set(`value`) {
      setStageBytecode(RenderingDevice.ShaderStage.TESSELATION_EVALUATION, value)
    }

  /**
   * The SPIR-V bytecode for the compute shader stage.
   *
   * **Warning:**
   * Be careful when trying to modify a local
   * [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this
   * getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again
   * afterward.
   */
  @CoreTypeLocalCopy
  public final inline var bytecodeCompute: PackedByteArray
    @JvmName("bytecodeComputeProperty")
    get() = getStageBytecode(RenderingDevice.ShaderStage.COMPUTE)
    @JvmName("bytecodeComputeProperty")
    set(`value`) {
      setStageBytecode(RenderingDevice.ShaderStage.COMPUTE, value)
    }

  /**
   * The compilation error message for the vertex shader stage (set by the SPIR-V compiler and
   * Godot). If empty, shader compilation was successful.
   */
  public final inline var compileErrorVertex: String
    @JvmName("compileErrorVertexProperty")
    get() = getStageCompileError(RenderingDevice.ShaderStage.VERTEX)
    @JvmName("compileErrorVertexProperty")
    set(`value`) {
      setStageCompileError(RenderingDevice.ShaderStage.VERTEX, value)
    }

  /**
   * The compilation error message for the fragment shader stage (set by the SPIR-V compiler and
   * Godot). If empty, shader compilation was successful.
   */
  public final inline var compileErrorFragment: String
    @JvmName("compileErrorFragmentProperty")
    get() = getStageCompileError(RenderingDevice.ShaderStage.FRAGMENT)
    @JvmName("compileErrorFragmentProperty")
    set(`value`) {
      setStageCompileError(RenderingDevice.ShaderStage.FRAGMENT, value)
    }

  /**
   * The compilation error message for the tessellation control shader stage (set by the SPIR-V
   * compiler and Godot). If empty, shader compilation was successful.
   */
  public final inline var compileErrorTesselationControl: String
    @JvmName("compileErrorTesselationControlProperty")
    get() = getStageCompileError(RenderingDevice.ShaderStage.TESSELATION_CONTROL)
    @JvmName("compileErrorTesselationControlProperty")
    set(`value`) {
      setStageCompileError(RenderingDevice.ShaderStage.TESSELATION_CONTROL, value)
    }

  /**
   * The compilation error message for the tessellation evaluation shader stage (set by the SPIR-V
   * compiler and Godot). If empty, shader compilation was successful.
   */
  public final inline var compileErrorTesselationEvaluation: String
    @JvmName("compileErrorTesselationEvaluationProperty")
    get() = getStageCompileError(RenderingDevice.ShaderStage.TESSELATION_EVALUATION)
    @JvmName("compileErrorTesselationEvaluationProperty")
    set(`value`) {
      setStageCompileError(RenderingDevice.ShaderStage.TESSELATION_EVALUATION, value)
    }

  /**
   * The compilation error message for the compute shader stage (set by the SPIR-V compiler and
   * Godot). If empty, shader compilation was successful.
   */
  public final inline var compileErrorCompute: String
    @JvmName("compileErrorComputeProperty")
    get() = getStageCompileError(RenderingDevice.ShaderStage.COMPUTE)
    @JvmName("compileErrorComputeProperty")
    set(`value`) {
      setStageCompileError(RenderingDevice.ShaderStage.COMPUTE, value)
    }

  public override fun new(scriptPtr: VoidPtr): Unit {
    createNativeObject(538, scriptPtr)
  }

  /**
   * This is a helper function for [bytecodeVertex] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = rdshaderspirv.bytecodeVertex
   * //Your changes
   * rdshaderspirv.bytecodeVertex = myCoreType
   * ``````
   *
   * The SPIR-V bytecode for the vertex shader stage.
   */
  @CoreTypeHelper
  public final fun bytecodeVertexMutate(block: PackedByteArray.() -> Unit): PackedByteArray =
      bytecodeVertex.apply {
     block(this)
     bytecodeVertex = this
  }

  /**
   * This is a helper function for [bytecodeVertex] to make dealing with local copies easier.
   * Allow to directly modify each element of the local copy of the property and assign it back to
   * the Object.
   *
   * The SPIR-V bytecode for the vertex shader stage.
   */
  @CoreTypeHelper
  public final fun bytecodeVertexMutateEach(block: (index: Int, `value`: Byte) -> Unit):
      PackedByteArray = bytecodeVertex.apply {
     this.forEachIndexed { index, value ->
         block(index, value)
         this[index] = value
     }
     bytecodeVertex = this
  }

  /**
   * This is a helper function for [bytecodeFragment] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = rdshaderspirv.bytecodeFragment
   * //Your changes
   * rdshaderspirv.bytecodeFragment = myCoreType
   * ``````
   *
   * The SPIR-V bytecode for the fragment shader stage.
   */
  @CoreTypeHelper
  public final fun bytecodeFragmentMutate(block: PackedByteArray.() -> Unit): PackedByteArray =
      bytecodeFragment.apply {
     block(this)
     bytecodeFragment = this
  }

  /**
   * This is a helper function for [bytecodeFragment] to make dealing with local copies easier.
   * Allow to directly modify each element of the local copy of the property and assign it back to
   * the Object.
   *
   * The SPIR-V bytecode for the fragment shader stage.
   */
  @CoreTypeHelper
  public final fun bytecodeFragmentMutateEach(block: (index: Int, `value`: Byte) -> Unit):
      PackedByteArray = bytecodeFragment.apply {
     this.forEachIndexed { index, value ->
         block(index, value)
         this[index] = value
     }
     bytecodeFragment = this
  }

  /**
   * This is a helper function for [bytecodeTesselationControl] to make dealing with local copies
   * easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = rdshaderspirv.bytecodeTesselationControl
   * //Your changes
   * rdshaderspirv.bytecodeTesselationControl = myCoreType
   * ``````
   *
   * The SPIR-V bytecode for the tessellation control shader stage.
   */
  @CoreTypeHelper
  public final fun bytecodeTesselationControlMutate(block: PackedByteArray.() -> Unit):
      PackedByteArray = bytecodeTesselationControl.apply {
     block(this)
     bytecodeTesselationControl = this
  }

  /**
   * This is a helper function for [bytecodeTesselationControl] to make dealing with local copies
   * easier.
   * Allow to directly modify each element of the local copy of the property and assign it back to
   * the Object.
   *
   * The SPIR-V bytecode for the tessellation control shader stage.
   */
  @CoreTypeHelper
  public final fun bytecodeTesselationControlMutateEach(block: (index: Int, `value`: Byte) -> Unit):
      PackedByteArray = bytecodeTesselationControl.apply {
     this.forEachIndexed { index, value ->
         block(index, value)
         this[index] = value
     }
     bytecodeTesselationControl = this
  }

  /**
   * This is a helper function for [bytecodeTesselationEvaluation] to make dealing with local copies
   * easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = rdshaderspirv.bytecodeTesselationEvaluation
   * //Your changes
   * rdshaderspirv.bytecodeTesselationEvaluation = myCoreType
   * ``````
   *
   * The SPIR-V bytecode for the tessellation evaluation shader stage.
   */
  @CoreTypeHelper
  public final fun bytecodeTesselationEvaluationMutate(block: PackedByteArray.() -> Unit):
      PackedByteArray = bytecodeTesselationEvaluation.apply {
     block(this)
     bytecodeTesselationEvaluation = this
  }

  /**
   * This is a helper function for [bytecodeTesselationEvaluation] to make dealing with local copies
   * easier.
   * Allow to directly modify each element of the local copy of the property and assign it back to
   * the Object.
   *
   * The SPIR-V bytecode for the tessellation evaluation shader stage.
   */
  @CoreTypeHelper
  public final fun bytecodeTesselationEvaluationMutateEach(block: (index: Int,
      `value`: Byte) -> Unit): PackedByteArray = bytecodeTesselationEvaluation.apply {
     this.forEachIndexed { index, value ->
         block(index, value)
         this[index] = value
     }
     bytecodeTesselationEvaluation = this
  }

  /**
   * This is a helper function for [bytecodeCompute] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = rdshaderspirv.bytecodeCompute
   * //Your changes
   * rdshaderspirv.bytecodeCompute = myCoreType
   * ``````
   *
   * The SPIR-V bytecode for the compute shader stage.
   */
  @CoreTypeHelper
  public final fun bytecodeComputeMutate(block: PackedByteArray.() -> Unit): PackedByteArray =
      bytecodeCompute.apply {
     block(this)
     bytecodeCompute = this
  }

  /**
   * This is a helper function for [bytecodeCompute] to make dealing with local copies easier.
   * Allow to directly modify each element of the local copy of the property and assign it back to
   * the Object.
   *
   * The SPIR-V bytecode for the compute shader stage.
   */
  @CoreTypeHelper
  public final fun bytecodeComputeMutateEach(block: (index: Int, `value`: Byte) -> Unit):
      PackedByteArray = bytecodeCompute.apply {
     this.forEachIndexed { index, value ->
         block(index, value)
         this[index] = value
     }
     bytecodeCompute = this
  }

  /**
   * Sets the SPIR-V [bytecode] for the given shader [stage]. Equivalent to setting one of
   * [bytecodeCompute], [bytecodeFragment], [bytecodeTesselationControl],
   * [bytecodeTesselationEvaluation], [bytecodeVertex].
   */
  public final fun setStageBytecode(stage: RenderingDevice.ShaderStage, bytecode: PackedByteArray):
      Unit {
    TransferContext.writeArguments(LONG to stage.value, PACKED_BYTE_ARRAY to bytecode)
    TransferContext.callMethod(ptr, MethodBindings.setStageBytecodePtr, NIL)
  }

  /**
   * Equivalent to getting one of [bytecodeCompute], [bytecodeFragment],
   * [bytecodeTesselationControl], [bytecodeTesselationEvaluation], [bytecodeVertex].
   */
  public final fun getStageBytecode(stage: RenderingDevice.ShaderStage): PackedByteArray {
    TransferContext.writeArguments(LONG to stage.value)
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
    TransferContext.writeArguments(LONG to stage.value, STRING to compileError)
    TransferContext.callMethod(ptr, MethodBindings.setStageCompileErrorPtr, NIL)
  }

  /**
   * Returns the compilation error message for the given shader [stage]. Equivalent to getting one
   * of [compileErrorCompute], [compileErrorFragment], [compileErrorTesselationControl],
   * [compileErrorTesselationEvaluation], [compileErrorVertex].
   */
  public final fun getStageCompileError(stage: RenderingDevice.ShaderStage): String {
    TransferContext.writeArguments(LONG to stage.value)
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
