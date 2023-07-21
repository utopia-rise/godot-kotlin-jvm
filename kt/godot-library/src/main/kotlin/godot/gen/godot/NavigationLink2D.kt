// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * A link between two positions on [godot.NavigationRegion2D]s that agents can be routed through.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/navigation/navigation_using_navigationlinks.html]($DOCS_URL/tutorials/navigation/navigation_using_navigationlinks.html)
 *
 * A link between two positions on [godot.NavigationRegion2D]s that agents can be routed through. These positions can be on the same [godot.NavigationRegion2D] or on two different ones. Links are useful to express navigation methods other than traveling along the surface of the navigation polygon, such as ziplines, teleporters, or gaps that can be jumped across.
 */
@GodotBaseType
public open class NavigationLink2D : Node2D() {
  /**
   * Whether this link is currently active. If `false`, [godot.NavigationServer2D.mapGetPath] will ignore this link.
   */
  public var enabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONLINK2D_IS_ENABLED, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONLINK2D_SET_ENABLED, NIL)
    }

  /**
   * Whether this link can be traveled in both directions or only from [startPosition] to [endPosition].
   */
  public var bidirectional: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONLINK2D_IS_BIDIRECTIONAL,
          BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONLINK2D_SET_BIDIRECTIONAL, NIL)
    }

  /**
   * A bitfield determining all navigation layers the link belongs to. These navigation layers will be checked when requesting a path with [godot.NavigationServer2D.mapGetPath].
   */
  public var navigationLayers: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONLINK2D_GET_NAVIGATION_LAYERS, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONLINK2D_SET_NAVIGATION_LAYERS, NIL)
    }

  /**
   * Starting position of the link.
   *
   * This position will search out the nearest polygon in the navigation mesh to attach to.
   *
   * The distance the link will search is controlled by [godot.NavigationServer2D.mapSetLinkConnectionRadius].
   */
  public var startPosition: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONLINK2D_GET_START_POSITION, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONLINK2D_SET_START_POSITION, NIL)
    }

  /**
   * Ending position of the link.
   *
   * This position will search out the nearest polygon in the navigation mesh to attach to.
   *
   * The distance the link will search is controlled by [godot.NavigationServer2D.mapSetLinkConnectionRadius].
   */
  public var endPosition: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONLINK2D_GET_END_POSITION,
          VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONLINK2D_SET_END_POSITION,
          NIL)
    }

  /**
   * When pathfinding enters this link from another regions navigation mesh the [enterCost] value is added to the path distance for determining the shortest path.
   */
  public var enterCost: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONLINK2D_GET_ENTER_COST,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONLINK2D_SET_ENTER_COST,
          NIL)
    }

  /**
   * When pathfinding moves along the link the traveled distance is multiplied with [travelCost] for determining the shortest path.
   */
  public var travelCost: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONLINK2D_GET_TRAVEL_COST,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONLINK2D_SET_TRAVEL_COST,
          NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_NAVIGATIONLINK2D, scriptIndex)
    return true
  }

  /**
   * Based on [value], enables or disables the specified layer in the [navigationLayers] bitmask, given a [layerNumber] between 1 and 32.
   */
  public fun setNavigationLayerValue(layerNumber: Int, `value`: Boolean): Unit {
    TransferContext.writeArguments(LONG to layerNumber.toLong(), BOOL to value)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONLINK2D_SET_NAVIGATION_LAYER_VALUE, NIL)
  }

  /**
   * Returns whether or not the specified layer of the [navigationLayers] bitmask is enabled, given a [layerNumber] between 1 and 32.
   */
  public fun getNavigationLayerValue(layerNumber: Int): Boolean {
    TransferContext.writeArguments(LONG to layerNumber.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONLINK2D_GET_NAVIGATION_LAYER_VALUE, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Sets the [startPosition] that is relative to the link from a global [position].
   */
  public fun setGlobalStartPosition(position: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to position)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONLINK2D_SET_GLOBAL_START_POSITION, NIL)
  }

  /**
   * Returns the [startPosition] that is relative to the link as a global position.
   */
  public fun getGlobalStartPosition(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONLINK2D_GET_GLOBAL_START_POSITION, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Sets the [endPosition] that is relative to the link from a global [position].
   */
  public fun setGlobalEndPosition(position: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to position)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONLINK2D_SET_GLOBAL_END_POSITION, NIL)
  }

  /**
   * Returns the [endPosition] that is relative to the link as a global position.
   */
  public fun getGlobalEndPosition(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONLINK2D_GET_GLOBAL_END_POSITION, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public companion object
}
