// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

/**
 * Comes with a built-in editor for texture's curves.
 */
@GodotBaseType
public open class VisualShaderNodeCurveXYZTexture : VisualShaderNodeResizableBase() {
  /**
   * The source texture.
   */
  public var texture: CurveXYZTexture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as CurveXYZTexture?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTexturePtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISUALSHADERNODECURVEXYZTEXTURE, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeCurveXYZTexture", "set_texture")

    public val getTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeCurveXYZTexture", "get_texture")
  }
}
