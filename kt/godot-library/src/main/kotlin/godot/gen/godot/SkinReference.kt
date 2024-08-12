// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.RID
import godot.core.TypeManager
import godot.core.VariantType.OBJECT
import godot.core.VariantType._RID
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

@GodotBaseType
public open class SkinReference internal constructor() : RefCounted() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SKINREFERENCE, scriptIndex)
    return true
  }

  public fun getSkeleton(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSkeletonPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public fun getSkin(): Skin? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSkinPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Skin?)
  }

  public companion object

  internal object MethodBindings {
    public val getSkeletonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkinReference", "get_skeleton")

    public val getSkinPtr: VoidPtr = TypeManager.getMethodBindPtr("SkinReference", "get_skin")
  }
}
