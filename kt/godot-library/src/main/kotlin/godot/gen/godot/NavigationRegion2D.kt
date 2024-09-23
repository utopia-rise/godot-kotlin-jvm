// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.RID
import godot.core.Signal0
import godot.core.TypeManager
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser._RID
import godot.core.memory.TransferContext
import godot.core.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

/**
 * A traversable 2D region based on a [NavigationPolygon] that [NavigationAgent2D]s can use for
 * pathfinding.
 * Two regions can be connected to each other if they share a similar edge. You can set the minimum
 * distance between two vertices required to connect two edges by using
 * [NavigationServer2D.mapSetEdgeConnectionMargin].
 * **Note:** Overlapping two regions' navigation polygons is not enough for connecting two regions.
 * They must share a similar edge.
 * The pathfinding cost of entering a region from another region can be controlled with the
 * [enterCost] value.
 * **Note:** This value is not added to the path cost when the start position is already inside this
 * region.
 * The pathfinding cost of traveling distances inside this region can be controlled with the
 * [travelCost] multiplier.
 * **Note:** This node caches changes to its properties, so if you make changes to the underlying
 * region [RID] in [NavigationServer2D], they will not be reflected in this node's properties.
 */
@GodotBaseType
public open class NavigationRegion2D : Node2D() {
  /**
   * Emitted when the used navigation polygon is replaced or changes to the internals of the current
   * navigation polygon are committed.
   */
  public val navigationPolygonChanged: Signal0 by signal()

  /**
   * Emitted when a navigation polygon bake operation is completed.
   */
  public val bakeFinished: Signal0 by signal()

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
   * If enabled the navigation region will use edge connections to connect with other navigation
   * regions within proximity of the navigation map edge connection margin.
   */
  public final inline var useEdgeConnections: Boolean
    @JvmName("useEdgeConnectionsProperty")
    get() = getUseEdgeConnections()
    @JvmName("useEdgeConnectionsProperty")
    set(`value`) {
      setUseEdgeConnections(value)
    }

  /**
   * A bitfield determining all navigation layers the region belongs to. These navigation layers can
   * be checked upon when requesting a path with [NavigationServer2D.mapGetPath].
   */
  public final inline var navigationLayers: Long
    @JvmName("navigationLayersProperty")
    get() = getNavigationLayers()
    @JvmName("navigationLayersProperty")
    set(`value`) {
      setNavigationLayers(value)
    }

  /**
   * When pathfinding enters this region's navigation mesh from another regions navigation mesh the
   * [enterCost] value is added to the path distance for determining the shortest path.
   */
  public final inline var enterCost: Float
    @JvmName("enterCostProperty")
    get() = getEnterCost()
    @JvmName("enterCostProperty")
    set(`value`) {
      setEnterCost(value)
    }

  /**
   * When pathfinding moves inside this region's navigation mesh the traveled distances are
   * multiplied with [travelCost] for determining the shortest path.
   */
  public final inline var travelCost: Float
    @JvmName("travelCostProperty")
    get() = getTravelCost()
    @JvmName("travelCostProperty")
    set(`value`) {
      setTravelCost(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_NAVIGATIONREGION2D, scriptIndex)
  }

  /**
   * Returns the [RID] of this region on the [NavigationServer2D]. Combined with
   * [NavigationServer2D.mapGetClosestPointOwner] can be used to identify the [NavigationRegion2D]
   * closest to a point on the merged navigation map.
   */
  public final fun getRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRidPtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  public final fun setNavigationPolygon(navigationPolygon: NavigationPolygon?): Unit {
    TransferContext.writeArguments(OBJECT to navigationPolygon)
    TransferContext.callMethod(rawPtr, MethodBindings.setNavigationPolygonPtr, NIL)
  }

