// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * The output port of this node needs to be connected to `Model View Matrix` port of
 * [VisualShaderNodeOutput].
 */
@GodotBaseType
public open class VisualShaderNodeBillboard : VisualShaderNode() {
  /**
   * Controls how the object faces the camera. See [BillboardType].
   */
  public var billboardType: BillboardType
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBillboardTypePtr, LONG)
      return VisualShaderNodeBillboard.BillboardType.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setBillboardTypePtr, NIL)
    }

  /**
   * If `true`, the shader will keep the scale set for the mesh. Otherwise, the scale is lost when
   * billboarding.
   */
  public var keepScale: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isKeepScaleEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setKeepScaleEnabledPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISUALSHADERNODEBILLBOARD, scriptIndex)
    return true
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
        TypeManager.getMethodBindPtr("VisualShaderNodeBillboard", "set_billboard_type")

    public val getBillboardTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeBillboard", "get_billboard_type")

    public val setKeepScaleEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeBillboard", "set_keep_scale_enabled")

    public val isKeepScaleEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeBillboard", "is_keep_scale_enabled")
  }
}
