// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.Color
import godot.core.PackedVector2Array
import godot.core.Signal0
import godot.core.VariantCaster.ANY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.COLOR
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_VECTOR2_ARRAY
import godot.core.VariantParser.STRING
import godot.core.VariantParser.VECTOR2
import godot.core.VariantParser.VECTOR2I
import godot.core.Vector2
import godot.core.Vector2i
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

private const val ENGINECLASS_TILEDATA: Int = 663

/**
 * [TileData] object represents a single tile in a [TileSet]. It is usually edited using the tileset
 * editor, but it can be modified at runtime using [TileMap.TileDataRuntimeUpdate].
 */
@GodotBaseType
public open class TileData : Object() {
  /**
   * Emitted when any of the properties are changed.
   */
  public val changed: Signal0 by Signal0

  /**
   * If `true`, the tile will have its texture flipped horizontally.
   */
  public final inline var flipH: Boolean
    @JvmName("flipHProperty")
    get() = getFlipH()
    @JvmName("flipHProperty")
    set(`value`) {
      setFlipH(value)
    }

  /**
   * If `true`, the tile will have its texture flipped vertically.
   */
  public final inline var flipV: Boolean
    @JvmName("flipVProperty")
    get() = getFlipV()
    @JvmName("flipVProperty")
    set(`value`) {
      setFlipV(value)
    }

  /**
   * If `true`, the tile will display transposed, i.e. with horizontal and vertical texture UVs
   * swapped.
   */
  public final inline var transpose: Boolean
    @JvmName("transposeProperty")
    get() = getTranspose()
    @JvmName("transposeProperty")
    set(`value`) {
      setTranspose(value)
    }

  /**
   * Offsets the position of where the tile is drawn.
   */
  @CoreTypeLocalCopy
  public final inline var textureOrigin: Vector2i
    @JvmName("textureOriginProperty")
    get() = getTextureOrigin()
    @JvmName("textureOriginProperty")
    set(`value`) {
      setTextureOrigin(value)
    }

  /**
   * Color modulation of the tile.
   */
  @CoreTypeLocalCopy
  public final inline var modulate: Color
    @JvmName("modulateProperty")
    get() = getModulate()
    @JvmName("modulateProperty")
    set(`value`) {
      setModulate(value)
    }

  /**
   * The [Material] to use for this [TileData]. This can be a [CanvasItemMaterial] to use the
   * default shader, or a [ShaderMaterial] to use a custom shader.
   */
  public final inline var material: Material?
    @JvmName("materialProperty")
    get() = getMaterial()
    @JvmName("materialProperty")
    set(`value`) {
      setMaterial(value)
    }

  /**
   * Ordering index of this tile, relative to [TileMap].
   */
  public final inline var zIndex: Int
    @JvmName("zIndexProperty")
    get() = getZIndex()
    @JvmName("zIndexProperty")
    set(`value`) {
      setZIndex(value)
    }

  /**
   * Vertical point of the tile used for determining y-sorted order.
   */
  public final inline var ySortOrigin: Int
    @JvmName("ySortOriginProperty")
    get() = getYSortOrigin()
    @JvmName("ySortOriginProperty")
    set(`value`) {
      setYSortOrigin(value)
    }

  /**
   * ID of the terrain set that the tile uses.
   */
  public final inline var terrainSet: Int
    @JvmName("terrainSetProperty")
    get() = getTerrainSet()
    @JvmName("terrainSetProperty")
    set(`value`) {
      setTerrainSet(value)
    }

  /**
   * ID of the terrain from the terrain set that the tile uses.
   */
  public final inline var terrain: Int
    @JvmName("terrainProperty")
    get() = getTerrain()
    @JvmName("terrainProperty")
    set(`value`) {
      setTerrain(value)
    }

  /**
   * Relative probability of this tile being selected when drawing a pattern of random tiles.
   */
  public final inline var probability: Float
    @JvmName("probabilityProperty")
    get() = getProbability()
    @JvmName("probabilityProperty")
    set(`value`) {
      setProbability(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_TILEDATA, scriptIndex)
  }

