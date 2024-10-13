// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.common.interop.VoidPtr
import godot.core.TypeManager
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * The output port of this node needs to be connected to `Model View Matrix` port of
 * [VisualShaderNodeOutput].
 */
@GodotBaseType
public open class VisualShaderNodeBillboard : VisualShaderNode() {
  /**
   * Controls how the object faces the camera. See [BillboardType].
   */
  public final inline var billboardType: BillboardType
    @JvmName("billboardTypeProperty")
    get() = getBillboardType()
    @JvmName("billboardTypeProperty")
    set(`value`) {
      setBillboardType(value)
    }

  /**
   * If `true`, the shader will keep the scale set for the mesh. Otherwise, the scale is lost when
   * billboarding.
   */
  public final inline var keepScale: Boolean
    @JvmName("keepScaleProperty")
    get() = isKeepScaleEnabled()
    @JvmName("keepScaleProperty")
    set(`value`) {
      setKeepScaleEnabled(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_VISUALSHADERNODEBILLBOARD, scriptIndex)
  }

  public final fun setBillboardType(billboardType: BillboardType): Unit {
    TransferContext.writeArguments(LONG to billboardType.id)
    TransferContext.callMethod(ptr, MethodBindings.setBillboardTypePtr, NIL)
  }

  public final fun getBillboardType(): BillboardType {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBillboardTypePtr, LONG)
    return VisualShaderNodeBillboard.BillboardType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setKeepScaleEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setKeepScaleEnabledPtr, NIL)
  }

  public final fun isKeepScaleEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isKeepScaleEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public enum class BillboardType(
    id: Long,
  ) {
    /**
     * Billboarding is disabled and the node does nothing.
     */
    BILLBOARD_TYPE_DISABLED(0),
    /**
     * A standard billboarding algorithm is enabled.
     */
    BILLBOARD_TYPE_ENABLED(1),
    /**
     * A billboarding algorithm to rotate around Y-axis is enabled.
     */
    BILLBOARD_TYPE_FIXED_Y(2),
    /**
     * A billboarding algorithm designed to use on particles is enabled.
     */
    BILLBOARD_TYPE_PARTICLES(3),
    /**
     * Represents the size of the [BillboardType] enum.
     */
    BILLBOARD_TYPE_MAX(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): BillboardType = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setBillboardTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeBillboard", "set_billboard_type", 1227463289)

    public val getBillboardTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeBillboard", "get_billboard_type", 3724188517)

    public val setKeepScaleEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeBillboard", "set_keep_scale_enabled", 2586408642)

    public val isKeepScaleEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeBillboard", "is_keep_scale_enabled", 36873697)
  }
}
