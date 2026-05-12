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
import godot.core.MethodStringName0
import godot.core.MethodStringName1
import godot.core.MethodStringName2
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.STRING
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmField
import kotlin.jvm.JvmName

/**
 * This modifier limits bone rotation angular velocity by comparing poses between previous and
 * current frame.
 *
 * You can add bone chains by specifying their root and end bones, then add the bones between them
 * to a list. Modifier processes either that list or the bones excluding those in the list depending on
 * the option [exclude].
 */
@GodotBaseType
public open class LimitAngularVelocityModifier3D : SkeletonModifier3D() {
  /**
   * The maximum angular velocity per second.
   */
  public final inline var maxAngularVelocity: Double
    @JvmName("maxAngularVelocityProperty")
    get() = getMaxAngularVelocity()
    @JvmName("maxAngularVelocityProperty")
    set(`value`) {
      setMaxAngularVelocity(value)
    }

  /**
   * If `true`, the modifier processes bones not included in the bone list.
   *
   * If `false`, the bones processed by the modifier are equal to the bone list.
   */
  public final inline var exclude: Boolean
    @JvmName("excludeProperty")
    get() = isExclude()
    @JvmName("excludeProperty")
    set(`value`) {
      setExclude(value)
    }

  /**
   * The number of chains.
   */
  public final inline var chainCount: Int
    @JvmName("chainCountProperty")
    get() = getChainCount()
    @JvmName("chainCountProperty")
    set(`value`) {
      setChainCount(value)
    }

  public override fun new(scriptPtr: VoidPtr): Unit {
    createNativeObject(352, scriptPtr)
  }

