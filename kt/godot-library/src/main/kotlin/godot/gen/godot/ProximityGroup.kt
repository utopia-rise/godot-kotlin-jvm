// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import godot.signals.Signal2
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * General-purpose proximity detection node.
 *
 * General-purpose proximity detection node.
 */
@GodotBaseType
open class ProximityGroup : Spatial() {
  /**
   *
   */
  val broadcast: Signal2<String, VariantArray<Any?>> by signal("group_name", "parameters")

  /**
   *
   */
  open var dispatchMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROXIMITYGROUP_GET_DISPATCH_MODE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROXIMITYGROUP_SET_DISPATCH_MODE,
          NIL)
    }

  /**
   *
   */
  open var gridRadius: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROXIMITYGROUP_GET_GRID_RADIUS,
          VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(value) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROXIMITYGROUP_SET_GRID_RADIUS,
          NIL)
    }

  /**
   *
   */
  open var groupName: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROXIMITYGROUP_GET_GROUP_NAME,
          STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROXIMITYGROUP_SET_GROUP_NAME,
          NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_PROXIMITYGROUP)

  open fun gridRadius(schedule: Vector3.() -> Unit): Vector3 = gridRadius.apply{
      schedule(this)
      gridRadius = this
  }


  open fun _proximityGroupBroadcast(name: String, params: Any?) {
  }

  /**
   *
   */
  open fun broadcast(name: String, parameters: Any?) {
    TransferContext.writeArguments(STRING to name, ANY to parameters)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROXIMITYGROUP_BROADCAST, NIL)
  }

  enum class DispatchMode(
    id: Long
  ) {
    /**
     *
     */
    MODE_PROXY(0),

    /**
     *
     */
    MODE_SIGNAL(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    /**
     *
     */
    final const val MODE_PROXY: Long = 0

    /**
     *
     */
    final const val MODE_SIGNAL: Long = 1
  }
}
