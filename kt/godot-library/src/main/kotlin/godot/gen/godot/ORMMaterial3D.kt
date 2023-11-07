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
 * ORMMaterial3D's properties are inherited from [BaseMaterial3D]. Unlike [StandardMaterial3D],
 * ORMMaterial3D uses a single texture for ambient occlusion, roughness and metallic maps, known as an
 * ORM texture.
 */
@GodotBaseType
public open class ORMMaterial3D : BaseMaterial3D() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_ORMMATERIAL3D, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings
}
