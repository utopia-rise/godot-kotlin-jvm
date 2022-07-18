// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.PackedInt32Array
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_INT_32_ARRAY
import kotlin.Any
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class GLTFSkin : Resource() {
  public var skinRoot: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSKIN_GET_SKIN_ROOT, LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSKIN_SET_SKIN_ROOT, NIL.ordinal)
    }

  public var jointsOriginal: PackedInt32Array
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSKIN_GET_JOINTS_ORIGINAL,
          PACKED_INT_32_ARRAY.ordinal)
      return TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_INT_32_ARRAY to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSKIN_SET_JOINTS_ORIGINAL,
          NIL.ordinal)
    }

  public var inverseBinds: VariantArray<Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSKIN_GET_INVERSE_BINDS,
          ARRAY.ordinal)
      return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSKIN_SET_INVERSE_BINDS,
          NIL.ordinal)
    }

  public var joints: PackedInt32Array
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSKIN_GET_JOINTS,
          PACKED_INT_32_ARRAY.ordinal)
      return TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_INT_32_ARRAY to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSKIN_SET_JOINTS, NIL.ordinal)
    }

  public var nonJoints: PackedInt32Array
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSKIN_GET_NON_JOINTS,
          PACKED_INT_32_ARRAY.ordinal)
      return TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_INT_32_ARRAY to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSKIN_SET_NON_JOINTS, NIL.ordinal)
    }

  public var roots: PackedInt32Array
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSKIN_GET_ROOTS,
          PACKED_INT_32_ARRAY.ordinal)
      return TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_INT_32_ARRAY to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSKIN_SET_ROOTS, NIL.ordinal)
    }

  public var skeleton: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSKIN_GET_SKELETON, LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSKIN_SET_SKELETON, NIL.ordinal)
    }

  public var jointIToBoneI: Dictionary<Any?, Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSKIN_GET_JOINT_I_TO_BONE_I,
          DICTIONARY.ordinal)
      return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
    }
    set(`value`) {
      TransferContext.writeArguments(DICTIONARY to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSKIN_SET_JOINT_I_TO_BONE_I,
          NIL.ordinal)
    }

  public var jointIToName: Dictionary<Any?, Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSKIN_GET_JOINT_I_TO_NAME,
          DICTIONARY.ordinal)
      return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
    }
    set(`value`) {
      TransferContext.writeArguments(DICTIONARY to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSKIN_SET_JOINT_I_TO_NAME,
          NIL.ordinal)
    }

  public var godotSkin: Object?
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSKIN_GET_GODOT_SKIN,
          OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as Object?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSKIN_SET_GODOT_SKIN, NIL.ordinal)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_GLTFSKIN)
  }

  public companion object
}
