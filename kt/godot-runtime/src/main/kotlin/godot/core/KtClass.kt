package godot.core

import godot.util.VoidPtr

@Suppress("unused")
class KtClass<T : KtObject>(
        val name: String,
        val registeredName: String,
        val superClass: String,
        private val constructors: Map<Int, KtConstructor<T>>,
        private val _properties: Map<String, KtProperty<T, *>>,
        private val _functions: Map<String, KtFunction<T, *>>,
        private val _signalInfos: Map<String, KtSignalInfo>,
        val baseGodotClass: String
) {
    val functions: Array<KtFunction<T, *>>
        get() = _functions.values.toTypedArray()
    val properties: Array<KtProperty<T, *>>
        get() = _properties.values.toTypedArray()
    val signalInfos: Array<KtSignalInfo>
        get() = _signalInfos.values.toTypedArray()

    fun new(rawPtr: VoidPtr, instanceId: Long, argCount: Int): T {
        val constructor = constructors[argCount]
        check(constructor != null) { "Constructor with $argCount parameter(s) not found." }
        return KtObject.instantiateWith(rawPtr, instanceId) {
            val arguments = Array(constructor.parameterCount) {
                TransferContext.readSingleArgument(constructor.parameterTypes[it], constructor.parameterNullables[it])
            }
            TransferContext.buffer.rewind()
            constructor(arguments)
        }
    }
}
