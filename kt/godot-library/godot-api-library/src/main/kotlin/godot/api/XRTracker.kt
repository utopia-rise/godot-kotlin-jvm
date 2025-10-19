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
import godot.core.StringName
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.STRING
import godot.core.VariantParser.STRING_NAME
import godot.core.asCachedStringName
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

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
   *
   * - `"head"` identifies the [XRPositionalTracker] of the player's head
   *
   * - `"left_hand"` identifies the [XRControllerTracker] in the player's left hand
   *
   * - `"right_hand"` identifies the [XRControllerTracker] in the player's right hand
   *
   * - `"/user/hand_tracker/left"` identifies the [XRHandTracker] for the player's left hand
   *
   * - `"/user/hand_tracker/right"` identifies the [XRHandTracker] for the player's right hand
   *
   * - `"/user/body_tracker"` identifies the [XRBodyTracker] for the player's body
   *
   * - `"/user/face_tracker"` identifies the [XRFaceTracker] for the player's face
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
    createNativeObject(891, scriptIndex)
  }

  public final fun getTrackerType(): XRServer.TrackerType {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTrackerTypePtr, LONG)
    return XRServer.TrackerType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setTrackerType(type: XRServer.TrackerType): Unit {
    TransferContext.writeArguments(LONG to type.value)
    TransferContext.callMethod(ptr, MethodBindings.setTrackerTypePtr, NIL)
  }

  public final fun getTrackerName(): StringName {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTrackerNamePtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME) as StringName)
  }

  public final fun setTrackerName(name: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(ptr, MethodBindings.setTrackerNamePtr, NIL)
  }

  public final fun getTrackerDesc(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTrackerDescPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  public final fun setTrackerDesc(description: String): Unit {
    TransferContext.writeArguments(STRING to description)
    TransferContext.callMethod(ptr, MethodBindings.setTrackerDescPtr, NIL)
  }

  public final fun setTrackerName(name: String) = setTrackerName(name.asCachedStringName())

  public companion object

  public object MethodBindings {
    internal val getTrackerTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRTracker", "get_tracker_type", 2784508102)

    internal val setTrackerTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRTracker", "set_tracker_type", 3055763575)

    internal val getTrackerNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRTracker", "get_tracker_name", 2002593661)

    internal val setTrackerNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRTracker", "set_tracker_name", 3304788590)

    internal val getTrackerDescPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRTracker", "get_tracker_desc", 201670096)

    internal val setTrackerDescPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRTracker", "set_tracker_desc", 83702148)
  }
}
