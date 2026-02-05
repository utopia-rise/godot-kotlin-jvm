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
import godot.core.VariantParser.LONG
import godot.core.VariantParser._RID
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Object for storing the queries parent result data when calling
 * [OpenXRSpatialEntityExtension.querySnapshot].
 */
@GodotBaseType
public open class OpenXRSpatialComponentParentList : OpenXRSpatialComponentData() {
  public override fun new(scriptPtr: VoidPtr): Unit {
    createNativeObject(886, scriptPtr)
  }

  /**
   * Returns the RID for the parent entity at this [index].
   */
  public final fun getParent(index: Long): RID {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(ptr, MethodBindings.getParentPtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  public companion object

  public object MethodBindings {
    internal val getParentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRSpatialComponentParentList", "get_parent", 495598643)
  }
}
