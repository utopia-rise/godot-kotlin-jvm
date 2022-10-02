// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import kotlin.Boolean
import kotlin.Suppress
import kotlin.Unit

/**
 * Node that represents collision shape data in 3D space.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/678](https://godotengine.org/asset-library/asset/678)
 *
 * Editor facility for creating and editing collision shapes in 3D space. Set the [shape] property to configure the shape. **IMPORTANT**: this is an Editor-only helper to create shapes, use [godot.CollisionObject.shapeOwnerGetShape] to get the actual shape.
 *
 * You can use this node to represent all sorts of collision shapes, for example, add this to an [godot.Area] to give it a detection shape, or add it to a [godot.PhysicsBody] to create a solid object.
 */
@GodotBaseType
public open class CollisionShape : Spatial() {
  /**
   * A disabled collision shape has no effect in the world.
   */
  public open var disabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLLISIONSHAPE_GET_DISABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLLISIONSHAPE_SET_DISABLED, NIL)
    }

  /**
   * The actual shape owned by this collision shape.
   */
  public open var shape: Shape?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLLISIONSHAPE_GET_SHAPE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Shape?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLLISIONSHAPE_SET_SHAPE, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_COLLISIONSHAPE)
  }

  /**
   * Sets the collision shape's shape to the addition of all its convexed [godot.MeshInstance] siblings geometry.
   */
  public open fun makeConvexFromBrothers(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONSHAPE_MAKE_CONVEX_FROM_BROTHERS, NIL)
  }

  /**
   * If this method exists within a script it will be called whenever the shape resource has been modified.
   */
  public open fun resourceChanged(resource: Resource): Unit {
    TransferContext.writeArguments(OBJECT to resource)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLLISIONSHAPE_RESOURCE_CHANGED,
        NIL)
  }
}
