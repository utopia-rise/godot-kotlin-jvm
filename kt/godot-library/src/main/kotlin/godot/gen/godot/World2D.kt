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
open class World2D : Resource() {
  open val canvas: RID
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WORLD2D_GET_CANVAS, _RID)
      return TransferContext.readReturnValue(_RID, false) as RID
    }

  open val directSpaceState: Physics2DDirectSpaceState?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WORLD2D_GET_DIRECT_SPACE_STATE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Physics2DDirectSpaceState?
    }

  open val space: RID
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WORLD2D_GET_SPACE, _RID)
      return TransferContext.readReturnValue(_RID, false) as RID
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_WORLD2D)
}
