// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedByteArray
import godot.core.TypeManager
import godot.core.VariantParser.LONG
import godot.core.VariantParser.PACKED_BYTE_ARRAY
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

private const val ENGINE_CLASS_HMACCONTEXT_INDEX: Int = 274

/**
 * The HMACContext class is useful for advanced HMAC use cases, such as streaming the message as it
 * supports creating the message over time rather than providing it all at once.
 *
 * gdscript:
 * ```gdscript
 * extends Node
 * var ctx = HMACContext.new()
 *
 * func _ready():
 *     var key = "supersecret".to_utf8_buffer()
 *     var err = ctx.start(HashingContext.HASH_SHA256, key)
 *     assert(err == OK)
 *     var msg1 = "this is ".to_utf8_buffer()
 *     var msg2 = "super duper secret".to_utf8_buffer()
 *     err = ctx.update(msg1)
 *     assert(err == OK)
 *     err = ctx.update(msg2)
 *     assert(err == OK)
 *     var hmac = ctx.finish()
 *     print(hmac.hex_encode())
 *
 * ```
 * csharp:
 * ```csharp
 * using Godot;
 * using System.Diagnostics;
 *
 * public partial class MyNode : Node
 * {
 *     private HmacContext _ctx = new HmacContext();
 *
 *     public override void _Ready()
 *     {
 *         byte[] key = "supersecret".ToUtf8Buffer();
 *         Error err = _ctx.Start(HashingContext.HashType.Sha256, key);
 *         Debug.Assert(err == Error.Ok);
 *         byte[] msg1 = "this is ".ToUtf8Buffer();
 *         byte[] msg2 = "super duper secret".ToUtf8Buffer();
 *         err = _ctx.Update(msg1);
 *         Debug.Assert(err == Error.Ok);
 *         err = _ctx.Update(msg2);
 *         Debug.Assert(err == Error.Ok);
 *         byte[] hmac = _ctx.Finish();
 *         GD.Print(hmac.HexEncode());
 *     }
 * }
 * ```
 */
@GodotBaseType
public open class HMACContext : RefCounted() {
  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINE_CLASS_HMACCONTEXT_INDEX, scriptIndex)
  }

  /**
   * Initializes the HMACContext. This method cannot be called again on the same HMACContext until
   * [finish] has been called.
   */
  public final fun start(hashType: HashingContext.HashType, key: PackedByteArray): Error {
    TransferContext.writeArguments(LONG to hashType.id, PACKED_BYTE_ARRAY to key)
    TransferContext.callMethod(rawPtr, MethodBindings.startPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Updates the message to be HMACed. This can be called multiple times before [finish] is called
   * to append [data] to the message, but cannot be called until [start] has been called.
   */
  public final fun update(`data`: PackedByteArray): Error {
    TransferContext.writeArguments(PACKED_BYTE_ARRAY to data)
    TransferContext.callMethod(rawPtr, MethodBindings.updatePtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the resulting HMAC. If the HMAC failed, an empty [PackedByteArray] is returned.
   */
  public final fun finish(): PackedByteArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.finishPtr, PACKED_BYTE_ARRAY)
    return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY) as PackedByteArray)
  }

  public companion object

  internal object MethodBindings {
    public val startPtr: VoidPtr = TypeManager.getMethodBindPtr("HMACContext", "start", 3537364598)

    public val updatePtr: VoidPtr = TypeManager.getMethodBindPtr("HMACContext", "update", 680677267)

    public val finishPtr: VoidPtr =
        TypeManager.getMethodBindPtr("HMACContext", "finish", 2115431945)
  }
}
