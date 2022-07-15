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
import godot.core.VariantType.BOOL
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 *
 */
@GodotBaseType
public open class ImageTexture3D : Texture3D() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_IMAGETEXTURE3D)
  }

  /**
   *
   */
  public fun create(
    format: Image.Format,
    width: Long,
    height: Long,
    depth: Long,
    useMipmaps: Boolean,
    `data`: VariantArray<Any?>
  ): GodotError {
    TransferContext.writeArguments(LONG to format.id, LONG to width, LONG to height, LONG to depth, BOOL to useMipmaps, ARRAY to data)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGETEXTURE3D_CREATE, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   *
   */
  public fun update(`data`: VariantArray<Any?>): Unit {
    TransferContext.writeArguments(ARRAY to data)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGETEXTURE3D_UPDATE, NIL)
  }

  public companion object
}
