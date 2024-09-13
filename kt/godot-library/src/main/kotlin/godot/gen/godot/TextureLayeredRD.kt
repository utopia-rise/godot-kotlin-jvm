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
import kotlin.jvm.JvmName

/**
 * Base class for [Texture2DArrayRD], [TextureCubemapRD] and [TextureCubemapArrayRD]. Cannot be used
 * directly, but contains all the functions necessary for accessing the derived resource types.
 */
@GodotBaseType
public open class TextureLayeredRD internal constructor() : TextureLayered() {
  /**
   * The RID of the texture object created on the [RenderingDevice].
   */
  public final inline var textureRdRid: RID
    @JvmName("textureRdRidProperty")
    get() = getTextureRdRid()
    @JvmName("textureRdRidProperty")
    set(`value`) {
      setTextureRdRid(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_TEXTURELAYEREDRD, scriptIndex)
  }

  public final fun setTextureRdRid(textureRdRid: RID): Unit {
    TransferContext.writeArguments(_RID to textureRdRid)
    TransferContext.callMethod(rawPtr, MethodBindings.setTextureRdRidPtr, NIL)
  }

  public final fun getTextureRdRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTextureRdRidPtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  public companion object

  internal object MethodBindings {
    public val setTextureRdRidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureLayeredRD", "set_texture_rd_rid", 2722037293)

    public val getTextureRdRidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureLayeredRD", "get_texture_rd_rid", 2944877500)
  }
}
