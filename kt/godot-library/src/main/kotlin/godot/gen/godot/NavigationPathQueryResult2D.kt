// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedVector2Array
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_VECTOR2_ARRAY
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * Result from a [godot.NavigationPathQueryParameters2D] navigation path query.
 *
 * This class contains the result of a navigation path query from [godot.NavigationServer2D.queryPath].
 */
@GodotBaseType
public open class NavigationPathQueryResult2D : RefCounted() {
  /**
   * The resulting path array from the navigation query. All path array positions are in global coordinates. Without customized query parameters this is the same path as returned by [godot.NavigationServer2D.mapGetPath].
   */
  public var path: PackedVector2Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONPATHQUERYRESULT2D_GET_PATH, PACKED_VECTOR2_ARRAY)
      return TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY, false) as PackedVector2Array
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONPATHQUERYRESULT2D_SET_PATH, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_NAVIGATIONPATHQUERYRESULT2D, scriptIndex)
    return true
  }

  /**
   * Reset the result object to its initial state.  This is useful to reuse the object across multiple queries.
   */
  public fun reset(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONPATHQUERYRESULT2D_RESET,
        NIL)
  }

  public companion object
}
