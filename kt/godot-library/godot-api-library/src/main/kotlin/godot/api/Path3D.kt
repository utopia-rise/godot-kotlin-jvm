// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.Color
import godot.core.Signal0
import godot.core.VariantParser.COLOR
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Can have [PathFollow3D] child nodes moving along the [Curve3D]. See [PathFollow3D] for more
 * information on the usage.
 *
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
   * Emitted when the [debugCustomColor] changes.
   */
  public val debugColorChanged: Signal0 by Signal0

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

  /**
   * The custom color to use to draw the shape in the editor.
   *
   * If set to `Color(0.0, 0.0, 0.0)` (by default), the color set in EditorSettings is used.
   *
   * **Warning:**
   * Be careful when trying to modify a local
   * [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this
   * getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again
   * afterward.
   */
  @CoreTypeLocalCopy
  public final inline var debugCustomColor: Color
    @JvmName("debugCustomColorProperty")
    get() = getDebugCustomColor()
    @JvmName("debugCustomColorProperty")
    set(`value`) {
      setDebugCustomColor(value)
    }

  public override fun new(scriptPtr: VoidPtr): Unit {
    createNativeObject(466, scriptPtr)
  }

  /**
   * This is a helper function for [debugCustomColor] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = path3d.debugCustomColor
   * //Your changes
   * path3d.debugCustomColor = myCoreType
   * ``````
   *
   * The custom color to use to draw the shape in the editor.
   *
   * If set to `Color(0.0, 0.0, 0.0)` (by default), the color set in EditorSettings is used.
   */
  @CoreTypeHelper
  public final fun debugCustomColorMutate(block: Color.() -> Unit): Color = debugCustomColor.apply {
     block(this)
     debugCustomColor = this
  }

  public final fun setCurve(curve: Curve3D?): Unit {
    TransferContext.writeArguments(OBJECT to curve)
    TransferContext.callMethod(ptr, MethodBindings.setCurvePtr, NIL)
  }

  public final fun getCurve(): Curve3D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCurvePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Curve3D?)
  }

  public final fun setDebugCustomColor(debugCustomColor: Color): Unit {
    TransferContext.writeArguments(COLOR to debugCustomColor)
    TransferContext.callMethod(ptr, MethodBindings.setDebugCustomColorPtr, NIL)
  }

  public final fun getDebugCustomColor(): Color {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDebugCustomColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  public companion object

  public object MethodBindings {
    internal val setCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Path3D", "set_curve", 408955118)

    internal val getCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Path3D", "get_curve", 4244715212)

    internal val setDebugCustomColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Path3D", "set_debug_custom_color", 2920490490)

    internal val getDebugCustomColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Path3D", "get_debug_custom_color", 3444240500)
  }
}
