// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.MemoryManager
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * The WorldPositionFromDepth node reconstructs the depth position of the pixel in world space. This
 * can be used to obtain world space UVs for projection mapping like Caustics.
 */
@GodotBaseType
public open class VisualShaderNodeWorldPositionFromDepth : VisualShaderNode() {
  public override fun new(scriptIndex: Int): Unit {
    MemoryManager.createNativeObject(ENGINECLASS_VISUALSHADERNODEWORLDPOSITIONFROMDEPTH, this,
        scriptIndex)
  }

  public companion object

  internal object MethodBindings
}
