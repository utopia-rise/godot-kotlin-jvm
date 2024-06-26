// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedInt32Array
import godot.core.PackedInt64Array
import godot.core.PackedVector2Array
import godot.core.RID
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_INT_32_ARRAY
import godot.core.VariantType.PACKED_INT_64_ARRAY
import godot.core.VariantType.PACKED_VECTOR2_ARRAY
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Represents the result of a 2D pathfinding query.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/navigation/navigation_using_navigationpathqueryobjects.html]($DOCS_URL/tutorials/navigation/navigation_using_navigationpathqueryobjects.html)
 *
 * This class stores the result of a 2D navigation path query from the [godot.NavigationServer2D].
 */
@GodotBaseType
public open class NavigationPathQueryResult2D : RefCounted() {
  /**
   * The resulting path array from the navigation query. All path array positions are in global coordinates. Without customized query parameters this is the same path as returned by [godot.NavigationServer2D.mapGetPath].
   */
  public var path: PackedVector2Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPathPtr, PACKED_VECTOR2_ARRAY)
      return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY, false) as PackedVector2Array)
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPathPtr, NIL)
    }

  /**
   * The type of navigation primitive (region or link) that each point of the path goes through.
   */
  public var pathTypes: PackedInt32Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPathTypesPtr, PACKED_INT_32_ARRAY)
      return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_INT_32_ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPathTypesPtr, NIL)
    }

  /**
   * The [RID]s of the regions and links that each point of the path goes through.
   */
  public var pathRids: VariantArray<RID>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPathRidsPtr, ARRAY)
      return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<RID>)
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPathRidsPtr, NIL)
    }

  /**
   * The `ObjectID`s of the [godot.Object]s which manage the regions and links each point of the path goes through.
   */
  public var pathOwnerIds: PackedInt64Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPathOwnerIdsPtr, PACKED_INT_64_ARRAY)
      return (TransferContext.readReturnValue(PACKED_INT_64_ARRAY, false) as PackedInt64Array)
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_INT_64_ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPathOwnerIdsPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_NAVIGATIONPATHQUERYRESULT2D, scriptIndex)
    return true
  }

  /**
   * Reset the result object to its initial state. This is useful to reuse the object across multiple queries.
   */
  public fun reset(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.resetPtr, NIL)
  }

  public enum class PathSegmentType(
    id: Long,
  ) {
    /**
     * This segment of the path goes through a region.
     */
    PATH_SEGMENT_TYPE_REGION(0),
    /**
     * This segment of the path goes through a link.
     */
    PATH_SEGMENT_TYPE_LINK(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryResult2D", "set_path")

    public val getPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryResult2D", "get_path")

    public val setPathTypesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryResult2D", "set_path_types")

    public val getPathTypesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryResult2D", "get_path_types")

    public val setPathRidsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryResult2D", "set_path_rids")

    public val getPathRidsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryResult2D", "get_path_rids")

    public val setPathOwnerIdsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryResult2D", "set_path_owner_ids")

    public val getPathOwnerIdsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryResult2D", "get_path_owner_ids")

    public val resetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryResult2D", "reset")
  }
}
