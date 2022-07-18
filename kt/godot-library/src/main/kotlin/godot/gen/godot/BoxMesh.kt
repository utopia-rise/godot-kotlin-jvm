// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Generate an axis-aligned box [godot.PrimitiveMesh].
 *
 * Generate an axis-aligned box [godot.PrimitiveMesh].
 *
 * The box's UV layout is arranged in a 3×2 layout that allows texturing each face individually. To apply the same texture on all faces, change the material's UV property to `Vector3(3, 2, 1)`.
 *
 * **Note:** When using a large textured [godot.BoxMesh] (e.g. as a floor), you may stumble upon UV jittering issues depending on the camera angle. To solve this, increase [subdivideDepth], [subdivideHeight] and [subdivideWidth] until you no longer notice UV jittering.
 */
@GodotBaseType
public open class BoxMesh : PrimitiveMesh() {
  /**
   * The box's width, height and depth.
   */
  public var size: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_BOXMESH_GET_SIZE, VECTOR3.ordinal)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_BOXMESH_SET_SIZE, NIL.ordinal)
    }

  /**
   * Number of extra edge loops inserted along the X axis.
   */
  public var subdivideWidth: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_BOXMESH_GET_SUBDIVIDE_WIDTH,
          LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_BOXMESH_SET_SUBDIVIDE_WIDTH,
          NIL.ordinal)
    }

  /**
   * Number of extra edge loops inserted along the Y axis.
   */
  public var subdivideHeight: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_BOXMESH_GET_SUBDIVIDE_HEIGHT,
          LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_BOXMESH_SET_SUBDIVIDE_HEIGHT,
          NIL.ordinal)
    }

  /**
   * Number of extra edge loops inserted along the Z axis.
   */
  public var subdivideDepth: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_BOXMESH_GET_SUBDIVIDE_DEPTH,
          LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_BOXMESH_SET_SUBDIVIDE_DEPTH,
          NIL.ordinal)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_BOXMESH)
  }

  public companion object
}
