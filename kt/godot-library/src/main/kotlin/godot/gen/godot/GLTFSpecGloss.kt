// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.TransferContext
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import kotlin.Double
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class GLTFSpecGloss : Resource() {
  public open var diffuseFactor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSPECGLOSS_GET_DIFFUSE_FACTOR,
          COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSPECGLOSS_SET_DIFFUSE_FACTOR,
          NIL)
    }

  public open var diffuseImg: Image?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSPECGLOSS_GET_DIFFUSE_IMG,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Image?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSPECGLOSS_SET_DIFFUSE_IMG,
          NIL)
    }

  public open var glossFactor: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSPECGLOSS_GET_GLOSS_FACTOR,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSPECGLOSS_SET_GLOSS_FACTOR,
          NIL)
    }

  public open var specGlossImg: Image?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSPECGLOSS_GET_SPEC_GLOSS_IMG,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Image?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSPECGLOSS_SET_SPEC_GLOSS_IMG,
          NIL)
    }

  public open var specularFactor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSPECGLOSS_GET_SPECULAR_FACTOR,
          COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSPECGLOSS_SET_SPECULAR_FACTOR,
          NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_GLTFSPECGLOSS)
  }

  @CoreTypeHelper
  public open fun diffuseFactor(schedule: Color.() -> Unit): Color = diffuseFactor.apply{
      schedule(this)
      diffuseFactor = this
  }


  @CoreTypeHelper
  public open fun specularFactor(schedule: Color.() -> Unit): Color = specularFactor.apply{
      schedule(this)
      specularFactor = this
  }

}
