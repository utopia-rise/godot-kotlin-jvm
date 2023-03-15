package godot.intellij.plugin.annotator.general

import com.intellij.lang.annotation.AnnotationHolder
import godot.intellij.plugin.GodotPluginBundle
import godot.intellij.plugin.extension.registerProblem
import godot.intellij.plugin.extension.type
import org.jetbrains.kotlin.psi.KtProperty
import org.jetbrains.kotlin.psi.KtTypeParameterListOwner
import org.jetbrains.kotlin.types.typeUtil.containsTypeParameter

fun checkNotGeneric(ktTypeParameterListOwner: KtTypeParameterListOwner, holder: AnnotationHolder) {
    if (ktTypeParameterListOwner.typeParameters.isNotEmpty()) {
        holder.registerProblem(
            GodotPluginBundle.message("problem.general.cannotRegisterGenerics"),
            ktTypeParameterListOwner.typeParameterList
                ?: ktTypeParameterListOwner.nameIdentifier
                ?: ktTypeParameterListOwner.navigationElement
        )
    } else if (ktTypeParameterListOwner is KtProperty && ktTypeParameterListOwner.type()?.containsTypeParameter() == true) {
        holder.registerProblem(
            GodotPluginBundle.message("problem.general.cannotRegisterGenerics"),
            ktTypeParameterListOwner.typeParameterList
                ?: ktTypeParameterListOwner.typeReference
                ?: ktTypeParameterListOwner.nameIdentifier
                ?: ktTypeParameterListOwner.navigationElement
        )
    }
}
