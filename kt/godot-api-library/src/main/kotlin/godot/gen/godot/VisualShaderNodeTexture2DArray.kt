// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_VISUALSHADERNODETEXTURE2DARRAY_INDEX: Int = 695

/**
 * Translated to `uniform sampler2DArray` in the shader language.
 */
@GodotBaseType
public open class VisualShaderNodeTexture2DArray : VisualShaderNodeSample3D() {
  /**
   * A source texture array. Used if [VisualShaderNodeSample3D.source] is set to
   * [VisualShaderNodeSample3D.SOURCE_TEXTURE].
   */
  public final inline var textureArray: Texture2DArray?
    @JvmName("textureArrayProperty")
    get() = getTextureArray()
    @JvmName("textureArrayProperty")
    set(`value`) {
      setTextureArray(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINE_CLASS_VISUALSHADERNODETEXTURE2DARRAY_INDEX, scriptIndex)
  }

  public final fun setTextureArray(`value`: Texture2DArray?): Unit {
    TransferContext.writeArguments(OBJECT to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setTextureArrayPtr, NIL)
  }

  public final fun getTextureArray(): Texture2DArray? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTextureArrayPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Texture2DArray?)
  }

  public companion object

  internal object MethodBindings {
    public val setTextureArrayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeTexture2DArray", "set_texture_array", 2206200446)

    public val getTextureArrayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeTexture2DArray", "get_texture_array", 146117123)
  }
}
