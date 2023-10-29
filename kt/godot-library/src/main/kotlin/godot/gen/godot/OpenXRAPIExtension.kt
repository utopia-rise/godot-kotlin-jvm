// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
public open class OpenXRAPIExtension : RefCounted() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_OPENXRAPIEXTENSION, scriptIndex)
    return true
  }

  public fun getInstance(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPENXRAPIEXTENSION_GET_INSTANCE,
        LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun getSystemId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPENXRAPIEXTENSION_GET_SYSTEM_ID,
        LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun getSession(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPENXRAPIEXTENSION_GET_SESSION,
        LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun xrResult(
    result: Long,
    format: String,
    args: VariantArray<Any?>,
  ): Boolean {
    TransferContext.writeArguments(LONG to result, STRING to format, ARRAY to args)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPENXRAPIEXTENSION_XR_RESULT, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getInstanceProcAddr(name: String): Long {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_OPENXRAPIEXTENSION_GET_INSTANCE_PROC_ADDR, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun getErrorString(result: Long): String {
    TransferContext.writeArguments(LONG to result)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPENXRAPIEXTENSION_GET_ERROR_STRING,
        STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun getSwapchainFormatName(swapchainFormat: Long): String {
    TransferContext.writeArguments(LONG to swapchainFormat)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_OPENXRAPIEXTENSION_GET_SWAPCHAIN_FORMAT_NAME, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun isInitialized(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPENXRAPIEXTENSION_IS_INITIALIZED,
        BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun isRunning(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPENXRAPIEXTENSION_IS_RUNNING, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getPlaySpace(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPENXRAPIEXTENSION_GET_PLAY_SPACE,
        LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun getNextFrameTime(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_OPENXRAPIEXTENSION_GET_NEXT_FRAME_TIME, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun canRender(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPENXRAPIEXTENSION_CAN_RENDER, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public companion object {
    public fun openxrIsEnabled(checkRunInEditor: Boolean): Boolean {
      TransferContext.writeArguments(BOOL to checkRunInEditor)
      TransferContext.callMethod(0, ENGINEMETHOD_ENGINECLASS_OPENXRAPIEXTENSION_OPENXR_IS_ENABLED,
          BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
  }
}
