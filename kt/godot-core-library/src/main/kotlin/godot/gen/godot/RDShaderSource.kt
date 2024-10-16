// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.MemoryManager
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
 * Shader source code in text form.
 * See also [RDShaderFile]. [RDShaderSource] is only meant to be used with the [RenderingDevice]
 * API. It should not be confused with Godot's own [Shader] resource, which is what Godot's various
 * nodes use for high-level shader programming.
 */
@GodotBaseType
public open class RDShaderSource : RefCounted() {
  /**
   * Source code for the shader's vertex stage.
   */
  public final inline var sourceVertex: String
    @JvmName("sourceVertexProperty")
    get() = getStageSource(RenderingDevice.ShaderStage.SHADER_STAGE_VERTEX)
    @JvmName("sourceVertexProperty")
    set(`value`) {
      setStageSource(RenderingDevice.ShaderStage.SHADER_STAGE_VERTEX, value)
    }

  /**
   * Source code for the shader's fragment stage.
   */
  public final inline var sourceFragment: String
    @JvmName("sourceFragmentProperty")
    get() = getStageSource(RenderingDevice.ShaderStage.SHADER_STAGE_FRAGMENT)
    @JvmName("sourceFragmentProperty")
    set(`value`) {
      setStageSource(RenderingDevice.ShaderStage.SHADER_STAGE_FRAGMENT, value)
    }

  /**
   * Source code for the shader's tessellation control stage.
   */
  public final inline var sourceTesselationControl: String
    @JvmName("sourceTesselationControlProperty")
    get() = getStageSource(RenderingDevice.ShaderStage.SHADER_STAGE_TESSELATION_CONTROL)
    @JvmName("sourceTesselationControlProperty")
    set(`value`) {
      setStageSource(RenderingDevice.ShaderStage.SHADER_STAGE_TESSELATION_CONTROL, value)
    }

  /**
   * Source code for the shader's tessellation evaluation stage.
   */
  public final inline var sourceTesselationEvaluation: String
    @JvmName("sourceTesselationEvaluationProperty")
    get() = getStageSource(RenderingDevice.ShaderStage.SHADER_STAGE_TESSELATION_EVALUATION)
    @JvmName("sourceTesselationEvaluationProperty")
    set(`value`) {
      setStageSource(RenderingDevice.ShaderStage.SHADER_STAGE_TESSELATION_EVALUATION, value)
    }

  /**
   * Source code for the shader's compute stage.
   */
  public final inline var sourceCompute: String
    @JvmName("sourceComputeProperty")
    get() = getStageSource(RenderingDevice.ShaderStage.SHADER_STAGE_COMPUTE)
    @JvmName("sourceComputeProperty")
    set(`value`) {
      setStageSource(RenderingDevice.ShaderStage.SHADER_STAGE_COMPUTE, value)
    }

  /**
   * The language the shader is written in.
   */
  public final inline var language: RenderingDevice.ShaderLanguage
    @JvmName("languageProperty")
    get() = getLanguage()
    @JvmName("languageProperty")
    set(`value`) {
      setLanguage(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    MemoryManager.createNativeObject(ENGINECLASS_RDSHADERSOURCE, this, scriptIndex)
  }

  /**
   * Sets [source] code for the specified shader [stage]. Equivalent to setting one of
   * [sourceCompute], [sourceFragment], [sourceTesselationControl], [sourceTesselationEvaluation] or
   * [sourceVertex].
   */
  public final fun setStageSource(stage: RenderingDevice.ShaderStage, source: String): Unit {
    TransferContext.writeArguments(LONG to stage.id, STRING to source)
    TransferContext.callMethod(ptr, MethodBindings.setStageSourcePtr, NIL)
  }

  /**
   * Returns source code for the specified shader [stage]. Equivalent to getting one of
   * [sourceCompute], [sourceFragment], [sourceTesselationControl], [sourceTesselationEvaluation] or
   * [sourceVertex].
   */
  public final fun getStageSource(stage: RenderingDevice.ShaderStage): String {
    TransferContext.writeArguments(LONG to stage.id)
    TransferContext.callMethod(ptr, MethodBindings.getStageSourcePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  public final fun setLanguage(language: RenderingDevice.ShaderLanguage): Unit {
    TransferContext.writeArguments(LONG to language.id)
    TransferContext.callMethod(ptr, MethodBindings.setLanguagePtr, NIL)
  }

  public final fun getLanguage(): RenderingDevice.ShaderLanguage {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLanguagePtr, LONG)
    return RenderingDevice.ShaderLanguage.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public companion object

  internal object MethodBindings {
    public val setStageSourcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDShaderSource", "set_stage_source", 620821314)

    public val getStageSourcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDShaderSource", "get_stage_source", 3354920045)

    public val setLanguagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDShaderSource", "set_language", 3422186742)

    public val getLanguagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDShaderSource", "get_language", 1063538261)
  }
}
