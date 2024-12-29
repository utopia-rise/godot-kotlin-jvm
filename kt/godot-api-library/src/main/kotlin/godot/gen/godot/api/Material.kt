// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.RID
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

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
  public final inline var renderPriority: Int
    @JvmName("renderPriorityProperty")
    get() = getRenderPriority()
    @JvmName("renderPriorityProperty")
    set(`value`) {
      setRenderPriority(value)
    }

  /**
   * Sets the [Material] to be used for the next pass. This renders the object again using a
   * different material.
   * **Note:** [nextPass] materials are not necessarily drawn immediately after the source
   * [Material]. Draw order is determined by material properties, [renderPriority], and distance to
   * camera.
   * **Note:** This only applies to [StandardMaterial3D]s and [ShaderMaterial]s with type "Spatial".
   */
  public final inline var nextPass: Material?
    @JvmName("nextPassProperty")
    get() = getNextPass()
    @JvmName("nextPassProperty")
    set(`value`) {
      setNextPass(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_MATERIAL, scriptIndex)
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

  public final fun setNextPass(nextPass: Material?): Unit {
    TransferContext.writeArguments(OBJECT to nextPass)
    TransferContext.callMethod(ptr, MethodBindings.setNextPassPtr, NIL)
  }

  public final fun getNextPass(): Material? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getNextPassPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Material?)
  }

  public final fun setRenderPriority(priority: Int): Unit {
    TransferContext.writeArguments(LONG to priority.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setRenderPriorityPtr, NIL)
  }

  public final fun getRenderPriority(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRenderPriorityPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Only available when running in the editor. Opens a popup that visualizes the generated shader
   * code, including all variants and internal shader code.
   */
  public final fun inspectNativeShaderCode(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.inspectNativeShaderCodePtr, NIL)
  }

  /**
   * Creates a placeholder version of this resource ([PlaceholderMaterial]).
   */
  public final fun createPlaceholder(): Resource? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.createPlaceholderPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Resource?)
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
    public val setNextPassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Material", "set_next_pass", 2757459619)

    public val getNextPassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Material", "get_next_pass", 5934680)

    public val setRenderPriorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Material", "set_render_priority", 1286410249)

    public val getRenderPriorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Material", "get_render_priority", 3905245786)

    public val inspectNativeShaderCodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Material", "inspect_native_shader_code", 3218959716)

    public val createPlaceholderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Material", "create_placeholder", 121922552)
  }
}
