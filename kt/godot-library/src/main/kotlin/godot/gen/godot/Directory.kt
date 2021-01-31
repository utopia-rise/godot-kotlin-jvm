// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.GodotError
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class Directory : Reference() {
  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS__DIRECTORY)

  open fun changeDir(todir: String): GodotError {
    TransferContext.writeArguments(STRING to todir)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__DIRECTORY_CHANGE_DIR, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun copy(from: String, to: String): GodotError {
    TransferContext.writeArguments(STRING to from, STRING to to)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__DIRECTORY_COPY, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun currentIsDir(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__DIRECTORY_CURRENT_IS_DIR, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun dirExists(path: String): Boolean {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__DIRECTORY_DIR_EXISTS, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun fileExists(path: String): Boolean {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__DIRECTORY_FILE_EXISTS, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun getCurrentDir(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__DIRECTORY_GET_CURRENT_DIR, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun getCurrentDrive(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__DIRECTORY_GET_CURRENT_DRIVE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getDrive(idx: Long): String {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__DIRECTORY_GET_DRIVE, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun getDriveCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__DIRECTORY_GET_DRIVE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getNext(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__DIRECTORY_GET_NEXT, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun getSpaceLeft(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__DIRECTORY_GET_SPACE_LEFT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun listDirBegin(skipNavigational: Boolean = false, skipHidden: Boolean = false):
      GodotError {
    TransferContext.writeArguments(BOOL to skipNavigational, BOOL to skipHidden)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__DIRECTORY_LIST_DIR_BEGIN, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun listDirEnd() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__DIRECTORY_LIST_DIR_END, NIL)
  }

  open fun makeDir(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__DIRECTORY_MAKE_DIR, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun makeDirRecursive(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__DIRECTORY_MAKE_DIR_RECURSIVE, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun open(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__DIRECTORY_OPEN, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun remove(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__DIRECTORY_REMOVE, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun rename(from: String, to: String): GodotError {
    TransferContext.writeArguments(STRING to from, STRING to to)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__DIRECTORY_RENAME, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }
}
