// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.common.interop.VoidPtr
import godot.core.TypeManager
import godot.core.VariantParser.NIL
import godot.core.VariantParser.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * [QuadOccluder3D] stores a flat plane shape that can be used by the engine's occlusion culling
 * system. See also [PolygonOccluder3D] if you need to customize the quad's shape.
 * See [OccluderInstance3D]'s documentation for instructions on setting up occlusion culling.
 */
@GodotBaseType
public open class QuadOccluder3D : Occluder3D() {
  /**
   * The quad's size in 3D units.
   */
  @CoreTypeLocalCopy
  public final inline var size: Vector2
    @JvmName("sizeProperty")
    get() = getSize()
    @JvmName("sizeProperty")
    set(`value`) {
      setSize(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_QUADOCCLUDER3D, scriptIndex)
  }

  /**
   * The quad's size in 3D units.
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
   * val myCoreType = quadoccluder3d.size
   * //Your changes
   * quadoccluder3d.size = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun sizeMutate(block: Vector2.() -> Unit): Vector2 = size.apply{
      block(this)
      size = this
  }


  public final fun setSize(size: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to size)
    TransferContext.callMethod(ptr, MethodBindings.setSizePtr, NIL)
  }

  public final fun getSize(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSizePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  public companion object

  internal object MethodBindings {
    public val setSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("QuadOccluder3D", "set_size", 743155724)

    public val getSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("QuadOccluder3D", "get_size", 3341600327)
  }
}
