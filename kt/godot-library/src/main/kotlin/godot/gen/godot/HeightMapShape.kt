// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PoolRealArray
import godot.core.TransferContext
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.POOL_REAL_ARRAY
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Height map shape for 3D physics.
 *
 * Height map shape resource, which can be added to a [godot.PhysicsBody] or [godot.Area].
 */
@GodotBaseType
public open class HeightMapShape : Shape() {
  /**
   * Height map data, pool array must be of [mapWidth] * [mapDepth] size.
   */
  public open var mapData: PoolRealArray
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HEIGHTMAPSHAPE_GET_MAP_DATA,
          POOL_REAL_ARRAY)
      return TransferContext.readReturnValue(POOL_REAL_ARRAY, false) as PoolRealArray
    }
    set(`value`) {
      TransferContext.writeArguments(POOL_REAL_ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HEIGHTMAPSHAPE_SET_MAP_DATA, NIL)
    }

  /**
   * Number of vertices in the depth of the height map. Changing this will resize the [mapData].
   */
  public open var mapDepth: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HEIGHTMAPSHAPE_GET_MAP_DEPTH,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HEIGHTMAPSHAPE_SET_MAP_DEPTH, NIL)
    }

  /**
   * Number of vertices in the width of the height map. Changing this will resize the [mapData].
   */
  public open var mapWidth: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HEIGHTMAPSHAPE_GET_MAP_WIDTH,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HEIGHTMAPSHAPE_SET_MAP_WIDTH, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_HEIGHTMAPSHAPE)
  }
}
