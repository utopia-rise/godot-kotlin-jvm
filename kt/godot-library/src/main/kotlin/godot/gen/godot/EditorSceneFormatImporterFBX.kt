// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import kotlin.Suppress
import kotlin.Unit

/**
 * FBX 3D asset importer.
 *
 * This is an FBX 3D asset importer with full support for most FBX features.
 *
 * If exporting a FBX scene from Autodesk Maya, use these FBX export settings:
 *
 * ```
 * 		- Smoothing Groups
 * 		- Smooth Mesh
 * 		- Triangluate (for meshes with blend shapes)
 * 		- Bake Animation
 * 		- Resample All
 * 		- Deformed Models
 * 		- Skins
 * 		- Blend Shapes
 * 		- Curve Filters
 * 		- Constant Key Reducer
 * 		- Auto Tangents Only
 * 		- *Do not check* Constraints (as it will break the file)
 * 		- Can check Embed Media (embeds textures into the exported FBX file)
 * 		  - Note that when importing embedded media, the texture and mesh will be a single immutable file.
 * 		  - You will have to re-export then re-import the FBX if the texture has changed.
 * 		- Units: Centimeters
 * 		- Up Axis: Y
 * 		- Binary format in FBX 2017
 * 		```
 */
@GodotBaseType
public open abstract class EditorSceneFormatImporterFBX : EditorSceneFormatImporter() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_EDITORSCENEFORMATIMPORTERFBX)
  }

  public companion object
}
