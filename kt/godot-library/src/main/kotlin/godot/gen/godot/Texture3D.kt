// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.Image
import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit

/**
 *
 */
@GodotBaseType
public open class Texture3D : Texture() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_TEXTURE3D)
  }

  /**
   *
   */
  public open fun _getFormat(): Image.Format {
    throw NotImplementedError("_get_format is not implemented for Texture3D")
  }

  /**
   *
   */
  public open fun _getWidth(): Long {
    throw NotImplementedError("_get_width is not implemented for Texture3D")
  }

  /**
   *
   */
  public open fun _getHeight(): Long {
    throw NotImplementedError("_get_height is not implemented for Texture3D")
  }

  /**
   *
   */
  public open fun _getDepth(): Long {
    throw NotImplementedError("_get_depth is not implemented for Texture3D")
  }

  /**
   *
   */
  public open fun _hasMipmaps(): Boolean {
    throw NotImplementedError("_has_mipmaps is not implemented for Texture3D")
  }

  /**
   *
   */
  public open fun _getData(): VariantArray<Any?> {
    throw NotImplementedError("_get_data is not implemented for Texture3D")
  }

  /**
   *
   */
  public fun getFormat(): Image.Format {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURE3D_GET_FORMAT, LONG.ordinal)
    return Image.Format.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   *
   */
  public fun getWidth(): Long {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURE3D_GET_WIDTH, LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   *
   */
  public fun getHeight(): Long {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURE3D_GET_HEIGHT, LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   *
   */
  public fun getDepth(): Long {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURE3D_GET_DEPTH, LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   *
   */
  public fun hasMipmaps(): Boolean {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURE3D_HAS_MIPMAPS, BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   *
   */
  public fun getData(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURE3D_GET_DATA, ARRAY.ordinal)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  public companion object
}
