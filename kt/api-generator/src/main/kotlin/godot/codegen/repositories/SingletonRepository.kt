package godot.codegen.repositories

import godot.codegen.models.Singleton

interface SingletonRepository {
    fun list(): List<Singleton>
    infix fun findByName(name: String): Singleton?
    infix fun findByType(type: String): List<Singleton>
}