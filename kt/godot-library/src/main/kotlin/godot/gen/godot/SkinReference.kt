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
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 *
 */
@GodotBaseType
public open class SkinReference internal constructor() : RefCounted() {
  public override fun __new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_SKINREFERENCE, scriptIndex)
  }

  /**
   *
   */
  public fun getSkeleton(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKINREFERENCE_GET_SKELETON, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   *
   */
  public fun getSkin(): Skin? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKINREFERENCE_GET_SKIN, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Skin?
  }

  public companion object
}
