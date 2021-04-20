package godot.entrygenerator.model

import org.jetbrains.kotlin.psi.KtClass
import org.jetbrains.kotlin.psi.KtNamedFunction
import org.jetbrains.kotlin.psi.KtProperty

data class PsiClassWithMembers(
    val ktClass: KtClass,
    val properties: List<KtProperty>,
    val functions: List<KtNamedFunction>,
    val signals: List<KtProperty>
)
