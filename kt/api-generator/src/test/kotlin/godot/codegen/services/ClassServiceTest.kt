package godot.codegen.services

import godot.codegen.classes
import godot.codegen.exceptions.NoMatchingClassFoundException
import godot.codegen.getFakeClasses
import godot.codegen.getFakeSingletons
import godot.codegen.models.Singleton
import godot.codegen.models.enriched.toEnriched
import godot.codegen.repositories.ClassRepository
import godot.codegen.repositories.SingletonRepository
import godot.codegen.services.impl.ClassGraphService
import godot.codegen.services.impl.ClassService
import godot.codegen.singletons
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.Mockito
import org.mockito.junit.jupiter.MockitoExtension
import java.util.*

@ExtendWith(MockitoExtension::class)
class ClassServiceTest {
    private val classRepository = Mockito.mock(ClassRepository::class.java)
    private val singletonRepository = Mockito.mock(SingletonRepository::class.java)
    private val classGraphService: IClassGraphService

    private val classService: IClassService

    init {
        Mockito.`when`(classRepository.list()).thenReturn(classes.toEnriched())
        Mockito.`when`(
            classRepository.findByClassName(Mockito.anyString())
        ).thenAnswer {
            val name = it.arguments.first() as String
            classes.toEnriched().firstOrNull { clazz -> clazz.name == name }
        }

        Mockito.`when`(singletonRepository.list()).thenAnswer { singletons.toEnriched() }
        Mockito.`when`(
            singletonRepository.findByName(Mockito.anyString())
        ).thenAnswer {
            val name = it.arguments.first() as String
            singletons.toEnriched().firstOrNull { singleton -> singleton.name == name }
        }
        Mockito.`when`(
            singletonRepository.findByType(Mockito.anyString())
        ).thenAnswer {
            val type = it.arguments.first() as String
            singletons.toEnriched().filter { singleton -> singleton.type == type }
        }

        classGraphService = ClassGraphService(classRepository)

        classService = ClassService(classRepository, singletonRepository, classGraphService)
    }

    @BeforeEach
    fun beforeEach() {
        classes = getFakeClasses()
        singletons = getFakeSingletons()
    }

    @Test
    fun `Should return matching singletons`() {
        val singletonClasses = classService.getSingletons()
        Assertions.assertEquals(singletons.size, singletonClasses.size)
    }

    @Test
    fun `Should throw exception if no class matching a singleton type`() {
        singletons.add(
            Singleton(UUID.randomUUID().toString(), UUID.randomUUID().toString())
        )
        Assertions.assertThrows(NoMatchingClassFoundException::class.java) { classService.getSingletons() }
    }

    @Test
    fun `Should return enriched class`() {
        val enrichedClass = classService.getClasses()
        val notSingletonClasses = classes.filter { !singletons.map { singleton -> singleton.type }.contains(it.name) }
        Assertions.assertEquals(notSingletonClasses.size, enrichedClass.size)
    }
}