  public final fun getNavigationPolygon(): NavigationPolygon? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getNavigationPolygonPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as NavigationPolygon?)
  }

  public final fun setEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.setEnabledPtr, NIL)
  }

  public final fun isEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets the [RID] of the navigation map this region should use. By default the region will
   * automatically join the [World2D] default navigation map so this function is only required to
   * override the default map.
   */
  public final fun setNavigationMap(navigationMap: RID): Unit {
    TransferContext.writeArguments(_RID to navigationMap)
    TransferContext.callMethod(rawPtr, MethodBindings.setNavigationMapPtr, NIL)
  }

  /**
   * Returns the current navigation map [RID] used by this region.
   */
  public final fun getNavigationMap(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getNavigationMapPtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  public final fun setUseEdgeConnections(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.setUseEdgeConnectionsPtr, NIL)
  }

  public final fun getUseEdgeConnections(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getUseEdgeConnectionsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setNavigationLayers(navigationLayers: Long): Unit {
    TransferContext.writeArguments(LONG to navigationLayers)
    TransferContext.callMethod(rawPtr, MethodBindings.setNavigationLayersPtr, NIL)
  }

  public final fun getNavigationLayers(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getNavigationLayersPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Based on [value], enables or disables the specified layer in the [navigationLayers] bitmask,
   * given a [layerNumber] between 1 and 32.
   */
  public final fun setNavigationLayerValue(layerNumber: Int, `value`: Boolean): Unit {
    TransferContext.writeArguments(LONG to layerNumber.toLong(), BOOL to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setNavigationLayerValuePtr, NIL)
  }

  /**
   * Returns whether or not the specified layer of the [navigationLayers] bitmask is enabled, given
   * a [layerNumber] between 1 and 32.
   */
  public final fun getNavigationLayerValue(layerNumber: Int): Boolean {
    TransferContext.writeArguments(LONG to layerNumber.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getNavigationLayerValuePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the [RID] of this region on the [NavigationServer2D].
   */
  public final fun getRegionRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRegionRidPtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  public final fun setEnterCost(enterCost: Float): Unit {
    TransferContext.writeArguments(DOUBLE to enterCost.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setEnterCostPtr, NIL)
  }

  public final fun getEnterCost(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getEnterCostPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setTravelCost(travelCost: Float): Unit {
    TransferContext.writeArguments(DOUBLE to travelCost.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setTravelCostPtr, NIL)
  }

  public final fun getTravelCost(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTravelCostPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Bakes the [NavigationPolygon]. If [onThread] is set to `true` (default), the baking is done on
   * a separate thread.
   */
  @JvmOverloads
  public final fun bakeNavigationPolygon(onThread: Boolean = true): Unit {
    TransferContext.writeArguments(BOOL to onThread)
    TransferContext.callMethod(rawPtr, MethodBindings.bakeNavigationPolygonPtr, NIL)
  }

  /**
   * Returns `true` when the [NavigationPolygon] is being baked on a background thread.
   */
  public final fun isBaking(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isBakingPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public companion object

  internal object MethodBindings {
    public val getRidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion2D", "get_rid", 2944877500)

    public val setNavigationPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion2D", "set_navigation_polygon", 1515040758)

    public val getNavigationPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion2D", "get_navigation_polygon", 1046532237)

    public val setEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion2D", "set_enabled", 2586408642)

    public val isEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion2D", "is_enabled", 36873697)

    public val setNavigationMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion2D", "set_navigation_map", 2722037293)

    public val getNavigationMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion2D", "get_navigation_map", 2944877500)

    public val setUseEdgeConnectionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion2D", "set_use_edge_connections", 2586408642)

    public val getUseEdgeConnectionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion2D", "get_use_edge_connections", 36873697)

    public val setNavigationLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion2D", "set_navigation_layers", 1286410249)

    public val getNavigationLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion2D", "get_navigation_layers", 3905245786)

    public val setNavigationLayerValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion2D", "set_navigation_layer_value", 300928843)

    public val getNavigationLayerValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion2D", "get_navigation_layer_value", 1116898809)

    public val getRegionRidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion2D", "get_region_rid", 2944877500)

    public val setEnterCostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion2D", "set_enter_cost", 373806689)

    public val getEnterCostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion2D", "get_enter_cost", 1740695150)

    public val setTravelCostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion2D", "set_travel_cost", 373806689)

    public val getTravelCostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion2D", "get_travel_cost", 1740695150)

    public val bakeNavigationPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion2D", "bake_navigation_polygon", 3216645846)

    public val isBakingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion2D", "is_baking", 36873697)
  }
}
