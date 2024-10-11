// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.STRING
import godot.core.VariantParser.STRING_NAME
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_XRTRACKER_INDEX: Int = 852

/**
 * This object is the base of all XR trackers.
 */
@GodotBaseType
public open class XRTracker internal constructor() : RefCounted() {
  /**
   * The type of tracker.
   */
  public final inline var type: XRServer.TrackerType
    @JvmName("typeProperty")
    get() = getTrackerType()
    @JvmName("typeProperty")
    set(`value`) {
      setTrackerType(value)
    }

  /**
   * The unique name of this tracker. The trackers that are available differ between various XR
   * runtimes and can often be configured by the user. Godot maintains a number of reserved names that
   * it expects the [XRInterface] to implement if applicable:
   * - `head` identifies the [XRPositionalTracker] of the players head
   * - `left_hand` identifies the [XRControllerTracker] in the players left hand
   * - `right_hand` identifies the [XRControllerTracker] in the players right hand
   * - `/user/hand_tracker/left` identifies the [XRHandTracker] for the players left hand
   * - `/user/hand_tracker/right` identifies the [XRHandTracker] for the players right hand
   * - `/user/body_tracker` identifies the [XRBodyTracker] for the players body
   * - `/user/face_tracker` identifies the [XRFaceTracker] for the players face
   */
  public final inline var name: StringName
    @JvmName("nameProperty")
    get() = getTrackerName()
    @JvmName("nameProperty")
    set(`value`) {
      setTrackerName(value)
    }

  /**
   * The description of this tracker.
   */
  public final inline var description: String
    @JvmName("descriptionProperty")
    get() = getTrackerDesc()
    @JvmName("descriptionProperty")
    set(`value`) {
      setTrackerDesc(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_XRTRACKER_INDEX, scriptIndex)
  }

  public final fun getTrackerType(): XRServer.TrackerType {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTrackerTypePtr, LONG)
    return XRServer.TrackerType.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setTrackerType(type: XRServer.TrackerType): Unit {
    Internals.writeArguments(LONG to type.id)
    Internals.callMethod(rawPtr, MethodBindings.setTrackerTypePtr, NIL)
  }

  public final fun getTrackerName(): StringName {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTrackerNamePtr, STRING_NAME)
    return (Internals.readReturnValue(STRING_NAME) as StringName)
  }

  public final fun setTrackerName(name: StringName): Unit {
    Internals.writeArguments(STRING_NAME to name)
    Internals.callMethod(rawPtr, MethodBindings.setTrackerNamePtr, NIL)
  }

  public final fun getTrackerDesc(): String {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTrackerDescPtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  public final fun setTrackerDesc(description: String): Unit {
    Internals.writeArguments(STRING to description)
    Internals.callMethod(rawPtr, MethodBindings.setTrackerDescPtr, NIL)
  }

  public companion object

  public object MethodBindings {
    internal val getTrackerTypePtr: VoidPtr =
        Internals.getMethodBindPtr("XRTracker", "get_tracker_type", 2784508102)

    internal val setTrackerTypePtr: VoidPtr =
        Internals.getMethodBindPtr("XRTracker", "set_tracker_type", 3055763575)

    internal val getTrackerNamePtr: VoidPtr =
        Internals.getMethodBindPtr("XRTracker", "get_tracker_name", 2002593661)

    internal val setTrackerNamePtr: VoidPtr =
        Internals.getMethodBindPtr("XRTracker", "set_tracker_name", 3304788590)

    internal val getTrackerDescPtr: VoidPtr =
        Internals.getMethodBindPtr("XRTracker", "get_tracker_desc", 201670096)

    internal val setTrackerDescPtr: VoidPtr =
        Internals.getMethodBindPtr("XRTracker", "set_tracker_desc", 83702148)
  }
}
