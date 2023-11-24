// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress

/**
 * Generic 2D position hint for editing.
 *
 * Generic 2D position hint for editing. It's just like a plain [godot.Node2D], but it displays as a cross in the 2D editor at all times. You can set the cross' visual size by using the gizmo in the 2D editor while the node is selected.
 */
@GodotBaseType
public open class Marker2D : Node2D() {
  /**
   * Size of the gizmo cross that appears in the editor.
   */
  public var gizmoExtents: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGizmoExtentsPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setGizmoExtentsPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_MARKER2D, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setGizmoExtentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Marker2D", "set_gizmo_extents")

    public val getGizmoExtentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Marker2D", "get_gizmo_extents")
  }
}
