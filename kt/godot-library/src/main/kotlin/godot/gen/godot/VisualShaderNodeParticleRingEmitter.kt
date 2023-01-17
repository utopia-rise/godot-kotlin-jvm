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
 * A visual shader node that makes particles emitted in a ring shape.
 *
 * [godot.VisualShaderNodeParticleEmitter] that makes the particles emitted in ring shape with the specified inner and outer radii and height.
 */
@GodotBaseType
public open class VisualShaderNodeParticleRingEmitter : VisualShaderNodeParticleEmitter() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISUALSHADERNODEPARTICLERINGEMITTER, scriptIndex)
    return true
  }

  public companion object
}
