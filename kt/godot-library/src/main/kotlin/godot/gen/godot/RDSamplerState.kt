// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Suppress

/**
 *
 */
@GodotBaseType
public open class RDSamplerState : RefCounted() {
  /**
   *
   */
  public var magFilter: RenderingDevice.SamplerFilter
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDSAMPLERSTATE_GET_MAG_FILTER,
          LONG)
      return RenderingDevice.SamplerFilter.values()[TransferContext.readReturnValue(JVM_INT) as Int]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDSAMPLERSTATE_SET_MAG_FILTER,
          NIL)
    }

  /**
   *
   */
  public var minFilter: RenderingDevice.SamplerFilter
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDSAMPLERSTATE_GET_MIN_FILTER,
          LONG)
      return RenderingDevice.SamplerFilter.values()[TransferContext.readReturnValue(JVM_INT) as Int]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDSAMPLERSTATE_SET_MIN_FILTER,
          NIL)
    }

  /**
   *
   */
  public var mipFilter: RenderingDevice.SamplerFilter
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDSAMPLERSTATE_GET_MIP_FILTER,
          LONG)
      return RenderingDevice.SamplerFilter.values()[TransferContext.readReturnValue(JVM_INT) as Int]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDSAMPLERSTATE_SET_MIP_FILTER,
          NIL)
    }

  /**
   *
   */
  public var repeatU: RenderingDevice.SamplerRepeatMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDSAMPLERSTATE_GET_REPEAT_U, LONG)
      return RenderingDevice.SamplerRepeatMode.values()[TransferContext.readReturnValue(JVM_INT) as Int]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDSAMPLERSTATE_SET_REPEAT_U, NIL)
    }

  /**
   *
   */
  public var repeatV: RenderingDevice.SamplerRepeatMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDSAMPLERSTATE_GET_REPEAT_V, LONG)
      return RenderingDevice.SamplerRepeatMode.values()[TransferContext.readReturnValue(JVM_INT) as Int]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDSAMPLERSTATE_SET_REPEAT_V, NIL)
    }

  /**
   *
   */
  public var repeatW: RenderingDevice.SamplerRepeatMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDSAMPLERSTATE_GET_REPEAT_W, LONG)
      return RenderingDevice.SamplerRepeatMode.values()[TransferContext.readReturnValue(JVM_INT) as Int]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDSAMPLERSTATE_SET_REPEAT_W, NIL)
    }

  /**
   *
   */
  public var lodBias: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDSAMPLERSTATE_GET_LOD_BIAS,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDSAMPLERSTATE_SET_LOD_BIAS, NIL)
    }

  /**
   *
   */
  public var useAnisotropy: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDSAMPLERSTATE_GET_USE_ANISOTROPY,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDSAMPLERSTATE_SET_USE_ANISOTROPY,
          NIL)
    }

  /**
   *
   */
  public var anisotropyMax: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDSAMPLERSTATE_GET_ANISOTROPY_MAX,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDSAMPLERSTATE_SET_ANISOTROPY_MAX,
          NIL)
    }

  /**
   *
   */
  public var enableCompare: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDSAMPLERSTATE_GET_ENABLE_COMPARE,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDSAMPLERSTATE_SET_ENABLE_COMPARE,
          NIL)
    }

  /**
   *
   */
  public var compareOp: RenderingDevice.CompareOperator
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDSAMPLERSTATE_GET_COMPARE_OP,
          LONG)
      return RenderingDevice.CompareOperator.values()[TransferContext.readReturnValue(JVM_INT) as Int]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDSAMPLERSTATE_SET_COMPARE_OP,
          NIL)
    }

  /**
   *
   */
  public var minLod: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDSAMPLERSTATE_GET_MIN_LOD,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDSAMPLERSTATE_SET_MIN_LOD, NIL)
    }

  /**
   *
   */
  public var maxLod: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDSAMPLERSTATE_GET_MAX_LOD,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDSAMPLERSTATE_SET_MAX_LOD, NIL)
    }

  /**
   *
   */
  public var borderColor: RenderingDevice.SamplerBorderColor
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDSAMPLERSTATE_GET_BORDER_COLOR,
          LONG)
      return RenderingDevice.SamplerBorderColor.values()[TransferContext.readReturnValue(JVM_INT) as Int]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDSAMPLERSTATE_SET_BORDER_COLOR,
          NIL)
    }

  /**
   *
   */
  public var unnormalizedUvw: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDSAMPLERSTATE_GET_UNNORMALIZED_UVW, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDSAMPLERSTATE_SET_UNNORMALIZED_UVW, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_RDSAMPLERSTATE, scriptIndex)
    return true
  }

  public companion object
}
