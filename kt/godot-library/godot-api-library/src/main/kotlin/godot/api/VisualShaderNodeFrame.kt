// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.Color
import godot.core.PackedInt32Array
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.COLOR
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.PACKED_INT_32_ARRAY
import godot.core.VariantParser.STRING
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * A rectangular frame that can be used to group visual shader nodes together to improve
 * organization.
 *
 * Nodes attached to the frame will move with it when it is dragged and it can automatically resize
 * to enclose all attached nodes.
 *
 * Its title, description and color can be customized.
 */
@GodotBaseType
public open class VisualShaderNodeFrame : VisualShaderNodeResizableBase() {
  /**
   * The title of the node.
   */
  public final inline var title: String
    @JvmName("titleProperty")
    get() = getTitle()
    @JvmName("titleProperty")
    set(`value`) {
      setTitle(value)
    }

  /**
   * If `true`, the frame will be tinted with the color specified in [tintColor].
   */
  public final inline var tintColorEnabled: Boolean
    @JvmName("tintColorEnabledProperty")
    get() = isTintColorEnabled()
    @JvmName("tintColorEnabledProperty")
    set(`value`) {
      setTintColorEnabled(value)
    }

  /**
   * The color of the frame when [tintColorEnabled] is `true`.
   *
   * **Warning:**
   * Be careful when trying to modify a local
   * [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this
   * getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again
   * afterward.
   */
  @CoreTypeLocalCopy
  public final inline var tintColor: Color
    @JvmName("tintColorProperty")
    get() = getTintColor()
    @JvmName("tintColorProperty")
    set(`value`) {
      setTintColor(value)
    }

  /**
   * If `true`, the frame will automatically resize to enclose all attached nodes.
   */
  public final inline var autoshrink: Boolean
    @JvmName("autoshrinkProperty")
    get() = isAutoshrinkEnabled()
    @JvmName("autoshrinkProperty")
    set(`value`) {
      setAutoshrinkEnabled(value)
    }

  /**
   * The list of nodes attached to the frame.
   *
   * **Warning:**
   * Be careful when trying to modify a local
   * [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this
   * getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again
   * afterward.
   */
  @CoreTypeLocalCopy
  public final inline var attachedNodes: PackedInt32Array
    @JvmName("attachedNodesProperty")
    get() = getAttachedNodes()
    @JvmName("attachedNodesProperty")
    set(`value`) {
      setAttachedNodes(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(770, scriptIndex)
  }

  /**
   * This is a helper function for [tintColor] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = visualshadernodeframe.tintColor
   * //Your changes
   * visualshadernodeframe.tintColor = myCoreType
   * ``````
   *
   * The color of the frame when [tintColorEnabled] is `true`.
   */
  @CoreTypeHelper
  public final fun tintColorMutate(block: Color.() -> Unit): Color = tintColor.apply {
     block(this)
     tintColor = this
  }

  /**
   * This is a helper function for [attachedNodes] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = visualshadernodeframe.attachedNodes
   * //Your changes
   * visualshadernodeframe.attachedNodes = myCoreType
   * ``````
   *
   * The list of nodes attached to the frame.
   */
  @CoreTypeHelper
  public final fun attachedNodesMutate(block: PackedInt32Array.() -> Unit): PackedInt32Array =
      attachedNodes.apply {
     block(this)
     attachedNodes = this
  }

  /**
   * This is a helper function for [attachedNodes] to make dealing with local copies easier.
   * Allow to directly modify each element of the local copy of the property and assign it back to
   * the Object.
   *
   * The list of nodes attached to the frame.
   */
  @CoreTypeHelper
  public final fun attachedNodesMutateEach(block: (index: Int, `value`: Int) -> Unit):
      PackedInt32Array = attachedNodes.apply {
     this.forEachIndexed { index, value ->
         block(index, value)
         this[index] = value
     }
     attachedNodes = this
  }

  public final fun setTitle(title: String): Unit {
    TransferContext.writeArguments(STRING to title)
    TransferContext.callMethod(ptr, MethodBindings.setTitlePtr, NIL)
  }

  public final fun getTitle(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTitlePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  public final fun setTintColorEnabled(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setTintColorEnabledPtr, NIL)
  }

  public final fun isTintColorEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isTintColorEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setTintColor(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(ptr, MethodBindings.setTintColorPtr, NIL)
  }

  public final fun getTintColor(): Color {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTintColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  public final fun setAutoshrinkEnabled(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setAutoshrinkEnabledPtr, NIL)
  }

  public final fun isAutoshrinkEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isAutoshrinkEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Adds a node to the list of nodes attached to the frame. Should not be called directly, use the
   * [VisualShader.attachNodeToFrame] method instead.
   */
  public final fun addAttachedNode(node: Int): Unit {
    TransferContext.writeArguments(LONG to node.toLong())
    TransferContext.callMethod(ptr, MethodBindings.addAttachedNodePtr, NIL)
  }

  /**
   * Removes a node from the list of nodes attached to the frame. Should not be called directly, use
   * the [VisualShader.detachNodeFromFrame] method instead.
   */
  public final fun removeAttachedNode(node: Int): Unit {
    TransferContext.writeArguments(LONG to node.toLong())
    TransferContext.callMethod(ptr, MethodBindings.removeAttachedNodePtr, NIL)
  }

  public final fun setAttachedNodes(attachedNodes: PackedInt32Array): Unit {
    TransferContext.writeArguments(PACKED_INT_32_ARRAY to attachedNodes)
    TransferContext.callMethod(ptr, MethodBindings.setAttachedNodesPtr, NIL)
  }

  public final fun getAttachedNodes(): PackedInt32Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAttachedNodesPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY) as PackedInt32Array)
  }

  public companion object

  public object MethodBindings {
    internal val setTitlePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeFrame", "set_title", 83702148)

    internal val getTitlePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeFrame", "get_title", 201670096)

    internal val setTintColorEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeFrame", "set_tint_color_enabled", 2586408642)

    internal val isTintColorEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeFrame", "is_tint_color_enabled", 36873697)

    internal val setTintColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeFrame", "set_tint_color", 2920490490)

    internal val getTintColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeFrame", "get_tint_color", 3444240500)

    internal val setAutoshrinkEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeFrame", "set_autoshrink_enabled", 2586408642)

    internal val isAutoshrinkEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeFrame", "is_autoshrink_enabled", 36873697)

    internal val addAttachedNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeFrame", "add_attached_node", 1286410249)

    internal val removeAttachedNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeFrame", "remove_attached_node", 1286410249)

    internal val setAttachedNodesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeFrame", "set_attached_nodes", 3614634198)

    internal val getAttachedNodesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeFrame", "get_attached_nodes", 1930428628)
  }
}
