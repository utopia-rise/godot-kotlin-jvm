// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedVector2Array
import godot.core.TransferContext
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_VECTOR2_ARRAY
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

/**
 * Flat 2D polygon shape for use with occlusion culling in [godot.OccluderInstance3D].
 *
 * [godot.PolygonOccluder3D] stores a polygon shape that can be used by the engine's occlusion culling system. When an [godot.OccluderInstance3D] with a [godot.PolygonOccluder3D] is selected in the editor, an editor will appear at the top of the 3D viewport so you can add/remove points. All points must be placed on the same 2D plane, which means it is not possible to create arbitrary 3D shapes with a single [godot.PolygonOccluder3D]. To use arbitrary 3D shapes as occluders, use [godot.ArrayOccluder3D] or [godot.OccluderInstance3D]'s baking feature instead.
 *
 * See [godot.OccluderInstance3D]'s documentation for instructions on setting up occlusion culling.
 */
@GodotBaseType
public open class PolygonOccluder3D : Occluder3D() {
  /**
   * The polygon to use for occlusion culling. The polygon can be convex or concave, but it should have as few points as possible to maximize performance.
   *
   * The polygon must *not* have intersecting lines. Otherwise, triangulation will fail (with an error message printed).
   */
  public var polygon: PackedVector2Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGONOCCLUDER3D_GET_POLYGON,
          PACKED_VECTOR2_ARRAY)
      return TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY, false) as PackedVector2Array
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGONOCCLUDER3D_SET_POLYGON,
          NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_POLYGONOCCLUDER3D, scriptIndex)
    return true
  }

  public companion object
}
