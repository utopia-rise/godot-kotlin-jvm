// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 *
 */
@GodotBaseType
public open class VisualShaderNodeParticleEmit : VisualShaderNode() {
  /**
   *
   */
  public var flags: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEPARTICLEEMIT_GET_FLAGS, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEPARTICLEEMIT_SET_FLAGS, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISUALSHADERNODEPARTICLEEMIT, scriptIndex)
    return true
  }

  public enum class EmitFlags(
    id: Long
  ) {
    /**
     *
     */
    EMIT_FLAG_POSITION(1),
    /**
     *
     */
    EMIT_FLAG_ROT_SCALE(2),
    /**
     *
     */
    EMIT_FLAG_VELOCITY(4),
    /**
     *
     */
    EMIT_FLAG_COLOR(8),
    /**
     *
     */
    EMIT_FLAG_CUSTOM(16),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object
}
