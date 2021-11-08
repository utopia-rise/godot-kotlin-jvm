// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.PoolIntArray
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.POOL_INT_ARRAY
import kotlin.Any
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class GLTFSkin : Resource() {
  public open var godotSkin: Skin?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSKIN_GET_GODOT_SKIN, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Skin?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSKIN_SET_GODOT_SKIN, NIL)
    }

  public open var inverseBinds: VariantArray<Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSKIN_GET_INVERSE_BINDS, ARRAY)
      return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSKIN_SET_INVERSE_BINDS, NIL)
    }

  public open var jointIToBoneI: Dictionary<Any?, Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSKIN_GET_JOINT_I_TO_BONE_I,
          DICTIONARY)
      return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
    }
    set(`value`) {
      TransferContext.writeArguments(DICTIONARY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSKIN_SET_JOINT_I_TO_BONE_I,
          NIL)
    }

  public open var jointIToName: Dictionary<Any?, Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSKIN_GET_JOINT_I_TO_NAME,
          DICTIONARY)
      return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
    }
    set(`value`) {
      TransferContext.writeArguments(DICTIONARY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSKIN_SET_JOINT_I_TO_NAME, NIL)
    }

  public open var joints: PoolIntArray
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSKIN_GET_JOINTS,
          POOL_INT_ARRAY)
      return TransferContext.readReturnValue(POOL_INT_ARRAY, false) as PoolIntArray
    }
    set(`value`) {
      TransferContext.writeArguments(POOL_INT_ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSKIN_SET_JOINTS, NIL)
    }

  public open var jointsOriginal: PoolIntArray
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSKIN_GET_JOINTS_ORIGINAL,
          POOL_INT_ARRAY)
      return TransferContext.readReturnValue(POOL_INT_ARRAY, false) as PoolIntArray
    }
    set(`value`) {
      TransferContext.writeArguments(POOL_INT_ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSKIN_SET_JOINTS_ORIGINAL, NIL)
    }

  public open var nonJoints: PoolIntArray
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSKIN_GET_NON_JOINTS,
          POOL_INT_ARRAY)
      return TransferContext.readReturnValue(POOL_INT_ARRAY, false) as PoolIntArray
    }
    set(`value`) {
      TransferContext.writeArguments(POOL_INT_ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSKIN_SET_NON_JOINTS, NIL)
    }

  public open var roots: PoolIntArray
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSKIN_GET_ROOTS,
          POOL_INT_ARRAY)
      return TransferContext.readReturnValue(POOL_INT_ARRAY, false) as PoolIntArray
    }
    set(`value`) {
      TransferContext.writeArguments(POOL_INT_ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSKIN_SET_ROOTS, NIL)
    }

  public open var skeleton: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSKIN_GET_SKELETON, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSKIN_SET_SKELETON, NIL)
    }

  public open var skinRoot: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSKIN_GET_SKIN_ROOT, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSKIN_SET_SKIN_ROOT, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_GLTFSKIN)
  }
}
