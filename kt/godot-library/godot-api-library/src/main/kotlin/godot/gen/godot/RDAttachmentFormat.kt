// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_RDATTACHMENTFORMAT_INDEX: Int = 509

/**
 * This object is used by [RenderingDevice].
 */
@GodotBaseType
public open class RDAttachmentFormat : RefCounted() {
  /**
   * The attachment's data format.
   */
  public final inline var format: RenderingDevice.DataFormat
    @JvmName("formatProperty")
    get() = getFormat()
    @JvmName("formatProperty")
    set(`value`) {
      setFormat(value)
    }

  /**
   * The number of samples used when sampling the attachment.
   */
  public final inline var samples: RenderingDevice.TextureSamples
    @JvmName("samplesProperty")
    get() = getSamples()
    @JvmName("samplesProperty")
    set(`value`) {
      setSamples(value)
    }

  /**
   * The attachment's usage flags, which determine what can be done with it.
   */
  public final inline var usageFlags: Long
    @JvmName("usageFlagsProperty")
    get() = getUsageFlags()
    @JvmName("usageFlagsProperty")
    set(`value`) {
      setUsageFlags(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_RDATTACHMENTFORMAT_INDEX, scriptIndex)
  }

  public final fun setFormat(pMember: RenderingDevice.DataFormat): Unit {
    Internals.writeArguments(LONG to pMember.id)
    Internals.callMethod(rawPtr, MethodBindings.setFormatPtr, NIL)
  }

  public final fun getFormat(): RenderingDevice.DataFormat {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getFormatPtr, LONG)
    return RenderingDevice.DataFormat.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setSamples(pMember: RenderingDevice.TextureSamples): Unit {
    Internals.writeArguments(LONG to pMember.id)
    Internals.callMethod(rawPtr, MethodBindings.setSamplesPtr, NIL)
  }

  public final fun getSamples(): RenderingDevice.TextureSamples {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSamplesPtr, LONG)
    return RenderingDevice.TextureSamples.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setUsageFlags(pMember: Long): Unit {
    Internals.writeArguments(LONG to pMember)
    Internals.callMethod(rawPtr, MethodBindings.setUsageFlagsPtr, NIL)
  }

  public final fun getUsageFlags(): Long {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getUsageFlagsPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  public companion object

  public object MethodBindings {
    internal val setFormatPtr: VoidPtr =
        Internals.getMethodBindPtr("RDAttachmentFormat", "set_format", 565531219)

    internal val getFormatPtr: VoidPtr =
        Internals.getMethodBindPtr("RDAttachmentFormat", "get_format", 2235804183)

    internal val setSamplesPtr: VoidPtr =
        Internals.getMethodBindPtr("RDAttachmentFormat", "set_samples", 3774171498)

    internal val getSamplesPtr: VoidPtr =
        Internals.getMethodBindPtr("RDAttachmentFormat", "get_samples", 407791724)

    internal val setUsageFlagsPtr: VoidPtr =
        Internals.getMethodBindPtr("RDAttachmentFormat", "set_usage_flags", 1286410249)

    internal val getUsageFlagsPtr: VoidPtr =
        Internals.getMethodBindPtr("RDAttachmentFormat", "get_usage_flags", 3905245786)
  }
}
