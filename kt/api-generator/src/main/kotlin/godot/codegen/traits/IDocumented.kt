package godot.codegen.traits

import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec

interface IDocumented {
    var description: String?
}

//TODO: Use Documentable interface from poet when upgrading kotlin poet.
fun TypeSpec.Builder.addKdoc(documented: IDocumented): TypeSpec.Builder {
    val documentation = documented.description
    return if (documentation.isNullOrEmpty()) {
        this
    } else {
        this.addKdoc(documentation)
    }
}

fun PropertySpec.Builder.addKdoc(documented: IDocumented): PropertySpec.Builder {
    val documentation = documented.description
    return if (documentation.isNullOrEmpty()) {
        this
    } else {
        this.addKdoc(documentation)
    }
}

fun FunSpec.Builder.addKdoc(documented: IDocumented): FunSpec.Builder {
    val documentation = documented.description
    return if (documentation.isNullOrEmpty()) {
        this
    } else {
        this.addKdoc(documentation)
    }
}
