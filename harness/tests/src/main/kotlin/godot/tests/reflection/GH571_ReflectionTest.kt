package godot.tests.reflection

import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import godot.Node
import godot.annotation.GodotMember
import godot.annotation.GodotScript


@Suppress("ClassName")
@GodotScript
class GH571_ReflectionTest: Node() {

    private val testJsonString = """
        {
            "id": 1,
            "data": "data_deserialized_through_reflection"
        }
    """.trimIndent()

    data class TestClass(
        val id: Int,
        val data: String,
    )

    @GodotMember
    fun deserializeJson(): String {
        val mapper = jacksonObjectMapper()
        val testClass = mapper.readValue(testJsonString, object : TypeReference<TestClass>() {})

        return testClass.data
    }
}
