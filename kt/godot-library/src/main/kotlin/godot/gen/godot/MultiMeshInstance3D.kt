// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * [MultiMeshInstance3D] is a specialized node to instance [GeometryInstance3D]s based on a
 * [MultiMesh] resource.
 * This is useful to optimize the rendering of a high number of instances of a given mesh (for
 * example trees in a forest or grass strands).
 */
@GodotBaseType
public open class MultiMeshInstance3D : GeometryInstance3D() {
  /**
   * The [MultiMesh] resource that will be used and shared among all instances of the
   * [MultiMeshInstance3D].
   */
  public var multimesh: MultiMesh?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMultimeshPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as MultiMesh?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMultimeshPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_MULTIMESHINSTANCE3D, scriptIndex)
  }

  public companion object

  internal object MethodBindings {
    public val setMultimeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiMeshInstance3D", "set_multimesh")

    public val getMultimeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiMeshInstance3D", "get_multimesh")
  }
}
