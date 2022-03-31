package godot.codegen.repositories

import godot.codegen.classes
import godot.codegen.models.enriched.toEnriched
import godot.codegen.repositories.impl.JsonClassRepository
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class JsonClassRepositoryTest {
    private val classRepository: ClassRepository = JsonClassRepository(classes.toEnriched())

    @Test
    fun `Should list classes`() {
        Assertions.assertEquals(classes.size, classRepository.list().size)
    }

    @Test
    fun `Should return class matching className`() {
        val name = "WorldDomination"
        val clazz = classRepository.findByClassName(name)
        Assertions.assertNotNull(clazz)
        Assertions.assertEquals(name, clazz?.name)
    }
}