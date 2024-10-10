// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
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
import godot.util.Internals
import godot.util.VoidPtr
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

private const val ENGINE_CLASS_TILEDATA_INDEX: Int = 593

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
    Internals.callConstructor(this, ENGINE_CLASS_TILEDATA_INDEX, scriptIndex)
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
    Internals.writeArguments(BOOL to flipH)
    Internals.callMethod(rawPtr, MethodBindings.setFlipHPtr, NIL)
  }

  public final fun getFlipH(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getFlipHPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setFlipV(flipV: Boolean): Unit {
    Internals.writeArguments(BOOL to flipV)
    Internals.callMethod(rawPtr, MethodBindings.setFlipVPtr, NIL)
  }

  public final fun getFlipV(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getFlipVPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setTranspose(transpose: Boolean): Unit {
    Internals.writeArguments(BOOL to transpose)
    Internals.callMethod(rawPtr, MethodBindings.setTransposePtr, NIL)
  }

  public final fun getTranspose(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTransposePtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setMaterial(material: Material?): Unit {
    Internals.writeArguments(OBJECT to material)
    Internals.callMethod(rawPtr, MethodBindings.setMaterialPtr, NIL)
  }

  public final fun getMaterial(): Material? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getMaterialPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Material?)
  }

  public final fun setTextureOrigin(textureOrigin: Vector2i): Unit {
    Internals.writeArguments(VECTOR2I to textureOrigin)
    Internals.callMethod(rawPtr, MethodBindings.setTextureOriginPtr, NIL)
  }

  public final fun getTextureOrigin(): Vector2i {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTextureOriginPtr, VECTOR2I)
    return (Internals.readReturnValue(VECTOR2I) as Vector2i)
  }

  public final fun setModulate(modulate: Color): Unit {
    Internals.writeArguments(COLOR to modulate)
    Internals.callMethod(rawPtr, MethodBindings.setModulatePtr, NIL)
  }

  public final fun getModulate(): Color {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getModulatePtr, COLOR)
    return (Internals.readReturnValue(COLOR) as Color)
  }

  public final fun setZIndex(zIndex: Int): Unit {
    Internals.writeArguments(LONG to zIndex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setZIndexPtr, NIL)
  }

  public final fun getZIndex(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getZIndexPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setYSortOrigin(ySortOrigin: Int): Unit {
    Internals.writeArguments(LONG to ySortOrigin.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setYSortOriginPtr, NIL)
  }

  public final fun getYSortOrigin(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getYSortOriginPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Sets the occluder for the TileSet occlusion layer with index [layerId].
   */
  public final fun setOccluder(layerId: Int, occluderPolygon: OccluderPolygon2D?): Unit {
    Internals.writeArguments(LONG to layerId.toLong(), OBJECT to occluderPolygon)
    Internals.callMethod(rawPtr, MethodBindings.setOccluderPtr, NIL)
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
    Internals.writeArguments(LONG to layerId.toLong(), BOOL to flipH, BOOL to flipV, BOOL to transpose)
    Internals.callMethod(rawPtr, MethodBindings.getOccluderPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as OccluderPolygon2D?)
  }

  /**
   * Sets the constant linear velocity. This does not move the tile. This linear velocity is applied
   * to objects colliding with this tile. This is useful to create conveyor belts.
   */
  public final fun setConstantLinearVelocity(layerId: Int, velocity: Vector2): Unit {
    Internals.writeArguments(LONG to layerId.toLong(), VECTOR2 to velocity)
    Internals.callMethod(rawPtr, MethodBindings.setConstantLinearVelocityPtr, NIL)
  }

  /**
   * Returns the constant linear velocity applied to objects colliding with this tile.
   */
  public final fun getConstantLinearVelocity(layerId: Int): Vector2 {
    Internals.writeArguments(LONG to layerId.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getConstantLinearVelocityPtr, VECTOR2)
    return (Internals.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Sets the constant angular velocity. This does not rotate the tile. This angular velocity is
   * applied to objects colliding with this tile.
   */
  public final fun setConstantAngularVelocity(layerId: Int, velocity: Float): Unit {
    Internals.writeArguments(LONG to layerId.toLong(), DOUBLE to velocity.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setConstantAngularVelocityPtr, NIL)
  }

  /**
   * Returns the constant angular velocity applied to objects colliding with this tile.
   */
  public final fun getConstantAngularVelocity(layerId: Int): Float {
    Internals.writeArguments(LONG to layerId.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getConstantAngularVelocityPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets the polygons count for TileSet physics layer with index [layerId].
   */
  public final fun setCollisionPolygonsCount(layerId: Int, polygonsCount: Int): Unit {
    Internals.writeArguments(LONG to layerId.toLong(), LONG to polygonsCount.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setCollisionPolygonsCountPtr, NIL)
  }

  /**
   * Returns how many polygons the tile has for TileSet physics layer with index [layerId].
   */
  public final fun getCollisionPolygonsCount(layerId: Int): Int {
    Internals.writeArguments(LONG to layerId.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getCollisionPolygonsCountPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Adds a collision polygon to the tile on the given TileSet physics layer.
   */
  public final fun addCollisionPolygon(layerId: Int): Unit {
    Internals.writeArguments(LONG to layerId.toLong())
    Internals.callMethod(rawPtr, MethodBindings.addCollisionPolygonPtr, NIL)
  }

  /**
   * Removes the polygon at index [polygonIndex] for TileSet physics layer with index [layerId].
   */
  public final fun removeCollisionPolygon(layerId: Int, polygonIndex: Int): Unit {
    Internals.writeArguments(LONG to layerId.toLong(), LONG to polygonIndex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.removeCollisionPolygonPtr, NIL)
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
    Internals.writeArguments(LONG to layerId.toLong(), LONG to polygonIndex.toLong(), PACKED_VECTOR2_ARRAY to polygon)
    Internals.callMethod(rawPtr, MethodBindings.setCollisionPolygonPointsPtr, NIL)
  }

  /**
   * Returns the points of the polygon at index [polygonIndex] for TileSet physics layer with index
   * [layerId].
   */
  public final fun getCollisionPolygonPoints(layerId: Int, polygonIndex: Int): PackedVector2Array {
    Internals.writeArguments(LONG to layerId.toLong(), LONG to polygonIndex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getCollisionPolygonPointsPtr, PACKED_VECTOR2_ARRAY)
    return (Internals.readReturnValue(PACKED_VECTOR2_ARRAY) as PackedVector2Array)
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
    Internals.writeArguments(LONG to layerId.toLong(), LONG to polygonIndex.toLong(), BOOL to oneWay)
    Internals.callMethod(rawPtr, MethodBindings.setCollisionPolygonOneWayPtr, NIL)
  }

  /**
   * Returns whether one-way collisions are enabled for the polygon at index [polygonIndex] for
   * TileSet physics layer with index [layerId].
   */
  public final fun isCollisionPolygonOneWay(layerId: Int, polygonIndex: Int): Boolean {
    Internals.writeArguments(LONG to layerId.toLong(), LONG to polygonIndex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.isCollisionPolygonOneWayPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
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
    Internals.writeArguments(LONG to layerId.toLong(), LONG to polygonIndex.toLong(), DOUBLE to oneWayMargin.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setCollisionPolygonOneWayMarginPtr, NIL)
  }

  /**
   * Returns the one-way margin (for one-way platforms) of the polygon at index [polygonIndex] for
   * TileSet physics layer with index [layerId].
   */
  public final fun getCollisionPolygonOneWayMargin(layerId: Int, polygonIndex: Int): Float {
    Internals.writeArguments(LONG to layerId.toLong(), LONG to polygonIndex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getCollisionPolygonOneWayMarginPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setTerrainSet(terrainSet: Int): Unit {
    Internals.writeArguments(LONG to terrainSet.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setTerrainSetPtr, NIL)
  }

  public final fun getTerrainSet(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTerrainSetPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setTerrain(terrain: Int): Unit {
    Internals.writeArguments(LONG to terrain.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setTerrainPtr, NIL)
  }

  public final fun getTerrain(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTerrainPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Sets the tile's terrain bit for the given [peeringBit] direction. To check that a direction is
   * valid, use [isValidTerrainPeeringBit].
   */
  public final fun setTerrainPeeringBit(peeringBit: TileSet.CellNeighbor, terrain: Int): Unit {
    Internals.writeArguments(LONG to peeringBit.id, LONG to terrain.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setTerrainPeeringBitPtr, NIL)
  }

  /**
   * Returns the tile's terrain bit for the given [peeringBit] direction. To check that a direction
   * is valid, use [isValidTerrainPeeringBit].
   */
  public final fun getTerrainPeeringBit(peeringBit: TileSet.CellNeighbor): Int {
    Internals.writeArguments(LONG to peeringBit.id)
    Internals.callMethod(rawPtr, MethodBindings.getTerrainPeeringBitPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns whether the given [peeringBit] direction is valid for this tile.
   */
  public final fun isValidTerrainPeeringBit(peeringBit: TileSet.CellNeighbor): Boolean {
    Internals.writeArguments(LONG to peeringBit.id)
    Internals.callMethod(rawPtr, MethodBindings.isValidTerrainPeeringBitPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets the navigation polygon for the TileSet navigation layer with index [layerId].
   */
  public final fun setNavigationPolygon(layerId: Int, navigationPolygon: NavigationPolygon?): Unit {
    Internals.writeArguments(LONG to layerId.toLong(), OBJECT to navigationPolygon)
    Internals.callMethod(rawPtr, MethodBindings.setNavigationPolygonPtr, NIL)
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
    Internals.writeArguments(LONG to layerId.toLong(), BOOL to flipH, BOOL to flipV, BOOL to transpose)
    Internals.callMethod(rawPtr, MethodBindings.getNavigationPolygonPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as NavigationPolygon?)
  }

  public final fun setProbability(probability: Float): Unit {
    Internals.writeArguments(DOUBLE to probability.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setProbabilityPtr, NIL)
  }

  public final fun getProbability(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getProbabilityPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets the tile's custom data value for the TileSet custom data layer with name [layerName].
   */
  public final fun setCustomData(layerName: String, `value`: Any?): Unit {
    Internals.writeArguments(STRING to layerName, ANY to value)
    Internals.callMethod(rawPtr, MethodBindings.setCustomDataPtr, NIL)
  }

  /**
   * Returns the custom data value for custom data layer named [layerName].
   */
  public final fun getCustomData(layerName: String): Any? {
    Internals.writeArguments(STRING to layerName)
    Internals.callMethod(rawPtr, MethodBindings.getCustomDataPtr, ANY)
    return (Internals.readReturnValue(ANY) as Any?)
  }

  /**
   * Sets the tile's custom data value for the TileSet custom data layer with index [layerId].
   */
  public final fun setCustomDataByLayerId(layerId: Int, `value`: Any?): Unit {
    Internals.writeArguments(LONG to layerId.toLong(), ANY to value)
    Internals.callMethod(rawPtr, MethodBindings.setCustomDataByLayerIdPtr, NIL)
  }

  /**
   * Returns the custom data value for custom data layer with index [layerId].
   */
  public final fun getCustomDataByLayerId(layerId: Int): Any? {
    Internals.writeArguments(LONG to layerId.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getCustomDataByLayerIdPtr, ANY)
    return (Internals.readReturnValue(ANY) as Any?)
  }

  public companion object

  internal object MethodBindings {
    public val setFlipHPtr: VoidPtr =
        Internals.getMethodBindPtr("TileData", "set_flip_h", 2586408642)

    public val getFlipHPtr: VoidPtr = Internals.getMethodBindPtr("TileData", "get_flip_h", 36873697)

    public val setFlipVPtr: VoidPtr =
        Internals.getMethodBindPtr("TileData", "set_flip_v", 2586408642)

    public val getFlipVPtr: VoidPtr = Internals.getMethodBindPtr("TileData", "get_flip_v", 36873697)

    public val setTransposePtr: VoidPtr =
        Internals.getMethodBindPtr("TileData", "set_transpose", 2586408642)

    public val getTransposePtr: VoidPtr =
        Internals.getMethodBindPtr("TileData", "get_transpose", 36873697)

    public val setMaterialPtr: VoidPtr =
        Internals.getMethodBindPtr("TileData", "set_material", 2757459619)

    public val getMaterialPtr: VoidPtr =
        Internals.getMethodBindPtr("TileData", "get_material", 5934680)

    public val setTextureOriginPtr: VoidPtr =
        Internals.getMethodBindPtr("TileData", "set_texture_origin", 1130785943)

    public val getTextureOriginPtr: VoidPtr =
        Internals.getMethodBindPtr("TileData", "get_texture_origin", 3690982128)

    public val setModulatePtr: VoidPtr =
        Internals.getMethodBindPtr("TileData", "set_modulate", 2920490490)

    public val getModulatePtr: VoidPtr =
        Internals.getMethodBindPtr("TileData", "get_modulate", 3444240500)

    public val setZIndexPtr: VoidPtr =
        Internals.getMethodBindPtr("TileData", "set_z_index", 1286410249)

    public val getZIndexPtr: VoidPtr =
        Internals.getMethodBindPtr("TileData", "get_z_index", 3905245786)

    public val setYSortOriginPtr: VoidPtr =
        Internals.getMethodBindPtr("TileData", "set_y_sort_origin", 1286410249)

    public val getYSortOriginPtr: VoidPtr =
        Internals.getMethodBindPtr("TileData", "get_y_sort_origin", 3905245786)

    public val setOccluderPtr: VoidPtr =
        Internals.getMethodBindPtr("TileData", "set_occluder", 914399637)

    public val getOccluderPtr: VoidPtr =
        Internals.getMethodBindPtr("TileData", "get_occluder", 2377324099)

    public val setConstantLinearVelocityPtr: VoidPtr =
        Internals.getMethodBindPtr("TileData", "set_constant_linear_velocity", 163021252)

    public val getConstantLinearVelocityPtr: VoidPtr =
        Internals.getMethodBindPtr("TileData", "get_constant_linear_velocity", 2299179447)

    public val setConstantAngularVelocityPtr: VoidPtr =
        Internals.getMethodBindPtr("TileData", "set_constant_angular_velocity", 1602489585)

    public val getConstantAngularVelocityPtr: VoidPtr =
        Internals.getMethodBindPtr("TileData", "get_constant_angular_velocity", 2339986948)

    public val setCollisionPolygonsCountPtr: VoidPtr =
        Internals.getMethodBindPtr("TileData", "set_collision_polygons_count", 3937882851)

    public val getCollisionPolygonsCountPtr: VoidPtr =
        Internals.getMethodBindPtr("TileData", "get_collision_polygons_count", 923996154)

    public val addCollisionPolygonPtr: VoidPtr =
        Internals.getMethodBindPtr("TileData", "add_collision_polygon", 1286410249)

    public val removeCollisionPolygonPtr: VoidPtr =
        Internals.getMethodBindPtr("TileData", "remove_collision_polygon", 3937882851)

    public val setCollisionPolygonPointsPtr: VoidPtr =
        Internals.getMethodBindPtr("TileData", "set_collision_polygon_points", 3230546541)

    public val getCollisionPolygonPointsPtr: VoidPtr =
        Internals.getMethodBindPtr("TileData", "get_collision_polygon_points", 103942801)

    public val setCollisionPolygonOneWayPtr: VoidPtr =
        Internals.getMethodBindPtr("TileData", "set_collision_polygon_one_way", 1383440665)

    public val isCollisionPolygonOneWayPtr: VoidPtr =
        Internals.getMethodBindPtr("TileData", "is_collision_polygon_one_way", 2522259332)

    public val setCollisionPolygonOneWayMarginPtr: VoidPtr =
        Internals.getMethodBindPtr("TileData", "set_collision_polygon_one_way_margin", 3506521499)

    public val getCollisionPolygonOneWayMarginPtr: VoidPtr =
        Internals.getMethodBindPtr("TileData", "get_collision_polygon_one_way_margin", 3085491603)

    public val setTerrainSetPtr: VoidPtr =
        Internals.getMethodBindPtr("TileData", "set_terrain_set", 1286410249)

    public val getTerrainSetPtr: VoidPtr =
        Internals.getMethodBindPtr("TileData", "get_terrain_set", 3905245786)

    public val setTerrainPtr: VoidPtr =
        Internals.getMethodBindPtr("TileData", "set_terrain", 1286410249)

    public val getTerrainPtr: VoidPtr =
        Internals.getMethodBindPtr("TileData", "get_terrain", 3905245786)

    public val setTerrainPeeringBitPtr: VoidPtr =
        Internals.getMethodBindPtr("TileData", "set_terrain_peering_bit", 1084452308)

    public val getTerrainPeeringBitPtr: VoidPtr =
        Internals.getMethodBindPtr("TileData", "get_terrain_peering_bit", 3831796792)

    public val isValidTerrainPeeringBitPtr: VoidPtr =
        Internals.getMethodBindPtr("TileData", "is_valid_terrain_peering_bit", 845723972)

    public val setNavigationPolygonPtr: VoidPtr =
        Internals.getMethodBindPtr("TileData", "set_navigation_polygon", 2224691167)

    public val getNavigationPolygonPtr: VoidPtr =
        Internals.getMethodBindPtr("TileData", "get_navigation_polygon", 2907127272)

    public val setProbabilityPtr: VoidPtr =
        Internals.getMethodBindPtr("TileData", "set_probability", 373806689)

    public val getProbabilityPtr: VoidPtr =
        Internals.getMethodBindPtr("TileData", "get_probability", 1740695150)

    public val setCustomDataPtr: VoidPtr =
        Internals.getMethodBindPtr("TileData", "set_custom_data", 402577236)

    public val getCustomDataPtr: VoidPtr =
        Internals.getMethodBindPtr("TileData", "get_custom_data", 1868160156)

    public val setCustomDataByLayerIdPtr: VoidPtr =
        Internals.getMethodBindPtr("TileData", "set_custom_data_by_layer_id", 2152698145)

    public val getCustomDataByLayerIdPtr: VoidPtr =
        Internals.getMethodBindPtr("TileData", "get_custom_data_by_layer_id", 4227898402)
  }
}
