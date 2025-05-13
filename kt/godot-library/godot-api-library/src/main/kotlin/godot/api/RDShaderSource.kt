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
import godot.core.MethodStringName0
import godot.core.MethodStringName1
import godot.core.MethodStringName2
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.STRING
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmStatic

/**
 * Shader source code in text form.
 *
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
    get() = getStageSource(RenderingDevice.ShaderStage.VERTEX)
    @JvmName("sourceVertexProperty")
    set(`value`) {
      setStageSource(RenderingDevice.ShaderStage.VERTEX, value)
    }

  /**
   * Source code for the shader's fragment stage.
   */
  public final inline var sourceFragment: String
    @JvmName("sourceFragmentProperty")
    get() = getStageSource(RenderingDevice.ShaderStage.FRAGMENT)
    @JvmName("sourceFragmentProperty")
    set(`value`) {
      setStageSource(RenderingDevice.ShaderStage.FRAGMENT, value)
    }

  /**
   * Source code for the shader's tessellation control stage.
   */
  public final inline var sourceTesselationControl: String
    @JvmName("sourceTesselationControlProperty")
    get() = getStageSource(RenderingDevice.ShaderStage.TESSELATION_CONTROL)
    @JvmName("sourceTesselationControlProperty")
    set(`value`) {
      setStageSource(RenderingDevice.ShaderStage.TESSELATION_CONTROL, value)
    }

  /**
   * Source code for the shader's tessellation evaluation stage.
   */
  public final inline var sourceTesselationEvaluation: String
    @JvmName("sourceTesselationEvaluationProperty")
    get() = getStageSource(RenderingDevice.ShaderStage.TESSELATION_EVALUATION)
    @JvmName("sourceTesselationEvaluationProperty")
    set(`value`) {
      setStageSource(RenderingDevice.ShaderStage.TESSELATION_EVALUATION, value)
    }

  /**
   * Source code for the shader's compute stage.
   */
  public final inline var sourceCompute: String
    @JvmName("sourceComputeProperty")
    get() = getStageSource(RenderingDevice.ShaderStage.COMPUTE)
    @JvmName("sourceComputeProperty")
    set(`value`) {
      setStageSource(RenderingDevice.ShaderStage.COMPUTE, value)
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
    createNativeObject(524, scriptIndex)
  }

  /**
   * Sets [source] code for the specified shader [stage]. Equivalent to setting one of
   * [sourceCompute], [sourceFragment], [sourceTesselationControl], [sourceTesselationEvaluation] or
   * [sourceVertex].
   *
   * **Note:** If you set the compute shader source code using this method directly, remember to
   * remove the Godot-specific hint `#[compute]`.
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

  public companion object {
    @JvmStatic
    public val setStageSourceName:
        MethodStringName2<RDShaderSource, Unit, RenderingDevice.ShaderStage, String> =
        MethodStringName2<RDShaderSource, Unit, RenderingDevice.ShaderStage, String>("set_stage_source")

    @JvmStatic
    public val getStageSourceName:
        MethodStringName1<RDShaderSource, String, RenderingDevice.ShaderStage> =
        MethodStringName1<RDShaderSource, String, RenderingDevice.ShaderStage>("get_stage_source")

    @JvmStatic
    public val setLanguageName:
        MethodStringName1<RDShaderSource, Unit, RenderingDevice.ShaderLanguage> =
        MethodStringName1<RDShaderSource, Unit, RenderingDevice.ShaderLanguage>("set_language")

    @JvmStatic
    public val getLanguageName: MethodStringName0<RDShaderSource, RenderingDevice.ShaderLanguage> =
        MethodStringName0<RDShaderSource, RenderingDevice.ShaderLanguage>("get_language")
  }

  public object MethodBindings {
    internal val setStageSourcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDShaderSource", "set_stage_source", 620821314)

    internal val getStageSourcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDShaderSource", "get_stage_source", 3354920045)

    internal val setLanguagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDShaderSource", "set_language", 3422186742)

    internal val getLanguagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDShaderSource", "get_language", 1063538261)
  }
}
