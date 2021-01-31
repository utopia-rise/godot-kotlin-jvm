// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.Transform
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType.TRANSFORM
import godot.signals.Signal1
import godot.signals.Signal3
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
object ARVRServer : Object() {
  final const val DONT_RESET_ROTATION: Long = 2

  final const val RESET_BUT_KEEP_TILT: Long = 1

  final const val RESET_FULL_ROTATION: Long = 0

  final const val TRACKER_ANCHOR: Long = 4

  final const val TRACKER_ANY: Long = 255

  final const val TRACKER_ANY_KNOWN: Long = 127

  final const val TRACKER_BASESTATION: Long = 2

  final const val TRACKER_CONTROLLER: Long = 1

  final const val TRACKER_UNKNOWN: Long = 128

  val interfaceAdded: Signal1<String> by signal("interface_name")

  val interfaceRemoved: Signal1<String> by signal("interface_name")

  val trackerAdded: Signal3<String, Long, Long> by signal("tracker_name", "type", "id")

  val trackerRemoved: Signal3<String, Long, Long> by signal("tracker_name", "type", "id")

  var primaryInterface: ARVRInterface?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRSERVER_GET_PRIMARY_INTERFACE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as ARVRInterface?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRSERVER_SET_PRIMARY_INTERFACE,
          NIL)
    }

  var worldScale: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRSERVER_GET_WORLD_SCALE,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRSERVER_SET_WORLD_SCALE, NIL)
    }

  override fun __new(): VoidPtr = TransferContext.getSingleton(ENGINECLASS_ARVRSERVER)

  override fun ____DO_NOT_TOUCH_THIS_isSingleton____() = true

  fun centerOnHmd(rotationMode: Long, keepHeight: Boolean) {
    TransferContext.writeArguments(LONG to rotationMode, BOOL to keepHeight)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRSERVER_CENTER_ON_HMD, NIL)
  }

  fun findInterface(name: String): ARVRInterface? {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRSERVER_FIND_INTERFACE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as ARVRInterface?
  }

  fun getHmdTransform(): Transform {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRSERVER_GET_HMD_TRANSFORM,
        TRANSFORM)
    return TransferContext.readReturnValue(TRANSFORM, false) as Transform
  }

  fun getInterface(idx: Long): ARVRInterface? {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRSERVER_GET_INTERFACE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as ARVRInterface?
  }

  fun getInterfaceCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRSERVER_GET_INTERFACE_COUNT,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  fun getInterfaces(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRSERVER_GET_INTERFACES, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  fun getLastCommitUsec(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRSERVER_GET_LAST_COMMIT_USEC,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  fun getLastFrameUsec(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRSERVER_GET_LAST_FRAME_USEC,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  fun getLastProcessUsec(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRSERVER_GET_LAST_PROCESS_USEC,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  fun getReferenceFrame(): Transform {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRSERVER_GET_REFERENCE_FRAME,
        TRANSFORM)
    return TransferContext.readReturnValue(TRANSFORM, false) as Transform
  }

  fun getTracker(idx: Long): ARVRPositionalTracker? {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRSERVER_GET_TRACKER, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as ARVRPositionalTracker?
  }

  fun getTrackerCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRSERVER_GET_TRACKER_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  enum class RotationMode(
    id: Long
  ) {
    RESET_FULL_ROTATION(0),

    RESET_BUT_KEEP_TILT(1),

    DONT_RESET_ROTATION(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class TrackerType(
    id: Long
  ) {
    TRACKER_CONTROLLER(1),

    TRACKER_BASESTATION(2),

    TRACKER_ANCHOR(4),

    TRACKER_ANY_KNOWN(127),

    TRACKER_UNKNOWN(128),

    TRACKER_ANY(255);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }
}
