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
 * Outputs a value of a varying defined in the shader. You need to first create a varying that can
 * be used in the given function, e.g. varying getter in Fragment shader requires a varying with mode
 * set to [VisualShader.VARYING_MODE_VERTEX_TO_FRAG_LIGHT].
 */
@GodotBaseType
public open class VisualShaderNodeVaryingGetter : VisualShaderNodeVarying() {
  public override fun new(scriptIndex: Int): Unit {
    MemoryManager.createNativeObject(ENGINECLASS_VISUALSHADERNODEVARYINGGETTER, this, scriptIndex)
  }

  public companion object

  internal object MethodBindings
}
