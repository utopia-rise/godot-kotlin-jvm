// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedFloat32Array
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_FLOAT_32_ARRAY
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * Height map shape resource for 3D physics.
 *
 * Height map shape resource, which can be added to a [godot.PhysicsBody3D] or [godot.Area3D]. Heightmap collision is typically used for colliding with terrains. However, since heightmaps cannot store overhangs, collisions with other structures (such as buildings) must be done with other collision shapes such as [godot.ConcavePolygonShape3D]. If needed, "holes" can be created in an [godot.HeightMapShape3D] by assigning very low points (like `-100000`) in the desired area.
 *
 * **Performance:** [godot.HeightMapShape3D] is faster to check collisions against compared to [godot.ConcavePolygonShape3D], but it is slower than primitive collision shapes such as [godot.SphereShape3D] or [godot.BoxShape3D].
 */
@GodotBaseType
public open class HeightMapShape3D : Shape3D() {
  /**
   * Number of vertices in the width of the height map. Changing this will resize the [mapData].
   */
  public var mapWidth: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HEIGHTMAPSHAPE3D_GET_MAP_WIDTH,
          LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HEIGHTMAPSHAPE3D_SET_MAP_WIDTH,
          NIL)
    }

  /**
   * Number of vertices in the depth of the height map. Changing this will resize the [mapData].
   */
  public var mapDepth: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HEIGHTMAPSHAPE3D_GET_MAP_DEPTH,
          LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HEIGHTMAPSHAPE3D_SET_MAP_DEPTH,
          NIL)
    }

  /**
   * Height map data, pool array must be of [mapWidth] * [mapDepth] size.
   */
  public var mapData: PackedFloat32Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HEIGHTMAPSHAPE3D_GET_MAP_DATA,
          PACKED_FLOAT_32_ARRAY)
      return (TransferContext.readReturnValue(PACKED_FLOAT_32_ARRAY, false) as PackedFloat32Array)
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_FLOAT_32_ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HEIGHTMAPSHAPE3D_SET_MAP_DATA,
          NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_HEIGHTMAPSHAPE3D, scriptIndex)
    return true
  }

  public companion object
}
