// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
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
    TransferContext.callMethod(rawPtr, MethodBindings.getInstancePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun getSystemId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSystemIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun getSession(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSessionPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun xrResult(
    result: Long,
    format: String,
    args: VariantArray<Any?>,
  ): Boolean {
    TransferContext.writeArguments(LONG to result, STRING to format, ARRAY to args)
    TransferContext.callMethod(rawPtr, MethodBindings.xrResultPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getInstanceProcAddr(name: String): Long {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.getInstanceProcAddrPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun getErrorString(result: Long): String {
    TransferContext.writeArguments(LONG to result)
    TransferContext.callMethod(rawPtr, MethodBindings.getErrorStringPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun getSwapchainFormatName(swapchainFormat: Long): String {
    TransferContext.writeArguments(LONG to swapchainFormat)
    TransferContext.callMethod(rawPtr, MethodBindings.getSwapchainFormatNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun isInitialized(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isInitializedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun isRunning(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isRunningPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getPlaySpace(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPlaySpacePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun getNextFrameTime(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getNextFrameTimePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun canRender(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.canRenderPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public companion object {
    public fun openxrIsEnabled(checkRunInEditor: Boolean): Boolean {
      TransferContext.writeArguments(BOOL to checkRunInEditor)
      TransferContext.callMethod(0, MethodBindings.openxrIsEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
  }

  internal object MethodBindings {
    public val getInstancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRAPIExtension", "get_instance")

    public val getSystemIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRAPIExtension", "get_system_id")

    public val getSessionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRAPIExtension", "get_session")

    public val transformFromPosePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRAPIExtension", "transform_from_pose")

    public val xrResultPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRAPIExtension", "xr_result")

    public val openxrIsEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRAPIExtension", "openxr_is_enabled")

    public val getInstanceProcAddrPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRAPIExtension", "get_instance_proc_addr")

    public val getErrorStringPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRAPIExtension", "get_error_string")

    public val getSwapchainFormatNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRAPIExtension", "get_swapchain_format_name")

    public val isInitializedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRAPIExtension", "is_initialized")

    public val isRunningPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRAPIExtension", "is_running")

    public val getPlaySpacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRAPIExtension", "get_play_space")

    public val getNextFrameTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRAPIExtension", "get_next_frame_time")

    public val canRenderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRAPIExtension", "can_render")
  }
}
