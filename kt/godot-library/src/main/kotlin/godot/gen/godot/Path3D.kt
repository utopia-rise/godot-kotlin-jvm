// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * Can have [PathFollow3D] child nodes moving along the [Curve3D]. See [PathFollow3D] for more
 * information on the usage.
 * Note that the path is considered as relative to the moved nodes (children of [PathFollow3D]). As
 * such, the curve should usually start with a zero vector `(0, 0, 0)`.
 */
@GodotBaseType
public open class Path3D : Node3D() {
  /**
   * Emitted when the [curve] changes.
   */
  public val curveChanged: Signal0 by signal()

  /**
   * A [Curve3D] describing the path.
   */
  public var curve: Curve3D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCurvePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Curve3D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCurvePtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_PATH3D, scriptIndex)
  }

  public companion object

  internal object MethodBindings {
    public val setCurvePtr: VoidPtr = TypeManager.getMethodBindPtr("Path3D", "set_curve")

    public val getCurvePtr: VoidPtr = TypeManager.getMethodBindPtr("Path3D", "get_curve")
  }
}
