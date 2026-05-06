@file:Suppress("unused")

package godot.tools.common.names

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.MemberName

object Coroutines {
    val await = ClassName(godotCoroutinePackage, "Await")
    val resume = MemberName(kotlinCoroutinePackage, "resume")
    val suspendCancellableCoroutine = MemberName(kotlinxCoroutinePackage, "suspendCancellableCoroutine")
    val cancellableContinuation = ClassName(kotlinxCoroutinePackage, "CancellableContinuation")

    fun signalArguments(argCount: Int) = ClassName(godotCoroutinePackage, "SignalArguments$argCount")
}
