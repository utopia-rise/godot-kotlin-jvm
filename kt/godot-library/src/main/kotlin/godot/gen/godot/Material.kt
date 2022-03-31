// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.Shader
import godot.`annotation`.GodotBaseType
import godot.core.RID
import godot.core.TransferContext
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import kotlin.Boolean
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit

/**
 * Abstract base [godot.Resource] for coloring and shading geometry.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/678](https://godotengine.org/asset-library/asset/678)
 *
 * Material is a base [godot.Resource] used for coloring and shading geometry. All materials inherit from it and almost all [godot.VisualInstance3D] derived nodes carry a Material. A few flags and parameters are shared between all material types and are configured here.
 */
@GodotBaseType
public open class Material : Resource() {
  /**
   * Sets the render priority for transparent objects in 3D scenes. Higher priority objects will be sorted in front of lower priority objects.
   *
   * **Note:** This only applies to [godot.StandardMaterial3D]s and [godot.ShaderMaterial]s with type "Spatial".
   *
   * **Note:** This only applies to sorting of transparent objects. This will not impact how transparent objects are sorted relative to opaque objects. This is because opaque objects are not sorted, while transparent objects are sorted from back to front (subject to priority).
   */
  public open var renderPriority: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MATERIAL_GET_RENDER_PRIORITY,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MATERIAL_SET_RENDER_PRIORITY, NIL)
    }

  /**
   * Sets the [godot.Material] to be used for the next pass. This renders the object again using a different material.
   *
   * **Note:** This only applies to [godot.StandardMaterial3D]s and [godot.ShaderMaterial]s with type "Spatial".
   */
  public open var nextPass: Material?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MATERIAL_GET_NEXT_PASS, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Material?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MATERIAL_SET_NEXT_PASS, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_MATERIAL)
  }

  /**
   *
   */
  public open fun _getShaderRid(): RID {
    throw NotImplementedError("_get_shader_rid is not implemented for Material")
  }

  /**
   *
   */
  public open fun _getShaderMode(): Shader.Mode {
    throw NotImplementedError("_get_shader_mode is not implemented for Material")
  }

  /**
   *
   */
  public open fun _canDoNextPass(): Boolean {
    throw NotImplementedError("_can_do_next_pass is not implemented for Material")
  }

  /**
   *
   */
  public open fun _canUseRenderPriority(): Boolean {
    throw NotImplementedError("_can_use_render_priority is not implemented for Material")
  }

  /**
   *
   */
  public open fun inspectNativeShaderCode(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MATERIAL_INSPECT_NATIVE_SHADER_CODE,
        NIL)
  }

  public companion object {
    /**
     * Maximum value for the [renderPriority] parameter.
     */
    public final const val RENDER_PRIORITY_MAX: Long = 127

    /**
     * Minimum value for the [renderPriority] parameter.
     */
    public final const val RENDER_PRIORITY_MIN: Long = -128
  }
}
