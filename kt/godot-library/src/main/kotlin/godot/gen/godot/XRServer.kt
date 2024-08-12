// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.StringName
import godot.core.Transform3D
import godot.core.TypeManager
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
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.Signal2
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * The AR/VR server is the heart of our Advanced and Virtual Reality solution and handles all the
 * processing.
 */
@GodotBaseType
public object XRServer : Object() {
  /**
   * Emitted when the reference frame transform changes.
   */
  public val referenceFrameChanged: Signal0 by signal()

  /**
   * Emitted when a new interface has been added.
   */
  public val interfaceAdded: Signal1<StringName> by signal("interfaceName")

  /**
   * Emitted when an interface is removed.
   */
  public val interfaceRemoved: Signal1<StringName> by signal("interfaceName")

  /**
   * Emitted when a new tracker has been added. If you don't use a fixed number of controllers or if
   * you're using [XRAnchor3D]s for an AR solution, it is important to react to this signal to add the
   * appropriate [XRController3D] or [XRAnchor3D] nodes related to this new tracker.
   */
  public val trackerAdded: Signal2<StringName, Long> by signal("trackerName", "type")

  /**
   * Emitted when an existing tracker has been updated. This can happen if the user switches
   * controllers.
   */
  public val trackerUpdated: Signal2<StringName, Long> by signal("trackerName", "type")

  /**
   * Emitted when a tracker is removed. You should remove any [XRController3D] or [XRAnchor3D]
   * points if applicable. This is not mandatory, the nodes simply become inactive and will be made
   * active again when a new tracker becomes available (i.e. a new controller is switched on that takes
   * the place of the previous one).
   */
  public val trackerRemoved: Signal2<StringName, Long> by signal("trackerName", "type")

  public override fun new(scriptIndex: Int): Boolean {
    getSingleton(ENGINECLASS_XRSERVER)
    return false
  }

