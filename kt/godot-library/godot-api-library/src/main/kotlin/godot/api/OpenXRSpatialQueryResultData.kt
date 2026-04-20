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
import godot.core.VariantParser.LONG
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Object for storing the main query result data when calling
 * [OpenXRSpatialEntityExtension.querySnapshot]. This must always be the first component requested.
 */
@GodotBaseType
public open class OpenXRSpatialQueryResultData : OpenXRSpatialComponentData() {
  public override fun new(scriptPtr: VoidPtr): Unit {
    createNativeObject(485, scriptPtr)
  }

  /**
   * Returns the number of entities that were retrieved.
   */
  public final fun getCapacity(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCapacityPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the entity id (`XrSpatialEntityIdEXT`) for the entity at this [index].
   */
  public final fun getEntityId(index: Long): Long {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(ptr, MethodBindings.getEntityIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the entity state for the entity at this [index].
   */
  public final fun getEntityState(index: Long): OpenXRSpatialEntityTracker.EntityTrackingState {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(ptr, MethodBindings.getEntityStatePtr, LONG)
    return OpenXRSpatialEntityTracker.EntityTrackingState.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public companion object

  public object MethodBindings {
    internal val getCapacityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRSpatialQueryResultData", "get_capacity", 3905245786)

    internal val getEntityIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRSpatialQueryResultData", "get_entity_id", 923996154)

    internal val getEntityStatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRSpatialQueryResultData", "get_entity_state", 1411962015)
  }
}
