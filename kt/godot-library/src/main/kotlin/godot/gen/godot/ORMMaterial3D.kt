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
 * Physically based rendering (PBR) material that can be applied to 3D objects, can use an ORM texture.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/3d/standard_material_3d.html]($DOCS_URL/tutorials/3d/standard_material_3d.html)
 *
 * ORMMaterial3D's properties are inherited from [godot.BaseMaterial3D]. Unlike [godot.StandardMaterial3D], ORMMaterial3D uses a single texture for ambient occlusion, roughness and metallic maps, known as an ORM texture.
 */
@GodotBaseType
public open class ORMMaterial3D : BaseMaterial3D() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_ORMMATERIAL3D, scriptIndex)
    return true
  }

  public companion object
}
