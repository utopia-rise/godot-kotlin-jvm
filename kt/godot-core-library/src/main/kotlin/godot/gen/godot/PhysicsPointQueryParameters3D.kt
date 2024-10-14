// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.common.interop.VoidPtr
import godot.core.RID
import godot.internal.reflection.TypeManager
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.VECTOR3
import godot.core.Vector3
import godot.internal.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * By changing various properties of this object, such as the point position, you can configure the
 * parameters for [PhysicsDirectSpaceState3D.intersectPoint].
 */
@GodotBaseType
public open class PhysicsPointQueryParameters3D : RefCounted() {
  /**
   * The position being queried for, in global coordinates.
   */
  @CoreTypeLocalCopy
  public final inline var position: Vector3
    @JvmName("positionProperty")
    get() = getPosition()
    @JvmName("positionProperty")
    set(`value`) {
      setPosition(value)
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
   * The list of object [RID]s that will be excluded from collisions. Use [CollisionObject3D.getRid]
   * to get the [RID] associated with a [CollisionObject3D]-derived node.
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
   * If `true`, the query will take [PhysicsBody3D]s into account.
   */
  public final inline var collideWithBodies: Boolean
    @JvmName("collideWithBodiesProperty")
    get() = isCollideWithBodiesEnabled()
    @JvmName("collideWithBodiesProperty")
    set(`value`) {
      setCollideWithBodies(value)
    }

  /**
   * If `true`, the query will take [Area3D]s into account.
   */
  public final inline var collideWithAreas: Boolean
    @JvmName("collideWithAreasProperty")
    get() = isCollideWithAreasEnabled()
    @JvmName("collideWithAreasProperty")
    set(`value`) {
      setCollideWithAreas(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_PHYSICSPOINTQUERYPARAMETERS3D, scriptIndex)
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
   * val myCoreType = physicspointqueryparameters3d.position
   * //Your changes
   * physicspointqueryparameters3d.position = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun positionMutate(block: Vector3.() -> Unit): Vector3 = position.apply{
      block(this)
      position = this
  }


  public final fun setPosition(position: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to position)
    TransferContext.callMethod(ptr, MethodBindings.setPositionPtr, NIL)
  }

  public final fun getPosition(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPositionPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setCollisionMask(collisionMask: Long): Unit {
    TransferContext.writeArguments(LONG to collisionMask)
    TransferContext.callMethod(ptr, MethodBindings.setCollisionMaskPtr, NIL)
  }

  public final fun getCollisionMask(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCollisionMaskPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setExclude(exclude: VariantArray<RID>): Unit {
    TransferContext.writeArguments(ARRAY to exclude)
    TransferContext.callMethod(ptr, MethodBindings.setExcludePtr, NIL)
  }

  public final fun getExclude(): VariantArray<RID> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getExcludePtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<RID>)
  }

  public final fun setCollideWithBodies(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setCollideWithBodiesPtr, NIL)
  }

  public final fun isCollideWithBodiesEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isCollideWithBodiesEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setCollideWithAreas(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setCollideWithAreasPtr, NIL)
  }

  public final fun isCollideWithAreasEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isCollideWithAreasEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public companion object

  internal object MethodBindings {
    public val setPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsPointQueryParameters3D", "set_position", 3460891852)

    public val getPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsPointQueryParameters3D", "get_position", 3360562783)

    public val setCollisionMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsPointQueryParameters3D", "set_collision_mask", 1286410249)

    public val getCollisionMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsPointQueryParameters3D", "get_collision_mask", 3905245786)

    public val setExcludePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsPointQueryParameters3D", "set_exclude", 381264803)

    public val getExcludePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsPointQueryParameters3D", "get_exclude", 3995934104)

    public val setCollideWithBodiesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsPointQueryParameters3D", "set_collide_with_bodies", 2586408642)

    public val isCollideWithBodiesEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsPointQueryParameters3D", "is_collide_with_bodies_enabled", 36873697)

    public val setCollideWithAreasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsPointQueryParameters3D", "set_collide_with_areas", 2586408642)

    public val isCollideWithAreasEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsPointQueryParameters3D", "is_collide_with_areas_enabled", 36873697)
  }
}
