// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedStringArray
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.Signal2
import godot.signals.signal
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 *
 */
@GodotBaseType
public open class FileSystemDock internal constructor() : VBoxContainer() {
  /**
   *
   */
  public val inherit: Signal1<String> by signal("file")

  /**
   *
   */
  public val instantiate: Signal1<PackedStringArray> by signal("files")

  /**
   *
   */
  public val fileRemoved: Signal1<String> by signal("file")

  /**
   *
   */
  public val folderRemoved: Signal1<String> by signal("folder")

  /**
   *
   */
  public val filesMoved: Signal2<String, String> by signal("oldFile", "newFile")

  /**
   *
   */
  public val folderMoved: Signal2<String, String> by signal("oldFolder", "newFolder")

  /**
   *
   */
  public val displayModeChanged: Signal0 by signal()

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_FILESYSTEMDOCK, scriptIndex)
    return true
  }

  /**
   *
   */
  public fun navigateToPath(path: String): Unit {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILESYSTEMDOCK_NAVIGATE_TO_PATH,
        NIL)
  }

  public companion object
}
