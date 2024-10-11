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

private const val ENGINE_CLASS_MARKER3D_INDEX: Int = 362

/**
 * Generic 3D position hint for editing. It's just like a plain [Node3D], but it displays as a cross
 * in the 3D editor at all times.
 */
@GodotBaseType
public open class Marker3D : Node3D() {
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
    Internals.callConstructor(this, ENGINE_CLASS_MARKER3D_INDEX, scriptIndex)
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

  public object MethodBindings {
    internal val setGizmoExtentsPtr: VoidPtr =
        Internals.getMethodBindPtr("Marker3D", "set_gizmo_extents", 373806689)

    internal val getGizmoExtentsPtr: VoidPtr =
        Internals.getMethodBindPtr("Marker3D", "get_gizmo_extents", 1740695150)
  }
}
