// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.GodotBaseType
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Positional 2D light source.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/2d/2d_lights_and_shadows.html]($DOCS_URL/tutorials/2d/2d_lights_and_shadows.html)
 *
 * Casts light in a 2D environment. This light's shape is defined by a (usually grayscale) texture.
 */
@GodotBaseType
public open class PointLight2D : Light2D() {
  /**
   * [godot.Texture2D] used for the light's appearance.
   */
  public var texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POINTLIGHT2D_GET_TEXTURE, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POINTLIGHT2D_SET_TEXTURE, NIL)
    }

  /**
   * The offset of the light's [texture].
   */
  public var offset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POINTLIGHT2D_GET_TEXTURE_OFFSET,
          VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POINTLIGHT2D_SET_TEXTURE_OFFSET,
          NIL)
    }

  /**
   * The [texture]'s scale factor.
   */
  public var textureScale: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POINTLIGHT2D_GET_TEXTURE_SCALE,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POINTLIGHT2D_SET_TEXTURE_SCALE,
          NIL)
    }

  /**
   * The height of the light. Used with 2D normal mapping. The units are in pixels, e.g. if the height is 100, then it will illuminate an object 100 pixels away at a 45° angle to the plane.
   */
  public var height: Float
    @JvmName("getHeight_prop")
    @Suppress("INAPPLICABLE_JVM_NAME")
    get() = super.getHeight()
    @JvmName("setHeight_prop")
    @Suppress("INAPPLICABLE_JVM_NAME")
    set(`value`) {
      super.setHeight(value)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_POINTLIGHT2D, scriptIndex)
    return true
  }

  /**
   * The offset of the light's [texture].
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
   * val myCoreType = pointlight2d.offset
   * //Your changes
   * pointlight2d.offset = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun offset(block: Vector2.() -> Unit): Vector2 = offset.apply{
      block(this)
      offset = this
  }


  public companion object
}
