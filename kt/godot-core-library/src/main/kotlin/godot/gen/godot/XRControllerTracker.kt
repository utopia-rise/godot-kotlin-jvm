// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.MemoryManager
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * An instance of this object represents a controller that is tracked.
 * As controllers are turned on and the [XRInterface] detects them, instances of this object are
 * automatically added to this list of active tracking objects accessible through the [XRServer].
 * The [XRController3D] consumes objects of this type and should be used in your project.
 */
@GodotBaseType
public open class XRControllerTracker : XRPositionalTracker() {
  public override fun new(scriptIndex: Int): Unit {
    MemoryManager.createNativeObject(ENGINECLASS_XRCONTROLLERTRACKER, this, scriptIndex)
  }

  public companion object

  internal object MethodBindings
}
