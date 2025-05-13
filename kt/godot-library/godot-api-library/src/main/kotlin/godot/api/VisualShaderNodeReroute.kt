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
import godot.core.MethodStringName0
import godot.core.VariantParser.LONG
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmStatic

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
    createNativeObject(786, scriptIndex)
  }

  /**
   * Returns the port type of the reroute node.
   */
  public final fun getPortType(): VisualShaderNode.PortType {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPortTypePtr, LONG)
    return VisualShaderNode.PortType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public companion object {
    @JvmStatic
    public val getPortTypeName:
        MethodStringName0<VisualShaderNodeReroute, VisualShaderNode.PortType> =
        MethodStringName0<VisualShaderNodeReroute, VisualShaderNode.PortType>("get_port_type")
  }

  public object MethodBindings {
    internal val getPortTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeReroute", "get_port_type", 1287173294)
  }
}
