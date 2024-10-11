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
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.TRANSFORM2D
import godot.core.VariantParser.VECTOR2
import godot.core.VariantParser._RID
import godot.core.Vector2
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_PHYSICSSHAPEQUERYPARAMETERS2D_INDEX: Int = 476

/**
 * By changing various properties of this object, such as the shape, you can configure the
 * parameters for [PhysicsDirectSpaceState2D.intersectShape].
 */
@GodotBaseType
public open class PhysicsShapeQueryParameters2D : RefCounted() {
  /**
   * The physics layers the query will detect (as a bitmask). By default, all collision layers are
   * detected. See
   * [url=$DOCS_URL/tutorials/physics/physics_introduction.html#collision-layers-and-masks]Collision
   * layers and masks[/url] in the documentation for more information.
   */
  public final inline var collisionMask: Long
    @JvmName("collisionMaskProperty")
    get() = getCollisionMask()
    @JvmName("collisionMaskProperty")
    set(`value`) {
      setCollisionMask(value)
    }

  /**
   * The list of object [RID]s that will be excluded from collisions. Use [CollisionObject2D.getRid]
   * to get the [RID] associated with a [CollisionObject2D]-derived node.
   * **Note:** The returned array is copied and any changes to it will not update the original
   * property value. To update the value you need to modify the returned array, and then assign it to
   * the property again.
   */
  public final inline var exclude: VariantArray<RID>
    @JvmName("excludeProperty")
    get() = getExclude()
    @JvmName("excludeProperty")
    set(`value`) {
      setExclude(value)
    }

  /**
   * The collision margin for the shape.
   */
  public final inline var margin: Float
    @JvmName("marginProperty")
    get() = getMargin()
    @JvmName("marginProperty")
    set(`value`) {
      setMargin(value)
    }

  /**
   * The motion of the shape being queried for.
   */
  @CoreTypeLocalCopy
  public final inline var motion: Vector2
    @JvmName("motionProperty")
    get() = getMotion()
    @JvmName("motionProperty")
    set(`value`) {
      setMotion(value)
    }

  /**
   * The [Shape2D] that will be used for collision/intersection queries. This stores the actual
   * reference which avoids the shape to be released while being used for queries, so always prefer
   * using this over [shapeRid].
   */
  public final inline var shape: Resource?
    @JvmName("shapeProperty")
    get() = getShape()
    @JvmName("shapeProperty")
    set(`value`) {
      setShape(value)
    }

  /**
   * The queried shape's [RID] that will be used for collision/intersection queries. Use this over
   * [shape] if you want to optimize for performance using the Servers API:
   *
   * gdscript:
   * ```gdscript
   * var shape_rid = PhysicsServer2D.circle_shape_create()
   * var radius = 64
   * PhysicsServer2D.shape_set_data(shape_rid, radius)
   *
   * var params = PhysicsShapeQueryParameters2D.new()
   * params.shape_rid = shape_rid
   *
   * # Execute physics queries here...
   *
   * # Release the shape when done with physics queries.
   * PhysicsServer2D.free_rid(shape_rid)
   * ```
   * csharp:
   * ```csharp
   * RID shapeRid = PhysicsServer2D.CircleShapeCreate();
   * int radius = 64;
   * PhysicsServer2D.ShapeSetData(shapeRid, radius);
   *
   * var params = new PhysicsShapeQueryParameters2D();
   * params.ShapeRid = shapeRid;
   *
   * // Execute physics queries here...
   *
   * // Release the shape when done with physics queries.
   * PhysicsServer2D.FreeRid(shapeRid);
   * ```
   */
  public final inline var shapeRid: RID
    @JvmName("shapeRidProperty")
    get() = getShapeRid()
    @JvmName("shapeRidProperty")
    set(`value`) {
      setShapeRid(value)
    }

  /**
   * The queried shape's transform matrix.
   */
  @CoreTypeLocalCopy
  public final inline var transform: Transform2D
    @JvmName("transformProperty")
    get() = getTransform()
    @JvmName("transformProperty")
    set(`value`) {
      setTransform(value)
    }

  /**
   * If `true`, the query will take [PhysicsBody2D]s into account.
   */
  public final inline var collideWithBodies: Boolean
    @JvmName("collideWithBodiesProperty")
    get() = isCollideWithBodiesEnabled()
    @JvmName("collideWithBodiesProperty")
    set(`value`) {
      setCollideWithBodies(value)
    }

