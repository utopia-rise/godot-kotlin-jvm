// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.PoolRealArray
import godot.core.TransferContext
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.POOL_REAL_ARRAY
import kotlin.Long
import kotlin.Suppress

/**
 * Height map shape for 3D physics (Bullet only).
 * 
 * Height map shape resource, which can be added to a [godot.PhysicsBody] or [godot.Area].
 */
@GodotBaseType
open class HeightMapShape : Shape() {
  /**
   * Height map data, pool array must be of [mapWidth] * [mapDepth] size.
   */
  open var mapData: PoolRealArray
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HEIGHTMAPSHAPE_GET_MAP_DATA,
          POOL_REAL_ARRAY)
      return TransferContext.readReturnValue(POOL_REAL_ARRAY, false) as PoolRealArray
    }
    set(value) {
      TransferContext.writeArguments(POOL_REAL_ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HEIGHTMAPSHAPE_SET_MAP_DATA, NIL)
    }

  /**
   * Depth of the height map data. Changing this will resize the [mapData].
   */
  open var mapDepth: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HEIGHTMAPSHAPE_GET_MAP_DEPTH,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HEIGHTMAPSHAPE_SET_MAP_DEPTH, NIL)
    }

  /**
   * Width of the height map data. Changing this will resize the [mapData].
   */
  open var mapWidth: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HEIGHTMAPSHAPE_GET_MAP_WIDTH,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HEIGHTMAPSHAPE_SET_MAP_WIDTH, NIL)
    }

  override fun __new() {
    callConstructor(ENGINECLASS_HEIGHTMAPSHAPE)
  }
}
