// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.CoreTypeHelper
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
 * This class contains the shape and other parameters for 2D intersection/collision queries.
 */
@GodotBaseType
public open class Physics2DShapeQueryParameters : Reference() {
  /**
   * If `true`, the query will take [godot.Area2D]s into account.
   */
  public open var collideWithAreas: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICS2DSHAPEQUERYPARAMETERS_GET_COLLIDE_WITH_AREAS, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICS2DSHAPEQUERYPARAMETERS_SET_COLLIDE_WITH_AREAS, NIL)
    }

  /**
   * If `true`, the query will take [godot.PhysicsBody2D]s into account.
   */
  public open var collideWithBodies: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICS2DSHAPEQUERYPARAMETERS_GET_COLLIDE_WITH_BODIES, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICS2DSHAPEQUERYPARAMETERS_SET_COLLIDE_WITH_BODIES, NIL)
    }

  /**
   * The physics layer(s) the query will take into account (as a bitmask). See [godot.Collision layers and masks]($DOCS_URL/tutorials/physics/physics_introduction.html#collision-layers-and-masks) in the documentation for more information.
   */
  public open var collisionLayer: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICS2DSHAPEQUERYPARAMETERS_GET_COLLISION_LAYER, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICS2DSHAPEQUERYPARAMETERS_SET_COLLISION_LAYER, NIL)
    }

  /**
   * The list of objects or object [RID]s that will be excluded from collisions.
   */
  public open var exclude: VariantArray<Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICS2DSHAPEQUERYPARAMETERS_GET_EXCLUDE, ARRAY)
      return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICS2DSHAPEQUERYPARAMETERS_SET_EXCLUDE, NIL)
    }

  /**
   * The collision margin for the shape.
   */
  public open var margin: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICS2DSHAPEQUERYPARAMETERS_GET_MARGIN, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICS2DSHAPEQUERYPARAMETERS_SET_MARGIN, NIL)
    }

  /**
   * The motion of the shape being queried for.
   */
  public open var motion: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICS2DSHAPEQUERYPARAMETERS_GET_MOTION, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICS2DSHAPEQUERYPARAMETERS_SET_MOTION, NIL)
    }

  /**
   * The queried shape's [RID]. See also [setShape].
   */
  public open var shapeRid: RID
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICS2DSHAPEQUERYPARAMETERS_GET_SHAPE_RID, _RID)
      return TransferContext.readReturnValue(_RID, false) as RID
    }
    set(`value`) {
      TransferContext.writeArguments(_RID to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICS2DSHAPEQUERYPARAMETERS_SET_SHAPE_RID, NIL)
    }

  /**
   * The queried shape's transform matrix.
   */
  public open var transform: Transform2D
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICS2DSHAPEQUERYPARAMETERS_GET_TRANSFORM, TRANSFORM2D)
      return TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D
    }
    set(`value`) {
      TransferContext.writeArguments(TRANSFORM2D to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICS2DSHAPEQUERYPARAMETERS_SET_TRANSFORM, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_PHYSICS2DSHAPEQUERYPARAMETERS)
  }

  @CoreTypeHelper
  public open fun motion(schedule: Vector2.() -> Unit): Vector2 = motion.apply{
      schedule(this)
      motion = this
  }


  @CoreTypeHelper
  public open fun transform(schedule: Transform2D.() -> Unit): Transform2D = transform.apply{
      schedule(this)
      transform = this
  }


  /**
   * Sets the [godot.Shape2D] that will be used for collision/intersection queries.
   */
  public open fun setShape(shape: Resource): Unit {
    TransferContext.writeArguments(OBJECT to shape)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSHAPEQUERYPARAMETERS_SET_SHAPE, NIL)
  }
}
