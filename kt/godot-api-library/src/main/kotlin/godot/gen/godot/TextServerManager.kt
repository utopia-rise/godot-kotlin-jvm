// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.Signal1
import godot.core.StringName
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmStatic

private const val ENGINE_CLASS_TEXTSERVERMANAGER_INDEX: Int = 3

/**
 * [TextServerManager] is the API backend for loading, enumerating, and switching [TextServer]s.
 * **Note:** Switching text server at runtime is possible, but will invalidate all fonts and text
 * buffers. Make sure to unload all controls, fonts, and themes before doing so.
 */
@GodotBaseType
public object TextServerManager : Object() {
  /**
   * Emitted when a new interface has been added.
   */
  @JvmStatic
  public val interfaceAdded: Signal1<StringName> by Signal1

  /**
   * Emitted when an interface is removed.
   */
  @JvmStatic
  public val interfaceRemoved: Signal1<StringName> by Signal1

  public override fun new(scriptIndex: Int): Unit {
    Internals.getSingleton(this, ENGINE_CLASS_TEXTSERVERMANAGER_INDEX)
  }

  /**
   * Registers a [TextServer] interface.
   */
  @JvmStatic
  public final fun addInterface(`interface`: TextServer?): Unit {
    Internals.writeArguments(OBJECT to `interface`)
    Internals.callMethod(rawPtr, MethodBindings.addInterfacePtr, NIL)
  }

  /**
   * Returns the number of interfaces currently registered.
   */
  @JvmStatic
  public final fun getInterfaceCount(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getInterfaceCountPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Removes an interface. All fonts and shaped text caches should be freed before removing an
   * interface.
   */
  @JvmStatic
  public final fun removeInterface(`interface`: TextServer?): Unit {
    Internals.writeArguments(OBJECT to `interface`)
    Internals.callMethod(rawPtr, MethodBindings.removeInterfacePtr, NIL)
  }

  /**
   * Returns the interface registered at a given index.
   */
  @JvmStatic
  public final fun getInterface(idx: Int): TextServer? {
    Internals.writeArguments(LONG to idx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getInterfacePtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as TextServer?)
  }

  /**
   * Returns a list of available interfaces, with the index and name of each interface.
   */
  @JvmStatic
  public final fun getInterfaces(): VariantArray<Dictionary<Any?, Any?>> {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getInterfacesPtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<Dictionary<Any?, Any?>>)
  }

  /**
   * Finds an interface by its [name].
   */
  @JvmStatic
  public final fun findInterface(name: String): TextServer? {
    Internals.writeArguments(STRING to name)
    Internals.callMethod(rawPtr, MethodBindings.findInterfacePtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as TextServer?)
  }

  /**
   * Sets the primary [TextServer] interface.
   */
  @JvmStatic
  public final fun setPrimaryInterface(index: TextServer?): Unit {
    Internals.writeArguments(OBJECT to index)
    Internals.callMethod(rawPtr, MethodBindings.setPrimaryInterfacePtr, NIL)
  }

  /**
   * Returns the primary [TextServer] interface currently in use.
   */
  @JvmStatic
  public final fun getPrimaryInterface(): TextServer? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getPrimaryInterfacePtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as TextServer?)
  }

  public object MethodBindings {
    internal val addInterfacePtr: VoidPtr =
        Internals.getMethodBindPtr("TextServerManager", "add_interface", 1799689403)

    internal val getInterfaceCountPtr: VoidPtr =
        Internals.getMethodBindPtr("TextServerManager", "get_interface_count", 3905245786)

    internal val removeInterfacePtr: VoidPtr =
        Internals.getMethodBindPtr("TextServerManager", "remove_interface", 1799689403)

    internal val getInterfacePtr: VoidPtr =
        Internals.getMethodBindPtr("TextServerManager", "get_interface", 1672475555)

    internal val getInterfacesPtr: VoidPtr =
        Internals.getMethodBindPtr("TextServerManager", "get_interfaces", 3995934104)

    internal val findInterfacePtr: VoidPtr =
        Internals.getMethodBindPtr("TextServerManager", "find_interface", 2240905781)

    internal val setPrimaryInterfacePtr: VoidPtr =
        Internals.getMethodBindPtr("TextServerManager", "set_primary_interface", 1799689403)

    internal val getPrimaryInterfacePtr: VoidPtr =
        Internals.getMethodBindPtr("TextServerManager", "get_primary_interface", 905850878)
  }
}
