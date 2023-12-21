// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Callable
import godot.core.TypeManager
import godot.core.VariantType.CALLABLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * [PhysicsServer3DManager] is the API for registering [PhysicsServer3D] implementations and for
 * setting the default implementation.
 * **Note:** It is not possible to switch physics servers at runtime. This class is only used on
 * startup at the server initialization level, by Godot itself and possibly by GDExtensions.
 */
@GodotBaseType
public object PhysicsServer3DManager : Object() {
  public override fun new(scriptIndex: Int): Boolean {
    getSingleton(ENGINECLASS_PHYSICSSERVER3DMANAGER)
    return false
  }

  /**
   * Register a [PhysicsServer3D] implementation by passing a [name] and a [Callable] that returns a
   * [PhysicsServer3D] object.
   */
  public fun registerServer(name: String, createCallback: Callable): Unit {
    TransferContext.writeArguments(STRING to name, CALLABLE to createCallback)
    TransferContext.callMethod(rawPtr, MethodBindings.registerServerPtr, NIL)
  }

  /**
   * Set the default [PhysicsServer3D] implementation to the one identified by [name], if [priority]
   * is greater than the priority of the current default implementation.
   */
  public fun setDefaultServer(name: String, priority: Int): Unit {
    TransferContext.writeArguments(STRING to name, LONG to priority.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setDefaultServerPtr, NIL)
  }

  internal object MethodBindings {
    public val registerServerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3DManager", "register_server")

    public val setDefaultServerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3DManager", "set_default_server")
  }
}
