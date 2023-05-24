package godot.core

import godot.core.memory.GarbageCollector
import godot.core.memory.TransferContext
import godot.util.VoidPtr

class StringName : NativeCoreType {

    //INTERNAL
    internal constructor(_handle: VoidPtr) {
        this._handle = _handle
        GarbageCollector.registerNativeCoreType(this, VariantType.STRING_NAME)
    }

    //CONSTRUCTORS
    constructor() {
        _handle = Bridge.engine_call_constructor()
        GarbageCollector.registerNativeCoreType(this, VariantType.STRING_NAME)
    }

    constructor(string: String) {
        TransferContext.writeArguments(VariantType.STRING to string)
        _handle = Bridge.engine_call_constructor_string()
        GarbageCollector.registerNativeCoreType(this, VariantType.STRING_NAME)
    }

    constructor(stringName: StringName) {
        TransferContext.writeArguments(VariantType.STRING_NAME to stringName)
        _handle = Bridge.engine_call_copy_constructor()
        GarbageCollector.registerNativeCoreType(this, VariantType.STRING_NAME)
    }

    override fun toString(): String {
        TransferContext.writeArguments()
        Bridge.engine_call_operator_string(_handle)
        return TransferContext.readReturnValue(VariantType.STRING, false) as String
    }

    operator fun <T> invoke(stringOperation: String.() -> T): T = toString().stringOperation()

    @Suppress("FunctionName")
    private object Bridge {
        external fun engine_call_constructor(): VoidPtr
        external fun engine_call_copy_constructor(): VoidPtr
        external fun engine_call_constructor_string(): VoidPtr

        external fun engine_call_operator_string(_handle: VoidPtr)
    }
}

fun String.asStringName() = StringName(this)
