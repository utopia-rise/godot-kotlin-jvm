// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.LONG
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_VISUALSHADERNODEREROUTE_INDEX: Int = 765

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
    Internals.callConstructor(this, ENGINE_CLASS_VISUALSHADERNODEREROUTE_INDEX, scriptIndex)
  }

  /**
   * Returns the port type of the reroute node.
   */
  public final fun getPortType(): VisualShaderNode.PortType {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getPortTypePtr, LONG)
    return VisualShaderNode.PortType.from(Internals.readReturnValue(LONG) as Long)
  }

  public companion object

  public object MethodBindings {
    internal val getPortTypePtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeReroute", "get_port_type", 1287173294)
  }
}
