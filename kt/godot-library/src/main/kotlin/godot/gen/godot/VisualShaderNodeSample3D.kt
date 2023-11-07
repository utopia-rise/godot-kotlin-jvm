// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * A virtual class, use the descendants instead.
 */
@GodotBaseType
public open class VisualShaderNodeSample3D internal constructor() : VisualShaderNode() {
  /**
   * An input source type.
   */
  public var source: Source
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSourcePtr, LONG)
      return VisualShaderNodeSample3D.Source.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setSourcePtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISUALSHADERNODESAMPLE3D, scriptIndex)
    return true
  }

  public enum class Source(
    id: Long,
  ) {
    /**
     * Creates internal uniform and provides a way to assign it within node.
     */
    SOURCE_TEXTURE(0),
    /**
     * Use the uniform texture from sampler port.
     */
    SOURCE_PORT(1),
    /**
     * Represents the size of the [enum Source] enum.
     */
    SOURCE_MAX(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setSourcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeSample3D", "set_source")

    public val getSourcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeSample3D", "get_source")
  }
}
