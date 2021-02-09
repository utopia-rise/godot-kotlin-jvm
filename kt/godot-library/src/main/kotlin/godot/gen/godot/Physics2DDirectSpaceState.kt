// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.Dictionary
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.LONG
import godot.core.VariantType.OBJECT
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
open class Physics2DDirectSpaceState : Object() {
  override fun __new(): VoidPtr =
      TransferContext.invokeConstructor(ENGINECLASS_PHYSICS2DDIRECTSPACESTATE)

  open fun castMotion(shape: Physics2DShapeQueryParameters): VariantArray<Any?> {
    TransferContext.writeArguments(OBJECT to shape)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DDIRECTSPACESTATE_CAST_MOTION, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  open fun collideShape(shape: Physics2DShapeQueryParameters, maxResults: Long = 32):
      VariantArray<Any?> {
    TransferContext.writeArguments(OBJECT to shape, LONG to maxResults)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DDIRECTSPACESTATE_COLLIDE_SHAPE, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  open fun getRestInfo(shape: Physics2DShapeQueryParameters): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(OBJECT to shape)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DDIRECTSPACESTATE_GET_REST_INFO, DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  open fun intersectPoint(
    point: Vector2,
    maxResults: Long = 32,
    exclude: VariantArray<Any?> = VariantArray(),
    collisionLayer: Long = 2147483647,
    collideWithBodies: Boolean = true,
    collideWithAreas: Boolean = false
  ): VariantArray<Any?> {
    TransferContext.writeArguments(VECTOR2 to point, LONG to maxResults, ARRAY to exclude, LONG to
        collisionLayer, BOOL to collideWithBodies, BOOL to collideWithAreas)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DDIRECTSPACESTATE_INTERSECT_POINT, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  open fun intersectPointOnCanvas(
    point: Vector2,
    canvasInstanceId: Long,
    maxResults: Long = 32,
    exclude: VariantArray<Any?> = VariantArray(),
    collisionLayer: Long = 2147483647,
    collideWithBodies: Boolean = true,
    collideWithAreas: Boolean = false
  ): VariantArray<Any?> {
    TransferContext.writeArguments(VECTOR2 to point, LONG to canvasInstanceId, LONG to maxResults,
        ARRAY to exclude, LONG to collisionLayer, BOOL to collideWithBodies, BOOL to
        collideWithAreas)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DDIRECTSPACESTATE_INTERSECT_POINT_ON_CANVAS, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  open fun intersectRay(
    from: Vector2,
    to: Vector2,
    exclude: VariantArray<Any?> = VariantArray(),
    collisionLayer: Long = 2147483647,
    collideWithBodies: Boolean = true,
    collideWithAreas: Boolean = false
  ): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(VECTOR2 to from, VECTOR2 to to, ARRAY to exclude, LONG to
        collisionLayer, BOOL to collideWithBodies, BOOL to collideWithAreas)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DDIRECTSPACESTATE_INTERSECT_RAY, DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  open fun intersectShape(shape: Physics2DShapeQueryParameters, maxResults: Long = 32):
      VariantArray<Any?> {
    TransferContext.writeArguments(OBJECT to shape, LONG to maxResults)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DDIRECTSPACESTATE_INTERSECT_SHAPE, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }
}
