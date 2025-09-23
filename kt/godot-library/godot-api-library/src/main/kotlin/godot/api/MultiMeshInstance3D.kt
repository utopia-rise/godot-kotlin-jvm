// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * [MultiMeshInstance3D] is a specialized node to instance [GeometryInstance3D]s based on a
 * [MultiMesh] resource.
 *
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
    createNativeObject(374, scriptIndex)
  }

  public final fun setMultimesh(multimesh: MultiMesh?): Unit {
    TransferContext.writeArguments(OBJECT to multimesh)
    TransferContext.callMethod(ptr, MethodBindings.setMultimeshPtr, NIL)
  }

  public final fun getMultimesh(): MultiMesh? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMultimeshPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as MultiMesh?)
  }

  public companion object

  public object MethodBindings {
    internal val setMultimeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiMeshInstance3D", "set_multimesh", 2246127404)

    internal val getMultimeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiMeshInstance3D", "get_multimesh", 1385450523)
  }
}
