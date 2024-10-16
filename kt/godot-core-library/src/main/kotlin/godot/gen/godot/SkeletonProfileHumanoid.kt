// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.MemoryManager
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * A [SkeletonProfile] as a preset that is optimized for the human form. This exists for
 * standardization, so all parameters are read-only.
 * A humanoid skeleton profile contains 54 bones divided in 4 groups: `"Body"`, `"Face"`,
 * `"LeftHand"`, and `"RightHand"`. It is structured as follows:
 * [codeblock lang=text]
 * Root
 * └─ Hips
 *     ├─ LeftUpperLeg
 *     │  └─ LeftLowerLeg
 *     │     └─ LeftFoot
 *     │        └─ LeftToes
 *     ├─ RightUpperLeg
 *     │  └─ RightLowerLeg
 *     │     └─ RightFoot
 *     │        └─ RightToes
 *     └─ Spine
 *         └─ Chest
 *             └─ UpperChest
 *                 ├─ Neck
 *                 │   └─ Head
 *                 │       ├─ Jaw
 *                 │       ├─ LeftEye
 *                 │       └─ RightEye
 *                 ├─ LeftShoulder
 *                 │  └─ LeftUpperArm
 *                 │     └─ LeftLowerArm
 *                 │        └─ LeftHand
 *                 │           ├─ LeftThumbMetacarpal
 *                 │           │  └─ LeftThumbProximal
 *                 │           ├─ LeftIndexProximal
 *                 │           │  └─ LeftIndexIntermediate
 *                 │           │    └─ LeftIndexDistal
 *                 │           ├─ LeftMiddleProximal
 *                 │           │  └─ LeftMiddleIntermediate
 *                 │           │    └─ LeftMiddleDistal
 *                 │           ├─ LeftRingProximal
 *                 │           │  └─ LeftRingIntermediate
 *                 │           │    └─ LeftRingDistal
 *                 │           └─ LeftLittleProximal
 *                 │              └─ LeftLittleIntermediate
 *                 │                └─ LeftLittleDistal
 *                 └─ RightShoulder
 *                    └─ RightUpperArm
 *                       └─ RightLowerArm
 *                          └─ RightHand
 *                             ├─ RightThumbMetacarpal
 *                             │  └─ RightThumbProximal
 *                             ├─ RightIndexProximal
 *                             │  └─ RightIndexIntermediate
 *                             │     └─ RightIndexDistal
 *                             ├─ RightMiddleProximal
 *                             │  └─ RightMiddleIntermediate
 *                             │     └─ RightMiddleDistal
 *                             ├─ RightRingProximal
 *                             │  └─ RightRingIntermediate
 *                             │     └─ RightRingDistal
 *                             └─ RightLittleProximal
 *                                └─ RightLittleIntermediate
 *                                  └─ RightLittleDistal
 * [/codeblock]
 */
@GodotBaseType
public open class SkeletonProfileHumanoid : SkeletonProfile() {
  public override fun new(scriptIndex: Int): Unit {
    MemoryManager.createNativeObject(ENGINECLASS_SKELETONPROFILEHUMANOID, this, scriptIndex)
  }

  public companion object

  internal object MethodBindings
}
