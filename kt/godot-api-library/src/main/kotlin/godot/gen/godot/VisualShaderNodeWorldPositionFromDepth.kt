// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.util.Internals
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

private const val ENGINE_CLASS_VISUALSHADERNODEWORLDPOSITIONFROMDEPTH_INDEX: Int = 731

/**
 * The WorldPositionFromDepth node reconstructs the depth position of the pixel in world space. This
 * can be used to obtain world space UVs for projection mapping like Caustics.
 */
@GodotBaseType
public open class VisualShaderNodeWorldPositionFromDepth : VisualShaderNode() {
  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_VISUALSHADERNODEWORLDPOSITIONFROMDEPTH_INDEX,
        scriptIndex)
  }

  public companion object

  internal object MethodBindings
}
