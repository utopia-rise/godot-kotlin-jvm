// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.MemoryManager
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * UV polar coord node will transform UV values into polar coordinates, with specified scale, zoom
 * strength and repeat parameters. It can be used to create various swirl distortions.
 */
@GodotBaseType
public open class VisualShaderNodeUVPolarCoord : VisualShaderNode() {
  public override fun new(scriptIndex: Int): Unit {
    MemoryManager.createNativeObject(ENGINECLASS_VISUALSHADERNODEUVPOLARCOORD, this, scriptIndex)
  }

  public companion object

  internal object MethodBindings
}
