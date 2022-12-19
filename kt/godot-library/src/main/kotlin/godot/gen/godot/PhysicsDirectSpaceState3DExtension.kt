// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.RID
import godot.core.Vector3
import kotlin.Boolean
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.Suppress

/**
 *
 */
@GodotBaseType
public open class PhysicsDirectSpaceState3DExtension : PhysicsDirectSpaceState3D() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_PHYSICSDIRECTSPACESTATE3DEXTENSION, scriptIndex)
    return true
  }

  /**
   *
   */
  public open fun _getClosestPointToObjectVolume(_object: RID, point: Vector3): Vector3 {
    throw NotImplementedError("_get_closest_point_to_object_volume is not implemented for PhysicsDirectSpaceState3DExtension")
  }

  public companion object
}
