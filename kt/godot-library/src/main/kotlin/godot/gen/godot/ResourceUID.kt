// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Singleton for managing a cache of resource UIDs within a project.
 *
 * Resources can not only be referenced using their resource paths `res://`, but alternatively through a unique identifier specified via `uid://`.
 *
 * Using UIDs allows for the engine to keep references between resources intact, even if the files get renamed or moved.
 *
 * This singleton is responsible for keeping track of all registered resource UIDs of a project, generating new UIDs and converting between the string and integer representation.
 */
@GodotBaseType
public object ResourceUID : Object() {
  /**
   * The value to use for an invalid UID, for example if the resource could not be loaded.
   *
   * Its text representation is `uid://<invalid>`.
   */
  public final const val INVALID_ID: Long = -1

  public override fun new(scriptIndex: Int): Boolean {
    rawPtr = TransferContext.getSingleton(ENGINECLASS_RESOURCEUID)
    return false
  }

  /**
   * Converts the given UID to a `uid://` string value.
   */
  public fun idToText(id: Long): String {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCEUID_ID_TO_TEXT, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Extracts the UID value from the given `uid://` string.
   */
  public fun textToId(textId: String): Long {
    TransferContext.writeArguments(STRING to textId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCEUID_TEXT_TO_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Generates a random resource UID which is guaranteed to be unique within the list of currently loaded UIDs.
   *
   * In order for this UID to be registered, you must call [addId] or [setId].
   */
  public fun createId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCEUID_CREATE_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns whether the given UID value is known to the cache.
   */
  public fun hasId(id: Long): Boolean {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCEUID_HAS_ID, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Adds a new UID value which is mapped to the given resource path.
   *
   * Fails with an error if the UID already exists, so be sure to check [hasId] beforehand, or use [setId] instead.
   */
  public fun addId(id: Long, path: String): Unit {
    TransferContext.writeArguments(LONG to id, STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCEUID_ADD_ID, NIL)
  }

  /**
   * Updates the resource path of an existing UID.
   *
   * Fails with an error if the UID does not exist, so be sure to check [hasId] beforehand, or use [addId] instead.
   */
  public fun setId(id: Long, path: String): Unit {
    TransferContext.writeArguments(LONG to id, STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCEUID_SET_ID, NIL)
  }

  /**
   * Returns the path that the given UID value refers to.
   *
   * Fails with an error if the UID does not exist, so be sure to check [hasId] beforehand.
   */
  public fun getIdPath(id: Long): String {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCEUID_GET_ID_PATH, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Removes a loaded UID value from the cache.
   *
   * Fails with an error if the UID does not exist, so be sure to check [hasId] beforehand.
   */
  public fun removeId(id: Long): Unit {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCEUID_REMOVE_ID, NIL)
  }
}
