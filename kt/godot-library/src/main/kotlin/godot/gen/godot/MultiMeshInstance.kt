// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import kotlin.Suppress

/**
 * Node that instances a [godot.MultiMesh].
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/latest/tutorials/3d/vertex_animation/animating_thousands_of_fish.html](https://docs.godotengine.org/en/latest/tutorials/3d/vertex_animation/animating_thousands_of_fish.html)
 * [https://docs.godotengine.org/en/latest/tutorials/3d/using_multi_mesh_instance.html](https://docs.godotengine.org/en/latest/tutorials/3d/using_multi_mesh_instance.html)
 * [https://docs.godotengine.org/en/latest/tutorials/optimization/using_multimesh.html](https://docs.godotengine.org/en/latest/tutorials/optimization/using_multimesh.html)
 *
 * [godot.MultiMeshInstance] is a specialized node to instance [godot.GeometryInstance]s based on a [godot.MultiMesh] resource.
 *
 * This is useful to optimize the rendering of a high amount of instances of a given mesh (for example trees in a forest or grass strands).
 */
@GodotBaseType
open class MultiMeshInstance : GeometryInstance() {
  /**
   * The [godot.MultiMesh] resource that will be used and shared among all instances of the [godot.MultiMeshInstance].
   */
  open var multimesh: MultiMesh?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESHINSTANCE_GET_MULTIMESH,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as MultiMesh?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESHINSTANCE_SET_MULTIMESH,
          NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_MULTIMESHINSTANCE)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }
}
