// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.GodotError
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class RegEx : Reference() {
  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_REGEX)

  open fun clear() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REGEX_CLEAR, NIL)
  }

  open fun compile(pattern: String): GodotError {
    TransferContext.writeArguments(STRING to pattern)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REGEX_COMPILE, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun getGroupCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REGEX_GET_GROUP_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getNames(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REGEX_GET_NAMES, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  open fun getPattern(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REGEX_GET_PATTERN, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun isValid(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REGEX_IS_VALID, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun search(
    subject: String,
    offset: Long = 0,
    end: Long = -1
  ): RegExMatch? {
    TransferContext.writeArguments(STRING to subject, LONG to offset, LONG to end)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REGEX_SEARCH, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as RegExMatch?
  }

  open fun searchAll(
    subject: String,
    offset: Long = 0,
    end: Long = -1
  ): VariantArray<Any?> {
    TransferContext.writeArguments(STRING to subject, LONG to offset, LONG to end)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REGEX_SEARCH_ALL, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  open fun sub(
    subject: String,
    replacement: String,
    all: Boolean = false,
    offset: Long = 0,
    end: Long = -1
  ): String {
    TransferContext.writeArguments(STRING to subject, STRING to replacement, BOOL to all, LONG to
        offset, LONG to end)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REGEX_SUB, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }
}
