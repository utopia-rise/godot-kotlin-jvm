// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.RID
import godot.core.Transform2D
import godot.core.TypeManager
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
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Provides parameters for [godot.PhysicsDirectSpaceState2D.intersectShape].
 *
 * By changing various properties of this object, such as the shape, you can configure the parameters for [godot.PhysicsDirectSpaceState2D.intersectShape].
 */
@GodotBaseType
public open class PhysicsShapeQueryParameters2D : RefCounted() {
  /**
   * The physics layers the query will detect (as a bitmask). By default, all collision layers are detected. See [godot.Collision layers and masks]($DOCS_URL/tutorials/physics/physics_introduction.html#collision-layers-and-masks) in the documentation for more information.
   */
  public var collisionMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCollisionMaskPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCollisionMaskPtr, NIL)
    }

  /**
   * The list of object [RID]s that will be excluded from collisions. Use [godot.CollisionObject2D.getRid] to get the [RID] associated with a [godot.CollisionObject2D]-derived node.
   */
  public var exclude: VariantArray<RID>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getExcludePtr, ARRAY)
      return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<RID>)
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setExcludePtr, NIL)
    }

  /**
   * The collision margin for the shape.
   */
  public var margin: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMarginPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setMarginPtr, NIL)
    }

  /**
   * The motion of the shape being queried for.
   */
  @CoreTypeLocalCopy
  public var motion: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMotionPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMotionPtr, NIL)
    }

  /**
   * The [godot.Shape2D] that will be used for collision/intersection queries. This stores the actual reference which avoids the shape to be released while being used for queries, so always prefer using this over [shapeRid].
   */
  public var shape: Resource?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getShapePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Resource?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setShapePtr, NIL)
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
  public var shapeRid: RID
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getShapeRidPtr, _RID)
      return (TransferContext.readReturnValue(_RID, false) as RID)
    }
    set(`value`) {
      TransferContext.writeArguments(_RID to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setShapeRidPtr, NIL)
    }

  /**
   * The queried shape's transform matrix.
   */
  @CoreTypeLocalCopy
  public var transform: Transform2D
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTransformPtr, TRANSFORM2D)
      return (TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D)
    }
    set(`value`) {
      TransferContext.writeArguments(TRANSFORM2D to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTransformPtr, NIL)
    }

  /**
   * If `true`, the query will take [godot.PhysicsBody2D]s into account.
   */
  public var collideWithBodies: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isCollideWithBodiesEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCollideWithBodiesPtr, NIL)
    }

  /**
   * If `true`, the query will take [godot.Area2D]s into account.
   */
  public var collideWithAreas: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isCollideWithAreasEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCollideWithAreasPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_PHYSICSSHAPEQUERYPARAMETERS2D, scriptIndex)
    return true
  }

  /**
   * The motion of the shape being queried for.
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
   * val myCoreType = physicsshapequeryparameters2d.motion
   * //Your changes
   * physicsshapequeryparameters2d.motion = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun motionMutate(block: Vector2.() -> Unit): Vector2 = motion.apply{
      block(this)
      motion = this
  }


  /**
   * The queried shape's transform matrix.
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
   * val myCoreType = physicsshapequeryparameters2d.transform
   * //Your changes
   * physicsshapequeryparameters2d.transform = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun transformMutate(block: Transform2D.() -> Unit): Transform2D = transform.apply{
      block(this)
      transform = this
  }


  public companion object

  internal object MethodBindings {
    public val setShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsShapeQueryParameters2D", "set_shape")

    public val getShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsShapeQueryParameters2D", "get_shape")

    public val setShapeRidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsShapeQueryParameters2D", "set_shape_rid")

    public val getShapeRidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsShapeQueryParameters2D", "get_shape_rid")

    public val setTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsShapeQueryParameters2D", "set_transform")

    public val getTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsShapeQueryParameters2D", "get_transform")

    public val setMotionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsShapeQueryParameters2D", "set_motion")

    public val getMotionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsShapeQueryParameters2D", "get_motion")

    public val setMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsShapeQueryParameters2D", "set_margin")

    public val getMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsShapeQueryParameters2D", "get_margin")

    public val setCollisionMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsShapeQueryParameters2D", "set_collision_mask")

    public val getCollisionMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsShapeQueryParameters2D", "get_collision_mask")

    public val setExcludePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsShapeQueryParameters2D", "set_exclude")

    public val getExcludePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsShapeQueryParameters2D", "get_exclude")

    public val setCollideWithBodiesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsShapeQueryParameters2D", "set_collide_with_bodies")

    public val isCollideWithBodiesEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsShapeQueryParameters2D", "is_collide_with_bodies_enabled")

    public val setCollideWithAreasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsShapeQueryParameters2D", "set_collide_with_areas")

    public val isCollideWithAreasEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsShapeQueryParameters2D", "is_collide_with_areas_enabled")
  }
}
