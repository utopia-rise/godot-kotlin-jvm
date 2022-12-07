// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import kotlin.Suppress
import kotlin.Unit

/**
 * Represents a single manually placed probe for dynamic object lighting with [godot.LightmapGI].
 *
 * [godot.LightmapProbe] represents the position of a single manually placed probe for dynamic object lighting with [godot.LightmapGI].
 *
 * Typically, [godot.LightmapGI] probes are placed automatically by setting [godot.LightmapGI.generateProbesSubdiv] to a value other than [godot.LightmapGI.GENERATE_PROBES_DISABLED]. By creating [godot.LightmapProbe] nodes before baking lightmaps, you can add more probes in specific areas for greater detail, or disable automatic generation and rely only on manually placed probes instead.
 */
@GodotBaseType
public open class LightmapProbe : Node3D() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_LIGHTMAPPROBE)
  }

  public companion object
}
