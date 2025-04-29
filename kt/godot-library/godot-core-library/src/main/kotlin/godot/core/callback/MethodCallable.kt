@file:Suppress("PackageDirectoryMismatch")

package godot.core

import godot.api.Object
import godot.internal.memory.MemoryManager

class MethodCallable internal constructor(
    private val target: Object,
    private val methodName: StringName,
    private var boundArgs: Array<Any?> = emptyArray()
) : Callable {

    override fun getBoundArguments() = boundArgs.toList()
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
    override fun bindUnsafe(vararg args: Any?) = MethodCallable(target, methodName, arrayOf<Any?>(*args, *boundArgs))
    override fun callUnsafe(vararg args: Any?) = target.call(methodName, *args, *boundArgs)
    override fun callDeferredUnsafe(vararg args: Any?) {
        target.callDeferred(methodName, *args, *boundArgs)
    }

    override fun toNativeCallable(): VariantCallable {
        val unbound = VariantCallable(target, methodName)
        if (boundArgs.isNotEmpty()) {
            return unbound.bindUnsafe(*boundArgs)
        }
        return unbound
    }

    companion object {
        @JvmStatic
        @JvmName("create")
        operator fun invoke(target: Object, methodName: StringName) = MethodCallable(target, methodName)
    }
}
