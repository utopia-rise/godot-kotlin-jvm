// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.RID
import godot.core.TransferContext
import godot.core.Transform2D
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.TRANSFORM2D
import godot.core.VariantType.VECTOR2
import godot.core.VariantType._RID
import godot.core.Vector2
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Parameters to be sent to a 2D shape physics query.
 *
 * This class contains the shape and other parameters for [godot.PhysicsDirectSpaceState2D] intersection/collision queries.
 */
@GodotBaseType
public open class PhysicsShapeQueryParameters2D : RefCounted() {
  /**
   * The physics layers the query will detect (as a bitmask). By default, all collision layers are detected. See [godot.Collision layers and masks]($DOCS_URL/tutorials/physics/physics_introduction.html#collision-layers-and-masks) in the documentation for more information.
   */
  public open var collisionMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSSHAPEQUERYPARAMETERS2D_GET_COLLISION_MASK, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSSHAPEQUERYPARAMETERS2D_SET_COLLISION_MASK, NIL)
    }

  /**
   * The list of objects or object [RID]s that will be excluded from collisions.
   */
  public open var exclude: VariantArray<Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSSHAPEQUERYPARAMETERS2D_GET_EXCLUDE, ARRAY)
      return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSSHAPEQUERYPARAMETERS2D_SET_EXCLUDE, NIL)
    }

  /**
   * The collision margin for the shape.
   */
  public open var margin: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSSHAPEQUERYPARAMETERS2D_GET_MARGIN, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSSHAPEQUERYPARAMETERS2D_SET_MARGIN, NIL)
    }

  /**
   * The motion of the shape being queried for.
   */
  public open var motion: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSSHAPEQUERYPARAMETERS2D_GET_MOTION, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSSHAPEQUERYPARAMETERS2D_SET_MOTION, NIL)
    }

  /**
   * The [godot.Shape2D] that will be used for collision/intersection queries. This stores the actual reference which avoids the shape to be released while being used for queries, so always prefer using this over [shapeRid].
   */
  public open var shape: Shape2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSSHAPEQUERYPARAMETERS2D_GET_SHAPE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Shape2D?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSSHAPEQUERYPARAMETERS2D_SET_SHAPE, NIL)
    }

  /**
   * The queried shape's [RID] that will be used for collision/intersection queries. Use this over [shape] if you want to optimize for performance using the Servers API:
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * var shape_rid = PhysicsServer2D.circle_shape_create()
   *
   * var radius = 64
   *
   * PhysicsServer2D.shape_set_data(shape_rid, radius)
   *
   *
   *
   * var params = PhysicsShapeQueryParameters2D.new()
   *
   * params.shape_rid = shape_rid
   *
   *
   *
   * # Execute physics queries here...
   *
   *
   *
   * # Release the shape when done with physics queries.
   *
   * PhysicsServer2D.free_rid(shape_rid)
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * RID shapeRid = PhysicsServer2D.CircleShapeCreate();
   *
   * int radius = 64;
   *
   * PhysicsServer2D.ShapeSetData(shapeRid, radius);
   *
   *
   *
   * var params = new PhysicsShapeQueryParameters2D();
   *
   * params.ShapeRid = shapeRid;
   *
   *
   *
   * // Execute physics queries here...
   *
   *
   *
   * // Release the shape when done with physics queries.
   *
   * PhysicsServer2D.FreeRid(shapeRid);
   *
   * [/csharp]
   *
   * [/codeblocks]
   */
  public open var shapeRid: RID
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSSHAPEQUERYPARAMETERS2D_GET_SHAPE_RID, _RID)
      return TransferContext.readReturnValue(_RID, false) as RID
    }
    set(`value`) {
      TransferContext.writeArguments(_RID to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSSHAPEQUERYPARAMETERS2D_SET_SHAPE_RID, NIL)
    }

  /**
   * The queried shape's transform matrix.
   */
  public open var transform: Transform2D
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSSHAPEQUERYPARAMETERS2D_GET_TRANSFORM, TRANSFORM2D)
      return TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D
    }
    set(`value`) {
      TransferContext.writeArguments(TRANSFORM2D to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSSHAPEQUERYPARAMETERS2D_SET_TRANSFORM, NIL)
    }

  /**
   * If `true`, the query will take [godot.PhysicsBody2D]s into account.
   */
  public open var collideWithBodies: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSSHAPEQUERYPARAMETERS2D_IS_COLLIDE_WITH_BODIES_ENABLED,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSSHAPEQUERYPARAMETERS2D_SET_COLLIDE_WITH_BODIES, NIL)
    }

  /**
   * If `true`, the query will take [godot.Area2D]s into account.
   */
  public open var collideWithAreas: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSSHAPEQUERYPARAMETERS2D_IS_COLLIDE_WITH_AREAS_ENABLED,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSSHAPEQUERYPARAMETERS2D_SET_COLLIDE_WITH_AREAS, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_PHYSICSSHAPEQUERYPARAMETERS2D)
  }

  public companion object
}
