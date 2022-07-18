// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.TransferContext
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class VisualScriptSceneNode : VisualScriptNode() {
  public var nodePath: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTSCENENODE_GET_NODE_PATH,
          NODE_PATH.ordinal)
      return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTSCENENODE_SET_NODE_PATH,
          NIL.ordinal)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_VISUALSCRIPTSCENENODE)
  }

  public companion object
}
