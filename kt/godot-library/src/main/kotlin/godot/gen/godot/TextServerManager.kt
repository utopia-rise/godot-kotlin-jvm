// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.StringName
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.signals.Signal1
import godot.signals.signal
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Manager for the font and complex text layout servers.
 *
 * [godot.TextServerManager] is the API backend for loading, enumeration and switching [godot.TextServer]s.
 *
 * **Note:** Switching text server at runtime is possible, but will invalidate all fonts and text buffers. Make sure to unload all controls, fonts, and themes before doing so.
 */
@GodotBaseType
public object TextServerManager : Object() {
  /**
   * Emitted when a new interface has been added.
   */
  public val interfaceAdded: Signal1<StringName> by signal("interfaceName")

  /**
   * Emitted when an interface is removed.
   */
  public val interfaceRemoved: Signal1<StringName> by signal("interfaceName")

  public override fun new(scriptIndex: Int): Boolean {
    getSingleton(ENGINECLASS_TEXTSERVERMANAGER)
    return false
  }

  /**
   * Registers an [godot.TextServer] interface.
   */
  public fun addInterface(_interface: TextServer): Unit {
    TransferContext.writeArguments(OBJECT to _interface)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVERMANAGER_ADD_INTERFACE,
        NIL)
  }

  /**
   * Returns the number of interfaces currently registered.
   */
  public fun getInterfaceCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTSERVERMANAGER_GET_INTERFACE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Removes interface. All fonts and shaped text caches should be freed before removing interface.
   */
  public fun removeInterface(_interface: TextServer): Unit {
    TransferContext.writeArguments(OBJECT to _interface)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVERMANAGER_REMOVE_INTERFACE,
        NIL)
  }

  /**
   * Returns the interface registered at a given index.
   */
  public fun getInterface(idx: Long): TextServer? {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVERMANAGER_GET_INTERFACE,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as TextServer?
  }

  /**
   * Returns a list of available interfaces the index and name of each interface.
   */
  public fun getInterfaces(): VariantArray<Dictionary<Any?, Any?>> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVERMANAGER_GET_INTERFACES,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Dictionary<Any?, Any?>>
  }

  /**
   * Finds an interface by its name.
   */
  public fun findInterface(name: String): TextServer? {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVERMANAGER_FIND_INTERFACE,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as TextServer?
  }

  /**
   * Sets the primary [godot.TextServer] interface.
   */
  public fun setPrimaryInterface(index: TextServer): Unit {
    TransferContext.writeArguments(OBJECT to index)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTSERVERMANAGER_SET_PRIMARY_INTERFACE, NIL)
  }

  /**
   * Returns the primary [godot.TextServer] interface currently in use.
   */
  public fun getPrimaryInterface(): TextServer? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTSERVERMANAGER_GET_PRIMARY_INTERFACE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as TextServer?
  }
}
