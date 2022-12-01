// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 *
 */
@GodotBaseType
public open class RDShaderSource : RefCounted() {
  /**
   *
   */
  public var language: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDSHADERSOURCE_GET_LANGUAGE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDSHADERSOURCE_SET_LANGUAGE, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_RDSHADERSOURCE, scriptIndex)
    return true
  }

  /**
   *
   */
  public fun setStageSource(stage: RenderingDevice.ShaderStage, source: String): Unit {
    TransferContext.writeArguments(LONG to stage.id, STRING to source)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDSHADERSOURCE_SET_STAGE_SOURCE,
        NIL)
  }

  /**
   *
   */
  public fun getStageSource(stage: RenderingDevice.ShaderStage): String {
    TransferContext.writeArguments(LONG to stage.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDSHADERSOURCE_GET_STAGE_SOURCE,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  public companion object
}
