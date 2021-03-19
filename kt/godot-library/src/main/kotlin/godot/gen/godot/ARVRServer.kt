// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

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
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String
import kotlin.Suppress

/**
 * Server for AR and VR features.
 * 
 * Tutorials:
 * [https://docs.godotengine.org/en/latest/tutorials/vr/index.html](https://docs.godotengine.org/en/latest/tutorials/vr/index.html)
 * 
 * The AR/VR server is the heart of our Advanced and Virtual Reality solution and handles all the processing.
 */
@GodotBaseType
object ARVRServer : Object() {
  /**
   * Does not reset the orientation of the HMD, only the position of the player gets centered.
   */
  final const val DONT_RESET_ROTATION: Long = 2

  /**
   * Resets the orientation but keeps the tilt of the device. So if we're looking down, we keep looking down but heading will be reset.
   */
  final const val RESET_BUT_KEEP_TILT: Long = 1

  /**
   * Fully reset the orientation of the HMD. Regardless of what direction the user is looking to in the real world. The user will look dead ahead in the virtual world.
   */
  final const val RESET_FULL_ROTATION: Long = 0

  /**
   * The tracker tracks the location and size of an AR anchor.
   */
  final const val TRACKER_ANCHOR: Long = 4

  /**
   * Used internally to select all trackers.
   */
  final const val TRACKER_ANY: Long = 255

  /**
   * Used internally to filter trackers of any known type.
   */
  final const val TRACKER_ANY_KNOWN: Long = 127

  /**
   * The tracker tracks the location of a base station.
   */
  final const val TRACKER_BASESTATION: Long = 2

  /**
   * The tracker tracks the location of a controller.
   */
  final const val TRACKER_CONTROLLER: Long = 1

  /**
   * Used internally if we haven't set the tracker type yet.
   */
  final const val TRACKER_UNKNOWN: Long = 128

  /**
   * Emitted when a new interface has been added.
   */
  val interfaceAdded: Signal1<String> by signal("interface_name")

  /**
   * Emitted when an interface is removed.
   */
  val interfaceRemoved: Signal1<String> by signal("interface_name")

  /**
   * Emitted when a new tracker has been added. If you don't use a fixed number of controllers or if you're using [godot.ARVRAnchor]s for an AR solution, it is important to react to this signal to add the appropriate [godot.ARVRController] or [godot.ARVRAnchor] nodes related to this new tracker.
   */
  val trackerAdded: Signal3<String, Long, Long> by signal("tracker_name", "type", "id")

  /**
   * Emitted when a tracker is removed. You should remove any [godot.ARVRController] or [godot.ARVRAnchor] points if applicable. This is not mandatory, the nodes simply become inactive and will be made active again when a new tracker becomes available (i.e. a new controller is switched on that takes the place of the previous one).
   */
  val trackerRemoved: Signal3<String, Long, Long> by signal("tracker_name", "type", "id")

  /**
   * The primary [godot.ARVRInterface] currently bound to the [godot.ARVRServer].
   */
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

  /**
   * Allows you to adjust the scale to your game's units. Most AR/VR platforms assume a scale of 1 game world unit = 1 real world meter.
   */
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

  override fun __new() {
    rawPtr = TransferContext.getSingleton(ENGINESINGLETON_ARVRSERVER)
  }

  override fun ____DO_NOT_TOUCH_THIS_isSingleton____() = true

