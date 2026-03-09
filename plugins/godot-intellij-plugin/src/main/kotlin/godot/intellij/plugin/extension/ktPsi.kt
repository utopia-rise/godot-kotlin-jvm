package godot.intellij.plugin.extension

import org.jetbrains.kotlin.analysis.api.analyze
import org.jetbrains.kotlin.analysis.api.types.KaType
import org.jetbrains.kotlin.analysis.api.types.symbol
import org.jetbrains.kotlin.psi.KtDeclaration

fun KtDeclaration.type(): KaType {
    val declaration = this
    return analyze(this) {
        declaration.returnType
    }
}

fun KtDeclaration.fqName(): String? {
    val declaration = this
    return analyze(this) {
        declaration.returnType.symbol?.classId?.asFqNameString()
    }
}
