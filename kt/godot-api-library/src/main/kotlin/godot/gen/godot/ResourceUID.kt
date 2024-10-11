// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.STRING
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmStatic

private const val ENGINE_CLASS_RESOURCEUID_INDEX: Int = 23

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
    Internals.getSingleton(this, ENGINE_CLASS_RESOURCEUID_INDEX)
  }

  /**
   * Converts the given UID to a `uid://` string value.
   */
  @JvmStatic
  public final fun idToText(id: Long): String {
    Internals.writeArguments(LONG to id)
    Internals.callMethod(rawPtr, MethodBindings.idToTextPtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  /**
   * Extracts the UID value from the given `uid://` string.
   */
  @JvmStatic
  public final fun textToId(textId: String): Long {
    Internals.writeArguments(STRING to textId)
    Internals.callMethod(rawPtr, MethodBindings.textToIdPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Generates a random resource UID which is guaranteed to be unique within the list of currently
   * loaded UIDs.
   * In order for this UID to be registered, you must call [addId] or [setId].
   */
  @JvmStatic
  public final fun createId(): Long {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.createIdPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Returns whether the given UID value is known to the cache.
   */
  @JvmStatic
  public final fun hasId(id: Long): Boolean {
    Internals.writeArguments(LONG to id)
    Internals.callMethod(rawPtr, MethodBindings.hasIdPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Adds a new UID value which is mapped to the given resource path.
   * Fails with an error if the UID already exists, so be sure to check [hasId] beforehand, or use
   * [setId] instead.
   */
  @JvmStatic
  public final fun addId(id: Long, path: String): Unit {
    Internals.writeArguments(LONG to id, STRING to path)
    Internals.callMethod(rawPtr, MethodBindings.addIdPtr, NIL)
  }

  /**
   * Updates the resource path of an existing UID.
   * Fails with an error if the UID does not exist, so be sure to check [hasId] beforehand, or use
   * [addId] instead.
   */
  @JvmStatic
  public final fun setId(id: Long, path: String): Unit {
    Internals.writeArguments(LONG to id, STRING to path)
    Internals.callMethod(rawPtr, MethodBindings.setIdPtr, NIL)
  }

  /**
   * Returns the path that the given UID value refers to.
   * Fails with an error if the UID does not exist, so be sure to check [hasId] beforehand.
   */
  @JvmStatic
  public final fun getIdPath(id: Long): String {
    Internals.writeArguments(LONG to id)
    Internals.callMethod(rawPtr, MethodBindings.getIdPathPtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  /**
   * Removes a loaded UID value from the cache.
   * Fails with an error if the UID does not exist, so be sure to check [hasId] beforehand.
   */
  @JvmStatic
  public final fun removeId(id: Long): Unit {
    Internals.writeArguments(LONG to id)
    Internals.callMethod(rawPtr, MethodBindings.removeIdPtr, NIL)
  }

  public object MethodBindings {
    internal val idToTextPtr: VoidPtr =
        Internals.getMethodBindPtr("ResourceUID", "id_to_text", 844755477)

    internal val textToIdPtr: VoidPtr =
        Internals.getMethodBindPtr("ResourceUID", "text_to_id", 1321353865)

    internal val createIdPtr: VoidPtr =
        Internals.getMethodBindPtr("ResourceUID", "create_id", 2455072627)

    internal val hasIdPtr: VoidPtr = Internals.getMethodBindPtr("ResourceUID", "has_id", 1116898809)

    internal val addIdPtr: VoidPtr = Internals.getMethodBindPtr("ResourceUID", "add_id", 501894301)

    internal val setIdPtr: VoidPtr = Internals.getMethodBindPtr("ResourceUID", "set_id", 501894301)

    internal val getIdPathPtr: VoidPtr =
        Internals.getMethodBindPtr("ResourceUID", "get_id_path", 844755477)

    internal val removeIdPtr: VoidPtr =
        Internals.getMethodBindPtr("ResourceUID", "remove_id", 1286410249)
  }
}
