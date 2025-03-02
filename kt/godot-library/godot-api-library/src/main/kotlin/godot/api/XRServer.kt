// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.Dictionary
import godot.core.Signal0
import godot.core.Signal1
import godot.core.Signal2
import godot.core.StringName
import godot.core.Transform3D
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DICTIONARY
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING
import godot.core.VariantParser.STRING_NAME
import godot.core.VariantParser.TRANSFORM3D
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmStatic

/**
 * The AR/VR server is the heart of our Advanced and Virtual Reality solution and handles all the
 * processing.
 */
@GodotBaseType
public object XRServer : Object() {
  /**
   * Emitted when the reference frame transform changes.
   */
  @JvmStatic
  public val referenceFrameChanged: Signal0 by Signal0

  /**
   * Emitted when a new interface has been added.
   */
  @JvmStatic
  public val interfaceAdded: Signal1<StringName> by Signal1

  /**
   * Emitted when an interface is removed.
   */
  @JvmStatic
  public val interfaceRemoved: Signal1<StringName> by Signal1

  /**
   * Emitted when a new tracker has been added. If you don't use a fixed number of controllers or if
   * you're using [XRAnchor3D]s for an AR solution, it is important to react to this signal to add the
   * appropriate [XRController3D] or [XRAnchor3D] nodes related to this new tracker.
   */
  @JvmStatic
  public val trackerAdded: Signal2<StringName, Long> by Signal2

  /**
   * Emitted when an existing tracker has been updated. This can happen if the user switches
   * controllers.
   */
  @JvmStatic
  public val trackerUpdated: Signal2<StringName, Long> by Signal2

  /**
   * Emitted when a tracker is removed. You should remove any [XRController3D] or [XRAnchor3D]
   * points if applicable. This is not mandatory, the nodes simply become inactive and will be made
   * active again when a new tracker becomes available (i.e. a new controller is switched on that takes
   * the place of the previous one).
   */
  @JvmStatic
  public val trackerRemoved: Signal2<StringName, Long> by Signal2

  public override fun new(scriptIndex: Int): Unit {
    getSingleton(35)
  }

