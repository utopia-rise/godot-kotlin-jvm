// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Callable
import godot.core.VariantType.CALLABLE
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
 * A singleton for managing [godot.PhysicsServer2D] implementations.
 *
 * [godot.PhysicsServer2DManager] is the API for registering [godot.PhysicsServer2D] implementations and for setting the default implementation.
 *
 * **Note:** It is not possible to switch physics servers at runtime. This class is only used on startup at the server initialization level, by Godot itself and possibly by GDExtensions.
 */
@GodotBaseType
public object PhysicsServer2DManager : Object() {
  public override fun new(scriptIndex: Int): Boolean {
    getSingleton(ENGINECLASS_PHYSICSSERVER2DMANAGER)
    return false
  }

  /**
   * Register a [godot.PhysicsServer2D] implementation by passing a [name] and a [godot.Callable] that returns a [godot.PhysicsServer2D] object.
   */
  public fun registerServer(name: String, createCallback: Callable): Unit {
    TransferContext.writeArguments(STRING to name, CALLABLE to createCallback)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2DMANAGER_REGISTER_SERVER, NIL)
  }

  /**
   * Set the default [godot.PhysicsServer2D] implementation to the one identified by [name], if [priority] is greater than the priority of the current default implementation.
   */
  public fun setDefaultServer(name: String, priority: Long): Unit {
    TransferContext.writeArguments(STRING to name, LONG to priority)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER2DMANAGER_SET_DEFAULT_SERVER, NIL)
  }
}
