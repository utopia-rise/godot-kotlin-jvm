// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import kotlin.String
import kotlin.Suppress

/**
 * A node that will attach to a bone.
 * 
 * This node must be the child of a [godot.Skeleton] node. You can then select a bone for this node to attach to. The BoneAttachment node will copy the transform of the selected bone.
 */
@GodotBaseType
open class BoneAttachment : Spatial() {
  /**
   * The name of the attached bone.
   */
  open var boneName: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BONEATTACHMENT_GET_BONE_NAME,
          STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BONEATTACHMENT_SET_BONE_NAME, NIL)
    }

  override fun __new() {
    callConstructor(ENGINECLASS_BONEATTACHMENT)
  }
}
