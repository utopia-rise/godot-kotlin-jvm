// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.Rect2
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import godot.core.VariantType.RECT2
import kotlin.Boolean
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 *
 */
@GodotBaseType
public open class LightmapGIData : Resource() {
  /**
   *
   */
  public open var lightTexture: TextureLayered?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHTMAPGIDATA_GET_LIGHT_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as TextureLayered?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHTMAPGIDATA_SET_LIGHT_TEXTURE,
          NIL)
    }

  public open var usesSphericalHarmonics: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_LIGHTMAPGIDATA_IS_USING_SPHERICAL_HARMONICS, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_LIGHTMAPGIDATA_SET_USES_SPHERICAL_HARMONICS, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_LIGHTMAPGIDATA)
  }

  /**
   *
   */
  public open fun addUser(
    path: NodePath,
    uvScale: Rect2,
    sliceIndex: Long,
    subInstance: Long
  ): Unit {
    TransferContext.writeArguments(NODE_PATH to path, RECT2 to uvScale, LONG to sliceIndex, LONG to subInstance)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHTMAPGIDATA_ADD_USER, NIL)
  }

  /**
   *
   */
  public open fun getUserCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHTMAPGIDATA_GET_USER_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   *
   */
  public open fun getUserPath(userIdx: Long): NodePath {
    TransferContext.writeArguments(LONG to userIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHTMAPGIDATA_GET_USER_PATH,
        NODE_PATH)
    return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
  }

  /**
   *
   */
  public open fun clearUsers(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHTMAPGIDATA_CLEAR_USERS, NIL)
  }

  public companion object
}
