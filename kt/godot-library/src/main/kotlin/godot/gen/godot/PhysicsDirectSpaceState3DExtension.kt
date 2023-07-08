// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.RID
import godot.core.VariantType.BOOL
import godot.core.VariantType._RID
import godot.core.Vector3
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.Suppress

/**
 * Provides virtual methods that can be overridden to create custom [godot.PhysicsDirectSpaceState3D] implementations.
 *
 * This class extends [godot.PhysicsDirectSpaceState3D] by providing additional virtual methods that can be overridden. When these methods are overridden, they will be called instead of the internal methods of the physics server.
 *
 * Intended for use with GDExtension to create custom implementations of [godot.PhysicsDirectSpaceState3D].
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

  /**
   *
   */
  public fun isBodyExcludedFromQuery(body: RID): Boolean {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTSPACESTATE3DEXTENSION_IS_BODY_EXCLUDED_FROM_QUERY,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public companion object
}
