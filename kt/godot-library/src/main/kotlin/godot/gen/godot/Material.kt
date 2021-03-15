// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import kotlin.Long
import kotlin.Suppress

/**
 * Abstract base [godot.Resource] for coloring and shading geometry.
 *
 * Material is a base [godot.Resource] used for coloring and shading geometry. All materials inherit from it and almost all [godot.VisualInstance] derived nodes carry a Material. A few flags and parameters are shared between all material types and are configured here.
 */
@GodotBaseType
open class Material : Resource() {
  /**
   * Sets the [godot.Material] to be used for the next pass. This renders the object again using a different material.
   *
   * **Note:** only applies to [godot.SpatialMaterial]s and [godot.ShaderMaterial]s with type "Spatial".
   */
  open var nextPass: Material?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MATERIAL_GET_NEXT_PASS, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Material?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MATERIAL_SET_NEXT_PASS, NIL)
    }

  /**
   * Sets the render priority for transparent objects in 3D scenes. Higher priority objects will be sorted in front of lower priority objects.
   *
   * **Note:** this only applies to sorting of transparent objects. This will not impact how transparent objects are sorted relative to opaque objects. This is because opaque objects are not sorted, while transparent objects are sorted from back to front (subject to priority).
   */
  open var renderPriority: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MATERIAL_GET_RENDER_PRIORITY,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MATERIAL_SET_RENDER_PRIORITY, NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_MATERIAL, ____DO_NOT_TOUCH_THIS_isRef____())
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  companion object {
    /**
     * Maximum value for the [renderPriority] parameter.
     */
    final const val RENDER_PRIORITY_MAX: Long = 127

    /**
     * Minimum value for the [renderPriority] parameter.
     */
    final const val RENDER_PRIORITY_MIN: Long = -128
  }
}
