// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.PoolVector3Array
import godot.core.TransferContext
import godot.core.VariantType.NIL
import godot.core.VariantType.POOL_VECTOR3_ARRAY
import godot.util.VoidPtr
import kotlin.Suppress

@GodotBaseType
open class ConvexPolygonShape : Shape() {
  open var points: PoolVector3Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONVEXPOLYGONSHAPE_GET_POINTS,
          POOL_VECTOR3_ARRAY)
      return TransferContext.readReturnValue(POOL_VECTOR3_ARRAY, false) as PoolVector3Array
    }
    set(value) {
      TransferContext.writeArguments(POOL_VECTOR3_ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONVEXPOLYGONSHAPE_SET_POINTS,
          NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_CONVEXPOLYGONSHAPE)
}
