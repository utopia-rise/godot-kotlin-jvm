// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.Suppress

@GodotBaseType
public open class StreamPeerExtension : StreamPeer() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_STREAMPEEREXTENSION, scriptIndex)
    return true
  }

  public open fun _getAvailableBytes(): Int {
    throw NotImplementedError("_get_available_bytes is not implemented for StreamPeerExtension")
  }

  public companion object

  internal object MethodBindings {
    public val _getDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeerExtension", "_get_data")

    public val _getPartialDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeerExtension", "_get_partial_data")

    public val _putDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeerExtension", "_put_data")

    public val _putPartialDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeerExtension", "_put_partial_data")

    public val _getAvailableBytesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeerExtension", "_get_available_bytes")
  }
}
