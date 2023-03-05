// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR2
import godot.core.VariantType.VECTOR3
import godot.core.Vector2
import godot.core.Vector3
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * Class representing a planar [godot.PrimitiveMesh].
 *
 * Class representing a planar [godot.PrimitiveMesh]. This flat mesh does not have a thickness. By default, this mesh is aligned on the X and Z axes; this default rotation isn't suited for use with billboarded materials. For billboarded materials, change [orientation] to [FACE_Z].
 *
 * **Note:** When using a large textured [godot.PlaneMesh] (e.g. as a floor), you may stumble upon UV jittering issues depending on the camera angle. To solve this, increase [subdivideDepth] and [subdivideWidth] until you no longer notice UV jittering.
 */
@GodotBaseType
public open class PlaneMesh : PrimitiveMesh() {
  /**
   * Size of the generated plane.
   */
  public var size: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PLANEMESH_GET_SIZE, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PLANEMESH_SET_SIZE, NIL)
    }

  /**
   * Number of subdivision along the X axis.
   */
  public var subdivideWidth: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PLANEMESH_GET_SUBDIVIDE_WIDTH,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PLANEMESH_SET_SUBDIVIDE_WIDTH,
          NIL)
    }

  /**
   * Number of subdivision along the Z axis.
   */
  public var subdivideDepth: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PLANEMESH_GET_SUBDIVIDE_DEPTH,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PLANEMESH_SET_SUBDIVIDE_DEPTH,
          NIL)
    }

  /**
   * Offset of the generated plane. Useful for particles.
   */
  public var centerOffset: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PLANEMESH_GET_CENTER_OFFSET,
          VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PLANEMESH_SET_CENTER_OFFSET, NIL)
    }

  /**
   * Direction that the [godot.PlaneMesh] is facing. See [enum Orientation] for options.
   */
  public var orientation: Orientation
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PLANEMESH_GET_ORIENTATION, LONG)
      return PlaneMesh.Orientation.values()[TransferContext.readReturnValue(JVM_INT) as Int]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PLANEMESH_SET_ORIENTATION, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_PLANEMESH, scriptIndex)
    return true
  }

  public enum class Orientation(
    id: Long,
  ) {
    /**
     * [godot.PlaneMesh] will face the positive X-axis.
     */
    FACE_X(0),
    /**
     * [godot.PlaneMesh] will face the positive Y-axis. This matches the behavior of the [godot.PlaneMesh] in Godot 3.x.
     */
    FACE_Y(1),
    /**
     * [godot.PlaneMesh] will face the positive Z-axis. This matches the behavior of the QuadMesh in Godot 3.x.
     */
    FACE_Z(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object
}
