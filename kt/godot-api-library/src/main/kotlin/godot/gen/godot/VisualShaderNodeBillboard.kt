// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_VISUALSHADERNODEBILLBOARD_INDEX: Int = 707

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
    Internals.callConstructor(this, ENGINE_CLASS_VISUALSHADERNODEBILLBOARD_INDEX, scriptIndex)
  }

  public final fun setBillboardType(billboardType: BillboardType): Unit {
    Internals.writeArguments(LONG to billboardType.id)
    Internals.callMethod(rawPtr, MethodBindings.setBillboardTypePtr, NIL)
  }

  public final fun getBillboardType(): BillboardType {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getBillboardTypePtr, LONG)
    return VisualShaderNodeBillboard.BillboardType.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setKeepScaleEnabled(enabled: Boolean): Unit {
    Internals.writeArguments(BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.setKeepScaleEnabledPtr, NIL)
  }

  public final fun isKeepScaleEnabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isKeepScaleEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
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

  public object MethodBindings {
    internal val setBillboardTypePtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeBillboard", "set_billboard_type", 1227463289)

    internal val getBillboardTypePtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeBillboard", "get_billboard_type", 3724188517)

    internal val setKeepScaleEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeBillboard", "set_keep_scale_enabled", 2586408642)

    internal val isKeepScaleEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeBillboard", "is_keep_scale_enabled", 36873697)
  }
}
