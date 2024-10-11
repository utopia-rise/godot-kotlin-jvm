// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_VISUALSHADERNODECURVETEXTURE_INDEX: Int = 720

/**
 * Comes with a built-in editor for texture's curves.
 */
@GodotBaseType
public open class VisualShaderNodeCurveTexture : VisualShaderNodeResizableBase() {
  /**
   * The source texture.
   */
  public final inline var texture: CurveTexture?
    @JvmName("textureProperty")
    get() = getTexture()
    @JvmName("textureProperty")
    set(`value`) {
      setTexture(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_VISUALSHADERNODECURVETEXTURE_INDEX, scriptIndex)
  }

  public final fun setTexture(texture: CurveTexture?): Unit {
    Internals.writeArguments(OBJECT to texture)
    Internals.callMethod(rawPtr, MethodBindings.setTexturePtr, NIL)
  }

  public final fun getTexture(): CurveTexture? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTexturePtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as CurveTexture?)
  }

  public companion object

  public object MethodBindings {
    internal val setTexturePtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeCurveTexture", "set_texture", 181872837)

    internal val getTexturePtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeCurveTexture", "get_texture", 2800800579)
  }
}
