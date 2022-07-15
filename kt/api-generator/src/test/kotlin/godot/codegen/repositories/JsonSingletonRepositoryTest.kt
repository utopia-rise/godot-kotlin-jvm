package godot.codegen.repositories

import godot.codegen.models.enriched.toEnriched
import godot.codegen.repositories.impl.JsonSingletonRepository
import godot.codegen.singletons
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.util.*

class JsonSingletonRepositoryTest {
    private val singletonRepository: SingletonRepository = JsonSingletonRepository(singletons.toEnriched())

    @Test
    fun `Should list singletons`() {
        Assertions.assertEquals(singletons.size, singletonRepository.list().size)
    }

    @Test
    fun `Should return singleton for valid name`() {
        val name = "WorldDomination"
        val singleton = singletonRepository findByName name
        Assertions.assertEquals(name, singleton?.name)
        Assertions.assertEquals("WorldDomination", singleton?.type)
    }

    @Test
    fun `Should return null when getting singleton with invalid name`() {
        Assertions.assertNull(singletonRepository findByName UUID.randomUUID().toString())
    }

    @Test
    fun `Should return all singletons matching type`() {
        val type = "WorldDomination"
        val singletons = singletonRepository findByType type
        Assertions.assertEquals(singletons.filter { it.type == type }.size, singletons.size)
    }

    @Test
    fun `Should return empty list when no matching type`() {
        Assertions.assertEquals(0, (singletonRepository findByType UUID.randomUUID().toString()).size)
    }
}