  /**
   * This is an important function to understand correctly. AR and VR platforms all handle positioning slightly differently.
   *
   * For platforms that do not offer spatial tracking, our origin point (0,0,0) is the location of our HMD, but you have little control over the direction the player is facing in the real world.
   *
   * For platforms that do offer spatial tracking, our origin point depends very much on the system. For OpenVR, our origin point is usually the center of the tracking space, on the ground. For other platforms, it's often the location of the tracking camera.
   *
   * This method allows you to center your tracker on the location of the HMD. It will take the current location of the HMD and use that to adjust all your tracking data; in essence, realigning the real world to your player's current position in the game world.
   *
   * For this method to produce usable results, tracking information must be available. This often takes a few frames after starting your game.
   *
   * You should call this method after a few seconds have passed. For instance, when the user requests a realignment of the display holding a designated button on a controller for a short period of time, or when implementing a teleport mechanism.
   */
  fun centerOnHmd(rotationMode: Long, keepHeight: Boolean) {
    TransferContext.writeArguments(LONG to rotationMode, BOOL to keepHeight)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRSERVER_CENTER_ON_HMD, NIL)
  }

  /**
   * Finds an interface by its name. For instance, if your project uses capabilities of an AR/VR platform, you can find the interface for that platform by name and initialize it.
   */
  fun findInterface(name: String): ARVRInterface? {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRSERVER_FIND_INTERFACE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as ARVRInterface?
  }

  /**
   * Returns the primary interface's transformation.
   */
  fun getHmdTransform(): Transform {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRSERVER_GET_HMD_TRANSFORM,
        TRANSFORM)
    return TransferContext.readReturnValue(TRANSFORM, false) as Transform
  }

  /**
   * Returns the interface registered at a given index in our list of interfaces.
   */
  fun getInterface(idx: Long): ARVRInterface? {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRSERVER_GET_INTERFACE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as ARVRInterface?
  }

  /**
   * Returns the number of interfaces currently registered with the AR/VR server. If your project supports multiple AR/VR platforms, you can look through the available interface, and either present the user with a selection or simply try to initialize each interface and use the first one that returns `true`.
   */
  fun getInterfaceCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRSERVER_GET_INTERFACE_COUNT,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns a list of available interfaces the ID and name of each interface.
   */
  fun getInterfaces(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRSERVER_GET_INTERFACES, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns the absolute timestamp (in μs) of the last [godot.ARVRServer] commit of the AR/VR eyes to [godot.VisualServer]. The value comes from an internal call to [godot.OS.getTicksUsec].
   */
  fun getLastCommitUsec(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRSERVER_GET_LAST_COMMIT_USEC,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the duration (in μs) of the last frame. This is computed as the difference between [getLastCommitUsec] and [getLastProcessUsec] when committing.
   */
  fun getLastFrameUsec(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRSERVER_GET_LAST_FRAME_USEC,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the absolute timestamp (in μs) of the last [godot.ARVRServer] process callback. The value comes from an internal call to [godot.OS.getTicksUsec].
   */
  fun getLastProcessUsec(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRSERVER_GET_LAST_PROCESS_USEC,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the reference frame transform. Mostly used internally and exposed for GDNative build interfaces.
   */
  fun getReferenceFrame(): Transform {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRSERVER_GET_REFERENCE_FRAME,
        TRANSFORM)
    return TransferContext.readReturnValue(TRANSFORM, false) as Transform
  }

  /**
   * Returns the positional tracker at the given ID.
   */
  fun getTracker(idx: Long): ARVRPositionalTracker? {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRSERVER_GET_TRACKER, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as ARVRPositionalTracker?
  }

  /**
   * Returns the number of trackers currently registered.
   */
  fun getTrackerCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRSERVER_GET_TRACKER_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  enum class RotationMode(
    id: Long
  ) {
    /**
     * Fully reset the orientation of the HMD. Regardless of what direction the user is looking to in the real world. The user will look dead ahead in the virtual world.
     */
    RESET_FULL_ROTATION(0),

    /**
     * Resets the orientation but keeps the tilt of the device. So if we're looking down, we keep looking down but heading will be reset.
     */
    RESET_BUT_KEEP_TILT(1),

    /**
     * Does not reset the orientation of the HMD, only the position of the player gets centered.
     */
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
    /**
     * The tracker tracks the location of a controller.
     */
    TRACKER_CONTROLLER(1),

    /**
     * The tracker tracks the location of a base station.
     */
    TRACKER_BASESTATION(2),

    /**
     * The tracker tracks the location and size of an AR anchor.
     */
    TRACKER_ANCHOR(4),

    /**
     * Used internally to filter trackers of any known type.
     */
    TRACKER_ANY_KNOWN(127),

    /**
     * Used internally if we haven't set the tracker type yet.
     */
    TRACKER_UNKNOWN(128),

    /**
     * Used internally to select all trackers.
     */
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
