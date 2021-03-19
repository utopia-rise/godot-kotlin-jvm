// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import kotlin.Suppress

/**
 * FBX 3D asset importer based on [godot.Assimp](http://assimp.org/).
 * 
 * This is an FBX 3D asset importer based on [godot.Assimp](http://assimp.org/). It currently has many known limitations and works best with static meshes. Most animated meshes won't import correctly.
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
open class EditorSceneImporterAssimp : EditorSceneImporter() {
  override fun __new() {
    callConstructor(ENGINECLASS_EDITORSCENEIMPORTERASSIMP)
  }
}
