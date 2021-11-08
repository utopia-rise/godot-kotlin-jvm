// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import kotlin.Any
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Spherical occlusion primitive for use with the [godot.Occluder] node.
 *
 * [godot.OccluderShape]s are resources used by [godot.Occluder] nodes, allowing geometric occlusion culling.
 *
 * This shape can include multiple spheres. These can be created and deleted either in the Editor inspector or by calling `set_spheres`. The sphere positions can be set by dragging the handle in the Editor viewport. The radius can be set with the smaller handle.
 */
@GodotBaseType
public open class OccluderShapeSphere : OccluderShape() {
  /**
   * The sphere data can be accessed as an array of [godot.core.Plane]s. The position of each sphere is stored in the `normal`, and the radius is stored in the `d` value of the plane.
   */
  public open var spheres: VariantArray<Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OCCLUDERSHAPESPHERE_GET_SPHERES,
          ARRAY)
      return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OCCLUDERSHAPESPHERE_SET_SPHERES,
          NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_OCCLUDERSHAPESPHERE)
  }

  /**
   * Sets an individual sphere's position.
   */
  public open fun setSpherePosition(index: Long, position: Vector3): Unit {
    TransferContext.writeArguments(LONG to index, VECTOR3 to position)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_OCCLUDERSHAPESPHERE_SET_SPHERE_POSITION, NIL)
  }

  /**
   * Sets an individual sphere's radius.
   */
  public open fun setSphereRadius(index: Long, radius: Double): Unit {
    TransferContext.writeArguments(LONG to index, DOUBLE to radius)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_OCCLUDERSHAPESPHERE_SET_SPHERE_RADIUS, NIL)
  }
}
