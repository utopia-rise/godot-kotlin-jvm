// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * The [PhysicalBone2D] node is a [RigidBody2D]-based node that can be used to make [Bone2D]s in a
 * [Skeleton2D] react to physics.
 * **Note:** To make the [Bone2D]s visually follow the [PhysicalBone2D] node, use a
 * [SkeletonModification2DPhysicalBones] modification on the [Skeleton2D] parent.
 * **Note:** The [PhysicalBone2D] node does not automatically create a [Joint2D] node to keep
 * [PhysicalBone2D] nodes together. They must be created manually. For most cases, you want to use a
 * [PinJoint2D] node. The [PhysicalBone2D] node will automatically configure the [Joint2D] node once
 * it's been added as a child node.
 */
@GodotBaseType
public open class PhysicalBone2D : RigidBody2D() {
  /**
   * The [NodePath] to the [Bone2D] that this [PhysicalBone2D] should simulate.
   */
  public var bone2dNodepath: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBone2dNodepathPtr, NODE_PATH)
      return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setBone2dNodepathPtr, NIL)
    }

  /**
   * The index of the [Bone2D] that this [PhysicalBone2D] should simulate.
   */
  public var bone2dIndex: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBone2dIndexPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setBone2dIndexPtr, NIL)
    }

  /**
   * If `true`, the [PhysicalBone2D] will automatically configure the first [Joint2D] child node.
   * The automatic configuration is limited to setting up the node properties and positioning the
   * [Joint2D].
   */
  public var autoConfigureJoint: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAutoConfigureJointPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAutoConfigureJointPtr, NIL)
    }

  /**
   * If `true`, the [PhysicalBone2D] will start simulating using physics. If `false`, the
   * [PhysicalBone2D] will follow the transform of the [Bone2D] node.
   * **Note:** To have the [Bone2D]s visually follow the [PhysicalBone2D], use a
   * [SkeletonModification2DPhysicalBones] modification on the [Skeleton2D] node with the [Bone2D]
   * nodes.
   */
  public var simulatePhysics: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSimulatePhysicsPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSimulatePhysicsPtr, NIL)
    }

  /**
   * If `true`, the [PhysicalBone2D] will keep the transform of the bone it is bound to when
   * simulating physics.
   */
  public var followBoneWhenSimulating: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFollowBoneWhenSimulatingPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFollowBoneWhenSimulatingPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_PHYSICALBONE2D, scriptIndex)
  }

  /**
   * Returns the first [Joint2D] child node, if one exists. This is mainly a helper function to make
   * it easier to get the [Joint2D] that the [PhysicalBone2D] is autoconfiguring.
   */
  public fun getJoint(): Joint2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getJointPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Joint2D?)
  }

  /**
   * Returns a boolean that indicates whether the [PhysicalBone2D] is running and simulating using
   * the Godot 2D physics engine. When `true`, the PhysicalBone2D node is using physics.
   */
  public fun isSimulatingPhysics(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isSimulatingPhysicsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public companion object

  internal object MethodBindings {
    public val getJointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone2D", "get_joint", 3582132112)

    public val getAutoConfigureJointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone2D", "get_auto_configure_joint", 36873697)

    public val setAutoConfigureJointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone2D", "set_auto_configure_joint", 2586408642)

    public val setSimulatePhysicsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone2D", "set_simulate_physics", 2586408642)

    public val getSimulatePhysicsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone2D", "get_simulate_physics", 36873697)

    public val isSimulatingPhysicsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone2D", "is_simulating_physics", 36873697)

    public val setBone2dNodepathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone2D", "set_bone2d_nodepath", 1348162250)

    public val getBone2dNodepathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone2D", "get_bone2d_nodepath", 4075236667)

    public val setBone2dIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone2D", "set_bone2d_index", 1286410249)

    public val getBone2dIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone2D", "get_bone2d_index", 3905245786)

    public val setFollowBoneWhenSimulatingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone2D", "set_follow_bone_when_simulating", 2586408642)

    public val getFollowBoneWhenSimulatingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBone2D", "get_follow_bone_when_simulating", 36873697)
  }
}
