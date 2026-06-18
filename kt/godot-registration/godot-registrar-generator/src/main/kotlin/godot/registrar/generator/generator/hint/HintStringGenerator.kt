package godot.registrar.generator.generator.hint

import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.MemberName
import godot.core.PropertyHint
import godot.registrar.generator.ext.asEnumName

data class GeneratedPropertyHint(
    val typeHint: MemberName,
    val hintString: CodeBlock,
) {
    constructor(typeHint: PropertyHint, hintString: String) : this(
        typeHint = typeHint.asEnumName(),
        hintString = CodeBlock.of("%S", hintString),
    )

    constructor(typeHint: PropertyHint, hintString: CodeBlock) : this(
        typeHint = typeHint.asEnumName(),
        hintString = hintString,
    )
}

internal interface HintGenerator {
    fun generate(): GeneratedPropertyHint
}
