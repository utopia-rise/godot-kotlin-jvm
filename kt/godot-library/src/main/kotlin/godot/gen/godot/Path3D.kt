// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Signal0
import godot.core.TypeManager
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

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
  public val curveChanged: Signal0 by Signal0

  /**
   * A [Curve3D] describing the path.
   */
  public final inline var curve: Curve3D?
    @JvmName("curveProperty")
    get() = getCurve()
    @JvmName("curveProperty")
    set(`value`) {
      setCurve(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_PATH3D, scriptIndex)
  }

  public final fun setCurve(curve: Curve3D?): Unit {
    TransferContext.writeArguments(OBJECT to curve)
    TransferContext.callMethod(rawPtr, MethodBindings.setCurvePtr, NIL)
  }

  public final fun getCurve(): Curve3D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCurvePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Curve3D?)
  }

  public companion object

  internal object MethodBindings {
    public val setCurvePtr: VoidPtr = TypeManager.getMethodBindPtr("Path3D", "set_curve", 408955118)

    public val getCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Path3D", "get_curve", 4244715212)
  }
}
