package godot.codegen.generation.task.traits

import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec

interface DocumentedGenerationTrait {
    var description: String?
}

//TODO: Use Documentable interface from poet when upgrading kotlin poet.
fun TypeSpec.Builder.addKdoc(documented: DocumentedGenerationTrait): TypeSpec.Builder {
    val documentation = documented.description
    return if (documentation.isNullOrEmpty()) {
        this
    } else {
        this.addKdoc(documentation)
    }
}

fun PropertySpec.Builder.addKdoc(documented: DocumentedGenerationTrait): PropertySpec.Builder {
    val documentation = documented.description
    return if (documentation.isNullOrEmpty()) {
        this
    } else {
        this.addKdoc(documentation)
    }
}

fun FunSpec.Builder.addKdoc(documented: DocumentedGenerationTrait): FunSpec.Builder {
    val documentation = documented.description
    return if (documentation.isNullOrEmpty()) {
        this
    } else {
        this.addKdoc(documentation)
    }
}
