// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.Error
import godot.core.VariantParser.LONG
import godot.core.VariantParser.STRING
import godot.getLoadPathPtr
import godot.loadPtr
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINECLASS_COMPRESSEDTEXTURELAYERED: Int = 202

/**
 * Base class for [CompressedTexture2DArray] and [CompressedTexture3D]. Cannot be used directly, but
 * contains all the functions necessary for accessing the derived resource types. See also
 * [TextureLayered].
 */
@GodotBaseType
public open class CompressedTextureLayered internal constructor() : TextureLayered() {
  /**
   * The path the texture should be loaded from.
   */
  public final inline val loadPath: String
    @JvmName("loadPathProperty")
    get() = getLoadPath()

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_COMPRESSEDTEXTURELAYERED, scriptIndex)
  }

  /**
   * Loads the texture at [path].
   */
  public final fun load(path: String): Error {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(ptr, MethodBindings.loadPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun getLoadPath(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLoadPathPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  public companion object

  public object MethodBindings {
    internal val loadPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CompressedTextureLayered", "load", 166001499)

    internal val getLoadPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CompressedTextureLayered", "get_load_path", 201670096)
  }
}
