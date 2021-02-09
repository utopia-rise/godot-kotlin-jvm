// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.RID
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType._RID
import godot.signals.Signal0
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class Resource : Reference() {
  val changed: Signal0 by signal()

  open var resourceLocalToScene: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RESOURCE_GET_RESOURCE_LOCAL_TO_SCENE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RESOURCE_SET_RESOURCE_LOCAL_TO_SCENE, NIL)
    }

  open var resourceName: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCE_GET_RESOURCE_NAME,
          STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCE_SET_RESOURCE_NAME, NIL)
    }

  open var resourcePath: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCE_GET_RESOURCE_PATH,
          STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCE_SET_RESOURCE_PATH, NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_RESOURCE)

  open fun _setup_local_to_scene() {
  }

  open fun duplicate(subresources: Boolean = false): Resource? {
    TransferContext.writeArguments(BOOL to subresources)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCE_DUPLICATE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Resource?
  }

  open fun getLocalScene(): Node? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCE_GET_LOCAL_SCENE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Node?
  }

  open fun getRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCE_GET_RID, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  open fun setupLocalToScene() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCE_SETUP_LOCAL_TO_SCENE, NIL)
  }

  open fun takeOverPath(path: String) {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCE_TAKE_OVER_PATH, NIL)
  }
}
