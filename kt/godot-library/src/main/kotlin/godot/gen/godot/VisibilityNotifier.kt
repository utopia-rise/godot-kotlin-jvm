// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.AABB
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
open class VisibilityNotifier : Spatial() {
  val cameraEntered: Signal1<Camera> by signal("camera")

  val cameraExited: Signal1<Camera> by signal("camera")

  val screenEntered: Signal0 by signal()

  val screenExited: Signal0 by signal()

  open var aabb: AABB
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISIBILITYNOTIFIER_GET_AABB,
          godot.core.VariantType.AABB)
      return TransferContext.readReturnValue(godot.core.VariantType.AABB, false) as AABB
    }
    set(value) {
      TransferContext.writeArguments(godot.core.VariantType.AABB to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISIBILITYNOTIFIER_SET_AABB, NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_VISIBILITYNOTIFIER)

  open fun aabb(schedule: AABB.() -> Unit): AABB = aabb.apply{
      schedule(this)
      aabb = this
  }


  open fun isOnScreen(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISIBILITYNOTIFIER_IS_ON_SCREEN,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  companion object
}
