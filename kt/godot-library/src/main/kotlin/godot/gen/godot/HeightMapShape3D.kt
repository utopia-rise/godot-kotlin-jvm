// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedFloat32Array
import godot.core.TypeManager
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_FLOAT_32_ARRAY
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * A 3D heightmap shape, intended for use in physics. Usually used to provide a shape for a
 * [CollisionShape3D]. This is useful for terrain, but it is limited as overhangs (such as caves)
 * cannot be stored. Holes in a [HeightMapShape3D] are created by assigning very low values to points
 * in the desired area.
 * **Performance:** [HeightMapShape3D] is faster to check collisions against than
 * [ConcavePolygonShape3D], but it is significantly slower than primitive shapes like [BoxShape3D].
 * A heightmap collision shape can also be build by using an [Image] reference:
 *
 * gdscript:
 * ```gdscript
 * var heightmap_texture: Texture = ResourceLoader.load("res://heightmap_image.exr")
 * var heightmap_image: Image = heightmap_texture.get_image()
 * heightmap_image.convert(Image.FORMAT_RF)
 *
 * var height_min: float = 0.0
 * var height_max: float = 10.0
 *
 * update_map_data_from_image(heightmap_image, height_min, height_max)
 * ```
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
   * Height map data. The array's size must be equal to [mapWidth] multiplied by [mapDepth].
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

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_HEIGHTMAPSHAPE3D, scriptIndex)
  }

  /**
   * Returns the smallest height value found in [mapData]. Recalculates only when [mapData] changes.
   */
  public fun getMinHeight(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMinHeightPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns the largest height value found in [mapData]. Recalculates only when [mapData] changes.
   */
  public fun getMaxHeight(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMaxHeightPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Updates [mapData] with data read from an [Image] reference. Automatically resizes heightmap
   * [mapWidth] and [mapDepth] to fit the full image width and height.
   * The image needs to be in either [Image.FORMAT_RF] (32 bit), [Image.FORMAT_RH] (16 bit), or
   * [Image.FORMAT_R8] (8 bit).
   * Each image pixel is read in as a float on the range from `0.0` (black pixel) to `1.0` (white
   * pixel). This range value gets remapped to [heightMin] and [heightMax] to form the final height
   * value.
   */
  public fun updateMapDataFromImage(
    image: Image,
    heightMin: Float,
    heightMax: Float,
  ): Unit {
    TransferContext.writeArguments(OBJECT to image, DOUBLE to heightMin.toDouble(), DOUBLE to heightMax.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.updateMapDataFromImagePtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val setMapWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("HeightMapShape3D", "set_map_width", 1286410249)

    public val getMapWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("HeightMapShape3D", "get_map_width", 3905245786)

    public val setMapDepthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("HeightMapShape3D", "set_map_depth", 1286410249)

    public val getMapDepthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("HeightMapShape3D", "get_map_depth", 3905245786)

    public val setMapDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("HeightMapShape3D", "set_map_data", 2899603908)

    public val getMapDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("HeightMapShape3D", "get_map_data", 675695659)

    public val getMinHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("HeightMapShape3D", "get_min_height", 1740695150)

    public val getMaxHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("HeightMapShape3D", "get_max_height", 1740695150)

    public val updateMapDataFromImagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("HeightMapShape3D", "update_map_data_from_image", 2636652979)
  }
}
