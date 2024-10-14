// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.common.interop.VoidPtr
import godot.core.PackedInt32Array
import godot.core.PackedInt64Array
import godot.core.PackedVector3Array
import godot.core.RID
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.NIL
import godot.core.VariantParser.PACKED_INT_32_ARRAY
import godot.core.VariantParser.PACKED_INT_64_ARRAY
import godot.core.VariantParser.PACKED_VECTOR3_ARRAY
import godot.core.memory.TransferContext
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * This class stores the result of a 3D navigation path query from the [NavigationServer3D].
 */
@GodotBaseType
public open class NavigationPathQueryResult3D : RefCounted() {
  /**
   * The resulting path array from the navigation query. All path array positions are in global
   * coordinates. Without customized query parameters this is the same path as returned by
   * [NavigationServer3D.mapGetPath].
   */
  public final inline var path: PackedVector3Array
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
    callConstructor(ENGINECLASS_NAVIGATIONPATHQUERYRESULT3D, scriptIndex)
  }

  public final fun setPath(path: PackedVector3Array): Unit {
    TransferContext.writeArguments(PACKED_VECTOR3_ARRAY to path)
    TransferContext.callMethod(ptr, MethodBindings.setPathPtr, NIL)
  }

  public final fun getPath(): PackedVector3Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPathPtr, PACKED_VECTOR3_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR3_ARRAY) as PackedVector3Array)
  }

  public final fun setPathTypes(pathTypes: PackedInt32Array): Unit {
    TransferContext.writeArguments(PACKED_INT_32_ARRAY to pathTypes)
    TransferContext.callMethod(ptr, MethodBindings.setPathTypesPtr, NIL)
  }

  public final fun getPathTypes(): PackedInt32Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPathTypesPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY) as PackedInt32Array)
  }

  public final fun setPathRids(pathRids: VariantArray<RID>): Unit {
    TransferContext.writeArguments(ARRAY to pathRids)
    TransferContext.callMethod(ptr, MethodBindings.setPathRidsPtr, NIL)
  }

  public final fun getPathRids(): VariantArray<RID> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPathRidsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<RID>)
  }

  public final fun setPathOwnerIds(pathOwnerIds: PackedInt64Array): Unit {
    TransferContext.writeArguments(PACKED_INT_64_ARRAY to pathOwnerIds)
    TransferContext.callMethod(ptr, MethodBindings.setPathOwnerIdsPtr, NIL)
  }

  public final fun getPathOwnerIds(): PackedInt64Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPathOwnerIdsPtr, PACKED_INT_64_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_64_ARRAY) as PackedInt64Array)
  }

  /**
   * Reset the result object to its initial state. This is useful to reuse the object across
   * multiple queries.
   */
  public final fun reset(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.resetPtr, NIL)
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
        TypeManager.getMethodBindPtr("NavigationPathQueryResult3D", "set_path", 334873810)

    public val getPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryResult3D", "get_path", 497664490)

    public val setPathTypesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryResult3D", "set_path_types", 3614634198)

    public val getPathTypesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryResult3D", "get_path_types", 1930428628)

    public val setPathRidsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryResult3D", "set_path_rids", 381264803)

    public val getPathRidsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryResult3D", "get_path_rids", 3995934104)

    public val setPathOwnerIdsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryResult3D", "set_path_owner_ids", 3709968205)

    public val getPathOwnerIdsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryResult3D", "get_path_owner_ids", 235988956)

    public val resetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryResult3D", "reset", 3218959716)
  }
}
