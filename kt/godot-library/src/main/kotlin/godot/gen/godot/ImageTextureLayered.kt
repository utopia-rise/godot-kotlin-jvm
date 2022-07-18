// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import kotlin.Any
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 *
 */
@GodotBaseType
public open class ImageTextureLayered internal constructor() : TextureLayered() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_IMAGETEXTURELAYERED)
  }

  /**
   *
   */
  public fun createFromImages(images: VariantArray<Any?>): GodotError {
    TransferContext.writeArguments(ARRAY to images)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGETEXTURELAYERED_CREATE_FROM_IMAGES,
        LONG.ordinal)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   *
   */
  public fun updateLayer(image: Image, layer: Long): Unit {
    TransferContext.writeArguments(OBJECT to image, LONG to layer)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGETEXTURELAYERED_UPDATE_LAYER,
        NIL.ordinal)
  }

  public companion object
}
