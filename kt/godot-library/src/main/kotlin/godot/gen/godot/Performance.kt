// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Callable
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.CALLABLE
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * This class provides access to a number of different monitors related to performance, such as
 * memory usage, draw calls, and FPS. These are the same as the values displayed in the **Monitor** tab
 * in the editor's **Debugger** panel. By using the [getMonitor] method of this class, you can access
 * this data from your code.
 * You can add custom monitors using the [addCustomMonitor] method. Custom monitors are available in
 * **Monitor** tab in the editor's **Debugger** panel together with built-in monitors.
 * **Note:** Some of the built-in monitors are only available in debug mode and will always return
 * `0` when used in a project exported in release mode.
 * **Note:** Some of the built-in monitors are not updated in real-time for performance reasons, so
 * there may be a delay of up to 1 second between changes.
 * **Note:** Custom monitors do not support negative values. Negative values are clamped to 0.
 */
@GodotBaseType
public object Performance : Object() {
  public override fun new(scriptIndex: Int): Boolean {
    getSingleton(ENGINECLASS_PERFORMANCE)
    return false
  }

  /**
   * Returns the value of one of the available built-in monitors. You should provide one of the
   * [Monitor] constants as the argument, like this:
   *
   * gdscript:
   * ```gdscript
   * print(Performance.get_monitor(Performance.TIME_FPS)) # Prints the FPS to the console.
   * ```
   * csharp:
   * ```csharp
   * GD.Print(Performance.GetMonitor(Performance.Monitor.TimeFps)); // Prints the FPS to the
   * console.
   * ```
   *
   * See [getCustomMonitor] to query custom performance monitors' values.
   */
  public fun getMonitor(monitor: Monitor): Double {
    TransferContext.writeArguments(LONG to monitor.id)
    TransferContext.callMethod(rawPtr, MethodBindings.getMonitorPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double)
  }