  /**
   * Sets the root bone name of the bone chain.
   */
  public final fun setRootBoneName(index: Int, boneName: String): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), STRING to boneName)
    TransferContext.callMethod(ptr, MethodBindings.setRootBoneNamePtr, NIL)
  }

  /**
   * Returns the root bone name of the bone chain.
   */
  public final fun getRootBoneName(index: Int): String {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getRootBoneNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Sets the root bone index of the bone chain.
   */
  public final fun setRootBone(index: Int, bone: Int): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to bone.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setRootBonePtr, NIL)
  }

  /**
   * Returns the root bone index of the bone chain.
   */
  public final fun getRootBone(index: Int): Int {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getRootBonePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Sets the end bone name of the bone chain.
   *
   * **Note:** End bone must be the root bone or a child of the root bone.
   */
  public final fun setEndBoneName(index: Int, boneName: String): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), STRING to boneName)
    TransferContext.callMethod(ptr, MethodBindings.setEndBoneNamePtr, NIL)
  }

  /**
   * Returns the end bone name of the bone chain.
   */
  public final fun getEndBoneName(index: Int): String {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getEndBoneNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Sets the end bone index of the bone chain.
   */
  public final fun setEndBone(index: Int, bone: Int): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to bone.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setEndBonePtr, NIL)
  }

  /**
   * Returns the end bone index of the bone chain.
   */
  public final fun getEndBone(index: Int): Int {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getEndBonePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setChainCount(count: Int): Unit {
    TransferContext.writeArguments(LONG to count.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setChainCountPtr, NIL)
  }

  public final fun getChainCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getChainCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Clear all chains.
   */
  public final fun clearChains(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.clearChainsPtr, NIL)
  }

  public final fun setMaxAngularVelocity(angularVelocity: Double): Unit {
    TransferContext.writeArguments(DOUBLE to angularVelocity)
    TransferContext.callMethod(ptr, MethodBindings.setMaxAngularVelocityPtr, NIL)
  }

  public final fun getMaxAngularVelocity(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMaxAngularVelocityPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  public final fun setExclude(exclude: Boolean): Unit {
    TransferContext.writeArguments(BOOL to exclude)
    TransferContext.callMethod(ptr, MethodBindings.setExcludePtr, NIL)
  }

  public final fun isExclude(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isExcludePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets the reference pose for angle comparison to the current pose with the influence of
   * constraints removed. This function is automatically triggered when joints change or upon
   * activation.
   */
  public final fun reset(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.resetPtr, NIL)
  }

  public companion object {
    @JvmField
    public val setRootBoneNameName:
        MethodStringName2<LimitAngularVelocityModifier3D, Unit, Int, String> =
        MethodStringName2<LimitAngularVelocityModifier3D, Unit, Int, String>("set_root_bone_name")

    @JvmField
    public val getRootBoneNameName: MethodStringName1<LimitAngularVelocityModifier3D, String, Int> =
        MethodStringName1<LimitAngularVelocityModifier3D, String, Int>("get_root_bone_name")

    @JvmField
    public val setRootBoneName: MethodStringName2<LimitAngularVelocityModifier3D, Unit, Int, Int> =
        MethodStringName2<LimitAngularVelocityModifier3D, Unit, Int, Int>("set_root_bone")

    @JvmField
    public val getRootBoneName: MethodStringName1<LimitAngularVelocityModifier3D, Int, Int> =
        MethodStringName1<LimitAngularVelocityModifier3D, Int, Int>("get_root_bone")

    @JvmField
    public val setEndBoneNameName:
        MethodStringName2<LimitAngularVelocityModifier3D, Unit, Int, String> =
        MethodStringName2<LimitAngularVelocityModifier3D, Unit, Int, String>("set_end_bone_name")

    @JvmField
    public val getEndBoneNameName: MethodStringName1<LimitAngularVelocityModifier3D, String, Int> =
        MethodStringName1<LimitAngularVelocityModifier3D, String, Int>("get_end_bone_name")

    @JvmField
    public val setEndBoneName: MethodStringName2<LimitAngularVelocityModifier3D, Unit, Int, Int> =
        MethodStringName2<LimitAngularVelocityModifier3D, Unit, Int, Int>("set_end_bone")

    @JvmField
    public val getEndBoneName: MethodStringName1<LimitAngularVelocityModifier3D, Int, Int> =
        MethodStringName1<LimitAngularVelocityModifier3D, Int, Int>("get_end_bone")

    @JvmField
    public val setChainCountName: MethodStringName1<LimitAngularVelocityModifier3D, Unit, Int> =
        MethodStringName1<LimitAngularVelocityModifier3D, Unit, Int>("set_chain_count")

    @JvmField
    public val getChainCountName: MethodStringName0<LimitAngularVelocityModifier3D, Int> =
        MethodStringName0<LimitAngularVelocityModifier3D, Int>("get_chain_count")

    @JvmField
    public val clearChainsName: MethodStringName0<LimitAngularVelocityModifier3D, Unit> =
        MethodStringName0<LimitAngularVelocityModifier3D, Unit>("clear_chains")

    @JvmField
    public val setMaxAngularVelocityName:
        MethodStringName1<LimitAngularVelocityModifier3D, Unit, Double> =
        MethodStringName1<LimitAngularVelocityModifier3D, Unit, Double>("set_max_angular_velocity")

    @JvmField
    public val getMaxAngularVelocityName: MethodStringName0<LimitAngularVelocityModifier3D, Double>
        = MethodStringName0<LimitAngularVelocityModifier3D, Double>("get_max_angular_velocity")

    @JvmField
    public val setExcludeName: MethodStringName1<LimitAngularVelocityModifier3D, Unit, Boolean> =
        MethodStringName1<LimitAngularVelocityModifier3D, Unit, Boolean>("set_exclude")

    @JvmField
    public val isExcludeName: MethodStringName0<LimitAngularVelocityModifier3D, Boolean> =
        MethodStringName0<LimitAngularVelocityModifier3D, Boolean>("is_exclude")

    @JvmField
    public val resetName: MethodStringName0<LimitAngularVelocityModifier3D, Unit> =
        MethodStringName0<LimitAngularVelocityModifier3D, Unit>("reset")
  }

  public object MethodBindings {
    internal val setRootBoneNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LimitAngularVelocityModifier3D", "set_root_bone_name", 501894301)

    internal val getRootBoneNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LimitAngularVelocityModifier3D", "get_root_bone_name", 844755477)

    internal val setRootBonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LimitAngularVelocityModifier3D", "set_root_bone", 3937882851)

    internal val getRootBonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LimitAngularVelocityModifier3D", "get_root_bone", 923996154)

    internal val setEndBoneNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LimitAngularVelocityModifier3D", "set_end_bone_name", 501894301)

    internal val getEndBoneNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LimitAngularVelocityModifier3D", "get_end_bone_name", 844755477)

    internal val setEndBonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LimitAngularVelocityModifier3D", "set_end_bone", 3937882851)

    internal val getEndBonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LimitAngularVelocityModifier3D", "get_end_bone", 923996154)

    internal val setChainCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LimitAngularVelocityModifier3D", "set_chain_count", 1286410249)

    internal val getChainCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LimitAngularVelocityModifier3D", "get_chain_count", 3905245786)

    internal val clearChainsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LimitAngularVelocityModifier3D", "clear_chains", 3218959716)

    internal val setMaxAngularVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LimitAngularVelocityModifier3D", "set_max_angular_velocity", 373806689)

    internal val getMaxAngularVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LimitAngularVelocityModifier3D", "get_max_angular_velocity", 1740695150)

    internal val setExcludePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LimitAngularVelocityModifier3D", "set_exclude", 2586408642)

    internal val isExcludePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LimitAngularVelocityModifier3D", "is_exclude", 36873697)

    internal val resetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LimitAngularVelocityModifier3D", "reset", 3218959716)
  }
}
