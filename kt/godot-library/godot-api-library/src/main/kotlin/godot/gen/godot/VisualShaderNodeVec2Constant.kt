// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.NIL
import godot.core.VariantParser.VECTOR2
import godot.core.Vector2
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_VISUALSHADERNODEVEC2CONSTANT_INDEX: Int = 802

/**
 * A constant [Vector2], which can be used as an input node.
 */
@GodotBaseType
public open class VisualShaderNodeVec2Constant : VisualShaderNodeConstant() {
  /**
   * A [Vector2] constant which represents the state of this node.
   */
  @CoreTypeLocalCopy
  public final inline var constant: Vector2
    @JvmName("constantProperty")
    get() = getConstant()
    @JvmName("constantProperty")
    set(`value`) {
      setConstant(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_VISUALSHADERNODEVEC2CONSTANT_INDEX, scriptIndex)
  }

  /**
   * A [Vector2] constant which represents the state of this node.
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
   * val myCoreType = visualshadernodevec2constant.constant
   * //Your changes
   * visualshadernodevec2constant.constant = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun constantMutate(block: Vector2.() -> Unit): Vector2 = constant.apply{
      block(this)
      constant = this
  }


  public final fun setConstant(constant: Vector2): Unit {
    Internals.writeArguments(VECTOR2 to constant)
    Internals.callMethod(rawPtr, MethodBindings.setConstantPtr, NIL)
  }

  public final fun getConstant(): Vector2 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getConstantPtr, VECTOR2)
    return (Internals.readReturnValue(VECTOR2) as Vector2)
  }

  public companion object

  public object MethodBindings {
    internal val setConstantPtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeVec2Constant", "set_constant", 743155724)

    internal val getConstantPtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeVec2Constant", "get_constant", 3341600327)
  }
}
