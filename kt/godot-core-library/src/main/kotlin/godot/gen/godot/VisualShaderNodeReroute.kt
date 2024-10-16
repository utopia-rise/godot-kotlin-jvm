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
import godot.core.VariantParser.LONG
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Automatically adapts its port type to the type of the incoming connection and ensures valid
 * connections.
 */
@GodotBaseType
public open class VisualShaderNodeReroute : VisualShaderNode() {
  public final inline val portType: VisualShaderNode.PortType
    @JvmName("portTypeProperty")
    get() = getPortType()

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_VISUALSHADERNODEREROUTE, scriptIndex)
  }

  /**
   * Returns the port type of the reroute node.
   */
  public final fun getPortType(): VisualShaderNode.PortType {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPortTypePtr, LONG)
    return VisualShaderNode.PortType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public companion object

  internal object MethodBindings {
    public val getPortTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeReroute", "get_port_type", 1287173294)
  }
}
