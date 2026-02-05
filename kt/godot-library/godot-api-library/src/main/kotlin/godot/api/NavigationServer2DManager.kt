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
import godot.core.Callable
import godot.core.VariantParser.CALLABLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.STRING
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmStatic

/**
 * [NavigationServer2DManager] is the API for registering [NavigationServer2D] implementations and
 * setting the default implementation.
 *
 * **Note:** It is not possible to switch servers at runtime. This class is only used on startup at
 * the server initialization level.
 */
@GodotBaseType
public object NavigationServer2DManager : Object() {
  public override fun new(scriptPtr: VoidPtr): Unit {
    getSingleton(31)
  }

  /**
   * Registers a [NavigationServer2D] implementation by passing a [name] and a [Callable] that
   * returns a [NavigationServer2D] object.
   */
  @JvmStatic
  public final fun registerServer(name: String, createCallback: Callable): Unit {
    TransferContext.writeArguments(STRING to name, CALLABLE to createCallback)
    TransferContext.callMethod(ptr, MethodBindings.registerServerPtr, NIL)
  }

  /**
   * Sets the default [NavigationServer2D] implementation to the one identified by [name], if
   * [priority] is greater than the priority of the current default implementation.
   */
  @JvmStatic
  public final fun setDefaultServer(name: String, priority: Int): Unit {
    TransferContext.writeArguments(STRING to name, LONG to priority.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setDefaultServerPtr, NIL)
  }

  public object MethodBindings {
    internal val registerServerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer2DManager", "register_server", 2137474292)

    internal val setDefaultServerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer2DManager", "set_default_server", 2956805083)
  }
}
