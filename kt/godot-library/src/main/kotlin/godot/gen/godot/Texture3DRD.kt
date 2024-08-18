// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.RID
import godot.core.TypeManager
import godot.core.VariantType.NIL
import godot.core.VariantType._RID
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * This texture class allows you to use a 3D texture created directly on the [RenderingDevice] as a
 * texture for materials, meshes, etc.
 */
@GodotBaseType
public open class Texture3DRD : Texture3D() {
  /**
   * The RID of the texture object created on the [RenderingDevice].
   */
  public var textureRdRid: RID
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTextureRdRidPtr, _RID)
      return (TransferContext.readReturnValue(_RID, false) as RID)
    }
    set(`value`) {
      TransferContext.writeArguments(_RID to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTextureRdRidPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_TEXTURE3DRD, scriptIndex)
  }

  public companion object

  internal object MethodBindings {
    public val setTextureRdRidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Texture3DRD", "set_texture_rd_rid")

    public val getTextureRdRidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Texture3DRD", "get_texture_rd_rid")
  }
}
