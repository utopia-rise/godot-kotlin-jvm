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
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.STRING
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmStatic

/**
 * Resource UIDs (Unique IDentifiers) allow the engine to keep references between resources intact,
 * even if files are renamed or moved. They can be accessed with `uid://`.
 *
 * [ResourceUID] keeps track of all registered resource UIDs in a project, generates new UIDs, and
 * converts between their string and integer representations.
 */
@GodotBaseType
public object ResourceUID : Object() {
  /**
   * The value to use for an invalid UID, for example if the resource could not be loaded.
   *
   * Its text representation is `uid://<invalid>`.
   */
  public final const val INVALID_ID: Long = -1

  public override fun new(scriptPtr: VoidPtr): Unit {
    getSingleton(29)
  }

  /**
   * Converts the given UID to a `uid://` string value.
   */
  @JvmStatic
  public final fun idToText(id: Long): String {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(ptr, MethodBindings.idToTextPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Extracts the UID value from the given `uid://` string.
   */
  @JvmStatic
  public final fun textToId(textId: String): Long {
    TransferContext.writeArguments(STRING to textId)
    TransferContext.callMethod(ptr, MethodBindings.textToIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Generates a random resource UID which is guaranteed to be unique within the list of currently
   * loaded UIDs.
   *
   * In order for this UID to be registered, you must call [addId] or [setId].
   */
  @JvmStatic
  public final fun createId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.createIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Like [createId], but the UID is seeded with the provided [path] and project name. UIDs
   * generated for that path will be always the same within the current project.
   */
  @JvmStatic
  public final fun createIdForPath(path: String): Long {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(ptr, MethodBindings.createIdForPathPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns whether the given UID value is known to the cache.
   */
  @JvmStatic
  public final fun hasId(id: Long): Boolean {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(ptr, MethodBindings.hasIdPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Adds a new UID value which is mapped to the given resource path.
   *
   * Fails with an error if the UID already exists, so be sure to check [hasId] beforehand, or use
   * [setId] instead.
   */
  @JvmStatic
  public final fun addId(id: Long, path: String): Unit {
    TransferContext.writeArguments(LONG to id, STRING to path)
    TransferContext.callMethod(ptr, MethodBindings.addIdPtr, NIL)
  }

  /**
   * Updates the resource path of an existing UID.
   *
   * Fails with an error if the UID does not exist, so be sure to check [hasId] beforehand, or use
   * [addId] instead.
   */
  @JvmStatic
  public final fun setId(id: Long, path: String): Unit {
    TransferContext.writeArguments(LONG to id, STRING to path)
    TransferContext.callMethod(ptr, MethodBindings.setIdPtr, NIL)
  }

  /**
   * Returns the path that the given UID value refers to.
   *
   * Fails with an error if the UID does not exist, so be sure to check [hasId] beforehand.
   */
  @JvmStatic
  public final fun getIdPath(id: Long): String {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(ptr, MethodBindings.getIdPathPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Removes a loaded UID value from the cache.
   *
   * Fails with an error if the UID does not exist, so be sure to check [hasId] beforehand.
   */
  @JvmStatic
  public final fun removeId(id: Long): Unit {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(ptr, MethodBindings.removeIdPtr, NIL)
  }

  /**
   * Converts the provided [uid] to a path. Prints an error if the UID is invalid.
   */
  @JvmStatic
  public final fun uidToPath(uid: String): String {
    TransferContext.writeArguments(STRING to uid)
    TransferContext.callMethod(0, MethodBindings.uidToPathPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Converts the provided resource [path] to a UID. Returns the unchanged path if it has no
   * associated UID.
   */
  @JvmStatic
  public final fun pathToUid(path: String): String {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(0, MethodBindings.pathToUidPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns a path, converting [pathOrUid] if necessary. Prints an error if provided an invalid
   * UID.
   */
  @JvmStatic
  public final fun ensurePath(pathOrUid: String): String {
    TransferContext.writeArguments(STRING to pathOrUid)
    TransferContext.callMethod(0, MethodBindings.ensurePathPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  public object MethodBindings {
    internal val idToTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourceUID", "id_to_text", 844755477)

    internal val textToIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourceUID", "text_to_id", 1321353865)

    internal val createIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourceUID", "create_id", 2455072627)

    internal val createIdForPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourceUID", "create_id_for_path", 1597066294)

    internal val hasIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourceUID", "has_id", 1116898809)

    internal val addIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourceUID", "add_id", 501894301)

    internal val setIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourceUID", "set_id", 501894301)

    internal val getIdPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourceUID", "get_id_path", 844755477)

    internal val removeIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourceUID", "remove_id", 1286410249)

    internal val uidToPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourceUID", "uid_to_path", 1703090593)

    internal val pathToUidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourceUID", "path_to_uid", 1703090593)

    internal val ensurePathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourceUID", "ensure_path", 1703090593)
  }
}
