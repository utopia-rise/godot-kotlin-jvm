// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Parameters to be sent to a 3D point physics query.
 *
 * This class contains the position and other parameters to be used for [godot.PhysicsDirectSpaceState3D.intersectPoint].
 */
@GodotBaseType
public open class PhysicsPointQueryParameters3D : RefCounted() {
  /**
   * The position being queried for, in global coordinates.
   */
  public var position: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSPOINTQUERYPARAMETERS3D_GET_POSITION, VECTOR3.ordinal)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSPOINTQUERYPARAMETERS3D_SET_POSITION, NIL.ordinal)
    }

  /**
   * The physics layers the query will detect (as a bitmask). By default, all collision layers are detected. See [godot.Collision layers and masks]($DOCS_URL/tutorials/physics/physics_introduction.html#collision-layers-and-masks) in the documentation for more information.
   */
  public var collisionMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSPOINTQUERYPARAMETERS3D_GET_COLLISION_MASK, LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSPOINTQUERYPARAMETERS3D_SET_COLLISION_MASK, NIL.ordinal)
    }

  /**
   * The list of objects or object [RID]s that will be excluded from collisions.
   */
  public var exclude: VariantArray<Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSPOINTQUERYPARAMETERS3D_GET_EXCLUDE, ARRAY.ordinal)
      return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSPOINTQUERYPARAMETERS3D_SET_EXCLUDE, NIL.ordinal)
    }

  /**
   * If `true`, the query will take [godot.PhysicsBody3D]s into account.
   */
  public var collideWithBodies: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSPOINTQUERYPARAMETERS3D_IS_COLLIDE_WITH_BODIES_ENABLED,
          BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSPOINTQUERYPARAMETERS3D_SET_COLLIDE_WITH_BODIES,
          NIL.ordinal)
    }

  /**
   * If `true`, the query will take [godot.Area3D]s into account.
   */
  public var collideWithAreas: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSPOINTQUERYPARAMETERS3D_IS_COLLIDE_WITH_AREAS_ENABLED,
          BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICSPOINTQUERYPARAMETERS3D_SET_COLLIDE_WITH_AREAS,
          NIL.ordinal)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_PHYSICSPOINTQUERYPARAMETERS3D)
  }

  public companion object
}
