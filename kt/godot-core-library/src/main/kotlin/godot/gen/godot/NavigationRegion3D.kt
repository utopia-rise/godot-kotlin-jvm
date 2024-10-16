// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.MemoryManager
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.RID
import godot.core.Signal0
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser._RID
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
 * A traversable 3D region based on a [NavigationMesh] that [NavigationAgent3D]s can use for
 * pathfinding.
 * Two regions can be connected to each other if they share a similar edge. You can set the minimum
 * distance between two vertices required to connect two edges by using
 * [NavigationServer3D.mapSetEdgeConnectionMargin].
 * **Note:** Overlapping two regions' navigation meshes is not enough for connecting two regions.
 * They must share a similar edge.
 * The cost of entering this region from another region can be controlled with the [enterCost]
 * value.
 * **Note:** This value is not added to the path cost when the start position is already inside this
 * region.
 * The cost of traveling distances inside this region can be controlled with the [travelCost]
 * multiplier.
 * **Note:** This node caches changes to its properties, so if you make changes to the underlying
 * region [RID] in [NavigationServer3D], they will not be reflected in this node's properties.
 */
@GodotBaseType
public open class NavigationRegion3D : Node3D() {
  /**
   * Notifies when the [NavigationMesh] has changed.
   */
  public val navigationMeshChanged: Signal0 by Signal0

  /**
   * Notifies when the navigation mesh bake operation is completed.
   */
  public val bakeFinished: Signal0 by Signal0

  /**
   * The [NavigationMesh] resource to use.
   */
  public final inline var navigationMesh: NavigationMesh?
    @JvmName("navigationMeshProperty")
    get() = getNavigationMesh()
    @JvmName("navigationMeshProperty")
    set(`value`) {
      setNavigationMesh(value)
    }

  /**
   * Determines if the [NavigationRegion3D] is enabled or disabled.
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
   * be checked upon when requesting a path with [NavigationServer3D.mapGetPath].
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
    MemoryManager.createNativeObject(ENGINECLASS_NAVIGATIONREGION3D, this, scriptIndex)
  }

  /**
   * Returns the [RID] of this region on the [NavigationServer3D]. Combined with
   * [NavigationServer3D.mapGetClosestPointOwner] can be used to identify the [NavigationRegion3D]
   * closest to a point on the merged navigation map.
   */
  public final fun getRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRidPtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  public final fun setNavigationMesh(navigationMesh: NavigationMesh?): Unit {
    TransferContext.writeArguments(OBJECT to navigationMesh)
    TransferContext.callMethod(ptr, MethodBindings.setNavigationMeshPtr, NIL)
  }

  public final fun getNavigationMesh(): NavigationMesh? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getNavigationMeshPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as NavigationMesh?)
  }

  public final fun setEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setEnabledPtr, NIL)
  }

  public final fun isEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets the [RID] of the navigation map this region should use. By default the region will
   * automatically join the [World3D] default navigation map so this function is only required to
   * override the default map.
   */
  public final fun setNavigationMap(navigationMap: RID): Unit {
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

  public final fun setUseEdgeConnections(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setUseEdgeConnectionsPtr, NIL)
  }

  public final fun getUseEdgeConnections(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getUseEdgeConnectionsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setNavigationLayers(navigationLayers: Long): Unit {
    TransferContext.writeArguments(LONG to navigationLayers)
    TransferContext.callMethod(ptr, MethodBindings.setNavigationLayersPtr, NIL)
  }

  public final fun getNavigationLayers(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getNavigationLayersPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Based on [value], enables or disables the specified layer in the [navigationLayers] bitmask,
   * given a [layerNumber] between 1 and 32.
   */
  public final fun setNavigationLayerValue(layerNumber: Int, `value`: Boolean): Unit {
    TransferContext.writeArguments(LONG to layerNumber.toLong(), BOOL to value)
    TransferContext.callMethod(ptr, MethodBindings.setNavigationLayerValuePtr, NIL)
  }

  /**
   * Returns whether or not the specified layer of the [navigationLayers] bitmask is enabled, given
   * a [layerNumber] between 1 and 32.
   */
  public final fun getNavigationLayerValue(layerNumber: Int): Boolean {
    TransferContext.writeArguments(LONG to layerNumber.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getNavigationLayerValuePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the [RID] of this region on the [NavigationServer3D].
   */
  public final fun getRegionRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRegionRidPtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  public final fun setEnterCost(enterCost: Float): Unit {
    TransferContext.writeArguments(DOUBLE to enterCost.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setEnterCostPtr, NIL)
  }

  public final fun getEnterCost(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getEnterCostPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setTravelCost(travelCost: Float): Unit {
    TransferContext.writeArguments(DOUBLE to travelCost.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setTravelCostPtr, NIL)
  }

  public final fun getTravelCost(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTravelCostPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Bakes the [NavigationMesh]. If [onThread] is set to `true` (default), the baking is done on a
   * separate thread. Baking on separate thread is useful because navigation baking is not a cheap
   * operation. When it is completed, it automatically sets the new [NavigationMesh]. Please note that
   * baking on separate thread may be very slow if geometry is parsed from meshes as async access to
   * each mesh involves heavy synchronization. Also, please note that baking on a separate thread is
   * automatically disabled on operating systems that cannot use threads (such as Web with threads
   * disabled).
   */
  @JvmOverloads
  public final fun bakeNavigationMesh(onThread: Boolean = true): Unit {
    TransferContext.writeArguments(BOOL to onThread)
    TransferContext.callMethod(ptr, MethodBindings.bakeNavigationMeshPtr, NIL)
  }

  /**
   * Returns `true` when the [NavigationMesh] is being baked on a background thread.
   */
  public final fun isBaking(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isBakingPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public companion object

  internal object MethodBindings {
    public val getRidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion3D", "get_rid", 2944877500)

    public val setNavigationMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion3D", "set_navigation_mesh", 2923361153)

    public val getNavigationMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion3D", "get_navigation_mesh", 1468720886)

    public val setEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion3D", "set_enabled", 2586408642)

    public val isEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion3D", "is_enabled", 36873697)

    public val setNavigationMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion3D", "set_navigation_map", 2722037293)

    public val getNavigationMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion3D", "get_navigation_map", 2944877500)

    public val setUseEdgeConnectionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion3D", "set_use_edge_connections", 2586408642)

    public val getUseEdgeConnectionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion3D", "get_use_edge_connections", 36873697)

    public val setNavigationLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion3D", "set_navigation_layers", 1286410249)

    public val getNavigationLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion3D", "get_navigation_layers", 3905245786)

    public val setNavigationLayerValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion3D", "set_navigation_layer_value", 300928843)

    public val getNavigationLayerValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion3D", "get_navigation_layer_value", 1116898809)

    public val getRegionRidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion3D", "get_region_rid", 2944877500)

    public val setEnterCostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion3D", "set_enter_cost", 373806689)

    public val getEnterCostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion3D", "get_enter_cost", 1740695150)

    public val setTravelCostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion3D", "set_travel_cost", 373806689)

    public val getTravelCostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion3D", "get_travel_cost", 1740695150)

    public val bakeNavigationMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion3D", "bake_navigation_mesh", 3216645846)

    public val isBakingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion3D", "is_baking", 36873697)
  }
}
