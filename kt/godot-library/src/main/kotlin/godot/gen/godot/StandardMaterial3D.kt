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
 * A PBR (Physically Based Rendering) material to be used on 3D objects.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/3d/standard_material_3d.html]($DOCS_URL/tutorials/3d/standard_material_3d.html)
 *
 * [godot.StandardMaterial3D]'s properties are inherited from [godot.BaseMaterial3D]. [godot.StandardMaterial3D] uses separate textures for ambient occlusion, roughness and metallic maps. To use a single ORM map for all 3 textures, use an [godot.ORMMaterial3D] instead.
 */
@GodotBaseType
public open class StandardMaterial3D : BaseMaterial3D() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_STANDARDMATERIAL3D, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings
}
