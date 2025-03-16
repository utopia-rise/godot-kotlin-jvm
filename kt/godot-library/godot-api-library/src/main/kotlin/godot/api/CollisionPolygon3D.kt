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
import godot.core.PackedVector2Array
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.COLOR
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.NIL
import godot.core.VariantParser.PACKED_VECTOR2_ARRAY
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * A node that provides a thickened polygon shape (a prism) to a [CollisionObject3D] parent and
 * allows to edit it. The polygon can be concave or convex. This can give a detection shape to an
 * [Area3D] or turn [PhysicsBody3D] into a solid object.
 *
 * **Warning:** A non-uniformly scaled [CollisionShape3D] will likely not behave as expected. Make
 * sure to keep its scale the same on all axes and adjust its shape resource instead.
 */
@GodotBaseType
public open class CollisionPolygon3D : Node3D() {
  /**
   * Length that the resulting collision extends in either direction perpendicular to its 2D
   * polygon.
   */
  public final inline var depth: Float
    @JvmName("depthProperty")
    get() = getDepth()
    @JvmName("depthProperty")
    set(`value`) {
      setDepth(value)
    }

  /**
   * If `true`, no collision will be produced.
   */
  public final inline var disabled: Boolean
    @JvmName("disabledProperty")
    get() = isDisabled()
    @JvmName("disabledProperty")
    set(`value`) {
      setDisabled(value)
    }

  /**
   * Array of vertices which define the 2D polygon in the local XY plane.
   */
  public final inline var polygon: PackedVector2Array
    @JvmName("polygonProperty")
    get() = getPolygon()
    @JvmName("polygonProperty")
    set(`value`) {
      setPolygon(value)
    }

  /**
   * The collision margin for the generated [Shape3D]. See [Shape3D.margin] for more details.
   */
  public final inline var margin: Float
    @JvmName("marginProperty")
    get() = getMargin()
    @JvmName("marginProperty")
    set(`value`) {
      setMargin(value)
    }

  /**
   * The collision shape color that is displayed in the editor, or in the running project if **Debug
   * > Visible Collision Shapes** is checked at the top of the editor.
   *
   * **Note:** The default value is [ProjectSettings.debug/shapes/collision/shapeColor]. The
   * `Color(0, 0, 0, 0)` value documented here is a placeholder, and not the actual default debug
   * color.
   */
  @CoreTypeLocalCopy
  public final inline var debugColor: Color
    @JvmName("debugColorProperty")
    get() = getDebugColor()
    @JvmName("debugColorProperty")
    set(`value`) {
      setDebugColor(value)
    }

  /**
   * If `true`, when the shape is displayed, it will show a solid fill color in addition to its
   * wireframe.
   */
  public final inline var debugFill: Boolean
    @JvmName("debugFillProperty")
    get() = getEnableDebugFill()
    @JvmName("debugFillProperty")
    set(`value`) {
      setEnableDebugFill(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(157, scriptIndex)
  }

  /**
   * The collision shape color that is displayed in the editor, or in the running project if **Debug
   * > Visible Collision Shapes** is checked at the top of the editor.
   *
   * **Note:** The default value is [ProjectSettings.debug/shapes/collision/shapeColor]. The
   * `Color(0, 0, 0, 0)` value documented here is a placeholder, and not the actual default debug
   * color.
   *
   * This is a helper function to make dealing with local copies easier.
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = collisionpolygon3d.debugColor
   * //Your changes
   * collisionpolygon3d.debugColor = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun debugColorMutate(block: Color.() -> Unit): Color = debugColor.apply{
      block(this)
      debugColor = this
  }


  public final fun setDepth(depth: Float): Unit {
    TransferContext.writeArguments(DOUBLE to depth.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setDepthPtr, NIL)
  }

  public final fun getDepth(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDepthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setPolygon(polygon: PackedVector2Array): Unit {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to polygon)
    TransferContext.callMethod(ptr, MethodBindings.setPolygonPtr, NIL)
  }

  public final fun getPolygon(): PackedVector2Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPolygonPtr, PACKED_VECTOR2_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY) as PackedVector2Array)
  }

  public final fun setDisabled(disabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to disabled)
    TransferContext.callMethod(ptr, MethodBindings.setDisabledPtr, NIL)
  }

  public final fun isDisabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isDisabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setDebugColor(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(ptr, MethodBindings.setDebugColorPtr, NIL)
  }

  public final fun getDebugColor(): Color {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDebugColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  public final fun setEnableDebugFill(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setEnableDebugFillPtr, NIL)
  }

  public final fun getEnableDebugFill(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getEnableDebugFillPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setMargin(margin: Float): Unit {
    TransferContext.writeArguments(DOUBLE to margin.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setMarginPtr, NIL)
  }

  public final fun getMargin(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMarginPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public companion object

  public object MethodBindings {
    internal val setDepthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionPolygon3D", "set_depth", 373806689)

    internal val getDepthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionPolygon3D", "get_depth", 1740695150)

    internal val setPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionPolygon3D", "set_polygon", 1509147220)

    internal val getPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionPolygon3D", "get_polygon", 2961356807)

    internal val setDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionPolygon3D", "set_disabled", 2586408642)

    internal val isDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionPolygon3D", "is_disabled", 36873697)

    internal val setDebugColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionPolygon3D", "set_debug_color", 2920490490)

    internal val getDebugColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionPolygon3D", "get_debug_color", 3444240500)

    internal val setEnableDebugFillPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionPolygon3D", "set_enable_debug_fill", 2586408642)

    internal val getEnableDebugFillPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionPolygon3D", "get_enable_debug_fill", 36873697)

    internal val setMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionPolygon3D", "set_margin", 373806689)

    internal val getMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionPolygon3D", "get_margin", 1740695150)
  }
}
