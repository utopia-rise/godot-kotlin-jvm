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
import godot.core.PackedVector2Array
import godot.core.VariantParser.NIL
import godot.core.VariantParser.PACKED_VECTOR2_ARRAY
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * [PolygonOccluder3D] stores a polygon shape that can be used by the engine's occlusion culling
 * system. When an [OccluderInstance3D] with a [PolygonOccluder3D] is selected in the editor, an editor
 * will appear at the top of the 3D viewport so you can add/remove points. All points must be placed on
 * the same 2D plane, which means it is not possible to create arbitrary 3D shapes with a single
 * [PolygonOccluder3D]. To use arbitrary 3D shapes as occluders, use [ArrayOccluder3D] or
 * [OccluderInstance3D]'s baking feature instead.
 * See [OccluderInstance3D]'s documentation for instructions on setting up occlusion culling.
 */
@GodotBaseType
public open class PolygonOccluder3D : Occluder3D() {
  /**
   * The polygon to use for occlusion culling. The polygon can be convex or concave, but it should
   * have as few points as possible to maximize performance.
   * The polygon must *not* have intersecting lines. Otherwise, triangulation will fail (with an
   * error message printed).
   */
  public final inline var polygon: PackedVector2Array
    @JvmName("polygonProperty")
    get() = getPolygon()
    @JvmName("polygonProperty")
    set(`value`) {
      setPolygon(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    MemoryManager.createNativeObject(ENGINECLASS_POLYGONOCCLUDER3D, this, scriptIndex)
  }

  public final fun setPolygon(polygon: PackedVector2Array): Unit {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to polygon)
    TransferContext.callMethod(ptr, MethodBindings.setPolygonPtr, NIL)
  }

  public final fun getPolygon(): PackedVector2Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPolygonPtr, PACKED_VECTOR2_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY) as PackedVector2Array)
  }

  public companion object

  internal object MethodBindings {
    public val setPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PolygonOccluder3D", "set_polygon", 1509147220)

    public val getPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PolygonOccluder3D", "get_polygon", 2961356807)
  }
}
