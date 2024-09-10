// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * This object is the base of all XR trackers.
 */
@GodotBaseType
public open class XRTracker internal constructor() : RefCounted() {
  /**
   * The type of tracker.
   */
  public var type: XRServer.TrackerType
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTrackerTypePtr, LONG)
      return XRServer.TrackerType.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setTrackerTypePtr, NIL)
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
  public var name: StringName
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTrackerNamePtr, STRING_NAME)
      return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING_NAME to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTrackerNamePtr, NIL)
    }

  /**
   * The description of this tracker.
   */
  public var description: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTrackerDescPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTrackerDescPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_XRTRACKER, scriptIndex)
  }

  public companion object

  internal object MethodBindings {
    public val getTrackerTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRTracker", "get_tracker_type", 2784508102)

    public val setTrackerTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRTracker", "set_tracker_type", 3055763575)

    public val getTrackerNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRTracker", "get_tracker_name", 2002593661)

    public val setTrackerNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRTracker", "set_tracker_name", 3304788590)

    public val getTrackerDescPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRTracker", "get_tracker_desc", 201670096)

    public val setTrackerDescPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRTracker", "set_tracker_desc", 83702148)
  }
}
