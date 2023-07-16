// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.RID
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * Provides parameters for [godot.PhysicsDirectSpaceState3D.intersectPoint].
 *
 * By changing various properties of this object, such as the point position, you can configure the parameters for [godot.PhysicsDirectSpaceState3D.intersectPoint].
 */
@GodotBaseType
public open class PhysicsPointQueryParameters3D : RefCounted() {
  /**
   * The position being queried for, in global coordinates.
   */
  public var position: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSPOINTQUERYPARAMETERS3D_GET_POSITION, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSPOINTQUERYPARAMETERS3D_SET_POSITION, NIL)
    }

  /**
   * The physics layers the query will detect (as a bitmask). By default, all collision layers are detected. See [godot.Collision layers and masks]($DOCS_URL/tutorials/physics/physics_introduction.html#collision-layers-and-masks) in the documentation for more information.
   */
  public var collisionMask: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSPOINTQUERYPARAMETERS3D_GET_COLLISION_MASK, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSPOINTQUERYPARAMETERS3D_SET_COLLISION_MASK, NIL)
    }

  /**
   * The list of object [RID]s that will be excluded from collisions. Use [godot.CollisionObject3D.getRid] to get the [RID] associated with a [godot.CollisionObject3D]-derived node.
   */
  public var exclude: VariantArray<RID>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSPOINTQUERYPARAMETERS3D_GET_EXCLUDE, ARRAY)
      return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<RID>)
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSPOINTQUERYPARAMETERS3D_SET_EXCLUDE, NIL)
    }

  /**
   * If `true`, the query will take [godot.PhysicsBody3D]s into account.
   */
  public var collideWithBodies: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSPOINTQUERYPARAMETERS3D_IS_COLLIDE_WITH_BODIES_ENABLED,
          BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSPOINTQUERYPARAMETERS3D_SET_COLLIDE_WITH_BODIES, NIL)
    }

  /**
   * If `true`, the query will take [godot.Area3D]s into account.
   */
  public var collideWithAreas: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSPOINTQUERYPARAMETERS3D_IS_COLLIDE_WITH_AREAS_ENABLED,
          BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSPOINTQUERYPARAMETERS3D_SET_COLLIDE_WITH_AREAS, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_PHYSICSPOINTQUERYPARAMETERS3D, scriptIndex)
    return true
  }

  public companion object
}
