// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.TransferContext
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import kotlin.Suppress
import kotlin.Unit

/**
 *
 */
@GodotBaseType
public open class ImporterMeshInstance3D : Node3D() {
  /**
   *
   */
  public open var mesh: ImporterMesh?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMPORTERMESHINSTANCE3D_GET_MESH,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as ImporterMesh?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMPORTERMESHINSTANCE3D_SET_MESH,
          NIL)
      return TransferContext.readReturnValue(NIL, true) as Unit?
    }

  /**
   *
   */
  public open var skin: Skin?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMPORTERMESHINSTANCE3D_GET_SKIN,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Skin?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMPORTERMESHINSTANCE3D_SET_SKIN,
          NIL)
      return TransferContext.readReturnValue(NIL, true) as Unit?
    }

  /**
   *
   */
  public open var skeletonPath: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_IMPORTERMESHINSTANCE3D_GET_SKELETON_PATH, NODE_PATH)
      return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_IMPORTERMESHINSTANCE3D_SET_SKELETON_PATH, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_IMPORTERMESHINSTANCE3D)
  }

  public companion object
}
