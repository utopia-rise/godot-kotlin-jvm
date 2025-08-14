// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier", "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST", "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT", "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import kotlin.Int
import kotlin.Suppress

/**
 * The visibility mask allows us to black out the part of the render result that is invisible due to lens distortion.
 *
 * As this is rendered first, it prevents fragments with expensive lighting calculations to be processed as they are discarded through z-checking.
 */
@GodotBaseType
public open class OpenXRVisibilityMask : VisualInstance3D() {
  override fun new(scriptIndex: Int) {
    createNativeObject(431, scriptIndex)
  }

  public companion object

  public object MethodBindings
}