  @JvmStatic
  public final fun getWorldScale(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getWorldScalePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  @JvmStatic
  public final fun setWorldScale(scale: Double): Unit {
    TransferContext.writeArguments(DOUBLE to scale)
    TransferContext.callMethod(ptr, MethodBindings.setWorldScalePtr, NIL)
  }

  @JvmStatic
  public final fun getWorldOrigin(): Transform3D {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getWorldOriginPtr, TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D) as Transform3D)
  }

  @JvmStatic
  public final fun setWorldOrigin(worldOrigin: Transform3D): Unit {
    TransferContext.writeArguments(TRANSFORM3D to worldOrigin)
    TransferContext.callMethod(ptr, MethodBindings.setWorldOriginPtr, NIL)
  }

  /**
   * Returns the reference frame transform. Mostly used internally and exposed for GDExtension build
   * interfaces.
   */
  @JvmStatic
  public final fun getReferenceFrame(): Transform3D {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getReferenceFramePtr, TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D) as Transform3D)
  }

  /**
   * Clears the reference frame that was set by previous calls to [centerOnHmd].
   */
  @JvmStatic
  public final fun clearReferenceFrame(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.clearReferenceFramePtr, NIL)
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
  @JvmStatic
  public final fun centerOnHmd(rotationMode: RotationMode, keepHeight: Boolean): Unit {
    TransferContext.writeArguments(LONG to rotationMode.id, BOOL to keepHeight)
    TransferContext.callMethod(ptr, MethodBindings.centerOnHmdPtr, NIL)
  }

  /**
   * Returns the primary interface's transformation.
   */
  @JvmStatic
  public final fun getHmdTransform(): Transform3D {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getHmdTransformPtr, TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D) as Transform3D)
  }

  @JvmStatic
  public final fun setCameraLockedToOrigin(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setCameraLockedToOriginPtr, NIL)
  }

  @JvmStatic
  public final fun isCameraLockedToOrigin(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isCameraLockedToOriginPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Registers an [XRInterface] object.
   */
  @JvmStatic
  public final fun addInterface(`interface`: XRInterface?): Unit {
    TransferContext.writeArguments(OBJECT to `interface`)
    TransferContext.callMethod(ptr, MethodBindings.addInterfacePtr, NIL)
  }

  /**
   * Returns the number of interfaces currently registered with the AR/VR server. If your project
   * supports multiple AR/VR platforms, you can look through the available interface, and either
   * present the user with a selection or simply try to initialize each interface and use the first one
   * that returns `true`.
   */
  @JvmStatic
  public final fun getInterfaceCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getInterfaceCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Removes this [interface].
   */
  @JvmStatic
  public final fun removeInterface(`interface`: XRInterface?): Unit {
    TransferContext.writeArguments(OBJECT to `interface`)
    TransferContext.callMethod(ptr, MethodBindings.removeInterfacePtr, NIL)
  }

  /**
   * Returns the interface registered at the given [idx] index in the list of interfaces.
   */
  @JvmStatic
  public final fun getInterface(idx: Int): XRInterface? {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getInterfacePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as XRInterface?)
  }

  /**
   * Returns a list of available interfaces the ID and name of each interface.
   */
  @JvmStatic
  public final fun getInterfaces(): VariantArray<Dictionary<Any?, Any?>> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getInterfacesPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Dictionary<Any?, Any?>>)
  }

  /**
   * Finds an interface by its [name]. For example, if your project uses capabilities of an AR/VR
   * platform, you can find the interface for that platform by name and initialize it.
   */
  @JvmStatic
  public final fun findInterface(name: String): XRInterface? {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(ptr, MethodBindings.findInterfacePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as XRInterface?)
  }

  /**
   * Registers a new [XRTracker] that tracks a physical object.
   */
  @JvmStatic
  public final fun addTracker(tracker: XRTracker?): Unit {
    TransferContext.writeArguments(OBJECT to tracker)
    TransferContext.callMethod(ptr, MethodBindings.addTrackerPtr, NIL)
  }

  /**
   * Removes this [tracker].
   */
  @JvmStatic
  public final fun removeTracker(tracker: XRTracker?): Unit {
    TransferContext.writeArguments(OBJECT to tracker)
    TransferContext.callMethod(ptr, MethodBindings.removeTrackerPtr, NIL)
  }

  /**
   * Returns a dictionary of trackers for [trackerTypes].
   */
  @JvmStatic
  public final fun getTrackers(trackerTypes: Int): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(LONG to trackerTypes.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getTrackersPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY) as Dictionary<Any?, Any?>)
  }

  /**
   * Returns the positional tracker with the given [trackerName].
   */
  @JvmStatic
  public final fun getTracker(trackerName: StringName): XRTracker? {
    TransferContext.writeArguments(STRING_NAME to trackerName)
    TransferContext.callMethod(ptr, MethodBindings.getTrackerPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as XRTracker?)
  }

  @JvmStatic
  public final fun getPrimaryInterface(): XRInterface? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPrimaryInterfacePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as XRInterface?)
  }

  @JvmStatic
  public final fun setPrimaryInterface(`interface`: XRInterface?): Unit {
    TransferContext.writeArguments(OBJECT to `interface`)
    TransferContext.callMethod(ptr, MethodBindings.setPrimaryInterfacePtr, NIL)
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
      public fun from(`value`: Long): TrackerType = entries.single { it.id == `value` }
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
      public fun from(`value`: Long): RotationMode = entries.single { it.id == `value` }
    }
  }

  public object MethodBindings {
    internal val getWorldScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRServer", "get_world_scale", 1740695150)

    internal val setWorldScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRServer", "set_world_scale", 373806689)

    internal val getWorldOriginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRServer", "get_world_origin", 3229777777)

    internal val setWorldOriginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRServer", "set_world_origin", 2952846383)

    internal val getReferenceFramePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRServer", "get_reference_frame", 3229777777)

    internal val clearReferenceFramePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRServer", "clear_reference_frame", 3218959716)

    internal val centerOnHmdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRServer", "center_on_hmd", 1450904707)

    internal val getHmdTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRServer", "get_hmd_transform", 4183770049)

    internal val setCameraLockedToOriginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRServer", "set_camera_locked_to_origin", 2586408642)

    internal val isCameraLockedToOriginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRServer", "is_camera_locked_to_origin", 36873697)

    internal val addInterfacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRServer", "add_interface", 1898711491)

    internal val getInterfaceCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRServer", "get_interface_count", 3905245786)

    internal val removeInterfacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRServer", "remove_interface", 1898711491)

    internal val getInterfacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRServer", "get_interface", 4237347919)

    internal val getInterfacesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRServer", "get_interfaces", 3995934104)

    internal val findInterfacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRServer", "find_interface", 1395192955)

    internal val addTrackerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRServer", "add_tracker", 684804553)

    internal val removeTrackerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRServer", "remove_tracker", 684804553)

    internal val getTrackersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRServer", "get_trackers", 3554694381)

    internal val getTrackerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRServer", "get_tracker", 147382240)

    internal val getPrimaryInterfacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRServer", "get_primary_interface", 2143545064)

    internal val setPrimaryInterfacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRServer", "set_primary_interface", 1898711491)
  }
}
