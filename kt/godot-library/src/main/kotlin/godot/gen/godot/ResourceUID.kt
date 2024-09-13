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
 * Resource UIDs (Unique IDentifiers) allow the engine to keep references between resources intact,
 * even if files can renamed or moved. They can be accessed with `uid://`.
 * [ResourceUID] keeps track of all registered resource UIDs in a project, generates new UIDs, and
 * converts between their string and integer representations.
 */
@GodotBaseType
public object ResourceUID : Object() {
  /**
   * The value to use for an invalid UID, for example if the resource could not be loaded.
   * Its text representation is `uid://<invalid>`.
   */
  public final const val INVALID_ID: Long = -1

  public override fun new(scriptIndex: Int): Unit {
    getSingleton(ENGINECLASS_RESOURCEUID)
  }

  /**
   * Converts the given UID to a `uid://` string value.
   */
  public final fun idToText(id: Long): String {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, MethodBindings.idToTextPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Extracts the UID value from the given `uid://` string.
   */
  public final fun textToId(textId: String): Long {
    TransferContext.writeArguments(STRING to textId)
    TransferContext.callMethod(rawPtr, MethodBindings.textToIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Generates a random resource UID which is guaranteed to be unique within the list of currently
   * loaded UIDs.
   * In order for this UID to be registered, you must call [addId] or [setId].
   */
  public final fun createId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.createIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns whether the given UID value is known to the cache.
   */
  public final fun hasId(id: Long): Boolean {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, MethodBindings.hasIdPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Adds a new UID value which is mapped to the given resource path.
   * Fails with an error if the UID already exists, so be sure to check [hasId] beforehand, or use
   * [setId] instead.
   */
  public final fun addId(id: Long, path: String): Unit {
    TransferContext.writeArguments(LONG to id, STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.addIdPtr, NIL)
  }

  /**
   * Updates the resource path of an existing UID.
   * Fails with an error if the UID does not exist, so be sure to check [hasId] beforehand, or use
   * [addId] instead.
   */
  public final fun setId(id: Long, path: String): Unit {
    TransferContext.writeArguments(LONG to id, STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.setIdPtr, NIL)
  }

  /**
   * Returns the path that the given UID value refers to.
   * Fails with an error if the UID does not exist, so be sure to check [hasId] beforehand.
   */
  public final fun getIdPath(id: Long): String {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, MethodBindings.getIdPathPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Removes a loaded UID value from the cache.
   * Fails with an error if the UID does not exist, so be sure to check [hasId] beforehand.
   */
  public final fun removeId(id: Long): Unit {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, MethodBindings.removeIdPtr, NIL)
  }

  internal object MethodBindings {
    public val idToTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourceUID", "id_to_text", 844755477)

    public val textToIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourceUID", "text_to_id", 1321353865)

    public val createIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourceUID", "create_id", 2455072627)

    public val hasIdPtr: VoidPtr = TypeManager.getMethodBindPtr("ResourceUID", "has_id", 1116898809)

    public val addIdPtr: VoidPtr = TypeManager.getMethodBindPtr("ResourceUID", "add_id", 501894301)

    public val setIdPtr: VoidPtr = TypeManager.getMethodBindPtr("ResourceUID", "set_id", 501894301)

    public val getIdPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourceUID", "get_id_path", 844755477)

    public val removeIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourceUID", "remove_id", 1286410249)
  }
}
