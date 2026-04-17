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
import godot.core.RID
import godot.core.VariantParser.NIL
import godot.core.VariantParser._RID
import kotlin.Suppress
import kotlin.Unit

/**
 * Configuration header for spatial persistence. Pass this to
 * [OpenXRSpatialEntityExtension.createSpatialContext] as the next parameter to create a spatial
 * context with spatial persistence capabilities.
 */
@GodotBaseType
public open class OpenXRSpatialContextPersistenceConfig : OpenXRStructureBase() {
  public override fun new(scriptPtr: VoidPtr): Unit {
    createNativeObject(891, scriptPtr)
  }

  /**
   * Adds a persistence context to this configuration. You must add at least one persistence context
   * to create a valid configuration. You can create a persistence context by calling
   * [OpenXRSpatialAnchorCapability.createPersistenceContext].
   */
  public final fun addPersistenceContext(persistenceContext: RID): Unit {
    TransferContext.writeArguments(_RID to persistenceContext)
    TransferContext.callMethod(ptr, MethodBindings.addPersistenceContextPtr, NIL)
  }

  /**
   * Removes a persistence context.
   */
  public final fun removePersistenceContext(persistenceContext: RID): Unit {
    TransferContext.writeArguments(_RID to persistenceContext)
    TransferContext.callMethod(ptr, MethodBindings.removePersistenceContextPtr, NIL)
  }

  public companion object

  public object MethodBindings {
    internal val addPersistenceContextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRSpatialContextPersistenceConfig", "add_persistence_context", 2722037293)

    internal val removePersistenceContextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRSpatialContextPersistenceConfig", "remove_persistence_context", 2722037293)
  }
}
