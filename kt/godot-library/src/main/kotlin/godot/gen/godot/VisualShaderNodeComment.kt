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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress

/**
 * A comment node to be placed on visual shader graph.
 *
 * A resizable rectangular area with changeable [title] and [description] used for better organizing of other visual shader nodes.
 */
@GodotBaseType
public open class VisualShaderNodeComment : VisualShaderNodeResizableBase() {
  /**
   * A title of the node.
   */
  public var title: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTitlePtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTitlePtr, NIL)
    }

  /**
   * An additional description which placed below the title.
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

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISUALSHADERNODECOMMENT, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setTitlePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeComment", "set_title")

    public val getTitlePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeComment", "get_title")

    public val setDescriptionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeComment", "set_description")

    public val getDescriptionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeComment", "get_description")
  }
}
