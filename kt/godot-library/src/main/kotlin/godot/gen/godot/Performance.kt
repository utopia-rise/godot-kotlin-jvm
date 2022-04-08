// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Callable
import godot.core.StringName
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.CALLABLE
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING_NAME
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Exposes performance-related data.
 *
 * This class provides access to a number of different monitors related to performance, such as memory usage, draw calls, and FPS. These are the same as the values displayed in the **Monitor** tab in the editor's **Debugger** panel. By using the [getMonitor] method of this class, you can access this data from your code.
 *
 * You can add custom monitors using the [addCustomMonitor] method. Custom monitors are available in **Monitor** tab in the editor's **Debugger** panel together with built-in monitors.
 *
 * **Note:** A few of these monitors are only available in debug mode and will always return 0 when used in a release build.
 *
 * **Note:** Many of these monitors are not updated in real-time, so there may be a short delay between changes.
 *
 * **Note:** Custom monitors do not support negative values. Negative values are clamped to 0.
 */
@GodotBaseType
public object Performance : Object() {
  public override fun __new(): Unit {
    rawPtr = TransferContext.getSingleton(ENGINECLASS_PERFORMANCE)
  }

  public override fun ____DO_NOT_TOUCH_THIS_isSingleton____() = true

  /**
   * Returns the value of one of the available monitors. You should provide one of the [enum Monitor] constants as the argument, like this:
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * print(Performance.get_monitor(Performance.TIME_FPS)) # Prints the FPS to the console.
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * GD.Print(Performance.GetMonitor(Performance.Monitor.TimeFps)); // Prints the FPS to the console.
   *
   * [/csharp]
   *
   * [/codeblocks]
   */
  public fun getMonitor(monitor: Performance.Monitor): Double {
    TransferContext.writeArguments(LONG to monitor.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PERFORMANCE_GET_MONITOR, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Adds a custom monitor with name same as id. You can specify the category of monitor using '/' in id. If there are more than one '/' then default category is used. Default category is "Custom".
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * func _ready():
   *
   *     var monitor_value = Callable(self, "get_monitor_value")
   *
   *
   *
   *     # Adds monitor with name "MyName" to category "MyCategory".
   *
   *     Performance.add_custom_monitor("MyCategory/MyMonitor", monitor_value)
   *
   *
   *
   *     # Adds monitor with name "MyName" to category "Custom".
   *
   *     # Note: "MyCategory/MyMonitor" and "MyMonitor" have same name but different ids so the code is valid.
   *
   *     Performance.add_custom_monitor("MyMonitor", monitor_value)
   *
   *
   *
   *     # Adds monitor with name "MyName" to category "Custom".
   *
   *     # Note: "MyMonitor" and "Custom/MyMonitor" have same name and same category but different ids so the code is valid.
   *
   *     Performance.add_custom_monitor("Custom/MyMonitor", monitor_value)
   *
   *
   *
   *     # Adds monitor with name "MyCategoryOne/MyCategoryTwo/MyMonitor" to category "Custom".
   *
   *     Performance.add_custom_monitor("MyCategoryOne/MyCategoryTwo/MyMonitor", monitor_value)
   *
   *
   *
   * func get_monitor_value():
   *
   *     return randi() % 25
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * public override void _Ready()
   *
   * {
   *
   *     var monitorValue = new Callable(this, nameof(GetMonitorValue));
   *
   *
   *
   *     // Adds monitor with name "MyName" to category "MyCategory".
   *
   *     Performance.AddCustomMonitor("MyCategory/MyMonitor", monitorValue);
   *
   *     // Adds monitor with name "MyName" to category "Custom".
   *
   *     // Note: "MyCategory/MyMonitor" and "MyMonitor" have same name but different ids so the code is valid.
   *
   *     Performance.AddCustomMonitor("MyMonitor", monitorValue);
   *
   *
   *
   *     // Adds monitor with name "MyName" to category "Custom".
   *
   *     // Note: "MyMonitor" and "Custom/MyMonitor" have same name and same category but different ids so the code is valid.
   *
   *     Performance.AddCustomMonitor("Custom/MyMonitor", monitorValue);
   *
   *
   *
   *     // Adds monitor with name "MyCategoryOne/MyCategoryTwo/MyMonitor" to category "Custom".
   *
   *     Performance.AddCustomMonitor("MyCategoryOne/MyCategoryTwo/MyMonitor", monitorValue);
   *
   * }
   *
   *
   *
   * public int GetMonitorValue()
   *
   * {
   *
   *     return GD.Randi() % 25;
   *
   * }
   *
   * [/csharp]
   *
   * [/codeblocks]
   *
   * The debugger calls the callable to get the value of custom monitor. The callable must return a number.
   *
   * Callables are called with arguments supplied in argument array.
   *
   * **Note:** It throws an error if given id is already present.
   */
  public fun addCustomMonitor(
    id: StringName,
    callable: Callable,
    arguments: VariantArray<Any?> = godot.core.variantArrayOf()
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to id, CALLABLE to callable, ARRAY to arguments)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PERFORMANCE_ADD_CUSTOM_MONITOR, NIL)
  }

