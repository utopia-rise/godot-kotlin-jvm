package godot.tests.coretypes

import godot.api.Node
import godot.api.Node3D
import godot.annotation.Export
import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction
import godot.annotation.RegisterProperty
import godot.core.VariantArray
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
    fun addToArrays() {
        intArray.append(4)
        stringArray.append("test")
    }

    @RegisterFunction
    fun clearArrays() {
        intArray.clear()
        stringArray.clear()
        nodeArray.clear()
    }
}