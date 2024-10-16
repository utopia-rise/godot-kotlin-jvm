// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.MemoryManager
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.RID
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.VECTOR3
import godot.core.VariantParser._RID
import godot.core.Vector3
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * A link between two positions on [NavigationRegion3D]s that agents can be routed through. These
 * positions can be on the same [NavigationRegion3D] or on two different ones. Links are useful to
 * express navigation methods other than traveling along the surface of the navigation mesh, such as
 * ziplines, teleporters, or gaps that can be jumped across.
 */
@GodotBaseType
public open class NavigationLink3D : Node3D() {
  /**
   * Whether this link is currently active. If `false`, [NavigationServer3D.mapGetPath] will ignore
   * this link.
   */
  public final inline var enabled: Boolean
    @JvmName("enabledProperty")
    get() = isEnabled()
    @JvmName("enabledProperty")
    set(`value`) {
      setEnabled(value)
    }

  /**
   * Whether this link can be traveled in both directions or only from [startPosition] to
   * [endPosition].
   */
  public final inline var bidirectional: Boolean
    @JvmName("bidirectionalProperty")
    get() = isBidirectional()
    @JvmName("bidirectionalProperty")
    set(`value`) {
      setBidirectional(value)
    }

  /**
   * A bitfield determining all navigation layers the link belongs to. These navigation layers will
   * be checked when requesting a path with [NavigationServer3D.mapGetPath].
   */
  public final inline var navigationLayers: Long
    @JvmName("navigationLayersProperty")
    get() = getNavigationLayers()
    @JvmName("navigationLayersProperty")
    set(`value`) {
      setNavigationLayers(value)
    }

  /**
   * Starting position of the link.
   * This position will search out the nearest polygon in the navigation mesh to attach to.
   * The distance the link will search is controlled by
   * [NavigationServer3D.mapSetLinkConnectionRadius].
   */
  @CoreTypeLocalCopy
  public final inline var startPosition: Vector3
    @JvmName("startPositionProperty")
    get() = getStartPosition()
    @JvmName("startPositionProperty")
    set(`value`) {
      setStartPosition(value)
    }

  /**
   * Ending position of the link.
   * This position will search out the nearest polygon in the navigation mesh to attach to.
   * The distance the link will search is controlled by
   * [NavigationServer3D.mapSetLinkConnectionRadius].
   */
  @CoreTypeLocalCopy
  public final inline var endPosition: Vector3
    @JvmName("endPositionProperty")
    get() = getEndPosition()
    @JvmName("endPositionProperty")
    set(`value`) {
      setEndPosition(value)
    }

  /**
   * When pathfinding enters this link from another regions navigation mesh the [enterCost] value is
   * added to the path distance for determining the shortest path.
   */
  public final inline var enterCost: Float
    @JvmName("enterCostProperty")
    get() = getEnterCost()
    @JvmName("enterCostProperty")
    set(`value`) {
      setEnterCost(value)
    }

  /**
   * When pathfinding moves along the link the traveled distance is multiplied with [travelCost] for
   * determining the shortest path.
   */
  public final inline var travelCost: Float
    @JvmName("travelCostProperty")
    get() = getTravelCost()
    @JvmName("travelCostProperty")
    set(`value`) {
      setTravelCost(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    MemoryManager.createNativeObject(ENGINECLASS_NAVIGATIONLINK3D, this, scriptIndex)
  }

  /**
   * Starting position of the link.
   * This position will search out the nearest polygon in the navigation mesh to attach to.
   * The distance the link will search is controlled by
   * [NavigationServer3D.mapSetLinkConnectionRadius].
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
   * val myCoreType = navigationlink3d.startPosition
   * //Your changes
   * navigationlink3d.startPosition = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun startPositionMutate(block: Vector3.() -> Unit): Vector3 = startPosition.apply{
      block(this)
      startPosition = this
  }


  /**
   * Ending position of the link.
   * This position will search out the nearest polygon in the navigation mesh to attach to.
   * The distance the link will search is controlled by
   * [NavigationServer3D.mapSetLinkConnectionRadius].
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
   * val myCoreType = navigationlink3d.endPosition
   * //Your changes
   * navigationlink3d.endPosition = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun endPositionMutate(block: Vector3.() -> Unit): Vector3 = endPosition.apply{
      block(this)
      endPosition = this
  }


  /**
   * Returns the [RID] of this link on the [NavigationServer3D].
   */
  public final fun getRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRidPtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
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

  public final fun setBidirectional(bidirectional: Boolean): Unit {
    TransferContext.writeArguments(BOOL to bidirectional)
    TransferContext.callMethod(ptr, MethodBindings.setBidirectionalPtr, NIL)
  }

  public final fun isBidirectional(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isBidirectionalPtr, BOOL)
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

  public final fun setStartPosition(position: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to position)
    TransferContext.callMethod(ptr, MethodBindings.setStartPositionPtr, NIL)
  }

  public final fun getStartPosition(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getStartPositionPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setEndPosition(position: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to position)
    TransferContext.callMethod(ptr, MethodBindings.setEndPositionPtr, NIL)
  }

  public final fun getEndPosition(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getEndPositionPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Sets the [startPosition] that is relative to the link from a global [position].
   */
  public final fun setGlobalStartPosition(position: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to position)
    TransferContext.callMethod(ptr, MethodBindings.setGlobalStartPositionPtr, NIL)
  }

  /**
   * Returns the [startPosition] that is relative to the link as a global position.
   */
  public final fun getGlobalStartPosition(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getGlobalStartPositionPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Sets the [endPosition] that is relative to the link from a global [position].
   */
  public final fun setGlobalEndPosition(position: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to position)
    TransferContext.callMethod(ptr, MethodBindings.setGlobalEndPositionPtr, NIL)
  }

  /**
   * Returns the [endPosition] that is relative to the link as a global position.
   */
  public final fun getGlobalEndPosition(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getGlobalEndPositionPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
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

  public companion object

  internal object MethodBindings {
    public val getRidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationLink3D", "get_rid", 2944877500)

    public val setEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationLink3D", "set_enabled", 2586408642)

    public val isEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationLink3D", "is_enabled", 36873697)

    public val setBidirectionalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationLink3D", "set_bidirectional", 2586408642)

    public val isBidirectionalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationLink3D", "is_bidirectional", 36873697)

    public val setNavigationLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationLink3D", "set_navigation_layers", 1286410249)

    public val getNavigationLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationLink3D", "get_navigation_layers", 3905245786)

    public val setNavigationLayerValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationLink3D", "set_navigation_layer_value", 300928843)

    public val getNavigationLayerValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationLink3D", "get_navigation_layer_value", 1116898809)

    public val setStartPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationLink3D", "set_start_position", 3460891852)

    public val getStartPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationLink3D", "get_start_position", 3360562783)

    public val setEndPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationLink3D", "set_end_position", 3460891852)

    public val getEndPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationLink3D", "get_end_position", 3360562783)

    public val setGlobalStartPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationLink3D", "set_global_start_position", 3460891852)

    public val getGlobalStartPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationLink3D", "get_global_start_position", 3360562783)

    public val setGlobalEndPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationLink3D", "set_global_end_position", 3460891852)

    public val getGlobalEndPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationLink3D", "get_global_end_position", 3360562783)

    public val setEnterCostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationLink3D", "set_enter_cost", 373806689)

    public val getEnterCostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationLink3D", "get_enter_cost", 1740695150)

    public val setTravelCostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationLink3D", "set_travel_cost", 373806689)

    public val getTravelCostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationLink3D", "get_travel_cost", 1740695150)
  }
}
