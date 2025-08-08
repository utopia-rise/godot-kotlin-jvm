// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier", "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST", "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT", "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import kotlin.Int
import kotlin.Suppress
import kotlin.jvm.JvmName

/**
 * Translated to `uniform sampler2DArray` in the shader language.
 */
@GodotBaseType
public open class VisualShaderNodeTexture2DArray : VisualShaderNodeSample3D() {
  /**
   * A source texture array. Used if [VisualShaderNodeSample3D.source] is set to [VisualShaderNodeSample3D.SOURCE_TEXTURE].
   */
  public final inline var textureArray: TextureLayered?
    @JvmName("textureArrayProperty")
    get() = getTextureArray()
    @JvmName("textureArrayProperty")
    set(`value`) {
      setTextureArray(value)
    }

  override fun new(scriptIndex: Int) {
    createNativeObject(798, scriptIndex)
  }

  public final fun setTextureArray(`value`: TextureLayered?) {
    TransferContext.writeArguments(OBJECT to value)
    TransferContext.callMethod(ptr, MethodBindings.setTextureArrayPtr, NIL)
  }

  public final fun getTextureArray(): TextureLayered? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTextureArrayPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as TextureLayered?)
  }

  public companion object

  public object MethodBindings {
    internal val setTextureArrayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeTexture2DArray", "set_texture_array", 1_278_366_092)

    internal val getTextureArrayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeTexture2DArray", "get_texture_array", 3_984_243_839)
  }
}
