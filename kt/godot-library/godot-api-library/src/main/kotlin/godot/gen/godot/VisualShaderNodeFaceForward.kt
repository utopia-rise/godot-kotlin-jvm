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

private const val ENGINE_CLASS_VISUALSHADERNODEFACEFORWARD_INDEX: Int = 728

/**
 * Translates to `faceforward(N, I, Nref)` in the shader language. The function has three vector
 * parameters: `N`, the vector to orient, `I`, the incident vector, and `Nref`, the reference vector.
 * If the dot product of `I` and `Nref` is smaller than zero the return value is `N`. Otherwise, `-N`
 * is returned.
 */
@GodotBaseType
public open class VisualShaderNodeFaceForward : VisualShaderNodeVectorBase() {
  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_VISUALSHADERNODEFACEFORWARD_INDEX, scriptIndex)
  }

  public companion object

  public object MethodBindings
}
