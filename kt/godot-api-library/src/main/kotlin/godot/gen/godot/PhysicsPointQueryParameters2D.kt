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

private const val ENGINE_CLASS_PHYSICSPOINTQUERYPARAMETERS2D_INDEX: Int = 422

/**
 * By changing various properties of this object, such as the point position, you can configure the
 * parameters for [PhysicsDirectSpaceState2D.intersectPoint].
 */
@GodotBaseType
public open class PhysicsPointQueryParameters2D : RefCounted() {
  /**
   * The position being queried for, in global coordinates.
   */
  @CoreTypeLocalCopy
  public final inline var position: Vector2
    @JvmName("positionProperty")
    get() = getPosition()
    @JvmName("positionProperty")
    set(`value`) {
      setPosition(value)
    }

  /**
   * If different from `0`, restricts the query to a specific canvas layer specified by its instance
   * ID. See [Object.getInstanceId].
   * If `0`, restricts the query to the Viewport's default canvas layer.
   */
  public final inline var canvasInstanceId: Long
    @JvmName("canvasInstanceIdProperty")
    get() = getCanvasInstanceId()
    @JvmName("canvasInstanceIdProperty")
    set(`value`) {
      setCanvasInstanceId(value)
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

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_PHYSICSPOINTQUERYPARAMETERS2D_INDEX, scriptIndex)
  }

  /**
   * The position being queried for, in global coordinates.
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
   * val myCoreType = physicspointqueryparameters2d.position
   * //Your changes
   * physicspointqueryparameters2d.position = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun positionMutate(block: Vector2.() -> Unit): Vector2 = position.apply{
      block(this)
      position = this
  }


  public final fun setPosition(position: Vector2): Unit {
    Internals.writeArguments(VECTOR2 to position)
    Internals.callMethod(rawPtr, MethodBindings.setPositionPtr, NIL)
  }

  public final fun getPosition(): Vector2 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getPositionPtr, VECTOR2)
    return (Internals.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun setCanvasInstanceId(canvasInstanceId: Long): Unit {
    Internals.writeArguments(LONG to canvasInstanceId)
    Internals.callMethod(rawPtr, MethodBindings.setCanvasInstanceIdPtr, NIL)
  }

  public final fun getCanvasInstanceId(): Long {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCanvasInstanceIdPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
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

  internal object MethodBindings {
    public val setPositionPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsPointQueryParameters2D", "set_position", 743155724)

    public val getPositionPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsPointQueryParameters2D", "get_position", 3341600327)

    public val setCanvasInstanceIdPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsPointQueryParameters2D", "set_canvas_instance_id", 1286410249)

    public val getCanvasInstanceIdPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsPointQueryParameters2D", "get_canvas_instance_id", 3905245786)

    public val setCollisionMaskPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsPointQueryParameters2D", "set_collision_mask", 1286410249)

    public val getCollisionMaskPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsPointQueryParameters2D", "get_collision_mask", 3905245786)

    public val setExcludePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsPointQueryParameters2D", "set_exclude", 381264803)

    public val getExcludePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsPointQueryParameters2D", "get_exclude", 3995934104)

    public val setCollideWithBodiesPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsPointQueryParameters2D", "set_collide_with_bodies", 2586408642)

    public val isCollideWithBodiesEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsPointQueryParameters2D", "is_collide_with_bodies_enabled", 36873697)

    public val setCollideWithAreasPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsPointQueryParameters2D", "set_collide_with_areas", 2586408642)

    public val isCollideWithAreasEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsPointQueryParameters2D", "is_collide_with_areas_enabled", 36873697)
  }
}
