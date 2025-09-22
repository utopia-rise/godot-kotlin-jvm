package godot.tests.coretypes

import godot.api.Node
import godot.api.Node3D
import godot.annotation.Export
import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction
import godot.annotation.RegisterProperty
import godot.core.Dictionary
import godot.core.VariantArray
import godot.core.dictionaryOf
import godot.core.variantArrayOf

@RegisterClass
class VariantArraySerializationTest : Node() {

    @Export
    @RegisterProperty
    var intArray: VariantArray<Int> = variantArrayOf(1, 2, 3)

    @Export
    @RegisterProperty
    var stringArray: VariantArray<String> = variantArrayOf("hello", "world")

    @Export
    @RegisterProperty
    var nodeArray: VariantArray<Node3D> = variantArrayOf()

    @Export
    @RegisterProperty
    var testDictionary: Dictionary<String, Int> = dictionaryOf("one" to 1, "two" to 2)

    @RegisterFunction
    fun testArrayIntegrity(): Boolean {
        // This function tests that arrays maintain their integrity after serialization/deserialization
        return intArray.size == 3 && 
               intArray[0] == 1 && 
               intArray[1] == 2 && 
               intArray[2] == 3 &&
               stringArray.size == 2 &&
               stringArray[0] == "hello" &&
               stringArray[1] == "world"
    }

    @RegisterFunction
    fun testDictionaryIntegrity(): Boolean {
        // This function tests that dictionaries maintain their integrity after serialization/deserialization
        return testDictionary.size == 2 &&
               testDictionary["one"] == 1 &&
               testDictionary["two"] == 2
    }

    @RegisterFunction
    fun addToArrays() {
        intArray.append(4)
        stringArray.append("test")
    }

    @RegisterFunction
    fun addToDictionary() {
        testDictionary["three"] = 3
    }

    @RegisterFunction
    fun clearAll() {
        intArray.clear()
        stringArray.clear()
        nodeArray.clear()
        testDictionary.clear()
    }
}