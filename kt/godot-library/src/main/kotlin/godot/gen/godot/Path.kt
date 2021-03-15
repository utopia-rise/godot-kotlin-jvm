// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Suppress

/**
 * Contains a [godot.Curve3D] path for [godot.PathFollow] nodes to follow.
 *
 * Can have [godot.PathFollow] child nodes moving along the [godot.Curve3D]. See [godot.PathFollow] for more information on the usage.
 *
 * Note that the path is considered as relative to the moved nodes (children of [godot.PathFollow]). As such, the curve should usually start with a zero vector `(0, 0, 0)`.
 */
@GodotBaseType
open class Path : Spatial() {
  /**
   * Emitted when the [curve] changes.
   */
  val curveChanged: Signal0 by signal()

  /**
   * A [godot.Curve3D] describing the path.
   */
  open var curve: Curve3D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PATH_GET_CURVE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Curve3D?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PATH_SET_CURVE, NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_PATH, ____DO_NOT_TOUCH_THIS_isRef____())
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  open fun _curveChanged() {
  }
}
