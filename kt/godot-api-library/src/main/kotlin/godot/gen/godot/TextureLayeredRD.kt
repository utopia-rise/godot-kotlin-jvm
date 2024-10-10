// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.RID
import godot.core.VariantParser.NIL
import godot.core.VariantParser._RID
import godot.util.Internals
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
    Internals.callConstructor(this, ENGINE_CLASS_TEXTURELAYEREDRD_INDEX, scriptIndex)
  }

  public final fun setTextureRdRid(textureRdRid: RID): Unit {
    Internals.writeArguments(_RID to textureRdRid)
    Internals.callMethod(rawPtr, MethodBindings.setTextureRdRidPtr, NIL)
  }

  public final fun getTextureRdRid(): RID {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTextureRdRidPtr, _RID)
    return (Internals.readReturnValue(_RID) as RID)
  }

  public companion object

  internal object MethodBindings {
    public val setTextureRdRidPtr: VoidPtr =
        Internals.getMethodBindPtr("TextureLayeredRD", "set_texture_rd_rid", 2722037293)

    public val getTextureRdRidPtr: VoidPtr =
        Internals.getMethodBindPtr("TextureLayeredRD", "get_texture_rd_rid", 2944877500)
  }
}
