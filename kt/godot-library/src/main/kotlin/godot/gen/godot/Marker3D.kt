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
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * Generic 3D position hint for editing. It's just like a plain [Node3D], but it displays as a cross
 * in the 3D editor at all times.
 */
@GodotBaseType
public open class Marker3D : Node3D() {
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

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_MARKER3D, scriptIndex)
  }

  public companion object

  internal object MethodBindings {
    public val setGizmoExtentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Marker3D", "set_gizmo_extents", 373806689)

    public val getGizmoExtentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Marker3D", "get_gizmo_extents", 1740695150)
  }
}
