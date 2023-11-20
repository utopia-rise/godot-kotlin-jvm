// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * A singleton that manages the unique identifiers of all resources within a project.
 *
 * Resource UIDs (Unique IDentifiers) allow the engine to keep references between resources intact, even if files can renamed or moved. They can be accessed with `uid://`.
 *
 * [godot.ResourceUID] keeps track of all registered resource UIDs in a project, generates new UIDs, and converts between their string and integer representations.
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
    getSingleton(ENGINECLASS_RESOURCEUID)
    return false
  }

  /**
   * Converts the given UID to a `uid://` string value.
   */
  public fun idToText(id: Long): String {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, MethodBindings.idToTextPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Extracts the UID value from the given `uid://` string.
   */
  public fun textToId(textId: String): Long {
    TransferContext.writeArguments(STRING to textId)
    TransferContext.callMethod(rawPtr, MethodBindings.textToIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Generates a random resource UID which is guaranteed to be unique within the list of currently loaded UIDs.
   *
   * In order for this UID to be registered, you must call [addId] or [setId].
   */
  public fun createId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.createIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Returns whether the given UID value is known to the cache.
   */
  public fun hasId(id: Long): Boolean {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, MethodBindings.hasIdPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Adds a new UID value which is mapped to the given resource path.
   *
   * Fails with an error if the UID already exists, so be sure to check [hasId] beforehand, or use [setId] instead.
   */
  public fun addId(id: Long, path: String): Unit {
    TransferContext.writeArguments(LONG to id, STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.addIdPtr, NIL)
  }

  /**
   * Updates the resource path of an existing UID.
   *
   * Fails with an error if the UID does not exist, so be sure to check [hasId] beforehand, or use [addId] instead.
   */
  public fun setId(id: Long, path: String): Unit {
    TransferContext.writeArguments(LONG to id, STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.setIdPtr, NIL)
  }

  /**
   * Returns the path that the given UID value refers to.
   *
   * Fails with an error if the UID does not exist, so be sure to check [hasId] beforehand.
   */
  public fun getIdPath(id: Long): String {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, MethodBindings.getIdPathPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Removes a loaded UID value from the cache.
   *
   * Fails with an error if the UID does not exist, so be sure to check [hasId] beforehand.
   */
  public fun removeId(id: Long): Unit {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, MethodBindings.removeIdPtr, NIL)
  }

  internal object MethodBindings {
    public val idToTextPtr: VoidPtr = TypeManager.getMethodBindPtr("ResourceUID", "id_to_text")

    public val textToIdPtr: VoidPtr = TypeManager.getMethodBindPtr("ResourceUID", "text_to_id")

    public val createIdPtr: VoidPtr = TypeManager.getMethodBindPtr("ResourceUID", "create_id")

    public val hasIdPtr: VoidPtr = TypeManager.getMethodBindPtr("ResourceUID", "has_id")

    public val addIdPtr: VoidPtr = TypeManager.getMethodBindPtr("ResourceUID", "add_id")

    public val setIdPtr: VoidPtr = TypeManager.getMethodBindPtr("ResourceUID", "set_id")

    public val getIdPathPtr: VoidPtr = TypeManager.getMethodBindPtr("ResourceUID", "get_id_path")

    public val removeIdPtr: VoidPtr = TypeManager.getMethodBindPtr("ResourceUID", "remove_id")
  }
}
