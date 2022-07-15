package godot.codegen.repositories.impl

import godot.codegen.repositories.IDocRepository
import godot.docgen.ClassDoc

class DocRepository(val rawData: Map<String, ClassDoc>) : IDocRepository {
    override fun findByClassName(className: String) = rawData[className]
}