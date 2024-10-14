// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.common.interop.VoidPtr
import godot.core.Callable
import godot.internal.reflection.TypeManager
import godot.core.VariantParser.CALLABLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.STRING
import godot.internal.memory.TransferContext
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmStatic

/**
 * [PhysicsServer2DManager] is the API for registering [PhysicsServer2D] implementations and for
 * setting the default implementation.
 * **Note:** It is not possible to switch physics servers at runtime. This class is only used on
 * startup at the server initialization level, by Godot itself and possibly by GDExtensions.
 */
@GodotBaseType
public object PhysicsServer2DManager : Object() {
  public override fun new(scriptIndex: Int): Unit {
    getSingleton(ENGINECLASS_PHYSICSSERVER2DMANAGER)
  }

  /**
   * Register a [PhysicsServer2D] implementation by passing a [name] and a [Callable] that returns a
   * [PhysicsServer2D] object.
   */
  @JvmStatic
  public final fun registerServer(name: String, createCallback: Callable): Unit {
    TransferContext.writeArguments(STRING to name, CALLABLE to createCallback)
    TransferContext.callMethod(ptr, MethodBindings.registerServerPtr, NIL)
  }

  /**
   * Set the default [PhysicsServer2D] implementation to the one identified by [name], if [priority]
   * is greater than the priority of the current default implementation.
   */
  @JvmStatic
  public final fun setDefaultServer(name: String, priority: Int): Unit {
    TransferContext.writeArguments(STRING to name, LONG to priority.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setDefaultServerPtr, NIL)
  }

  internal object MethodBindings {
    public val registerServerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2DManager", "register_server", 2137474292)

    public val setDefaultServerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer2DManager", "set_default_server", 2956805083)
  }
}
