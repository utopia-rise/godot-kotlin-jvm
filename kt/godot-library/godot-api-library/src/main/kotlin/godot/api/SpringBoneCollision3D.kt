// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.Quaternion
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.QUATERNION
import godot.core.VariantParser.STRING
import godot.core.VariantParser.VECTOR3
import godot.core.Vector3
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * A collision can be a child of [SpringBoneSimulator3D]. If it is not a child of
 * [SpringBoneSimulator3D], it has no effect.
 *
 * The colliding and sliding are done in the [SpringBoneSimulator3D]'s modification process in order
 * of its collision list which is set by [SpringBoneSimulator3D.setCollisionPath]. If
 * [SpringBoneSimulator3D.areAllChildCollisionsEnabled] is `true`, the order matches [SceneTree].
 *
 * If [bone] is set, it synchronizes with the bone pose of the ancestor [Skeleton3D], which is done
 * in before the [SpringBoneSimulator3D]'s modification process as the pre-process.
 *
 * **Warning:** A scaled [SpringBoneCollision3D] will likely not behave as expected. Make sure that
 * the parent [Skeleton3D] and its bones are not scaled.
 */
@GodotBaseType
public open class SpringBoneCollision3D : Node3D() {
  /**
   * The name of the attached bone.
   */
  public final inline var boneName: String
    @JvmName("boneNameProperty")
    get() = getBoneName()
    @JvmName("boneNameProperty")
    set(`value`) {
      setBoneName(value)
    }

  /**
   * The index of the attached bone.
   */
  public final inline var bone: Int
    @JvmName("boneProperty")
    get() = getBone()
    @JvmName("boneProperty")
    set(`value`) {
      setBone(value)
    }

  /**
   * The offset of the position from [Skeleton3D]'s [bone] pose position.
   */
  @CoreTypeLocalCopy
  public final inline var positionOffset: Vector3
    @JvmName("positionOffsetProperty")
    get() = getPositionOffset()
    @JvmName("positionOffsetProperty")
    set(`value`) {
      setPositionOffset(value)
    }

  /**
   * The offset of the rotation from [Skeleton3D]'s [bone] pose rotation.
   */
  @CoreTypeLocalCopy
  public final inline var rotationOffset: Quaternion
    @JvmName("rotationOffsetProperty")
    get() = getRotationOffset()
    @JvmName("rotationOffsetProperty")
    set(`value`) {
      setRotationOffset(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(624, scriptIndex)
  }

  /**
   * The offset of the position from [Skeleton3D]'s [bone] pose position.
   *
   * This is a helper function to make dealing with local copies easier.
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = springbonecollision3d.positionOffset
   * //Your changes
   * springbonecollision3d.positionOffset = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun positionOffsetMutate(block: Vector3.() -> Unit): Vector3 = positionOffset.apply{
      block(this)
      positionOffset = this
  }


  /**
   * The offset of the rotation from [Skeleton3D]'s [bone] pose rotation.
   *
   * This is a helper function to make dealing with local copies easier.
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = springbonecollision3d.rotationOffset
   * //Your changes
   * springbonecollision3d.rotationOffset = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun rotationOffsetMutate(block: Quaternion.() -> Unit): Quaternion =
      rotationOffset.apply{
      block(this)
      rotationOffset = this
  }


  /**
   * Get parent [Skeleton3D] node of the parent [SpringBoneSimulator3D] if found.
   */
  public final fun getSkeleton(): Skeleton3D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSkeletonPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Skeleton3D?)
  }

  public final fun setBoneName(boneName: String): Unit {
    TransferContext.writeArguments(STRING to boneName)
    TransferContext.callMethod(ptr, MethodBindings.setBoneNamePtr, NIL)
  }

  public final fun getBoneName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBoneNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  public final fun setBone(bone: Int): Unit {
    TransferContext.writeArguments(LONG to bone.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setBonePtr, NIL)
  }

  public final fun getBone(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBonePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setPositionOffset(offset: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to offset)
    TransferContext.callMethod(ptr, MethodBindings.setPositionOffsetPtr, NIL)
  }

  public final fun getPositionOffset(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPositionOffsetPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setRotationOffset(offset: Quaternion): Unit {
    TransferContext.writeArguments(QUATERNION to offset)
    TransferContext.callMethod(ptr, MethodBindings.setRotationOffsetPtr, NIL)
  }

  public final fun getRotationOffset(): Quaternion {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRotationOffsetPtr, QUATERNION)
    return (TransferContext.readReturnValue(QUATERNION) as Quaternion)
  }

  public companion object

  public object MethodBindings {
    internal val getSkeletonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneCollision3D", "get_skeleton", 1488626673)

    internal val setBoneNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneCollision3D", "set_bone_name", 83702148)

    internal val getBoneNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneCollision3D", "get_bone_name", 201670096)

    internal val setBonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneCollision3D", "set_bone", 1286410249)

    internal val getBonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneCollision3D", "get_bone", 3905245786)

    internal val setPositionOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneCollision3D", "set_position_offset", 3460891852)

    internal val getPositionOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneCollision3D", "get_position_offset", 3360562783)

    internal val setRotationOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneCollision3D", "set_rotation_offset", 1727505552)

    internal val getRotationOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneCollision3D", "get_rotation_offset", 1222331677)
  }
}
