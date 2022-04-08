// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.TransferContext
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.STRING
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * A `.ctex` texture.
 *
 * A texture that is loaded from a `.ctex` file.
 */
@GodotBaseType
public open class CompressedTexture2D : Texture2D() {
  /**
   * The CompressedTexture's file path to a `.ctex` file.
   */
  public val loadPath: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COMPRESSEDTEXTURE2D_GET_LOAD_PATH,
          STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_COMPRESSEDTEXTURE2D)
  }

  /**
   * Loads the texture from the given path.
   */
  public fun load(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COMPRESSEDTEXTURE2D_LOAD, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  public companion object
}
