// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

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
    createNativeObject(ENGINECLASS_RDATTACHMENTFORMAT, scriptIndex)
  }

  public final fun setFormat(pMember: RenderingDevice.DataFormat): Unit {
    TransferContext.writeArguments(LONG to pMember.id)
    TransferContext.callMethod(ptr, MethodBindings.setFormatPtr, NIL)
  }

  public final fun getFormat(): RenderingDevice.DataFormat {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFormatPtr, LONG)
    return RenderingDevice.DataFormat.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setSamples(pMember: RenderingDevice.TextureSamples): Unit {
    TransferContext.writeArguments(LONG to pMember.id)
    TransferContext.callMethod(ptr, MethodBindings.setSamplesPtr, NIL)
  }

  public final fun getSamples(): RenderingDevice.TextureSamples {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSamplesPtr, LONG)
    return RenderingDevice.TextureSamples.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setUsageFlags(pMember: Long): Unit {
    TransferContext.writeArguments(LONG to pMember)
    TransferContext.callMethod(ptr, MethodBindings.setUsageFlagsPtr, NIL)
  }

  public final fun getUsageFlags(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getUsageFlagsPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  public companion object

  internal object MethodBindings {
    public val setFormatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDAttachmentFormat", "set_format", 565531219)

    public val getFormatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDAttachmentFormat", "get_format", 2235804183)

    public val setSamplesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDAttachmentFormat", "set_samples", 3774171498)

    public val getSamplesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDAttachmentFormat", "get_samples", 407791724)

    public val setUsageFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDAttachmentFormat", "set_usage_flags", 1286410249)

    public val getUsageFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDAttachmentFormat", "get_usage_flags", 3905245786)
  }
}
