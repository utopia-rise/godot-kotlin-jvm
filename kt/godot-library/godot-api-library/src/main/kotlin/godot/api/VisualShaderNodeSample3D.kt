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
import godot.core.GodotEnum
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * A virtual class, use the descendants instead.
 */
@GodotBaseType
public open class VisualShaderNodeSample3D internal constructor() : VisualShaderNode() {
  /**
   * An input source type.
   */
  public final inline var source: Source
    @JvmName("sourceProperty")
    get() = getSource()
    @JvmName("sourceProperty")
    set(`value`) {
      setSource(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(791, scriptIndex)
  }

  public final fun setSource(`value`: Source): Unit {
    TransferContext.writeArguments(LONG to value.id)
    TransferContext.callMethod(ptr, MethodBindings.setSourcePtr, NIL)
  }

  public final fun getSource(): Source {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSourcePtr, LONG)
    return Source.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public enum class Source(
    id: Long,
  ) : GodotEnum {
    /**
     * Creates internal uniform and provides a way to assign it within node.
     */
    TEXTURE(0),
    /**
     * Use the uniform texture from sampler port.
     */
    PORT(1),
    /**
     * Represents the size of the [Source] enum.
     */
    MAX(2),
    ;

    public override val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Source = entries.single { it.id == `value` }
    }
  }

  public companion object

  public object MethodBindings {
    internal val setSourcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeSample3D", "set_source", 3315130991)

    internal val getSourcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeSample3D", "get_source", 1079494121)
  }
}
