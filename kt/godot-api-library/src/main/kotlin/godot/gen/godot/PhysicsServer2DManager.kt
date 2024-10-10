// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Callable
import godot.core.VariantParser.CALLABLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.STRING
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmStatic

private const val ENGINE_CLASS_PHYSICSSERVER2DMANAGER_INDEX: Int = 4

/**
 * [PhysicsServer2DManager] is the API for registering [PhysicsServer2D] implementations and for
 * setting the default implementation.
 * **Note:** It is not possible to switch physics servers at runtime. This class is only used on
 * startup at the server initialization level, by Godot itself and possibly by GDExtensions.
 */
@GodotBaseType
public object PhysicsServer2DManager : Object() {
  public override fun new(scriptIndex: Int): Unit {
    Internals.getSingleton(this, ENGINE_CLASS_PHYSICSSERVER2DMANAGER_INDEX)
  }

  /**
   * Register a [PhysicsServer2D] implementation by passing a [name] and a [Callable] that returns a
   * [PhysicsServer2D] object.
   */
  @JvmStatic
  public final fun registerServer(name: String, createCallback: Callable): Unit {
    Internals.writeArguments(STRING to name, CALLABLE to createCallback)
    Internals.callMethod(rawPtr, MethodBindings.registerServerPtr, NIL)
  }

  /**
   * Set the default [PhysicsServer2D] implementation to the one identified by [name], if [priority]
   * is greater than the priority of the current default implementation.
   */
  @JvmStatic
  public final fun setDefaultServer(name: String, priority: Int): Unit {
    Internals.writeArguments(STRING to name, LONG to priority.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setDefaultServerPtr, NIL)
  }

  internal object MethodBindings {
    public val registerServerPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer2DManager", "register_server", 2137474292)

    public val setDefaultServerPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer2DManager", "set_default_server", 2956805083)
  }
}
