// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * This node was replaced by [VisualShaderNodeFrame] and only exists to preserve compatibility. In
 * the [VisualShader] editor it behaves exactly like [VisualShaderNodeFrame].
 */
@GodotBaseType
public open class VisualShaderNodeComment : VisualShaderNodeFrame() {
  /**
   * This property only exists to preserve data authored in earlier versions of Godot. It has
   * currently no function.
   */
  public var description: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDescriptionPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDescriptionPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_VISUALSHADERNODECOMMENT, scriptIndex)
  }

  public companion object

  internal object MethodBindings {
    public val setDescriptionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeComment", "set_description")

    public val getDescriptionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeComment", "get_description")
  }
}