  /**
   * Adds a custom monitor with the name [id]. You can specify the category of the monitor using
   * slash delimiters in [id] (for example: `"Game/NumberOfNPCs"`). If there is more than one slash
   * delimiter, then the default category is used. The default category is `"Custom"`. Prints an error
   * if given [id] is already present.
   *
   * gdscript:
   * ```gdscript
   * func _ready():
   *     var monitor_value = Callable(self, "get_monitor_value")
   *
   *     # Adds monitor with name "MyName" to category "MyCategory".
   *     Performance.add_custom_monitor("MyCategory/MyMonitor", monitor_value)
   *
   *     # Adds monitor with name "MyName" to category "Custom".
   *     # Note: "MyCategory/MyMonitor" and "MyMonitor" have same name but different IDs, so the
   * code is valid.
   *     Performance.add_custom_monitor("MyMonitor", monitor_value)
   *
   *     # Adds monitor with name "MyName" to category "Custom".
   *     # Note: "MyMonitor" and "Custom/MyMonitor" have same name and same category but different
   * IDs, so the code is valid.
   *     Performance.add_custom_monitor("Custom/MyMonitor", monitor_value)
   *
   *     # Adds monitor with name "MyCategoryOne/MyCategoryTwo/MyMonitor" to category "Custom".
   *     Performance.add_custom_monitor("MyCategoryOne/MyCategoryTwo/MyMonitor", monitor_value)
   *
   * func get_monitor_value():
   *     return randi() &#37; 25
   * ```
   * csharp:
   * ```csharp
   * public override void _Ready()
   * {
   *     var monitorValue = new Callable(this, MethodName.GetMonitorValue);
   *
   *     // Adds monitor with name "MyName" to category "MyCategory".
   *     Performance.AddCustomMonitor("MyCategory/MyMonitor", monitorValue);
   *     // Adds monitor with name "MyName" to category "Custom".
   *     // Note: "MyCategory/MyMonitor" and "MyMonitor" have same name but different ids so the
   * code is valid.
   *     Performance.AddCustomMonitor("MyMonitor", monitorValue);
   *
   *     // Adds monitor with name "MyName" to category "Custom".
   *     // Note: "MyMonitor" and "Custom/MyMonitor" have same name and same category but different
   * ids so the code is valid.
   *     Performance.AddCustomMonitor("Custom/MyMonitor", monitorValue);
   *
   *     // Adds monitor with name "MyCategoryOne/MyCategoryTwo/MyMonitor" to category "Custom".
   *     Performance.AddCustomMonitor("MyCategoryOne/MyCategoryTwo/MyMonitor", monitorValue);
   * }
   *
   * public int GetMonitorValue()
   * {
   *     return GD.Randi() &#37; 25;
   * }
   * ```
   *
   * The debugger calls the callable to get the value of custom monitor. The callable must return a
   * zero or positive integer or floating-point number.
   * Callables are called with arguments supplied in argument array.
   */
  @JvmOverloads
  public fun addCustomMonitor(
    id: StringName,
    callable: Callable,
    arguments: VariantArray<Any?> = godot.core.variantArrayOf(),
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to id, CALLABLE to callable, ARRAY to arguments)
    TransferContext.callMethod(rawPtr, MethodBindings.addCustomMonitorPtr, NIL)
  }

  /**
   * Removes the custom monitor with given [id]. Prints an error if the given [id] is already
   * absent.
   */
  public fun removeCustomMonitor(id: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to id)
    TransferContext.callMethod(rawPtr, MethodBindings.removeCustomMonitorPtr, NIL)
  }

  /**
   * Returns `true` if custom monitor with the given [id] is present, `false` otherwise.
   */
  public fun hasCustomMonitor(id: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to id)
    TransferContext.callMethod(rawPtr, MethodBindings.hasCustomMonitorPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the value of custom monitor with given [id]. The callable is called to get the value of
   * custom monitor. See also [hasCustomMonitor]. Prints an error if the given [id] is absent.
   */
  public fun getCustomMonitor(id: StringName): Any? {
    TransferContext.writeArguments(STRING_NAME to id)
    TransferContext.callMethod(rawPtr, MethodBindings.getCustomMonitorPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  /**
   * Returns the last tick in which custom monitor was added/removed (in microseconds since the
   * engine started). This is set to [Time.getTicksUsec] when the monitor is updated.
   */
  public fun getMonitorModificationTime(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMonitorModificationTimePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Returns the names of active custom monitors in an [Array].
   */
  public fun getCustomMonitorNames(): VariantArray<StringName> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCustomMonitorNamesPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<StringName>)
  }

  public enum class Monitor(
    id: Long,
  ) {
    /**
     * The number of frames rendered in the last second. This metric is only updated once per
     * second, even if queried more often. *Higher is better.*
     */
    TIME_FPS(0),
    /**
     * Time it took to complete one frame, in seconds. *Lower is better.*
     */
    TIME_PROCESS(1),
    /**
     * Time it took to complete one physics frame, in seconds. *Lower is better.*
     */
    TIME_PHYSICS_PROCESS(2),
    /**
     * Time it took to complete one navigation step, in seconds. This includes navigation map
     * updates as well as agent avoidance calculations. *Lower is better.*
     */
    TIME_NAVIGATION_PROCESS(3),
    /**
     * Static memory currently used, in bytes. Not available in release builds. *Lower is better.*
     */
    MEMORY_STATIC(4),
    /**
     * Available static memory. Not available in release builds. *Lower is better.*
     */
    MEMORY_STATIC_MAX(5),
    /**
     * Largest amount of memory the message queue buffer has used, in bytes. The message queue is
     * used for deferred functions calls and notifications. *Lower is better.*
     */
    MEMORY_MESSAGE_BUFFER_MAX(6),
    /**
     * Number of objects currently instantiated (including nodes). *Lower is better.*
     */
    OBJECT_COUNT(7),
    /**
     * Number of resources currently used. *Lower is better.*
     */
    OBJECT_RESOURCE_COUNT(8),
    /**
     * Number of nodes currently instantiated in the scene tree. This also includes the root node.
     * *Lower is better.*
     */
    OBJECT_NODE_COUNT(9),
    /**
     * Number of orphan nodes, i.e. nodes which are not parented to a node of the scene tree. *Lower
     * is better.*
     */
    OBJECT_ORPHAN_NODE_COUNT(10),
    /**
     * The total number of objects in the last rendered frame. This metric doesn't include culled
     * objects (either via hiding nodes, frustum culling or occlusion culling). *Lower is better.*
     */
    RENDER_TOTAL_OBJECTS_IN_FRAME(11),
    /**
     * The total number of vertices or indices rendered in the last rendered frame. This metric
     * doesn't include primitives from culled objects (either via hiding nodes, frustum culling or
     * occlusion culling). Due to the depth prepass and shadow passes, the number of primitives is
     * always higher than the actual number of vertices in the scene (typically double or triple the
     * original vertex count). *Lower is better.*
     */
    RENDER_TOTAL_PRIMITIVES_IN_FRAME(12),
    /**
     * The total number of draw calls performed in the last rendered frame. This metric doesn't
     * include culled objects (either via hiding nodes, frustum culling or occlusion culling), since
     * they do not result in draw calls. *Lower is better.*
     */
    RENDER_TOTAL_DRAW_CALLS_IN_FRAME(13),
    /**
     * The amount of video memory used (texture and vertex memory combined, in bytes). Since this
     * metric also includes miscellaneous allocations, this value is always greater than the sum of
     * [RENDER_TEXTURE_MEM_USED] and [RENDER_BUFFER_MEM_USED]. *Lower is better.*
     */
    RENDER_VIDEO_MEM_USED(14),
    /**
     * The amount of texture memory used (in bytes). *Lower is better.*
     */
    RENDER_TEXTURE_MEM_USED(15),
    /**
     * The amount of render buffer memory used (in bytes). *Lower is better.*
     */
    RENDER_BUFFER_MEM_USED(16),
    /**
     * Number of active [RigidBody2D] nodes in the game. *Lower is better.*
     */
    PHYSICS_2D_ACTIVE_OBJECTS(17),
    /**
     * Number of collision pairs in the 2D physics engine. *Lower is better.*
     */
    PHYSICS_2D_COLLISION_PAIRS(18),
    /**
     * Number of islands in the 2D physics engine. *Lower is better.*
     */
    PHYSICS_2D_ISLAND_COUNT(19),
    /**
     * Number of active [RigidBody3D] and [VehicleBody3D] nodes in the game. *Lower is better.*
     */
    PHYSICS_3D_ACTIVE_OBJECTS(20),
    /**
     * Number of collision pairs in the 3D physics engine. *Lower is better.*
     */
    PHYSICS_3D_COLLISION_PAIRS(21),
    /**
     * Number of islands in the 3D physics engine. *Lower is better.*
     */
    PHYSICS_3D_ISLAND_COUNT(22),
    /**
     * Output latency of the [AudioServer]. Equivalent to calling [AudioServer.getOutputLatency], it
     * is not recommended to call this every frame.
     */
    AUDIO_OUTPUT_LATENCY(23),
    /**
     * Number of active navigation maps in the [NavigationServer3D]. This also includes the two
     * empty default navigation maps created by World2D and World3D.
     */
    NAVIGATION_ACTIVE_MAPS(24),
    /**
     * Number of active navigation regions in the [NavigationServer3D].
     */
    NAVIGATION_REGION_COUNT(25),
    /**
     * Number of active navigation agents processing avoidance in the [NavigationServer3D].
     */
    NAVIGATION_AGENT_COUNT(26),
    /**
     * Number of active navigation links in the [NavigationServer3D].
     */
    NAVIGATION_LINK_COUNT(27),
    /**
     * Number of navigation mesh polygons in the [NavigationServer3D].
     */
    NAVIGATION_POLYGON_COUNT(28),
    /**
     * Number of navigation mesh polygon edges in the [NavigationServer3D].
     */
    NAVIGATION_EDGE_COUNT(29),
    /**
     * Number of navigation mesh polygon edges that were merged due to edge key overlap in the
     * [NavigationServer3D].
     */
    NAVIGATION_EDGE_MERGE_COUNT(30),
    /**
     * Number of polygon edges that are considered connected by edge proximity [NavigationServer3D].
     */
    NAVIGATION_EDGE_CONNECTION_COUNT(31),
    /**
     * Number of navigation mesh polygon edges that could not be merged in the [NavigationServer3D].
     * The edges still may be connected by edge proximity or with links.
     */
    NAVIGATION_EDGE_FREE_COUNT(32),
    /**
     * Represents the size of the [Monitor] enum.
     */
    MONITOR_MAX(33),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  internal object MethodBindings {
    public val getMonitorPtr: VoidPtr = TypeManager.getMethodBindPtr("Performance", "get_monitor")

    public val addCustomMonitorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Performance", "add_custom_monitor")

    public val removeCustomMonitorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Performance", "remove_custom_monitor")

    public val hasCustomMonitorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Performance", "has_custom_monitor")

    public val getCustomMonitorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Performance", "get_custom_monitor")

    public val getMonitorModificationTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Performance", "get_monitor_modification_time")

    public val getCustomMonitorNamesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Performance", "get_custom_monitor_names")
  }
}
