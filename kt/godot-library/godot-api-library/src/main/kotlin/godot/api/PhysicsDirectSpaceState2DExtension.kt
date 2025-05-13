// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.MethodStringName1
import godot.core.RID
import godot.core.VariantParser.BOOL
import godot.core.VariantParser._RID
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmStatic

/**
 * This class extends [PhysicsDirectSpaceState2D] by providing additional virtual methods that can
 * be overridden. When these methods are overridden, they will be called instead of the internal
 * methods of the physics server.
 *
 * Intended for use with GDExtension to create custom implementations of
 * [PhysicsDirectSpaceState2D].
 */
@GodotBaseType
public open class PhysicsDirectSpaceState2DExtension : PhysicsDirectSpaceState2D() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(466, scriptIndex)
  }

  public final fun isBodyExcludedFromQuery(body: RID): Boolean {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(ptr, MethodBindings.isBodyExcludedFromQueryPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public companion object {
    @JvmStatic
    public val isBodyExcludedFromQueryName:
        MethodStringName1<PhysicsDirectSpaceState2DExtension, Boolean, RID> =
        MethodStringName1<PhysicsDirectSpaceState2DExtension, Boolean, RID>("is_body_excluded_from_query")
  }

  public object MethodBindings {
    internal val isBodyExcludedFromQueryPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectSpaceState2DExtension", "is_body_excluded_from_query", 4155700596)
  }
}