  /**
   * If `true`, the query will take [Area2D]s into account.
   */
  public final inline var collideWithAreas: Boolean
    @JvmName("collideWithAreasProperty")
    get() = isCollideWithAreasEnabled()
    @JvmName("collideWithAreasProperty")
    set(`value`) {
      setCollideWithAreas(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_PHYSICSSHAPEQUERYPARAMETERS2D_INDEX, scriptIndex)
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
  public final fun motionMutate(block: Vector2.() -> Unit): Vector2 = motion.apply{
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
  public final fun transformMutate(block: Transform2D.() -> Unit): Transform2D = transform.apply{
      block(this)
      transform = this
  }


  public final fun setShape(shape: Resource?): Unit {
    Internals.writeArguments(OBJECT to shape)
    Internals.callMethod(rawPtr, MethodBindings.setShapePtr, NIL)
  }

  public final fun getShape(): Resource? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getShapePtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Resource?)
  }

  public final fun setShapeRid(shape: RID): Unit {
    Internals.writeArguments(_RID to shape)
    Internals.callMethod(rawPtr, MethodBindings.setShapeRidPtr, NIL)
  }

  public final fun getShapeRid(): RID {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getShapeRidPtr, _RID)
    return (Internals.readReturnValue(_RID) as RID)
  }

  public final fun setTransform(transform: Transform2D): Unit {
    Internals.writeArguments(TRANSFORM2D to transform)
    Internals.callMethod(rawPtr, MethodBindings.setTransformPtr, NIL)
  }

  public final fun getTransform(): Transform2D {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTransformPtr, TRANSFORM2D)
    return (Internals.readReturnValue(TRANSFORM2D) as Transform2D)
  }

  public final fun setMotion(motion: Vector2): Unit {
    Internals.writeArguments(VECTOR2 to motion)
    Internals.callMethod(rawPtr, MethodBindings.setMotionPtr, NIL)
  }

  public final fun getMotion(): Vector2 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getMotionPtr, VECTOR2)
    return (Internals.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun setMargin(margin: Float): Unit {
    Internals.writeArguments(DOUBLE to margin.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setMarginPtr, NIL)
  }

  public final fun getMargin(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getMarginPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setCollisionMask(collisionMask: Long): Unit {
    Internals.writeArguments(LONG to collisionMask)
    Internals.callMethod(rawPtr, MethodBindings.setCollisionMaskPtr, NIL)
  }

  public final fun getCollisionMask(): Long {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCollisionMaskPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  public final fun setExclude(exclude: VariantArray<RID>): Unit {
    Internals.writeArguments(ARRAY to exclude)
    Internals.callMethod(rawPtr, MethodBindings.setExcludePtr, NIL)
  }

  public final fun getExclude(): VariantArray<RID> {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getExcludePtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<RID>)
  }

  public final fun setCollideWithBodies(enable: Boolean): Unit {
    Internals.writeArguments(BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setCollideWithBodiesPtr, NIL)
  }

  public final fun isCollideWithBodiesEnabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isCollideWithBodiesEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setCollideWithAreas(enable: Boolean): Unit {
    Internals.writeArguments(BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setCollideWithAreasPtr, NIL)
  }

  public final fun isCollideWithAreasEnabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isCollideWithAreasEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public companion object

  public object MethodBindings {
    internal val setShapePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsShapeQueryParameters2D", "set_shape", 968641751)

    internal val getShapePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsShapeQueryParameters2D", "get_shape", 121922552)

    internal val setShapeRidPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsShapeQueryParameters2D", "set_shape_rid", 2722037293)

    internal val getShapeRidPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsShapeQueryParameters2D", "get_shape_rid", 2944877500)

    internal val setTransformPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsShapeQueryParameters2D", "set_transform", 2761652528)

    internal val getTransformPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsShapeQueryParameters2D", "get_transform", 3814499831)

    internal val setMotionPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsShapeQueryParameters2D", "set_motion", 743155724)

    internal val getMotionPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsShapeQueryParameters2D", "get_motion", 3341600327)

    internal val setMarginPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsShapeQueryParameters2D", "set_margin", 373806689)

    internal val getMarginPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsShapeQueryParameters2D", "get_margin", 1740695150)

    internal val setCollisionMaskPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsShapeQueryParameters2D", "set_collision_mask", 1286410249)

    internal val getCollisionMaskPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsShapeQueryParameters2D", "get_collision_mask", 3905245786)

    internal val setExcludePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsShapeQueryParameters2D", "set_exclude", 381264803)

    internal val getExcludePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsShapeQueryParameters2D", "get_exclude", 3995934104)

    internal val setCollideWithBodiesPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsShapeQueryParameters2D", "set_collide_with_bodies", 2586408642)

    internal val isCollideWithBodiesEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsShapeQueryParameters2D", "is_collide_with_bodies_enabled", 36873697)

    internal val setCollideWithAreasPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsShapeQueryParameters2D", "set_collide_with_areas", 2586408642)

    internal val isCollideWithAreasEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsShapeQueryParameters2D", "is_collide_with_areas_enabled", 36873697)
  }
}
