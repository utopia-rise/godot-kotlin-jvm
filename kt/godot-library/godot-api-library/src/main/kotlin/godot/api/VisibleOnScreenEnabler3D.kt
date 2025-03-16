// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.NodePath
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.NODE_PATH
import godot.core.asCachedNodePath
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * [VisibleOnScreenEnabler3D] contains a box-shaped region of 3D space and a target node. The target
 * node will be automatically enabled (via its [Node.processMode] property) when any part of this
 * region becomes visible on the screen, and automatically disabled otherwise. This can for example be
 * used to activate enemies only when the player approaches them.
 * See [VisibleOnScreenNotifier3D] if you only want to be notified when the region is visible on
 * screen.
 * **Note:** [VisibleOnScreenEnabler3D] uses an approximate heuristic that doesn't take walls and
 * other occlusion into account, unless occlusion culling is used. It also won't function unless
 * [Node3D.visible] is set to `true`.
 */
@GodotBaseType
public open class VisibleOnScreenEnabler3D : VisibleOnScreenNotifier3D() {
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
   * The path to the target node, relative to the [VisibleOnScreenEnabler3D]. The target node is
   * cached; it's only assigned when setting this property (if the [VisibleOnScreenEnabler3D] is inside
   * the scene tree) and every time the [VisibleOnScreenEnabler3D] enters the scene tree. If the path
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
    createNativeObject(725, scriptIndex)
  }

  public final fun setEnableMode(mode: EnableMode): Unit {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(ptr, MethodBindings.setEnableModePtr, NIL)
  }

  public final fun getEnableMode(): EnableMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getEnableModePtr, LONG)
    return VisibleOnScreenEnabler3D.EnableMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setEnableNodePath(path: NodePath): Unit {
    TransferContext.writeArguments(NODE_PATH to path)
    TransferContext.callMethod(ptr, MethodBindings.setEnableNodePathPtr, NIL)
  }

  public final fun getEnableNodePath(): NodePath {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getEnableNodePathPtr, NODE_PATH)
    return (TransferContext.readReturnValue(NODE_PATH) as NodePath)
  }

  public final fun setEnableNodePath(path: String) = setEnableNodePath(path.asCachedNodePath())

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

  public object MethodBindings {
    internal val setEnableModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisibleOnScreenEnabler3D", "set_enable_mode", 320303646)

    internal val getEnableModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisibleOnScreenEnabler3D", "get_enable_mode", 3352990031)

    internal val setEnableNodePathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisibleOnScreenEnabler3D", "set_enable_node_path", 1348162250)

    internal val getEnableNodePathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisibleOnScreenEnabler3D", "get_enable_node_path", 277076166)
  }
}
