// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * Cuboid shape for use with occlusion culling in [godot.OccluderInstance3D].
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/3d/occlusion_culling.html]($DOCS_URL/tutorials/3d/occlusion_culling.html)
 *
 * [godot.BoxOccluder3D] stores a cuboid shape that can be used by the engine's occlusion culling system.
 *
 * See [godot.OccluderInstance3D]'s documentation for instructions on setting up occlusion culling.
 */
@GodotBaseType
public open class BoxOccluder3D : Occluder3D() {
  /**
   * The box's size in 3D units.
   */
  @CoreTypeLocalCopy
  public var size: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSizePtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSizePtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_BOXOCCLUDER3D, scriptIndex)
    return true
  }

  /**
   * The box's size in 3D units.
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
   * val myCoreType = boxoccluder3d.size
   * //Your changes
   * boxoccluder3d.size = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun sizeMutate(block: Vector3.() -> Unit): Vector3 = size.apply{
      block(this)
      size = this
  }


  public companion object

  internal object MethodBindings {
    public val setSizePtr: VoidPtr = TypeManager.getMethodBindPtr("BoxOccluder3D", "set_size")

    public val getSizePtr: VoidPtr = TypeManager.getMethodBindPtr("BoxOccluder3D", "get_size")
  }
}
