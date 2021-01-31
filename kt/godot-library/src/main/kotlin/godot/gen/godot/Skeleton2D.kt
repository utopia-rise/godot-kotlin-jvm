// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.RID
import godot.core.TransferContext
import godot.core.VariantType.LONG
import godot.core.VariantType.OBJECT
import godot.core.VariantType._RID
import godot.signals.Signal0
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
open class Skeleton2D : Node2D() {
  val boneSetupChanged: Signal0 by signal()

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_SKELETON2D)

  open fun _update_bone_setup() {
  }

  open fun _update_transform() {
  }

  open fun getBone(idx: Long): Bone2D? {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON2D_GET_BONE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Bone2D?
  }

  open fun getBoneCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON2D_GET_BONE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getSkeleton(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON2D_GET_SKELETON, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }
}
