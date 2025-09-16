// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier", "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST", "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT", "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import kotlin.Int
import kotlin.Suppress

/**
 * A [SkeletonProfile] as a preset that is optimized for the human form. This exists for standardization, so all parameters are read-only.
 *
 * A humanoid skeleton profile contains 54 bones divided in 4 groups: `"Body"`, `"Face"`, `"LeftHand"`, and `"RightHand"`. It is structured as follows:
 *
 * [codeblock lang=text]
 *
 * Root
 *
 * └─ Hips
 *
 *     ├─ LeftUpperLeg
 *
 *     │  └─ LeftLowerLeg
 *
 *     │     └─ LeftFoot
 *
 *     │        └─ LeftToes
 *
 *     ├─ RightUpperLeg
 *
 *     │  └─ RightLowerLeg
 *
 *     │     └─ RightFoot
 *
 *     │        └─ RightToes
 *
 *     └─ Spine
 *
 *         └─ Chest
 *
 *             └─ UpperChest
 *
 *                 ├─ Neck
 *
 *                 │   └─ Head
 *
 *                 │       ├─ Jaw
 *
 *                 │       ├─ LeftEye
 *
 *                 │       └─ RightEye
 *
 *                 ├─ LeftShoulder
 *
 *                 │  └─ LeftUpperArm
 *
 *                 │     └─ LeftLowerArm
 *
 *                 │        └─ LeftHand
 *
 *                 │           ├─ LeftThumbMetacarpal
 *
 *                 │           │  └─ LeftThumbProximal
 *
 *                 │           │    └─ LeftThumbDistal
 *
 *                 │           ├─ LeftIndexProximal
 *
 *                 │           │  └─ LeftIndexIntermediate
 *
 *                 │           │    └─ LeftIndexDistal
 *
 *                 │           ├─ LeftMiddleProximal
 *
 *                 │           │  └─ LeftMiddleIntermediate
 *
 *                 │           │    └─ LeftMiddleDistal
 *
 *                 │           ├─ LeftRingProximal
 *
 *                 │           │  └─ LeftRingIntermediate
 *
 *                 │           │    └─ LeftRingDistal
 *
 *                 │           └─ LeftLittleProximal
 *
 *                 │              └─ LeftLittleIntermediate
 *
 *                 │                └─ LeftLittleDistal
 *
 *                 └─ RightShoulder
 *
 *                    └─ RightUpperArm
 *
 *                       └─ RightLowerArm
 *
 *                          └─ RightHand
 *
 *                             ├─ RightThumbMetacarpal
 *
 *                             │  └─ RightThumbProximal
 *
 *                             │     └─ RightThumbDistal
 *
 *                             ├─ RightIndexProximal
 *
 *                             │  └─ RightIndexIntermediate
 *
 *                             │     └─ RightIndexDistal
 *
 *                             ├─ RightMiddleProximal
 *
 *                             │  └─ RightMiddleIntermediate
 *
 *                             │     └─ RightMiddleDistal
 *
 *                             ├─ RightRingProximal
 *
 *                             │  └─ RightRingIntermediate
 *
 *                             │     └─ RightRingDistal
 *
 *                             └─ RightLittleProximal
 *
 *                                └─ RightLittleIntermediate
 *
 *                                  └─ RightLittleDistal
 *
 * ```
 */
@GodotBaseType
public open class SkeletonProfileHumanoid : SkeletonProfile() {
  override fun new(scriptIndex: Int) {
    createNativeObject(607, scriptIndex)
  }

  public companion object

  public object MethodBindings
}
