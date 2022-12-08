// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class OpenXRInterface : XRInterface() {
  public val sessionBegun: Signal0 by signal()

  public val poseRecentered: Signal0 by signal()

  public val sessionFocussed: Signal0 by signal()

  public val sessionStopping: Signal0 by signal()

  public val sessionVisible: Signal0 by signal()

  public override fun __new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_OPENXRINTERFACE, scriptIndex)
  }

  public companion object
}
