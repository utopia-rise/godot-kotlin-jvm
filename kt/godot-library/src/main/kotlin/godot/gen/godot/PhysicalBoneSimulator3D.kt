// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.RID
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType._RID
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * Node that can be the parent of [PhysicalBone3D] and can apply the simulation results to
 * [Skeleton3D].
 */
@GodotBaseType
public open class PhysicalBoneSimulator3D : SkeletonModifier3D() {
  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_PHYSICALBONESIMULATOR3D, scriptIndex)
  }

  /**
   * Returns a boolean that indicates whether the [PhysicalBoneSimulator3D] is running and
   * simulating.
   */
  public final fun isSimulatingPhysics(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isSimulatingPhysicsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Tells the [PhysicalBone3D] nodes in the Skeleton to stop simulating.
   */
  public final fun physicalBonesStopSimulation(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.physicalBonesStopSimulationPtr, NIL)
  }

  /**
   * Tells the [PhysicalBone3D] nodes in the Skeleton to start simulating and reacting to the
   * physics world.
   * Optionally, a list of bone names can be passed-in, allowing only the passed-in bones to be
   * simulated.
   */
  @JvmOverloads
  public final fun physicalBonesStartSimulation(bones: VariantArray<StringName> =
      godot.core.variantArrayOf()): Unit {
    TransferContext.writeArguments(ARRAY to bones)
    TransferContext.callMethod(rawPtr, MethodBindings.physicalBonesStartSimulationPtr, NIL)
  }

  /**
   * Adds a collision exception to the physical bone.
   * Works just like the [RigidBody3D] node.
   */
  public final fun physicalBonesAddCollisionException(exception: RID): Unit {
    TransferContext.writeArguments(_RID to exception)
    TransferContext.callMethod(rawPtr, MethodBindings.physicalBonesAddCollisionExceptionPtr, NIL)
  }

  /**
   * Removes a collision exception to the physical bone.
   * Works just like the [RigidBody3D] node.
   */
  public final fun physicalBonesRemoveCollisionException(exception: RID): Unit {
    TransferContext.writeArguments(_RID to exception)
    TransferContext.callMethod(rawPtr, MethodBindings.physicalBonesRemoveCollisionExceptionPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val isSimulatingPhysicsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBoneSimulator3D", "is_simulating_physics", 36873697)

    public val physicalBonesStopSimulationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBoneSimulator3D", "physical_bones_stop_simulation", 3218959716)

    public val physicalBonesStartSimulationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBoneSimulator3D", "physical_bones_start_simulation", 2787316981)

    public val physicalBonesAddCollisionExceptionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBoneSimulator3D", "physical_bones_add_collision_exception", 2722037293)

    public val physicalBonesRemoveCollisionExceptionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBoneSimulator3D", "physical_bones_remove_collision_exception", 2722037293)
  }
}
