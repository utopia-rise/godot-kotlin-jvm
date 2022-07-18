// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.RID
import godot.core.TransferContext
import godot.core.VariantType.OBJECT
import godot.core.VariantType._RID
import kotlin.Suppress
import kotlin.Unit

/**
 *
 */
@GodotBaseType
public open class SkinReference internal constructor() : RefCounted() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_SKINREFERENCE)
  }

  /**
   *
   */
  public fun getSkeleton(): RID {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SKINREFERENCE_GET_SKELETON, _RID.ordinal)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   *
   */
  public fun getSkin(): Skin? {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SKINREFERENCE_GET_SKIN, OBJECT.ordinal)
    return TransferContext.readReturnValue(OBJECT, true) as Skin?
  }

  public companion object
}
