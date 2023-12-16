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
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

/**
 * Abstract base class for layered texture RD types.
 *
 * Base class for [godot.Texture2DArrayRD], [godot.TextureCubemapRD] and [godot.TextureCubemapArrayRD]. Cannot be used directly, but contains all the functions necessary for accessing the derived resource types.
 */
@GodotBaseType
public open class TextureLayeredRD internal constructor() : TextureLayered() {
  /**
   * The RID of the texture object created on the [godot.RenderingDevice].
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

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_TEXTURELAYEREDRD, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setTextureRdRidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureLayeredRD", "set_texture_rd_rid")

    public val getTextureRdRidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureLayeredRD", "get_texture_rd_rid")
  }
}
