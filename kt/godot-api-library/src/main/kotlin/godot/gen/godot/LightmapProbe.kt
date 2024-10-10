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

private const val ENGINE_CLASS_LIGHTMAPPROBE_INDEX: Int = 319

/**
 * [LightmapProbe] represents the position of a single manually placed probe for dynamic object
 * lighting with [LightmapGI]. Lightmap probes affect the lighting of [GeometryInstance3D]-derived
 * nodes that have their [GeometryInstance3D.giMode] set to [GeometryInstance3D.GI_MODE_DYNAMIC].
 * Typically, [LightmapGI] probes are placed automatically by setting
 * [LightmapGI.generateProbesSubdiv] to a value other than [LightmapGI.GENERATE_PROBES_DISABLED]. By
 * creating [LightmapProbe] nodes before baking lightmaps, you can add more probes in specific areas
 * for greater detail, or disable automatic generation and rely only on manually placed probes instead.
 * **Note:** [LightmapProbe] nodes that are placed after baking lightmaps are ignored by dynamic
 * objects. You must bake lightmaps again after creating or modifying [LightmapProbe]s for the probes
 * to be effective.
 */
@GodotBaseType
public open class LightmapProbe : Node3D() {
  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_LIGHTMAPPROBE_INDEX, scriptIndex)
  }

  public companion object

  internal object MethodBindings
}
