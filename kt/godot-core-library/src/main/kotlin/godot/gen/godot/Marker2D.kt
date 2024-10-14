// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.common.interop.VoidPtr
import godot.core.TypeManager
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.NIL
import godot.core.memory.TransferContext
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Generic 2D position hint for editing. It's just like a plain [Node2D], but it displays as a cross
 * in the 2D editor at all times. You can set the cross' visual size by using the gizmo in the 2D
 * editor while the node is selected.
 */
@GodotBaseType
public open class Marker2D : Node2D() {
  /**
   * Size of the gizmo cross that appears in the editor.
   */
  public final inline var gizmoExtents: Float
    @JvmName("gizmoExtentsProperty")
    get() = getGizmoExtents()
    @JvmName("gizmoExtentsProperty")
    set(`value`) {
      setGizmoExtents(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_MARKER2D, scriptIndex)
  }

  public final fun setGizmoExtents(extents: Float): Unit {
    TransferContext.writeArguments(DOUBLE to extents.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setGizmoExtentsPtr, NIL)
  }

  public final fun getGizmoExtents(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getGizmoExtentsPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public companion object

  internal object MethodBindings {
    public val setGizmoExtentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Marker2D", "set_gizmo_extents", 373806689)

    public val getGizmoExtentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Marker2D", "get_gizmo_extents", 1740695150)
  }
}
