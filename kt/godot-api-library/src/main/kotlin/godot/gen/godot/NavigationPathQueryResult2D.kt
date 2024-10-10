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
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.NIL
import godot.core.VariantParser.PACKED_INT_32_ARRAY
import godot.core.VariantParser.PACKED_INT_64_ARRAY
import godot.core.VariantParser.PACKED_VECTOR2_ARRAY
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_NAVIGATIONPATHQUERYRESULT2D_INDEX: Int = 399

/**
 * This class stores the result of a 2D navigation path query from the [NavigationServer2D].
 */
@GodotBaseType
public open class NavigationPathQueryResult2D : RefCounted() {
  /**
   * The resulting path array from the navigation query. All path array positions are in global
   * coordinates. Without customized query parameters this is the same path as returned by
   * [NavigationServer2D.mapGetPath].
   */
  public final inline var path: PackedVector2Array
    @JvmName("pathProperty")
    get() = getPath()
    @JvmName("pathProperty")
    set(`value`) {
      setPath(value)
    }

  /**
   * The type of navigation primitive (region or link) that each point of the path goes through.
   */
  public final inline var pathTypes: PackedInt32Array
    @JvmName("pathTypesProperty")
    get() = getPathTypes()
    @JvmName("pathTypesProperty")
    set(`value`) {
      setPathTypes(value)
    }

  /**
   * The [RID]s of the regions and links that each point of the path goes through.
   */
  public final inline var pathRids: VariantArray<RID>
    @JvmName("pathRidsProperty")
    get() = getPathRids()
    @JvmName("pathRidsProperty")
    set(`value`) {
      setPathRids(value)
    }

  /**
   * The `ObjectID`s of the [Object]s which manage the regions and links each point of the path goes
   * through.
   */
  public final inline var pathOwnerIds: PackedInt64Array
    @JvmName("pathOwnerIdsProperty")
    get() = getPathOwnerIds()
    @JvmName("pathOwnerIdsProperty")
    set(`value`) {
      setPathOwnerIds(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_NAVIGATIONPATHQUERYRESULT2D_INDEX, scriptIndex)
  }

  public final fun setPath(path: PackedVector2Array): Unit {
    Internals.writeArguments(PACKED_VECTOR2_ARRAY to path)
    Internals.callMethod(rawPtr, MethodBindings.setPathPtr, NIL)
  }

  public final fun getPath(): PackedVector2Array {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getPathPtr, PACKED_VECTOR2_ARRAY)
    return (Internals.readReturnValue(PACKED_VECTOR2_ARRAY) as PackedVector2Array)
  }

  public final fun setPathTypes(pathTypes: PackedInt32Array): Unit {
    Internals.writeArguments(PACKED_INT_32_ARRAY to pathTypes)
    Internals.callMethod(rawPtr, MethodBindings.setPathTypesPtr, NIL)
  }

  public final fun getPathTypes(): PackedInt32Array {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getPathTypesPtr, PACKED_INT_32_ARRAY)
    return (Internals.readReturnValue(PACKED_INT_32_ARRAY) as PackedInt32Array)
  }

  public final fun setPathRids(pathRids: VariantArray<RID>): Unit {
    Internals.writeArguments(ARRAY to pathRids)
    Internals.callMethod(rawPtr, MethodBindings.setPathRidsPtr, NIL)
  }

  public final fun getPathRids(): VariantArray<RID> {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getPathRidsPtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<RID>)
  }

  public final fun setPathOwnerIds(pathOwnerIds: PackedInt64Array): Unit {
    Internals.writeArguments(PACKED_INT_64_ARRAY to pathOwnerIds)
    Internals.callMethod(rawPtr, MethodBindings.setPathOwnerIdsPtr, NIL)
  }

  public final fun getPathOwnerIds(): PackedInt64Array {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getPathOwnerIdsPtr, PACKED_INT_64_ARRAY)
    return (Internals.readReturnValue(PACKED_INT_64_ARRAY) as PackedInt64Array)
  }

  /**
   * Reset the result object to its initial state. This is useful to reuse the object across
   * multiple queries.
   */
  public final fun reset(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.resetPtr, NIL)
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
      public fun from(`value`: Long): PathSegmentType = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setPathPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationPathQueryResult2D", "set_path", 1509147220)

    public val getPathPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationPathQueryResult2D", "get_path", 2961356807)

    public val setPathTypesPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationPathQueryResult2D", "set_path_types", 3614634198)

    public val getPathTypesPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationPathQueryResult2D", "get_path_types", 1930428628)

    public val setPathRidsPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationPathQueryResult2D", "set_path_rids", 381264803)

    public val getPathRidsPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationPathQueryResult2D", "get_path_rids", 3995934104)

    public val setPathOwnerIdsPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationPathQueryResult2D", "set_path_owner_ids", 3709968205)

    public val getPathOwnerIdsPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationPathQueryResult2D", "get_path_owner_ids", 235988956)

    public val resetPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationPathQueryResult2D", "reset", 3218959716)
  }
}
