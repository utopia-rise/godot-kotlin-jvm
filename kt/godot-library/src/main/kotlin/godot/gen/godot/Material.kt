// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.RID
import godot.core.TypeManager
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
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
  public var renderPriority: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRenderPriorityPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setRenderPriorityPtr, NIL)
    }

  /**
   * Sets the [godot.Material] to be used for the next pass. This renders the object again using a different material.
   *
   * **Note:** This only applies to [godot.StandardMaterial3D]s and [godot.ShaderMaterial]s with type "Spatial".
   */
  public var nextPass: Material?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getNextPassPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Material?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setNextPassPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_MATERIAL, scriptIndex)
    return true
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
  public fun inspectNativeShaderCode(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.inspectNativeShaderCodePtr, NIL)
  }

  /**
   * Creates a placeholder version of this resource ([godot.PlaceholderMaterial]).
   */
  public fun createPlaceholder(): Resource? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.createPlaceholderPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Resource?)
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

  internal object MethodBindings {
    public val _getShaderRidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Material", "_get_shader_rid")

    public val _getShaderModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Material", "_get_shader_mode")

    public val _canDoNextPassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Material", "_can_do_next_pass")

    public val _canUseRenderPriorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Material", "_can_use_render_priority")

    public val setNextPassPtr: VoidPtr = TypeManager.getMethodBindPtr("Material", "set_next_pass")

    public val getNextPassPtr: VoidPtr = TypeManager.getMethodBindPtr("Material", "get_next_pass")

    public val setRenderPriorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Material", "set_render_priority")

    public val getRenderPriorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Material", "get_render_priority")

    public val inspectNativeShaderCodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Material", "inspect_native_shader_code")

    public val createPlaceholderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Material", "create_placeholder")
  }
}
