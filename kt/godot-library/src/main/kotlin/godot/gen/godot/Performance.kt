// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import kotlin.Double
import kotlin.Long
import kotlin.Suppress

/**
 * Exposes performance-related data.
 *
 * This class provides access to a number of different monitors related to performance, such as memory usage, draw calls, and FPS. These are the same as the values displayed in the **Monitor** tab in the editor's **Debugger** panel. By using the [getMonitor] method of this class, you can access this data from your code.
 *
 * **Note:** A few of these monitors are only available in debug mode and will always return 0 when used in a release build.
 *
 * **Note:** Many of these monitors are not updated in real-time, so there may be a short delay between changes.
 */
@GodotBaseType
object Performance : Object() {
  /**
   * Output latency of the [godot.AudioServer].
   */
  final const val AUDIO_OUTPUT_LATENCY: Long = 30

  /**
   * Dynamic memory currently used, in bytes. Not available in release builds.
   */
  final const val MEMORY_DYNAMIC: Long = 4

  /**
   * Available dynamic memory. Not available in release builds.
   */
  final const val MEMORY_DYNAMIC_MAX: Long = 6

  /**
   * Largest amount of memory the message queue buffer has used, in bytes. The message queue is used for deferred functions calls and notifications.
   */
  final const val MEMORY_MESSAGE_BUFFER_MAX: Long = 7

  /**
   * Static memory currently used, in bytes. Not available in release builds.
   */
  final const val MEMORY_STATIC: Long = 3

  /**
   * Available static memory. Not available in release builds.
   */
  final const val MEMORY_STATIC_MAX: Long = 5

  /**
   * Represents the size of the [enum Monitor] enum.
   */
  final const val MONITOR_MAX: Long = 31

  /**
   * Number of objects currently instanced (including nodes).
   */
  final const val OBJECT_COUNT: Long = 8

  /**
   * Number of nodes currently instanced in the scene tree. This also includes the root node.
   */
  final const val OBJECT_NODE_COUNT: Long = 10

  /**
   * Number of orphan nodes, i.e. nodes which are not parented to a node of the scene tree.
   */
  final const val OBJECT_ORPHAN_NODE_COUNT: Long = 11

  /**
   * Number of resources currently used.
   */
  final const val OBJECT_RESOURCE_COUNT: Long = 9

  /**
   * Number of active [godot.RigidBody2D] nodes in the game.
   */
  final const val PHYSICS_2D_ACTIVE_OBJECTS: Long = 24

  /**
   * Number of collision pairs in the 2D physics engine.
   */
  final const val PHYSICS_2D_COLLISION_PAIRS: Long = 25

  /**
   * Number of islands in the 2D physics engine.
   */
  final const val PHYSICS_2D_ISLAND_COUNT: Long = 26

  /**
   * Number of active [godot.RigidBody] and [godot.VehicleBody] nodes in the game.
   */
  final const val PHYSICS_3D_ACTIVE_OBJECTS: Long = 27

  /**
   * Number of collision pairs in the 3D physics engine.
   */
  final const val PHYSICS_3D_COLLISION_PAIRS: Long = 28

  /**
   * Number of islands in the 3D physics engine.
   */
  final const val PHYSICS_3D_ISLAND_COUNT: Long = 29

  /**
   * Draw calls per frame.
   */
  final const val RENDER_2D_DRAW_CALLS_IN_FRAME: Long = 19

  /**
   * Items or joined items drawn per frame.
   */
  final const val RENDER_2D_ITEMS_IN_FRAME: Long = 18

  /**
   * Draw calls per frame. 3D only.
   */
  final const val RENDER_DRAW_CALLS_IN_FRAME: Long = 17

  /**
   * Material changes per frame. 3D only.
   */
  final const val RENDER_MATERIAL_CHANGES_IN_FRAME: Long = 14

  /**
   * 3D objects drawn per frame.
   */
  final const val RENDER_OBJECTS_IN_FRAME: Long = 12

  /**
   * Shader changes per frame. 3D only.
   */
  final const val RENDER_SHADER_CHANGES_IN_FRAME: Long = 15

  /**
   * Render surface changes per frame. 3D only.
   */
  final const val RENDER_SURFACE_CHANGES_IN_FRAME: Long = 16

  /**
   * The amount of texture memory used.
   */
  final const val RENDER_TEXTURE_MEM_USED: Long = 21

  /**
   * Unimplemented in the GLES2 and GLES3 rendering backends, always returns 0.
   */
  final const val RENDER_USAGE_VIDEO_MEM_TOTAL: Long = 23

  /**
   * The amount of vertex memory used.
   */
  final const val RENDER_VERTEX_MEM_USED: Long = 22

  /**
   * Vertices drawn per frame. 3D only.
   */
  final const val RENDER_VERTICES_IN_FRAME: Long = 13

