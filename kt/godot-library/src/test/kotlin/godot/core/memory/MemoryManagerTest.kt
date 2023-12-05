@file:Suppress("RemoveRedundantBackticks")

package godot.core.memory

import org.junit.Test
import org.junit.Assert.assertTrue

class MemoryManagerTest {

    @Test
    fun `StringName cache returns same instance for same key`() {
        val name1 = MemoryManager.getOrCreateStringName("Test1")

        val name2 = MemoryManager.getOrCreateStringName("Test1")

        assertTrue(name1 == name2)
    }

}
