// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier", "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST", "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT", "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.RID
import godot.core.StringName
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.NIL
import godot.core.VariantParser._RID
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

/**
 * Node that can be the parent of [PhysicalBone3D] and can apply the simulation results to [Skeleton3D].
 */
@GodotBaseType
public open class PhysicalBoneSimulator3D : SkeletonModifier3D() {
  override fun new(scriptIndex: Int) {
    createNativeObject(457, scriptIndex)
  }

  /**
   * Returns a boolean that indicates whether the [PhysicalBoneSimulator3D] is running and simulating.
   */
  public final fun isSimulatingPhysics(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isSimulatingPhysicsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Tells the [PhysicalBone3D] nodes in the Skeleton to stop simulating.
   */
  public final fun physicalBonesStopSimulation() {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.physicalBonesStopSimulationPtr, NIL)
  }

  /**
   * Tells the [PhysicalBone3D] nodes in the Skeleton to start simulating and reacting to the physics world.
   *
   * Optionally, a list of bone names can be passed-in, allowing only the passed-in bones to be simulated.
   */
  @JvmOverloads
  public final fun physicalBonesStartSimulation(bones: VariantArray<StringName> = godot.core.variantArrayOf()) {
    TransferContext.writeArguments(ARRAY to bones)
    TransferContext.callMethod(ptr, MethodBindings.physicalBonesStartSimulationPtr, NIL)
  }

  /**
   * Adds a collision exception to the physical bone.
   *
   * Works just like the [RigidBody3D] node.
   */
  public final fun physicalBonesAddCollisionException(exception: RID) {
    TransferContext.writeArguments(_RID to exception)
    TransferContext.callMethod(ptr, MethodBindings.physicalBonesAddCollisionExceptionPtr, NIL)
  }

  /**
   * Removes a collision exception to the physical bone.
   *
   * Works just like the [RigidBody3D] node.
   */
  public final fun physicalBonesRemoveCollisionException(exception: RID) {
    TransferContext.writeArguments(_RID to exception)
    TransferContext.callMethod(ptr, MethodBindings.physicalBonesRemoveCollisionExceptionPtr, NIL)
  }

  public companion object

  public object MethodBindings {
    internal val isSimulatingPhysicsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBoneSimulator3D", "is_simulating_physics", 36_873_697)

    internal val physicalBonesStopSimulationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBoneSimulator3D", "physical_bones_stop_simulation", 3_218_959_716)

    internal val physicalBonesStartSimulationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBoneSimulator3D", "physical_bones_start_simulation", 2_787_316_981)

    internal val physicalBonesAddCollisionExceptionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBoneSimulator3D", "physical_bones_add_collision_exception", 2_722_037_293)

    internal val physicalBonesRemoveCollisionExceptionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalBoneSimulator3D", "physical_bones_remove_collision_exception", 2_722_037_293)
  }
}
