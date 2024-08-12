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
import godot.core.TypeManager
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR3
import godot.core.VariantType._RID
import godot.core.Vector3
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmInline

/**
 * By changing various properties of this object, such as the start and target position, you can
 * configure path queries to the [NavigationServer3D].
 */
@GodotBaseType
public open class NavigationPathQueryParameters3D : RefCounted() {
  /**
   * The navigation map [RID] used in the path query.
   */
  public var map: RID
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMapPtr, _RID)
      return (TransferContext.readReturnValue(_RID, false) as RID)
    }
    set(`value`) {
      TransferContext.writeArguments(_RID to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMapPtr, NIL)
    }

  /**
   * The pathfinding start position in global coordinates.
   */
  @CoreTypeLocalCopy
  public var startPosition: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getStartPositionPtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setStartPositionPtr, NIL)
    }

  /**
   * The pathfinding target position in global coordinates.
   */
  @CoreTypeLocalCopy
  public var targetPosition: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTargetPositionPtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTargetPositionPtr, NIL)
    }

  /**
   * The navigation layers the query will use (as a bitmask).
   */
  public var navigationLayers: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getNavigationLayersPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setNavigationLayersPtr, NIL)
    }

  /**
   * The pathfinding algorithm used in the path query.
   */
  public var pathfindingAlgorithm: PathfindingAlgorithm
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPathfindingAlgorithmPtr, LONG)
      return NavigationPathQueryParameters3D.PathfindingAlgorithm.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setPathfindingAlgorithmPtr, NIL)
    }

  /**
   * The path postprocessing applied to the raw path corridor found by the [pathfindingAlgorithm].
   */
  public var pathPostprocessing: PathPostProcessing
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPathPostprocessingPtr, LONG)
      return NavigationPathQueryParameters3D.PathPostProcessing.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setPathPostprocessingPtr, NIL)
    }

  /**
   * Additional information to include with the navigation path.
   */
  public var metadataFlags: PathMetadataFlags
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMetadataFlagsPtr, LONG)
      return PathMetadataFlagsValue(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.flag)
      TransferContext.callMethod(rawPtr, MethodBindings.setMetadataFlagsPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_NAVIGATIONPATHQUERYPARAMETERS3D, scriptIndex)
    return true
  }

  /**
   * The pathfinding start position in global coordinates.
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
   * val myCoreType = navigationpathqueryparameters3d.startPosition
   * //Your changes
   * navigationpathqueryparameters3d.startPosition = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun startPositionMutate(block: Vector3.() -> Unit): Vector3 = startPosition.apply{
      block(this)
      startPosition = this
  }


  /**
   * The pathfinding target position in global coordinates.
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
   * val myCoreType = navigationpathqueryparameters3d.targetPosition
   * //Your changes
   * navigationpathqueryparameters3d.targetPosition = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun targetPositionMutate(block: Vector3.() -> Unit): Vector3 = targetPosition.apply{
      block(this)
      targetPosition = this
  }


  public enum class PathfindingAlgorithm(
    id: Long,
  ) {
    /**
     * The path query uses the default A* pathfinding algorithm.
     */
    PATHFINDING_ALGORITHM_ASTAR(0),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class PathPostProcessing(
    id: Long,
  ) {
    /**
     * Applies a funnel algorithm to the raw path corridor found by the pathfinding algorithm. This
     * will result in the shortest path possible inside the path corridor. This postprocessing very
     * much depends on the navigation mesh polygon layout and the created corridor. Especially tile- or
     * gridbased layouts can face artificial corners with diagonal movement due to a jagged path
     * corridor imposed by the cell shapes.
     */
    PATH_POSTPROCESSING_CORRIDORFUNNEL(0),
    /**
     * Centers every path position in the middle of the traveled navigation mesh polygon edge. This
     * creates better paths for tile- or gridbased layouts that restrict the movement to the cells
     * center.
     */
    PATH_POSTPROCESSING_EDGECENTERED(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public sealed interface PathMetadataFlags {
    public val flag: Long

    public infix fun or(other: PathMetadataFlags): PathMetadataFlags =
        PathMetadataFlagsValue(flag.or(other.flag))

    public infix fun or(other: Long): PathMetadataFlags = PathMetadataFlagsValue(flag.or(other))

    public infix fun xor(other: PathMetadataFlags): PathMetadataFlags =
        PathMetadataFlagsValue(flag.xor(other.flag))

    public infix fun xor(other: Long): PathMetadataFlags = PathMetadataFlagsValue(flag.xor(other))

    public infix fun and(other: PathMetadataFlags): PathMetadataFlags =
        PathMetadataFlagsValue(flag.and(other.flag))

    public infix fun and(other: Long): PathMetadataFlags = PathMetadataFlagsValue(flag.and(other))

    public operator fun plus(other: PathMetadataFlags): PathMetadataFlags =
        PathMetadataFlagsValue(flag.plus(other.flag))

    public operator fun plus(other: Long): PathMetadataFlags =
        PathMetadataFlagsValue(flag.plus(other))

    public operator fun minus(other: PathMetadataFlags): PathMetadataFlags =
        PathMetadataFlagsValue(flag.minus(other.flag))

    public operator fun minus(other: Long): PathMetadataFlags =
        PathMetadataFlagsValue(flag.minus(other))

    public operator fun times(other: PathMetadataFlags): PathMetadataFlags =
        PathMetadataFlagsValue(flag.times(other.flag))

    public operator fun times(other: Long): PathMetadataFlags =
        PathMetadataFlagsValue(flag.times(other))

    public operator fun div(other: PathMetadataFlags): PathMetadataFlags =
        PathMetadataFlagsValue(flag.div(other.flag))

    public operator fun div(other: Long): PathMetadataFlags =
        PathMetadataFlagsValue(flag.div(other))

    public operator fun rem(other: PathMetadataFlags): PathMetadataFlags =
        PathMetadataFlagsValue(flag.rem(other.flag))

    public operator fun rem(other: Long): PathMetadataFlags =
        PathMetadataFlagsValue(flag.rem(other))

    public fun unaryPlus(): PathMetadataFlags = PathMetadataFlagsValue(flag.unaryPlus())

    public fun unaryMinus(): PathMetadataFlags = PathMetadataFlagsValue(flag.unaryMinus())

    public fun inv(): PathMetadataFlags = PathMetadataFlagsValue(flag.inv())

    public infix fun shl(bits: Int): PathMetadataFlags = PathMetadataFlagsValue(flag shl bits)

    public infix fun shr(bits: Int): PathMetadataFlags = PathMetadataFlagsValue(flag shr bits)

    public infix fun ushr(bits: Int): PathMetadataFlags = PathMetadataFlagsValue(flag ushr bits)

    public companion object {
      public val PATH_METADATA_INCLUDE_NONE: PathMetadataFlags = PathMetadataFlagsValue(0)

      public val PATH_METADATA_INCLUDE_TYPES: PathMetadataFlags = PathMetadataFlagsValue(1)

      public val PATH_METADATA_INCLUDE_RIDS: PathMetadataFlags = PathMetadataFlagsValue(2)

      public val PATH_METADATA_INCLUDE_OWNERS: PathMetadataFlags = PathMetadataFlagsValue(4)

      public val PATH_METADATA_INCLUDE_ALL: PathMetadataFlags = PathMetadataFlagsValue(7)
    }
  }

  @JvmInline
  internal value class PathMetadataFlagsValue internal constructor(
    public override val flag: Long,
  ) : PathMetadataFlags

  public companion object

  internal object MethodBindings {
    public val setPathfindingAlgorithmPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryParameters3D", "set_pathfinding_algorithm")

    public val getPathfindingAlgorithmPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryParameters3D", "get_pathfinding_algorithm")

    public val setPathPostprocessingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryParameters3D", "set_path_postprocessing")

    public val getPathPostprocessingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryParameters3D", "get_path_postprocessing")

    public val setMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryParameters3D", "set_map")

    public val getMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryParameters3D", "get_map")

    public val setStartPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryParameters3D", "set_start_position")

    public val getStartPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryParameters3D", "get_start_position")

    public val setTargetPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryParameters3D", "set_target_position")

    public val getTargetPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryParameters3D", "get_target_position")

    public val setNavigationLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryParameters3D", "set_navigation_layers")

    public val getNavigationLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryParameters3D", "get_navigation_layers")

    public val setMetadataFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryParameters3D", "set_metadata_flags")

    public val getMetadataFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryParameters3D", "get_metadata_flags")
  }
}

public infix fun Long.or(other: godot.NavigationPathQueryParameters3D.PathMetadataFlags): Long =
    this.or(other.flag)

public infix fun Long.xor(other: godot.NavigationPathQueryParameters3D.PathMetadataFlags): Long =
    this.xor(other.flag)

public infix fun Long.and(other: godot.NavigationPathQueryParameters3D.PathMetadataFlags): Long =
    this.and(other.flag)

public operator fun Long.plus(other: godot.NavigationPathQueryParameters3D.PathMetadataFlags): Long
    = this.plus(other.flag)

public operator fun Long.minus(other: godot.NavigationPathQueryParameters3D.PathMetadataFlags): Long
    = this.minus(other.flag)

public operator fun Long.times(other: godot.NavigationPathQueryParameters3D.PathMetadataFlags): Long
    = this.times(other.flag)

public operator fun Long.div(other: godot.NavigationPathQueryParameters3D.PathMetadataFlags): Long =
    this.div(other.flag)

public operator fun Long.rem(other: godot.NavigationPathQueryParameters3D.PathMetadataFlags): Long =
    this.rem(other.flag)
