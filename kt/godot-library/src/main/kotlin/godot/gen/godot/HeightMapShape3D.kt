// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedFloat32Array
import godot.core.TransferContext
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_FLOAT_32_ARRAY
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Height map shape for 3D physics.
 *
 * Height map shape resource, which can be added to a [godot.PhysicsBody3D] or [godot.Area3D].
 */
@GodotBaseType
public open class HeightMapShape3D : Shape3D() {
  /**
   * Width of the height map data. Changing this will resize the [mapData].
   */
  public open var mapWidth: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HEIGHTMAPSHAPE3D_GET_MAP_WIDTH,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HEIGHTMAPSHAPE3D_SET_MAP_WIDTH,
          NIL)
    }

  /**
   * Depth of the height map data. Changing this will resize the [mapData].
   */
  public open var mapDepth: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HEIGHTMAPSHAPE3D_GET_MAP_DEPTH,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HEIGHTMAPSHAPE3D_SET_MAP_DEPTH,
          NIL)
    }

  /**
   * Height map data, pool array must be of [mapWidth] * [mapDepth] size.
   */
  public open var mapData: PackedFloat32Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HEIGHTMAPSHAPE3D_GET_MAP_DATA,
          PACKED_FLOAT_32_ARRAY)
      return TransferContext.readReturnValue(PACKED_FLOAT_32_ARRAY, false) as PackedFloat32Array
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_FLOAT_32_ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HEIGHTMAPSHAPE3D_SET_MAP_DATA,
          NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_HEIGHTMAPSHAPE3D)
  }

  public companion object
}
