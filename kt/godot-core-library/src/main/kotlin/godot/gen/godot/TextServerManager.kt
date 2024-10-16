// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.Dictionary
import godot.core.Signal1
import godot.core.StringName
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING
import kotlin.Any
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmStatic

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
    getSingleton(ENGINECLASS_TEXTSERVERMANAGER)
  }

  /**
   * Registers a [TextServer] interface.
   */
  @JvmStatic
  public final fun addInterface(`interface`: TextServer?): Unit {
    TransferContext.writeArguments(OBJECT to `interface`)
    TransferContext.callMethod(ptr, MethodBindings.addInterfacePtr, NIL)
  }

  /**
   * Returns the number of interfaces currently registered.
   */
  @JvmStatic
  public final fun getInterfaceCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getInterfaceCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Removes an interface. All fonts and shaped text caches should be freed before removing an
   * interface.
   */
  @JvmStatic
  public final fun removeInterface(`interface`: TextServer?): Unit {
    TransferContext.writeArguments(OBJECT to `interface`)
    TransferContext.callMethod(ptr, MethodBindings.removeInterfacePtr, NIL)
  }

  /**
   * Returns the interface registered at a given index.
   */
  @JvmStatic
  public final fun getInterface(idx: Int): TextServer? {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getInterfacePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as TextServer?)
  }

  /**
   * Returns a list of available interfaces, with the index and name of each interface.
   */
  @JvmStatic
  public final fun getInterfaces(): VariantArray<Dictionary<Any?, Any?>> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getInterfacesPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Dictionary<Any?, Any?>>)
  }

  /**
   * Finds an interface by its [name].
   */
  @JvmStatic
  public final fun findInterface(name: String): TextServer? {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(ptr, MethodBindings.findInterfacePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as TextServer?)
  }

  /**
   * Sets the primary [TextServer] interface.
   */
  @JvmStatic
  public final fun setPrimaryInterface(index: TextServer?): Unit {
    TransferContext.writeArguments(OBJECT to index)
    TransferContext.callMethod(ptr, MethodBindings.setPrimaryInterfacePtr, NIL)
  }

  /**
   * Returns the primary [TextServer] interface currently in use.
   */
  @JvmStatic
  public final fun getPrimaryInterface(): TextServer? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPrimaryInterfacePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as TextServer?)
  }

  internal object MethodBindings {
    public val addInterfacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerManager", "add_interface", 1799689403)

    public val getInterfaceCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerManager", "get_interface_count", 3905245786)

    public val removeInterfacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerManager", "remove_interface", 1799689403)

    public val getInterfacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerManager", "get_interface", 1672475555)

    public val getInterfacesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerManager", "get_interfaces", 3995934104)

    public val findInterfacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerManager", "find_interface", 2240905781)

    public val setPrimaryInterfacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerManager", "set_primary_interface", 1799689403)

    public val getPrimaryInterfacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerManager", "get_primary_interface", 905850878)
  }
}
