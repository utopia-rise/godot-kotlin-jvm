// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.RID
import godot.core.VariantType.NIL
import godot.core.VariantType._RID
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

/**
 * Texture for 3D that is bound to a texture created on the [godot.RenderingDevice].
 *
 * This texture class allows you to use a 3D texture created directly on the [godot.RenderingDevice] as a texture for materials, meshes, etc.
 */
@GodotBaseType
public open class Texture3DRD : Texture3D() {
  /**
   * The RID of the texture object created on the [godot.RenderingDevice].
   */
  public var textureRdRid: RID
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURE3DRD_GET_TEXTURE_RD_RID,
          _RID)
      return (TransferContext.readReturnValue(_RID, false) as RID)
    }
    set(`value`) {
      TransferContext.writeArguments(_RID to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURE3DRD_SET_TEXTURE_RD_RID,
          NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_TEXTURE3DRD, scriptIndex)
    return true
  }

  public companion object
}
