// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier", "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST", "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT", "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.RID
import godot.core.Rect2
import godot.core.Signal0
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.RECT2
import godot.core.VariantParser._RID
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

/**
 * A traversable 2D region based on a [NavigationPolygon] that [NavigationAgent2D]s can use for pathfinding.
 *
 * Two regions can be connected to each other if they share a similar edge. You can set the minimum distance between two vertices required to connect two edges by using [NavigationServer2D.mapSetEdgeConnectionMargin].
 *
 * **Note:** Overlapping two regions' navigation polygons is not enough for connecting two regions. They must share a similar edge.
 *
 * The pathfinding cost of entering a region from another region can be controlled with the [enterCost] value.
 *
 * **Note:** This value is not added to the path cost when the start position is already inside this region.
 *
 * The pathfinding cost of traveling distances inside this region can be controlled with the [travelCost] multiplier.
 *
 * **Note:** This node caches changes to its properties, so if you make changes to the underlying region [RID] in [NavigationServer2D], they will not be reflected in this node's properties.
 */
@GodotBaseType
public open class NavigationRegion2D : Node2D() {
  /**
   * Emitted when the used navigation polygon is replaced or changes to the internals of the current navigation polygon are committed.
   */
  public val navigationPolygonChanged: Signal0 by Signal0

  /**
   * Emitted when a navigation polygon bake operation is completed.
   */
  public val bakeFinished: Signal0 by Signal0

  /**
   * The [NavigationPolygon] resource to use.
   */
  public final inline var navigationPolygon: NavigationPolygon?
    @JvmName("navigationPolygonProperty")
    get() = getNavigationPolygon()
    @JvmName("navigationPolygonProperty")
    set(`value`) {
      setNavigationPolygon(value)
    }

  /**
   * Determines if the [NavigationRegion2D] is enabled or disabled.
   */
  public final inline var enabled: Boolean
    @JvmName("enabledProperty")
    get() = isEnabled()
    @JvmName("enabledProperty")
    set(`value`) {
      setEnabled(value)
    }

  /**
   * If enabled the navigation region will use edge connections to connect with other navigation regions within proximity of the navigation map edge connection margin.
   */
  public final inline var useEdgeConnections: Boolean
    @JvmName("useEdgeConnectionsProperty")
    get() = getUseEdgeConnections()
    @JvmName("useEdgeConnectionsProperty")
    set(`value`) {
      setUseEdgeConnections(value)
    }

  /**
   * A bitfield determining all navigation layers the region belongs to. These navigation layers can be checked upon when requesting a path with [NavigationServer2D.mapGetPath].
   */
  public final inline var navigationLayers: Long
    @JvmName("navigationLayersProperty")
    get() = getNavigationLayers()
    @JvmName("navigationLayersProperty")
    set(`value`) {
      setNavigationLayers(value)
    }

  /**
   * When pathfinding enters this region's navigation mesh from another regions navigation mesh the [enterCost] value is added to the path distance for determining the shortest path.
   */
  public final inline var enterCost: Float
    @JvmName("enterCostProperty")
    get() = getEnterCost()
    @JvmName("enterCostProperty")
    set(`value`) {
      setEnterCost(value)
    }

  /**
   * When pathfinding moves inside this region's navigation mesh the traveled distances are multiplied with [travelCost] for determining the shortest path.
   */
  public final inline var travelCost: Float
    @JvmName("travelCostProperty")
    get() = getTravelCost()
    @JvmName("travelCostProperty")
    set(`value`) {
      setTravelCost(value)
    }

  override fun new(scriptIndex: Int) {
    createNativeObject(389, scriptIndex)
  }

  /**
   * Returns the [RID] of this region on the [NavigationServer2D]. Combined with [NavigationServer2D.mapGetClosestPointOwner] can be used to identify the [NavigationRegion2D] closest to a point on the merged navigation map.
   */
  public final fun getRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRidPtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  public final fun setNavigationPolygon(navigationPolygon: NavigationPolygon?) {
    TransferContext.writeArguments(OBJECT to navigationPolygon)
    TransferContext.callMethod(ptr, MethodBindings.setNavigationPolygonPtr, NIL)
  }

