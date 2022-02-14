// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 *
 */
@GodotBaseType
public open class RDPipelineMultisampleState : RefCounted() {
  /**
   *
   */
  public open var sampleCount: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEMULTISAMPLESTATE_GET_SAMPLE_COUNT, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEMULTISAMPLESTATE_SET_SAMPLE_COUNT, NIL)
    }

  /**
   *
   */
  public open var enableSampleShading: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEMULTISAMPLESTATE_GET_ENABLE_SAMPLE_SHADING, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEMULTISAMPLESTATE_SET_ENABLE_SAMPLE_SHADING, NIL)
    }

  /**
   *
   */
  public open var minSampleShading: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEMULTISAMPLESTATE_GET_MIN_SAMPLE_SHADING, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEMULTISAMPLESTATE_SET_MIN_SAMPLE_SHADING, NIL)
    }

  /**
   *
   */
  public open var enableAlphaToCoverage: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEMULTISAMPLESTATE_GET_ENABLE_ALPHA_TO_COVERAGE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEMULTISAMPLESTATE_SET_ENABLE_ALPHA_TO_COVERAGE, NIL)
    }

  /**
   *
   */
  public open var enableAlphaToOne: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEMULTISAMPLESTATE_GET_ENABLE_ALPHA_TO_ONE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEMULTISAMPLESTATE_SET_ENABLE_ALPHA_TO_ONE, NIL)
    }

  /**
   *
   */
  public open var sampleMasks: VariantArray<Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEMULTISAMPLESTATE_GET_SAMPLE_MASKS, ARRAY)
      return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEMULTISAMPLESTATE_SET_SAMPLE_MASKS, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_RDPIPELINEMULTISAMPLESTATE)
  }

  public companion object
}
