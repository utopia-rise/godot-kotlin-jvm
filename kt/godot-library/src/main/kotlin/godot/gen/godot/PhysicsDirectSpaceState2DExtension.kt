// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.RID
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType._RID
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

/**
 * This class extends [PhysicsDirectSpaceState2D] by providing additional virtual methods that can
 * be overridden. When these methods are overridden, they will be called instead of the internal
 * methods of the physics server.
 * Intended for use with GDExtension to create custom implementations of
 * [PhysicsDirectSpaceState2D].
 */
@GodotBaseType
public open class PhysicsDirectSpaceState2DExtension : PhysicsDirectSpaceState2D() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_PHYSICSDIRECTSPACESTATE2DEXTENSION, scriptIndex)
    return true
  }

  public fun isBodyExcludedFromQuery(body: RID): Boolean {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr, MethodBindings.isBodyExcludedFromQueryPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public companion object

  internal object MethodBindings {
    public val _intersectRayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectSpaceState2DExtension", "_intersect_ray")

    public val _intersectPointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectSpaceState2DExtension", "_intersect_point")

    public val _intersectShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectSpaceState2DExtension", "_intersect_shape")

    public val _castMotionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectSpaceState2DExtension", "_cast_motion")

    public val _collideShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectSpaceState2DExtension", "_collide_shape")

    public val _restInfoPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectSpaceState2DExtension", "_rest_info")

    public val isBodyExcludedFromQueryPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectSpaceState2DExtension", "is_body_excluded_from_query")
  }
}
