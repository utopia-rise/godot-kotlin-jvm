// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import kotlin.Suppress
import kotlin.Unit

/**
 * Node that instances a [godot.MultiMesh].
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/performance/using_multimesh.html]($DOCS_URL/tutorials/performance/using_multimesh.html)
 *
 * [godot.MultiMeshInstance3D] is a specialized node to instance [godot.GeometryInstance3D]s based on a [godot.MultiMesh] resource.
 *
 * This is useful to optimize the rendering of a high amount of instances of a given mesh (for example trees in a forest or grass strands).
 */
@GodotBaseType
public open class MultiMeshInstance3D : GeometryInstance3D() {
  /**
   * The [godot.MultiMesh] resource that will be used and shared among all instances of the [godot.MultiMeshInstance3D].
   */
  public open var multimesh: MultiMesh?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESHINSTANCE3D_GET_MULTIMESH,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as MultiMesh?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESHINSTANCE3D_SET_MULTIMESH,
          NIL)
      return TransferContext.readReturnValue(NIL, true) as Unit?
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_MULTIMESHINSTANCE3D)
  }

  public companion object
}
