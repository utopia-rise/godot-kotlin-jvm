// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier", "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST", "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT", "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.Suppress

@GodotBaseType
public open class StreamPeerExtension : StreamPeer() {
  override fun new(scriptIndex: Int) {
    createNativeObject(636, scriptIndex)
  }

  public open fun _getAvailableBytes(): Int {
    throw NotImplementedError("_getAvailableBytes is not implemented for StreamPeerExtension")
  }

  public companion object

  public object MethodBindings
}
