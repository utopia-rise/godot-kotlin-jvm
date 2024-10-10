// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

private const val ENGINE_CLASS_STANDARDMATERIAL3D_INDEX: Int = 549

/**
 * [StandardMaterial3D]'s properties are inherited from [BaseMaterial3D]. [StandardMaterial3D] uses
 * separate textures for ambient occlusion, roughness and metallic maps. To use a single ORM map for
 * all 3 textures, use an [ORMMaterial3D] instead.
 */
@GodotBaseType
public open class StandardMaterial3D : BaseMaterial3D() {
  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINE_CLASS_STANDARDMATERIAL3D_INDEX, scriptIndex)
  }

  public companion object

  internal object MethodBindings
}
