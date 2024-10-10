// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.RID
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser._RID
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_RDUNIFORM_INDEX: Int = 523

/**
 * This object is used by [RenderingDevice].
 */
@GodotBaseType
public open class RDUniform : RefCounted() {
  /**
   * The uniform's data type.
   */
  public final inline var uniformType: RenderingDevice.UniformType
    @JvmName("uniformTypeProperty")
    get() = getUniformType()
    @JvmName("uniformTypeProperty")
    set(`value`) {
      setUniformType(value)
    }

  /**
   * The uniform's binding.
   */
  public final inline var binding: Int
    @JvmName("bindingProperty")
    get() = getBinding()
    @JvmName("bindingProperty")
    set(`value`) {
      setBinding(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_RDUNIFORM_INDEX, scriptIndex)
  }

  public final fun setUniformType(pMember: RenderingDevice.UniformType): Unit {
    Internals.writeArguments(LONG to pMember.id)
    Internals.callMethod(rawPtr, MethodBindings.setUniformTypePtr, NIL)
  }

  public final fun getUniformType(): RenderingDevice.UniformType {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getUniformTypePtr, LONG)
    return RenderingDevice.UniformType.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setBinding(pMember: Int): Unit {
    Internals.writeArguments(LONG to pMember.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setBindingPtr, NIL)
  }

  public final fun getBinding(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getBindingPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Binds the given id to the uniform. The data associated with the id is then used when the
   * uniform is passed to a shader.
   */
  public final fun addId(id: RID): Unit {
    Internals.writeArguments(_RID to id)
    Internals.callMethod(rawPtr, MethodBindings.addIdPtr, NIL)
  }

  /**
   * Unbinds all ids currently bound to the uniform.
   */
  public final fun clearIds(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.clearIdsPtr, NIL)
  }

  /**
   * Returns an array of all ids currently bound to the uniform.
   */
  public final fun getIds(): VariantArray<RID> {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getIdsPtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<RID>)
  }

  public companion object

  internal object MethodBindings {
    public val setUniformTypePtr: VoidPtr =
        Internals.getMethodBindPtr("RDUniform", "set_uniform_type", 1664894931)

    public val getUniformTypePtr: VoidPtr =
        Internals.getMethodBindPtr("RDUniform", "get_uniform_type", 475470040)

    public val setBindingPtr: VoidPtr =
        Internals.getMethodBindPtr("RDUniform", "set_binding", 1286410249)

    public val getBindingPtr: VoidPtr =
        Internals.getMethodBindPtr("RDUniform", "get_binding", 3905245786)

    public val addIdPtr: VoidPtr = Internals.getMethodBindPtr("RDUniform", "add_id", 2722037293)

    public val clearIdsPtr: VoidPtr =
        Internals.getMethodBindPtr("RDUniform", "clear_ids", 3218959716)

    public val getIdsPtr: VoidPtr = Internals.getMethodBindPtr("RDUniform", "get_ids", 3995934104)
  }
}
