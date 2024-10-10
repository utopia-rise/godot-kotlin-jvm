// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.NODE_PATH
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_VISIBLEONSCREENENABLER2D_INDEX: Int = 626

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
  public final inline var enableMode: EnableMode
    @JvmName("enableModeProperty")
    get() = getEnableMode()
    @JvmName("enableModeProperty")
    set(`value`) {
      setEnableMode(value)
    }

  /**
   * The path to the target node, relative to the [VisibleOnScreenEnabler2D]. The target node is
   * cached; it's only assigned when setting this property (if the [VisibleOnScreenEnabler2D] is inside
   * the scene tree) and every time the [VisibleOnScreenEnabler2D] enters the scene tree. If the path
   * is empty, no node will be affected. If the path is invalid, an error is also generated.
   */
  public final inline var enableNodePath: NodePath
    @JvmName("enableNodePathProperty")
    get() = getEnableNodePath()
    @JvmName("enableNodePathProperty")
    set(`value`) {
      setEnableNodePath(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_VISIBLEONSCREENENABLER2D_INDEX, scriptIndex)
  }

  public final fun setEnableMode(mode: EnableMode): Unit {
    Internals.writeArguments(LONG to mode.id)
    Internals.callMethod(rawPtr, MethodBindings.setEnableModePtr, NIL)
  }

  public final fun getEnableMode(): EnableMode {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getEnableModePtr, LONG)
    return VisibleOnScreenEnabler2D.EnableMode.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setEnableNodePath(path: NodePath): Unit {
    Internals.writeArguments(NODE_PATH to path)
    Internals.callMethod(rawPtr, MethodBindings.setEnableNodePathPtr, NIL)
  }

  public final fun getEnableNodePath(): NodePath {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getEnableNodePathPtr, NODE_PATH)
    return (Internals.readReturnValue(NODE_PATH) as NodePath)
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
        Internals.getMethodBindPtr("VisibleOnScreenEnabler2D", "set_enable_mode", 2961788752)

    public val getEnableModePtr: VoidPtr =
        Internals.getMethodBindPtr("VisibleOnScreenEnabler2D", "get_enable_mode", 2650445576)

    public val setEnableNodePathPtr: VoidPtr =
        Internals.getMethodBindPtr("VisibleOnScreenEnabler2D", "set_enable_node_path", 1348162250)

    public val getEnableNodePathPtr: VoidPtr =
        Internals.getMethodBindPtr("VisibleOnScreenEnabler2D", "get_enable_node_path", 277076166)
  }
}
