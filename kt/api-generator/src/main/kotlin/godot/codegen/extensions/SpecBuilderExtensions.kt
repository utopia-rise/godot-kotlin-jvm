package godot.codegen.extensions

import com.squareup.kotlinpoet.AnnotationSpec
import com.squareup.kotlinpoet.FunSpec
import godot.tools.common.mapping.MemberNameMapping

internal fun FunSpec.Builder.applyJvmNameIfNecessary(
    name: String
): FunSpec.Builder {
    val nameMapping = MemberNameMapping.KotlinNameToJavaName.GodotApi.functions[name]
    if (nameMapping != null) {
        addAnnotation(
            AnnotationSpec.builder(JvmName::class)
                .addMember("%S", nameMapping)
                .build()
        )
    }
    return this
}
