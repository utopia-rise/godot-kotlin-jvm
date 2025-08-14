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
import godot.core.MethodStringName0
import godot.core.MethodStringName1
import godot.core.RID
import godot.core.VariantParser.NIL
import godot.core.VariantParser._RID
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmField
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
    createNativeObject(675, scriptIndex)
  }

  public final fun setTextureRdRid(textureRdRid: RID): Unit {
    TransferContext.writeArguments(_RID to textureRdRid)
    TransferContext.callMethod(ptr, MethodBindings.setTextureRdRidPtr, NIL)
  }

  public final fun getTextureRdRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTextureRdRidPtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  public companion object {
    @JvmField
    public val setTextureRdRidName: MethodStringName1<TextureLayeredRD, Unit, RID> =
        MethodStringName1<TextureLayeredRD, Unit, RID>("set_texture_rd_rid")

    @JvmField
    public val getTextureRdRidName: MethodStringName0<TextureLayeredRD, RID> =
        MethodStringName0<TextureLayeredRD, RID>("get_texture_rd_rid")
  }

  public object MethodBindings {
    internal val setTextureRdRidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureLayeredRD", "set_texture_rd_rid", 2722037293)

    internal val getTextureRdRidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureLayeredRD", "get_texture_rd_rid", 2944877500)
  }
}
