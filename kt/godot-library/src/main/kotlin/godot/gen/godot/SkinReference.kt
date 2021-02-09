// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.RID
import godot.core.TransferContext
import godot.core.VariantType.OBJECT
import godot.core.VariantType._RID
import godot.util.VoidPtr
import kotlin.Suppress

@GodotBaseType
open class SkinReference : Reference() {
  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_SKINREFERENCE)

  open fun _skinChanged() {
  }

  open fun getSkeleton(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKINREFERENCE_GET_SKELETON, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  open fun getSkin(): Skin? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKINREFERENCE_GET_SKIN, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Skin?
  }
}
