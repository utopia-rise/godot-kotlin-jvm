// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_MULTIMESHINSTANCE3D_INDEX: Int = 345

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
  public final inline var multimesh: MultiMesh?
    @JvmName("multimeshProperty")
    get() = getMultimesh()
    @JvmName("multimeshProperty")
    set(`value`) {
      setMultimesh(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINE_CLASS_MULTIMESHINSTANCE3D_INDEX, scriptIndex)
  }

  public final fun setMultimesh(multimesh: MultiMesh?): Unit {
    TransferContext.writeArguments(OBJECT to multimesh)
    TransferContext.callMethod(rawPtr, MethodBindings.setMultimeshPtr, NIL)
  }

  public final fun getMultimesh(): MultiMesh? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMultimeshPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as MultiMesh?)
  }

  public companion object

  internal object MethodBindings {
    public val setMultimeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiMeshInstance3D", "set_multimesh", 2246127404)

    public val getMultimeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiMeshInstance3D", "get_multimesh", 1385450523)
  }
}
