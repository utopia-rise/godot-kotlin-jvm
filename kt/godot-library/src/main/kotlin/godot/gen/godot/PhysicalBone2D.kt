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
import kotlin.jvm.JvmName

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
  public final inline var bone2dNodepath: NodePath
    @JvmName("bone2dNodepathProperty")
    get() = getBone2dNodepath()
    @JvmName("bone2dNodepathProperty")
    set(`value`) {
      setBone2dNodepath(value)
    }

  /**
   * The index of the [Bone2D] that this [PhysicalBone2D] should simulate.
   */
  public final inline var bone2dIndex: Int
    @JvmName("bone2dIndexProperty")
    get() = getBone2dIndex()
    @JvmName("bone2dIndexProperty")
    set(`value`) {
      setBone2dIndex(value)
    }

  /**
   * If `true`, the [PhysicalBone2D] will automatically configure the first [Joint2D] child node.
   * The automatic configuration is limited to setting up the node properties and positioning the
   * [Joint2D].
   */
  public final inline var autoConfigureJoint: Boolean
    @JvmName("autoConfigureJointProperty")
    get() = getAutoConfigureJoint()
    @JvmName("autoConfigureJointProperty")
    set(`value`) {
      setAutoConfigureJoint(value)
    }

  /**
   * If `true`, the [PhysicalBone2D] will start simulating using physics. If `false`, the
   * [PhysicalBone2D] will follow the transform of the [Bone2D] node.
   * **Note:** To have the [Bone2D]s visually follow the [PhysicalBone2D], use a
   * [SkeletonModification2DPhysicalBones] modification on the [Skeleton2D] node with the [Bone2D]
   * nodes.
   */
  public final inline var simulatePhysics: Boolean
    @JvmName("simulatePhysicsProperty")
    get() = getSimulatePhysics()
    @JvmName("simulatePhysicsProperty")
    set(`value`) {
      setSimulatePhysics(value)
    }

  /**
   * If `true`, the [PhysicalBone2D] will keep the transform of the bone it is bound to when
   * simulating physics.
   */
  public final inline var followBoneWhenSimulating: Boolean
    @JvmName("followBoneWhenSimulatingProperty")
    get() = getFollowBoneWhenSimulating()
    @JvmName("followBoneWhenSimulatingProperty")
    set(`value`) {
      setFollowBoneWhenSimulating(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_PHYSICALBONE2D, scriptIndex)
  }

  /**
   * Returns the first [Joint2D] child node, if one exists. This is mainly a helper function to make
   * it easier to get the [Joint2D] that the [PhysicalBone2D] is autoconfiguring.
   */
  public final fun getJoint(): Joint2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getJointPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Joint2D?)
  }

  public final fun getAutoConfigureJoint(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAutoConfigureJointPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setAutoConfigureJoint(autoConfigureJoint: Boolean): Unit {
    TransferContext.writeArguments(BOOL to autoConfigureJoint)
    TransferContext.callMethod(rawPtr, MethodBindings.setAutoConfigureJointPtr, NIL)
  }

  public final fun setSimulatePhysics(simulatePhysics: Boolean): Unit {
    TransferContext.writeArguments(BOOL to simulatePhysics)
    TransferContext.callMethod(rawPtr, MethodBindings.setSimulatePhysicsPtr, NIL)
  }

  public final fun getSimulatePhysics(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSimulatePhysicsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns a boolean that indicates whether the [PhysicalBone2D] is running and simulating using
   * the Godot 2D physics engine. When `true`, the PhysicalBone2D node is using physics.
   */
  public final fun isSimulatingPhysics(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isSimulatingPhysicsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setBone2dNodepath(nodepath: NodePath): Unit {
    TransferContext.writeArguments(NODE_PATH to nodepath)
    TransferContext.callMethod(rawPtr, MethodBindings.setBone2dNodepathPtr, NIL)
  }

  public final fun getBone2dNodepath(): NodePath {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getBone2dNodepathPtr, NODE_PATH)
    return (TransferContext.readReturnValue(NODE_PATH) as NodePath)
  }

  public final fun setBone2dIndex(boneIndex: Int): Unit {
    TransferContext.writeArguments(LONG to boneIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setBone2dIndexPtr, NIL)
  }

  public final fun getBone2dIndex(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getBone2dIndexPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setFollowBoneWhenSimulating(followBone: Boolean): Unit {
    TransferContext.writeArguments(BOOL to followBone)
    TransferContext.callMethod(rawPtr, MethodBindings.setFollowBoneWhenSimulatingPtr, NIL)
  }

  public final fun getFollowBoneWhenSimulating(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFollowBoneWhenSimulatingPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
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
