// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 *
 */
@GodotBaseType
public object ResourceUID : Object() {
  /**
   *
   */
  public final const val INVALID_ID: Long = -1

  public override fun __new(): Unit {
    rawPtr = TransferContext.getSingleton(ENGINECLASS_RESOURCEUID)
  }

  public override fun ____DO_NOT_TOUCH_THIS_isSingleton____() = true

  /**
   *
   */
  public fun idToText(id: Long): String {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCEUID_ID_TO_TEXT, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   *
   */
  public fun textToId(textId: String): Long {
    TransferContext.writeArguments(STRING to textId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCEUID_TEXT_TO_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   *
   */
  public fun createId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCEUID_CREATE_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   *
   */
  public fun hasId(id: Long): Boolean {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCEUID_HAS_ID, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   *
   */
  public fun addId(id: Long, path: String): Unit {
    TransferContext.writeArguments(LONG to id, STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCEUID_ADD_ID, NIL)
  }

  /**
   *
   */
  public fun setId(id: Long, path: String): Unit {
    TransferContext.writeArguments(LONG to id, STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCEUID_SET_ID, NIL)
  }

  /**
   *
   */
  public fun getIdPath(id: Long): String {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCEUID_GET_ID_PATH, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   *
   */
  public fun removeId(id: Long): Unit {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCEUID_REMOVE_ID, NIL)
  }
}
