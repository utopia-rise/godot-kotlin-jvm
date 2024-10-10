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
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.COLOR
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.PACKED_INT_32_ARRAY
import godot.core.VariantParser.STRING
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_VISUALSHADERNODEFRAME_INDEX: Int = 733

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
   */
  public final inline var attachedNodes: PackedInt32Array
    @JvmName("attachedNodesProperty")
    get() = getAttachedNodes()
    @JvmName("attachedNodesProperty")
    set(`value`) {
      setAttachedNodes(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_VISUALSHADERNODEFRAME_INDEX, scriptIndex)
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
  public final fun tintColorMutate(block: Color.() -> Unit): Color = tintColor.apply{
      block(this)
      tintColor = this
  }


  public final fun setTitle(title: String): Unit {
    Internals.writeArguments(STRING to title)
    Internals.callMethod(rawPtr, MethodBindings.setTitlePtr, NIL)
  }

  public final fun getTitle(): String {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTitlePtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  public final fun setTintColorEnabled(enable: Boolean): Unit {
    Internals.writeArguments(BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setTintColorEnabledPtr, NIL)
  }

  public final fun isTintColorEnabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isTintColorEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setTintColor(color: Color): Unit {
    Internals.writeArguments(COLOR to color)
    Internals.callMethod(rawPtr, MethodBindings.setTintColorPtr, NIL)
  }

  public final fun getTintColor(): Color {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTintColorPtr, COLOR)
    return (Internals.readReturnValue(COLOR) as Color)
  }

  public final fun setAutoshrinkEnabled(enable: Boolean): Unit {
    Internals.writeArguments(BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setAutoshrinkEnabledPtr, NIL)
  }

  public final fun isAutoshrinkEnabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isAutoshrinkEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Adds a node to the list of nodes attached to the frame. Should not be called directly, use the
   * [VisualShader.attachNodeToFrame] method instead.
   */
  public final fun addAttachedNode(node: Int): Unit {
    Internals.writeArguments(LONG to node.toLong())
    Internals.callMethod(rawPtr, MethodBindings.addAttachedNodePtr, NIL)
  }

  /**
   * Removes a node from the list of nodes attached to the frame. Should not be called directly, use
   * the [VisualShader.detachNodeFromFrame] method instead.
   */
  public final fun removeAttachedNode(node: Int): Unit {
    Internals.writeArguments(LONG to node.toLong())
    Internals.callMethod(rawPtr, MethodBindings.removeAttachedNodePtr, NIL)
  }

  public final fun setAttachedNodes(attachedNodes: PackedInt32Array): Unit {
    Internals.writeArguments(PACKED_INT_32_ARRAY to attachedNodes)
    Internals.callMethod(rawPtr, MethodBindings.setAttachedNodesPtr, NIL)
  }

  public final fun getAttachedNodes(): PackedInt32Array {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getAttachedNodesPtr, PACKED_INT_32_ARRAY)
    return (Internals.readReturnValue(PACKED_INT_32_ARRAY) as PackedInt32Array)
  }

  public companion object

  internal object MethodBindings {
    public val setTitlePtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeFrame", "set_title", 83702148)

    public val getTitlePtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeFrame", "get_title", 201670096)

    public val setTintColorEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeFrame", "set_tint_color_enabled", 2586408642)

    public val isTintColorEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeFrame", "is_tint_color_enabled", 36873697)

    public val setTintColorPtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeFrame", "set_tint_color", 2920490490)

    public val getTintColorPtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeFrame", "get_tint_color", 3444240500)

    public val setAutoshrinkEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeFrame", "set_autoshrink_enabled", 2586408642)

    public val isAutoshrinkEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeFrame", "is_autoshrink_enabled", 36873697)

    public val addAttachedNodePtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeFrame", "add_attached_node", 1286410249)

    public val removeAttachedNodePtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeFrame", "remove_attached_node", 1286410249)

    public val setAttachedNodesPtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeFrame", "set_attached_nodes", 3614634198)

    public val getAttachedNodesPtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeFrame", "get_attached_nodes", 1930428628)
  }
}
