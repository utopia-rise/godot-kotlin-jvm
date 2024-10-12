// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_PATH2D_INDEX: Int = 452

/**
 * Can have [PathFollow2D] child nodes moving along the [Curve2D]. See [PathFollow2D] for more
 * information on usage.
 * **Note:** The path is considered as relative to the moved nodes (children of [PathFollow2D]). As
 * such, the curve should usually start with a zero vector (`(0, 0)`).
 */
@GodotBaseType
public open class Path2D : Node2D() {
  /**
   * A [Curve2D] describing the path.
   */
  public final inline var curve: Curve2D?
    @JvmName("curveProperty")
    get() = getCurve()
    @JvmName("curveProperty")
    set(`value`) {
      setCurve(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_PATH2D_INDEX, scriptIndex)
  }

  public final fun setCurve(curve: Curve2D?): Unit {
    Internals.writeArguments(OBJECT to curve)
    Internals.callMethod(rawPtr, MethodBindings.setCurvePtr, NIL)
  }

  public final fun getCurve(): Curve2D? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCurvePtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Curve2D?)
  }

  public companion object

  public object MethodBindings {
    internal val setCurvePtr: VoidPtr = Internals.getMethodBindPtr("Path2D", "set_curve", 659985499)

    internal val getCurvePtr: VoidPtr = Internals.getMethodBindPtr("Path2D", "get_curve", 660369445)
  }
}