  /**
   * Offsets the position of where the tile is drawn.
   *
   * This is a helper function to make dealing with local copies easier.
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = tiledata.textureOrigin
   * //Your changes
   * tiledata.textureOrigin = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun textureOriginMutate(block: Vector2i.() -> Unit): Vector2i = textureOrigin.apply{
      block(this)
      textureOrigin = this
  }


  /**
   * Color modulation of the tile.
   *
   * This is a helper function to make dealing with local copies easier.
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = tiledata.modulate
   * //Your changes
   * tiledata.modulate = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun modulateMutate(block: Color.() -> Unit): Color = modulate.apply{
      block(this)
      modulate = this
  }


  public final fun setFlipH(flipH: Boolean): Unit {
    TransferContext.writeArguments(BOOL to flipH)
    TransferContext.callMethod(ptr, MethodBindings.setFlipHPtr, NIL)
  }

  public final fun getFlipH(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFlipHPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setFlipV(flipV: Boolean): Unit {
    TransferContext.writeArguments(BOOL to flipV)
    TransferContext.callMethod(ptr, MethodBindings.setFlipVPtr, NIL)
  }

  public final fun getFlipV(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFlipVPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setTranspose(transpose: Boolean): Unit {
    TransferContext.writeArguments(BOOL to transpose)
    TransferContext.callMethod(ptr, MethodBindings.setTransposePtr, NIL)
  }

  public final fun getTranspose(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTransposePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setMaterial(material: Material?): Unit {
    TransferContext.writeArguments(OBJECT to material)
    TransferContext.callMethod(ptr, MethodBindings.setMaterialPtr, NIL)
  }

  public final fun getMaterial(): Material? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMaterialPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Material?)
  }

  public final fun setTextureOrigin(textureOrigin: Vector2i): Unit {
    TransferContext.writeArguments(VECTOR2I to textureOrigin)
    TransferContext.callMethod(ptr, MethodBindings.setTextureOriginPtr, NIL)
  }

  public final fun getTextureOrigin(): Vector2i {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTextureOriginPtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I) as Vector2i)
  }

  public final fun setModulate(modulate: Color): Unit {
    TransferContext.writeArguments(COLOR to modulate)
    TransferContext.callMethod(ptr, MethodBindings.setModulatePtr, NIL)
  }

  public final fun getModulate(): Color {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getModulatePtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  public final fun setZIndex(zIndex: Int): Unit {
    TransferContext.writeArguments(LONG to zIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setZIndexPtr, NIL)
  }

  public final fun getZIndex(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getZIndexPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setYSortOrigin(ySortOrigin: Int): Unit {
    TransferContext.writeArguments(LONG to ySortOrigin.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setYSortOriginPtr, NIL)
  }

  public final fun getYSortOrigin(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getYSortOriginPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Sets the occluder for the TileSet occlusion layer with index [layerId].
   */
  public final fun setOccluder(layerId: Int, occluderPolygon: OccluderPolygon2D?): Unit {
    TransferContext.writeArguments(LONG to layerId.toLong(), OBJECT to occluderPolygon)
    TransferContext.callMethod(ptr, MethodBindings.setOccluderPtr, NIL)
  }

  /**
   * Returns the occluder polygon of the tile for the TileSet occlusion layer with index [layerId].
   * [flipH], [flipV], and [transpose] allow transforming the returned polygon.
   */
  @JvmOverloads
  public final fun getOccluder(
    layerId: Int,
    flipH: Boolean = false,
    flipV: Boolean = false,
    transpose: Boolean = false,
  ): OccluderPolygon2D? {
    TransferContext.writeArguments(LONG to layerId.toLong(), BOOL to flipH, BOOL to flipV, BOOL to transpose)
    TransferContext.callMethod(ptr, MethodBindings.getOccluderPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as OccluderPolygon2D?)
  }

  /**
   * Sets the constant linear velocity. This does not move the tile. This linear velocity is applied
   * to objects colliding with this tile. This is useful to create conveyor belts.
   */
  public final fun setConstantLinearVelocity(layerId: Int, velocity: Vector2): Unit {
    TransferContext.writeArguments(LONG to layerId.toLong(), VECTOR2 to velocity)
    TransferContext.callMethod(ptr, MethodBindings.setConstantLinearVelocityPtr, NIL)
  }

