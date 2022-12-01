// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Plane
import godot.core.TransferContext
import godot.core.VariantType.NIL
import godot.core.VariantType.PLANE
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

/**
 * World boundary (infinite plane) shape resource for 3D physics.
 *
 * 3D world boundary shape to be added as a *direct* child of a [godot.PhysicsBody3D] or [godot.Area3D] using a [godot.CollisionShape3D] node. [godot.WorldBoundaryShape3D] works like an infinite plane and will not allow any physics body to go to the negative side. Note that the [godot.core.Plane]'s normal matters; anything "below" the plane will collide with it. If the [godot.WorldBoundaryShape3D] is used in a [godot.PhysicsBody3D], it will cause colliding objects placed "below" it to teleport "above" the plane.
 *
 * **Performance:** Being a primitive collision shape, [godot.WorldBoundaryShape3D] is fast to check collisions against.
 */
@GodotBaseType
public open class WorldBoundaryShape3D : Shape3D() {
  /**
   * The [godot.core.Plane] used by the [godot.WorldBoundaryShape3D] for collision.
   */
  public var plane: Plane
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WORLDBOUNDARYSHAPE3D_GET_PLANE,
          PLANE)
      return TransferContext.readReturnValue(PLANE, false) as Plane
    }
    set(`value`) {
      TransferContext.writeArguments(PLANE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WORLDBOUNDARYSHAPE3D_SET_PLANE,
          NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_WORLDBOUNDARYSHAPE3D, scriptIndex)
    return true
  }

  public companion object
}
