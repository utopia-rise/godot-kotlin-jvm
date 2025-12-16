// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.common.interop.VoidPtr
import kotlin.Suppress
import kotlin.Unit

/**
 * This node defines how particles are emitted. It allows to customize e.g. position and velocity.
 * Available ports are different depending on which function this node is inside (start, process,
 * collision) and whether custom data is enabled.
 */
@GodotBaseType
public open class VisualShaderNodeParticleOutput : VisualShaderNodeOutput() {
  public override fun new(scriptPtr: VoidPtr): Unit {
    createNativeObject(796, scriptPtr)
  }

  public companion object

  public object MethodBindings
}
