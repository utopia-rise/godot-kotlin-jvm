// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantParser.NIL
import godot.core.VariantParser.VECTOR3
import godot.core.Vector3
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * A 3D box shape, intended for use in physics. Usually used to provide a shape for a
 * [CollisionShape3D].
 * **Performance:** [BoxShape3D] is fast to check collisions against. It is faster than
 * [CapsuleShape3D] and [CylinderShape3D], but slower than [SphereShape3D].
 */
@GodotBaseType
public open class BoxShape3D : Shape3D() {
  /**
   * The box's width, height and depth.
   */
  @CoreTypeLocalCopy
  public final inline var size: Vector3
    @JvmName("sizeProperty")
    get() = getSize()
    @JvmName("sizeProperty")
    set(`value`) {
      setSize(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(112, scriptIndex)
  }

  /**
   * The box's width, height and depth.
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
   * val myCoreType = boxshape3d.size
   * //Your changes
   * boxshape3d.size = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun sizeMutate(block: Vector3.() -> Unit): Vector3 = size.apply{
      block(this)
      size = this
  }


  public final fun setSize(size: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to size)
    TransferContext.callMethod(ptr, MethodBindings.setSizePtr, NIL)
  }

  public final fun getSize(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSizePtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  public companion object

  public object MethodBindings {
    internal val setSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoxShape3D", "set_size", 3460891852)

    internal val getSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoxShape3D", "get_size", 3360562783)
  }
}