  public final fun getNavigationPolygon(): NavigationPolygon? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getNavigationPolygonPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as NavigationPolygon?)
  }

  public final fun setEnabled(enabled: Boolean) {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setEnabledPtr, NIL)
  }

  public final fun isEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets the [RID] of the navigation map this region should use. By default the region will automatically join the [World2D] default navigation map so this function is only required to override the default map.
   */
  public final fun setNavigationMap(navigationMap: RID) {
    TransferContext.writeArguments(_RID to navigationMap)
    TransferContext.callMethod(ptr, MethodBindings.setNavigationMapPtr, NIL)
  }

  /**
   * Returns the current navigation map [RID] used by this region.
   */
  public final fun getNavigationMap(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getNavigationMapPtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  public final fun setUseEdgeConnections(enabled: Boolean) {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setUseEdgeConnectionsPtr, NIL)
  }

  public final fun getUseEdgeConnections(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getUseEdgeConnectionsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setNavigationLayers(navigationLayers: Long) {
    TransferContext.writeArguments(LONG to navigationLayers)
    TransferContext.callMethod(ptr, MethodBindings.setNavigationLayersPtr, NIL)
  }

  public final fun getNavigationLayers(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getNavigationLayersPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Based on [value], enables or disables the specified layer in the [navigationLayers] bitmask, given a [layerNumber] between 1 and 32.
   */
  public final fun setNavigationLayerValue(layerNumber: Int, `value`: Boolean) {
    TransferContext.writeArguments(LONG to layerNumber.toLong(), BOOL to value)
    TransferContext.callMethod(ptr, MethodBindings.setNavigationLayerValuePtr, NIL)
  }

  /**
   * Returns whether or not the specified layer of the [navigationLayers] bitmask is enabled, given a [layerNumber] between 1 and 32.
   */
  public final fun getNavigationLayerValue(layerNumber: Int): Boolean {
    TransferContext.writeArguments(LONG to layerNumber.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getNavigationLayerValuePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the [RID] of this region on the [NavigationServer2D].
   */
  public final fun getRegionRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRegionRidPtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  public final fun setEnterCost(enterCost: Float) {
    TransferContext.writeArguments(DOUBLE to enterCost.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setEnterCostPtr, NIL)
  }

  public final fun getEnterCost(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getEnterCostPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setTravelCost(travelCost: Float) {
    TransferContext.writeArguments(DOUBLE to travelCost.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setTravelCostPtr, NIL)
  }

  public final fun getTravelCost(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTravelCostPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Bakes the [NavigationPolygon]. If [onThread] is set to `true` (default), the baking is done on a separate thread.
   */
  @JvmOverloads
  public final fun bakeNavigationPolygon(onThread: Boolean = true) {
    TransferContext.writeArguments(BOOL to onThread)
    TransferContext.callMethod(ptr, MethodBindings.bakeNavigationPolygonPtr, NIL)
  }

  /**
   * Returns `true` when the [NavigationPolygon] is being baked on a background thread.
   */
  public final fun isBaking(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isBakingPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the axis-aligned rectangle for the region's transformed navigation mesh.
   */
  public final fun getBounds(): Rect2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBoundsPtr, RECT2)
    return (TransferContext.readReturnValue(RECT2) as Rect2)
  }

  public companion object

  public object MethodBindings {
    internal val getRidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion2D", "get_rid", 2_944_877_500)

    internal val setNavigationPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion2D", "set_navigation_polygon", 1_515_040_758)

    internal val getNavigationPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion2D", "get_navigation_polygon", 1_046_532_237)

    internal val setEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion2D", "set_enabled", 2_586_408_642)

    internal val isEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion2D", "is_enabled", 36_873_697)

    internal val setNavigationMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion2D", "set_navigation_map", 2_722_037_293)

    internal val getNavigationMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion2D", "get_navigation_map", 2_944_877_500)

    internal val setUseEdgeConnectionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion2D", "set_use_edge_connections", 2_586_408_642)

    internal val getUseEdgeConnectionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion2D", "get_use_edge_connections", 36_873_697)

    internal val setNavigationLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion2D", "set_navigation_layers", 1_286_410_249)

    internal val getNavigationLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion2D", "get_navigation_layers", 3_905_245_786)

    internal val setNavigationLayerValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion2D", "set_navigation_layer_value", 300_928_843)

    internal val getNavigationLayerValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion2D", "get_navigation_layer_value", 1_116_898_809)

    internal val getRegionRidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion2D", "get_region_rid", 2_944_877_500)

    internal val setEnterCostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion2D", "set_enter_cost", 373_806_689)

    internal val getEnterCostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion2D", "get_enter_cost", 1_740_695_150)

    internal val setTravelCostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion2D", "set_travel_cost", 373_806_689)

    internal val getTravelCostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion2D", "get_travel_cost", 1_740_695_150)

    internal val bakeNavigationPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion2D", "bake_navigation_polygon", 3_216_645_846)

    internal val isBakingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion2D", "is_baking", 36_873_697)

    internal val getBoundsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion2D", "get_bounds", 1_639_390_495)
  }
}
