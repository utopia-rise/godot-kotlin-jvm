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
import godot.core.VariantParser.STRING
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Object for storing the query persistence result data when calling
 * [OpenXRSpatialEntityExtension.querySnapshot].
 */
@GodotBaseType
public open class OpenXRSpatialComponentPersistenceList : OpenXRSpatialComponentData() {
  public override fun new(scriptPtr: VoidPtr): Unit {
    createNativeObject(877, scriptPtr)
  }

  /**
   * Returns the persistent uuid for the entity at this [index].
   */
  public final fun getPersistentUuid(index: Long): String {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(ptr, MethodBindings.getPersistentUuidPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns the persistent state (`XrSpatialPersistenceStateEXT`) for the entity at this [index].
   */
  public final fun getPersistentState(index: Long): Long {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(ptr, MethodBindings.getPersistentStatePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  public companion object

  public object MethodBindings {
    internal val getPersistentUuidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRSpatialComponentPersistenceList", "get_persistent_uuid", 844755477)

    internal val getPersistentStatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRSpatialComponentPersistenceList", "get_persistent_state", 923996154)
  }
}
