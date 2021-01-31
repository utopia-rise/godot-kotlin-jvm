// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.util.VoidPtr
import kotlin.Double
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
object Performance : Object() {
  final const val AUDIO_OUTPUT_LATENCY: Long = 30

  final const val MEMORY_DYNAMIC: Long = 4

  final const val MEMORY_DYNAMIC_MAX: Long = 6

  final const val MEMORY_MESSAGE_BUFFER_MAX: Long = 7

  final const val MEMORY_STATIC: Long = 3

  final const val MEMORY_STATIC_MAX: Long = 5

  final const val MONITOR_MAX: Long = 31

  final const val OBJECT_COUNT: Long = 8

  final const val OBJECT_NODE_COUNT: Long = 10

  final const val OBJECT_ORPHAN_NODE_COUNT: Long = 11

  final const val OBJECT_RESOURCE_COUNT: Long = 9

  final const val PHYSICS_2D_ACTIVE_OBJECTS: Long = 24

  final const val PHYSICS_2D_COLLISION_PAIRS: Long = 25

  final const val PHYSICS_2D_ISLAND_COUNT: Long = 26

  final const val PHYSICS_3D_ACTIVE_OBJECTS: Long = 27

  final const val PHYSICS_3D_COLLISION_PAIRS: Long = 28

  final const val PHYSICS_3D_ISLAND_COUNT: Long = 29

  final const val RENDER_2D_DRAW_CALLS_IN_FRAME: Long = 19

  final const val RENDER_2D_ITEMS_IN_FRAME: Long = 18

  final const val RENDER_DRAW_CALLS_IN_FRAME: Long = 17

  final const val RENDER_MATERIAL_CHANGES_IN_FRAME: Long = 14

  final const val RENDER_OBJECTS_IN_FRAME: Long = 12

  final const val RENDER_SHADER_CHANGES_IN_FRAME: Long = 15

  final const val RENDER_SURFACE_CHANGES_IN_FRAME: Long = 16

  final const val RENDER_TEXTURE_MEM_USED: Long = 21

  final const val RENDER_USAGE_VIDEO_MEM_TOTAL: Long = 23

  final const val RENDER_VERTEX_MEM_USED: Long = 22

  final const val RENDER_VERTICES_IN_FRAME: Long = 13

  final const val RENDER_VIDEO_MEM_USED: Long = 20

  final const val TIME_FPS: Long = 0

  final const val TIME_PHYSICS_PROCESS: Long = 2

  final const val TIME_PROCESS: Long = 1

  override fun __new(): VoidPtr = TransferContext.getSingleton(ENGINESINGLETON_PERFORMANCE)

  override fun ____DO_NOT_TOUCH_THIS_isSingleton____() = true

  fun getMonitor(monitor: Long): Double {
    TransferContext.writeArguments(LONG to monitor)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PERFORMANCE_GET_MONITOR, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  enum class Monitor(
    id: Long
  ) {
    TIME_FPS(0),

    TIME_PROCESS(1),

    TIME_PHYSICS_PROCESS(2),

    MEMORY_STATIC(3),

    MEMORY_DYNAMIC(4),

    MEMORY_STATIC_MAX(5),

    MEMORY_DYNAMIC_MAX(6),

    MEMORY_MESSAGE_BUFFER_MAX(7),

    OBJECT_COUNT(8),

    OBJECT_RESOURCE_COUNT(9),

    OBJECT_NODE_COUNT(10),

    OBJECT_ORPHAN_NODE_COUNT(11),

    RENDER_OBJECTS_IN_FRAME(12),

    RENDER_VERTICES_IN_FRAME(13),

    RENDER_MATERIAL_CHANGES_IN_FRAME(14),

    RENDER_SHADER_CHANGES_IN_FRAME(15),

    RENDER_SURFACE_CHANGES_IN_FRAME(16),

    RENDER_DRAW_CALLS_IN_FRAME(17),

    RENDER_2D_ITEMS_IN_FRAME(18),

    RENDER_2D_DRAW_CALLS_IN_FRAME(19),

    RENDER_VIDEO_MEM_USED(20),

    RENDER_TEXTURE_MEM_USED(21),

    RENDER_VERTEX_MEM_USED(22),

    RENDER_USAGE_VIDEO_MEM_TOTAL(23),

    PHYSICS_2D_ACTIVE_OBJECTS(24),

    PHYSICS_2D_COLLISION_PAIRS(25),

    PHYSICS_2D_ISLAND_COUNT(26),

    PHYSICS_3D_ACTIVE_OBJECTS(27),

    PHYSICS_3D_COLLISION_PAIRS(28),

    PHYSICS_3D_ISLAND_COUNT(29),

    AUDIO_OUTPUT_LATENCY(30),

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
