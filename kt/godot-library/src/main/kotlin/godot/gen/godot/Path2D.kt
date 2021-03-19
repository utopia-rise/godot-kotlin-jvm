// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import kotlin.Suppress

/**
 * Contains a [godot.Curve2D] path for [godot.PathFollow2D] nodes to follow.
 *
 * Can have [godot.PathFollow2D] child nodes moving along the [godot.Curve2D]. See [godot.PathFollow2D] for more information on usage.
 *
 * **Note:** The path is considered as relative to the moved nodes (children of [godot.PathFollow2D]). As such, the curve should usually start with a zero vector (`(0, 0)`).
 */
@GodotBaseType
open class Path2D : Node2D() {
  /**
   * A [godot.Curve2D] describing the path.
   */
  open var curve: Curve2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PATH2D_GET_CURVE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Curve2D?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PATH2D_SET_CURVE, NIL)
    }

  override fun __new() {
    callConstructor(ENGINECLASS_PATH2D)
  }

  open fun _curveChanged() {
  }
}
