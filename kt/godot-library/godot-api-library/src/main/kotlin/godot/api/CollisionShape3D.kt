// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantParser.BOOL
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

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(191, scriptIndex)
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
  }
}
