// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.NIL
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_FBXSTATE_INDEX: Int = 237

/**
 * The FBXState handles the state data imported from FBX files.
 */
@GodotBaseType
public open class FBXState : GLTFState() {
  /**
   * If `true`, the import process used auxiliary nodes called geometry helper nodes. These nodes
   * help preserve the pivots and transformations of the original 3D model during import.
   */
  public final inline var allowGeometryHelperNodes: Boolean
    @JvmName("allowGeometryHelperNodesProperty")
    get() = getAllowGeometryHelperNodes()
    @JvmName("allowGeometryHelperNodesProperty")
    set(`value`) {
      setAllowGeometryHelperNodes(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_FBXSTATE_INDEX, scriptIndex)
  }

  public final fun getAllowGeometryHelperNodes(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getAllowGeometryHelperNodesPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setAllowGeometryHelperNodes(allow: Boolean): Unit {
    Internals.writeArguments(BOOL to allow)
    Internals.callMethod(rawPtr, MethodBindings.setAllowGeometryHelperNodesPtr, NIL)
  }

  public companion object

  public object MethodBindings {
    internal val getAllowGeometryHelperNodesPtr: VoidPtr =
        Internals.getMethodBindPtr("FBXState", "get_allow_geometry_helper_nodes", 2240911060)

    internal val setAllowGeometryHelperNodesPtr: VoidPtr =
        Internals.getMethodBindPtr("FBXState", "set_allow_geometry_helper_nodes", 2586408642)
  }
}
