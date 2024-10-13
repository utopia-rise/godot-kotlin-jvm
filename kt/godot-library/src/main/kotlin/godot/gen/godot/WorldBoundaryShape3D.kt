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
import godot.core.Plane
import godot.core.TypeManager
import godot.core.VariantParser.NIL
import godot.core.VariantParser.PLANE
import godot.core.memory.TransferContext
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * A 3D world boundary shape, intended for use in physics. [WorldBoundaryShape3D] works like an
 * infinite plane that forces all physics bodies to stay above it. The [plane]'s normal determines
 * which direction is considered as "above" and in the editor, the line over the plane represents this
 * direction. It can for example be used for endless flat floors.
 */
@GodotBaseType
public open class WorldBoundaryShape3D : Shape3D() {
  /**
   * The [Plane] used by the [WorldBoundaryShape3D] for collision.
   */
  @CoreTypeLocalCopy
  public final inline var plane: Plane
    @JvmName("planeProperty")
    get() = getPlane()
    @JvmName("planeProperty")
    set(`value`) {
      setPlane(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_WORLDBOUNDARYSHAPE3D, scriptIndex)
  }

  /**
   * The [Plane] used by the [WorldBoundaryShape3D] for collision.
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
   * val myCoreType = worldboundaryshape3d.plane
   * //Your changes
   * worldboundaryshape3d.plane = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun planeMutate(block: Plane.() -> Unit): Plane = plane.apply{
      block(this)
      plane = this
  }


  public final fun setPlane(plane: Plane): Unit {
    TransferContext.writeArguments(PLANE to plane)
    TransferContext.callMethod(ptr, MethodBindings.setPlanePtr, NIL)
  }

  public final fun getPlane(): Plane {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPlanePtr, PLANE)
    return (TransferContext.readReturnValue(PLANE) as Plane)
  }

  public companion object

  internal object MethodBindings {
    public val setPlanePtr: VoidPtr =
        TypeManager.getMethodBindPtr("WorldBoundaryShape3D", "set_plane", 3505987427)

    public val getPlanePtr: VoidPtr =
        TypeManager.getMethodBindPtr("WorldBoundaryShape3D", "get_plane", 2753500971)
  }
}