  /**
   * The amount of video memory used, i.e. texture and vertex memory combined.
   */
  final const val RENDER_VIDEO_MEM_USED: Long = 20

  /**
   * Number of frames per second.
   */
  final const val TIME_FPS: Long = 0

  /**
   * Time it took to complete one physics frame, in seconds.
   */
  final const val TIME_PHYSICS_PROCESS: Long = 2

  /**
   * Time it took to complete one frame, in seconds.
   */
  final const val TIME_PROCESS: Long = 1

  override fun __new() {
    rawPtr = TransferContext.getSingleton(ENGINESINGLETON_PERFORMANCE)
  }

  override fun ____DO_NOT_TOUCH_THIS_isSingleton____() = true

  /**
   * Returns the value of one of the available monitors. You should provide one of the [enum Monitor] constants as the argument, like this:
   *
   * ```
   * 				print(Performance.get_monitor(Performance.TIME_FPS)) # Prints the FPS to the console
   * 				```
   */
  fun getMonitor(monitor: Long): Double {
    TransferContext.writeArguments(LONG to monitor)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PERFORMANCE_GET_MONITOR, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  enum class Monitor(
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
     * Dynamic memory currently used, in bytes. Not available in release builds.
     */
    MEMORY_DYNAMIC(4),

    /**
     * Available static memory. Not available in release builds.
     */
    MEMORY_STATIC_MAX(5),

    /**
     * Available dynamic memory. Not available in release builds.
     */
    MEMORY_DYNAMIC_MAX(6),

    /**
     * Largest amount of memory the message queue buffer has used, in bytes. The message queue is used for deferred functions calls and notifications.
     */
    MEMORY_MESSAGE_BUFFER_MAX(7),

    /**
     * Number of objects currently instanced (including nodes).
     */
    OBJECT_COUNT(8),

    /**
     * Number of resources currently used.
     */
    OBJECT_RESOURCE_COUNT(9),

    /**
     * Number of nodes currently instanced in the scene tree. This also includes the root node.
     */
    OBJECT_NODE_COUNT(10),

    /**
     * Number of orphan nodes, i.e. nodes which are not parented to a node of the scene tree.
     */
    OBJECT_ORPHAN_NODE_COUNT(11),

    /**
     * 3D objects drawn per frame.
     */
    RENDER_OBJECTS_IN_FRAME(12),

    /**
     * Vertices drawn per frame. 3D only.
     */
    RENDER_VERTICES_IN_FRAME(13),

    /**
     * Material changes per frame. 3D only.
     */
    RENDER_MATERIAL_CHANGES_IN_FRAME(14),

    /**
     * Shader changes per frame. 3D only.
     */
    RENDER_SHADER_CHANGES_IN_FRAME(15),

    /**
     * Render surface changes per frame. 3D only.
     */
    RENDER_SURFACE_CHANGES_IN_FRAME(16),

    /**
     * Draw calls per frame. 3D only.
     */
    RENDER_DRAW_CALLS_IN_FRAME(17),

    /**
     * Items or joined items drawn per frame.
     */
    RENDER_2D_ITEMS_IN_FRAME(18),

    /**
     * Draw calls per frame.
     */
    RENDER_2D_DRAW_CALLS_IN_FRAME(19),

    /**
     * The amount of video memory used, i.e. texture and vertex memory combined.
     */
    RENDER_VIDEO_MEM_USED(20),

    /**
     * The amount of texture memory used.
     */
    RENDER_TEXTURE_MEM_USED(21),

    /**
     * The amount of vertex memory used.
     */
    RENDER_VERTEX_MEM_USED(22),

    /**
     * Unimplemented in the GLES2 and GLES3 rendering backends, always returns 0.
     */
    RENDER_USAGE_VIDEO_MEM_TOTAL(23),

    /**
     * Number of active [godot.RigidBody2D] nodes in the game.
     */
    PHYSICS_2D_ACTIVE_OBJECTS(24),

    /**
     * Number of collision pairs in the 2D physics engine.
     */
    PHYSICS_2D_COLLISION_PAIRS(25),

    /**
     * Number of islands in the 2D physics engine.
     */
    PHYSICS_2D_ISLAND_COUNT(26),

    /**
     * Number of active [godot.RigidBody] and [godot.VehicleBody] nodes in the game.
     */
    PHYSICS_3D_ACTIVE_OBJECTS(27),

    /**
     * Number of collision pairs in the 3D physics engine.
     */
    PHYSICS_3D_COLLISION_PAIRS(28),

    /**
     * Number of islands in the 3D physics engine.
     */
    PHYSICS_3D_ISLAND_COUNT(29),

    /**
     * Output latency of the [godot.AudioServer].
     */
    AUDIO_OUTPUT_LATENCY(30),

    /**
     * Represents the size of the [enum Monitor] enum.
     */
    MONITOR_MAX(31);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }
}