  public fun getWorldScale(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getWorldScalePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double)
  }

  public fun setWorldScale(scale: Double): Unit {
    TransferContext.writeArguments(DOUBLE to scale)
    TransferContext.callMethod(rawPtr, MethodBindings.setWorldScalePtr, NIL)
  }

  public fun getWorldOrigin(): Transform3D {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getWorldOriginPtr, TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D)
  }

  public fun setWorldOrigin(worldOrigin: Transform3D): Unit {
    TransferContext.writeArguments(TRANSFORM3D to worldOrigin)
    TransferContext.callMethod(rawPtr, MethodBindings.setWorldOriginPtr, NIL)
  }

  /**
   * Returns the reference frame transform. Mostly used internally and exposed for GDExtension build
   * interfaces.
   */
  public fun getReferenceFrame(): Transform3D {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getReferenceFramePtr, TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D)
  }

  /**
   * Clears the reference frame that was set by previous calls to [centerOnHmd].
   */
  public fun clearReferenceFrame(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearReferenceFramePtr, NIL)
  }

  /**
   * This is an important function to understand correctly. AR and VR platforms all handle
   * positioning slightly differently.
   * For platforms that do not offer spatial tracking, our origin point (0, 0, 0) is the location of
   * our HMD, but you have little control over the direction the player is facing in the real world.
   * For platforms that do offer spatial tracking, our origin point depends very much on the system.
   * For OpenVR, our origin point is usually the center of the tracking space, on the ground. For other
   * platforms, it's often the location of the tracking camera.
   * This method allows you to center your tracker on the location of the HMD. It will take the
   * current location of the HMD and use that to adjust all your tracking data; in essence, realigning
   * the real world to your player's current position in the game world.
   * For this method to produce usable results, tracking information must be available. This often
   * takes a few frames after starting your game.
   * You should call this method after a few seconds have passed. For example, when the user
   * requests a realignment of the display holding a designated button on a controller for a short
   * period of time, or when implementing a teleport mechanism.
   */
  public fun centerOnHmd(rotationMode: RotationMode, keepHeight: Boolean): Unit {
    TransferContext.writeArguments(LONG to rotationMode.id, BOOL to keepHeight)
    TransferContext.callMethod(rawPtr, MethodBindings.centerOnHmdPtr, NIL)
  }

  /**
   * Returns the primary interface's transformation.
   */
  public fun getHmdTransform(): Transform3D {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getHmdTransformPtr, TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D)
  }

  /**
   * Registers an [XRInterface] object.
   */
  public fun addInterface(_interface: XRInterface): Unit {
    TransferContext.writeArguments(OBJECT to _interface)
    TransferContext.callMethod(rawPtr, MethodBindings.addInterfacePtr, NIL)
  }

  /**
   * Returns the number of interfaces currently registered with the AR/VR server. If your project
   * supports multiple AR/VR platforms, you can look through the available interface, and either
   * present the user with a selection or simply try to initialize each interface and use the first one
   * that returns `true`.
   */
  public fun getInterfaceCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getInterfaceCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Removes this [interface].
   */
  public fun removeInterface(_interface: XRInterface): Unit {
    TransferContext.writeArguments(OBJECT to _interface)
    TransferContext.callMethod(rawPtr, MethodBindings.removeInterfacePtr, NIL)
  }

  /**
   * Returns the interface registered at the given [idx] index in the list of interfaces.
   */
  public fun getInterface(idx: Int): XRInterface? {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getInterfacePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as XRInterface?)
  }

  /**
   * Returns a list of available interfaces the ID and name of each interface.
   */
  public fun getInterfaces(): VariantArray<Dictionary<Any?, Any?>> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getInterfacesPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Dictionary<Any?, Any?>>)
  }

  /**
   * Finds an interface by its [name]. For example, if your project uses capabilities of an AR/VR
   * platform, you can find the interface for that platform by name and initialize it.
   */
  public fun findInterface(name: String): XRInterface? {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.findInterfacePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as XRInterface?)
  }

  /**
   * Registers a new [XRTracker] that tracks a physical object.
   */
  public fun addTracker(tracker: XRTracker): Unit {
    TransferContext.writeArguments(OBJECT to tracker)
    TransferContext.callMethod(rawPtr, MethodBindings.addTrackerPtr, NIL)
  }

  /**
   * Removes this [tracker].
   */
  public fun removeTracker(tracker: XRTracker): Unit {
    TransferContext.writeArguments(OBJECT to tracker)
    TransferContext.callMethod(rawPtr, MethodBindings.removeTrackerPtr, NIL)
  }

  /**
   * Returns a dictionary of trackers for [trackerTypes].
   */
  public fun getTrackers(trackerTypes: Int): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(LONG to trackerTypes.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getTrackersPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  /**
   * Returns the positional tracker with the given [trackerName].
   */
  public fun getTracker(trackerName: StringName): XRTracker? {
    TransferContext.writeArguments(STRING_NAME to trackerName)
    TransferContext.callMethod(rawPtr, MethodBindings.getTrackerPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as XRTracker?)
  }

  public fun getPrimaryInterface(): XRInterface? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPrimaryInterfacePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as XRInterface?)
  }

  public fun setPrimaryInterface(_interface: XRInterface): Unit {
    TransferContext.writeArguments(OBJECT to _interface)
    TransferContext.callMethod(rawPtr, MethodBindings.setPrimaryInterfacePtr, NIL)
  }

  public enum class TrackerType(
    id: Long,
  ) {
    /**
     * The tracker tracks the location of the players head. This is usually a location centered
     * between the players eyes. Note that for handheld AR devices this can be the current location of
     * the device.
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
     * The tracker tracks the location and joints of a hand.
     */
    TRACKER_HAND(16),
    /**
     * The tracker tracks the location and joints of a body.
     */
    TRACKER_BODY(32),
    /**
     * The tracker tracks the expressions of a face.
     */
    TRACKER_FACE(64),
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class RotationMode(
    id: Long,
  ) {
    /**
     * Fully reset the orientation of the HMD. Regardless of what direction the user is looking to
     * in the real world. The user will look dead ahead in the virtual world.
     */
    RESET_FULL_ROTATION(0),
    /**
     * Resets the orientation but keeps the tilt of the device. So if we're looking down, we keep
     * looking down but heading will be reset.
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  internal object MethodBindings {
    public val getWorldScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRServer", "get_world_scale")

    public val setWorldScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRServer", "set_world_scale")

    public val getWorldOriginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRServer", "get_world_origin")

    public val setWorldOriginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRServer", "set_world_origin")

    public val getReferenceFramePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRServer", "get_reference_frame")

    public val clearReferenceFramePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRServer", "clear_reference_frame")

    public val centerOnHmdPtr: VoidPtr = TypeManager.getMethodBindPtr("XRServer", "center_on_hmd")

    public val getHmdTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRServer", "get_hmd_transform")

    public val addInterfacePtr: VoidPtr = TypeManager.getMethodBindPtr("XRServer", "add_interface")

    public val getInterfaceCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRServer", "get_interface_count")

    public val removeInterfacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRServer", "remove_interface")

    public val getInterfacePtr: VoidPtr = TypeManager.getMethodBindPtr("XRServer", "get_interface")

    public val getInterfacesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRServer", "get_interfaces")

    public val findInterfacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRServer", "find_interface")

    public val addTrackerPtr: VoidPtr = TypeManager.getMethodBindPtr("XRServer", "add_tracker")

    public val removeTrackerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRServer", "remove_tracker")

    public val getTrackersPtr: VoidPtr = TypeManager.getMethodBindPtr("XRServer", "get_trackers")

    public val getTrackerPtr: VoidPtr = TypeManager.getMethodBindPtr("XRServer", "get_tracker")

    public val getPrimaryInterfacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRServer", "get_primary_interface")

    public val setPrimaryInterfacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRServer", "set_primary_interface")
  }
}