  /**
   * Returns the constant linear velocity applied to objects colliding with this tile.
   */
  public final fun getConstantLinearVelocity(layerId: Int): Vector2 {
    TransferContext.writeArguments(LONG to layerId.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getConstantLinearVelocityPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Sets the constant angular velocity. This does not rotate the tile. This angular velocity is
   * applied to objects colliding with this tile.
   */
  public final fun setConstantAngularVelocity(layerId: Int, velocity: Float): Unit {
    TransferContext.writeArguments(LONG to layerId.toLong(), DOUBLE to velocity.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setConstantAngularVelocityPtr, NIL)
  }

  /**
   * Returns the constant angular velocity applied to objects colliding with this tile.
   */
  public final fun getConstantAngularVelocity(layerId: Int): Float {
    TransferContext.writeArguments(LONG to layerId.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getConstantAngularVelocityPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets the polygons count for TileSet physics layer with index [layerId].
   */
  public final fun setCollisionPolygonsCount(layerId: Int, polygonsCount: Int): Unit {
    TransferContext.writeArguments(LONG to layerId.toLong(), LONG to polygonsCount.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setCollisionPolygonsCountPtr, NIL)
  }

  /**
   * Returns how many polygons the tile has for TileSet physics layer with index [layerId].
   */
  public final fun getCollisionPolygonsCount(layerId: Int): Int {
    TransferContext.writeArguments(LONG to layerId.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getCollisionPolygonsCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Adds a collision polygon to the tile on the given TileSet physics layer.
   */
  public final fun addCollisionPolygon(layerId: Int): Unit {
    TransferContext.writeArguments(LONG to layerId.toLong())
    TransferContext.callMethod(ptr, MethodBindings.addCollisionPolygonPtr, NIL)
  }

  /**
   * Removes the polygon at index [polygonIndex] for TileSet physics layer with index [layerId].
   */
  public final fun removeCollisionPolygon(layerId: Int, polygonIndex: Int): Unit {
    TransferContext.writeArguments(LONG to layerId.toLong(), LONG to polygonIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.removeCollisionPolygonPtr, NIL)
  }

  /**
   * Sets the points of the polygon at index [polygonIndex] for TileSet physics layer with index
   * [layerId].
   */
  public final fun setCollisionPolygonPoints(
    layerId: Int,
    polygonIndex: Int,
    polygon: PackedVector2Array,
  ): Unit {
    TransferContext.writeArguments(LONG to layerId.toLong(), LONG to polygonIndex.toLong(), PACKED_VECTOR2_ARRAY to polygon)
    TransferContext.callMethod(ptr, MethodBindings.setCollisionPolygonPointsPtr, NIL)
  }

  /**
   * Returns the points of the polygon at index [polygonIndex] for TileSet physics layer with index
   * [layerId].
   */
  public final fun getCollisionPolygonPoints(layerId: Int, polygonIndex: Int): PackedVector2Array {
    TransferContext.writeArguments(LONG to layerId.toLong(), LONG to polygonIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getCollisionPolygonPointsPtr,
        PACKED_VECTOR2_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY) as PackedVector2Array)
  }

  /**
   * Enables/disables one-way collisions on the polygon at index [polygonIndex] for TileSet physics
   * layer with index [layerId].
   */
  public final fun setCollisionPolygonOneWay(
    layerId: Int,
    polygonIndex: Int,
    oneWay: Boolean,
  ): Unit {
    TransferContext.writeArguments(LONG to layerId.toLong(), LONG to polygonIndex.toLong(), BOOL to oneWay)
    TransferContext.callMethod(ptr, MethodBindings.setCollisionPolygonOneWayPtr, NIL)
  }

  /**
   * Returns whether one-way collisions are enabled for the polygon at index [polygonIndex] for
   * TileSet physics layer with index [layerId].
   */
  public final fun isCollisionPolygonOneWay(layerId: Int, polygonIndex: Int): Boolean {
    TransferContext.writeArguments(LONG to layerId.toLong(), LONG to polygonIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.isCollisionPolygonOneWayPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Enables/disables one-way collisions on the polygon at index [polygonIndex] for TileSet physics
   * layer with index [layerId].
   */
  public final fun setCollisionPolygonOneWayMargin(
    layerId: Int,
    polygonIndex: Int,
    oneWayMargin: Float,
  ): Unit {
    TransferContext.writeArguments(LONG to layerId.toLong(), LONG to polygonIndex.toLong(), DOUBLE to oneWayMargin.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setCollisionPolygonOneWayMarginPtr, NIL)
  }

  /**
   * Returns the one-way margin (for one-way platforms) of the polygon at index [polygonIndex] for
   * TileSet physics layer with index [layerId].
   */
  public final fun getCollisionPolygonOneWayMargin(layerId: Int, polygonIndex: Int): Float {
    TransferContext.writeArguments(LONG to layerId.toLong(), LONG to polygonIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getCollisionPolygonOneWayMarginPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setTerrainSet(terrainSet: Int): Unit {
    TransferContext.writeArguments(LONG to terrainSet.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setTerrainSetPtr, NIL)
  }

  public final fun getTerrainSet(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTerrainSetPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setTerrain(terrain: Int): Unit {
    TransferContext.writeArguments(LONG to terrain.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setTerrainPtr, NIL)
  }

  public final fun getTerrain(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTerrainPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Sets the tile's terrain bit for the given [peeringBit] direction. To check that a direction is
   * valid, use [isValidTerrainPeeringBit].
   */
  public final fun setTerrainPeeringBit(peeringBit: TileSet.CellNeighbor, terrain: Int): Unit {
    TransferContext.writeArguments(LONG to peeringBit.id, LONG to terrain.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setTerrainPeeringBitPtr, NIL)
  }

  /**
   * Returns the tile's terrain bit for the given [peeringBit] direction. To check that a direction
   * is valid, use [isValidTerrainPeeringBit].
   */
  public final fun getTerrainPeeringBit(peeringBit: TileSet.CellNeighbor): Int {
    TransferContext.writeArguments(LONG to peeringBit.id)
    TransferContext.callMethod(ptr, MethodBindings.getTerrainPeeringBitPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns whether the given [peeringBit] direction is valid for this tile.
   */
  public final fun isValidTerrainPeeringBit(peeringBit: TileSet.CellNeighbor): Boolean {
    TransferContext.writeArguments(LONG to peeringBit.id)
    TransferContext.callMethod(ptr, MethodBindings.isValidTerrainPeeringBitPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets the navigation polygon for the TileSet navigation layer with index [layerId].
   */
  public final fun setNavigationPolygon(layerId: Int, navigationPolygon: NavigationPolygon?): Unit {
    TransferContext.writeArguments(LONG to layerId.toLong(), OBJECT to navigationPolygon)
    TransferContext.callMethod(ptr, MethodBindings.setNavigationPolygonPtr, NIL)
  }

  /**
   * Returns the navigation polygon of the tile for the TileSet navigation layer with index
   * [layerId].
   * [flipH], [flipV], and [transpose] allow transforming the returned polygon.
   */
  @JvmOverloads
  public final fun getNavigationPolygon(
    layerId: Int,
    flipH: Boolean = false,
    flipV: Boolean = false,
    transpose: Boolean = false,
  ): NavigationPolygon? {
    TransferContext.writeArguments(LONG to layerId.toLong(), BOOL to flipH, BOOL to flipV, BOOL to transpose)
    TransferContext.callMethod(ptr, MethodBindings.getNavigationPolygonPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as NavigationPolygon?)
  }

  public final fun setProbability(probability: Float): Unit {
    TransferContext.writeArguments(DOUBLE to probability.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setProbabilityPtr, NIL)
  }

  public final fun getProbability(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getProbabilityPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets the tile's custom data value for the TileSet custom data layer with name [layerName].
   */
  public final fun setCustomData(layerName: String, `value`: Any?): Unit {
    TransferContext.writeArguments(STRING to layerName, ANY to value)
    TransferContext.callMethod(ptr, MethodBindings.setCustomDataPtr, NIL)
  }

  /**
   * Returns the custom data value for custom data layer named [layerName].
   */
  public final fun getCustomData(layerName: String): Any? {
    TransferContext.writeArguments(STRING to layerName)
    TransferContext.callMethod(ptr, MethodBindings.getCustomDataPtr, ANY)
    return (TransferContext.readReturnValue(ANY) as Any?)
  }

  /**
   * Sets the tile's custom data value for the TileSet custom data layer with index [layerId].
   */
  public final fun setCustomDataByLayerId(layerId: Int, `value`: Any?): Unit {
    TransferContext.writeArguments(LONG to layerId.toLong(), ANY to value)
    TransferContext.callMethod(ptr, MethodBindings.setCustomDataByLayerIdPtr, NIL)
  }

  /**
   * Returns the custom data value for custom data layer with index [layerId].
   */
  public final fun getCustomDataByLayerId(layerId: Int): Any? {
    TransferContext.writeArguments(LONG to layerId.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getCustomDataByLayerIdPtr, ANY)
    return (TransferContext.readReturnValue(ANY) as Any?)
  }

  public companion object

  public object MethodBindings {
    internal val setFlipHPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileData", "set_flip_h", 2586408642)

    internal val getFlipHPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileData", "get_flip_h", 36873697)

    internal val setFlipVPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileData", "set_flip_v", 2586408642)

    internal val getFlipVPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileData", "get_flip_v", 36873697)

    internal val setTransposePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileData", "set_transpose", 2586408642)

    internal val getTransposePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileData", "get_transpose", 36873697)

    internal val setMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileData", "set_material", 2757459619)

    internal val getMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileData", "get_material", 5934680)

    internal val setTextureOriginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileData", "set_texture_origin", 1130785943)

    internal val getTextureOriginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileData", "get_texture_origin", 3690982128)

    internal val setModulatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileData", "set_modulate", 2920490490)

    internal val getModulatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileData", "get_modulate", 3444240500)

    internal val setZIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileData", "set_z_index", 1286410249)

    internal val getZIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileData", "get_z_index", 3905245786)

    internal val setYSortOriginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileData", "set_y_sort_origin", 1286410249)

    internal val getYSortOriginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileData", "get_y_sort_origin", 3905245786)

    internal val setOccluderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileData", "set_occluder", 914399637)

    internal val getOccluderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileData", "get_occluder", 2377324099)

    internal val setConstantLinearVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileData", "set_constant_linear_velocity", 163021252)

    internal val getConstantLinearVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileData", "get_constant_linear_velocity", 2299179447)

    internal val setConstantAngularVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileData", "set_constant_angular_velocity", 1602489585)

    internal val getConstantAngularVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileData", "get_constant_angular_velocity", 2339986948)

    internal val setCollisionPolygonsCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileData", "set_collision_polygons_count", 3937882851)

    internal val getCollisionPolygonsCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileData", "get_collision_polygons_count", 923996154)

    internal val addCollisionPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileData", "add_collision_polygon", 1286410249)

    internal val removeCollisionPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileData", "remove_collision_polygon", 3937882851)

    internal val setCollisionPolygonPointsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileData", "set_collision_polygon_points", 3230546541)

    internal val getCollisionPolygonPointsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileData", "get_collision_polygon_points", 103942801)

    internal val setCollisionPolygonOneWayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileData", "set_collision_polygon_one_way", 1383440665)

    internal val isCollisionPolygonOneWayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileData", "is_collision_polygon_one_way", 2522259332)

    internal val setCollisionPolygonOneWayMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileData", "set_collision_polygon_one_way_margin", 3506521499)

    internal val getCollisionPolygonOneWayMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileData", "get_collision_polygon_one_way_margin", 3085491603)

    internal val setTerrainSetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileData", "set_terrain_set", 1286410249)

    internal val getTerrainSetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileData", "get_terrain_set", 3905245786)

    internal val setTerrainPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileData", "set_terrain", 1286410249)

    internal val getTerrainPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileData", "get_terrain", 3905245786)

    internal val setTerrainPeeringBitPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileData", "set_terrain_peering_bit", 1084452308)

    internal val getTerrainPeeringBitPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileData", "get_terrain_peering_bit", 3831796792)

    internal val isValidTerrainPeeringBitPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileData", "is_valid_terrain_peering_bit", 845723972)

    internal val setNavigationPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileData", "set_navigation_polygon", 2224691167)

    internal val getNavigationPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileData", "get_navigation_polygon", 2907127272)

    internal val setProbabilityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileData", "set_probability", 373806689)

    internal val getProbabilityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileData", "get_probability", 1740695150)

    internal val setCustomDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileData", "set_custom_data", 402577236)

    internal val getCustomDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileData", "get_custom_data", 1868160156)

    internal val setCustomDataByLayerIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileData", "set_custom_data_by_layer_id", 2152698145)

    internal val getCustomDataByLayerIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileData", "get_custom_data_by_layer_id", 4227898402)
  }
}
