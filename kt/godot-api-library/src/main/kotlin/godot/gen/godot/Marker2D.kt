// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.NIL
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_MARKER2D_INDEX: Int = 361

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
    Internals.callConstructor(this, ENGINE_CLASS_MARKER2D_INDEX, scriptIndex)
  }

  public final fun setGizmoExtents(extents: Float): Unit {
    Internals.writeArguments(DOUBLE to extents.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setGizmoExtentsPtr, NIL)
  }

  public final fun getGizmoExtents(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getGizmoExtentsPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public companion object

  internal object MethodBindings {
    public val setGizmoExtentsPtr: VoidPtr =
        Internals.getMethodBindPtr("Marker2D", "set_gizmo_extents", 373806689)

    public val getGizmoExtentsPtr: VoidPtr =
        Internals.getMethodBindPtr("Marker2D", "get_gizmo_extents", 1740695150)
  }
}
