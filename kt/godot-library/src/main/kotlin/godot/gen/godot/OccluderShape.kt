// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import kotlin.Suppress
import kotlin.Unit

/**
 * Base class for shapes used for occlusion culling by the [godot.Occluder] node.
 *
 * [godot.Occluder]s can use any primitive shape derived from [godot.OccluderShape].
 */
@GodotBaseType
public open class OccluderShape : Resource() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_OCCLUDERSHAPE)
  }
}
