// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedFloat32Array
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_FLOAT_32_ARRAY
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_HEIGHTMAPSHAPE3D_INDEX: Int = 302

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
  public final inline var mapWidth: Int
    @JvmName("mapWidthProperty")
    get() = getMapWidth()
    @JvmName("mapWidthProperty")
    set(`value`) {
      setMapWidth(value)
    }

  /**
   * Number of vertices in the depth of the height map. Changing this will resize the [mapData].
   */
  public final inline var mapDepth: Int
    @JvmName("mapDepthProperty")
    get() = getMapDepth()
    @JvmName("mapDepthProperty")
    set(`value`) {
      setMapDepth(value)
    }

  /**
   * Height map data. The array's size must be equal to [mapWidth] multiplied by [mapDepth].
   */
  public final inline var mapData: PackedFloat32Array
    @JvmName("mapDataProperty")
    get() = getMapData()
    @JvmName("mapDataProperty")
    set(`value`) {
      setMapData(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_HEIGHTMAPSHAPE3D_INDEX, scriptIndex)
  }

  public final fun setMapWidth(width: Int): Unit {
    Internals.writeArguments(LONG to width.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setMapWidthPtr, NIL)
  }

  public final fun getMapWidth(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getMapWidthPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setMapDepth(height: Int): Unit {
    Internals.writeArguments(LONG to height.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setMapDepthPtr, NIL)
  }

  public final fun getMapDepth(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getMapDepthPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setMapData(`data`: PackedFloat32Array): Unit {
    Internals.writeArguments(PACKED_FLOAT_32_ARRAY to data)
    Internals.callMethod(rawPtr, MethodBindings.setMapDataPtr, NIL)
  }

  public final fun getMapData(): PackedFloat32Array {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getMapDataPtr, PACKED_FLOAT_32_ARRAY)
    return (Internals.readReturnValue(PACKED_FLOAT_32_ARRAY) as PackedFloat32Array)
  }

  /**
   * Returns the smallest height value found in [mapData]. Recalculates only when [mapData] changes.
   */
  public final fun getMinHeight(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getMinHeightPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns the largest height value found in [mapData]. Recalculates only when [mapData] changes.
   */
  public final fun getMaxHeight(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getMaxHeightPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
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
  public final fun updateMapDataFromImage(
    image: Image?,
    heightMin: Float,
    heightMax: Float,
  ): Unit {
    Internals.writeArguments(OBJECT to image, DOUBLE to heightMin.toDouble(), DOUBLE to heightMax.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.updateMapDataFromImagePtr, NIL)
  }

  public companion object

  public object MethodBindings {
    internal val setMapWidthPtr: VoidPtr =
        Internals.getMethodBindPtr("HeightMapShape3D", "set_map_width", 1286410249)

    internal val getMapWidthPtr: VoidPtr =
        Internals.getMethodBindPtr("HeightMapShape3D", "get_map_width", 3905245786)

    internal val setMapDepthPtr: VoidPtr =
        Internals.getMethodBindPtr("HeightMapShape3D", "set_map_depth", 1286410249)

    internal val getMapDepthPtr: VoidPtr =
        Internals.getMethodBindPtr("HeightMapShape3D", "get_map_depth", 3905245786)

    internal val setMapDataPtr: VoidPtr =
        Internals.getMethodBindPtr("HeightMapShape3D", "set_map_data", 2899603908)

    internal val getMapDataPtr: VoidPtr =
        Internals.getMethodBindPtr("HeightMapShape3D", "get_map_data", 675695659)

    internal val getMinHeightPtr: VoidPtr =
        Internals.getMethodBindPtr("HeightMapShape3D", "get_min_height", 1740695150)

    internal val getMaxHeightPtr: VoidPtr =
        Internals.getMethodBindPtr("HeightMapShape3D", "get_max_height", 1740695150)

    internal val updateMapDataFromImagePtr: VoidPtr =
        Internals.getMethodBindPtr("HeightMapShape3D", "update_map_data_from_image", 2636652979)
  }
}
