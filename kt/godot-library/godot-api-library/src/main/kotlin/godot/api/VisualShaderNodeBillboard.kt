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
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
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
   * Controls how the object faces the camera.
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
    createNativeObject(745, scriptIndex)
  }

  public final fun setBillboardType(billboardType: BillboardType): Unit {
    TransferContext.writeArguments(LONG to billboardType.value)
    TransferContext.callMethod(ptr, MethodBindings.setBillboardTypePtr, NIL)
  }

  public final fun getBillboardType(): BillboardType {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBillboardTypePtr, LONG)
    return BillboardType.from(TransferContext.readReturnValue(LONG) as Long)
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
    `value`: Long,
  ) : GodotEnum {
    /**
     * Billboarding is disabled and the node does nothing.
     */
    DISABLED(0),
    /**
     * A standard billboarding algorithm is enabled.
     */
    ENABLED(1),
    /**
     * A billboarding algorithm to rotate around Y-axis is enabled.
     */
    FIXED_Y(2),
    /**
     * A billboarding algorithm designed to use on particles is enabled.
     */
    PARTICLES(3),
    /**
     * Represents the size of the [BillboardType] enum.
     */
    MAX(4),
    ;

    public override val `value`: Long
    init {
      this.`value` = `value`
    }

    public companion object {
      public fun from(`value`: Long): BillboardType = entries.single { it.`value` == `value` }
    }
  }

  public companion object

  public object MethodBindings {
    internal val setBillboardTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeBillboard", "set_billboard_type", 1227463289)

    internal val getBillboardTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeBillboard", "get_billboard_type", 3724188517)

    internal val setKeepScaleEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeBillboard", "set_keep_scale_enabled", 2586408642)

    internal val isKeepScaleEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeBillboard", "is_keep_scale_enabled", 36873697)
  }
}
