@file:Suppress("PackageDirectoryMismatch")

package godot.core

import godot.api.Object
import godot.internal.memory.MemoryManager

class MethodCallable(
    private val target: Object,
    private val methodName: StringName,
) : Callable {
    private val boundArgs = mutableListOf<Any?>()

    override fun getBoundArguments() = boundArgs
    override fun getBoundArgumentCount() = boundArgs.size
    override fun getMethod() = methodName
    override fun getObject() = target
    override fun getObjectId() = target.objectID
    override fun isCustom() = false
    override fun isNull() = false
    override fun isStandard() = true
    override fun isValid() = MemoryManager.isInstanceValid(target) && target.hasMethod(methodName)
    override fun rpc(vararg args: Any?) = toNativeCallable().rpc(args)
    override fun rpcId(peerId: Long, vararg args: Any?) = toNativeCallable().rpcId(peerId, args)
    override fun unbind(argCount: Int) = toNativeCallable().unbind(argCount)
    override fun bindUnsafe(vararg args: Any?) = apply { boundArgs.addAll(args) }
    override fun callUnsafe(vararg args: Any?) = target.call(methodName, args.toList() + boundArgs)
    override fun callDeferredUnsafe(vararg args: Any?) {
        target.callDeferred(methodName, args.toList() + boundArgs)
    }


    override fun toNativeCallable(): VariantCallable {
        return VariantCallable(target, methodName).also {
            if (boundArgs.isNotEmpty()) {
                it.bindUnsafe(boundArgs)
            }
        }
    }

    companion object {
        @JvmStatic
        @JvmName("create")
        operator fun invoke(target: Object, methodName: StringName) = MethodCallable(target, methodName)
    }
}
