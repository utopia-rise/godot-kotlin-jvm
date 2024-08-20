// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.PackedInt32Array
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_INT_32_ARRAY
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * A rectangular frame that can be used to group visual shader nodes together to improve
 * organization.
 * Nodes attached to the frame will move with it when it is dragged and it can automatically resize
 * to enclose all attached nodes.
 * Its title, description and color can be customized.
 */
@GodotBaseType
public open class VisualShaderNodeFrame : VisualShaderNodeResizableBase() {
  /**
   * The title of the node.
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
   * If `true`, the frame will be tinted with the color specified in [tintColor].
   */
  public var tintColorEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isTintColorEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTintColorEnabledPtr, NIL)
    }

  /**
   * The color of the frame when [tintColorEnabled] is `true`.
   */
  @CoreTypeLocalCopy
  public var tintColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTintColorPtr, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTintColorPtr, NIL)
    }

  /**
   * If `true`, the frame will automatically resize to enclose all attached nodes.
   */
  public var autoshrink: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isAutoshrinkEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAutoshrinkEnabledPtr, NIL)
    }

  /**
   * The list of nodes attached to the frame.
   */
  public var attachedNodes: PackedInt32Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAttachedNodesPtr, PACKED_INT_32_ARRAY)
      return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_INT_32_ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAttachedNodesPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISUALSHADERNODEFRAME, scriptIndex)
    return true
  }

  /**
   * The color of the frame when [tintColorEnabled] is `true`.
   *
   * This is a helper function to make dealing with local copies easier. 
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = visualshadernodeframe.tintColor
   * //Your changes
   * visualshadernodeframe.tintColor = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun tintColorMutate(block: Color.() -> Unit): Color = tintColor.apply{
      block(this)
      tintColor = this
  }


  /**
   * Adds a node to the list of nodes attached to the frame. Should not be called directly, use the
   * [VisualShader.attachNodeToFrame] method instead.
   */
  public fun addAttachedNode(node: Int): Unit {
    TransferContext.writeArguments(LONG to node.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addAttachedNodePtr, NIL)
  }

  /**
   * Removes a node from the list of nodes attached to the frame. Should not be called directly, use
   * the [VisualShader.detachNodeFromFrame] method instead.
   */
  public fun removeAttachedNode(node: Int): Unit {
    TransferContext.writeArguments(LONG to node.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeAttachedNodePtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val setTitlePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeFrame", "set_title")

    public val getTitlePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeFrame", "get_title")

    public val setTintColorEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeFrame", "set_tint_color_enabled")

    public val isTintColorEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeFrame", "is_tint_color_enabled")

    public val setTintColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeFrame", "set_tint_color")

    public val getTintColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeFrame", "get_tint_color")

    public val setAutoshrinkEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeFrame", "set_autoshrink_enabled")

    public val isAutoshrinkEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeFrame", "is_autoshrink_enabled")

    public val addAttachedNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeFrame", "add_attached_node")

    public val removeAttachedNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeFrame", "remove_attached_node")

    public val setAttachedNodesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeFrame", "set_attached_nodes")

    public val getAttachedNodesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeFrame", "get_attached_nodes")
  }
}
