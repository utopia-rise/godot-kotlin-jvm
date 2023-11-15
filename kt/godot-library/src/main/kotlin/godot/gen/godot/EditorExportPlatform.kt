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
 * Identifies a supported export platform, and internally provides the functionality of exporting to that platform.
 *
 * Tutorials:
 * [Console support in Godot](Console support in Godot)
 *
 * Base resource that provides the functionality of exporting a release build of a project to a platform, from the editor. Stores platform-specific metadata such as the name and supported features of the platform, and performs the exporting of projects, PCK files, and ZIP files. Uses an export template for the platform provided at the time of project exporting.
 *
 * Used in scripting by [godot.EditorExportPlugin] to configure platform-specific customization of scenes and resources. See [godot.EditorExportPlugin.BeginCustomizeScenes] and [godot.EditorExportPlugin.BeginCustomizeResources] for more details.
 */
@GodotBaseType
public open class EditorExportPlatform internal constructor() : RefCounted() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_EDITOREXPORTPLATFORM, scriptIndex)
    return true
  }

  public companion object
}
