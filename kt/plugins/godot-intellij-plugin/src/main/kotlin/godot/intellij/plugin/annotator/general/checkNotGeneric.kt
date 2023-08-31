package godot.intellij.plugin.annotator.general

import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.psi.PsiField
import com.intellij.psi.PsiTypeParameterListOwner
import godot.intellij.plugin.GodotPluginBundle
import godot.intellij.plugin.extension.registerProblem
import org.jetbrains.kotlin.psi.KtProperty


fun checkNotGeneric(typeParameterListOwner: PsiTypeParameterListOwner, holder: AnnotationHolder) {
    when {
        typeParameterListOwner.typeParameters.isNotEmpty() -> holder.registerProblem(
            GodotPluginBundle.message("problem.general.cannotRegisterGenerics"),
            typeParameterListOwner.typeParameterList
                ?: typeParameterListOwner.navigationElement
        )
        typeParameterListOwner is KtProperty && typeParameterListOwner.hasTypeParameters() -> {
            val ktProperty = (typeParameterListOwner as KtProperty)
            holder.registerProblem(
                GodotPluginBundle.message("problem.general.cannotRegisterGenerics"),
                ktProperty.typeParameterList
                    ?: ktProperty.typeReference
                    ?: ktProperty.nameIdentifier
                    ?: ktProperty.navigationElement
            )
        }
        typeParameterListOwner is PsiField && typeParameterListOwner.hasTypeParameters() -> {
            holder.registerProblem(
                GodotPluginBundle.message("problem.general.cannotRegisterGenerics"),
                typeParameterListOwner.typeParameterList
                    ?: typeParameterListOwner.typeElement
                    ?: typeParameterListOwner.nameIdentifier
            )
        }
    }
}
