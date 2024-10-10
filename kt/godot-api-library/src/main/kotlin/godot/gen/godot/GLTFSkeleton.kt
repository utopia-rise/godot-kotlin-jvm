// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.PackedInt32Array
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.DICTIONARY
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_INT_32_ARRAY
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_GLTFSKELETON_INDEX: Int = 262

@GodotBaseType
public open class GLTFSkeleton : Resource() {
  public final inline var joints: PackedInt32Array
    @JvmName("jointsProperty")
    get() = getJoints()
    @JvmName("jointsProperty")
    set(`value`) {
      setJoints(value)
    }

  public final inline var roots: PackedInt32Array
    @JvmName("rootsProperty")
    get() = getRoots()
    @JvmName("rootsProperty")
    set(`value`) {
      setRoots(value)
    }

  public final inline var uniqueNames: VariantArray<String>
    @JvmName("uniqueNamesProperty")
    get() = getUniqueNames()
    @JvmName("uniqueNamesProperty")
    set(`value`) {
      setUniqueNames(value)
    }

  public final inline var godotBoneNode: Dictionary<Any?, Any?>
    @JvmName("godotBoneNodeProperty")
    get() = getGodotBoneNode()
    @JvmName("godotBoneNodeProperty")
    set(`value`) {
      setGodotBoneNode(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_GLTFSKELETON_INDEX, scriptIndex)
  }

  public final fun getJoints(): PackedInt32Array {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getJointsPtr, PACKED_INT_32_ARRAY)
    return (Internals.readReturnValue(PACKED_INT_32_ARRAY) as PackedInt32Array)
  }

  public final fun setJoints(joints: PackedInt32Array): Unit {
    Internals.writeArguments(PACKED_INT_32_ARRAY to joints)
    Internals.callMethod(rawPtr, MethodBindings.setJointsPtr, NIL)
  }

  public final fun getRoots(): PackedInt32Array {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getRootsPtr, PACKED_INT_32_ARRAY)
    return (Internals.readReturnValue(PACKED_INT_32_ARRAY) as PackedInt32Array)
  }

  public final fun setRoots(roots: PackedInt32Array): Unit {
    Internals.writeArguments(PACKED_INT_32_ARRAY to roots)
    Internals.callMethod(rawPtr, MethodBindings.setRootsPtr, NIL)
  }

  public final fun getGodotSkeleton(): Skeleton3D? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getGodotSkeletonPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Skeleton3D?)
  }

  public final fun getUniqueNames(): VariantArray<String> {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getUniqueNamesPtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<String>)
  }

  public final fun setUniqueNames(uniqueNames: VariantArray<String>): Unit {
    Internals.writeArguments(ARRAY to uniqueNames)
    Internals.callMethod(rawPtr, MethodBindings.setUniqueNamesPtr, NIL)
  }

  /**
   * Returns a [Dictionary] that maps skeleton bone indices to the indices of GLTF nodes. This
   * property is unused during import, and only set during export. In a GLTF file, a bone is a node, so
   * Godot converts skeleton bones to GLTF nodes.
   */
  public final fun getGodotBoneNode(): Dictionary<Any?, Any?> {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getGodotBoneNodePtr, DICTIONARY)
    return (Internals.readReturnValue(DICTIONARY) as Dictionary<Any?, Any?>)
  }

  /**
   * Sets a [Dictionary] that maps skeleton bone indices to the indices of GLTF nodes. This property
   * is unused during import, and only set during export. In a GLTF file, a bone is a node, so Godot
   * converts skeleton bones to GLTF nodes.
   */
  public final fun setGodotBoneNode(godotBoneNode: Dictionary<Any?, Any?>): Unit {
    Internals.writeArguments(DICTIONARY to godotBoneNode)
    Internals.callMethod(rawPtr, MethodBindings.setGodotBoneNodePtr, NIL)
  }

  public final fun getBoneAttachmentCount(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getBoneAttachmentCountPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun getBoneAttachment(idx: Int): BoneAttachment3D? {
    Internals.writeArguments(LONG to idx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getBoneAttachmentPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as BoneAttachment3D?)
  }

  public companion object

  internal object MethodBindings {
    public val getJointsPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFSkeleton", "get_joints", 969006518)

    public val setJointsPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFSkeleton", "set_joints", 3614634198)

    public val getRootsPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFSkeleton", "get_roots", 969006518)

    public val setRootsPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFSkeleton", "set_roots", 3614634198)

    public val getGodotSkeletonPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFSkeleton", "get_godot_skeleton", 1814733083)

    public val getUniqueNamesPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFSkeleton", "get_unique_names", 2915620761)

    public val setUniqueNamesPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFSkeleton", "set_unique_names", 381264803)

    public val getGodotBoneNodePtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFSkeleton", "get_godot_bone_node", 2382534195)

    public val setGodotBoneNodePtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFSkeleton", "set_godot_bone_node", 4155329257)

    public val getBoneAttachmentCountPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFSkeleton", "get_bone_attachment_count", 2455072627)

    public val getBoneAttachmentPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFSkeleton", "get_bone_attachment", 945440495)
  }
}
