// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import kotlin.Any
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit

/**
 * Base class for all objects affected by physics in 3D space.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/physics/physics_introduction.html]($DOCS_URL/tutorials/physics/physics_introduction.html)
 *
 * PhysicsBody is an abstract base class for implementing a physics body. All *Body types inherit from it.
 */
@GodotBaseType
public open class PhysicsBody : CollisionObject() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_PHYSICSBODY)
  }

  public open fun _getLayers(): Long {
    throw NotImplementedError("_get_layers is not implemented for PhysicsBody")
  }

  public open fun _setLayers(mask: Long): Unit {
  }

  /**
   * Adds a body to the list of bodies that this body can't collide with.
   */
  public open fun addCollisionExceptionWith(body: Node): Unit {
    TransferContext.writeArguments(OBJECT to body)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSBODY_ADD_COLLISION_EXCEPTION_WITH, NIL)
  }

  /**
   * Returns an array of nodes that were added as collision exceptions for this body.
   */
  public open fun getCollisionExceptions(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSBODY_GET_COLLISION_EXCEPTIONS, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Removes a body from the list of bodies that this body can't collide with.
   */
  public open fun removeCollisionExceptionWith(body: Node): Unit {
    TransferContext.writeArguments(OBJECT to body)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSBODY_REMOVE_COLLISION_EXCEPTION_WITH, NIL)
  }
}
