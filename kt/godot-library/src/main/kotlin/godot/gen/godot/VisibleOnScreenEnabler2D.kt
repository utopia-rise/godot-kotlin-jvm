// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.TypeManager
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * [VisibleOnScreenEnabler2D] contains a rectangular region of 2D space and a target node. The
 * target node will be automatically enabled (via its [Node.processMode] property) when any part of
 * this region becomes visible on the screen, and automatically disabled otherwise. This can for
 * example be used to activate enemies only when the player approaches them.
 * See [VisibleOnScreenNotifier2D] if you only want to be notified when the region is visible on
 * screen.
 * **Note:** [VisibleOnScreenEnabler2D] uses the render culling code to determine whether it's
 * visible on screen, so it won't function unless [CanvasItem.visible] is set to `true`.
 */
@GodotBaseType
public open class VisibleOnScreenEnabler2D : VisibleOnScreenNotifier2D() {
  /**
   * Determines how the target node is enabled. Corresponds to [Node.ProcessMode]. When the node is
   * disabled, it always uses [Node.PROCESS_MODE_DISABLED].
   */
  public var enableMode: EnableMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEnableModePtr, LONG)
      return VisibleOnScreenEnabler2D.EnableMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setEnableModePtr, NIL)
    }

  /**
   * The path to the target node, relative to the [VisibleOnScreenEnabler2D]. The target node is
   * cached; it's only assigned when setting this property (if the [VisibleOnScreenEnabler2D] is inside
   * the scene tree) and every time the [VisibleOnScreenEnabler2D] enters the scene tree. If the path
   * is empty, no node will be affected. If the path is invalid, an error is also generated.
   */
  public var enableNodePath: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEnableNodePathPtr, NODE_PATH)
      return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEnableNodePathPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_VISIBLEONSCREENENABLER2D, scriptIndex)
  }

  public enum class EnableMode(
    id: Long,
  ) {
    /**
     * Corresponds to [Node.PROCESS_MODE_INHERIT].
     */
    ENABLE_MODE_INHERIT(0),
    /**
     * Corresponds to [Node.PROCESS_MODE_ALWAYS].
     */
    ENABLE_MODE_ALWAYS(1),
    /**
     * Corresponds to [Node.PROCESS_MODE_WHEN_PAUSED].
     */
    ENABLE_MODE_WHEN_PAUSED(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): EnableMode = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setEnableModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisibleOnScreenEnabler2D", "set_enable_mode")

    public val getEnableModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisibleOnScreenEnabler2D", "get_enable_mode")

    public val setEnableNodePathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisibleOnScreenEnabler2D", "set_enable_node_path")

    public val getEnableNodePathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisibleOnScreenEnabler2D", "get_enable_node_path")
  }
}
