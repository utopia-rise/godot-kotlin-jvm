package godot.codegen.repositories

import godot.docgen.ClassDoc

interface IDocRepository {
    fun findByClassName(className: String): ClassDoc?
}