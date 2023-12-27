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
 * [LightmapProbe] represents the position of a single manually placed probe for dynamic object
 * lighting with [LightmapGI].
 * Typically, [LightmapGI] probes are placed automatically by setting
 * [LightmapGI.generateProbesSubdiv] to a value other than [LightmapGI.GENERATEPROBESDISABLED]. By
 * creating [LightmapProbe] nodes before baking lightmaps, you can add more probes in specific areas
 * for greater detail, or disable automatic generation and rely only on manually placed probes instead.
 */
@GodotBaseType
public open class LightmapProbe : Node3D() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_LIGHTMAPPROBE, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings
}
