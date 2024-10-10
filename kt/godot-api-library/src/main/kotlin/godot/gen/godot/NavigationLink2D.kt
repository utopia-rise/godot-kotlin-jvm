// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.RID
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.VECTOR2
import godot.core.VariantParser._RID
import godot.core.Vector2
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_NAVIGATIONLINK2D_INDEX: Int = 390

/**
 * A link between two positions on [NavigationRegion2D]s that agents can be routed through. These
 * positions can be on the same [NavigationRegion2D] or on two different ones. Links are useful to
 * express navigation methods other than traveling along the surface of the navigation polygon, such as
 * ziplines, teleporters, or gaps that can be jumped across.
 */
@GodotBaseType
public open class NavigationLink2D : Node2D() {
  /**
   * Whether this link is currently active. If `false`, [NavigationServer2D.mapGetPath] will ignore
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
   * be checked when requesting a path with [NavigationServer2D.mapGetPath].
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
   * [NavigationServer2D.mapSetLinkConnectionRadius].
   */
  @CoreTypeLocalCopy
  public final inline var startPosition: Vector2
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
   * [NavigationServer2D.mapSetLinkConnectionRadius].
   */
  @CoreTypeLocalCopy
  public final inline var endPosition: Vector2
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
    Internals.callConstructor(this, ENGINE_CLASS_NAVIGATIONLINK2D_INDEX, scriptIndex)
  }

  /**
   * Starting position of the link.
   * This position will search out the nearest polygon in the navigation mesh to attach to.
   * The distance the link will search is controlled by
   * [NavigationServer2D.mapSetLinkConnectionRadius].
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
   * val myCoreType = navigationlink2d.startPosition
   * //Your changes
   * navigationlink2d.startPosition = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun startPositionMutate(block: Vector2.() -> Unit): Vector2 = startPosition.apply{
      block(this)
      startPosition = this
  }


  /**
   * Ending position of the link.
   * This position will search out the nearest polygon in the navigation mesh to attach to.
   * The distance the link will search is controlled by
   * [NavigationServer2D.mapSetLinkConnectionRadius].
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
   * val myCoreType = navigationlink2d.endPosition
   * //Your changes
   * navigationlink2d.endPosition = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun endPositionMutate(block: Vector2.() -> Unit): Vector2 = endPosition.apply{
      block(this)
      endPosition = this
  }


  /**
   * Returns the [RID] of this link on the [NavigationServer2D].
   */
  public final fun getRid(): RID {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getRidPtr, _RID)
    return (Internals.readReturnValue(_RID) as RID)
  }

  public final fun setEnabled(enabled: Boolean): Unit {
    Internals.writeArguments(BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.setEnabledPtr, NIL)
  }

  public final fun isEnabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setBidirectional(bidirectional: Boolean): Unit {
    Internals.writeArguments(BOOL to bidirectional)
    Internals.callMethod(rawPtr, MethodBindings.setBidirectionalPtr, NIL)
  }

  public final fun isBidirectional(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isBidirectionalPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setNavigationLayers(navigationLayers: Long): Unit {
    Internals.writeArguments(LONG to navigationLayers)
    Internals.callMethod(rawPtr, MethodBindings.setNavigationLayersPtr, NIL)
  }

  public final fun getNavigationLayers(): Long {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getNavigationLayersPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Based on [value], enables or disables the specified layer in the [navigationLayers] bitmask,
   * given a [layerNumber] between 1 and 32.
   */
  public final fun setNavigationLayerValue(layerNumber: Int, `value`: Boolean): Unit {
    Internals.writeArguments(LONG to layerNumber.toLong(), BOOL to value)
    Internals.callMethod(rawPtr, MethodBindings.setNavigationLayerValuePtr, NIL)
  }

  /**
   * Returns whether or not the specified layer of the [navigationLayers] bitmask is enabled, given
   * a [layerNumber] between 1 and 32.
   */
  public final fun getNavigationLayerValue(layerNumber: Int): Boolean {
    Internals.writeArguments(LONG to layerNumber.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getNavigationLayerValuePtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setStartPosition(position: Vector2): Unit {
    Internals.writeArguments(VECTOR2 to position)
    Internals.callMethod(rawPtr, MethodBindings.setStartPositionPtr, NIL)
  }

  public final fun getStartPosition(): Vector2 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getStartPositionPtr, VECTOR2)
    return (Internals.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun setEndPosition(position: Vector2): Unit {
    Internals.writeArguments(VECTOR2 to position)
    Internals.callMethod(rawPtr, MethodBindings.setEndPositionPtr, NIL)
  }

  public final fun getEndPosition(): Vector2 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getEndPositionPtr, VECTOR2)
    return (Internals.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Sets the [startPosition] that is relative to the link from a global [position].
   */
  public final fun setGlobalStartPosition(position: Vector2): Unit {
    Internals.writeArguments(VECTOR2 to position)
    Internals.callMethod(rawPtr, MethodBindings.setGlobalStartPositionPtr, NIL)
  }

  /**
   * Returns the [startPosition] that is relative to the link as a global position.
   */
  public final fun getGlobalStartPosition(): Vector2 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getGlobalStartPositionPtr, VECTOR2)
    return (Internals.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Sets the [endPosition] that is relative to the link from a global [position].
   */
  public final fun setGlobalEndPosition(position: Vector2): Unit {
    Internals.writeArguments(VECTOR2 to position)
    Internals.callMethod(rawPtr, MethodBindings.setGlobalEndPositionPtr, NIL)
  }

  /**
   * Returns the [endPosition] that is relative to the link as a global position.
   */
  public final fun getGlobalEndPosition(): Vector2 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getGlobalEndPositionPtr, VECTOR2)
    return (Internals.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun setEnterCost(enterCost: Float): Unit {
    Internals.writeArguments(DOUBLE to enterCost.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setEnterCostPtr, NIL)
  }

  public final fun getEnterCost(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getEnterCostPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setTravelCost(travelCost: Float): Unit {
    Internals.writeArguments(DOUBLE to travelCost.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setTravelCostPtr, NIL)
  }

  public final fun getTravelCost(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTravelCostPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public companion object

  internal object MethodBindings {
    public val getRidPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationLink2D", "get_rid", 2944877500)

    public val setEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationLink2D", "set_enabled", 2586408642)

    public val isEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationLink2D", "is_enabled", 36873697)

    public val setBidirectionalPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationLink2D", "set_bidirectional", 2586408642)

    public val isBidirectionalPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationLink2D", "is_bidirectional", 36873697)

    public val setNavigationLayersPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationLink2D", "set_navigation_layers", 1286410249)

    public val getNavigationLayersPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationLink2D", "get_navigation_layers", 3905245786)

    public val setNavigationLayerValuePtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationLink2D", "set_navigation_layer_value", 300928843)

    public val getNavigationLayerValuePtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationLink2D", "get_navigation_layer_value", 1116898809)

    public val setStartPositionPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationLink2D", "set_start_position", 743155724)

    public val getStartPositionPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationLink2D", "get_start_position", 3341600327)

    public val setEndPositionPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationLink2D", "set_end_position", 743155724)

    public val getEndPositionPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationLink2D", "get_end_position", 3341600327)

    public val setGlobalStartPositionPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationLink2D", "set_global_start_position", 743155724)

    public val getGlobalStartPositionPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationLink2D", "get_global_start_position", 3341600327)

    public val setGlobalEndPositionPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationLink2D", "set_global_end_position", 743155724)

    public val getGlobalEndPositionPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationLink2D", "get_global_end_position", 3341600327)

    public val setEnterCostPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationLink2D", "set_enter_cost", 373806689)

    public val getEnterCostPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationLink2D", "get_enter_cost", 1740695150)

    public val setTravelCostPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationLink2D", "set_travel_cost", 373806689)

    public val getTravelCostPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationLink2D", "get_travel_cost", 1740695150)
  }
}
