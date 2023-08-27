// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Shader source code (used by [godot.RenderingDevice]).
 *
 * Shader source code in text form.
 *
 * See also [godot.RDShaderFile]. [godot.RDShaderSource] is only meant to be used with the [godot.RenderingDevice] API. It should not be confused with Godot's own [godot.Shader] resource, which is what Godot's various nodes use for high-level shader programming.
 */
@GodotBaseType
public open class RDShaderSource : RefCounted() {
  /**
   * The language the shader is written in.
   */
  public var language: RenderingDevice.ShaderLanguage
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDSHADERSOURCE_GET_LANGUAGE, LONG)
      return RenderingDevice.ShaderLanguage.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDSHADERSOURCE_SET_LANGUAGE, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_RDSHADERSOURCE, scriptIndex)
    return true
  }

  /**
   * Sets [source] code for the specified shader [stage]. Equivalent to setting one of [sourceCompute], [sourceFragment], [sourceTesselationControl], [sourceTesselationEvaluation] or [sourceVertex].
   */
  public fun setStageSource(stage: RenderingDevice.ShaderStage, source: String): Unit {
    TransferContext.writeArguments(LONG to stage.id, STRING to source)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDSHADERSOURCE_SET_STAGE_SOURCE,
        NIL)
  }

  /**
   * Returns source code for the specified shader [stage]. Equivalent to getting one of [sourceCompute], [sourceFragment], [sourceTesselationControl], [sourceTesselationEvaluation] or [sourceVertex].
   */
  public fun getStageSource(stage: RenderingDevice.ShaderStage): String {
    TransferContext.writeArguments(LONG to stage.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDSHADERSOURCE_GET_STAGE_SOURCE,
        STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public companion object
}
