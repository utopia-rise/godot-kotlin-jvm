package godot.tests.registration

import godot.api.Object
import godot.api.Node
import godot.annotation.Script
import godot.annotation.Register
import godot.annotation.Visible
import godot.core.Dictionary
import godot.core.VariantArray
import godot.core.variantArrayOf

@Script
class BindingTest : Object() {
    @Visible
    var setterCalls = 0

    @Visible
    var getterCalls = 0

    @Visible
    var validatedNameBacking = "INITIAL"
        set(value) {
            setterCalls += 1
            field = value.trim().uppercase()
        }
        get() {
            getterCalls += 1
            return field
        }

    @Visible
    var isEnabled = false

    @Visible
    var typedIntArray: VariantArray<Int> = variantArrayOf(1, 2, 3)

    @Visible
    var nullableVariantArray: VariantArray<Any?> = variantArrayOf("alpha", null, 3)

    @Visible
    var mixedDictionary: Dictionary<String, Any?> = Dictionary()

    init {
        mixedDictionary["origin"] = "kotlin"
        mixedDictionary["count"] = 1
    }

    @Register
    fun getClassName(obj: Object) = obj::class.simpleName

    @Register
    fun sumTypedIntArray() = typedIntArray.sum()

    @Register
    fun readNullableArrayEntry(index: Int): String {
        val value = nullableVariantArray[index]
        return value?.toString() ?: "null"
    }

    @Register
    fun writeMixedDictionaryEntry(key: String, value: String) {
        mixedDictionary[key] = value
    }
}

@Script
class BindingA : Node()

@Script
class BindingB : Node()

