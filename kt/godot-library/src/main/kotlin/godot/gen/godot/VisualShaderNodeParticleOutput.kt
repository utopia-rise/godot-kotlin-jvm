// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

/**
 * Visual shader node that defines output values for particle emitting.
 *
 * This node defines how particles are emitted. It allows to customize e.g. position and velocity. Available ports are different depending on which function this node is inside (start, process, collision) and whether custom data is enabled.
 */
@GodotBaseType
public open class VisualShaderNodeParticleOutput : VisualShaderNodeOutput() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISUALSHADERNODEPARTICLEOUTPUT, scriptIndex)
    return true
  }

  public companion object
}
