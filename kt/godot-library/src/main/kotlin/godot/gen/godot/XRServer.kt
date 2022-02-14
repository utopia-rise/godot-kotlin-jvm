// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.StringName
import godot.core.TransferContext
import godot.core.Transform3D
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.VariantType.TRANSFORM3D
import godot.signals.Signal1
import godot.signals.Signal2
import godot.signals.signal
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Server for AR and VR features.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/vr/index.html]($DOCS_URL/tutorials/vr/index.html)
 *
 * The AR/VR server is the heart of our Advanced and Virtual Reality solution and handles all the processing.
 */
@GodotBaseType
public object XRServer : Object() {
  /**
   * Emitted when a tracker is removed. You should remove any [godot.XRController3D] or [godot.XRAnchor3D] points if applicable. This is not mandatory, the nodes simply become inactive and will be made active again when a new tracker becomes available (i.e. a new controller is switched on that takes the place of the previous one).
   */
  public val trackerRemoved: Signal2<StringName, Long> by signal("trackerName", "type")

  /**
   * Emitted when a new tracker has been added. If you don't use a fixed number of controllers or if you're using [godot.XRAnchor3D]s for an AR solution, it is important to react to this signal to add the appropriate [godot.XRController3D] or [godot.XRAnchor3D] nodes related to this new tracker.
   */
  public val trackerAdded: Signal2<StringName, Long> by signal("trackerName", "type")

  /**
   * Emitted when an existing tracker has been updated. This can happen if the user switches controllers.
   */
  public val trackerUpdated: Signal2<StringName, Long> by signal("trackerName", "type")

  /**
   * Emitted when an interface is removed.
   */
  public val interfaceRemoved: Signal1<StringName> by signal("interfaceName")

  /**
   * Emitted when a new interface has been added.
   */
  public val interfaceAdded: Signal1<StringName> by signal("interfaceName")

  public override fun __new(): Unit {
    rawPtr = TransferContext.getSingleton(ENGINECLASS_XRSERVER)
  }

  public override fun ____DO_NOT_TOUCH_THIS_isSingleton____() = true

  public open fun getWorldScale(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XRSERVER_GET_WORLD_SCALE, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  public open fun setWorldScale(scale: Double): Unit {
    TransferContext.writeArguments(DOUBLE to scale)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XRSERVER_SET_WORLD_SCALE, NIL)
  }

  /**
   * Returns the reference frame transform. Mostly used internally and exposed for GDExtension build interfaces.
   */
  public open fun getReferenceFrame(): Transform3D {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XRSERVER_GET_REFERENCE_FRAME,
        TRANSFORM3D)
    return TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D
  }

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
  public open fun centerOnHmd(rotationMode: XRServer.RotationMode, keepHeight: Boolean): Unit {
    TransferContext.writeArguments(LONG to rotationMode.id, BOOL to keepHeight)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XRSERVER_CENTER_ON_HMD, NIL)
  }

  /**
   * Returns the primary interface's transformation.
   */
  public open fun getHmdTransform(): Transform3D {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XRSERVER_GET_HMD_TRANSFORM,
        TRANSFORM3D)
    return TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D
  }

  /**
   * Registers an [godot.XRInterface] object.
   */
  public open fun addInterface(_interface: XRInterface): Unit {
    TransferContext.writeArguments(OBJECT to _interface)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XRSERVER_ADD_INTERFACE, NIL)
  }

  /**
   * Returns the number of interfaces currently registered with the AR/VR server. If your project supports multiple AR/VR platforms, you can look through the available interface, and either present the user with a selection or simply try to initialize each interface and use the first one that returns `true`.
   */
  public open fun getInterfaceCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XRSERVER_GET_INTERFACE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Removes this interface.
   */
  public open fun removeInterface(_interface: XRInterface): Unit {
    TransferContext.writeArguments(OBJECT to _interface)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XRSERVER_REMOVE_INTERFACE, NIL)
  }

  /**
   * Returns the interface registered at a given index in our list of interfaces.
   */
  public open fun getInterface(idx: Long): XRInterface? {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XRSERVER_GET_INTERFACE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as XRInterface?
  }

  /**
   * Returns a list of available interfaces the ID and name of each interface.
   */
  public open fun getInterfaces(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XRSERVER_GET_INTERFACES, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Finds an interface by its name. For instance, if your project uses capabilities of an AR/VR platform, you can find the interface for that platform by name and initialize it.
   */
  public open fun findInterface(name: String): XRInterface? {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XRSERVER_FIND_INTERFACE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as XRInterface?
  }

  /**
   * Registers a new [godot.XRPositionalTracker] that tracks a spatial location in real space.
   */
  public open fun addTracker(tracker: XRPositionalTracker): Unit {
    TransferContext.writeArguments(OBJECT to tracker)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XRSERVER_ADD_TRACKER, NIL)
  }

  /**
   * Removes this positional tracker.
   */
  public open fun removeTracker(tracker: XRPositionalTracker): Unit {
    TransferContext.writeArguments(OBJECT to tracker)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XRSERVER_REMOVE_TRACKER, NIL)
  }

  /**
   * Returns a dictionary of trackers for this type.
   */
  public open fun getTrackers(trackerTypes: Long): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(LONG to trackerTypes)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XRSERVER_GET_TRACKERS, DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  /**
   * Returns the positional tracker with this name.
   */
  public open fun getTracker(trackerName: StringName): XRPositionalTracker? {
    TransferContext.writeArguments(STRING_NAME to trackerName)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XRSERVER_GET_TRACKER, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as XRPositionalTracker?
  }

  public open fun getPrimaryInterface(): XRInterface? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XRSERVER_GET_PRIMARY_INTERFACE,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as XRInterface?
  }

  public open fun setPrimaryInterface(_interface: XRInterface): Unit {
    TransferContext.writeArguments(OBJECT to _interface)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XRSERVER_SET_PRIMARY_INTERFACE, NIL)
  }

  public enum class RotationMode(
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
    DONT_RESET_ROTATION(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class TrackerType(
    id: Long
  ) {
    /**
     * The tracker tracks the location of the players head. This is usually a location centered between the players eyes. Note that for handheld AR devices this can be the current location of the device.
     */
    TRACKER_HEAD(1),
    /**
     * The tracker tracks the location of a controller.
     */
    TRACKER_CONTROLLER(2),
    /**
     * The tracker tracks the location of a base station.
     */
    TRACKER_BASESTATION(4),
    /**
     * The tracker tracks the location and size of an AR anchor.
     */
    TRACKER_ANCHOR(8),
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
    TRACKER_ANY(255),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }
}
