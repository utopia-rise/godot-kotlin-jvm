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
 * Overrides global shader parameters' values in a specific scene.
 *
 * Similar to how a [godot.WorldEnvironment] node can be used to override the environment while a specific scene is loaded, [godot.ShaderGlobalsOverride] can be used to override global shader parameters temporarily. Once the node is removed, the project-wide values for the global shader parameters are restored. See the [godot.RenderingServer] `global_shader_parameter_*` methods for more information.
 *
 * **Note:** Only one [godot.ShaderGlobalsOverride] can be used per scene. If there is more than one [godot.ShaderGlobalsOverride] node in the scene tree, only the first node (in tree order) will be taken into account.
 *
 * **Note:** All [godot.ShaderGlobalsOverride] nodes are made part of a `"shader_overrides_group"` group when they are added to the scene tree. The currently active [godot.ShaderGlobalsOverride] node also has a `"shader_overrides_group_active"` group added to it. You can use this to check which [godot.ShaderGlobalsOverride] node is currently active.
 */
@GodotBaseType
public open class ShaderGlobalsOverride : Node() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SHADERGLOBALSOVERRIDE, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings
}
