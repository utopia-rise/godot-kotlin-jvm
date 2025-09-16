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
 * Performs a lookup operation on the provided texture, with support for multiple texture sources to choose from.
 */
@GodotBaseType
public open class VisualShaderNodeTexture3D : VisualShaderNodeSample3D() {
  /**
   * A source texture. Used if [VisualShaderNodeSample3D.source] is set to [VisualShaderNodeSample3D.SOURCE_TEXTURE].
   */
  public final inline var texture: Texture3D?
    @JvmName("textureProperty")
    get() = getTexture()
    @JvmName("textureProperty")
    set(`value`) {
      setTexture(value)
    }

  override fun new(scriptIndex: Int) {
    createNativeObject(801, scriptIndex)
  }

  public final fun setTexture(`value`: Texture3D?) {
    TransferContext.writeArguments(OBJECT to value)
    TransferContext.callMethod(ptr, MethodBindings.setTexturePtr, NIL)
  }

  public final fun getTexture(): Texture3D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTexturePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Texture3D?)
  }

  public companion object

  public object MethodBindings {
    internal val setTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeTexture3D", "set_texture", 1_188_404_210)

    internal val getTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeTexture3D", "get_texture", 373_985_333)
  }
}
