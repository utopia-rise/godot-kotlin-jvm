// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * Flat plane shape for use with occlusion culling in [godot.OccluderInstance3D].
 *
 * [godot.QuadOccluder3D] stores a flat plane shape that can be used by the engine's occlusion culling system. See also [godot.PolygonOccluder3D] if you need to customize the quad's shape.
 *
 * See [godot.OccluderInstance3D]'s documentation for instructions on setting up occlusion culling.
 */
@GodotBaseType
public open class QuadOccluder3D : Occluder3D() {
  /**
   * The quad's size in 3D units.
   */
  public var size: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_QUADOCCLUDER3D_GET_SIZE, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_QUADOCCLUDER3D_SET_SIZE, NIL)
    }

  public override fun __new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_QUADOCCLUDER3D, scriptIndex)
  }

  public companion object
}
