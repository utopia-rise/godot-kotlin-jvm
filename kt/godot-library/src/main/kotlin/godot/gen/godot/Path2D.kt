// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

/**
 * Contains a [godot.Curve2D] path for [godot.PathFollow2D] nodes to follow.
 *
 * Can have [godot.PathFollow2D] child nodes moving along the [godot.Curve2D]. See [godot.PathFollow2D] for more information on usage.
 *
 * **Note:** The path is considered as relative to the moved nodes (children of [godot.PathFollow2D]). As such, the curve should usually start with a zero vector (`(0, 0)`).
 */
@GodotBaseType
public open class Path2D : Node2D() {
  /**
   * A [godot.Curve2D] describing the path.
   */
  public var curve: Curve2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PATH2D_GET_CURVE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Curve2D?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PATH2D_SET_CURVE, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_PATH2D, scriptIndex)
    return true
  }

  public companion object
}
