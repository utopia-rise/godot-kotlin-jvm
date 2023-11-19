// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedFloat32Array
import godot.core.TypeManager
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_FLOAT_32_ARRAY
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * A 3D height map shape used for physics collision.
 *
 * A 3D heightmap shape, intended for use in physics. Usually used to provide a shape for a [godot.CollisionShape3D]. This is useful for terrain, but it is limited as overhangs (such as caves) cannot be stored. Holes in a [godot.HeightMapShape3D] are created by assigning very low values to points in the desired area.
 *
 * **Performance:** [godot.HeightMapShape3D] is faster to check collisions against than [godot.ConcavePolygonShape3D], but it is significantly slower than primitive shapes like [godot.BoxShape3D].
 */
@GodotBaseType
public open class HeightMapShape3D : Shape3D() {
  /**
   * Number of vertices in the width of the height map. Changing this will resize the [mapData].
   */
  public var mapWidth: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMapWidthPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setMapWidthPtr, NIL)
    }

  /**
   * Number of vertices in the depth of the height map. Changing this will resize the [mapData].
   */
  public var mapDepth: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMapDepthPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setMapDepthPtr, NIL)
    }

  /**
   * Height map data, pool array must be of [mapWidth] * [mapDepth] size.
   */
  public var mapData: PackedFloat32Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMapDataPtr, PACKED_FLOAT_32_ARRAY)
      return (TransferContext.readReturnValue(PACKED_FLOAT_32_ARRAY, false) as PackedFloat32Array)
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_FLOAT_32_ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMapDataPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_HEIGHTMAPSHAPE3D, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setMapWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("HeightMapShape3D", "set_map_width")

    public val getMapWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("HeightMapShape3D", "get_map_width")

    public val setMapDepthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("HeightMapShape3D", "set_map_depth")

    public val getMapDepthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("HeightMapShape3D", "get_map_depth")

    public val setMapDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("HeightMapShape3D", "set_map_data")

    public val getMapDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("HeightMapShape3D", "get_map_data")
  }
}
