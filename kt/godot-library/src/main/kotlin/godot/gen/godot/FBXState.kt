// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

/**
 * The FBXState handles the state data imported from FBX files.
 */
@GodotBaseType
public open class FBXState : GLTFState() {
  /**
   * If `true`, the import process used auxiliary nodes called geometry helper nodes. These nodes
   * help preserve the pivots and transformations of the original 3D model during import.
   */
  public var allowGeometryHelperNodes: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAllowGeometryHelperNodesPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAllowGeometryHelperNodesPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_FBXSTATE, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val getAllowGeometryHelperNodesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FBXState", "get_allow_geometry_helper_nodes")

    public val setAllowGeometryHelperNodesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FBXState", "set_allow_geometry_helper_nodes")
  }
}
