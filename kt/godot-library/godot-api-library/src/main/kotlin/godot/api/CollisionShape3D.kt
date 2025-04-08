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
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.COLOR
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * A node that provides a [Shape3D] to a [CollisionObject3D] parent and allows to edit it. This can
 * give a detection shape to an [Area3D] or turn a [PhysicsBody3D] into a solid object.
 *
 * **Warning:** A non-uniformly scaled [CollisionShape3D] will likely not behave as expected. Make
 * sure to keep its scale the same on all axes and adjust its [shape] resource instead.
 */
@GodotBaseType
public open class CollisionShape3D : Node3D() {
  /**
   * The actual shape owned by this collision shape.
   */
  public final inline var shape: Shape3D?
    @JvmName("shapeProperty")
    get() = getShape()
    @JvmName("shapeProperty")
    set(`value`) {
      setShape(value)
    }

  /**
   * A disabled collision shape has no effect in the world.
   */
  public final inline var disabled: Boolean
    @JvmName("disabledProperty")
    get() = isDisabled()
    @JvmName("disabledProperty")
    set(`value`) {
      setDisabled(value)
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
    createNativeObject(159, scriptIndex)
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
   * val myCoreType = collisionshape3d.debugColor
   * //Your changes
   * collisionshape3d.debugColor = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun debugColorMutate(block: Color.() -> Unit): Color = debugColor.apply{
      block(this)
      debugColor = this
  }


  /**
   * This method does nothing.
   */
  public final fun resourceChanged(resource: Resource?): Unit {
    TransferContext.writeArguments(OBJECT to resource)
    TransferContext.callMethod(ptr, MethodBindings.resourceChangedPtr, NIL)
  }

  public final fun setShape(shape: Shape3D?): Unit {
    TransferContext.writeArguments(OBJECT to shape)
    TransferContext.callMethod(ptr, MethodBindings.setShapePtr, NIL)
  }

  public final fun getShape(): Shape3D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getShapePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Shape3D?)
  }

  public final fun setDisabled(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setDisabledPtr, NIL)
  }

  public final fun isDisabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isDisabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets the collision shape's shape to the addition of all its convexed [MeshInstance3D] siblings
   * geometry.
   */
  public final fun makeConvexFromSiblings(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.makeConvexFromSiblingsPtr, NIL)
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

  public companion object

  public object MethodBindings {
    internal val resourceChangedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionShape3D", "resource_changed", 968641751)

    internal val setShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionShape3D", "set_shape", 1549710052)

    internal val getShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionShape3D", "get_shape", 3214262478)

    internal val setDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionShape3D", "set_disabled", 2586408642)

    internal val isDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionShape3D", "is_disabled", 36873697)

    internal val makeConvexFromSiblingsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionShape3D", "make_convex_from_siblings", 3218959716)

    internal val setDebugColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionShape3D", "set_debug_color", 2920490490)

    internal val getDebugColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionShape3D", "get_debug_color", 3444240500)

    internal val setEnableDebugFillPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionShape3D", "set_enable_debug_fill", 2586408642)

    internal val getEnableDebugFillPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionShape3D", "get_enable_debug_fill", 36873697)
  }
}
