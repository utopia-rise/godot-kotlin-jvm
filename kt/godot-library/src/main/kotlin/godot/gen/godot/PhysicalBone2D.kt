// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * A 2D node that can be used for physically aware bones in 2D.
 *
 * The `PhysicalBone2D` node is a [godot.RigidBody2D]-based node that can be used to make [godot.Bone2D] nodes in a [godot.Skeleton2D] react to physics. This node is very similar to the [godot.PhysicalBone3D] node, just for 2D instead of 3D.
 *
 * **Note:** To have the Bone2D nodes visually follow the `PhysicalBone2D` node, use a [godot.SkeletonModification2DPhysicalBones] modification on the [godot.Skeleton2D] node with the [godot.Bone2D] nodes.
 *
 * **Note:** The PhysicalBone2D node does not automatically create a [godot.Joint2D] node to keep `PhysicalBone2D` nodes together. You will need to create these manually. For most cases, you want to use a [godot.PinJoint2D] node. The `PhysicalBone2D` node can automatically configure the [godot.Joint2D] node once it's been created as a child node.
 */
@GodotBaseType
public open class PhysicalBone2D : RigidDynamicBody2D() {
  /**
   * The [godot.core.NodePath] to the [godot.Bone2D] node that this `PhysicalBone2D` node is supposed to be simulating.
   */
  public var bone2dNodepath: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICALBONE2D_GET_BONE2D_NODEPATH, NODE_PATH)
      return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICALBONE2D_SET_BONE2D_NODEPATH, NIL)
    }

  /**
   * The index of the [godot.Bone2D] node that this `PhysicalBone2D` node is supposed to be simulating.
   */
  public var bone2dIndex: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICALBONE2D_GET_BONE2D_INDEX,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICALBONE2D_SET_BONE2D_INDEX,
          NIL)
    }

  /**
   * If `true`, the `PhysicalBone2D` node will automatically configure the first [godot.Joint2D] child node. The automatic configuration is limited to setting up the node properties and positioning the [godot.Joint2D].
   */
  public var autoConfigureJoint: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICALBONE2D_GET_AUTO_CONFIGURE_JOINT, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICALBONE2D_SET_AUTO_CONFIGURE_JOINT, NIL)
    }

  /**
   * If `true`, the `PhysicalBone2D` will start simulating using physics. If `false`, the `PhysicalBone2D` will follow the transform of the [godot.Bone2D] node.
   *
   * **Note:** To have the Bone2D nodes visually follow the `PhysicalBone2D` node, use a [godot.SkeletonModification2DPhysicalBones] modification on the [godot.Skeleton2D] node with the [godot.Bone2D] nodes.
   */
  public var simulatePhysics: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICALBONE2D_GET_SIMULATE_PHYSICS, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICALBONE2D_SET_SIMULATE_PHYSICS, NIL)
    }

  /**
   * If `true`, the `PhysicalBone2D` will keep the transform of the bone it is bound to when simulating physics.
   */
  public var followBoneWhenSimulating: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICALBONE2D_GET_FOLLOW_BONE_WHEN_SIMULATING, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICALBONE2D_SET_FOLLOW_BONE_WHEN_SIMULATING, NIL)
    }

  public override fun __new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_PHYSICALBONE2D, scriptIndex)
  }

  /**
   * Returns the first [godot.Joint2D] child node, if one exists. This is mainly a helper function to make it easier to get the [godot.Joint2D] that the `PhysicalBone2D` is autoconfiguring.
   */
  public fun getJoint(): Joint2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICALBONE2D_GET_JOINT, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Joint2D?
  }

  /**
   * Returns a boolean that indicates whether the `PhysicalBone2D` node is running and simulating using the Godot 2D physics engine. When `true`, the PhysicalBone2D node is using physics.
   */
  public fun isSimulatingPhysics(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICALBONE2D_IS_SIMULATING_PHYSICS, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public companion object
}
