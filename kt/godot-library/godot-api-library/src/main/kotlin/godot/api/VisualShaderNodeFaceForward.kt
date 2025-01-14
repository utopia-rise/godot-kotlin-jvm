// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

private const val ENGINECLASS_VISUALSHADERNODEFACEFORWARD: Int = 728

/**
 * Translates to `faceforward(N, I, Nref)` in the shader language. The function has three vector
 * parameters: `N`, the vector to orient, `I`, the incident vector, and `Nref`, the reference vector.
 * If the dot product of `I` and `Nref` is smaller than zero the return value is `N`. Otherwise, `-N`
 * is returned.
 */
@GodotBaseType
public open class VisualShaderNodeFaceForward : VisualShaderNodeVectorBase() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_VISUALSHADERNODEFACEFORWARD, scriptIndex)
  }

  public companion object

  public object MethodBindings
}
