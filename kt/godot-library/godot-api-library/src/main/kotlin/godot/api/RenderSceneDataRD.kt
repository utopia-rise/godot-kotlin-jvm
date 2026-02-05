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
 * Object holds scene data related to rendering a single frame of a viewport. See also
 * [RenderSceneData], [RenderData], and [RenderDataRD].
 *
 * **Note:** This is an internal rendering server object. Do not instantiate this class from a
 * script.
 */
@GodotBaseType
public open class RenderSceneDataRD : RenderSceneData() {
  public override fun new(scriptPtr: VoidPtr): Unit {
    createNativeObject(270, scriptPtr)
  }

  public companion object

  public object MethodBindings
}
