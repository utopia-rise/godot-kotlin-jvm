// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

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
  public var sourceVertex: String
    get() {
      TransferContext.writeArguments(LONG to 0L)
      TransferContext.callMethod(rawPtr, MethodBindings.getStageSourcePtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 0L, STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setStageSourcePtr, NIL)
    }

  /**
   * Source code for the shader's fragment stage.
   */
  public var sourceFragment: String
    get() {
      TransferContext.writeArguments(LONG to 1L)
      TransferContext.callMethod(rawPtr, MethodBindings.getStageSourcePtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 1L, STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setStageSourcePtr, NIL)
    }

  /**
   * Source code for the shader's tessellation control stage.
   */
  public var sourceTesselationControl: String
    get() {
      TransferContext.writeArguments(LONG to 2L)
      TransferContext.callMethod(rawPtr, MethodBindings.getStageSourcePtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 2L, STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setStageSourcePtr, NIL)
    }

  /**
   * Source code for the shader's tessellation evaluation stage.
   */
  public var sourceTesselationEvaluation: String
    get() {
      TransferContext.writeArguments(LONG to 3L)
      TransferContext.callMethod(rawPtr, MethodBindings.getStageSourcePtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 3L, STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setStageSourcePtr, NIL)
    }

  /**
   * Source code for the shader's compute stage.
   */
  public var sourceCompute: String
    get() {
      TransferContext.writeArguments(LONG to 4L)
      TransferContext.callMethod(rawPtr, MethodBindings.getStageSourcePtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 4L, STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setStageSourcePtr, NIL)
    }

  /**
   * The language the shader is written in.
   */
  public var language: RenderingDevice.ShaderLanguage
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLanguagePtr, LONG)
      return RenderingDevice.ShaderLanguage.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setLanguagePtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_RDSHADERSOURCE, scriptIndex)
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
