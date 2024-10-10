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
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.VECTOR2
import godot.core.Vector2
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

private const val ENGINE_CLASS_PHYSICSRAYQUERYPARAMETERS2D_INDEX: Int = 424

/**
 * By changing various properties of this object, such as the ray position, you can configure the
 * parameters for [PhysicsDirectSpaceState2D.intersectRay].
 */
@GodotBaseType
public open class PhysicsRayQueryParameters2D : RefCounted() {
  /**
   * The starting point of the ray being queried for, in global coordinates.
   */
  @CoreTypeLocalCopy
  public final inline var from: Vector2
    @JvmName("fromProperty")
    get() = getFrom()
    @JvmName("fromProperty")
    set(`value`) {
      setFrom(value)
    }

  /**
   * The ending point of the ray being queried for, in global coordinates.
   */
  @CoreTypeLocalCopy
  public final inline var to: Vector2
    @JvmName("toProperty")
    get() = getTo()
    @JvmName("toProperty")
    set(`value`) {
      setTo(value)
    }

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

  /**
   * If `true`, the query will detect a hit when starting inside shapes. In this case the collision
   * normal will be `Vector2(0, 0)`. Does not affect concave polygon shapes.
   */
  public final inline var hitFromInside: Boolean
    @JvmName("hitFromInsideProperty")
    get() = isHitFromInsideEnabled()
    @JvmName("hitFromInsideProperty")
    set(`value`) {
      setHitFromInside(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_PHYSICSRAYQUERYPARAMETERS2D_INDEX, scriptIndex)
  }

  /**
   * The starting point of the ray being queried for, in global coordinates.
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
   * val myCoreType = physicsrayqueryparameters2d.from
   * //Your changes
   * physicsrayqueryparameters2d.from = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun fromMutate(block: Vector2.() -> Unit): Vector2 = from.apply{
      block(this)
      from = this
  }


  /**
   * The ending point of the ray being queried for, in global coordinates.
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
   * val myCoreType = physicsrayqueryparameters2d.to
   * //Your changes
   * physicsrayqueryparameters2d.to = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun toMutate(block: Vector2.() -> Unit): Vector2 = to.apply{
      block(this)
      to = this
  }


  public final fun setFrom(from: Vector2): Unit {
    Internals.writeArguments(VECTOR2 to from)
    Internals.callMethod(rawPtr, MethodBindings.setFromPtr, NIL)
  }

  public final fun getFrom(): Vector2 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getFromPtr, VECTOR2)
    return (Internals.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun setTo(to: Vector2): Unit {
    Internals.writeArguments(VECTOR2 to to)
    Internals.callMethod(rawPtr, MethodBindings.setToPtr, NIL)
  }

  public final fun getTo(): Vector2 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getToPtr, VECTOR2)
    return (Internals.readReturnValue(VECTOR2) as Vector2)
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

  public final fun setHitFromInside(enable: Boolean): Unit {
    Internals.writeArguments(BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setHitFromInsidePtr, NIL)
  }

  public final fun isHitFromInsideEnabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isHitFromInsideEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public companion object {
    /**
     * Returns a new, pre-configured [PhysicsRayQueryParameters2D] object. Use it to quickly create
     * query parameters using the most common options.
     * [codeblock]
     * var query = PhysicsRayQueryParameters2D.create(global_position, global_position + Vector2(0,
     * 100))
     * var collision = get_world_2d().direct_space_state.intersect_ray(query)
     * [/codeblock]
     */
    @JvmOverloads
    public final fun create(
      from: Vector2,
      to: Vector2,
      collisionMask: Long = 4294967295,
      exclude: VariantArray<RID> = godot.core.variantArrayOf(),
    ): PhysicsRayQueryParameters2D? {
      Internals.writeArguments(VECTOR2 to from, VECTOR2 to to, LONG to collisionMask, ARRAY to exclude)
      Internals.callMethod(0, MethodBindings.createPtr, OBJECT)
      return (Internals.readReturnValue(OBJECT) as PhysicsRayQueryParameters2D?)
    }
  }

  internal object MethodBindings {
    public val createPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsRayQueryParameters2D", "create", 3196569324)

    public val setFromPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsRayQueryParameters2D", "set_from", 743155724)

    public val getFromPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsRayQueryParameters2D", "get_from", 3341600327)

    public val setToPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsRayQueryParameters2D", "set_to", 743155724)

    public val getToPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsRayQueryParameters2D", "get_to", 3341600327)

    public val setCollisionMaskPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsRayQueryParameters2D", "set_collision_mask", 1286410249)

    public val getCollisionMaskPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsRayQueryParameters2D", "get_collision_mask", 3905245786)

    public val setExcludePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsRayQueryParameters2D", "set_exclude", 381264803)

    public val getExcludePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsRayQueryParameters2D", "get_exclude", 3995934104)

    public val setCollideWithBodiesPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsRayQueryParameters2D", "set_collide_with_bodies", 2586408642)

    public val isCollideWithBodiesEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsRayQueryParameters2D", "is_collide_with_bodies_enabled", 36873697)

    public val setCollideWithAreasPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsRayQueryParameters2D", "set_collide_with_areas", 2586408642)

    public val isCollideWithAreasEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsRayQueryParameters2D", "is_collide_with_areas_enabled", 36873697)

    public val setHitFromInsidePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsRayQueryParameters2D", "set_hit_from_inside", 2586408642)

    public val isHitFromInsideEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsRayQueryParameters2D", "is_hit_from_inside_enabled", 36873697)
  }
}
