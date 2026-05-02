package godot.intellij.plugin.analysis.jvm

import com.intellij.psi.PsiField
import com.intellij.psi.PsiTypeParameterListOwner
import godot.intellij.plugin.GodotPluginBundle
import godot.intellij.plugin.analysis.GodotProblem
import org.jetbrains.kotlin.psi.KtProperty

object GenericRegistrationAnalyzer {
    fun analyze(typeParameterListOwner: PsiTypeParameterListOwner): List<GodotProblem> {
        return when {
            typeParameterListOwner.typeParameters.isNotEmpty() -> listOf(
                GodotProblem(
                    GodotPluginBundle.message("problem.general.cannotRegisterGenerics"),
                    typeParameterListOwner.typeParameterList ?: typeParameterListOwner.navigationElement
                )
            )

            typeParameterListOwner is KtProperty && typeParameterListOwner.hasTypeParameters() -> {
                val ktProperty = typeParameterListOwner as KtProperty
                listOf(
                    GodotProblem(
                        GodotPluginBundle.message("problem.general.cannotRegisterGenerics"),
                        ktProperty.typeParameterList
                            ?: ktProperty.typeReference
                            ?: ktProperty.nameIdentifier
                            ?: ktProperty.navigationElement
                    )
                )
            }

            typeParameterListOwner is PsiField && typeParameterListOwner.hasTypeParameters() -> {
                listOf(
                    GodotProblem(
                        GodotPluginBundle.message("problem.general.cannotRegisterGenerics"),
                        typeParameterListOwner.typeParameterList
                            ?: typeParameterListOwner.typeElement
                            ?: typeParameterListOwner.nameIdentifier
                    )
                )
            }

            else -> emptyList()
        }
    }
}
