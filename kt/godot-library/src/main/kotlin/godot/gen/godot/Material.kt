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
 * [Material] is a base resource used for coloring and shading geometry. All materials inherit from
 * it and almost all [VisualInstance3D] derived nodes carry a [Material]. A few flags and parameters
 * are shared between all material types and are configured here.
 * Importantly, you can inherit from [Material] to create your own custom material type in script or
 * in GDExtension.
 */
@GodotBaseType
public open class Material : Resource() {
  /**
   * Sets the render priority for objects in 3D scenes. Higher priority objects will be sorted in
   * front of lower priority objects. In other words, all objects with [renderPriority] `1` will render
   * before all objects with [renderPriority] `0`.
   * **Note:** This only applies to [StandardMaterial3D]s and [ShaderMaterial]s with type "Spatial".
   * **Note:** This will not impact how transparent objects are sorted relative to opaque objects or
   * how dynamic meshes will be sorted relative to other opaque meshes. This is because all transparent
   * objects are drawn after all opaque objects and all dynamic opaque meshes are drawn before other
   * opaque meshes.
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
   * Sets the [Material] to be used for the next pass. This renders the object again using a
   * different material.
   * **Note:** [nextPass] materials are not necessarily drawn immediately after the source
   * [Material]. Draw order is determined by material properties, [renderPriority], and distance to
   * camera.
   * **Note:** This only applies to [StandardMaterial3D]s and [ShaderMaterial]s with type "Spatial".
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

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_MATERIAL, scriptIndex)
  }

  /**
   * Only exposed for the purpose of overriding. You cannot call this function directly. Used
   * internally by various editor tools. Used to access the RID of the [Material]'s [Shader].
   */
  public open fun _getShaderRid(): RID {
    throw NotImplementedError("_get_shader_rid is not implemented for Material")
  }

  /**
   * Only exposed for the purpose of overriding. You cannot call this function directly. Used
   * internally by various editor tools.
   */
  public open fun _getShaderMode(): Shader.Mode {
    throw NotImplementedError("_get_shader_mode is not implemented for Material")
  }

  /**
   * Only exposed for the purpose of overriding. You cannot call this function directly. Used
   * internally to determine if [nextPass] should be shown in the editor or not.
   */
  public open fun _canDoNextPass(): Boolean {
    throw NotImplementedError("_can_do_next_pass is not implemented for Material")
  }

  /**
   * Only exposed for the purpose of overriding. You cannot call this function directly. Used
   * internally to determine if [renderPriority] should be shown in the editor or not.
   */
  public open fun _canUseRenderPriority(): Boolean {
    throw NotImplementedError("_can_use_render_priority is not implemented for Material")
  }

  /**
   * Only available when running in the editor. Opens a popup that visualizes the generated shader
   * code, including all variants and internal shader code.
   */
  public fun inspectNativeShaderCode(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.inspectNativeShaderCodePtr, NIL)
  }

  /**
   * Creates a placeholder version of this resource ([PlaceholderMaterial]).
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
