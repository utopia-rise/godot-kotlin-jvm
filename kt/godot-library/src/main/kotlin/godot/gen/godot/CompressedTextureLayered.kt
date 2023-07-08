// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress

/**
 * Base class for texture arrays that can optionally be compressed.
 *
 * Base class for [godot.CompressedTexture2DArray] and [godot.CompressedTexture3D]. Cannot be used directly, but contains all the functions necessary for accessing the derived resource types. See also [godot.TextureLayered].
 */
@GodotBaseType
public open class CompressedTextureLayered internal constructor() : TextureLayered() {
  /**
   * The path the texture should be loaded from.
   */
  public val loadPath: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_COMPRESSEDTEXTURELAYERED_GET_LOAD_PATH, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_COMPRESSEDTEXTURELAYERED, scriptIndex)
    return true
  }

  /**
   * Loads the texture at [path].
   */
  public fun load(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COMPRESSEDTEXTURELAYERED_LOAD, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  public companion object
}
