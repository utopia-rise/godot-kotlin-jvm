// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.PoolByteArray
import godot.core.TransferContext
import godot.core.VariantType.LONG
import godot.core.VariantType.OBJECT
import godot.core.VariantType.POOL_BYTE_ARRAY
import godot.core.VariantType.STRING
import godot.util.VoidPtr
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class Crypto : Reference() {
  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_CRYPTO)

  open fun generateRandomBytes(size: Long): PoolByteArray {
    TransferContext.writeArguments(LONG to size)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CRYPTO_GENERATE_RANDOM_BYTES,
        POOL_BYTE_ARRAY)
    return TransferContext.readReturnValue(POOL_BYTE_ARRAY, false) as PoolByteArray
  }

  open fun generateRsa(size: Long): CryptoKey? {
    TransferContext.writeArguments(LONG to size)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CRYPTO_GENERATE_RSA, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as CryptoKey?
  }

  open fun generateSelfSignedCertificate(
    key: CryptoKey,
    issuerName: String = "CN=myserver,O=myorganisation,C=IT",
    notBefore: String = "20140101000000",
    notAfter: String = "20340101000000"
  ): X509Certificate? {
    TransferContext.writeArguments(OBJECT to key, STRING to issuerName, STRING to notBefore, STRING
        to notAfter)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_CRYPTO_GENERATE_SELF_SIGNED_CERTIFICATE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as X509Certificate?
  }
}