  /**
   * Removes the custom monitor with given id.
   *
   * **Note:** It throws an error if the given id is already absent.
   */
  public fun removeCustomMonitor(id: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PERFORMANCE_REMOVE_CUSTOM_MONITOR,
        NIL)
  }

  /**
   * Returns true if custom monitor with the given id is present otherwise returns false.
   */
  public fun hasCustomMonitor(id: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PERFORMANCE_HAS_CUSTOM_MONITOR,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the value of custom monitor with given id. The callable is called to get the value of custom monitor.
   *
   * **Note:** It throws an error if the given id is absent.
   */
  public fun getCustomMonitor(id: StringName): Any? {
    TransferContext.writeArguments(STRING_NAME to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PERFORMANCE_GET_CUSTOM_MONITOR, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Returns the last tick in which custom monitor was added/removed.
   */
  public fun getMonitorModificationTime(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PERFORMANCE_GET_MONITOR_MODIFICATION_TIME, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the names of active custom monitors in an array.
   */
  public fun getCustomMonitorNames(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PERFORMANCE_GET_CUSTOM_MONITOR_NAMES, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  public enum class Monitor(
    id: Long
  ) {
    /**
     * Number of frames per second.
     */
    TIME_FPS(0),
    /**
     * Time it took to complete one frame, in seconds.
     */
    TIME_PROCESS(1),
    /**
     * Time it took to complete one physics frame, in seconds.
     */
    TIME_PHYSICS_PROCESS(2),
    /**
     * Static memory currently used, in bytes. Not available in release builds.
     */
    MEMORY_STATIC(3),
    /**
     * Available static memory. Not available in release builds.
     */
    MEMORY_STATIC_MAX(4),
    /**
     * Largest amount of memory the message queue buffer has used, in bytes. The message queue is used for deferred functions calls and notifications.
     */
    MEMORY_MESSAGE_BUFFER_MAX(5),
    /**
     * Number of objects currently instantiated (including nodes).
     */
    OBJECT_COUNT(6),
    /**
     * Number of resources currently used.
     */
    OBJECT_RESOURCE_COUNT(7),
    /**
     * Number of nodes currently instantiated in the scene tree. This also includes the root node.
     */
    OBJECT_NODE_COUNT(8),
    /**
     * Number of orphan nodes, i.e. nodes which are not parented to a node of the scene tree.
     */
    OBJECT_ORPHAN_NODE_COUNT(9),
    /**
     *
     */
    RENDER_TOTAL_OBJECTS_IN_FRAME(10),
    /**
     *
     */
    RENDER_TOTAL_PRIMITIVES_IN_FRAME(11),
    /**
     *
     */
    RENDER_TOTAL_DRAW_CALLS_IN_FRAME(12),
    /**
     * The amount of video memory used, i.e. texture and vertex memory combined.
     */
    RENDER_VIDEO_MEM_USED(13),
    /**
     * The amount of texture memory used.
     */
    RENDER_TEXTURE_MEM_USED(14),
    /**
     *
     */
    RENDER_BUFFER_MEM_USED(15),
    /**
     * Number of active [godot.RigidDynamicBody2D] nodes in the game.
     */
    PHYSICS_2D_ACTIVE_OBJECTS(16),
    /**
     * Number of collision pairs in the 2D physics engine.
     */
    PHYSICS_2D_COLLISION_PAIRS(17),
    /**
     * Number of islands in the 2D physics engine.
     */
    PHYSICS_2D_ISLAND_COUNT(18),
    /**
     * Number of active [godot.RigidDynamicBody3D] and [godot.VehicleBody3D] nodes in the game.
     */
    PHYSICS_3D_ACTIVE_OBJECTS(19),
    /**
     * Number of collision pairs in the 3D physics engine.
     */
    PHYSICS_3D_COLLISION_PAIRS(20),
    /**
     * Number of islands in the 3D physics engine.
     */
    PHYSICS_3D_ISLAND_COUNT(21),
    /**
     * Output latency of the [godot.AudioServer].
     */
    AUDIO_OUTPUT_LATENCY(22),
    /**
     * Represents the size of the [enum Monitor] enum.
     */
    MONITOR_MAX(23),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }
}
